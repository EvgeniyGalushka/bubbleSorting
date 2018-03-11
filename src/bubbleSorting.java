public class bubbleSorting
{
    public static void main(String args[]){
       Integer[] array = {4, 17, 22, -23, 99, -994, 0, 1, 234, 2, 6, 97};
       for(int i = 0; i < array.length; i++){
           int num = array[i];
           for(int j = i - 1; j >= 0; j--){
               int leftNumber = array[j];
               if(num < leftNumber ){
                   array[j + 1] = leftNumber;
                array[j] = num;
               }else{
                   break;
                   }
           }
       }
       for(Integer n : array){
           System.out.println(n + ",");
       }
    }
}
