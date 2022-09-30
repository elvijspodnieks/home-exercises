package io.codelex.oop.summary.runners;

public enum Runner {
    BEGINNER(201, 1000),
    INTERMEDIATE(151, 200),
    ADVANCED(0, 150);

    private int minMin;
    private int maxMin;

    Runner(int minMin, int maxMin) {
        this.minMin = minMin;
        this.maxMin = maxMin;
    }

    public static Runner getFitnessLevel(int time) {
        if (Runner.ADVANCED.maxMin >= time) {
            return Runner.ADVANCED;
        } else if (Runner.INTERMEDIATE.maxMin >= time) {
            return Runner.INTERMEDIATE;
        } else {
            return Runner.BEGINNER;
        }
    }
}
