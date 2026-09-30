package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setHorizontalAlign {
    private final List<onExtraCallback<?, ?>> IAuthTabCallback = new ArrayList();

    public <Z, R> void onExtraCallback(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
        synchronized (this) {
            this.IAuthTabCallback.add(new onExtraCallback<>(cls, cls2, resourceTranscoder));
        }
    }

    public <Z, R> ResourceTranscoder<Z, R> onNavigationEvent(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        synchronized (this) {
            if (cls2.isAssignableFrom(cls)) {
                return setHorizontalGap.onExtraCallbackWithResult();
            }
            for (onExtraCallback<?, ?> onextracallback : this.IAuthTabCallback) {
                if (onextracallback.onNavigationEvent(cls, cls2)) {
                    return (ResourceTranscoder<Z, R>) onextracallback.onExtraCallbackWithResult;
                }
            }
            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
        }
    }

    public <Z, R> List<Class<R>> onExtraCallback(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (onExtraCallback<?, ?> onextracallback : this.IAuthTabCallback) {
                if (onextracallback.onNavigationEvent(cls, cls2) && !arrayList.contains(onextracallback.IAuthTabCallback)) {
                    arrayList.add(onextracallback.IAuthTabCallback);
                }
            }
            return arrayList;
        }
    }

    static final class onExtraCallback<Z, R> {
        final Class<R> IAuthTabCallback;
        final ResourceTranscoder<Z, R> onExtraCallbackWithResult;
        final Class<Z> onWarmupCompleted;

        onExtraCallback(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
            this.onWarmupCompleted = cls;
            this.IAuthTabCallback = cls2;
            this.onExtraCallbackWithResult = resourceTranscoder;
        }

        public boolean onNavigationEvent(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.onWarmupCompleted.isAssignableFrom(cls) && cls2.isAssignableFrom(this.IAuthTabCallback);
        }
    }
}
