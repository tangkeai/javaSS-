class Money implements Cloneable{
    public double money = 12.31;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public String name = "bit";
    public Money m = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        //person.m = (Money)person.m.clone();
        person.m = (Money) this.m.clone();
        return person;
    }
}
public class Clonable接口 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person) person.clone();
        /*System.out.println(person.name);
        System.out.println(person2.name);
        System.out.println("============");
        person2.name = "hello";
        System.out.println(person.name);
        System.out.println(person2.name); */
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("============");
        person2.m.money = 99.99;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
}
