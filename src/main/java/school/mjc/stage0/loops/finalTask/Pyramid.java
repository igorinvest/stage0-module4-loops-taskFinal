package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int width = (cathetusLength - 1) * 2 + 1;
            String line = "";
            for (int j = 1; j <= width; j++) {
                if(j < cathetusLength) {
                    int d = cathetusLength - j + 1;
                    if(d <= i) {
                        line = line + d;
                    } else {
                        line = line + " ";
                    }
                } else {
                    int c = j - cathetusLength + 1;
                    if(c <= i) {
                        line = line + c;
                    } else {
                        line = line + "";
                    }
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
