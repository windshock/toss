package o;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access17200 {
    private int IAuthTabCallback;
    private final List<Exception> onExtraCallback;
    private Path onNavigationEvent;
    private final int onWarmupCompleted;

    public access17200() {
        this(0, 1, null);
    }

    public access17200(int i) {
        this.onWarmupCompleted = i;
        this.onExtraCallback = new ArrayList();
    }

    public /* synthetic */ access17200(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public final int onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final List<Exception> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final Path rP_() {
        return this.onNavigationEvent;
    }

    public final void rQ_(@Nullable Path path) {
        this.onNavigationEvent = path;
    }

    public final void rN_(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Path path2 = this.onNavigationEvent;
        this.onNavigationEvent = path2 != null ? path2.resolve(path) : null;
    }

    public final void rO_(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, BuildConfig.FLAVOR);
        Path path2 = this.onNavigationEvent;
        if (!Intrinsics.areEqual(path, path2 != null ? path2.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path3 = this.onNavigationEvent;
        this.onNavigationEvent = path3 != null ? path3.getParent() : null;
    }

    public final void onNavigationEvent(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
        this.IAuthTabCallback++;
        if (this.onExtraCallback.size() < this.onWarmupCompleted) {
            Path path = this.onNavigationEvent;
            if (path != null) {
                Throwable thInitCause = addAllBacktraceNote.rS_(String.valueOf(path)).initCause(exc);
                Intrinsics.checkNotNull(thInitCause, BuildConfig.FLAVOR);
                exc = access17100.rR_(thInitCause);
            }
            this.onExtraCallback.add(exc);
        }
    }
}
