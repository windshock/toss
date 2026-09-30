package o;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NetConverter3 {
    private static final MapConverter IAuthTabCallback = RxAndroidPlugins.IAuthTabCallback(new Callable<MapConverter>() { // from class: o.NetConverter3.3
        @Override // java.util.concurrent.Callable
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public MapConverter call() throws Exception {
            return onWarmupCompleted.onExtraCallbackWithResult;
        }
    });

    static final class onWarmupCompleted {
        static final MapConverter onExtraCallbackWithResult = new NetConverter1(new Handler(Looper.getMainLooper()), false);
    }

    public static MapConverter onExtraCallback() {
        return RxAndroidPlugins.onExtraCallback(IAuthTabCallback);
    }

    public static MapConverter IAuthTabCallback(Looper looper) {
        return onExtraCallbackWithResult(looper, false);
    }

    public static MapConverter onExtraCallbackWithResult(Looper looper, boolean z) {
        if (looper == null) {
            throw new NullPointerException("looper == null");
        }
        return new NetConverter1(new Handler(looper), z);
    }
}
