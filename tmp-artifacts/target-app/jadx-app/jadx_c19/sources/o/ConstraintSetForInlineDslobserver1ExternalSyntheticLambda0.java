package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ConstraintSetForInlineDslobserver1ExternalSyntheticLambda0 extends KeyParserExternalSyntheticLambda0<Drawable> {
    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
    }

    public static Resource<Drawable> onExtraCallbackWithResult(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new ConstraintSetForInlineDslobserver1ExternalSyntheticLambda0(drawable);
        }
        return null;
    }

    private ConstraintSetForInlineDslobserver1ExternalSyntheticLambda0(Drawable drawable) {
        super(drawable);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<Drawable> onExtraCallbackWithResult() {
        return this.onExtraCallback.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return Math.max(1, (this.onExtraCallback.getIntrinsicWidth() * this.onExtraCallback.getIntrinsicHeight()) << 2);
    }
}
