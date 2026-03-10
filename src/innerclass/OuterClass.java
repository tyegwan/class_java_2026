package innerclass;

public class OuterClass {

    private static int num = 10;


    // 클래스 파일안에 내부에 또 클래스 선언 ( 중첩 클래스)
    static class InnerClass {

        public void display() {
            System.out.printf("num : " + num);
        }
    }
} // end of outer class
