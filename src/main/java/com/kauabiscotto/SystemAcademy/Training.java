package com.kauabiscotto.SystemAcademy;

public class Training {

    private String description;
    private int duration;
    private String level;

    public Training(String description, int duration, String level) {
        this.description = description;
        this.duration = duration;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Treino { " +
                "descrição = " + description +
                "| duração = " + duration + "min" + "| nível = " + level + "|" + "}";
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getLevel() {
        return level;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

