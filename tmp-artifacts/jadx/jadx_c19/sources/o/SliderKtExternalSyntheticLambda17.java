package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.Collections;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda23;
import o.SnackbarKtExternalSyntheticLambda3;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda17 implements SliderKtExternalSyntheticLambda22 {
    private static final byte[] onExtraCallback = {73, 68, 51};
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 IAuthTabCallback;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private final int ICustomTabsCallback;
    private boolean access000;
    private String access100;
    private final boolean asBinder;
    private int asInterface;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 extraCallback;
    private final String extraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 getInterfaceDescriptor;
    private long onActivityResized;
    private final String onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private int onMinimized;
    private int onNavigationEvent;
    private long onPostMessage;
    private int onTransact;
    private int onWarmupCompleted;
    private int readTypedObject;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 writeTypedObject;

    public static boolean onNavigationEvent(int i2) {
        return (i2 & 65526) == 65520;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtExternalSyntheticLambda17(boolean z, String str) {
        this(z, null, 0, str);
    }

    public SliderKtExternalSyntheticLambda17(boolean z, @Nullable String str, int i2, String str2) {
        this.IAuthTabCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[7]);
        this.getInterfaceDescriptor = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(Arrays.copyOf(onExtraCallback, 10));
        this.asInterface = -1;
        this.onTransact = -1;
        this.onActivityResized = -9223372036854775807L;
        this.onPostMessage = -9223372036854775807L;
        this.asBinder = z;
        this.extraCallbackWithResult = str;
        this.ICustomTabsCallback = i2;
        this.onExtraCallbackWithResult = str2;
        asBinder();
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.onPostMessage = -9223372036854775807L;
        IAuthTabCallbackDefault();
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.access100 = onextracallbackwithresult.IAuthTabCallback();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
        this.writeTypedObject = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.IAuthTabCallbackDefault = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        if (this.asBinder) {
            onextracallbackwithresult.onExtraCallback();
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 5);
            this.extraCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2;
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(onextracallbackwithresult.IAuthTabCallback()).onNavigationEvent(this.onExtraCallbackWithResult).IAuthTabCallbackDefault("application/id3").onNavigationEvent());
            return;
        }
        this.extraCallback = new DrawerKtExternalSyntheticLambda6();
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.onPostMessage = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        onExtraCallbackWithResult();
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.onMinimized;
            if (i2 == 0) {
                onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else if (i2 == 1) {
                onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallback.onWarmupCompleted, this.access000 ? 7 : 5)) {
                        IAuthTabCallback();
                    }
                } else if (i2 == 4) {
                    onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                } else {
                    throw new IllegalStateException();
                }
            } else if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.getInterfaceDescriptor.onExtraCallback(), 10)) {
                onExtraCallback();
            }
        }
    }

    public long onNavigationEvent() {
        return this.onActivityResized;
    }

    private void IAuthTabCallbackDefault() {
        this.IAuthTabCallbackStubProxy = false;
        asBinder();
    }

    private boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, byte[] bArr, int i2) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), i2 - this.onWarmupCompleted);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, this.onWarmupCompleted, iMin);
        int i3 = this.onWarmupCompleted + iMin;
        this.onWarmupCompleted = i3;
        return i3 == i2;
    }

    private void asBinder() {
        this.onMinimized = 0;
        this.onWarmupCompleted = 0;
        this.readTypedObject = 256;
    }

    private void onTransact() {
        this.onMinimized = 2;
        this.onWarmupCompleted = onExtraCallback.length;
        this.onMessageChannelReady = 0;
        this.getInterfaceDescriptor.asBinder(0);
    }

    private void IAuthTabCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, long j, int i2, int i3) {
        this.onMinimized = 4;
        this.onWarmupCompleted = i2;
        this.IAuthTabCallbackDefault = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        this.IAuthTabCallbackStub = j;
        this.onMessageChannelReady = i3;
    }

    private void IAuthTabCallbackStub() {
        this.onMinimized = 3;
        this.onWarmupCompleted = 0;
    }

    private void asInterface() {
        this.onMinimized = 1;
        this.onWarmupCompleted = 0;
    }

    private void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        while (iOnWarmupCompleted < iOnExtraCallbackWithResult) {
            int i2 = iOnWarmupCompleted + 1;
            byte b = bArrOnExtraCallback[iOnWarmupCompleted];
            int i3 = b & 255;
            if (this.readTypedObject == 512 && onWarmupCompleted((byte) -1, (byte) i3) && (this.IAuthTabCallbackStubProxy || onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted - 1))) {
                this.onNavigationEvent = (b & 8) >> 3;
                this.access000 = (b & 1) == 0;
                if (!this.IAuthTabCallbackStubProxy) {
                    asInterface();
                } else {
                    IAuthTabCallbackStub();
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2);
                return;
            }
            int i4 = this.readTypedObject;
            int i5 = i3 | i4;
            if (i5 == 329) {
                this.readTypedObject = 768;
            } else if (i5 == 511) {
                this.readTypedObject = 512;
            } else if (i5 == 836) {
                this.readTypedObject = 1024;
            } else if (i5 == 1075) {
                onTransact();
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2);
                return;
            } else if (i4 != 256) {
                this.readTypedObject = 256;
            }
            iOnWarmupCompleted = i2;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
    }

    private void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() == 0) {
            return;
        }
        this.IAuthTabCallback.onWarmupCompleted[0] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted()];
        this.IAuthTabCallback.onWarmupCompleted(2);
        int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(4);
        int i2 = this.onTransact;
        if (i2 != -1 && iOnNavigationEvent != i2) {
            IAuthTabCallbackDefault();
            return;
        }
        if (!this.IAuthTabCallbackStubProxy) {
            this.IAuthTabCallbackStubProxy = true;
            this.asInterface = this.onNavigationEvent;
            this.onTransact = iOnNavigationEvent;
        }
        IAuthTabCallbackStub();
    }

    private boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 1);
        if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallback.onWarmupCompleted, 1)) {
            return false;
        }
        this.IAuthTabCallback.onWarmupCompleted(4);
        int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(1);
        int i3 = this.asInterface;
        if (i3 != -1 && iOnNavigationEvent != i3) {
            return false;
        }
        if (this.onTransact != -1) {
            if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallback.onWarmupCompleted, 1)) {
                return true;
            }
            this.IAuthTabCallback.onWarmupCompleted(2);
            if (this.IAuthTabCallback.onNavigationEvent(4) != this.onTransact) {
                return false;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 2);
        }
        if (!onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallback.onWarmupCompleted, 4)) {
            return true;
        }
        this.IAuthTabCallback.onWarmupCompleted(14);
        int iOnNavigationEvent2 = this.IAuthTabCallback.onNavigationEvent(13);
        if (iOnNavigationEvent2 < 7) {
            return false;
        }
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        int i4 = i2 + iOnNavigationEvent2;
        if (i4 >= iOnExtraCallbackWithResult) {
            return true;
        }
        byte b = bArrOnExtraCallback[i4];
        if (b == -1) {
            int i5 = i4 + 1;
            if (i5 == iOnExtraCallbackWithResult) {
                return true;
            }
            return onWarmupCompleted((byte) -1, bArrOnExtraCallback[i5]) && ((bArrOnExtraCallback[i5] & 8) >> 3) == iOnNavigationEvent;
        }
        if (b != 73) {
            return false;
        }
        int i6 = i4 + 1;
        if (i6 == iOnExtraCallbackWithResult) {
            return true;
        }
        if (bArrOnExtraCallback[i6] != 68) {
            return false;
        }
        int i7 = i4 + 2;
        return i7 == iOnExtraCallbackWithResult || bArrOnExtraCallback[i7] == 51;
    }

    private boolean onWarmupCompleted(byte b, byte b2) {
        return onNavigationEvent(((b & 255) << 8) | (b2 & 255));
    }

    private boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, byte[] bArr, int i2) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < i2) {
            return false;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i2);
        return true;
    }

    @RequiresNonNull
    private void onExtraCallback() {
        this.extraCallback.onNavigationEvent(this.getInterfaceDescriptor, 10);
        this.getInterfaceDescriptor.asBinder(6);
        IAuthTabCallback(this.extraCallback, 0L, 10, this.getInterfaceDescriptor.onPostMessage() + 10);
    }

    @RequiresNonNull
    private void IAuthTabCallback() throws ParserException {
        this.IAuthTabCallback.onWarmupCompleted(0);
        if (!this.IAuthTabCallback_Parcel) {
            int i2 = 2;
            int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(2) + 1;
            if (iOnNavigationEvent != 2) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AdtsReader", "Detected audio object type: " + iOnNavigationEvent + ", but assuming AAC LC.");
            } else {
                i2 = iOnNavigationEvent;
            }
            this.IAuthTabCallback.IAuthTabCallback(5);
            byte[] bArrOnWarmupCompleted = DrawerKtExternalSyntheticLambda23.onWarmupCompleted(i2, this.onTransact, this.IAuthTabCallback.onNavigationEvent(3));
            DrawerKtExternalSyntheticLambda23.onWarmupCompleted onwarmupcompletedIAuthTabCallback = DrawerKtExternalSyntheticLambda23.IAuthTabCallback(bArrOnWarmupCompleted);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.access100).onNavigationEvent(this.onExtraCallbackWithResult).IAuthTabCallbackDefault("audio/mp4a-latm").onExtraCallback(onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult).onExtraCallback(onwarmupcompletedIAuthTabCallback.onExtraCallback).extraCallbackWithResult(onwarmupcompletedIAuthTabCallback.IAuthTabCallback).IAuthTabCallback(Collections.singletonList(bArrOnWarmupCompleted)).onWarmupCompleted(this.extraCallbackWithResult).readTypedObject(this.ICustomTabsCallback).onNavigationEvent();
            this.onActivityResized = 1024000000 / basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.prefetch;
            this.writeTypedObject.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
            this.IAuthTabCallback_Parcel = true;
        } else {
            this.IAuthTabCallback.IAuthTabCallback(10);
        }
        this.IAuthTabCallback.IAuthTabCallback(4);
        int iOnNavigationEvent2 = this.IAuthTabCallback.onNavigationEvent(13);
        int i3 = iOnNavigationEvent2 - 7;
        if (this.access000) {
            i3 = iOnNavigationEvent2 - 9;
        }
        IAuthTabCallback(this.writeTypedObject, this.onActivityResized, 0, i3);
    }

    @RequiresNonNull
    private void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.onMessageChannelReady - this.onWarmupCompleted);
        this.IAuthTabCallbackDefault.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin);
        int i2 = this.onWarmupCompleted + iMin;
        this.onWarmupCompleted = i2;
        if (i2 == this.onMessageChannelReady) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onPostMessage != -9223372036854775807L);
            this.IAuthTabCallbackDefault.onExtraCallback(this.onPostMessage, 1, this.onMessageChannelReady, 0, null);
            this.onPostMessage += this.IAuthTabCallbackStub;
            asBinder();
        }
    }

    @EnsuresNonNull
    private void onExtraCallbackWithResult() {
        Object[] objArr = {this.IAuthTabCallbackDefault};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
        Object[] objArr2 = {this.extraCallback};
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, objArr2, -1084655742);
    }
}
