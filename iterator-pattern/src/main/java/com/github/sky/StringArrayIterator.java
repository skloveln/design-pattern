package com.github.sky;

import java.util.Iterator;

/**
 * 描述：字符串数组遍历器
 *
 * @author sukai
 * @date 2021/10/21
 */
public class StringArrayIterator implements Iterator {

    private String[] stringArray;
    private int index;

    public StringArrayIterator(String[] stringArray){
        this.stringArray = stringArray;
    }

    @Override
    public boolean hasNext() {
        if (index < stringArray.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return stringArray[index++];
        }
        return null;
    }
}
