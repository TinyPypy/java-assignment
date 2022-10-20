public class SumEven{
    public static int thesum(){
        int sumofnumbers = 0;
        for (int i = 13; i < 103; i++){
            if( i%2 == 0){
               sumofnumbers = sumofnumbers + i;     
                
            }
        }
        return sumofnumbers;
    }
}