package o;

import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.engine.offset.Reference;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class getChildPosition {
    private static final addFocusables onWarmupCompleted = addFocusables.onExtraCallback(getChildPosition.class.getSimpleName());
    private clearOldPositions onExtraCallbackWithResult;
    int onNavigationEvent = 0;
    int onExtraCallback = 0;
    int IAuthTabCallback = 0;

    public void onWarmupCompleted(@NonNull clearOldPositions clearoldpositions, int i) {
        onNavigationEvent(i);
        this.onExtraCallbackWithResult = clearoldpositions;
        this.onNavigationEvent = i;
        if (clearoldpositions == clearOldPositions.FRONT) {
            this.onNavigationEvent = onWarmupCompleted(360 - i);
        }
        onExtraCallback();
    }

    public void onExtraCallback(int i) {
        onNavigationEvent(i);
        this.onExtraCallback = i;
        onExtraCallback();
    }

    public void IAuthTabCallback(int i) {
        onNavigationEvent(i);
        this.IAuthTabCallback = i;
        onExtraCallback();
    }

    private void onExtraCallback() {
        onWarmupCompleted.onExtraCallbackWithResult(new Object[]{"Angles changed:", "sensorOffset:", Integer.valueOf(this.onNavigationEvent), "displayOffset:", Integer.valueOf(this.onExtraCallback), "deviceOrientation:", Integer.valueOf(this.IAuthTabCallback)});
    }

    public int onWarmupCompleted(@NonNull Reference reference, @NonNull Reference reference2, @NonNull getChildViewHolder getchildviewholder) {
        int iOnNavigationEvent = onNavigationEvent(reference, reference2);
        return (getchildviewholder == getChildViewHolder.RELATIVE_TO_SENSOR && this.onExtraCallbackWithResult == clearOldPositions.FRONT) ? onWarmupCompleted(360 - iOnNavigationEvent) : iOnNavigationEvent;
    }

    private int onNavigationEvent(@NonNull Reference reference, @NonNull Reference reference2) {
        if (reference == reference2) {
            return 0;
        }
        Reference reference3 = Reference.BASE;
        if (reference2 == reference3) {
            return onWarmupCompleted(360 - onNavigationEvent(reference2, reference));
        }
        if (reference == reference3) {
            int i = AnonymousClass5.onNavigationEvent[reference2.ordinal()];
            if (i == 1) {
                return onWarmupCompleted(360 - this.onExtraCallback);
            }
            if (i == 2) {
                return onWarmupCompleted(this.IAuthTabCallback);
            }
            if (i == 3) {
                return onWarmupCompleted(360 - this.onNavigationEvent);
            }
            throw new RuntimeException("Unknown reference: " + reference2);
        }
        return onWarmupCompleted(onNavigationEvent(reference3, reference2) - onNavigationEvent(reference3, reference));
    }

    /* renamed from: o.getChildPosition$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[Reference.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[Reference.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[Reference.OUTPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[Reference.SENSOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean IAuthTabCallback(@NonNull Reference reference, @NonNull Reference reference2) {
        return onWarmupCompleted(reference, reference2, getChildViewHolder.ABSOLUTE) % 180 != 0;
    }

    private void onNavigationEvent(int i) {
        if (i == 0 || i == 90 || i == 180 || i == 270) {
            return;
        }
        throw new IllegalStateException("This value is not sanitized: " + i);
    }

    private int onWarmupCompleted(int i) {
        return (i + 360) % 360;
    }
}
