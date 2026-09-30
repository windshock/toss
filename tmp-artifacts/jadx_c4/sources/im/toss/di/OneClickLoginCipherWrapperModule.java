package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.RealDrawScopeSizeResolversizeinlinedmapNotNull121;
import o.SubcomposeAsyncImageKtExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OneClickLoginCipherWrapperModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final OneClickLoginCipherWrapperModule onWarmupCompleted = new OneClickLoginCipherWrapperModule();

    static {
        int i = onNavigationEvent + 125;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private OneClickLoginCipherWrapperModule() {
    }

    @Singleton
    public final SubcomposeAsyncImageKtExternalSyntheticLambda1 onNavigationEvent(@NotNull RealDrawScopeSizeResolversizeinlinedmapNotNull121 realDrawScopeSizeResolversizeinlinedmapNotNull121) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realDrawScopeSizeResolversizeinlinedmapNotNull121, "");
        SubcomposeAsyncImageKtExternalSyntheticLambda1 subcomposeAsyncImageKtExternalSyntheticLambda1 = new SubcomposeAsyncImageKtExternalSyntheticLambda1(realDrawScopeSizeResolversizeinlinedmapNotNull121);
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return subcomposeAsyncImageKtExternalSyntheticLambda1;
    }
}
