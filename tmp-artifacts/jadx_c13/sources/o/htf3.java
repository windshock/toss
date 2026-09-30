package o;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf3;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class htf3 {
    public static final int onExtraCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull SerialDescriptor[] serialDescriptorArr) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(serialDescriptorArr, "");
        int iHashCode = serialDescriptor.onExtraCallbackWithResult().hashCode();
        int iHashCode2 = Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> iterableOnNavigationEvent = tx.onNavigationEvent(serialDescriptor);
        Iterator<SerialDescriptor> it = iterableOnNavigationEvent.iterator();
        int iHashCode3 = 1;
        int i = 1;
        while (true) {
            int iHashCode4 = 0;
            if (!it.hasNext()) {
                break;
            }
            String strOnExtraCallbackWithResult = it.next().onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                iHashCode4 = strOnExtraCallbackWithResult.hashCode();
            }
            i = (i * 31) + iHashCode4;
        }
        Iterator<SerialDescriptor> it2 = iterableOnNavigationEvent.iterator();
        while (it2.hasNext()) {
            vbt vbtVarIAuthTabCallback = it2.next().IAuthTabCallback();
            iHashCode3 = (iHashCode3 * 31) + (vbtVarIAuthTabCallback != null ? vbtVarIAuthTabCallback.hashCode() : 0);
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode3;
    }

    public static final String onWarmupCompleted(@NotNull final SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return CollectionsKt___CollectionsKt.joinToString$default(RangesKt___RangesKt.until(0, serialDescriptor.onExtraCallback()), ", ", serialDescriptor.onExtraCallbackWithResult() + '(', ")", 0, null, new Function1() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return htf3.onWarmupCompleted(serialDescriptor, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onWarmupCompleted(SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.onWarmupCompleted(i) + ": " + serialDescriptor.onNavigationEvent(i).onExtraCallbackWithResult();
    }
}
