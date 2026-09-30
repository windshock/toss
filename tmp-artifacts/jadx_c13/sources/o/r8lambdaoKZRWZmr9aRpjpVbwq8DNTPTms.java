package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity;
import im.toss.securities.widget.common.utils.RoutesKt;
import im.toss.tosssecurities.widget.watchlist.small.SecuritiesWatchlistSmallAppWidgetReceiver;
import im.toss.tosssecurities.widget.watchlist.small.setting.SmallWidgetWatchlistSelectActivity;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char[] onExtraCallback = null;
    public static final r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = new r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms();
        int i = IAuthTabCallback + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
    }

    private r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms() {
    }

    public static /* synthetic */ PendingIntent onExtraCallback(r8lambdaoKZRWZmr9aRpjpVbwq8DNTPTms r8lambdaokzrwzmr9arpjpvbwq8dntptms, Context context, int i, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, Long l, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 5;
        int i5 = i4 % 128;
        asBinder = i5;
        if (i4 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 45) != 0) {
            int i6 = i5 + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            l = null;
        }
        return r8lambdaokzrwzmr9arpjpvbwq8dntptms.IAuthTabCallback(context, i, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, l);
    }

    public final PendingIntent IAuthTabCallback(@NotNull Context context, int i, @Nullable r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @Nullable Long l) {
        String strOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 27;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg2 = r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (r8lambdabrizzqzhaizmdvstl2yymmz7zsg == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET) {
            int i4 = onNavigationEvent + 41;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                RoutesKt.onExtraCallback();
                throw null;
            }
            strOnExtraCallback = RoutesKt.onExtraCallback();
        } else {
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
            strOnExtraCallback = (String) RoutesKt.onNavigationEvent(iIAuthTabCallback, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 199646709, new Object[]{l});
        }
        PendingIntent activity = PendingIntent.getActivity(context, i, IAuthTabCallback(context, strOnExtraCallback, i, q8ExternalSyntheticLambda4.small, q8ExternalSyntheticLambda5.stocks), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        return activity;
    }

    public final PendingIntent onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(PendingIntent.getActivity(context, i, IAuthTabCallback(context, (String) RoutesKt.onNavigationEvent(iIAuthTabCallback, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 199646709, new Object[]{null}), i, q8ExternalSyntheticLambda4.small, q8ExternalSyntheticLambda5.stocks), 201326592), "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
        PendingIntent activity = PendingIntent.getActivity(context, i, IAuthTabCallback(context, (String) RoutesKt.onNavigationEvent(iIAuthTabCallback4, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, 199646709, new Object[]{null}), i, q8ExternalSyntheticLambda4.small, q8ExternalSyntheticLambda5.stocks), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i4 = onNavigationEvent + 33;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return activity;
        }
        obj.hashCode();
        throw null;
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) SecuritiesWatchlistSmallAppWidgetReceiver.class);
        intent.setAction("im.toss.securities.widget.watchlist.ACTION_REFRESH_SMALL");
        intent.putExtra("appWidgetId", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i3 = asBinder + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return broadcast;
    }

    public final PendingIntent onExtraCallback(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intent = new Intent(context, (Class<?>) SmallWidgetWatchlistSelectActivity.class);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widgetType", "stocks");
        intent.putExtra("widgetSize", "small");
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(context, i + 10000, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = asBinder + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return activity;
        }
        throw null;
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull String str) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intent intentIAuthTabCallback = IAuthTabCallback(context, str, i, q8ExternalSyntheticLambda4.small, q8ExternalSyntheticLambda5.stocks);
        int iHashCode = str.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(iHashCode);
        PendingIntent activity = PendingIntent.getActivity(context, sb.toString().hashCode(), intentIAuthTabCallback, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        int i3 = asBinder + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return activity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Intent IAuthTabCallback(Context context, String str, int i, q8ExternalSyntheticLambda4 q8externalsyntheticlambda4, q8ExternalSyntheticLambda5 q8externalsyntheticlambda5) throws Throwable {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) TossSecWidgetBridgeActivity.class);
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 0}, true, new byte[]{0, 0, 1}, objArr);
        intent.putExtra(((String) objArr[0]).intern(), str);
        intent.putExtra("appWidgetId", i);
        intent.putExtra("widget_type", q8externalsyntheticlambda5.name());
        intent.putExtra("widget_size", q8externalsyntheticlambda4.name());
        int i3 = onNavigationEvent + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i8 = $11 + 19;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                int i9 = $11 + 15;
                $10 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 35283), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, 14239 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $10 + 79;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 10935), 65 - View.MeasureSpec.getSize(0), 16717 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 29 - Color.green(0), 17657 - Color.blue(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 49467), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 70, (ViewConfiguration.getPressedStateDuration() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $10 + 93;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i18 = $11 + 61;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            loop3: while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i20 = $11 + 55;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        break;
                    }
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[3]);
                int i21 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{27256, 27169, 27197};
    }
}
