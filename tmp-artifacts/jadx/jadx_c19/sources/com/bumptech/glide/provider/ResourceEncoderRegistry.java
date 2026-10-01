package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceEncoderRegistry {
    private final List<Entry<?>> onExtraCallback = new ArrayList();

    public <Z> void onNavigationEvent(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        synchronized (this) {
            this.onExtraCallback.add(new Entry<>(cls, resourceEncoder));
        }
    }

    public <Z> ResourceEncoder<Z> onExtraCallback(@NonNull Class<Z> cls) {
        synchronized (this) {
            int size = this.onExtraCallback.size();
            for (int i2 = 0; i2 < size; i2++) {
                Entry<?> entry = this.onExtraCallback.get(i2);
                if (entry.onExtraCallback(cls)) {
                    return (ResourceEncoder<Z>) entry.onWarmupCompleted;
                }
            }
            return null;
        }
    }

    static final class Entry<T> {
        private final Class<T> onNavigationEvent;
        final ResourceEncoder<T> onWarmupCompleted;

        Entry(@NonNull Class<T> cls, @NonNull ResourceEncoder<T> resourceEncoder) {
            this.onNavigationEvent = cls;
            this.onWarmupCompleted = resourceEncoder;
        }

        boolean onExtraCallback(@NonNull Class<?> cls) {
            return this.onNavigationEvent.isAssignableFrom(cls);
        }
    }
}
