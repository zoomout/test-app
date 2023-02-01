// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.samples.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class TodoItemTest {

    @Test
    public void testEqualsObject() {
        final TodoItem itemA = new TodoItem();
        Instant now = Instant.now();
        final TodoItem itemB1 = new TodoItem("B", "Item B", "Owner of Item B", now);
        final TodoItem itemB2 = new TodoItem("B", "Item B", "Owner of Item B", now);
        final Object nonTodoItem = new Object();
        Assertions.assertEquals(itemA, itemA);
        Assertions.assertNotEquals(null, itemA);
        Assertions.assertNotEquals(itemA, nonTodoItem);
        Assertions.assertNotEquals(itemA, itemB1);
        Assertions.assertEquals(itemB1, itemB2);
        Assertions.assertNotEquals(itemB1, itemA);
    }

}
