package mission.Abstract;

public abstract class User implements CustomerRole {

    protected String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void order() {
        System.out.println("유저(" + username + ")은 주문을 할 수 있습니다.");
    }

    @Override
    public void payment() {
        System.out.println("유저(" + username + ")은 결제를 할 수 있습니다.");
    }
}
