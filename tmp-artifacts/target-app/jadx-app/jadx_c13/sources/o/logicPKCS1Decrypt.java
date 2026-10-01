package o;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicPKCS1Decrypt implements logicIssueClose {
    private final Set<generateAesIV> onExtraCallback;
    private final generateAesIV onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logicPKCS1Decrypt)) {
            return false;
        }
        logicPKCS1Decrypt logicpkcs1decrypt = (logicPKCS1Decrypt) obj;
        return Intrinsics.areEqual(this.onExtraCallback, logicpkcs1decrypt.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, logicpkcs1decrypt.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "TargetState(targetStates=" + this.onExtraCallback + ", targetState=" + this.onExtraCallbackWithResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public logicPKCS1Decrypt(@NotNull Set<? extends generateAesIV> set, @NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        this.onExtraCallback = set;
        this.onExtraCallbackWithResult = generateaesiv;
        if (IAuthTabCallback().contains(onExtraCallbackWithResult())) {
            return;
        }
        throw new IllegalArgumentException(("Internal logical error, invalid " + Reflection.getOrCreateKotlinClass(logicPKCS1Decrypt.class).getSimpleName() + " construction, this should never happen").toString());
    }

    @Override // o.logicIssueClose
    public Set<generateAesIV> IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public /* synthetic */ logicPKCS1Decrypt(Set set, generateAesIV generateaesiv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? (generateAesIV) CollectionsKt___CollectionsKt.first(set) : generateaesiv);
    }

    @Override // o.logicIssueClose
    public generateAesIV onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }
}
