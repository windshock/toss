package o;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetSubjectKeyIdentifier implements certGetPublicKeyAlgorithmType {
    private final generateAesIV IAuthTabCallback;
    private final Set<generateAesIV> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public certGetSubjectKeyIdentifier(@NotNull Set<? extends generateAesIV> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.onExtraCallbackWithResult = set;
        this.IAuthTabCallback = (generateAesIV) CollectionsKt___CollectionsKt.first(set);
    }

    public final Set<generateAesIV> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.certGetPublicKeyAlgorithmType
    public generateAesIV IAuthTabCallback() {
        return this.IAuthTabCallback;
    }
}
