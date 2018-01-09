package com.t0lia.design_pattern.III_behavioral.iterator;

public class FixedStack implements Stack{
    private static final int MAX_SIZE = 4;

    private int size = 0;
    private String array[] = new String[MAX_SIZE];

    public boolean push(String item) {
        if (size < MAX_SIZE) {
            array[size] = item;
            size++;
            return true;
        }
        return false;
    }

    public String pop() {
        if (size > 0) {
            size--;
            String result = array[size];
            array[size] = null;
            return result;
        }
        return null;
    }

    class Iterator implements com.t0lia.design_pattern.III_behavioral.iterator.Iterator{
        private int current = 0 ;

        public String next() {
            return array[current++];
        }

        public boolean hasNext() {
            return current < size ;
        }
    }
}
