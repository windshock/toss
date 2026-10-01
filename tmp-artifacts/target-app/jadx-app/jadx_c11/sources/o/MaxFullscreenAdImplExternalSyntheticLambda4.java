package o;

import android.os.SystemClock;
import im.toss.rn.toss.core.util.RnTransitionTrace;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import o.MaxFullscreenAdImplExternalSyntheticLambda4;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda4 {
    private static int asBinder = 1;
    private static int onExtraCallback;
    private final long IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = (MaxFullscreenAdImplExternalSyntheticLambda4) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Pair[] pairArr = (Pair[]) objArr[3];
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(str, maxFullscreenAdImplExternalSyntheticLambda4, jLongValue, pairArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallback = onExtraCallback(str, maxFullscreenAdImplExternalSyntheticLambda4, jLongValue, pairArr);
        int i3 = asBinder + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return strOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(maxFullscreenAdImplExternalSyntheticLambda4, str);
        int i4 = onExtraCallback + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~(i3 | i6);
        int i8 = ~(i6 | i4);
        int i9 = i7 | i8;
        int i10 = ~i3;
        int i11 = ~i6;
        int i12 = (~(i10 | i4)) | (~(i10 | i11)) | (~(i11 | i4));
        int i13 = ~i4;
        int i14 = i12 | (~(i13 | i3 | i6));
        int i15 = (~(i13 | i11)) | i3 | i8;
        int i16 = i3 + i6 + i + (1962400304 * i5) + (1167700406 * i2);
        int i17 = i16 * i16;
        int i18 = ((i3 * (-1019457937)) - 559939584) + ((-1019457937) * i6) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i) + ((-1660944384) * i5) + ((-325058560) * i2) + (867827712 * i17);
        int i19 = ((i3 * (-1629562239)) - 1134582380) + (i6 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i * (-1629561329)) + (i5 * (-1621399344)) + (i2 * (-873382486)) + (i17 * 1407582208);
        return i18 + ((i19 * i19) * (-1895432192)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback(function0);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = asBinder + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 99;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof MaxFullscreenAdImplExternalSyntheticLambda4)) {
            return false;
        }
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = (MaxFullscreenAdImplExternalSyntheticLambda4) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, maxFullscreenAdImplExternalSyntheticLambda4.onWarmupCompleted)) {
            int i7 = onExtraCallback + 15;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, maxFullscreenAdImplExternalSyntheticLambda4.onNavigationEvent)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, maxFullscreenAdImplExternalSyntheticLambda4.onExtraCallbackWithResult) && this.IAuthTabCallback == maxFullscreenAdImplExternalSyntheticLambda4.IAuthTabCallback;
        }
        int i9 = onExtraCallback + 39;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        asBinder = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((this.onWarmupCompleted.hashCode() % 100) / this.onNavigationEvent.hashCode()) >>> 74) / this.onExtraCallbackWithResult.hashCode()) << 19) * Long.hashCode(this.IAuthTabCallback) : (((((this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Long.hashCode(this.IAuthTabCallback);
        int i3 = asBinder + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabTransitionPerfContext(runId=" + this.onWarmupCompleted + ", entryType=" + this.onNavigationEvent + ", route=" + this.onExtraCallbackWithResult + ", startedAtMs=" + this.IAuthTabCallback + ")";
        int i2 = asBinder + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public MaxFullscreenAdImplExternalSyntheticLambda4(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onWarmupCompleted = str;
        this.onNavigationEvent = str2;
        this.onExtraCallbackWithResult = str3;
        this.IAuthTabCallback = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MaxFullscreenAdImplExternalSyntheticLambda4(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        if ((i & 8) != 0) {
            int i2 = onExtraCallback + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i4 = asBinder + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            j2 = jElapsedRealtime;
        } else {
            j2 = j;
        }
        this(str, str2, str3, j2);
    }

    public final void onWarmupCompleted(@NotNull final String str, @NotNull final Pair<String, String>... pairArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.IAuthTabCallback;
        RnTransitionTrace.onExtraCallback.onExtraCallback(new Function0() { // from class: im.toss.rn.toss.core.ShoppingTabTransitionPerfContext$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 != 0) {
                    MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = this;
                    long j = jElapsedRealtime;
                    Object[] objArr = {str2, maxFullscreenAdImplExternalSyntheticLambda4, Long.valueOf(j), pairArr};
                    int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                    return (String) MaxFullscreenAdImplExternalSyntheticLambda4.onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -878157023, iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), 878157023, objArr);
                }
                MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda42 = this;
                long j2 = jElapsedRealtime;
                Object[] objArr2 = {str2, maxFullscreenAdImplExternalSyntheticLambda42, Long.valueOf(j2), pairArr};
                int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onExtraCallback + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final String onExtraCallback(String str, MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4, long j, Pair[] pairArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("marker=");
        sb.append(str);
        sb.append(" run_id=");
        sb.append(maxFullscreenAdImplExternalSyntheticLambda4.onWarmupCompleted);
        sb.append(" entry_type=");
        sb.append(maxFullscreenAdImplExternalSyntheticLambda4.onNavigationEvent);
        sb.append(" route=");
        sb.append(RnTransitionTrace.onExtraCallback.onExtraCallbackWithResult(maxFullscreenAdImplExternalSyntheticLambda4.onExtraCallbackWithResult));
        sb.append(" elapsed_ms=");
        sb.append(j);
        int i2 = onExtraCallback + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        for (Pair pair : pairArr) {
            int i4 = onExtraCallback + 125;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            String str2 = (String) pair.onExtraCallbackWithResult();
            String str3 = (String) pair.IAuthTabCallback();
            sb.append(' ');
            sb.append(str2);
            sb.append('=');
            sb.append(RnTransitionTrace.onExtraCallback.onExtraCallbackWithResult(str3));
        }
        String string = sb.toString();
        int i6 = asBinder + 39;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    public final <T> T onExtraCallback(@NotNull final String str, @NotNull final Function0<? extends T> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onWarmupCompleted(str + "_start", new Pair[0]);
        T t = (T) RnTransitionTrace.onExtraCallback.onExtraCallback(str, "rntrans", new Function0() { // from class: im.toss.rn.toss.core.ShoppingTabTransitionPerfContext$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = MaxFullscreenAdImplExternalSyntheticLambda4.onExtraCallback(this.f$0, str);
                int i5 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, new Function0() { // from class: im.toss.rn.toss.core.ShoppingTabTransitionPerfContext$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objOnExtraCallbackWithResult = MaxFullscreenAdImplExternalSyntheticLambda4.onExtraCallbackWithResult(function0);
                int i5 = onWarmupCompleted + 7;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 52 / 0;
                }
                return objOnExtraCallbackWithResult;
            }
        });
        int i2 = onExtraCallback + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return t;
    }

    private static final Unit onExtraCallbackWithResult(MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4, String str) {
        int i = 2 % 2;
        maxFullscreenAdImplExternalSyntheticLambda4.onWarmupCompleted(str + "_end", new Pair[0]);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Object onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke = function0.invoke();
        int i4 = asBinder + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvoke;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4 = (MaxFullscreenAdImplExternalSyntheticLambda4) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        maxFullscreenAdImplExternalSyntheticLambda4.onWarmupCompleted(str + "_start", getWrite.IAuthTabCallback("cookie", String.valueOf(iIntValue)));
        RnTransitionTrace.onExtraCallback.onExtraCallbackWithResult(str, "rntrans", iIntValue);
        int i2 = asBinder + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return null;
    }

    public final void onExtraCallback(@NotNull String str, int i, @NotNull Pair<String, String>... pairArr) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        RnTransitionTrace.onExtraCallback.onNavigationEvent(str, "rntrans", i);
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(getWrite.IAuthTabCallback("cookie", String.valueOf(i)));
        spreadBuilder.addSpread(pairArr);
        onWarmupCompleted(str + "_end", (Pair[]) spreadBuilder.toArray(new Pair[spreadBuilder.size()]));
        int i3 = asBinder + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ String IAuthTabCallback(String str, MaxFullscreenAdImplExternalSyntheticLambda4 maxFullscreenAdImplExternalSyntheticLambda4, long j, Pair[] pairArr) {
        Object[] objArr = {str, maxFullscreenAdImplExternalSyntheticLambda4, Long.valueOf(j), pairArr};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -878157023, iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), 878157023, objArr);
    }

    public final void onNavigationEvent(@NotNull String str, int i) {
        Object[] objArr = {this, str, Integer.valueOf(i)};
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallbackWithResult(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1498906936, iIAuthTabCallback, _string.onNavigationEvent.IAuthTabCallback(), 1498906937, objArr);
    }
}
