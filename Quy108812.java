package vonguyenngocquy;

public class Quy108812 {
    
}

class Student {
    // Thuộc tính của sinh viên
    private String studentID;
    private String fullName;
    private String birthDate;
    private int age;
    private String gender;
    private String studentClass;
    private String department;
    private String address;

    // Constructor để khởi tạo đối tượng sinh viên
    public Student(String studentID, String fullName, String birthDate, int age, String gender, String studentClass, String department, String address) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.age = age;
        this.gender = gender;
        this.studentClass = studentClass;
        this.department = department;
        this.address = address;
    }

    // Phương thức để hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("Mã sinh viên: " + studentID);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Lớp: " + studentClass);
        System.out.println("Khoa: " + department);
        System.out.println("Địa chỉ: " + address);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng sinh viên với thông tin cụ thể
        Student student = new Student("108812", "Võ Nguyễn Ngọc Quy", "31/10/2006", 18, "Nam", "IT24B", "Công nghệ thông tin", "Đà Nẵng");
        
        // Hiển thị thông tin sinh viên
        student.displayInfo();
    }
}