import java.util.Scanner;

class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data = data;
        }
    }
 class LinkedList {

    Node head = null;
    
    void addFirst(int data){

        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void Printll(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is empty");
        }else{
            while(temp.next != null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void InPlaceRev(Node current, Node prev){

        if(current == null){
            head = prev;
            return;
        }
        Node forward = current.next;
        current.next = prev;
      
        InPlaceRev(forward,current);
    }
}

class Client  {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        char ch;
        do {
            System.out.println("Singly LinkedList");
            System.out.println("1.addFirst");
            System.out.println("2.Printll");
            System.out.println("3.InplaceRev");
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
                        ll.Printll();
                    }
                    break;

                    case 3:{
                        ll.InPlaceRev(ll.head,null);
                    }
                    break;
                    default:
                        System.out.println("Wrong input");
            }
             System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);
        }while ( ch == 'y'|| ch =='Y');
    }    
}