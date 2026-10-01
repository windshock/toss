package im.toss.rn.toss.core.bundle.cache;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnBundleFileProcessLock {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final RnBundleFileProcessLock onExtraCallbackWithResult = new RnBundleFileProcessLock();
    private static final ConcurrentHashMap<String, ReentrantLock> IAuthTabCallback = new ConcurrentHashMap<>();

    private RnBundleFileProcessLock() {
    }

    static {
        int i = onExtraCallback + 125;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ConcurrentHashMap<String, ReentrantLock> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMap = IAuthTabCallback;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public final File onExtraCallback(@NotNull File file) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(file, "");
            file.getParentFile();
            throw null;
        }
        Intrinsics.checkNotNullParameter(file, "");
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            int i3 = onNavigationEvent + 33;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            parentFile = file;
        }
        return new File(parentFile, file.getName() + ".lock");
    }
}
