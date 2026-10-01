package o;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class clearCurrentBacktrace extends addUnreadableElfFiles {
    public static final String sK_(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? BuildConfig.FLAVOR : string;
    }

    public static final Path sN_(@NotNull Path path, @NotNull Path path2) {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        try {
            return addAllMemoryDump.onExtraCallbackWithResult.rV_(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    public static /* synthetic */ List sM_(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return sL_(path, str);
    }

    public static final List<Path> sL_(@NotNull Path path, @NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            Intrinsics.checkNotNull(directoryStreamNewDirectoryStream);
            List<Path> list = CollectionsKt.toList(directoryStreamNewDirectoryStream);
            CloseableKt.closeFinally(directoryStreamNewDirectoryStream, (Throwable) null);
            return list;
        } finally {
        }
    }
}
