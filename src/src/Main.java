public class Main {

    public static void main(String[] args) {

        System.out.println("======= Kontorbygning =======");
        System.out.println("Receptionen har 4 lamper og 2 vinduer");
        Room room1 = new Room ("Receptionen");
        Lamp lamp1 = new Lamp (70, true);
        Lamp lamp2 = new Lamp (70, true);
        Lamp lamp3 = new Lamp (50, true);
        Lamp lamp4 = new Lamp (40, true);
        room1.addLamp(lamp1);         // Tilføjer lamper til rummet
        room1.addLamp(lamp2);
        room1.addLamp(lamp3);
        room1.addLamp(lamp4);

Window window1 = new Window(120, 90);
        Window window2 = new Window(150, 100);

        room1.addWindow(window1);
        room1.addWindow(window2);

       Building.addRoom(room1);    //Tilføjer rum til bygningen

    }
}
