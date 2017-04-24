package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 回调式异步IO
 */
public class CallBackTest {

	public static void main(String[] args) {
		try {
			Path file = Paths.get("C:\\Users\\user\\Desktop\\test\\test.txt");
			AsynchronousFileChannel channel = AsynchronousFileChannel.open(file);
			ByteBuffer buffer = ByteBuffer.allocate(10000);
			channel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {

				@Override
				public void completed(Integer result, ByteBuffer attachment) {
					System.out.println("Read bytes [" + result + "]");
				}

				@Override
				public void failed(Throwable exc, ByteBuffer attachment) {
					System.out.println("Read bytes failed [" + exc.getMessage() + "]");
				}

			});
			Thread.sleep(2000L);//主线程不加sleep将立即终止，导致异步文件读写结果无法接收并处理
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
