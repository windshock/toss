package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getLandingPageClickBegin {
    private int onExtraCallback;
    private final access6900<char[]> onNavigationEvent = new access6900<>();

    protected final char[] onExtraCallback(int i) {
        char[] cArrIAuthTabCallbackDefault;
        synchronized (this) {
            cArrIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            if (cArrIAuthTabCallbackDefault != null) {
                this.onExtraCallback -= cArrIAuthTabCallbackDefault.length;
            } else {
                cArrIAuthTabCallbackDefault = null;
            }
        }
        return cArrIAuthTabCallbackDefault == null ? new char[i] : cArrIAuthTabCallbackDefault;
    }

    protected final void onNavigationEvent(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        synchronized (this) {
            if (this.onExtraCallback + cArr.length < setBeforeTimestamp.IAuthTabCallback) {
                this.onExtraCallback += cArr.length;
                this.onNavigationEvent.addLast(cArr);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
