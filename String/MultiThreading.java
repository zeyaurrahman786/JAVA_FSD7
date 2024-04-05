public class Multithreading extends Thread{
    public void run() {
        System.out.println("Thread is running");
    }
    for(int i=1, i<5, i++){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        CreateThread t1 = new CreateThread();
        CreateThread t2 = new CreateThread();

        t1.start();
        t2.start();
    }
}
