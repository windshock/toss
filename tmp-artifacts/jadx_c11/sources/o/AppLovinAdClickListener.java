package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.rotate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdClickListener extends getTorchStrengthLevel {
    public static final onExtraCallbackWithResult Companion;
    private static final AppLovinAdClickListener IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final AppLovinAdClickListener onExtraCallback;
    private static final AppLovinAdClickListener onExtraCallbackWithResult;
    private static final AppLovinAdClickListener onNavigationEvent;
    private static final AppLovinAdClickListener onWarmupCompleted;

    public /* synthetic */ AppLovinAdClickListener(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public /* synthetic */ AppLovinAdClickListener(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinAdClickListener(@NotNull getSensorRotationDegrees getsensorrotationdegrees, @NotNull getSensorRotationDegrees getsensorrotationdegrees2, @NotNull getSensorRotationDegrees getsensorrotationdegrees3, @NotNull getSensorRotationDegrees getsensorrotationdegrees4) {
        super(getsensorrotationdegrees, getsensorrotationdegrees2, getsensorrotationdegrees3, getsensorrotationdegrees4);
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees, "");
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees2, "");
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees3, "");
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees4, "");
    }

    public static final /* synthetic */ AppLovinAdClickListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        AppLovinAdClickListener appLovinAdClickListener = onExtraCallback;
        int i4 = i2 + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return appLovinAdClickListener;
    }

    public static final /* synthetic */ AppLovinAdClickListener asBinder() {
        AppLovinAdClickListener appLovinAdClickListener;
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            appLovinAdClickListener = onNavigationEvent;
            int i4 = 35 / 0;
        } else {
            appLovinAdClickListener = onNavigationEvent;
        }
        int i5 = i3 + 83;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinAdClickListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AppLovinAdClickListener asInterface() {
        AppLovinAdClickListener appLovinAdClickListener;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            appLovinAdClickListener = onExtraCallbackWithResult;
            int i4 = 71 / 0;
        } else {
            appLovinAdClickListener = onExtraCallbackWithResult;
        }
        int i5 = i2 + 41;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinAdClickListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AppLovinAdClickListener onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 85;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AppLovinAdClickListener appLovinAdClickListener = IAuthTabCallback;
        int i4 = i2 + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinAdClickListener;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppLovinAdClickListener(@NotNull getSensorRotationDegrees getsensorrotationdegrees) {
        this(getsensorrotationdegrees, getsensorrotationdegrees, getsensorrotationdegrees, getsensorrotationdegrees);
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees, "");
    }

    private AppLovinAdClickListener(float f) {
        this(getZoomState.IAuthTabCallback(f));
    }

    private AppLovinAdClickListener(float f, float f2, float f3, float f4) {
        this(getZoomState.IAuthTabCallback(f), getZoomState.IAuthTabCallback(f2), getZoomState.IAuthTabCallback(f3), getZoomState.IAuthTabCallback(f4));
    }

    public rotate onExtraCallback(long j, float f, float f2, float f3, float f4, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        if (f + f2 + f3 + f4 == 0.0f) {
            return new rotate.onWarmupCompleted(UseCaseAttachStateExternalSyntheticLambda2.onWarmupCompleted(j));
        }
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        if (f2 > 0.0f) {
            removetimestampOnWarmupCompleted.onWarmupCompleted(fIntBitsToFloat - f2, 0.0f);
            removetimestampOnWarmupCompleted.onExtraCallback(fIntBitsToFloat, 0.0f, fIntBitsToFloat, f2);
        } else {
            removetimestampOnWarmupCompleted.onWarmupCompleted(fIntBitsToFloat, 0.0f);
        }
        if (f3 > 0.0f) {
            removetimestampOnWarmupCompleted.onNavigationEvent(fIntBitsToFloat, fIntBitsToFloat2 - f3);
            removetimestampOnWarmupCompleted.onExtraCallback(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat - f3, fIntBitsToFloat2);
        } else {
            removetimestampOnWarmupCompleted.onNavigationEvent(fIntBitsToFloat, fIntBitsToFloat2);
        }
        if (f4 > 0.0f) {
            int i2 = asBinder + 75;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                removetimestampOnWarmupCompleted.onNavigationEvent(f4, fIntBitsToFloat2);
                removetimestampOnWarmupCompleted.onExtraCallback(2.0f, fIntBitsToFloat2, 0.0f, fIntBitsToFloat2 % f4);
            } else {
                removetimestampOnWarmupCompleted.onNavigationEvent(f4, fIntBitsToFloat2);
                removetimestampOnWarmupCompleted.onExtraCallback(0.0f, fIntBitsToFloat2, 0.0f, fIntBitsToFloat2 - f4);
            }
        } else {
            removetimestampOnWarmupCompleted.onNavigationEvent(0.0f, fIntBitsToFloat2);
            int i3 = IAuthTabCallbackDefault + 109;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        if (f > 0.0f) {
            removetimestampOnWarmupCompleted.onNavigationEvent(0.0f, f);
            removetimestampOnWarmupCompleted.onExtraCallback(0.0f, 0.0f, f, 0.0f);
        } else {
            removetimestampOnWarmupCompleted.onNavigationEvent(0.0f, 0.0f);
        }
        removetimestampOnWarmupCompleted.onExtraCallback();
        return new rotate.onExtraCallback(removetimestampOnWarmupCompleted);
    }

    public getTorchStrengthLevel onExtraCallbackWithResult(@NotNull getSensorRotationDegrees getsensorrotationdegrees, @NotNull getSensorRotationDegrees getsensorrotationdegrees2, @NotNull getSensorRotationDegrees getsensorrotationdegrees3, @NotNull getSensorRotationDegrees getsensorrotationdegrees4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees, "");
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees2, "");
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees3, "");
        Intrinsics.checkNotNullParameter(getsensorrotationdegrees4, "");
        AppLovinAdClickListener appLovinAdClickListener = new AppLovinAdClickListener(getsensorrotationdegrees, getsensorrotationdegrees2, getsensorrotationdegrees3, getsensorrotationdegrees4);
        int i2 = asBinder + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinAdClickListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 81;
            IAuthTabCallbackDefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof AppLovinAdClickListener)) {
            return false;
        }
        AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) obj;
        if (!Intrinsics.areEqual(onExtraCallback(), appLovinAdClickListener.onExtraCallback()) || !Intrinsics.areEqual(onNavigationEvent(), appLovinAdClickListener.onNavigationEvent())) {
            return false;
        }
        if (Intrinsics.areEqual(IAuthTabCallback(), appLovinAdClickListener.IAuthTabCallback())) {
            return Intrinsics.areEqual(onWarmupCompleted(), appLovinAdClickListener.onWarmupCompleted());
        }
        int i3 = asBinder + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iHashCode = onExtraCallback().hashCode();
            return (((((iHashCode % 116) / onNavigationEvent().hashCode()) + 122) >>> IAuthTabCallback().hashCode()) % 51) % onWarmupCompleted().hashCode();
        }
        int iHashCode2 = onExtraCallback().hashCode();
        return (((((iHashCode2 * 31) + onNavigationEvent().hashCode()) * 31) + IAuthTabCallback().hashCode()) * 31) + onWarmupCompleted().hashCode();
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final AppLovinAdClickListener onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return AppLovinAdClickListener.asBinder();
            }
            AppLovinAdClickListener.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AppLovinAdClickListener onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return AppLovinAdClickListener.onExtraCallbackWithResult();
            }
            AppLovinAdClickListener.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AppLovinAdClickListener IAuthTabCallback() {
            AppLovinAdClickListener appLovinAdClickListenerAsInterface;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                appLovinAdClickListenerAsInterface = AppLovinAdClickListener.asInterface();
                int i3 = 37 / 0;
            } else {
                appLovinAdClickListenerAsInterface = AppLovinAdClickListener.asInterface();
            }
            int i4 = onExtraCallbackWithResult + 65;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return appLovinAdClickListenerAsInterface;
            }
            throw null;
        }

        public final AppLovinAdClickListener onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AppLovinAdClickListener appLovinAdClickListenerIAuthTabCallbackStub = AppLovinAdClickListener.IAuthTabCallbackStub();
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            return appLovinAdClickListenerIAuthTabCallbackStub;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        onNavigationEvent = new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), defaultConstructorMarker);
        IAuthTabCallback = new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), defaultConstructorMarker);
        onWarmupCompleted = new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f), defaultConstructorMarker);
        onExtraCallbackWithResult = new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), defaultConstructorMarker);
        onExtraCallback = new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), defaultConstructorMarker);
        int i = asInterface + 111;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
    }
}
