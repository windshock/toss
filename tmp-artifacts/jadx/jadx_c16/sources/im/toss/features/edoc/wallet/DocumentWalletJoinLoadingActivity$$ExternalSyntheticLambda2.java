package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.JsonReaderUnknownNumberParsing;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ DocumentWalletJoinLoadingActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallback = DocumentWalletJoinLoadingActivity.onExtraCallback(this.f$0, (JsonReaderUnknownNumberParsing) obj);
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
