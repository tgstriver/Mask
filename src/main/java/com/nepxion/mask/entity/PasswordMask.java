package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

public class PasswordMask extends Mask {

    private static final long serialVersionUID = -2002856803756293940L;

    private static final PasswordMask instance = new PasswordMask();

    public static PasswordMask instance() {
        return instance;
    }

    private PasswordMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_6;
    }
}