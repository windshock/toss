package im.toss.components.sharedpreferences.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.MemoryCacheBuilderExternalSyntheticLambda0;
import o.MemoryCacheBuilderExternalSyntheticLambda1;
import o.RealDrawScopeSizeResolversizeinlinedmapNotNull12;
import o.RealSubcomposeAsyncImageScope;
import o.SubcomposeAsyncImageKtExternalSyntheticLambda3;
import o.TextRoundCornerProgressBarSavedState1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseDataModule {
    private static int IAuthTabCallback = 0;
    public static final BaseDataModule onExtraCallback = new BaseDataModule();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private BaseDataModule() {
    }

    @Singleton
    public final RealSubcomposeAsyncImageScope onNavigationEvent(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        RealDrawScopeSizeResolversizeinlinedmapNotNull12 realDrawScopeSizeResolversizeinlinedmapNotNull12 = new RealDrawScopeSizeResolversizeinlinedmapNotNull12(textRoundCornerProgressBarSavedState1);
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return realDrawScopeSizeResolversizeinlinedmapNotNull12;
        }
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallback(@NotNull Context context, @NotNull SubcomposeAsyncImageKtExternalSyntheticLambda3 subcomposeAsyncImageKtExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(subcomposeAsyncImageKtExternalSyntheticLambda3, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(context, "TOSS_INIT", null, subcomposeAsyncImageKtExternalSyntheticLambda3, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 80, null);
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
