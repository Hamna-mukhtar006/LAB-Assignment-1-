public class Trace {
    public static void main(String[] args) {
        Student a = new Student();
        a.name = "Ali";
        Student b = a;
        b.name = "Sara";
        Student c = new Student();
        c.name = a.name;

        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
        System.out.println("c.name = " + c.name);
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));

        b = new Student();
        b.name = "Hamna";
        System.out.println("After reassigning b:");
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}