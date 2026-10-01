package o;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;
import o.TextFieldKeyEventHandlerExternalSyntheticLambda1;
import o.TextToolbarHelperApi28ExternalSyntheticLambda1;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda5 implements SliderKtExternalSyntheticLambda22 {
    private final boolean IAuthTabCallback;
    private final SnackbarHostKtExternalSyntheticLambda7 access100;
    private boolean asBinder;
    private onNavigationEvent getInterfaceDescriptor;
    private final boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private String onNavigationEvent;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onTransact;
    private final String onWarmupCompleted;
    private long readTypedObject;
    private final boolean[] asInterface = new boolean[3];
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 IAuthTabCallback_Parcel = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(7, 128);
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 IAuthTabCallbackStub = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(8, 128);
    private final SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 IAuthTabCallbackStubProxy = new SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(6, 128);
    private long IAuthTabCallbackDefault = -9223372036854775807L;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 access000 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    public SliderKtExternalSyntheticLambda5(SnackbarHostKtExternalSyntheticLambda7 snackbarHostKtExternalSyntheticLambda7, boolean z, boolean z2, String str) {
        this.access100 = snackbarHostKtExternalSyntheticLambda7;
        this.IAuthTabCallback = z;
        this.onExtraCallback = z2;
        this.onWarmupCompleted = str;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.readTypedObject = 0L;
        this.asBinder = false;
        this.IAuthTabCallbackDefault = -9223372036854775807L;
        TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(this.asInterface);
        this.IAuthTabCallback_Parcel.onNavigationEvent();
        this.IAuthTabCallbackStub.onNavigationEvent();
        this.IAuthTabCallbackStubProxy.onNavigationEvent();
        this.access100.onExtraCallbackWithResult();
        onNavigationEvent onnavigationevent = this.getInterfaceDescriptor;
        if (onnavigationevent != null) {
            onnavigationevent.onExtraCallback();
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.onNavigationEvent = onextracallbackwithresult.IAuthTabCallback();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 2);
        this.onTransact = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.getInterfaceDescriptor = new onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult, this.IAuthTabCallback, this.onExtraCallback);
        this.access100.onExtraCallbackWithResult(drawerStateExternalSyntheticLambda1, onextracallbackwithresult);
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.IAuthTabCallbackDefault = j;
        this.asBinder |= (i2 & 2) != 0;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2;
        onExtraCallbackWithResult();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        this.readTypedObject += textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        this.onTransact.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
        while (true) {
            int iOnWarmupCompleted2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult, this.asInterface);
            if (iOnWarmupCompleted2 == iOnExtraCallbackWithResult) {
                onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, iOnExtraCallbackWithResult);
                return;
            }
            int iOnExtraCallback = TextFieldKeyEventHandlerExternalSyntheticLambda1.onExtraCallback(bArrOnExtraCallback, iOnWarmupCompleted2);
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
                onExtraCallbackWithResult(bArrOnExtraCallback, iOnWarmupCompleted, i3);
            }
            int i6 = iOnExtraCallbackWithResult - i3;
            long j = this.readTypedObject - i6;
            onExtraCallback(j, i6, i5 < 0 ? -i5 : 0, this.IAuthTabCallbackDefault);
            IAuthTabCallback(j, iOnExtraCallback, this.IAuthTabCallbackDefault);
            iOnWarmupCompleted = i3 + i4;
        }
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
        onExtraCallbackWithResult();
        if (z) {
            this.access100.onNavigationEvent();
            onExtraCallback(this.readTypedObject, 0, 0, this.IAuthTabCallbackDefault);
            IAuthTabCallback(this.readTypedObject, 9, this.IAuthTabCallbackDefault);
            onExtraCallback(this.readTypedObject, 0, 0, this.IAuthTabCallbackDefault);
        }
    }

    @RequiresNonNull
    private void IAuthTabCallback(long j, int i2, long j2) {
        if (!this.onExtraCallbackWithResult || this.getInterfaceDescriptor.onNavigationEvent()) {
            this.IAuthTabCallback_Parcel.onWarmupCompleted(i2);
            this.IAuthTabCallbackStub.onWarmupCompleted(i2);
        }
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(i2);
        this.getInterfaceDescriptor.onNavigationEvent(j, i2, j2, this.asBinder);
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult(byte[] bArr, int i2, int i3) {
        if (!this.onExtraCallbackWithResult || this.getInterfaceDescriptor.onNavigationEvent()) {
            this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(bArr, i2, i3);
            this.IAuthTabCallbackStub.onExtraCallbackWithResult(bArr, i2, i3);
        }
        this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(bArr, i2, i3);
        this.getInterfaceDescriptor.IAuthTabCallback(bArr, i2, i3);
    }

    @RequiresNonNull
    private void onExtraCallback(long j, int i2, int i3, long j2) {
        if (!this.onExtraCallbackWithResult || this.getInterfaceDescriptor.onNavigationEvent()) {
            this.IAuthTabCallback_Parcel.onNavigationEvent(i3);
            this.IAuthTabCallbackStub.onNavigationEvent(i3);
            if (!this.onExtraCallbackWithResult) {
                if (this.IAuthTabCallback_Parcel.onExtraCallbackWithResult() && this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
                    ArrayList arrayList = new ArrayList();
                    SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 = this.IAuthTabCallback_Parcel;
                    arrayList.add(Arrays.copyOf(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0.onNavigationEvent));
                    SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02 = this.IAuthTabCallbackStub;
                    arrayList.add(Arrays.copyOf(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda02.onNavigationEvent));
                    SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03 = this.IAuthTabCallback_Parcel;
                    TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100VarOnWarmupCompleted = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onExtraCallbackWithResult, 3, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda03.onNavigationEvent);
                    SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda04 = this.IAuthTabCallbackStub;
                    TextFieldKeyEventHandlerExternalSyntheticLambda1.getInterfaceDescriptor getinterfacedescriptorOnExtraCallback = TextFieldKeyEventHandlerExternalSyntheticLambda1.onExtraCallback(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda04.onExtraCallbackWithResult, 3, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda04.onNavigationEvent);
                    this.onTransact.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.onNavigationEvent).onNavigationEvent(this.onWarmupCompleted).IAuthTabCallbackDefault("video/avc").onExtraCallback(TextFieldCoreModifierNodeExternalSyntheticLambda1.onWarmupCompleted(access100VarOnWarmupCompleted.ICustomTabsCallback, access100VarOnWarmupCompleted.asBinder, access100VarOnWarmupCompleted.access000)).onActivityLayout(access100VarOnWarmupCompleted.extraCallback).access100(access100VarOnWarmupCompleted.IAuthTabCallbackDefault).onExtraCallback(new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(access100VarOnWarmupCompleted.onWarmupCompleted).onNavigationEvent(access100VarOnWarmupCompleted.onExtraCallback).onExtraCallbackWithResult(access100VarOnWarmupCompleted.onNavigationEvent).IAuthTabCallback(access100VarOnWarmupCompleted.onExtraCallbackWithResult + 8).onWarmupCompleted(access100VarOnWarmupCompleted.IAuthTabCallback + 8).IAuthTabCallback()).onNavigationEvent(access100VarOnWarmupCompleted.writeTypedObject).IAuthTabCallback(arrayList).access000(access100VarOnWarmupCompleted.getInterfaceDescriptor).onNavigationEvent());
                    this.onExtraCallbackWithResult = true;
                    this.access100.onExtraCallback(access100VarOnWarmupCompleted.getInterfaceDescriptor);
                    this.getInterfaceDescriptor.IAuthTabCallback(access100VarOnWarmupCompleted);
                    this.getInterfaceDescriptor.onNavigationEvent(getinterfacedescriptorOnExtraCallback);
                    this.IAuthTabCallback_Parcel.onNavigationEvent();
                    this.IAuthTabCallbackStub.onNavigationEvent();
                }
            } else if (this.IAuthTabCallback_Parcel.onExtraCallbackWithResult()) {
                SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda05 = this.IAuthTabCallback_Parcel;
                TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100VarOnWarmupCompleted2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda05.onExtraCallbackWithResult, 3, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda05.onNavigationEvent);
                this.access100.onExtraCallback(access100VarOnWarmupCompleted2.getInterfaceDescriptor);
                this.getInterfaceDescriptor.IAuthTabCallback(access100VarOnWarmupCompleted2);
                this.IAuthTabCallback_Parcel.onNavigationEvent();
            } else if (this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
                SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda06 = this.IAuthTabCallbackStub;
                this.getInterfaceDescriptor.onNavigationEvent(TextFieldKeyEventHandlerExternalSyntheticLambda1.onExtraCallback(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda06.onExtraCallbackWithResult, 3, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda06.onNavigationEvent));
                this.IAuthTabCallbackStub.onNavigationEvent();
            }
        }
        if (this.IAuthTabCallbackStubProxy.onNavigationEvent(i3)) {
            SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda07 = this.IAuthTabCallbackStubProxy;
            this.access000.onExtraCallback(this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult, TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda07.onExtraCallbackWithResult, sliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda07.onNavigationEvent));
            this.access000.asBinder(4);
            this.access100.onWarmupCompleted(j2, this.access000);
        }
        if (this.getInterfaceDescriptor.IAuthTabCallback(j, i2, this.onExtraCallbackWithResult)) {
            this.asBinder = false;
        }
    }

    @EnsuresNonNull
    private void onExtraCallbackWithResult() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onTransact);
        Object[] objArr = {this.getInterfaceDescriptor};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }

    static final class onNavigationEvent {
        private final boolean IAuthTabCallback;
        private long IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private boolean IAuthTabCallback_Parcel;
        private long ICustomTabsCallback;
        private boolean access000;
        private IAuthTabCallback access100;
        private boolean asBinder;
        private long asInterface;
        private boolean getInterfaceDescriptor;
        private int onExtraCallback;
        private final TransformedTextFieldStateExternalSyntheticLambda0 onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onTransact;
        private byte[] onWarmupCompleted;
        private IAuthTabCallback readTypedObject;
        private long writeTypedObject;
        private final SparseArray<TextFieldKeyEventHandlerExternalSyntheticLambda1.access100> extraCallbackWithResult = new SparseArray<>();
        private final SparseArray<TextFieldKeyEventHandlerExternalSyntheticLambda1.getInterfaceDescriptor> IAuthTabCallbackStubProxy = new SparseArray<>();

        public onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, boolean z, boolean z2) {
            this.onTransact = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            this.onNavigationEvent = z;
            this.IAuthTabCallback = z2;
            this.access100 = new IAuthTabCallback();
            this.readTypedObject = new IAuthTabCallback();
            byte[] bArr = new byte[128];
            this.onWarmupCompleted = bArr;
            this.onExtraCallbackWithResult = new TransformedTextFieldStateExternalSyntheticLambda0(bArr, 0, 0);
            onExtraCallback();
        }

        public boolean onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public void IAuthTabCallback(TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100Var) {
            this.extraCallbackWithResult.append(access100Var.readTypedObject, access100Var);
        }

        public void onNavigationEvent(TextFieldKeyEventHandlerExternalSyntheticLambda1.getInterfaceDescriptor getinterfacedescriptor) {
            this.IAuthTabCallbackStubProxy.append(getinterfacedescriptor.onExtraCallback, getinterfacedescriptor);
        }

        public void onExtraCallback() {
            this.asBinder = false;
            this.access000 = false;
            this.readTypedObject.onNavigationEvent();
        }

        public void onNavigationEvent(long j, int i2, long j2, boolean z) {
            this.IAuthTabCallbackStub = i2;
            this.IAuthTabCallbackDefault = j2;
            this.asInterface = j;
            this.getInterfaceDescriptor = z;
            if (!this.onNavigationEvent || i2 != 1) {
                if (!this.IAuthTabCallback) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            IAuthTabCallback iAuthTabCallback = this.access100;
            this.access100 = this.readTypedObject;
            this.readTypedObject = iAuthTabCallback;
            iAuthTabCallback.onNavigationEvent();
            this.onExtraCallback = 0;
            this.asBinder = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void IAuthTabCallback(byte[] bArr, int i2, int i3) {
            boolean zOnExtraCallback;
            boolean z;
            boolean z2;
            boolean zOnExtraCallback2;
            boolean z3;
            int iOnExtraCallbackWithResult;
            int i4;
            int iOnExtraCallback;
            int i5;
            int i6;
            int i7;
            int iOnNavigationEvent;
            int iOnNavigationEvent2;
            if (this.asBinder) {
                int i8 = i3 - i2;
                byte[] bArr2 = this.onWarmupCompleted;
                int length = bArr2.length;
                int i9 = this.onExtraCallback + i8;
                if (length < i9) {
                    this.onWarmupCompleted = Arrays.copyOf(bArr2, i9 << 1);
                }
                System.arraycopy(bArr, i2, this.onWarmupCompleted, this.onExtraCallback, i8);
                int i10 = this.onExtraCallback + i8;
                this.onExtraCallback = i10;
                this.onExtraCallbackWithResult.onExtraCallback(this.onWarmupCompleted, 0, i10);
                if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(8)) {
                    this.onExtraCallbackWithResult.asInterface();
                    int iOnExtraCallback2 = this.onExtraCallbackWithResult.onExtraCallback(2);
                    this.onExtraCallbackWithResult.onWarmupCompleted(5);
                    if (this.onExtraCallbackWithResult.IAuthTabCallback()) {
                        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                        if (this.onExtraCallbackWithResult.IAuthTabCallback()) {
                            int iOnExtraCallbackWithResult2 = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                            if (!this.IAuthTabCallback) {
                                this.asBinder = false;
                                this.readTypedObject.onExtraCallback(iOnExtraCallbackWithResult2);
                                return;
                            }
                            if (this.onExtraCallbackWithResult.IAuthTabCallback()) {
                                int iOnExtraCallbackWithResult3 = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                                if (this.IAuthTabCallbackStubProxy.indexOfKey(iOnExtraCallbackWithResult3) < 0) {
                                    this.asBinder = false;
                                    return;
                                }
                                TextFieldKeyEventHandlerExternalSyntheticLambda1.getInterfaceDescriptor getinterfacedescriptor = this.IAuthTabCallbackStubProxy.get(iOnExtraCallbackWithResult3);
                                TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100Var = this.extraCallbackWithResult.get(getinterfacedescriptor.onWarmupCompleted);
                                if (access100Var.extraCallbackWithResult) {
                                    if (!this.onExtraCallbackWithResult.onExtraCallbackWithResult(2)) {
                                        return;
                                    } else {
                                        this.onExtraCallbackWithResult.onWarmupCompleted(2);
                                    }
                                }
                                if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(access100Var.onTransact)) {
                                    int iOnExtraCallback3 = this.onExtraCallbackWithResult.onExtraCallback(access100Var.onTransact);
                                    if (!access100Var.IAuthTabCallbackStub) {
                                        if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(1)) {
                                            zOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
                                            if (zOnExtraCallback) {
                                                if (!this.onExtraCallbackWithResult.onExtraCallbackWithResult(1)) {
                                                    return;
                                                }
                                                z = zOnExtraCallback;
                                                zOnExtraCallback2 = this.onExtraCallbackWithResult.onExtraCallback();
                                                z2 = true;
                                            }
                                            z3 = this.IAuthTabCallbackStub != 5;
                                            if (z3) {
                                                iOnExtraCallbackWithResult = 0;
                                            } else if (!this.onExtraCallbackWithResult.IAuthTabCallback()) {
                                                return;
                                            } else {
                                                iOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                                            }
                                            i4 = access100Var.IAuthTabCallback_Parcel;
                                            if (i4 != 0) {
                                                if (this.onExtraCallbackWithResult.onExtraCallbackWithResult(access100Var.IAuthTabCallbackStubProxy)) {
                                                    iOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(access100Var.IAuthTabCallbackStubProxy);
                                                    if (getinterfacedescriptor.onNavigationEvent && !z) {
                                                        if (!this.onExtraCallbackWithResult.IAuthTabCallback()) {
                                                            return;
                                                        } else {
                                                            iOnNavigationEvent2 = this.onExtraCallbackWithResult.onNavigationEvent();
                                                        }
                                                    }
                                                    i7 = iOnNavigationEvent2;
                                                    i6 = iOnExtraCallback;
                                                    i5 = 0;
                                                    iOnNavigationEvent = 0;
                                                    this.readTypedObject.onNavigationEvent(access100Var, iOnExtraCallback2, iOnExtraCallbackWithResult2, iOnExtraCallback3, iOnExtraCallbackWithResult3, z, z2, zOnExtraCallback2, z3, iOnExtraCallbackWithResult, i6, i7, i5, iOnNavigationEvent);
                                                    this.asBinder = false;
                                                }
                                                return;
                                            }
                                            if (i4 == 1 && !access100Var.asInterface) {
                                                if (this.onExtraCallbackWithResult.IAuthTabCallback()) {
                                                    int iOnNavigationEvent3 = this.onExtraCallbackWithResult.onNavigationEvent();
                                                    if (!getinterfacedescriptor.onNavigationEvent || z) {
                                                        i5 = iOnNavigationEvent3;
                                                        i6 = 0;
                                                        i7 = 0;
                                                        iOnNavigationEvent = 0;
                                                    } else {
                                                        if (!this.onExtraCallbackWithResult.IAuthTabCallback()) {
                                                            return;
                                                        }
                                                        iOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
                                                        i5 = iOnNavigationEvent3;
                                                        i6 = 0;
                                                        i7 = 0;
                                                    }
                                                    this.readTypedObject.onNavigationEvent(access100Var, iOnExtraCallback2, iOnExtraCallbackWithResult2, iOnExtraCallback3, iOnExtraCallbackWithResult3, z, z2, zOnExtraCallback2, z3, iOnExtraCallbackWithResult, i6, i7, i5, iOnNavigationEvent);
                                                    this.asBinder = false;
                                                }
                                                return;
                                            }
                                            iOnExtraCallback = 0;
                                            iOnNavigationEvent2 = 0;
                                            i7 = iOnNavigationEvent2;
                                            i6 = iOnExtraCallback;
                                            i5 = 0;
                                            iOnNavigationEvent = 0;
                                            this.readTypedObject.onNavigationEvent(access100Var, iOnExtraCallback2, iOnExtraCallbackWithResult2, iOnExtraCallback3, iOnExtraCallbackWithResult3, z, z2, zOnExtraCallback2, z3, iOnExtraCallbackWithResult, i6, i7, i5, iOnNavigationEvent);
                                            this.asBinder = false;
                                        }
                                        return;
                                    }
                                    zOnExtraCallback = false;
                                    z = zOnExtraCallback;
                                    z2 = false;
                                    zOnExtraCallback2 = false;
                                    if (this.IAuthTabCallbackStub != 5) {
                                    }
                                    if (z3) {
                                    }
                                    i4 = access100Var.IAuthTabCallback_Parcel;
                                    if (i4 != 0) {
                                    }
                                    iOnNavigationEvent2 = 0;
                                    i7 = iOnNavigationEvent2;
                                    i6 = iOnExtraCallback;
                                    i5 = 0;
                                    iOnNavigationEvent = 0;
                                    this.readTypedObject.onNavigationEvent(access100Var, iOnExtraCallback2, iOnExtraCallbackWithResult2, iOnExtraCallback3, iOnExtraCallbackWithResult3, z, z2, zOnExtraCallback2, z3, iOnExtraCallbackWithResult, i6, i7, i5, iOnNavigationEvent);
                                    this.asBinder = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean IAuthTabCallback(long j, int i2, boolean z) {
            if (this.IAuthTabCallbackStub == 9 || (this.IAuthTabCallback && this.readTypedObject.IAuthTabCallback(this.access100))) {
                if (z && this.access000) {
                    onExtraCallbackWithResult(i2 + ((int) (j - this.asInterface)));
                }
                this.ICustomTabsCallback = this.asInterface;
                this.writeTypedObject = this.IAuthTabCallbackDefault;
                this.IAuthTabCallback_Parcel = false;
                this.access000 = true;
            }
            onExtraCallbackWithResult();
            this.IAuthTabCallbackStub = 24;
            return this.IAuthTabCallback_Parcel;
        }

        private void onExtraCallbackWithResult() {
            boolean zOnExtraCallback = this.onNavigationEvent ? this.readTypedObject.onExtraCallback() : this.getInterfaceDescriptor;
            boolean z = this.IAuthTabCallback_Parcel;
            int i2 = this.IAuthTabCallbackStub;
            boolean z2 = true;
            if (i2 != 5 && (!zOnExtraCallback || i2 != 1)) {
                z2 = false;
            }
            this.IAuthTabCallback_Parcel = z | z2;
        }

        private void onExtraCallbackWithResult(int i2) {
            long j = this.writeTypedObject;
            if (j != -9223372036854775807L) {
                long j2 = this.asInterface;
                long j3 = this.ICustomTabsCallback;
                if (j2 != j3) {
                    boolean z = this.IAuthTabCallback_Parcel;
                    this.onTransact.onExtraCallback(j, z ? 1 : 0, (int) (j2 - j3), i2, null);
                }
            }
        }

        static final class IAuthTabCallback {
            private int IAuthTabCallback;
            private int IAuthTabCallbackDefault;
            private boolean IAuthTabCallbackStub;
            private int IAuthTabCallbackStubProxy;
            private boolean IAuthTabCallback_Parcel;
            private int access000;
            private int access100;
            private boolean asBinder;
            private int asInterface;
            private int getInterfaceDescriptor;
            private boolean onExtraCallback;
            private int onExtraCallbackWithResult;
            private boolean onNavigationEvent;
            private boolean onTransact;
            private int onWarmupCompleted;
            private TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 writeTypedObject;

            private IAuthTabCallback() {
            }

            public void onNavigationEvent() {
                this.asBinder = false;
                this.IAuthTabCallback_Parcel = false;
            }

            public void onExtraCallback(int i2) {
                this.IAuthTabCallbackStubProxy = i2;
                this.asBinder = true;
            }

            public void onNavigationEvent(TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100Var, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.writeTypedObject = access100Var;
                this.access000 = i2;
                this.IAuthTabCallbackStubProxy = i3;
                this.asInterface = i4;
                this.access100 = i5;
                this.IAuthTabCallbackStub = z;
                this.onNavigationEvent = z2;
                this.onExtraCallback = z3;
                this.onTransact = z4;
                this.IAuthTabCallbackDefault = i6;
                this.getInterfaceDescriptor = i7;
                this.IAuthTabCallback = i8;
                this.onWarmupCompleted = i9;
                this.onExtraCallbackWithResult = i10;
                this.IAuthTabCallback_Parcel = true;
                this.asBinder = true;
            }

            public boolean onExtraCallback() {
                if (!this.asBinder) {
                    return false;
                }
                int i2 = this.IAuthTabCallbackStubProxy;
                return i2 == 7 || i2 == 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
                int i2;
                int i3;
                int i4;
                boolean z;
                if (!this.IAuthTabCallback_Parcel) {
                    return false;
                }
                if (!iAuthTabCallback.IAuthTabCallback_Parcel) {
                    return true;
                }
                TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100Var = (TextFieldKeyEventHandlerExternalSyntheticLambda1.access100) RecordingInputConnection_androidKt.onWarmupCompleted(this.writeTypedObject);
                TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100Var2 = (TextFieldKeyEventHandlerExternalSyntheticLambda1.access100) RecordingInputConnection_androidKt.onWarmupCompleted(iAuthTabCallback.writeTypedObject);
                return (this.asInterface == iAuthTabCallback.asInterface && this.access100 == iAuthTabCallback.access100 && this.IAuthTabCallbackStub == iAuthTabCallback.IAuthTabCallbackStub && (!this.onNavigationEvent || !iAuthTabCallback.onNavigationEvent || this.onExtraCallback == iAuthTabCallback.onExtraCallback) && (((i2 = this.access000) == (i3 = iAuthTabCallback.access000) || (i2 != 0 && i3 != 0)) && (((i4 = access100Var.IAuthTabCallback_Parcel) != 0 || access100Var2.IAuthTabCallback_Parcel != 0 || (this.getInterfaceDescriptor == iAuthTabCallback.getInterfaceDescriptor && this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback)) && ((i4 != 1 || access100Var2.IAuthTabCallback_Parcel != 1 || (this.onWarmupCompleted == iAuthTabCallback.onWarmupCompleted && this.onExtraCallbackWithResult == iAuthTabCallback.onExtraCallbackWithResult)) && (z = this.onTransact) == iAuthTabCallback.onTransact && (!z || this.IAuthTabCallbackDefault == iAuthTabCallback.IAuthTabCallbackDefault))))) ? false : true;
            }
        }
    }
}
