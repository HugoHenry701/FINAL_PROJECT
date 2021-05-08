package com.module;

public class BOX {
    private String Color;

    private boolean boxStatus;

    public BOX(String c, boolean bStatus) {
        Color = c;
        boxStatus = bStatus;
    }

    public BOX() {
        this("", false);
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String c) {
        Color = c;
    }

    public boolean getBoxStatus() {
        return boxStatus;
    }

    public void setBoxStatus(boolean bStatus) {
        boxStatus = bStatus;
    }
}
