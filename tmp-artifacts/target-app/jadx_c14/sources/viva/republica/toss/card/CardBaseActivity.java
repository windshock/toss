package viva.republica.toss.card;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class CardBaseActivity extends BaseActivity {
    private int onTransact;

    public long getScreenId() {
        return -1L;
    }

    public final int onNavigationEvent() {
        return this.onTransact;
    }

    public final void onNavigationEvent(int i) {
        this.onTransact = i;
    }

    public String getScreenName() {
        return "CardBaseActivity";
    }

    public void onRestoreInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*im.toss.uikit.base.UIKitBaseActivity*/.onRestoreInstanceState(bundle);
        this.onTransact = bundle.getInt("vendorId");
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putInt("vendorId", this.onTransact);
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
