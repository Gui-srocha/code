import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameFrame extends JFrame {

    private JButton[] buttons;
    private Solver solution = new Solver();
    private KakurasuButton[] cells = new KakurasuButton[16];
    private PButton[] cells1 = new PButton[16];
    private SButton[] cells2 = new SButton[16];

    //menu frame
    public void setUpFrame() {
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JPanel bt1 = new JPanel(new FlowLayout());
        JLabel beg = new JLabel("                                      Final Project");
        beg.setFont(new Font("Serif", Font.BOLD, 55));
        ct.add(beg, BorderLayout.CENTER);
        JButton kakurasu = new JButton("Kakurasu");
        JButton skyscraper = new JButton("Skyscraper");
        JButton logi_4 = new JButton("Logi-4");
        bt1.setSize(new Dimension(200, 200));
        bt1.add(kakurasu);
        bt1.add(skyscraper);
        bt1.add(logi_4);
        ct.add(bt1, BorderLayout.SOUTH);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
        kakurasu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.dispose();
                setUpFrame1();
            }
        });
        skyscraper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.dispose();
                setUpFrame3();
            }
        });
        logi_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.dispose();
                setUpFrame2();
            }
        });
    }

    //kakurasu frame
    public void setUpFrame1() {

        // Exit when window is closed
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JPanel bt1 = new JPanel(new GridLayout(1, 8));
        JPanel bt2 = new JPanel(new GridLayout(4, 2));
        JPanel bt3 = new JPanel(new GridLayout(4, 2));
        JPanel bt4 = new JPanel(new GridLayout(1, 4));
        JPanel bt5 = new JPanel(new BorderLayout());
        JPanel contentPane = new JPanel(new GridLayout(4, 4));
        JLabel a1 = new JLabel("4");
        JLabel a2 = new JLabel("                8");
        JLabel a3 = new JLabel("                                                  3");
        JLabel a4 = new JLabel("                                                                      6");
        JLabel b1 = new JLabel("       10");
        JLabel b2 = new JLabel("       7");
        JLabel b3 = new JLabel("       7");
        JLabel b4 = new JLabel("       2");
        JLabel c1 = new JLabel("        1");
        JLabel c2 = new JLabel("        2");
        JLabel c3 = new JLabel("        3");
        JLabel c4 = new JLabel("        4");
        JLabel d1 = new JLabel("                                                                 1");
        JLabel d2 = new JLabel("                                                           2");
        JLabel d3 = new JLabel("                                           3");
        JLabel d4 = new JLabel("                                        4");
        a1.setPreferredSize(new Dimension(40, 40));
        a2.setPreferredSize(new Dimension(40, 40));
        a3.setPreferredSize(new Dimension(40, 40));
        a4.setPreferredSize(new Dimension(10, 10));
        JButton check = new JButton("Check answers");
        check.setBackground(Color.BLACK);
        JButton returno = new JButton("Return");
        returno.setBackground(Color.BLACK);
        check.setPreferredSize(new Dimension(25, 25));
        returno.setPreferredSize(new Dimension(25, 25));

        //ct.add(playingField.getCells());
        bt2.add(b1);
        bt2.add(b2);
        bt2.add(b3);
        bt2.add(b4);
        bt2.setPreferredSize(new Dimension(50, 50));
        bt3.add(c1);
        bt3.add(c2);
        bt3.add(c3);
        bt3.add(c4);
        bt3.setPreferredSize(new Dimension(50, 50));
        bt4.setAlignmentX(1000);
        bt4.add(d1);
        bt4.add(d2);
        bt4.add(d3);
        bt4.add(d4);
        bt4.setPreferredSize(new Dimension(50, 50));
        bt5.add(returno, BorderLayout.NORTH);
        bt5.add(check, BorderLayout.SOUTH);
        bt1.add(returno);
        bt1.add(a1);
        bt1.add(a2);
        bt1.add(a3);
        bt1.add(a4);
        bt1.add(check);
        bt1.setPreferredSize(new Dimension(50, 50));

        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                KakurasuButton cell = new KakurasuButton((i * 4) + (g + 1), Color.white);
                cells[(i * 4) + (g)] = cell;
                contentPane.add(cells[(i * 4) + (g)]);
            }
        }
        contentPane.setSize(10, 10);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
        ct.add(contentPane, BorderLayout.CENTER);
        ct.add(bt4, BorderLayout.NORTH);
        ct.add(bt1, BorderLayout.SOUTH);
        ct.add(bt2, BorderLayout.EAST);
        ct.add(bt3, BorderLayout.WEST);
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solutionCheck();
            }
        });
        returno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.dispose();
                setUpFrame();
            }
        });

    }

    //kakurasu solution check
    public void solutionCheck() {
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                if (cells[(i * 4) + g].isPressed()) {
                    this.solution.setSolver((i * 4) + g, 1);
                } else {
                    solution.setSolver((i * 4) + g, 0);
                }
            }
        }

        solution.check();
    }

    //logi-4 frame
    public void setUpFrame2() {
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JPanel buttons = new JPanel(new BorderLayout());
        JButton check = new JButton("Check answers");
        check.setBackground(Color.BLACK);
        JButton returno = new JButton("Return");
        returno.setBackground(Color.BLACK);
        buttons.add(returno, BorderLayout.WEST);
        buttons.add(check, BorderLayout.EAST);
        JFrame panel = new JFrame();
        JPanel contentPane = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                if ((i * 4) + (g + 1) == 1 || (i * 4) + (g + 1) == 2 || (i * 4) + (g + 1) == 5 || (i * 4) + (g + 1) == 9) {
                    if ((i * 4) + (g + 1) == 2) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 5) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else {
                        PButton cell = new PButton();
                        cell.setBackground(Color.BLUE);
                        cells1[(i * 4) + (g)] = cell;
                        contentPane.add(cell);
                    }
                } else if ((i * 4) + (g + 1) == 3 || (i * 4) + (g + 1) == 4 || (i * 4) + (g + 1) == 8 || (i * 4) + (g + 1) == 12) {
                    if ((i * 4) + (g + 1) == 8) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else {
                        PButton cell = new PButton();
                        cell.setBackground(Color.GREEN);
                        cells1[(i * 4) + (g)] = cell;
                        contentPane.add(cell);
                    }
                } else if ((i * 4) + (g + 1) == 6 || (i * 4) + (g + 1) == 7 || (i * 4) + (g + 1) == 10 || (i * 4) + (g + 1) == 11) {
                    PButton cell = new PButton();
                    cell.setBackground(Color.RED);
                    cells1[(i * 4) + (g)] = cell;
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 13 || (i * 4) + (g + 1) == 14 || (i * 4) + (g + 1) == 15 || (i * 4) + (g + 1) == 16) {
                    if ((i * 4) + (g + 1) == 16) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else {
                        PButton cell = new PButton();
                        cell.setBackground(Color.CYAN);
                        cells1[(i * 4) + (g)] = cell;
                        contentPane.add(cell);
                    }
                }
            }
        }
        ct.add(contentPane, BorderLayout.CENTER);
        ct.add(buttons, BorderLayout.SOUTH);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solutionCheck1();
            }
        });
        returno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.dispose();
                setUpFrame();
            }
        });
    }

    //logi-4 solution check
    public void solutionCheck1() {
        if (cells1[0].getCount() == 2 && cells1[2].getCount() == 3 && cells1[3].getCount() == 1 && cells1[5].getCount() == 3 &&
                cells1[6].getCount() == 4 && cells1[8].getCount() == 3 && cells1[9].getCount() == 1 && cells1[10].getCount() == 2
                && cells1[11].getCount() == 4 && cells1[12].getCount() == 4 && cells1[13].getCount() == 2 && cells1[14].getCount() == 1) {
            solution.layoutCorrect();
        } else if (cells1[0].getCount() == 2 && cells1[2].getCount() == 3 && cells1[3].getCount() == 1 && cells1[5].getCount() == 3 &&
                cells1[6].getCount() == 4 && cells1[8].getCount() == 3 && cells1[9].getCount() == 2 && cells1[10].getCount() == 1
                && cells1[11].getCount() == 4 && cells1[12].getCount() == 1 && cells1[13].getCount() == 2 && cells1[14].getCount() == 1) {
            solution.layoutCorrect();
        } else {
            solution.layoutIncorrect1();
        }
    }

    //skyscraper frame
    public void setUpFrame3() {

        // Exit when window is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JPanel bt1 = new JPanel(new GridLayout(1, 8));
        JPanel bt2 = new JPanel(new GridLayout(4, 2));
        JPanel bt3 = new JPanel(new GridLayout(4, 2));
        JPanel bt4 = new JPanel(new GridLayout(1, 4));
        JPanel bt5 = new JPanel(new BorderLayout());
        JPanel contentPane = new JPanel(new GridLayout(4, 4));
        JLabel a1 = new JLabel("4");
        JLabel a2 = new JLabel("                2");
        JLabel a3 = new JLabel("                                                  3");
        JLabel a4 = new JLabel("                                                                      1");
        JLabel b1 = new JLabel("       2");
        JLabel b2 = new JLabel("       2");
        JLabel b3 = new JLabel("       3");
        JLabel b4 = new JLabel("       1");
        JLabel c1 = new JLabel("        1");
        JLabel c2 = new JLabel("        2");
        JLabel c3 = new JLabel("        2");
        JLabel c4 = new JLabel("        3");
        JLabel d1 = new JLabel("                                                                 1");
        JLabel d2 = new JLabel("                                                           2");
        JLabel d3 = new JLabel("                                           2");
        JLabel d4 = new JLabel("                                        2");
        a1.setPreferredSize(new Dimension(40, 40));
        a2.setPreferredSize(new Dimension(40, 40));
        a3.setPreferredSize(new Dimension(40, 40));
        a4.setPreferredSize(new Dimension(10, 10));
        JButton check = new JButton("Check answers");
        check.setBackground(Color.BLACK);
        JButton returno = new JButton("Return");
        returno.setBackground(Color.BLACK);
        check.setPreferredSize(new Dimension(25, 25));
        returno.setPreferredSize(new Dimension(25, 25));

        //ct.add(playingField.getCells());
        bt2.add(b1);
        bt2.add(b2);
        bt2.add(b3);
        bt2.add(b4);
        bt2.setPreferredSize(new Dimension(50, 50));
        bt3.add(c1);
        bt3.add(c2);
        bt3.add(c3);
        bt3.add(c4);
        bt3.setPreferredSize(new Dimension(50, 50));
        bt4.setAlignmentX(1000);
        bt4.add(d1);
        bt4.add(d2);
        bt4.add(d3);
        bt4.add(d4);
        bt4.setPreferredSize(new Dimension(50, 50));
        bt5.add(returno, BorderLayout.NORTH);
        bt5.add(check, BorderLayout.SOUTH);
        bt1.add(returno);
        bt1.add(a1);
        bt1.add(a2);
        bt1.add(a3);
        bt1.add(a4);
        bt1.add(check);
        bt1.setPreferredSize(new Dimension(50, 50));

        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                SButton cell = new SButton();
                cells2[(i * 4) + (g)] = cell;
                contentPane.add(cells2[(i * 4) + (g)]);
            }
        }
        contentPane.setSize(10, 10);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
        ct.add(contentPane, BorderLayout.CENTER);
        ct.add(bt4, BorderLayout.NORTH);
        ct.add(bt1, BorderLayout.SOUTH);
        ct.add(bt2, BorderLayout.EAST);
        ct.add(bt3, BorderLayout.WEST);
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solutionCheck2();
            }
        });
        returno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.dispose();
                setUpFrame();
            }
        });

    }

    //skyscraper solution check
    public void solutionCheck2() {
        if (cells2[0].getCount() == 4 && cells2[1].getCount() == 2 && cells2[2].getCount() == 1 && cells2[3].getCount() == 3 && cells2[4].getCount() == 3 &&
                cells2[5].getCount() == 1 && cells2[6].getCount() == 4 && cells2[7].getCount() == 2 && cells2[8].getCount() == 2 && cells2[9].getCount() == 4 &&
                cells2[10].getCount() == 3 && cells2[11].getCount() == 1 && cells2[12].getCount() == 1 && cells2[13].getCount() == 3 &&
                cells2[14].getCount() == 2 && cells2[15].getCount() == 4) {
            solution.layoutCorrect();
        } else {
            solution.layoutIncorrect2();
        }
    }

}

