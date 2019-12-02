package basiс5.list;

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> nextNode;
    private Node<T> prevNode;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
//                ", prevNode=" + prevNode +
                '}';
    }

    public boolean add(T data) {
        int compareResult = data.compareTo(getData());
        T nextNodeData = compareResult >= 0 ? data : getData();
        if (nextNode == null) {
            nextNode = new Node<>(nextNodeData);
            nextNode.setPrevNode(this);
        } else {
            nextNode.add(nextNodeData);
        }
        if (compareResult < 0) {
            this.data = data;
        }
        return true;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    public boolean remove(Object o) {
        if (data.equals(o)) {
            remove();
            return true;
        } else {
            if (nextNode == null) {
                return false;
            } else {
                return nextNode.remove(o);
            }
        }
    }

    public void remove() {
        if (prevNode != null) {
            prevNode.setNextNode(nextNode);
        }
        if (nextNode != null) {
            nextNode.setPrevNode(prevNode);
        }
    }
}
