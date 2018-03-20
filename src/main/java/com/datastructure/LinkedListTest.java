package com.datastructure;

public class LinkedListTest {

    static SingleNodeList head;
    private static class SingleNodeList{
        int data;
        SingleNodeList next;

        SingleNodeList(int data){
            this.data=data;
            next=null;
        }
    }

//Detect and removing the loop in linked list
    public void detectAndRemoveLoop(SingleNodeList singleNodeList){

        SingleNodeList slow = singleNodeList;
        SingleNodeList fast = slow;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;

            if(fast==slow){
                System.out.println("LOOP Found");
                removeTheLoopInLinkedList(slow,singleNodeList);
                return;
            }
        }


    }

    public  void removeTheLoopInLinkedList(SingleNodeList loop,SingleNodeList head){

        SingleNodeList ptr1=null,ptr2=null;
        ptr1=head;

        while (true){
            ptr2=loop;
            /* Now start a pointer from loop_node and check if it ever
             reaches ptr2 */
            while(ptr2.next !=loop && ptr2.next!=ptr1){
                 ptr2 = ptr2.next;
            }
            /* If ptr2 reahced ptr1 then there is a loop. So break the
             loop */
            if(ptr2.next == ptr1 ){
                break;
            }
            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            ptr1 = ptr1.next;
        }
        /* After the end of loop ptr2 is the last node of the loop. So
         make next of ptr2 as NULL */
        ptr2.next=null;
    }

    public  void inserDataIntoLinkedList(SingleNodeList singleNodeList){

        SingleNodeList current;
        current = head;
        if(head==null){
            head = singleNodeList;
        }else{
            while (current!=null){
                if(current.next==null){
                    current.next=singleNodeList;
                    return;
                }
                current = current.next;
            }
            current = singleNodeList;
        }
    }

    public static void printLinkedList(SingleNodeList head){
        SingleNodeList current;
        current = head;
        int count =0;
        while (current!=null){
            count++;
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static SingleNodeList printGreaterThanTheArgument(int data,SingleNodeList head){
        SingleNodeList current;
        current = head;
        SingleNodeList refernceHead = null;
        SingleNodeList referenceHeadCurrent = null;


        while (current!=null){
            if(current.data == data){
                refernceHead = current;
                referenceHeadCurrent=refernceHead;
            }
           if(data < current.data){
               referenceHeadCurrent.next = current;
           }
            current= current.next;
        }
        return refernceHead;
    }
    public  void insertAfter(int data,int dataToFind){

        SingleNodeList current;
        current = head;
        while (current!=null){
            if(current.data == dataToFind){
                break;
            }
            current=current.next;
        }

        SingleNodeList newNode = new SingleNodeList(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAtTheEndOFLinkedList(int data){

        SingleNodeList singleNodeList = new SingleNodeList(data);

        SingleNodeList current = head;
        while(current!=null){
            current = current.next;
        }
        current.next = singleNodeList;

    }
    public static SingleNodeList reverseLinkedList(SingleNodeList headOfLinkedList){
        
        SingleNodeList prev=null,next=null,current=null;

        current = headOfLinkedList;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        headOfLinkedList=prev;
        return headOfLinkedList;
        
    }

    public static void printMiddileNode(SingleNodeList head){

        SingleNodeList slow_ptr = head,fast_ptr=head;

        if(head!=null){
            while(fast_ptr!=null && fast_ptr.next!=null){
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is ["+slow_ptr.data+"]\n");
        }
    }

    public static void main(String[] args) {
        SingleNodeList head = new SingleNodeList(5);
        SingleNodeList singleNodeList1 = new SingleNodeList(6);
        SingleNodeList singleNodeList2 = new SingleNodeList(7);
        SingleNodeList singleNodeList3 = new SingleNodeList(8);
        SingleNodeList singleNodeList4 = new SingleNodeList(11);
        SingleNodeList singleNodeList5 = new SingleNodeList(12);
        SingleNodeList singleNodeList6 = new SingleNodeList(4);
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.inserDataIntoLinkedList(head);
        linkedListTest.inserDataIntoLinkedList(singleNodeList1);
        linkedListTest.inserDataIntoLinkedList(singleNodeList2);
        linkedListTest.inserDataIntoLinkedList(singleNodeList3);
        linkedListTest.inserDataIntoLinkedList(singleNodeList4);
        linkedListTest.inserDataIntoLinkedList(singleNodeList5);
        linkedListTest.inserDataIntoLinkedList(singleNodeList6);
        linkedListTest.insertAfter(10,8);
        //linkedListTest.insertAtTheEndOFLinkedList(1);
       /* LinkedListTest list = new LinkedListTest();
        list.head = new SingleNodeList(50);
        list.head.next = new SingleNodeList(20);
        list.head.next.next = new SingleNodeList(15);
        list.head.next.next.next = new SingleNodeList(4);
        list.head.next.next.next.next = new SingleNodeList(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);*/
      //SingleNodeList singleNodeList =  linkedListTest.printGreaterThanTheArgument(8,head);
        SingleNodeList reverseLinkedList = reverseLinkedList(head);
       // printMiddileNode(head);
        printLinkedList(reverseLinkedList);
        //printLinkedList(head);



    }

}
