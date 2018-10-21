package week4.task1;

public class CamCaoPhong extends QuaCam{
    private String mau;
    private int soluong;


    public CamCaoPhong(String xuatxu, int cannang, String name, int cost, String mau, int soluong) {
        super(xuatxu, cannang, name, cost);
        this.mau = mau;
        this.soluong = soluong;
    }

    public CamCaoPhong(String xuatxu, int cannang, String name, int cost) {
        super(xuatxu, cannang, name, cost);
    }

    public CamCaoPhong(String xuatxu, int cannang) {
        super(xuatxu, cannang);
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public boolean color(String s){
        return (mau.equals(s));
    }
    public void out(){
        if(soluong > 1000)
            System.out.println("Doan xem!!");
        else
            System.out.println("Ngon");
    }

    @Override
    public void Print() {
        System.out.println("Mau sac: " + mau +"\nSo luong: " + soluong + "\n");
    }
}
