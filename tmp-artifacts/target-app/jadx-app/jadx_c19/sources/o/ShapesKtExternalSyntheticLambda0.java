package o;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ShapesKtExternalSyntheticLambda0 {
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private float onTransact;
    private String getInterfaceDescriptor = "";
    private String IAuthTabCallbackStubProxy = "";
    private Set<String> IAuthTabCallback_Parcel = Collections.EMPTY_SET;
    private String readTypedObject = "";
    private String onExtraCallback = null;
    private boolean IAuthTabCallbackStub = false;
    private boolean asInterface = false;
    private int access100 = -1;
    private int writeTypedObject = -1;
    private int IAuthTabCallback = -1;
    private int IAuthTabCallbackDefault = -1;
    private int asBinder = -1;
    private int access000 = -1;
    private boolean onWarmupCompleted = false;

    public void onWarmupCompleted(String str) {
        this.getInterfaceDescriptor = str;
    }

    public void onExtraCallbackWithResult(String str) {
        this.IAuthTabCallbackStubProxy = str;
    }

    public void onWarmupCompleted(String[] strArr) {
        this.IAuthTabCallback_Parcel = new HashSet(Arrays.asList(strArr));
    }

    public void onNavigationEvent(String str) {
        this.readTypedObject = str;
    }

    public int onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.getInterfaceDescriptor.isEmpty() && this.IAuthTabCallbackStubProxy.isEmpty() && this.IAuthTabCallback_Parcel.isEmpty() && this.readTypedObject.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iOnExtraCallback = onExtraCallback(onExtraCallback(onExtraCallback(0, this.getInterfaceDescriptor, str, 1073741824), this.IAuthTabCallbackStubProxy, str2, 2), this.readTypedObject, str3, 4);
        if (iOnExtraCallback == -1 || !set.containsAll(this.IAuthTabCallback_Parcel)) {
            return 0;
        }
        return iOnExtraCallback + (this.IAuthTabCallback_Parcel.size() << 2);
    }

    public int asInterface() {
        int i2 = this.IAuthTabCallback;
        if (i2 == -1 && this.IAuthTabCallbackDefault == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.IAuthTabCallbackDefault == 1 ? 2 : 0);
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.access100 == 1;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.writeTypedObject == 1;
    }

    public ShapesKtExternalSyntheticLambda0 onNavigationEvent(boolean z) {
        this.writeTypedObject = z ? 1 : 0;
        return this;
    }

    public ShapesKtExternalSyntheticLambda0 onExtraCallbackWithResult(boolean z) {
        this.IAuthTabCallback = z ? 1 : 0;
        return this;
    }

    public ShapesKtExternalSyntheticLambda0 onWarmupCompleted(boolean z) {
        this.IAuthTabCallbackDefault = z ? 1 : 0;
        return this;
    }

    public String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public ShapesKtExternalSyntheticLambda0 onExtraCallback(@Nullable String str) {
        this.onExtraCallback = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public int onWarmupCompleted() {
        if (!this.IAuthTabCallbackStub) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.onNavigationEvent;
    }

    public ShapesKtExternalSyntheticLambda0 onWarmupCompleted(int i2) {
        this.onNavigationEvent = i2;
        this.IAuthTabCallbackStub = true;
        return this;
    }

    public boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallbackStub;
    }

    public int onExtraCallback() {
        if (!this.asInterface) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.onExtraCallbackWithResult;
    }

    public ShapesKtExternalSyntheticLambda0 IAuthTabCallback(int i2) {
        this.onExtraCallbackWithResult = i2;
        this.asInterface = true;
        return this;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    public ShapesKtExternalSyntheticLambda0 onWarmupCompleted(float f) {
        this.onTransact = f;
        return this;
    }

    public ShapesKtExternalSyntheticLambda0 onNavigationEvent(int i2) {
        this.asBinder = i2;
        return this;
    }

    public int asBinder() {
        return this.asBinder;
    }

    public float onNavigationEvent() {
        return this.onTransact;
    }

    public ShapesKtExternalSyntheticLambda0 onExtraCallbackWithResult(int i2) {
        this.access000 = i2;
        return this;
    }

    public int onTransact() {
        return this.access000;
    }

    public ShapesKtExternalSyntheticLambda0 IAuthTabCallback(boolean z) {
        this.onWarmupCompleted = z;
        return this;
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    private static int onExtraCallback(int i2, String str, @Nullable String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }
}
