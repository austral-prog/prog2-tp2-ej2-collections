package com.collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListsTest {

    @Test
    void testAdd() {
        Lists list = new Lists();
        assertEquals(5, list.add(2, 3));
    }
}
