import java.util.ArrayList;

public class Room {

    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> windows;

    Room(String name){
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

void addLamp (Lamp lamp) {
    lamps.add(lamp);
}

void addWindow(Window window){
        windows.add(window);
}

int getLampCount(){
        return lamps.size();    //Hvor mange lamper er der i DETTE rum
}

int getTotalWatt() {
        int total = 0;
        for (Lamp lamp : lamps) {
            total +=lamp.watt;   //Læg det oveni det man allerede har
        }

        return total;
}

int getTotalWindowArea() {
        int total = 0;
        for (Window window : windows) {
            total +=window.getAreaCm2() ;
        }
        return total;
}

void printRoom(){
    System.out.println("Room belongs to " + name);
    System.out.println("The window size in total is " + getTotalWindowArea());
    System.out.println("There are in total " + getLampCount() + " with " + getTotalWatt() + " watt");
}

}
