package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetSignAlgType implements certGetSerial {
    private final Object IAuthTabCallback;
    private final certGetOCSPAddress onExtraCallbackWithResult;

    public certGetSignAlgType(@NotNull certGetOCSPAddress certgetocspaddress, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(certgetocspaddress, "");
        this.onExtraCallbackWithResult = certgetocspaddress;
        this.IAuthTabCallback = obj;
    }
}
