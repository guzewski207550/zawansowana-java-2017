package pl.lodz.p.edu.ftims;

import pl.lodz.p.edu.ftims.singly.SinglyLinked;
import pl.lodz.p.edu.ftims.singly.SinglyLinkedService;

public class App {

    public static void main(String[] args) {
        SinglyLinkedService<Integer> intList = new SinglyLinked<>();

        intList.addElement(1);
        intList.addElement(12);
        intList.addElement(9);

        System.out.println(intList.getListSize());

        System.out.println(intList.getElement(0));
        System.out.println(intList.getElement(1));
        System.out.println(intList.getElement(2));
        System.out.println(intList.getElement(3));
    }
}
