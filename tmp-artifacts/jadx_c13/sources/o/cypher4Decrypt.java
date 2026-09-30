package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class cypher4Decrypt {
    public static final <T> T onExtraCallback(@NotNull wie2 wie2Var, @NotNull JsonElement jsonElement, @NotNull jp<? extends T> jpVar) {
        Decoder fbyycx1Var;
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        if (jsonElement instanceof JsonObject) {
            fbyycx1Var = new resumeTimers(wie2Var, (JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof JsonArray) {
            fbyycx1Var = new fbyzb(wie2Var, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof muteVideo) && !Intrinsics.areEqual(jsonElement, JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            fbyycx1Var = new fbyycx1(wie2Var, (JsonPrimitive) jsonElement, null, 4, null);
        }
        return (T) fbyycx1Var.onWarmupCompleted(jpVar);
    }

    public static final <T> T onNavigationEvent(@NotNull wie2 wie2Var, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull jp<? extends T> jpVar) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        return (T) new resumeTimers(wie2Var, jsonObject, str, jpVar.getDescriptor()).onWarmupCompleted((jp) jpVar);
    }
}
