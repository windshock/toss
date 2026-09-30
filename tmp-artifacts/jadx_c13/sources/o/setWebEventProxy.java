package o;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setWebEventProxy extends getReuseCount {
    private boolean IAuthTabCallback;
    private String onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setWebEventProxy(@NotNull wie2 wie2Var, @NotNull Function1<? super JsonElement, Unit> function1) {
        super(wie2Var, function1);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = true;
    }

    @Override // o.getReuseCount, o.getAfterTimestamp
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (this.IAuthTabCallback) {
            if (jsonElement instanceof JsonPrimitive) {
                this.onWarmupCompleted = ((JsonPrimitive) jsonElement).onWarmupCompleted();
                this.IAuthTabCallback = false;
                return;
            } else {
                if (jsonElement instanceof JsonObject) {
                    throw setTouchStateListener.onWarmupCompleted(encryptType4.IAuthTabCallback.getDescriptor());
                }
                if (!(jsonElement instanceof JsonArray)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw setTouchStateListener.onWarmupCompleted(setAnimationDuration.onExtraCallback.getDescriptor());
            }
        }
        Map<String, JsonElement> mapAsInterface = asInterface();
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            str2 = null;
        }
        mapAsInterface.put(str2, jsonElement);
        this.IAuthTabCallback = true;
    }

    @Override // o.getReuseCount, o.getAfterTimestamp
    public JsonElement asBinder() {
        return new JsonObject(asInterface());
    }
}
