package mission.SellingNike;

public class OrderSneakersSituation {

    public static void main(String[] args){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        boolean isCustomerLikeDelivery = true; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 70_000;
        boolean havingNikeSneakersInStore = false; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         *
         *  Customer: 자신의 Cache 와 배송 주문선호 여부
         *  Staff: 자신의 매상, Nike 운동화 정보, 매장의 Nike 운동화 재고 보유여부
         *  DeliverManager: 자신의 매상, Nike 운동화 정보, 포장 정보
         * */

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         * */

        SneakersInfo nikeSneakersInfo = new SneakersInfo(nikeSneakersFeature, nikeSneakersPrice);
        SneakersPackageInfo sneakersPackageInfo = new SneakersPackageInfo(daysForDeliver, costForDeliver);

        Customer customer = new Customer();
        customer.setCache(100_000);
        customer.setLikeDelivery(isCustomerLikeDelivery);

        Staff staff = new Staff();
        staff.setSalesAmount(100_000);
        staff.setNikeSneakersInfo(nikeSneakersInfo);
        staff.setHavingNikeSneakersInStore(havingNikeSneakersInStore);

        DeliverManager deliverManager = new DeliverManager();
        deliverManager.setSalesAmount(100_000);
        deliverManager.setNikeSneakersInfo(nikeSneakersInfo);
        deliverManager.setPackageInfo(sneakersPackageInfo);

        // 로직
        customer.askNikeSneakersToStaff(staff);
        long nikePrice = customer.askAndGetSneakersPriceFromStaff(staff);

        if(!customer.isAffordable(nikePrice)){
            customer.sayBye();
            return;
        }

        if(staff.checkHavingNikeSneakersInStore()){
            customer.sayOrder();
            staff.sayPayment(nikePrice);
            long cache = customer.makePayment(nikePrice);
            staff.addSalesAmount(cache);

            Sneakers nikeSneakers = staff.offerNikeSneakers();
            customer.wearSneakers(nikeSneakers);
            return;
        }

        if(!customer.isLikeDelivery()){
            customer.sayBye();
            return;
        }

        customer.sayOrder();
        staff.sayPayment(nikePrice);
        long cache = customer.makePayment(nikePrice);
        staff.addSalesAmount(cache);

        SneakersPackageInfo nikeSneakersPackageInfo =
                staff.orderNikeSneakersToDeliverManager(deliverManager);
        staff.sayNikePackageInfo(nikeSneakersPackageInfo);
        long deliverCost = staff.calculateDeliveryCost(nikeSneakersPackageInfo);

        if(!customer.isAffordable(deliverCost)){
            customer.requireRefund();
            long refundCache = staff.returnRefund(cache);
            customer.getRefund(refundCache);
            customer.sayBye();
            return;
        }

        customer.sayOrder();
        SneakersPackage sneakersPackage = deliverManager.makeSneakersPackage();
        long deliveryCost =
                customer.askAndGetDeliverCostFromDeliveryManger(deliverManager);
        deliverManager.sayPayment(deliveryCost);

        long cachePackage = customer.makePayment(deliveryCost);
        deliverManager.addSalesAmount(cachePackage);

        customer.wearSneakers(sneakersPackage.beUnBoxed());
    }
}
