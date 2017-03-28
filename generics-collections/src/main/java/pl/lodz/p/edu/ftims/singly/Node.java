package pl.lodz.p.edu.ftims.singly;

public class Node<E> {

    private Node<E> nextElement = null;

    private E nodeContent;


    public Node(Node<E> nextElement, E nodeContent) {
        this.nextElement = nextElement;
        this.setNodeContent(nodeContent);
    }


    public Node(E nodeContent) {
        this.setNodeContent(nodeContent);
    }


    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }


    public Node<E> getNextElement() {
        return nextElement;
    }


    public boolean hasNextElement() {
        return nextElement != null;
    }


    public E getNodeContent() {
        return nodeContent;
    }


    public void setNodeContent(E nodeContent) {
        this.nodeContent = nodeContent;
    }
}
