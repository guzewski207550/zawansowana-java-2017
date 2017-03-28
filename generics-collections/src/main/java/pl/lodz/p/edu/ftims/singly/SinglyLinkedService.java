package pl.lodz.p.edu.ftims.singly;

public interface SinglyLinkedService<E> {

    public void addElement(E content);


    public E getElement(int index);


    public boolean isEmpty();


    public int getListSize();


    public void clearList();
}
