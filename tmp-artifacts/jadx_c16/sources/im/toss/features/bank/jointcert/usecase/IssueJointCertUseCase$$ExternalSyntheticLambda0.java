package im.toss.features.bank.jointcert.usecase;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils7;
import o.analyseAngular;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IssueJointCertUseCase$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = analyseAngular.onNavigationEvent((TypeUtils7) obj);
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
