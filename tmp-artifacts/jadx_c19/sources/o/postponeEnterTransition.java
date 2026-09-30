package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class postponeEnterTransition {
    protected static final char[] IAuthTabCallback;
    protected static final int[] IAuthTabCallbackDefault;
    protected static final int[] IAuthTabCallbackStub;
    protected static final int[] IAuthTabCallbackStubProxy;
    protected static final int[] IAuthTabCallback_Parcel;
    protected static final int[] asBinder;
    protected static final int[] asInterface;
    protected static final int[] getInterfaceDescriptor;
    protected static final int[] onExtraCallback;
    protected static final char[] onExtraCallbackWithResult;
    protected static final byte[] onNavigationEvent;
    protected static final int[] onTransact;
    protected static final byte[] onWarmupCompleted;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        onExtraCallbackWithResult = charArray;
        IAuthTabCallback = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        onWarmupCompleted = new byte[length];
        onNavigationEvent = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            onWarmupCompleted[i2] = (byte) onExtraCallbackWithResult[i2];
            onNavigationEvent[i2] = (byte) IAuthTabCallback[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        asBinder = iArr;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        onTransact = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        IAuthTabCallbackStub = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        asInterface = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = onTransact;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        IAuthTabCallbackDefault = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        getInterfaceDescriptor = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        IAuthTabCallback_Parcel = iArr8;
        int[] iArrCopyOf = Arrays.copyOf(iArr8, 128);
        IAuthTabCallbackStubProxy = iArrCopyOf;
        iArrCopyOf[47] = 47;
        int[] iArr9 = new int[256];
        onExtraCallback = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            onExtraCallback[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = onExtraCallback;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static int[] onNavigationEvent() {
        return asBinder;
    }

    public static int[] IAuthTabCallback() {
        return onTransact;
    }

    public static int[] onExtraCallbackWithResult() {
        return IAuthTabCallbackStub;
    }

    public static int[] IAuthTabCallbackStub() {
        return asInterface;
    }

    public static int[] onExtraCallback() {
        return IAuthTabCallbackDefault;
    }

    public static int[] onWarmupCompleted() {
        return IAuthTabCallback_Parcel;
    }

    public static int[] onExtraCallbackWithResult(int i2, boolean z) {
        if (i2 != 34) {
            return onExtraCallback.onWarmupCompleted.onExtraCallbackWithResult(i2, z);
        }
        if (z) {
            return IAuthTabCallbackStubProxy;
        }
        return IAuthTabCallback_Parcel;
    }

    public static int onExtraCallback(int i2) {
        return onExtraCallback[i2 & OggPageHeader.MAX_SEGMENT_COUNT];
    }

    public static char onWarmupCompleted(int i2) {
        return onExtraCallbackWithResult[i2];
    }

    public static void IAuthTabCallback(StringBuilder sb, String str) {
        int[] iArr = IAuthTabCallback_Parcel;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb.append(cCharAt);
            } else {
                sb.append('\\');
                int i3 = iArr[cCharAt];
                if (i3 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = onExtraCallbackWithResult;
                    sb.append(cArr[cCharAt >> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static char[] onExtraCallback(boolean z) {
        return (char[]) (z ? onExtraCallbackWithResult.clone() : IAuthTabCallback.clone());
    }

    public static byte[] onNavigationEvent(boolean z) {
        return (byte[]) (z ? onWarmupCompleted.clone() : onNavigationEvent.clone());
    }

    static class onExtraCallback {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();
        private int[][] IAuthTabCallback = new int[128][];
        private int[][] onExtraCallback = new int[128][];

        private onExtraCallback() {
        }

        public int[] onExtraCallback(int i2) {
            int[] iArrCopyOf = this.IAuthTabCallback[i2];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(postponeEnterTransition.IAuthTabCallback_Parcel, 128);
                if (iArrCopyOf[i2] == 0) {
                    iArrCopyOf[i2] = -1;
                }
                this.IAuthTabCallback[i2] = iArrCopyOf;
            }
            return iArrCopyOf;
        }

        public int[] onExtraCallbackWithResult(int i2, boolean z) {
            if (!z) {
                return onExtraCallback(i2);
            }
            int[] iArr = this.onExtraCallback[i2];
            if (iArr != null) {
                return iArr;
            }
            int[] iArrOnExtraCallback = onExtraCallback(i2);
            iArrOnExtraCallback[47] = 47;
            this.onExtraCallback[i2] = iArrOnExtraCallback;
            return iArrOnExtraCallback;
        }
    }
}
