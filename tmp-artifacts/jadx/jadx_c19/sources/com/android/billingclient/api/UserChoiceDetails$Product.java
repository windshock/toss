package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class UserChoiceDetails$Product {
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    private UserChoiceDetails$Product(JSONObject jSONObject) {
        this.onExtraCallbackWithResult = jSONObject.optString("productId");
        this.onWarmupCompleted = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.IAuthTabCallback = true == strOptString.isEmpty() ? null : strOptString;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserChoiceDetails$Product)) {
            return false;
        }
        UserChoiceDetails$Product userChoiceDetails$Product = (UserChoiceDetails$Product) obj;
        return this.onExtraCallbackWithResult.equals(userChoiceDetails$Product.getId()) && this.onWarmupCompleted.equals(userChoiceDetails$Product.getType()) && Objects.equals(this.IAuthTabCallback, userChoiceDetails$Product.getOfferToken());
    }

    public String getId() {
        return this.onExtraCallbackWithResult;
    }

    public String getOfferToken() {
        return this.IAuthTabCallback;
    }

    public String getType() {
        return this.onWarmupCompleted;
    }

    public int hashCode() {
        return Objects.hash(this.onExtraCallbackWithResult, this.onWarmupCompleted, this.IAuthTabCallback);
    }

    public String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.onExtraCallbackWithResult, this.onWarmupCompleted, this.IAuthTabCallback);
    }
}
