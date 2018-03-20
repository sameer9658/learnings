package com.datastructure;

public class SingleLinkedList {

    //Head node is always null for the first time
    private ListNode head;

    //It Contains a static inner class
    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = forth;


        //To Print the containt in the linked list
       /* while (current != null) {
           System.out.println(current.data);
           current = current.next;
        }*/

        //TO print the number of items in linked list
        /*int count=0;
        while(current!=null){
            count++;
            current = current.next;
        }
        System.out.println(count);*/

        //Add a node to starting of linked list
        ListNode current;

        /*ListNode newNode = new ListNode(0);
        newNode.next = head;
        head = newNode;*/
        //current = insertAtBegining(head,0);
        current = insertAtEnd(head,0);

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    static  ListNode insertAtBegining(ListNode head , int data){

        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
        return head;

    }

    static ListNode insertAtEnd(ListNode head,int data){
        ListNode node = new ListNode(data);
        ListNode current;
        current = head;

        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
        return head;
    }
}
