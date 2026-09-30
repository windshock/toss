package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class createRecomposer extends BroadcastReceiver {
    private BillingResult onExtraCallbackWithResult;
    private boolean onNavigationEvent = false;
    private final RenderNodeLayerCompanion onWarmupCompleted;

    public createRecomposer(@Nullable RenderNodeLayerCompanion renderNodeLayerCompanion) {
        this.onWarmupCompleted = renderNodeLayerCompanion;
    }

    public final BillingResult IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult = null;
    }

    public final boolean onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, @Nullable Intent intent) {
        if (intent == null) {
            zzc.zzo("ProxyBillingReceiver", "Null intent!");
            return;
        }
        zzc.zzn("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                zzc.zzo("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                return;
            }
            this.onNavigationEvent = true;
            RenderNodeLayerCompanion renderNodeLayerCompanion = this.onWarmupCompleted;
            if (renderNodeLayerCompanion != null) {
                renderNodeLayerCompanion.IAuthTabCallback(intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!intent.hasExtra("RESPONSE_CODE")) {
            zzc.zzo("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
            RenderNodeLayerCompanion renderNodeLayerCompanion2 = this.onWarmupCompleted;
            if (renderNodeLayerCompanion2 != null) {
                renderNodeLayerCompanion2.onExtraCallback((BillingResult) null, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(intent.getIntExtra("RESPONSE_CODE", 0));
        builderNewBuilder.setDebugMessage(zzbo.zzc(intent.getStringExtra("DEBUG_MESSAGE")));
        BillingResult billingResultBuild = builderNewBuilder.build();
        this.onExtraCallbackWithResult = billingResultBuild;
        RenderNodeLayerCompanion renderNodeLayerCompanion3 = this.onWarmupCompleted;
        if (renderNodeLayerCompanion3 != null) {
            renderNodeLayerCompanion3.onExtraCallback(billingResultBuild, intent.getLongExtra("billingClientTransactionId", 0L));
        }
    }
}
