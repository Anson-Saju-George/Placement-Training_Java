class _000_LL {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null, tail = null;

    public void insert(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void insert_mid(int pos, int n) {
        Node newnode = new Node(n);
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (head == null || pos == 1) {
            newnode.next = head;
            head = newnode;
            if (tail == null) tail = newnode;
            return;
        }

        Node c = head;
        int count = 1;

        while (count < pos - 1 && c.next != null) {
            c = c.next;
            count++;
        }

        newnode.next = c.next;
        c.next = newnode;

        if (newnode.next == null) {
            tail = newnode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        _000_LL ll = new _000_LL();
	    System.out.println("Executing...");

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.display();  // 10 -> 20 -> 30 -> NULL

        ll.insert_mid(2, 15);
        ll.display();  // 10 -> 15 -> 20 -> 30 -> NULL

        ll.insert_mid(1, 5);
        ll.display();  // 5 -> 10 -> 15 -> 20 -> 30 -> NULL

        ll.insert_mid(10, 100);  // Should insert at end
        ll.display();  // 5 -> 10 -> 15 -> 20 -> 30 -> 100 -> NULL
    }
}
