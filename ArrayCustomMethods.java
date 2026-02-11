public class ArrayCustomMethods<T> {

    private T[] arr;
    private int size = 0;
    
    public ArrayCustomMethods() {
      
        arr = (T[]) new Object[1];
    }

    public int size() {
        return size;
    }

   
    private void incrementArray() {
        T[] newArr = (T[]) new Object[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public T getEle(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return arr[index];
    }

    public void customPush(T ele) {
        if(size == arr.length) incrementArray(); 
        arr[size++] = ele;
    }

    public void add(int idx, T ele) {
        if(idx < 0 || idx > size){
            throw new IndexOutOfBoundsException("Index: " + idx);
        }

        if(size == arr.length) incrementArray();

      
        for(int i = size; i > idx; i--){
            arr[i] = arr[i - 1];
        }

        arr[idx] = ele;
        size++;
    }

    public void delete(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index);
        }

       
        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = null; 
        size--;
    } 
   
    public void print() {
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     
        ArrayCustomMethods<Integer> n = new ArrayCustomMethods<>();

        n.customPush(10);
        n.customPush(20);
        n.customPush(30);
       // n.customPush("hi");

        

        n.add(1, 99);   
        n.delete(2);    

        n.print();
        System.out.println("Size = " + n.size());
    }
}
