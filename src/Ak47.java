public class Ak47 extends Weapon implements Firable {
    public Ak47(int bulletCount, int combCapacity, int currentBullet) {
        super(bulletCount, combCapacity, currentBullet);
    }

    @Override
    public void changeComb() {
        if (bulletCount >= 0) {
            if (currentBullet >= combCapacity - bulletCount) {
                int bulletsToTransfer = combCapacity - bulletCount;
                currentBullet -= bulletsToTransfer;
                bulletCount += bulletsToTransfer;
                System.out.println("Bullet Count : " + bulletCount);
                System.out.println("Current Bullet : " + currentBullet);
                System.out.println("Added Bullet Count : " + bulletsToTransfer);
            }
        }
    }

    @Override
    public void fireShoot() {
        if (bulletCount > 0) {
            bulletCount--;
            System.out.println("Open Fire");
        } else {
            System.err.println("Your Comb is change");
        }
    }

    @Override
    public String toString() {
        return "Ak47{" +
                "bulletCount=" + bulletCount +
                ", combCapacity=" + combCapacity +
                ", currentBullet=" + currentBullet +
                '}';
    }
}
