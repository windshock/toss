package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class DefaultTrackSelectorParametersBuilderExternalSyntheticLambda1 {
    public static final Handler IAuthTabCallback = new Handler(Looper.getMainLooper());
    public static final ScheduledExecutorService onExtraCallback;
    public static final Handler onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    static {
        Handler handler;
        HandlerThread handlerThread;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                handlerThread = new HandlerThread(StringFog.decrypt("ENwx1mYrKlAl+g==\n", "RJ5zkTJDWDU=\n"));
            } catch (Throwable unused) {
                handlerThread = null;
            }
            try {
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                break;
            } catch (Throwable unused2) {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable unused3) {
                        VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("kEIE74ew3QaodRHR\n", "0SZVmubctHI=\n"), StringFog.decrypt("p1f3iD6jWuWOFv2WPqYO9MFU/4cwoAj+lFj6xDOmFPWNU+w=\n", "4Tae5FvHepE=\n"), true);
                        handler = null;
                        onExtraCallbackWithResult = handler;
                        onExtraCallback = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
                    }
                }
                VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("hJSk7PzqGRa8o7HS\n", "xfD1mZ2GcGI=\n"), StringFog.decrypt("JD5+HJ/KhvUNf3QCn8/S5EI9dhORydTuFzFzUJLPyOUOOmVc2tzD9RAmfh6dgIiv\n", "Yl8XcPqupoE=\n"), true);
                i++;
            }
            i++;
        }
        onExtraCallbackWithResult = handler;
        onExtraCallback = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
    }

    public static void IAuthTabCallback(MediaSessionStubExternalSyntheticLambda72 mediaSessionStubExternalSyntheticLambda72) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mediaSessionStubExternalSyntheticLambda72.run();
        } else {
            onNavigationEvent(mediaSessionStubExternalSyntheticLambda72);
        }
    }

    public static void IAuthTabCallback(MediaSessionStubExternalSyntheticLambda72 mediaSessionStubExternalSyntheticLambda72, long j) {
        try {
            Handler handler = onExtraCallbackWithResult;
            if (handler != null) {
                handler.postDelayed(mediaSessionStubExternalSyntheticLambda72, j);
                return;
            }
            ScheduledExecutorService scheduledExecutorService = onExtraCallback;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.schedule(mediaSessionStubExternalSyntheticLambda72, j, TimeUnit.MILLISECONDS);
            } else {
                VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("0970F3mpgknr6eEp\n", "krqlYhjF6z0=\n"), StringFog.decrypt("tN6hpxqPZxaI3vSrH8xkEJTV7aAJzGMD2tfgqReObRKRkeS9Ho95BZXDoaQNjWUdm9PtoA==\n", "+rGBxXvsDHE=\n"), false);
            }
        } catch (Throwable unused) {
            VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("Ifgh4+7k1RIZzzTd\n", "YJxwlo+IvGY=\n"), StringFog.decrypt("qQYQ1anfanyARwnWv89qbIoLGMCp32pngUcb2K/QLXqAEhfd7NMrZosLHMs=\n", "72d5ucy7Sgg=\n"), false);
        }
    }

    public static void onExtraCallback(MediaSessionStubExternalSyntheticLambda72 mediaSessionStubExternalSyntheticLambda72) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            onWarmupCompleted(mediaSessionStubExternalSyntheticLambda72);
        } else {
            mediaSessionStubExternalSyntheticLambda72.run();
        }
    }

    public static void onWarmupCompleted(MediaSessionStubExternalSyntheticLambda72 mediaSessionStubExternalSyntheticLambda72, long j) {
        try {
            IAuthTabCallback.postDelayed(mediaSessionStubExternalSyntheticLambda72, j);
        } catch (Throwable unused) {
            VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("GYg4UhFIOYghvy1s\n", "WOxpJ3AkUPw=\n"), StringFog.decrypt("5BO7oxC5+7HNUqKgBqn7occes7YQufuqzFK/rhyz+7HKALeuEQ==\n", "onLSz3Xd28U=\n"), false);
        }
    }

    public static void onNavigationEvent(MediaSessionStubExternalSyntheticLambda72 mediaSessionStubExternalSyntheticLambda72) {
        try {
            IAuthTabCallback.post(mediaSessionStubExternalSyntheticLambda72);
        } catch (Throwable unused) {
            VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("KKt9GfXGB4IQnGgn\n", "ac8sbJSqbvY=\n"), StringFog.decrypt("77yHlmkW8DvG/Z6VfwbwIMf9g5tlHPA7wa+Lm2g=\n", "qd3u+gxy0E8=\n"), false);
        }
    }

    public static void onWarmupCompleted(MediaSessionStubExternalSyntheticLambda72 mediaSessionStubExternalSyntheticLambda72) {
        try {
            Handler handler = onExtraCallbackWithResult;
            if (handler != null) {
                handler.post(mediaSessionStubExternalSyntheticLambda72);
                return;
            }
            ScheduledExecutorService scheduledExecutorService = onExtraCallback;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(mediaSessionStubExternalSyntheticLambda72);
            } else {
                VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("IJjUkxSxdsgYr8Gt\n", "YfyF5nXdH7w=\n"), StringFog.decrypt("ENkrt1DhU20s2X67VaJQazDSZ7BDold4ftBquV3gWWk1lm6tVOFNfjHEK7RH41FmP9RnsA==\n", "XrYL1TGCOAo=\n"), false);
            }
        } catch (Throwable unused) {
            VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(StringFog.decrypt("/F/BgPmyPobEaNS+\n", "vTuQ9ZjeV/I=\n"), StringFog.decrypt("TkTB4xqx6qlnBdjgDKHqsmYFyu4cvq2vZ1DG61+9q7NsSc39\n", "CCWoj3/Vyt0=\n"), false);
        }
    }
}
