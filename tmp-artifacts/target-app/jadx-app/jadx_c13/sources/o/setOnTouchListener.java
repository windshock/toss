package o;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setOnTouchListener extends resumeTimers {
    private final JsonObject IAuthTabCallback;
    private final List<String> onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final int onWarmupCompleted;

    @Override // o.resumeTimers, o.encryptWithoutBase64, o.setOnShakeViewListener, o.yw
    public void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOnTouchListener(@NotNull wie2 wie2Var, @NotNull JsonObject jsonObject) {
        super(wie2Var, jsonObject, null, null, 12, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.IAuthTabCallback = jsonObject;
        List<String> list = CollectionsKt___CollectionsKt.toList(readTypedObject().keySet());
        this.onExtraCallbackWithResult = list;
        this.onWarmupCompleted = list.size() << 1;
        this.onNavigationEvent = -1;
    }

    @Override // o.resumeTimers, o.encryptWithoutBase64
    /* renamed from: onMinimized, reason: merged with bridge method [inline-methods] */
    public JsonObject readTypedObject() {
        return this.IAuthTabCallback;
    }

    @Override // o.resumeTimers, o.dy1
    public String IAuthTabCallback_Parcel(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return this.onExtraCallbackWithResult.get(i / 2);
    }

    @Override // o.resumeTimers, o.yw
    public int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        int i = this.onNavigationEvent;
        if (i >= this.onWarmupCompleted - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.onNavigationEvent = i2;
        return i2;
    }

    @Override // o.resumeTimers, o.encryptWithoutBase64
    protected JsonElement onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onNavigationEvent % 2 == 0 ? initRenderFinish.onNavigationEvent(str) : (JsonElement) access8000.onExtraCallback(readTypedObject(), str);
    }
}
