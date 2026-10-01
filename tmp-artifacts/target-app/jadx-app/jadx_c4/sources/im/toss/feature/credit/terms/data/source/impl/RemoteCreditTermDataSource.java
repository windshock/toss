package im.toss.feature.credit.terms.data.source.impl;

import im.toss.feature.credit.terms.network.response.IntegrationTermsResponse;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.CrashOptimizeSwitch;
import o.GeckoHubImp;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addANROptimizeMonitorLog;
import o.enableSensorServiceContextOpt;
import o.getQuestionnaireOptSwitch;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteCreditTermDataSource {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final getQuestionnaireOptSwitch onNavigationEvent;

    @Inject
    public RemoteCreditTermDataSource(@NotNull getQuestionnaireOptSwitch getquestionnaireoptswitch) {
        Intrinsics.checkNotNullParameter(getquestionnaireoptswitch, "");
        this.onNavigationEvent = getquestionnaireoptswitch;
    }

    public static final /* synthetic */ getQuestionnaireOptSwitch onNavigationEvent(RemoteCreditTermDataSource remoteCreditTermDataSource) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getQuestionnaireOptSwitch getquestionnaireoptswitch = remoteCreditTermDataSource.onNavigationEvent;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getquestionnaireoptswitch;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull CrashOptimizeSwitch crashOptimizeSwitch, @NotNull access13800<? super Result<enableSensorServiceContextOpt>> access13800Var) {
        RemoteCreditTermDataSource$getCreditTerms$1 remoteCreditTermDataSource$getCreditTerms$1;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        Object obj = null;
        if (!(!(access13800Var instanceof RemoteCreditTermDataSource$getCreditTerms$1))) {
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((RemoteCreditTermDataSource$getCreditTerms$1) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            remoteCreditTermDataSource$getCreditTerms$1 = (RemoteCreditTermDataSource$getCreditTerms$1) access13800Var;
            int i4 = remoteCreditTermDataSource$getCreditTerms$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                remoteCreditTermDataSource$getCreditTerms$1.label = i4 - 2147483648;
            } else {
                remoteCreditTermDataSource$getCreditTerms$1 = new RemoteCreditTermDataSource$getCreditTerms$1(this, access13800Var);
            }
        }
        Object objOnExtraCallback = remoteCreditTermDataSource$getCreditTerms$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = remoteCreditTermDataSource$getCreditTerms$1.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1 remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1 = new RemoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1(null, this, crashOptimizeSwitch);
                remoteCreditTermDataSource$getCreditTerms$1.L$0 = access15400.onNavigationEvent(crashOptimizeSwitch);
                remoteCreditTermDataSource$getCreditTerms$1.L$1 = access15400.onNavigationEvent(remoteCreditTermDataSource$getCreditTerms$1);
                remoteCreditTermDataSource$getCreditTerms$1.I$0 = 0;
                remoteCreditTermDataSource$getCreditTerms$1.I$1 = 0;
                remoteCreditTermDataSource$getCreditTerms$1.I$2 = 0;
                remoteCreditTermDataSource$getCreditTerms$1.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, remoteCreditTermDataSource$getCreditTermsgIAlus$$inlined$safeApiCall$1, remoteCreditTermDataSource$getCreditTerms$1);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallbackWithResult + 113;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            objOnNavigationEvent = Result.constructor-impl(objOnExtraCallback);
        } catch (Exception e) {
            Result.Companion companion2 = Result.Companion;
            objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e));
            int i8 = onExtraCallback + 23;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = Result.Companion;
            objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
        if (Result.onNavigationEvent(objOnNavigationEvent)) {
            Result.Companion companion4 = Result.Companion;
            objOnNavigationEvent = addANROptimizeMonitorLog.onNavigationEvent((IntegrationTermsResponse) objOnNavigationEvent);
        }
        return Result.constructor-impl(objOnNavigationEvent);
    }
}
