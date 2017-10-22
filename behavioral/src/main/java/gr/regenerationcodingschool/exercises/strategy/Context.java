package gr.regenerationcodingschool.exercises.strategy;

class Context {
    private final SortStrategy sortStrategy;

    public Context(SortStrategy strategy) {
        this.sortStrategy = strategy;
    }

    public void arrange(int[] input) {
        sortStrategy.sort(input);
    }
}