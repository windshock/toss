package o;

import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.q4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4 {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private final accessgetStatep IAuthTabCallback;
    private final q4ExternalSyntheticLambda12 onExtraCallback;
    private final q3ba onExtraCallbackWithResult;
    private final Function0<String> onNavigationEvent;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onWarmupCompleted = 8;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            long j;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            q4 q4Var = q4.this;
            if (i4 == 0) {
                z = true;
                j = 0;
                i = 1;
            } else {
                z = false;
                j = 0;
                i = 0;
            }
            return q4Var.onExtraCallback(z, j, i, null, null, null, this);
        }
    }

    static {
        int i = asBinder + 59;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i | i6);
        int i11 = i9 | i10;
        int i12 = ~i;
        int i13 = i9 | (~(i12 | i5)) | i10;
        int i14 = (~(i6 | i | i5)) | (~(i7 | i12 | i8));
        int i15 = i + i5 + i2 + (1322235619 * i4) + (440487356 * i3);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i) - 2100690944) + ((-281430247) * i5) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i2) + ((-942931968) * i4) + ((-1410334720) * i3) + (1251606528 * i16);
        int i18 = (i * 157034417) + 1376579869 + (i5 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i2 * 157035401) + (i4 * (-982187909)) + (i3 * (-1869533796)) + (i16 * (-899022848));
        if (i17 + (i18 * i18 * (-511311872)) == 1) {
            return onNavigationEvent(objArr);
        }
        q4 q4Var = (q4) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i19 = 2 % 2;
        int i20 = asInterface + 5;
        IAuthTabCallbackStub = i20 % 128;
        int i21 = i20 % 2;
        q4Var.onExtraCallbackWithResult.onWarmupCompleted(zBooleanValue);
        int i22 = asInterface + 41;
        IAuthTabCallbackStub = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(th);
        }
        onWarmupCompleted(th);
        throw null;
    }

    public q4(@NotNull accessgetStatep accessgetstatep, @NotNull Function0<String> function0, @NotNull q4ExternalSyntheticLambda12 q4externalsyntheticlambda12) {
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(q4externalsyntheticlambda12, "");
        this.IAuthTabCallback = accessgetstatep;
        this.onNavigationEvent = function0;
        this.onExtraCallback = q4externalsyntheticlambda12;
        this.onExtraCallbackWithResult = new q3ba();
    }

    public /* synthetic */ q4(accessgetStatep accessgetstatep, Function0 function0, q4ExternalSyntheticLambda12 q4externalsyntheticlambda12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            q4externalsyntheticlambda12 = new q4ExternalSyntheticLambda12(null, null, null, null, null, 31, null);
            int i2 = asInterface + 97;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this(accessgetstatep, function0, q4externalsyntheticlambda12);
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onNavigationEvent(z);
        int i4 = asInterface + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        q4 q4Var = (q4) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        q4Var.onExtraCallbackWithResult.IAuthTabCallback(zBooleanValue);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
    }

    public final void onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        q3ba q3baVar = this.onExtraCallbackWithResult;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 != 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            q3ba.onExtraCallbackWithResult(new Object[]{q3baVar, numValueOf, numValueOf2}, -151641000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 151641000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
            return;
        }
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        q3ba.onExtraCallbackWithResult(new Object[]{q3baVar, numValueOf, numValueOf2}, -151641000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 151641000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallbackWithResult.onWarmupCompleted(i, i2);
        int i6 = asInterface + 49;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback();
        int i4 = asInterface + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(true);
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        IAuthTabCallback(-1839918727, iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, new Object[]{this, true}, 1839918728, iOnExtraCallback);
        int i4 = asInterface + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        q3ba q3baVar = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            q3ba.onExtraCallbackWithResult(new Object[]{q3baVar}, -62203302, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 62203303, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
            return;
        }
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        q3ba.onExtraCallbackWithResult(new Object[]{q3baVar}, -62203302, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 62203303, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(boolean z, long j, int i, @NotNull Function2<? super SecuritiesPerformanceLogBody, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull Function1<? super q4ExternalSyntheticLambda2.onExtraCallbackWithResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object th;
        q3bf q3bfVar;
        CancellationException e;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i3 = IAuthTabCallbackStub + 85;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i5 = onextracallbackwithresult.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i5 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallbackwithresult.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!z) {
                onExtraCallback();
                return Unit.INSTANCE;
            }
            q3bf q3bfVarOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
            if (q3bfVarOnNavigationEvent.onWarmupCompleted()) {
                int i7 = asInterface + 1;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                int i8 = 13 / 0;
                return Unit.INSTANCE;
            }
            if (!q3bfVarOnNavigationEvent.IAuthTabCallbackStub()) {
                int i9 = asInterface + 85;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                return Unit.INSTANCE;
            }
            q4ExternalSyntheticLambda2 q4externalsyntheticlambda2OnExtraCallback = this.onExtraCallback.onExtraCallback(IAuthTabCallback(q3bfVarOnNavigationEvent, j, i));
            if (q4externalsyntheticlambda2OnExtraCallback instanceof q4ExternalSyntheticLambda2.onExtraCallback) {
                try {
                    SecuritiesPerformanceLogBody securitiesPerformanceLogBodyOnNavigationEvent = r8lambdaB4yvEJRrqshFfJjnkyA0PO4d8UA.onNavigationEvent(((q4ExternalSyntheticLambda2.onExtraCallback) q4externalsyntheticlambda2OnExtraCallback).onWarmupCompleted());
                    onextracallbackwithresult.L$0 = access15400.onNavigationEvent(function2);
                    onextracallbackwithresult.L$1 = access15400.onNavigationEvent(function1);
                    onextracallbackwithresult.L$2 = function12;
                    onextracallbackwithresult.L$3 = q3bfVarOnNavigationEvent;
                    onextracallbackwithresult.L$4 = access15400.onNavigationEvent(q4externalsyntheticlambda2OnExtraCallback);
                    onextracallbackwithresult.Z$0 = z;
                    onextracallbackwithresult.J$0 = j;
                    onextracallbackwithresult.I$0 = i;
                    onextracallbackwithresult.label = 1;
                    if (function2.invoke(securitiesPerformanceLogBodyOnNavigationEvent, onextracallbackwithresult) == objOnWarmupCompleted) {
                        int i11 = IAuthTabCallbackStub + 19;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                        return objOnWarmupCompleted;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    q3bfVar = q3bfVarOnNavigationEvent;
                    this.onExtraCallbackWithResult.onWarmupCompleted(q3bfVar);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    q3bfVar = q3bfVarOnNavigationEvent;
                    this.onExtraCallbackWithResult.onWarmupCompleted(q3bfVar);
                    function12.invoke(th);
                    return Unit.INSTANCE;
                }
            } else {
                if (!(q4externalsyntheticlambda2OnExtraCallback instanceof q4ExternalSyntheticLambda2.onExtraCallbackWithResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.onExtraCallbackWithResult.onWarmupCompleted(q3bfVarOnNavigationEvent);
                function1.invoke(q4externalsyntheticlambda2OnExtraCallback);
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = asInterface + 5;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            q3bfVar = (q3bf) onextracallbackwithresult.L$3;
            function12 = (Function1) onextracallbackwithresult.L$2;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (CancellationException e3) {
                e = e3;
                this.onExtraCallbackWithResult.onWarmupCompleted(q3bfVar);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                this.onExtraCallbackWithResult.onWarmupCompleted(q3bfVar);
                function12.invoke(th);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    private final q4ExternalSyntheticLambda3 IAuthTabCallback(q3bf q3bfVar, long j, int i) throws Throwable {
        int i2 = 2 % 2;
        String strOnNavigationEvent = accesssetTrailersp.onNavigationEvent(this.IAuthTabCallback);
        String strIAuthTabCallback = accesssetTrailersp.IAuthTabCallback(this.IAuthTabCallback);
        String lowerCase = this.IAuthTabCallback.AudioAttributesImplApi26Parcelizer().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strOnNavigationEvent2 = r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.onExtraCallbackWithResult.onNavigationEvent(this.IAuthTabCallback.getSmallIconBitmap());
        Object[] objArr = {q3bfVar, Integer.valueOf(i), Long.valueOf(j)};
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = new q4ExternalSyntheticLambda3("telemetry_health", "TELEMETRY", "background", "rum_p0_telemetry_health_100pct", strOnNavigationEvent, strIAuthTabCallback, lowerCase, strOnNavigationEvent2, "observability", "telemetry", (List) q3bf.onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), 1162915827, -1162915826, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult()), q3bfVar.onExtraCallbackWithResult((String) this.onNavigationEvent.invoke()), null, false);
        int i3 = asInterface + 69;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return q4externalsyntheticlambda3;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public final void onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        IAuthTabCallback(-1839918727, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), objArr, 1839918728, iOnExtraCallback);
    }

    public final void IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        IAuthTabCallback(-341100002, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), objArr, 341100002, iOnExtraCallback);
    }
}
