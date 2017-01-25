package test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 将来式异步IO，异步操作未完成，主线程将一直等待
 *
 */
public class AsynFileChannelTest {

public static void main(String[] args) {

	try {
		Path file = Paths.get("C:\\Users\\user\\Desktop\\test\\test1.txt");
		AsynchronousFileChannel channel = AsynchronousFileChannel.open(file);
		ByteBuffer buffer = ByteBuffer.allocate(10000);
		Future<Integer> result = channel.read(buffer, 0);
		while(!result.isDone()){
			try {
				System.out.println("Do other things.");
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Integer bytesRead = result.get();
		System.out.println("Read bytes[" + bytesRead + "]");
	} catch (IOException | InterruptedException | ExecutionException e) {
		System.out.println(e.getCause());
		e.printStackTrace();
	}
}

}
