package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
import o.ProducerSequenceFactoryExternalSyntheticLambda5;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanProductFailureActivity f$0;
    public final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 f$1;
    public final /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda5 f$2;

    public /* synthetic */ LoanProductFailureActivity$$ExternalSyntheticLambda2(LoanProductFailureActivity loanProductFailureActivity, DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0, ProducerSequenceFactoryExternalSyntheticLambda5 producerSequenceFactoryExternalSyntheticLambda5) {
        this.f$0 = loanProductFailureActivity;
        this.f$1 = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
        this.f$2 = producerSequenceFactoryExternalSyntheticLambda5;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            LoanProductFailureActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanProductFailureActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
