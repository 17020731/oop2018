package Task1;

public class HoaQua {
    private String Xuatxu;
    private int Cannang;

    public HoaQua(String xuatxu, int cannang) {
        Xuatxu = xuatxu;
        Cannang = cannang;
    }


    public String getXuatxu() {
        return Xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        Xuatxu = xuatxu;
    }

    public int getCannang() {
        return Cannang;
    }

    public void setCannang(String cannang) {
        Cannang = cannang;
    }

    public boolean Same(HoaQua a){
        return (Cannang == a.Cannang);
    }

    public boolean CheckXuatxu(){
        return (Xuatxu,equals("VietNam"));
    }

    public void Print(){
        System.out.println("Xuat xu: " + Xuatxu +"\nCan nang: " + Cannang + "\n");
    }
}
