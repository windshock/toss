package o;

import com.facebook.react.ReactInstanceManager;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MaxFullscreenAdImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class hExternalSyntheticLambda15 {
    public /* synthetic */ hExternalSyntheticLambda15(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private hExternalSyntheticLambda15() {
    }

    public static final class onExtraCallbackWithResult extends hExternalSyntheticLambda15 {
        private static int asBinder = 1;
        private static int asInterface;
        private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallback;
        private final MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallback;
        private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onExtraCallbackWithResult;
        private final MaxFullscreenAdImpl.onExtraCallbackWithResult onNavigationEvent;
        private final ReactInstanceManager onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 69;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                int i4 = asInterface + 61;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult)) {
                return !(Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) ^ true) && Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback);
            }
            int i6 = asBinder + 39;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asBinder + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            int iHashCode3 = 0;
            if (onextracallbackwithresult == null) {
                iHashCode = 0;
            } else {
                iHashCode = onextracallbackwithresult.hashCode();
                int i4 = asBinder + 71;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
            MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2 = this.onNavigationEvent;
            if (onextracallbackwithresult2 != null) {
                int i6 = asBinder + 67;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    onextracallbackwithresult2.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode3 = onextracallbackwithresult2.hashCode();
            }
            return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Fetched(reactInstanceManager=" + this.onWarmupCompleted + ", sharedBundleState=" + this.onExtraCallback + ", sharedBundleInfo=" + this.onExtraCallbackWithResult + ", serviceBundleState=" + this.onNavigationEvent + ", serviceBundleInfo=" + this.IAuthTabCallback + ")";
            int i2 = asBinder + 11;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull ReactInstanceManager reactInstanceManager, @Nullable MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult, @NotNull r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, @Nullable MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2, @NotNull r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2) {
            super(null);
            Intrinsics.checkNotNullParameter(reactInstanceManager, "");
            Intrinsics.checkNotNullParameter(r8lambdadtqrzfihm2ghoddvkfg5vm2yos, "");
            Intrinsics.checkNotNullParameter(r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, "");
            this.onWarmupCompleted = reactInstanceManager;
            this.onExtraCallback = onextracallbackwithresult;
            this.onExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
            this.onNavigationEvent = onextracallbackwithresult2;
            this.IAuthTabCallback = r8lambdadtqrzfihm2ghoddvkfg5vm2yos2;
        }

        public final ReactInstanceManager onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 41;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final MaxFullscreenAdImpl.onExtraCallbackWithResult onWarmupCompleted() {
            MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            int i2 = asBinder + 13;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                onextracallbackwithresult = this.onExtraCallback;
                int i4 = 97 / 0;
            } else {
                onextracallbackwithresult = this.onExtraCallback;
            }
            int i5 = i3 + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        public final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 15;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = this.onExtraCallbackWithResult;
            int i5 = i3 + 37;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        }

        public final MaxFullscreenAdImpl.onExtraCallbackWithResult onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 19;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            return onextracallbackwithresult;
        }

        public final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 97;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = this.IAuthTabCallback;
            int i4 = i3 + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        }
    }

    public static final class onNavigationEvent extends hExternalSyntheticLambda15 {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final ReactInstanceManager onExtraCallback;
        private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                int i4 = onWarmupCompleted + 69;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                return true;
            }
            int i6 = onWarmupCompleted;
            int i7 = i6 + 69;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 17;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MetroConnected(reactInstanceManager=" + this.onExtraCallback + ", serviceBundleInfo=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull ReactInstanceManager reactInstanceManager, @NotNull r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos) {
            super(null);
            Intrinsics.checkNotNullParameter(reactInstanceManager, "");
            Intrinsics.checkNotNullParameter(r8lambdadtqrzfihm2ghoddvkfg5vm2yos, "");
            this.onExtraCallback = reactInstanceManager;
            this.onNavigationEvent = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        }

        public final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = this.onNavigationEvent;
            int i5 = i2 + 29;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        }

        public final ReactInstanceManager onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ReactInstanceManager reactInstanceManager = this.onExtraCallback;
            int i5 = i2 + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return reactInstanceManager;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback extends hExternalSyntheticLambda15 {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final Throwable onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallback) obj).onExtraCallbackWithResult);
            }
            int i6 = i3 + 23;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(throwable=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallbackWithResult = th;
        }

        public final Throwable onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 117;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            Throwable th = this.onExtraCallbackWithResult;
            int i4 = i2 + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return th;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted extends hExternalSyntheticLambda15 {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = i3 + 21;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, ((onWarmupCompleted) obj).onWarmupCompleted)) {
                return true;
            }
            int i5 = onExtraCallback + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "IncorrectVersion(reason=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final String onExtraCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 91;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.onWarmupCompleted;
                int i4 = 35 / 0;
            } else {
                str = this.onWarmupCompleted;
            }
            int i5 = i2 + 13;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
