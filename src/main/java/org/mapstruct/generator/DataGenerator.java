package org.mapstruct.generator;

import org.mapstruct.bean.A;
import org.mapstruct.bean.B;

import java.util.HashSet;
import java.util.Set;

public class DataGenerator {

    public static A generateData(){
        A a = new A();
        a.setId(1L);
        a.setName("foo");
        B b = new B();
        b.setId(2L);
        b.setName("bar");

        A a2 = new A();
        a2.setId(3L);
        a2.setName("john");
        A a3 = new A();
        a3.setId(4L);
        a3.setName("doe");

        Set<A> aData = new HashSet<A>();
        aData.add(a2);
        aData.add(a3);
        b.setaData(aData);

        a.setbData(b);
        return a;
    }
}
