package o;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda4<Data> implements ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> {
    private static final Set<String> IAuthTabCallback = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final ShaderBrushSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, Data> onExtraCallbackWithResult;

    public AndroidViewBindingKtExternalSyntheticLambda4(ShaderBrushSpanExternalSyntheticLambda0<SpannableExtensions_androidKtExternalSyntheticLambda0, Data> shaderBrushSpanExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = shaderBrushSpanExternalSyntheticLambda0;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return this.onExtraCallbackWithResult.onNavigationEvent(new SpannableExtensions_androidKtExternalSyntheticLambda0(uri.toString()), i2, i3, saversKtExternalSyntheticLambda30);
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return IAuthTabCallback.contains(uri.getScheme());
    }

    public static class onWarmupCompleted implements ResolvedTextDirection<Uri, InputStream> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda4(androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(SpannableExtensions_androidKtExternalSyntheticLambda0.class, InputStream.class));
        }
    }
}
