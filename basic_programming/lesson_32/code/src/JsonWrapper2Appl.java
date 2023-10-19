package ait.generic;

import ait.generic.utils.JsonWrapper2;

public class JsonWrapper2Appl {
    public static void main(String[] args) {
        long b = 10_000_000_000L;
        JsonWrapper2<Long> wrapper2 = new JsonWrapper2<>(10l);
        System.out.println(wrapper2);
        Number a = wrapper2.getValue();
        System.out.println(a);
    }
}
