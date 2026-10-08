public class Lamp {

int watt;
boolean isOn;

Lamp(int watt, boolean isOn) {
    this.watt = watt;
    this.isOn = false;
}

void turnOn() {
    this.isOn = true;
}

void turnOff() {
    this.isOn = false;
}

public String toString() {
    return "Lamp: " + watt + " is on? " + isOn;
}
}



