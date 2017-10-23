package gr.regenerationcodingschool.patterns.command.threadDemo;

public class CommandThreadDemo {

    public static void main(String[] args) {
        // Runnable is the command interface
        // Task is a concrete command of Runnable
        Task task1 = new Task(10, 12);
        Task task2 = new Task(11, 13);

        Thread thread1 = new Thread(task1);
        thread1.start(); //invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
