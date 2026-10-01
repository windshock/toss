package o;

import androidx.annotation.Nullable;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda3;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda2 implements SliderKtExternalSyntheticLambda22 {
    private boolean IAuthTabCallback;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private int access000;
    private long access100;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 asBinder;
    private boolean asInterface;
    private int getInterfaceDescriptor;
    private final String onExtraCallback;
    private String onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final String onTransact;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtExternalSyntheticLambda2(String str) {
        this(null, 0, str);
    }

    public SliderKtExternalSyntheticLambda2(@Nullable String str, int i2, String str2) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[16]);
        this.asBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda21;
        this.IAuthTabCallbackStub = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted);
        this.getInterfaceDescriptor = 0;
        this.onNavigationEvent = 0;
        this.asInterface = false;
        this.IAuthTabCallback = false;
        this.access100 = -9223372036854775807L;
        this.onTransact = str;
        this.IAuthTabCallbackStubProxy = i2;
        this.onExtraCallback = str2;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.getInterfaceDescriptor = 0;
        this.onNavigationEvent = 0;
        this.asInterface = false;
        this.IAuthTabCallback = false;
        this.access100 = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.onExtraCallbackWithResult = onextracallbackwithresult.IAuthTabCallback();
        this.IAuthTabCallbackDefault = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.access100 = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.getInterfaceDescriptor;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.access000 - this.onNavigationEvent);
                        this.IAuthTabCallbackDefault.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin);
                        int i3 = this.onNavigationEvent + iMin;
                        this.onNavigationEvent = i3;
                        if (i3 == this.access000) {
                            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100 != -9223372036854775807L);
                            this.IAuthTabCallbackDefault.onExtraCallback(this.access100, 1, this.access000, 0, null);
                            this.access100 += this.IAuthTabCallback_Parcel;
                            this.getInterfaceDescriptor = 0;
                        }
                    }
                } else if (IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallbackStub.onExtraCallback(), 16)) {
                    onExtraCallback();
                    this.IAuthTabCallbackStub.asBinder(0);
                    this.IAuthTabCallbackDefault.onNavigationEvent(this.IAuthTabCallbackStub, 16);
                    this.getInterfaceDescriptor = 2;
                }
            } else if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                this.getInterfaceDescriptor = 1;
                this.IAuthTabCallbackStub.onExtraCallback()[0] = -84;
                this.IAuthTabCallbackStub.onExtraCallback()[1] = (byte) (this.IAuthTabCallback ? 65 : 64);
                this.onNavigationEvent = 2;
            }
        }
    }

    private boolean IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, byte[] bArr, int i2) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), i2 - this.onNavigationEvent);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, this.onNavigationEvent, iMin);
        int i3 = this.onNavigationEvent + iMin;
        this.onNavigationEvent = i3;
        return i3 == i2;
    }

    private boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnMinimized;
        while (true) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() <= 0) {
                return false;
            }
            if (!this.asInterface) {
                this.asInterface = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 172;
            } else {
                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                this.asInterface = iOnMinimized == 172;
                if (iOnMinimized == 64 || iOnMinimized == 65) {
                    break;
                }
            }
        }
        this.IAuthTabCallback = iOnMinimized == 65;
        return true;
    }

    @RequiresNonNull
    private void onExtraCallback() {
        this.asBinder.onWarmupCompleted(0);
        DrawerKtExternalSyntheticLambda3.onExtraCallback onextracallbackOnWarmupCompleted = DrawerKtExternalSyntheticLambda3.onWarmupCompleted(this.asBinder);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onWarmupCompleted;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null || onextracallbackOnWarmupCompleted.onNavigationEvent != basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent || onextracallbackOnWarmupCompleted.onExtraCallbackWithResult != basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch || !"audio/ac4".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.onExtraCallbackWithResult).onNavigationEvent(this.onExtraCallback).IAuthTabCallbackDefault("audio/ac4").onExtraCallback(onextracallbackOnWarmupCompleted.onNavigationEvent).extraCallbackWithResult(onextracallbackOnWarmupCompleted.onExtraCallbackWithResult).onWarmupCompleted(this.onTransact).readTypedObject(this.IAuthTabCallbackStubProxy).onNavigationEvent();
            this.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
            this.IAuthTabCallbackDefault.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
        }
        this.access000 = onextracallbackOnWarmupCompleted.IAuthTabCallback;
        this.IAuthTabCallback_Parcel = (onextracallbackOnWarmupCompleted.onWarmupCompleted * 1000000) / this.onWarmupCompleted.prefetch;
    }
}
