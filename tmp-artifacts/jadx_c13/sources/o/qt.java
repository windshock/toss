package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class qt {
    private final List<String> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private List<? extends Annotation> onExtraCallback;
    private final List<List<Annotation>> onExtraCallbackWithResult;
    private final List<Boolean> onNavigationEvent;
    private final Set<String> onTransact;
    private final List<SerialDescriptor> onWarmupCompleted;

    public qt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackDefault = str;
        this.onExtraCallback = CollectionsKt__CollectionsKt.emptyList();
        this.IAuthTabCallback = new ArrayList();
        this.onTransact = new HashSet();
        this.onWarmupCompleted = new ArrayList();
        this.onExtraCallbackWithResult = new ArrayList();
        this.onNavigationEvent = new ArrayList();
    }

    public final List<Annotation> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final void onNavigationEvent(@NotNull List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = list;
    }

    public final List<String> onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final List<SerialDescriptor> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final List<List<Annotation>> IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final List<Boolean> onNavigationEvent() {
        return this.onNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(qt qtVar, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        qtVar.onExtraCallback(str, serialDescriptor, list, z);
    }

    public final void onExtraCallback(@NotNull String str, @NotNull SerialDescriptor serialDescriptor, @NotNull List<? extends Annotation> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!this.onTransact.add(str)) {
            throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.IAuthTabCallbackDefault).toString());
        }
        this.IAuthTabCallback.add(str);
        this.onWarmupCompleted.add(serialDescriptor);
        this.onExtraCallbackWithResult.add(list);
        this.onNavigationEvent.add(Boolean.valueOf(z));
    }
}
