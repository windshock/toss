package im.toss.features.loan.comparison;

import kotlin.jvm.functions.Function1;
import o.ResourceLoadExtension;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonCreditActivity$$ExternalSyntheticLambda12 implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LoanComparisonCreditActivity.onTransact(this.f$0, obj);
            throw null;
        }
        ResourceLoadExtension resourceLoadExtensionOnTransact = LoanComparisonCreditActivity.onTransact(this.f$0, obj);
        int i3 = onNavigationEvent + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return resourceLoadExtensionOnTransact;
    }
}
