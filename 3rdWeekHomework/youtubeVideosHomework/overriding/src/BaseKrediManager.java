public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;

        //Öğrenci kredisinde başka bir oran belirleyerek bu değeri görmezden geldik. Eğer hiçbir şeyin bu değeri ezmemesini
        //isritiyor isek public double yazan kısmın arasına (public final double) final yazarak bunu yapabiliriz.
    }
}
