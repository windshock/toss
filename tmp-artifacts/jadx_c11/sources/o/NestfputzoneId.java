package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NestfputzoneId {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long asBinder;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ NestfputzoneId(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    private NestfputzoneId(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.IAuthTabCallback = j;
        this.onExtraCallbackWithResult = j2;
        this.onWarmupCompleted = j3;
        this.onExtraCallback = j4;
        this.onNavigationEvent = j5;
        this.asBinder = j6;
        this.onTransact = j7;
        this.IAuthTabCallbackDefault = j8;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final long onExtraCallback() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 19;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onExtraCallbackWithResult;
            int i4 = 70 / 0;
        } else {
            j = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 53;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 75;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        int i5 = i3 + 39;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 73;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 13;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.onTransact;
        int i4 = i2 + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallbackDefault;
        int i5 = i2 + 57;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
