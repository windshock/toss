package com.bytedance.adsdk.ugeno.core.zb;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.jc;
import com.bytedance.adsdk.ugeno.core.ry;
import com.bytedance.adsdk.ugeno.core.syc;
import com.bytedance.adsdk.ugeno.fby.jw;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb implements jw.ycx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {27260, 27172, 27194, 27192};
    private ry dj;
    private Handler lt = new jw(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.zb.sya lud;
    private Context sya;
    private int ycx;
    private syc zb;

    public zb(Context context, ry ryVar, com.bytedance.adsdk.ugeno.zb.sya syaVar) {
        this.sya = context;
        this.dj = ryVar;
        this.lud = syaVar;
    }

    public void ycx(syc sycVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.zb = sycVar;
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
    }

    public void ycx() throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        ry ryVar = this.dj;
        if (ryVar != null) {
            int i6 = i4 + 73;
            IAuthTabCallback = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    int i7 = Integer.parseInt(com.bytedance.adsdk.ugeno.dj.zb.ycx(ryVar.sya().optString("delay"), this.lud.ok()));
                    this.ycx = i7;
                    this.lt.sendEmptyMessageDelayed(23625, i7);
                } else {
                    int i8 = Integer.parseInt(com.bytedance.adsdk.ugeno.dj.zb.ycx(ryVar.sya().optString("delay"), this.lud.ok()));
                    this.ycx = i8;
                    this.lt.sendEmptyMessageDelayed(1001, i8);
                }
            } catch (NumberFormatException unused) {
                return;
            }
        }
        int i9 = onExtraCallback + 123;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bytedance.adsdk.ugeno.fby.jw.ycx
    public void ycx(Message message) throws Throwable {
        int i2 = 2 % 2;
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectSya = this.dj.sya();
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 0}, true, new byte[]{1, 1, 1, 1}, objArr);
        if (TextUtils.equals(jSONObjectSya.optString(((String) objArr[0]).intern()), "onAnimation")) {
            String strOptString = jSONObjectSya.optString("nodeId");
            com.bytedance.adsdk.ugeno.zb.sya syaVar = this.lud;
            com.bytedance.adsdk.ugeno.zb.sya syaVarLud = syaVar.zb(syaVar).lud(strOptString);
            new jc(syaVarLud.ea(), com.bytedance.adsdk.ugeno.core.ycx.ycx(jSONObjectSya.optJSONObject("animatorSet"), syaVarLud)).ycx();
        } else {
            syc sycVar = this.zb;
            if (sycVar != null) {
                int i3 = IAuthTabCallback + 71;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ry ryVar = this.dj;
                com.bytedance.adsdk.ugeno.zb.sya syaVar2 = this.lud;
                sycVar.ycx(ryVar, syaVar2, syaVar2);
                int i5 = IAuthTabCallback + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 4;
                }
            }
        }
        this.lt.removeMessages(1001);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = onExtraCallbackWithResult;
        if (cArr3 != null) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getTapTimeout() >> 16)), AndroidCharacter.getMirror('0') - '\r', 14238 - TextUtils.lastIndexOf("", '0', 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $11 + 61;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 10935), 65 - TextUtils.getOffsetBefore("", 0), 16718 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), View.combineMeasuredStates(0, 0) + 29, 17658 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49467), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 69, 12486 - Color.argb(0, 0, 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i13, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $11 + 113;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 119;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i17 = $11 + 71;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $10 + 109;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr4);
        int i21 = $11 + 115;
        $10 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }
}
