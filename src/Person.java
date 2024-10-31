public class Person {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name -> " + this.name + "\nSurname -> " + this.surname + "\nAge -> " + age);
    }
}