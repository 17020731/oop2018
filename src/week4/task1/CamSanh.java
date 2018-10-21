package week4.task1;

public class CamSanh extends QuaCam{
    private String Noisanxuat, Noinhapkhau;


    public CamSanh(String xuatxu, int cannang, String name, int cost, String noisanxuat, String noinhapkhau) {
        super(xuatxu, cannang, name, cost);
        Noisanxuat = noisanxuat;
        Noinhapkhau = noinhapkhau;
    }

    public CamSanh(String xuatxu, int cannang, String noisanxuat, String noinhapkhau) {
        super(xuatxu, cannang);
        Noisanxuat = noisanxuat;
        Noinhapkhau = noinhapkhau;
    }

    public String getNoisanxuat() {
        return Noisanxuat;
    }

    public void setNoisanxuat(String noisanxuat) {
        Noisanxuat = noisanxuat;
    }

    public String getNoinhapkhau() {
        return Noinhapkhau;
    }

    public void setNoinhapkhau(String noinhapkhau) {
        Noinhapkhau = noinhapkhau;
    }

    public boolean cungxuatxu(String s){
        return (Noisanxuat.equals(s));
    }

    public boolean xuatkhau(String s){
        return (Noinhapkhau.equals(s));
    }

    @Override
    public void Print() {
        System.out.println("Xuat xu: " + Noisanxuat +"\nNoi nhap khau: " + Noinhapkhau + "\n");
    }
}
