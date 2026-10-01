package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RemoveHighlightV3Handler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(RemoveHighlightV3Handler.onNavigationEvent((String) obj, (String) obj2));
        int i4 = onWarmupCompleted + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
