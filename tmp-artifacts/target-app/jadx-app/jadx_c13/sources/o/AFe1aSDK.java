package o;

import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1aSDK implements RetrofitInstance {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final AFd1zSDK IAuthTabCallback;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = AFe1aSDK.this.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted == access14100.onExtraCallback()) {
                int i4 = onNavigationEvent + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnWarmupCompleted);
            int i6 = onNavigationEvent + 45;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 36 / 0;
            }
            return resultIAuthTabCallback;
        }
    }

    @Inject
    public AFe1aSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.IAuthTabCallback = aFd1zSDK;
    }

    public static final /* synthetic */ AFd1zSDK onExtraCallbackWithResult(AFe1aSDK aFe1aSDK) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        AFd1zSDK aFd1zSDK = aFe1aSDK.IAuthTabCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    public /* bridge */ Object onExtraCallback(@NotNull Throwable th, @NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onExtraCallback(th, list, access13800Var);
        }
        super.onExtraCallback(th, list, access13800Var);
        throw null;
    }

    public boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            AFd1kSDK.onNavigationEvent.onNavigationEvent(th);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        boolean zOnNavigationEvent = AFd1kSDK.onNavigationEvent.onNavigationEvent(th);
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i4 - 2147483648;
                int i5 = onWarmupCompleted + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = onextracallbackwithresult.label;
        try {
            if (i7 != 0) {
                int i8 = onWarmupCompleted;
                int i9 = i8 + 41;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0 ? i7 != 1 : i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i8 + 61;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (list.isEmpty()) {
                    Result.Companion companion = Result.Companion;
                    return Result.m31constructorimpl(Unit.INSTANCE);
                }
                Result.Companion companion2 = Result.Companion;
                AFd1zSDK aFd1zSDKOnExtraCallbackWithResult = onExtraCallbackWithResult(this);
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(list);
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.I$1 = 0;
                onextracallbackwithresult.label = 1;
                if (aFd1zSDKOnExtraCallbackWithResult.onExtraCallbackWithResult(list, onextracallbackwithresult) == objOnExtraCallback) {
                    int i12 = onNavigationEvent + 75;
                    int i13 = i12 % 128;
                    onWarmupCompleted = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 31;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    return objOnExtraCallback;
                }
            }
            return Result.m31constructorimpl(Unit.INSTANCE);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion3 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion4 = Result.Companion;
            Object objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            int i17 = onWarmupCompleted + 13;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            return objM31constructorimpl;
        }
    }
}
