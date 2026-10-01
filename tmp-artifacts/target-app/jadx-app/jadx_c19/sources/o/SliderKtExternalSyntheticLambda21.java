package o;

import java.util.Collections;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda21 implements SliderKtExternalSyntheticLambda22 {
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private final List<SnackbarKtExternalSyntheticLambda3.onNavigationEvent> asBinder;
    private long onExtraCallback = -9223372036854775807L;
    private int onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private int onWarmupCompleted;

    public SliderKtExternalSyntheticLambda21(List<SnackbarKtExternalSyntheticLambda3.onNavigationEvent> list, String str) {
        this.asBinder = list;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[list.size()];
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.IAuthTabCallbackStub = false;
        this.onExtraCallback = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        for (int i2 = 0; i2 < this.IAuthTabCallback.length; i2++) {
            SnackbarKtExternalSyntheticLambda3.onNavigationEvent onnavigationevent = this.asBinder.get(i2);
            onextracallbackwithresult.onExtraCallback();
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 3);
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(onextracallbackwithresult.IAuthTabCallback()).onNavigationEvent(this.onNavigationEvent).IAuthTabCallbackDefault("application/dvbsubs").IAuthTabCallback(Collections.singletonList(onnavigationevent.onExtraCallback)).onWarmupCompleted(onnavigationevent.onWarmupCompleted).onNavigationEvent());
            this.IAuthTabCallback[i2] = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.IAuthTabCallbackStub = true;
        this.onExtraCallback = j;
        this.onWarmupCompleted = 0;
        this.onExtraCallbackWithResult = 2;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
        if (this.IAuthTabCallbackStub) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback != -9223372036854775807L);
            for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 : this.IAuthTabCallback) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(this.onExtraCallback, 1, this.onWarmupCompleted, 0, null);
            }
            this.IAuthTabCallbackStub = false;
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (this.IAuthTabCallbackStub) {
            if (this.onExtraCallbackWithResult != 2 || onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, 32)) {
                if (this.onExtraCallbackWithResult != 1 || onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, 0)) {
                    int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
                    int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
                    for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 : this.IAuthTabCallback) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnNavigationEvent);
                    }
                    this.onWarmupCompleted += iOnNavigationEvent;
                }
            }
        }
    }

    private boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() == 0) {
            return false;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() != i2) {
            this.IAuthTabCallbackStub = false;
        }
        this.onExtraCallbackWithResult--;
        return this.IAuthTabCallbackStub;
    }
}
