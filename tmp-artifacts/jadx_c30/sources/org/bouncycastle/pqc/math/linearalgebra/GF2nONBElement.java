package org.bouncycastle.pqc.math.linearalgebra;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GF2nONBElement extends GF2nElement {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static final int MAXLONG = 64;
    private static final long[] mBitmask;
    private static final int[] mIBY64;
    private static final long[] mMaxmask;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private int mBit;
    private int mLength;
    private long[] mPol;

    static {
        onExtraCallback();
        mBitmask = new long[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
        mMaxmask = new long[]{1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, BodyPartID.bodyIdMax, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
        mIBY64 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int i = onExtraCallback + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i = this.mLength;
        long[] jArr = new long[i];
        this.mPol = jArr;
        int i2 = 0;
        if (i <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
            int i3 = IAuthTabCallback + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        while (i2 < this.mLength - 1) {
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                this.mPol[i2] = secureRandom.nextLong();
                i2 += 7;
            } else {
                this.mPol[i2] = secureRandom.nextLong();
                i2++;
            }
            int i5 = 2 % 2;
        }
        this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength;
        long[] jArr;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            oNBLength = gF2nONBField.getONBLength();
            jArr = new long[oNBLength];
            i = 1;
        } else {
            oNBLength = gF2nONBField.getONBLength();
            jArr = new long[oNBLength];
            i = 0;
        }
        while (true) {
            int i4 = oNBLength - 1;
            if (i >= i4) {
                jArr[i4] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            int i5 = onNavigationEvent + 99;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            int i7 = i5 % 2;
            jArr[i] = -1;
            i++;
            int i8 = i6 + 61;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return gF2nONBElement;
    }

    private void assign(BigInteger bigInteger) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        byte[] byteArray = bigInteger.toByteArray();
        if (i3 == 0) {
            assign(byteArray);
            throw null;
        }
        assign(byteArray);
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void assign(byte[] bArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.mPol = new long[this.mLength];
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = IAuthTabCallback + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                long[] jArr = this.mPol;
                int i6 = i4 / 3;
                jArr[i6] = ((255 ^ bArr[(bArr.length << 1) / i4]) << ((i4 & 121) / 5)) ^ jArr[i6];
                i4 += 70;
            } else {
                long[] jArr2 = this.mPol;
                int i7 = i4 >>> 3;
                jArr2[i7] = ((255 & bArr[(bArr.length - 1) - i4]) << ((i4 & 7) << 3)) | jArr2[i7];
                i4++;
            }
        }
    }

    private void assign(long[] jArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            System.arraycopy(jArr, 1, this.mPol, 1, this.mLength);
        } else {
            System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
        }
        int i3 = onNavigationEvent + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private long[] getElement() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return jArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long[] getElementReverseOrder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        long[] jArr = new long[i3 % 2 == 0 ? this.mPol.length : this.mPol.length];
        int i4 = i2 + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (i6 >= this.mDegree) {
                return jArr;
            }
            int i7 = onNavigationEvent + 3;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                if (testBit((r3 + i6) - 1)) {
                    int i8 = i6 >>> 6;
                    jArr[i8] = jArr[i8] | mBitmask[i6 & 63];
                }
            } else if (testBit((r3 - i6) - 1)) {
            }
            i6++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return gF2nONBElement;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((!r8.mField.equals(r9.mField)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.onNavigationEvent + 11;
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r3 >= r8.mLength) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r1 = r8.mPol;
        r1[r3] = r1[r3] ^ r9.mPol[r3];
        r3 = r3 + 1;
        r1 = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.IAuthTabCallback + 111;
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.onNavigationEvent = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if ((r9 instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r9 instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement)) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r2 = r2 + 91;
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
        r9 = (org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) r9;
     */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToThis(GFElement gFElement) throws RuntimeException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = 0;
        if (i2 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    void assignOne() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        while (true) {
            i = this.mLength - 1;
            if (i4 >= i) {
                break;
            }
            this.mPol[i4] = -1;
            i4++;
        }
        this.mPol[i] = mMaxmask[this.mBit - 1];
        int i5 = onNavigationEvent + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    void assignZero() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            this.mPol = new long[this.mLength];
            int i4 = 64 / 0;
        } else {
            this.mPol = new long[this.mLength];
        }
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return gF2nONBElement;
        }
        throw null;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!(!(obj instanceof GF2nONBElement))) {
                GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
                int i7 = 0;
                while (i7 < this.mLength) {
                    int i8 = IAuthTabCallback;
                    int i9 = i8 + 63;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (this.mPol[i7] != gF2nONBElement.mPol[i7]) {
                        return false;
                    }
                    i7++;
                    int i11 = i8 + 69;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                }
                return true;
            }
        }
        int i13 = i3 + 119;
        IAuthTabCallback = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Arrays.hashCode(this.mPol);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Arrays.hashCode(this.mPol);
        int i3 = IAuthTabCallback + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() throws RuntimeException {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() throws RuntimeException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        addToThis(ONE((GF2nONBField) this.mField));
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws RuntimeException {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return gF2nONBElement;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void invertThis() throws RuntimeException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            isZero();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i3 = 31;
        boolean z = false;
        while (!z) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 89 / 0;
                if (i3 < 0) {
                    break;
                }
                int i7 = i4 + 53;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                if (((this.mDegree - 1) & mBitmask[i3]) == 0) {
                    z = true;
                }
                i3--;
            } else {
                if (i3 < 0) {
                    break;
                }
                int i72 = i4 + 53;
                IAuthTabCallback = i72 % 128;
                int i82 = i72 % 2;
                if (((this.mDegree - 1) & mBitmask[i3]) == 0) {
                }
                i3--;
            }
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i9 = 1;
        while (i3 >= 0) {
            int i10 = onNavigationEvent + 97;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i12 = 1; i12 <= i9; i12++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i9 <<= 1;
            if (((this.mDegree - 1) & mBitmask[i3]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i9++;
            }
            i3--;
        }
        gF2nONBElement.squareThis();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[RETURN] */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isOne() {
        int i;
        int i2 = 2 % 2;
        int i3 = 0;
        boolean z = true;
        while (true) {
            i = this.mLength - 1;
            if (i3 >= i || !z) {
                break;
            }
            if (z && this.mPol[i3] == -1) {
                int i4 = onNavigationEvent + 53;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    z = true;
                }
                i3++;
            } else {
                int i5 = onNavigationEvent + 107;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            z = false;
            i3++;
        }
        if (!z) {
            return z;
        }
        if (!(!z)) {
            int i7 = onNavigationEvent + 55;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            long[] jArr = this.mPol;
            if (i8 == 0) {
                long j = jArr[i];
                long[] jArr2 = mMaxmask;
                int i9 = this.mBit;
                if ((j ^ jArr2[i9 % 1]) == jArr2[i9 % 0]) {
                    return true;
                }
            } else {
                long j2 = jArr[i];
                long j3 = mMaxmask[this.mBit - 1];
                if ((j2 & j3) == j3) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isZero() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        for (int i4 = 0; i4 < this.mLength && z; i4++) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 21;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            if (i6 % 2 != 0) {
                int i8 = 69 / 0;
                if (z) {
                    if (this.mPol[i4] == 0) {
                        int i9 = i7 + 125;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        z = true;
                    } else {
                        int i11 = i5 + 15;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        z = false;
                    }
                }
            } else if (!z) {
            }
        }
        return z;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return gF2nONBElement;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0164 A[PHI: r12
      0x0164: PHI (r12v18 long) = (r12v17 long), (r12v23 long) binds: [B:64:0x0162, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168 A[PHI: r12
      0x0168: PHI (r12v21 long) = (r12v17 long), (r12v23 long) binds: [B:64:0x0162, B:61:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        boolean z4;
        boolean z5;
        int[][] iArr;
        int i = 2 % 2;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i2 = this.mLength;
        long[] jArr3 = new long[i2];
        int[][] iArr2 = ((GF2nONBField) this.mField).mMult;
        int i3 = i2 - 1;
        int i4 = this.mBit;
        long[] jArr4 = mBitmask;
        long j3 = jArr4[63];
        long j4 = jArr4[i4 - 1];
        int i5 = 0;
        while (i5 < this.mDegree) {
            int i6 = 0;
            boolean z6 = false;
            while (i6 < this.mDegree) {
                int i7 = onNavigationEvent + 9;
                int i8 = i7 % 128;
                IAuthTabCallback = i8;
                int i9 = i7 % 2;
                int[] iArr3 = mIBY64;
                int i10 = iArr3[i6];
                int[] iArr4 = iArr2[i6];
                int i11 = iArr4[0];
                int i12 = iArr3[i11];
                long j5 = jArr[i10];
                long[] jArr5 = mBitmask;
                if ((j5 & jArr5[i6 & 63]) != 0) {
                    int i13 = i8 + 81;
                    iArr = iArr2;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    if ((jArr2[i12] & jArr5[i11 & 63]) != 0) {
                        z6 = !z6;
                    }
                    int i15 = iArr4[1];
                    if (i15 != -1 && (jArr2[iArr3[i15]] & jArr5[i15 & 63]) != 0) {
                        z6 = !z6;
                    }
                } else {
                    iArr = iArr2;
                }
                i6++;
                int i16 = onNavigationEvent + 55;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                iArr2 = iArr;
            }
            int[][] iArr5 = iArr2;
            int i18 = mIBY64[i5];
            if (z6) {
                int i19 = onNavigationEvent + 25;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                jArr3[i18] = jArr3[i18] ^ mBitmask[i5 & 63];
            }
            long j6 = 1;
            if (this.mLength > 1) {
                if ((jArr[i3] & 1) == 1) {
                    int i21 = IAuthTabCallback + 11;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    z3 = true;
                } else {
                    int i23 = onNavigationEvent + 59;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    z3 = false;
                }
                int i25 = i2 - 2;
                int i26 = i25;
                while (i26 >= 0) {
                    long j7 = jArr[i26];
                    if ((j7 & j6) != 0) {
                        int i27 = IAuthTabCallback + 15;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    long j8 = j7 >>> 1;
                    jArr[i26] = j8;
                    if (z3) {
                        jArr[i26] = j8 ^ j3;
                    }
                    i26--;
                    z3 = z5;
                    j6 = 1;
                }
                long j9 = jArr[i3] >>> 1;
                jArr[i3] = j9;
                if (z3) {
                    int i29 = onNavigationEvent + 119;
                    IAuthTabCallback = i29 % 128;
                    if (i29 % 2 == 0) {
                        jArr[i3] = j9 % j4;
                    } else {
                        jArr[i3] = j9 ^ j4;
                    }
                }
                boolean z7 = (jArr2[i3] & 1) == 1;
                while (i25 >= 0) {
                    int i30 = onNavigationEvent + 15;
                    IAuthTabCallback = i30 % 128;
                    if (i30 % 2 == 0) {
                        j = jArr2[i25];
                        if (j / 0 != 1) {
                            j2 = j;
                            z4 = true;
                        } else {
                            j2 = j;
                            z4 = false;
                        }
                    } else {
                        j = jArr2[i25];
                        if ((j & 1) != 0) {
                        }
                    }
                    long j10 = j2 >>> 1;
                    jArr2[i25] = j10;
                    if (z7) {
                        jArr2[i25] = j10 ^ j3;
                    }
                    i25--;
                    z7 = z4;
                }
                long j11 = jArr2[i3] >>> 1;
                jArr2[i3] = j11;
                if (z7) {
                    jArr2[i3] = j11 ^ j4;
                }
                z2 = true;
            } else {
                long j12 = jArr[0];
                if ((j12 & 1) == 1) {
                    int i31 = onNavigationEvent + 17;
                    IAuthTabCallback = i31 % 128;
                    int i32 = i31 % 2;
                    z = true;
                } else {
                    z = false;
                }
                long j13 = j12 >>> 1;
                jArr[0] = j13;
                if (z) {
                    jArr[0] = j13 ^ j4;
                }
                long j14 = jArr2[0];
                boolean z8 = (j14 & 1) == 1;
                z2 = true;
                long j15 = j14 >>> 1;
                jArr2[0] = j15;
                if (z8) {
                    jArr2[0] = j15 ^ j4;
                }
            }
            i5++;
            iArr2 = iArr5;
        }
        assign(jArr3);
    }

    void reverseOrder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long[] elementReverseOrder = getElementReverseOrder();
        if (i3 == 0) {
            this.mPol = elementReverseOrder;
            return;
        }
        this.mPol = elementReverseOrder;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[PHI: r6 r14
      0x00b1: PHI (r6v5 long[]) = (r6v4 long[]), (r6v8 long[]) binds: [B:37:0x00af, B:34:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r14v1 long) = (r14v0 long), (r14v3 long) binds: [B:37:0x00af, B:34:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[PHI: r6 r14
      0x00bb: PHI (r6v6 long[]) = (r6v4 long[]), (r6v5 long[]), (r6v8 long[]) binds: [B:37:0x00af, B:39:0x00b9, B:34:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r14v2 long) = (r14v0 long), (r14v1 long), (r14v3 long) binds: [B:37:0x00af, B:39:0x00b9, B:34:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        int i;
        long[] jArr;
        long j;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long j2 = mBitmask[63];
        long[] jArr2 = new long[this.mLength];
        int i5 = IAuthTabCallback + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        long j3 = 0;
        while (true) {
            i = this.mLength - 1;
            if (i7 >= i) {
                break;
            }
            for (int i8 = 1; i8 < 64; i8++) {
                long[] jArr3 = mBitmask;
                long j4 = jArr3[i8];
                long j5 = j4 & this.mPol[i7];
                if ((j5 == 0 || (j3 & jArr3[i8 - 1]) == 0) && (j5 != 0 || (jArr3[i8 - 1] & j3) != 0)) {
                    j3 ^= j4;
                }
            }
            jArr2[i7] = j3;
            long j6 = j3 & j2;
            j3 = 1;
            if ((j6 != 0 && (this.mPol[i7 + 1] & 1) == 1) || (j6 == 0 && (this.mPol[i7 + 1] & 1) == 0)) {
                j3 = 0;
            }
            i7++;
        }
        int i9 = this.mDegree;
        long j7 = this.mPol[i];
        for (int i10 = 1; i10 < (i9 & 63); i10++) {
            int i11 = IAuthTabCallback + 1;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                jArr = mBitmask;
                j = jArr[i10];
                if (j / j7 != 0) {
                    if ((jArr[i10 - 1] & j3) == 0) {
                        if ((j & j7) != 0 || (jArr[i10 - 1] & j3) != 0) {
                            j3 ^= j;
                        }
                    }
                }
            } else {
                jArr = mBitmask;
                j = jArr[i10];
                if ((j & j7) != 0) {
                }
            }
        }
        jArr2[this.mLength - 1] = j3;
        GF2nONBElement gF2nONBElement = new GF2nONBElement((GF2nONBField) this.mField, jArr2);
        int i12 = onNavigationEvent + 1;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        int i = 2 % 2;
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return gF2nONBElement;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        int i = 2 % 2;
        long[] element = getElement();
        int i2 = 1;
        int i3 = this.mLength - 1;
        int i4 = this.mBit;
        long j = mBitmask[63];
        int i5 = (element[0] & 1) != 0 ? 1 : 0;
        int i6 = IAuthTabCallback + 57;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i3;
        while (i8 >= 0) {
            long j2 = element[i8];
            int i9 = ((j2 & 1) != 0 ? 0 : i2) ^ 1;
            long j3 = j2 >>> i2;
            element[i8] = j3;
            if (i5 == i2) {
                int i10 = IAuthTabCallback + i2;
                int i11 = i10 % 128;
                onNavigationEvent = i11;
                int i12 = i10 % 2;
                if (i8 == i3) {
                    int i13 = i11 + 25;
                    int i14 = i13 % 128;
                    IAuthTabCallback = i14;
                    if (i13 % 2 == 0) {
                        element[i8] = j3 % mBitmask[i4];
                    } else {
                        element[i8] = j3 ^ mBitmask[i4 - 1];
                    }
                    int i15 = i14 + 57;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    element[i8] = j3 ^ j;
                }
            }
            i8--;
            i5 = i9;
            i2 = 1;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long[] element = getElement();
        int i4 = this.mLength - 1;
        int i5 = this.mBit;
        int i6 = i5 - 1;
        long[] jArr = mBitmask;
        long j = jArr[63];
        if ((element[i4] & jArr[i6]) != 0) {
            int i7 = onNavigationEvent + 101;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        int i9 = 0;
        while (i9 < i4) {
            int i10 = IAuthTabCallback + 47;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            long j2 = element[i9];
            boolean z3 = (j2 & j) != 0;
            long j3 = j2 << 1;
            element[i9] = j3;
            if (z) {
                element[i9] = j3 ^ 1;
            }
            i9++;
            z = z3;
        }
        long j4 = element[i4];
        long[] jArr2 = mBitmask;
        if ((jArr2[i6] & j4) != 0) {
            int i12 = onNavigationEvent + 19;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        long j5 = j4 << 1;
        element[i4] = j5;
        if (!(!z)) {
            int i14 = onNavigationEvent + 5;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 == 0) {
                element[i4] = j5;
            } else {
                element[i4] = 1 ^ j5;
            }
        }
        if (z2) {
            int i15 = onNavigationEvent + 37;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 == 0) {
                element[i4] = jArr2[i5] ^ element[i4];
            } else {
                element[i4] = jArr2[i5] ^ element[i4];
            }
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    boolean testBit(int i) {
        int i2 = 2 % 2;
        if (i >= 0 && i <= this.mDegree) {
            int i3 = IAuthTabCallback + 95;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if ((this.mPol[i >>> 6] & mBitmask[i & 63]) != 0) {
                int i6 = i4 + 113;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = onNavigationEvent + 75;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.mPol[this.mLength + 1] - mBitmask[this.mBit] == 0) {
                return false;
            }
        } else if ((this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) == 0) {
            return false;
        }
        int i4 = i2 + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = (i5 & 7) << 3;
            bArr[(i4 - i5) - 1] = (byte) ((this.mPol[i5 >>> 3] & (255 << i6)) >>> i6);
            i5++;
            int i7 = onNavigationEvent + 11;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        int i = 2 % 2;
        BigInteger bigInteger = new BigInteger(1, toByteArray());
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String string = toString(16);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r8 = 769953442;
        r4 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r7 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if ((r3[r4 - 1] & (1 << r7)) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(r1);
        r9 = new java.lang.Object[1];
        a(new int[]{-306687653, 769953442}, 1 - android.view.KeyEvent.getDeadChar(0, 0), r9);
        r1 = r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(r1);
        r9 = new java.lang.Object[1];
        a(new int[]{-189944157, -1014896258}, -android.text.TextUtils.indexOf((java.lang.CharSequence) net.sf.scuba.smartcards.BuildConfig.FLAVOR, '0', 0), r9);
        r1 = r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        r4.append(((java.lang.String) r1).intern());
        r1 = r4.toString();
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        r4 = r4 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (r4 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r5 = 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (r5 < 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r7 = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.IAuthTabCallback + 79;
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.onNavigationEvent = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if ((r7 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if ((r3[r4] ^ org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.mBitmask[r5]) != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if ((r3[r4] & org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.mBitmask[r5]) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r7 = new java.lang.StringBuilder();
        r7.append(r1);
        r8 = new java.lang.Object[1];
        a(new int[]{-306687653, r8}, -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), r8);
        r1 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        r7.append(((java.lang.String) r1).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        r7 = new java.lang.StringBuilder();
        r7.append(r1);
        r8 = new java.lang.Object[1];
        a(new int[]{-189944157, -1014896258}, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r8);
        r1 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fb, code lost:
    
        r1 = r7.toString();
        r7 = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.onNavigationEvent + 77;
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.IAuthTabCallback = r7 % 128;
        r7 = r7 % 2;
        r5 = r5 - 1;
        r8 = 769953442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0113, code lost:
    
        r4 = r4 - 1;
        r8 = 769953442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        if (r23 != 16) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0123, code lost:
    
        r1 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        r4 = r3.length - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        if (r4 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        r5 = ((((((((((((((((r5 + r1[((int) (r3[r4] >>> 60)) & 15]) + r1[((int) (r3[r4] >>> 56)) & 15]) + r1[((int) (r3[r4] >>> 52)) & 15]) + r1[((int) (r3[r4] >>> 48)) & 15]) + r1[((int) (r3[r4] >>> 44)) & 15]) + r1[((int) (r3[r4] >>> 40)) & 15]) + r1[((int) (r3[r4] >>> 36)) & 15]) + r1[((int) (r3[r4] >>> 32)) & 15]) + r1[((int) (r3[r4] >>> 28)) & 15]) + r1[((int) (r3[r4] >>> 24)) & 15]) + r1[((int) (r3[r4] >>> 20)) & 15]) + r1[((int) (r3[r4] >>> 16)) & 15]) + r1[((int) (r3[r4] >>> 12)) & 15]) + r1[((int) (r3[r4] >>> 8)) & 15]) + r1[((int) (r3[r4] >>> 4)) & 15]) + r1[((int) r3[r4]) & 15]) + " ";
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02cb, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r23 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r23 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r7 = r7 - 1;
        r1 = net.sf.scuba.smartcards.BuildConfig.FLAVOR;
     */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString(int i) throws Throwable {
        long[] element;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        String str = BuildConfig.FLAVOR;
        if (i5 == 0) {
            element = getElement();
            i2 = this.mBit;
        } else {
            element = getElement();
            i2 = this.mBit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int trace() {
        int i = 2 % 2;
        int i2 = this.mLength - 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            for (int i5 = 0; i5 < 64; i5++) {
                if ((this.mPol[i3] & mBitmask[i5]) != 0) {
                    int i6 = IAuthTabCallback + 63;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        i4 ^= 1;
                    }
                }
            }
            i3++;
            int i7 = IAuthTabCallback + 13;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = this.mBit;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = onNavigationEvent + 13;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                if (this.mPol[i2] * mBitmask[i10] != 1) {
                    i4 ^= 1;
                }
            } else if ((this.mPol[i2] & mBitmask[i10]) != 0) {
            }
        }
        return i4;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 87;
            int i7 = i6 % 128;
            $11 = i7;
            int i8 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = i7 + 21;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 21;
                $11 = i12 % 128;
                if (i12 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 72, 8848 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i11] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i11 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 73 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 8849 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i11++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 39;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 73, 8848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i13 %= 1;
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i13])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(BuildConfig.FLAVOR)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 71, 8849 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i13++;
                }
                i4 = -1469660336;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i15 = i5;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i15;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i15] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionGroup(0L)), 40 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4033), View.MeasureSpec.makeMeasureSpec(0, 0) + 78, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i15 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new int[]{1013390282, -1918868393, 503921410, -2123306591, -521903644, 1018726814, -1497516197, 675080309, -471516359, -414251784, 446858597, 505881394, 1012830876, 2060975961, -116722753, 1822638010, -531059837, 2110772294};
    }
}
