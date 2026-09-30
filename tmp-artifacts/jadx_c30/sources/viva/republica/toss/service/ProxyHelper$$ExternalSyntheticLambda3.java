package viva.republica.toss.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.concurrent.Callable;
import o.UIManagerProvider;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ProxyHelper$$ExternalSyntheticLambda3 implements Callable {
    public final /* synthetic */ JsonArray f$0;
    public final /* synthetic */ JsonObject f$1;

    public /* synthetic */ ProxyHelper$$ExternalSyntheticLambda3(JsonArray jsonArray, JsonObject jsonObject) {
        this.f$0 = jsonArray;
        this.f$1 = jsonObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return UIManagerProvider.onWarmupCompleted(this.f$0, this.f$1);
    }
}
