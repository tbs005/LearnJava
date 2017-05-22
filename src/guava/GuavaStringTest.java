package guava;

import com.google.common.base.Strings;

/**
 * Strings 类测试
 *
 */
public class GuavaStringTest {

	public static void main(String[] args) {
		
		System.out.println(Strings.emptyToNull(""));//null
		System.out.println(Strings.nullToEmpty("a"));//a
		System.out.println(Strings.nullToEmpty(null));//空
		System.out.println(Strings.isNullOrEmpty(null));//true
		System.out.println(Strings.isNullOrEmpty(""));//true
		System.out.println(Strings.isNullOrEmpty(" "));//false
	}

}
