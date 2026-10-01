package o;

import android.content.Context;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class nativeRegisterWithPerfetto {

    public interface onExtraCallbackWithResult {
        Set<Boolean> onExtraCallback();
    }

    public static boolean onWarmupCompleted(Context context) {
        Set<Boolean> setOnExtraCallback = ((onExtraCallbackWithResult) Response.onExtraCallback(context, onExtraCallbackWithResult.class)).onExtraCallback();
        runAnimator.IAuthTabCallback(setOnExtraCallback.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setOnExtraCallback.isEmpty()) {
            return true;
        }
        return setOnExtraCallback.iterator().next().booleanValue();
    }
}
