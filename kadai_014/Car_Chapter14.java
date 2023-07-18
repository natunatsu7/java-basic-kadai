package kadai_014;

public class Car_Chapter14 {
    private int gear = 1; // ギアの初期値
    private int speed = 10; // 速度の初期値

    /* ギアチェンジ後の速度を表示するメソッド
    mainファイルで「メソッド名;」で呼べる。*/
    
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
    

    // ギアが0または6以上の時に返す記述　呼ばれたらメソッド終了になる。
    public void gearChange(int updateGear) {
        if (gear == 0 || gear >= 6) {
            System.out.println("無効なギアです。");
            return;
        }

        gear = updateGear;
        System.out.println("ギア1から" + gear + "に切り替えました。");

        
        //配列を作成しそれぞれの速度を配置
        //該当の配列は2だが、2にするとギアも2になるため他で調整。直し方がわからない。
        //配列の順番を変えれば直る。
        int[] speedsGear = {10, 20, 30, 40, 50,10}; // 各ギアに対応する速度（1速から5速とそれ以外)）
        
        //配列2だとギアと速度があわないので速度を-1にしたら30になりました。
        speed = speedsGear[gear -1];
    }
}