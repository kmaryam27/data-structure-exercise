package com.galvanize.shippingcard;

import java.math.BigDecimal;

public class ShoppingCard {
    private BigDecimal totalPrice;
    public MyLinkedList<Item> myLinkedList = new MyLinkedList<>();

    public boolean isEmpty() {
        return ((this.totalPrice.equals(new BigDecimal(0.00)))&&(myLinkedList.size() == 0)) ;
    }

    public ShoppingCard() {
        this.totalPrice = new BigDecimal(0.00);
//        this.totalPrice = totalPrice;
    }


    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

//    public void setTotalPrice(BigDecimal totalPrice) {
//        this.totalPrice = totalPrice;
//    }


    public static class Item {
        private String name;
        private int count;
        private BigDecimal price;

        public Item(String name, int count, BigDecimal price) {
            this.name = name;
            this.count = count;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }
    }

    public class MyLinkedList<T> {

        public class Node<T>{
            private T data;
            private Node<T> next;
//            private Node<T> previous;

            public Node(T data) {
                this.data = data;
            }
        }
        private int size = 0;
        private Node<T> head;
        public int size(){
            return size;
        }

        public void add(T item) {
            Node<T> tNode = new Node<>(item);
            if(head == null) head = tNode;
            else {
                Node<T> current = head;
                while (current.next != null){
                    current = current.next;
                }
                current.next = tNode;
            }
            size++;
        }

        public T get(int i) {
            if (i == 0) return head.data;
            int myCounter = 0;
            Node<T> current = head;
            while (myCounter != i ){
                current = current.next;
                myCounter++;
            }
            return current.data;
        }

        public void remove(T item) {
            int myCounter = 0;
            Node<T> current = head;
            if(current.data == item) head = current.next;
            while ((current.data != item )&&(current.next != null)){
                current = current.next;
            }
            if (current.next != null) current = current.next.next;
            size --;
        }
    }
}
