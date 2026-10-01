package o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FragmentTransitionSupport {
    public static Application IAuthTabCallback(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
