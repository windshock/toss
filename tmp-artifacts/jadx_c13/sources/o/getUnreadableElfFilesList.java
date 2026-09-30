package o;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getUnreadableElfFilesList<T extends Comparable<? super T>> extends getUnreadableElfFilesCount<T> {
    boolean IAuthTabCallback(@NotNull T t, @NotNull T t2);

    @Override // o.getUnreadableElfFilesCount, o.access4700
    boolean contains(@NotNull T t);

    @Override // o.getUnreadableElfFilesCount
    boolean isEmpty();
}
