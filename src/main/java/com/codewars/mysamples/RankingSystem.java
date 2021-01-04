//https://www.codewars.com/kata/51fda2d95d6efda45e00004e/train/java
package com.codewars.mysamples;

public class RankingSystem {
    int rank = -8;
    int progress = 0;

    public void incProgress(int rank) {
        if (Math.abs(rank) > 8 || rank == 0) throw new IllegalArgumentException();
        if (this.rank == 8) return;

        int difference = rank - this.rank + normal(this.rank, rank);

        int point = 0;
        switch (difference) {
            case 0: point = 3; break;
            case -1: point = 1; break;
            default: if (difference > 0)
                point = 10 * difference * difference;
        }
        progress += point;
        updateRank();
    }

    private void updateRank() {
        if (rank < 8 && progress >= 100) {
            int tempRank = progress / 100 + rank;
            rank = Math.min(tempRank - normal(rank, tempRank), 8);
            progress = (rank < 8) ? progress % 100 : 0;
        }
    }

    private int normal(int x, int y) {
        return Integer.compare(Integer.signum(x), Integer.signum(y));
    }
}
