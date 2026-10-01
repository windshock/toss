package o;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setDensity implements ShaderBrushSpanExternalSyntheticLambda0<URL, InputStream> {
    private final ShaderBrushSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, InputStream> IAuthTabCallback;

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull URL url) {
        return true;
    }

    public setDensity(ShaderBrushSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, InputStream> shaderBrushSpanExternalSyntheticLambda0) {
        this.IAuthTabCallback = shaderBrushSpanExternalSyntheticLambda0;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<InputStream> onNavigationEvent(@NonNull URL url, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return this.IAuthTabCallback.onNavigationEvent(new SpannableExtensions_androidKtExternalSyntheticLambda0(url), i2, i3, saversKtExternalSyntheticLambda30);
    }

    public static class onExtraCallbackWithResult implements ResolvedTextDirection<URL, InputStream> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<URL, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new setDensity(androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(SpannableExtensions_androidKtExternalSyntheticLambda0.class, InputStream.class));
        }
    }
}
