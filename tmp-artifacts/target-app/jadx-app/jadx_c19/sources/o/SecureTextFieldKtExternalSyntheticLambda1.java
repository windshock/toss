package o;

import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SecureTextFieldKtExternalSyntheticLambda1 {
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private String IAuthTabCallbackStubProxy;
    private boolean asBinder;
    private String asInterface;
    private Layout.Alignment extraCallback;
    private Layout.Alignment getInterfaceDescriptor;
    private String onExtraCallback;
    private int onExtraCallbackWithResult;
    private String onNavigationEvent;
    private float onTransact;
    private ScaffoldKtExternalSyntheticLambda7 readTypedObject;
    private int IAuthTabCallback_Parcel = -1;
    private int onActivityLayout = -1;
    private int onWarmupCompleted = -1;
    private int access000 = -1;
    private int IAuthTabCallbackDefault = -1;
    private int ICustomTabsCallback = -1;
    private int access100 = -1;
    private int writeTypedObject = -1;
    private float extraCallbackWithResult = Float.MAX_VALUE;

    public int access100() {
        int i2 = this.onWarmupCompleted;
        if (i2 == -1 && this.access000 == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.access000 == 1 ? 2 : 0);
    }

    public boolean extraCallback() {
        return this.IAuthTabCallback_Parcel == 1;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 IAuthTabCallback(boolean z) {
        this.IAuthTabCallback_Parcel = z ? 1 : 0;
        return this;
    }

    public boolean readTypedObject() {
        return this.onActivityLayout == 1;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onExtraCallback(boolean z) {
        this.onActivityLayout = z ? 1 : 0;
        return this;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onNavigationEvent(boolean z) {
        this.onWarmupCompleted = z ? 1 : 0;
        return this;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(boolean z) {
        this.access000 = z ? 1 : 0;
        return this;
    }

    public String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 IAuthTabCallback(@Nullable String str) {
        this.onExtraCallback = str;
        return this;
    }

    public int onWarmupCompleted() {
        if (!this.IAuthTabCallbackStub) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.IAuthTabCallback;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onExtraCallback(int i2) {
        this.IAuthTabCallback = i2;
        this.IAuthTabCallbackStub = true;
        return this;
    }

    public boolean writeTypedObject() {
        return this.IAuthTabCallbackStub;
    }

    public int onExtraCallback() {
        if (!this.asBinder) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.onExtraCallbackWithResult;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(int i2) {
        this.onExtraCallbackWithResult = i2;
        this.asBinder = true;
        return this;
    }

    public boolean ICustomTabsCallback() {
        return this.asBinder;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onExtraCallbackWithResult(float f) {
        this.extraCallbackWithResult = f;
        return this;
    }

    public float getInterfaceDescriptor() {
        return this.extraCallbackWithResult;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onNavigationEvent(@Nullable SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1) {
        return onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1, true);
    }

    private SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(@Nullable SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1, boolean z) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (secureTextFieldKtExternalSyntheticLambda1 != null) {
            if (!this.IAuthTabCallbackStub && secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallbackStub) {
                onExtraCallback(secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallback);
            }
            if (this.onWarmupCompleted == -1) {
                this.onWarmupCompleted = secureTextFieldKtExternalSyntheticLambda1.onWarmupCompleted;
            }
            if (this.access000 == -1) {
                this.access000 = secureTextFieldKtExternalSyntheticLambda1.access000;
            }
            if (this.onExtraCallback == null && (str = secureTextFieldKtExternalSyntheticLambda1.onExtraCallback) != null) {
                this.onExtraCallback = str;
            }
            if (this.IAuthTabCallback_Parcel == -1) {
                this.IAuthTabCallback_Parcel = secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallback_Parcel;
            }
            if (this.onActivityLayout == -1) {
                this.onActivityLayout = secureTextFieldKtExternalSyntheticLambda1.onActivityLayout;
            }
            if (this.access100 == -1) {
                this.access100 = secureTextFieldKtExternalSyntheticLambda1.access100;
            }
            if (this.extraCallback == null && (alignment2 = secureTextFieldKtExternalSyntheticLambda1.extraCallback) != null) {
                this.extraCallback = alignment2;
            }
            if (this.getInterfaceDescriptor == null && (alignment = secureTextFieldKtExternalSyntheticLambda1.getInterfaceDescriptor) != null) {
                this.getInterfaceDescriptor = alignment;
            }
            if (this.writeTypedObject == -1) {
                this.writeTypedObject = secureTextFieldKtExternalSyntheticLambda1.writeTypedObject;
            }
            if (this.IAuthTabCallbackDefault == -1) {
                this.IAuthTabCallbackDefault = secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallbackDefault;
                this.onTransact = secureTextFieldKtExternalSyntheticLambda1.onTransact;
            }
            if (this.readTypedObject == null) {
                this.readTypedObject = secureTextFieldKtExternalSyntheticLambda1.readTypedObject;
            }
            if (this.extraCallbackWithResult == Float.MAX_VALUE) {
                this.extraCallbackWithResult = secureTextFieldKtExternalSyntheticLambda1.extraCallbackWithResult;
            }
            if (this.IAuthTabCallbackStubProxy == null) {
                this.IAuthTabCallbackStubProxy = secureTextFieldKtExternalSyntheticLambda1.IAuthTabCallbackStubProxy;
            }
            if (this.onNavigationEvent == null) {
                this.onNavigationEvent = secureTextFieldKtExternalSyntheticLambda1.onNavigationEvent;
            }
            if (z && !this.asBinder && secureTextFieldKtExternalSyntheticLambda1.asBinder) {
                onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z && this.ICustomTabsCallback == -1 && (i2 = secureTextFieldKtExternalSyntheticLambda1.ICustomTabsCallback) != -1) {
                this.ICustomTabsCallback = i2;
            }
        }
        return this;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onExtraCallback(@Nullable String str) {
        this.asInterface = str;
        return this;
    }

    public String onTransact() {
        return this.asInterface;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 IAuthTabCallback(int i2) {
        this.ICustomTabsCallback = i2;
        return this;
    }

    public int IAuthTabCallback_Parcel() {
        return this.ICustomTabsCallback;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onExtraCallbackWithResult(int i2) {
        this.access100 = i2;
        return this;
    }

    public int IAuthTabCallbackStub() {
        return this.access100;
    }

    public Layout.Alignment access000() {
        return this.extraCallback;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(@Nullable Layout.Alignment alignment) {
        this.extraCallback = alignment;
        return this;
    }

    public Layout.Alignment IAuthTabCallbackDefault() {
        return this.getInterfaceDescriptor;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 IAuthTabCallback(@Nullable Layout.Alignment alignment) {
        this.getInterfaceDescriptor = alignment;
        return this;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.writeTypedObject == 1;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onExtraCallbackWithResult(boolean z) {
        this.writeTypedObject = z ? 1 : 0;
        return this;
    }

    public ScaffoldKtExternalSyntheticLambda7 extraCallbackWithResult() {
        return this.readTypedObject;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(@Nullable ScaffoldKtExternalSyntheticLambda7 scaffoldKtExternalSyntheticLambda7) {
        this.readTypedObject = scaffoldKtExternalSyntheticLambda7;
        return this;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onNavigationEvent(float f) {
        this.onTransact = f;
        return this;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onNavigationEvent(int i2) {
        this.IAuthTabCallbackDefault = i2;
        return this;
    }

    public int asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    public float onNavigationEvent() {
        return this.onTransact;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onWarmupCompleted(@Nullable String str) {
        this.IAuthTabCallbackStubProxy = str;
        return this;
    }

    public String asInterface() {
        return this.IAuthTabCallbackStubProxy;
    }

    public SecureTextFieldKtExternalSyntheticLambda1 onNavigationEvent(@Nullable String str) {
        this.onNavigationEvent = str;
        return this;
    }

    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }
}
