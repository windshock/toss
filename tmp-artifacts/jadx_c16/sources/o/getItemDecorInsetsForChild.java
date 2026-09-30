package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.R$styleable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getItemDecorInsetsForChild {
    private getEdgeEffectFactory onNavigationEvent;

    public getItemDecorInsetsForChild(@NonNull TypedArray typedArray) {
        this.onNavigationEvent = null;
        try {
            this.onNavigationEvent = (getEdgeEffectFactory) Class.forName(typedArray.getString(R$styleable.CameraView_cameraFilter)).newInstance();
        } catch (Exception unused) {
            this.onNavigationEvent = new getMaxFlingVelocity();
        }
    }

    public getEdgeEffectFactory onExtraCallback() {
        return this.onNavigationEvent;
    }
}
