package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

public class NameMask extends Mask {

    private static final long serialVersionUID = 2689683569240982116L;

    private static final NameMask instance = new NameMask();

    public static NameMask instance() {
        return instance;
    }

    private NameMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        char[] charArray = text.toCharArray();
        charArray[0] = MaskUtil.MASK_CHAR;
        return charArray;
    }
}