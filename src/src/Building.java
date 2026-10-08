import java.util.ArrayList;

public class Building {

    String name;
    static ArrayList<Room> rooms;

    Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    static void addRoom(Room room) {
        rooms.add(room);
    }

    int getTotalLampCount() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getLampCount();
        }
        return total;
    }

    int getTotalWatt() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getTotalWatt();
        }

        return total;


    }

    void printBuilding() {           //Printer alle rum med deres lamper og vinduer
        System.out.println("Building belongs to " + name);
// ?? skal spørges ind til?
        }
    }
