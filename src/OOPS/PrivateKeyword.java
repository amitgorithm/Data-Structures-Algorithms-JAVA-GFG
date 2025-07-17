package OOPS;
class Students {
    String name; //default value null
    private int rno;
    double cgpa;
    void print(){ // getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
//    public void p(){
//        print();
//    }
    int getRno(){
        return rno;
    }
    void setRno(int x){ // setter for private attributes generally
        rno = x;
    }
}

public class PrivateKeyword {


    public static void main(String[] args) {
        Students s1 = new Students();

        s1.print();
        s1.name = "Hemant";
        s1.cgpa = 8.9;
        s1.print();
        System.out.println(s1.getRno());
        s1.setRno(45);
        System.out.println(s1.getRno());

    }
}
