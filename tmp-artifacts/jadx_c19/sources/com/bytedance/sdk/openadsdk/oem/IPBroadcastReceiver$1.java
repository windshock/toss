package com.bytedance.sdk.openadsdk.oem;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.component.fby.zb.sya;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.dy.zb.ycx;
import com.bytedance.sdk.openadsdk.utils.oby;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class IPBroadcastReceiver$1 extends sya {
    final /* synthetic */ Intent ycx;
    final /* synthetic */ IPBroadcastReceiver zb;
    private static final byte[] $$a = {15, -12, 105, 108};
    private static final int $$b = 160;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int onExtraCallback = -1776194565;
    private static char onWarmupCompleted = 65453;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 + 109;
        int i8 = (i2 * 2) + 1;
        int i9 = (i4 * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i10 = i9;
            i6 = 0;
            int i11 = i8;
            i7 = (-i7) + i11;
            i9 = i10 + 1;
            i5 = i6;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i7;
            if (i6 == i8) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i9];
            int i12 = i9;
            i11 = i7;
            i7 = b;
            i10 = i12;
            i7 = (-i7) + i11;
            i9 = i10 + 1;
            i5 = i6;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i7;
            if (i6 == i8) {
            }
        } else {
            i5 = 0;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i7;
            if (i6 == i8) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IPBroadcastReceiver$1(IPBroadcastReceiver iPBroadcastReceiver, String str, Intent intent) {
        super(str);
        this.zb = iPBroadcastReceiver;
        this.ycx = intent;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 27;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 43 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 49123), 44 - (ViewConfiguration.getEdgeSlop() >> 16), 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0, 0)), 50 - (Process.myTid() >> 22), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - ((byte) KeyEvent.getModifierMetaStateMask())), 29 - Color.alpha(0), View.MeasureSpec.getMode(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 59;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public void run() {
        int intExtra;
        int intExtra2;
        int i2;
        final int i3;
        int i4;
        final int i5;
        int intExtra3;
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 121;
        IAuthTabCallback = i7 % 128;
        int i8 = 0;
        try {
            if (i7 % 2 == 0) {
                intExtra = this.ycx.getIntExtra("errorCode", 1);
                intExtra2 = 1;
                if (intExtra < 0) {
                    int i9 = onNavigationEvent + 103;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Intent intent = this.ycx;
                    Object[] objArr = new Object[1];
                    a((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9359), KeyEvent.keyCodeFromString(""), new char[]{498, 9773, 26668, 51448, 17078, 40797}, new char[]{0, 0, 0, 0}, new char[]{32415, 44025, 36661, 58916}, objArr);
                    intExtra3 = intent.getIntExtra(((String) objArr[0]).intern(), 0);
                    if (intExtra != -4 && intExtra3 == -1) {
                        return;
                    }
                    i3 = intExtra3;
                    i2 = intExtra;
                }
                i2 = intExtra;
                i3 = 0;
            } else {
                intExtra = this.ycx.getIntExtra("errorCode", 0);
                intExtra2 = 0;
                if (intExtra < 0) {
                    int i92 = onNavigationEvent + 103;
                    IAuthTabCallback = i92 % 128;
                    int i102 = i92 % 2;
                    Intent intent2 = this.ycx;
                    Object[] objArr2 = new Object[1];
                    a((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9359), KeyEvent.keyCodeFromString(""), new char[]{498, 9773, 26668, 51448, 17078, 40797}, new char[]{0, 0, 0, 0}, new char[]{32415, 44025, 36661, 58916}, objArr2);
                    intExtra3 = intent2.getIntExtra(((String) objArr2[0]).intern(), 0);
                    if (intExtra != -4) {
                    }
                    i3 = intExtra3;
                    i2 = intExtra;
                } else {
                    i2 = intExtra;
                    i3 = 0;
                }
            }
            if (i2 == 5) {
                int intExtra4 = this.ycx.getIntExtra("status", 0);
                if (intExtra4 == -2) {
                    try {
                        intExtra2 = this.ycx.getIntExtra("progress", 0);
                        int i11 = onNavigationEvent + 49;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MUrQ==", "ct4Phwy9bcSBWcNviRKlIU3rP9FS", "Sfsj", 130);
                        IPBroadcastReceiver.ycx(this.zb, 1);
                    }
                    i8 = intExtra2;
                    if (i8 < 100) {
                        return;
                    }
                }
                i4 = intExtra4;
                i5 = i8;
            } else {
                i4 = 0;
                i5 = 0;
            }
            String stringExtra = this.ycx.getStringExtra("packageName");
            ycx ycxVarYcx = IPBroadcastReceiver.ycx(this.zb);
            if (i2 > 0 && ycxVarYcx != null) {
                ycxVarYcx.ycx(stringExtra, i2);
            }
            final tn tnVarYcx = this.zb.ycx(stringExtra);
            if (tnVarYcx != null) {
                final int i13 = i2;
                final int i14 = i4;
                com.bytedance.sdk.openadsdk.dj.sya.ycx(System.currentTimeMillis(), tnVarYcx, oby.ycx(tnVarYcx), "ip_listener_log", new ycx() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver$1.1
                    public JSONObject ycx() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ip_error_code", i13);
                            tn tnVar = tnVarYcx;
                            if (tnVar != null) {
                                jSONObject.put("ip_is_w2a", tnVar.uh());
                            }
                            int i15 = i13;
                            if (i15 > 0) {
                                if (i15 == 5) {
                                    jSONObject.put("ip_status", i14);
                                    jSONObject.put("ip_exec_type", IPBroadcastReceiver.zb(IPBroadcastReceiver$1.this.zb));
                                }
                                if (i14 == -2) {
                                    jSONObject.put("ip_progress", i5);
                                }
                            }
                            if (i13 < 0) {
                                jSONObject.put("ip_reason", i3);
                            }
                            return jSONObject;
                        } catch (Throwable th2) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MUrQ==", "ct4Phwy9bcSBWcNviRKlIU3rP9FS+Dg=", "XOs5pQK7Q9SPRPNcmBA=", 172);
                            htf.ycx("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                            return null;
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MUrQ==", "ct4Phwy9bcSBWcNviRKlIU3rP9FS", "Sfsj", 179);
            htf.ycx("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
        }
    }
}
