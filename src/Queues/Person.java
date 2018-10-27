package Queues;

public class Person {

    private String name;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Person(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            boolean isEqualName = name.equals(((Person) obj).getName());
            boolean isEqualSex = sex == ((Person) obj).getSex();
            return isEqualName && isEqualSex;
        }else {
            return false;
        }
    }
}
