package com.nepxion.mask.entity;

public class MobileMask extends Mask {

    private static final long serialVersionUID = 1189902073978874993L;

    private static final MobileMask instance = new MobileMask();

    public static MobileMask instance() {
        return instance;
    }

    private MobileMask() {
        super(3, 4, 0);
    }
}