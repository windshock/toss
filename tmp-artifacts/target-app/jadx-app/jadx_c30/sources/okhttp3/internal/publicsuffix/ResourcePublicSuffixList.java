package okhttp3.internal.publicsuffix;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity42;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final Companion Companion = new Companion(null);
    public static final TTFullScreenVideoActivity3 PUBLIC_SUFFIX_RESOURCE = TTFullScreenVideoActivity3.onExtraCallback.IAuthTabCallback(TTFullScreenVideoActivity3.Companion, "okhttp3/internal/publicsuffix/" + PublicSuffixDatabase.class.getSimpleName() + ".list", false, 1, (Object) null);
    private final FileSystem fileSystem;
    private final TTFullScreenVideoActivity3 path;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResourcePublicSuffixList() {
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity3 = null;
        this(tTFullScreenVideoActivity3, tTFullScreenVideoActivity3, 3, tTFullScreenVideoActivity3);
    }

    public ResourcePublicSuffixList(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(fileSystem, BuildConfig.FLAVOR);
        this.path = tTFullScreenVideoActivity3;
        this.fileSystem = fileSystem;
    }

    public /* synthetic */ ResourcePublicSuffixList(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, FileSystem fileSystem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : tTFullScreenVideoActivity3, (i & 2) != 0 ? FileSystem.RESOURCES : fileSystem);
    }

    public TTFullScreenVideoActivity3 getPath() {
        return this.path;
    }

    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    public TTHistoryActivity42 listSource() {
        return this.fileSystem.source(getPath());
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
