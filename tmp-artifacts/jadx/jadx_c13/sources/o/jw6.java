package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class jw6<T> implements getPlayDelayedELExpressTimeS<T> {
    private final List<lt1<T>> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public jw6(@NotNull List<? extends lt1<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = list;
    }

    public final List<lt1<T>> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "ConcatenatedFormatStructure(" + CollectionsKt___CollectionsKt.joinToString$default(this.onWarmupCompleted, ", ", null, null, 0, null, null, 62, null) + ')';
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof jw6) && Intrinsics.areEqual(this.onWarmupCompleted, ((jw6) obj).onWarmupCompleted);
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        List<lt1<T>> list = this.onWarmupCompleted;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((lt1) it.next()).onExtraCallback());
        }
        return ycxdj.onExtraCallback(arrayList);
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        List<lt1<T>> list = this.onWarmupCompleted;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((lt1) it.next()).onExtraCallbackWithResult());
        }
        if (arrayList.size() == 1) {
            return (ltlud) CollectionsKt___CollectionsKt.single((List) arrayList);
        }
        return new ltdj(arrayList);
    }
}
