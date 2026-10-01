package o;

import androidx.annotation.Nullable;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ExposedDropdownMenuDefaultsExternalSyntheticLambda2;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtanimateToTarget2ExternalSyntheticLambda0 implements SliderKtExternalSyntheticLambda22 {
    private int IAuthTabCallback;
    private final ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallback_Parcel;
    private long access000;
    private boolean asBinder;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 asInterface;
    private final int getInterfaceDescriptor;
    private int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private String onNavigationEvent;
    private final String onTransact;
    private long onWarmupCompleted;

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtanimateToTarget2ExternalSyntheticLambda0(String str) {
        this(null, 0, str);
    }

    public SliderKtanimateToTarget2ExternalSyntheticLambda0(@Nullable String str, int i2, String str2) {
        this.IAuthTabCallbackStubProxy = 0;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
        this.asInterface = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[0] = -1;
        this.IAuthTabCallbackDefault = new ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback();
        this.access000 = -9223372036854775807L;
        this.onTransact = str;
        this.getInterfaceDescriptor = i2;
        this.onExtraCallbackWithResult = str2;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.IAuthTabCallbackStubProxy = 0;
        this.onExtraCallback = 0;
        this.asBinder = false;
        this.access000 = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.onNavigationEvent = onextracallbackwithresult.IAuthTabCallback();
        this.IAuthTabCallback_Parcel = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.access000 = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback_Parcel);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.IAuthTabCallbackStubProxy;
            if (i2 == 0) {
                onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else if (i2 == 1) {
                onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else if (i2 == 2) {
                onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        for (int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(); iOnWarmupCompleted < iOnExtraCallbackWithResult; iOnWarmupCompleted++) {
            byte b = bArrOnExtraCallback[iOnWarmupCompleted];
            boolean z = (b & 255) == 255;
            boolean z2 = this.asBinder && (b & 224) == 224;
            this.asBinder = z;
            if (z2) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + 1);
                this.asBinder = false;
                this.asInterface.onExtraCallback()[1] = bArrOnExtraCallback[iOnWarmupCompleted];
                this.onExtraCallback = 2;
                this.IAuthTabCallbackStubProxy = 1;
                return;
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnExtraCallbackWithResult);
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), 4 - this.onExtraCallback);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.asInterface.onExtraCallback(), this.onExtraCallback, iMin);
        int i2 = this.onExtraCallback + iMin;
        this.onExtraCallback = i2;
        if (i2 < 4) {
            return;
        }
        this.asInterface.asBinder(0);
        if (!this.IAuthTabCallbackDefault.onWarmupCompleted(this.asInterface.asBinder())) {
            this.onExtraCallback = 0;
            this.IAuthTabCallbackStubProxy = 1;
            return;
        }
        this.IAuthTabCallback = this.IAuthTabCallbackDefault.onExtraCallback;
        if (!this.IAuthTabCallbackStub) {
            this.onWarmupCompleted = (r8.IAuthTabCallbackStub * 1000000) / r8.onNavigationEvent;
            this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.onNavigationEvent).onNavigationEvent(this.onExtraCallbackWithResult).IAuthTabCallbackDefault(this.IAuthTabCallbackDefault.onWarmupCompleted).IAuthTabCallbackStubProxy(4096).onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallback).extraCallbackWithResult(this.IAuthTabCallbackDefault.onNavigationEvent).onWarmupCompleted(this.onTransact).readTypedObject(this.getInterfaceDescriptor).onNavigationEvent());
            this.IAuthTabCallbackStub = true;
        }
        this.asInterface.asBinder(0);
        this.IAuthTabCallback_Parcel.onNavigationEvent(this.asInterface, 4);
        this.IAuthTabCallbackStubProxy = 2;
    }

    @RequiresNonNull
    private void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.IAuthTabCallback - this.onExtraCallback);
        this.IAuthTabCallback_Parcel.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin);
        int i2 = this.onExtraCallback + iMin;
        this.onExtraCallback = i2;
        if (i2 < this.IAuthTabCallback) {
            return;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access000 != -9223372036854775807L);
        this.IAuthTabCallback_Parcel.onExtraCallback(this.access000, 1, this.IAuthTabCallback, 0, null);
        this.access000 += this.onWarmupCompleted;
        this.onExtraCallback = 0;
        this.IAuthTabCallbackStubProxy = 0;
    }
}
