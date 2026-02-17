import java.util.Arrays;

public class AList<T> {

    int maxSize = 10;
    int size = 0;
    T[] arrayList = (T[]) new Object[maxSize];

    public AList() {
    }

    //adds song to list
    public void addy(T p) {

        if (size == maxSize) {
            T[] newArray = (T[])new Object[maxSize + 10];
            int j = 0;
            maxSize = newArray.length;
            for (int i = 0; i < size; i++) {
                newArray[j] = arrayList[i];
                j++;

            }
            arrayList = newArray;
        }
        arrayList[size] = p;
        size++;
    }
        public void removy(int pos){
        //int i = pos + 1;
        for( int i = pos; i < size-1 ; i++ ){
            arrayList[i] = arrayList[i +1];
           // arrayList[i + 1] = arrayList[i + 2]; only necessary to move one element
            }
        size = size - 1;
        // can also do size--;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(size == 0){
            return new String("Empty List");
        }

        for (int i = 0; i < size; i++) {

          sb.append(arrayList[i] + "\n");

        }
        return sb.toString();

    }
}

