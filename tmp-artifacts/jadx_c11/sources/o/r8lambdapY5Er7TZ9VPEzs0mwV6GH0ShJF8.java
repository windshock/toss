package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 {
    private static int IAuthTabCallbackStub = 0;
    private static int getInterfaceDescriptor = 1;
    private final long IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final long asBinder;
    private final q7 asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8)) {
            int i2 = getInterfaceDescriptor + 59;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 != 0;
        }
        r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8 r8lambdapy5er7tz9vpezs0mwv6gh0shjf8 = (r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8) obj;
        if (!Intrinsics.areEqual(this.asInterface, r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.asInterface)) {
            return false;
        }
        if (this.onExtraCallbackWithResult != r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.onExtraCallbackWithResult) {
            int i3 = getInterfaceDescriptor + 101;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onWarmupCompleted != r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.onWarmupCompleted) {
            int i5 = IAuthTabCallbackStub + 125;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.onExtraCallback == r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.onExtraCallback) {
            return this.IAuthTabCallback == r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.IAuthTabCallback && this.asBinder == r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.asBinder && Intrinsics.areEqual(this.onTransact, r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.onTransact) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onNavigationEvent, r8lambdapy5er7tz9vpezs0mwv6gh0shjf8.onNavigationEvent);
        }
        int i7 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStub = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((this.asInterface.hashCode() * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.onWarmupCompleted)) * 31) + Long.hashCode(this.onExtraCallback)) * 31) + Long.hashCode(this.IAuthTabCallback)) * 31) + Long.hashCode(this.asBinder)) * 31) + this.onTransact.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i4 = IAuthTabCallbackStub + 43;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConnectionAvailabilitySnapshot(key=" + this.asInterface + ", expectedDurationMillis=" + this.onExtraCallbackWithResult + ", connectedDurationMillis=" + this.onWarmupCompleted + ", disconnectedDurationMillis=" + this.onExtraCallback + ", disconnectCount=" + this.IAuthTabCallback + ", faultCount=" + this.asBinder + ", flushReason=" + this.onTransact + ", summaryWindowBucket=" + this.IAuthTabCallbackDefault + ", availabilityState=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackStub + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdapY5Er7TZ9VPEzs0mwV6GH0ShJF8(@NotNull q7 q7Var, long j, long j2, long j3, long j4, long j5, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(q7Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.asInterface = q7Var;
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = j2;
        this.onExtraCallback = j3;
        this.IAuthTabCallback = j4;
        this.asBinder = j5;
        this.onTransact = str;
        this.IAuthTabCallbackDefault = str2;
        this.onNavigationEvent = str3;
    }

    public final q7 onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 73;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        q7 q7Var = this.asInterface;
        int i5 = i2 + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return q7Var;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = i3 + 97;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 61;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 95;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 53;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        long j = this.asBinder;
        int i5 = i2 + 117;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onTransact;
        int i4 = i2 + 13;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallbackDefault;
        int i5 = i2 + 33;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 19;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }
}
