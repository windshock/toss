package im.toss.core.tracker;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppSetIdAndScope1;
import o.access13800;
import o.ea10;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemoteProcessLogDrainCoordinator {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final RemoteProcessLogIngressStore IAuthTabCallback;
    private final AppSetIdAndScope1 onExtraCallback;
    private final Function2<RemoteProcessLogEnvelope, access13800<? super Unit>, Object> onWarmupCompleted;

    public RemoteProcessLogDrainCoordinator(@NotNull RemoteProcessLogIngressStore remoteProcessLogIngressStore, @NotNull Function2<? super RemoteProcessLogEnvelope, ? super access13800<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(remoteProcessLogIngressStore, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = remoteProcessLogIngressStore;
        this.onWarmupCompleted = function2;
        this.onExtraCallback = ea10.onExtraCallbackWithResult("RemoteProcessLogDrain");
    }

    public static final /* synthetic */ RemoteProcessLogIngressStore onNavigationEvent(RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessLogIngressStore remoteProcessLogIngressStore = remoteProcessLogDrainCoordinator.IAuthTabCallback;
        if (i3 == 0) {
            return remoteProcessLogIngressStore;
        }
        throw null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[PHI: r5 r11 r12 r13
      0x0085: PHI (r5v10 java.lang.Object) = (r5v6 java.lang.Object), (r5v6 java.lang.Object), (r5v23 java.lang.Object) binds: [B:46:0x0122, B:48:0x014a, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r11v9 im.toss.core.tracker.RemoteProcessLogIngressStore$ClaimedEnvelope) = 
      (r11v6 im.toss.core.tracker.RemoteProcessLogIngressStore$ClaimedEnvelope)
      (r11v6 im.toss.core.tracker.RemoteProcessLogIngressStore$ClaimedEnvelope)
      (r11v19 im.toss.core.tracker.RemoteProcessLogIngressStore$ClaimedEnvelope)
     binds: [B:46:0x0122, B:48:0x014a, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r12v6 java.util.Iterator) = (r12v3 java.util.Iterator), (r12v3 java.util.Iterator), (r12v14 java.util.Iterator) binds: [B:46:0x0122, B:48:0x014a, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r13v3 java.util.List) = (r13v1 java.util.List), (r13v1 java.util.List), (r13v7 java.util.List) binds: [B:46:0x0122, B:48:0x014a, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0122 -> B:23:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x014a -> B:23:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.core.tracker.RemoteProcessLogDrainCoordinator.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }
}
