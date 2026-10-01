package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@liq(onNavigationEvent = getBrickNativeValue.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class jni_YGNodeStyleGetPositionTypeJNI {
    private static final onWarmupCompleted CENTURY;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final onNavigationEvent DAY;
    private static final onExtraCallbackWithResult HOUR;
    private static final onExtraCallbackWithResult MICROSECOND;
    private static final onExtraCallbackWithResult MILLISECOND;
    private static final onExtraCallbackWithResult MINUTE;
    private static final onWarmupCompleted MONTH;
    private static final onExtraCallbackWithResult NANOSECOND;
    private static final onWarmupCompleted QUARTER;
    private static final onExtraCallbackWithResult SECOND;
    private static final onNavigationEvent WEEK;
    private static final onWarmupCompleted YEAR;

    public /* synthetic */ jni_YGNodeStyleGetPositionTypeJNI(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private jni_YGNodeStyleGetPositionTypeJNI() {
    }

    @liq(onNavigationEvent = dfk.class)
    public static final class onExtraCallbackWithResult extends jni_YGNodeStyleGetPositionTypeJNI {
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        private final long nanoseconds;
        private final String unitName;
        private final long unitScale;

        public static final class onWarmupCompleted {
            private onWarmupCompleted() {
            }

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<onExtraCallbackWithResult> serializer() {
                return dfk.onNavigationEvent;
            }
        }

        public final long onNavigationEvent() {
            return this.nanoseconds;
        }

        public onExtraCallbackWithResult(long j) {
            super(null);
            this.nanoseconds = j;
            if (j <= 0) {
                throw new IllegalArgumentException(("Unit duration must be positive, but was " + j + " ns.").toString());
            }
            if (j % 3600000000000L == 0) {
                this.unitName = "HOUR";
                this.unitScale = j / 3600000000000L;
                return;
            }
            if (j % 60000000000L == 0) {
                this.unitName = "MINUTE";
                this.unitScale = j / 60000000000L;
                return;
            }
            if (j % 1000000000 == 0) {
                this.unitName = "SECOND";
                this.unitScale = j / 1000000000;
            } else if (j % 1000000 == 0) {
                this.unitName = "MILLISECOND";
                this.unitScale = j / 1000000;
            } else if (j % 1000 == 0) {
                this.unitName = "MICROSECOND";
                this.unitScale = j / 1000;
            } else {
                this.unitName = "NANOSECOND";
                this.unitScale = j;
            }
        }

        public onExtraCallbackWithResult onNavigationEvent(int i) {
            return new onExtraCallbackWithResult(jw12.onNavigationEvent(this.nanoseconds, i));
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof onExtraCallbackWithResult) && this.nanoseconds == ((onExtraCallbackWithResult) obj).nanoseconds;
            }
            return true;
        }

        public int hashCode() {
            long j = this.nanoseconds;
            return ((int) (j >> 32)) ^ ((int) j);
        }

        public String toString() {
            return onExtraCallbackWithResult(this.unitScale, this.unitName);
        }
    }

    @liq(onNavigationEvent = getShineValue.class)
    public static abstract class onExtraCallback extends jni_YGNodeStyleGetPositionTypeJNI {
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onExtraCallbackWithResult {
            private onExtraCallbackWithResult() {
            }

            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<onExtraCallback> serializer() {
                return getShineValue.onNavigationEvent;
            }
        }

        private onExtraCallback() {
            super(null);
        }
    }

    @liq(onNavigationEvent = djycx1.class)
    public static final class onNavigationEvent extends onExtraCallback {
        public static final C0034onNavigationEvent Companion = new C0034onNavigationEvent(null);
        private final int days;

        /* renamed from: o.jni_YGNodeStyleGetPositionTypeJNI$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0034onNavigationEvent {
            private C0034onNavigationEvent() {
            }

            public /* synthetic */ C0034onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<onNavigationEvent> serializer() {
                return djycx1.onExtraCallbackWithResult;
            }
        }

        public final int IAuthTabCallback() {
            return this.days;
        }

        public onNavigationEvent(int i) {
            super(null);
            this.days = i;
            if (i > 0) {
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + i + " days.").toString());
        }

        public onNavigationEvent onExtraCallback(int i) {
            return new onNavigationEvent(jw12.onNavigationEvent(this.days, i));
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof onNavigationEvent) && this.days == ((onNavigationEvent) obj).days;
            }
            return true;
        }

        public int hashCode() {
            return this.days ^ Imgproc.FLOODFILL_FIXED_RANGE;
        }

        public String toString() {
            int i = this.days;
            if (i % 7 == 0) {
                return onWarmupCompleted(i / 7, "WEEK");
            }
            return onWarmupCompleted(i, "DAY");
        }
    }

    @liq(onNavigationEvent = cu.class)
    public static final class onWarmupCompleted extends onExtraCallback {
        public static final C0035onWarmupCompleted Companion = new C0035onWarmupCompleted(null);
        private final int months;

        /* renamed from: o.jni_YGNodeStyleGetPositionTypeJNI$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0035onWarmupCompleted {
            private C0035onWarmupCompleted() {
            }

            public /* synthetic */ C0035onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<onWarmupCompleted> serializer() {
                return cu.onExtraCallbackWithResult;
            }
        }

        public final int onWarmupCompleted() {
            return this.months;
        }

        public onWarmupCompleted(int i) {
            super(null);
            this.months = i;
            if (i > 0) {
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + i + " months.").toString());
        }

        public onWarmupCompleted onExtraCallbackWithResult(int i) {
            return new onWarmupCompleted(jw12.onNavigationEvent(this.months, i));
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof onWarmupCompleted) && this.months == ((onWarmupCompleted) obj).months;
            }
            return true;
        }

        public int hashCode() {
            return this.months ^ Imgproc.FLOODFILL_MASK_ONLY;
        }

        public String toString() {
            int i = this.months;
            return i % 1200 == 0 ? onWarmupCompleted(i / 1200, "CENTURY") : i % 12 == 0 ? onWarmupCompleted(i / 12, "YEAR") : i % 3 == 0 ? onWarmupCompleted(i / 3, "QUARTER") : onWarmupCompleted(i, "MONTH");
        }
    }

    protected final String onWarmupCompleted(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }

    protected final String onExtraCallbackWithResult(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final KSerializer<jni_YGNodeStyleGetPositionTypeJNI> serializer() {
            return getBrickNativeValue.IAuthTabCallback;
        }

        public final onNavigationEvent onNavigationEvent() {
            return jni_YGNodeStyleGetPositionTypeJNI.DAY;
        }
    }

    static {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(1L);
        NANOSECOND = onextracallbackwithresult;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallbackwithresult.onNavigationEvent(1000);
        MICROSECOND = onextracallbackwithresultOnNavigationEvent;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = onextracallbackwithresultOnNavigationEvent.onNavigationEvent(1000);
        MILLISECOND = onextracallbackwithresultOnNavigationEvent2;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent3 = onextracallbackwithresultOnNavigationEvent2.onNavigationEvent(1000);
        SECOND = onextracallbackwithresultOnNavigationEvent3;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent4 = onextracallbackwithresultOnNavigationEvent3.onNavigationEvent(60);
        MINUTE = onextracallbackwithresultOnNavigationEvent4;
        HOUR = onextracallbackwithresultOnNavigationEvent4.onNavigationEvent(60);
        onNavigationEvent onnavigationevent = new onNavigationEvent(1);
        DAY = onnavigationevent;
        WEEK = onnavigationevent.onExtraCallback(7);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(1);
        MONTH = onwarmupcompleted;
        QUARTER = onwarmupcompleted.onExtraCallbackWithResult(3);
        onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult(12);
        YEAR = onwarmupcompletedOnExtraCallbackWithResult;
        CENTURY = onwarmupcompletedOnExtraCallbackWithResult.onExtraCallbackWithResult(100);
    }
}
