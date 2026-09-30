package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class fbyycx1 extends encryptWithoutBase64 {
    private final JsonElement IAuthTabCallback;

    @Override // o.yw
    public int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return 0;
    }

    public /* synthetic */ fbyycx1(wie2 wie2Var, JsonElement jsonElement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wie2Var, jsonElement, (i & 4) != 0 ? null : str);
    }

    @Override // o.encryptWithoutBase64
    public JsonElement readTypedObject() {
        return this.IAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbyycx1(@NotNull wie2 wie2Var, @NotNull JsonElement jsonElement, @Nullable String str) {
        super(wie2Var, jsonElement, str, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.IAuthTabCallback = jsonElement;
        IAuthTabCallbackStubProxy("primitive");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.encryptWithoutBase64
    public JsonElement onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str != "primitive") {
            throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
        }
        return readTypedObject();
    }
}
