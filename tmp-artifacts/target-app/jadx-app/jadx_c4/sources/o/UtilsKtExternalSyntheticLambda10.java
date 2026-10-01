package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class UtilsKtExternalSyntheticLambda10 implements UtilsKtExternalSyntheticLambda7 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;

    @Inject
    public UtilsKtExternalSyntheticLambda10(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
    }

    @Override // o.UtilsKtExternalSyntheticLambda7
    public Boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Boolean boolOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(str);
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolOnExtraCallback;
    }

    @Override // o.UtilsKtExternalSyntheticLambda7
    public void onExtraCallback(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onNavigationEvent(str, z);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onNavigationEvent(str, z);
            throw null;
        }
    }

    @Override // o.UtilsKtExternalSyntheticLambda7
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onTransact(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult.onTransact(str);
        int i3 = onExtraCallback + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
