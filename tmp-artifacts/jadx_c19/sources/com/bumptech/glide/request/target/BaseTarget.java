package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import o.setTransitionDuration;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BaseTarget<Z> implements setTransitionDuration<Z> {
    private Request IAuthTabCallback;

    @Override // o.Layer
    public void onDestroy() {
    }

    @Override // o.setTransitionDuration
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // o.setTransitionDuration
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // o.setTransitionDuration
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // o.Layer
    public void onStart() {
    }

    @Override // o.Layer
    public void onStop() {
    }

    @Override // o.setTransitionDuration
    public void setRequest(@Nullable Request request) {
        this.IAuthTabCallback = request;
    }

    @Override // o.setTransitionDuration
    public Request getRequest() {
        return this.IAuthTabCallback;
    }
}
