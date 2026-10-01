package o;

import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BottomSheetScaffoldKtExternalSyntheticLambda3 {

    public interface onExtraCallback {
        BottomSheetScaffoldKtExternalSyntheticLambda3 onExtraCallback(TextFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult);
    }

    public interface onWarmupCompleted {
        default void onExtraCallback(TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7) {
        }
    }

    void IAuthTabCallback(AdsMediaSource adsMediaSource, int i2, int i3);

    void onExtraCallback(int... iArr);

    default boolean onExtraCallback(AdsMediaSource adsMediaSource, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        return false;
    }

    void onNavigationEvent(AdsMediaSource adsMediaSource, int i2, int i3, IOException iOException);

    void onNavigationEvent(AdsMediaSource adsMediaSource, onWarmupCompleted onwarmupcompleted);

    void onWarmupCompleted(AdsMediaSource adsMediaSource, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, Object obj, TextContextMenuHelperApi28ExternalSyntheticLambda6 textContextMenuHelperApi28ExternalSyntheticLambda6, onWarmupCompleted onwarmupcompleted);
}
