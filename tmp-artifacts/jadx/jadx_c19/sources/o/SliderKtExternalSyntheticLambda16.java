package o;

import androidx.annotation.Nullable;
import java.util.Objects;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda25;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda16 implements SliderKtExternalSyntheticLambda22 {
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private int access000;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 asBinder;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 asInterface;
    private int getInterfaceDescriptor;
    private int onExtraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 onExtraCallbackWithResult;
    private String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtExternalSyntheticLambda16(String str) {
        this(null, 0, str);
    }

    public SliderKtExternalSyntheticLambda16(@Nullable String str, int i2, String str2) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[128]);
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21;
        this.asInterface = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted);
        this.getInterfaceDescriptor = 0;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
        this.onTransact = str;
        this.IAuthTabCallbackDefault = i2;
        this.onWarmupCompleted = str2;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.getInterfaceDescriptor = 0;
        this.onExtraCallback = 0;
        this.IAuthTabCallbackStub = false;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.onNavigationEvent = onextracallbackwithresult.IAuthTabCallback();
        this.asBinder = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.IAuthTabCallbackStubProxy = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.asBinder);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.getInterfaceDescriptor;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.access000 - this.onExtraCallback);
                        this.asBinder.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin);
                        int i3 = this.onExtraCallback + iMin;
                        this.onExtraCallback = i3;
                        if (i3 == this.access000) {
                            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy != -9223372036854775807L);
                            this.asBinder.onExtraCallback(this.IAuthTabCallbackStubProxy, 1, this.access000, 0, null);
                            this.IAuthTabCallbackStubProxy += this.IAuthTabCallback_Parcel;
                            this.getInterfaceDescriptor = 0;
                        }
                    }
                } else if (IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.asInterface.onExtraCallback(), 128)) {
                    IAuthTabCallback();
                    this.asInterface.asBinder(0);
                    this.asBinder.onNavigationEvent(this.asInterface, 128);
                    this.getInterfaceDescriptor = 2;
                }
            } else if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                this.getInterfaceDescriptor = 1;
                this.asInterface.onExtraCallback()[0] = 11;
                this.asInterface.onExtraCallback()[1] = 119;
                this.onExtraCallback = 2;
            }
        }
    }

    private boolean IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, byte[] bArr, int i2) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), i2 - this.onExtraCallback);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, this.onExtraCallback, iMin);
        int i3 = this.onExtraCallback + iMin;
        this.onExtraCallback = i3;
        return i3 == i2;
    }

    private boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        while (true) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() <= 0) {
                return false;
            }
            if (!this.IAuthTabCallbackStub) {
                this.IAuthTabCallbackStub = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 11;
            } else {
                int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                if (iOnMinimized == 119) {
                    this.IAuthTabCallbackStub = false;
                    return true;
                }
                this.IAuthTabCallbackStub = iOnMinimized == 11;
            }
        }
    }

    @RequiresNonNull
    private void IAuthTabCallback() {
        this.onExtraCallbackWithResult.onWarmupCompleted(0);
        DrawerKtExternalSyntheticLambda25.onExtraCallback onExtraCallback = DrawerKtExternalSyntheticLambda25.onExtraCallback(this.onExtraCallbackWithResult);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallback;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null || onExtraCallback.onExtraCallbackWithResult != basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent || onExtraCallback.IAuthTabCallbackDefault != basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch || !Objects.equals(onExtraCallback.onWarmupCompleted, basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultExtraCallback = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.onNavigationEvent).onNavigationEvent(this.onWarmupCompleted).IAuthTabCallbackDefault(onExtraCallback.onWarmupCompleted).onExtraCallback(onExtraCallback.onExtraCallbackWithResult).extraCallbackWithResult(onExtraCallback.IAuthTabCallbackDefault).onWarmupCompleted(this.onTransact).readTypedObject(this.IAuthTabCallbackDefault).extraCallback(onExtraCallback.onExtraCallback);
            if ("audio/ac3".equals(onExtraCallback.onWarmupCompleted)) {
                onextracallbackwithresultExtraCallback.onNavigationEvent(onExtraCallback.onExtraCallback);
            }
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = onextracallbackwithresultExtraCallback.onNavigationEvent();
            this.IAuthTabCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
            this.asBinder.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
        }
        this.access000 = onExtraCallback.onNavigationEvent;
        this.IAuthTabCallback_Parcel = (onExtraCallback.IAuthTabCallback * 1000000) / this.IAuthTabCallback.prefetch;
    }
}
