package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.SignatureRequest;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CommonBackPerform extends SignatureRequest {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("amount")
    private long amount;

    @SerializedName("applyNo")
    private long applyNo;

    @SerializedName("accountType")
    private onCollectWhenDestroy fromAccountType = onCollectWhenDestroy.BANK_ACCOUNT;

    @SerializedName("accountNo")
    private String account = "";

    public final void onNavigationEvent(@NotNull onCollectWhenDestroy oncollectwhendestroy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(oncollectwhendestroy, "");
            this.fromAccountType = oncollectwhendestroy;
        } else {
            Intrinsics.checkNotNullParameter(oncollectwhendestroy, "");
            this.fromAccountType = oncollectwhendestroy;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.account = str;
            int i3 = 50 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.account = str;
        }
        int i4 = onExtraCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    public final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.applyNo = j;
        int i5 = i3 + 95;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.amount = j;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("accountType", this.fromAccountType.getName());
        jsonObject.addProperty("accountNo", this.account);
        jsonObject.addProperty("applyNo", Long.valueOf(this.applyNo));
        jsonObject.addProperty("amount", Long.valueOf(this.amount));
        jsonObject.addProperty("date", str);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
