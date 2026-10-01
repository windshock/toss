package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda6 {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Long onNavigationEvent;
    private final Long onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 27;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.q4ExternalSyntheticLambda6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = (o.q4ExternalSyntheticLambda6) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r6 = o.q4ExternalSyntheticLambda6.asBinder + 25;
        o.q4ExternalSyntheticLambda6.IAuthTabCallbackDefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r6 = o.q4ExternalSyntheticLambda6.IAuthTabCallbackDefault + 15;
        o.q4ExternalSyntheticLambda6.asBinder = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 13;
        asBinder = i3 % 128;
        int i4 = 1;
        if (i3 % 2 != 0) {
            iHashCode = this.onExtraCallback.hashCode();
            str = this.onExtraCallbackWithResult;
            if (str == null) {
                iHashCode2 = 1;
                i = IAuthTabCallbackDefault + 125;
                asBinder = i % 128;
                if (i % 2 == 0) {
                    i4 = 0;
                }
            }
            int iHashCode3 = str.hashCode();
            iHashCode2 = i4;
            i4 = iHashCode3;
        } else {
            iHashCode = this.onExtraCallback.hashCode();
            str = this.onExtraCallbackWithResult;
            if (str == null) {
                iHashCode2 = 0;
                i = IAuthTabCallbackDefault + 125;
                asBinder = i % 128;
                if (i % 2 == 0) {
                }
            } else {
                i4 = 0;
                int iHashCode32 = str.hashCode();
                iHashCode2 = i4;
                i4 = iHashCode32;
            }
        }
        Long l = this.onNavigationEvent;
        int iHashCode4 = l != null ? l.hashCode() : 0;
        Long l2 = this.onWarmupCompleted;
        if (l2 != null) {
            int i5 = IAuthTabCallbackDefault + 75;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                l2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = l2.hashCode();
        }
        return (((((iHashCode * 31) + i4) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringMetric(step=" + this.onExtraCallback + ", value=" + this.onExtraCallbackWithResult + ", startTime=" + this.onNavigationEvent + ", endTime=" + this.onWarmupCompleted + ")";
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public q4ExternalSyntheticLambda6(@NotNull String str, @Nullable String str2, @Nullable Long l, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onNavigationEvent = l;
        this.onWarmupCompleted = l2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q4ExternalSyntheticLambda6(String str, String str2, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackDefault + 69;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            l = null;
        }
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallbackDefault + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l2 = null;
        }
        this(str, str2, l, l2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 41;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Long l = this.onNavigationEvent;
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        throw null;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Long l = this.onWarmupCompleted;
        int i4 = i3 + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ q4ExternalSyntheticLambda6 onWarmupCompleted(IAuthTabCallback iAuthTabCallback, String str, long j, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 2) != 0) {
                j = 1;
            }
            q4ExternalSyntheticLambda6 q4externalsyntheticlambda6OnWarmupCompleted = iAuthTabCallback.onWarmupCompleted(str, j);
            int i5 = onWarmupCompleted + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return q4externalsyntheticlambda6OnWarmupCompleted;
        }

        public final q4ExternalSyntheticLambda6 onWarmupCompleted(@NotNull String str, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            q4ExternalSyntheticLambda6 q4externalsyntheticlambda6 = new q4ExternalSyntheticLambda6(str, String.valueOf(j), null, null, 12, null);
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return q4externalsyntheticlambda6;
        }

        public final q4ExternalSyntheticLambda6 onExtraCallback(@NotNull String str, @NotNull Number number) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(number, "");
            q4ExternalSyntheticLambda6 q4externalsyntheticlambda6 = new q4ExternalSyntheticLambda6(str, number.toString(), null, null, 12, null);
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return q4externalsyntheticlambda6;
        }
    }
}
