import java.util.*;

class Node {
 int data;
 Node next = null;
 Node(int data){
    this.data = data;
 }
}

class LinkedList{

    Node head = null;

    void addNode(int data){

        Node NewNode =new Node(data);
        if(head == null){

            head=NewNode;
        }
        else{
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = NewNode;
        }
    }
    
    void MidleNode(){

        Node temp = head;
        int len = countNode();
        int count =0;
        while(count < len/2){
            temp = temp.next;
            count++;
        }
        // for(int i=1;i<=len/2;i++){
        //     temp = temp.next;
        // }
        
        System.out.println("Midle node:"+temp.data);
    }

    int countNode(){
        int count=0;
        Node temp = head;
        while(temp.next !=null){
            count++;
            temp = temp.next;
        }
        return count+1;
    }

    void Printll(){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        else{
            Node temp = head;
            while(temp.next != null){
                System.out.print(temp.data +"->");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }


}

class Client{

    public static void main(String[]args){
        LinkedList ll = new LinkedList();
        char ch;
        do {
            System.out.println("Singly LinkedList");
            System.out.println("1.addNode");
            System.out.println("2.MidleNoed");
            System.out.println("3.Printll");

            System.out.println("Enter Your Choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){
                    case 1:{
                        System.out.println("Enter Data");
                        int data = sc.nextInt();
                        ll.addNode(data);
                    }
                        break;
                    case 2 :
                        ll.MidleNode();
                        break;
                    case 3: 
                        ll.Printll();
                        break;
                    default:
                        System.out.println("Wrong input");
            }

            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);

        } while ( ch == 'y'|| ch =='Y');
    }

}