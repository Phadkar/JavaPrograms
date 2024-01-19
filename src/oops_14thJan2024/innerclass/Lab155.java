package src.oops_14thJan2024.innerclass;

public class Lab155 {
    public static void main(String[] args) {
        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };
        s1.setId();
    }

}

abstract class B{
    int var=12;
}

interface Student{
    int id =12;
    void setId();
}


