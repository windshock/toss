package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface setTransitionDuration<R> extends Layer {
    Request getRequest();

    void getSize(@NonNull setTransitionListener settransitionlistener);

    void onLoadCleared(@Nullable Drawable drawable);

    void onLoadFailed(@Nullable Drawable drawable);

    void onLoadStarted(@Nullable Drawable drawable);

    void onResourceReady(@NonNull R r, @Nullable ViewTransitionExternalSyntheticLambda0<? super R> viewTransitionExternalSyntheticLambda0);

    void removeCallback(@NonNull setTransitionListener settransitionlistener);

    void setRequest(@Nullable Request request);
}
