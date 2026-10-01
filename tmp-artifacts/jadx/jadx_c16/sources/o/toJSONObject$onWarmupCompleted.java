package o;

import kotlin.jvm.internal.Intrinsics;
import o.toJSONObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJSONObject$onWarmupCompleted implements toJSONObject {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final onExtraCallbackWithResult IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final toJSONObject.onExtraCallback onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStubProxy + 71;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof toJSONObject$onWarmupCompleted)) {
            return false;
        }
        toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted = (toJSONObject$onWarmupCompleted) obj;
        if (!Intrinsics.areEqual(this.asBinder, tojsonobject_onwarmupcompleted.asBinder) || !getByteArray.onNavigationEvent(this.IAuthTabCallbackDefault, tojsonobject_onwarmupcompleted.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.IAuthTabCallback, tojsonobject_onwarmupcompleted.IAuthTabCallback) || !Intrinsics.areEqual(this.onNavigationEvent, tojsonobject_onwarmupcompleted.onNavigationEvent) || !Intrinsics.areEqual(this.asInterface, tojsonobject_onwarmupcompleted.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, tojsonobject_onwarmupcompleted.onWarmupCompleted)) {
            int i6 = getInterfaceDescriptor + 41;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != tojsonobject_onwarmupcompleted.onExtraCallbackWithResult || !Intrinsics.areEqual(this.onExtraCallback, tojsonobject_onwarmupcompleted.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackStub, tojsonobject_onwarmupcompleted.IAuthTabCallbackStub)) {
            return Intrinsics.areEqual(this.onTransact, tojsonobject_onwarmupcompleted.onTransact);
        }
        int i8 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((this.asBinder.hashCode() * 31) + getByteArray.onExtraCallback(this.IAuthTabCallbackDefault)) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.onTransact.hashCode();
        int i4 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Investment(referenceId=" + this.asBinder + ", uniqueId=" + getByteArray.IAuthTabCallback(this.IAuthTabCallbackDefault) + ", imageUrl=" + this.IAuthTabCallback + ", imageDarkUrl=" + this.onNavigationEvent + ", title=" + this.asInterface + ", description=" + this.onWarmupCompleted + ", deletable=" + this.onExtraCallbackWithResult + ", assetName=" + this.onExtraCallback + ", type=" + this.IAuthTabCallbackStub + ", logExtra=" + this.onTransact + ")";
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return str;
    }

    private toJSONObject$onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, onExtraCallbackWithResult onextracallbackwithresult, toJSONObject.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.asBinder = str;
        this.IAuthTabCallbackDefault = str2;
        this.IAuthTabCallback = str3;
        this.onNavigationEvent = str4;
        this.asInterface = str5;
        this.onWarmupCompleted = str6;
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = str7;
        this.IAuthTabCallbackStub = onextracallbackwithresult;
        this.onTransact = onextracallback;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asBinder;
        int i5 = i2 + 81;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackDefault;
        int i5 = i3 + 41;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 11;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 95;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 119;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.asInterface;
        int i4 = i2 + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 125;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 95;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 13;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final onExtraCallbackWithResult asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 27;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStub;
        int i5 = i2 + 99;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public toJSONObject.onExtraCallback IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 85;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        toJSONObject.onExtraCallback onextracallback = this.onTransact;
        int i5 = i2 + 51;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }
}
