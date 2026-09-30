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
public final class AFj1nSDK3 implements RetrofitInstance {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final TossDomainLogApi onExtraCallback;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = AFj1nSDK3.this.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted == access14100.onExtraCallback()) {
                int i4 = IAuthTabCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnWarmupCompleted);
            int i6 = onWarmupCompleted + 101;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 62 / 0;
            }
            return resultIAuthTabCallback;
        }
    }

    @Inject
    public AFj1nSDK3(@NotNull TossDomainLogApi tossDomainLogApi) {
        Intrinsics.checkNotNullParameter(tossDomainLogApi, "");
        this.onExtraCallback = tossDomainLogApi;
    }

    public static final /* synthetic */ TossDomainLogApi onExtraCallback(AFj1nSDK3 aFj1nSDK3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        TossDomainLogApi tossDomainLogApi = aFj1nSDK3.onExtraCallback;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return tossDomainLogApi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = super.IAuthTabCallback(th);
        int i4 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public /* bridge */ Object onExtraCallback(@NotNull Throwable th, @NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallback(th, list, access13800Var);
        }
        super.onExtraCallback(th, list, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onwarmupcompleted.label;
        try {
            if (i3 != 0) {
                int i4 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Result.Companion companion = Result.Companion;
                TossDomainLogApi tossDomainLogApiOnExtraCallback = onExtraCallback(this);
                TossDomainLogApi.LogItems logItems = new TossDomainLogApi.LogItems(list);
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(list);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                if (tossDomainLogApiOnExtraCallback.IAuthTabCallback(logItems, onwarmupcompleted) == objOnExtraCallback) {
                    int i5 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
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
