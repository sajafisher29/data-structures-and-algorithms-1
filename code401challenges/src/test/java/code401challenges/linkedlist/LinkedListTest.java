package code401challenges.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test public void insertToHeadTest() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        assertEquals(2, list.head.data);

    }

    @Test public void verifyHead() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        assertEquals(10, list.head.data);

    }

    @Test public void booleanValueSearch() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);

        list.include(5);

        System.out.println(list.include(11));

        assertFalse("We do not have 11.",
                list.include(11));

        assertTrue("yeah! we have 10.",
                list.include(10));

    }
    @Test public void toStringTest() {

        LinkedList list = new LinkedList();
        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);

        String expectedAnswer = "{ 10 } => { 5 } => { 2 } => null";

        assertEquals("Contains nodes 10, 5, 2",
                expectedAnswer,
                list.toString());

    }






    //test for code challenge 7
    @Test public void lastListTest(){
        LinkedList list = new LinkedList();

        list.insertToHead(2);
        list.insertToHead(5);
        list.insertToHead(10);
        list.insertToHead(15);
        list.insertToHead(20);
        list.insertToHead(25);
        list.insertToHead(30);


        assertEquals(20, list.lastList(4));

    }
}


