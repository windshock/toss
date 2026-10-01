package com.bytedance.adsdk.ugeno.lud.zb;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.ugeno.lud.dj;
import com.bytedance.adsdk.ugeno.lud.lt;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    public static final HashSet<String> ycx;
    protected String dj;
    protected String fby;
    public Map<String, Object> lt;
    protected String lud;
    public com.bytedance.adsdk.ugeno.zb.sya sya;
    protected String ul;
    protected lt.ycx zb;

    public abstract void ycx();

    static {
        onNavigationEvent();
        ycx = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
        int i2 = asInterface + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, lt.ycx ycxVar) {
        this.sya = syaVar;
        this.zb = ycxVar;
        this.ul = str;
        lud();
    }

    private void lud() {
        Map<String, Object> mapSya;
        int i2 = 2 % 2;
        lt.ycx ycxVar = this.zb;
        if (ycxVar != null) {
            int i3 = asBinder + 113;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                this.dj = ycxVar.ycx();
                this.lud = this.zb.zb();
                mapSya = this.zb.sya();
                this.lt = mapSya;
                int i4 = 97 / 0;
                if (mapSya == null) {
                    return;
                }
            } else {
                this.dj = ycxVar.ycx();
                this.lud = this.zb.zb();
                mapSya = this.zb.sya();
                this.lt = mapSya;
                if (mapSya == null) {
                    return;
                }
            }
            if (mapSya.isEmpty() || (!this.lt.containsKey("emitCustomEvent"))) {
                return;
            }
            int i5 = IAuthTabCallbackDefault + 47;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (!(!(this.lt.get("emitCustomEvent") instanceof String))) {
                int i7 = IAuthTabCallbackDefault + 93;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    this.fby = (String) this.lt.get("emitCustomEvent");
                    return;
                }
                this.fby = (String) this.lt.get("emitCustomEvent");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public void zb() throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        sya();
        int i5 = IAuthTabCallbackDefault + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void sya() throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (dj()) {
            lt.ycx ycxVar = new lt.ycx();
            ycxVar.ycx("custom");
            ycxVar.zb("emit");
            HashMap map = new HashMap();
            Object[] objArr = new Object[1];
            b(new char[]{51376, 21867, 18038, 4482}, View.MeasureSpec.getMode(0) + 4, objArr);
            map.put(((String) objArr[0]).intern(), this.fby);
            ycxVar.ycx(map);
            new zb(this.sya, this.lud, ycxVar).ycx();
        }
        int i5 = asBinder + 125;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean dj() {
        int i2 = 2 % 2;
        if (!(!TextUtils.isEmpty(this.fby))) {
            return false;
        }
        int i3 = asBinder;
        int i4 = i3 + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 47;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static void b(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent << 1];
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = 58224;
            int i7 = i4;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iRgb = Color.rgb(i4, i4, i4) + 16789650;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, doubleTapTimeout, iRgb, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 9 - TextUtils.lastIndexOf("", '0', 0, 0), 12434 - ExpandableListView.getPackedPositionGroup(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getLongPressTimeout() >> 16)), 14 - KeyEvent.keyCodeFromString(""), 19902 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i10 = $10 + 105;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        onNavigationEvent = (char) 17373;
        onExtraCallbackWithResult = (char) 3858;
        onExtraCallback = (char) 60430;
        onWarmupCompleted = (char) 45902;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.lud.zb.ycx$ycx, reason: collision with other inner class name */
    public static class C0007ycx {
        public static ycx ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, lt.ycx ycxVar) {
            if (ycxVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.lud.zb zbVarYcx = dj.ycx(ycxVar.zb());
            if (zbVarYcx == null && (TextUtils.isEmpty(ycxVar.ycx()) || !TextUtils.equals(ycxVar.ycx(), "global"))) {
                zbVarYcx = dj.ycx(ycxVar.lud());
            }
            if (zbVarYcx == null) {
                return new sya(syaVar, str, ycxVar);
            }
            ycx ycxVarYcx = zbVarYcx.ycx(syaVar, str, ycxVar);
            return ycxVarYcx == null ? new sya(syaVar, str, ycxVar) : ycxVarYcx;
        }
    }
}
