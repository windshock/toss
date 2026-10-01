package o;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getImageKey<E> extends setBgColor<E, Set<? extends E>, HashSet<E>> {
    private final SerialDescriptor onExtraCallbackWithResult;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Set<E> onNavigationEvent(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull HashSet<E> hashSet, int i) {
        Intrinsics.checkNotNullParameter(hashSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getImageKey(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onExtraCallbackWithResult = new getBuildModel(kSerializer.getDescriptor());
    }

    @Override // o.getTimeOutListener, kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public HashSet<E> onExtraCallbackWithResult() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int onWarmupCompleted(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public HashSet<E> IAuthTabCallback(@NotNull Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull HashSet<E> hashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(hashSet, "");
        hashSet.add(e);
    }
}
