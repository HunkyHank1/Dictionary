/*
Henry johnson
the function of this program is to create an array of different keys and definitions to later be used as a dictionary
created: 12/8/20
last edited: 12/9/20
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
    public Collection<E> keys(){
        Collection<E> dict = new Collection<E>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<E> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(E e) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends E> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        dict.add((E) dictionary);
        return dict;
    }

    //returns a Collection of values
    public Collection<T> values(){
        Collection<T> def = new Collection<T>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<T> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T1> T1[] toArray(T1[] a) {
                return null;
            }

            @Override
            public boolean add(T t) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends T> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        def.add((T) definitions);
        return def;
    }

}
