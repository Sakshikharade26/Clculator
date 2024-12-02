import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Calci implements ActionListener 
{
    JFrame frame;  //it's declare as a variable
    JTextField screen;
    JPanel panel;
    JButton btn[] = new JButton[10];// take button array
    JButton btnPlus, btnMinus, btnMult, btnDiv, btn2Zero, btnZero, btnEqual, btnDecimal, btnAc, btnDel, btnRem; 
    char opr;
    double num1, num2, result;
    public Calci() //constructor

    {
        frame = new JFrame();
        frame.setSize(400,550); //set width and heigth of frame
        frame.setLocationRelativeTo(null); // our calculator display middle it always display middle
        frame.setTitle("My Calculator");
        frame.setResizable(false); //size mothi hot nahi. set a fix size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(100,100,100));

        screen = new JTextField("");
        screen.setBounds(25, 25, 335, 50);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(screen);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));// we pass two value for 4 column and 5 row in the panel
        panel.setBounds(25, 100, 335, 357);// set position and size
        frame.add(panel);

        for(int i = 1; i < 10; i++) // 1 to 9 button print on panel
        {
            btn[i] = new JButton(String.valueOf(i)); // it set the value of i is a value button
            panel.add(btn[i]);
            btn[i].setBackground(new Color(40, 40, 40)); // color code rgb
            btn[i].setForeground(Color.WHITE);
            btn[i].addActionListener(this);

        }

        btnPlus = new JButton("+");
        btnPlus.setBackground(new Color(40, 40, 40));
        btnPlus.setForeground(Color.WHITE);


        btnMinus = new JButton("-");
        btnMinus.setBackground(new Color(40, 40, 40));
        btnMinus.setForeground(Color.WHITE);


        btnDiv = new JButton("/");
        btnDiv.setBackground(new Color(40, 40, 40));
        btnDiv.setForeground(Color.WHITE);


        btnMult = new JButton("*");
        btnMult.setBackground(new Color(40, 40, 40));
        btnMult.setForeground(Color.WHITE);


        btnDel = new JButton("x");
        btnDel.setBackground(new Color(40, 40, 40));
        btnDel.setForeground(Color.WHITE);


        
        btn2Zero = new JButton("00");
        btn2Zero.setBackground(new Color(40, 40, 40));
        btn2Zero.setForeground(Color.GREEN);

       
        btnZero = new JButton("0");
        btnZero.setBackground(new Color(40, 40, 40));
        btnZero.setForeground(Color.GREEN);


        btnEqual = new JButton("=");
        btnEqual.setBackground(Color.GREEN);
        btnEqual.setForeground(Color.WHITE);

       
        btnAc = new JButton("AC");
        btnAc.setBackground(new Color(40, 40, 40));
        btnAc.setForeground(Color.GREEN);
        
       
        btnDecimal = new JButton(".");
        btnDecimal.setBackground(new Color(40, 40, 40));
        btnDecimal.setForeground(Color.GREEN);


        btnDel = new JButton("x");
        btnDel.setBackground(new Color(40, 40, 40));
        btnDel.setForeground(Color.GREEN);


        btnRem = new JButton("%");
        btnRem.setBackground(new Color(40, 40, 40));
        btnRem.setForeground(Color.GREEN);


        btnZero.addActionListener(this);
        btn2Zero.addActionListener(this);
        btnDecimal.addActionListener(this);
        btnAc.addActionListener(this);
        btnDel.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMult.addActionListener(this);
        btnRem.addActionListener(this);
        btnEqual.addActionListener(this);



        frame.setLayout(null);
        frame.setVisible(true);


        panel.add(btnAc);
        panel.add(btnDel);
        panel.add(btnRem);
        panel.add(btnDiv);
        panel.add(btn[7]);
        panel.add(btn[8]);
        panel.add(btn[9]);
        panel.add(btnMult);
        panel.add(btn[4]);
        panel.add(btn[5]);
        panel.add(btn[6]);
        panel.add(btnMinus);
        panel.add(btn[1]);
        panel.add(btn[2]);
        panel.add(btn[3]);
        panel.add(btnPlus);
        panel.add(btn2Zero);
        panel.add(btnZero);
        panel.add(btnDecimal);
        panel.add(btnEqual);
        

        
    
    }

    public void actionPerformed(ActionEvent e)
    {
        for(int i = 1; i < 10; i++){
            if(e.getSource() == btn[i])

            {
                screen.setText(screen.getText().concat(String.valueOf(i)));

            }
        }
         
        if(e.getSource() == btnZero)
            {
                screen.setText(screen.getText().concat("0"));
            }


            if(e.getSource() == btn2Zero)
            {
                screen.setText(screen.getText().concat("00"));
            }


            if(e.getSource() == btnDecimal)
            {
                screen.setText(screen.getText().concat("."));
            }

            if(e.getSource() == btnAc)
            {
                screen.setText(" ");
            }
           

            if(e.getSource() == btnDel) // it removes the delete the value TextField
            {
                String backspace = null;
                if(screen.getText().length() > 0)
                {
                 StringBuilder str = new StringBuilder(screen.getText());
                 str.deleteCharAt(screen.getText().length() - 1);
                 backspace = str.toString();
                 screen.setText(backspace);
                }


            }

            if(e.getSource() == btnPlus)
            {
                num1 = Double.parseDouble((screen.getText()));
                opr = '+';
                screen.setText(screen.getText().concat("+"));


            }

            if(e.getSource() == btnMinus)
            {
                num1 = Double.parseDouble((screen.getText()));
                opr = '-';
                screen.setText(screen.getText().concat("-"));
                

            }

            if(e.getSource() == btnDiv)
            {
                num1 = Double.parseDouble((screen.getText()));
                opr = '/';
                screen.setText(screen.getText().concat("/"));
                

            }

            if(e.getSource() == btnMult)
            {
                num1 = Double.parseDouble((screen.getText()));
                opr = '*';
                screen.setText(screen.getText().concat("*"));
                

            }

            if(e.getSource() == btnRem)
            {
                num1 = Double.parseDouble((screen.getText()));
                opr = '%';
                screen.setText(screen.getText().concat("%"));
                

            }


            if(e.getSource() == btnEqual)
            {
                try
                {
                    String str = new String(screen.getText());

                    String str1[]=str.split("\\" + opr);

                    num2 = Double.parseDouble(str1[1]);

                    switch(opr)
                    {
                        case '+':
                         result = num1 + num2;
                         screen.setText(String.valueOf(result));
                         break;

                        case '-':
                         result = num1 - num2;
                         screen.setText(String.valueOf(result));
                         break;

                        case '/':
                         result = num1 / num2;
                         screen.setText(String.valueOf(result));
                         break;

                        case '*':
                         result = num1 * num2;
                         screen.setText(String.valueOf(result));
                         break;

                        case '%':
                         result = num1 % num2;
                         screen.setText(String.valueOf(result));
                         break;




 

                    }
                } catch(Exception eobj)
                {
                     JOptionPane.showMessageDialog(null, "Syntax error");
                     screen.setText("");

                }
            

            }




    }

    
}

public class Calculator
{

    public static void main(String args[])
   {
      Calci cal = new Calci();

   }
}