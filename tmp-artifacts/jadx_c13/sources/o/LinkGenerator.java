package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LinkGenerator {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ void onExtraCallback(CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8, String str, Context context, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            context = AFj1rSDK.onExtraCallback.onNavigationEvent();
            int i5 = IAuthTabCallback + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        IAuthTabCallback(carouselKtExternalSyntheticLambda8, str, context);
    }

    public static final void IAuthTabCallback(@NotNull CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8, @NotNull String str, @NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        carouselKtExternalSyntheticLambda8.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str).onExtraCallbackWithResult());
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
