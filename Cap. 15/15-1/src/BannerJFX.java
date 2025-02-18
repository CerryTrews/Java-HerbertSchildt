import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BannerJFX extends JPanel implements ActionListener {
    private String msg = " Java Rules the Web ";
    private Timer timer;
    private boolean running;

    public BannerJFX() {
        timer = new Timer(250, this);
        running = false;
    }

    public void start() {
        if (!running) {
            timer.start();
            running = true;
        }
    }

    public void stop() {
        if (running) {
            timer.stop();
            running = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Rotate the message
        char ch = msg.charAt(0);
        msg = msg.substring(1) + ch;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(msg, 50, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Banner");
        BannerJFX banner = new BannerJFX();
        frame.add(banner);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        banner.start();
    }
}
