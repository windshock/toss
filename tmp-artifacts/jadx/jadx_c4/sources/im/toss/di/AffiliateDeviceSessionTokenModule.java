package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.TextRoundCornerProgressBarSavedState1;
import o.VersionExternalSyntheticLambda0;
import o.getRearDisplayPresentation;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AffiliateDeviceSessionTokenModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final AffiliateDeviceSessionTokenModule onExtraCallbackWithResult = new AffiliateDeviceSessionTokenModule();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AffiliateDeviceSessionTokenModule() {
    }

    @Singleton
    public final getRearDisplayPresentation onNavigationEvent(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        VersionExternalSyntheticLambda0 versionExternalSyntheticLambda0 = new VersionExternalSyntheticLambda0(textRoundCornerProgressBarSavedState1, "KEY_BANK_DEVICE_SESSION_INFO");
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return versionExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final getRearDisplayPresentation onExtraCallbackWithResult(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        VersionExternalSyntheticLambda0 versionExternalSyntheticLambda0 = new VersionExternalSyntheticLambda0(textRoundCornerProgressBarSavedState1, "KEY_SECURITIES_DEVICE_SESSION_INFO");
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return versionExternalSyntheticLambda0;
    }

    @Singleton
    public final getRearDisplayPresentation onExtraCallback(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        VersionExternalSyntheticLambda0 versionExternalSyntheticLambda0 = new VersionExternalSyntheticLambda0(textRoundCornerProgressBarSavedState1, "KEY_INCOME_DEVICE_SESSION_INFO");
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return versionExternalSyntheticLambda0;
    }
}
