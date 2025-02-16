import java.util.*;


class sinhvien {
    private String id, name, group, email;

    public sinhvien(String id, String name, String group, String email) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getGroup() {
        return this.group;
    }

    public String setName(String n) {
        return this.name = n;
    }


    public boolean checkGroup(String group) {
        if(this.group.equals(group)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " " + this.email;
    }
}



public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sinhvien a = new sinhvien("1", "Dung", "HT22", "hoangdung22@gmail.com");
        sinhvien b = new sinhvien("1", "Dung", "HT22", "hoangdung22@gmail.com");

        System.out.println("Danh sach sinh vien: ");
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        System.out.println("Vui long nhap ten can thay doi");
        String n = sc.nextLine();
        a.setName(n);

        System.out.println("Thong tin sinh vien sau khi thay doi: ");
        System.out.println(a);

        System.out.println("Kiểm tra cùng lớp: ");

        if(a.checkGroup(b.getGroup())) {
            System.out.println("Cùng lớp");
        } else {
            System.out.println("Khác lớp");
        }
        sc.close();
    }
}
