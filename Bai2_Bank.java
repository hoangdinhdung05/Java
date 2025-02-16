import java.util.*;

class Account {
    private String id, customerID, soTaiKhoan, PIN;
    private double soDu;

    public Account(String id, String customerID, String soTaiKhoan, String PIN, double soDu) {
        this.id = id;
        this.customerID = customerID;
        this.soTaiKhoan = soTaiKhoan;
        this.PIN = PIN;
        this.soDu = soDu;
    }

    public void deposit(int tien) {
        this.soDu += tien;
    }

    public void withdraw(int tien) {
        if(this.soDu - 50000 >= tien) {
            this.soDu -= tien;
        }
    }

    public double getSoDu() {
        return this.soDu;
    }

    public static int findPos(Account[] acc, String soTaiKhoan) {
        for(int i = 0; i < acc.length; i++) {
            if(acc[i].soTaiKhoan.equals(soTaiKhoan)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return "ID :" + this.id + "\n" + "Customer ID: " + this.customerID + "\n" + "So tai khoan: " + this.soTaiKhoan + "\n" + "PIN: " + this.PIN + "\n" + "So du: " + this.soDu;
    }

}

public class Bai2_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Account[] acc = new Account[n];
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String customerID = sc.nextLine();
            String soTaiKhoan = sc.nextLine();
            String PIN = sc.nextLine();
            double soDu = sc.nextDouble();
            sc.nextLine();
            acc[i] = new Account(id, customerID, soTaiKhoan, PIN, soDu);
        }

        int q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < q; i++){
            String tran = sc.nextLine();
            if(tran.equals("deposit")) {
                String soTaiKhoan = sc.nextLine();
                int tien = sc.nextInt();
                sc.nextLine();
                int pos = Account.findPos(acc, soTaiKhoan);
                acc[pos].deposit(tien);
            } else if(tran.equals("withdraw")) {
                String soTaiKhoan = sc.nextLine();
                int tien = sc.nextInt();
                sc.nextLine();
                int pos = Account.findPos(acc, soTaiKhoan);
                acc[pos].withdraw(tien);
            } else {
                String X = sc.next();
                String Y = sc.next();
                int tien = sc.nextInt();
                int pos1 = Account.findPos(acc, X);
                int pos2 = Account.findPos(acc, Y);
                if(acc[pos1].getSoDu() - 50000 >= tien) {
                    acc[pos1].withdraw(tien);
                    acc[pos2].deposit(tien);
                }
            }
        }
        for(Account a : acc) {
            System.out.println(a);
        }

        sc.close();
    }
}
