package o;

import android.graphics.Bitmap;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.onWarmupCompleted;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ViewPropertyAnimatorCompatExternalSyntheticLambda0 extends BaseDataSubscriber<getCodeCacheDir<getSystemWindowInsets>> {
    protected abstract void onExtraCallbackWithResult(@Nullable Bitmap bitmap);

    public void onNewResultImpl(onWarmupCompleted<getCodeCacheDir<getSystemWindowInsets>> onwarmupcompleted) {
        if (onwarmupcompleted.getInterfaceDescriptor()) {
            getCodeCacheDir getcodecachedir = (getCodeCacheDir) onwarmupcompleted.IAuthTabCallbackStub();
            try {
                onExtraCallbackWithResult((getcodecachedir == null || !(getcodecachedir.onExtraCallback() instanceof getSystemGestureInsets)) ? null : ((getSystemGestureInsets) getcodecachedir.onExtraCallback()).onTransact());
            } finally {
                getCodeCacheDir.onExtraCallbackWithResult(getcodecachedir);
            }
        }
    }
}
