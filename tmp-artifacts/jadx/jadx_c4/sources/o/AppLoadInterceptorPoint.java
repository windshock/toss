package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AppLoadInterceptorPoint {
    public /* synthetic */ AppLoadInterceptorPoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppLoadInterceptorPoint() {
    }

    public static final class onExtraCallbackWithResult extends AppLoadInterceptorPoint {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final long IAuthTabCallback;
        private final enableContextFromLogger onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i4 = onExtraCallbackWithResult + 85;
                onExtraCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return this.IAuthTabCallback == onextracallbackwithresult.IAuthTabCallback;
            }
            int i5 = onExtraCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 53;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            enableContextFromLogger enablecontextfromlogger = this.onNavigationEvent;
            if (enablecontextfromlogger == null) {
                int i6 = i4 + 81;
                onExtraCallbackWithResult = i6 % 128;
                i = i6 % 2 != 0 ? 1 : 0;
            } else {
                int iHashCode = enablecontextfromlogger.hashCode();
                int i7 = onExtraCallback + 123;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i = iHashCode;
            }
            return (i * 31) + Long.hashCode(this.IAuthTabCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NextQuiz(quiz=" + this.onNavigationEvent + ", rewardPoint=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@Nullable enableContextFromLogger enablecontextfromlogger, long j) {
            super(null);
            this.onNavigationEvent = enablecontextfromlogger;
            this.IAuthTabCallback = j;
        }
    }

    public static final class IAuthTabCallback extends AppLoadInterceptorPoint {
        private static int onExtraCallbackWithResult = 1;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback() {
            super(null);
        }
    }

    public static final class onNavigationEvent extends AppLoadInterceptorPoint {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 27;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 88 / 0;
            }
        }

        private onNavigationEvent() {
            super(null);
        }
    }
}
