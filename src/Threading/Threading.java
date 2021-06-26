package Threading;

//Threading via inherit thread class

class CustomThreading1 extends Thread{
    public void run(){
        int i = 0;
        while(i<10000) {
            System.out.println("Thread 1 Running...");
            i++;
        }
    }
}

class CustomThreading2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10000) {
            System.out.println("Thread 2 Running...");
            i++;
        }
    }
}

//Threading via implementing runnable interface
class CustomThreading3 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Thread 3 Running...");
            i++;
        }
    }
}
class CustomThreading4 implements Runnable {

        @Override
        public void run() {
            int i = 0;
            while (i < 10000) {
                System.out.println("Thread 4 Running...");
                i++;
            }
        }
    }

public class Threading{
    public static void main(String[] args) {
//        CustomThreading1 th1 = new CustomThreading1();
//        CustomThreading2 th2 = new CustomThreading2();
//
//        th1.start();
//        th2.start();

          CustomThreading3 bullet1 = new CustomThreading3();
          Thread gun1 = new Thread(bullet1);

          CustomThreading4 bullet2 = new CustomThreading4();
          Thread gun2 = new Thread(bullet2);


          gun1.start();
          gun2.start();

    }
}