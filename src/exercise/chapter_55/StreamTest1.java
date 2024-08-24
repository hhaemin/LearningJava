package exercise.chapter_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

        // Stream.of. Arrays.Stream, Collection(=List) -> Stream
        Stream<String> fruits = Stream.of("apple", "banana", "orange");
        Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5,6,7,8,9,10);

        // Array.Stream
        Stream<String> fruits2 = Arrays.stream(new String[] {
                "apple", "banana", "orange"
        });
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        // Collection
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Pear");
        fruitsList.add("Grape");

        Stream<String> fruit3 = fruitsList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Stream<Integer> integerStream3 = integerList.stream();

        // Stream 가지고 for-loop
        for(String fruit: fruitsList){
            System.out.println("for-loop로 fruit: " +fruit.toUpperCase());
        }

        // Stream
        fruit3.forEach( (fruit) -> System.out.println("forEach로 fruit: " + fruit.toUpperCase()));

        for(Integer integer : integerList){
            if(integer % 2 == 0) System.out.println("for-loop로 : " +integer);
            else continue;
        }

        integerStream3.filter( (i) -> i%2 == 0)
                .filter( (i) -> i > 4)
                .forEach(i -> System.out.println("forEach로: " + i));

        // 사용한 Stream은 다시 사용하지 못한다. 1회용이다.

        for(Integer integer : integerList){
            if(integer % 2 == 0) System.out.println("for-loop로 : " +integer);
            else continue;
        }
    }
}
