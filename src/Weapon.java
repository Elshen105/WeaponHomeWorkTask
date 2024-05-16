public abstract class Weapon {
    public int bulletCount;
    public int combCapacity;
    public int currentBullet;

    public Weapon(int bulletCount, int combCapacity, int currentBullet) {
        this.bulletCount = bulletCount;
        this.combCapacity = combCapacity;
        this.currentBullet = currentBullet;
    }
}
