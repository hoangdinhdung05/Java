package Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test_SV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien[] a = new SinhVien[n];
        for(int i = 0; i < n; i++){
            String ma = String.format("%03d", i+1);
            ma = "Sv" + ma;
            sc.nextLine();
            a[i] = new SinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a[i].chHoa();
        }
        Arrays.sort(a, new Comparator<SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                if(a.getGpa() != b.getGpa()){
                    if(a.getGpa() > b.getGpa()){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
                else{
                    return a.getMa().compareTo(b.getMa());
                }
            }
        });

        for(SinhVien x : a){
            System.out.println(x);
        }
    }
}
