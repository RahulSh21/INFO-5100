package edu.northeastern.rahul;

public class LinkList <T>{
    private int size = 0;
    private Node head, tail;

    public void add(int index, T e){
        if(this.size() < index)
            return;
        if(this.size() == index) {
            this.add(e);
        } else{
            Node pos = this.head;
            for(int i = 0; i < index-1 && pos != null; i++) {
                pos = pos.next;
                if (pos == null)
                    return;
            }
            Node newNode = new Node(e);
            newNode.next = pos.next;
            pos.next = newNode;
            this.size++;
        }
    }

    private void add(T e) {
        if(this.tail == null){
            this.tail = new Node(e);
            this.head = this.tail;
        }
        else{
            this.tail.next = new Node(e);
            this.tail = this.tail.next;
        }
        this.size++;
    }

    public int size(){
        return this.size;
    }

    public boolean empty(){
        return this.size <= 0;
    }

    public T getFirst(){
        if(!this.empty() && this.head != null)
            return (T) this.head.data;
        return null;
    }

    public T getLast(){
        if(!this.empty() && this.tail != null)
            return (T)this.tail.data;
        return null;
    }

    public void remove(int index){
        if(index >= 0 && this.size() > index){
            if(index == 0){
                this.head = this.head.next;
            }
            else {
                Node pos = this.head;
                for (int i = 0; i < index - 1 && pos != null; i++) {
                    pos = pos.next;
                    if (pos != null && pos.next != null) {
                        pos.next = pos.next.next;
                    }
                }
            }
            this.size--;
            if(this.head == null)
                this.tail = null;
        }
    }
}

