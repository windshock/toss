package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class EditProcessorExternalSyntheticLambda0<Data> implements ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> {
    private static final int onExtraCallback = 22;
    private final onNavigationEvent<Data> IAuthTabCallback;
    private final AssetManager onWarmupCompleted;

    public interface onNavigationEvent<Data> {
        SaversKtExternalSyntheticLambda35<Data> IAuthTabCallback(AssetManager assetManager, String str);
    }

    public EditProcessorExternalSyntheticLambda0(AssetManager assetManager, onNavigationEvent<Data> onnavigationevent) {
        this.onWarmupCompleted = assetManager;
        this.IAuthTabCallback = onnavigationevent;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(uri), this.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted, uri.toString().substring(onExtraCallback)));
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static class onExtraCallback implements ResolvedTextDirection<Uri, InputStream>, onNavigationEvent<InputStream> {
        private final AssetManager IAuthTabCallback;

        public onExtraCallback(AssetManager assetManager) {
            this.IAuthTabCallback = assetManager;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new EditProcessorExternalSyntheticLambda0(this.IAuthTabCallback, this);
        }

        @Override // o.EditProcessorExternalSyntheticLambda0.onNavigationEvent
        public SaversKtExternalSyntheticLambda35<InputStream> IAuthTabCallback(AssetManager assetManager, String str) {
            return new SaversKtExternalSyntheticLambda43(assetManager, str);
        }
    }

    public static class IAuthTabCallback implements ResolvedTextDirection<Uri, AssetFileDescriptor>, onNavigationEvent<AssetFileDescriptor> {
        private final AssetManager onExtraCallback;

        public IAuthTabCallback(AssetManager assetManager) {
            this.onExtraCallback = assetManager;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, AssetFileDescriptor> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new EditProcessorExternalSyntheticLambda0(this.onExtraCallback, this);
        }

        @Override // o.EditProcessorExternalSyntheticLambda0.onNavigationEvent
        public SaversKtExternalSyntheticLambda35<AssetFileDescriptor> IAuthTabCallback(AssetManager assetManager, String str) {
            return new SaversKtExternalSyntheticLambda39(assetManager, str);
        }
    }
}
