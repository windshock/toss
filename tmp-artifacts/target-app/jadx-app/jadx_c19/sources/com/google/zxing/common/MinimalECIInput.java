package com.google.zxing.common;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class MinimalECIInput implements ECIInput {
    private static final int COST_PER_ECI = 3;
    private final int[] bytes;
    private final int fnc1;

    public MinimalECIInput(String str, Charset charset, int i2) {
        this.fnc1 = i2;
        ECIEncoderSet eCIEncoderSet = new ECIEncoderSet(str, charset, i2);
        if (eCIEncoderSet.length() == 1) {
            this.bytes = new int[str.length()];
            for (int i3 = 0; i3 < this.bytes.length; i3++) {
                char cCharAt = str.charAt(i3);
                int[] iArr = this.bytes;
                if (cCharAt == i2) {
                    cCharAt = 1000;
                }
                iArr[i3] = cCharAt;
            }
            return;
        }
        this.bytes = encodeMinimally(str, eCIEncoderSet, i2);
    }

    public int getFNC1Character() {
        return this.fnc1;
    }

    @Override // com.google.zxing.common.ECIInput
    public int length() {
        return this.bytes.length;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean haveNCharacters(int i2, int i3) {
        if ((i2 + i3) - 1 >= this.bytes.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (isECI(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.zxing.common.ECIInput
    public char charAt(int i2) {
        if (i2 < 0 || i2 >= length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (!isECI(i2)) {
            return (char) (isFNC1(i2) ? this.fnc1 : this.bytes[i2]);
        }
        throw new IllegalArgumentException("value at " + i2 + " is not a character but an ECI");
    }

    @Override // com.google.zxing.common.ECIInput
    public CharSequence subSequence(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        while (i2 < i3) {
            if (isECI(i2)) {
                throw new IllegalArgumentException("value at " + i2 + " is not a character but an ECI");
            }
            sb2.append(charAt(i2));
            i2++;
        }
        return sb2;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean isECI(int i2) {
        if (i2 < 0 || i2 >= length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i3 = this.bytes[i2];
        return i3 > 255 && i3 <= 999;
    }

    public boolean isFNC1(int i2) {
        if (i2 >= 0 && i2 < length()) {
            return this.bytes[i2] == 1000;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.google.zxing.common.ECIInput
    public int getECIValue(int i2) {
        if (i2 < 0 || i2 >= length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (!isECI(i2)) {
            throw new IllegalArgumentException("value at " + i2 + " is not an ECI but a character");
        }
        return this.bytes[i2] - 256;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length(); i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (isECI(i2)) {
                sb.append("ECI(");
                sb.append(getECIValue(i2));
                sb.append(')');
            } else if (charAt(i2) < 128) {
                sb.append('\'');
                sb.append(charAt(i2));
                sb.append('\'');
            } else {
                sb.append((int) charAt(i2));
            }
        }
        return sb.toString();
    }

    static void addEdge(InputEdge[][] inputEdgeArr, int i2, InputEdge inputEdge) {
        if (inputEdgeArr[i2][inputEdge.encoderIndex] == null || inputEdgeArr[i2][inputEdge.encoderIndex].cachedTotalSize > inputEdge.cachedTotalSize) {
            inputEdgeArr[i2][inputEdge.encoderIndex] = inputEdge;
        }
    }

    static void addEdges(String str, ECIEncoderSet eCIEncoderSet, InputEdge[][] inputEdgeArr, int i2, InputEdge inputEdge, int i3) {
        int i4;
        int i5;
        char cCharAt = str.charAt(i2);
        int length = eCIEncoderSet.length();
        if (eCIEncoderSet.getPriorityEncoderIndex() < 0 || !(cCharAt == i3 || eCIEncoderSet.canEncode(cCharAt, eCIEncoderSet.getPriorityEncoderIndex()))) {
            i4 = length;
            i5 = 0;
        } else {
            int priorityEncoderIndex = eCIEncoderSet.getPriorityEncoderIndex();
            i5 = priorityEncoderIndex;
            i4 = priorityEncoderIndex + 1;
        }
        while (i5 < i4) {
            if (cCharAt == i3 || eCIEncoderSet.canEncode(cCharAt, i5)) {
                addEdge(inputEdgeArr, i2 + 1, new InputEdge(cCharAt, eCIEncoderSet, i5, inputEdge, i3));
            }
            i5++;
        }
    }

    static int[] encodeMinimally(String str, ECIEncoderSet eCIEncoderSet, int i2) {
        int i3;
        int length = str.length();
        InputEdge[][] inputEdgeArr = (InputEdge[][]) Array.newInstance((Class<?>) InputEdge.class, length + 1, eCIEncoderSet.length());
        addEdges(str, eCIEncoderSet, inputEdgeArr, 0, null, i2);
        int i4 = 1;
        while (true) {
            i3 = 0;
            if (i4 > length) {
                break;
            }
            for (int i5 = 0; i5 < eCIEncoderSet.length(); i5++) {
                InputEdge inputEdge = inputEdgeArr[i4][i5];
                if (inputEdge != null && i4 < length) {
                    addEdges(str, eCIEncoderSet, inputEdgeArr, i4, inputEdge, i2);
                }
            }
            while (i3 < eCIEncoderSet.length()) {
                inputEdgeArr[i4 - 1][i3] = null;
                i3++;
            }
            i4++;
        }
        int i6 = -1;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < eCIEncoderSet.length(); i8++) {
            InputEdge inputEdge2 = inputEdgeArr[length][i8];
            if (inputEdge2 != null && inputEdge2.cachedTotalSize < i7) {
                i7 = inputEdge2.cachedTotalSize;
                i6 = i8;
            }
        }
        if (i6 < 0) {
            throw new IllegalStateException("Failed to encode \"" + str + "\"");
        }
        ArrayList arrayList = new ArrayList();
        for (InputEdge inputEdge3 = inputEdgeArr[length][i6]; inputEdge3 != null; inputEdge3 = inputEdge3.previous) {
            if (inputEdge3.isFNC1()) {
                arrayList.add(0, 1000);
            } else {
                byte[] bArrEncode = eCIEncoderSet.encode(inputEdge3.c, inputEdge3.encoderIndex);
                for (int length2 = bArrEncode.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bArrEncode[length2] & 255));
                }
            }
            if ((inputEdge3.previous == null ? 0 : inputEdge3.previous.encoderIndex) != inputEdge3.encoderIndex) {
                arrayList.add(0, Integer.valueOf(eCIEncoderSet.getECIValue(inputEdge3.encoderIndex) + 256));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        while (i3 < size) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            i3++;
        }
        return iArr;
    }

    static final class InputEdge {
        private final char c;
        private final int cachedTotalSize;
        private final int encoderIndex;
        private final InputEdge previous;

        private InputEdge(char c, ECIEncoderSet eCIEncoderSet, int i2, InputEdge inputEdge, int i3) {
            char c2 = c == i3 ? (char) 1000 : c;
            this.c = c2;
            this.encoderIndex = i2;
            this.previous = inputEdge;
            int length = c2 == 1000 ? 1 : eCIEncoderSet.encode(c, i2).length;
            length = (inputEdge == null ? 0 : inputEdge.encoderIndex) != i2 ? length + 3 : length;
            this.cachedTotalSize = inputEdge != null ? length + inputEdge.cachedTotalSize : length;
        }

        boolean isFNC1() {
            return this.c == 1000;
        }
    }
}
