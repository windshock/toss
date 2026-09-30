package o;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ul1<E> extends setBgColor<E, Set<? extends E>, LinkedHashSet<E>> {
    private final SerialDescriptor IAuthTabCallback;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Set<E> onNavigationEvent(@NotNull LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull LinkedHashSet<E> linkedHashSet, int i) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul1(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.IAuthTabCallback = new setShouldInvisible(kSerializer.getDescriptor());
    }

    @Override // o.getTimeOutListener, kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> onExtraCallbackWithResult() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onWarmupCompleted(@NotNull LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> IAuthTabCallback(@NotNull Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull LinkedHashSet<E> linkedHashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        linkedHashSet.add(e);
    }
}
