package o;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResetTrackState {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;
    private final Function0<Long> onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final ConcurrentHashMap<String, onExtraCallback> onWarmupCompleted;

    static {
        int i = onTransact + 19;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public ResetTrackState() {
        this(0L, 0L, null, 7, null);
    }

    public ResetTrackState(long j, long j2, @NotNull Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = j2;
        this.onExtraCallback = function0;
        this.onWarmupCompleted = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResetTrackState(long j, long j2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            j = 60000;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            int i3 = asBinder + 49;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            j2 = 1800000;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            int i6 = IAuthTabCallbackStub + 15;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            function0 = AnonymousClass1.onExtraCallback;
            int i8 = 2 % 2;
        }
        this(j3, j4, function0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ResetTrackState$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Long> {
        private static int IAuthTabCallback = 1;
        public static final AnonymousClass1 onExtraCallback = new AnonymousClass1();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 3;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        AnonymousClass1() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        public final Long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Long.valueOf(SystemClock.elapsedRealtime());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
            int i3 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return lValueOf;
        }

        public /* synthetic */ Object invoke() {
            Long lIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                lIAuthTabCallback = IAuthTabCallback();
                int i3 = 19 / 0;
            } else {
                lIAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return lIAuthTabCallback;
        }
    }

    static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final int onExtraCallback;
        private final long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 53;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 41;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.onWarmupCompleted != onextracallback.onWarmupCompleted) {
                return false;
            }
            if (this.onExtraCallback == onextracallback.onExtraCallback) {
                return true;
            }
            int i8 = i4 + 17;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0 ? (Long.hashCode(this.onWarmupCompleted) % 33) / Integer.hashCode(this.onExtraCallback) : (Long.hashCode(this.onWarmupCompleted) * 31) + Integer.hashCode(this.onExtraCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "State(untilMs=" + this.onWarmupCompleted + ", consecutiveFailures=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(long j, int i) {
            this.onWarmupCompleted = j;
            this.onExtraCallback = i;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            long j = this.onWarmupCompleted;
            int i5 = i2 + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.onExtraCallback;
            int i5 = i2 + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }
    }

    public final boolean onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.get(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback onextracallback = this.onWarmupCompleted.get(str);
        if (onextracallback == null) {
            return false;
        }
        if (((Number) this.onExtraCallback.invoke()).longValue() < onextracallback.onNavigationEvent()) {
            return true;
        }
        int i3 = asBinder + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
      0x002f: PHI (r1v7 o.ResetTrackState$onExtraCallback) = (r1v6 o.ResetTrackState$onExtraCallback), (r1v14 o.ResetTrackState$onExtraCallback) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IAuthTabCallback IAuthTabCallback(@NotNull String str) {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStub = i2 % 128;
        int iOnWarmupCompleted = 0;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onextracallback = this.onWarmupCompleted.get(str);
            int i3 = 21 / 0;
            if (onextracallback != null) {
                int i4 = asBinder + 69;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                iOnWarmupCompleted = onextracallback.onWarmupCompleted();
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onextracallback = this.onWarmupCompleted.get(str);
            if (onextracallback != null) {
            }
        }
        int i6 = iOnWarmupCompleted + 1;
        long jCoerceAtMost = RangesKt.coerceAtMost(this.onNavigationEvent << RangesKt.coerceAtMost(iOnWarmupCompleted, 5), this.onExtraCallbackWithResult);
        this.onWarmupCompleted.put(str, new onExtraCallback(((Number) this.onExtraCallback.invoke()).longValue() + jCoerceAtMost, i6));
        return new IAuthTabCallback(jCoerceAtMost, i6);
    }

    public final Integer onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.remove(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback onextracallbackRemove = this.onWarmupCompleted.remove(str);
        if (onextracallbackRemove == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(onextracallbackRemove.onWarmupCompleted());
        int i3 = asBinder + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return numValueOf;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final int onExtraCallback;
        private final long onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 11;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = i2 + 123;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onExtraCallbackWithResult != iAuthTabCallback.onExtraCallbackWithResult) {
                return false;
            }
            if (this.onExtraCallback == iAuthTabCallback.onExtraCallback) {
                return true;
            }
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (Long.hashCode(this.onExtraCallbackWithResult) >> 55) - Integer.hashCode(this.onExtraCallback) : (Long.hashCode(this.onExtraCallbackWithResult) * 31) + Integer.hashCode(this.onExtraCallback);
            int i3 = onNavigationEvent + 37;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Registered(durationMs=" + this.onExtraCallbackWithResult + ", consecutiveFailures=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(long j, int i) {
            this.onExtraCallbackWithResult = j;
            this.onExtraCallback = i;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.onExtraCallback;
            int i5 = i2 + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            int i3 = 48 / 0;
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
