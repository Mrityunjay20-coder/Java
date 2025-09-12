package OOPSinJAVA;

public class Studentclass {
    String name;
    int rno;
    double percent;
    final String collegename="BPPIMT";//once set cannot be changed later
    //constructor
    public Studentclass(String name,int rno,double percent){
        this.name=name;
        this.rno=rno;
        this.percent=percent;
    }
    public int getRno(){ //getter
        return rno;
    }

    public void setRno(int rno) { //setter
        this.rno = rno;
    }
}
