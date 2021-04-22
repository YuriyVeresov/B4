package com.javacourse.stack;

/**
 * Реализация односвязного списка
 */
public class CustomLinkedList<ItemTypeT> {
    private Node<ItemTypeT> last;

    public CustomLinkedList() {
        this.last = null;
    }

    public void add(ItemTypeT item) {
        Node<ItemTypeT> temp = new Node<>(item);
        temp.next = last;
        last = temp;
    }

    public ItemTypeT getCurrentItem() {
        Node<ItemTypeT> current = last;
        last = last.next;
        return current.element;
    }

    public ItemTypeT getLast() {
        return last.element;
    }

    private static class Node<ItemTypeT> {
        private ItemTypeT element; // данные в списке
        private Node<ItemTypeT> next; // ссылка на следующий элемент

        private Node(ItemTypeT element) {
            this.element = element;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }
}
