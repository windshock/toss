package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_hostnameVerifier {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Function1<onExtraCallback, Double> IAuthTabCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public deprecated_hostnameVerifier(@NotNull Function1<? super onExtraCallback, Double> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = function1;
    }

    public final onExtraCallback onExtraCallbackWithResult(@NotNull onExtraCallback onextracallback, double d) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onExtraCallbackWithResult onExtraCallbackWithResult2 = onExtraCallbackWithResult(onextracallback);
        double d2 = 0.5d * d;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent(onextracallback, d2, onExtraCallbackWithResult2);
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = onNavigationEvent(onextracallback, d2, onextracallbackwithresultOnNavigationEvent);
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent3 = onNavigationEvent(onextracallback, d, onextracallbackwithresultOnNavigationEvent2);
        double dOnNavigationEvent = onExtraCallbackWithResult2.onNavigationEvent();
        double dOnNavigationEvent2 = onextracallbackwithresultOnNavigationEvent.onNavigationEvent();
        double dOnNavigationEvent3 = onextracallbackwithresultOnNavigationEvent2.onNavigationEvent();
        double dOnNavigationEvent4 = onextracallbackwithresultOnNavigationEvent3.onNavigationEvent();
        double dOnWarmupCompleted = onExtraCallbackWithResult2.onWarmupCompleted();
        double dOnWarmupCompleted2 = onextracallbackwithresultOnNavigationEvent.onWarmupCompleted();
        double dOnWarmupCompleted3 = onextracallbackwithresultOnNavigationEvent2.onWarmupCompleted();
        double dOnWarmupCompleted4 = onextracallbackwithresultOnNavigationEvent3.onWarmupCompleted();
        onextracallback.onExtraCallback(onextracallback.onExtraCallbackWithResult() + ((dOnNavigationEvent + ((dOnNavigationEvent2 + dOnNavigationEvent3) * 2.0d) + dOnNavigationEvent4) * 0.16666666666666666d * d));
        onextracallback.onWarmupCompleted(onextracallback.onNavigationEvent() + ((dOnWarmupCompleted + ((dOnWarmupCompleted2 + dOnWarmupCompleted3) * 2.0d) + dOnWarmupCompleted4) * 0.16666666666666666d * d));
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    private final onExtraCallbackWithResult onExtraCallbackWithResult(onExtraCallback onextracallback) {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(onextracallback.onNavigationEvent(), ((Number) this.IAuthTabCallback.invoke(onextracallback)).doubleValue());
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    private final onExtraCallbackWithResult onNavigationEvent(onExtraCallback onextracallback, double d, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        onExtraCallback onextracallback2 = new onExtraCallback(onextracallback.onExtraCallbackWithResult() + (onextracallbackwithresult.onNavigationEvent() * d), onextracallback.onNavigationEvent() + (onextracallbackwithresult.onWarmupCompleted() * d));
        onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult(onextracallback2.onNavigationEvent(), ((Number) this.IAuthTabCallback.invoke(onextracallback2)).doubleValue());
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onextracallbackwithresult2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private double onExtraCallback;
        private double onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = onWarmupCompleted + 57;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (Double.compare(this.onExtraCallback, onextracallback.onExtraCallback) != 0) {
                int i5 = IAuthTabCallback + 57;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0;
            }
            if (Double.compare(this.onNavigationEvent, onextracallback.onNavigationEvent) == 0) {
                return true;
            }
            int i6 = IAuthTabCallback + 119;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0 ? (Double.hashCode(this.onExtraCallback) % 115) << Double.hashCode(this.onNavigationEvent) : (Double.hashCode(this.onExtraCallback) * 31) + Double.hashCode(this.onNavigationEvent);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "State(x=" + this.onExtraCallback + ", v=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(double d, double d2) {
            this.onExtraCallback = d;
            this.onNavigationEvent = d2;
        }

        public final void onExtraCallback(double d) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            this.onExtraCallback = d;
            if (i4 != 0) {
                int i5 = 70 / 0;
            }
            int i6 = i3 + 121;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 75 / 0;
            }
        }

        public final double onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            double d = this.onExtraCallback;
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
            return d;
        }

        public final double onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            double d = this.onNavigationEvent;
            int i5 = i3 + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return d;
        }

        public final void onWarmupCompleted(double d) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            this.onNavigationEvent = d;
            if (i4 == 0) {
                int i5 = 18 / 0;
            }
            int i6 = i3 + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final double IAuthTabCallback;
        private final double onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Double.compare(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) != 0) {
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Double.compare(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) == 0) {
                return true;
            }
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (Double.hashCode(this.onExtraCallbackWithResult) % 84) << Double.hashCode(this.IAuthTabCallback) : (Double.hashCode(this.onExtraCallbackWithResult) * 31) + Double.hashCode(this.IAuthTabCallback);
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 7 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Derivative(dx=" + this.onExtraCallbackWithResult + ", dv=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(double d, double d2) {
            this.onExtraCallbackWithResult = d;
            this.IAuthTabCallback = d2;
        }

        public final double onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 33;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            double d = this.onExtraCallbackWithResult;
            int i5 = i2 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return d;
        }

        public final double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            double d = this.IAuthTabCallback;
            int i5 = i2 + 35;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
