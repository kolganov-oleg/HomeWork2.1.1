public class Puffenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public void compareStudents(Puffenduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public Puffenduy(String fullName, int magic, int teleport, int industriousness, int loyalty, int honesty) {
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Неверное значение");
        }
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Неверное значение");
        }
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
}
