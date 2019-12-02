package basiс5.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListImpl<T extends Comparable<T>> implements List<T> {
    private Node<T> head;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> nextNode = head;

            @Override
            public boolean hasNext() {
                return nextNode != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    Node<T> node = nextNode;
                    nextNode = nextNode.getNextNode();
                    return node.getData();
                }
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            result[i] = node.getData();
            node = node.getNextNode();
        }
        return result;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // TODO
        return null;
    }

    @Override
    public boolean add(T data) {
        boolean isAdded;
        if (head != null) {
            isAdded = head.add(data);
        } else {
            head = new Node<>(data);
            isAdded = true;
        }
        if (isAdded) size++;
        return isAdded;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed;
        if (head.getData().equals(o)) {
            head = head.getNextNode();
            removed = true;
        } else {
            removed = head.remove(o);
        }
        if (removed) size--;
        return removed;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        ListImpl<T> foundElements = new ListImpl<>();
        for (Object element : c) {
            if (contains(element)) {
                foundElements.add((T) element);
            }
        }
        if (foundElements.size() == c.size()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null || c.size() == 0) {
            return false;
        }
        for (T element : c) {
            add(element);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null || c.size() == 0) {
            return false;
        }
        boolean changed = false;
        boolean removed = false;
        for (Object element : c) {
            while (remove(element)) {
                removed = true;
            }
            changed = changed || removed;
        }
        return changed;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        ListImpl<T> foundElements = new ListImpl<>();
        for (Object element : c) {
            if (contains(element)) {
                foundElements.add((T) element);
            }
        }
        head = foundElements.head;
        return foundElements.size() > 0;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        Iterator<T> iterator = iterator();
        for (int i = 0; iterator.hasNext() && i <= index; i++) {
            T next = iterator.next();
            if (i == index) return next;
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        // TODO
        return null;
    }

    @Override
    public void add(int index, T element) {
        // TODO
    }

    @Override
    public T remove(int index) {
        if (head == null || index >= size) return null;
        int i = 0;
        Node<T> nextNode = head;
        while (true) {
            if (i == index) {
                T nodeData = nextNode.getData();
                nextNode.remove();
                size--;
                return nodeData;
            }
            nextNode = nextNode.getNextNode();
            i++;
            if (nextNode == null) {
                return null;
            }
        }
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        Iterator<T> iterator = iterator();
        T data;
        while (iterator.hasNext()) {
            data = iterator.next();
            if (data.equals(o)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int result = -1;
        int i = 0;
        Iterator<T> iterator = iterator();
        T data;
        while (iterator.hasNext()) {
            data = iterator.next();
            if (data.equals(o)) {
                result = i;
            }
            i++;
        }
        return result;
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        ListImpl<T> result = new ListImpl<>();
        if (fromIndex >= toIndex || size < fromIndex) return result;
        int currentIndex = 0;
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (currentIndex < fromIndex) {
                currentIndex++;
                continue;
            } else if (currentIndex >= fromIndex && currentIndex < toIndex) {
                result.add(next);
                currentIndex++;
            } else {
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "ListImpl{" +
                "head=" + head +
                '}';
    }
}
