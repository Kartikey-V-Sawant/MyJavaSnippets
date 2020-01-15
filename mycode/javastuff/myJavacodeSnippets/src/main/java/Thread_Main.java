public class Thread_Main {
    private static final Integer sleepTimeInMilliSeconds = 2000;
    public static void main (String [] args) {
        Thread_eg t1 = new Thread_eg();
        t1.start();
        Thread_eg t2 = new Thread_eg();
        t2.start();
        try {
            System.out.println ("Main starts operation!");
            Thread.sleep(sleepTimeInMilliSeconds);
            System.out.println ("Main ends operation!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.stopRunning();
        t2.stopRunning();
    }
}
