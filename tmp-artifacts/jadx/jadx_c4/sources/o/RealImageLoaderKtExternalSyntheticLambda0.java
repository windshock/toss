package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderKtExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final <T> void IAuthTabCallback(@NotNull maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener, T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(mayberemoveattachstatelistener, "");
            int i3 = 74 / 0;
            if (!mayberemoveattachstatelistener.onNavigationEvent()) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(mayberemoveattachstatelistener, "");
            if (!mayberemoveattachstatelistener.onNavigationEvent()) {
                return;
            }
        }
        int i4 = onExtraCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Result.Companion companion = kotlin.Result.Companion;
        mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(t));
        if (i5 != 0) {
            throw null;
        }
    }
}
