public class Kogtevran extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;


    public void compareStudents(Kogtevran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creation;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public Kogtevran(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        if (mind < 0 || mind > 100) {
            throw new RuntimeException("Неверное значение");
        }
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Неверное значение");
        }
        if (wit < 0 || wit > 100) {
            throw new RuntimeException("Неверное значение");
        }
        if (creation < 0 || creation > 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
}
