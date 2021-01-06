package Singelton;

public class TheGoverment {

    private static TheGoverment theGoverment;

    private TheGoverment(){
        String StefanLöven;
        String IssabellaLövin;
    }

    public static TheGoverment getGoverment(){
        if( theGoverment == null)
            theGoverment = new TheGoverment();
        return theGoverment;
    }
}
