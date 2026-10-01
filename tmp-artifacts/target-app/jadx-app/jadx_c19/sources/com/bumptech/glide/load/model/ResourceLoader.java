package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Objects;
import o.AndroidViewBindingKtExternalSyntheticLambda2;
import o.AndroidViewBindingKtExternalSyntheticLambda3;
import o.ResolvedTextDirection;
import o.SaversKtExternalSyntheticLambda30;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceLoader<Data> implements ShaderBrushSpanExternalSyntheticLambda0<Integer, Data> {
    private final Resources onExtraCallback;
    private final ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> onWarmupCompleted;

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Integer num) {
        return true;
    }

    public ResourceLoader(Resources resources, ShaderBrushSpanExternalSyntheticLambda0<Uri, Data> shaderBrushSpanExternalSyntheticLambda0) {
        this.onExtraCallback = resources;
        this.onWarmupCompleted = shaderBrushSpanExternalSyntheticLambda0;
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Data> onNavigationEvent(@NonNull Integer num, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Uri uriOnExtraCallbackWithResult = onExtraCallbackWithResult(num);
        if (uriOnExtraCallbackWithResult == null) {
            return null;
        }
        return this.onWarmupCompleted.onNavigationEvent(uriOnExtraCallbackWithResult, i2, i3, saversKtExternalSyntheticLambda30);
    }

    private Uri onExtraCallbackWithResult(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.onExtraCallback.getResourcePackageName(num.intValue()) + '/' + this.onExtraCallback.getResourceTypeName(num.intValue()) + '/' + this.onExtraCallback.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            return null;
        }
    }

    public static class StreamFactory implements ResolvedTextDirection<Integer, InputStream> {
        private final Resources onNavigationEvent;

        public StreamFactory(Resources resources) {
            this.onNavigationEvent = resources;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Integer, InputStream> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new ResourceLoader(this.onNavigationEvent, androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, InputStream.class));
        }
    }

    public static class FileDescriptorFactory implements ResolvedTextDirection<Integer, ParcelFileDescriptor> {
        private final Resources onNavigationEvent;

        public FileDescriptorFactory(Resources resources) {
            this.onNavigationEvent = resources;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Integer, ParcelFileDescriptor> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new ResourceLoader(this.onNavigationEvent, androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static final class AssetFileDescriptorFactory implements ResolvedTextDirection<Integer, AssetFileDescriptor> {
        private final Resources onExtraCallback;

        public AssetFileDescriptorFactory(Resources resources) {
            this.onExtraCallback = resources;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Integer, AssetFileDescriptor> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new ResourceLoader(this.onExtraCallback, androidViewBindingKtExternalSyntheticLambda3.onWarmupCompleted(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class UriFactory implements ResolvedTextDirection<Integer, Uri> {
        private final Resources IAuthTabCallback;

        public UriFactory(Resources resources) {
            this.IAuthTabCallback = resources;
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Integer, Uri> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return new ResourceLoader(this.IAuthTabCallback, AndroidViewBindingKtExternalSyntheticLambda2.onNavigationEvent());
        }
    }
}
