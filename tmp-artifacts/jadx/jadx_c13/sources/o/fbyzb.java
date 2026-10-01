package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class fbyzb extends encryptWithoutBase64 {
    private final int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final JsonArray onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbyzb(@NotNull wie2 wie2Var, @NotNull JsonArray jsonArray) {
        super(wie2Var, jsonArray, null, 4, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.onWarmupCompleted = jsonArray;
        this.onExtraCallbackWithResult = readTypedObject().size();
        this.onNavigationEvent = -1;
    }

    @Override // o.encryptWithoutBase64
    /* renamed from: onActivityResized, reason: merged with bridge method [inline-methods] */
    public JsonArray readTypedObject() {
        return this.onWarmupCompleted;
    }

    @Override // o.dy1
    public String IAuthTabCallback_Parcel(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.encryptWithoutBase64
    public JsonElement onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return readTypedObject().get(Integer.parseInt(str));
    }

    @Override // o.yw
    public int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        int i = this.onNavigationEvent;
        if (i >= this.onExtraCallbackWithResult - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.onNavigationEvent = i2;
        return i2;
    }
}
