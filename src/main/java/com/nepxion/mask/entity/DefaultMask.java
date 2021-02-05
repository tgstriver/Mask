package com.nepxion.mask.entity;

public class DefaultMask extends Mask {

    private static final long serialVersionUID = -1207036305758150185L;

    private static final DefaultMask instance = new DefaultMask();

    public static DefaultMask instance() {
        return instance;
    }

    private DefaultMask() {
        super(5, 5, 3);
    }
}