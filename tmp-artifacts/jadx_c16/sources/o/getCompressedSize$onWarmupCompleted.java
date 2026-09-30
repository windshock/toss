package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o.getCompressedSize;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getCompressedSize$onWarmupCompleted {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    static final /* synthetic */ getCompressedSize$onWarmupCompleted onNavigationEvent = new getCompressedSize$onWarmupCompleted();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    private getCompressedSize$onWarmupCompleted() {
    }

    public final getCompressedSize IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Response response = Response.onNavigationEvent;
        getCompressedSize getcompressedsizeOnSessionEnded = ((getCompressedSize.IAuthTabCallback) Response.onExtraCallback(context, getCompressedSize.IAuthTabCallback.class)).onSessionEnded();
        int i4 = onWarmupCompleted + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getcompressedsizeOnSessionEnded;
        }
        throw null;
    }
}
