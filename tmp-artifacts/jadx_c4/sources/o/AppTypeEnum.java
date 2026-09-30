package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppTypeEnum<T> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 7494263909557487184L;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final RVPub onExtraCallback;
    private final T onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof AppTypeEnum)) {
            return false;
        }
        AppTypeEnum appTypeEnum = (AppTypeEnum) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, appTypeEnum.onNavigationEvent)) {
            int i3 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onExtraCallback != appTypeEnum.onExtraCallback) {
            return false;
        }
        int i5 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        T t;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 != 0 ? (t = this.onNavigationEvent) != null : (t = this.onNavigationEvent) != null) {
            iHashCode = t.hashCode();
        } else {
            int i4 = i2 + 19;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        }
        RVPub rVPub = this.onExtraCallback;
        if (rVPub != null) {
            int i9 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int iHashCode3 = rVPub.hashCode();
                int i10 = 69 / 0;
                iHashCode2 = iHashCode3;
            } else {
                iHashCode2 = rVPub.hashCode();
            }
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        T t = this.onNavigationEvent;
        RVPub rVPub = this.onExtraCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{49975, 15202, 13286, 10849, 8926, 6471, 4574, 2164, 186, 32571, 30644, 28182, 26247, 23876, 21907, 19967, 17531, 48373, 47964, 45967}, 63607 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(t);
        Object[] objArr2 = new Object[1];
        a(new char[]{49995, 23714, 64708, 7333, 48274, 56441, 31836, 40033, 15421, 23576, 65018, 7618, 48536, 56745, 32133, 40297, 15626}, 40933 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(rVPub);
        Object[] objArr3 = new Object[1];
        a(new char[]{49998}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 307, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public AppTypeEnum(T t, @Nullable RVPub rVPub) {
        this.onNavigationEvent = t;
        this.onExtraCallback = rVPub;
    }

    public final T onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        T t = this.onNavigationEvent;
        int i4 = i3 + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return t;
    }

    public final RVPub IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallback != null) {
            return false;
        }
        int i5 = i3 + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, TextUtils.getCapsMode("", 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }
}
