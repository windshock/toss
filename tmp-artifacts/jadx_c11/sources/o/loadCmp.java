package o;

import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setLogBuffers;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadCmp implements hasSupportedCmp {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Inject
    public loadCmp() {
    }

    @Override // o.hasSupportedCmp
    public long onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!z) {
            return onExtraCallbackWithResult;
        }
        long j = onExtraCallback;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return j;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        setRevision setrevision = setRevision.SECONDS;
        onExtraCallback = setCommandLine.onWarmupCompleted(30, setrevision);
        onExtraCallbackWithResult = setCommandLine.onWarmupCompleted(1, setrevision);
        int i = onWarmupCompleted + 99;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }
}
