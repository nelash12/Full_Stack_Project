
//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
    }
}

// } Driver Code Ends

// function Template for Java

/*
 * linked list node class:
 * 
 * class Node {
 * int data;
 * Node next;
 * Node(int value) {
 * this.value = value;
 * }
 * }
 * 
 */

class Solution {

    public static int size(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    Node getAt(Node head, int index) {
        if (index == 0) {
            return head;
        } else {
            Node curr = head;

            while (index > 0) {
                curr = curr.next;
                index--;
            }
            return curr;

        }

    }

    // Function to reverse a linked list.
    Node reverseList(Node head) {

        // code here
        if (head == null || head.next == null) {
            return head;
        }

        int size = size(head);

        int st = 0;
        int end = size - 1;

        while (st < end) {
            Node a = getAt(head, st);
            Node b = getAt(head, end);

            int temp = a.data;
            a.data = b.data;
            b.data = temp;

            st++;
            end--;
        }
        return head;

    }

    
}
