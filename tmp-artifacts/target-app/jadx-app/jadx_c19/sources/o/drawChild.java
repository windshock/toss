package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class drawChild {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private final SharedPreferences onWarmupCompleted;

    public drawChild() {
        SharedPreferences sharedPreferences = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.onWarmupCompleted = sharedPreferences;
    }

    public final dispatchDependentViewsChanged onExtraCallback() {
        String string = this.onWarmupCompleted.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new dispatchDependentViewsChanged(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void onNavigationEvent(@NotNull dispatchDependentViewsChanged dispatchdependentviewschanged) {
        Intrinsics.checkNotNullParameter(dispatchdependentviewschanged, "");
        JSONObject jSONObjectOnExtraCallback = dispatchdependentviewschanged.onExtraCallback();
        if (jSONObjectOnExtraCallback != null) {
            this.onWarmupCompleted.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectOnExtraCallback.toString()).apply();
        }
    }

    public final void onExtraCallbackWithResult() {
        this.onWarmupCompleted.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public static final class onWarmupCompleted {
        private onWarmupCompleted() {
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
