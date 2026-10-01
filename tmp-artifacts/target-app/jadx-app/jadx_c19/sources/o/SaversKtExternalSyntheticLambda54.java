package o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda54<DataType, ResourceType, Transcode> {
    private final ResourceTranscoder<ResourceType, Transcode> IAuthTabCallback;
    private final String onExtraCallback;
    private final Pools.onExtraCallback<List<Throwable>> onExtraCallbackWithResult;
    private final List<? extends ResourceDecoder<DataType, ResourceType>> onNavigationEvent;
    private final Class<DataType> onWarmupCompleted;

    interface IAuthTabCallback<ResourceType> {
        Resource<ResourceType> onWarmupCompleted(@NonNull Resource<ResourceType> resource);
    }

    public SaversKtExternalSyntheticLambda54(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, Pools.onExtraCallback<List<Throwable>> onextracallback) {
        this.onWarmupCompleted = cls;
        this.onNavigationEvent = list;
        this.IAuthTabCallback = resourceTranscoder;
        this.onExtraCallbackWithResult = onextracallback;
        this.onExtraCallback = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Resource<Transcode> onNavigationEvent(SaversKtExternalSyntheticLambda33<DataType> saversKtExternalSyntheticLambda33, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, IAuthTabCallback<ResourceType> iAuthTabCallback) throws SaversKtExternalSyntheticLambda7 {
        return this.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted(onNavigationEvent(saversKtExternalSyntheticLambda33, i2, i3, saversKtExternalSyntheticLambda30)), saversKtExternalSyntheticLambda30);
    }

    private Resource<ResourceType> onNavigationEvent(SaversKtExternalSyntheticLambda33<DataType> saversKtExternalSyntheticLambda33, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws SaversKtExternalSyntheticLambda7 {
        List<Throwable> list = (List) markHierarchyDirty.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onNavigationEvent());
        try {
            return onNavigationEvent(saversKtExternalSyntheticLambda33, i2, i3, saversKtExternalSyntheticLambda30, list);
        } finally {
            this.onExtraCallbackWithResult.onWarmupCompleted(list);
        }
    }

    private Resource<ResourceType> onNavigationEvent(SaversKtExternalSyntheticLambda33<DataType> saversKtExternalSyntheticLambda33, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, List<Throwable> list) throws SaversKtExternalSyntheticLambda7 {
        int size = this.onNavigationEvent.size();
        Resource<ResourceType> resourceOnNavigationEvent = null;
        for (int i4 = 0; i4 < size; i4++) {
            ResourceDecoder<DataType, ResourceType> resourceDecoder = this.onNavigationEvent.get(i4);
            try {
                if (resourceDecoder.IAuthTabCallback(saversKtExternalSyntheticLambda33.onNavigationEvent(), saversKtExternalSyntheticLambda30)) {
                    resourceOnNavigationEvent = resourceDecoder.onNavigationEvent(saversKtExternalSyntheticLambda33.onNavigationEvent(), i2, i3, saversKtExternalSyntheticLambda30);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(resourceDecoder);
                }
                list.add(e);
            }
            if (resourceOnNavigationEvent != null) {
                break;
            }
        }
        if (resourceOnNavigationEvent != null) {
            return resourceOnNavigationEvent;
        }
        throw new SaversKtExternalSyntheticLambda7(this.onExtraCallback, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.onWarmupCompleted + ", decoders=" + this.onNavigationEvent + ", transcoder=" + this.IAuthTabCallback + '}';
    }
}
