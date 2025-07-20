package Level_1.exercici_2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Lois", "González", 28);

        GenericMethods.printGenericParameters(p1, "This is a String", 'a');
    }
}
