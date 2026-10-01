package im.toss.devtool.runtime.data.util;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import im.toss.base.BaseActivity;
import java.lang.reflect.Constructor;
import o.AppNode21;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.animate;
import o.captureEndValues;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Hilt_DevToolActionActivity extends BaseActivity {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private boolean IAuthTabCallbackStub;

    Hilt_DevToolActionActivity() throws Throwable {
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    Hilt_DevToolActionActivity(int i) throws Throwable {
        super(i);
        this.IAuthTabCallbackStub = false;
        IAuthTabCallback();
    }

    private void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = {this};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(937948171);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 52506), 62 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 12152, 111610523, false, (String) null, new Class[]{Hilt_DevToolActionActivity.class});
            }
            addOnContextAvailableListener((writeTypedList) ((Constructor) objOnExtraCallback).newInstance(objArr));
            int i2 = asBinder;
            int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
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

    @Override // im.toss.base.Hilt_BaseActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = (((i2 | 122) << 1) - (i2 ^ 122)) - 1;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.IAuthTabCallbackStub) {
            this.IAuthTabCallbackStub = true;
            Object objGeneratedComponent = ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent();
            int i4 = asInterface + 69;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            ((AppNode21) objGeneratedComponent).onWarmupCompleted((DevToolActionActivity) animate.onExtraCallbackWithResult(this));
            int i6 = asInterface;
            int i7 = i6 & 117;
            int i8 = i6 | 117;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = asInterface;
        int i12 = (i11 ^ 110) + ((i11 & 110) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        asBinder = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
