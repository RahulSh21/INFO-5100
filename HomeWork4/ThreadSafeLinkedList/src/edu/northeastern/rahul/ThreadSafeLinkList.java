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
                list.add(index, element);
                System.out.println( Thread.currentThread().getName() + " has add at Index = " + index + " and element " + element + " list current size = " + list.size());
            }

        }

        public void removeAtPosition(int index){

            synchronized (object){
                if(list.size() <= index || index < 0){
                    return;
                }
                System.out.println( Thread.currentThread().getName() + " has removed at Index = " + index +  " List current Size = " + list.size());
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
