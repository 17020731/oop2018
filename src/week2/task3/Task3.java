package week2.task3;

public class Task3 {

}

class Facebook {
    private  String name, address, id, pass;
    public Facebook( String n, String add, String sid){
        name = n;
        address = add;
        id = sid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //Phuong thuc
    public boolean Nhappass(Facebook other){
        return (id == other.id && pass == other.pass);
    }
    public void print(){
        System.out.println("Dia chi hien tai: " + address);
    }
    public void Doipass(Facebook other){
        pass = other.pass;
    }
}

class Birth {
    private  int day, month, year;
    public Birth(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    //Phuong thuc
    public boolean sameAge(Birth other){
        return true;
    }
    public int Age(){
        return 2018-year;
    }
    public void Print(){
        System.out.println("Ngay thang nam sinh: " + day +"/"+month+"/"+year);
    }

}

class Pen {
    private int size, price;
    private String type;
    //getter and setter
    public int getprice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }
    //Phuong thuc
    public int Soluong(int price_){
        return price_/price;
    }
    public void Print(){
        System.out.println("Type: "+type+" Size: "+size+" Price: " + price);
    }
    public boolean comp(Pen other){
        return (type == other.type);
    }
}


