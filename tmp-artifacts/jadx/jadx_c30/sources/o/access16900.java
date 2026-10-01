package o;

import com.applovin.shadow.okio.NioSystemFileSystem$;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.io.path.CopyActionContext;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access16900 implements CopyActionContext {
    public static final access16900 onExtraCallbackWithResult = new access16900();

    private access16900() {
    }

    @Override // kotlin.io.path.CopyActionContext
    public access16800 rM_(@NotNull Path path, @NotNull Path path2, boolean z) {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        LinkOption[] linkOptionArrRT_ = access17000.onExtraCallback.rT_(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrRT_, linkOptionArrRT_.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) && Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m()}, 1))) {
            Unit unit = Unit.INSTANCE;
        } else {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArrRT_, linkOptionArrRT_.length);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), BuildConfig.FLAVOR);
        }
        return access16800.CONTINUE;
    }
}
