import java.awt.*; //enables programmers to create graphical user interface application
import javax.swing.*;

class calculator{

    JFrame frame;
    JTextField screen;
    JButton nbtn[] = new JButton[10];
    JButton btnPlus, btnMinus, btnDivide, btnMultiply, btnZero, btn2zero, btnEqual, btnDecimal, btnAC, btnDelete;

    public calculator(){
        frame = new JFrame();
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null); //frame goes in midddle of screen
        frame.setTitle("Calculator");
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main (String[] args){
        new calculator();
        
    }
}