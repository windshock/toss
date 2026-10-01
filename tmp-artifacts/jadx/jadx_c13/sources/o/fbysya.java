package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class fbysya extends getAfterTimestamp {
    private JsonElement onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbysya(@NotNull wie2 wie2Var, @NotNull Function1<? super JsonElement, Unit> function1) {
        super(wie2Var, function1, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        onExtraCallback((fbysya) "primitive");
    }

    @Override // o.getAfterTimestamp
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.onWarmupCompleted != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.onWarmupCompleted = jsonElement;
        IAuthTabCallbackDefault().invoke(jsonElement);
    }

    @Override // o.getAfterTimestamp
    public JsonElement asBinder() {
        JsonElement jsonElement = this.onWarmupCompleted;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }
}
