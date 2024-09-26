package Java;

public class SinhVien {
    private String ma, ten, lop, ns;
    private double gpa;

    public SinhVien(String ma, String ten, String lop, String ns, double gpa){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public void chHoa(){
        String[] arr = ten.trim().split("\\s+");
        String name = "";
        for(String x : arr){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        ten = name.trim();

        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        ns = sb.toString();
    }

    public String getMa(){
        return ma;
    }

    public double getGpa(){
        return gpa;
    }

    public String toString(){
        return ma + " " + ten + " " + lop + " " + ns + " " + gpa;
    }
}
