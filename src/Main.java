public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2};

        int min = array[0];
        int max = Integer.MIN_VALUE;

        for(int i=1;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            } else if (array[i]>max && array[i]>min) {
                max=array[i];
            }
        }

        System.out.println(max-min);
    }
}