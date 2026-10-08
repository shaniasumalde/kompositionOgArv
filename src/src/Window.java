public class Window {

    int widthCm;
    int heightCm;

    Window(int widthCm, int heightCm) {
        this.widthCm= widthCm;
        this.heightCm= heightCm;
    }

    int getAreaCm2() {
        return widthCm * heightCm;
    }

    public String toString() {
        return "Window is " + getAreaCm2() + "cm2 in total";
    }


}