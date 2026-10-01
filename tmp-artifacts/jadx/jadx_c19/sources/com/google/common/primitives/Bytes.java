package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@ElementTypesAreNonnullByDefault
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Bytes {
    public static int hashCode(byte b) {
        return b;
    }

    private Bytes() {
    }

    public static boolean contains(byte[] bArr, byte b) {
        for (byte b2 : bArr) {
            if (b2 == b) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(byte[] bArr, byte b) {
        return indexOf(bArr, b, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] bArr, byte b, int i2, int i3) {
        while (i2 < i3) {
            if (bArr[i2] == b) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(byte[] bArr, byte[] bArr2) {
        Preconditions.checkNotNull(bArr, "array");
        Preconditions.checkNotNull(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        int i2 = 0;
        while (i2 < (bArr.length - bArr2.length) + 1) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i2 + i3] != bArr2[i3]) {
                    break;
                }
            }
            return i2;
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte b) {
        return lastIndexOf(bArr, b, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] bArr, byte b, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (bArr[i4] == b) {
                return i4;
            }
        }
        return -1;
    }

    public static byte[] concat(byte[]... bArr) {
        long length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[checkNoOverflow(length)];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    private static int checkNoOverflow(long j) {
        int i2 = (int) j;
        Preconditions.checkArgument(j == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i2;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i2, int i3) {
        Preconditions.checkArgument(i2 >= 0, "Invalid minLength: %s", i2);
        Preconditions.checkArgument(i3 >= 0, "Invalid padding: %s", i3);
        return bArr.length < i2 ? Arrays.copyOf(bArr, i2 + i3) : bArr;
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).toByteArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = ((Number) Preconditions.checkNotNull(array[i2])).byteValue();
        }
        return bArr;
    }

    public static List<Byte> asList(byte... bArr) {
        if (bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new ByteArrayAsList(bArr);
    }

    public static void reverse(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static void reverse(byte[] bArr, int i2, int i3) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i2, i3, bArr.length);
        while (true) {
            i3--;
            if (i2 >= i3) {
                return;
            }
            byte b = bArr[i2];
            bArr[i2] = bArr[i3];
            bArr[i3] = b;
            i2++;
        }
    }

    public static void rotate(byte[] bArr, int i2) {
        rotate(bArr, i2, 0, bArr.length);
    }

    public static void rotate(byte[] bArr, int i2, int i3, int i4) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i3, i4, bArr.length);
        if (bArr.length > 1) {
            int i5 = i4 - i3;
            int i6 = (-i2) % i5;
            if (i6 < 0) {
                i6 += i5;
            }
            int i7 = i6 + i3;
            if (i7 == i3) {
                return;
            }
            reverse(bArr, i3, i7);
            reverse(bArr, i7, i4);
            reverse(bArr, i3, i4);
        }
    }
}
