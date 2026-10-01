package o;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setDestroyOnDetached extends getAfterTimestamp {
    private final ArrayList<JsonElement> onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDestroyOnDetached(@NotNull wie2 wie2Var, @NotNull Function1<? super JsonElement, Unit> function1) {
        super(wie2Var, function1, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = new ArrayList<>();
    }

    @Override // o.getAfterTimestamp, o.ea1
    public String onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return String.valueOf(i);
    }

    @Override // o.getAfterTimestamp
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.onNavigationEvent.add(Integer.parseInt(str), jsonElement);
    }

    @Override // o.getAfterTimestamp
    public JsonElement asBinder() {
        return new JsonArray(this.onNavigationEvent);
    }
}
