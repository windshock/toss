package im.toss.tosssecurities.widget.watchlist.setting.product;

import android.content.Context;
import android.os.Bundle;
import im.toss.securities.widget.common.ui.BaseWidgetSettingActivity;
import o.AFi1ySDK;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Hilt_BaseWidgetProductSelectActivity extends BaseWidgetSettingActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallbackDefault = false;

    Hilt_BaseWidgetProductSelectActivity() {
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.tosssecurities.widget.watchlist.setting.product.Hilt_BaseWidgetProductSelectActivity.5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_BaseWidgetProductSelectActivity.this.aR_();
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        AFi1ySDK aFi1ySDK;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.IAuthTabCallbackDefault) {
            int i2 = IAuthTabCallbackStub + 71;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallbackDefault = false;
                aFi1ySDK = (AFi1ySDK) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.IAuthTabCallbackDefault = true;
                aFi1ySDK = (AFi1ySDK) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            aFi1ySDK.onNavigationEvent((BaseWidgetProductSelectActivity) objOnExtraCallbackWithResult);
        }
        int i3 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
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
