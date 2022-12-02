public class ActionsToRunInThreads {
    int num1;
    int num2;
    int resultSum;
    int resultMultiply;

    //NUM 1
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum1() {
        return num1;
    }
    //NUM 2
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public  void sumNum(){
         this.resultSum=getNum1()+getNum2();

    }
    public void multiplyNum(){
        this.resultMultiply=this.resultSum*100000;
    }

    public static void main(String[] args) throws InterruptedException {
        ActionsToRunInThreads mainActionsToRunInThreads = new ActionsToRunInThreads();
        mainActionsToRunInThreads.setNum1(333);
        mainActionsToRunInThreads.setNum2(999);

        Thread_1 firstThread = new Thread_1();
        firstThread.setName("First");
        firstThread.setResource1(mainActionsToRunInThreads);
        Thread_2 secondThread=new Thread_2();
        secondThread.setName("Second");
        secondThread.setResource2(mainActionsToRunInThreads);
        firstThread.start();
        firstThread.join();
        secondThread.start();
        secondThread.join();
        System.out.println(mainActionsToRunInThreads.resultSum+ " from "+firstThread.getName()+
                " and "+ mainActionsToRunInThreads.resultMultiply+" from "+secondThread.getName());
    }
}
