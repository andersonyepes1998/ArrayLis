package com.edu.cesde;

public class Monitor extends Product {
    private double ScreenSize;
    private double Resolution;

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        ScreenSize = screenSize;
    }

    public double getResolution() {
        return Resolution;
    }

    public void setResolution(double resolution) {
        Resolution = resolution;
    }
}
