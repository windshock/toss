package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import im.toss.tds.view.ResourceIdCache;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.dispatcher, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class C0082dispatcher {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static boolean onExtraCallback = false;
    private static int onNavigationEvent = 1;
    private static int onTransact;
    public static final C0082dispatcher onExtraCallbackWithResult = new C0082dispatcher();
    private static final WeakHashMap<Context, ResourceIdCache> onWarmupCompleted = new WeakHashMap<>();

    private C0082dispatcher() {
    }

    public static final /* synthetic */ WeakHashMap onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        WeakHashMap<Context, ResourceIdCache> weakHashMap = onWarmupCompleted;
        int i5 = i3 + 49;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return weakHashMap;
    }

    static {
        int i = onNavigationEvent + 81;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final void onExtraCallback(@NotNull AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
            getTcfVendorConsentStatus.Companion.onNavigationEvent(appLovinPostbackListener);
            IAuthTabCallback(appLovinPostbackListener.onExtraCallback());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
        getTcfVendorConsentStatus.Companion.onNavigationEvent(appLovinPostbackListener);
        IAuthTabCallback(appLovinPostbackListener.onExtraCallback());
        int i3 = IAuthTabCallbackStub + 63;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final TypedValue onWarmupCompleted(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        WeakHashMap<Context, ResourceIdCache> weakHashMap = onWarmupCompleted;
        ResourceIdCache resourceIdCache = weakHashMap.get(context);
        if (resourceIdCache == null) {
            resourceIdCache = new ResourceIdCache();
            weakHashMap.put(context, resourceIdCache);
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        TypedValue typedValueOnExtraCallbackWithResult = resourceIdCache.onExtraCallbackWithResult(resources, i);
        int i5 = IAuthTabCallbackStub + 45;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return typedValueOnExtraCallbackWithResult;
    }

    private final void IAuthTabCallback(Context context) {
        synchronized (this) {
            if (onExtraCallback) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                return;
            }
            application.registerActivityLifecycleCallbacks(new onWarmupCompleted());
            onExtraCallback = true;
        }
    }

    /* renamed from: o.dispatcher$onWarmupCompleted */
    static final class onWarmupCompleted implements Application.ActivityLifecycleCallbacks {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (i3 == 0) {
                int i4 = 30 / 0;
            }
            int i5 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (i3 == 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (i3 == 0) {
                throw null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                C0082dispatcher.onExtraCallbackWithResult().entrySet().iterator();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(activity, "");
            Iterator it = C0082dispatcher.onExtraCallbackWithResult().entrySet().iterator();
            while (it.hasNext()) {
                int i3 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    hasVaryAll.onExtraCallback((Context) ((Map.Entry) next).getKey());
                    throw null;
                }
                Object next2 = it.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                Map.Entry entry = (Map.Entry) next2;
                if (hasVaryAll.onExtraCallback((Context) entry.getKey()) == activity) {
                    ((ResourceIdCache) entry.getValue()).onWarmupCompleted();
                    it.remove();
                }
            }
        }
    }
}
