package success;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class wordle extends JFrame implements ActionListener {
    JPanel p1;
    JButton check;
    JLabel chn;
    int chances = 6 ;
    static ArrayList<JTextField> tf = new ArrayList<>();
    wordle(){
        setSize(500,500);

        p1 = new JPanel();
        p1.setBounds(100,80,300,60);
        p1.setBackground(Color.darkGray);
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        add(p1);
        create();

        chn = new JLabel("Chances Remaining: "+chances);
        chn.setBounds(150,200,200,50);
        add(chn);

        check = new JButton("Check ");
        check.setBounds(150,380,100,50);
        check.addActionListener(this);
        add(check);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    void create(){
//        adding textfields in the arraylist
        for(int i = 0 ; i<wordle_logic.wordSize ; i++){
            tf.add(new JTextField());
            tf.get(i).setFont(new Font("Times New Roman", Font.BOLD, 42));
            tf.get(i).setHorizontalAlignment(JTextField.CENTER);
        }
//        placing them on the JPanel
        for(int i = 0 ; i<wordle_logic.wordSize ; i++){
            p1.add(tf.get(i));
        }
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == check) {
            if (chances > 0) {
                for (int i = 0; i < wordle_logic.wordSize; i++) {
                    if (wordle_logic.checkExactLetter(i)) {
                        tf.get(i).setBackground(Color.green);
                    } else if (wordle_logic.checkLetter(i)) {
                        tf.get(i).setBackground(Color.yellow);
                    } else {
                        tf.get(i).setBackground(Color.WHITE);
                    }
                }
                chances--;
                chn.setText("Chances Remaining: "+chances);
            }
            else{
                JOptionPane.showMessageDialog(null, "Sorry Mate ! All chances exhausted");
            }


        }
    }

    public static void main(String[] args) {
        new wordle_logic();
        new wordle();
    }
}
