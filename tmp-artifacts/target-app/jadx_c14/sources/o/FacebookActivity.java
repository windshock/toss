package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ConditionalDeepLink
@DERTaggedObject
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FacebookActivity extends DeeplinkConditionalRouter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onWarmupCompleted = {51240, 64961, 64981, 64982};
    private static char onNavigationEvent = 51243;

    public void execute(@NotNull Context context, @NotNull Uri uri) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intent intent = new Intent(context, Class.forName("im.toss.logging.automation.demo.LoggingAutomationDemoActivity"));
        Object[] objArr = new Object[1];
        a(new char[]{3, 1, 3, 2, 13868, 13868, 1, 3}, (byte) (68 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{3, 1, 3, 2, 13868, 13868, 1, 3}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 68), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8, objArr2);
        context.startActivity(intent.putExtra(strIntern, uri.getQueryParameter(((String) objArr2[0]).intern())));
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r32, byte r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FacebookActivity.a(char[], byte, int, java.lang.Object[]):void");
    }
}
