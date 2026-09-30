package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import o.getWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Function0<Iterator<T>> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult(Function0<? extends Iterator<? extends T>> function0) {
            this.onWarmupCompleted = function0;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.onWarmupCompleted.invoke();
        }
    }

    private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new onExtraCallbackWithResult(function0);
    }

    public static final <T> Integer collectionSizeOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> int collectionSizeOrDefault(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static <T> List<T> flatten(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        int iCollectionSizeOrDefault = collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(iCollectionSizeOrDefault);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return getWrite.IAuthTabCallback(arrayList, arrayList2);
    }
}
