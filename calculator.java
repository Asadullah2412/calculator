package Calculator1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.Action;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;

/**
 * calculator
 */
public class calculator implements Action {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea(5, 30);

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        JButton button0 = new JButton();

        JButton buttonAdd = new JButton();
        JButton buttonSubtract = new JButton();
        JButton buttonMultiply = new JButton();
        JButton buttonDivision = new JButton();
        JButton buttonClear = new JButton();
        JButton buttonDot = new JButton();
        JButton buttonEqual = new JButton();

        double number1, number2, number3, result;
        int add = 0;
        int multiply = 0;
        int subtact = 0;
        int division = 0;

        public calculator() {
                frame.setSize(300, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setTitle("Asad Calculator");
                frame.setResizable(true);

                frame.add(panel);
                panel.setBackground(Color.LIGHT_GRAY);
                Border border = BorderFactory.createLineBorder(Color.RED, 4);

                panel.add(textArea);
                textArea.setBackground(Color.BLACK);
                textArea.setBorder(border);
                textArea.setForeground(Color.WHITE);

                textArea.setPreferredSize(new DimensionUIResource(10, 20));
                textArea.setLineWrap(true);

                button1.setPreferredSize(new DimensionUIResource(100, 40));
                button1.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculator/buttons/drive-download-20210819T115951Z-001/button1.png"));

                button2.setPreferredSize(new DimensionUIResource(100, 42));
                button2.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button2.png"));

                button3.setPreferredSize(new DimensionUIResource(100, 42));
                button3.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button3.png"));

                button4.setPreferredSize(new DimensionUIResource(100, 42));
                button4.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button4.png"));

                button5.setPreferredSize(new DimensionUIResource(100, 42));
                button5.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button5.png"));

                button6.setPreferredSize(new DimensionUIResource(100, 42));
                button6.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button6.png"));

                button7.setPreferredSize(new DimensionUIResource(100, 42));
                button7.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button7.png"));

                button8.setPreferredSize(new DimensionUIResource(100, 42));
                button8.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button8.png"));

                button9.setPreferredSize(new DimensionUIResource(100, 42));
                button9.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button9.png"));

                button0.setPreferredSize(new DimensionUIResource(100, 42));
                button0.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/button0.png"));

                buttonDot.setPreferredSize(new DimensionUIResource(100, 42));
                buttonDot.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttondot.png"));

                buttonSubtract.setPreferredSize(new DimensionUIResource(100, 42));
                buttonSubtract.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttonsub.png"));

                buttonAdd.setPreferredSize(new DimensionUIResource(100, 42));
                buttonAdd.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttonadd.png"));

                buttonMultiply.setPreferredSize(new DimensionUIResource(100, 42));
                buttonMultiply.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttonmul.png"));

                buttonDivision.setPreferredSize(new DimensionUIResource(100, 42));
                buttonDivision.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttondiv.png"));

                buttonClear.setPreferredSize(new DimensionUIResource(100, 42));
                buttonClear.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttonclear.png"));

                buttonEqual.setPreferredSize(new DimensionUIResource(100, 42));
                buttonEqual.setIcon(new ImageIcon(
                                "C:/Users/Ahmed/OneDrive/Desktop/ASAD FILES/PROGRAMMING/java/Projects/Calculato/rbuttons/drive-download-20210819T115951Z-001/buttonequal.png"));

                panel.add(button0);
                panel.add(button1);
                panel.add(button2);
                panel.add(button3);
                panel.add(button4);
                panel.add(button5);
                panel.add(button6);
                panel.add(button7);
                panel.add(button8);
                panel.add(button9);
                panel.add(buttonDot);
                panel.add(buttonSubtract);
                panel.add(buttonAdd);
                panel.add(buttonMultiply);
                panel.add(buttonDivision);
                panel.add(buttonClear);
                panel.add(buttonEqual);

                button1.addActionListener((ActionListener) this);
                button2.addActionListener((ActionListener) this);
                button3.addActionListener((ActionListener) this);
                button4.addActionListener((ActionListener) this);
                button5.addActionListener((ActionListener) this);
                button6.addActionListener((ActionListener) this);
                button7.addActionListener((ActionListener) this);
                button8.addActionListener((ActionListener) this);
                button9.addActionListener((ActionListener) this);
                button0.addActionListener((ActionListener) this);
                buttonAdd.addActionListener((ActionListener) this);
                buttonSubtract.addActionListener((ActionListener) this);
                buttonDivision.addActionListener((ActionListener) this);
                buttonMultiply.addActionListener((ActionListener) this);
                buttonDot.addActionListener((ActionListener) this);
                buttonEqual.addActionListener((ActionListener) this);
                buttonClear.addActionListener((ActionListener) this);

        }

        public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == buttonClear) {
                        number1 = 0.0;
                        number2 = 0.0;
                        textArea.setText("");
                }
                if (source == button1) {
                        textArea.append("1");
                }
                if (source == button2) {
                        textArea.append("2");
                }
                if (source == button3) {
                        textArea.append("3");
                }
                if (source == button4) {
                        textArea.append("4");
                }
                if (source == button5) {
                        textArea.append("5");
                }
                if (source == button6) {
                        textArea.append("6");
                }
                if (source == button7) {
                        textArea.append("7");
                }
                if (source == button8) {
                        textArea.append("9");
                }
                if (source == button0) {
                        textArea.append("0");
                }
                if (source == buttonDot) {
                        textArea.append(".");
                }

                if (source == buttonAdd) {
                        number1 = number_reader();
                        textArea.setText("+");
                        add = 1;
                        division = 0;
                        subtact = 0;
                        multiply = 0;
                }
                if (source == buttonSubtract) {
                        number1 = number_reader();
                        textArea.setText("");
                        add = 0;
                        division = 0;
                        subtact = 1;
                        multiply = 0;
                }
                if (source == buttonDivision) {
                        number1 = number_reader();
                        textArea.setText("");
                        add = 0;
                        division = 1;
                        subtact = 0;
                        multiply = 0;
                }
                if (source == buttonMultiply) {
                        number1 = number_reader();
                        textArea.setText("");
                        add = 0;
                        division = 0;
                        subtact = 0;
                        multiply = 1;
                }

                if (source == buttonEqual) {
                        number2 = number_reader();
                        if (add > 0) {
                                result = number1 + number2;
                                textArea.setText(Double.toString(result));
                        }
                        if (subtact > 0) {
                                result = number1 - number2;
                                textArea.setText(Double.toString(result));
                        }
                        if (multiply > 0) {
                                result = number1 * number2;
                                textArea.setText(Double.toString(result));
                        }
                        if (division > 0) {
                                result = number1 / number2;
                                textArea.setText(Double.toString(result));

                        }

                }
        }

        public double number_reader() {
                double num1;
                String s;
                s = textArea.getText();
                num1 = Double.valueOf(s);
                return num1;

        }

        // @Override
        // public void actionPerformed(ActionEvent e) {

        // }

        @Override
        public Object getValue(String key) {

                return null;
        }

        @Override
        public void putValue(String key, Object value) {

        }

        @Override
        public void setEnabled(boolean b) {

        }

        @Override
        public boolean isEnabled() {

                return false;
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener listener) {

        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener listener) {

        }

}