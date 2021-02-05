package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

public class CaptchaMask extends Mask {

    private static final long serialVersionUID = -2194235760154043576L;

    private static final CaptchaMask instance = new CaptchaMask();

    public static CaptchaMask instance() {
        return instance;
    }

    private CaptchaMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_6;
    }
}