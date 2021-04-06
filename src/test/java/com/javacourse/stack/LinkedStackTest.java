package com.javacourse.stack;


import com.javacourse.stack.stack.ComplexTest;
import com.javacourse.stack.stack.PeekStackTest;
import com.javacourse.stack.stack.PopStackTest;
import com.javacourse.stack.stack.PushStackTest;
import com.javacourse.stack.stack.TypedStackTest;

public class LinkedStackTest implements PushStackTest,
                                        PopStackTest,
                                        PeekStackTest,
                                        TypedStackTest,
                                        ComplexTest {

	@Override
	public Stack<Integer> getIntegerStackImpl() {
		return new LinkedStack<>();
	}

	@Override
	public Stack getUntypedStack() {
		return new LinkedStack<>();
	}
}
