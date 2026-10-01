package o;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onNestedPreFling {
    static /* synthetic */ void onExtraCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedPreFling.class)) {
            return;
        }
        try {
            onWarmupCompleted();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedPreFling.class);
        }
    }

    public static void onWarmupCompleted(Context context) {
        onNestedFling onnestedflingOnExtraCallbackWithResult;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedPreFling.class)) {
            return;
        }
        try {
            if (recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.Purchase") == null || (onnestedflingOnExtraCallbackWithResult = onNestedFling.onExtraCallbackWithResult(context)) == null || !onNestedFling.onNavigationEvent.get()) {
                return;
            }
            if (onNestedScrollAccepted.onNavigationEvent()) {
                onnestedflingOnExtraCallbackWithResult.onExtraCallbackWithResult("inapp", new Runnable() { // from class: o.onNestedPreFling.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (convertResponseToCredentialManager.onExtraCallback(this)) {
                            return;
                        }
                        try {
                            onNestedPreFling.onExtraCallback();
                        } catch (Throwable th) {
                            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                        }
                    }
                });
            } else {
                onnestedflingOnExtraCallbackWithResult.onNavigationEvent("inapp", new Runnable() { // from class: o.onNestedPreFling.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (convertResponseToCredentialManager.onExtraCallback(this)) {
                            return;
                        }
                        try {
                            onNestedPreFling.onExtraCallback();
                        } catch (Throwable th) {
                            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedPreFling.class);
        }
    }

    private static void onWarmupCompleted() {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedPreFling.class)) {
            return;
        }
        try {
            Map<String, JSONObject> map = onNestedFling.onWarmupCompleted;
            onNestedScrollAccepted.onNavigationEvent(map, onNestedFling.IAuthTabCallback);
            map.clear();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedPreFling.class);
        }
    }
}
