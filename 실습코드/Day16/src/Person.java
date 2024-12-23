public class Person {
    String name;
    int age;

    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person tmp = (Person)obj;
            return name.equals(tmp.name) && age == tmp.age;
        }

        return false;
    }

    public int hashCode() {
        return (name + age).hashCode();
    }

    public String toString() {
        return name + ":" + age;
    }
}
