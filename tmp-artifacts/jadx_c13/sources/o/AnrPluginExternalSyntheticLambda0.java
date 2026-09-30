package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.atom.text.Typography;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrPluginExternalSyntheticLambda1;
import o.RecomposerawaitIdle2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AnrPluginExternalSyntheticLambda0 {
    public static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final String onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    public static final AnrPluginExternalSyntheticLambda0 onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = 3 - (b * 4);
        int i5 = 97 - (i * 2);
        int i6 = 1 - (b2 * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 0;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0), 64 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 65, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 58, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        onNavigationEvent = new AnrPluginExternalSyntheticLambda0();
        int i = asInterface + 91;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i3);
        int i11 = ~i3;
        int i12 = i11 | i2;
        int i13 = ~(i4 | i12);
        int i14 = i9 | i10 | i13;
        int i15 = i13 | (~(i7 | i11 | i8));
        int i16 = (~i12) | i10;
        int i17 = i2 + i3 + i6 + ((-573665793) * i) + ((-1595597844) * i5);
        int i18 = i17 * i17;
        int i19 = ((-1787860089) * i2) + 959184896 + (1033409659 * i3) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i6) + (1316749312 * i) + (833617920 * i5) + (497221632 * i18);
        int i20 = ((i2 * 2143800573) - 1595758) + (i3 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i6 * 2143800411) + (i * 1405922725) + (i5 * (-1943733020)) + (i18 * 1827733504);
        int i21 = i19 + (i20 * i20 * (-911933440));
        return i21 != 1 ? i21 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private AnrPluginExternalSyntheticLambda0() {
    }

    public final float onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        if (displayMetrics.widthPixels / displayMetrics.density < 600.0f) {
            int i2 = asBinder + 113;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 70 / 0;
            }
            return 0.85f;
        }
        int i4 = onTransact;
        int i5 = i4 + 41;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 83;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return 0.8f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            if (displayMetrics.widthPixels - displayMetrics.density < 600.0f) {
                return 0.8f;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            if (displayMetrics2.widthPixels / displayMetrics2.density < 600.0f) {
                return 0.8f;
            }
        }
        int i3 = onTransact + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return 0.75f;
    }

    public final int IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        if (displayMetrics.widthPixels / displayMetrics.density < 375.0f) {
            int i2 = onTransact + 39;
            asBinder = i2 % 128;
            return setTagsokhttp.onExtraCallback(context, Integer.valueOf(i2 % 2 == 0 ? 69 : 20));
        }
        int iOnExtraCallback = setTagsokhttp.onExtraCallback(context, 32);
        int i3 = asBinder + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallback;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 99;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 59697), 17 - Drawable.resolveOpacity(0, 0), View.combineMeasuredStates(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 31, 20219 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), '\\' - AndroidCharacter.getMirror('0'), View.MeasureSpec.getMode(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 11;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $11 + 43;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49123), (-16777172) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 1495, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49123), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, (ViewConfiguration.getScrollBarSize() >> 8) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    public final void onWarmupCompleted(@NotNull View view) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iIAuthTabCallback = i4 - varyMatches.IAuthTabCallback(64, context);
        int i6 = (int) (iIAuthTabCallback * 1.6344827f);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iMin = Math.min(i5 - varyMatches.IAuthTabCallback(Integer.valueOf(Imgproc.COLOR_BGR2YUV_YVYU), context2), (int) (i5 * 0.7f));
        if (i6 <= iMin) {
            int i7 = onTransact + 69;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                getWrite.IAuthTabCallback(Integer.valueOf(iIAuthTabCallback), Integer.valueOf(i6));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(iIAuthTabCallback), Integer.valueOf(i6));
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf((int) (iMin / 1.6344827f)), Integer.valueOf(iMin));
        }
        int iIntValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).intValue();
        int iIntValue2 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        view.setLayoutParams(layoutParams);
        view.setPivotX(iIntValue / 2.0f);
        view.setPivotY(iIntValue2 / 2.0f);
        int i8 = onTransact + 49;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    public final ViewGroup.LayoutParams onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Point pointOnWarmupCompleted = onWarmupCompleted(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(pointOnWarmupCompleted.x, pointOnWarmupCompleted.y);
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return layoutParams;
        }
        throw null;
    }

    public final Point onWarmupCompleted(@NotNull Context context) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        int iIAuthTabCallback = i4 - varyMatches.IAuthTabCallback(64, context);
        int i6 = (int) (iIAuthTabCallback * 1.6344827f);
        int iMin = Math.min(i5 - varyMatches.IAuthTabCallback(Integer.valueOf(Imgproc.COLOR_BGR2YUV_YVYU), context), (int) (i5 * 0.7f));
        if (i6 <= iMin) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(iIAuthTabCallback), Integer.valueOf(i6));
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf((int) (iMin / 1.6344827f)), Integer.valueOf(iMin));
            int i7 = asBinder + 123;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        return new Point(((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).intValue(), ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue());
    }

    public final Point asInterface(@NotNull Context context) {
        int iMin;
        int iIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        if (displayMetrics.widthPixels / displayMetrics.density < 450.0f) {
            int i2 = asBinder + 31;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iMin = M_.onExtraCallback.asInterface();
            iIAuthTabCallback = varyMatches.IAuthTabCallback(20, context);
        } else {
            iMin = Math.min((int) (M_.onExtraCallback.asInterface() * 0.7d), varyMatches.IAuthTabCallback(375, context));
            iIAuthTabCallback = varyMatches.IAuthTabCallback(20, context);
            int i4 = asBinder + 31;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
        }
        int i6 = iMin - iIAuthTabCallback;
        Point point = new Point(i6, (int) (i6 * 0.6118143f));
        int i7 = onTransact + 49;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return point;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[1];
        AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1 = (AnrPluginExternalSyntheticLambda1) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.onPostMessage(), null, 2, null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.ICustomTabsCallbackStubProxy(), null, 2, null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.isEngagementSignalsApiAvailable(), null, 2, null);
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0, Context context, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = asBinder + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            list = CollectionsKt__CollectionsKt.listOf((Object[]) new AnrPluginExternalSyntheticLambda1[]{AnrPluginExternalSyntheticLambda1.onExtraCallback.onExtraCallback, AnrPluginExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallback});
        }
        anrPluginExternalSyntheticLambda0.onNavigationEvent(context, (List<? extends AnrPluginExternalSyntheticLambda1>) list);
        int i5 = asBinder + 35;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull List<? extends AnrPluginExternalSyntheticLambda1> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        int i2 = asBinder + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = asBinder + 103;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent.onNavigationEvent(context, (AnrPluginExternalSyntheticLambda1) it.next());
                throw null;
            }
            onNavigationEvent.onNavigationEvent(context, (AnrPluginExternalSyntheticLambda1) it.next());
        }
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.onPostMessage(), null, 2, null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.isEngagementSignalsApiAvailable(), null, 2, null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.IAuthTabCallbackStub(), null, 2, null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.ICustomTabsCallbackStubProxy(), null, 2, null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), anrPluginExternalSyntheticLambda1.isEngagementSignalsApiAvailable(), null, 2, null);
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[1];
        CharSequence charSequence = (CharSequence) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Typography typography = new Typography(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        typography.setTextSize(2, fFloatValue);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        typography.onWarmupCompleted(varyMatches.onNavigationEvent(Float.valueOf(fFloatValue), r1));
        int height = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), typography.getPaint(), iIntValue).setIncludePad(typography.getIncludeFontPadding()).setLineSpacing(typography.getLineSpacingExtra(), typography.getLineSpacingMultiplier()).build().getHeight();
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(height);
        }
        int i3 = 23 / 0;
        return Integer.valueOf(height);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        Integer numIAuthTabCallback = m_.IAuthTabCallback();
        if (numIAuthTabCallback != null) {
            return Integer.valueOf(numIAuthTabCallback.intValue());
        }
        int iOnExtraCallbackWithResult = m_.onExtraCallbackWithResult();
        int i4 = asBinder + 51;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iOnExtraCallbackWithResult);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() throws Resources.NotFoundException {
        int i = 2 % 2;
        M_ m_ = M_.onExtraCallback;
        Integer numIAuthTabCallback = m_.IAuthTabCallback();
        if (numIAuthTabCallback != null) {
            int i2 = asBinder + 99;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return numIAuthTabCallback.intValue();
        }
        int iAccess000 = m_.access000();
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return iAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void asBinder(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        EnumEntries<getReleaseStage> entries = getReleaseStage.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10));
        Iterator<getReleaseStage> it = entries.iterator();
        while (it.hasNext()) {
            int i2 = asBinder + 99;
            onTransact = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                it.next().dimUrl(context);
                obj.hashCode();
                throw null;
            }
            getReleaseStage next = it.next();
            String strDimUrl = next.dimUrl(context);
            if (strDimUrl != null) {
                LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strDimUrl, null, 2, null);
                CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context).onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(strDimUrl).onExtraCallbackWithResult());
            }
            LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), next.backgroundUrl(context), null, 2, null);
            LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), next.logoUrl(context), null, 2, null);
            CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context).onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(next.logoUrl(context)).onExtraCallbackWithResult());
            arrayList.add(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context).onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(next.backgroundUrl(context)).onExtraCallbackWithResult()));
        }
        int i3 = onTransact + 125;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
    }

    public final int IAuthTabCallback(@NotNull Context context, @NotNull CharSequence charSequence, float f, int i) {
        Object[] objArr = {this, context, charSequence, Float.valueOf(f), Integer.valueOf(i)};
        return ((Integer) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1367378881, -1367378879, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
    }

    public final int onExtraCallback() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Integer) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1431678441, -1431678440, iOnNavigationEvent, new Object[]{this}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue();
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -565723721, 565723721, iOnNavigationEvent, new Object[]{this, context, anrPluginExternalSyntheticLambda1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{60860, 33780, 12552, 42840, 21751, 51786, 30723, 59831, 40711, 3412, 41725, 20540, 50765, 30707, 58722, 39756, 2299, 48691, 11343, 56774, 29485, 57693, 38595, 1073, 47692, 11215, 55601, 20327, 64646, 37433, '`', 45469, 10008, 54633, 19103, 63693, 28266, 8067, 36297, 9015, 53400, 18127, 62589, 26028, 7117, 35198, 16043, 44181, 17020, 62383, 25040, 5895, 33955, 15042, 43021, 22965, 53145, 32013, 4797, 33019, 13839, 43006, 22012, 51990, 30899, 60860, 33780, 12552, 42840, 21751, 51786, 30723, 59831, 40711, 3412, 41725, 20540, 50765, 30707, 58722, 39756, 2299, 48691, 11343, 56774, 29485, 57693, 38595, 1073, 47692, 11215, 55601, 20327, 64646, 37433, '`', 45469, 10008, 54633, 19103, 63693, 28266, 8067, 36297, 9015, 53382, 18117, 62589, 26020, 7049, 35187, 16045, 44234, 17008, 62445, 25041, 5897, 33975, 15067, 43074, 22952, 53210, 32007};
        onWarmupCompleted = 8073135413495759744L;
    }
}
