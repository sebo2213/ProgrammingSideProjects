import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {


    private LinkedLists listTest = new LinkedLists();

//    @BeforeAll
//    public void setUp(){
//        LinkedLists listTest = new LinkedLists();
//    }

    @Test
    public void createTest(){
        int size = 5;
        listTest.create(size);
        LinkedList list = listTest.getList();
        assertEquals(size, list.size());
    }

}
