package Synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Synchronized {

    public static void main (String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        Student student = new Student(2L,"Hieu");
        Student student1 = new Student(5L, "Xuan Hai");
        Student student2 = new Student(10L, "Quang");
        RunableClass runableClass = new RunableClass(student);
        RunableClass runableClass1 = new RunableClass(student1);
        RunableClass runableClass2 = new RunableClass(student2);
        runableClass.run();
        runableClass1.run();
        runableClass2.run();
    }
}
