package o;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.markers.KMutableList;
import o.getMemoryMappingsOrBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getProcessUptime<E> extends getMemoryMappingsOrBuilder<E>, getRevisionBytes<E> {

    public interface onExtraCallback<E> extends List<E>, getOpenFdsOrBuilder<E>, KMutableList {
        getProcessUptime<E> IAuthTabCallback();
    }

    onExtraCallback<E> IAuthTabCallback();

    getProcessUptime<E> onWarmupCompleted(E e);

    getProcessUptime<E> onWarmupCompleted(@NotNull Collection<? extends E> collection);

    public static final class onNavigationEvent {
        public static <E> getMemoryMappingsOrBuilder<E> IAuthTabCallback(@NotNull getProcessUptime<? extends E> getprocessuptime, int i, int i2) {
            return getMemoryMappingsOrBuilder.onExtraCallback.IAuthTabCallback(getprocessuptime, i, i2);
        }
    }
}
