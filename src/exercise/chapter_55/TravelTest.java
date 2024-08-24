package exercise.chapter_55;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

    public static void main(String[] args) {
        // List
        List<TravelCustomer> customers = new ArrayList<TravelCustomer>();
        customers.add(new TravelCustomer("IU",29,200000));
        customers.add(new TravelCustomer("Mike",28,180000));
        customers.add(new TravelCustomer("John",26,140000));
        customers.add(new TravelCustomer("Jane",31,220000));
        customers.add(new TravelCustomer("Jack",36,260000));

        // 1. 고객 명단 추가된 순서로 출력
        customers.stream()
                .map( (customer) -> customer.getName())
                .forEach( (name) -> System.out.println(name));

        // 2. 총 고객들의 여행 비용 계산
        long total = customers.stream()
                .map( (customer) -> customer.getPrice() )
                .mapToInt(i -> i)
                .sum();
        System.out.println("total: " + total);
    }
}
