import java.awt.;
import java.awt.event.;
import javax.swing.*;

public class Task2 implements ActionListener{
private JFrame f1;
private JPanel p1;
private JLabel l1, l2;
private JButton b1, b2;

    public Task2(){
        method();
    }

public void method(){
        f1 = new JFrame("My Frame");
        f1.setSize(350,200);

    // Creation of components
    l1 = new JLabel("Course Name:");
    l2 = new JLabel("Course Code:");
    b1 = new JButton("Hide/Show");
    b2 = new JButton("Hide/Show");
    p1 = new JPanel();

    // Registration
    b1.addActionListener(this);
    b2.addActionListener(this);

    // Adding components
    p1.add(l1);
    p1.add(b1);
    p1.add(l2);
    p1.add(b2);
    p1.setLayout(new GridLayout(2,2));
    f1.getContentPane().add(p1);

    f1.setVisible(true);
}

public void actionPerformed(ActionEvent d) {

        if(d.getSource() == b1){
            String S1 = "Course Name:";
            String S2 = l1.getText();
            if(S1.equals(S2)){
                l1.setText("JAVA");
                
            }else{
                l1.setText("Course Name:");
                
            }
        }

    if(d.getSource() == b2){
        String S1 = "Course Code:";
        String S2 = l2.getText();
        if(S1.equals(S2)){
            l2.setText("CS212");
            
        }else{
            l2.setText("Course Code:");
                
        }
    }
}
}