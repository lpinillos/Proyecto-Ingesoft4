package implementation;

import Demo.masterInterface;
import com.zeroc.Ice.Current;

public class masterMethods implements masterInterface {
    @Override
    public void getTask(Current current) {

    }

    @Override
    public void addPartialResult(double resultIntegral, Current current) {

    }

    @Override
    public void attachWorker(Current current) {

    }

    @Override
    public void printString(String s, Current current) {
        System.out.println(s);
    }
}

