package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.cameraview.R;
import com.otaliastudios.cameraview.preview.RendererCameraPreview;
import com.otaliastudios.cameraview.preview.RendererFrameCallback;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class removeAndRecycleViews extends removeAnimatingView<GLSurfaceView, SurfaceTexture> implements processDataSetCompletelyChanged, RendererCameraPreview {
    float IAuthTabCallbackStub;
    private SurfaceTexture IAuthTabCallbackStubProxy;
    private final Set<RendererFrameCallback> IAuthTabCallback_Parcel;
    private boolean access000;
    private markKnownViewsInvalid access100;
    float asBinder;
    private getEdgeEffectFactory getInterfaceDescriptor;
    private View writeTypedObject;

    public boolean IAuthTabCallback_Parcel() {
        return true;
    }

    public removeAndRecycleViews(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        super(context, viewGroup);
        this.IAuthTabCallback_Parcel = new CopyOnWriteArraySet();
        this.asBinder = 1.0f;
        this.IAuthTabCallbackStub = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public GLSurfaceView onExtraCallback(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.cameraview_gl_view, viewGroup, false);
        GLSurfaceView gLSurfaceView = (GLSurfaceView) viewGroup2.findViewById(R.id.gl_surface_view);
        onExtraCallback interfaceDescriptor = getInterfaceDescriptor();
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(interfaceDescriptor);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.getHolder().addCallback(new 3(this, gLSurfaceView, interfaceDescriptor));
        viewGroup.addView(viewGroup2, 0);
        this.writeTypedObject = viewGroup2;
        return gLSurfaceView;
    }

    public View onExtraCallbackWithResult() {
        return this.writeTypedObject;
    }

    public void IAuthTabCallbackStubProxy() {
        super.IAuthTabCallbackStubProxy();
        ((GLSurfaceView) onTransact()).onResume();
    }

    public void access000() {
        super.access000();
        ((GLSurfaceView) onTransact()).onPause();
    }

    public void asInterface() {
        super.asInterface();
        this.IAuthTabCallback_Parcel.clear();
    }

    public Class<SurfaceTexture> onWarmupCompleted() {
        return SurfaceTexture.class;
    }

    /* renamed from: access100, reason: merged with bridge method [inline-methods] */
    public SurfaceTexture onExtraCallback() {
        return this.IAuthTabCallbackStubProxy;
    }

    protected void onWarmupCompleted(@Nullable removeAnimatingView$onExtraCallback removeanimatingview_onextracallback) {
        int i;
        int i2;
        float fOnWarmupCompleted;
        float fOnWarmupCompleted2;
        if (((removeAnimatingView) this).onTransact <= 0 || ((removeAnimatingView) this).onNavigationEvent <= 0 || (i = ((removeAnimatingView) this).IAuthTabCallbackDefault) <= 0 || (i2 = ((removeAnimatingView) this).asInterface) <= 0) {
            return;
        }
        removeItemDecoration removeitemdecorationOnExtraCallback = removeItemDecoration.onExtraCallback(i, i2);
        removeItemDecoration removeitemdecorationOnExtraCallback2 = removeItemDecoration.onExtraCallback(((removeAnimatingView) this).onTransact, ((removeAnimatingView) this).onNavigationEvent);
        if (removeitemdecorationOnExtraCallback.onWarmupCompleted() >= removeitemdecorationOnExtraCallback2.onWarmupCompleted()) {
            fOnWarmupCompleted2 = removeitemdecorationOnExtraCallback.onWarmupCompleted() / removeitemdecorationOnExtraCallback2.onWarmupCompleted();
            fOnWarmupCompleted = 1.0f;
        } else {
            fOnWarmupCompleted = removeitemdecorationOnExtraCallback2.onWarmupCompleted() / removeitemdecorationOnExtraCallback.onWarmupCompleted();
            fOnWarmupCompleted2 = 1.0f;
        }
        ((removeAnimatingView) this).onExtraCallbackWithResult = fOnWarmupCompleted > 1.02f || fOnWarmupCompleted2 > 1.02f;
        this.asBinder = 1.0f / fOnWarmupCompleted;
        this.IAuthTabCallbackStub = 1.0f / fOnWarmupCompleted2;
        ((GLSurfaceView) onTransact()).requestRender();
    }

    @Override // com.otaliastudios.cameraview.preview.RendererCameraPreview
    public void onWarmupCompleted(@NonNull final RendererFrameCallback rendererFrameCallback) {
        ((GLSurfaceView) onTransact()).queueEvent(new Runnable() { // from class: o.removeAndRecycleViews.2
            @Override // java.lang.Runnable
            public void run() {
                removeAndRecycleViews.this.IAuthTabCallback_Parcel.add(rendererFrameCallback);
                if (removeAndRecycleViews.this.access100 != null) {
                    rendererFrameCallback.onExtraCallbackWithResult(removeAndRecycleViews.this.access100.onExtraCallback().onExtraCallbackWithResult());
                }
                rendererFrameCallback.onExtraCallback(removeAndRecycleViews.this.getInterfaceDescriptor);
            }
        });
    }

    @Override // com.otaliastudios.cameraview.preview.RendererCameraPreview
    public void onExtraCallbackWithResult(@NonNull RendererFrameCallback rendererFrameCallback) {
        this.IAuthTabCallback_Parcel.remove(rendererFrameCallback);
    }

    protected onExtraCallback getInterfaceDescriptor() {
        return new onExtraCallback(this);
    }

    public getEdgeEffectFactory IAuthTabCallback() {
        return this.getInterfaceDescriptor;
    }

    public void IAuthTabCallback(@NonNull final getEdgeEffectFactory getedgeeffectfactory) {
        this.getInterfaceDescriptor = getedgeeffectfactory;
        if (asBinder()) {
            getedgeeffectfactory.onNavigationEvent(((removeAnimatingView) this).IAuthTabCallbackDefault, ((removeAnimatingView) this).asInterface);
        }
        ((GLSurfaceView) onTransact()).queueEvent(new Runnable() { // from class: o.removeAndRecycleViews.1
            @Override // java.lang.Runnable
            public void run() {
                if (removeAndRecycleViews.this.access100 != null) {
                    removeAndRecycleViews.this.access100.IAuthTabCallback(getedgeeffectfactory);
                }
                Iterator it = removeAndRecycleViews.this.IAuthTabCallback_Parcel.iterator();
                while (it.hasNext()) {
                    ((RendererFrameCallback) it.next()).onExtraCallback(getedgeeffectfactory);
                }
            }
        });
    }
}
