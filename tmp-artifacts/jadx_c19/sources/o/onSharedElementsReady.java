package o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class onSharedElementsReady implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final Map<Integer, onSharedElementsReady> onExtraCallbackWithResult = new HashMap();
    private WeakReference<Activity> onExtraCallback;
    private final Handler onNavigationEvent = new Handler(Looper.getMainLooper());
    private AtomicBoolean IAuthTabCallback = new AtomicBoolean(false);

    static /* synthetic */ WeakReference onWarmupCompleted(onSharedElementsReady onsharedelementsready) {
        if (convertResponseToCredentialManager.onExtraCallback(onSharedElementsReady.class)) {
            return null;
        }
        try {
            return onsharedelementsready.onExtraCallback;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onSharedElementsReady.class);
            return null;
        }
    }

    static void onNavigationEvent(Activity activity) {
        if (convertResponseToCredentialManager.onExtraCallback(onSharedElementsReady.class)) {
            return;
        }
        try {
            int iHashCode = activity.hashCode();
            Map<Integer, onSharedElementsReady> map = onExtraCallbackWithResult;
            if (map.containsKey(Integer.valueOf(iHashCode))) {
                return;
            }
            onSharedElementsReady onsharedelementsready = new onSharedElementsReady(activity);
            map.put(Integer.valueOf(iHashCode), onsharedelementsready);
            onsharedelementsready.onExtraCallbackWithResult();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onSharedElementsReady.class);
        }
    }

    static void IAuthTabCallback(Activity activity) {
        if (convertResponseToCredentialManager.onExtraCallback(onSharedElementsReady.class)) {
            return;
        }
        try {
            int iHashCode = activity.hashCode();
            Map<Integer, onSharedElementsReady> map = onExtraCallbackWithResult;
            if (map.containsKey(Integer.valueOf(iHashCode))) {
                onSharedElementsReady onsharedelementsready = map.get(Integer.valueOf(iHashCode));
                map.remove(Integer.valueOf(iHashCode));
                onsharedelementsready.onWarmupCompleted();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onSharedElementsReady.class);
        }
    }

    private onSharedElementsReady(Activity activity) {
        this.onExtraCallback = new WeakReference<>(activity);
    }

    private void onExtraCallbackWithResult() {
        View viewOnExtraCallback;
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            if (this.IAuthTabCallback.getAndSet(true) || (viewOnExtraCallback = setStatusBarBackground.onExtraCallback(this.onExtraCallback.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewOnExtraCallback.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                IAuthTabCallback();
                this.onExtraCallback.get();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void onWarmupCompleted() {
        View viewOnExtraCallback;
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            if (this.IAuthTabCallback.getAndSet(false) && (viewOnExtraCallback = setStatusBarBackground.onExtraCallback(this.onExtraCallback.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewOnExtraCallback.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            IAuthTabCallback();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void IAuthTabCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: o.onSharedElementsReady.2
                @Override // java.lang.Runnable
                public void run() {
                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                        return;
                    }
                    try {
                        View viewOnExtraCallback = setStatusBarBackground.onExtraCallback((Activity) onSharedElementsReady.onWarmupCompleted(onSharedElementsReady.this).get());
                        Activity activity = (Activity) onSharedElementsReady.onWarmupCompleted(onSharedElementsReady.this).get();
                        if (viewOnExtraCallback == null || activity == null) {
                            return;
                        }
                        for (View view : onDependentViewChanged.onNavigationEvent(viewOnExtraCallback)) {
                            if (!onInterceptTouchEvent.onExtraCallbackWithResult(view)) {
                                String strIAuthTabCallback = onDependentViewChanged.IAuthTabCallback(view);
                                if (!strIAuthTabCallback.isEmpty() && strIAuthTabCallback.length() <= 300) {
                                    ActivityCompatSharedElementCallback21ImplExternalSyntheticLambda0.onExtraCallback(view, viewOnExtraCallback, activity.getLocalClassName());
                                }
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                    }
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.onNavigationEvent.post(runnable);
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }
}
