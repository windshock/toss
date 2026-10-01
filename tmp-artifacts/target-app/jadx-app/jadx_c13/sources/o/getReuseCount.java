package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class getReuseCount extends getAfterTimestamp {
    private final Map<String, JsonElement> onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReuseCount(@NotNull wie2 wie2Var, @NotNull Function1<? super JsonElement, Unit> function1) {
        super(wie2Var, function1, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = new LinkedHashMap();
    }

    protected final Map<String, JsonElement> asInterface() {
        return this.onNavigationEvent;
    }

    @Override // o.getAfterTimestamp
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.onNavigationEvent.put(str, jsonElement);
    }

    @Override // o.oty2, o.vyl
    public <T> void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull py<? super T> pyVar, @Nullable T t) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        if (t != null || this.onExtraCallbackWithResult.asInterface()) {
            super.onExtraCallbackWithResult(serialDescriptor, i, pyVar, t);
        }
    }

    @Override // o.getAfterTimestamp
    public JsonElement asBinder() {
        return new JsonObject(this.onNavigationEvent);
    }
}
