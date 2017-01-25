package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合并发操作问题模拟
 *
 */
public class ConcurrentModificationTest {

//	public static List<String> testList = Collections.emptyList();//java.lang.UnsupportedOperationException
	public static List<String> testList = new ArrayList<>();//java.util.ConcurrentModificationException
	public ConcurrentModificationTest() {}

	public void testList(){
		System.out.println("执行test运行方法。");
//		List<String> testList = Collections.emptyList();
//		List<String> testList = new ArrayList<>();
		testList.add("11");
		testList.add("12");
		testList.add("13");
		testList.add("12");
		testList.add("14");
		List<String> removeList = new ArrayList<>();
		for (String test : testList) {
			removeList.add(test);
		}
		testList.removeAll(removeList);
	}
	
	public static void main(String[] args) {

		ConcurrentModificationTest test = new ConcurrentModificationTest();
		TestThread testThread = new TestThread(test);
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
		new Thread(testThread).start();
	}	
}


class TestThread implements Runnable{
	
	private static ConcurrentModificationTest test;
	
	public TestThread(ConcurrentModificationTest test){
		TestThread.test = test;
	}
	
	@Override
	public void run() {
		System.out.println("线程运行中。");
		test.testList();
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}