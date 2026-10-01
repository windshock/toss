package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda7 implements ShaderBrushSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, InputStream> {
    public static final SaversKtExternalSyntheticLambda3<Integer> onNavigationEvent = SaversKtExternalSyntheticLambda3.onWarmupCompleted("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final CustomBulletSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, SpannableExtensions_androidKtExternalSyntheticLambda0> onExtraCallbackWithResult;

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull SpannableExtensions_androidKtExternalSyntheticLambda0 spannableExtensions_androidKtExternalSyntheticLambda0) {
        return true;
    }

    public AndroidViewBindingKtExternalSyntheticLambda7() {
        this(null);
    }

    public AndroidViewBindingKtExternalSyntheticLambda7(@Nullable CustomBulletSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, SpannableExtensions_androidKtExternalSyntheticLambda0> customBulletSpanExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = customBulletSpanExternalSyntheticLambda0;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<InputStream> onNavigationEvent(@NonNull SpannableExtensions_androidKtExternalSyntheticLambda0 spannableExtensions_androidKtExternalSyntheticLambda0, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        CustomBulletSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, SpannableExtensions_androidKtExternalSyntheticLambda0> customBulletSpanExternalSyntheticLambda0 = this.onExtraCallbackWithResult;
        if (customBulletSpanExternalSyntheticLambda0 != null) {
            SpannableExtensions_androidKtExternalSyntheticLambda0 spannableExtensions_androidKtExternalSyntheticLambda0OnExtraCallbackWithResult = customBulletSpanExternalSyntheticLambda0.onExtraCallbackWithResult(spannableExtensions_androidKtExternalSyntheticLambda0, 0, 0);
            if (spannableExtensions_androidKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                this.onExtraCallbackWithResult.onNavigationEvent(spannableExtensions_androidKtExternalSyntheticLambda0, 0, 0, spannableExtensions_androidKtExternalSyntheticLambda0);
            } else {
                spannableExtensions_androidKtExternalSyntheticLambda0 = spannableExtensions_androidKtExternalSyntheticLambda0OnExtraCallbackWithResult;
            }
        }
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(spannableExtensions_androidKtExternalSyntheticLambda0, new SaversKtExternalSyntheticLambda37(spannableExtensions_androidKtExternalSyntheticLambda0, ((Integer) saversKtExternalSyntheticLambda30.IAuthTabCallback(onNavigationEvent)).intValue()));
    }

    public static class onExtraCallbackWithResult implements ResolvedTextDirection<SpannableExtensions_androidKtExternalSyntheticLambda0, InputStream> {
        private final CustomBulletSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, SpannableExtensions_androidKtExternalSyntheticLambda0> onExtraCallback = new CustomBulletSpanExternalSyntheticLambda0<>(500);

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda7(this.onExtraCallback);
        }
    }
}
