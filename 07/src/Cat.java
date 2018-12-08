public class Cat {
    private String name;
    private int age;


    public Cat(){

    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;


    }
}
