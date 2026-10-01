package o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LoremIpsumExternalSyntheticLambda0<Data> implements ShaderBrushSpanExternalSyntheticLambda0<String, Data> {
    private final ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> onExtraCallback;

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NonNull String str) {
        return true;
    }

    public LoremIpsumExternalSyntheticLambda0(ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> shaderBrushSpanExternalSyntheticLambda0) {
        this.onExtraCallback = shaderBrushSpanExternalSyntheticLambda0;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull String str, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Uri uriOnExtraCallback = onExtraCallback(str);
        if (uriOnExtraCallback == null || !this.onExtraCallback.onNavigationEvent(uriOnExtraCallback)) {
            return null;
        }
        return this.onExtraCallback.onNavigationEvent(uriOnExtraCallback, i2, i3, saversKtExternalSyntheticLambda30);
    }

    private static Uri onExtraCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return onNavigationEvent2(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? onNavigationEvent2(str) : uri;
    }

    /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
    private static Uri onNavigationEvent2(String str) {
        return Uri.fromFile(new File(str));
    }

    public static class onExtraCallbackWithResult implements ResolvedTextDirection<String, InputStream> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<String, InputStream> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new LoremIpsumExternalSyntheticLambda0(androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, InputStream.class));
        }
    }

    public static class IAuthTabCallback implements ResolvedTextDirection<String, ParcelFileDescriptor> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<String, ParcelFileDescriptor> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new LoremIpsumExternalSyntheticLambda0(androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static final class onWarmupCompleted implements ResolvedTextDirection<String, AssetFileDescriptor> {
        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<String, AssetFileDescriptor> IAuthTabCallback(@NonNull AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new LoremIpsumExternalSyntheticLambda0(androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, AssetFileDescriptor.class));
        }
    }
}
