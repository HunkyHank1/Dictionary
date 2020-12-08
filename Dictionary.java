import java.util.ArrayList;
import java.util.Collection;

public class Dictionary<T, E> {
    ArrayList<T> definitions;
    ArrayList<E> dictionary;
    public Dictionary(){
        definitions = new ArrayList<>();
        dictionary = new ArrayList<>();
    }
    //add an key-value pair to the dictionary
    void put(E key, T value){
        definitions.add(value);
        dictionary.add(key);
    }

    //get the value associated with a given key
    public T get(E key){
        return definitions.get(dictionary.indexOf(key));
    }

    //remove a key-value pair and return its value
    public T remove(E key){
        int index = dictionary.indexOf(key);
        dictionary.remove(index);
        return definitions.remove(index);
    }

    //returns true if the given key has an associated value
    public boolean contains(E key){
       return !(get(key)==null);
    }

    //returns true if the dictionary is empty
    public boolean isEmpty(){
        return !(dictionary.size()>0);
    }

    //returns the number of key-value pairs in the dictionary
    public int size(){
        return dictionary.size();
    }

    //returns a Collection¹ of keys
    /*public Collection<E> keys(){

    }

    //returns a Collection of values
    public Collection<T> values(){

    }*/

}
