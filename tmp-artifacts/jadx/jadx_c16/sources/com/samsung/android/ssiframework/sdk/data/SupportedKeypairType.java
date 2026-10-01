package com.samsung.android.ssiframework.sdk.data;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SupportedKeypairType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SupportedKeypairType[] $VALUES;
    private static byte[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final SupportedKeypairType P256;
    public static final SupportedKeypairType RSA2048;
    public static final SupportedKeypairType RSA4096;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final int id;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = (b * 2) + 4;
        byte[] bArr = $$a;
        int i4 = s * 2;
        int i5 = (i * 3) + 115;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i3;
            int i9 = 0;
            int i10 = i3 + i7;
            int i11 = i8 + 1;
            i2 = i9;
            i5 = i10;
            i3 = i11;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i8 = i3;
            i3 = bArr[i3];
            i9 = i2 + 1;
            i7 = i12;
            int i102 = i3 + i7;
            int i112 = i8 + 1;
            i2 = i9;
            i5 = i102;
            i3 = i112;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    private static final /* synthetic */ SupportedKeypairType[] $values() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SupportedKeypairType supportedKeypairType = P256;
        if (i3 == 0) {
            return new SupportedKeypairType[]{supportedKeypairType, RSA2048, RSA4096};
        }
        SupportedKeypairType supportedKeypairType2 = RSA2048;
        SupportedKeypairType supportedKeypairType3 = RSA4096;
        SupportedKeypairType[] supportedKeypairTypeArr = new SupportedKeypairType[4];
        supportedKeypairTypeArr[1] = supportedKeypairType;
        supportedKeypairTypeArr[1] = supportedKeypairType2;
        supportedKeypairTypeArr[5] = supportedKeypairType3;
        return supportedKeypairTypeArr;
    }

    static {
        IAuthTabCallbackStub = 0;
        onExtraCallback();
        P256 = new SupportedKeypairType("P256", 0, 0);
        Object[] objArr = new Object[1];
        a((short) (ImageFormat.getBitsPerPixel(0) - 98), (byte) ((-79) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-128585551) - Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) + 506506044, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 4, objArr);
        RSA2048 = new SupportedKeypairType(((String) objArr[0]).intern(), 1, 1);
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0') - 81), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 77), (-128585545) + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 506506045, View.MeasureSpec.makeMeasureSpec(0, 0) - 4, objArr2);
        RSA4096 = new SupportedKeypairType(((String) objArr2[0]).intern(), 2, 2);
        SupportedKeypairType[] supportedKeypairTypeArr$values = $values();
        $VALUES = supportedKeypairTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(supportedKeypairTypeArr$values);
        int i = asInterface + 13;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private SupportedKeypairType(String str, int i, int i2) {
        this.id = i2;
    }

    public static EnumEntries<SupportedKeypairType> getEntries() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<SupportedKeypairType> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return enumEntries;
    }

    public static SupportedKeypairType valueOf(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SupportedKeypairType supportedKeypairType = (SupportedKeypairType) Enum.valueOf(SupportedKeypairType.class, str);
        int i4 = onTransact + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return supportedKeypairType;
    }

    public static SupportedKeypairType[] values() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SupportedKeypairType[] supportedKeypairTypeArr = (SupportedKeypairType[]) $VALUES.clone();
        int i3 = onTransact + 85;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return supportedKeypairTypeArr;
        }
        obj.hashCode();
        throw null;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int length;
        byte[] bArr;
        char c = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43424), KeyEvent.normalizeMetaState(0) + 42, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 79;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = IAuthTabCallback;
                char c2 = '0';
                if (bArr2 != null) {
                    int i8 = $10 + 5;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char c3 = (char) (12844 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int iKeyCodeFromString = 55 - KeyEvent.keyCodeFromString("");
                                int iLastIndexOf = TextUtils.lastIndexOf("", c2, 0, 0) + 2168;
                                byte b2 = (byte) ($$a[c] + 1);
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iKeyCodeFromString, iLastIndexOf, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            c = 2;
                            c2 = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0')), 41 - TextUtils.indexOf((CharSequence) "", '0'), 22439 - ((Process.getThreadPriority(0) + 20) >> 6), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 9567 - Color.argb(0, 0, 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int i10 = $10 + 65;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = 0;
                    while (i12 < length2) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                        i12++;
                        int i13 = $10 + 13;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    static void onExtraCallback() {
        onExtraCallback = -1544693945;
        onWarmupCompleted = -1538795509;
        onNavigationEvent = 1166576926;
        IAuthTabCallback = new byte[]{12, 31, 31, -71, -84, -55, 28, 12, 11, -97, 10, 25, -4, -105};
    }
}
