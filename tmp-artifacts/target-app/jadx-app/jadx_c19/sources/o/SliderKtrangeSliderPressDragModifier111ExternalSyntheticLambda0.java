package o;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SliderKtsliderTapModifier211ExternalSyntheticLambda0;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtrangeSliderPressDragModifier111ExternalSyntheticLambda0 implements SliderKtExternalSyntheticLambda22 {
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallback_Parcel;
    private String asBinder;
    private int extraCallback;
    private int getInterfaceDescriptor;
    private int onActivityLayout;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private final String onWarmupCompleted;
    private int ICustomTabsCallback = 0;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 access000 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(new byte[15], 2);
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 asInterface = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private SliderKtsliderTapModifier211ExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallbackStub = new SliderKtsliderTapModifier211ExternalSyntheticLambda0.IAuthTabCallback();
    private int writeTypedObject = -2147483647;
    private int readTypedObject = -1;
    private long access100 = -1;
    private boolean IAuthTabCallbackStubProxy = true;
    private boolean IAuthTabCallbackDefault = true;
    private double extraCallbackWithResult = -9.223372036854776E18d;
    private double onActivityResized = -9.223372036854776E18d;

    private boolean onNavigationEvent(int i2) {
        return i2 == 1 || i2 == 17;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtrangeSliderPressDragModifier111ExternalSyntheticLambda0(String str) {
        this.onWarmupCompleted = str;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.ICustomTabsCallback = 0;
        this.extraCallback = 0;
        this.access000.onExtraCallback(2);
        this.getInterfaceDescriptor = 0;
        this.onTransact = 0;
        this.writeTypedObject = -2147483647;
        this.readTypedObject = -1;
        this.onActivityLayout = 0;
        this.access100 = -1L;
        this.onExtraCallbackWithResult = false;
        this.onExtraCallback = false;
        this.IAuthTabCallbackDefault = true;
        this.IAuthTabCallbackStubProxy = true;
        this.extraCallbackWithResult = -9.223372036854776E18d;
        this.onActivityResized = -9.223372036854776E18d;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.asBinder = onextracallbackwithresult.IAuthTabCallback();
        this.IAuthTabCallback_Parcel = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.onNavigationEvent = i2;
        if (!this.IAuthTabCallbackStubProxy && (this.onTransact != 0 || !this.IAuthTabCallbackDefault)) {
            this.onExtraCallback = true;
        }
        if (j != -9223372036854775807L) {
            if (this.onExtraCallback) {
                this.onActivityResized = j;
            } else {
                this.extraCallbackWithResult = j;
            }
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback_Parcel);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.ICustomTabsCallback;
            if (i2 != 0) {
                if (i2 == 1) {
                    onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.access000, false);
                    if (this.access000.onNavigationEvent() == 0) {
                        if (IAuthTabCallback()) {
                            this.access000.asBinder(0);
                            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = this.IAuthTabCallback_Parcel;
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = this.access000;
                            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda202, textFieldDecoratorModifierNodeExternalSyntheticLambda202.onExtraCallbackWithResult());
                            this.access000.onExtraCallback(2);
                            this.IAuthTabCallback.onExtraCallback(this.IAuthTabCallbackStub.onWarmupCompleted);
                            this.IAuthTabCallbackDefault = true;
                            this.ICustomTabsCallback = 2;
                        } else if (this.access000.onExtraCallbackWithResult() < 15) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda203 = this.access000;
                            textFieldDecoratorModifierNodeExternalSyntheticLambda203.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda203.onExtraCallbackWithResult() + 1);
                            this.IAuthTabCallbackDefault = false;
                        }
                    } else {
                        this.IAuthTabCallbackDefault = false;
                    }
                } else if (i2 == 2) {
                    if (onNavigationEvent(this.IAuthTabCallbackStub.onExtraCallback)) {
                        onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallback, true);
                    }
                    onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                    int i3 = this.getInterfaceDescriptor;
                    SliderKtsliderTapModifier211ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStub;
                    if (i3 == iAuthTabCallback.onWarmupCompleted) {
                        int i4 = iAuthTabCallback.onExtraCallback;
                        if (i4 == 1) {
                            IAuthTabCallback(new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(this.IAuthTabCallback.onExtraCallback()));
                        } else if (i4 == 17) {
                            this.onActivityLayout = SliderKtsliderTapModifier211ExternalSyntheticLambda0.onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(this.IAuthTabCallback.onExtraCallback()));
                        } else if (i4 == 2) {
                            onNavigationEvent();
                        }
                        this.ICustomTabsCallback = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) {
                this.ICustomTabsCallback = 1;
            }
        }
    }

    private void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202, boolean z) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), textFieldDecoratorModifierNodeExternalSyntheticLambda202.onNavigationEvent());
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda202.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda202.onWarmupCompleted(), iMin);
        textFieldDecoratorModifierNodeExternalSyntheticLambda202.IAuthTabCallbackDefault(iMin);
        if (z) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        }
    }

    private boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2 = this.onNavigationEvent;
        if ((i2 & 2) == 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
            return false;
        }
        if ((i2 & 4) != 0) {
            return true;
        }
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i3 = this.extraCallback << 8;
            this.extraCallback = i3;
            int iOnMinimized = i3 | textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            this.extraCallback = iOnMinimized;
            if (SliderKtsliderTapModifier211ExternalSyntheticLambda0.onWarmupCompleted(iOnMinimized)) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() - 3);
                this.extraCallback = 0;
                return true;
            }
        }
        return false;
    }

    private boolean IAuthTabCallback() throws ParserException {
        int iOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        this.asInterface.onExtraCallback(this.access000.onExtraCallback(), iOnExtraCallbackWithResult);
        boolean zOnExtraCallback = SliderKtsliderTapModifier211ExternalSyntheticLambda0.onExtraCallback(this.asInterface, this.IAuthTabCallbackStub);
        if (zOnExtraCallback) {
            this.getInterfaceDescriptor = 0;
            this.onTransact += this.IAuthTabCallbackStub.onWarmupCompleted + iOnExtraCallbackWithResult;
        }
        return zOnExtraCallback;
    }

    @RequiresNonNull
    private void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.IAuthTabCallbackStub.onWarmupCompleted - this.getInterfaceDescriptor);
        this.IAuthTabCallback_Parcel.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iMin);
        this.getInterfaceDescriptor += iMin;
    }

    @RequiresNonNull
    private void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        SliderKtsliderTapModifier211ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnExtraCallback = SliderKtsliderTapModifier211ExternalSyntheticLambda0.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
        this.writeTypedObject = onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult;
        this.readTypedObject = onwarmupcompletedOnExtraCallback.onExtraCallback;
        long j = this.access100;
        long j2 = this.IAuthTabCallbackStub.onNavigationEvent;
        if (j != j2) {
            this.access100 = j2;
            String str = "mhm1";
            if (onwarmupcompletedOnExtraCallback.IAuthTabCallback != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(onwarmupcompletedOnExtraCallback.IAuthTabCallback));
            }
            byte[] bArr = onwarmupcompletedOnExtraCallback.onNavigationEvent;
            this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.asBinder).onNavigationEvent(this.onWarmupCompleted).IAuthTabCallbackDefault("audio/mhm1").extraCallbackWithResult(this.writeTypedObject).onExtraCallback(str).IAuthTabCallback((bArr == null || bArr.length <= 0) ? null : ImmutableList.of(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted, bArr)).onNavigationEvent());
        }
        this.onExtraCallbackWithResult = true;
    }

    @RequiresNonNull
    private void onNavigationEvent() {
        int i2;
        if (this.onExtraCallbackWithResult) {
            this.IAuthTabCallbackStubProxy = false;
            i2 = 1;
        } else {
            i2 = 0;
        }
        double d = ((this.readTypedObject - this.onActivityLayout) * 1000000.0d) / this.writeTypedObject;
        long jRound = Math.round(this.extraCallbackWithResult);
        if (this.onExtraCallback) {
            this.onExtraCallback = false;
            this.extraCallbackWithResult = this.onActivityResized;
        } else {
            this.extraCallbackWithResult += d;
        }
        this.IAuthTabCallback_Parcel.onExtraCallback(jRound, i2, this.onTransact, 0, null);
        this.onExtraCallbackWithResult = false;
        this.onActivityLayout = 0;
        this.onTransact = 0;
    }
}
