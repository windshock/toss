package im.toss.feature.credit.terms.module;

import im.toss.feature.credit.terms.data.source.impl.RemoteCreditTermDataSource;
import im.toss.feature.credit.terms.domain.usecase.RefreshCreditTermGroupCacheUseCase;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.getQuestionnaireOptSwitch;
import o.getTransferTinyThresholdValue;
import o.setConfig;
import o.setSwitchJudgmentListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditTermsModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final CreditTermsModule onWarmupCompleted = new CreditTermsModule();

    static {
        int i = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private CreditTermsModule() {
    }

    @Singleton
    public final RefreshCreditTermGroupCacheUseCase onExtraCallbackWithResult(@NotNull setConfig setconfig) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setconfig, "");
        RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase = new RefreshCreditTermGroupCacheUseCase(setconfig);
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return refreshCreditTermGroupCacheUseCase;
    }

    @Singleton
    public final setConfig onExtraCallbackWithResult(@NotNull setSwitchJudgmentListener setswitchjudgmentlistener, @NotNull RemoteCreditTermDataSource remoteCreditTermDataSource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setswitchjudgmentlistener, "");
        Intrinsics.checkNotNullParameter(remoteCreditTermDataSource, "");
        getTransferTinyThresholdValue gettransfertinythresholdvalue = new getTransferTinyThresholdValue(setswitchjudgmentlistener, remoteCreditTermDataSource);
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return gettransfertinythresholdvalue;
    }

    @Singleton
    public final RemoteCreditTermDataSource onExtraCallbackWithResult(@NotNull getQuestionnaireOptSwitch getquestionnaireoptswitch) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getquestionnaireoptswitch, "");
        RemoteCreditTermDataSource remoteCreditTermDataSource = new RemoteCreditTermDataSource(getquestionnaireoptswitch);
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteCreditTermDataSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final setSwitchJudgmentListener IAuthTabCallback() {
        int i = 2 % 2;
        setSwitchJudgmentListener setswitchjudgmentlistener = new setSwitchJudgmentListener();
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return setswitchjudgmentlistener;
    }
}
