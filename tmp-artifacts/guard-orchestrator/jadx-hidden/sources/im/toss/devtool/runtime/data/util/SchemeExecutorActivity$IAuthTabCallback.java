package im.toss.devtool.runtime.data.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.HttpDataSourceInvalidResponseCodeException;
import o.TimelineExternalSyntheticLambda1;
import o.getPageByNodeId;
import o.s5a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class SchemeExecutorActivity$IAuthTabCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent = {60849, 17973, 47747, 61308, 17349, 46173, 59431, 23716, 45424, 58836, 24157, 45619, 59047, 23394, 36841, 57419, 21537, 34960, 64883, 14758, 37432, 28301, 15217, 38879};
    private static long onWarmupCompleted = 5843131823877801549L;

    public /* synthetic */ SchemeExecutorActivity$IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i5] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i >> i5]), i5, onWarmupCompleted, c);
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i + i6]), i6, onWarmupCompleted, c);
            }
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 83;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr);
    }

    private SchemeExecutorActivity$IAuthTabCallback() {
    }

    public final void onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intentIAuthTabCallback = IAuthTabCallback(context);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 19, 5 - KeyEvent.normalizeMetaState(0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 54299), objArr);
        intentIAuthTabCallback.setAction(((String) objArr[0]).intern());
        context.startActivity(intentIAuthTabCallback);
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intentIAuthTabCallback = IAuthTabCallback(context);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getFadingEdgeLength() >> 16, 19 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr);
        intentIAuthTabCallback.setAction(((String) objArr[0]).intern());
        context.startActivity(intentIAuthTabCallback);
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    private final Intent IAuthTabCallback(Context context) {
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) SchemeExecutorActivity.class);
        if (!(context instanceof Activity)) {
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            intent.addFlags(268435456);
            int i4 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return intent;
    }
}
