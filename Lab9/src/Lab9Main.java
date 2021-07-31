public class Lab9Main {


    public static void main(String[] args) {

        Lab9Tree johnjrTree;

        johnjrTree = new Lab9Tree("John Ewing Rager Jr.");


        // throw away the result, we aren't adding to it

        Lab9Tree johnTree = johnjrTree.addFather("John Ewing Rager");

        Lab9Tree charlesTree = johnTree.addFather("Charles Edward Rager");

        Lab9Tree jamesTree = charlesTree.addFather("James William Rager");

        Lab9Tree maidaTree = johnjrTree.addMother("Maida Williams");

        Lab9Tree sarahTree = maidaTree.addMother("Sarah Ida Cain");

        Lab9Tree johnmTree = sarahTree.addFather("John Madison Cain");

        johnmTree.addMother("Margaret Sleeth");

        johnjrTree.print();

        //Lab9TreeHelp.print(johnjrTree);


    }

}

