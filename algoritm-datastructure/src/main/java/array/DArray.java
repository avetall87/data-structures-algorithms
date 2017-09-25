package array;


import java.util.Arrays;

public class DArray<T> {
    private int size;
    private Object[] arr;

    public DArray(int initialSize){
        if (initialSize>0)
            arr = new Object[initialSize];
        else
           arr = new Object[]{};
    }

    public void add(T value){
        if(needIncrease()){
            grow();
        }
        arr[size]=value;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)arr[index];
    }

    public int size(){
        return size;
    }

    private void grow(){
        int oldArrCapacity = size;
        arr = Arrays.copyOf(arr,oldArrCapacity<<1);
    }

    private boolean needIncrease(){
        return (size+1>=arr.length-1);
    }


}
