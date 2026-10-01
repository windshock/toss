package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackNativeAdCustomTabsTabHidden implements trackEvent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 8694523591111973336L;
    private static int onNavigationEvent = 1;
    private final zzag IAuthTabCallback;
    private final Context onWarmupCompleted;

    @Inject
    public trackNativeAdCustomTabsTabHidden(@NotNull Context context, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.onWarmupCompleted = context;
        this.IAuthTabCallback = zzagVar;
    }

    @Override // o.trackEvent
    public void onExtraCallbackWithResult(@NotNull trackInAppPurchase trackinapppurchase) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(trackinapppurchase, "");
        if (!trackinapppurchase.asInterface()) {
            return;
        }
        int i3 = onExtraCallback + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Long lOnExtraCallback = trackinapppurchase.onExtraCallback();
        long jIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
        if (lOnExtraCallback != null) {
            int i5 = onExtraCallback + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                lOnExtraCallback.longValue();
                throw null;
            }
            long jLongValue = lOnExtraCallback.longValue();
            if (jLongValue > jIAuthTabCallbackDefault) {
                Context context = this.onWarmupCompleted;
                Intent intent = new Intent(context, (Class<?>) getCRLNumber.class);
                intent.setAction("action.SCHEDULED_NOTIFICATION");
                intent.putExtra("requestCode", trackinapppurchase.onExtraCallbackWithResult());
                Object[] objArr = new Object[1];
                a(new char[]{7323, 31747, 56721, 15628, 40606}, 24709 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                intent.putExtra(((String) objArr[0]).intern(), trackinapppurchase.IAuthTabCallbackStub());
                Object[] objArr2 = new Object[1];
                a(new char[]{7298, 19243, 46046, 6783, 16906, 43693, 4428}, 22434 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                intent.putExtra(((String) objArr2[0]).intern(), trackinapppurchase.onWarmupCompleted());
                Object[] objArr3 = new Object[1];
                a(new char[]{7322, 19690, 48232}, ExpandableListView.getPackedPositionGroup(0L) + 20599, objArr3);
                intent.putExtra(((String) objArr3[0]).intern(), trackinapppurchase.IAuthTabCallback());
                intent.putExtra("mute", trackinapppurchase.onNavigationEvent());
                if (Build.VERSION.SDK_INT >= 31) {
                    int i6 = onExtraCallback + 55;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    i = 167772160;
                } else {
                    i = 134217728;
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, trackinapppurchase.onExtraCallbackWithResult(), intent, i);
                Object systemService = context.getSystemService("alarm");
                Intrinsics.checkNotNull(systemService, "");
                ((AlarmManager) systemService).set(0, jLongValue, broadcast);
            }
        }
    }

    @Override // o.trackEvent
    public void IAuthTabCallback(@NotNull Context context, @Nullable String str) throws NumberFormatException {
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(context, (Class<?>) getCRLNumber.class);
        intent.setAction("action.SCHEDULED_NOTIFICATION");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 134217728;
        }
        if (str != null) {
            int i6 = onExtraCallback + 75;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                Integer.parseInt(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = Integer.parseInt(str);
        } else {
            i2 = 10002;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i2, intent, i);
        alarmManager.cancel(broadcast);
        broadcast.cancel();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 24, Color.argb(0, 0, 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 59 - (ViewConfiguration.getTouchSlop() >> 8), 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 111;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getWindowTouchSlop() >> 8), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i6 = $11 + 65;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.trackEvent
    public void IAuthTabCallback(int i) {
        EncodedDataImplExternalSyntheticLambda0 encodedDataImplExternalSyntheticLambda0OnNavigationEvent;
        String strValueOf;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            encodedDataImplExternalSyntheticLambda0OnNavigationEvent = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this.onWarmupCompleted);
            strValueOf = String.valueOf(i);
            i2 = 24693;
        } else {
            encodedDataImplExternalSyntheticLambda0OnNavigationEvent = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(this.onWarmupCompleted);
            strValueOf = String.valueOf(i);
            i2 = 10001;
        }
        encodedDataImplExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent(strValueOf, i2);
        int i5 = onExtraCallback + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    @Override // o.trackEvent
    public void onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Date date, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(date, "");
        if (Build.VERSION.SDK_INT >= 31) {
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i2 = 167772160;
        } else {
            int i6 = onNavigationEvent + 83;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = 134217728;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, onExtraCallback(context, str, str2, str3, i), i2);
        Object systemService = context.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "");
        ((AlarmManager) systemService).setAndAllowWhileIdle(0, date.getTime(), broadcast);
        int i8 = onExtraCallback + 113;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Intent onExtraCallback(Context context, String str, String str2, String str3, int i) throws Throwable {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) getCRLNumber.class);
        intent.setAction("action.SCHEDULED_NOTIFICATION");
        intent.putExtra("requestCode", i);
        Object[] objArr = new Object[1];
        a(new char[]{7323, 31747, 56721, 15628, 40606}, 24709 - Drawable.resolveOpacity(0, 0), objArr);
        intent.putExtra(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{7298, 19243, 46046, 6783, 16906, 43693, 4428}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22432, objArr2);
        intent.putExtra(((String) objArr2[0]).intern(), str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{7322, 19690, 48232}, 20599 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        intent.putExtra(((String) objArr3[0]).intern(), Uri.parse(str3));
        int i3 = onNavigationEvent + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }
}
