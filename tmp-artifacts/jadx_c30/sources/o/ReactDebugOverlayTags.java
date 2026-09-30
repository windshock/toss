package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.SignatureRequest;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactDebugOverlayTags extends SignatureRequest {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("bankCode")
    private String bankCode = BuildConfig.FLAVOR;

    @SerializedName("chargeAccountId")
    private String chargeAccountId = BuildConfig.FLAVOR;

    @SerializedName("amount")
    private long amount = -1;

    @SerializedName("chargeType")
    private String chargeType = BuildConfig.FLAVOR;

    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bankCode", Integer.valueOf(Integer.parseInt(this.bankCode)));
        jsonObject.addProperty("chargeAccountId", this.chargeAccountId);
        jsonObject.addProperty("amount", Long.valueOf(this.amount));
        jsonObject.addProperty("chargeType", this.chargeType);
        jsonObject.addProperty("date", str);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return string;
    }
}
