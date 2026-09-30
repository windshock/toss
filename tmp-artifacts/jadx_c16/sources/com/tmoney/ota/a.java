package com.tmoney.ota;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.a.d;
import com.tmoney.ota.e.b;
import com.tmoney.utils.DeviceInfoHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class a extends BaseTmoneyCallback {
    private final String a;
    private String b;
    private b c;
    private String d;
    private String e;
    private String f;
    private static final byte[] $$a = {68, 4, -12, -68};
    private static final int $$b = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallback = 478308980;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = b3 * 3;
        int i3 = (b * 2) + 105;
        int i4 = b2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 += i4;
            i4 = i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            i6 = i8;
            i4 = bArr[i8];
            i3 += i4;
            i4 = i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    public a(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyStatusCheck";
        this.d = "";
        this.e = "";
        this.f = "";
        this.c = b.getInstance(context);
        this.d = DeviceInfoHelper.getSimSerialNumber(context);
        this.e = DeviceInfoHelper.getLine1NumberLocaleRemove(context);
        this.f = DeviceInfoHelper.getOtaTelecom(context);
    }

    static /* synthetic */ String a(a aVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = aVar.d;
        int i5 = i2 + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void a(a aVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        aVar.onResult(resultType);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
    }

    static /* synthetic */ void a(a aVar, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        aVar.a(str);
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private void a(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TmoneyCallback.ResultType detailCode = TmoneyCallback.ResultType.SUCCESS.setDetailCode(str);
        if (i3 == 0) {
            onResult(detailCode);
            return;
        }
        onResult(detailCode);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String b(a aVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = aVar.e;
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String c(a aVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = aVar.f;
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    static /* synthetic */ b d(a aVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        b bVar = aVar.c;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bVar;
    }

    public final void getStatus(String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        this.b = str;
        if (!(this.d + this.e + this.f).equals(this.c.getOtaInfo())) {
            new d(getContext(), new ResultListener() { // from class: com.tmoney.ota.a.1
                private static int $10 = 0;
                private static int $11 = 1;
                private static int IAuthTabCallbackStub = 1;
                private static int onWarmupCompleted;
                private static char[] onExtraCallbackWithResult = {32608};
                private static int IAuthTabCallback = -1184333999;
                private static boolean onExtraCallback = true;
                private static boolean onNavigationEvent = true;

                public final void onResult(TmoneyCallback.ResultType resultType) throws Throwable {
                    b bVarD;
                    String str2;
                    int i2 = 2 % 2;
                    if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                        a.a(a.this, resultType);
                        int i3 = onWarmupCompleted + 109;
                        IAuthTabCallbackStub = i3 % 128;
                        int i4 = i3 % 2;
                        return;
                    }
                    int i5 = onWarmupCompleted + 41;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    String detailCode = resultType.getDetailCode();
                    String detailCode2 = resultType.getDetailCode();
                    Object[] objArr = new Object[1];
                    b(null, null, new byte[]{-127}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
                    if (detailCode2.equals(((String) objArr[0]).intern())) {
                        bVarD = a.d(a.this);
                        str2 = a.a(a.this) + a.b(a.this) + a.c(a.this);
                    } else {
                        bVarD = a.d(a.this);
                        str2 = "";
                    }
                    bVarD.setOtaInfo(str2);
                    int i7 = IAuthTabCallbackStub + 7;
                    int i8 = i7 % 128;
                    onWarmupCompleted = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 105;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    a.a(a.this, detailCode);
                }

                private static void b(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
                    int i3 = 2;
                    int i4 = 2 % 2;
                    DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                    char[] cArr2 = onExtraCallbackWithResult;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i5 = 0;
                        while (i5 < length) {
                            int i6 = $10 + 45;
                            $11 = i6 % 128;
                            int i7 = i6 % i3;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 77 - Color.green(0), Drawable.resolveOpacity(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                                }
                                cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i5++;
                                i3 = 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2 = cArr3;
                    }
                    Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                    long j = 0;
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 74, 16037 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    if (onNavigationEvent) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                        char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 63, 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            j = 0;
                        }
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    if (!onExtraCallback) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                        char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                        }
                        String str2 = new String(cArr5);
                        int i8 = $11 + 83;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        objArr[0] = str2;
                        return;
                    }
                    int i9 = $10 + 53;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 62 - MotionEvent.axisFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr6);
                }
            }).issueStatusCheck(this.b);
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
                return;
            }
            return;
        }
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = new Object[1];
            g(ViewConfiguration.getMaximumFlingVelocity() % 51, -MotionEvent.axisFromString(""), new char[]{0}, true, 4202 % ((Process.getThreadPriority(0) << 67) / 74), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            g(1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -MotionEvent.axisFromString(""), new char[]{0}, false, ((Process.getThreadPriority(0) + 20) >> 6) + 142, objArr2);
            obj = objArr2[0];
        }
        a(((String) obj).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35126), 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 10277 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 55 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 107;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 123;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843), TextUtils.indexOf("", c, 0, 0) + 56, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i13 = $10 + 83;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                i4 = 2083011369;
                c = '0';
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i15 = $10 + 101;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        objArr[0] = str;
    }
}
