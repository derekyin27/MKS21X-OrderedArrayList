public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public int getIndex(T value){
    for (int i = 0; i < this.size();i++){
      if (value.compareTo(this.get(i)) <= 0)
      return i;
    }
    return this.size();
  }
  public boolean add(T element){
    super.add(getIndex(element), element);
    return true;
  }
//  public void add(int index, T element){

//  }
  public T set(int index, T element){
this.remove(index);
this.add(element);
return element;
  }
}
