package Java;

import java.util.*;

public class test_oop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien s = new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        s.chNs();
        s.chNk();
        s.chTen();
        System.out.println(s);
    }
}
