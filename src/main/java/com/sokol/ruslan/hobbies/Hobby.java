package com.sokol.ruslan.hobbies;

public class Hobby {

    private String name;
    private byte priority;
    private short hours;
    private int days;
    private long weeks;
    private float costPerDay;
    private double costPerWeek;
    private char successValue;
    private boolean isFavorite;


    public Hobby() {
    }

    public Hobby(String name, byte priority, short hours, int days, long weeks) {
        this.name = name;
        this.priority = priority;
        this.hours = hours;
        this.days = days;
        this.weeks = weeks;
    }

    public Hobby(String name, byte priority, short hours, int days, long weeks, float costPerDay,
                 double costPerWeek, char successValue, boolean isFavorite) {
        this.name = name;
        this.priority = priority;
        this.hours = hours;
        this.days = days;
        this.weeks = weeks;
        this.costPerDay = costPerDay;
        this.costPerWeek = costPerWeek;
        this.successValue = successValue;
        this.isFavorite = isFavorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public short getHours() {
        return hours;
    }

    public void setHours(short hours) {
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long getWeeks() {
        return weeks;
    }

    public void setWeeks(long weeks) {
        this.weeks = weeks;
    }

    public float getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getCostPerWeek() {
        return costPerWeek;
    }

    public void setCostPerWeek(double costPerWeek) {
        this.costPerWeek = costPerWeek;
    }

    public char getSuccessValue() {
        return successValue;
    }

    public void setSuccessValue(char successValue) {
        this.successValue = successValue;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String tellAboutHobby() {
        return toString();
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", hours=" + hours +
                ", days=" + days +
                ", weeks=" + weeks +
                ", costPerDay=" + costPerDay +
                ", costPerWeek=" + costPerWeek +
                ", successValue=" + successValue +
                ", isFavorite=" + isFavorite +
                '}';
    }
}
