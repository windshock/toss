package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BillingFlowParams$SubscriptionUpdateParams {
    private String onExtraCallbackWithResult;
    private String onNavigationEvent;
    private int onWarmupCompleted = 0;

    public static class Builder {
        private String IAuthTabCallback;
        private String onExtraCallback;
        private int onNavigationEvent = 0;
        private boolean onWarmupCompleted;

        private Builder() {
        }

        /* synthetic */ Builder(zzcx zzcxVar) {
        }

        static /* synthetic */ Builder onWarmupCompleted(Builder builder) {
            builder.onWarmupCompleted = true;
            return builder;
        }

        public BillingFlowParams$SubscriptionUpdateParams build() {
            zzcx zzcxVar = null;
            boolean z = true;
            if (TextUtils.isEmpty(this.onExtraCallback) && TextUtils.isEmpty(null)) {
                z = false;
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.IAuthTabCallback);
            if (z && !zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!this.onWarmupCompleted && !z && zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams = new BillingFlowParams$SubscriptionUpdateParams(zzcxVar);
            billingFlowParams$SubscriptionUpdateParams.onNavigationEvent = this.onExtraCallback;
            billingFlowParams$SubscriptionUpdateParams.onWarmupCompleted = this.onNavigationEvent;
            billingFlowParams$SubscriptionUpdateParams.onExtraCallbackWithResult = this.IAuthTabCallback;
            return billingFlowParams$SubscriptionUpdateParams;
        }

        public Builder setOldPurchaseToken(@NonNull String str) {
            this.onExtraCallback = str;
            return this;
        }

        public Builder setOriginalExternalTransactionId(@NonNull String str) {
            this.IAuthTabCallback = str;
            return this;
        }

        @Deprecated
        public Builder setSubscriptionReplacementMode(int i2) {
            this.onNavigationEvent = i2;
            return this;
        }
    }

    private BillingFlowParams$SubscriptionUpdateParams() {
    }

    /* synthetic */ BillingFlowParams$SubscriptionUpdateParams(zzcx zzcxVar) {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    static /* synthetic */ Builder onExtraCallbackWithResult(BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setOldPurchaseToken(billingFlowParams$SubscriptionUpdateParams.onNavigationEvent);
        builderNewBuilder.setSubscriptionReplacementMode(billingFlowParams$SubscriptionUpdateParams.onWarmupCompleted);
        builderNewBuilder.setOriginalExternalTransactionId(billingFlowParams$SubscriptionUpdateParams.onExtraCallbackWithResult);
        return builderNewBuilder;
    }

    final String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    final int onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }
}
