package im.toss.devtool.runtime.ui.scheme.history;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import java.lang.reflect.Constructor;
import o.AppNode8;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_SchemeHistoryActivity extends BaseActivity {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallbackDefault;

    Hilt_SchemeHistoryActivity() throws Throwable {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    Hilt_SchemeHistoryActivity(int i) throws Throwable {
        super(i);
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = {this};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-904639735);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 49468), ExpandableListView.getPackedPositionGroup(0L) + 70, KeyEvent.normalizeMetaState(0) + 12486, -78334567, false, (String) null, new Class[]{Hilt_SchemeHistoryActivity.class});
            }
            addOnContextAvailableListener((writeTypedList) ((Constructor) objOnExtraCallback).newInstance(objArr));
            int i2 = asBinder;
            int i3 = i2 & 69;
            int i4 = (i3 - (~(-(-((i2 ^ 69) | i3))))) - 1;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void aR_() {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = (i2 ^ 9) + ((i2 & 9) << 1);
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
            if (!this.IAuthTabCallbackDefault) {
                int i5 = (((i2 & (-76)) | ((~i2) & 75)) - (~((i2 & 75) << 1))) - 1;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    this.IAuthTabCallbackDefault = true;
                    objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
                } else {
                    this.IAuthTabCallbackDefault = true;
                    objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
                }
                Object objGeneratedComponent = ((captureEndValues) objOnExtraCallbackWithResult).generatedComponent();
                int i6 = onTransact;
                int i7 = i6 & 103;
                int i8 = -(-((i6 ^ 103) | i7));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                asBinder = i9 % 128;
                AppNode8 appNode8 = (AppNode8) objGeneratedComponent;
                if (i9 % 2 != 0) {
                    appNode8.onWarmupCompleted((SchemeHistoryActivity) animate.onExtraCallbackWithResult(this));
                    throw null;
                }
                appNode8.onWarmupCompleted((SchemeHistoryActivity) animate.onExtraCallbackWithResult(this));
                int i10 = asBinder;
                int i11 = (i10 & 87) + (i10 | 87);
                onTransact = i11 % 128;
                int i12 = i11 % 2;
            }
        } else if (!this.IAuthTabCallbackDefault) {
        }
        int i13 = asBinder + 29;
        onTransact = i13 % 128;
        int i14 = i13 % 2;
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
