public class Laptop extends Computer {
    private boolean touchScreen;

    public Laptop(String id,String make, String type, int size, boolean touchScreen){
        super(id,make,type,size);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return super.toString()+"Touch Screen: "+isTouchScreen()+ "\n";
    }
}
