package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class setModifier<T> implements Resource<T> {
    protected final T onExtraCallbackWithResult;

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int onExtraCallback() {
        return 1;
    }

    public setModifier(@NonNull T t) {
        this.onExtraCallbackWithResult = (T) markHierarchyDirty.onExtraCallbackWithResult(t);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<T> onExtraCallbackWithResult() {
        return (Class<T>) this.onExtraCallbackWithResult.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final T IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }
}
