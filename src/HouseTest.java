import javax.swing.*;

public class HouseTest {
    public static void main(String args[]){
        House house = new House();
        House house1 = new House("Killarney","Semi-Detached", 2.5,"John", 10,2);

        JOptionPane.showMessageDialog(null,"House Details: " +house.toString());
        JOptionPane.showMessageDialog(null,"House Details: " +house1.toString());
    }
}
