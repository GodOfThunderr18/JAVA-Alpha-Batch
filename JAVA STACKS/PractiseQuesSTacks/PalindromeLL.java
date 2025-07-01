package PractiseQuesSTacks;

import java.util.Stack;

public class PalindromeLL {
    public static class Node {
        Character data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
 
    public static boolean palindromeLL(Node head) {
        Stack<Character> stack = new Stack<>();
        Node temp = head;

        // Push all characters onto the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Compare stack content with the linked list
        while (head != null) {
            char top = stack.pop();
            if (head.data != top) {
                return false; // Not a palindrome
            }
            head = head.next;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        // Build the linked list
        head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        // Check if the linked list is a palindrome
        System.out.println(palindromeLL(head)); // Output: true
    }
}
