class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }

    node(int val, node next) {
        this.val = val;
        this.next = next;
    }
}


class MyLinkedList {

    private node head;
    private node tail;

    public int get(int index) {

        if (index < 0) {
            return -1;
        }

        node temp = head;

        for (int i = 0; i < index; i++) {

            if (temp == null) {
                return -1;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return -1;
        }

        return temp.val;
    }


    public void addAtHead(int val) {

        node newNode = new node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void addAtTail(int val) {

        node newNode = new node(val);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    public void addAtIndex(int index, int val) {

        if (index < 0) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null) {
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        node newNode = new node(val);

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }


    public void deleteAtIndex(int index) {

        if (index < 0 || head == null) {
            return;
        }

        // Delete head
        if (index == 0) {

            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null) {
                return;
            }

            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
    }
}