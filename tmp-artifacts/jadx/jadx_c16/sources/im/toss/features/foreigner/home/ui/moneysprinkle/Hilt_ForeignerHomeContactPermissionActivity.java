package im.toss.features.foreigner.home.ui.moneysprinkle;

import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import o.animate;
import o.captureEndValues;
import o.getBizType;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_ForeignerHomeContactPermissionActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private boolean asInterface;

    Hilt_ForeignerHomeContactPermissionActivity() {
        this.asInterface = false;
        onNavigationEvent();
    }

    Hilt_ForeignerHomeContactPermissionActivity(int i) {
        super(i);
        this.asInterface = false;
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.features.foreigner.home.ui.moneysprinkle.Hilt_ForeignerHomeContactPermissionActivity.2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_ForeignerHomeContactPermissionActivity.this.aR_();
                int i5 = onExtraCallback + 99;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
            if (!this.asInterface) {
                this.asInterface = true;
                ((getBizType) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onNavigationEvent((ForeignerHomeContactPermissionActivity) animate.onExtraCallbackWithResult(this));
            }
        } else if (!this.asInterface) {
        }
        int i4 = asBinder + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
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
