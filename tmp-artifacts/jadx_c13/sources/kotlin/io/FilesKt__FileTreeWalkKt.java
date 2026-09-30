package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import o.access16000;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class FilesKt__FileTreeWalkKt extends FilesKt__FileReadWriteKt {
    public static /* synthetic */ access16000 walk$default(File file, FileWalkDirection fileWalkDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return walk(file, fileWalkDirection);
    }

    public static final access16000 walk(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(fileWalkDirection, "");
        return new access16000(file, fileWalkDirection);
    }

    public static access16000 walkTopDown(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return walk(file, FileWalkDirection.TOP_DOWN);
    }

    public static final access16000 walkBottomUp(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return walk(file, FileWalkDirection.BOTTOM_UP);
    }
}
