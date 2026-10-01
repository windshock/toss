package o;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.handleNativeAdClick;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getNetwork {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    private final getJobwork_runtime_ktx_release IAuthTabCallback;
    private final handleNativeAdClick.onExtraCallback.asInterface IAuthTabCallbackDefault;
    private final long asBinder;
    private final Integer asInterface;
    private final getFuturework_runtime_ktx_release onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final int onTransact;
    private final Bitmap onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ getNetwork(long j, int i, int i2, getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, Bitmap bitmap, Integer num, Integer num2, handleNativeAdClick.onExtraCallback.asInterface asinterface, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, getjobwork_runtime_ktx_release, getfuturework_runtime_ktx_release, bitmap, num, num2, asinterface);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNetwork)) {
            int i4 = i3 + 49;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getNetwork getnetwork = (getNetwork) obj;
        if (!setUseCaseAttached.onWarmupCompleted(this.asBinder, getnetwork.asBinder)) {
            return false;
        }
        if (this.onTransact != getnetwork.onTransact) {
            int i6 = IAuthTabCallbackStubProxy + 41;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 75 / 0;
            }
            return false;
        }
        if (this.onExtraCallbackWithResult != getnetwork.onExtraCallbackWithResult || !Intrinsics.areEqual(this.IAuthTabCallback, getnetwork.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, getnetwork.onExtraCallback)) {
            int i8 = IAuthTabCallbackStubProxy + 115;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, getnetwork.onWarmupCompleted) || !Intrinsics.areEqual(this.onNavigationEvent, getnetwork.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.asInterface, getnetwork.asInterface)) {
            if (Intrinsics.areEqual(this.IAuthTabCallbackDefault, getnetwork.IAuthTabCallbackDefault)) {
                return true;
            }
            int i10 = IAuthTabCallbackStubProxy + 77;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = IAuthTabCallbackStubProxy + 67;
        int i13 = i12 % 128;
        access100 = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 63;
        IAuthTabCallbackStubProxy = i15 % 128;
        if (i15 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iIAuthTabCallbackStub = setUseCaseAttached.IAuthTabCallbackStub(this.asBinder);
        int iHashCode3 = Integer.hashCode(this.onTransact);
        int iHashCode4 = Integer.hashCode(this.onExtraCallbackWithResult);
        int iHashCode5 = this.IAuthTabCallback.hashCode();
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release = this.onExtraCallback;
        int iHashCode6 = 1;
        int iHashCode7 = 0;
        if (getfuturework_runtime_ktx_release == null) {
            int i2 = IAuthTabCallbackStubProxy + 49;
            access100 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = getfuturework_runtime_ktx_release.hashCode();
        }
        Bitmap bitmap = this.onWarmupCompleted;
        int iHashCode8 = bitmap == null ? 0 : bitmap.hashCode();
        Integer num = this.onNavigationEvent;
        if (num == null) {
            int i3 = IAuthTabCallbackStubProxy + 117;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                iHashCode6 = 0;
            }
        } else {
            iHashCode6 = num.hashCode();
        }
        Integer num2 = this.asInterface;
        if (num2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
            int i4 = IAuthTabCallbackStubProxy + 69;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        handleNativeAdClick.onExtraCallback.asInterface asinterface = this.IAuthTabCallbackDefault;
        if (asinterface != null) {
            int i6 = access100 + 123;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                asinterface.hashCode();
                throw null;
            }
            iHashCode7 = asinterface.hashCode();
        }
        return (((((((((((((((iIAuthTabCallbackStub * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScaleTransitionVisualTarget(positionInWindow=" + setUseCaseAttached.IAuthTabCallbackDefault(this.asBinder) + ", width=" + this.onTransact + ", height=" + this.onExtraCallbackWithResult + ", iconViewFactory=" + this.IAuthTabCallback + ", imageTarget=" + this.onExtraCallback + ", fallbackBitmap=" + this.onWarmupCompleted + ", iconContainerBackgroundColor=" + this.onNavigationEvent + ", radius=" + this.asInterface + ", squircle=" + this.IAuthTabCallbackDefault + ")";
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private getNetwork(long j, int i, int i2, getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, Bitmap bitmap, Integer num, Integer num2, handleNativeAdClick.onExtraCallback.asInterface asinterface) {
        Intrinsics.checkNotNullParameter(getjobwork_runtime_ktx_release, "");
        this.asBinder = j;
        this.onTransact = i;
        this.onExtraCallbackWithResult = i2;
        this.IAuthTabCallback = getjobwork_runtime_ktx_release;
        this.onExtraCallback = getfuturework_runtime_ktx_release;
        this.onWarmupCompleted = bitmap;
        this.onNavigationEvent = num;
        this.asInterface = num2;
        this.IAuthTabCallbackDefault = asinterface;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getNetwork(long j, int i, int i2, getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, Bitmap bitmap, Integer num, Integer num2, handleNativeAdClick.onExtraCallback.asInterface asinterface, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Bitmap bitmap2;
        Integer num3;
        Integer num4;
        handleNativeAdClick.onExtraCallback.asInterface asinterface2;
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release2 = (i3 & 16) != 0 ? null : getfuturework_runtime_ktx_release;
        if ((i3 & 32) != 0) {
            int i4 = IAuthTabCallbackStubProxy + 1;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            bitmap2 = null;
        } else {
            bitmap2 = bitmap;
        }
        if ((i3 & 64) != 0) {
            int i6 = IAuthTabCallbackStubProxy + 77;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i3 & 128) != 0) {
            int i8 = IAuthTabCallbackStubProxy + 91;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i3 & 256) != 0) {
            int i10 = IAuthTabCallbackStubProxy + 61;
            access100 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 10 / 0;
            }
            int i12 = 2 % 2;
            asinterface2 = null;
        } else {
            asinterface2 = asinterface;
        }
        this(j, i, i2, getjobwork_runtime_ktx_release, getfuturework_runtime_ktx_release2, bitmap2, num3, num4, asinterface2, null);
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onTransact;
        if (i3 != 0) {
            int i5 = 22 / 0;
        }
        return i4;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 39;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final getJobwork_runtime_ktx_release IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release = this.IAuthTabCallback;
        int i5 = i3 + 21;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return getjobwork_runtime_ktx_release;
    }

    public final getFuturework_runtime_ktx_release onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release = this.onExtraCallback;
        int i5 = i3 + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return getfuturework_runtime_ktx_release;
    }

    public final Bitmap onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = this.onWarmupCompleted;
        int i5 = i2 + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return bitmap;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Integer num = this.onNavigationEvent;
        int i5 = i3 + 67;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.asInterface;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return num;
    }

    public final handleNativeAdClick.onExtraCallback.asInterface asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ getNetwork onWarmupCompleted(onExtraCallback onextracallback, int i, int i2, int i3, int i4, getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, Bitmap bitmap, Integer num, Integer num2, handleNativeAdClick.onExtraCallback.asInterface asinterface, int i5, Object obj) {
            Integer num3;
            int i6 = 2 % 2;
            int i7 = onNavigationEvent;
            int i8 = i7 + 29;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release2 = (i5 & 32) != 0 ? null : getfuturework_runtime_ktx_release;
            Bitmap bitmap2 = (i5 & 64) != 0 ? null : bitmap;
            if ((i5 & 128) != 0) {
                int i10 = i7 + 9;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                num3 = null;
            } else {
                num3 = num;
            }
            return onextracallback.onWarmupCompleted(i, i2, i3, i4, getjobwork_runtime_ktx_release, getfuturework_runtime_ktx_release2, bitmap2, num3, (i5 & 256) != 0 ? null : num2, (i5 & 512) != 0 ? null : asinterface);
        }

        public final getNetwork onWarmupCompleted(int i, int i2, int i3, int i4, @NotNull getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, @Nullable getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, @Nullable Bitmap bitmap, @Nullable Integer num, @Nullable Integer num2, @Nullable handleNativeAdClick.onExtraCallback.asInterface asinterface) {
            int i5 = 2 % 2;
            Intrinsics.checkNotNullParameter(getjobwork_runtime_ktx_release, "");
            getNetwork getnetwork = new getNetwork(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(i2) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)), i3, i4, getjobwork_runtime_ktx_release, getfuturework_runtime_ktx_release, bitmap, num, num2, asinterface, null);
            int i6 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return getnetwork;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
