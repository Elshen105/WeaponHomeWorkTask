import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bullet count : ");
        int bulletCount = scanner.nextInt();
        System.out.print("Enter combCapacity : ");
        int combCapacity = scanner.nextInt();;
        System.out.print("Enter Current Bullet : ");
        int currentBullet = scanner.nextInt();;



        Ak47 ak47 = new Ak47(bulletCount, combCapacity, currentBullet);

        while (true) {
            showAction();
            int operation = scanner.nextInt();
            switch (operation) {
                case 1 -> ak47.fireShoot();
                case 2 -> ak47.changeComb();
            }
        }

    }

    public static void showAction() {
        System.out.println("1. Fire");
        System.out.println("2. Change Comb");
    }

}
