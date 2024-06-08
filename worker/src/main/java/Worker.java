import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.ObjectPrx;
import com.zeroc.Ice.Util;
import Demo.workerInterfacePrx;

public class Worker {
    public static void main(String[] args) {
        try (Communicator communicator = Util.initialize(args, "config.worker")) {
            ObjectPrx base = communicator.stringToProxy("SimplePrinter:default -p 9099");
            workerInterfacePrx printer = workerInterfacePrx.checkedCast(base);
            if (printer == null) {
                throw new Error("Invalid proxy");
            }
            printer.printString("Hello from Worker!");
        }
    }
}
