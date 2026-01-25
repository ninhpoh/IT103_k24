public class Bt03 {
    public static void main(String[] args){
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.print("book1 = " + book1 + "   ");
        System.out.print("book2 = " + book2);
    }
}
