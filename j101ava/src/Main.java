public class Main {
    public static void main(String[] args) {
        Sinif mat=new Sinif("matematik","m101" ,"mat");
        Sinif tarih=new Sinif("tarih","t102","trh");
        Sinif fizik=new Sinif("fizik","f103","fzk");

        Ogretmen o1=new Ogretmen("Yener Arslan","555","mat");
        Ogretmen o2=new Ogretmen("Mehmet Yaman","111","trh");
        Ogretmen o3=new Ogretmen("Şirin Ay","000","fzk");

        mat.addOgretmen(o1);
        fizik.addOgretmen(o3);
        tarih.addOgretmen(o2);

        Ogrenci s1=new Ogrenci("yesim yucel", "125",1,tarih,fizik,mat);
        s1.addbulkexamNote(50,60,70);
        s1.addbulverbalNote(50,60,70);
        s1.isgecti();
        Ogrenci s2=new Ogrenci("Ayaz ayaz","124",2,tarih,fizik,mat);
        s2.addbulkexamNote(45,55,50);
        s2.addbulverbalNote(66,60,85);
        s2.isgecti();

    }

    }
