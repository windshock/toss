package o;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw13<T> implements lt1<T> {
    private final getPlayDelayedELExpressTimeS<T> onExtraCallback;
    private final List<getPlayDelayedELExpressTimeS<T>> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public jw13(@NotNull getPlayDelayedELExpressTimeS<? super T> getplaydelayedelexpresstimes, @NotNull List<? extends getPlayDelayedELExpressTimeS<? super T>> list) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = getplaydelayedelexpresstimes;
        this.onExtraCallbackWithResult = list;
    }

    public final getPlayDelayedELExpressTimeS<T> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final List<getPlayDelayedELExpressTimeS<T>> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "AlternativesParsing(" + this.onExtraCallbackWithResult + ')';
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof jw13)) {
            return false;
        }
        jw13 jw13Var = (jw13) obj;
        return Intrinsics.areEqual(this.onExtraCallback, jw13Var.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, jw13Var.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        listCreateListBuilder.add(this.onExtraCallback.onExtraCallback());
        Iterator<getPlayDelayedELExpressTimeS<T>> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            listCreateListBuilder.add(it.next().onExtraCallback());
        }
        return new ulsya<>(listEmptyList, CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder));
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }
}
