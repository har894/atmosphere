public class Thread_2 extends Thread {
    ActionsToRunInThreads actionsToRunInThreads2;

    public void setResource2(ActionsToRunInThreads actionsToRunInThreads2) {
        this.actionsToRunInThreads2 = actionsToRunInThreads2;
    }

    @Override
    public void run(){
        actionsToRunInThreads2.multiplyNum();


    }
}




