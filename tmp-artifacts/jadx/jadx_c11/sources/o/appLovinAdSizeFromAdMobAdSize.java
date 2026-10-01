package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class appLovinAdSizeFromAdMobAdSize {
    private static int asBinder = 1;
    private static int onTransact;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ appLovinAdSizeFromAdMobAdSize(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    private appLovinAdSizeFromAdMobAdSize(long j, long j2, long j3, long j4, long j5) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        this.onExtraCallbackWithResult = j3;
        this.onNavigationEvent = j4;
        this.IAuthTabCallback = j5;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 115;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 75;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        long j;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onNavigationEvent;
            int i4 = 91 / 0;
        } else {
            j = this.onNavigationEvent;
        }
        int i5 = i2 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 97 / 0;
        return this.IAuthTabCallback;
    }
}
