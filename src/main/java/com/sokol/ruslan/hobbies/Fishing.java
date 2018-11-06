package com.sokol.ruslan.hobbies;

public class Fishing extends Hobby{
    private int fishAmount;

    public int getFishAmount() {
        return fishAmount;
    }

    public void setFishAmount(int fishAmount) {
        this.fishAmount = fishAmount;
    }

    public Fishing(String name, byte priority, short hours, int days, long weeks, int fishAmount) {
        super(name, priority, hours, days, weeks);
        this.fishAmount = fishAmount;
    }

    @Override
    public String tellAboutHobby() {
        return toString();
    }

    @Override
    public String toString() {
        return "Fishing{" +
                "fishAmount=" + fishAmount +
                "} " + super.toString();
    }
}
