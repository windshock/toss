package o;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextForegroundStyleExternalSyntheticLambda1 {
    private final AndroidViewBindingKtExternalSyntheticLambda3 IAuthTabCallback;
    private final IAuthTabCallback onExtraCallback;

    public TextForegroundStyleExternalSyntheticLambda1(@NonNull Pools.onExtraCallback<List<Throwable>> onextracallback) {
        this(new AndroidViewBindingKtExternalSyntheticLambda3(onextracallback));
    }

    private TextForegroundStyleExternalSyntheticLambda1(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
        this.onExtraCallback = new IAuthTabCallback();
        this.IAuthTabCallback = androidViewBindingKtExternalSyntheticLambda3;
    }

    public <Model, Data> void onExtraCallbackWithResult(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ResolvedTextDirection<? extends Model, ? extends Data> resolvedTextDirection) {
        synchronized (this) {
            this.IAuthTabCallback.onWarmupCompleted(cls, cls2, resolvedTextDirection);
            this.onExtraCallback.onExtraCallbackWithResult();
        }
    }

    public <A> List<ShaderBrushSpanExternalSyntheticLambda0<A, ?>> IAuthTabCallback(@NonNull A a) {
        List<ShaderBrushSpanExternalSyntheticLambda0<A, ?>> listOnExtraCallback = onExtraCallback(onNavigationEvent(a));
        if (listOnExtraCallback.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a);
        }
        int size = listOnExtraCallback.size();
        List<ShaderBrushSpanExternalSyntheticLambda0<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            ShaderBrushSpanExternalSyntheticLambda0<A, ?> shaderBrushSpanExternalSyntheticLambda0 = listOnExtraCallback.get(i2);
            if (shaderBrushSpanExternalSyntheticLambda0.onNavigationEvent(a)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i2);
                    z = false;
                }
                arrayList.add(shaderBrushSpanExternalSyntheticLambda0);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a, listOnExtraCallback);
        }
        return arrayList;
    }

    public List<Class<?>> onWarmupCompleted(@NonNull Class<?> cls) {
        List<Class<?>> listOnExtraCallbackWithResult;
        synchronized (this) {
            listOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(cls);
        }
        return listOnExtraCallbackWithResult;
    }

    private <A> List<ShaderBrushSpanExternalSyntheticLambda0<A, ?>> onExtraCallback(@NonNull Class<A> cls) {
        List<ShaderBrushSpanExternalSyntheticLambda0<A, ?>> listIAuthTabCallback;
        synchronized (this) {
            listIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(cls);
            if (listIAuthTabCallback == null) {
                listIAuthTabCallback = Collections.unmodifiableList(this.IAuthTabCallback.onWarmupCompleted(cls));
                this.onExtraCallback.onExtraCallbackWithResult(cls, listIAuthTabCallback);
            }
        }
        return listIAuthTabCallback;
    }

    private static <A> Class<A> onNavigationEvent(@NonNull A a) {
        return (Class<A>) a.getClass();
    }

    static class IAuthTabCallback {
        private final Map<Class<?>, onWarmupCompleted<?>> onExtraCallbackWithResult = new HashMap();

        IAuthTabCallback() {
        }

        public void onExtraCallbackWithResult() {
            this.onExtraCallbackWithResult.clear();
        }

        public <Model> void onExtraCallbackWithResult(Class<Model> cls, List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>> list) {
            if (this.onExtraCallbackWithResult.put(cls, new onWarmupCompleted<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }

        public <Model> List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>> IAuthTabCallback(Class<Model> cls) {
            onWarmupCompleted<?> onwarmupcompleted = this.onExtraCallbackWithResult.get(cls);
            if (onwarmupcompleted == null) {
                return null;
            }
            return (List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>>) onwarmupcompleted.onWarmupCompleted;
        }

        static class onWarmupCompleted<Model> {
            final List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>> onWarmupCompleted;

            public onWarmupCompleted(List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>> list) {
                this.onWarmupCompleted = list;
            }
        }
    }
}
