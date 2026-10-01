package im.toss.activitydelegate;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TransparentDelegateActivity extends DelegateActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.activitydelegate.DelegateActivity, im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int i4 = onTransact + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    @Override // im.toss.activitydelegate.DelegateActivity, im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.activitydelegate.DelegateActivity, im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.activitydelegate.DelegateActivity, im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.activitydelegate.DelegateActivity, im.toss.activitydelegate.Hilt_DelegateActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
