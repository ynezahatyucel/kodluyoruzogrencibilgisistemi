public class Ogrenci {
    Sinif c1;
    Sinif c2;
    Sinif c3;
    String Adi;
    String OgrNo;
    int sinif;
    double ortalama;
    boolean isgecti;

    Ogrenci(String adi, String ogrNo, int sinif,Sinif c1,Sinif c2,Sinif c3){
        this.Adi=adi;
        this.OgrNo=ogrNo;
        this.sinif=sinif;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.ortalama=0;
        this.isgecti=false;

    }
    void addbulkexamNote(int not1,int not2,int not3){
        if (not1>=0&&not1<=100){
            this.c1.note=not1;
        }
        if (not2>=0&&not2<=100) {

            this.c2.note = not2;
        }
        if (not3>=0&&not3<=100) {
           this.c3.note = not3;
        }
    }
    void addbulverbalNote(int verbal1, int verbal2, int verbal3) {
        if (0 <= verbal1 && verbal1 <= 100) {
            this.c1.verbalNote = verbal1;
        }
        if (0 <= verbal2 && verbal2 <= 100) {
            this.c2.verbalNote = verbal2;
        }
        if (0 <= verbal3 && verbal3 <= 100) {
            this.c3.verbalNote = verbal3;
        }
    }
        void isgecti(){
            double c1average=this.c1.note*0.8+this.c1.verbalNote*0.2;
            double c2average=this.c2.note*0.8+this.c2.verbalNote*0.2;
            double c3average=this.c3.note*0.8+this.c3.verbalNote*0.2;
            this.ortalama = (c1average + c2average + c3average) / 3;

            if (this.ortalama>55){
                System.out.println("==================");
                System.out.println("Sınıfı başarılı bir şekilde geçtiniz");
            isgecti=true;
            }else {
            System.out.println("Sınıfta kaldınız !!");
            isgecti=false;
            }
            printnote();
    }
    void printnote(){
        System.out.println("Öğrenci: " + this.Adi);
        System.out.println("Tarih notu: " +this.c1.note);
        System.out.println("Tarih sözlü notu: " +this.c1.verbalNote);
        System.out.println("Fizik notu: " + this.c2.note);
        System.out.println("Fizik sözlü notu: " +this.c2.verbalNote);
        System.out.println("Kimya notu: " + this.c3.note);
        System.out.println("Kimya sözlü notu: " +this.c3.verbalNote);
        System.out.println("Not Ortalamanız: "+ this.ortalama);

    }

}
