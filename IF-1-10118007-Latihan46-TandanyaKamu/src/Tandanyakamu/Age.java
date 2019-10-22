package Tandanyakamu;

public class Age {
    
    private int yearBirth;
    private int yearNow;
    private String red = "\33[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    


    public int getYearBirth(int nextInt) {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {

        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu (int umur){
        String tandanya = null;
        
        if ((0<=umur)&&(umur<=5)){
                tandanya = (red+"LAGI LUCU-LUCU NYA");
        }else if ((5<umur)&&(umur<=10)){
                tandanya = (red+"MASIH ANAK-ANAK");
        }else if ((10<umur)&&(umur<=13)){
                tandanya = (red+"MASIH REMADJA");
        }else if ((13<umur)&&(umur<=19)){
                tandanya = (red+"ALAY");
        }else if ((19<umur)&&(umur<=29)){
                tandanya = (red+"LAGI GALAU NYARI JODOH");
        }else if ((29<umur)&&(umur<=35)){
                tandanya = (red+"LAGI SIBUK NYARI UANG");
        }else if ((35<umur)&&(umur<=150)){
                tandanya = (red+"SUDAH TUA");
        }else if ((0>umur)|(umur>150)){
                tandanya = (red+"TIDAK TERDETEKSI DI KEHIDUPAN");
        }
        return tandanya;
    }
    
}
