package o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.alibaba.ariver.kernel.RVParams;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.ResourceRecycler;
import com.bumptech.glide.request.ResourceCallback;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0;
import o.LayoutIntrinsics_androidKtExternalSyntheticLambda0;
import o.SaversKtExternalSyntheticLambda56;
import o.SaversKtExternalSyntheticLambda60;
import o.forceLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda57 implements SaversKtExternalSyntheticLambda6, FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult, SaversKtExternalSyntheticLambda60.IAuthTabCallback {
    private static final boolean onExtraCallback = Log.isLoggable("Engine", 2);
    private final SaversKtExternalSyntheticLambda49 IAuthTabCallback;
    private final SaversKtExternalSyntheticLambda8 IAuthTabCallbackStub;
    private final SaversKtExternalSyntheticLambda61 asBinder;
    private final ResourceRecycler asInterface;
    private final onExtraCallback onExtraCallbackWithResult;
    private final FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 onNavigationEvent;
    private final onWarmupCompleted onTransact;
    private final onExtraCallbackWithResult onWarmupCompleted;

    public SaversKtExternalSyntheticLambda57(FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0, LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda02, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda03, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda04, boolean z) {
        this(fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0, onnavigationevent, typefaceRequestCacheExternalSyntheticLambda0, typefaceRequestCacheExternalSyntheticLambda02, typefaceRequestCacheExternalSyntheticLambda03, typefaceRequestCacheExternalSyntheticLambda04, null, null, null, null, null, null, z);
    }

    SaversKtExternalSyntheticLambda57(FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0, LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda02, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda03, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda04, SaversKtExternalSyntheticLambda8 saversKtExternalSyntheticLambda8, SaversKtExternalSyntheticLambda61 saversKtExternalSyntheticLambda61, SaversKtExternalSyntheticLambda49 saversKtExternalSyntheticLambda49, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, ResourceRecycler resourceRecycler, boolean z) {
        this.onNavigationEvent = fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0;
        onExtraCallback onextracallback = new onExtraCallback(onnavigationevent);
        this.onExtraCallbackWithResult = onextracallback;
        SaversKtExternalSyntheticLambda49 saversKtExternalSyntheticLambda492 = saversKtExternalSyntheticLambda49 == null ? new SaversKtExternalSyntheticLambda49(z) : saversKtExternalSyntheticLambda49;
        this.IAuthTabCallback = saversKtExternalSyntheticLambda492;
        saversKtExternalSyntheticLambda492.onExtraCallbackWithResult(this);
        this.asBinder = saversKtExternalSyntheticLambda61 == null ? new SaversKtExternalSyntheticLambda61() : saversKtExternalSyntheticLambda61;
        this.IAuthTabCallbackStub = saversKtExternalSyntheticLambda8 == null ? new SaversKtExternalSyntheticLambda8() : saversKtExternalSyntheticLambda8;
        this.onTransact = onwarmupcompleted == null ? new onWarmupCompleted(typefaceRequestCacheExternalSyntheticLambda0, typefaceRequestCacheExternalSyntheticLambda02, typefaceRequestCacheExternalSyntheticLambda03, typefaceRequestCacheExternalSyntheticLambda04, this, this) : onwarmupcompleted;
        this.onWarmupCompleted = onextracallbackwithresult == null ? new onExtraCallbackWithResult(onextracallback) : onextracallbackwithresult;
        this.asInterface = resourceRecycler == null ? new ResourceRecycler() : resourceRecycler;
        fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0.onNavigationEvent(this);
    }

    public <R> IAuthTabCallback IAuthTabCallback(SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, Object obj, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, int i2, int i3, Class<?> cls, Class<R> cls2, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58, Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> map, boolean z, boolean z2, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor) {
        long jIAuthTabCallback = onExtraCallback ? getSharedValues.IAuthTabCallback() : 0L;
        SaversKtExternalSyntheticLambda59 saversKtExternalSyntheticLambda59OnExtraCallback = this.asBinder.onExtraCallback(obj, saversKtExternalSyntheticLambda26, i2, i3, map, cls, cls2, saversKtExternalSyntheticLambda30);
        synchronized (this) {
            SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60IAuthTabCallback = IAuthTabCallback(saversKtExternalSyntheticLambda59OnExtraCallback, z3, jIAuthTabCallback);
            if (saversKtExternalSyntheticLambda60IAuthTabCallback == null) {
                return onNavigationEvent(saversKtExternalSyntheticLambda10, obj, saversKtExternalSyntheticLambda26, i2, i3, cls, cls2, saversKtExternalSyntheticLambda11, saversKtExternalSyntheticLambda58, map, z, z2, saversKtExternalSyntheticLambda30, z3, z4, z5, z6, resourceCallback, executor, saversKtExternalSyntheticLambda59OnExtraCallback, jIAuthTabCallback);
            }
            resourceCallback.IAuthTabCallback(saversKtExternalSyntheticLambda60IAuthTabCallback, SaversKtExternalSyntheticLambda21.MEMORY_CACHE, false);
            return null;
        }
    }

    private <R> IAuthTabCallback onNavigationEvent(SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, Object obj, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, int i2, int i3, Class<?> cls, Class<R> cls2, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58, Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> map, boolean z, boolean z2, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor, SaversKtExternalSyntheticLambda59 saversKtExternalSyntheticLambda59, long j) {
        SaversKtExternalSyntheticLambda55<?> saversKtExternalSyntheticLambda55OnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult(saversKtExternalSyntheticLambda59, z6);
        if (saversKtExternalSyntheticLambda55OnExtraCallbackWithResult != null) {
            saversKtExternalSyntheticLambda55OnExtraCallbackWithResult.onExtraCallbackWithResult(resourceCallback, executor);
            if (onExtraCallback) {
                IAuthTabCallback("Added to existing load", j, saversKtExternalSyntheticLambda59);
            }
            return new IAuthTabCallback(resourceCallback, saversKtExternalSyntheticLambda55OnExtraCallbackWithResult);
        }
        SaversKtExternalSyntheticLambda55<R> saversKtExternalSyntheticLambda55IAuthTabCallback = this.onTransact.IAuthTabCallback(saversKtExternalSyntheticLambda59, z3, z4, z5, z6);
        SaversKtExternalSyntheticLambda56<R> saversKtExternalSyntheticLambda56OnExtraCallback = this.onWarmupCompleted.onExtraCallback(saversKtExternalSyntheticLambda10, obj, saversKtExternalSyntheticLambda59, saversKtExternalSyntheticLambda26, i2, i3, cls, cls2, saversKtExternalSyntheticLambda11, saversKtExternalSyntheticLambda58, map, z, z2, z6, saversKtExternalSyntheticLambda30, saversKtExternalSyntheticLambda55IAuthTabCallback);
        this.IAuthTabCallbackStub.onExtraCallback(saversKtExternalSyntheticLambda59, saversKtExternalSyntheticLambda55IAuthTabCallback);
        saversKtExternalSyntheticLambda55IAuthTabCallback.onExtraCallbackWithResult(resourceCallback, executor);
        saversKtExternalSyntheticLambda55IAuthTabCallback.IAuthTabCallback(saversKtExternalSyntheticLambda56OnExtraCallback);
        if (onExtraCallback) {
            IAuthTabCallback("Started new load", j, saversKtExternalSyntheticLambda59);
        }
        return new IAuthTabCallback(resourceCallback, saversKtExternalSyntheticLambda55IAuthTabCallback);
    }

    private SaversKtExternalSyntheticLambda60<?> IAuthTabCallback(SaversKtExternalSyntheticLambda59 saversKtExternalSyntheticLambda59, boolean z, long j) {
        if (!z) {
            return null;
        }
        SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60IAuthTabCallback = IAuthTabCallback(saversKtExternalSyntheticLambda59);
        if (saversKtExternalSyntheticLambda60IAuthTabCallback != null) {
            if (onExtraCallback) {
                IAuthTabCallback("Loaded resource from active resources", j, saversKtExternalSyntheticLambda59);
            }
            return saversKtExternalSyntheticLambda60IAuthTabCallback;
        }
        SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60OnExtraCallbackWithResult = onExtraCallbackWithResult(saversKtExternalSyntheticLambda59);
        if (saversKtExternalSyntheticLambda60OnExtraCallbackWithResult == null) {
            return null;
        }
        if (onExtraCallback) {
            IAuthTabCallback("Loaded resource from cache", j, saversKtExternalSyntheticLambda59);
        }
        return saversKtExternalSyntheticLambda60OnExtraCallbackWithResult;
    }

    private static void IAuthTabCallback(String str, long j, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        getSharedValues.onWarmupCompleted(j);
        Objects.toString(saversKtExternalSyntheticLambda26);
    }

    private SaversKtExternalSyntheticLambda60<?> IAuthTabCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60OnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(saversKtExternalSyntheticLambda26);
        if (saversKtExternalSyntheticLambda60OnNavigationEvent != null) {
            saversKtExternalSyntheticLambda60OnNavigationEvent.onWarmupCompleted();
        }
        return saversKtExternalSyntheticLambda60OnNavigationEvent;
    }

    private SaversKtExternalSyntheticLambda60<?> onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60OnExtraCallback = onExtraCallback(saversKtExternalSyntheticLambda26);
        if (saversKtExternalSyntheticLambda60OnExtraCallback != null) {
            saversKtExternalSyntheticLambda60OnExtraCallback.onWarmupCompleted();
            this.IAuthTabCallback.onWarmupCompleted(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda60OnExtraCallback);
        }
        return saversKtExternalSyntheticLambda60OnExtraCallback;
    }

    private SaversKtExternalSyntheticLambda60<?> onExtraCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        Resource<?> resourceIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(saversKtExternalSyntheticLambda26);
        if (resourceIAuthTabCallback == null) {
            return null;
        }
        if (resourceIAuthTabCallback instanceof SaversKtExternalSyntheticLambda60) {
            return (SaversKtExternalSyntheticLambda60) resourceIAuthTabCallback;
        }
        return new SaversKtExternalSyntheticLambda60<>(resourceIAuthTabCallback, true, true, saversKtExternalSyntheticLambda26, this);
    }

    public void IAuthTabCallback(Resource<?> resource) {
        if (resource instanceof SaversKtExternalSyntheticLambda60) {
            ((SaversKtExternalSyntheticLambda60) resource).onTransact();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // o.SaversKtExternalSyntheticLambda6
    public void IAuthTabCallback(SaversKtExternalSyntheticLambda55<?> saversKtExternalSyntheticLambda55, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60) {
        synchronized (this) {
            if (saversKtExternalSyntheticLambda60 != null) {
                if (saversKtExternalSyntheticLambda60.asInterface()) {
                    this.IAuthTabCallback.onWarmupCompleted(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda60);
                }
                this.IAuthTabCallbackStub.onWarmupCompleted(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda55);
            } else {
                this.IAuthTabCallbackStub.onWarmupCompleted(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda55);
            }
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda6
    public void onNavigationEvent(SaversKtExternalSyntheticLambda55<?> saversKtExternalSyntheticLambda55, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        synchronized (this) {
            this.IAuthTabCallbackStub.onWarmupCompleted(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda55);
        }
    }

    @Override // o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult
    public void onNavigationEvent(@NonNull Resource<?> resource) {
        this.asInterface.onNavigationEvent(resource, true);
    }

    @Override // o.SaversKtExternalSyntheticLambda60.IAuthTabCallback
    public void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60) {
        this.IAuthTabCallback.onExtraCallbackWithResult(saversKtExternalSyntheticLambda26);
        if (saversKtExternalSyntheticLambda60.asInterface()) {
            this.onNavigationEvent.IAuthTabCallback(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda60);
        } else {
            this.asInterface.onNavigationEvent(saversKtExternalSyntheticLambda60, false);
        }
    }

    public class IAuthTabCallback {
        private final ResourceCallback onExtraCallback;
        private final SaversKtExternalSyntheticLambda55<?> onWarmupCompleted;

        IAuthTabCallback(ResourceCallback resourceCallback, SaversKtExternalSyntheticLambda55<?> saversKtExternalSyntheticLambda55) {
            this.onExtraCallback = resourceCallback;
            this.onWarmupCompleted = saversKtExternalSyntheticLambda55;
        }

        public void IAuthTabCallback() {
            synchronized (SaversKtExternalSyntheticLambda57.this) {
                this.onWarmupCompleted.onWarmupCompleted(this.onExtraCallback);
            }
        }
    }

    static class onExtraCallback implements SaversKtExternalSyntheticLambda56.onExtraCallback {
        private volatile LayoutIntrinsics_androidKtExternalSyntheticLambda0 onExtraCallbackWithResult;
        private final LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent onNavigationEvent;

        onExtraCallback(LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent) {
            this.onNavigationEvent = onnavigationevent;
        }

        @Override // o.SaversKtExternalSyntheticLambda56.onExtraCallback
        public LayoutIntrinsics_androidKtExternalSyntheticLambda0 onExtraCallback() {
            if (this.onExtraCallbackWithResult == null) {
                synchronized (this) {
                    if (this.onExtraCallbackWithResult == null) {
                        this.onExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult();
                    }
                    if (this.onExtraCallbackWithResult == null) {
                        this.onExtraCallbackWithResult = new AndroidLayoutApi34ExternalSyntheticLambda2();
                    }
                }
            }
            return this.onExtraCallbackWithResult;
        }
    }

    static class onExtraCallbackWithResult {
        final SaversKtExternalSyntheticLambda56.onExtraCallback IAuthTabCallback;
        private int onExtraCallbackWithResult;
        final Pools.onExtraCallback<SaversKtExternalSyntheticLambda56<?>> onWarmupCompleted = forceLayout.onNavigationEvent(RVParams.WEBVIEW_FONT_SIZE_LARGER, new forceLayout.onExtraCallbackWithResult<SaversKtExternalSyntheticLambda56<?>>() { // from class: o.SaversKtExternalSyntheticLambda57.onExtraCallbackWithResult.5
            @Override // o.forceLayout.onExtraCallbackWithResult
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public SaversKtExternalSyntheticLambda56<?> IAuthTabCallback() {
                onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.this;
                return new SaversKtExternalSyntheticLambda56<>(onextracallbackwithresult.IAuthTabCallback, onextracallbackwithresult.onWarmupCompleted);
            }
        });

        onExtraCallbackWithResult(SaversKtExternalSyntheticLambda56.onExtraCallback onextracallback) {
            this.IAuthTabCallback = onextracallback;
        }

        <R> SaversKtExternalSyntheticLambda56<R> onExtraCallback(SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10, Object obj, SaversKtExternalSyntheticLambda59 saversKtExternalSyntheticLambda59, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, int i2, int i3, Class<?> cls, Class<R> cls2, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58, Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> map, boolean z, boolean z2, boolean z3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, SaversKtExternalSyntheticLambda56.onWarmupCompleted<R> onwarmupcompleted) {
            SaversKtExternalSyntheticLambda56 saversKtExternalSyntheticLambda56 = (SaversKtExternalSyntheticLambda56) markHierarchyDirty.onExtraCallbackWithResult((SaversKtExternalSyntheticLambda56) this.onWarmupCompleted.onNavigationEvent());
            int i4 = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = i4 + 1;
            return saversKtExternalSyntheticLambda56.onNavigationEvent(saversKtExternalSyntheticLambda10, obj, saversKtExternalSyntheticLambda59, saversKtExternalSyntheticLambda26, i2, i3, cls, cls2, saversKtExternalSyntheticLambda11, saversKtExternalSyntheticLambda58, map, z, z2, z3, saversKtExternalSyntheticLambda30, onwarmupcompleted, i4);
        }
    }

    static class onWarmupCompleted {
        final SaversKtExternalSyntheticLambda6 IAuthTabCallback;
        final TypefaceRequestCacheExternalSyntheticLambda0 asInterface;
        final TypefaceRequestCacheExternalSyntheticLambda0 onExtraCallback;
        final Pools.onExtraCallback<SaversKtExternalSyntheticLambda55<?>> onExtraCallbackWithResult = forceLayout.onNavigationEvent(RVParams.WEBVIEW_FONT_SIZE_LARGER, new forceLayout.onExtraCallbackWithResult<SaversKtExternalSyntheticLambda55<?>>() { // from class: o.SaversKtExternalSyntheticLambda57.onWarmupCompleted.5
            @Override // o.forceLayout.onExtraCallbackWithResult
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public SaversKtExternalSyntheticLambda55<?> IAuthTabCallback() {
                onWarmupCompleted onwarmupcompleted = onWarmupCompleted.this;
                return new SaversKtExternalSyntheticLambda55<>(onwarmupcompleted.onNavigationEvent, onwarmupcompleted.onTransact, onwarmupcompleted.asInterface, onwarmupcompleted.onExtraCallback, onwarmupcompleted.IAuthTabCallback, onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onExtraCallbackWithResult);
            }
        });
        final TypefaceRequestCacheExternalSyntheticLambda0 onNavigationEvent;
        final TypefaceRequestCacheExternalSyntheticLambda0 onTransact;
        final SaversKtExternalSyntheticLambda60.IAuthTabCallback onWarmupCompleted;

        onWarmupCompleted(TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda02, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda03, TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda04, SaversKtExternalSyntheticLambda6 saversKtExternalSyntheticLambda6, SaversKtExternalSyntheticLambda60.IAuthTabCallback iAuthTabCallback) {
            this.onNavigationEvent = typefaceRequestCacheExternalSyntheticLambda0;
            this.onTransact = typefaceRequestCacheExternalSyntheticLambda02;
            this.asInterface = typefaceRequestCacheExternalSyntheticLambda03;
            this.onExtraCallback = typefaceRequestCacheExternalSyntheticLambda04;
            this.IAuthTabCallback = saversKtExternalSyntheticLambda6;
            this.onWarmupCompleted = iAuthTabCallback;
        }

        <R> SaversKtExternalSyntheticLambda55<R> IAuthTabCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((SaversKtExternalSyntheticLambda55) markHierarchyDirty.onExtraCallbackWithResult((SaversKtExternalSyntheticLambda55) this.onExtraCallbackWithResult.onNavigationEvent())).onNavigationEvent(saversKtExternalSyntheticLambda26, z, z2, z3, z4);
        }
    }
}
