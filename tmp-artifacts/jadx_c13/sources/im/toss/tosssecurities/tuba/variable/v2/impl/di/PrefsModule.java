package im.toss.tosssecurities.tuba.variable.v2.impl.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.DiskLruCacheExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState1;
import o.setDetectCallBack;
import o.supports;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PrefsModule {
    public static final PrefsModule IAuthTabCallback = new PrefsModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 25;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private PrefsModule() {
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(@NotNull Context context, @NotNull supports supportsVar, @NotNull DiskLruCacheExternalSyntheticLambda0 diskLruCacheExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(supportsVar, "");
            Intrinsics.checkNotNullParameter(diskLruCacheExternalSyntheticLambda0, "");
            setDetectCallBack.onExtraCallback(context, "TOSSSEC_PREF_TUBA_VARS_V2_PREF", supportsVar, diskLruCacheExternalSyntheticLambda0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(supportsVar, "");
        Intrinsics.checkNotNullParameter(diskLruCacheExternalSyntheticLambda0, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = setDetectCallBack.onExtraCallback(context, "TOSSSEC_PREF_TUBA_VARS_V2_PREF", supportsVar, diskLruCacheExternalSyntheticLambda0);
        int i3 = onWarmupCompleted + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }
}
