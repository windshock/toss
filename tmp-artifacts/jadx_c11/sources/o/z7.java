package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z7 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackStub;
    private final long asBinder;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ z7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    private z7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.onExtraCallback = j;
        this.onNavigationEvent = j2;
        this.onExtraCallbackWithResult = j3;
        this.onWarmupCompleted = j4;
        this.IAuthTabCallback = j5;
        this.asBinder = j6;
        this.IAuthTabCallbackStub = j7;
        this.asInterface = j8;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        int i5 = i3 + 11;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 57;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 13;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 117;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.asBinder;
        int i4 = i2 + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.asInterface;
        int i4 = i3 + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }
}
