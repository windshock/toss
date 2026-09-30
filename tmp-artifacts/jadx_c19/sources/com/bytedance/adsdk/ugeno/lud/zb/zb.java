package com.bytedance.adsdk.ugeno.lud.zb;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.ugeno.lud.lt;
import com.bytedance.adsdk.ugeno.lud.ycx.dj;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ycx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = 3025587011263882594L;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private List<dj> jw;

    public zb(com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, lt.ycx ycxVar) {
        super(syaVar, str, ycxVar);
        this.jw = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.lud.zb.ycx
    public void ycx() {
        int i2 = 2 % 2;
        Map<String, Object> map = this.lt;
        if (map != null) {
            int i3 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                map.size();
                obj.hashCode();
                throw null;
            }
            if (map.size() > 0) {
                Map<String, Object> map2 = this.lt;
                Object[] objArr = new Object[1];
                a(new char[]{33636, 33546, 40916, 39294, 33243, 62472, 42447, 44839}, ViewConfiguration.getTapTimeout() >> 16, objArr);
                Object obj2 = map2.get(((String) objArr[0]).intern());
                if (obj2 != null) {
                    String strValueOf = String.valueOf(obj2);
                    com.bytedance.adsdk.ugeno.lud.ycx.ycx ycxVarNji = this.sya.nji();
                    if (ycxVarNji != null) {
                        int i4 = onNavigationEvent + 99;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            com.bytedance.adsdk.ugeno.lud.ycx.sya syaVarYcx = ycxVarNji.ycx(strValueOf);
                            if (syaVarYcx != null) {
                                syaVarYcx.ycx(strValueOf);
                                return;
                            }
                            return;
                        }
                        ycxVarNji.ycx(strValueOf);
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 35;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $11 + 9;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 83 - TextUtils.lastIndexOf("", '0', 0), 21234 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 14186), 19 - ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
