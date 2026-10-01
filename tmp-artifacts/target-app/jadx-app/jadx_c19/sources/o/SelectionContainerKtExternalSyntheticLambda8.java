package o;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.List;
import o.AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
import o.SelectionManagerExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SelectionContainerKtExternalSyntheticLambda8 extends AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback, BottomNavigationKtExternalSyntheticLambda0, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.IAuthTabCallback, SelectionManager_androidKtExternalSyntheticLambda8 {
    void IAuthTabCallback(long j, int i2);

    void IAuthTabCallback(String str);

    void IAuthTabCallback(String str, long j, long j2);

    void IAuthTabCallback(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback);

    void onExtraCallback(int i2, long j, long j2);

    void onExtraCallback(Object obj, long j);

    void onExtraCallback(String str);

    void onExtraCallback(List<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> list, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult);

    void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9);

    void onExtraCallback(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1);

    void onExtraCallbackWithResult(long j);

    void onExtraCallbackWithResult(Exception exc);

    void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0);

    void onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback);

    void onExtraCallbackWithResult(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1);

    void onNavigationEvent();

    void onNavigationEvent(int i2, int i3, boolean z);

    void onNavigationEvent(int i2, long j);

    void onNavigationEvent(Exception exc);

    void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0);

    void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9);

    void onNavigationEvent(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1);

    void onWarmupCompleted();

    void onWarmupCompleted(Exception exc);

    void onWarmupCompleted(String str, long j, long j2);

    void onWarmupCompleted(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, Looper looper);

    void onWarmupCompleted(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1);
}
