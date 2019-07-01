package ucode.curs11;

import java.util.HashMap;
import java.util.Map;

enum Pets {
    DOG,
    CAT,
    HORSE
}

public class UsingMap {

    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<Object, Object>();
        m.put("k1", new Dog("aiko"));
        m.put("k2", Pets.DOG);
        m.put(Pets.CAT, "CAT key");
        Dog d1 = new Dog("clover");
        m.put(d1, "Dog key");
        m.put(d1, "Dog counter");
        m.put(new Cat(), "Cat key");
        System.out.println(m.get("k1"));
        String k2 = "k2";
        System.out.println(m.get(k2));
        Pets p = Pets.CAT;
        System.out.println(m.get(p));
        System.out.println(m.get(d1));
        System.out.println(m.get(new Cat()));
        System.out.println(m.size());


    }

}

class Dog {
    public String name;

    public Dog(String n) {
        name = n;
    }

    public boolean equals(Object o) {
        return (o instanceof Dog) &&
                (((Dog) o).name.equals(name));
    }

    public int hashCode() {
        return name.length();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

}

class Cat {
}