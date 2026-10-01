package o;

import java.util.List;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getMemoryMappingsOrBuilder<E> extends List<E>, getOpenFds<E>, KMappedMarker {

    public static final class onExtraCallback {
        public static <E> getMemoryMappingsOrBuilder<E> IAuthTabCallback(@NotNull getMemoryMappingsOrBuilder<? extends E> getmemorymappingsorbuilder, int i, int i2) {
            return new IAuthTabCallback(getmemorymappingsorbuilder, i, i2);
        }
    }

    static final class IAuthTabCallback<E> extends AbstractList<E> implements getMemoryMappingsOrBuilder<E> {
        private final getMemoryMappingsOrBuilder<E> IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private int onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(@NotNull getMemoryMappingsOrBuilder<? extends E> getmemorymappingsorbuilder, int i, int i2) {
            Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
            this.IAuthTabCallback = getmemorymappingsorbuilder;
            this.onExtraCallbackWithResult = i;
            this.onNavigationEvent = i2;
            RegistersComponents.IAuthTabCallback(i, i2, getmemorymappingsorbuilder.size());
            this.onWarmupCompleted = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i) {
            RegistersComponents.onExtraCallbackWithResult(i, this.onWarmupCompleted);
            return this.IAuthTabCallback.get(this.onExtraCallbackWithResult + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onWarmupCompleted;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public getMemoryMappingsOrBuilder<E> subList(int i, int i2) {
            RegistersComponents.IAuthTabCallback(i, i2, this.onWarmupCompleted);
            getMemoryMappingsOrBuilder<E> getmemorymappingsorbuilder = this.IAuthTabCallback;
            int i3 = this.onExtraCallbackWithResult;
            return new IAuthTabCallback(getmemorymappingsorbuilder, i + i3, i3 + i2);
        }
    }
}
