package o;

import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import o.directory;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class networkCount {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@NotNull RecomposerawaitIdle2.onNavigationEvent onnavigationevent, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (i < -1) {
            throw new IllegalArgumentException("loopCount must be greater than or equal to ApngDrawable.LOOP_INTRINSIC.");
        }
        int i3 = IAuthTabCallback + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onnavigationevent.IAuthTabCallback().onExtraCallback(directory.onNavigationEvent.Companion.IAuthTabCallback(), Integer.valueOf(i));
        int i5 = onExtraCallback + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public static final Integer onNavigationEvent(@NotNull CarouselKtExternalSyntheticLambda13 carouselKtExternalSyntheticLambda13) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda13, "");
        Integer num = (Integer) carouselKtExternalSyntheticLambda13.onExtraCallbackWithResult(directory.onNavigationEvent.Companion.IAuthTabCallback());
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }
}
