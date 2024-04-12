package Intermediate;

public class MultiThreadRunnableInterface {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run(){
        //Thread's Logic goes here
        for(int i = 0; i<5; i++){
            System.out.println(name + ":" + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println(name + "finished");
    }
}
