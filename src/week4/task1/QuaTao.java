package week4.task1;

public class QuaTao extends HoaQua{
    protected String hinhdang;
    protected int soluongDu;

    public QuaTao(String xuatxu, int cannang, String hinhdang, int soluongDu) {
        super(xuatxu, cannang);
        this.hinhdang = hinhdang;
        this.soluongDu = soluongDu;
    }

    public QuaTao(String xuatxu, int cannang) {
        super(xuatxu, cannang);
    }

    @Override
    public void Print() {
        System.out.println("Hinh dang: " + hinhdang +"\nSo luong con du: "  +soluongDu + "\n");
    }

    public String getHinhdang() {
        return hinhdang;
    }

    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }

    public int getSoluongDu() {
        return soluongDu;
    }

    public void setSoluongDu(int soluongDu) {
        this.soluongDu = soluongDu;
    }



    public boolean xacdinh(String s){
        return (hinhdang.equals(s));
    }
    public void tonkho(int a){
        if(a > 100)
            System.out.println("Hang ton kho");
        else
            System.out.println("Binh thuong");
    }
}
