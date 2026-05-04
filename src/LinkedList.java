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
    
    void addFirst(int data){
    
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
        }
        else{
            NewNode.next = head;
            head = NewNode;
        }
    }

    void addLast(int data){

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
    
    void addAtPos(int data, int poss ){
        if(poss<=0 && poss>countNode()+1){
            System.out.println("Wrong input for Pose");
            return;
        }
        if(head == null){
            addFirst(data);
        }
        else if(poss ==countNode()+1){
            addLast(data);
        }
        else{
            Node NewNode = new Node(data);

            Node temp = head;

            while(poss-2 != 0){
                temp = temp.next;
                poss--;
            }
            NewNode.next = temp.next;
            temp.next =NewNode;
        }
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

    void deleteFirst(){
        if(head==null){
            System.out.println("no node prestent to detele");
            return;
        }
        if(countNode()==1){
            head = null;
        }
        else{
            head = head.next;
        }
    }

    void deleteLast(){
        if(head==null){
            System.out.println("no node prestent to detele");
            return;
        }
        if(countNode() == 1){
            head = null;
        }
        else{
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteAtPos(int poss){
        if(poss<=0 && poss>countNode()+1){
            System.out.println("Wrong input for Pose");
            return;
        }
        if(poss == 1){
            deleteFirst();
        }
        else if(poss == countNode()){
            deleteLast();
        }
        else{
            Node temp = head;
            while(poss-2 != 0){
                temp = temp.next;
                poss--;
            }
            temp.next = temp.next.next;
        }
    }
}

class Client{

    public static void main(String[]args){
        LinkedList ll = new LinkedList();
        char ch;
        do {
            System.out.println("Singly LinkedList");
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPoss");
            System.out.println("4.deletdFirst");
            System.out.println("5.deleteLast");
            System.out.println("6.deleteAtPoss");
            System.out.println("7.CountNode");
            System.out.println("8.Printll");

            System.out.println("Enter Your Choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){
                    case 1:{
                        System.out.println("Enter Data");
                        int data = sc.nextInt();
                        ll.addFirst(data);
                    }
                    break;

                    case 2:{
                        System.out.println("Enter Data");
                        int data = sc.nextInt();
                        ll.addLast(data);
                    }
                    break;

                    case 3:{
                        System.out.println("Enter Data");
                        int data = sc.nextInt();
                        System.out.println("Enter Position");
                        int poss = sc.nextInt();
                        ll.addAtPos(data,poss);
                    }
                    break;

                    case 4:
                        ll.deleteFirst();
                    break;

                    case 5:
                        ll.deleteLast();
                    break;

                    case 6:{
                        System.out.println("Enter Position ");
                        int poss = sc.nextInt();
                        ll.deleteAtPos(poss);
   
                    }
                    break;

                    case 7:
                        System.out.println(ll.countNode());
                        break;

                    case 8: 
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