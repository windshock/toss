package org.bouncycastle.crypto;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface AlphabetMapper {
    char[] convertToChars(byte[] bArr);

    byte[] convertToIndexes(char[] cArr);

    int getRadix();
}
