package o;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.SaversKtExternalSyntheticLambda54;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Savers_androidKtExternalSyntheticLambda2<Data, ResourceType, Transcode> {
    private final Pools.onExtraCallback<List<Throwable>> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final List<? extends SaversKtExternalSyntheticLambda54<Data, ResourceType, Transcode>> onNavigationEvent;
    private final Class<Data> onWarmupCompleted;

    public Savers_androidKtExternalSyntheticLambda2(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<SaversKtExternalSyntheticLambda54<Data, ResourceType, Transcode>> list, Pools.onExtraCallback<List<Throwable>> onextracallback) {
        this.onWarmupCompleted = cls;
        this.onExtraCallback = onextracallback;
        this.onNavigationEvent = (List) markHierarchyDirty.IAuthTabCallback(list);
        this.onExtraCallbackWithResult = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Resource<Transcode> IAuthTabCallback(SaversKtExternalSyntheticLambda33<Data> saversKtExternalSyntheticLambda33, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, int i2, int i3, SaversKtExternalSyntheticLambda54.IAuthTabCallback<ResourceType> iAuthTabCallback) throws SaversKtExternalSyntheticLambda7 {
        List<Throwable> list = (List) markHierarchyDirty.onExtraCallbackWithResult(this.onExtraCallback.onNavigationEvent());
        try {
            return onExtraCallback(saversKtExternalSyntheticLambda33, saversKtExternalSyntheticLambda30, i2, i3, iAuthTabCallback, list);
        } finally {
            this.onExtraCallback.onWarmupCompleted(list);
        }
    }

    private Resource<Transcode> onExtraCallback(SaversKtExternalSyntheticLambda33<Data> saversKtExternalSyntheticLambda33, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, int i2, int i3, SaversKtExternalSyntheticLambda54.IAuthTabCallback<ResourceType> iAuthTabCallback, List<Throwable> list) throws SaversKtExternalSyntheticLambda7 {
        int size = this.onNavigationEvent.size();
        Resource<Transcode> resourceOnNavigationEvent = null;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                resourceOnNavigationEvent = this.onNavigationEvent.get(i4).onNavigationEvent(saversKtExternalSyntheticLambda33, i2, i3, saversKtExternalSyntheticLambda30, iAuthTabCallback);
            } catch (SaversKtExternalSyntheticLambda7 e) {
                list.add(e);
            }
            if (resourceOnNavigationEvent != null) {
                break;
            }
        }
        if (resourceOnNavigationEvent != null) {
            return resourceOnNavigationEvent;
        }
        throw new SaversKtExternalSyntheticLambda7(this.onExtraCallbackWithResult, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.onNavigationEvent.toArray()) + '}';
    }
}
