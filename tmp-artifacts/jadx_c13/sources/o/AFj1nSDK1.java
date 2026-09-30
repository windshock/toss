package o;

import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.api.TossDomainLogApi;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1nSDK1 implements RetrofitInstance {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final TossDomainLogApi onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            return kotlin.Result.IAuthTabCallback(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        
            if (r5 == o.access14100.onExtraCallback()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (r5 == o.access14100.onExtraCallback()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        
            r1 = o.AFj1nSDK1.onExtraCallbackWithResult.onExtraCallbackWithResult + 79;
            o.AFj1nSDK1.onExtraCallbackWithResult.onWarmupCompleted = r1 % 128;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = AFj1nSDK1.this.onWarmupCompleted(null, this);
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
        }
    }

    @Inject
    public AFj1nSDK1(@NotNull TossDomainLogApi tossDomainLogApi) {
        Intrinsics.checkNotNullParameter(tossDomainLogApi, "");
        this.onWarmupCompleted = tossDomainLogApi;
    }

    public static final /* synthetic */ TossDomainLogApi IAuthTabCallback(AFj1nSDK1 aFj1nSDK1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossDomainLogApi tossDomainLogApi = aFj1nSDK1.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return tossDomainLogApi;
    }

    public /* bridge */ boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.IAuthTabCallback(th);
        }
        super.IAuthTabCallback(th);
        throw null;
    }

    public /* bridge */ Object onExtraCallback(@NotNull Throwable th, @NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onExtraCallback(th, list, access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = super.onExtraCallback(th, list, access13800Var);
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 35;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = onextracallbackwithresult.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(obj);
                Result.Companion companion = Result.Companion;
                TossDomainLogApi tossDomainLogApiIAuthTabCallback = IAuthTabCallback(this);
                TossDomainLogApi.LogItems logItems = new TossDomainLogApi.LogItems(list);
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(list);
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.I$1 = 0;
                onextracallbackwithresult.label = 1;
                if (tossDomainLogApiIAuthTabCallback.onWarmupCompleted(logItems, onextracallbackwithresult) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Result.m31constructorimpl(Unit.INSTANCE);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
    }
}
