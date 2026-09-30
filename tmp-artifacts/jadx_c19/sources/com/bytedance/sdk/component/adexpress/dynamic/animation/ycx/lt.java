package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends dj {
    private static short[] onExtraCallback;
    private static final byte[] $$a = {120, -46, -95, -23};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1091892148;
    private static int onNavigationEvent = -1538795460;
    private static int onExtraCallbackWithResult = -2072166024;
    private static byte[] onWarmupCompleted = {45, 46, -46, -33, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i2;
        int i3 = b * 4;
        int i4 = s + 4;
        byte[] bArr = $$a;
        int i5 = 115 - (s2 * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            int i9 = i4 + i6;
            i2 = i7;
            int i10 = i8;
            i5 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = i4 + i6;
            i2 = i7;
            int i102 = i8;
            i5 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public lt(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    List<ObjectAnimator> ycx() throws Throwable {
        int i2 = 2 % 2;
        float f = this.sya.getLayoutParams().width;
        this.sya.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "translationX", f, 0.0f).setDuration((int) (this.zb.jc() * 1000.0d));
        Object[] objArr = new Object[1];
        a((short) ((-1) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 36), 447534148 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 540711182, (-48) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.sya, ((String) objArr[0]).intern(), 0.0f, 1.0f).setDuration((int) (this.zb.jc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ycx(duration));
        arrayList.add(ycx(duration2));
        int i3 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 43424), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, View.MeasureSpec.getMode(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i8 = -1;
            if (iIntValue == -1) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 3;
                        $11 = i12 % 128;
                        if (i12 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i8;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 12843), 55 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2167 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), 55 - (Process.myTid() >> 22), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i11++;
                        }
                        i6 = 2;
                        i8 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.getDeadChar(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallback[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i13 = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z) {
                    int i14 = $10 + 51;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 86, 9567 - (ViewConfiguration.getTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $10 + 115;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    if (z2) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i19 = $10 + 75;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
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
}
