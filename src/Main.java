public class Main {
    public static void main(String[] args) {
        Addition add = new Addition();

        System.out.println("First Function : Sum = "+ add.sum(12,12));

        System.out.println("Second Function : Sum = "+ add.sum(1,2,3));

        System.out.println("Third Function : Sum = "+ add.sum("Diwakar","Kumar"));
    }

}