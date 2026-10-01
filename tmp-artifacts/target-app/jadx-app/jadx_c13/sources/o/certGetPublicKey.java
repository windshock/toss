package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetPublicKey implements certGetSerial {
    private final generateAesIV IAuthTabCallback;
    private final Object onWarmupCompleted;

    public certGetPublicKey(@NotNull generateAesIV generateaesiv, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        this.IAuthTabCallback = generateaesiv;
        this.onWarmupCompleted = obj;
    }

    public /* synthetic */ certGetPublicKey(generateAesIV generateaesiv, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(generateaesiv, (i & 2) != 0 ? null : obj);
    }
}
