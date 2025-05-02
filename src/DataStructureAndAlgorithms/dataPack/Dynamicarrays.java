package DataStructureAndAlgorithms.dataPack;

import java.util.ArrayList;

public class Dynamicarrays {
    //Dynamic array is array that can grow or shrink its size on run time unlike the static array
    //static-array is array that set fixed value of its size.

    /** Key Features of ArrayList (Dynamic Array):
    Grows automatically as elements are added.

    Allows random access using an index (list.get(index)).

    Can store duplicate elements.

    Maintains insertion order.*/


    int size;
    int capacity = 10;
    Object[] array;
    public Dynamicarrays(){
        this.array = new Object[capacity];
    }
    public Dynamicarrays(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if (size>= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){
        if(size>= capacity){
            grow();
        }
        for (int i = size; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
    }
    public void delete(Object data){
        for (int i = 0; i<size; i++){
            if (array[i] == data){
                for (int j = 0; j< (size-i-1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size<=(int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        return -1;
    }
    private void grow(){

    }
    private void shrink(){

    }
    public boolean isEmpty(){
        return size==0;
    }
    public String toString(){
        String string = "";
        for (int i = 0; i<size; i++){
            string+=array[i] + ",";
        }
        if(string!=""){
            string = "[" + string.substring(0, string.length() -1) + "]";
        }else {
            string = "[]";
        }
        return string;
    }
    public static void main(String[] args) {
        //Dynamic array =
        ArrayList<String> arrayList = new ArrayList<String>();
        Dynamicarrays dynamicarrays = new Dynamicarrays();
        dynamicarrays.add("A");
        dynamicarrays.add("B");
        dynamicarrays.add("C");

        dynamicarrays.insert(0,"X");
        //dynamicarrays.delete("A");
        System.out.println(dynamicarrays);
        System.out.println("size "+dynamicarrays.size);
        System.out.println("capacity "+dynamicarrays.capacity);
        System.out.println("empty: "+dynamicarrays.isEmpty());

    }
}
