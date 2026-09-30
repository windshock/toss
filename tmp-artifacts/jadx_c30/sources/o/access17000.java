package o;

import com.applovin.shadow.okio.NioSystemFileSystem$;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access17000 {
    public static final access17000 onExtraCallback = new access17000();
    private static final LinkOption[] onExtraCallbackWithResult = {NioSystemFileSystem$.ExternalSyntheticApiModelOutline1.m()};
    private static final LinkOption[] onNavigationEvent = new LinkOption[0];
    private static final Set<FileVisitOption> IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback();
    private static final Set<FileVisitOption> onWarmupCompleted = clearFaultAdjacentMetadata.onExtraCallback(FileVisitOption.FOLLOW_LINKS);

    private access17000() {
    }

    public final LinkOption[] rT_(boolean z) {
        return z ? onNavigationEvent : onExtraCallbackWithResult;
    }
}
