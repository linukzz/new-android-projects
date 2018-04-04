package bear.coding.ex06_08;

import java.io.Serializable;

/**
 * Created by 이민석 on 2018-01-29.
 */

public class Person implements Serializable {

    String name;
    int age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
