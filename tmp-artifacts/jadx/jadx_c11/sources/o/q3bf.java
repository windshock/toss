package o;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.q4ExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3bf {
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final q3bd IAuthTabCallback;
    private final int onExtraCallback;
    private final q3bd onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int iOnWarmupCompleted;
        int i7 = (~(i4 | i)) | i3;
        int i8 = ~i4;
        int i9 = ~((~i3) | i8 | i);
        int i10 = (~(i | i3)) | (~(i8 | (~i)));
        int i11 = i4 + i3 + i6 + (1616745821 * i2) + (2077170981 * i5);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i4) + 1587019776 + (806482222 * i3) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i6) + ((-395313152) * i2) + (904921088 * i5) + (345505792 * i12);
        int i14 = (i4 * (-1558553916)) + 318941677 + (i3 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i6 * (-1558553459)) + (i2 * 397062201) + (i5 * 609114465) + (i12 * (-138936320));
        if (i13 + (i14 * i14 * 1630011392) == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        q3bf q3bfVar = (q3bf) objArr[0];
        int i15 = 2 % 2;
        int i16 = onTransact + 15;
        onWarmupCompleted = i16 % 128;
        int i17 = i16 % 2;
        int iOnExtraCallback = q3bfVar.onExtraCallbackWithResult.onExtraCallback();
        if (i17 != 0) {
            iOnWarmupCompleted = (iOnExtraCallback % q3bfVar.onExtraCallbackWithResult.onWarmupCompleted()) >>> q3bfVar.onExtraCallback;
        } else {
            iOnWarmupCompleted = q3bfVar.onExtraCallback + iOnExtraCallback + q3bfVar.onExtraCallbackWithResult.onWarmupCompleted();
        }
        return Integer.valueOf(iOnWarmupCompleted);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3bf)) {
            int i2 = onTransact + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        q3bf q3bfVar = (q3bf) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, q3bfVar.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, q3bfVar.IAuthTabCallback)) {
            int i6 = onWarmupCompleted + 29;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onNavigationEvent != q3bfVar.onNavigationEvent) {
            int i8 = onTransact + 23;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.onExtraCallback == q3bfVar.onExtraCallback) {
            return true;
        }
        int i10 = onWarmupCompleted + 85;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.onExtraCallback);
        int i4 = onTransact + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TelemetryHealthSnapshot(total=" + this.onExtraCallbackWithResult + ", monitoring=" + this.IAuthTabCallback + ", flushAttemptCount=" + this.onNavigationEvent + ", parseDropCount=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public q3bf(@NotNull q3bd q3bdVar, @NotNull q3bd q3bdVar2, int i, int i2) {
        Intrinsics.checkNotNullParameter(q3bdVar, "");
        Intrinsics.checkNotNullParameter(q3bdVar2, "");
        this.onExtraCallbackWithResult = q3bdVar;
        this.IAuthTabCallback = q3bdVar2;
        this.onNavigationEvent = i;
        this.onExtraCallback = i2;
    }

    public final q3bd onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final q3bd onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q3bd q3bdVar = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return q3bdVar;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onNavigationEvent;
        int i5 = i2 + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    private final int asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
        return i3 == 0 ? iOnExtraCallback << this.onExtraCallback : iOnExtraCallback + this.onExtraCallback;
    }

    private final int IAuthTabCallbackDefault() {
        int iOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
            int i3 = 57 / 0;
        } else {
            iOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
        }
        int i4 = onTransact + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    private final int asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = this.IAuthTabCallback.onExtraCallback() + this.IAuthTabCallback.onWarmupCompleted();
        int i4 = onWarmupCompleted + 1;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult.IAuthTabCallbackDefault()) {
            int i4 = onTransact + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                this.IAuthTabCallback.IAuthTabCallbackDefault();
                throw null;
            }
            if (this.IAuthTabCallback.IAuthTabCallbackDefault()) {
                int i5 = onWarmupCompleted + 35;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 37 / 0;
                    if (this.onNavigationEvent == 0) {
                        if (this.onExtraCallback == 0) {
                            return true;
                        }
                    }
                } else if (this.onNavigationEvent == 0) {
                }
            }
        }
        int i7 = onTransact + 45;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            ((Integer) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), -79341173, 79341173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (((Integer) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), -79341173, 79341173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue() > 0) {
            int i3 = onTransact + 83;
            onWarmupCompleted = i3 % 128;
            return i3 % 2 == 0;
        }
        int i4 = onWarmupCompleted + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str;
        q3bf q3bfVar = (q3bf) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = q4ExternalSyntheticLambda6.Companion;
        if (((Integer) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), new Object[]{q3bfVar}, setVisitUrl.onExtraCallbackWithResult(), -79341173, 79341173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue() == 0) {
            int i4 = onTransact + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            str = "success";
        } else {
            int i6 = onWarmupCompleted + 119;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            str = "failure";
        }
        return CollectionsKt.listOf(new q4ExternalSyntheticLambda6[]{iAuthTabCallback.onWarmupCompleted(str, 1L), iAuthTabCallback.onWarmupCompleted("eligible", q3bfVar.onExtraCallbackWithResult.onExtraCallbackWithResult()), iAuthTabCallback.onWarmupCompleted("produced_count", q3bfVar.onExtraCallbackWithResult.onExtraCallbackWithResult()), iAuthTabCallback.onWarmupCompleted("enqueue_success_count", q3bfVar.onExtraCallbackWithResult.IAuthTabCallback()), iAuthTabCallback.onWarmupCompleted("enqueue_failure_count", q3bfVar.onExtraCallbackWithResult.onExtraCallback()), iAuthTabCallback.onWarmupCompleted("flush_attempt_count", q3bfVar.onNavigationEvent), iAuthTabCallback.onWarmupCompleted("flush_success_count", q3bfVar.onExtraCallbackWithResult.onNavigationEvent()), iAuthTabCallback.onWarmupCompleted("flush_failure_count", q3bfVar.onExtraCallbackWithResult.onWarmupCompleted()), iAuthTabCallback.onWarmupCompleted("parse_drop_count", q3bfVar.onExtraCallback), iAuthTabCallback.onWarmupCompleted("drop_count", q3bfVar.asInterface()), iAuthTabCallback.onWarmupCompleted("monitoring_produced_count", q3bfVar.IAuthTabCallback.onExtraCallbackWithResult()), iAuthTabCallback.onWarmupCompleted("monitoring_enqueue_success_count", q3bfVar.IAuthTabCallback.IAuthTabCallback()), iAuthTabCallback.onWarmupCompleted("monitoring_enqueue_failure_count", q3bfVar.IAuthTabCallback.onExtraCallback()), iAuthTabCallback.onWarmupCompleted("monitoring_flush_success_count", q3bfVar.IAuthTabCallback.onNavigationEvent()), iAuthTabCallback.onWarmupCompleted("monitoring_flush_failure_count", q3bfVar.IAuthTabCallback.onWarmupCompleted()), iAuthTabCallback.onWarmupCompleted("monitoring_drop_count", q3bfVar.IAuthTabCallbackDefault()), iAuthTabCallback.onExtraCallback("pending_count", Integer.valueOf(iIntValue)), iAuthTabCallback.onExtraCallback("queue_oldest_age_ms", Long.valueOf(jLongValue))});
    }

    public final Map<String, String> onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("telemetry_stage", "flush_cycle"), getWrite.IAuthTabCallback("app_state", str), getWrite.IAuthTabCallback("metric_step_detail", "client_file_store_flush"), getWrite.IAuthTabCallback("produced_count_bucket", q3bi.onExtraCallback(this.onExtraCallbackWithResult.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("flush_failure_count_bucket", q3bi.onExtraCallback(this.onExtraCallbackWithResult.onWarmupCompleted())), getWrite.IAuthTabCallback("drop_count_bucket", q3bi.onExtraCallback(asInterface())), getWrite.IAuthTabCallback("monitoring_produced_count_bucket", q3bi.onExtraCallback(this.IAuthTabCallback.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("monitoring_failure_count_bucket", q3bi.onExtraCallback(asBinder())), getWrite.IAuthTabCallback("monitoring_drop_count_bucket", q3bi.onExtraCallback(IAuthTabCallbackDefault()))}), q5a.onNavigationEvent.onExtraCallbackWithResult());
        int i4 = onTransact + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    private final int onTransact() {
        return ((Integer) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), -79341173, 79341173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
    }

    public final List<q4ExternalSyntheticLambda6> onWarmupCompleted(int i, long j) {
        Object[] objArr = {this, Integer.valueOf(i), Long.valueOf(j)};
        return (List) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), 1162915827, -1162915826, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
    }
}
