public class Ogretmen {
    String isim;
    String mpno;
    String brans;

    Ogretmen(String isim,String mpno,String brans){
        this.isim=isim;
        this.mpno=mpno;
        this.brans=brans;
    }

    void print(){
        System.out.println("Adı :"+ this.isim);
        System.out.println("Telefon no:"+ this.mpno);
        System.out.println("Branşı :"+ this.brans);
    }

}
