package o;

import im.toss.tosssecurities.tracker.v2.model.SecuritiesLogV2DeviceContext;
import im.toss.tosssecurities.tracker.v2.model.SecuritiesLogV2Request;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1dSDK implements RetrofitInstance {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final AFe1dSDKAFa1vSDK onExtraCallback;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            AFe1dSDK aFe1dSDK = AFe1dSDK.this;
            if (i3 == 0) {
                aFe1dSDK.onWarmupCompleted(null, this);
                access14100.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = aFe1dSDK.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted != access14100.onExtraCallback()) {
                return Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public AFe1dSDK(@NotNull AFe1dSDKAFa1vSDK aFe1dSDKAFa1vSDK) {
        Intrinsics.checkNotNullParameter(aFe1dSDKAFa1vSDK, "");
        this.onExtraCallback = aFe1dSDKAFa1vSDK;
    }

    public static final /* synthetic */ AFe1dSDKAFa1vSDK onWarmupCompleted(AFe1dSDK aFe1dSDK) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFe1dSDKAFa1vSDK aFe1dSDKAFa1vSDK = aFe1dSDK.onExtraCallback;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return aFe1dSDKAFa1vSDK;
    }

    public /* bridge */ Object onExtraCallback(@NotNull Throwable th, @NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = super.onExtraCallback(th, list, access13800Var);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            AFd1kSDK.onNavigationEvent.onNavigationEvent(th);
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        boolean zOnNavigationEvent = AFd1kSDK.onNavigationEvent.onNavigationEvent(th);
        int i3 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i3 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i5 = onextracallbackwithresult.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i5 - 2147483648;
                i = onNavigationEvent + 47;
                onExtraCallbackWithResult = i % 128;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                i = onExtraCallbackWithResult + 63;
                onNavigationEvent = i % 128;
            }
        }
        int i6 = i % 2;
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = onextracallbackwithresult.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (list.isEmpty()) {
                    Result.Companion companion = Result.Companion;
                    return Result.m31constructorimpl(Unit.INSTANCE);
                }
                Result.Companion companion2 = Result.Companion;
                Map mapOnExtraCallbackWithResult = setTopGuideFontStyle.Companion.onExtraCallbackWithResult();
                LinkedHashMap linkedHashMap = new LinkedHashMap(access8200.onNavigationEvent(mapOnExtraCallbackWithResult.size()));
                for (Object obj2 : mapOnExtraCallbackWithResult.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj2).getKey(), initRenderFinish.onNavigationEvent((String) ((Map.Entry) obj2).getValue()));
                }
                JsonObject jsonObject = new JsonObject(linkedHashMap);
                SecuritiesLogV2Request securitiesLogV2Request = new SecuritiesLogV2Request(new JsonArray(list), new SecuritiesLogV2DeviceContext((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null), jsonObject);
                wasLastName waslastnameOnNavigationEvent = onWarmupCompleted(this).onNavigationEvent(securitiesLogV2Request);
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(list);
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
                onextracallbackwithresult.L$2 = access15400.onNavigationEvent(securitiesLogV2Request);
                onextracallbackwithresult.L$3 = access15400.onNavigationEvent(jsonObject);
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.I$1 = 0;
                onextracallbackwithresult.label = 1;
                if (RxAwaitKt.onWarmupCompleted(waslastnameOnNavigationEvent, onextracallbackwithresult) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Result.m31constructorimpl(Unit.INSTANCE);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion3 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion4 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
    }
}
