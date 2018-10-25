public  class Computer implements idable {
    private String id;
    private String make;
    protected Memory memory;

    public Computer (String id, String make,String memType, int memSize){
        setID(id);
        setMake(make);
        memory = new Memory(memType,memSize);

    }

    public String toString(){
        return "ID: " + getId() + "\nMake: " + getMake()+ "\n" + memory.toString();
    }


    @Override
    public void setID(String id) {
        this.id=id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
