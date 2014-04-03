package model;

public class RotaIndexControler {
    private static int index;
    private static int numAssento;

    public static int getNumAssento() {
        return numAssento;
    }

    public static void setNumAssento(int numAssento) {
        RotaIndexControler.numAssento = numAssento;
    }


    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        RotaIndexControler.index = index;
    }
    
}
