package gr.regenerationcodingschool.prototype;

public class Movie extends Item {


    private String runtime;

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Movie{" +
                ", runtime='" + runtime + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
