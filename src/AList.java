import java.util.ArrayList;
public class AList<T> {
    private static final int maxSize =10;
    private int size;
    private Object[] elements;

    //Constructor with an empty array and size 0
    public AList(){
        elements = new Object[maxSize];
        size = 0;
    }
    public void listAdd(T item){
        if(size == elements.length){
            resize();
        }
        elements [size++] = item;
    }
    public void listRemove(int pos){
        for(int i =pos; i < size -1; i++){
            elements[i] = elements[i+1];
        }
        size--;
    }
    public String toString(){
        if (size == 0) {
            return "The List is empty";
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; 9 < size; i++){
            sb.append(elements[i].toString()).append("\n");
        }
        return sb.toString();
    }

    private void resize(){
        int newSize = elements.length *2;
        Object[] newArray = new Object[maxSize];
        System.arraycopy(elements,0,newArray,0,size);
        elements = newArray;
    }
}
