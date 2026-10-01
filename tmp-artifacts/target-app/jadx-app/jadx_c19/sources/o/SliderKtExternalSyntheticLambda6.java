package o;

import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import java.util.Collections;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;
import o.TextFieldKeyEventHandlerExternalSyntheticLambda1;
import o.TextToolbarHelperApi28ExternalSyntheticLambda1;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda6 implements SliderKtExternalSyntheticLambda22 {
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallback;
    private long IAuthTabCallbackStubProxy;
    private final SnackbarHostKtExternalSyntheticLambda7 asInterface;
    private String onExtraCallback;
    private boolean onNavigationEvent;
    private onExtraCallback onTransact;
    private final String onWarmupCompleted;
    private final boolean[] IAuthTabCallbackDefault = new boolean[3];
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 access100 = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(32, 128);
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 IAuthTabCallback_Parcel = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(33, 128);
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 IAuthTabCallbackStub = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(34, 128);
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 asBinder = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(39, 128);
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 access000 = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(40, 128);
    private long onExtraCallbackWithResult = -9223372036854775807L;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 getInterfaceDescriptor = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    public SliderKtExternalSyntheticLambda6(SnackbarHostKtExternalSyntheticLambda7 snackbarHostKtExternalSyntheticLambda7, String str) {
        this.asInterface = snackbarHostKtExternalSyntheticLambda7;
        this.onWarmupCompleted = str;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.IAuthTabCallbackStubProxy = 0L;
        this.onExtraCallbackWithResult = -9223372036854775807L;
        TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(this.IAuthTabCallbackDefault);
        this.access100.onNavigationEvent();
        this.IAuthTabCallback_Parcel.onNavigationEvent();
        this.IAuthTabCallbackStub.onNavigationEvent();
        this.asBinder.onNavigationEvent();
        this.access000.onNavigationEvent();
        this.asInterface.onExtraCallbackWithResult();
        onExtraCallback onextracallback = this.onTransact;
        if (onextracallback != null) {
            onextracallback.IAuthTabCallback();
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.onExtraCallback = onextracallbackwithresult.IAuthTabCallback();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 2);
        this.IAuthTabCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.onTransact = new onExtraCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult);
        this.asInterface.onExtraCallbackWithResult(drawerStateExternalSyntheticLambda1, onextracallbackwithresult);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.onExtraCallbackWithResult = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2;
        onExtraCallbackWithResult();
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
            byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
            this.IAuthTabCallbackStubProxy += textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
            this.IAuthTabCallback.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
            while (iOnWarmupCompleted < iOnExtraCallbackWithResult) {
                int iOnWarmupCompleted2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult, this.IAuthTabCallbackDefault);
                if (iOnWarmupCompleted2 == iOnExtraCallbackWithResult) {
                    IAuthTabCallback(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
                    return;
                }
                int iIAuthTabCallback = TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(bArrOnExtraCallback, iOnWarmupCompleted2);
                if (iOnWarmupCompleted2 <= 0 || bArrOnExtraCallback[iOnWarmupCompleted2 - 1] != 0) {
                    i2 = 3;
                } else {
                    iOnWarmupCompleted2--;
                    i2 = 4;
                }
                int i3 = iOnWarmupCompleted2;
                int i4 = i2;
                int i5 = i3 - iOnWarmupCompleted;
                if (i5 > 0) {
                    IAuthTabCallback(bArrOnExtraCallback, iOnWarmupCompleted, i3);
                }
                int i6 = iOnExtraCallbackWithResult - i3;
                long j = this.IAuthTabCallbackStubProxy - i6;
                onExtraCallbackWithResult(j, i6, i5 < 0 ? -i5 : 0, this.onExtraCallbackWithResult);
                onWarmupCompleted(j, i6, iIAuthTabCallback, this.onExtraCallbackWithResult);
                iOnWarmupCompleted = i3 + i4;
            }
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
        onExtraCallbackWithResult();
        if (z) {
            this.asInterface.onNavigationEvent();
            onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, 0, 0, this.onExtraCallbackWithResult);
            onWarmupCompleted(this.IAuthTabCallbackStubProxy, 0, 48, this.onExtraCallbackWithResult);
        }
    }

    @RequiresNonNull
    private void onWarmupCompleted(long j, int i2, int i3, long j2) {
        this.onTransact.onNavigationEvent(j, i2, i3, j2, this.onNavigationEvent);
        if (!this.onNavigationEvent) {
            this.access100.onWarmupCompleted(i3);
            this.IAuthTabCallback_Parcel.onWarmupCompleted(i3);
            this.IAuthTabCallbackStub.onWarmupCompleted(i3);
        }
        this.asBinder.onWarmupCompleted(i3);
        this.access000.onWarmupCompleted(i3);
    }

    @RequiresNonNull
    private void IAuthTabCallback(byte[] bArr, int i2, int i3) {
        this.onTransact.onWarmupCompleted(bArr, i2, i3);
        if (!this.onNavigationEvent) {
            this.access100.onExtraCallbackWithResult(bArr, i2, i3);
            this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(bArr, i2, i3);
            this.IAuthTabCallbackStub.onExtraCallbackWithResult(bArr, i2, i3);
        }
        this.asBinder.onExtraCallbackWithResult(bArr, i2, i3);
        this.access000.onExtraCallbackWithResult(bArr, i2, i3);
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult(long j, int i2, int i3, long j2) {
        this.onTransact.onExtraCallbackWithResult(j, i2, this.onNavigationEvent);
        if (!this.onNavigationEvent) {
            this.access100.onNavigationEvent(i3);
            this.IAuthTabCallback_Parcel.onNavigationEvent(i3);
            this.IAuthTabCallbackStub.onNavigationEvent(i3);
            if (this.access100.onExtraCallbackWithResult() && this.IAuthTabCallback_Parcel.onExtraCallbackWithResult() && this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = IAuthTabCallback(this.onExtraCallback, this.access100, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStub, this.onWarmupCompleted);
                this.IAuthTabCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback);
                Preconditions.checkState(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.onRelationshipValidationResult != -1);
                this.asInterface.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.onRelationshipValidationResult);
                this.onNavigationEvent = true;
            }
        }
        if (this.asBinder.onNavigationEvent(i3)) {
            SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 = this.asBinder;
            this.getInterfaceDescriptor.onExtraCallback(this.asBinder.onExtraCallbackWithResult, TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent));
            this.getInterfaceDescriptor.IAuthTabCallbackDefault(5);
            this.asInterface.onWarmupCompleted(j2, this.getInterfaceDescriptor);
        }
        if (this.access000.onNavigationEvent(i3)) {
            SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02 = this.access000;
            this.getInterfaceDescriptor.onExtraCallback(this.access000.onExtraCallbackWithResult, TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent));
            this.getInterfaceDescriptor.IAuthTabCallbackDefault(5);
            this.asInterface.onWarmupCompleted(j2, this.getInterfaceDescriptor);
        }
    }

    private static BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback(@Nullable String str, SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0, SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02, SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03, String str2) {
        int i2 = sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent;
        byte[] bArr = new byte[sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent + i2 + sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onNavigationEvent];
        System.arraycopy(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onExtraCallbackWithResult, 0, bArr, 0, i2);
        System.arraycopy(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onExtraCallbackWithResult, 0, bArr, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent);
        System.arraycopy(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onExtraCallbackWithResult, 0, bArr, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent + sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onNavigationEvent);
        TextFieldKeyEventHandlerExternalSyntheticLambda1.asInterface asinterfaceIAuthTabCallback = TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onExtraCallbackWithResult, 3, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent, (TextFieldKeyEventHandlerExternalSyntheticLambda1.access000) null);
        TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted = asinterfaceIAuthTabCallback.IAuthTabCallback_Parcel;
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).onNavigationEvent(str2).IAuthTabCallbackDefault("video/hevc").onExtraCallback(onwarmupcompleted != null ? TextFieldCoreModifierNodeExternalSyntheticLambda1.onExtraCallbackWithResult(onwarmupcompleted.IAuthTabCallback, onwarmupcompleted.IAuthTabCallbackDefault, onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, onwarmupcompleted.onExtraCallback, onwarmupcompleted.onExtraCallbackWithResult) : null).onActivityLayout(asinterfaceIAuthTabCallback.readTypedObject).access100(asinterfaceIAuthTabCallback.asBinder).asInterface(asinterfaceIAuthTabCallback.IAuthTabCallbackDefault).IAuthTabCallbackDefault(asinterfaceIAuthTabCallback.IAuthTabCallbackStub).onExtraCallback(new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(asinterfaceIAuthTabCallback.onNavigationEvent).onNavigationEvent(asinterfaceIAuthTabCallback.IAuthTabCallback).onExtraCallbackWithResult(asinterfaceIAuthTabCallback.asInterface).IAuthTabCallback(asinterfaceIAuthTabCallback.onExtraCallbackWithResult + 8).onWarmupCompleted(asinterfaceIAuthTabCallback.onWarmupCompleted + 8).IAuthTabCallback()).onNavigationEvent(asinterfaceIAuthTabCallback.getInterfaceDescriptor).access000(asinterfaceIAuthTabCallback.onTransact).getInterfaceDescriptor(asinterfaceIAuthTabCallback.IAuthTabCallbackStubProxy + 1).IAuthTabCallback(Collections.singletonList(bArr)).onNavigationEvent();
    }

    @EnsuresNonNull
    private void onExtraCallbackWithResult() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback);
        Object[] objArr = {this.onTransact};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }

    static final class onExtraCallback {
        private boolean IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private long IAuthTabCallbackStub;
        private long IAuthTabCallbackStubProxy;
        private boolean access000;
        private long access100;
        private boolean asBinder;
        private long asInterface;
        private boolean onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private int onNavigationEvent;
        private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onTransact;
        private boolean onWarmupCompleted;

        private static boolean onExtraCallback(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        private static boolean onWarmupCompleted(int i2) {
            return i2 < 32 || i2 == 40;
        }

        public onExtraCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
            this.onTransact = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        }

        public void IAuthTabCallback() {
            this.onExtraCallbackWithResult = false;
            this.IAuthTabCallback = false;
            this.onWarmupCompleted = false;
            this.asBinder = false;
            this.IAuthTabCallbackDefault = false;
        }

        public void onNavigationEvent(long j, int i2, int i3, long j2, boolean z) {
            this.IAuthTabCallback = false;
            this.onWarmupCompleted = false;
            this.asInterface = j2;
            this.onNavigationEvent = 0;
            this.IAuthTabCallbackStub = j;
            if (!onWarmupCompleted(i3)) {
                if (this.asBinder && !this.IAuthTabCallbackDefault) {
                    if (z) {
                        IAuthTabCallback(i2);
                    }
                    this.asBinder = false;
                }
                if (onExtraCallback(i3)) {
                    this.onWarmupCompleted = !this.IAuthTabCallbackDefault;
                    this.IAuthTabCallbackDefault = true;
                }
            }
            boolean z2 = i3 >= 16 && i3 <= 21;
            this.onExtraCallback = z2;
            this.onExtraCallbackWithResult = z2 || i3 <= 9;
        }

        public void onWarmupCompleted(byte[] bArr, int i2, int i3) {
            if (this.onExtraCallbackWithResult) {
                int i4 = this.onNavigationEvent;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    this.IAuthTabCallback = (bArr[i5] & 128) != 0;
                    this.onExtraCallbackWithResult = false;
                } else {
                    this.onNavigationEvent = i4 + (i3 - i2);
                }
            }
        }

        public void onExtraCallbackWithResult(long j, int i2, boolean z) {
            if (this.IAuthTabCallbackDefault && this.IAuthTabCallback) {
                this.access000 = this.onExtraCallback;
                this.IAuthTabCallbackDefault = false;
            } else if (this.onWarmupCompleted || this.IAuthTabCallback) {
                if (z && this.asBinder) {
                    IAuthTabCallback(i2 + ((int) (j - this.IAuthTabCallbackStub)));
                }
                this.access100 = this.IAuthTabCallbackStub;
                this.IAuthTabCallbackStubProxy = this.asInterface;
                this.access000 = this.onExtraCallback;
                this.asBinder = true;
            }
        }

        private void IAuthTabCallback(int i2) {
            long j = this.IAuthTabCallbackStubProxy;
            if (j != -9223372036854775807L) {
                long j2 = this.IAuthTabCallbackStub;
                long j3 = this.access100;
                if (j2 != j3) {
                    boolean z = this.access000;
                    this.onTransact.onExtraCallback(j, z ? 1 : 0, (int) (j2 - j3), i2, null);
                }
            }
        }
    }
}
