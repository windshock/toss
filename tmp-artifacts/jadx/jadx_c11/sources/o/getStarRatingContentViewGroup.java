package o;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getStarRatingContentViewGroup extends getMediaContentViewGroup {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final deprecated_dns onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStarRatingContentViewGroup(@NotNull deprecated_dns deprecated_dnsVar) {
        super(deprecated_dnsVar);
        Intrinsics.checkNotNullParameter(deprecated_dnsVar, "");
        this.onNavigationEvent = deprecated_dnsVar;
    }

    @Override // o.getMediaContentViewGroup
    public /* synthetic */ Interpolator IAuthTabCallback() {
        deprecated_dns deprecated_dnsVarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deprecated_dnsVarOnNavigationEvent = onNavigationEvent();
            int i3 = 57 / 0;
        } else {
            deprecated_dnsVarOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_dnsVarOnNavigationEvent;
        }
        throw null;
    }

    public deprecated_dns onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deprecated_dns deprecated_dnsVar = this.onNavigationEvent;
        int i4 = i3 + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return deprecated_dnsVar;
    }

    public getStarRatingContentViewGroup(double d, double d2) {
        this(new deprecated_dns(d, d2));
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarOnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            return deprecated_dnsVarOnNavigationEvent.IAuthTabCallback();
        }
        deprecated_dnsVarOnNavigationEvent.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
