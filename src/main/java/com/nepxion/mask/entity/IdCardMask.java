package com.nepxion.mask.entity;

public class IdCardMask extends Mask {

    private static final long serialVersionUID = -1788599350301335670L;

    private static final IdCardMask instance = new IdCardMask();

    public static IdCardMask instance() {
        return instance;
    }

    private IdCardMask() {
        super(2, 2, 0);
    }
}