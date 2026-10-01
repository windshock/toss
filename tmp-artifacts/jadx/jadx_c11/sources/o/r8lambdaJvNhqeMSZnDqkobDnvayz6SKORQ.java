package o;

import android.content.Context;
import im.toss.rn.toss.core.otel.TossRnOtelModuleImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ onExtraCallback = new r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ();
    private static final findResAndMsg onWarmupCompleted = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));

    private r8lambdaJvNhqeMSZnDqkobDnvayz6SKORQ() {
    }

    static {
        int i = onNavigationEvent + 99;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        TossRnOtelModuleImpl.Companion.IAuthTabCallback(new hb(((doGetChildCpuTime) Response.onExtraCallback(applicationContext, doGetChildCpuTime.class)).getNavigationEventDispatcher(), onWarmupCompleted));
        int i2 = IAuthTabCallbackStub + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }
}
