package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

import java.util.regex.Pattern;

public class AddressMask extends Mask {

    private static final long serialVersionUID = -1217392503430570321L;

    private final Pattern PATTERN = Pattern.compile("[0-9一二三四五六七八九十百千万]++|[A-Za-z]+(?=\\s*[座区])");
    private final String mask = new String(MaskUtil.MASK_3);

    private static final AddressMask instance = new AddressMask();

    public static AddressMask instance() {
        return instance;
    }

    private AddressMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return PATTERN.matcher(text).replaceAll(mask).toCharArray();
    }
}