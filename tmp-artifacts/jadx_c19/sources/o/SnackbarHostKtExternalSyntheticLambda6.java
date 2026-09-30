package o;

import o.SnackbarKtExternalSyntheticLambda3;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarHostKtExternalSyntheticLambda6 implements SnackbarKtExternalSyntheticLambda3 {
    private boolean IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private int onExtraCallback;
    private final SnackbarHostKtExternalSyntheticLambda4 onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(32);

    public SnackbarHostKtExternalSyntheticLambda6(SnackbarHostKtExternalSyntheticLambda4 snackbarHostKtExternalSyntheticLambda4) {
        this.onExtraCallbackWithResult = snackbarHostKtExternalSyntheticLambda4;
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onExtraCallbackWithResult.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda24, drawerStateExternalSyntheticLambda1, onextracallbackwithresult);
        this.IAuthTabCallbackDefault = true;
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3
    public void onNavigationEvent() {
        this.IAuthTabCallbackDefault = true;
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3
    public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        boolean z = (i2 & 1) != 0;
        int iOnWarmupCompleted = z ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() : 0;
        if (this.IAuthTabCallbackDefault) {
            if (!z) {
                return;
            }
            this.IAuthTabCallbackDefault = false;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            this.onNavigationEvent = 0;
        }
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i3 = this.onNavigationEvent;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() - 1);
                    if (iOnMinimized == 255) {
                        this.IAuthTabCallbackDefault = true;
                        return;
                    }
                }
                int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), 3 - this.onNavigationEvent);
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onWarmupCompleted.onExtraCallback(), this.onNavigationEvent, iMin);
                int i4 = this.onNavigationEvent + iMin;
                this.onNavigationEvent = i4;
                if (i4 == 3) {
                    this.onWarmupCompleted.asBinder(0);
                    this.onWarmupCompleted.onNavigationEvent(3);
                    this.onWarmupCompleted.IAuthTabCallbackDefault(1);
                    int iOnMinimized2 = this.onWarmupCompleted.onMinimized();
                    int iOnMinimized3 = this.onWarmupCompleted.onMinimized();
                    this.IAuthTabCallback = (iOnMinimized2 & 128) != 0;
                    this.onExtraCallback = (((iOnMinimized2 & 15) << 8) | iOnMinimized3) + 3;
                    int iIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
                    int i5 = this.onExtraCallback;
                    if (iIAuthTabCallback < i5) {
                        this.onWarmupCompleted.IAuthTabCallback(Math.min(4098, Math.max(i5, this.onWarmupCompleted.IAuthTabCallback() << 1)));
                    }
                }
            } else {
                int iMin2 = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.onExtraCallback - this.onNavigationEvent);
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onWarmupCompleted.onExtraCallback(), this.onNavigationEvent, iMin2);
                int i6 = this.onNavigationEvent + iMin2;
                this.onNavigationEvent = i6;
                int i7 = this.onExtraCallback;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.IAuthTabCallback) {
                        if (((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(473604105, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.onWarmupCompleted.onExtraCallback(), 0, Integer.valueOf(this.onExtraCallback), -1}, -473604088)).intValue() != 0) {
                            this.IAuthTabCallbackDefault = true;
                            return;
                        }
                        this.onWarmupCompleted.onNavigationEvent(this.onExtraCallback - 4);
                    } else {
                        this.onWarmupCompleted.onNavigationEvent(i7);
                    }
                    this.onWarmupCompleted.asBinder(0);
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.onWarmupCompleted);
                    this.onNavigationEvent = 0;
                }
            }
        }
    }
}
