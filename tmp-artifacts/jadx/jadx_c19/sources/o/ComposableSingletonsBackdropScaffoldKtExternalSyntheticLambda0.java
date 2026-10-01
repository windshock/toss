package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererConfiguration;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 {
    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 IAuthTabCallback;
    public final Object onExtraCallback;
    public final ColorsKtExternalSyntheticLambda0[] onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final RendererConfiguration[] onWarmupCompleted;

    public ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0(RendererConfiguration[] rendererConfigurationArr, ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12, @Nullable Object obj) {
        RecordingInputConnection_androidKt.onNavigationEvent(rendererConfigurationArr.length == colorsKtExternalSyntheticLambda0Arr.length);
        this.onWarmupCompleted = rendererConfigurationArr;
        this.onExtraCallbackWithResult = (ColorsKtExternalSyntheticLambda0[]) colorsKtExternalSyntheticLambda0Arr.clone();
        this.IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12;
        this.onExtraCallback = obj;
        this.onNavigationEvent = rendererConfigurationArr.length;
    }

    public boolean onNavigationEvent(int i2) {
        return this.onWarmupCompleted[i2] != null;
    }

    public boolean onExtraCallbackWithResult(@Nullable ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0) {
        if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 == null || composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult.length != this.onExtraCallbackWithResult.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.length; i2++) {
            if (!onWarmupCompleted(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean onWarmupCompleted(@Nullable ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, int i2) {
        return composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 != null && Objects.equals(this.onWarmupCompleted[i2], composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onWarmupCompleted[i2]) && Objects.equals(this.onExtraCallbackWithResult[i2], composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult[i2]);
    }
}
