import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private static final int DEFAUT_CAP = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAUT_CAP];
    }
    private void ensureCap(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size==elements.length){
            ensureCap();
        }
        elements[size++] =e;
    }
    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
