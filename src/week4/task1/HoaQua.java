package Task1;

public class HoaQua {
    protected String Doanhnghiep;
    protected int Cannang;

    public HoaQua(String Doanhnghiep, int cannang) {
        Doanhnghiep = Doanhnghiep;
        Cannang = cannang;
    }


    public String getDoanhnghiep() {
        return Doanhnghiep;
    }

    public void setDoanhnghiep(String Doanhnghiep) {
        Doanhnghiep = Doanhnghiep;
    }

    public int getCannang() {
        return Cannang;
    }

    public void setCannang(int cannang) {
        Cannang = cannang;
    }

    public boolean Same(HoaQua a){
        return (Cannang == a.Cannang);
    }

    public boolean CheckDoanhnghiep(){
        return (Doanhnghiep.equals("VietNam"));
    }

    public void Print(){
        System.out.println("Xuat xu: " + Doanhnghiep +"\nCan nang: " + Cannang + "\n");
    }
}
