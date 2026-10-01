package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class recordAnimationInfoIfBouncedHiddenView extends removeAnimatingView<SurfaceView, SurfaceHolder> {
    private static final addFocusables IAuthTabCallbackStub = addFocusables.onExtraCallback(recordAnimationInfoIfBouncedHiddenView.class.getSimpleName());
    private View access000;
    private boolean asBinder;

    public recordAnimationInfoIfBouncedHiddenView(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public SurfaceView onExtraCallback(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cameraview_surface_view, viewGroup, false);
        viewGroup.addView(viewInflate, 0);
        SurfaceView surfaceView = (SurfaceView) viewInflate.findViewById(R.id.surface_view);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new SurfaceHolder.Callback() { // from class: o.recordAnimationInfoIfBouncedHiddenView.3
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                recordAnimationInfoIfBouncedHiddenView.IAuthTabCallbackStub.onExtraCallbackWithResult(new Object[]{"callback: surfaceCreated."});
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                recordAnimationInfoIfBouncedHiddenView.IAuthTabCallbackStub.onExtraCallbackWithResult(new Object[]{"callback:", "surfaceChanged", "w:", Integer.valueOf(i2), "h:", Integer.valueOf(i3), "dispatched:", Boolean.valueOf(recordAnimationInfoIfBouncedHiddenView.this.asBinder)});
                if (!recordAnimationInfoIfBouncedHiddenView.this.asBinder) {
                    recordAnimationInfoIfBouncedHiddenView.this.onExtraCallbackWithResult(i2, i3);
                    recordAnimationInfoIfBouncedHiddenView.this.asBinder = true;
                } else {
                    recordAnimationInfoIfBouncedHiddenView.this.onWarmupCompleted(i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                recordAnimationInfoIfBouncedHiddenView.IAuthTabCallbackStub.onExtraCallbackWithResult(new Object[]{"callback: surfaceDestroyed"});
                recordAnimationInfoIfBouncedHiddenView.this.onNavigationEvent();
                recordAnimationInfoIfBouncedHiddenView.this.asBinder = false;
            }
        });
        this.access000 = viewInflate;
        return surfaceView;
    }

    public View onExtraCallbackWithResult() {
        return this.access000;
    }

    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public SurfaceHolder onExtraCallback() {
        return ((SurfaceView) onTransact()).getHolder();
    }

    public Class<SurfaceHolder> onWarmupCompleted() {
        return SurfaceHolder.class;
    }
}
