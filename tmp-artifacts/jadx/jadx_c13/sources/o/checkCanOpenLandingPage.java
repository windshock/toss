package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class checkCanOpenLandingPage<E> extends setBgColor<E, List<? extends E>, ArrayList<E>> {
    private final SerialDescriptor onExtraCallback;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public List<E> onNavigationEvent(@NotNull ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public checkCanOpenLandingPage(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onExtraCallback = new checkSizeValid(kSerializer.getDescriptor());
    }

    @Override // o.getTimeOutListener, kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> onExtraCallbackWithResult() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onWarmupCompleted(@NotNull ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> IAuthTabCallback(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull ArrayList<E> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.getTimeOutListener
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(@NotNull ArrayList<E> arrayList, int i, E e) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.add(i, e);
    }
}
