package ThreadsStuffs;

class Thread_eg extends Thread  {
    private volatile boolean flag = true;
    public void stopRunning(){
        flag = false;
    }
    public void run() {
        while (flag) {

                System.out.println("Thread " +Thread.currentThread().getId());
        }
        System.out.println("Thread "    +Thread.currentThread().getId()+   "Stopped");
    }
    }

