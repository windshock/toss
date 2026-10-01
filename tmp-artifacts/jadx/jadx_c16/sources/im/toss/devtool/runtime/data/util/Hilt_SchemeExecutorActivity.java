package im.toss.devtool.runtime.data.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import im.toss.base.BaseActivity;
import java.lang.reflect.Constructor;
import o.AppNode4;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_SchemeExecutorActivity extends BaseActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private boolean asBinder;

    Hilt_SchemeExecutorActivity() throws Throwable {
        this.asBinder = false;
        IAuthTabCallback();
    }

    Hilt_SchemeExecutorActivity(int i) throws Throwable {
        super(i);
        this.asBinder = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = {this};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1593646251);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 64, TextUtils.indexOf("", "", 0, 0) + 12214, -1874715195, false, (String) null, new Class[]{Hilt_SchemeExecutorActivity.class});
            }
            addOnContextAvailableListener((writeTypedList) ((Constructor) objOnExtraCallback).newInstance(objArr));
            int i2 = IAuthTabCallbackDefault;
            int i3 = ((i2 ^ 5) | (i2 & 5)) << 1;
            int i4 = -(((~i2) & 5) | (i2 & (-6)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void aR_() {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = (i2 & 80) + (i2 | 80);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        int i6 = i4 % 2;
        if (!this.asBinder) {
            int i7 = i5 & 67;
            int i8 = (i5 ^ 67) | i7;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                this.asBinder = true;
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            } else {
                this.asBinder = true;
                objOnExtraCallbackWithResult = animate.onExtraCallbackWithResult(this);
            }
            Object objGeneratedComponent = ((captureEndValues) objOnExtraCallbackWithResult).generatedComponent();
            int i10 = IAuthTabCallbackDefault + 35;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            ((AppNode4) objGeneratedComponent).onExtraCallback((SchemeExecutorActivity) animate.onExtraCallbackWithResult(this));
            int i12 = (-2) - ((IAuthTabCallbackStub + 122) ^ (-1));
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = IAuthTabCallbackStub;
        int i15 = ((i14 ^ 83) | (i14 & 83)) << 1;
        int i16 = -(((~i14) & 83) | (i14 & (-84)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        IAuthTabCallbackDefault = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
