package src;

public class Ex3 {
    private String name;
    private int age;
    public Ex3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }

}
