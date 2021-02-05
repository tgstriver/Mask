package com.nepxion.mask.entity;

import com.nepxion.mask.util.MaskUtil;

public class IpAddressMask extends Mask {

    private static final long serialVersionUID = -847393563720267510L;

    private static final IpAddressMask instance = new IpAddressMask();

    public static IpAddressMask instance() {
        return instance;
    }

    private IpAddressMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        char[] charArray = text.toCharArray();
        boolean isMask = false;
        int offset = 0;
        for (int i = 0, d = 0; i < charArray.length; i++) {
            if (charArray[i] == '.') {
                charArray[offset++] = charArray[i];
                d++;
                isMask = true;
                continue;
            }

            if (d == 0 || d > 2) {
                charArray[offset++] = charArray[i];
                continue;
            }

            if (isMask) {
                charArray[offset++] = MaskUtil.MASK_CHAR;
                isMask = false;
            }
        }

        char[] chars = new char[offset];

        System.arraycopy(charArray, 0, chars, 0, chars.length);

        return chars;
    }
}