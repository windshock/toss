package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.ViewTransitionExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements ViewTransitionExternalSyntheticLambda0.onNavigationEvent {
    private Animatable onExtraCallback;

    protected abstract void setResource(@Nullable Z z);

    public ImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public ImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    public Drawable getCurrentDrawable() {
        return ((ImageView) ((ViewTarget) this).IAuthTabCallback).getDrawable();
    }

    public void setDrawable(Drawable drawable) {
        ((ImageView) ((ViewTarget) this).IAuthTabCallback).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public void onLoadFailed(@Nullable Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, o.setTransitionDuration
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.onExtraCallback;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // o.setTransitionDuration
    public void onResourceReady(@NonNull Z z, @Nullable ViewTransitionExternalSyntheticLambda0<? super Z> viewTransitionExternalSyntheticLambda0) {
        if (viewTransitionExternalSyntheticLambda0 == null || !viewTransitionExternalSyntheticLambda0.IAuthTabCallback(z, this)) {
            setResourceInternal(z);
        } else {
            maybeUpdateAnimatable(z);
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.Layer
    public void onStart() {
        Animatable animatable = this.onExtraCallback;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, o.Layer
    public void onStop() {
        Animatable animatable = this.onExtraCallback;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private void setResourceInternal(@Nullable Z z) {
        setResource(z);
        maybeUpdateAnimatable(z);
    }

    private void maybeUpdateAnimatable(@Nullable Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.onExtraCallback = animatable;
            animatable.start();
            return;
        }
        this.onExtraCallback = null;
    }
}
