package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda15 {
    public long IAuthTabCallback;
    public long IAuthTabCallbackDefault;
    public boolean IAuthTabCallbackStub;
    public ProgressIndicatorKtExternalSyntheticLambda11 access000;
    public boolean asBinder;
    public int asInterface;
    public int extraCallback;
    public boolean onExtraCallback;
    public OutlinedTextFieldKtExternalSyntheticLambda7 onExtraCallbackWithResult;
    public long onNavigationEvent;
    public long onWarmupCompleted;
    public long[] ICustomTabsCallback = new long[0];
    public int[] writeTypedObject = new int[0];
    public int[] getInterfaceDescriptor = new int[0];
    public long[] access100 = new long[0];
    public boolean[] IAuthTabCallback_Parcel = new boolean[0];
    public boolean[] IAuthTabCallbackStubProxy = new boolean[0];
    public final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    public void onWarmupCompleted() {
        this.extraCallback = 0;
        this.IAuthTabCallbackDefault = 0L;
        this.IAuthTabCallbackStub = false;
        this.onExtraCallback = false;
        this.asBinder = false;
        this.access000 = null;
    }

    public void onNavigationEvent(int i2, int i3) {
        this.extraCallback = i2;
        this.asInterface = i3;
        if (this.writeTypedObject.length < i2) {
            this.ICustomTabsCallback = new long[i2];
            this.writeTypedObject = new int[i2];
        }
        if (this.getInterfaceDescriptor.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.getInterfaceDescriptor = new int[i4];
            this.access100 = new long[i4];
            this.IAuthTabCallback_Parcel = new boolean[i4];
            this.IAuthTabCallbackStubProxy = new boolean[i4];
        }
    }

    public void onNavigationEvent(int i2) {
        this.onTransact.onExtraCallback(i2);
        this.onExtraCallback = true;
        this.asBinder = true;
    }

    public void IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onTransact.onExtraCallback(), 0, this.onTransact.onExtraCallbackWithResult());
        this.onTransact.asBinder(0);
        this.asBinder = false;
    }

    public void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onTransact.onExtraCallback(), 0, this.onTransact.onExtraCallbackWithResult());
        this.onTransact.asBinder(0);
        this.asBinder = false;
    }

    public long onExtraCallback(int i2) {
        return this.access100[i2];
    }

    public boolean onWarmupCompleted(int i2) {
        return this.onExtraCallback && this.IAuthTabCallbackStubProxy[i2];
    }
}
