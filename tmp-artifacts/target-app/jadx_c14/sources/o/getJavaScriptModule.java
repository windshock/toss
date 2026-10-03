package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getJavaScriptModule extends isTestMode {
    private List<addOperation> onNavigationEvent = new ArrayList();
    private List<addOperation> onExtraCallback = new ArrayList();

    public final void IAuthTabCallback(@NotNull List<addOperation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<addOperation> onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final void onNavigationEvent(@NotNull List<addOperation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = list;
    }

    public final List<addOperation> onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final boolean onNavigationEvent(@NotNull addOperation addoperation) {
        Intrinsics.checkNotNullParameter(addoperation, "");
        List<addOperation> list = this.onNavigationEvent;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.areEqual(((addOperation) it.next()).IAuthTabCallbackDefault(), addoperation.IAuthTabCallbackDefault())) {
                return true;
            }
        }
        return false;
    }
}
