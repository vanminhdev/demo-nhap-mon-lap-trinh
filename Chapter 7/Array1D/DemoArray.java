/**
 * DemoArray
 */
public class DemoArray {

    public static void main(String[] args) {
        Student student1 = new Student(); //khởi tạo đối tượng qua hàm khởi tạo mặc định
        //System.out.printf("%4s - %5d\n", student1.getName(), student1.getAge()); //null 0

        Student[] students = new Student[100];
        for (int i = 0; i < 100; i++)
        {
            students[i] = new Student("A", 1);
        }

        students[0].setName("B");
        students[0].setAge(2);

        for (int i = 0; i < 100; i++)
        {
            //nếu như không khởi tạo từng đối tượng trong mảng sẽ sinh ra ngoại lệ khi gọi các hàm get
            System.out.printf("%4s - %5d\n", students[i].getName(), students[i].getAge());
        }
    }
}