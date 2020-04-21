package ru.stepev;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Otello!!!";
    }

    @Override
    public String toString() {
        return "ClassicalMusic is beatuful";
    }
}
