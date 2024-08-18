public class InsertionSort{
    public static void insertionSort(int num[]){
        for(int i=1;i<num.length;i++){
            int currentPosition = num[i];
            int previousPosition = i-1;
            while(previousPosition>=0 && num[previousPosition]>currentPosition){
                num[previousPosition+1] = num[previousPosition];
                previousPosition--;
            }
            num[previousPosition+1] = currentPosition;
        }
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
    }
    public static void main(String[] args) {
        int [] num = {6,8,9,2,4};
        insertionSort(num);
    }
}