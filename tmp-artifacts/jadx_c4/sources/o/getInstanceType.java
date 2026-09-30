package o;

import im.toss.di.EnvironmentsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getInstanceType implements captureStartValues<IdGeneratorExternalSyntheticLambda0> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final EnvironmentsModule onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda0 idGeneratorExternalSyntheticLambda0OnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return idGeneratorExternalSyntheticLambda0OnExtraCallback;
    }

    public IdGeneratorExternalSyntheticLambda0 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnvironmentsModule environmentsModule = this.onWarmupCompleted;
        if (i3 == 0) {
            return onExtraCallbackWithResult(environmentsModule);
        }
        onExtraCallbackWithResult(environmentsModule);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static IdGeneratorExternalSyntheticLambda0 onExtraCallbackWithResult(EnvironmentsModule environmentsModule) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda0 idGeneratorExternalSyntheticLambda0 = (IdGeneratorExternalSyntheticLambda0) createAnimator.onNavigationEvent(environmentsModule.onExtraCallbackWithResult());
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return idGeneratorExternalSyntheticLambda0;
    }
}
