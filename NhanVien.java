package Java;

public class NhanVien {
    private String ma, ten, gt, ns, dc;
    private String mst;
    private String nk;

    public NhanVien(String ma, String ten, String gt, String ns, String dc, String mst, String nk){
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nk = nk;
    }

    public void chTen(){
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
    }

    public void chNs(){
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        ns = sb.toString();
    }

    public void chNk(){
        StringBuilder sb = new StringBuilder(nk);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        nk = sb.toString();
    }

    public String toString(){
        return ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + nk;
    }
}
