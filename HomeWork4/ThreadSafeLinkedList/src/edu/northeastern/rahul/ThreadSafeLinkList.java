package edu.northeastern.rahul;

public class ThreadSafeLinkList <T> {

        private LinkList<T> list;
        private static Object object;

        public ThreadSafeLinkList(){
            list = new LinkList<>();
            object = new Object();
        }


        public void addAtPosition(int index, T element){
            synchronized (object){
                System.out.println(" Index = " + index + " list.size = " + list.size());
                list.add(index, element);
            }

        }

        public void removeAtPosition(int index){

            synchronized (object){
                if(list.size() <= index || index <0){
                    return;
                }
                System.out.println("Thread name = " + Thread.currentThread().getName() +  " List Size = " + list.size() + " Index = " + index);
                list.remove(index);
            }
        }
        public T getFirst() {
            synchronized (object){
                return list.getFirst();
            }
        }

        public T getLast() {
            synchronized (object){
                return  list.getLast();
            }
        }

        public int size(){
            synchronized (object){
                return list.size();
            }
        }

}
