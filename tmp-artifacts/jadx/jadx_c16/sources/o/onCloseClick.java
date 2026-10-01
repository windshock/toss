package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onCloseClick {
    private static int IAuthTabCallbackStub = 0;
    private static int getInterfaceDescriptor = 1;
    private final long IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final boolean asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 121;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof onCloseClick)) {
            return false;
        }
        onCloseClick oncloseclick = (onCloseClick) obj;
        if (this.IAuthTabCallback != oncloseclick.IAuthTabCallback) {
            int i4 = IAuthTabCallbackStub + 121;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, oncloseclick.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, oncloseclick.onWarmupCompleted)) {
            int i6 = getInterfaceDescriptor + 47;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, oncloseclick.onTransact) || !Intrinsics.areEqual(this.asInterface, oncloseclick.asInterface) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, oncloseclick.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, oncloseclick.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.onExtraCallback, oncloseclick.onExtraCallback)) {
            return false;
        }
        if (this.asBinder == oncloseclick.asBinder) {
            return true;
        }
        int i8 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Long.hashCode(this.IAuthTabCallback) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + Boolean.hashCode(this.asBinder);
        int i4 = IAuthTabCallbackStub + 63;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JointDepositReq(amount=" + this.IAuthTabCallback + ", depositSummary=" + this.onNavigationEvent + ", fromAccountNo=" + this.onWarmupCompleted + ", fromAccountType=" + this.onTransact + ", toAccountNo=" + this.asInterface + ", doc=" + this.onExtraCallbackWithResult + ", signature=" + this.IAuthTabCallbackDefault + ", date=" + this.onExtraCallback + ", useLv0Cert=" + this.asBinder + ")";
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return str;
    }

    public onCloseClick(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.IAuthTabCallback = j;
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.onTransact = str3;
        this.asInterface = str4;
        this.onExtraCallbackWithResult = str5;
        this.IAuthTabCallbackDefault = str6;
        this.onExtraCallback = str7;
        this.asBinder = z;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 38 / 0;
        return this.IAuthTabCallback;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 27;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 85;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onWarmupCompleted;
            int i4 = 85 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i2 + 25;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onTransact;
        int i4 = i2 + 25;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.asInterface;
        int i4 = i3 + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 19;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 31;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallbackDefault;
        int i4 = i3 + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
