package io.invertase.googlemobileads.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nonnull;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BugsnagExitInfoPluginconfigureEventSynthesizer1;
import o.TimelineExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ReactNativeModule extends ReactContextBaseJavaModule {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = 4118068404874249427L;
    private final BugsnagExitInfoPluginconfigureEventSynthesizer1 executorService;
    private String moduleName;

    public ReactNativeModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.moduleName = str;
        this.executorService = new BugsnagExitInfoPluginconfigureEventSynthesizer1(getName());
    }

    public static void rejectPromiseWithCodeAndMessage(Promise promise, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", str);
        Object[] objArr = new Object[1];
        b(new char[]{13147, 58909, 20251, 50198, 13110, 39335, 45270, 48120, 52294, 39201, 45124}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        writableMapCreateMap.putString(((String) objArr[0]).intern(), str2);
        promise.reject(str, str2, writableMapCreateMap);
        int i4 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void initialize() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
    }

    public ReactContext getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return getReactApplicationContext();
        }
        getReactApplicationContext();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ExecutorService getExecutor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorServiceOnExtraCallback = this.executorService.onExtraCallback();
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return executorServiceOnExtraCallback;
        }
        throw null;
    }

    public ExecutorService getTransactionalExecutor() {
        ExecutorService executorServiceOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            executorServiceOnWarmupCompleted = this.executorService.onWarmupCompleted();
            int i3 = 5 / 0;
        } else {
            executorServiceOnWarmupCompleted = this.executorService.onWarmupCompleted();
        }
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return executorServiceOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 101;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 1;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 84 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 19 - Color.blue(0), 8808 - View.resolveSize(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    public ExecutorService getTransactionalExecutor(String str) {
        ExecutorService executorServiceOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            executorServiceOnNavigationEvent = this.executorService.onNavigationEvent(str);
            int i3 = 2 / 0;
        } else {
            executorServiceOnNavigationEvent = this.executorService.onNavigationEvent(str);
        }
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return executorServiceOnNavigationEvent;
    }

    public void invalidate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.executorService.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.executorService.IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public void removeEventListeningExecutor(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.executorService.onExtraCallbackWithResult(this.executorService.onWarmupCompleted(true, str));
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    public Context getApplicationContext() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return applicationContext;
    }

    public Activity getActivity() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Activity currentActivity = getCurrentActivity();
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return currentActivity;
    }

    @Nonnull
    public String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.moduleName;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public Map<String, Object> getConstants() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
