package swing.ch07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel1;


    // 이전했던 코드를 한번 더 복습
    public ColorFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");
        panel1 = new JPanel();
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        panel1.setBackground(Color.YELLOW);
        add(panel1);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        setVisible(true);
    }

    private void addEventListener() {
        // JButton 클래스 내에 만들어져 있는 메서드 이다.
        // this 는 ActionListener 타입으로 바라볼 수 있다.
        // --> // 1.  이벤트 리스너 등록
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 2. actionPerformed 메서드 콜백(호출되어) 동작하게 끔 설계 되어 있음
        System.out.println("actionPerformed() 메서드가 호출 되었다.");
        JButton selectedButton = (JButton) e.getSource();
        System.out.println(selectedButton.getText());
        // ------------ 1번 > 파란색 , 2번 검은색 동작할 수 있도록 코드를 완성해 주세요
        // panel1.setBackground(Color.BLUE);
        if (selectedButton == button1) {
            panel1.setBackground(Color.BLUE);
        } else if (selectedButton == button2) {
            panel1.setBackground(Color.BLACK);
        } else if(selectedButton == button3) {
            panel1.setBackground(Color.white);
        } else if(selectedButton == button4) {
            panel1.setBackground(Color.darkGray);
        }
    }


}
