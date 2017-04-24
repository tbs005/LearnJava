package concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorService 测试
 * @author user
 */
public class ScheduledExecutorServiceTest {
	public static int count = 0;
	public static void main(String[] args) {
		//每秒执行一次
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleWithFixedDelay(new Runnable() {
			public void run() {
				System.out.println(count);
				count ++ ;
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
}
