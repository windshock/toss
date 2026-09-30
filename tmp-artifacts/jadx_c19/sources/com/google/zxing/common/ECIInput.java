package com.google.zxing.common;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ECIInput {
    char charAt(int i2);

    int getECIValue(int i2);

    boolean haveNCharacters(int i2, int i3);

    boolean isECI(int i2);

    int length();

    CharSequence subSequence(int i2, int i3);
}
