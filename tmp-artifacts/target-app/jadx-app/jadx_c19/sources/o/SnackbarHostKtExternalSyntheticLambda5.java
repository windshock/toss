package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarHostKtExternalSyntheticLambda5 implements SnackbarKtExternalSyntheticLambda3 {
    private boolean IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda24 access000;
    private boolean asBinder;
    private final SliderKtExternalSyntheticLambda22 asInterface;
    private long getInterfaceDescriptor;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private boolean onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[10]);
    private int IAuthTabCallbackDefault = 0;

    public SnackbarHostKtExternalSyntheticLambda5(SliderKtExternalSyntheticLambda22 sliderKtExternalSyntheticLambda22) {
        this.asInterface = sliderKtExternalSyntheticLambda22;
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        this.access000 = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        this.asInterface.onNavigationEvent(drawerStateExternalSyntheticLambda1, onextracallbackwithresult);
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3
    public void onNavigationEvent() {
        this.IAuthTabCallbackDefault = 0;
        this.onExtraCallback = 0;
        this.IAuthTabCallbackStub = false;
        this.asInterface.onWarmupCompleted();
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3
    public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) throws ParserException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.access000);
        if ((i2 & 1) != 0) {
            int i3 = this.IAuthTabCallbackDefault;
            if (i3 != 0 && i3 != 1) {
                if (i3 == 2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PesReader", "Unexpected start indicator reading extended header");
                } else if (i3 == 3) {
                    if (this.onNavigationEvent != -1) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PesReader", "Unexpected start indicator: expected " + this.onNavigationEvent + " more bytes");
                    }
                    this.asInterface.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            IAuthTabCallback(1);
        }
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i4 = this.IAuthTabCallbackDefault;
            if (i4 == 0) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
            } else if (i4 != 1) {
                if (i4 == 2) {
                    if (onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.onTransact.onWarmupCompleted, Math.min(10, this.onExtraCallbackWithResult)) && onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, null, this.onExtraCallbackWithResult)) {
                        onExtraCallbackWithResult();
                        i2 |= this.onWarmupCompleted ? 4 : 0;
                        this.asInterface.onNavigationEvent(this.getInterfaceDescriptor, i2);
                        IAuthTabCallback(3);
                    }
                } else if (i4 == 3) {
                    int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
                    int i5 = this.onNavigationEvent;
                    int i6 = i5 == -1 ? 0 : iOnNavigationEvent - i5;
                    if (i6 > 0) {
                        iOnNavigationEvent -= i6;
                        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + iOnNavigationEvent);
                    }
                    this.asInterface.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                    int i7 = this.onNavigationEvent;
                    if (i7 != -1) {
                        int i8 = i7 - iOnNavigationEvent;
                        this.onNavigationEvent = i8;
                        if (i8 == 0) {
                            this.asInterface.IAuthTabCallback(false);
                            IAuthTabCallback(1);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.onTransact.onWarmupCompleted, 9)) {
                IAuthTabCallback(IAuthTabCallback() ? 2 : 0);
            }
        }
    }

    public boolean onExtraCallbackWithResult(boolean z) {
        return this.IAuthTabCallbackDefault == 3 && this.onNavigationEvent == -1 && !(z && (this.asInterface instanceof SliderKtExternalSyntheticLambda4)) && (!z || IAuthTabCallback());
    }

    private void IAuthTabCallback(int i2) {
        this.IAuthTabCallbackDefault = i2;
        this.onExtraCallback = 0;
    }

    private boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, @Nullable byte[] bArr, int i2) {
        int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), i2 - this.onExtraCallback);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iMin);
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, this.onExtraCallback, iMin);
        }
        int i3 = this.onExtraCallback + iMin;
        this.onExtraCallback = i3;
        return i3 == i2;
    }

    private boolean IAuthTabCallback() {
        this.onTransact.onWarmupCompleted(0);
        int iOnNavigationEvent = this.onTransact.onNavigationEvent(24);
        if (iOnNavigationEvent != 1) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PesReader", "Unexpected start code prefix: " + iOnNavigationEvent);
            this.onNavigationEvent = -1;
            return false;
        }
        this.onTransact.IAuthTabCallback(8);
        int iOnNavigationEvent2 = this.onTransact.onNavigationEvent(16);
        this.onTransact.IAuthTabCallback(5);
        this.onWarmupCompleted = this.onTransact.onWarmupCompleted();
        this.onTransact.IAuthTabCallback(2);
        this.asBinder = this.onTransact.onWarmupCompleted();
        this.IAuthTabCallback = this.onTransact.onWarmupCompleted();
        this.onTransact.IAuthTabCallback(6);
        int iOnNavigationEvent3 = this.onTransact.onNavigationEvent(8);
        this.onExtraCallbackWithResult = iOnNavigationEvent3;
        if (iOnNavigationEvent2 == 0) {
            this.onNavigationEvent = -1;
        } else {
            int i2 = (iOnNavigationEvent2 - 3) - iOnNavigationEvent3;
            this.onNavigationEvent = i2;
            if (i2 < 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PesReader", "Found negative packet payload size: " + this.onNavigationEvent);
                this.onNavigationEvent = -1;
            }
        }
        return true;
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult() {
        char c;
        this.onTransact.onWarmupCompleted(0);
        this.getInterfaceDescriptor = -9223372036854775807L;
        if (this.asBinder) {
            this.onTransact.IAuthTabCallback(4);
            long jOnNavigationEvent = this.onTransact.onNavigationEvent(3);
            this.onTransact.IAuthTabCallback(1);
            long jOnNavigationEvent2 = this.onTransact.onNavigationEvent(15) << 15;
            this.onTransact.IAuthTabCallback(1);
            long jOnNavigationEvent3 = this.onTransact.onNavigationEvent(15);
            this.onTransact.IAuthTabCallback(1);
            if (this.IAuthTabCallbackStub || !this.IAuthTabCallback) {
                c = 30;
            } else {
                this.onTransact.IAuthTabCallback(4);
                long jOnNavigationEvent4 = this.onTransact.onNavigationEvent(3);
                this.onTransact.IAuthTabCallback(1);
                long jOnNavigationEvent5 = this.onTransact.onNavigationEvent(15) << 15;
                this.onTransact.IAuthTabCallback(1);
                long jOnNavigationEvent6 = this.onTransact.onNavigationEvent(15);
                this.onTransact.IAuthTabCallback(1);
                c = 30;
                this.access000.IAuthTabCallback((jOnNavigationEvent4 << 30) | jOnNavigationEvent5 | jOnNavigationEvent6);
                this.IAuthTabCallbackStub = true;
            }
            this.getInterfaceDescriptor = this.access000.IAuthTabCallback((jOnNavigationEvent << c) | jOnNavigationEvent2 | jOnNavigationEvent3);
        }
    }
}
