package exercise.chapter_43;

public class GoldCustomer extends Customer {
    // 속성
    private double discountRatio;

    // 행위
    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public GoldCustomer(String name){
        super(); // 부모연산자에 무조건 디폴트생성자가 있어야 한다.
        this.customerID = "Customer" + Customer.serialNums++; // customer와 ID를 같이 쓰기 때문에 VIPCustomer와 다르게 이렇게 표현
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    public void printMyInfo(){
        super.printMyInfo();
    }

    @Override
    public String toString() {
        return String.format("GoldCustomer(customerID=%s, name=%s, customerGrade=%s, bonusPoint=%d, discountRatio=%f)",
                this.customerID, this.name, this.customerGrade, this.bonusPoint, this.discountRatio);
    }
}
