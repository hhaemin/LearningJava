package exercise.chapter_28;

public class ThisTest {

    public static void main(String[] args) {

        Person person1 = new Person("강철중");
        Person person2 = new Person("이민호","Male");
        Person person3 = new Person("아이유","Female",30);

//        person1.showMyself();
//        person2.showMyself();
//        person3.showMyself();
//        Person 인스턴스: name: 강철중, gender: unknown, age: -1
//        Person 인스턴스: name: 이민호, gender: Male, age: -1
//        Person 인스턴스: name: 아이유, gender: Female, age: 30

        Person person11 = person1.returnMySelf();
        Person person22 = person2.returnMySelf();

        System.out.println(person11); // exercise.chapter_28.Person@a09ee92
        System.out.println(person22); // exercise.chapter_28.Person@30f39991
    }
}
