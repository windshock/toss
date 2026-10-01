package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.securities.libs.performance.tracker.data.model.MetricV1LogBody;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.q3a;
import o.q4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3a {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final q4 IAuthTabCallback;
    private final Function0<Boolean> onExtraCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final Function2<SecuritiesPerformanceLogBody, access13800<? super Unit>, Object> onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = onTransact + 123;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(q3a q3aVar, q4ExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(q3aVar, onextracallbackwithresult);
        int i4 = asBinder + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i | i5 | i3);
        int i13 = i11 | i12;
        int i14 = i10 | i5;
        int i15 = i5 + i3 + i2 + (112060874 * i6) + ((-1891258303) * i4);
        int i16 = i15 * i15;
        int i17 = (i5 * 1286644997) + 1783103488 + (1286644997 * i3) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i2) + ((-1427111936) * i6) + (1712848896 * i4) + (159514624 * i16);
        int i18 = ((i5 * (-1669307009)) - 1771304782) + (i3 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i2 * (-1669306445)) + (i6 * (-1582645698)) + (i4 * (-198941581)) + (i16 * (-203030528));
        int i19 = i17 + (i18 * i18 * (-2008154112));
        if (i19 == 1) {
            return onExtraCallback(objArr);
        }
        if (i19 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i19 == 3) {
            return onNavigationEvent(objArr);
        }
        q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback = (q4ExternalSyntheticLambda2.IAuthTabCallback) objArr[0];
        int i20 = 2 % 2;
        int i21 = asBinder + 67;
        IAuthTabCallbackStub = i21 % 128;
        int i22 = i21 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(iAuthTabCallback);
        int i23 = asBinder + 119;
        IAuthTabCallbackStub = i23 % 128;
        int i24 = i23 % 2;
        return charSequenceOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(q3a q3aVar, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(q3aVar, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(q3aVar, th);
        int i3 = asBinder + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q3a(@NotNull accessgetStatep accessgetstatep, @NotNull Function0<String> function0, @NotNull Function0<Boolean> function02, @NotNull Function2<? super SecuritiesPerformanceLogBody, ? super access13800<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallback = function02;
        this.onWarmupCompleted = function2;
        this.onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("PerformanceLogDeliveryHealth");
        this.IAuthTabCallback = new q4(accessgetstatep, function0, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
            int i3 = 61 / 0;
            if (onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4)) {
                if (!((Boolean) this.onExtraCallback.invoke()).booleanValue()) {
                    int i4 = asBinder + 11;
                    int i5 = i4 % 128;
                    IAuthTabCallbackStub = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 3;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
            if (!(!onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4))) {
            }
        }
        return true;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        q3a q3aVar = (q3a) objArr[0];
        r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 = (r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
        q3aVar.IAuthTabCallback.onExtraCallback(q3aVar.onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4));
        int i4 = IAuthTabCallbackStub + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallback(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
        q4.IAuthTabCallback(-341100002, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{this.IAuthTabCallback, Boolean.valueOf(onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4))}, 341100002, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        int i4 = IAuthTabCallbackStub + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        q3a q3aVar = (q3a) objArr[0];
        r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 = (r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
        Object[] objArr2 = {q3aVar.IAuthTabCallback, Boolean.valueOf(q3aVar.onNavigationEvent(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4))};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        q4.IAuthTabCallback(-1839918727, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), objArr2, 1839918728, iOnExtraCallback);
        int i4 = asBinder + 75;
        IAuthTabCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final IAuthTabCallback onWarmupCompleted() {
        int i = 2 % 2;
        this.IAuthTabCallback.onExtraCallbackWithResult();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(((Boolean) this.onExtraCallback.invoke()).booleanValue());
        int i2 = IAuthTabCallbackStub + 57;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return iAuthTabCallback;
    }

    public final void onExtraCallbackWithResult(@NotNull List<? extends SecuritiesPerformanceLogBody> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback.onWarmupCompleted(list.size(), onExtraCallback(list));
        int i4 = asBinder + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull List<? extends SecuritiesPerformanceLogBody> list) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback.onExtraCallbackWithResult(list.size(), onExtraCallback(list));
        int i4 = IAuthTabCallbackStub + 15;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        q3a q3aVar = (q3a) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        q3aVar.IAuthTabCallback.IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted();
        int i4 = asBinder + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(@NotNull IAuthTabCallback iAuthTabCallback, long j, int i, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Object objOnExtraCallback = this.IAuthTabCallback.onExtraCallback(iAuthTabCallback.onExtraCallbackWithResult(), j, i, this.onWarmupCompleted, new Function1() { // from class: im.toss.securities.libs.performance.tracker.data.PerformanceLogDeliveryHealthMonitor$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = q3a.IAuthTabCallback(this.f$0, (q4ExternalSyntheticLambda2.onExtraCallbackWithResult) obj);
                int i6 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unitIAuthTabCallback;
            }
        }, new Function1() { // from class: im.toss.securities.libs.performance.tracker.data.PerformanceLogDeliveryHealthMonitor$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 57;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    q3a.onWarmupCompleted(this.f$0, (Throwable) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = q3a.onWarmupCompleted(this.f$0, (Throwable) obj);
                int i5 = onExtraCallback + 103;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, access13800Var);
        if (objOnExtraCallback == access14300.onWarmupCompleted()) {
            int i3 = IAuthTabCallbackStub + 21;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 107;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final CharSequence onNavigationEvent(q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            return iAuthTabCallback.onExtraCallbackWithResult();
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int i3 = 72 / 0;
        return iAuthTabCallback.onExtraCallbackWithResult();
    }

    private static final Unit onExtraCallbackWithResult(q3a q3aVar, q4ExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        AppSetIdAndScope1 appSetIdAndScope1 = q3aVar.onExtraCallbackWithResult;
        CollectionsKt.joinToString$default(onextracallbackwithresult.onExtraCallback(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.securities.libs.performance.tracker.data.PerformanceLogDeliveryHealthMonitor$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 107;
                onNavigationEvent = i3 % 128;
                q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback = (q4ExternalSyntheticLambda2.IAuthTabCallback) obj;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                CharSequence charSequence = (CharSequence) q3a.onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1273866827, new Object[]{iAuthTabCallback}, C40Encoder.onExtraCallback(), -1273866827, C40Encoder.onExtraCallback());
                int i4 = onNavigationEvent + 89;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return charSequence;
            }
        }, 31, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(q3a q3aVar, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        AppSetIdAndScope1 appSetIdAndScope1 = q3aVar.onExtraCallbackWithResult;
        th.getMessage();
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return unit;
    }

    private final boolean onNavigationEvent(r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 instanceof r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks;
            throw null;
        }
        if (!(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 instanceof r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) || ((r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4).onExtraCallbackWithResult().get("metric_contract_version") == null) {
            return false;
        }
        int i3 = asBinder;
        int i4 = i3 + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 123;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 70 / 0;
        }
        return true;
    }

    private final boolean onExtraCallbackWithResult(SecuritiesPerformanceLogBody securitiesPerformanceLogBody) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 79;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (!(securitiesPerformanceLogBody instanceof MetricV1LogBody)) {
                return false;
            }
            int i4 = i2 + 117;
            asBinder = i4 % 128;
            MetricV1LogBody metricV1LogBody = (MetricV1LogBody) securitiesPerformanceLogBody;
            if (i4 % 2 != 0) {
                return ((Map) MetricV1LogBody.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{metricV1LogBody}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1343709777, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1343709777)).get("metric_contract_version") != null;
            }
            ((Map) MetricV1LogBody.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{metricV1LogBody}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1343709777, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1343709777)).get("metric_contract_version");
            obj.hashCode();
            throw null;
        }
        boolean z = securitiesPerformanceLogBody instanceof MetricV1LogBody;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.onWarmupCompleted != ((IAuthTabCallback) obj).onWarmupCompleted) {
                return false;
            }
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onWarmupCompleted);
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FlushCycle(monitoringDashboardEnabled=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(boolean z) {
            this.onWarmupCompleted = z;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i2 + 35;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<SecuritiesPerformanceLogBody> onWarmupCompleted(@NotNull List<? extends SecuritiesPerformanceLogBody> list, @NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            iAuthTabCallback.onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (iAuthTabCallback.onExtraCallbackWithResult()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int i3 = IAuthTabCallbackStub + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (!onExtraCallbackWithResult((SecuritiesPerformanceLogBody) obj2)) {
                arrayList.add(obj2);
                int i5 = asBinder + 23;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 5;
                }
            }
        }
        int i7 = asBinder + 57;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    private final int onExtraCallback(List<? extends SecuritiesPerformanceLogBody> list) {
        int i = 2 % 2;
        List<? extends SecuritiesPerformanceLogBody> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = asBinder + 65;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                if (onExtraCallbackWithResult((SecuritiesPerformanceLogBody) it.next()) && (i2 = i2 + 1) < 0) {
                    int i4 = IAuthTabCallbackStub + 3;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    CollectionsKt.throwCountOverflow();
                    if (i5 == 0) {
                        int i6 = 99 / 0;
                    }
                    int i7 = asBinder + 13;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                }
            } else {
                onExtraCallbackWithResult((SecuritiesPerformanceLogBody) it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return i2;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        return (CharSequence) onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1273866827, new Object[]{iAuthTabCallback}, C40Encoder.onExtraCallback(), -1273866827, C40Encoder.onExtraCallback());
    }

    public final void onExtraCallback() {
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 889239744, new Object[]{this}, C40Encoder.onExtraCallback(), -889239743, C40Encoder.onExtraCallback());
    }

    public final void onWarmupCompleted(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1822976475, new Object[]{this, r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4}, C40Encoder.onExtraCallback(), -1822976473, C40Encoder.onExtraCallback());
    }

    public final void IAuthTabCallback(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -220368184, new Object[]{this, r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4}, C40Encoder.onExtraCallback(), 220368187, C40Encoder.onExtraCallback());
    }
}
