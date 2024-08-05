package exercise.chapter_29;

// 바리스타는 아메리카노 주문 확인을 알린다.
// 바리스타는 물 500ml와 원두 30g로 아메리카노 커피를 만든다
// 바리스타는 아메리카노 커피 완성을 알린다.

public class Barista {

    // 속성

    // 행위
    public void noticeOreder(String coffeeName){
        System.out.println("바리스타: 커피주문 확인했습니다. <<커피:" +coffeeName + ">>");
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피:" +coffeeName);
    }
}
