package kadai_014;

public class CarExec_Chapter14 {
    public static void main(String[] args) {
        Car_Chapter14 car = new Car_Chapter14();

        car.gearChange(3); // ギア3を引数に指定　配列の40が指定先になる。
        car.run(); // 配列3だと速度が40kmになるので他で調整。
    }
}