package o;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda3 {
    private static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
    private static final ShaderBrushSpanExternalSyntheticLambda0<Object, Object> onExtraCallbackWithResult = new onWarmupCompleted();
    private final Pools.onExtraCallback<List<Throwable>> IAuthTabCallbackStub;
    private final onNavigationEvent onExtraCallback;
    private final List<IAuthTabCallback<?, ?>> onNavigationEvent;
    private final Set<IAuthTabCallback<?, ?>> onWarmupCompleted;

    public AndroidViewBindingKtExternalSyntheticLambda3(@NonNull Pools.onExtraCallback<List<Throwable>> onextracallback) {
        this(onextracallback, IAuthTabCallback);
    }

    AndroidViewBindingKtExternalSyntheticLambda3(@NonNull Pools.onExtraCallback<List<Throwable>> onextracallback, @NonNull onNavigationEvent onnavigationevent) {
        this.onNavigationEvent = new ArrayList();
        this.onWarmupCompleted = new HashSet();
        this.IAuthTabCallbackStub = onextracallback;
        this.onExtraCallback = onnavigationevent;
    }

    <Model, Data> void onWarmupCompleted(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ResolvedTextDirection<? extends Model, ? extends Data> resolvedTextDirection) {
        synchronized (this) {
            onExtraCallbackWithResult(cls, cls2, resolvedTextDirection, true);
        }
    }

    private <Model, Data> void onExtraCallbackWithResult(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ResolvedTextDirection<? extends Model, ? extends Data> resolvedTextDirection, boolean z) {
        IAuthTabCallback<?, ?> iAuthTabCallback = new IAuthTabCallback<>(cls, cls2, resolvedTextDirection);
        List<IAuthTabCallback<?, ?>> list = this.onNavigationEvent;
        list.add(z ? list.size() : 0, iAuthTabCallback);
    }

    <Model> List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>> onWarmupCompleted(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (IAuthTabCallback<?, ?> iAuthTabCallback : this.onNavigationEvent) {
                    if (!this.onWarmupCompleted.contains(iAuthTabCallback) && iAuthTabCallback.onNavigationEvent(cls)) {
                        this.onWarmupCompleted.add(iAuthTabCallback);
                        arrayList.add(onExtraCallback(iAuthTabCallback));
                        this.onWarmupCompleted.remove(iAuthTabCallback);
                    }
                }
            } catch (Throwable th) {
                this.onWarmupCompleted.clear();
                throw th;
            }
        }
        return arrayList;
    }

    List<Class<?>> onExtraCallbackWithResult(@NonNull Class<?> cls) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (IAuthTabCallback<?, ?> iAuthTabCallback : this.onNavigationEvent) {
                if (!arrayList.contains(iAuthTabCallback.IAuthTabCallback) && iAuthTabCallback.onNavigationEvent(cls)) {
                    arrayList.add(iAuthTabCallback.IAuthTabCallback);
                }
            }
        }
        return arrayList;
    }

    public <Model, Data> ShaderBrushSpanExternalSyntheticLambda0<Model, Data> onWarmupCompleted(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (IAuthTabCallback<?, ?> iAuthTabCallback : this.onNavigationEvent) {
                    if (this.onWarmupCompleted.contains(iAuthTabCallback)) {
                        z = true;
                    } else if (iAuthTabCallback.IAuthTabCallback(cls, cls2)) {
                        this.onWarmupCompleted.add(iAuthTabCallback);
                        arrayList.add(onExtraCallback(iAuthTabCallback));
                        this.onWarmupCompleted.remove(iAuthTabCallback);
                    }
                }
                if (arrayList.size() > 1) {
                    return this.onExtraCallback.onWarmupCompleted(arrayList, this.IAuthTabCallbackStub);
                }
                if (arrayList.size() == 1) {
                    return (ShaderBrushSpanExternalSyntheticLambda0) arrayList.get(0);
                }
                if (z) {
                    return onNavigationEvent();
                }
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            } catch (Throwable th) {
                this.onWarmupCompleted.clear();
                throw th;
            }
        }
    }

    private <Model, Data> ShaderBrushSpanExternalSyntheticLambda0<Model, Data> onExtraCallback(@NonNull IAuthTabCallback<?, ?> iAuthTabCallback) {
        return (ShaderBrushSpanExternalSyntheticLambda0) markHierarchyDirty.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallback.IAuthTabCallback(this));
    }

    private static <Model, Data> ShaderBrushSpanExternalSyntheticLambda0<Model, Data> onNavigationEvent() {
        return (ShaderBrushSpanExternalSyntheticLambda0<Model, Data>) onExtraCallbackWithResult;
    }

    static class IAuthTabCallback<Model, Data> {
        final Class<Data> IAuthTabCallback;
        final ResolvedTextDirection<? extends Model, ? extends Data> onExtraCallback;
        private final Class<Model> onNavigationEvent;

        public IAuthTabCallback(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ResolvedTextDirection<? extends Model, ? extends Data> resolvedTextDirection) {
            this.onNavigationEvent = cls;
            this.IAuthTabCallback = cls2;
            this.onExtraCallback = resolvedTextDirection;
        }

        public boolean IAuthTabCallback(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return onNavigationEvent(cls) && this.IAuthTabCallback.isAssignableFrom(cls2);
        }

        public boolean onNavigationEvent(@NonNull Class<?> cls) {
            return this.onNavigationEvent.isAssignableFrom(cls);
        }
    }

    static class onNavigationEvent {
        onNavigationEvent() {
        }

        public <Model, Data> AndroidViewBindingKtExternalSyntheticLambda1<Model, Data> onWarmupCompleted(@NonNull List<ShaderBrushSpanExternalSyntheticLambda0<Model, Data>> list, @NonNull Pools.onExtraCallback<List<Throwable>> onextracallback) {
            return new AndroidViewBindingKtExternalSyntheticLambda1<>(list, onextracallback);
        }
    }

    static class onWarmupCompleted implements ShaderBrushSpanExternalSyntheticLambda0<Object, Object> {
        @Override // o.ShaderBrushSpanExternalSyntheticLambda0
        public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Object> onNavigationEvent(@NonNull Object obj, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
            return null;
        }

        @Override // o.ShaderBrushSpanExternalSyntheticLambda0
        public boolean onNavigationEvent(@NonNull Object obj) {
            return false;
        }

        onWarmupCompleted() {
        }
    }
}
