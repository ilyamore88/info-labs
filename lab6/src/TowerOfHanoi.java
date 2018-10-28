public class TowerOfHanoi {
    static Tower[] towers = new Tower[3];
    static int n = 5;

    public static void main(String[] args) {
        towers[0] = new Tower(n, n);
        towers[1] = new Tower(0, n);
        towers[2] = new Tower(0, n);
        for (int i = 0; i < n; i++) {
            towers[0].setRingByIndex(i, n - i);
            towers[1].setRingByIndex(i, 0);
            towers[2].setRingByIndex(i, 0);
        }
        moveStack(n, 0, 2);
    }

    static void moveStack(int stackSize, int fromIndex, int atIndex) {      //move stack from one tower to other tower
        if (stackSize == 0) {
            return;    //exit if stack is empty
        }
        int thirdIndex = getThirdIndex(fromIndex, atIndex);     //get empty tower index
        moveStack(stackSize - 1, fromIndex, thirdIndex);    //move substack (less by 1) to third tower
        towers[fromIndex].moveRing(towers[atIndex]);    //move biggest ring to tower
        System.out.println((fromIndex + 1) + " -> " + (atIndex + 1));   //print move
        System.out.println(" _\t _\t _");
        for (int i = 0; i < n; i++) {
            System.out.println("|" + towers[0].getRingByIndex(n - i - 1) + "|\t|" + towers[1].getRingByIndex(n - i - 1) + "|\t|" + towers[2].getRingByIndex(n - i - 1) + "|");
        }
        System.out.println("\n");
        moveStack(stackSize - 1, thirdIndex, atIndex);      //return substack from third tower to tower with biggest ring
    }

    static int getThirdIndex(int index1, int index2) {
        switch (index1) {
            case 0:
                if (index2 == 1) {
                    return 2;
                } else {
                    return 1;
                }
            case 1:
                if (index2 == 0) {
                    return 2;
                } else {
                    return 0;
                }
            case 2:
                if (index2 == 0) {
                    return 1;
                } else {
                    return 0;
                }
        }
        return 0;
    }
}
