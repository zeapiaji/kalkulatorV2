import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JTextField hasil;
    private JButton a1Button;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button10;
    private JButton button11;
    private JButton xButton;
    private JButton cButton;
    private JButton a0Button;
    private JButton button15;
    private JButton button16;
    private JPanel Main;

    //  Kalkulator
    String bil, bilangan;
    int jumlah,bil1,bil2,pilih;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Kalkulator() {
        a0Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "0";
                hasil.setText(bilangan);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "1";
                hasil.setText(bilangan);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "2";
                hasil.setText(bilangan);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "3";
                hasil.setText(bilangan);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "4";
                hasil.setText(bilangan);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "5";
                hasil.setText(bilangan);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "6";
                hasil.setText(bilangan);
            }
        });

        a7Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "7";
                hasil.setText(bilangan);
            }
        });


        a8Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "8";
                hasil.setText(bilangan);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bilangan = "";
                bilangan += "9";
                hasil.setText(bilangan);
            }
        });

        button10.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bil1        = Integer.parseInt(bilangan);
                hasil.setText("+");
                bilangan    = "";
                pilih       = 1;
            }
        });

        button11.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bil1        = Integer.parseInt(bilangan );
                hasil.setText("-");
                bilangan    = "";
                pilih       = 2;
            }
        });

        xButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bil1        = Integer.parseInt(bilangan);
                hasil.setText("x");
                bilangan    = "";
                pilih       = 3;
            }
        });

        button16.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                bil1        = Integer.parseInt(bilangan);
                hasil.setText("/");
                bilangan    = "";
                pilih       = 4;
            }
        });

        cButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                hasil.setText(null);
                bil1=0;
                bil2=0;
                jumlah=0;
                bilangan="";
            }
        });

        button15.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (pilih){
                    case 1:
                        bil2 = Integer.parseInt(String.valueOf(hasil.getText()));
                        jumlah = bil1+bil2;
                        bilangan = Integer.toString(jumlah);
                        break;
                    case 2:
                        bil2 =Integer.parseInt(String.valueOf(hasil.getText()));
                        jumlah = bil1 - bil2;
                        bilangan = Integer.toString(jumlah);
                        break;
                    case 3:
                        bil2 = Integer.parseInt(String.valueOf(hasil.getText()));
                        jumlah = bil1 * bil2;
                        bilangan = Integer.toString(jumlah);
                        break;
                    case 4:
                        bil2 = Integer.parseInt(String.valueOf(hasil.getText()));
                        jumlah = bil1 / bil2;
                        bilangan = Integer.toString(jumlah);
                        break;
                }
                hasil.setText(bilangan);
            }
        });
    }
}
