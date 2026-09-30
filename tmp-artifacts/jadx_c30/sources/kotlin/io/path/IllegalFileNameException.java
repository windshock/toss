package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IllegalFileNameException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(@NotNull Path path, @Nullable Path path2, @Nullable String str) {
        super(path.toString(), path2 != null ? path2.toString() : null, str);
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(@NotNull Path path) {
        this(path, null, null);
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
    }
}
