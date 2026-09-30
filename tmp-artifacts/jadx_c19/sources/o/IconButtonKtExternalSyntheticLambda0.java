package o;

import java.io.IOException;
import java.util.Arrays;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class IconButtonKtExternalSyntheticLambda0 {
    private int IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final FloatingActionButtonKtExternalSyntheticLambda4 IAuthTabCallbackStubProxy;
    private long[] access000;
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 access100;
    private int asBinder;
    private int asInterface;
    private int[] getInterfaceDescriptor;
    private int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private int onTransact;
    private int onWarmupCompleted;

    public IconButtonKtExternalSyntheticLambda0(int i2, FloatingActionButtonKtExternalSyntheticLambda4 floatingActionButtonKtExternalSyntheticLambda4, ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
        this.IAuthTabCallbackStubProxy = floatingActionButtonKtExternalSyntheticLambda4;
        int iOnWarmupCompleted = floatingActionButtonKtExternalSyntheticLambda4.onWarmupCompleted();
        boolean z = true;
        if (iOnWarmupCompleted != 1 && iOnWarmupCompleted != 2) {
            z = false;
        }
        RecordingInputConnection_androidKt.onNavigationEvent(z);
        this.onNavigationEvent = onNavigationEvent(i2, iOnWarmupCompleted == 2 ? 1667497984 : 1651965952);
        this.IAuthTabCallbackStub = floatingActionButtonKtExternalSyntheticLambda4.onExtraCallback();
        this.access100 = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        this.onExtraCallbackWithResult = iOnWarmupCompleted == 2 ? onNavigationEvent(i2, 1650720768) : -1;
        this.IAuthTabCallbackDefault = -1L;
        this.access000 = new long[512];
        this.getInterfaceDescriptor = new int[512];
        this.IAuthTabCallback = floatingActionButtonKtExternalSyntheticLambda4.onWarmupCompleted;
    }

    public void onNavigationEvent(long j, boolean z) {
        if (this.IAuthTabCallbackDefault == -1) {
            this.IAuthTabCallbackDefault = j;
        }
        if (z) {
            if (this.onTransact == this.getInterfaceDescriptor.length) {
                long[] jArr = this.access000;
                this.access000 = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.getInterfaceDescriptor;
                this.getInterfaceDescriptor = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.access000;
            int i2 = this.onTransact;
            jArr2[i2] = j;
            this.getInterfaceDescriptor[i2] = this.asBinder;
            this.onTransact = i2 + 1;
        }
        this.asBinder++;
    }

    public void IAuthTabCallback() {
        this.onExtraCallback++;
    }

    public long onNavigationEvent() {
        return onNavigationEvent(this.onExtraCallback);
    }

    public long onWarmupCompleted() {
        return onNavigationEvent(1);
    }

    public void onExtraCallbackWithResult() {
        int i2;
        this.access000 = Arrays.copyOf(this.access000, this.onTransact);
        this.getInterfaceDescriptor = Arrays.copyOf(this.getInterfaceDescriptor, this.onTransact);
        if (!onExtraCallback() || this.IAuthTabCallbackStubProxy.onExtraCallback == 0 || (i2 = this.onTransact) <= 0) {
            return;
        }
        this.IAuthTabCallback = i2;
    }

    public boolean onExtraCallback(int i2) {
        return this.onNavigationEvent == i2 || this.onExtraCallbackWithResult == i2;
    }

    public boolean IAuthTabCallbackStub() {
        return Arrays.binarySearch(this.getInterfaceDescriptor, this.onExtraCallback) >= 0;
    }

    public boolean onExtraCallback() {
        return (this.onNavigationEvent & 1651965952) == 1651965952;
    }

    public void onWarmupCompleted(int i2) {
        this.asInterface = i2;
        this.onWarmupCompleted = i2;
    }

    public boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int i2 = this.onWarmupCompleted;
        int iOnExtraCallback = i2 - this.access100.onExtraCallback(drawerKtExternalSyntheticLambda9, i2, false);
        this.onWarmupCompleted = iOnExtraCallback;
        boolean z = iOnExtraCallback == 0;
        if (z) {
            if (this.asInterface > 0) {
                this.access100.onExtraCallback(onNavigationEvent(), IAuthTabCallbackStub() ? 1 : 0, this.asInterface, 0, null);
            }
            IAuthTabCallback();
        }
        return z;
    }

    public void IAuthTabCallback(long j) {
        if (this.onTransact == 0) {
            this.onExtraCallback = 0;
        } else {
            this.onExtraCallback = this.getInterfaceDescriptor[TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.access000, j, true, true)];
        }
    }

    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallbackWithResult(long j) {
        if (this.onTransact == 0) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(0L, this.IAuthTabCallbackDefault));
        }
        int iOnWarmupCompleted = (int) (j / onWarmupCompleted());
        int iOnWarmupCompleted2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.getInterfaceDescriptor, iOnWarmupCompleted, true, true);
        if (this.getInterfaceDescriptor[iOnWarmupCompleted2] == iOnWarmupCompleted) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(IAuthTabCallback(iOnWarmupCompleted2));
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3IAuthTabCallback = IAuthTabCallback(iOnWarmupCompleted2);
        int i2 = iOnWarmupCompleted2 + 1;
        if (i2 < this.access000.length) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3IAuthTabCallback, IAuthTabCallback(i2));
        }
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3IAuthTabCallback);
    }

    private long onNavigationEvent(int i2) {
        return (this.IAuthTabCallbackStub * i2) / this.IAuthTabCallback;
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda3 IAuthTabCallback(int i2) {
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(this.getInterfaceDescriptor[i2] * onWarmupCompleted(), this.access000[i2]);
    }

    private static int onNavigationEvent(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }
}
