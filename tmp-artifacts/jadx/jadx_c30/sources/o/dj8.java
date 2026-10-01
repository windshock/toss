package o;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.compressors.bzip2.Rand;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dj8 extends dj18 {
    private int IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private int access000;
    private int access100;
    private IAuthTabCallback asBinder;
    private final djlt asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private char onActivityResized;
    private boolean onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onMinimized;
    private int onNavigationEvent;
    private int onPostMessage;
    private int onTransact;
    private PAGInterstitialRequest onWarmupCompleted;
    private int readTypedObject;
    private int writeTypedObject;

    static final class IAuthTabCallback {
        final int[] IAuthTabCallback;
        final byte[] IAuthTabCallbackDefault;
        final int[][] IAuthTabCallbackStub;
        int[] IAuthTabCallbackStubProxy;
        final char[][] access100;
        final byte[] asInterface;
        final int[][] onExtraCallbackWithResult;
        final int[][] onNavigationEvent;
        final int[] onTransact;
        final char[] onWarmupCompleted;
        final boolean[] onExtraCallback = new boolean[256];
        final byte[] getInterfaceDescriptor = new byte[256];
        final byte[] asBinder = new byte[18002];
        final byte[] IAuthTabCallback_Parcel = new byte[18002];
        final int[] access000 = new int[256];

        IAuthTabCallback(int i) {
            Class cls = Integer.TYPE;
            this.onExtraCallbackWithResult = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.onNavigationEvent = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.IAuthTabCallbackStub = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
            this.onTransact = new int[6];
            this.IAuthTabCallback = new int[257];
            this.onWarmupCompleted = new char[256];
            this.access100 = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
            this.IAuthTabCallbackDefault = new byte[6];
            this.asInterface = new byte[i * 100000];
        }

        int[] onExtraCallback(int i) {
            int[] iArr = this.IAuthTabCallbackStubProxy;
            if (iArr != null && iArr.length >= i) {
                return iArr;
            }
            int[] iArr2 = new int[i];
            this.IAuthTabCallbackStubProxy = iArr2;
            return iArr2;
        }
    }

    private static boolean onExtraCallbackWithResult(PAGInterstitialRequest pAGInterstitialRequest) throws IOException {
        return onExtraCallback(pAGInterstitialRequest, 1) != 0;
    }

    private static int onNavigationEvent(PAGInterstitialRequest pAGInterstitialRequest) throws IOException {
        return onExtraCallback(pAGInterstitialRequest, 32);
    }

    private static char onExtraCallback(PAGInterstitialRequest pAGInterstitialRequest) throws IOException {
        return (char) onExtraCallback(pAGInterstitialRequest, 8);
    }

    private static int onExtraCallback(PAGInterstitialRequest pAGInterstitialRequest, int i) throws IOException {
        long jOnExtraCallbackWithResult = pAGInterstitialRequest.onExtraCallbackWithResult(i);
        if (jOnExtraCallbackWithResult >= 0) {
            return (int) jOnExtraCallbackWithResult;
        }
        throw new IOException("Unexpected end of stream");
    }

    private static void onExtraCallback(int i, int i2, String str) throws IOException {
        if (i < 0) {
            throw new IOException("Corrupted input, " + str + " value negative");
        }
        if (i < i2) {
            return;
        }
        throw new IOException("Corrupted input, " + str + " value too big");
    }

    private static void onWarmupCompleted(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 <= i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (cArr[i7] == i6) {
                    iArr3[i5] = i7;
                    i5++;
                }
            }
        }
        int i8 = 23;
        while (true) {
            i8--;
            if (i8 <= 0) {
                break;
            }
            iArr2[i8] = 0;
            iArr[i8] = 0;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            char c = cArr[i9];
            onExtraCallback(c, 258, "length");
            int i10 = c + 1;
            iArr2[i10] = iArr2[i10] + 1;
        }
        int i11 = iArr2[0];
        for (int i12 = 1; i12 < 23; i12++) {
            i11 += iArr2[i12];
            iArr2[i12] = i11;
        }
        int i13 = iArr2[i];
        int i14 = i;
        while (i14 <= i2) {
            int i15 = i14 + 1;
            int i16 = iArr2[i15];
            int i17 = i4 + (i16 - i13);
            iArr[i14] = i17 - 1;
            i4 = i17 << 1;
            i14 = i15;
            i13 = i16;
        }
        while (true) {
            int i18 = i + 1;
            if (i18 > i2) {
                return;
            }
            iArr2[i18] = ((iArr[i] + 1) << 1) - iArr2[i18];
            i = i18;
        }
    }

    public dj8(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public dj8(InputStream inputStream, boolean z) throws IOException {
        this.asInterface = new djlt();
        this.IAuthTabCallbackStub = 1;
        this.onWarmupCompleted = new PAGInterstitialRequest(inputStream == System.in ? new getAdLogoView(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.IAuthTabCallbackDefault = z;
        onExtraCallback(true);
        asBinder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void close() throws IOException {
        PAGInterstitialRequest pAGInterstitialRequest = this.onWarmupCompleted;
        if (pAGInterstitialRequest != null) {
            try {
                pAGInterstitialRequest.close();
            } finally {
                this.asBinder = null;
                this.onWarmupCompleted = null;
            }
        }
    }

    private boolean onWarmupCompleted() throws IOException {
        int iOnNavigationEvent = onNavigationEvent(this.onWarmupCompleted);
        this.IAuthTabCallback_Parcel = iOnNavigationEvent;
        this.IAuthTabCallbackStub = 0;
        this.asBinder = null;
        if (iOnNavigationEvent == this.onExtraCallbackWithResult) {
            return (this.IAuthTabCallbackDefault && onExtraCallback(false)) ? false : true;
        }
        throw new IOException("BZip2 CRC error");
    }

    private void onWarmupCompleted(int i, int i2) throws IOException {
        IAuthTabCallback iAuthTabCallback = this.asBinder;
        char[][] cArr = iAuthTabCallback.access100;
        int[] iArr = iAuthTabCallback.onTransact;
        int[][] iArr2 = iAuthTabCallback.onExtraCallbackWithResult;
        int[][] iArr3 = iAuthTabCallback.onNavigationEvent;
        int[][] iArr4 = iAuthTabCallback.IAuthTabCallbackStub;
        for (int i3 = 0; i3 < i2; i3++) {
            char[] cArr2 = cArr[i3];
            char c = ' ';
            int i4 = i;
            char c2 = 0;
            while (true) {
                i4--;
                if (i4 >= 0) {
                    char c3 = cArr2[i4];
                    if (c3 > c2) {
                        c2 = c3;
                    }
                    if (c3 < c) {
                        c = c3;
                    }
                }
            }
            onWarmupCompleted(iArr2[i3], iArr3[i3], iArr4[i3], cArr[i3], c, c2, i);
            iArr[i3] = c;
        }
    }

    private void onNavigationEvent() throws IOException {
        int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult();
        this.IAuthTabCallback = iOnExtraCallbackWithResult;
        int i = this.getInterfaceDescriptor;
        if (i != iOnExtraCallbackWithResult) {
            int i2 = this.IAuthTabCallback_Parcel;
            this.onExtraCallbackWithResult = ((i2 << 1) | (i2 >>> 31)) ^ i;
            throw new IOException("BZip2 CRC error");
        }
        int i3 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = iOnExtraCallbackWithResult ^ ((i3 << 1) | (i3 >>> 31));
    }

    private void onExtraCallback() throws IOException {
        int i;
        byte[] bArr;
        char c;
        int i2;
        dj8 dj8Var = this;
        PAGInterstitialRequest pAGInterstitialRequest = dj8Var.onWarmupCompleted;
        dj8Var.IAuthTabCallbackStubProxy = onExtraCallback(pAGInterstitialRequest, 24);
        IAuthTabCallbackStub();
        IAuthTabCallback iAuthTabCallback = dj8Var.asBinder;
        byte[] bArr2 = iAuthTabCallback.asInterface;
        int[] iArr = iAuthTabCallback.access000;
        byte[] bArr3 = iAuthTabCallback.asBinder;
        byte[] bArr4 = iAuthTabCallback.getInterfaceDescriptor;
        char[] cArr = iAuthTabCallback.onWarmupCompleted;
        int[] iArr2 = iAuthTabCallback.onTransact;
        int[][] iArr3 = iAuthTabCallback.onExtraCallbackWithResult;
        int[][] iArr4 = iAuthTabCallback.onNavigationEvent;
        int[][] iArr5 = iAuthTabCallback.IAuthTabCallbackStub;
        int i3 = dj8Var.onNavigationEvent * 100000;
        int i4 = 256;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            cArr[i4] = (char) i4;
            iArr[i4] = 0;
        }
        int i5 = dj8Var.access000 + 1;
        int iIAuthTabCallback = IAuthTabCallback();
        int i6 = bArr3[0] & 255;
        onExtraCallback(i6, 6, "zt");
        int[] iArr6 = iArr4[i6];
        int[] iArr7 = iArr3[i6];
        int[] iArr8 = iArr5[i6];
        int i7 = iArr2[i6];
        int i8 = iIAuthTabCallback;
        int i9 = 49;
        int i10 = -1;
        int i11 = 0;
        while (i8 != i5) {
            int i12 = i5;
            PAGInterstitialRequest pAGInterstitialRequest2 = pAGInterstitialRequest;
            if (i8 == 0 || i8 == 1) {
                int[] iArr9 = iArr2;
                int i13 = i8;
                int i14 = i3;
                byte[] bArr5 = bArr2;
                i8 = i13;
                int i15 = -1;
                int i16 = i9;
                int i17 = i11;
                int i18 = i7;
                int[] iArr10 = iArr8;
                int[] iArr11 = iArr7;
                int[] iArr12 = iArr6;
                int i19 = 1;
                while (true) {
                    if (i8 != 0) {
                        i = i10;
                        if (i8 != 1) {
                            break;
                        } else {
                            i15 += i19 << 1;
                        }
                    } else {
                        i15 += i19;
                        i = i10;
                    }
                    if (i16 == 0) {
                        int i20 = i17 + 1;
                        onExtraCallback(i20, 18002, "groupNo");
                        int i21 = bArr3[i20] & 255;
                        bArr = bArr3;
                        onExtraCallback(i21, 6, "zt");
                        iArr12 = iArr4[i21];
                        iArr11 = iArr3[i21];
                        iArr10 = iArr5[i21];
                        i18 = iArr9[i21];
                        i17 = i20;
                        i16 = 49;
                    } else {
                        bArr = bArr3;
                        i16--;
                    }
                    int i22 = i18;
                    onExtraCallback(i22, 258, "zn");
                    int iOnExtraCallback = onExtraCallback(pAGInterstitialRequest2, i22);
                    int i23 = i22;
                    while (iOnExtraCallback > iArr11[i23]) {
                        int i24 = i23 + 1;
                        onExtraCallback(i24, 258, "zn");
                        iOnExtraCallback = (iOnExtraCallback << 1) | onExtraCallback(pAGInterstitialRequest2, 1);
                        i23 = i24;
                        iArr5 = iArr5;
                    }
                    int i25 = iOnExtraCallback - iArr12[i23];
                    onExtraCallback(i25, 258, "zvec");
                    i19 <<= 1;
                    i8 = iArr10[i25];
                    i18 = i22;
                    i10 = i;
                    bArr3 = bArr;
                    iArr5 = iArr5;
                }
                int[][] iArr13 = iArr5;
                byte[] bArr6 = bArr3;
                onExtraCallback(i15, this.asBinder.asInterface.length, "s");
                char c2 = cArr[0];
                onExtraCallback(c2, 256, "yy");
                byte b = bArr4[c2];
                int i26 = b & 255;
                iArr[i26] = iArr[i26] + i15 + 1;
                int i27 = i + 1;
                int i28 = i15 + i27;
                onExtraCallback(i28, this.asBinder.asInterface.length, "lastShadow");
                Arrays.fill(bArr5, i27, i28 + 1, b);
                if (i28 >= i14) {
                    throw new IOException("Block overrun while expanding RLE in MTF, " + i28 + " exceeds " + i14);
                }
                i10 = i28;
                pAGInterstitialRequest = pAGInterstitialRequest2;
                bArr2 = bArr5;
                iArr6 = iArr12;
                iArr7 = iArr11;
                iArr8 = iArr10;
                i7 = i18;
                i11 = i17;
                i5 = i12;
                i9 = i16;
                iArr2 = iArr9;
                iArr5 = iArr13;
                i3 = i14;
                dj8Var = this;
                bArr3 = bArr6;
            } else {
                i10++;
                if (i10 >= i3) {
                    throw new IOException("Block overrun in MTF, " + i10 + " exceeds " + i3);
                }
                int i29 = i3;
                onExtraCallback(i8, 257, "nextSym");
                int i30 = i8 - 1;
                char c3 = cArr[i30];
                int[] iArr14 = iArr2;
                onExtraCallback(c3, 256, "yy");
                byte b2 = bArr4[c3];
                int i31 = b2 & 255;
                iArr[i31] = iArr[i31] + 1;
                bArr2[i10] = b2;
                if (i8 <= 16) {
                    while (i30 > 0) {
                        int i32 = i30 - 1;
                        cArr[i30] = cArr[i32];
                        i30 = i32;
                    }
                    c = 0;
                } else {
                    c = 0;
                    System.arraycopy(cArr, 0, cArr, 1, i30);
                }
                cArr[c] = c3;
                if (i9 == 0) {
                    int i33 = i11 + 1;
                    onExtraCallback(i33, 18002, "groupNo");
                    int i34 = bArr3[i33] & 255;
                    onExtraCallback(i34, 6, "zt");
                    int[] iArr15 = iArr4[i34];
                    int[] iArr16 = iArr3[i34];
                    int[] iArr17 = iArr5[i34];
                    i2 = iArr14[i34];
                    i11 = i33;
                    iArr6 = iArr15;
                    iArr7 = iArr16;
                    iArr8 = iArr17;
                    i9 = 49;
                } else {
                    i9--;
                    i2 = i7;
                }
                onExtraCallback(i2, 258, "zn");
                int iOnExtraCallback2 = onExtraCallback(pAGInterstitialRequest2, i2);
                int i35 = i2;
                while (iOnExtraCallback2 > iArr7[i35]) {
                    i35++;
                    onExtraCallback(i35, 258, "zn");
                    iOnExtraCallback2 = (iOnExtraCallback2 << 1) | onExtraCallback(pAGInterstitialRequest2, 1);
                }
                int i36 = iOnExtraCallback2 - iArr6[i35];
                onExtraCallback(i36, 258, "zvec");
                i8 = iArr8[i36];
                dj8Var = this;
                i7 = i2;
                pAGInterstitialRequest = pAGInterstitialRequest2;
                i5 = i12;
                i3 = i29;
                iArr2 = iArr14;
            }
        }
        dj8Var.onTransact = i10;
    }

    private int IAuthTabCallback() throws IOException {
        IAuthTabCallback iAuthTabCallback = this.asBinder;
        int i = iAuthTabCallback.asBinder[0] & 255;
        onExtraCallback(i, 6, "zt");
        int[] iArr = iAuthTabCallback.onExtraCallbackWithResult[i];
        int i2 = iAuthTabCallback.onTransact[i];
        onExtraCallback(i2, 258, "zn");
        int iOnExtraCallback = onExtraCallback(this.onWarmupCompleted, i2);
        while (iOnExtraCallback > iArr[i2]) {
            i2++;
            onExtraCallback(i2, 258, "zn");
            iOnExtraCallback = (iOnExtraCallback << 1) | onExtraCallback(this.onWarmupCompleted, 1);
        }
        int i3 = iOnExtraCallback - iAuthTabCallback.onNavigationEvent[i][i2];
        onExtraCallback(i3, 258, "zvec");
        return iAuthTabCallback.IAuthTabCallbackStub[i][i3];
    }

    private boolean onExtraCallback(boolean z) throws IOException {
        PAGInterstitialRequest pAGInterstitialRequest = this.onWarmupCompleted;
        if (pAGInterstitialRequest == null) {
            throw new IOException("No InputStream");
        }
        if (!z) {
            pAGInterstitialRequest.onTransact();
        }
        int iIAuthTabCallback = IAuthTabCallback(this.onWarmupCompleted);
        if (iIAuthTabCallback == -1 && !z) {
            return false;
        }
        int iIAuthTabCallback2 = IAuthTabCallback(this.onWarmupCompleted);
        int iIAuthTabCallback3 = IAuthTabCallback(this.onWarmupCompleted);
        if (iIAuthTabCallback != 66 || iIAuthTabCallback2 != 90 || iIAuthTabCallback3 != 104) {
            throw new IOException(z ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        int iIAuthTabCallback4 = IAuthTabCallback(this.onWarmupCompleted);
        if (iIAuthTabCallback4 < 49 || iIAuthTabCallback4 > 57) {
            throw new IOException("BZip2 block size is invalid");
        }
        this.onNavigationEvent = iIAuthTabCallback4 - 48;
        this.onExtraCallbackWithResult = 0;
        return true;
    }

    private void asBinder() throws IOException {
        PAGInterstitialRequest pAGInterstitialRequest = this.onWarmupCompleted;
        do {
            char cOnExtraCallback = onExtraCallback(pAGInterstitialRequest);
            char cOnExtraCallback2 = onExtraCallback(pAGInterstitialRequest);
            char cOnExtraCallback3 = onExtraCallback(pAGInterstitialRequest);
            char cOnExtraCallback4 = onExtraCallback(pAGInterstitialRequest);
            char cOnExtraCallback5 = onExtraCallback(pAGInterstitialRequest);
            char cOnExtraCallback6 = onExtraCallback(pAGInterstitialRequest);
            if (cOnExtraCallback != 23 || cOnExtraCallback2 != 'r' || cOnExtraCallback3 != 'E' || cOnExtraCallback4 != '8' || cOnExtraCallback5 != 'P' || cOnExtraCallback6 != 144) {
                if (cOnExtraCallback != '1' || cOnExtraCallback2 != 'A' || cOnExtraCallback3 != 'Y' || cOnExtraCallback4 != '&' || cOnExtraCallback5 != 'S' || cOnExtraCallback6 != 'Y') {
                    this.IAuthTabCallbackStub = 0;
                    throw new IOException("Bad block header");
                }
                this.getInterfaceDescriptor = onNavigationEvent(pAGInterstitialRequest);
                this.onExtraCallback = onExtraCallback(pAGInterstitialRequest, 1) == 1;
                if (this.asBinder == null) {
                    this.asBinder = new IAuthTabCallback(this.onNavigationEvent);
                }
                onExtraCallback();
                this.asInterface.IAuthTabCallback();
                this.IAuthTabCallbackStub = 1;
                return;
            }
        } while (!onWarmupCompleted());
    }

    private void IAuthTabCallbackDefault() {
        IAuthTabCallback iAuthTabCallback = this.asBinder;
        boolean[] zArr = iAuthTabCallback.onExtraCallback;
        byte[] bArr = iAuthTabCallback.getInterfaceDescriptor;
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (zArr[i2]) {
                bArr[i] = (byte) i2;
                i++;
            }
        }
        this.access000 = i;
    }

    public int read() throws IOException {
        if (this.onWarmupCompleted != null) {
            int iOnTransact = onTransact();
            onExtraCallbackWithResult(iOnTransact < 0 ? -1 : 1);
            return iOnTransact;
        }
        throw new IOException("Stream closed");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
        }
        if (this.onWarmupCompleted == null) {
            throw new IOException("Stream closed");
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iOnTransact = onTransact();
            if (iOnTransact < 0) {
                break;
            }
            bArr[i4] = (byte) iOnTransact;
            onExtraCallbackWithResult(1);
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    private int onTransact() throws IOException {
        switch (this.IAuthTabCallbackStub) {
            case 0:
                return -1;
            case 1:
                return asInterface();
            case 2:
                throw new IllegalStateException();
            case 3:
                return IAuthTabCallbackStubProxy();
            case 4:
                return extraCallback();
            case 5:
                throw new IllegalStateException();
            case 6:
                return IAuthTabCallback_Parcel();
            case 7:
                return getInterfaceDescriptor();
            default:
                throw new IllegalStateException();
        }
    }

    private int IAuthTabCallback(PAGInterstitialRequest pAGInterstitialRequest) throws IOException {
        return (int) pAGInterstitialRequest.onExtraCallbackWithResult(8);
    }

    private void IAuthTabCallbackStub() throws IOException {
        PAGInterstitialRequest pAGInterstitialRequest = this.onWarmupCompleted;
        IAuthTabCallback iAuthTabCallback = this.asBinder;
        boolean[] zArr = iAuthTabCallback.onExtraCallback;
        byte[] bArr = iAuthTabCallback.IAuthTabCallbackDefault;
        byte[] bArr2 = iAuthTabCallback.asBinder;
        byte[] bArr3 = iAuthTabCallback.IAuthTabCallback_Parcel;
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            if (onExtraCallbackWithResult(pAGInterstitialRequest)) {
                i |= 1 << i2;
            }
        }
        Arrays.fill(zArr, false);
        for (int i3 = 0; i3 < 16; i3++) {
            if (((1 << i3) & i) != 0) {
                for (int i4 = 0; i4 < 16; i4++) {
                    if (onExtraCallbackWithResult(pAGInterstitialRequest)) {
                        zArr[(i3 << 4) + i4] = true;
                    }
                }
            }
        }
        IAuthTabCallbackDefault();
        int i5 = this.access000 + 2;
        int iOnExtraCallback = onExtraCallback(pAGInterstitialRequest, 3);
        int iOnExtraCallback2 = onExtraCallback(pAGInterstitialRequest, 15);
        if (iOnExtraCallback2 < 0) {
            throw new IOException("Corrupted input, nSelectors value negative");
        }
        onExtraCallback(i5, 259, "alphaSize");
        onExtraCallback(iOnExtraCallback, 7, "nGroups");
        for (int i6 = 0; i6 < iOnExtraCallback2; i6++) {
            int i7 = 0;
            while (onExtraCallbackWithResult(pAGInterstitialRequest)) {
                i7++;
            }
            if (i6 < 18002) {
                bArr3[i6] = (byte) i7;
            }
        }
        int iMin = Math.min(iOnExtraCallback2, 18002);
        int i8 = iOnExtraCallback;
        while (true) {
            i8--;
            if (i8 < 0) {
                break;
            } else {
                bArr[i8] = (byte) i8;
            }
        }
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = bArr3[i9] & 255;
            onExtraCallback(i10, 6, "selectorMtf");
            byte b = bArr[i10];
            while (i10 > 0) {
                bArr[i10] = bArr[i10 - 1];
                i10--;
            }
            bArr[0] = b;
            bArr2[i9] = b;
        }
        char[][] cArr = iAuthTabCallback.access100;
        for (int i11 = 0; i11 < iOnExtraCallback; i11++) {
            int iOnExtraCallback3 = onExtraCallback(pAGInterstitialRequest, 5);
            char[] cArr2 = cArr[i11];
            for (int i12 = 0; i12 < i5; i12++) {
                while (onExtraCallbackWithResult(pAGInterstitialRequest)) {
                    iOnExtraCallback3 += onExtraCallbackWithResult(pAGInterstitialRequest) ? -1 : 1;
                }
                cArr2[i12] = (char) iOnExtraCallback3;
            }
        }
        onWarmupCompleted(i5, iOnExtraCallback);
    }

    private int asInterface() throws IOException {
        IAuthTabCallback iAuthTabCallback;
        if (this.IAuthTabCallbackStub == 0 || (iAuthTabCallback = this.asBinder) == null) {
            return -1;
        }
        int[] iArr = iAuthTabCallback.IAuthTabCallback;
        int i = this.onTransact + 1;
        int[] iArrOnExtraCallback = iAuthTabCallback.onExtraCallback(i);
        IAuthTabCallback iAuthTabCallback2 = this.asBinder;
        byte[] bArr = iAuthTabCallback2.asInterface;
        iArr[0] = 0;
        System.arraycopy(iAuthTabCallback2.access000, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.onTransact;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            onExtraCallback(i7, i, "tt index");
            iArrOnExtraCallback[i7] = i5;
        }
        int i8 = this.IAuthTabCallbackStubProxy;
        if (i8 < 0 || i8 >= iArrOnExtraCallback.length) {
            throw new IOException("Stream corrupted");
        }
        this.onPostMessage = iArrOnExtraCallback[i8];
        this.readTypedObject = 0;
        this.extraCallbackWithResult = 0;
        this.access100 = 256;
        if (this.onExtraCallback) {
            this.writeTypedObject = 0;
            this.onMinimized = 0;
            return access100();
        }
        return access000();
    }

    private int access000() throws IOException {
        if (this.extraCallbackWithResult <= this.onTransact) {
            this.extraCallback = this.access100;
            IAuthTabCallback iAuthTabCallback = this.asBinder;
            byte[] bArr = iAuthTabCallback.asInterface;
            int i = this.onPostMessage;
            int i2 = bArr[i] & 255;
            this.access100 = i2;
            onExtraCallback(i, iAuthTabCallback.IAuthTabCallbackStubProxy.length, "su_tPos");
            this.onPostMessage = this.asBinder.IAuthTabCallbackStubProxy[this.onPostMessage];
            this.extraCallbackWithResult++;
            this.IAuthTabCallbackStub = 6;
            this.asInterface.onExtraCallbackWithResult(i2);
            return i2;
        }
        this.IAuthTabCallbackStub = 5;
        onNavigationEvent();
        asBinder();
        return asInterface();
    }

    private int IAuthTabCallback_Parcel() throws IOException {
        if (this.access100 != this.extraCallback) {
            this.readTypedObject = 1;
            return access000();
        }
        int i = this.readTypedObject + 1;
        this.readTypedObject = i;
        if (i >= 4) {
            onExtraCallback(this.onPostMessage, this.asBinder.asInterface.length, "su_tPos");
            IAuthTabCallback iAuthTabCallback = this.asBinder;
            byte[] bArr = iAuthTabCallback.asInterface;
            int i2 = this.onPostMessage;
            this.onActivityResized = (char) (bArr[i2] & 255);
            this.onPostMessage = iAuthTabCallback.IAuthTabCallbackStubProxy[i2];
            this.ICustomTabsCallback = 0;
            return getInterfaceDescriptor();
        }
        return access000();
    }

    private int getInterfaceDescriptor() throws IOException {
        if (this.ICustomTabsCallback < this.onActivityResized) {
            int i = this.access100;
            this.asInterface.onExtraCallbackWithResult(i);
            this.ICustomTabsCallback++;
            this.IAuthTabCallbackStub = 7;
            return i;
        }
        this.extraCallbackWithResult++;
        this.readTypedObject = 0;
        return access000();
    }

    private int access100() throws IOException {
        if (this.extraCallbackWithResult <= this.onTransact) {
            this.extraCallback = this.access100;
            IAuthTabCallback iAuthTabCallback = this.asBinder;
            byte[] bArr = iAuthTabCallback.asInterface;
            int i = this.onPostMessage;
            byte b = bArr[i];
            onExtraCallback(i, iAuthTabCallback.IAuthTabCallbackStubProxy.length, "su_tPos");
            this.onPostMessage = this.asBinder.IAuthTabCallbackStubProxy[this.onPostMessage];
            int i2 = this.writeTypedObject;
            if (i2 == 0) {
                this.writeTypedObject = Rand.onWarmupCompleted(this.onMinimized) - 1;
                int i3 = this.onMinimized + 1;
                this.onMinimized = i3;
                if (i3 == 512) {
                    this.onMinimized = 0;
                }
            } else {
                this.writeTypedObject = i2 - 1;
            }
            int i4 = (b & 255) ^ (this.writeTypedObject == 1 ? 1 : 0);
            this.access100 = i4;
            this.extraCallbackWithResult++;
            this.IAuthTabCallbackStub = 3;
            this.asInterface.onExtraCallbackWithResult(i4);
            return i4;
        }
        onNavigationEvent();
        asBinder();
        return asInterface();
    }

    private int IAuthTabCallbackStubProxy() throws IOException {
        if (this.access100 != this.extraCallback) {
            this.IAuthTabCallbackStub = 2;
            this.readTypedObject = 1;
            return access100();
        }
        int i = this.readTypedObject + 1;
        this.readTypedObject = i;
        if (i < 4) {
            this.IAuthTabCallbackStub = 2;
            return access100();
        }
        IAuthTabCallback iAuthTabCallback = this.asBinder;
        byte[] bArr = iAuthTabCallback.asInterface;
        int i2 = this.onPostMessage;
        this.onActivityResized = (char) (bArr[i2] & 255);
        onExtraCallback(i2, iAuthTabCallback.IAuthTabCallbackStubProxy.length, "su_tPos");
        this.onPostMessage = this.asBinder.IAuthTabCallbackStubProxy[this.onPostMessage];
        int i3 = this.writeTypedObject;
        if (i3 == 0) {
            this.writeTypedObject = Rand.onWarmupCompleted(this.onMinimized) - 1;
            int i4 = this.onMinimized + 1;
            this.onMinimized = i4;
            if (i4 == 512) {
                this.onMinimized = 0;
            }
        } else {
            this.writeTypedObject = i3 - 1;
        }
        this.ICustomTabsCallback = 0;
        this.IAuthTabCallbackStub = 4;
        if (this.writeTypedObject == 1) {
            this.onActivityResized = (char) (this.onActivityResized ^ 1);
        }
        return extraCallback();
    }

    private int extraCallback() throws IOException {
        if (this.ICustomTabsCallback < this.onActivityResized) {
            this.asInterface.onExtraCallbackWithResult(this.access100);
            this.ICustomTabsCallback++;
            return this.access100;
        }
        this.IAuthTabCallbackStub = 2;
        this.extraCallbackWithResult++;
        this.readTypedObject = 0;
        return access100();
    }
}
