import javax.swing.*;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer= new Computer("Dell PC-3","Dell","DDR2",3);
        Laptop laptop = new Laptop("Acer Note-500","Acer","NoteBook",500,true);


        JOptionPane.showMessageDialog(null,computer.toString());
        JOptionPane.showMessageDialog(null,laptop.toString());



    }
}
