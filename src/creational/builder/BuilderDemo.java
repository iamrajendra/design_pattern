package creational.builder;

public class BuilderDemo {
    private static Student student;

    public static void main(String args[]) {
        student = Student.Builder.newInstance()
                .setId(2)
                .setName("Shyam")
                .setAddress("Delhi")
                .build();
        System.out.println(student);
    }
}
