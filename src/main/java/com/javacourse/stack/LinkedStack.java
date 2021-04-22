package com.javacourse.stack;

/**
 * Реализация стека на базе односвязного списка
 */
public class LinkedStack<ItemTypeT extends Comparable<ItemTypeT>> implements Stack<ItemTypeT> {

    private CustomLinkedList<ItemTypeT> store;
    private CustomLinkedList<ItemTypeT> maxStore;
    private CustomLinkedList<ItemTypeT> minStore;

    public LinkedStack() {
        this.store = new CustomLinkedList<>();
        this.maxStore = new CustomLinkedList<>();
        this.minStore = new CustomLinkedList<>();
    }

    @Override
    public void push(ItemTypeT item) {
        store.add(item);
        addMax(item);
        addMin(item);
    }

    private void addMax(ItemTypeT item) {
        if (maxStore.isEmpty()) {
            maxStore.add(item);
        } else if (item != null && item.compareTo(maxStore.getLast()) >= 0) {
            maxStore.add(item);
        }
    }

    private void addMin(ItemTypeT item) {
        if (minStore.isEmpty()) {
            minStore.add(item);
        } else if (item != null && item.compareTo(minStore.getLast()) <= 0) {
            minStore.add(item);
        }
    }

    @Override
    public ItemTypeT pop() {
        if (store.isEmpty()) throw new RuntimeException("Empty Stack Exception");
        ItemTypeT top = store.getLast();
        if (top != null && top.equals(maxStore.getLast())) maxStore.getCurrentItem();
        if (top != null && top.equals(minStore.getLast())) minStore.getCurrentItem();
        return store.getCurrentItem();
    }

    @Override
    public ItemTypeT peek() {
        if (isEmpty()) throw new RuntimeException("Empty Stack Exception");
        return store.getLast();
    }

    public ItemTypeT max() {
        if (store.isEmpty()) throw new RuntimeException("Empty Stack Exception");
        return maxStore.getLast();
    }

    public ItemTypeT min() {
        if (store.isEmpty()) throw new RuntimeException("Empty Stack Exception");
        return minStore.getLast();
    }

    public boolean isEmpty() {
        return store.isEmpty();
    }
}