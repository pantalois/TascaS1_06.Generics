package Level_1.exercici_1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods test = new NoGenericMethods("Lois", "González", "Pantalois");
        System.out.println(test);

        String name = "Diego";
        String surname1 = "Nuñez";
        String surname2 = "Quecowa";

        System.out.println(new NoGenericMethods(name, surname1, surname2));
        System.out.println(new NoGenericMethods(surname1, surname2, name));
        System.out.println(new NoGenericMethods(surname2, name, surname1));
    }
}