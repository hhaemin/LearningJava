package exercise.chapter_29;

// 아메리카노가 얼마인지 확인한다
// 아메리카노 가격을 답변해준다
// 자신의 매상에 돈을 더한다
// 아메리카노 주문을 알린다
// 아메리카노 커피를 포장한다
// 아메리카노 커피 준비 완료를 알린다
// [가격표]
// 아메리카노 : 5천원, 카페라떼 : 6천원, 카페모카 : 6500원, 카푸치노 : 6천원
public class Cashier {
    // 속성
    private long salesAmount;

    // 행위
    public long checkCoffeePrice(String coffeeName){
        long price;
        switch (coffeeName){
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price){
        if(price == 0){
            System.out.println("캐시어: 죄송합니다 손님이 말씀하신 메뉴: "+coffeeName+"는 저희가게에 없습니다.");
        }
        System.out.println("캐시어: 말씀하신 커피 "+ coffeeName + "는 가격이 "+price+"원 입니다.");
    }

    public void addAmount(long money){
        this.salesAmount +=money;
    }
    public void sayOrder(String coffeeName){
        System.out.println("캐시어: 커피 " + coffeeName + " 주문이 들어왔습니다.");
    }
    public Coffee wrapUpCoffee(Coffee coffee){
        coffee.beWrappedUp();
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문하신 커피 "+coffeeName+"가 준비완료 되었습니다.");
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
