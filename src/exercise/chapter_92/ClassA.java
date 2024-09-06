package exercise.chapter_92;

public class ClassA {
    private ClassB classB;

    public ClassA(){}

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public void sayHello(){
        String message = classB.sayHello() + ", and I'm A";
        System.out.println(message);
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }
}
