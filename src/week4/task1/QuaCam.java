package Task1;

public class QuaCam extends HoaQua {
    protected String name;
    protected int cost;


    public QuaCam(String xuatxu, int cannang, String name, int cost) {
        super(xuatxu, cannang);
        this.name = name;
        this.cost = cost;
    }

    public QuaCam(String xuatxu, int cannang) {
        super(xuatxu, cannang);
    }

    @Override
    public void Print() {
        System.out.println("Ten:" + name + "\nGiatien: " + cost + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean Cunggiong(String a){
        return (name.equals(a));
    }


    public int Giabanle( int Soluong){
        if(Soluong < 100)
            return 5000;
        else
            return 10000;
    }


}
