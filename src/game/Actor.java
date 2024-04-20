package game;

import java.awt.Image;

public class Actor {

    private final int SPACE = 20; // Khoảng cách giữa các ô trong bản đồ

    private int x; // Tọa độ x của Actor
    private int y; // Tọa độ y của Actor
    private Image image; // Hình ảnh đại diện cho Actor

    public Actor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Trả về hình ảnh của Actor
    public Image getImage() {
        return image;
    }

    // Thiết lập hình ảnh cho Actor
    public void setImage(Image img) {
        image = img;
    }

    // Trả về tọa độ x của Actor
    public int x() {
        return x;
    }

    // Trả về tọa độ y của Actor
    public int y() {
        return y;
    }

    // Thiết lập tọa độ x của Actor
    public void setX(int x) {
        this.x = x;
    }

    // Thiết lập tọa độ y của Actor
    public void setY(int y) {
        this.y = y;
    }

    // Kiểm tra va chạm với Actor bên trái
    public boolean isLeftCollision(Actor actor) {
        return x() - SPACE == actor.x() && y() == actor.y();
    }

    // Kiểm tra va chạm với Actor bên phải
    public boolean isRightCollision(Actor actor) {
        return x() + SPACE == actor.x() && y() == actor.y();
    }

    // Kiểm tra va chạm với Actor phía trên
    public boolean isTopCollision(Actor actor) {
        return y() - SPACE == actor.y() && x() == actor.x();
    }

    // Kiểm tra va chạm với Actor phía dưới
    public boolean isBottomCollision(Actor actor) {
        return y() + SPACE == actor.y() && x() == actor.x();
    }
}
