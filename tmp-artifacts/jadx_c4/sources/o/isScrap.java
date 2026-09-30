package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class isScrap<T extends addChangePayload> {
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public isScrap(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.onExtraCallbackWithResult = t.onMessageChannelReady();
        this.onExtraCallback = t.onUnminimized();
        this.IAuthTabCallback = t.onRelationshipValidationResult();
        this.onWarmupCompleted = t.onMinimized();
    }

    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        writableMap.putInt("numberOfPointers", this.onExtraCallbackWithResult);
        writableMap.putInt("handlerTag", this.onExtraCallback);
        writableMap.putInt("state", this.IAuthTabCallback);
        writableMap.putInt("pointerType", this.onWarmupCompleted);
    }
}
