package viva.republica.toss.home.consumption;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.SessionTrackerb;
import o.zzbq;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.home.consumption.SchemeConsumptionRegularAddActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeConsumptionRegularAddActivity extends Hilt_SchemeConsumptionRegularAddActivity {

    @Inject
    public SessionTrackerb tossRouter;

    public long getScreenId() {
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return zzbq.IAuthTabCallback(intent);
    }

    public final SessionTrackerb onNavigationEvent() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.home.consumption.Hilt_SchemeConsumptionRegularAddActivity
    public void onCreate(@Nullable Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        ConsumptionRegularAddBottomSheet consumptionRegularAddBottomSheet = new ConsumptionRegularAddBottomSheet(this, onNavigationEvent());
        consumptionRegularAddBottomSheet.setOnDismissListener(new SchemeConsumptionRegularAddActivity$.ExternalSyntheticLambda0(this));
        consumptionRegularAddBottomSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(SchemeConsumptionRegularAddActivity schemeConsumptionRegularAddActivity, DialogInterface dialogInterface) {
        schemeConsumptionRegularAddActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // viva.republica.toss.home.consumption.Hilt_SchemeConsumptionRegularAddActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.home.consumption.Hilt_SchemeConsumptionRegularAddActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.home.consumption.Hilt_SchemeConsumptionRegularAddActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.home.consumption.Hilt_SchemeConsumptionRegularAddActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
