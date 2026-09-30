package o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.facebook.appevents.IAuthTabCallbackStubProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class getLastWindowInsets implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final Map<Integer, getLastWindowInsets> IAuthTabCallback = new HashMap();
    private WeakReference<Activity> onExtraCallbackWithResult;
    private final Set<String> onNavigationEvent = new HashSet();
    private final Handler onExtraCallback = new Handler(Looper.getMainLooper());
    private AtomicBoolean onWarmupCompleted = new AtomicBoolean(false);

    static /* synthetic */ void onExtraCallback(getLastWindowInsets getlastwindowinsets, View view) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastWindowInsets.class)) {
            return;
        }
        try {
            getlastwindowinsets.IAuthTabCallback(view);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastWindowInsets.class);
        }
    }

    private getLastWindowInsets(Activity activity) {
        this.onExtraCallbackWithResult = new WeakReference<>(activity);
    }

    static void onWarmupCompleted(Activity activity) {
        getLastWindowInsets getlastwindowinsets;
        if (convertResponseToCredentialManager.onExtraCallback(getLastWindowInsets.class)) {
            return;
        }
        try {
            int iHashCode = activity.hashCode();
            Map<Integer, getLastWindowInsets> map = IAuthTabCallback;
            if (!map.containsKey(Integer.valueOf(iHashCode))) {
                getlastwindowinsets = new getLastWindowInsets(activity);
                map.put(Integer.valueOf(activity.hashCode()), getlastwindowinsets);
            } else {
                getlastwindowinsets = map.get(Integer.valueOf(iHashCode));
            }
            getlastwindowinsets.IAuthTabCallback();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastWindowInsets.class);
        }
    }

    private void IAuthTabCallback() {
        View viewOnExtraCallback;
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            if (this.onWarmupCompleted.getAndSet(true) || (viewOnExtraCallback = setStatusBarBackground.onExtraCallback(this.onExtraCallbackWithResult.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewOnExtraCallback.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        if (view != null) {
            try {
                onWarmupCompleted(view);
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                return;
            }
        }
        if (view2 != null) {
            onWarmupCompleted(view2);
        }
    }

    private void onWarmupCompleted(final View view) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            onNavigationEvent(new Runnable() { // from class: o.getLastWindowInsets.4
                @Override // java.lang.Runnable
                public void run() {
                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                        return;
                    }
                    try {
                        View view2 = view;
                        if (view2 instanceof EditText) {
                            getLastWindowInsets.onExtraCallback(getLastWindowInsets.this, view2);
                        }
                    } catch (Throwable th) {
                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void IAuthTabCallback(View view) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
            if (lowerCase.isEmpty() || this.onNavigationEvent.contains(lowerCase) || lowerCase.length() > 100) {
                return;
            }
            this.onNavigationEvent.add(lowerCase);
            HashMap map = new HashMap();
            List<String> listIAuthTabCallback = getLastChildRect.IAuthTabCallback(view);
            List<String> listOnExtraCallbackWithResult = null;
            for (getNestedScrollAxes getnestedscrollaxes : getNestedScrollAxes.onExtraCallback()) {
                String strOnExtraCallbackWithResult = onExtraCallbackWithResult(getnestedscrollaxes.onNavigationEvent(), lowerCase);
                if (getnestedscrollaxes.IAuthTabCallback().isEmpty() || getLastChildRect.onExtraCallbackWithResult(strOnExtraCallbackWithResult, getnestedscrollaxes.IAuthTabCallback())) {
                    if (getLastChildRect.IAuthTabCallback(listIAuthTabCallback, getnestedscrollaxes.onExtraCallbackWithResult())) {
                        onWarmupCompleted(map, getnestedscrollaxes.onNavigationEvent(), strOnExtraCallbackWithResult);
                    } else {
                        if (listOnExtraCallbackWithResult == null) {
                            listOnExtraCallbackWithResult = getLastChildRect.onExtraCallbackWithResult(view);
                        }
                        if (getLastChildRect.IAuthTabCallback(listOnExtraCallbackWithResult, getnestedscrollaxes.onExtraCallbackWithResult())) {
                            onWarmupCompleted(map, getnestedscrollaxes.onNavigationEvent(), strOnExtraCallbackWithResult);
                        }
                    }
                }
            }
            IAuthTabCallbackStubProxy.IAuthTabCallback(map);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private static String onExtraCallbackWithResult(String str, String str2) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastWindowInsets.class)) {
            return null;
        }
        try {
            return "r2".equals(str) ? str2.replaceAll("[^\\d.]", "") : str2;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastWindowInsets.class);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void onWarmupCompleted(Map<String, String> map, String str, String str2) {
        if (convertResponseToCredentialManager.onExtraCallback(getLastWindowInsets.class)) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (!str2.startsWith("m") && !str2.startsWith("b") && !str2.startsWith("ge")) {
                            str2 = "f";
                            break;
                        } else {
                            str2 = "m";
                            break;
                        }
                    }
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = str2.replaceAll("[^a-z]+", "");
                        break;
                    }
                    break;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = str2.replaceAll("[^a-z]+", "");
                        break;
                    }
                    break;
                case 3588:
                    if (str.equals("r6") && str2.contains("-")) {
                        str2 = str2.split("-")[0];
                        break;
                    }
                    break;
            }
            map.put(str, str2);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getLastWindowInsets.class);
        }
    }

    private void onNavigationEvent(Runnable runnable) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.onExtraCallback.post(runnable);
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }
}
