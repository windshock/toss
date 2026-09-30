package o;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda4 implements SliderKtExternalSyntheticLambda22 {
    private static final double[] onNavigationEvent = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final boolean[] IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 ICustomTabsCallback;
    private boolean access000;
    private boolean access100;
    private long asBinder;
    private boolean asInterface;
    private final SnackbarKtExternalSyntheticLambda10 extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private final String onExtraCallback;
    private long onExtraCallbackWithResult;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onTransact;
    private final onWarmupCompleted onWarmupCompleted;
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 readTypedObject;

    public SliderKtExternalSyntheticLambda4(String str) {
        this(null, str);
    }

    SliderKtExternalSyntheticLambda4(@Nullable SnackbarKtExternalSyntheticLambda10 snackbarKtExternalSyntheticLambda10, String str) {
        this.extraCallbackWithResult = snackbarKtExternalSyntheticLambda10;
        this.onExtraCallback = str;
        this.IAuthTabCallbackStub = new boolean[4];
        this.onWarmupCompleted = new onWarmupCompleted(128);
        if (snackbarKtExternalSyntheticLambda10 != null) {
            this.readTypedObject = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(178, 128);
            this.ICustomTabsCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        } else {
            this.readTypedObject = null;
            this.ICustomTabsCallback = null;
        }
        this.asBinder = -9223372036854775807L;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(this.IAuthTabCallbackStub);
        this.onWarmupCompleted.IAuthTabCallback();
        SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 = this.readTypedObject;
        if (sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 != null) {
            sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent();
        }
        this.getInterfaceDescriptor = 0L;
        this.access000 = false;
        this.asBinder = -9223372036854775807L;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        this.onTransact = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 2);
        SnackbarKtExternalSyntheticLambda10 snackbarKtExternalSyntheticLambda10 = this.extraCallbackWithResult;
        if (snackbarKtExternalSyntheticLambda10 != null) {
            snackbarKtExternalSyntheticLambda10.IAuthTabCallback(drawerStateExternalSyntheticLambda1, onextracallbackwithresult);
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.asBinder = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    @Override // o.SliderKtExternalSyntheticLambda22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2;
        long j;
        boolean z;
        int i3;
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onTransact);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        this.getInterfaceDescriptor += textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        this.onTransact.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
        while (true) {
            int iOnWarmupCompleted2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult, this.IAuthTabCallbackStub);
            if (iOnWarmupCompleted2 == iOnExtraCallbackWithResult) {
                break;
            }
            int i4 = iOnWarmupCompleted2 + 3;
            int i5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[i4] & 255;
            int i6 = iOnWarmupCompleted2 - iOnWarmupCompleted;
            if (!this.IAuthTabCallbackDefault) {
                if (i6 > 0) {
                    this.onWarmupCompleted.onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnWarmupCompleted2);
                }
                if (this.onWarmupCompleted.onExtraCallback(i5, i6 < 0 ? -i6 : 0)) {
                    Pair<BasicTextContextMenuProviderKtExternalSyntheticLambda4, Long> pairOnExtraCallback = onExtraCallback(this.onWarmupCompleted, (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback), this.onExtraCallback);
                    this.onTransact.onExtraCallbackWithResult((BasicTextContextMenuProviderKtExternalSyntheticLambda4) pairOnExtraCallback.first);
                    this.onExtraCallbackWithResult = ((Long) pairOnExtraCallback.second).longValue();
                    this.IAuthTabCallbackDefault = true;
                }
            }
            SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 = this.readTypedObject;
            if (sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 != null) {
                if (i6 > 0) {
                    sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnWarmupCompleted2);
                    i3 = 0;
                } else {
                    i3 = -i6;
                }
                if (this.readTypedObject.onNavigationEvent(i3)) {
                    SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02 = this.readTypedObject;
                    ((TextFieldDecoratorModifierNodeExternalSyntheticLambda20) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.ICustomTabsCallback}, -1084655742)).onExtraCallback(this.readTypedObject.onExtraCallbackWithResult, TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent));
                    ((SnackbarKtExternalSyntheticLambda10) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.extraCallbackWithResult}, -1084655742)).onWarmupCompleted(this.IAuthTabCallbackStubProxy, this.ICustomTabsCallback);
                }
                if (i5 == 178 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted2 + 2] == 1) {
                    this.readTypedObject.onWarmupCompleted(i5);
                }
            }
            if (i5 == 0 || i5 == 179) {
                int i7 = iOnExtraCallbackWithResult - iOnWarmupCompleted2;
                if (!this.asInterface || !this.IAuthTabCallbackDefault) {
                    i2 = i5;
                    if (this.access000 || this.asInterface) {
                        this.IAuthTabCallback_Parcel = this.getInterfaceDescriptor - i7;
                        j = this.asBinder;
                        if (j == -9223372036854775807L) {
                            long j2 = this.IAuthTabCallbackStubProxy;
                            j = j2 != -9223372036854775807L ? j2 + this.onExtraCallbackWithResult : -9223372036854775807L;
                        }
                        this.IAuthTabCallbackStubProxy = j;
                        this.access100 = false;
                        this.asBinder = -9223372036854775807L;
                        z = true;
                        this.access000 = true;
                    } else {
                        z = true;
                    }
                    this.asInterface = i2 == 0 ? z : false;
                } else {
                    long j3 = this.IAuthTabCallbackStubProxy;
                    if (j3 != -9223372036854775807L) {
                        i2 = i5;
                        this.onTransact.onExtraCallback(j3, this.access100 ? 1 : 0, ((int) (this.getInterfaceDescriptor - this.IAuthTabCallback_Parcel)) - i7, i7, null);
                    }
                    if (this.access000) {
                        this.IAuthTabCallback_Parcel = this.getInterfaceDescriptor - i7;
                        j = this.asBinder;
                        if (j == -9223372036854775807L) {
                        }
                        this.IAuthTabCallbackStubProxy = j;
                        this.access100 = false;
                        this.asBinder = -9223372036854775807L;
                        z = true;
                        this.access000 = true;
                        this.asInterface = i2 == 0 ? z : false;
                    }
                }
            } else if (i5 == 184) {
                this.access100 = true;
            }
            iOnWarmupCompleted = i4;
        }
        if (!this.IAuthTabCallbackDefault) {
            this.onWarmupCompleted.onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
        }
        SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03 = this.readTypedObject;
        if (sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03 != null) {
            sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onTransact);
        if (z) {
            boolean z2 = this.access100;
            this.onTransact.onExtraCallback(this.IAuthTabCallbackStubProxy, z2 ? 1 : 0, (int) (this.getInterfaceDescriptor - this.IAuthTabCallback_Parcel), 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<BasicTextContextMenuProviderKtExternalSyntheticLambda4, Long> onExtraCallback(onWarmupCompleted onwarmupcompleted, String str, String str2) {
        float f;
        int i2;
        float f2;
        int i3;
        long j;
        byte[] bArrCopyOf = Arrays.copyOf(onwarmupcompleted.onExtraCallbackWithResult, onwarmupcompleted.IAuthTabCallback);
        byte b = bArrCopyOf[4];
        byte b2 = bArrCopyOf[5];
        int i4 = ((b & 255) << 4) | ((b2 & 255) >> 4);
        int i5 = ((b2 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i6 = (bArrCopyOf[7] & 240) >> 4;
        if (i6 == 2) {
            f = i5 << 2;
            i2 = i4 * 3;
        } else if (i6 == 3) {
            f = i5 << 4;
            i2 = i4 * 9;
        } else {
            if (i6 != 4) {
                f2 = 1.0f;
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).onNavigationEvent(str2).IAuthTabCallbackDefault("video/mpeg2").onActivityLayout(i4).access100(i5).onNavigationEvent(f2).IAuthTabCallback(Collections.singletonList(bArrCopyOf)).onNavigationEvent();
                i3 = (bArrCopyOf[7] & 15) - 1;
                if (i3 < 0) {
                    double[] dArr = onNavigationEvent;
                    if (i3 < dArr.length) {
                        double d = dArr[i3];
                        byte b3 = bArrCopyOf[onwarmupcompleted.onNavigationEvent + 9];
                        int i7 = (b3 & 96) >> 5;
                        if (i7 != (b3 & 31)) {
                            d *= (i7 + 1.0d) / (r8 + 1);
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                }
                return Pair.create(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent, Long.valueOf(j));
            }
            f = i5 * 121;
            i2 = i4 * 100;
        }
        f2 = f / i2;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2 = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(str).onNavigationEvent(str2).IAuthTabCallbackDefault("video/mpeg2").onActivityLayout(i4).access100(i5).onNavigationEvent(f2).IAuthTabCallback(Collections.singletonList(bArrCopyOf)).onNavigationEvent();
        i3 = (bArrCopyOf[7] & 15) - 1;
        if (i3 < 0) {
        }
        return Pair.create(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2, Long.valueOf(j));
    }

    static final class onWarmupCompleted {
        private static final byte[] onWarmupCompleted = {0, 0, 1};
        public int IAuthTabCallback;
        private boolean onExtraCallback;
        public byte[] onExtraCallbackWithResult;
        public int onNavigationEvent;

        public onWarmupCompleted(int i2) {
            this.onExtraCallbackWithResult = new byte[i2];
        }

        public void IAuthTabCallback() {
            this.onExtraCallback = false;
            this.IAuthTabCallback = 0;
            this.onNavigationEvent = 0;
        }

        public boolean onExtraCallback(int i2, int i3) {
            if (this.onExtraCallback) {
                int i4 = this.IAuthTabCallback - i3;
                this.IAuthTabCallback = i4;
                if (this.onNavigationEvent == 0 && i2 == 181) {
                    this.onNavigationEvent = i4;
                } else {
                    this.onExtraCallback = false;
                    return true;
                }
            } else if (i2 == 179) {
                this.onExtraCallback = true;
            }
            byte[] bArr = onWarmupCompleted;
            onExtraCallbackWithResult(bArr, 0, bArr.length);
            return false;
        }

        public void onExtraCallbackWithResult(byte[] bArr, int i2, int i3) {
            if (this.onExtraCallback) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.onExtraCallbackWithResult;
                int length = bArr2.length;
                int i5 = this.IAuthTabCallback + i4;
                if (length < i5) {
                    this.onExtraCallbackWithResult = Arrays.copyOf(bArr2, i5 << 1);
                }
                System.arraycopy(bArr, i2, this.onExtraCallbackWithResult, this.IAuthTabCallback, i4);
                this.IAuthTabCallback += i4;
            }
        }
    }
}
