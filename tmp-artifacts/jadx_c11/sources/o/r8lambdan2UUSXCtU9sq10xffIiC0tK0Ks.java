package o;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks implements r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 {
    private static int asBinder = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final List<onExtraCallback> onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks)) {
            int i2 = asBinder + 53;
            onTransact = i2 % 128;
            return i2 % 2 != 0;
        }
        r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks r8lambdan2uusxctu9sq10xffiic0tk0ks = (r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) obj;
        if (this.onExtraCallbackWithResult != r8lambdan2uusxctu9sq10xffiic0tk0ks.onExtraCallbackWithResult) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, r8lambdan2uusxctu9sq10xffiic0tk0ks.IAuthTabCallback)) {
            int i3 = onTransact;
            int i4 = i3 + 19;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 47;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 69 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, r8lambdan2uusxctu9sq10xffiic0tk0ks.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.onWarmupCompleted, r8lambdan2uusxctu9sq10xffiic0tk0ks.onWarmupCompleted) || !Intrinsics.areEqual(this.onExtraCallback, r8lambdan2uusxctu9sq10xffiic0tk0ks.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, r8lambdan2uusxctu9sq10xffiic0tk0ks.onNavigationEvent)) {
            int i8 = asBinder + 55;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = onTransact + 113;
        asBinder = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 52 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.onExtraCallbackWithResult) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i4 = asBinder + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MetricTracingData(logTime=" + this.onExtraCallbackWithResult + ", tag=" + this.IAuthTabCallback + ", viewName=" + this.IAuthTabCallbackStub + ", sourceType=" + this.onWarmupCompleted + ", metrics=" + this.onExtraCallback + ", additionalParams=" + this.onNavigationEvent + ")";
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return str;
    }

    public r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<onExtraCallback> list, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = str;
        this.IAuthTabCallbackStub = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallback = list;
        this.onNavigationEvent = map;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 111;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i3 + 115;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 123;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            str = this.onWarmupCompleted;
            int i4 = 21 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i3 + 77;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final List<onExtraCallback> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 35;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onNavigationEvent;
        int i5 = i2 + 113;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return map;
    }

    public static final class onExtraCallback {
        private static int asInterface = 1;
        private static int onNavigationEvent;
        private final Long IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final Long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                int i3 = onNavigationEvent + 111;
                asInterface = i3 % 128;
                return i3 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                int i4 = onNavigationEvent + 65;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                return Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback);
            }
            int i6 = onNavigationEvent + 9;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1 r3 r4
          0x0031: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r3v6 java.lang.Long) = (r3v0 java.lang.Long), (r3v8 java.lang.Long) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r4v8 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1 r4
          0x0026: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x0026: PHI (r4v1 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            Long l;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.onExtraCallbackWithResult.hashCode();
                l = this.onWarmupCompleted;
                iHashCode2 = 1;
                if (l == null) {
                    int i3 = asInterface + 47;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = l.hashCode();
                }
            } else {
                iHashCode = this.onExtraCallbackWithResult.hashCode();
                l = this.onWarmupCompleted;
                iHashCode2 = 0;
                if (l == null) {
                }
            }
            Long l2 = this.IAuthTabCallback;
            int iHashCode4 = l2 != null ? l2.hashCode() : 0;
            String str = this.onExtraCallback;
            if (str != null) {
                int i5 = asInterface + 109;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    str.hashCode();
                    throw null;
                }
                iHashCode2 = str.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Metric(step=" + this.onExtraCallbackWithResult + ", startTime=" + this.onWarmupCompleted + ", endTime=" + this.IAuthTabCallback + ", value=" + this.onExtraCallback + ")";
            int i2 = asInterface + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull String str, @Nullable Long l, @Nullable Long l2, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = l;
            this.IAuthTabCallback = l2;
            this.onExtraCallback = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, Long l, Long l2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 2) != 0) {
                int i2 = 2 % 2;
                l = null;
            }
            if ((i & 4) != 0) {
                int i3 = asInterface + 3;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = 2 % 2;
                l2 = null;
            }
            if ((i & 8) != 0) {
                int i5 = asInterface + 73;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                str2 = null;
            }
            this(str, l, l2, str2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return str;
        }

        public final Long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 41;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Long l = this.IAuthTabCallback;
            int i5 = i3 + 11;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return l;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
