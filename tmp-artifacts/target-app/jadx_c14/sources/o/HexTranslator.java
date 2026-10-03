package o;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HexTranslator {
    public static final HexTranslator onWarmupCompleted = new HexTranslator();

    private HexTranslator() {
    }

    public static abstract class onExtraCallbackWithResult {
        private final String onExtraCallback;

        public /* synthetic */ onExtraCallbackWithResult(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof onNavigationEvent);
            }

            public int hashCode() {
                return 1535747583;
            }

            public String toString() {
                return "Available";
            }

            private onNavigationEvent() {
                super("Available", null);
            }
        }

        private onExtraCallbackWithResult(String str) {
            this.onExtraCallback = str;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private final int onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof onExtraCallback) && this.onExtraCallbackWithResult == ((onExtraCallback) obj).onExtraCallbackWithResult;
            }

            public int hashCode() {
                return Integer.hashCode(this.onExtraCallbackWithResult);
            }

            public String toString() {
                return "UserResolvableError(errorCode=" + this.onExtraCallbackWithResult + ")";
            }

            public onExtraCallback(int i) {
                super("UserResolvableError", null);
                this.onExtraCallbackWithResult = i;
            }

            public final int onExtraCallback() {
                return this.onExtraCallbackWithResult;
            }
        }

        /* renamed from: o.HexTranslator$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0002onExtraCallbackWithResult extends onExtraCallbackWithResult {
            public static final C0002onExtraCallbackWithResult onWarmupCompleted = new C0002onExtraCallbackWithResult();

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0002onExtraCallbackWithResult);
            }

            public int hashCode() {
                return -1375470074;
            }

            public String toString() {
                return "Unavailable";
            }

            private C0002onExtraCallbackWithResult() {
                super("Unavailable", null);
            }
        }
    }

    public static final class onNavigationEvent {
        private final boolean IAuthTabCallback;
        private final onExtraCallbackWithResult onNavigationEvent;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) && this.onWarmupCompleted == onnavigationevent.onWarmupCompleted && this.IAuthTabCallback == onnavigationevent.IAuthTabCallback;
        }

        public int hashCode() {
            return (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        }

        public String toString() {
            return "Snapshot(status=" + this.onNavigationEvent + ", resultCode=" + this.onWarmupCompleted + ", packageUsable=" + this.IAuthTabCallback + ")";
        }

        public onNavigationEvent(@NotNull onExtraCallbackWithResult onextracallbackwithresult, int i, boolean z) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onNavigationEvent = onextracallbackwithresult;
            this.onWarmupCompleted = i;
            this.IAuthTabCallback = z;
        }

        public final onExtraCallbackWithResult onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final int onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final boolean onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final boolean onExtraCallbackWithResult() {
            return Intrinsics.areEqual(this.onNavigationEvent, onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent);
        }
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(HexTranslator hexTranslator, Context context, GoogleApiAvailability googleApiAvailability, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return hexTranslator.onWarmupCompleted(context, googleApiAvailability, z);
    }

    public final onExtraCallbackWithResult onWarmupCompleted(@NotNull Context context, @NotNull GoogleApiAvailability googleApiAvailability, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(googleApiAvailability, "");
        onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(context, googleApiAvailability, z);
        if (onnavigationeventIAuthTabCallback.onExtraCallback() != 0) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GoogleApiAvailability", "Google Play Service is not available.", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("resultCode", Integer.valueOf(onnavigationeventIAuthTabCallback.onExtraCallback())), getWrite.IAuthTabCallback("packageUsable", Boolean.valueOf(onnavigationeventIAuthTabCallback.onWarmupCompleted())), getWrite.IAuthTabCallback("status", onnavigationeventIAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult()), getWrite.IAuthTabCallback("allowed", Boolean.valueOf(onnavigationeventIAuthTabCallback.onExtraCallbackWithResult()))}), (String) null, false, (String) null, 56, (Object) null);
        }
        return onnavigationeventIAuthTabCallback.onNavigationEvent();
    }

    public static /* synthetic */ onNavigationEvent onNavigationEvent(HexTranslator hexTranslator, Context context, GoogleApiAvailability googleApiAvailability, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return hexTranslator.IAuthTabCallback(context, googleApiAvailability, z);
    }

    public final onNavigationEvent IAuthTabCallback(@NotNull Context context, @NotNull GoogleApiAvailability googleApiAvailability, boolean z) {
        onExtraCallbackWithResult onextracallback;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(googleApiAvailability, "");
        if (z && zzaj.onNavigationEvent().onActivityLayout() && zzaj.onNavigationEvent().ICustomTabsCallbackStub()) {
            return new onNavigationEvent(onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent, 0, true);
        }
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        if (iIsGooglePlayServicesAvailable == 0) {
            return new onNavigationEvent(onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent, iIsGooglePlayServicesAvailable, true);
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(context);
        if (iIsGooglePlayServicesAvailable == 18 && zOnWarmupCompleted) {
            onextracallback = onExtraCallbackWithResult.onNavigationEvent.onNavigationEvent;
        } else {
            onextracallback = googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable) ? new onExtraCallbackWithResult.onExtraCallback(iIsGooglePlayServicesAvailable) : onExtraCallbackWithResult.C0002onExtraCallbackWithResult.onWarmupCompleted;
        }
        return new onNavigationEvent(onextracallback, iIsGooglePlayServicesAvailable, zOnWarmupCompleted);
    }

    private final boolean onWarmupCompleted(Context context) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).enabled));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj)) {
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }
}
