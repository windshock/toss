package o;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class addAllMemoryDump {
    public static final addAllMemoryDump onExtraCallbackWithResult = new addAllMemoryDump();
    private static final Path onWarmupCompleted = Paths.get(BuildConfig.FLAVOR, new String[0]);
    private static final Path onExtraCallback = Paths.get("..", new String[0]);

    private addAllMemoryDump() {
    }

    public final Path rV_(@NotNull Path path, @NotNull Path path2) {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        Path pathNormalize = path2.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i = 0; i < iMin; i++) {
            Path name = pathNormalize.getName(i);
            Path path3 = onExtraCallback;
            if (!Intrinsics.areEqual(name, path3)) {
                break;
            }
            if (!Intrinsics.areEqual(pathNormalize2.getName(i), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(pathNormalize2, pathNormalize) || !Intrinsics.areEqual(pathNormalize, onWarmupCompleted)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, BuildConfig.FLAVOR);
            pathNormalize2 = StringsKt.endsWith$default(string, separator, false, 2, (Object) null) ? pathRelativize.getFileSystem().getPath(StringsKt.dropLast(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        Intrinsics.checkNotNull(pathNormalize2);
        return pathNormalize2;
    }
}
