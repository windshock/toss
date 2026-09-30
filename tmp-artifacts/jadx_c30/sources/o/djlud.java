package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class djlud implements Closeable {
    private static final int[] IAuthTabCallback;
    private static final int[] onExtraCallback;
    private final onWarmupCompleted IAuthTabCallbackDefault;
    private PAGInterstitialRequest IAuthTabCallbackStub;
    private final InputStream asBinder;
    private boolean asInterface;
    private onExtraCallbackWithResult onTransact;
    private static final short[] onNavigationEvent = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    private static final int[] onExtraCallbackWithResult = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    private static final int[] onWarmupCompleted = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    static class onExtraCallback {
        private final int onExtraCallback;
        onExtraCallback onExtraCallbackWithResult;
        onExtraCallback onNavigationEvent;
        int onWarmupCompleted;

        private onExtraCallback(int i) {
            this.onWarmupCompleted = -1;
            this.onExtraCallback = i;
        }

        void onWarmupCompleted(int i) {
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = null;
            this.onNavigationEvent = null;
        }

        onExtraCallback onExtraCallback() {
            if (this.onExtraCallbackWithResult == null && this.onWarmupCompleted == -1) {
                this.onExtraCallbackWithResult = new onExtraCallback(this.onExtraCallback + 1);
            }
            return this.onExtraCallbackWithResult;
        }

        onExtraCallback onNavigationEvent() {
            if (this.onNavigationEvent == null && this.onWarmupCompleted == -1) {
                this.onNavigationEvent = new onExtraCallback(this.onExtraCallback + 1);
            }
            return this.onNavigationEvent;
        }
    }

    static abstract class onExtraCallbackWithResult {
        abstract boolean IAuthTabCallback();

        abstract int onExtraCallback(byte[] bArr, int i, int i2) throws IOException;

        abstract ul3 onNavigationEvent();

        abstract int onWarmupCompleted() throws IOException;

        private onExtraCallbackWithResult() {
        }
    }

    static class onWarmupCompleted {
        private boolean IAuthTabCallback;
        private final byte[] onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private int onWarmupCompleted;

        private onWarmupCompleted() {
            this(16);
        }

        private onWarmupCompleted(int i) {
            int i2 = 1 << i;
            this.onExtraCallbackWithResult = new byte[i2];
            this.onNavigationEvent = i2 - 1;
        }

        byte onExtraCallbackWithResult(byte b) {
            byte[] bArr = this.onExtraCallbackWithResult;
            int i = this.onWarmupCompleted;
            bArr[i] = b;
            this.onWarmupCompleted = onExtraCallbackWithResult(i);
            return b;
        }

        void onExtraCallback(byte[] bArr, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                onExtraCallbackWithResult(bArr[i3]);
            }
        }

        private int onExtraCallbackWithResult(int i) {
            int i2 = (i + 1) & this.onNavigationEvent;
            if (!this.IAuthTabCallback && i2 < i) {
                this.IAuthTabCallback = true;
            }
            return i2;
        }

        void onWarmupCompleted(int i, int i2, byte[] bArr) {
            if (i > this.onExtraCallbackWithResult.length) {
                throw new IllegalStateException("Illegal distance parameter: " + i);
            }
            int i3 = this.onWarmupCompleted;
            int iOnExtraCallbackWithResult = (i3 - i) & this.onNavigationEvent;
            if (!this.IAuthTabCallback && iOnExtraCallbackWithResult >= i3) {
                throw new IllegalStateException("Attempt to read beyond memory: dist=" + i);
            }
            int i4 = 0;
            while (i4 < i2) {
                bArr[i4] = onExtraCallbackWithResult(this.onExtraCallbackWithResult[iOnExtraCallbackWithResult]);
                i4++;
                iOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnExtraCallbackWithResult);
            }
        }
    }

    class IAuthTabCallback extends onExtraCallbackWithResult {
        private int asBinder;
        private final ul3 asInterface;
        private final onExtraCallback onExtraCallback;
        private byte[] onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private int onTransact;
        private final onExtraCallback onWarmupCompleted;

        IAuthTabCallback(ul3 ul3Var, int[] iArr, int[] iArr2) {
            super();
            this.onExtraCallbackWithResult = showPrivacyActivity.onExtraCallback;
            this.asInterface = ul3Var;
            this.onWarmupCompleted = djlud.onExtraCallbackWithResult(iArr);
            this.onExtraCallback = djlud.onExtraCallbackWithResult(iArr2);
        }

        @Override // o.djlud.onExtraCallbackWithResult
        int onWarmupCompleted() {
            return this.asBinder - this.onTransact;
        }

        private int onExtraCallbackWithResult(byte[] bArr, int i, int i2) {
            int i3 = this.asBinder - this.onTransact;
            if (i3 <= 0) {
                return 0;
            }
            int iMin = Math.min(i2, i3);
            System.arraycopy(this.onExtraCallbackWithResult, this.onTransact, bArr, i, iMin);
            this.onTransact += iMin;
            return iMin;
        }

        private int IAuthTabCallback(byte[] bArr, int i, int i2) throws IOException {
            if (this.onNavigationEvent) {
                return -1;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr, i, i2);
            while (true) {
                if (iOnExtraCallbackWithResult < i2) {
                    int iIAuthTabCallback = djlud.IAuthTabCallback(djlud.this.IAuthTabCallbackStub, this.onWarmupCompleted);
                    if (iIAuthTabCallback >= 256) {
                        if (iIAuthTabCallback > 256) {
                            short s = djlud.onNavigationEvent[iIAuthTabCallback - 257];
                            int iIAuthTabCallback2 = PAGNativeAdData.IAuthTabCallback(s >>> 5, djlud.this.onNavigationEvent(s & 31));
                            int i3 = djlud.onExtraCallbackWithResult[djlud.IAuthTabCallback(djlud.this.IAuthTabCallbackStub, this.onExtraCallback)];
                            int iIAuthTabCallback3 = PAGNativeAdData.IAuthTabCallback(i3 >>> 4, djlud.this.onNavigationEvent(i3 & 15));
                            if (this.onExtraCallbackWithResult.length < iIAuthTabCallback2) {
                                this.onExtraCallbackWithResult = new byte[iIAuthTabCallback2];
                            }
                            this.asBinder = iIAuthTabCallback2;
                            this.onTransact = 0;
                            djlud.this.IAuthTabCallbackDefault.onWarmupCompleted(iIAuthTabCallback3, iIAuthTabCallback2, this.onExtraCallbackWithResult);
                            iOnExtraCallbackWithResult += onExtraCallbackWithResult(bArr, i + iOnExtraCallbackWithResult, i2 - iOnExtraCallbackWithResult);
                        } else {
                            this.onNavigationEvent = true;
                            break;
                        }
                    } else {
                        bArr[iOnExtraCallbackWithResult + i] = djlud.this.IAuthTabCallbackDefault.onExtraCallbackWithResult((byte) iIAuthTabCallback);
                        iOnExtraCallbackWithResult++;
                    }
                } else {
                    break;
                }
            }
            return iOnExtraCallbackWithResult;
        }

        @Override // o.djlud.onExtraCallbackWithResult
        boolean IAuthTabCallback() {
            return !this.onNavigationEvent;
        }

        @Override // o.djlud.onExtraCallbackWithResult
        int onExtraCallback(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            return IAuthTabCallback(bArr, i, i2);
        }

        @Override // o.djlud.onExtraCallbackWithResult
        ul3 onNavigationEvent() {
            return this.onNavigationEvent ? ul3.INITIAL : this.asInterface;
        }
    }

    static class onNavigationEvent extends onExtraCallbackWithResult {
        @Override // o.djlud.onExtraCallbackWithResult
        boolean IAuthTabCallback() {
            return false;
        }

        @Override // o.djlud.onExtraCallbackWithResult
        int onWarmupCompleted() {
            return 0;
        }

        private onNavigationEvent() {
            super();
        }

        @Override // o.djlud.onExtraCallbackWithResult
        int onExtraCallback(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            throw new IllegalStateException("Cannot read in this state");
        }

        @Override // o.djlud.onExtraCallbackWithResult
        ul3 onNavigationEvent() {
            return ul3.INITIAL;
        }
    }

    class onTransact extends onExtraCallbackWithResult {
        private final long IAuthTabCallback;
        private long onExtraCallbackWithResult;

        private onTransact(long j) {
            super();
            this.IAuthTabCallback = j;
        }

        @Override // o.djlud.onExtraCallbackWithResult
        int onWarmupCompleted() throws IOException {
            return (int) Math.min(this.IAuthTabCallback - this.onExtraCallbackWithResult, djlud.this.IAuthTabCallbackStub.onWarmupCompleted() / 8);
        }

        @Override // o.djlud.onExtraCallbackWithResult
        boolean IAuthTabCallback() {
            return this.onExtraCallbackWithResult < this.IAuthTabCallback;
        }

        @Override // o.djlud.onExtraCallbackWithResult
        int onExtraCallback(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            int i4 = 0;
            if (i2 == 0) {
                return 0;
            }
            int iMin = (int) Math.min(this.IAuthTabCallback - this.onExtraCallbackWithResult, i2);
            while (i4 < iMin) {
                if (djlud.this.IAuthTabCallbackStub.onExtraCallbackWithResult() > 0) {
                    bArr[i + i4] = djlud.this.IAuthTabCallbackDefault.onExtraCallbackWithResult((byte) djlud.this.onNavigationEvent(8));
                    i3 = 1;
                } else {
                    int i5 = i + i4;
                    i3 = djlud.this.asBinder.read(bArr, i5, iMin - i4);
                    if (i3 != -1) {
                        djlud.this.IAuthTabCallbackDefault.onExtraCallback(bArr, i5, i3);
                    } else {
                        throw new EOFException("Truncated Deflate64 Stream");
                    }
                }
                this.onExtraCallbackWithResult += i3;
                i4 += i3;
            }
            return iMin;
        }

        @Override // o.djlud.onExtraCallbackWithResult
        ul3 onNavigationEvent() {
            return this.onExtraCallbackWithResult < this.IAuthTabCallback ? ul3.STORED : ul3.INITIAL;
        }
    }

    static {
        int[] iArr = new int[288];
        onExtraCallback = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        IAuthTabCallback = iArr2;
        Arrays.fill(iArr2, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static onExtraCallback onExtraCallbackWithResult(int[] iArr) {
        int[] iArrOnExtraCallback = onExtraCallback(iArr);
        int i = 0;
        onExtraCallback onextracallback = new onExtraCallback(i);
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = i2 - 1;
                int i4 = iArrOnExtraCallback[i3];
                onExtraCallback onExtraCallback2 = onextracallback;
                for (int i5 = i3; i5 >= 0; i5--) {
                    onExtraCallback2 = ((1 << i5) & i4) == 0 ? onExtraCallback2.onExtraCallback() : onExtraCallback2.onNavigationEvent();
                    if (onExtraCallback2 == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                onExtraCallback2.onWarmupCompleted(i);
                iArrOnExtraCallback[i3] = iArrOnExtraCallback[i3] + 1;
            }
            i++;
        }
        return onextracallback;
    }

    private static int[] onExtraCallback(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                throw new IllegalArgumentException("Invalid code " + i + " in literal table");
            }
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        return iArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IAuthTabCallback(PAGInterstitialRequest pAGInterstitialRequest, onExtraCallback onextracallback) throws IOException {
        while (onextracallback != null && onextracallback.onWarmupCompleted == -1) {
            onextracallback = onExtraCallback(pAGInterstitialRequest, 1) == 0 ? onextracallback.onExtraCallbackWithResult : onextracallback.onNavigationEvent;
        }
        if (onextracallback != null) {
            return onextracallback.onWarmupCompleted;
        }
        return -1;
    }

    private static void onExtraCallbackWithResult(PAGInterstitialRequest pAGInterstitialRequest, int[] iArr, int[] iArr2) throws IOException {
        long jOnExtraCallback;
        int iOnExtraCallback = (int) (onExtraCallback(pAGInterstitialRequest, 4) + 4);
        int[] iArr3 = new int[19];
        for (int i = 0; i < iOnExtraCallback; i++) {
            iArr3[onWarmupCompleted[i]] = (int) onExtraCallback(pAGInterstitialRequest, 3);
        }
        onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(iArr3);
        int length = iArr.length + iArr2.length;
        int[] iArr4 = new int[length];
        int i2 = -1;
        int i3 = 0;
        int iOnExtraCallback2 = 0;
        while (i3 < length) {
            if (iOnExtraCallback2 > 0) {
                iArr4[i3] = i2;
                iOnExtraCallback2--;
                i3++;
            } else {
                int iIAuthTabCallback = IAuthTabCallback(pAGInterstitialRequest, onextracallbackOnExtraCallbackWithResult);
                if (iIAuthTabCallback < 16) {
                    iArr4[i3] = iIAuthTabCallback;
                    i3++;
                    i2 = iIAuthTabCallback;
                } else {
                    long j = 3;
                    switch (iIAuthTabCallback) {
                        case 16:
                            iOnExtraCallback2 = (int) (onExtraCallback(pAGInterstitialRequest, 2) + 3);
                            continue;
                        case 17:
                            jOnExtraCallback = onExtraCallback(pAGInterstitialRequest, 3);
                            break;
                        case 18:
                            jOnExtraCallback = onExtraCallback(pAGInterstitialRequest, 7);
                            j = 11;
                            break;
                    }
                    iOnExtraCallback2 = (int) (jOnExtraCallback + j);
                    i2 = 0;
                }
            }
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr.length);
        System.arraycopy(iArr4, iArr.length, iArr2, 0, iArr2.length);
    }

    private static long onExtraCallback(PAGInterstitialRequest pAGInterstitialRequest, int i) throws IOException {
        long jOnExtraCallbackWithResult = pAGInterstitialRequest.onExtraCallbackWithResult(i);
        if (jOnExtraCallbackWithResult != -1) {
            return jOnExtraCallbackWithResult;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    djlud(InputStream inputStream) {
        this.IAuthTabCallbackDefault = new onWarmupCompleted();
        this.IAuthTabCallbackStub = new PAGInterstitialRequest(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.asBinder = inputStream;
        this.onTransact = new onNavigationEvent();
    }

    int onWarmupCompleted() throws IOException {
        return this.onTransact.onWarmupCompleted();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onTransact = new onNavigationEvent();
        this.IAuthTabCallbackStub = null;
    }

    public int onExtraCallback(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            if (this.asInterface && !this.onTransact.IAuthTabCallback()) {
                return -1;
            }
            if (this.onTransact.onNavigationEvent() == ul3.INITIAL) {
                this.asInterface = onNavigationEvent(1) == 1;
                int iOnNavigationEvent = (int) onNavigationEvent(2);
                if (iOnNavigationEvent == 0) {
                    asBinder();
                } else if (iOnNavigationEvent == 1) {
                    this.onTransact = new IAuthTabCallback(ul3.FIXED_CODES, onExtraCallback, IAuthTabCallback);
                } else if (iOnNavigationEvent == 2) {
                    int[][] iArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    this.onTransact = new IAuthTabCallback(ul3.DYNAMIC_CODES, iArrOnExtraCallbackWithResult[0], iArrOnExtraCallbackWithResult[1]);
                } else {
                    throw new IllegalStateException("Unsupported compression: " + iOnNavigationEvent);
                }
            } else {
                int iOnExtraCallback = this.onTransact.onExtraCallback(bArr, i, i2);
                if (iOnExtraCallback != 0) {
                    return iOnExtraCallback;
                }
            }
        }
    }

    long onExtraCallback() {
        return this.IAuthTabCallbackStub.IAuthTabCallbackStub();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long onNavigationEvent(int i) throws IOException {
        return onExtraCallback(this.IAuthTabCallbackStub, i);
    }

    private int[][] onExtraCallbackWithResult() throws IOException {
        int[][] iArr = {new int[(int) (onNavigationEvent(5) + 257)], new int[(int) (onNavigationEvent(5) + 1)]};
        onExtraCallbackWithResult(this.IAuthTabCallbackStub, iArr[0], iArr[1]);
        return iArr;
    }

    private void asBinder() throws IOException {
        this.IAuthTabCallbackStub.onExtraCallback();
        long jOnNavigationEvent = onNavigationEvent(16);
        if ((65535 & (jOnNavigationEvent ^ 65535)) != onNavigationEvent(16)) {
            throw new IllegalStateException("Illegal LEN / NLEN values");
        }
        this.onTransact = new onTransact(jOnNavigationEvent);
    }
}
