package Synchronized;

public class RunableClass implements Runnable {

    public static Long count = 0L;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public synchronized void countStudent(Long l) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i * l);
            } try {
            System.out.println("Thoi gian cho");
            Thread.sleep(3000);
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public RunableClass (Student student) {
        this.student = student;
    }

    @Override
    public void  run() {
        this.countStudent(student.getId());
    }
}
