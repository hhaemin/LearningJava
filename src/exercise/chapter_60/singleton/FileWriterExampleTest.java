package exercise.chapter_60.singleton;

public class FileWriterExampleTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
            FileWriterExample writer = new FileWriterExample("src/exercise/chapter_60/singleton/test.txt");
            writer.writeToFile("Thread1 : Message1");
            writer.writeToFile("Thread1 : Message2");
        });

        Thread thread2 = new Thread( () -> {
            FileWriterExample writer = new FileWriterExample("src/exercise/chapter_60/singleton/test.txt");
            writer.writeToFile("Thread2 : Message3");
            writer.writeToFile("Thread2 : Message4");
        });

        thread1.start();
        thread2.start();
    }
}
