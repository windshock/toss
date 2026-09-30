package o;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinBannerAdListener2 {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long asBinder;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ AppLovinBannerAdListener2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~((~i3) | i7);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i3)) | (~(i4 | i3));
        int i11 = i7 | i3;
        int i12 = i9 | i11;
        int i13 = i4 + i3 + i6 + ((-1542968645) * i) + (1789173782 * i2);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i4) + 752877568 + ((-368479342) * i3) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i6) + (1802502144 * i) + (148897792 * i2) + (289275904 * i14);
        int i16 = (i4 * (-930071408)) + 1959937684 + (i3 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i6 * (-930070801)) + (i * 1059663509) + (i2 * (-1428764534)) + (i14 * 484573184);
        if (i15 + (i16 * i16 * 411172864) == 1) {
            return onExtraCallback(objArr);
        }
        AppLovinBannerAdListener2 appLovinBannerAdListener2 = (AppLovinBannerAdListener2) objArr[0];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback_Parcel + 55;
        int i19 = i18 % 128;
        IAuthTabCallbackStubProxy = i19;
        int i20 = i18 % 2;
        long j = appLovinBannerAdListener2.onTransact;
        int i21 = i19 + 5;
        IAuthTabCallback_Parcel = i21 % 128;
        int i22 = i21 % 2;
        return Long.valueOf(j);
    }

    private AppLovinBannerAdListener2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = j2;
        this.onNavigationEvent = j3;
        this.onExtraCallback = j4;
        this.onWarmupCompleted = j5;
        this.asInterface = j6;
        this.IAuthTabCallbackDefault = j7;
        this.onTransact = j8;
        this.IAuthTabCallbackStub = j9;
        this.asBinder = j10;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 59;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 93;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i2 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 105;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 75;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppLovinBannerAdListener2 appLovinBannerAdListener2 = (AppLovinBannerAdListener2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 33;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            long j = appLovinBannerAdListener2.onWarmupCompleted;
            obj.hashCode();
            throw null;
        }
        long j2 = appLovinBannerAdListener2.onWarmupCompleted;
        int i4 = i2 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return Long.valueOf(j2);
        }
        obj.hashCode();
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 109;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.asInterface;
        int i4 = i2 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.IAuthTabCallbackDefault;
        int i4 = i3 + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 79;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.IAuthTabCallbackStub;
        int i4 = i2 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        int i3 = 44 / 0;
        return this.asBinder;
    }

    public final long onWarmupCompleted() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Long) onExtraCallbackWithResult(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1300365546, 1300365547, iOnExtraCallback, iOnExtraCallback2, new Object[]{this})).longValue();
    }

    public final long IAuthTabCallbackStub() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Long) onExtraCallbackWithResult(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -262598584, 262598584, iOnExtraCallback, iOnExtraCallback2, new Object[]{this})).longValue();
    }
}
