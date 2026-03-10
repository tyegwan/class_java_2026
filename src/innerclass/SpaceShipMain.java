package innerclass;

public class SpaceShipMain {

    public static void main(String[] args) {

        // 정적 내부 클래스라서 바로 생성 가능함
        SpaceShip.Engine engine1 = new SpaceShip.Engine();

        engine1.start();
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.addEngine(engine1);
        spaceShip.startSpaceShip();
    }
}
