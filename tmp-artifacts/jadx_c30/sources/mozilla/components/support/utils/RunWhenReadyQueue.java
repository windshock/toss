package mozilla.components.support.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.findRes;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RunWhenReadyQueue {
    private final AtomicBoolean onExtraCallback;
    private final List<Function0<Unit>> onExtraCallbackWithResult;
    private final findResAndMsg onNavigationEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunWhenReadyQueue() {
        findResAndMsg findresandmsg = null;
        this(findresandmsg, 1, findresandmsg);
    }

    public RunWhenReadyQueue(@NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(findresandmsg, BuildConfig.FLAVOR);
        this.onNavigationEvent = findresandmsg;
        this.onExtraCallbackWithResult = new ArrayList();
        this.onExtraCallback = new AtomicBoolean(false);
    }

    public /* synthetic */ RunWhenReadyQueue(findResAndMsg findresandmsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? findRes.onExtraCallbackWithResult() : findresandmsg);
    }
}
