package o;

import com.google.android.gms.internal.ads.zzgc;
import im.toss.feature.credit.terms.network.response.CreditTermResponse;
import im.toss.feature.credit.terms.network.response.IntegrationTermsResponse;
import im.toss.feature.credit.terms.network.response.TermsGroupInfoResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addANROptimizeMonitorLog {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final enableSensorServiceContextOpt onNavigationEvent(@NotNull IntegrationTermsResponse integrationTermsResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(integrationTermsResponse, "");
        List<TermsGroupInfoResponse> listAsInterface = integrationTermsResponse.asInterface();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsInterface, 10));
        Iterator<T> it = listAsInterface.iterator();
        while (it.hasNext()) {
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(onWarmupCompleted((TermsGroupInfoResponse) it.next()));
                throw null;
            }
            arrayList.add(onWarmupCompleted((TermsGroupInfoResponse) it.next()));
            int i3 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return new enableSensorServiceContextOpt(CollectionsKt.sortedWith(arrayList, new onExtraCallback()), new CommonSwitch(integrationTermsResponse.IAuthTabCallbackStub(), integrationTermsResponse.IAuthTabCallbackDefault(), integrationTermsResponse.onNavigationEvent(), (String) IntegrationTermsResponse.IAuthTabCallback(zzgc.onExtraCallbackWithResult(), new Object[]{integrationTermsResponse}, -2129281764, 2129281764, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult()), integrationTermsResponse.onExtraCallbackWithResult(), integrationTermsResponse.onExtraCallback()));
    }

    private static final LifeCycleBlockOptimizeEventTracker onWarmupCompleted(TermsGroupInfoResponse termsGroupInfoResponse) {
        Object obj;
        Object obj2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = termsGroupInfoResponse.onWarmupCompleted();
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Intrinsics.checkNotNull(strOnWarmupCompleted);
            obj = kotlin.Result.constructor-impl(setUcInitOpt.valueOf(strOnWarmupCompleted));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        setUcInitOpt setucinitopt = (setUcInitOpt) ((Enum) obj);
        String strOnTransact = termsGroupInfoResponse.onTransact();
        boolean zOnExtraCallbackWithResult = termsGroupInfoResponse.onExtraCallbackWithResult();
        String strIAuthTabCallback = termsGroupInfoResponse.IAuthTabCallback();
        Object obj3 = getSwitchValue.OPTIONAL;
        try {
            Result.Companion companion3 = kotlin.Result.Companion;
            Intrinsics.checkNotNull(strIAuthTabCallback);
            obj2 = kotlin.Result.constructor-impl(getSwitchValue.valueOf(strIAuthTabCallback));
        } catch (Throwable th2) {
            Result.Companion companion4 = kotlin.Result.Companion;
            obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (!kotlin.Result.onExtraCallback(obj2)) {
            obj3 = obj2;
        } else {
            int i6 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
        getSwitchValue getswitchvalue = (Enum) obj3;
        List<CreditTermResponse> listIAuthTabCallbackStub = termsGroupInfoResponse.IAuthTabCallbackStub();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallbackStub, 10));
        Iterator<T> it = listIAuthTabCallbackStub.iterator();
        while (it.hasNext()) {
            arrayList.add(onExtraCallbackWithResult((CreditTermResponse) it.next()));
            int i7 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return new LifeCycleBlockOptimizeEventTracker(setucinitopt, strOnTransact, zOnExtraCallbackWithResult, getswitchvalue, arrayList);
    }

    private static final ANROptimizeSwitchOnANROptimizeSwitchCallback onExtraCallbackWithResult(CreditTermResponse creditTermResponse) {
        int i = 2 % 2;
        ANROptimizeSwitchOnANROptimizeSwitchCallback aNROptimizeSwitchOnANROptimizeSwitchCallback = new ANROptimizeSwitchOnANROptimizeSwitchCallback(creditTermResponse.IAuthTabCallbackDefault(), creditTermResponse.IAuthTabCallback(), creditTermResponse.onWarmupCompleted(), creditTermResponse.onExtraCallback(), creditTermResponse.onExtraCallbackWithResult(), creditTermResponse.onNavigationEvent());
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return aNROptimizeSwitchOnANROptimizeSwitchCallback;
        }
        throw null;
    }

    public static final class onExtraCallback<T> implements Comparator {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            setUcInitOpt setucinitoptOnWarmupCompleted = ((LifeCycleBlockOptimizeEventTracker) t).onWarmupCompleted();
            Integer numValueOf = null;
            Integer numValueOf2 = setucinitoptOnWarmupCompleted != null ? Integer.valueOf(setucinitoptOnWarmupCompleted.ordinal()) : null;
            setUcInitOpt setucinitoptOnWarmupCompleted2 = ((LifeCycleBlockOptimizeEventTracker) t2).onWarmupCompleted();
            if (setucinitoptOnWarmupCompleted2 != null) {
                int i2 = onExtraCallback + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = Integer.valueOf(setucinitoptOnWarmupCompleted2.ordinal());
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return getCodeNameBytes.IAuthTabCallback(numValueOf2, numValueOf);
        }
    }
}
