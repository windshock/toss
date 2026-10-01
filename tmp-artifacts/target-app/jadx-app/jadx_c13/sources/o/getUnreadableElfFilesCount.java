package o;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getUnreadableElfFilesCount<T extends Comparable<? super T>> {
    boolean contains(@NotNull T t);

    T getEndInclusive();

    T getStart();

    boolean isEmpty();

    public static final class IAuthTabCallback {
        public static <T extends Comparable<? super T>> boolean onExtraCallback(@NotNull getUnreadableElfFilesCount<T> getunreadableelffilescount, @NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return t.compareTo(getunreadableelffilescount.getStart()) >= 0 && t.compareTo(getunreadableelffilescount.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean onWarmupCompleted(@NotNull getUnreadableElfFilesCount<T> getunreadableelffilescount) {
            return getunreadableelffilescount.getStart().compareTo(getunreadableelffilescount.getEndInclusive()) > 0;
        }
    }
}
