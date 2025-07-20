package Level_1.exercici_1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods test = new NoGenericMethods("Lois", "González", "Pantalois");
        System.out.println(test);

        test.setName("Diego");
        test.setSurname("Nuñez");
        test.setNickname("Quecowa");

        System.out.println(test.getName());
        System.out.println(test.getSurname());
        System.out.println(test.getNickname());
    }
}