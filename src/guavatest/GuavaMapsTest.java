package guavatest;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

/**
 * Google Guava 工具类测试
 *
 */
public class GuavaMapsTest {

	public static void main(String[] args) {
		
		Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 1, "c", 1,"cc", 1);
		Map<String, Integer> right = ImmutableMap.of("a", 1, "b", 2, "c", 2,"d",5);
		MapDifference<String, Integer> diff = Maps.difference(left, right);

		System.out.println(diff.entriesInCommon()); // {a=1}
		System.out.println(diff.entriesOnlyOnLeft()); // {cc=1}
		System.out.println(diff.entriesOnlyOnRight()); // {d=5}
		System.out.println(diff.entriesDiffering()); 
	}

}
