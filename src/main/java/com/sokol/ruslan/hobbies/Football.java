package com.sokol.ruslan.hobbies;

public class Football extends Hobby {
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Football(String name, byte priority, short hours, int days, long weeks, float costPerDay, double costPerWeek, char successValue, boolean isFavorite, String teamName) {
        super(name, priority, hours, days, weeks, costPerDay, costPerWeek, successValue, isFavorite);
        this.teamName = teamName;
    }

    @Override
    public String tellAboutHobby() {
        return toString();
    }

    @Override
    public String toString() {
        return "Football{" +
                "teamName='" + teamName + '\'' +
                "} " + super.toString();
    }
}
