package o;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda8 implements SliderKtExternalSyntheticLambda22 {
    private static final float[] onWarmupCompleted = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private String IAuthTabCallback;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private onExtraCallback IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 access000;
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 access100;
    private long asBinder;
    private final SnackbarKtExternalSyntheticLambda10 getInterfaceDescriptor;
    private final String onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final boolean[] asInterface = new boolean[4];
    private final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult(128);
    private long onTransact = -9223372036854775807L;

    SliderKtExternalSyntheticLambda8(@Nullable SnackbarKtExternalSyntheticLambda10 snackbarKtExternalSyntheticLambda10, String str) {
        this.getInterfaceDescriptor = snackbarKtExternalSyntheticLambda10;
        this.onExtraCallback = str;
        if (snackbarKtExternalSyntheticLambda10 != null) {
            this.access100 = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(178, 128);
            this.access000 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        } else {
            this.access100 = null;
            this.access000 = null;
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(this.asInterface);
        this.onNavigationEvent.IAuthTabCallback();
        onExtraCallback onextracallback = this.IAuthTabCallbackStub;
        if (onextracallback != null) {
            onextracallback.onExtraCallbackWithResult();
        }
        SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 = this.access100;
        if (sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 != null) {
            sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent();
        }
        this.asBinder = 0L;
        this.onTransact = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 2);
        this.IAuthTabCallbackDefault = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.IAuthTabCallbackStub = new onExtraCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult);
        SnackbarKtExternalSyntheticLambda10 snackbarKtExternalSyntheticLambda10 = this.getInterfaceDescriptor;
        if (snackbarKtExternalSyntheticLambda10 != null) {
            snackbarKtExternalSyntheticLambda10.IAuthTabCallback(drawerStateExternalSyntheticLambda1, onextracallbackwithresult);
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.onTransact = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub);
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        this.asBinder += textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        this.IAuthTabCallbackDefault.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
        while (true) {
            int iOnWarmupCompleted2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult, this.asInterface);
            if (iOnWarmupCompleted2 == iOnExtraCallbackWithResult) {
                break;
            }
            int i2 = iOnWarmupCompleted2 + 3;
            int i3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[i2] & 255;
            int i4 = iOnWarmupCompleted2 - iOnWarmupCompleted;
            int i5 = 0;
            if (!this.onExtraCallbackWithResult) {
                if (i4 > 0) {
                    this.onNavigationEvent.onWarmupCompleted(bArrOnExtraCallback, iOnWarmupCompleted, iOnWarmupCompleted2);
                }
                if (this.onNavigationEvent.onExtraCallback(i3, i4 < 0 ? -i4 : 0)) {
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = this.IAuthTabCallbackDefault;
                    onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult(IAuthTabCallback(onextracallbackwithresult, onextracallbackwithresult.onExtraCallbackWithResult, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback), this.onExtraCallback));
                    this.onExtraCallbackWithResult = true;
                }
            }
            this.IAuthTabCallbackStub.IAuthTabCallback(bArrOnExtraCallback, iOnWarmupCompleted, iOnWarmupCompleted2);
            SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 = this.access100;
            if (sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 != null) {
                if (i4 > 0) {
                    sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnWarmupCompleted2);
                } else {
                    i5 = -i4;
                }
                if (this.access100.onNavigationEvent(i5)) {
                    SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02 = this.access100;
                    ((TextFieldDecoratorModifierNodeExternalSyntheticLambda20) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.access000}, -1084655742)).onExtraCallback(this.access100.onExtraCallbackWithResult, TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent));
                    ((SnackbarKtExternalSyntheticLambda10) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.getInterfaceDescriptor}, -1084655742)).onWarmupCompleted(this.onTransact, this.access000);
                }
                if (i3 == 178 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted2 + 2] == 1) {
                    this.access100.onWarmupCompleted(i3);
                }
            }
            int i6 = iOnExtraCallbackWithResult - iOnWarmupCompleted2;
            this.IAuthTabCallbackStub.onNavigationEvent(this.asBinder - i6, i6, this.onExtraCallbackWithResult);
            this.IAuthTabCallbackStub.onExtraCallback(i3, this.onTransact);
            iOnWarmupCompleted = i2;
        }
        if (!this.onExtraCallbackWithResult) {
            this.onNavigationEvent.onWarmupCompleted(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
        }
        this.IAuthTabCallbackStub.IAuthTabCallback(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
        SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03 = this.access100;
        if (sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03 != null) {
            sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub);
        if (z) {
            this.IAuthTabCallbackStub.onNavigationEvent(this.asBinder, 0, this.onExtraCallbackWithResult);
            this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, int i2, String str, String str2) {
        float f;
        byte[] bArrCopyOf = Arrays.copyOf(onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onNavigationEvent);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArrCopyOf);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(4);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        }
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        if (iOnNavigationEvent == 15) {
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            if (iOnNavigationEvent3 != 0) {
                f = iOnNavigationEvent2 / iOnNavigationEvent3;
            } else {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("H263Reader", "Invalid aspect ratio");
                f = 1.0f;
            }
        } else {
            float[] fArr = onWarmupCompleted;
            if (iOnNavigationEvent < fArr.length) {
                f = fArr[iOnNavigationEvent];
            }
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(15);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(15);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(15);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(11);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(15);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2) != 0) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("H263Reader", "Unhandled video object layer shape");
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            if (iOnNavigationEvent4 == 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i3 = 0;
                for (int i4 = iOnNavigationEvent4 - 1; i4 > 0; i4 >>= 1) {
                    i3++;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(i3);
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(13);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(13);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).onNavigationEvent(str2).IAuthTabCallbackDefault("video/mp4v-es").onActivityLayout(iOnNavigationEvent5).access100(iOnNavigationEvent6).onNavigationEvent(f).IAuthTabCallback(Collections.singletonList(bArrCopyOf)).onNavigationEvent();
    }

    static final class onExtraCallbackWithResult {
        private static final byte[] onWarmupCompleted = {0, 0, 1};
        private boolean IAuthTabCallback;
        private int IAuthTabCallbackDefault;
        public byte[] onExtraCallback;
        public int onExtraCallbackWithResult;
        public int onNavigationEvent;

        public onExtraCallbackWithResult(int i2) {
            this.onExtraCallback = new byte[i2];
        }

        public void IAuthTabCallback() {
            this.IAuthTabCallback = false;
            this.onNavigationEvent = 0;
            this.IAuthTabCallbackDefault = 0;
        }

        public boolean onExtraCallback(int i2, int i3) {
            int i4 = this.IAuthTabCallbackDefault;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i2 == 179 || i2 == 181) {
                                this.onNavigationEvent -= i3;
                                this.IAuthTabCallback = false;
                                return true;
                            }
                        } else if ((i2 & 240) != 32) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("H263Reader", "Unexpected start code value");
                            IAuthTabCallback();
                        } else {
                            this.onExtraCallbackWithResult = this.onNavigationEvent;
                            this.IAuthTabCallbackDefault = 4;
                        }
                    } else if (i2 > 31) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("H263Reader", "Unexpected start code value");
                        IAuthTabCallback();
                    } else {
                        this.IAuthTabCallbackDefault = 3;
                    }
                } else if (i2 != 181) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("H263Reader", "Unexpected start code value");
                    IAuthTabCallback();
                } else {
                    this.IAuthTabCallbackDefault = 2;
                }
            } else if (i2 == 176) {
                this.IAuthTabCallbackDefault = 1;
                this.IAuthTabCallback = true;
            }
            byte[] bArr = onWarmupCompleted;
            onWarmupCompleted(bArr, 0, bArr.length);
            return false;
        }

        public void onWarmupCompleted(byte[] bArr, int i2, int i3) {
            if (this.IAuthTabCallback) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.onExtraCallback;
                int length = bArr2.length;
                int i5 = this.onNavigationEvent + i4;
                if (length < i5) {
                    this.onExtraCallback = Arrays.copyOf(bArr2, i5 << 1);
                }
                System.arraycopy(bArr, i2, this.onExtraCallback, this.onNavigationEvent, i4);
                this.onNavigationEvent += i4;
            }
        }
    }

    static final class onExtraCallback {
        private boolean IAuthTabCallback;
        private long IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private int asBinder;
        private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private long onNavigationEvent;
        private boolean onWarmupCompleted;

        public onExtraCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
            this.onExtraCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        }

        public void onExtraCallbackWithResult() {
            this.IAuthTabCallback = false;
            this.onWarmupCompleted = false;
            this.onExtraCallbackWithResult = false;
            this.asBinder = -1;
        }

        public void onExtraCallback(int i2, long j) {
            this.asBinder = i2;
            this.onExtraCallbackWithResult = false;
            this.IAuthTabCallback = i2 == 182 || i2 == 179;
            this.onWarmupCompleted = i2 == 182;
            this.IAuthTabCallbackStub = 0;
            this.IAuthTabCallbackDefault = j;
        }

        public void IAuthTabCallback(byte[] bArr, int i2, int i3) {
            if (this.onWarmupCompleted) {
                int i4 = this.IAuthTabCallbackStub;
                int i5 = (i2 + 1) - i4;
                if (i5 < i3) {
                    this.onExtraCallbackWithResult = ((bArr[i5] & 192) >> 6) == 0;
                    this.onWarmupCompleted = false;
                } else {
                    this.IAuthTabCallbackStub = i4 + (i3 - i2);
                }
            }
        }

        public void onNavigationEvent(long j, int i2, boolean z) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault != -9223372036854775807L);
            if (this.asBinder == 182 && z && this.IAuthTabCallback) {
                this.onExtraCallback.onExtraCallback(this.IAuthTabCallbackDefault, this.onExtraCallbackWithResult ? 1 : 0, (int) (j - this.onNavigationEvent), i2, null);
            }
            if (this.asBinder != 179) {
                this.onNavigationEvent = j;
            }
        }
    }
}
