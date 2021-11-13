package edu.northeastern.rahul;

public class ThreadSafeLinkedList {

    int data;
    public Node head;

    public ThreadSafeLinkedList(){
        head = null;
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addAtPosition(int index, int element) throws Exception {
        Node temp = head;

        while (temp != null) {
            if (index == 0) {
                Node add = temp.next;
                temp.next = new Node(element);
                temp.next.next = add;
            }
           if (index > 0 && temp.next == null) {
                throw new Exception("Given element " + element + " at " + index + "can not be removed");
            }
            index--;
            temp = temp.next;
        }
        printLinklist();
    }

    public void removeAtPosition(int index, int element) throws Exception {
        Node temp = head;
        while(temp != null){
            if(index == 1 ){
               temp.next = temp.next.next;
                //temp.next = remove;
            }

            /*if(temp.next == null && index > 0){
                throw new Exception("Given element " + element + " at " + index + "can not be removed");
            }*/
            temp = temp.next;
            index--;
        }
        printLinklist();
    }


    public int getFirst() throws Exception {
        Node temp = head;
        if (temp == null) {
            throw new Exception("LinkList is Empty");
        }
        return temp.data;
    }


    public int getLast() throws Exception {
        Node temp = head;
        while( temp != null){
            if(temp.next == null){
                return temp.data;
            }
            temp = temp.next;
        }

        throw new Exception("LinkList is Empty");
    }

    public int size()  {
        int count = 0;
        Node temp = head;
        if(temp == null){
            System.out.println("Linked list is empty");
        }
        while(temp != null ){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void printLinklist(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
