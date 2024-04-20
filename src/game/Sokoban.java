package game;

import java.awt.*;
import javax.swing.*;

public class Sokoban extends JFrame {
    private static final long serialVersionUID = 1L;
    private final int OFFSET = 30;
    private JPanel startPanel; // Panel chứa các nút bắt đầu và hướng dẫn
    private JLabel background; // Hình nền chứa startPanel

    public Sokoban() {
        initUI();
    }

    private void initUI() {
        // Khởi tạo panel chứa nút bắt đầu và hướng dẫn
        startPanel = new JPanel(new GridBagLayout());
        startPanel.setOpaque(false); // Đặt panel không trong suốt để hình ảnh nền có thể hiển thị
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 10;
        gbc.ipady = 10;
        gbc.insets.set(5, 5, 5, 5);

        // Nút bắt đầu
        JButton startButton = new JButton("BẮT ĐẦU");
        startButton.addActionListener(e -> startGame());
        startPanel.add(startButton, gbc);

        gbc.gridy++;
        // Nút hướng dẫn
        JButton guideButton = new JButton("HƯỚNG DẪN");
        guideButton.addActionListener(e -> showGuide());
        startPanel.add(guideButton, gbc);

        // Thêm hình ảnh nền
        background = new JLabel(new ImageIcon("src/resources/background1.png"));
        background.setLayout(new BorderLayout());
        background.add(startPanel);

        // Thêm background vào frame
        add(background);

        // Cài đặt các thuộc tính của frame
        setTitle("Sokoban");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void startGame() {
        getContentPane().removeAll();
        Board board = new Board();
        add(board);
        setSize(board.getBoardWidth() + OFFSET, board.getBoardHeight() + 2 * OFFSET);
        revalidate();
        repaint();
        board.requestFocusInWindow();
    }

    private void showGuide() {
        // Hiển thị hướng dẫn trong cửa sổ pop-up
        String guideMessage = "Sử dụng các nút mũi tên để di chuyển nhân vật, đưa các hộp vào đúng vị trí.";
        JOptionPane.showMessageDialog(this, guideMessage, "HƯỚNG DẪN", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Sokoban game = new Sokoban();
            game.setVisible(true);
        });
    }
}
