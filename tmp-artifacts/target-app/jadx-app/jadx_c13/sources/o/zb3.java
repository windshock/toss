package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class zb3 {
    private static final hfycx onNavigationEvent = new truycx(access8000.IAuthTabCallback(), access8000.IAuthTabCallback(), access8000.IAuthTabCallback(), access8000.IAuthTabCallback(), access8000.IAuthTabCallback(), false);

    public static final hfycx onExtraCallback() {
        return onNavigationEvent;
    }

    public static final hfycx onExtraCallback(@NotNull hfycx hfycxVar, @NotNull hfycx hfycxVar2) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(hfycxVar2, "");
        hfzb hfzbVar = new hfzb();
        hfzbVar.IAuthTabCallback(hfycxVar);
        hfzbVar.IAuthTabCallback(hfycxVar2);
        return hfzbVar.onNavigationEvent();
    }
}
