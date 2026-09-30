package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.common.primitives.Ints;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda3 implements SliderKtExternalSyntheticLambda22 {
    private final String IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private long access000;
    private int access100;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 asBinder;
    private final int asInterface;
    private int getInterfaceDescriptor;
    private String onExtraCallbackWithResult;
    private int onNavigationEvent;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onTransact;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;
    private int IAuthTabCallback_Parcel = 0;
    private long IAuthTabCallbackStubProxy = -9223372036854775807L;
    private final AtomicInteger extraCallback = new AtomicInteger();
    private int onExtraCallback = -1;
    private int writeTypedObject = -1;

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtExternalSyntheticLambda3(@Nullable String str, int i2, int i3, String str2) {
        this.asBinder = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(new byte[i3]);
        this.IAuthTabCallbackStub = str;
        this.asInterface = i2;
        this.IAuthTabCallback = str2;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.IAuthTabCallback_Parcel = 0;
        this.onNavigationEvent = 0;
        this.access100 = 0;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
        this.extraCallback.set(0);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.onExtraCallbackWithResult = onextracallbackwithresult.IAuthTabCallback();
        this.onTransact = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.IAuthTabCallbackStubProxy = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onTransact);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            switch (this.IAuthTabCallback_Parcel) {
                case 0:
                    if (!onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                        break;
                    } else {
                        int i2 = this.IAuthTabCallbackDefault;
                        if (i2 != 3 && i2 != 4) {
                            if (i2 == 1) {
                                this.IAuthTabCallback_Parcel = 1;
                                break;
                            } else {
                                this.IAuthTabCallback_Parcel = 2;
                                break;
                            }
                        } else {
                            this.IAuthTabCallback_Parcel = 4;
                            break;
                        }
                    }
                    break;
                case 1:
                    if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.asBinder.onExtraCallback(), 18)) {
                        break;
                    } else {
                        onNavigationEvent();
                        this.asBinder.asBinder(0);
                        this.onTransact.onNavigationEvent(this.asBinder, 18);
                        this.IAuthTabCallback_Parcel = 6;
                        break;
                    }
                case 2:
                    if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.asBinder.onExtraCallback(), 7)) {
                        break;
                    } else {
                        this.onExtraCallback = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onNavigationEvent(this.asBinder.onExtraCallback());
                        this.IAuthTabCallback_Parcel = 3;
                        break;
                    }
                case 3:
                    if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.asBinder.onExtraCallback(), this.onExtraCallback)) {
                        break;
                    } else {
                        onExtraCallback();
                        this.asBinder.asBinder(0);
                        this.onTransact.onNavigationEvent(this.asBinder, this.onExtraCallback);
                        this.IAuthTabCallback_Parcel = 6;
                        break;
                    }
                case 4:
                    if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.asBinder.onExtraCallback(), 6)) {
                        break;
                    } else {
                        int iOnExtraCallback = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallback(this.asBinder.onExtraCallback());
                        this.writeTypedObject = iOnExtraCallback;
                        int i3 = this.onNavigationEvent;
                        if (i3 > iOnExtraCallback) {
                            int i4 = i3 - iOnExtraCallback;
                            this.onNavigationEvent = i3 - i4;
                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() - i4);
                        }
                        this.IAuthTabCallback_Parcel = 5;
                        break;
                    }
                case 5:
                    if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.asBinder.onExtraCallback(), this.writeTypedObject)) {
                        break;
                    } else {
                        onExtraCallbackWithResult();
                        this.asBinder.asBinder(0);
                        this.onTransact.onNavigationEvent(this.asBinder, this.writeTypedObject);
                        this.IAuthTabCallback_Parcel = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.getInterfaceDescriptor - this.onNavigationEvent);
                    this.onTransact.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin);
                    int i5 = this.onNavigationEvent + iMin;
                    this.onNavigationEvent = i5;
                    if (i5 == this.getInterfaceDescriptor) {
                        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy != -9223372036854775807L);
                        this.onTransact.onExtraCallback(this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault == 4 ? 0 : 1, this.getInterfaceDescriptor, 0, null);
                        this.IAuthTabCallbackStubProxy += this.access000;
                        this.IAuthTabCallback_Parcel = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, byte[] bArr, int i2) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), i2 - this.onNavigationEvent);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, this.onNavigationEvent, iMin);
        int i3 = this.onNavigationEvent + iMin;
        this.onNavigationEvent = i3;
        return i3 == i2;
    }

    private boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.access100 << 8;
            this.access100 = i2;
            int iOnMinimized = i2 | textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            this.access100 = iOnMinimized;
            int iOnExtraCallbackWithResult = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallbackWithResult(iOnMinimized);
            this.IAuthTabCallbackDefault = iOnExtraCallbackWithResult;
            if (iOnExtraCallbackWithResult != 0) {
                byte[] bArrOnExtraCallback = this.asBinder.onExtraCallback();
                int i3 = this.access100;
                bArrOnExtraCallback[0] = (byte) (i3 >>> 24);
                bArrOnExtraCallback[1] = (byte) (i3 >> 16);
                bArrOnExtraCallback[2] = (byte) (i3 >> 8);
                bArrOnExtraCallback[3] = (byte) i3;
                this.onNavigationEvent = 4;
                this.access100 = 0;
                return true;
            }
        }
        return false;
    }

    @RequiresNonNull
    private void onNavigationEvent() {
        byte[] bArrOnExtraCallback = this.asBinder.onExtraCallback();
        if (this.onWarmupCompleted == null) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallback = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallback(bArrOnExtraCallback, this.onExtraCallbackWithResult, this.IAuthTabCallbackStub, this.asInterface, this.IAuthTabCallback, null);
            this.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallback;
            this.onTransact.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallback);
        }
        this.getInterfaceDescriptor = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallbackWithResult(bArrOnExtraCallback);
        this.access000 = Ints.checkedCast(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onWarmupCompleted(bArrOnExtraCallback), this.onWarmupCompleted.prefetch));
    }

    @RequiresNonNull
    private void onExtraCallback() throws ParserException {
        DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallback onextracallbackIAuthTabCallback = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.IAuthTabCallback(this.asBinder.onExtraCallback());
        onExtraCallback(onextracallbackIAuthTabCallback);
        this.getInterfaceDescriptor = onextracallbackIAuthTabCallback.onWarmupCompleted;
        long j = onextracallbackIAuthTabCallback.IAuthTabCallback;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.access000 = j;
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult() throws ParserException {
        DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallback onextracallbackOnExtraCallbackWithResult = DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallbackWithResult(this.asBinder.onExtraCallback(), this.extraCallback);
        if (this.IAuthTabCallbackDefault == 3) {
            onExtraCallback(onextracallbackOnExtraCallbackWithResult);
        }
        this.getInterfaceDescriptor = onextracallbackOnExtraCallbackWithResult.onWarmupCompleted;
        long j = onextracallbackOnExtraCallbackWithResult.IAuthTabCallback;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.access000 = j;
    }

    @RequiresNonNull
    private void onExtraCallback(DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i2;
        int i3 = onextracallback.asInterface;
        if (i3 == -2147483647 || (i2 = onextracallback.onExtraCallback) == -1) {
            return;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onWarmupCompleted;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null && i2 == basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent && i3 == basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch && Objects.equals(onextracallback.onNavigationEvent, basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            return;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.onWarmupCompleted;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = (basicTextContextMenuProviderKtExternalSyntheticLambda42 == null ? new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult() : basicTextContextMenuProviderKtExternalSyntheticLambda42.onExtraCallback()).onExtraCallbackWithResult(this.onExtraCallbackWithResult).onNavigationEvent(this.IAuthTabCallback).IAuthTabCallbackDefault(onextracallback.onNavigationEvent).onExtraCallback(onextracallback.onExtraCallback).extraCallbackWithResult(onextracallback.asInterface).onWarmupCompleted(this.IAuthTabCallbackStub).readTypedObject(this.asInterface).onNavigationEvent();
        this.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
        this.onTransact.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
    }
}
