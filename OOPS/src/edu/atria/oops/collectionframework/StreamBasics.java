package edu.atria.oops.collectionframework;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		
		//of - it accepts integer value and it returns values in sequential order by creating new stream
		Stream<Integer> str = Stream.of(10, 20, 30, 40, 50);
		//Stream<Integer> strOne= str.map(num -> num + 2);//map is intermediate operation
		//strOne.forEach(System.out::println);//we get error coz operation is done and  stream is closed so cant access it again
		//forEach is terminal operation
		//forEach - is whatever operation we do its done to all the elements.
		
		//In above method the values are DIRECTLY taken AS a STREAM and operation is done.
		
		
		//BY USING LAMBDA FUNC AND DOING IN 1 STREAM
		str.map(num -> num  + 2).forEach(System.out::println);
		
		//USING ARRAYS 
		//source of type integer array and converted to stream and operations are done
		Integer[] values = new Integer[] {11,12,12,13,14};//source
		Arrays.stream(values).map(num -> num * num).limit(2).distinct().forEach(System.out::println);//converted to stream
		//limit - intermediate operation it limits the values
		
		//In above method the values are taken from SOURCE and the CONVERTED TO STREAM and operation is dones
	}

}
