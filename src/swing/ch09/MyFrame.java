package swing.ch09;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    private JLabel backgroundMap;
    private JLabel player;

    private final int MOVE_STEP = 10;
    ImageIcon playerIconr = new ImageIcon("image/playerR.png");
    ImageIcon playerIconl = new ImageIcon("image/playerL.png");
    ImageIcon playerIconld = new ImageIcon("image/playerLDie.png");
    ImageIcon playerIconrd = new ImageIcon("image/playerRDie.png");

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }


    private void initData() {
        setTitle("이미지 사용 연습");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정
        ImageIcon backgroundIcon = new ImageIcon("image/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 설정

//        ImageIcon playerIconld = new ImageIcon("playerLDie.png");
//        ImageIcon playerIconrd = new ImageIcon("playerRDie.png");

        player = new JLabel(playerIconr);
        player = new JLabel(playerIconl);


        player.setSize(100, 100);

        player.setLocation(200, 200);


    }

    private void setInitLayout() {
        setLayout(null); // 좌표 기반
        backgroundMap.add(player);

//        backgroundMap.add(player3);
//        backgroundMap.add(player4);
        add(backgroundMap);
        setVisible(true);


    }

    private void addEventListener() {
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        int x = player.getX(); // 현재 자신의 x 좌표값을 반환

        // 현재 자신의 x 좌표값을 반환
        int y = player.getY(); // 현재 자신의 y 좌표값을 반환

        // 방향키 코드값에 따라 새로운 좌표 설정
        if (keyCode == KeyEvent.VK_LEFT) {
            player.setIcon(playerIconl);
            player.setLocation(x - MOVE_STEP, y);
        } else if (keyCode == KeyEvent.VK_UP) {
            player.setIcon(playerIconld);
            player.setLocation(x, y - MOVE_STEP);
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            player.setIcon(playerIconr);
            player.setLocation(x + MOVE_STEP, y);
        } else if (keyCode == KeyEvent.VK_DOWN) {
            player.setIcon(playerIconrd);
            player.setLocation(x, y + MOVE_STEP);
        }


        // 테스트 코드 (메인 쓰레드)


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
