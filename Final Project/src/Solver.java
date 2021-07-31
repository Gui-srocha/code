import javax.swing.*;
import java.awt.*;

public class Solver extends JFrame {
    private int[] solver;

    public Solver() {
        solver = new int[16];
        for (int i = 0; i < solver.length; i++) {
            solver[i] = 0;
        }
    }

    public void setSolver(int index, int index2) {
        solver[index] = index2;
    }

    //Layout displayed when the player wins
    public void layoutCorrect() {
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JLabel win = new JLabel("              Congratulations! You solved the puzzle");
        win.setFont(new Font("Serif", Font.BOLD, 55));
        ct.add(win, BorderLayout.CENTER);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
    }

    //Solution for kakurasu
    public void layoutIncorrect() {
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JPanel contentPane = new JPanel(new GridLayout(4, 4));
        JLabel correct = new JLabel("                                                                          This is the correct answer");
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                if ((i * 4) + (g + 1) == 1 || (i * 4) + (g + 1) == 2 || (i * 4) + (g + 1) == 3 || (i * 4) + (g + 1) == 4 || (i * 4) + (g + 1) == 7 ||
                        (i * 4) + (g + 1) == 8 || (i * 4) + (g + 1) == 9 || (i * 4) + (g + 1) == 10 || (i * 4) + (g + 1) == 12 || (i * 4) + (g + 1) == 14) {
                    JButton cell = new JButton();
                    cell.setBackground(Color.BLACK);
                    contentPane.add(cell);
                } else {
                    JButton cell = new JButton();
                    cell.setBackground(Color.WHITE);
                    contentPane.add(cell);
                }
            }
        }
        ct.add(correct, BorderLayout.NORTH);
        ct.add(contentPane, BorderLayout.CENTER);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
    }

    //solutions for logi-4
    public void layoutIncorrect1() {
        double random = Math.random();
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JPanel contentPane = new JPanel(new GridLayout(4, 4));
        JLabel correct = new JLabel("                                                                          This is one correct answer");
        if (random > 0.5) {
            for (int i = 0; i < 4; i++) {
                for (int g = 0; g < 4; g++) {
                    if ((i * 4) + (g + 1) == 2) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 5) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 1) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 9) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 3) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 4) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 8) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 12) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 6) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 7) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 10) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 11) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    }
                    if ((i * 4) + (g + 1) == 13) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 14) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 15) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 16) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    }
                }
            }
        } else if (random < 0.5) {
            for (int i = 0; i < 4; i++) {
                for (int g = 0; g < 4; g++) {
                    if ((i * 4) + (g + 1) == 2) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 5) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 1) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 9) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.BLUE);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 3) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 4) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 8) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 12) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.GREEN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 6) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 7) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 10) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 11) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.RED);
                        contentPane.add(cell);
                    }
                    if ((i * 4) + (g + 1) == 13) {
                        JButton cell = new JButton("Y");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 14) {
                        JButton cell = new JButton("R");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 15) {
                        JButton cell = new JButton("B");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    } else if ((i * 4) + (g + 1) == 16) {
                        JButton cell = new JButton("G");
                        cell.setBackground(Color.CYAN);
                        contentPane.add(cell);
                    }
                }
            }
        }
        ct.add(contentPane, BorderLayout.CENTER);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
        ct.add(correct, BorderLayout.NORTH);
        ct.add(contentPane, BorderLayout.CENTER);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
    }

    //solution for skyscraper
    public void layoutIncorrect2() {
        Container ct = new Container();
        ct.setLayout(new BorderLayout());
        JFrame panel = new JFrame();
        JPanel contentPane = new JPanel(new GridLayout(4, 4));
        JLabel correct = new JLabel("                                                                          This is the correct answer");
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                if ((i * 4) + (g + 1) == 2) {
                    JButton cell = new JButton("2");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 5) {
                    JButton cell = new JButton("3");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 1) {
                    JButton cell = new JButton("4");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 9) {
                    JButton cell = new JButton("2");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 3) {
                    JButton cell = new JButton("1");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 4) {
                    JButton cell = new JButton("3");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 8) {
                    JButton cell = new JButton("2");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 12) {
                    JButton cell = new JButton("1");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 6) {
                    JButton cell = new JButton("1");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 7) {
                    JButton cell = new JButton("4");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 10) {
                    JButton cell = new JButton("4");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 11) {
                    JButton cell = new JButton("3");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 13) {
                    JButton cell = new JButton("1");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 14) {
                    JButton cell = new JButton("3");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 15) {
                    JButton cell = new JButton("2");
                    contentPane.add(cell);
                } else if ((i * 4) + (g + 1) == 16) {
                    JButton cell = new JButton("4");
                    contentPane.add(cell);
                }
            }
        }
        ct.add(contentPane, BorderLayout.CENTER);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
        ct.add(correct, BorderLayout.NORTH);
        ct.add(contentPane, BorderLayout.CENTER);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(ct);
        panel.setSize(600, 600);
        panel.setVisible(true);
    }

    public void pressed(int index) {
        solver[index - 1] = 1;
    }

    public void unPressed(int index) {
        solver[index - 1] = 0;
    }

    public void check() {
        if (solver[0] == 1 && solver[1] == 1 && solver[2] == 1 && solver[3] == 1 && solver[6] == 1 && solver[7] == 1 && solver[8] ==
                1 && solver[9] == 1 && solver[11] == 1 && solver[13] == 1) {
            layoutCorrect();
        } else {
            layoutIncorrect();
        }
    }
}
