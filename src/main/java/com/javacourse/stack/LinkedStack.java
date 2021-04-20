package com.javacourse.stack;

import java.util.LinkedList;

/**
 * Реализация стека на базе односвязного списка
 */
public class LinkedStack<ItemTypeT> implements Stack<ItemTypeT> {

	private LinkedList<ItemTypeT> store;

	public LinkedStack() {
		this.store = new LinkedList<>();
	}

	@Override
	public void push(ItemTypeT item) {
		store.add(item);
	}

	@Override
	public ItemTypeT pop() {
		if (store.isEmpty()) throw new RuntimeException("Empty Stack Exception");
		return store.pollLast();
	}

	@Override
	public ItemTypeT peek() {
		if (store.isEmpty()) throw new RuntimeException("Empty Stack Exception");
		return store.getLast();
	}
}
