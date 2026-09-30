package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LinkGenerator1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final Activity onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Context context = view.getContext();
        while (context instanceof ContextWrapper) {
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return null;
    }
}
