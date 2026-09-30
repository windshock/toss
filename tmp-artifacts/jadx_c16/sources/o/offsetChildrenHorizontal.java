package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.R$styleable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class offsetChildrenHorizontal {
    private offsetPositionRecordsForInsert onNavigationEvent;

    public offsetChildrenHorizontal(@NonNull TypedArray typedArray) {
        this.onNavigationEvent = null;
        String string = typedArray.getString(R$styleable.CameraView_cameraAutoFocusMarker);
        if (string != null) {
            try {
                this.onNavigationEvent = (offsetPositionRecordsForInsert) Class.forName(string).newInstance();
            } catch (Exception unused) {
            }
        }
    }

    public offsetPositionRecordsForInsert onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
