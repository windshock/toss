package o;

import im.toss.core.tuba.Trigger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDK1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private LinkedHashMap<String, Trigger> IAuthTabCallback;
    private final Object onNavigationEvent = new Object();
    private final List<Function1<List<Trigger>, Unit>> onExtraCallback = new ArrayList();

    public final List<Trigger> onExtraCallback() {
        List<Trigger> list;
        Collection<Trigger> collectionValues;
        synchronized (this.onNavigationEvent) {
            LinkedHashMap<String, Trigger> linkedHashMap = this.IAuthTabCallback;
            list = (linkedHashMap == null || (collectionValues = linkedHashMap.values()) == null) ? null : CollectionsKt.toList(collectionValues);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull List<Trigger> list) {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this.onNavigationEvent) {
            LinkedHashMap<String, Trigger> linkedHashMap = new LinkedHashMap<>();
            for (Object obj : list) {
                linkedHashMap.put(((Trigger) obj).onNavigationEvent(), obj);
            }
            this.IAuthTabCallback = linkedHashMap;
            onExtraCallback(list);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent() {
        synchronized (this.onNavigationEvent) {
            this.IAuthTabCallback = null;
            onExtraCallback(null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted(@NotNull Function1<? super List<Trigger>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        synchronized (this.onNavigationEvent) {
            this.onExtraCallback.add(function1);
        }
    }

    private final void onExtraCallback(List<Trigger> list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = this.onExtraCallback.iterator();
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(list);
        }
    }
}
