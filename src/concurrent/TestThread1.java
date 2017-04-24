package concurrent;

/**
 * Java 多线程内存可见性测试
 *
 */
class MyThread implements Runnable {  
	//volatile int  num = 1000000;  //volatile不能保证计算正确
	int  num = 1000000;  
    //删除lock 会发现每次执行的操作结果都不同
    //Lock lock = new ReentrantLock();  
    public void run() {  
        if (Thread.currentThread().getName().equals("t1")) {  
            increment();  
        } else {  
            decrement();  
        }  
    }  
  
    public void increment() {  
        for (int i = 0; i < 10000; i++) {  
        	//lock.lock();
            num++;  
            //lock.unlock();
        }  
    }  
  
    public void decrement() {  
        for (int i = 0; i < 10000; i++) {  
        	//lock.lock();
            num--;
            //lock.unlock();
        }  
    }  
}  
  
public class TestThread1 {  
  
    public static void main(String[] args) {  
        MyThread thread = new MyThread();  
        Thread a = new Thread(thread, "t1");  
        Thread b = new Thread(thread, "t2");  
  
        a.start();  
        b.start();  
  
        try {  
            a.join();  
            b.join();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        System.out.println(thread.num);  
    }  
}
