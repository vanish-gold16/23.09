//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int souboj1;
        int souboj2;
        Drak drak1 = new Drak(3, 600, true, "Ivan");
        Drak drak2 = new Drak(9, 400, false, "Yevhen");

        System.out.println("1. " + drak1.toString());
        System.out.println("2. " + drak2.toString());

        if(drak1.getPocetHlav() > drak2.getPocetHlav()) {
            System.out.println("1. drak ma vice hlav");
        }
        else {
            System.out.println("1. drak ma mene hlav");
        }

        souboj1 = 100*drak1.getPocetHlav() + drak1.getHmotnost();
        souboj2 = 100*drak2.getPocetHlav() + drak2.getHmotnost();

        if(souboj1 > souboj2) {
            System.out.println("1. drak vyhraje souboj");
        }
        else
            System.out.println("1. drak prohraje souboj");

        System.out.println("1. " + drak1.toString());
        System.out.println("2. " + drak2.toString());

        System.out.println("1. " + drak1.toString());
        System.out.println("2. " + drak2.toString());
    }
}