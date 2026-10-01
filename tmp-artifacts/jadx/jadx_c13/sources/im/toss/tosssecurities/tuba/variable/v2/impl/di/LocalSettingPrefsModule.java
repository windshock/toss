package im.toss.tosssecurities.tuba.variable.v2.impl.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.TextRoundCornerProgressBarSavedState1;
import o.getMax;
import o.getProgressColor;
import o.setDetectCallBack;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LocalSettingPrefsModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final LocalSettingPrefsModule onNavigationEvent = new LocalSettingPrefsModule();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private LocalSettingPrefsModule() {
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(@NotNull Context context) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            textRoundCornerProgressBarSavedState1IAuthTabCallback = setDetectCallBack.IAuthTabCallback(context, "TOSSSEC_PREF_TUBA_VARS_V2_LOCAL_SETTING", (getProgressColor) null, (getMax) null, 24, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            textRoundCornerProgressBarSavedState1IAuthTabCallback = setDetectCallBack.IAuthTabCallback(context, "TOSSSEC_PREF_TUBA_VARS_V2_LOCAL_SETTING", (getProgressColor) null, (getMax) null, 12, (Object) null);
        }
        int i3 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }
}
