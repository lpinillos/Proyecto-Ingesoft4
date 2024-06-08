
module Demo
{
    interface masterInterface{
        void getTask();
        void addPartialResult(double resultIntegral);
        void attachWorker();
        void printString(string s);
    }

    interface workerInterface{
        void update();
        void printString(string s);
    }
}