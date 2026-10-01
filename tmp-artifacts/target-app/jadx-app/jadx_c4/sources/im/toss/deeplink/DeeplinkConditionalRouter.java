package im.toss.deeplink;

import android.content.Context;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class DeeplinkConditionalRouter {
    public abstract void execute(@NotNull Context context, @NotNull Uri uri);
}
