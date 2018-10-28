public class Tower {
    private int ringCount;
    private int rings[];

    public Tower(int ringCount, int maxRingCount) {
        this.ringCount = ringCount;
        this.rings = new int[maxRingCount];
    }

    public int getRingCount() {
        return ringCount;
    }

    public void setRingCount(int ringCount) {
        this.ringCount = ringCount;
    }

    public int getRingByIndex(int index) {
        return rings[index];
    }

    public void setRingByIndex(int index, int ring) {
        rings[index] = ring;
    }

    public void moveRing(Tower atTower) {
        ringCount--;
        atTower.rings[atTower.ringCount] = rings[ringCount];
        rings[ringCount] = 0;
        atTower.ringCount++;
    }
}
