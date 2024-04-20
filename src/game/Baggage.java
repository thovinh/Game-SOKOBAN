package game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Baggage extends Actor {

    // Hàm khởi tạo của lớp Baggage, nhận vào tọa độ x và y
    public Baggage(int x, int y) {
        super(x, y); // Gọi constructor của lớp cha (Actor) để thiết lập tọa độ x và y

        initBaggage(); // Gọi phương thức khởi tạo của Baggage
    }

    // Phương thức khởi tạo hình ảnh cho Baggage
    private void initBaggage() {
        // Tạo một ImageIcon từ đường dẫn của hình ảnh baggage.png
        ImageIcon icon = new ImageIcon("src/resources/baggage.png");
        // Lấy hình ảnh từ ImageIcon
        Image image = icon.getImage();
        // Thiết lập hình ảnh cho Actor (Baggage)
        setImage(image);
    }

    // Phương thức di chuyển Baggage
    public void move(int x, int y) {
        // Tính toán tọa độ mới của Baggage dựa trên việc di chuyển theo x và y
        int dx = x() + x;
        int dy = y() + y;
        // Thiết lập tọa độ mới cho Baggage
        setX(dx);
        setY(dy);
    }
}
