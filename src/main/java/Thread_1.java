public class Thread_1 extends Thread{
ActionsToRunInThreads actionsToRunInThreads1;

    public void setResource1(ActionsToRunInThreads actionsToRunInThreads1) {
        this.actionsToRunInThreads1 = actionsToRunInThreads1;
    }

    @Override
    public void run(){
        actionsToRunInThreads1.sumNum();
    }
}
