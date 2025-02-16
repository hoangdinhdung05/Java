import java.util.ArrayList;
import java.util.Scanner;


    class Sinhvien {
    
    private String id, name, group, email;
 

    public Sinhvien(String id, String name, String group, String email) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.email = email;
    }
    
    
    
    public void xuat() {
        System.out.print(this.id + " " + this.name + " " + this.group + " " + this.email + "\n");
    }
    
    @Override 
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " " + this.email;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String group = sc.nextLine();
            String email = sc.nextLine();
            
            Sinhvien a = new Sinhvien(id, name, group, email);
            arr.add(a);
        }
        
        
        for(Sinhvien x : arr) {
            x.xuat();
        }
        
        
        sc.close();
    }
}
