package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

public class ExpMask extends Mask {

    private static final long serialVersionUID = -7179637852631456931L;

    private static final ExpMask instance = new ExpMask();

    public static ExpMask instance() {
        return instance;
    }

    private ExpMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_4;
    }
}