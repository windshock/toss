package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda9 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnWarmupCompleted = DocumentWalletJoinLoadingActivity.onWarmupCompleted(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnWarmupCompleted;
    }
}
