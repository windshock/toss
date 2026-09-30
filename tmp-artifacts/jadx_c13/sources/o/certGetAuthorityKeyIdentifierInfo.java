package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetAuthorityKeyIdentifierInfo {
    private final decryptRSA onExtraCallback;
    private final Set<certGetAuthorityKeyIdentifierInfo> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof certGetAuthorityKeyIdentifierInfo)) {
            return false;
        }
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo = (certGetAuthorityKeyIdentifierInfo) obj;
        return Intrinsics.areEqual(this.onExtraCallback, certgetauthoritykeyidentifierinfo.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, certgetauthoritykeyidentifierinfo.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "PathNode(state=" + this.onExtraCallback + ", children=" + this.onExtraCallbackWithResult + ")";
    }

    public certGetAuthorityKeyIdentifierInfo(@NotNull decryptRSA decryptrsa, @NotNull Set<certGetAuthorityKeyIdentifierInfo> set) {
        Intrinsics.checkNotNullParameter(decryptrsa, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.onExtraCallback = decryptrsa;
        this.onExtraCallbackWithResult = set;
    }

    public final decryptRSA onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final Set<certGetAuthorityKeyIdentifierInfo> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }
}
