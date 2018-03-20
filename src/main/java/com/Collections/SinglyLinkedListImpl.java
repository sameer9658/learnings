package com.Collections;

public class SinglyLinkedListImpl<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T element){
        Node<T> nd = new Node<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        if(head == null) {
            head = nd;
            tail = nd;
        }else{
            tail.setNextRef(nd);
        }
    }

    public static void main(String[] args) {

    }
}
