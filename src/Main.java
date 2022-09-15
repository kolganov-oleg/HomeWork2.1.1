public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 45, 67, 14, 36, 87);
        Griffindor ronUizly = new Griffindor("Ron Uizly", 66, 33, 34, 32, 87);
        Kogtevran joyJang = new Kogtevran("Joy Jang", 34, 67, 23, 45, 67, 78);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 34, 98, 44, 45, 33, 88);
        Puffenduy zahariyaSmith = new Puffenduy("Zahariya Smith", 45, 67, 23, 12, 45);
        Puffenduy sedrikDiggory = new Puffenduy("Sedrik Diggory", 45, 67, 23, 12, 45);
        Slizerin dragoMalfoy = new Slizerin("Drago Malfoy", 34, 56, 23, 34, 89, 74, 22);
        Slizerin gregoryGoyl = new Slizerin("Gregory Goyl", 34, 56, 23, 34, 89, 74, 22);

        harryPotter.compareStudents(ronUizly);
        System.out.println();
        harryPotter.compareStudents(padmaPatil);
        System.out.println();
        dragoMalfoy.compareStudents(gregoryGoyl);
    }
}