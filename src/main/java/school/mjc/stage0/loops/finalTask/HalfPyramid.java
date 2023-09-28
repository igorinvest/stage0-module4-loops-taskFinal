package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int width = (cathetusLength - 1) * 2 + 1;
            String line = "";
            for (int j = 0; j <= width; j++) {
                if(j < cathetusLength) {
                    int d = cathetusLength - j;
                    if(d <= i) {
                        line = line + "*";
                    } else {
                        line = line + " ";
                    }
                } else {
                    int c = j - cathetusLength + 1;
                    if(c <= i) {
                        //line = line + c;
                    } else {
                        //line = line + "";
                    }
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
