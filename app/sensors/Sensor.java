package app.sensors;

import app.substance.Substance;

public abstract class Sensor {

    protected Substance substance;
    public abstract void update();

}
