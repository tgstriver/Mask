package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

public class CvvMask extends Mask {

    private static final long serialVersionUID = 133870946589470992L;

    private static final CvvMask instance = new CvvMask();

    public static CvvMask instance() {
        return instance;
    }

    private CvvMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return MaskUtil.MASK_3;
    }
}