package org.bson.types;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {
    public static final Decimal128 IAuthTabCallback;
    public static final Decimal128 IAuthTabCallbackDefault;
    private static final BigInteger IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static final Set<String> IAuthTabCallback_Parcel;
    private static int ICustomTabsCallback = 0;
    private static final Set<String> access000;
    private static final Set<String> access100;
    private static final BigInteger asBinder;
    private static final BigInteger asInterface;
    private static byte[] extraCallback = null;
    private static int getInterfaceDescriptor = 0;
    public static final Decimal128 onExtraCallback;
    public static final Decimal128 onExtraCallbackWithResult;
    public static final Decimal128 onNavigationEvent;
    private static final Set<String> onTransact;
    public static final Decimal128 onWarmupCompleted;
    private static short[] readTypedObject = null;
    private static final long serialVersionUID = 4570973266503637887L;
    private static int writeTypedObject;
    private final long high;
    private final long low;
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 127;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityLayout = 0;
    private static int onMessageChannelReady = 1;
    private static int extraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = 3 - (i * 3);
        int i4 = s * 3;
        int i5 = 115 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            int i8 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i9 = i2 + 1;
            i6 = i8;
            i3 = bArr[i8];
            i7 = i9;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            int i82 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Decimal128 decimal128) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(decimal128);
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return iOnNavigationEvent;
    }

    static {
        writeTypedObject = 0;
        IAuthTabCallbackDefault();
        asInterface = new BigInteger("10");
        Object[] objArr = new Object[1];
        a((short) ((-20) - ImageFormat.getBitsPerPixel(0)), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1501952895, (-648379484) - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), View.combineMeasuredStates(0, 0) - 22, objArr);
        asBinder = new BigInteger(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((short) (6 - Color.argb(0, 0, 0, 0)), (byte) Gravity.getAbsoluteGravity(0, 0), 1501952895 - KeyEvent.getDeadChar(0, 0), (-648379484) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) - 22, objArr2);
        IAuthTabCallbackStub = new BigInteger(((String) objArr2[0]).intern());
        access000 = new HashSet(Collections.singletonList("nan"));
        IAuthTabCallback_Parcel = new HashSet(Collections.singletonList("-nan"));
        access100 = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));
        onTransact = new HashSet(Arrays.asList("-inf", "-infinity"));
        IAuthTabCallback = fromIEEE754BIDEncoding(8646911284551352320L, 0L);
        onWarmupCompleted = fromIEEE754BIDEncoding(-576460752303423488L, 0L);
        onExtraCallback = fromIEEE754BIDEncoding(-288230376151711744L, 0L);
        onExtraCallbackWithResult = fromIEEE754BIDEncoding(8935141660703064064L, 0L);
        IAuthTabCallbackDefault = fromIEEE754BIDEncoding(3476778912330022912L, 0L);
        onNavigationEvent = fromIEEE754BIDEncoding(-5746593124524752896L, 0L);
        int i = extraCallbackWithResult + 91;
        writeTypedObject = i % 128;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j, long j2) {
        int i = 2 % 2;
        Decimal128 decimal128 = new Decimal128(j, j2);
        int i2 = onActivityLayout + 125;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return decimal128;
    }

    private Decimal128(long j, long j2) {
        this.high = j;
        this.low = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 43424), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 43, 22487 - AndroidCharacter.getMirror('0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 17;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                int i9 = $10 + 17;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = extraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 39;
                        $11 = i12 % 128;
                        int i13 = i12 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12843), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 55, 2167 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i14 = $11 + 125;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    byte[] bArr3 = extraCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(getInterfaceDescriptor)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (readTypedObject[i + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i16 = $11 + 109;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(ICustomTabsCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 86 - Drawable.resolveOpacity(0, 0), 9567 - KeyEvent.getDeadChar(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = extraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i19 = $11 + 11;
                    $10 = i19 % 128;
                    boolean z = i19 % 2 == 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i20 = $10 + 31;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            byte[] bArr6 = extraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = readTypedObject;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 7;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return this.high;
        }
        throw null;
    }

    public long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 113;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.low;
        int i4 = i3 + 29;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onExtraCallbackWithResult(BigDecimal bigDecimal) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
            if (IAuthTabCallback()) {
                if (bigDecimal.signum() == 0) {
                    return true;
                }
            }
        } else if (IAuthTabCallback()) {
        }
        int i4 = onActivityLayout + Imgproc.COLOR_YUV2RGB_YVYU;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean IAuthTabCallback(BigDecimal bigDecimal) {
        int i = 2 % 2;
        if (onExtraCallback()) {
            return false;
        }
        int i2 = onMessageChannelReady + 109;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (onWarmupCompleted()) {
            return false;
        }
        int i4 = onActivityLayout + 101;
        onMessageChannelReady = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            bigDecimal.compareTo(BigDecimal.ZERO);
            throw null;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) != 0) {
            return false;
        }
        int i5 = onMessageChannelReady + 37;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private BigDecimal IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 13;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = -asBinder();
            if (IAuthTabCallbackStubProxy()) {
                return BigDecimal.valueOf(0L, i3);
            }
            int i4 = 1;
            if (!(!IAuthTabCallback())) {
                int i5 = onMessageChannelReady + 123;
                onActivityLayout = i5 % 128;
                i4 = -1;
                if (i5 % 2 != 0) {
                    int i6 = 36 / 0;
                }
            }
            return new BigDecimal(new BigInteger(i4, onTransact()), i3);
        }
        asBinder();
        IAuthTabCallbackStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private byte[] onTransact() {
        int i = 2 % 2;
        byte[] bArr = new byte[15];
        long j = 255;
        long j2 = 255;
        for (int i2 = 14; i2 >= 7; i2--) {
            int i3 = onMessageChannelReady + 21;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            bArr[i2] = (byte) ((this.low & j2) >>> ((14 - i2) << 3));
            j2 <<= 8;
        }
        int i5 = onMessageChannelReady + 37;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 5;
        }
        for (int i7 = 6; i7 > 0; i7--) {
            int i8 = onActivityLayout + 91;
            onMessageChannelReady = i8 % 128;
            int i9 = i8 % 2;
            bArr[i7] = (byte) ((this.high & j) >>> ((6 - i7) << 3));
            j <<= 8;
        }
        bArr[0] = (byte) ((this.high & 281474976710656L) >>> 48);
        return bArr;
    }

    private int asBinder() {
        long j;
        char c;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallbackStubProxy()) {
            int i4 = onActivityLayout + 123;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            j = this.high & 2305807824841605120L;
            c = '/';
        } else {
            j = this.high & 9223231299366420480L;
            c = '1';
        }
        return ((int) (j >>> c)) - 6176;
    }

    private boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        if ((this.high & 6917529027641081856L) == 6917529027641081856L) {
            int i2 = onMessageChannelReady + 107;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onMessageChannelReady + 1;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        if ((this.high & Long.MIN_VALUE) == Long.MIN_VALUE) {
            int i2 = onActivityLayout + 33;
            onMessageChannelReady = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onMessageChannelReady + 31;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        if ((this.high & 8646911284551352320L) != 8646911284551352320L) {
            return false;
        }
        int i5 = i3 + 79;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 123;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        if ((this.high & 8935141660703064064L) == 8935141660703064064L) {
            int i5 = i3 + 29;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i3 + 103;
        onMessageChannelReady = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onNavigationEvent(Decimal128 decimal128) {
        int i = 2 % 2;
        if (onExtraCallback()) {
            return !decimal128.onExtraCallback() ? 1 : 0;
        }
        Object obj = null;
        if (!onWarmupCompleted()) {
            BigDecimal bigDecimalIAuthTabCallbackStub = IAuthTabCallbackStub();
            BigDecimal bigDecimalIAuthTabCallbackStub2 = decimal128.IAuthTabCallbackStub();
            if (IAuthTabCallback(bigDecimalIAuthTabCallbackStub) && decimal128.IAuthTabCallback(bigDecimalIAuthTabCallbackStub2)) {
                if (onExtraCallbackWithResult(bigDecimalIAuthTabCallbackStub)) {
                    return decimal128.onExtraCallbackWithResult(bigDecimalIAuthTabCallbackStub2) ? 0 : -1;
                }
                if (!(!decimal128.onExtraCallbackWithResult(bigDecimalIAuthTabCallbackStub2))) {
                    return 1;
                }
            }
            if (decimal128.onExtraCallback()) {
                return -1;
            }
            if (!decimal128.onWarmupCompleted()) {
                return bigDecimalIAuthTabCallbackStub.compareTo(bigDecimalIAuthTabCallbackStub2);
            }
            int i2 = onActivityLayout + 17;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 != 0) {
                return decimal128.IAuthTabCallback() ? 1 : -1;
            }
            decimal128.IAuthTabCallback();
            throw null;
        }
        int i3 = onActivityLayout + 119;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        if (!IAuthTabCallback()) {
            if (decimal128.onExtraCallback()) {
                return -1;
            }
            return (!decimal128.onWarmupCompleted() || decimal128.IAuthTabCallback()) ? 1 : 0;
        }
        int i4 = onMessageChannelReady + 85;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
            if (decimal128.onWarmupCompleted()) {
                int i6 = onMessageChannelReady + 63;
                onActivityLayout = i6 % 128;
                int i7 = i6 % 2;
                if (decimal128.IAuthTabCallback()) {
                    return 0;
                }
            }
        } else if (decimal128.onWarmupCompleted()) {
        }
        return -1;
    }

    @Override // java.lang.Number
    public int intValue() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iDoubleValue = (int) doubleValue();
        int i4 = onActivityLayout + 53;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return iDoubleValue;
    }

    @Override // java.lang.Number
    public long longValue() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return (long) doubleValue();
        }
        doubleValue();
        throw null;
    }

    @Override // java.lang.Number
    public float floatValue() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 67;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        float fDoubleValue = (float) doubleValue();
        int i4 = onActivityLayout + 15;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return fDoubleValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        int i = 2 % 2;
        if (onExtraCallback()) {
            int i2 = onActivityLayout + 99;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 != 0) {
                return Double.NaN;
            }
            throw null;
        }
        if (!onWarmupCompleted()) {
            BigDecimal bigDecimalIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (onExtraCallbackWithResult(bigDecimalIAuthTabCallbackStub)) {
                return 0.0d;
            }
            double dDoubleValue = bigDecimalIAuthTabCallbackStub.doubleValue();
            int i3 = onActivityLayout + 57;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            return dDoubleValue;
        }
        int i5 = onMessageChannelReady + 51;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        if (IAuthTabCallback()) {
            return Double.NEGATIVE_INFINITY;
        }
        int i7 = onMessageChannelReady + 23;
        onActivityLayout = i7 % 128;
        if (i7 % 2 == 0) {
            return Double.POSITIVE_INFINITY;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 43;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 115;
            onActivityLayout = i4 % 128;
            return i4 % 2 == 0;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        int i5 = onActivityLayout + 85;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            Decimal128 decimal128 = (Decimal128) obj;
            return this.high == decimal128.high && this.low == decimal128.low;
        }
        long j = ((Decimal128) obj).high;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 59;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            long j = this.low;
            long j2 = this.high;
            return (((int) (j ^ (j >>> 36))) >>> 33) / ((int) ((j2 >>> 20) + j2));
        }
        long j3 = this.low;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        long j4 = this.high;
        return (i3 * 31) + ((int) ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        int i = 2 % 2;
        if (!onExtraCallback()) {
            if (!onWarmupCompleted()) {
                return asInterface();
            }
            if (!IAuthTabCallback()) {
                int i2 = onMessageChannelReady + 17;
                onActivityLayout = i2 % 128;
                int i3 = i2 % 2;
                return "Infinity";
            }
            int i4 = onMessageChannelReady + 31;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            return "-Infinity";
        }
        int i6 = onMessageChannelReady + 87;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
        return "NaN";
    }

    private String asInterface() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        BigDecimal bigDecimalIAuthTabCallbackStub = IAuthTabCallbackStub();
        String string = bigDecimalIAuthTabCallbackStub.unscaledValue().abs().toString();
        if (IAuthTabCallback()) {
            sb.append('-');
        }
        int i2 = -bigDecimalIAuthTabCallbackStub.scale();
        int length = (string.length() - 1) + i2;
        if (i2 > 0 || length < -6) {
            sb.append(string.charAt(0));
            if (string.length() > 1) {
                sb.append('.');
                sb.append((CharSequence) string, 1, string.length());
            }
            sb.append('E');
            if (length > 0) {
                int i3 = onMessageChannelReady + 43;
                onActivityLayout = i3 % 128;
                int i4 = i3 % 2;
                sb.append('+');
                int i5 = onMessageChannelReady + 41;
                onActivityLayout = i5 % 128;
                int i6 = i5 % 2;
            }
            sb.append(length);
        } else if (i2 == 0) {
            int i7 = onMessageChannelReady + 109;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
            sb.append(string);
        } else {
            int length2 = (-i2) - string.length();
            if (length2 >= 0) {
                sb.append('0');
                sb.append('.');
                for (int i9 = 0; i9 < length2; i9++) {
                    sb.append('0');
                }
                sb.append((CharSequence) string, 0, string.length());
                int i10 = onActivityLayout + 73;
                onMessageChannelReady = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = -length2;
                sb.append((CharSequence) string, 0, i12);
                sb.append('.');
                sb.append((CharSequence) string, i12, i12 - i2);
            }
        }
        return sb.toString();
    }

    static void IAuthTabCallbackDefault() {
        getInterfaceDescriptor = 37608585;
        IAuthTabCallbackStubProxy = -1538795489;
        ICustomTabsCallback = -2099075963;
        extraCallback = new byte[]{8, 8};
    }
}
