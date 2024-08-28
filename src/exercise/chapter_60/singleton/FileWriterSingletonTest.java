package exercise.chapter_60.singleton;

public class FileWriterSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread1 : Message1");
            writer.writeToFile("Thread1 : Message2");
        });

        Thread thread2 = new Thread( () -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread2 : Message3");
            writer.writeToFile("Thread2 : Message4");
        });

        thread1.start();
        thread2.start();

    }
}
