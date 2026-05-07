import java.util.Scanner;

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}
class CircularLinkedList1 {
    Node head = null;

    void addFirst(int data){
        Node nn = new Node(data);

        if(head == null){
            head = nn;
            nn.next = head;
        }
        else{
            Node temp = head;

            nn.next = head;
            System.out.println("NewNode ="+ nn);
            System.out.println("head = " + head);
            while(temp.next!=head){
                temp = temp.next;
            }
            System.out.println("temp.next after while ie last node = "+temp.next);
            head = nn;
            temp.next = head;
            System.out.println("temp.next after adding new Node = "+ temp.next);
            System.out.println("head after adding new node = "+head);
        }
    }

    void addLast(int data){
        Node nn = new Node(data);
        
        if(head == null){
            head = nn;
            nn.next = head;
        }
        else{
            Node temp = head;
            System.out.println("NewNode ="+ nn);
            System.out.println("head = " + head);

            while(temp.next != head){
                temp = temp.next;
            }
            System.out.println("temp.next after while ie last node = " +temp.next);
            temp.next = nn;
            nn.next = head;
            System.out.println("temp.next after adding new Node = "+ temp.next);
            System.out.println("Newnode.next i.e New last node = "+nn.next);

        }
    }
    void addAtPos(int data, int poss ){

        if(poss<=0 || poss>countNode()+1){
            System.out.println("Wrong input for Pose");
            return;
        }
        if(poss == 1){
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
        if(head == null){
            return 0;
        }
        else{
            Node temp = head;
        while(temp.next != head){
            count++;
            temp = temp.next;
        }
        return count+1;
        }
    }

    void printLinkedList(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is empty");
        }else{
            while(temp.next != head){
            System.out.print(temp.data+" -> ");
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
        }else{
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            
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
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    void deleteAtPos(int poss){
        if(poss<=0 || poss>countNode()){
            System.out.println("Wrong input for Pose");
            return;
        }
        if(poss == 1){
            deleteFirst();
        }
        else if(poss ==countNode()){
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

class client{
    public static void main(String[] args) {
        CircularLinkedList1 ll = new CircularLinkedList1();
        char ch;
        do {
            System.out.println("Singly Circular LinkedList");
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtpos"); 
            System.out.println("4.PrintLinkedList");     
            System.out.println("5.countNode");
            System.out.println("6.deletdFirst");
            System.out.println("7.deleteLast");
            System.out.println("8.deleteAtPoss");

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
                    case 2 :{
                        System.out.println("Enter Data");
                        int data = sc.nextInt();
                        ll.addLast(data);
                    }
                        break;
                    case 3: {
                        System.out.println("Enter Data");
                        int data = sc.nextInt();
                        System.out.println("Enter Position");
                        int poss = sc.nextInt();
                        ll.addAtPos(data,poss);
                    }
                        break;
                    case 4: 
                        ll.printLinkedList();
                        break;
                    case 5: 
                        System.out.println(ll.countNode());
                        break;
                    case 6:
                        ll.deleteFirst();
                    break;

                    case 7:
                        ll.deleteLast();
                    break;

                    case 8:{
                        System.out.println("Enter Position ");
                        int poss = sc.nextInt();
                        ll.deleteAtPos(poss);
   
                    }
                    break;
                    default:
                        System.out.println("Wrong input");
            }

            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);

        } while ( ch == 'y'|| ch =='Y');
    }
}