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
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.network.api.TossLogApi;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1mSDK2 implements RetrofitInstance {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final TossLogApi onExtraCallback;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
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
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = AFj1mSDK2.this.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted == access14100.onExtraCallback()) {
                return objOnWarmupCompleted;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnWarmupCompleted);
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return resultIAuthTabCallback;
            }
            throw null;
        }
    }

    @Inject
    public AFj1mSDK2(@NotNull TossLogApi tossLogApi) {
        Intrinsics.checkNotNullParameter(tossLogApi, "");
        this.onExtraCallback = tossLogApi;
    }

    public static final /* synthetic */ TossLogApi onNavigationEvent(AFj1mSDK2 aFj1mSDK2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossLogApi tossLogApi = aFj1mSDK2.onExtraCallback;
        if (i3 != 0) {
            return tossLogApi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = super.IAuthTabCallback(th);
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public /* bridge */ Object onExtraCallback(@NotNull Throwable th, @NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = super.onExtraCallback(th, list, access13800Var);
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull List<JsonObject> list, @NotNull access13800<? super Result<Unit>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Object objM31constructorimpl;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i3 = onwarmupcompleted.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i3 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i4 = onwarmupcompleted.label;
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Result.Companion companion = Result.Companion;
                TossLogApi tossLogApiOnNavigationEvent = onNavigationEvent(this);
                TossLogApi.LogItems logItems = new TossLogApi.LogItems(list);
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(list);
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                if (tossLogApiOnNavigationEvent.onExtraCallback(logItems, onwarmupcompleted) == objOnExtraCallback) {
                    int i5 = onWarmupCompleted + 69;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 47 / 0;
                    }
                    return objOnExtraCallback;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i8 = 8 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            return Result.m31constructorimpl(Unit.INSTANCE);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            i = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i9 = 17 / 0;
            }
            return objM31constructorimpl;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            i = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
            }
            return objM31constructorimpl;
        }
    }
}
