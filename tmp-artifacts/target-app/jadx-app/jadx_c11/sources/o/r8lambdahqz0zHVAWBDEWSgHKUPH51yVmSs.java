package o;

import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.response.UserSpecialTermsResponse;
import im.toss.standardtermsv2.model.GetSpecialTermsAgreedState;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs.this.IAuthTabCallback(this);
            if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objIAuthTabCallback);
            }
            int i4 = onExtraCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    @Inject
    public r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super Result<GetSpecialTermsAgreedState>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Object obj;
        int i;
        Object objOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i6 = i4 + 61;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i8 = onwarmupcompleted.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i8 - 2147483648;
                int i9 = onNavigationEvent + 11;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj2 = onwarmupcompleted.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i11 = onwarmupcompleted.label;
        try {
            if (i11 == 0) {
                ResultKt.onNavigationEvent(obj2);
                Result.Companion companion = Result.Companion;
                playerStopped playerstoppedIAuthTabCallback = playerStopped.Companion.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                objOnWarmupCompleted = playerstoppedIAuthTabCallback.onWarmupCompleted(onwarmupcompleted);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i12 = onWarmupCompleted + 53;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj2);
                objOnWarmupCompleted = ((Result) obj2).onNavigationEvent();
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            UserSpecialTermsResponse userSpecialTermsResponse = (UserSpecialTermsResponse) objOnWarmupCompleted;
            return Result.constructor-impl(new GetSpecialTermsAgreedState(userSpecialTermsResponse.onExtraCallback().onExtraCallbackWithResult(), userSpecialTermsResponse.onExtraCallback().onNavigationEvent(), userSpecialTermsResponse.IAuthTabCallback().onExtraCallbackWithResult(), userSpecialTermsResponse.IAuthTabCallback().onNavigationEvent(), userSpecialTermsResponse.IAuthTabCallback().onExtraCallback(), userSpecialTermsResponse.IAuthTabCallback().onWarmupCompleted()));
        } catch (Exception e) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e));
            int i14 = onNavigationEvent + 5;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            i = onWarmupCompleted + 55;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i16 = 55 / 0;
            }
            return obj;
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e2));
            i = onWarmupCompleted + 55;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
            }
            return obj;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
