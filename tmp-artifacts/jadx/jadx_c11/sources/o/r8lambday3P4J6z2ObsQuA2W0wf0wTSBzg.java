package o;

import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.response.MappedServicesResponse;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.response.UserTermsStateWithServiceInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg.this.onExtraCallback(this);
            Object obj2 = null;
            if (objOnExtraCallback == access14300.onWarmupCompleted()) {
                int i4 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallback;
                }
                obj2.hashCode();
                throw null;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnExtraCallback);
            int i5 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return resultIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg() {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super Result<? extends Map<MappedServicesResponse, ? extends List<UserTermsStateWithServiceInfoResponse>>>> access13800Var) {
        onExtraCallback onextracallback;
        int i;
        Object objOnExtraCallback;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i3 = onextracallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = onNavigationEvent + 33;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                onextracallback.label = i3 - 2147483648;
                i = onNavigationEvent + 19;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
                i = onNavigationEvent + 101;
            }
        }
        onWarmupCompleted = i % 128;
        int i6 = i % 2;
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback.label;
        try {
            if (i7 != 0) {
                int i8 = onNavigationEvent;
                int i9 = i8 + 53;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = i8 + 21;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    ((Result) obj).onNavigationEvent();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                Result.Companion companion = Result.Companion;
                playerToolbarAction playertoolbaractionOnExtraCallbackWithResult = playerToolbarAction.Companion.onExtraCallbackWithResult(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                onextracallback.L$0 = access15400.onNavigationEvent(onextracallback);
                onextracallback.I$0 = 0;
                onextracallback.I$1 = 0;
                onextracallback.label = 1;
                objOnExtraCallback = playertoolbaractionOnExtraCallbackWithResult.onExtraCallback(onextracallback);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            ArrayList arrayList = new ArrayList();
            for (UserTermsStateWithServiceInfoResponse userTermsStateWithServiceInfoResponse : (List) objOnExtraCallback) {
                List listOnWarmupCompleted = userTermsStateWithServiceInfoResponse.onWarmupCompleted();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
                Iterator it = listOnWarmupCompleted.iterator();
                while (it.hasNext()) {
                    int i12 = onWarmupCompleted + 71;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    arrayList2.add(getWrite.IAuthTabCallback((MappedServicesResponse) it.next(), userTermsStateWithServiceInfoResponse));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList) {
                MappedServicesResponse mappedServicesResponse = (MappedServicesResponse) ((Pair) obj3).getFirst();
                Object arrayList3 = linkedHashMap.get(mappedServicesResponse);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(mappedServicesResponse, arrayList3);
                }
                ((List) arrayList3).add((UserTermsStateWithServiceInfoResponse) ((Pair) obj3).getSecond());
            }
            return Result.constructor-impl(linkedHashMap);
        } catch (CancellationException e) {
            throw e;
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e3));
        }
    }
}
