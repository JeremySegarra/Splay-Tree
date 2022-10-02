package WebCrawler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class splayTree
{
    public static void main(String[] args) throws IOException
    {

        Scanner in = new Scanner(new File("C:\\Users\\Jeremy\\OneDrive\\Desktop\\Algorithms\\WebCrawler\\splay.dat"));
        Scanner input = new Scanner(System.in);
        BTNode<Integer> root = null;
        BTNode<Integer> currentNode = null;
        while(in.hasNextLine())
        {
            int nextToken = Integer.parseInt(in.next());
            root = BTNode.insertSplay(root, nextToken, 0);

           // root.printDiagram(root, 0, 10);
            //System.out.println("-------------------------------------------");
        }
        System.out.println("Ordinary BST Tree");
        root = BTNode.findRoot(root);
        root.printDiagram(root, 0, 10);
        System.out.println("-------------------------------------------");

        System.out.println("Lets Start the Interactive Mode");
        System.out.println("Enter 1 to Splay the tree at your node of choice");
        System.out.println("Enter 2 to Search the node with a Key of your choice");
        System.out.println("Enter 3 to Insert a node of your choice");
        System.out.println("Enter 4 to Delete a node of your choice");
        System.out.println("To End Interactive Mode Enter 0");

        int interactive = input.nextInt();

        while(interactive != 0)
        {
            switch (interactive) {
                case 1 -> {
                    System.out.println("You've decided to splay at a certain node, please enter a number to splay at: ");
                    int number = input.nextInt();
                    root = BTNode.splayAtNode(root, number);
                    root = BTNode.findRoot(root);
                    System.out.println("Splay is done");
                    System.out.println("What would you like to do next? Enter a case from above:");
                    interactive = input.nextInt();
                }
                case 2 -> {
                    System.out.println("You've decided to Search for a node of your choice, please enter a number to find");
                    int number2 = input.nextInt();
                    assert root != null;
                    BTNode.searchSplay(root, number2);
                    System.out.println("What would you like to do next? Enter a case from above:");
                    interactive = input.nextInt();
                }
                case 3 -> {
                    System.out.println("You've decided to insert a new node, please enter a number to insert");
                    int number3 = input.nextInt();
                    root = BTNode.insertSplay(root, number3, 1);
                    root.printDiagram(root, 0, 10);
                    System.out.println("What would you like to do next? Enter a case from above:");
                    interactive = input.nextInt();
                }
                case 4 -> {
                    System.out.println("You've decided to delete a certain node, please enter a number to delete");
                    int number4 = input.nextInt();
                    BTNode.deleteSplay(root, number4);
                    System.out.println("What would you like to do next? Enter a case from above:");
                    interactive = input.nextInt();
                }
                default -> {
                    System.out.println("Please Enter a valid case 1-4: Or 0 to exit ");
                    interactive = input.nextInt();
                }
            }
        }



        //assert root != null;
        //BTNode.searchSplay(root, 9000);
        //BTNode.deleteSplay(root, 7721);
        //root = BTNode.findRoot(root);
       //root.printDiagram(root, 0, 10);
        //root =BTNode.splayAtNode(root, 1321);
      // root = BTNode.findRoot(root);
        //BTNode.insertSplay()
        //root.printDiagram(root, 0, 10);
       /*
        root =BTNode.splayAtNode(root, 4946);
        root = BTNode.findRoot(root);
        root.printDiagram(root, 0, 10);
        root =BTNode.splayAtNode(root, 3000);
        root = BTNode.findRoot(root);
        root.printDiagram(root, 0, 10);

        */
        //BTNode.searchSplay(root, 2000);
        //root = BTNode.insertSplay(root,2369, 1);
        //root.printDiagram(root, 0, 10);
        //root = BTNode.insertSplay(root,3354, 1);
        //root.printDiagram(root, 0, 10);
        //BTNode.insertSplay(3000);
        //BTNode.deleteSplay(root,1234);
        //BTNode.insertSplay(root, null, 7);








    }

}
