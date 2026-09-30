package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ComputeDistances {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private final Function0<RetrofitInstance> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final String onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof o.ComputeDistances) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r6 = (o.ComputeDistances) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r6 = o.ComputeDistances.IAuthTabCallback + 35;
        r1 = r6 % 128;
        o.ComputeDistances.asBinder = r1;
        r6 = r6 % 2;
        r1 = r1 + 87;
        o.ComputeDistances.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
      0x002f: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r3v9 java.lang.String) = (r3v0 java.lang.String), (r3v11 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.onExtraCallbackWithResult.hashCode();
            str = this.onWarmupCompleted;
            if (str == null) {
                int i3 = IAuthTabCallback + 93;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
                int i5 = asBinder + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            iHashCode = this.onExtraCallbackWithResult.hashCode();
            str = this.onWarmupCompleted;
            if (str == null) {
            }
        }
        int iHashCode4 = this.onExtraCallback.hashCode();
        Integer num = this.onNavigationEvent;
        if (num != null) {
            int i7 = asBinder + 1;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = num.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i9 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
        int i10 = IAuthTabCallback + 21;
        asBinder = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 4 / 0;
        }
        return i9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LogStoreProvider(storeId=" + this.onExtraCallbackWithResult + ", subPath=" + this.onWarmupCompleted + ", apiProvider=" + this.onExtraCallback + ", maxStoreCount=" + this.onNavigationEvent + ")";
        int i2 = asBinder + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComputeDistances(@NotNull String str, @Nullable String str2, @NotNull Function0<? extends RetrofitInstance> function0, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallback = function0;
        this.onNavigationEvent = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputeDistances(String str, String str2, Function0 function0, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i2 = asBinder + 33;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 57;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            num = null;
        }
        this(str, str2, function0, num);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final Function0<RetrofitInstance> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Function0<RetrofitInstance> function0 = this.onExtraCallback;
        int i5 = i3 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return function0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.onNavigationEvent;
        int i4 = i2 + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }
}
