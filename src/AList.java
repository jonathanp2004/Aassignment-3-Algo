public class AList {

    int maxSize = 10;
    int size = 0;
    int pos = size;
    int[] arrayList = new int[maxSize];

    public AList(int maxSize, int size, int[] arrayList) {


    }

    void addy(Song p){

        pos = size +1;
        size++;
        if( size == maxSize){
            int[] newArray = new int[maxSize + 10];
            int j = 0;
            maxSize = newArray.length;
            for(int i =0; i < size; i++){

                newArray[j] = arrayList[i];
                j++;
            }
        }

    }
    void removy(int pos){

    }
}
