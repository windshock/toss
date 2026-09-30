package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2ImportCert implements AutoCloseable {
    private final transV2SendReceiverInfo IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;

    public transV2ImportCert(@NotNull transV2SendReceiverInfo transv2sendreceiverinfo, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(transv2sendreceiverinfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = transv2sendreceiverinfo;
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
    }

    public final boolean onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.IAuthTabCallback.onExtraCallback(this.onExtraCallback, this.onExtraCallbackWithResult, str, str2);
    }

    public final boolean onWarmupCompleted(boolean z) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult, z);
    }

    public final boolean onNavigationEvent() {
        return this.IAuthTabCallback.onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.IAuthTabCallback.onExtraCallbackWithResult(this.onExtraCallback, this.onExtraCallbackWithResult);
    }
}
