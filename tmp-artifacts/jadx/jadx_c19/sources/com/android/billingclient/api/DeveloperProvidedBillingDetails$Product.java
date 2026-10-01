package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DeveloperProvidedBillingDetails$Product {
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    /* synthetic */ DeveloperProvidedBillingDetails$Product(JSONObject jSONObject, zzdj zzdjVar) {
        this.onWarmupCompleted = jSONObject.optString("productId");
        this.onExtraCallbackWithResult = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.onExtraCallback = true == strOptString.isEmpty() ? null : strOptString;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeveloperProvidedBillingDetails$Product)) {
            return false;
        }
        DeveloperProvidedBillingDetails$Product developerProvidedBillingDetails$Product = (DeveloperProvidedBillingDetails$Product) obj;
        return this.onWarmupCompleted.equals(developerProvidedBillingDetails$Product.getId()) && this.onExtraCallbackWithResult.equals(developerProvidedBillingDetails$Product.getType()) && Objects.equals(this.onExtraCallback, developerProvidedBillingDetails$Product.getOfferToken());
    }

    public String getId() {
        return this.onWarmupCompleted;
    }

    public String getOfferToken() {
        return this.onExtraCallback;
    }

    public String getType() {
        return this.onExtraCallbackWithResult;
    }

    public int hashCode() {
        return Objects.hash(this.onWarmupCompleted, this.onExtraCallbackWithResult, this.onExtraCallback);
    }

    public String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.onWarmupCompleted, this.onExtraCallbackWithResult, this.onExtraCallback);
    }
}
