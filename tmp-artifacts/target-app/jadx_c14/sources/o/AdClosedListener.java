package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ConditionalDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdClosedListener extends DeeplinkConditionalRouter {
    public void execute(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + context.getPackageName()));
        Intrinsics.checkNotNullExpressionValue(data, "");
        getNavigationBar.IAuthTabCallback(data, context);
    }
}
