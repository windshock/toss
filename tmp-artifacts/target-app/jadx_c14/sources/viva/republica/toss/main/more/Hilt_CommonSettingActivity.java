package viva.republica.toss.main.more;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.RxDownloaderIA;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class Hilt_CommonSettingActivity extends BaseActivity {
    private boolean asInterface;

    Hilt_CommonSettingActivity() {
        this.asInterface = false;
        IAuthTabCallback();
    }

    Hilt_CommonSettingActivity(int i) {
        super(i);
        this.asInterface = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        addOnContextAvailableListener(new writeTypedList() { // from class: viva.republica.toss.main.more.Hilt_CommonSettingActivity.5
            public void onContextAvailable(Context context) {
                Hilt_CommonSettingActivity.this.aR_();
            }
        });
    }

    public void aR_() {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        ((RxDownloaderIA) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((CommonSettingActivity) animate.onExtraCallbackWithResult(this));
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
