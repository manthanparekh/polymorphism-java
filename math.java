public class math {
    void homework(int x) {
        if (x > 2) {
            System.out.println("This is a good amount " + x);
        } else {
            System.out.println("There is not enough practice with this " + x + " amount");
        }
    }
}

class main {
    public static void main(String[] args) {
        math algebra = new math();
        math chemistry = new Chemistry();
        math funny = new Fun();

        algebra.homework(9);
        chemistry.homework(1);
        funny.homework(2);
    }
}
