package game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Area extends Actor {

    // Hàm khởi tạo của lớp Area, nhận vào tọa độ x và y
    public Area(int x, int y) {
        super(x, y); // Gọi constructor của lớp cha (Actor) để thiết lập tọa độ x và y

        initArea(); // Gọi phương thức khởi tạo của Area
    }

    // Phương thức khởi tạo hình ảnh cho Area
    private void initArea() {
        // Tạo một ImageIcon từ đường dẫn của hình ảnh area.png
        ImageIcon icon = new ImageIcon("src/resources/area.png");
        // Lấy hình ảnh từ ImageIcon
        Image image = icon.getImage();
        // Thiết lập hình ảnh cho Actor (Area)
        setImage(image);
    }
}
