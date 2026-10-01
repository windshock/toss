package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.splash.SchemeActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getNavigationBar {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = -3614905971685691503L;

    public static final void IAuthTabCallback(@NotNull Intent intent, @NotNull Context context) throws Throwable {
        String scheme;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(context, "");
        Uri data = intent.getData();
        if (data != null) {
            scheme = data.getScheme();
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            scheme = null;
        }
        Object[] objArr = new Object[1];
        a(new char[]{3505, 3522, 55615, 42915, 7498, 52695, 36585, 8440, 24503, 48730, 56418, 36210, 43306}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        if (Intrinsics.areEqual(scheme, ((String) objArr[0]).intern())) {
            intent.setClass(context, SchemeActivity.class);
        }
        context.startActivity(intent);
        int i6 = IAuthTabCallback + 43;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
    }

    public static final void IAuthTabCallback(@NotNull Intent intent, @NotNull Activity activity, int i) throws Throwable {
        String scheme;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(activity, "");
            intent.getData();
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Uri data = intent.getData();
        if (data != null) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            scheme = data.getScheme();
            int i6 = onExtraCallback + 75;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            scheme = null;
        }
        Object[] objArr = new Object[1];
        a(new char[]{3505, 3522, 55615, 42915, 7498, 52695, 36585, 8440, 24503, 48730, 56418, 36210, 43306}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr);
        if (Intrinsics.areEqual(scheme, ((String) objArr[0]).intern())) {
            int i8 = IAuthTabCallback + 45;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                intent.setClass(activity, SchemeActivity.class);
                throw null;
            }
            intent.setClass(activity, SchemeActivity.class);
        }
        activity.startActivityForResult(intent, i);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 107;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 84 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14184), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 8856 - AndroidCharacter.getMirror('0'), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 81;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
