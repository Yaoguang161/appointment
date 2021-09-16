package com.collection.set;

import com.collection.test.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


  
/**
 * Created by Enzo Cotter on 2021/9/16.
 */
public class SetTest {
    @Test
    public void  test() {
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Jerry", 20));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
