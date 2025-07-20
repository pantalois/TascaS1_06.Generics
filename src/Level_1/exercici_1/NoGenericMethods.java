package Level_1.exercici_1;

public class NoGenericMethods {
    private String name;
    private String surname;
    private String nickname;
    public NoGenericMethods(String name, String surname, String nickname) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NoGenericMethods [name=" + name + ", surname=" + surname + ", nickname=" + nickname + "]";
    }
}
