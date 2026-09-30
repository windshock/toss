package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getChildUserError {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ getChildUserError(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    private getChildUserError(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.onWarmupCompleted = j;
        this.onExtraCallbackWithResult = j2;
        this.onNavigationEvent = j3;
        this.onExtraCallback = j4;
        this.IAuthTabCallback = j5;
        this.IAuthTabCallbackDefault = j6;
        this.asInterface = j7;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 27;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onExtraCallback;
        int i4 = i2 + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i3 + 97;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackDefault;
        int i5 = i3 + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.asInterface;
        int i5 = i3 + 119;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
