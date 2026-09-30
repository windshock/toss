package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setVideoView implements AppLovinNativeAdImplExternalSyntheticLambda5 {
    private static int asBinder = 1;
    private static int onTransact;
    private final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback;
    private final O0 IAuthTabCallbackDefault;
    private final long onExtraCallback;
    private final AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.values().length];
            try {
                iArr[AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Medium.ordinal()] = 2;
                int i = IAuthTabCallback + 63;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Tiny.ordinal()] = 4;
                int i4 = IAuthTabCallback + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 4;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public /* synthetic */ setVideoView(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdanm9dm2eewl4vrptnjmesfjqky4, j, onnavigationevent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private setVideoView(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        int i;
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        this.onExtraCallbackWithResult = onnavigationevent;
        this.IAuthTabCallbackDefault = R0.onExtraCallback().onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j) * r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent());
        if (onnavigationevent == null) {
            i = -1;
        } else {
            i = onWarmupCompleted.onExtraCallbackWithResult[onnavigationevent.ordinal()];
            int i2 = asBinder + 83;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if (i != -1) {
            int i4 = onTransact + 93;
            int i5 = i4 % 128;
            asBinder = i5;
            if (i4 % 2 != 0 ? i == 1 : i == 1) {
                fIAuthTabCallback = formatFromString.onExtraCallbackWithResult.onNavigationEvent();
            } else if (i != 2) {
                int i6 = i5 + 43;
                int i7 = i6 % 128;
                onTransact = i7;
                int i8 = i6 % 2;
                if (i != 3) {
                    int i9 = i7 + 7;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i11 = i7 + 1;
                    asBinder = i11 % 128;
                    if (i11 % 2 == 0) {
                        formatFromString.onExtraCallbackWithResult.onExtraCallbackWithResult();
                        throw null;
                    }
                    fIAuthTabCallback = formatFromString.onExtraCallbackWithResult.onExtraCallbackWithResult();
                } else {
                    fIAuthTabCallback = formatFromString.onExtraCallbackWithResult.IAuthTabCallback();
                }
            } else {
                fIAuthTabCallback = formatFromString.onExtraCallbackWithResult.onExtraCallback();
            }
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i12 = 2 % 2;
        }
        this.onNavigationEvent = fIAuthTabCallback;
        if (onnavigationevent != null) {
            fIAuthTabCallback2 = AppLovinAdSize.onWarmupCompleted.IAuthTabCallback();
        } else {
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r7.onNavigationEvent());
            int i13 = 2 % 2;
        }
        this.onWarmupCompleted = fIAuthTabCallback2;
        this.IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r7.onExtraCallbackWithResult()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r7.IAuthTabCallback()));
        this.onExtraCallback = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setVideoView(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = asBinder + 23;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            onnavigationevent = null;
        }
        this(r8lambdanm9dm2eewl4vrptnjmesfjqky4, j, onnavigationevent, null);
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = this.onNavigationEvent;
        int i4 = i2 + 37;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return f;
    }

    @Override // o.AppLovinNativeAdImplExternalSyntheticLambda5
    public float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    @Override // o.AppLovinNativeAdImplExternalSyntheticLambda5
    public DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.IAuthTabCallback;
        int i5 = i3 + 93;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return deviceQuirksExternalSyntheticLambda0;
    }

    @Override // o.AppLovinNativeAdImplExternalSyntheticLambda5
    public long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }
}
