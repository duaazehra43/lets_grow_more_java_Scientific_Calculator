import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

    public class Calculator {

        private JFrame frame;
        private JTextField textField;
        double first;
        double second;
        double result;
        String operation;
        String answer;
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Calculator window = new Calculator();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        public Calculator() {
            initialize();
        }
        
        private void initialize() {
            frame = new JFrame();
            frame.setBounds(100, 100, 540, 515);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.cyan);
            frame.getContentPane().setLayout(null);

            JLabel lblNewLabel = new JLabel("Scientific Calculator");
            lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
            lblNewLabel.setBounds(95, 10, 481, 23);
            frame.getContentPane().add(lblNewLabel);

            textField = new JTextField();
            textField.setEnabled(false);
            textField.setFont(new Font("Arial Black", Font.BOLD, 20));
            textField.setBounds(10, 44, 509, 120);
            frame.getContentPane().add(textField);
            textField.setColumns(10);

          

            JButton btnNewButton_1 = new JButton("1/x");
            btnNewButton_1.setEnabled(false);
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=1/(Double.parseDouble(textField.getText()));
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_1.setBounds(10, 169, 101, 49);
            frame.getContentPane().add(btnNewButton_1);

            JButton btnNewButton = new JButton("\u221A");
            btnNewButton.setEnabled(false);
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Math.sqrt(Double.parseDouble(textField.getText()));
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton.setBounds(10, 220, 101, 49);
            frame.getContentPane().add(btnNewButton);

            JButton btnNewButton_3 = new JButton("x^3");
            btnNewButton_3.setEnabled(false);
            btnNewButton_3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=(Double.parseDouble(textField.getText()));
                    a=a*a*a;
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_3.setBounds(10, 270, 101, 49);
            frame.getContentPane().add(btnNewButton_3);

            JButton btnNewButton_4 = new JButton("x^2");
            btnNewButton_4.setEnabled(false);
            btnNewButton_4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=(Double.parseDouble(textField.getText()));
                    a=a*a;
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_4.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_4.setBounds(10, 320, 101, 49);
            frame.getContentPane().add(btnNewButton_4);

            JButton btnNewButton_5 = new JButton("n!");
            btnNewButton_5.setEnabled(false);
            btnNewButton_5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Double.parseDouble(textField.getText());
                    double fact=1;
                    while(a!=0)
                    {
                        fact=fact*a;
                        a--;
                    }
                    textField.setText("");
                    textField.setText(textField.getText()+fact);
                }
            });
            btnNewButton_5.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_5.setBounds(10, 370, 101, 49);
            frame.getContentPane().add(btnNewButton_5);

            JButton btnplsmin = new JButton("+/-");
            btnplsmin.setEnabled(false);
            btnplsmin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Double.parseDouble(String.valueOf(textField.getText()));
                    a=a*(-1);
                    textField.setText(String.valueOf(a));
                }
            });
            btnplsmin.setFont(new Font("Calibri", Font.BOLD, 22));
            btnplsmin.setBounds(10, 420, 101, 49);
            frame.getContentPane().add(btnplsmin);

            JButton btnNewButton_8 = new JButton("Sin");
            btnNewButton_8.setEnabled(false);
            btnNewButton_8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Math.sin(Double.parseDouble(textField.getText()));
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_8.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_8.setBounds(221, 169, 98, 49);
            frame.getContentPane().add(btnNewButton_8);

            JButton btnC = new JButton("C");
            btnC.setEnabled(false);
            btnC.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(null);
                }
            });
            btnC.setFont(new Font("Calibri", Font.BOLD, 22));
            btnC.setBounds(221, 220, 98, 49);
            frame.getContentPane().add(btnC);

            JButton btn8 = new JButton("8");
            btn8.setEnabled(false);
            btn8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn8.getText();
                    textField.setText(number);
                }
            });
            btn8.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn8.setBounds(221, 270, 98, 49);
            frame.getContentPane().add(btn8);

            JButton btn5 = new JButton("5");
            btn5.setEnabled(false);
            btn5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn5.getText();
                    textField.setText(number);
                }
            });
            btn5.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn5.setBounds(221, 320, 98, 49);
            frame.getContentPane().add(btn5);

            JButton btn2 = new JButton("2");
            btn2.setEnabled(false);
            btn2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn2.getText();
                    textField.setText(number);
                }
            });
            btn2.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn2.setBounds(221, 370, 98, 49);
            frame.getContentPane().add(btn2);

            JButton btn0 = new JButton("0");
            btn0.setEnabled(false);
            btn0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn0.getText();
                    textField.setText(number);
                }
            });
            btn0.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn0.setBounds(115, 420, 204, 49);
            frame.getContentPane().add(btn0);

            JButton btnNewButton_9 = new JButton("Cos");
            btnNewButton_9.setEnabled(false);
            btnNewButton_9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Math.cos(Double.parseDouble(textField.getText()));
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_9.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_9.setBounds(321, 169, 97, 49);
            frame.getContentPane().add(btnNewButton_9);

            JButton btnB = new JButton("\uF0E7");
            btnB.setEnabled(false);
            btnB.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String bspace=null;
                    if(textField.getText().length()>0)
                    {
                        StringBuilder str=new StringBuilder(textField.getText());
                        str.deleteCharAt(textField.getText().length()-1);
                        bspace=str.toString();
                        textField.setText(bspace);
                    }
                }
            });
            btnB.setFont(new Font("Wingdings", Font.BOLD, 22));
            btnB.setBounds(321, 220, 97, 49);
            frame.getContentPane().add(btnB);

            JButton btn9 = new JButton("9");
            btn9.setEnabled(false);
            btn9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn9.getText();
                    textField.setText(number);
                }
            });
            btn9.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn9.setBounds(321, 270, 97, 49);
            frame.getContentPane().add(btn9);

            JButton btn6 = new JButton("6");
            btn6.setEnabled(false);
            btn6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn6.getText();
                    textField.setText(number);
                }
            });
            btn6.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn6.setBounds(321, 320, 97, 49);
            frame.getContentPane().add(btn6);

            JButton btn3 = new JButton("3");
            btn3.setEnabled(false);
            btn3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn3.getText();
                    textField.setText(number);
                }
            });
            btn3.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn3.setBounds(321, 370, 97, 49);
            frame.getContentPane().add(btn3);

            JButton btndot = new JButton(".");
            btndot.setEnabled(false);
            btndot.setFont(new Font("Arial Black", Font.BOLD, 22));
            btndot.setBounds(321, 420, 97, 49);
            frame.getContentPane().add(btndot);

            JButton btnNewButton_10 = new JButton("Tan");
            btnNewButton_10.setEnabled(false);
            btnNewButton_10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Math.tan(Double.parseDouble(textField.getText()));
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_10.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_10.setBounds(421, 169, 98, 49);
            frame.getContentPane().add(btnNewButton_10);

            JButton btnplus = new JButton("+");
            btnplus.setEnabled(false);
            btnplus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="+";
                }
            });
            btnplus.setFont(new Font("Arial Black", Font.BOLD, 22));
            btnplus.setBounds(421, 220, 98, 49);
            frame.getContentPane().add(btnplus);

            JButton btnsub = new JButton("-");
            btnsub.setEnabled(false);
            btnsub.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="-";
                }
            });
            btnsub.setFont(new Font("Arial Black", Font.BOLD, 22));
            btnsub.setBounds(421, 270, 98, 49);
            frame.getContentPane().add(btnsub);

            JButton btnmul = new JButton("*");
            btnmul.setEnabled(false);
            btnmul.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="*";
                }
            });
            btnmul.setFont(new Font("Arial Black", Font.BOLD, 22));
            btnmul.setBounds(421, 320, 98, 49);
            frame.getContentPane().add(btnmul);

            JButton btndiv = new JButton("/");
            btndiv.setEnabled(false);
            btndiv.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="/";
                }
            });
            btndiv.setFont(new Font("Arial Black", Font.BOLD, 22));
            btndiv.setBounds(421, 370, 98, 49);
            frame.getContentPane().add(btndiv);

            JButton btneql = new JButton("=");
            btneql.setEnabled(false);
            btneql.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    second=Double.parseDouble(textField.getText());
                    if(operation=="+")
                    {
                        result=first+second;
                        answer=String.format("%.2f",result);
                        textField.setText(answer);
                    }
                    else if(operation=="-")
                    {
                        result=first-second;
                        answer=String.format("%.2f",result);
                        textField.setText(answer);
                    }
                    else if(operation=="*")
                    {
                        result=first*second;
                        answer=String.format("%.2f",result);
                        textField.setText(answer);
                    }
                    else if(operation=="/")
                    {
                        result=first/second;
                        answer=String.format("%.2f",result);
                        textField.setText(answer);
                    }
                    else if(operation=="%")
                    {
                        result=first%second;
                        answer=String.format("%.2f",result);
                        textField.setText(answer);
                    }
                }
            });
            btneql.setFont(new Font("Arial Black", Font.BOLD, 22));
            btneql.setBounds(421, 420, 98, 49);
            frame.getContentPane().add(btneql);



            JButton btnNewButton_1_1 = new JButton("Log");
            btnNewButton_1_1.setEnabled(false);
            btnNewButton_1_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double a=Math.log(Double.parseDouble(textField.getText()));
                    textField.setText("");
                    textField.setText(textField.getText()+a);
                }
            });
            btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD, 22));
            btnNewButton_1_1.setBounds(115, 169, 102, 49);
            frame.getContentPane().add(btnNewButton_1_1);

            JButton btnpercent = new JButton("%");
            btnpercent.setEnabled(false);
            btnpercent.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    first=Double.parseDouble(textField.getText());
                    textField.setText("");
                    operation="%";
                }
            });
            btnpercent.setFont(new Font("Calibri", Font.BOLD, 22));
            btnpercent.setBounds(115, 220, 102, 49);
            frame.getContentPane().add(btnpercent);

            JButton btn7 = new JButton("7");
            btn7.setEnabled(false);
            btn7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn7.getText();
                    textField.setText(number);
                }
            });
            btn7.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn7.setBounds(115, 270, 102, 49);
            frame.getContentPane().add(btn7);

            JButton btn4 = new JButton("4");
            btn4.setEnabled(false);
            btn4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn4.getText();
                    textField.setText(number);
                }
            });
            btn4.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn4.setBounds(115, 320, 102, 49);
            frame.getContentPane().add(btn4);

            JButton btn1 = new JButton("1");
            btn1.setEnabled(false);
            btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String number=textField.getText()+btn1.getText();
                    textField.setText(number);
                }
            });
            btn1.setFont(new Font("Arial Black", Font.BOLD, 22));
            btn1.setBounds(115, 370, 102, 49);
            frame.getContentPane().add(btn1);

            JButton btnNewButton_6_1 = new JButton("0");
            btnNewButton_6_1.setFont(new Font("Arial", Font.BOLD, 18));
            btnNewButton_6_1.setBounds(115, 420, 89, 49);
            frame.getContentPane().add(btnNewButton_6_1);

                    btn0.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);

                    btndot.setEnabled(true);
                    btnplsmin.setEnabled(true);
                    btnplus.setEnabled(true);
                    btnsub.setEnabled(true);
                    btndiv.setEnabled(true);
                    btnmul.setEnabled(true);
                    btneql.setEnabled(true);

                    btnpercent.setEnabled(true);
                    btnC.setEnabled(true);
                    btnB.setEnabled(true);

                    btnNewButton.setEnabled(true);
                    btnNewButton_1.setEnabled(true);
                    btnNewButton_1_1.setEnabled(true);
                 
                
                    btnNewButton_3.setEnabled(true);
                    btnNewButton_4.setEnabled(true);
                    btnNewButton_5.setEnabled(true);
                    btnNewButton_6_1.setEnabled(true);
                    btnNewButton_8.setEnabled(true);
                    btnNewButton_9.setEnabled(true);
                    btnNewButton_10.setEnabled(true);
                    textField.setEnabled(true);
                
                  
        }

}