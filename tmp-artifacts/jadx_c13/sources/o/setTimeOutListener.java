package o;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.setTimeOutListener;
import o.uu;
import o.vbt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTimeOutListener extends setAnimationsLoop {
    private final vbt IAuthTabCallback;
    private final Lazy onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTimeOutListener(@NotNull final String str, final int i) {
        super(str, null, i, 2, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = vbt.onExtraCallbackWithResult.onWarmupCompleted;
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.serialization.internal.EnumDescriptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setTimeOutListener.onExtraCallback(i, str, this);
            }
        });
    }

    @Override // o.setAnimationsLoop, kotlinx.serialization.descriptors.SerialDescriptor
    public vbt IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    private final SerialDescriptor[] IAuthTabCallbackStub() {
        return (SerialDescriptor[]) this.onExtraCallbackWithResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] onExtraCallback(int i, String str, setTimeOutListener settimeoutlistener) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            serialDescriptorArr[i2] = ujb.IAuthTabCallback(str + '.' + settimeoutlistener.onWarmupCompleted(i2), uu.onExtraCallback.onExtraCallbackWithResult, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    @Override // o.setAnimationsLoop, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor onNavigationEvent(int i) {
        return IAuthTabCallbackStub()[i];
    }

    @Override // o.setAnimationsLoop
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.IAuthTabCallback() == vbt.onExtraCallbackWithResult.onWarmupCompleted && Intrinsics.areEqual(onExtraCallbackWithResult(), serialDescriptor.onExtraCallbackWithResult()) && Intrinsics.areEqual(setImageLottieTosPath.IAuthTabCallback(this), setImageLottieTosPath.IAuthTabCallback(serialDescriptor));
    }

    @Override // o.setAnimationsLoop
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(tx.onExtraCallbackWithResult(this), ", ", onExtraCallbackWithResult() + '(', ")", 0, null, null, 56, null);
    }

    @Override // o.setAnimationsLoop
    public int hashCode() {
        int iHashCode = onExtraCallbackWithResult().hashCode();
        Iterator<String> it = tx.onExtraCallbackWithResult(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            String next = it.next();
            iHashCode2 = (iHashCode2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }
}
