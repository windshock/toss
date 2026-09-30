package im.toss.di;

import im.toss.features.mydata.ui.funnel.session.MydataSessionManager;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.Type;
import o.findResAndMsg;
import o.setCharset;
import o.visitLabel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MydataHelperModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final MydataHelperModule onExtraCallbackWithResult = new MydataHelperModule();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 25;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private MydataHelperModule() {
    }

    @Singleton
    public final Type onNavigationEvent(@NotNull MydataSessionManager mydataSessionManager, @NotNull setCharset setcharset, @NotNull findResAndMsg findresandmsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mydataSessionManager, "");
        Intrinsics.checkNotNullParameter(setcharset, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        visitLabel visitlabel = new visitLabel(mydataSessionManager, setcharset, findresandmsg);
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return visitlabel;
    }
}
