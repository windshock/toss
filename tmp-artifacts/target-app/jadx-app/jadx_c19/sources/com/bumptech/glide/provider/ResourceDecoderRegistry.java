package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceDecoderRegistry {
    private final List<String> onExtraCallback = new ArrayList();
    private final Map<String, List<Entry<?, ?>>> onWarmupCompleted = new HashMap();

    public void onWarmupCompleted(@NonNull List<String> list) {
        synchronized (this) {
            ArrayList<String> arrayList = new ArrayList(this.onExtraCallback);
            this.onExtraCallback.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.onExtraCallback.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.onExtraCallback.add(str);
                }
            }
        }
    }

    public <T, R> List<ResourceDecoder<T, R>> onWarmupCompleted(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<String> it = this.onExtraCallback.iterator();
            while (it.hasNext()) {
                List<Entry<?, ?>> list = this.onWarmupCompleted.get(it.next());
                if (list != null) {
                    for (Entry<?, ?> entry : list) {
                        if (entry.onNavigationEvent(cls, cls2)) {
                            arrayList.add(entry.onExtraCallback);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public <T, R> List<Class<R>> onExtraCallbackWithResult(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator<String> it = this.onExtraCallback.iterator();
            while (it.hasNext()) {
                List<Entry<?, ?>> list = this.onWarmupCompleted.get(it.next());
                if (list != null) {
                    for (Entry<?, ?> entry : list) {
                        if (entry.onNavigationEvent(cls, cls2) && !arrayList.contains(entry.onWarmupCompleted)) {
                            arrayList.add(entry.onWarmupCompleted);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public <T, R> void onExtraCallbackWithResult(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        synchronized (this) {
            IAuthTabCallback(str).add(new Entry<>(cls, cls2, resourceDecoder));
        }
    }

    private List<Entry<?, ?>> IAuthTabCallback(@NonNull String str) {
        List<Entry<?, ?>> arrayList;
        synchronized (this) {
            if (!this.onExtraCallback.contains(str)) {
                this.onExtraCallback.add(str);
            }
            arrayList = this.onWarmupCompleted.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.onWarmupCompleted.put(str, arrayList);
            }
        }
        return arrayList;
    }

    static class Entry<T, R> {
        final ResourceDecoder<T, R> onExtraCallback;
        private final Class<T> onExtraCallbackWithResult;
        final Class<R> onWarmupCompleted;

        public Entry(@NonNull Class<T> cls, @NonNull Class<R> cls2, ResourceDecoder<T, R> resourceDecoder) {
            this.onExtraCallbackWithResult = cls;
            this.onWarmupCompleted = cls2;
            this.onExtraCallback = resourceDecoder;
        }

        public boolean onNavigationEvent(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.onExtraCallbackWithResult.isAssignableFrom(cls) && cls2.isAssignableFrom(this.onWarmupCompleted);
        }
    }
}
