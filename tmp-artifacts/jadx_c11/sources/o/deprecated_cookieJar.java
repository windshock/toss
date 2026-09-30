package o;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface deprecated_cookieJar extends deprecated_followRedirects {
    deprecated_followRedirects IAuthTabCallback();

    deprecated_followRedirects onExtraCallback();

    default deprecated_followRedirects onExtraCallback(@NotNull Resources resources) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        return (resources.getConfiguration().uiMode & 48) == 32 ? onExtraCallback() : IAuthTabCallback();
    }

    default deprecated_followRedirects onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return onExtraCallback(resources);
    }
}
