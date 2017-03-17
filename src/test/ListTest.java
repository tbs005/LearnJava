package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//错误用法
/*		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		System.out.println(a.toString());
		for (String temp : a) {
			if ("1".equals(temp)) {
				a.remove(temp);
			}
		}
		System.out.println(a.toString());*/
		
		//错误用法
/*		List<String> a = new ArrayList<String>();
		a.add("2");
		a.add("2");
		System.out.println(a.toString());
		for (String temp : a) {
			if ("2".equals(temp)) {
				a.remove(temp);
			}
		}
		System.out.println(a.toString());*/
		
		//list 删除元素正确做法
		List<String> a = new ArrayList<String>();
		a.add("2");
		a.add("2");
		Iterator<String> iterator = a.iterator();
		System.out.println(a.toString());
		while(iterator.hasNext()){
			String next = iterator.next();
			if(next.equals("2")){
				iterator.remove();
			}
		}
		System.out.println(a.toString());
	
	}
}
