import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorSwing {

        public static void main(String[] args) {

            //Создаем окно
            JFrame frame = new JFrame("VerticalLayoutTest");
            //Определяем размеры
            frame.setSize(260, 120);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //задаем размеры окна и ставим в центр экрана
            Toolkit toolkit = Toolkit.getDefaultToolkit(); //это набор инструментов
            Dimension dimension = toolkit.getScreenSize(); //тут мы берём размеры
            frame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300); // тут выравниваем по центру окно
            //Создаем панель с менеджером вертикального расположения компонентов
            JPanel contents = new JPanel(new FlowLayout());//добавим кнопки и текстовое поле

            JTextField textField = new JTextField(10);
            JTextField textField2 = new JTextField(10);
            JLabel label1 = new JLabel("First Number : ");
            JLabel label2 = new JLabel("Second Number :");
            JLabel result = new JLabel("Result :");

            JButton button1 = new JButton ( "+" );
            JButton button2 = new JButton ( "-" );
            JButton button3 = new JButton ( "*" );
            JButton button4 = new JButton ( "/" );
            JButton button5 = new JButton ( "^" );


            //Добавляем кнопки на панель, да и остальное вышеуказанное
            contents.add(label1);
            contents.add(textField);
            contents.add(label2);
            contents.add(textField2);
            contents.add(result);
            contents.add ( button1 );
            contents.add ( button2 );
            contents.add ( button3 );
            contents.add ( button4 );
            contents.add ( button5 );

            //Создаем слушатели, все 5 абсолютно по аналогии
            ActionListener listener = new ActionListener() {
                //В теле этого метода мы задаем поведение
                // которое будет выполнятся при нажатии на кнопку
                @Override
                public void actionPerformed ( ActionEvent e ) {
                    double x = 0;
                    double y = 0;
                    try {
                        x = Double.parseDouble(textField.getText()); // тут поисходит преобразование в double
                        y = Double.parseDouble(textField2.getText()); //тут поисходит преобразование в double

                    } catch (NumberFormatException e1) { // в try {} catch отлавливаем ошибку, которая возникает при неправильном вводе и пишем "Некорректный ввод!", если интресно и вы не сталкивались с этим, то ознакомтесь с темой Exception
                        JOptionPane.showMessageDialog(contents, "Некорректный ввод!");
                    }
                    result.setText("Result :  " +String.valueOf(x + y)); // то, что мы в конечном итоге увидим на экране, ранее было создана JLabel result
                }
            };

            ActionListener listener2 = new ActionListener() {
                // В теле этого метода мы задаем поведение
                // которое будет выполнятся при нажатии на кнопку
                @Override
                public void actionPerformed ( ActionEvent e ) {
                    double x = 0;
                    double y = 0;
                    try {
                        x = Double.parseDouble(textField.getText()); //тут поисходит преобразование в double
                        y = Double.parseDouble(textField2.getText()); //тут поисходит преобразование в double

                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(contents, "Некорректный ввод!");
                    }
                    result.setText("Result :  " +String.valueOf(x - y));
                }
            };

            ActionListener listener3 = new ActionListener() {
                @Override
                public void actionPerformed ( ActionEvent e ) {
                    double x = 0;
                    double y = 0;
                    try {
                        x = Double.parseDouble(textField.getText());
                        y = Double.parseDouble(textField2.getText());

                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(contents, "Некорректный ввод!");
                    }
                    result.setText("Result :  " +String.valueOf(x * y));
                }
            };

            ActionListener listener4 = new ActionListener() {
                @Override
                public void actionPerformed ( ActionEvent e ) {
                    double x = 0;
                    double y = 0;
                    try {
                        x = Double.parseDouble(textField.getText());
                        y = Double.parseDouble(textField2.getText());

                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(contents, "Некорректный ввод!");
                    }
                    result.setText("Result :  " +String.valueOf(x / y));
                }
            };

            ActionListener listener5 = new ActionListener() {
                @Override
                public void actionPerformed ( ActionEvent e ) {
                    double x = 0;
                    double y = 0;
                    try {
                        x = Double.parseDouble(textField.getText());
                        y = Double.parseDouble(textField2.getText());

                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(contents, "Некорректный ввод!");
                    }
                    result.setText("Result :  " + String.valueOf(Math.pow(x, y)));
                }
            };

            // Устанавливаем слушатель
            button1.addActionListener(listener);
            button2.addActionListener(listener2);
            button3.addActionListener(listener3);
            button4.addActionListener(listener4);
            button5.addActionListener(listener5);


            //размещаем панель в контейнере
            frame.setContentPane(contents);
            //Открываем окно
            frame.setVisible(true);

        }


    }





