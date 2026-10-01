package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.GriverManifest22;
import o.Record;
import o.TextRoundCornerProgressBarSavedState1;
import o.applyShow;
import o.getLastOpenTimestamp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossPayThirdPartyModule {
    public static final TossPayThirdPartyModule IAuthTabCallback = new TossPayThirdPartyModule();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 9;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    private TossPayThirdPartyModule() {
    }

    @Singleton
    public final applyShow onNavigationEvent(@NotNull Record record, @NotNull GeckoHubImp geckoHubImp, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(record, "");
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        applyShow applyshow = new applyShow(record, geckoHubImp, textRoundCornerProgressBarSavedState1);
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return applyshow;
    }

    @Singleton
    public final GriverManifest22 IAuthTabCallback(@NotNull getLastOpenTimestamp getlastopentimestamp, @NotNull GeckoHubImp geckoHubImp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getlastopentimestamp, "");
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        GriverManifest22 griverManifest22 = new GriverManifest22(getlastopentimestamp, geckoHubImp);
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return griverManifest22;
    }
}
