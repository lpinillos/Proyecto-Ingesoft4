import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.ObjectAdapter;
import com.zeroc.Ice.Util;
import implementation.masterMethods;

public class Master {
    public static void main(String[] args) {

        try (Communicator communicator = Util.initialize(args, "config.master")) {
            ObjectAdapter adapter = communicator.createObjectAdapter("masterInterface");
            com.zeroc.Ice.Object object = new masterMethods();
            adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("Master"));
            adapter.activate();
            System.out.println("server initialized...");
            communicator.waitForShutdown();
        }


    }
}
