import java.util.ArrayList;

public class ListUsr<T> {
    private ArrayList<T> arrayList;
    private ListUserListener listener;

    public ListUsr(ArrayList<T> arrayList, ListUserListener listener) {
        this.arrayList = arrayList;
        this.listener = listener;
    }

    public ListUsr(ListUserListener listener) {
        this.listener = listener;
        this.arrayList = new ArrayList<>();
    }

    public void add(T o) {
        arrayList.add(o);
        listener.changed();
    }

    public void add(int index, T o) {
        arrayList.add(index, o);
        listener.changed();
    }

    public T get(int index) {
        return arrayList.get(index);
    }

    public int size(){
        return arrayList.size();
    }
}
