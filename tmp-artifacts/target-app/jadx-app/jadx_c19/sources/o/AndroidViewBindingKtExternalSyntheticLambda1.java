package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AndroidViewBindingKtExternalSyntheticLambda1<Model, Data> implements ShaderBrushSpanExternalSyntheticLambda0<Model, Data> {
    private final List<ShaderBrushSpanExternalSyntheticLambda0<Model, Data>> onExtraCallbackWithResult;
    private final Pools.onExtraCallback<List<Throwable>> onNavigationEvent;

    AndroidViewBindingKtExternalSyntheticLambda1(@NonNull List<ShaderBrushSpanExternalSyntheticLambda0<Model, Data>> list, @NonNull Pools.onExtraCallback<List<Throwable>> onextracallback) {
        this.onExtraCallbackWithResult = list;
        this.onNavigationEvent = onextracallback;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Model model, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onextracallbackwithresultOnNavigationEvent;
        int size = this.onExtraCallbackWithResult.size();
        ArrayList arrayList = new ArrayList(size);
        SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26 = null;
        for (int i4 = 0; i4 < size; i4++) {
            ShaderBrushSpanExternalSyntheticLambda0<Model, Data> shaderBrushSpanExternalSyntheticLambda0 = this.onExtraCallbackWithResult.get(i4);
            if (shaderBrushSpanExternalSyntheticLambda0.onNavigationEvent(model) && (onextracallbackwithresultOnNavigationEvent = shaderBrushSpanExternalSyntheticLambda0.onNavigationEvent(model, i2, i3, saversKtExternalSyntheticLambda30)) != null) {
                saversKtExternalSyntheticLambda26 = onextracallbackwithresultOnNavigationEvent.IAuthTabCallback;
                arrayList.add(onextracallbackwithresultOnNavigationEvent.onExtraCallback);
            }
        }
        if (arrayList.isEmpty() || saversKtExternalSyntheticLambda26 == null) {
            return null;
        }
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(saversKtExternalSyntheticLambda26, new onWarmupCompleted(arrayList, this.onNavigationEvent));
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Model model) {
        Iterator<ShaderBrushSpanExternalSyntheticLambda0<Model, Data>> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            if (it.next().onNavigationEvent(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.onExtraCallbackWithResult.toArray()) + '}';
    }

    static class onWarmupCompleted<Data> implements SaversKtExternalSyntheticLambda35<Data>, SaversKtExternalSyntheticLambda35.onNavigationEvent<Data> {
        private SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data> IAuthTabCallback;
        private final Pools.onExtraCallback<List<Throwable>> asBinder;
        private List<Throwable> onExtraCallback;
        private final List<SaversKtExternalSyntheticLambda35<Data>> onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private SaversKtExternalSyntheticLambda11 onTransact;
        private int onWarmupCompleted;

        onWarmupCompleted(@NonNull List<SaversKtExternalSyntheticLambda35<Data>> list, @NonNull Pools.onExtraCallback<List<Throwable>> onextracallback) {
            this.asBinder = onextracallback;
            markHierarchyDirty.IAuthTabCallback(list);
            this.onExtraCallbackWithResult = list;
            this.onWarmupCompleted = 0;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data> onnavigationevent) {
            this.onTransact = saversKtExternalSyntheticLambda11;
            this.IAuthTabCallback = onnavigationevent;
            this.onExtraCallback = (List) this.asBinder.onNavigationEvent();
            this.onExtraCallbackWithResult.get(this.onWarmupCompleted).onExtraCallback(saversKtExternalSyntheticLambda11, this);
            if (this.onNavigationEvent) {
                onExtraCallbackWithResult();
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
            List<Throwable> list = this.onExtraCallback;
            if (list != null) {
                this.asBinder.onWarmupCompleted(list);
            }
            this.onExtraCallback = null;
            Iterator<SaversKtExternalSyntheticLambda35<Data>> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                it.next().onExtraCallback();
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
            this.onNavigationEvent = true;
            Iterator<SaversKtExternalSyntheticLambda35<Data>> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                it.next().onExtraCallbackWithResult();
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<Data> onNavigationEvent() {
            return this.onExtraCallbackWithResult.get(0).onNavigationEvent();
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return this.onExtraCallbackWithResult.get(0).IAuthTabCallback();
        }

        @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
        public void onExtraCallback(@Nullable Data data) {
            if (data != null) {
                this.IAuthTabCallback.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Data>) data);
            } else {
                onWarmupCompleted();
            }
        }

        @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
        public void onExtraCallback(@NonNull Exception exc) {
            ((List) markHierarchyDirty.onExtraCallbackWithResult(this.onExtraCallback)).add(exc);
            onWarmupCompleted();
        }

        private void onWarmupCompleted() {
            if (this.onNavigationEvent) {
                return;
            }
            if (this.onWarmupCompleted < this.onExtraCallbackWithResult.size() - 1) {
                this.onWarmupCompleted++;
                onExtraCallback(this.onTransact, this.IAuthTabCallback);
            } else {
                markHierarchyDirty.onExtraCallbackWithResult(this.onExtraCallback);
                this.IAuthTabCallback.onExtraCallback((Exception) new SaversKtExternalSyntheticLambda7("Fetch failed", new ArrayList(this.onExtraCallback)));
            }
        }
    }
}
