package com.iap.ac.android.loglite.core.pageMonitor;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.loglite.api.annotation.PageMonitor;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.log.LogEvent;
import com.iap.ac.android.loglite.log.PagePerformanceLog;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PageMonitorLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -5116513860540570156L;
    public static AutoTrackPageInfo d = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public long a = 0;
    public String b;
    public String c;

    public PageMonitorLifecycleCallbacks(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final AutoTrackPageInfo a(@NonNull Object obj) {
        synchronized (BizCodeMatchUtils.class) {
            if (BizCodeMatchUtils.e == null) {
                BizCodeMatchUtils.e = new HashMap();
            }
            String name = obj.getClass().getName();
            if (BizCodeMatchUtils.e.get(name) != null) {
                return (AutoTrackPageInfo) BizCodeMatchUtils.e.get(name);
            }
            AutoTrackPageInfo autoTrackPageInfo = new AutoTrackPageInfo();
            PageMonitor annotation = obj.getClass().getAnnotation(PageMonitor.class);
            if (annotation != null) {
                String strPageId = annotation.pageId();
                String simpleName = obj.getClass().getSimpleName();
                if (TextUtils.isEmpty(strPageId)) {
                    strPageId = simpleName;
                }
                autoTrackPageInfo.a = strPageId;
                autoTrackPageInfo.b = annotation.isMonitor();
            }
            BizCodeMatchUtils.e.put(name, autoTrackPageInfo);
            return autoTrackPageInfo;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            a(activity, "onActivityCreated");
            this.a = System.currentTimeMillis();
            obj.hashCode();
            throw null;
        }
        a(activity, "onActivityCreated");
        this.a = System.currentTimeMillis();
        int i3 = onExtraCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            a(activity, "onActivityDestroyed");
            a(activity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        a(activity, "onActivityDestroyed");
        if (a(activity)) {
            com.iap.ac.android.loglite.log.PageMonitor.a().a(activity);
        }
        int i3 = onExtraCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        a(activity, "onActivityPaused");
        if (a(activity)) {
            HashMap map = new HashMap();
            Object[] objArr = new Object[1];
            e(new char[]{59368, 11642, 64385, 59353, 39217}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            map.put("logVersion", ((String) objArr[0]).intern());
            com.iap.ac.android.loglite.log.PageMonitor.a().a(activity, d.a, this.b, this.c, map);
        }
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    public final void a(Activity activity, String str) {
        String str2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            String simpleName = activity.getClass().getSimpleName();
            boolean zA = a(activity);
            Object[] objArr = new Object[3];
            objArr[1] = simpleName;
            objArr[1] = str;
            objArr[5] = Boolean.valueOf(zA);
            str2 = String.format("auto page monitor status,activity name is:%s,activity's lifecycle is:%s,auto monitor status:%b", objArr);
        } else {
            str2 = String.format("auto page monitor status,activity name is:%s,activity's lifecycle is:%s,auto monitor status:%b", activity.getClass().getSimpleName(), str, Boolean.valueOf(a(activity)));
        }
        LoggerWrapper.d("AutoPageMonitor", str2);
        int i3 = onExtraCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean a(Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (a((Object) activity).b) {
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = AnalyticsContext.getInstance().getConfigurationManager().d;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (AnalyticsContext.getInstance().getConfigurationManager().d) {
                return true;
            }
        }
        int i5 = onExtraCallback + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        a(activity, "onActivityResumed");
        if (a(activity)) {
            d = a((Object) activity);
            com.iap.ac.android.loglite.log.PageMonitor.a().a(activity, d.a);
            if (this.a > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.a;
                String str = d.a;
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis - j);
                map.put("native_page_render_performance_time", sb.toString());
                Object[] objArr = new Object[1];
                e(new char[]{59368, 11642, 64385, 59353, 39217}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr);
                map.put("logVersion", ((String) objArr[0]).intern());
                PagePerformanceLog pagePerformanceLog = new PagePerformanceLog(str, "native_page_render_performance", map);
                if (!TextUtils.isEmpty(this.b)) {
                    int i4 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        ((LogEvent) pagePerformanceLog).c = this.b;
                        throw null;
                    }
                    ((LogEvent) pagePerformanceLog).c = this.b;
                }
                if (!TextUtils.isEmpty(this.c)) {
                    ((LogEvent) pagePerformanceLog).e = this.c;
                }
                AnalyticsContext.getInstance().getStorageManager().a(pagePerformanceLog, (String) null);
                LoggerWrapper.d("AutoPageMonitor", pagePerformanceLog.toString());
            }
        }
        this.a = 0L;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i3 = $11 + 45;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 45812), 83 - TextUtils.lastIndexOf("", '0', 0), 21234 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14186), TextUtils.indexOf("", "") + 19, View.getDefaultSize(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 27;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }
}
