package o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda6 implements ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> {
    private final Context onNavigationEvent;

    public AndroidViewBindingKtExternalSyntheticLambda6(Context context) {
        this.onNavigationEvent = context.getApplicationContext();
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<InputStream> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        if (SaversKtExternalSyntheticLambda44.onExtraCallback(i2, i3)) {
            return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(uri), SaversKtExternalSyntheticLambda46.onWarmupCompleted(this.onNavigationEvent, uri));
        }
        return null;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return SaversKtExternalSyntheticLambda44.onNavigationEvent(uri);
    }

    public static class onWarmupCompleted implements ResolvedTextDirection<Uri, InputStream> {
        private final Context onNavigationEvent;

        public onWarmupCompleted(Context context) {
            this.onNavigationEvent = context;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda6(this.onNavigationEvent);
        }
    }
}
