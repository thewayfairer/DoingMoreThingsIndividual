public class Main {

    public static void main(String[] args) {

        // create 3 threads
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(new MyRunnable());
            t.start();
        }

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
            System.out.println("Thread " + Thread.currentThread().getId() + " Singleton hash-code: " + singleton.hashCode());
        }

    }

}
