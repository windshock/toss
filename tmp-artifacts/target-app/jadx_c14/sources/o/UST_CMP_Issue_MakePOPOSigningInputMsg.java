package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_MakePOPOSigningInputMsg {
    private final HashMap<Integer, UST_CRYPT_VerifySignEX> onWarmupCompleted;

    public UST_CMP_Issue_MakePOPOSigningInputMsg(@NotNull UST_CMP_Issue_MakePOPOSigningInputMsg... uST_CMP_Issue_MakePOPOSigningInputMsgArr) {
        Intrinsics.checkNotNullParameter(uST_CMP_Issue_MakePOPOSigningInputMsgArr, "");
        this.onWarmupCompleted = new HashMap<>();
        ArrayList arrayList = new ArrayList(uST_CMP_Issue_MakePOPOSigningInputMsgArr.length);
        int length = uST_CMP_Issue_MakePOPOSigningInputMsgArr.length;
        for (int i = 0; i < length; i++) {
            UST_CMP_Issue_MakePOPOSigningInputMsg uST_CMP_Issue_MakePOPOSigningInputMsg = uST_CMP_Issue_MakePOPOSigningInputMsgArr[i];
            Map mapOnNavigationEvent = uST_CMP_Issue_MakePOPOSigningInputMsg != null ? uST_CMP_Issue_MakePOPOSigningInputMsg.onWarmupCompleted : null;
            if (mapOnNavigationEvent == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
            }
            arrayList.add(access8100.onExtraCallback(mapOnNavigationEvent));
        }
        for (Pair pair : CollectionsKt.flatten(arrayList)) {
            this.onWarmupCompleted.put(pair.getFirst(), pair.getSecond());
        }
    }

    public final HashMap<Integer, UST_CRYPT_VerifySignEX> onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public final void onExtraCallbackWithResult(int i, @NotNull UST_CRYPT_VerifySignEX uST_CRYPT_VerifySignEX) {
        Intrinsics.checkNotNullParameter(uST_CRYPT_VerifySignEX, "");
        this.onWarmupCompleted.put(Integer.valueOf(i), uST_CRYPT_VerifySignEX);
    }

    public final void onExtraCallbackWithResult(@NotNull Pair<Integer, UST_CRYPT_VerifySignEX> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.onWarmupCompleted.put(pair.getFirst(), pair.getSecond());
    }
}
