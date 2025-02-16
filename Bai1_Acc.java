import java.util.*;

class Account {
    private String id, customerId, username, password;
    
    public Account(String id, String customerId, String username, String password) {
        this.id = id;
        this.customerId = customerId;
        this.username = username;
        this.password = password;
    }

    public boolean checkLogin(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Bai1_Acc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Account> accounts = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String customerId = sc.nextLine();
            String username = sc.nextLine();
            String password = sc.nextLine();
            accounts.add(new Account(id, customerId, username, password));
        }
        int q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < q; i++){
            String username = sc.nextLine();
            String password = sc.nextLine();
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(accounts.get(j).checkLogin(username, password)){
                    check = true;
                    break;
                }
            }
            if(check){
                System.out.println("Login thanh cong");
            } else {
                System.out.println("Login that bai");
            }
        }
    }
}