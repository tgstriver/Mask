package com.nepxion.mask.entity;

public class BankCardMask extends Mask {

    private static final long serialVersionUID = -2860556249132541172L;

    private static final BankCardMask instance = new BankCardMask();

    public static BankCardMask instance() {
        return instance;
    }

    private BankCardMask() {
        super(6, 4, 0);
    }
}