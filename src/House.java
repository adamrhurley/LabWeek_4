public class House {
    private String address;
    private String type;
    private double price;
    private String owner;
    private win WindowDoor;


    public House()
    {
     address =  "No Address Specified";
     type = "No type specified";
     price = 0.0;
     owner = "No owner specified";
     WindowDoor = new win();
    }

    public House(String address,String type,double price,String owner,int window, int door)
    {
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
        WindowDoor = new win(window,door);
    }




    public win getWindowDoor()
    {
        return WindowDoor;
    }






    private void setAddress(String Address)
    {
        address = Address;
    }

    private void setType(String Type)
    {
        type = Type;
    }

    private void setPrice(double Price)
    {
        price = Price;
    }

    private void setOwner(String Owner)
    {
        owner = Owner;
    }

    public void setWindowDoor(int windows, int doors){
        WindowDoor.setWin(windows,doors);}

   // public void validatePrice(int price)
   // {
       // if(price<=0)
       // {
        //    price = 0;
      //  }


   // }


    public String toString()
    {
        return "\nAddress: " + address + "\nType: " + type +
                "\nPrice: " + price + "\nOwner: " + owner + WindowDoor.toString();
    }



}
