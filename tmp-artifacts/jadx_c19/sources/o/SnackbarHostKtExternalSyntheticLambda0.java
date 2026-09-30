package o;

import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarHostKtExternalSyntheticLambda0 implements SnackbarHostKtExternalSyntheticLambda4 {
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallback;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda24 onWarmupCompleted;

    public SnackbarHostKtExternalSyntheticLambda0(String str, String str2) {
        this.onExtraCallback = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent(str2).IAuthTabCallbackDefault(str).onNavigationEvent();
    }

    @Override // o.SnackbarHostKtExternalSyntheticLambda4
    public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        onextracallbackwithresult.onExtraCallback();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 5);
        this.onExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(this.onExtraCallback);
    }

    @Override // o.SnackbarHostKtExternalSyntheticLambda4
    public void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        onExtraCallback();
        long jOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        long jOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        if (jOnWarmupCompleted == -9223372036854775807L || jOnExtraCallbackWithResult == -9223372036854775807L) {
            return;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onExtraCallback;
        if (jOnExtraCallbackWithResult != basicTextContextMenuProviderKtExternalSyntheticLambda4.newSession) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onExtraCallback(jOnExtraCallbackWithResult).onNavigationEvent();
            this.onExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
        }
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        this.onExtraCallbackWithResult.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnNavigationEvent);
        this.onExtraCallbackWithResult.onExtraCallback(jOnWarmupCompleted, 1, iOnNavigationEvent, 0, null);
    }

    @EnsuresNonNull
    private void onExtraCallback() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onWarmupCompleted);
        Object[] objArr = {this.onExtraCallbackWithResult};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }
}
