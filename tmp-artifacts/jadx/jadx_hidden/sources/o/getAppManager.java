package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class getAppManager implements getPageByIndex {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(getAppManager.class);
    private final List<getExtensionManager> onExtraCallbackWithResult;

    public getAppManager(@NotNull List<? extends getEngineProxy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i = 2 % 2;
        while (!(!it.hasNext())) {
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 28) & 1) == 0) {
                ((getEngineProxy) it.next()).onNavigationEvent();
                throw null;
            }
            CollectionsKt.addAll(arrayList, ((getEngineProxy) it.next()).onNavigationEvent());
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
        }
        this.onExtraCallbackWithResult = arrayList;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getAppManager(@NotNull getEngineProxy... getengineproxyArr) {
        this((List<? extends getEngineProxy>) ArraysKt.toList(getengineproxyArr));
        Intrinsics.checkNotNullParameter(getengineproxyArr, "");
    }

    @Override // o.getPageByIndex
    public List<getExtensionManager> onWarmupCompleted() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
        List<getExtensionManager> list = this.onExtraCallbackWithResult;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
        return list;
    }
}
