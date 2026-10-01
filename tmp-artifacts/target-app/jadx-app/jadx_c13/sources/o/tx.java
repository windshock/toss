package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class tx {

    public static final class onExtraCallbackWithResult implements Iterable<String>, KMappedMarker {
        final /* synthetic */ SerialDescriptor onWarmupCompleted;

        public onExtraCallbackWithResult(SerialDescriptor serialDescriptor) {
            this.onWarmupCompleted = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new IAuthTabCallback(this.onWarmupCompleted);
        }
    }

    public static final class onWarmupCompleted implements Iterable<SerialDescriptor>, KMappedMarker {
        final /* synthetic */ SerialDescriptor onWarmupCompleted;

        public onWarmupCompleted(SerialDescriptor serialDescriptor) {
            this.onWarmupCompleted = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<SerialDescriptor> iterator() {
            return new onExtraCallback(this.onWarmupCompleted);
        }
    }

    public static final class onExtraCallback implements Iterator<SerialDescriptor>, KMappedMarker {
        final /* synthetic */ SerialDescriptor onExtraCallbackWithResult;
        private int onNavigationEvent;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallback(SerialDescriptor serialDescriptor) {
            this.onExtraCallbackWithResult = serialDescriptor;
            this.onNavigationEvent = serialDescriptor.onExtraCallback();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onNavigationEvent > 0;
        }

        @Override // java.util.Iterator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.onExtraCallbackWithResult;
            int iOnExtraCallback = serialDescriptor.onExtraCallback();
            int i = this.onNavigationEvent;
            this.onNavigationEvent = i - 1;
            return serialDescriptor.onNavigationEvent(iOnExtraCallback - i);
        }
    }

    public static final Iterable<SerialDescriptor> onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new onWarmupCompleted(serialDescriptor);
    }

    public static final class IAuthTabCallback implements Iterator<String>, KMappedMarker {
        private int IAuthTabCallback;
        final /* synthetic */ SerialDescriptor onNavigationEvent;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IAuthTabCallback(SerialDescriptor serialDescriptor) {
            this.onNavigationEvent = serialDescriptor;
            this.IAuthTabCallback = serialDescriptor.onExtraCallback();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.IAuthTabCallback > 0;
        }

        @Override // java.util.Iterator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.onNavigationEvent;
            int iOnExtraCallback = serialDescriptor.onExtraCallback();
            int i = this.IAuthTabCallback;
            this.IAuthTabCallback = i - 1;
            return serialDescriptor.onWarmupCompleted(iOnExtraCallback - i);
        }
    }

    public static final Iterable<String> onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new onExtraCallbackWithResult(serialDescriptor);
    }
}
