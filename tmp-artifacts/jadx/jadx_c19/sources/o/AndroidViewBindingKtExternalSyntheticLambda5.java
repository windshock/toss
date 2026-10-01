package o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda5 implements ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> {
    private final Context onExtraCallback;

    public AndroidViewBindingKtExternalSyntheticLambda5(Context context) {
        this.onExtraCallback = context.getApplicationContext();
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<InputStream> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        if (SaversKtExternalSyntheticLambda44.onExtraCallback(i2, i3) && IAuthTabCallback(saversKtExternalSyntheticLambda30)) {
            return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(uri), SaversKtExternalSyntheticLambda46.IAuthTabCallback(this.onExtraCallback, uri));
        }
        return null;
    }

    private boolean IAuthTabCallback(SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Long l = (Long) saversKtExternalSyntheticLambda30.IAuthTabCallback(wasInterrupted.onWarmupCompleted);
        return l != null && l.longValue() == -1;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return SaversKtExternalSyntheticLambda44.onWarmupCompleted(uri);
    }

    public static class onNavigationEvent implements ResolvedTextDirection<Uri, InputStream> {
        private final Context onExtraCallback;

        public onNavigationEvent(Context context) {
            this.onExtraCallback = context;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda5(this.onExtraCallback);
        }
    }
}
