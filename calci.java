/*
QUE: Design a calculator using event-driven programming paradigm of Java
with the following options.
a) Decimal manipulations
b) Scientific manipulations
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class calci extends JFrame implements ActionListener
{
    Container contentpane;
    JPanel DisplayPanel,ControlPanel;
    JTextField txt;
    JButton one, two,three, four, five, six, seven, eight, nine, zero;
    JButton plus, min,mul, div, log,CLR,exp;
    JButton eq, addSub, dot, memread, memcancel, memplus;
    JButton sqrt, sin, cos, tan,onebyx;
    double tempnum, tempnextnum, result, ans;
    static double ValueInMem;
    int num1 = 0,num2 = 0;
    int MemPlusFlag = 1, RepeatFlag = 0;
    char ch;
    calci()
    {
        contentpane = getContentPane();
        contentpane.setLayout(new BorderLayout());
        JPanel DisplayPanel = new JPanel();
        txt = new JTextField(30);
        txt.setHorizontalAlignment(SwingConstants.RIGHT);
        txt.addKeyListener(
                new KeyAdapter()
                {
                    public void keyTyped(KeyEvent keyevent)
                    {
                        char ch = keyevent.getKeyChar();//user can enter the number using
// keyboard
                        if (ch >= '0' && ch <= '9') //do not read other than numbers
                        { }
                        else
                        {
                            keyevent.consume();//read the character typed using keyboard
                        }
                    }
                });
        DisplayPanel.add(txt);
        ControlPanel = new JPanel();
        contentpane.add("Center", ControlPanel);//For Border Layout
        contentpane.add("North", DisplayPanel);
        ControlPanel.setLayout(new GridLayout(7,4,5,5));
//setting grid layout for buttons
        memcancel = new JButton("MC");//memory cancel button
        ControlPanel.add(memcancel);
        memcancel.addActionListener(this);//when user clicks it event handler is called
        one = new JButton("1"); //number button
        ControlPanel.add(one);
        one.addActionListener(this);
        two = new JButton("2");
        ControlPanel.add(two);
        two.addActionListener(this);
        three = new JButton("3");
        ControlPanel.add(three);
        three.addActionListener(this);
        memread = new JButton("MR");
        ControlPanel.add(memread);
        memread.addActionListener(this);
        four = new JButton("4");
        ControlPanel.add(four);
        four.addActionListener(this);
        five = new JButton("5");
        ControlPanel.add(five);
        five.addActionListener(this);
        six = new JButton("6");
        ControlPanel.add(six);
        six.addActionListener(this);
        memplus = new JButton("M+");
        ControlPanel.add(memplus);
        memplus.addActionListener(this);
        seven = new JButton("7");
        ControlPanel.add(seven);
        seven.addActionListener(this);
        eight = new JButton("8");
        ControlPanel.add(eight);
        eight.addActionListener(this);
        nine = new JButton("9");
        ControlPanel.add(nine);
        nine.addActionListener(this);
        zero = new JButton("0");
        ControlPanel.add(zero);
        zero.addActionListener(this);
        addSub = new JButton("+/-");
        ControlPanel.add(addSub);
        addSub.addActionListener(this);
        dot = new JButton(".");//represents decimal point
        ControlPanel.add(dot);
        dot.addActionListener(this);
        eq = new JButton("=");//get an answer
        ControlPanel.add(eq);
        eq.addActionListener(this);
        plus = new JButton("+");
        ControlPanel.add(plus);
        plus.addActionListener(this);
        min = new JButton("-");
        ControlPanel.add(min);
        min.addActionListener(this);
        mul = new JButton("*");
        ControlPanel.add(mul);
        mul.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        ControlPanel.add(div);
        sqrt = new JButton("Sqrt");
        ControlPanel.add(sqrt);
        sqrt.addActionListener(this);
        log = new JButton("LOG");
        ControlPanel.add(log);
        log.addActionListener(this);
        sin = new JButton("SIN");
        ControlPanel.add(sin);
        sin.addActionListener(this);
        cos = new JButton("COS");
        ControlPanel.add(cos);
        cos.addActionListener(this);
        tan = new JButton("TAN");
        ControlPanel.add(tan);
        tan.addActionListener(this);
        exp = new JButton("Exp");
        exp.addActionListener(this);
        ControlPanel.add(exp);
        onebyx = new JButton("1/x");
        onebyx.addActionListener(this);
        ControlPanel.add(onebyx);
        CLR = new JButton("AC");
        ControlPanel.add(CLR);
        CLR.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("1"))
        {
            if (RepeatFlag == 0) //Flag represents that this number is entered initially
            {
                txt.setText(txt.getText() + "1");//displaying the value 1 on the display
            }
            else //after performing some operation 1 is clicked for any other operation
            {
                txt.setText("");//previous contents are cleared
                txt.setText(txt.getText() + "1");//then displaying 1
                RepeatFlag = 0;
            }
        }
        if (s.equals("2"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "2");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "2");
                RepeatFlag = 0;
            }
        }
        if (s.equals("3"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "3");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "3");
                RepeatFlag = 0;
            }
        }
        if (s.equals("4"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "4");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "4");
                RepeatFlag = 0;
            }
        }
        if (s.equals("5"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "5");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "5");
                RepeatFlag = 0;
            }
        }
        if (s.equals("6"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "6");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "6");
                RepeatFlag = 0;
            }
        }
        if (s.equals("7"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "7");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "7");
                RepeatFlag = 0;
            }
        }
        if (s.equals("8"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "8");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "8");
                RepeatFlag = 0;
            }
        }
        if (s.equals("9"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "9");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "9");
                RepeatFlag = 0;
            }
        }
        if (s.equals("0"))
        {
            if (RepeatFlag == 0)
            {
                txt.setText(txt.getText() + "0");
            }
            else
            {
                txt.setText("");
                txt.setText(txt.getText() + "0");
                RepeatFlag = 0;
            }
        }
        if (s.equals("AC")) //This means clear all the contents
        {
            txt.setText("");
            num1 = 0;
            num2 = 0;
            RepeatFlag = 0;
        }
        if (s.equals("+/-"))
        {
            if (num1 == 0)
            {
                txt.setText("-" + txt.getText());
                num1 = 1;
            }
            else
            {
                txt.setText(txt.getText());
            }
        }
        if (s.equals("."))
        {
            if (num2 == 0)
            {
                txt.setText(txt.getText() + ".");
                num2 = 1;
            }
            else
            {
                txt.setText(txt.getText());
            }
        }
        if(s.equals("+"))
        {
            if(txt.getText().equals(""))
            {
                txt.setText("");
                tempnum = 0;
                ch = '+';
            }
            else
            {
                tempnum = Double.parseDouble(txt.getText());
                txt.setText("");
                ch = '+';
                num2 = 0;
                num1 = 0;
            }
            txt.requestFocus();
        }
        if (s.equals("-"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
                tempnum = 0;
                ch = '-';
            }
            else
            {
                num1 = 0;
                num2 = 0;
                tempnum = Double.parseDouble(txt.getText());
                txt.setText("");
                ch = '-';
            }
            txt.requestFocus();
        }
        if (s.equals("/"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
                tempnum = 1;
                ch = '/';
            }
            else
            {
                num1 = 0;
                num2 = 0;
                tempnum = Double.parseDouble(txt.getText());
                ch = '/';
                txt.setText("");
            }
            txt.requestFocus();
        }
        if (s.equals("*"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
                tempnum = 1;
                ch = '*';
            }
            else
            {
                num1 = 0;
                num2 = 0;
                tempnum = Double.parseDouble(txt.getText());
                ch = '*';
                txt.setText("");
            }
            txt.requestFocus();
        }
        if (s.equals("MC"))
        {
            ValueInMem = 0;
            txt.setText("");
        }
        if (s.equals("MR"))
        {
            txt.setText("");
            txt.setText(txt.getText() + ValueInMem);
        }
        if (s.equals("M+"))
        {
            if (MemPlusFlag == 1)
            {
                ValueInMem = Double.parseDouble(txt.getText());
                MemPlusFlag++;
            }
            else
            {
                ValueInMem += Double.parseDouble(txt.getText());
                txt.setText("" + ValueInMem);
            }
        }
        if (s.equals("LOG"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = Math.log(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("1/x"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = 1 / Double.parseDouble(txt.getText());
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("Exp"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = Math.exp(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("Sqrt"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = Math.sqrt(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("SIN"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = Math.sin(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("COS"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = Math.cos(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("TAN"))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                ans = Math.tan(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + ans);
            }
        }
        if (s.equals("="))
        {
            if (txt.getText().equals(""))
            {
                txt.setText("");
            }
            else
            {
                tempnextnum = Double.parseDouble(txt.getText());
                switch (ch)
                {
                    case '+':
                        result = tempnum + tempnextnum;
                        break;
                    case '-':
                        result = tempnum - tempnextnum;
                        break;
                    case '/':
                        result = tempnum / tempnextnum;
                        break;
                    case '*':
                        result = tempnum * tempnextnum;
                        break;
                }
                txt.setText("");
                txt.setText(txt.getText() + result);
                RepeatFlag = 1;
            }
        }
        txt.requestFocus();
    }
    public static void main(String args[])
    {
        calci c= new calci();
        c.setTitle("My Calculator");
        c.pack();
        c.setVisible(true);
    }
}