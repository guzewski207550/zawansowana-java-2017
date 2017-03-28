package pl.lodz.p.edu.ftims.singly;

public class SinglyLinked<E> implements SinglyLinkedService<E> {

    private Node<E> headElement = null;

    int size = 0;


    @Override
    public void addElement(E content) {
        if (headElement == null) {
            headElement = new Node<E>(null, content);
        } else {
            Node<E> lastElement = headElement;

            while (lastElement.hasNextElement()) {
                lastElement = lastElement.getNextElement();
            }

            lastElement.setNextElement(new Node<E>(null, content));
        }

        size++;
    }


    @Override
    public E getElement(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node<E> result = headElement;
        for (int i = 0; i < index; ++i) {
            result = result.getNextElement();
        }

        return result.getNodeContent();
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public int getListSize() {
        return size;
    }


    @Override
    public void clearList() {
        headElement = null;
        size = 0;
    }

}
