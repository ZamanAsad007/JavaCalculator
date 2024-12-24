package JavaProject;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class UI extends Calculator implements ActionListener{
    JFrame frame   = new JFrame();
    JTextField tf  = new JTextField();
    JButton delete = new JButton("D");
    JButton clear  = new JButton("C");
    JButton b1  =    new    JButton("1");
    JButton b2  =    new    JButton("2");
    JButton b3  =    new    JButton("3");
    JButton b4  =    new    JButton("4");
    JButton b5  =    new    JButton("5");
    JButton b6  =    new    JButton("6");
    JButton b7  =    new    JButton("7");
    JButton b8  =    new    JButton("8");
    JButton b9  =    new    JButton("9");
    JButton b0  =    new    JButton("0");
    JButton add   =  new    JButton("+");
    JButton subs  =  new    JButton("_");
    JButton multi =  new    JButton("X");
    JButton div   =  new    JButton("÷");
    JButton equal =  new    JButton("=");
    JButton dot   =  new    JButton(".");
    JLabel label  =  new JLabel();

    public UI(){
        frameinfo();
        buttonandtf();
        addActionEvent();
    }

    
    public void frameinfo(){
        
        frame.setSize(400,500);
        frame.setTitle("B");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(tf);
        
    }

    public void buttonandtf(){

        label.setBounds(20, 0, 50, 50);
        label.setFont(new Font("Arial", Font.BOLD, 15));
        
        tf.setBounds(20, 40, 350, 50);
        tf.setFont(new Font("Arial", Font.BOLD, 19));
        frame.add(tf);
        frame.add(label);

        clear.setBounds(205, 100, 80, 70);
        clear.setBackground(Color.red);
        clear.setFont(new Font("Arial", Font.BOLD, 19));
        frame.add(clear);

        delete.setBounds(295, 100, 80, 70);
        delete.setBackground(Color.red);
        delete.setFont(new Font("Arial", Font.BOLD, 19));
        frame.add(delete);
    
        b7.setBounds(20, 171, 80, 70);
        frame.add(b7);

        b8.setBounds(115, 171, 80, 70);
        frame.add(b8);

        b9.setBounds(205, 171, 80, 70);
        frame.add(b9);

        multi.setBounds(295, 171, 80, 70);
        multi.setBackground(Color.cyan);
        multi.setFont(new Font("Arial", Font.BOLD, 17));
        frame.add(multi);

        b4.setBounds(20, 242, 80, 70);
        frame.add(b4);

        b5.setBounds(115, 242, 80, 70);
        frame.add(b5);

        b6.setBounds(205, 242, 80, 70);
        frame.add(b6);

        add.setBounds(295, 242, 80, 70);
        add.setBackground(Color.cyan);
        add.setFont(new Font("Arial", Font.BOLD, 22));
        frame.add(add);

        b1.setBounds(20, 313, 80, 70);
        frame.add(b1);

        b2.setBounds(115, 313, 80, 70);
        frame.add(b2);

        b3.setBounds(205, 313, 80, 70);
        frame.add(b3);

        subs.setBounds(295, 313, 80, 70);
        subs.setBackground(Color.cyan);
        subs.setFont(new Font("Arial", Font.BOLD, 25));
        frame.add(subs);

        dot.setBounds(20, 384, 80, 70);
        frame.add(dot);

        b0.setBounds(115, 384, 80, 70);
        frame.add(b0);

        equal.setBounds(205, 384, 80, 70);
        frame.add(equal);
        equal.setFont(new Font("Arial", Font.BOLD, 22));

        div.setBounds(295, 384, 80, 70);
        div.setBackground(Color.cyan);
        div.setFont(new Font("Arial", Font.BOLD, 22));
        frame.add(div);     
    }

    public void addActionEvent(){
        tf.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
        b0.  addActionListener(this);
        b1. addActionListener(this);
        b2. addActionListener(this);
        b3. addActionListener(this);
        b4. addActionListener(this);
        b5. addActionListener(this);
        b6. addActionListener(this);
        b7. addActionListener(this);
        b8. addActionListener(this);
        b9. addActionListener(this);
        subs.addActionListener(this);
        add.addActionListener(this);
        multi.addActionListener(this);
        div.  addActionListener(this);
        dot.  addActionListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if(object==clear){
            label.setText("");
            tf.setText("");
        }
        else if(object==b0){
            if(tf.getText().equals("0")){
                return;
            }
            else{
                tf.setText(tf.getText()+"0");
            }
        }
        else if(object==b1){
            tf.setText(tf.getText()+ "1");
        }
        else if(object==b2){
            tf.setText(tf.getText()+ "2");
        }
        else if(object==b3){
            tf.setText(tf.getText()+ "3");
        }
        else if(object==b4){
            tf.setText(tf.getText()+ "4");
        }
        else if(object==b5){
            tf.setText(tf.getText()+ "5");
        }
        else if(object==b6){
            tf.setText(tf.getText()+ "6");
        }
        else if(object==b7){
            tf.setText(tf.getText()+ "7");
        }
        else if(object==b8){
            tf.setText(tf.getText()+ "8");
        }
        else if(object==b9){
            tf.setText(tf.getText()+ "9");
        }
        else if(object==dot){
            if(tf.getText().contains(".")){
                return;
            }
            else{
                tf.setText(tf.getText()+ ".");
            }
        }
        else if(object==add){
            String str = tf.getText();
            operator_1 = Double.parseDouble(tf.getText());
            choice = 1;
            label.setText(str + "+");
            tf.setText("");    
        }
        else if(object==subs){
            String str = tf.getText();
            operator_1 = Double.parseDouble(tf.getText());
            choice = 2;
            label.setText(str + "-");
            tf.setText("");   
        }
        else if(object==multi){
            String str = tf.getText();
            operator_1 = Double.parseDouble(tf.getText());
            choice = 3;
            label.setText(str + "X");
            tf.setText("");    
        }
        else if(object==div){
            String str = tf.getText();
            operator_1 = Double.parseDouble(tf.getText());
            choice = 4;
            label.setText(str + "÷");
            tf.setText("");    
        }
        else if(object==equal){
            operator_2 = Double.parseDouble(tf.getText());
            switch (choice) {
                case 1:
                    answer = operator_1 + operator_2;
                    break;
                case 2:
                    answer = operator_1 - operator_2;
                    break;
                case 3:
                    answer = operator_1 * operator_2;
                    break;
                case 4:
                    answer = operator_1 / operator_2;
                    try {
                        render(operator_2);
                    } catch (ErrorException e1) {
                        System.out.println("A problem occured: "+e1);
                    }
                    break;
                }

            if(Double.toString(answer).endsWith(".0")){
                tf.setText(Double.toString(answer).replace(".0", ""));
            }else{
                tf.setText(Double.toString(answer));
            }

            label.setText("");
            operator_2 = answer;
        }
        else if (object == delete) {
            int length = tf.getText().length();
        
            if (length > 0) {
                StringBuilder str = new StringBuilder(tf.getText());
                str.deleteCharAt(length - 1);
                String newStr = str.toString();
                tf.setText(newStr);
            }
        }
    
    }

    @Override
    public void render(double operator_22) throws ErrorException{
        if(operator_22 == 0){
            throw new ErrorException("Cannot divided by Zero");
        }
    }
}