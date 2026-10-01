package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Nestfputsdk {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackStub;
    private final long asBinder;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ Nestfputsdk(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    private Nestfputsdk(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = j3;
        this.onExtraCallbackWithResult = j4;
        this.onNavigationEvent = j5;
        this.IAuthTabCallbackStub = j6;
        this.asBinder = j7;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 85;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        int i5 = i3 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i3 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onExtraCallbackWithResult;
        int i4 = i3 + 105;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 11;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackStub;
        int i5 = i3 + 11;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asInterface() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.asBinder;
            int i4 = 73 / 0;
        } else {
            j = this.asBinder;
        }
        int i5 = i2 + 5;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
