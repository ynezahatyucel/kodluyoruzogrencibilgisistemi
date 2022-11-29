public class Sinif {
    Ogretmen ogretmen;
    String isim;
    String kod;
    String prefix;
    int note;
    int verbalNote;


    Sinif(String isim,String kod,String prefix){

        this.isim=isim;
        this.kod=kod;
        this.prefix=prefix;
        this.note=0;
        this.verbalNote=0;

    }
    void addOgretmen(Ogretmen ogretmen){
        if (ogretmen.brans.equals(this.prefix)){
            this.ogretmen=ogretmen;
        }else {
            System.out.println("Branş ile öğretmen uyuşmamaktadır");
        }


    }

}
