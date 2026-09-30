package o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.R;
import java.util.concurrent.ExecutionException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class removeDetachedView extends removeAnimatingView<TextureView, SurfaceTexture> {
    private View IAuthTabCallbackStub;

    public boolean IAuthTabCallback_Parcel() {
        return true;
    }

    public removeDetachedView(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TextureView onExtraCallback(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cameraview_texture_view, viewGroup, false);
        viewGroup.addView(viewInflate, 0);
        TextureView textureView = (TextureView) viewInflate.findViewById(R.id.texture_view);
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: o.removeDetachedView.4
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                removeDetachedView.this.onExtraCallbackWithResult(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                removeDetachedView.this.onWarmupCompleted(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                removeDetachedView.this.onNavigationEvent();
                return true;
            }
        });
        this.IAuthTabCallbackStub = viewInflate;
        return textureView;
    }

    public View onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public Class<SurfaceTexture> onWarmupCompleted() {
        return SurfaceTexture.class;
    }

    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public SurfaceTexture onExtraCallback() {
        return ((TextureView) onTransact()).getSurfaceTexture();
    }

    protected void onWarmupCompleted(@Nullable final removeAnimatingView$onExtraCallback removeanimatingview_onextracallback) {
        ((TextureView) onTransact()).post(new Runnable() { // from class: o.removeDetachedView.2
            @Override // java.lang.Runnable
            public void run() {
                int i;
                int i2;
                float fOnWarmupCompleted;
                removeDetachedView removedetachedview = removeDetachedView.this;
                if (((removeAnimatingView) removedetachedview).onNavigationEvent == 0 || ((removeAnimatingView) removedetachedview).onTransact == 0 || (i = ((removeAnimatingView) removedetachedview).asInterface) == 0 || (i2 = ((removeAnimatingView) removedetachedview).IAuthTabCallbackDefault) == 0) {
                    return;
                }
                removeItemDecoration removeitemdecorationOnExtraCallback = removeItemDecoration.onExtraCallback(i2, i);
                removeDetachedView removedetachedview2 = removeDetachedView.this;
                removeItemDecoration removeitemdecorationOnExtraCallback2 = removeItemDecoration.onExtraCallback(((removeAnimatingView) removedetachedview2).onTransact, ((removeAnimatingView) removedetachedview2).onNavigationEvent);
                float f = 1.0f;
                if (removeitemdecorationOnExtraCallback.onWarmupCompleted() >= removeitemdecorationOnExtraCallback2.onWarmupCompleted()) {
                    fOnWarmupCompleted = removeitemdecorationOnExtraCallback.onWarmupCompleted() / removeitemdecorationOnExtraCallback2.onWarmupCompleted();
                } else {
                    float fOnWarmupCompleted2 = removeitemdecorationOnExtraCallback2.onWarmupCompleted() / removeitemdecorationOnExtraCallback.onWarmupCompleted();
                    fOnWarmupCompleted = 1.0f;
                    f = fOnWarmupCompleted2;
                }
                ((TextureView) removeDetachedView.this.onTransact()).setScaleX(f);
                ((TextureView) removeDetachedView.this.onTransact()).setScaleY(fOnWarmupCompleted);
                ((removeAnimatingView) removeDetachedView.this).onExtraCallbackWithResult = f > 1.02f || fOnWarmupCompleted > 1.02f;
                addFocusables addfocusables = removeAnimatingView.IAuthTabCallback;
                addfocusables.onExtraCallbackWithResult(new Object[]{"crop:", "applied scaleX=", Float.valueOf(f)});
                addfocusables.onExtraCallbackWithResult(new Object[]{"crop:", "applied scaleY=", Float.valueOf(fOnWarmupCompleted)});
            }
        });
    }

    public void onExtraCallback(final int i) {
        super.onExtraCallback(i);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((TextureView) onTransact()).post(new Runnable() { // from class: o.removeDetachedView.1
            @Override // java.lang.Runnable
            public void run() {
                Matrix matrix = new Matrix();
                removeDetachedView removedetachedview = removeDetachedView.this;
                float f = ((removeAnimatingView) removedetachedview).IAuthTabCallbackDefault;
                float f2 = f / 2.0f;
                float f3 = ((removeAnimatingView) removedetachedview).asInterface;
                float f4 = f3 / 2.0f;
                if (i % 180 != 0) {
                    float f5 = f3 / f;
                    matrix.postScale(f5, 1.0f / f5, f2, f4);
                }
                matrix.postRotate(i, f2, f4);
                ((TextureView) removeDetachedView.this.onTransact()).setTransform(matrix);
                taskCompletionSource.setResult((Object) null);
            }
        });
        try {
            Tasks.await(taskCompletionSource.getTask());
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
