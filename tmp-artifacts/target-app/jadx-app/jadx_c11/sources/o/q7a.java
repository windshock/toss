package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.widget.calendar.SecuritiesCalendarAppWidgetReceiver;
import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity;
import im.toss.securities.widget.common.utils.RoutesKt;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q7a {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final q7a IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    static {
        onWarmupCompleted();
        IAuthTabCallback = new q7a();
        int i = asInterface + 1;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    private q7a() {
    }

    public final PendingIntent onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) SecuritiesCalendarAppWidgetReceiver.class);
        intent.setAction("im.toss.securities.widget.calendar.ACTION_REFRESH");
        intent.putExtra("appWidgetId", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i3 = asBinder + 111;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return broadcast;
        }
        throw null;
    }

    public final PendingIntent IAuthTabCallback(@NotNull Context context, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 19;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            return onExtraCallback(context, i, RoutesKt.IAuthTabCallback());
        }
        Intrinsics.checkNotNullParameter(context, "");
        onExtraCallback(context, i, RoutesKt.IAuthTabCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PendingIntent onWarmupCompleted(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent pendingIntentOnExtraCallback = onExtraCallback(context, i, RoutesKt.onExtraCallback());
        int i5 = IAuthTabCallbackDefault + 93;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return pendingIntentOnExtraCallback;
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        intent.setAction("im.toss.securities.widget.calendar.ACTION_ITEM_CLICK");
        Object[] objArr = new Object[1];
        a(new char[]{37015, 28373, 2824, 23373}, 3 - TextUtils.getOffsetBefore("", 0), objArr);
        intent.putExtra(((String) objArr[0]).intern(), RoutesKt.IAuthTabCallback());
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", "calendar");
        intent.putExtra("widget_size", "medium");
        PendingIntent activity = PendingIntent.getActivity(context, i + 1000, intent, 167772160);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = IAuthTabCallbackDefault + 25;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return activity;
    }

    private final PendingIntent onExtraCallback(Context context, int i, String str) throws Throwable {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        Object[] objArr = new Object[1];
        a(new char[]{37015, 28373, 2824, 23373}, 2 - TextUtils.lastIndexOf("", '0'), objArr);
        intent.putExtra(((String) objArr[0]).intern(), str);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", "calendar");
        intent.putExtra("widget_size", "medium");
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = IAuthTabCallbackDefault + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return activity;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 41;
            $11 = i5 % 128;
            char c = 1;
            if (i5 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $11 + 91;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int mode = View.MeasureSpec.getMode(0) + 10;
                        int defaultSize = 12434 - View.getDefaultSize(0, 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, mode, defaultSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, 12434 - Color.alpha(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 = i11 - 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - View.getDefaultSize(0, 0)), 14 - TextUtils.indexOf("", ""), 19901 - TextUtils.indexOf("", "", 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallback = (char) 55267;
        onNavigationEvent = (char) 43312;
        onWarmupCompleted = (char) 13869;
        onExtraCallbackWithResult = 'J';
    }
}
