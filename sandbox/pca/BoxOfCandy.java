package sandbox.pca;

public class BoxOfCandy {
    private Candy[][] box;

    public boolean moveCandyToFirstRow(int col) {
        boolean flag = true;
        for (int i = 0; i < box.length; i++) {
            if (box[i][col] == null) {
                flag = false;
            } else {
                flag = true;
                box[0][col] = box[i][col];
                if (i != 0) {
                    box[i][col] = null;
                }
                return flag; // true
            }
        }
        return flag; // false
    }

    public Candy removeNextByFlavor(String flavor) {
        for (int i = box.length; i > 0; i--) {
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j].toString() == flavor) {
                    box[i][j] = null;
                    return flavor;
                }
            }
        }
        return null;
    }
}
