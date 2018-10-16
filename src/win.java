public class win {
    private int window;
    private int door;

    public win()
    {
        window = 0;
        door = 0;
    }

    public win(int window,int door)
    {
        setWindow(window);
        setDoor(door);
    }

    private void setWindow(int windows) {window = windows;}

    private void setDoor(int doors){door = doors;}


    public void setWin(int window, int door) {
        setWindow(window);
        setDoor(door);
    }



    @Override
    public String toString() {
        return "\nNumber of Windows: " + window + "\nNumber Of Doors: " + door;
    }

}
