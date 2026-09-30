package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda8<Data> implements ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> {
    private static final Set<String> onNavigationEvent = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final IAuthTabCallback<Data> onWarmupCompleted;

    public interface IAuthTabCallback<Data> {
        SaversKtExternalSyntheticLambda35<Data> IAuthTabCallback(Uri uri);
    }

    public AndroidViewBindingKtExternalSyntheticLambda8(IAuthTabCallback<Data> iAuthTabCallback) {
        this.onWarmupCompleted = iAuthTabCallback;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(uri), this.onWarmupCompleted.IAuthTabCallback(uri));
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Uri uri) {
        return onNavigationEvent.contains(uri.getScheme());
    }

    public static class onWarmupCompleted implements ResolvedTextDirection<Uri, InputStream>, IAuthTabCallback<InputStream> {
        private final ContentResolver onExtraCallbackWithResult;

        public onWarmupCompleted(ContentResolver contentResolver) {
            this.onExtraCallbackWithResult = contentResolver;
        }

        @Override // o.AndroidViewBindingKtExternalSyntheticLambda8.IAuthTabCallback
        public SaversKtExternalSyntheticLambda35<InputStream> IAuthTabCallback(Uri uri) {
            return new SaversKtExternalSyntheticLambda41(this.onExtraCallbackWithResult, uri);
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda8(this);
        }
    }

    public static class onExtraCallback implements ResolvedTextDirection<Uri, ParcelFileDescriptor>, IAuthTabCallback<ParcelFileDescriptor> {
        private final ContentResolver onNavigationEvent;

        public onExtraCallback(ContentResolver contentResolver) {
            this.onNavigationEvent = contentResolver;
        }

        @Override // o.AndroidViewBindingKtExternalSyntheticLambda8.IAuthTabCallback
        public SaversKtExternalSyntheticLambda35<ParcelFileDescriptor> IAuthTabCallback(Uri uri) {
            return new SaversKtExternalSyntheticLambda36(this.onNavigationEvent, uri);
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, ParcelFileDescriptor> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda8(this);
        }
    }

    public static final class onExtraCallbackWithResult implements ResolvedTextDirection<Uri, AssetFileDescriptor>, IAuthTabCallback<AssetFileDescriptor> {
        private final ContentResolver onExtraCallback;

        public onExtraCallbackWithResult(ContentResolver contentResolver) {
            this.onExtraCallback = contentResolver;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Uri, AssetFileDescriptor> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new AndroidViewBindingKtExternalSyntheticLambda8(this);
        }

        @Override // o.AndroidViewBindingKtExternalSyntheticLambda8.IAuthTabCallback
        public SaversKtExternalSyntheticLambda35<AssetFileDescriptor> IAuthTabCallback(Uri uri) {
            return new SaversKtExternalSyntheticLambda27(this.onExtraCallback, uri);
        }
    }
}
