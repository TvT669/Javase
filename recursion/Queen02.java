public class Queen02 {
    public static void main(String[] args) {
        int max = 8;
        int[] arry = new int[max];
        Queen8 queen = new Queen8();
        queen.check(0);
    }
}

class Queen8 {
    int max = 8;
    int[] arry = new int[max];

    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arry[n] == arry[i] || Math.abs(n - i) == Math.abs(arry[n] - arry[i])) {
                return false;
            }
        }
        return true;
    }

    public void check(int n) {
        if (n == max) {
            for (int i = 0; i < arry.length; i++) {
                System.out.print(arry[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < arry.length; i++) {
                arry[n] = i;
                if (judge(n)) {
                    check(n + 1);
                }
            }
        }
    }
}