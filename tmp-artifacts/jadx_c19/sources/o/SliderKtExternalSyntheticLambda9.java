package o;

import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda9 implements SliderKtExternalSyntheticLambda22 {
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private int onExtraCallback;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(10);
    private long onTransact = -9223372036854775807L;

    public SliderKtExternalSyntheticLambda9(String str) {
        this.onNavigationEvent = str;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.IAuthTabCallbackDefault = false;
        this.onTransact = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 5);
        this.onExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(onextracallbackwithresult.IAuthTabCallback()).onNavigationEvent(this.onNavigationEvent).IAuthTabCallbackDefault("application/id3").onNavigationEvent());
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        this.onTransact = j;
        this.onExtraCallback = 0;
        this.IAuthTabCallback = 0;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallbackWithResult);
        if (this.IAuthTabCallbackDefault) {
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
            int i2 = this.IAuthTabCallback;
            if (i2 < 10) {
                int iMin = Math.min(iOnNavigationEvent, 10 - i2);
                System.arraycopy(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(), this.onWarmupCompleted.onExtraCallback(), this.IAuthTabCallback, iMin);
                if (this.IAuthTabCallback + iMin == 10) {
                    this.onWarmupCompleted.asBinder(0);
                    if (73 != this.onWarmupCompleted.onMinimized() || 68 != this.onWarmupCompleted.onMinimized() || 51 != this.onWarmupCompleted.onMinimized()) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Id3Reader", "Discarding invalid ID3 tag");
                        this.IAuthTabCallbackDefault = false;
                        return;
                    } else {
                        this.onWarmupCompleted.IAuthTabCallbackDefault(3);
                        this.onExtraCallback = this.onWarmupCompleted.onPostMessage() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iOnNavigationEvent, this.onExtraCallback - this.IAuthTabCallback);
            this.onExtraCallbackWithResult.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin2);
            this.IAuthTabCallback += iMin2;
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
        int i2;
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallbackWithResult);
        if (this.IAuthTabCallbackDefault && (i2 = this.onExtraCallback) != 0 && this.IAuthTabCallback == i2) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact != -9223372036854775807L);
            this.onExtraCallbackWithResult.onExtraCallback(this.onTransact, 1, this.onExtraCallback, 0, null);
            this.IAuthTabCallbackDefault = false;
        }
    }
}
