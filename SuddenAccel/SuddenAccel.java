import javax.swing.*;
import java.awt.*;

public class SuddenAccel {

    public static void main(String[] args) {
        // 1. 휴대폰 비율 설정 (예: 16:9)
        double aspectRatioWidth = 9.0;
        double aspectRatioHeight = 16.0;

        // 2. 현재 화면 해상도를 가져옴
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();

        // 3. 비율에 맞는 JFrame 크기 계산
        // 전체 화면의 높이를 기준으로 JFrame 크기 설정
        int frameHeight = (int) (screenHeight * 0.8);  // 예: 화면 높이의 80%
        int frameWidth = (int) (frameHeight * (aspectRatioWidth / aspectRatioHeight));

        // 4. JFrame 생성 및 크기 설정
        JFrame frame = new JFrame("Mobile Aspect Ratio Frame");
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 화면 중앙에 위치시키기
        frame.setLocationRelativeTo(null);

        // 5. JFrame 보이기
        frame.setVisible(true);
    }
}
