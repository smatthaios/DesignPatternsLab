package gr.regenerationcodingschool.exercises.facade;

public class Tuner {
    String description;
    double frequency;

    public Tuner(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public String toString() {
        return description;
    }
}
