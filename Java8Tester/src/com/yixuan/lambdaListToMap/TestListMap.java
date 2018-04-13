package com.yixuan.lambdaListToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestListMap {
    public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for (int i = 20; i > 0; i--) {
			list.add(i);
		}
		
		Map<Integer, String> map = list.stream().collect(
				Collectors.toMap(x -> x.intValue(), x -> x.toString()));
		
		System.out.println("Result:" + map);
	
    }
}
