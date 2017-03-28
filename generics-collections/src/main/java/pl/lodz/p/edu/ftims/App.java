package pl.lodz.p.edu.ftims;

import pl.lodz.p.edu.ftims.singly.ComplexStep;
import pl.lodz.p.edu.ftims.singly.SimpleStep;
import pl.lodz.p.edu.ftims.singly.SinglyLinked;
import pl.lodz.p.edu.ftims.singly.SinglyLinkedService;
import pl.lodz.p.edu.ftims.singly.Step;

public class App {

    public static void main(String[] args) {
        SinglyLinked<Step> stepList = new SinglyLinked<>();
        SinglyLinked<SimpleStep> simpleStepList = new SinglyLinked<>();
        SinglyLinked<ComplexStep> complexStepList = new SinglyLinked<>();

        Step step1 = new Step();
        step1.setDescription("Step 1 description");

        SimpleStep simpleStep1 = new SimpleStep();
        simpleStep1.setDescription("Simple step 1 description");
        SimpleStep simpleStep2 = new SimpleStep();
        simpleStep2.setDescription("Simple step 2 description");

        ComplexStep complexStep1 = new ComplexStep();
        complexStep1.setDescription("Complex step 1 description");

        stepList.addElement(step1);

        simpleStepList.addElement(simpleStep1);
        simpleStepList.addElement(simpleStep2);

        complexStepList.addElement(complexStep1);

        printAllListElements(simpleStepList);
        printListElementFromIndex(simpleStepList, 1);
    }


    private static <T> void copyList(SinglyLinked<? extends Step> source, SinglyLinked<? super Step> destination) {

    }


    private static void printListElementFromIndex(SinglyLinked<? extends Step> list, int index) {
        System.out.println(list.getElement(index).getDescription());
    }


    private static void printAllListElements(SinglyLinked<? extends Step> list) {
        for (int i = 0; i < list.getListSize(); ++i) {
            System.out.println(list.getElement(i).getDescription());
        }
    }

}
