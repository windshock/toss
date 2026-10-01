package io.realm.mongodb.sync;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface SubscriptionSet$StateChangeCallback {
    void onError(Throwable th);

    void onStateChange(SubscriptionSet subscriptionSet);
}
