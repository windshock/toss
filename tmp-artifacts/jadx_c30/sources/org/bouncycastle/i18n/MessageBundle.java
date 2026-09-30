package org.bouncycastle.i18n;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class MessageBundle extends TextBundle {
    private static short[] IAuthTabCallback = null;
    public static final String TITLE_ENTRY = "title";
    private static final byte[] $$a = {118, 33, 67, 92};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = -566385007;
    private static int onExtraCallback = -1538795435;
    private static int onNavigationEvent = -781661385;
    private static byte[] onExtraCallbackWithResult = {ISOFileInfo.A0, -15, -16, 3, -3};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = (b * 3) + 115;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i3 + 1;
            i6 = i8;
            i3 = bArr[i8];
            i4 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public MessageBundle(String str, String str2) throws NullPointerException {
        super(str, str2);
    }

    public MessageBundle(String str, String str2, String str3) throws UnsupportedEncodingException, NullPointerException {
        super(str, str2, str3);
    }

    public MessageBundle(String str, String str2, String str3, Object[] objArr) throws UnsupportedEncodingException, NullPointerException {
        super(str, str2, str3, objArr);
    }

    public MessageBundle(String str, String str2, Object[] objArr) throws NullPointerException {
        super(str, str2, objArr);
    }

    public String getTitle(Locale locale) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-2054848152) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-1966019275) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-95) - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr);
        String entry = getEntry(((String) objArr[0]).intern(), locale, TimeZone.getDefault());
        int i4 = onTransact + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return entry;
    }

    public String getTitle(Locale locale, TimeZone timeZone) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) Gravity.getAbsoluteGravity(0, 0), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-2054848153) - View.MeasureSpec.getMode(0), (-1966019274) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 94, objArr);
        String entry = getEntry(((String) objArr[0]).intern(), locale, timeZone);
        int i4 = onTransact + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return entry;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43423), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41, 22438 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 7;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i10 = $11 + 113;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 23;
                        $11 = i13 % 128;
                        if (i13 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf(BuildConfig.FLAVOR, c)), 55 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i12 %= 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i12])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 - 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12843), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, 2166 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), -299036574, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i12++;
                        }
                        i6 = 2;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.MeasureSpec.getSize(0) + 42, 22439 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    int i14 = $10 + 111;
                    $11 = i14 % 128;
                    i4 = 2;
                    if (i14 % 2 == 0) {
                        int i15 = 3 / 5;
                    }
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i16 = ((i + iIntValue) - i4) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                if (z) {
                    int i17 = $11 + 51;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 86, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i20 = $10 + 7;
                    $11 = i20 % 128;
                    boolean z2 = i20 % 2 != 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!(!z2)) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i21 = $10 + 1;
                            $11 = i21 % 128;
                            int i22 = i21 % 2;
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        int i23 = $11 + 35;
                        $10 = i23 % 128;
                        int i24 = i23 % 2;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
