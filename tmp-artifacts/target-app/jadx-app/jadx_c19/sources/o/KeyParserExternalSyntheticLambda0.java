package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class KeyParserExternalSyntheticLambda0<T extends Drawable> implements Resource<T>, Savers_androidKtExternalSyntheticLambda0 {
    public final T onExtraCallback;

    public KeyParserExternalSyntheticLambda0(T t) {
        this.onExtraCallback = (T) markHierarchyDirty.onExtraCallbackWithResult(t);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final T IAuthTabCallback() {
        Drawable.ConstantState constantState = this.onExtraCallback.getConstantState();
        if (constantState == null) {
            return this.onExtraCallback;
        }
        return (T) constantState.newDrawable();
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
        T t = this.onExtraCallback;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof TransitionExternalSyntheticLambda6) {
            ((TransitionExternalSyntheticLambda6) t).onExtraCallback().prepareToDraw();
        }
    }
}
