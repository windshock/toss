package im.toss.components.tuba.prefs.di;

import android.content.Context;
import im.toss.features.edoc.register.AptPasswordActivity$;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ResourceMetadata;
import o.StaticImageDecoderKtExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState1;
import o.UtilsKtExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PrefsModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final PrefsModule onNavigationEvent = new PrefsModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 33;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    private PrefsModule() {
    }

    @Singleton
    public final UtilsKtExternalSyntheticLambda4 IAuthTabCallback(@NotNull Context context, @NotNull ResourceMetadata resourceMetadata, @NotNull StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(resourceMetadata, "");
        Intrinsics.checkNotNullParameter(staticImageDecoderKtExternalSyntheticLambda0, "");
        UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4 = new UtilsKtExternalSyntheticLambda4(context, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return utilsKtExternalSyntheticLambda4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onNavigationEvent(@NotNull UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda4, "");
            utilsKtExternalSyntheticLambda4.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda4, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = utilsKtExternalSyntheticLambda4.onExtraCallback();
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(@NotNull UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda4, "");
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) UtilsKtExternalSyntheticLambda4.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{utilsKtExternalSyntheticLambda4}, 848737949, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -848737947);
        int i4 = onWarmupCompleted + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallback(@NotNull UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda4, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = utilsKtExternalSyntheticLambda4.onNavigationEvent();
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnNavigationEvent;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback(@NotNull UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda4, "");
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (TextRoundCornerProgressBarSavedState1) UtilsKtExternalSyntheticLambda4.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{utilsKtExternalSyntheticLambda4}, 775920774, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -775920773);
        }
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda4, "");
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        throw null;
    }
}
