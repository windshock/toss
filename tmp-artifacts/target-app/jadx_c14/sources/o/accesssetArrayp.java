package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accesssetArrayp {
    private static long IAuthTabCallback;
    private static boolean IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static boolean asInterface;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    public static final accesssetArrayp onNavigationEvent;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {99, 53, 44, 107};
    private static final int $$b = 205;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = 97 - r7
            byte[] r0 = o.accesssetArrayp.$$a
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesssetArrayp.$$c(short, short, byte):java.lang.String");
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallbackWithResult();
        onNavigationEvent = new accesssetArrayp();
        int i = onTransact + 109;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private accesssetArrayp() {
    }

    public final void onWarmupCompleted(@Nullable Context context) throws Throwable {
        String strIntern;
        String strIntern2;
        String strIntern3;
        String strIntern4;
        String strIntern5;
        String strIntern6;
        String strIntern7;
        Context context2;
        String strIntern8;
        Object obj;
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        asBinder = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 != 0) {
            obj4.hashCode();
            throw null;
        }
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration);
        if (zOnExtraCallback) {
            Object[] objArr = new Object[1];
            a(KeyEvent.getDeadChar(0, 0), 45 - Gravity.getAbsoluteGravity(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a(45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 46 - KeyEvent.normalizeMetaState(0), (char) (30110 - (ViewConfiguration.getTapTimeout() >> 16)), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            int i3 = asBinder + 39;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        if (zOnExtraCallback) {
            Object[] objArr3 = new Object[1];
            a(91 - View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, (char) (Color.rgb(0, 0, 0) + 16786032), objArr3);
            strIntern2 = ((String) objArr3[0]).intern();
        } else {
            Object[] objArr4 = new Object[1];
            a(Drawable.resolveOpacity(0, 0) + 154, TextUtils.lastIndexOf("", '0') + 65, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
            strIntern2 = ((String) objArr4[0]).intern();
        }
        if (zOnExtraCallback) {
            Object[] objArr5 = new Object[1];
            b(null, new byte[]{-108, -114, -125, -118, -112, -105, -106, -109, -117, -114, -110, -113, -107, -112, -110, -126, -114, -107, -120, -113, -121, -112, -108, -110, -108, -120, -109, -110, -111, -112, -121, -113, -122, -114, -120, -125, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
            strIntern3 = ((String) objArr5[0]).intern();
        } else {
            Object[] objArr6 = new Object[1];
            a(TextUtils.getOffsetBefore("", 0) + 218, 63 - Gravity.getAbsoluteGravity(0, 0), (char) View.resolveSize(0, 0), objArr6);
            strIntern3 = ((String) objArr6[0]).intern();
        }
        if (zOnExtraCallback) {
            Object[] objArr7 = new Object[1];
            a(281 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 47, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr7);
            strIntern4 = ((String) objArr7[0]).intern();
        } else {
            Object[] objArr8 = new Object[1];
            b(null, new byte[]{-108, -114, -125, -118, -108, -109, -110, -107, -124, -117, -106, -119, -110, -126, -127, -108, -120, -106, -122, -114, -120, -125, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
            strIntern4 = ((String) objArr8[0]).intern();
        }
        if (zOnExtraCallback) {
            Object[] objArr9 = new Object[1];
            a(328 - (Process.myPid() >> 22), 45 - Color.red(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
            strIntern5 = ((String) objArr9[0]).intern();
        } else {
            Object[] objArr10 = new Object[1];
            b(null, new byte[]{-108, -114, -125, -118, -108, -109, -110, -114, -126, -109, -110, -126, -127, -108, -120, -106, -122, -114, -120, -125, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, KeyEvent.normalizeMetaState(0) + 127, objArr10);
            strIntern5 = ((String) objArr10[0]).intern();
        }
        if (zOnExtraCallback) {
            int i5 = asBinder + 51;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr11 = new Object[1];
                b(null, new byte[]{-108, -114, -125, -118, -113, -107, -112, -110, -108, -109, -110, -114, -126, -109, -110, -111, -112, -121, -113, -122, -114, -120, -125, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, View.MeasureSpec.makeMeasureSpec(1, 1) * 72, objArr11);
                obj3 = objArr11[0];
            } else {
                Object[] objArr12 = new Object[1];
                b(null, new byte[]{-108, -114, -125, -118, -113, -107, -112, -110, -108, -109, -110, -114, -126, -109, -110, -111, -112, -121, -113, -122, -114, -120, -125, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr12);
                obj3 = objArr12[0];
            }
            strIntern6 = ((String) obj3).intern();
        } else {
            Object[] objArr13 = new Object[1];
            a(372 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 49 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr13);
            strIntern6 = ((String) objArr13[0]).intern();
        }
        if (zOnExtraCallback) {
            int i6 = asBinder + 105;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                Object[] objArr14 = new Object[1];
                a(11382 - ExpandableListView.getPackedPositionType(0L), 104 >> ImageFormat.getBitsPerPixel(1), (char) (ViewConfiguration.getScrollDefaultDelay() / 100), objArr14);
                obj2 = objArr14[0];
            } else {
                Object[] objArr15 = new Object[1];
                a(423 - ExpandableListView.getPackedPositionType(0L), 47 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr15);
                obj2 = objArr15[0];
            }
            strIntern7 = ((String) obj2).intern();
        } else {
            Object[] objArr16 = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) + 471, TextUtils.indexOf((CharSequence) "", '0') + 50, (char) Drawable.resolveOpacity(0, 0), objArr16);
            strIntern7 = ((String) objArr16[0]).intern();
        }
        if (zOnExtraCallback) {
            int i7 = IAuthTabCallbackStubProxy + 67;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                Object[] objArr17 = new Object[1];
                a(22395 >> TextUtils.lastIndexOf("", '-', 0, 0), TextUtils.lastIndexOf("", 'l', 0, 0) + 73, (char) (((byte) KeyEvent.getModifierMetaStateMask()) * (-1)), objArr17);
                obj = objArr17[0];
            } else {
                Object[] objArr18 = new Object[1];
                a(519 - TextUtils.lastIndexOf("", '0', 0, 0), 51 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr18);
                obj = objArr18[0];
            }
            strIntern8 = ((String) obj).intern();
            context2 = null;
        } else {
            Object[] objArr19 = new Object[1];
            context2 = null;
            b(null, new byte[]{-108, -114, -125, -118, -108, -114, -120, -112, -110, -113, -120, -107, -119, -121, -104, -110, -126, -127, -108, -120, -106, -122, -114, -120, -125, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, TextUtils.getTrimmedLength("") + 127, objArr19);
            strIntern8 = ((String) objArr19[0]).intern();
        }
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern, context2, 2, context2);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern2, context2, 2, context2);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern3, context2, 2, context2);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern4, context2, 2, context2);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern5, context2, 2, context2);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern6, context2, 2, context2);
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
        Object[] objArr20 = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 572, TextUtils.getOffsetAfter("", 0) + 46, (char) (3937 - Drawable.resolveOpacity(0, 0)), objArr20);
        LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult, ((String) objArr20[0]).intern(), (Context) null, 2, (Object) null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern7, (Context) null, 2, (Object) null);
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult2 = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
        Object[] objArr21 = new Object[1];
        a(617 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetAfter("", 0) + 46, (char) (58933 - Color.argb(0, 0, 0, 0)), objArr21);
        LinkGenerator.onExtraCallback(carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult2, ((String) objArr21[0]).intern(), (Context) null, 2, (Object) null);
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context), strIntern8, (Context) null, 2, (Object) null);
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 105;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 17, 10972 - TextUtils.indexOf((CharSequence) "", '0'), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 46134), 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 20220 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (KeyEvent.getMaxKeyCode() >> 16)), ExpandableListView.getPackedPositionType(0L) + 44, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 59697), Color.red(0) + 17, 10973 - TextUtils.indexOf("", "", 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 46134), 31 - TextUtils.getOffsetAfter("", 0), 20220 - TextUtils.getOffsetAfter("", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 49123), (ViewConfiguration.getTouchSlop() >> 8) + 44, KeyEvent.normalizeMetaState(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Color.green(0) + 44, View.resolveSizeAndState(0, 0, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $11 + 79;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 77 - View.MeasureSpec.getMode(0), 20953 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 78 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
                i3 = 2;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 75, TextUtils.indexOf((CharSequence) "", '0', 0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (asInterface) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 63 - View.MeasureSpec.makeMeasureSpec(0, 0), 12214 - Color.green(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 63 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i9 = $11 + 75;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        char[] cArr = new char[664];
        ByteBuffer.wrap("í¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u0094\tGtf£1î¥U\u008d\u0081\\Ì`;%f×\u00ad\u0080\u0019\u0004Dh³ þÛ\u0098\",ðñ¢\u0086PK\u0001\u0010v¤±iÇ>IÃ\u0000\u0088'\\äá\u008b¶_{ \u0000,ÔÅ\u0099\u0097.Eó.¸;LÁ\u0011Ñ¦¡kb0{ÄÖ\u0089\u0099^¬ã3¨\u0002|Ñ\u0001íÖ¬\u009bb MôÁ¹üN¬\u0013MØ\u001blÐ1¨Æ \u008bLP\u001bÏÌ{\u001e¦LÑ¾\u001cïG\u0098ó_>)i§\u0094îßÉ\u000b\n¶eá±,ÎWÂ\u0083+Îyy«¤ÀïÕ\u001b/F?ñO<\u008cg\u0095\u00938Þw\tB´Ýÿä+7V\u0016\u0081AÌÕwì£5î\u0005\u0019\u001dD¡\u008fæ;;f\f\u0091WÜ©\u0007ü²Ôþ[)fT¦\u009fíÊËvQ¡lì¿\u0017\u0084BØ\u008e\u000f9zdð¯\u009cÚÜ\u0006'í¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u009c\tOts£2îüUÓ\u0081NÌ{;'f\u009b\u00ad\u0083\u0019XDy³*þÕ%\u0087\u0090¾Ür\u000bYvØ½\u0084è«Ti\u0083_ÎÎ5ù`¦¬f\u001b\rFÜ\u008d²ø²$^\u0093\u0001í¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u009c\tOts£2îüUÓ\u0081NÌ{;'f\u009b\u00ad\u0083\u0019XDy³*þÕ%\u0087\u0090¾Ür\u000bYvÈ½\u008dèºT!\u0083\u001cÎÏ5ô`¨¬\u007f\u001b\nF\u0080\u008dìø¬$Wí¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u0094\tGtf£1î¥U\u009d\u0081@Ì};3fÓ\u00adÉ\u0019HD\u007f³`þÌ%\u008c\u0090·í¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u0094\tGtf£1î¥U\u009c\u0081XÌ|;mfÔ\u00ad\u0083\u0019\u0004Dh³ þÛí¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u009c\tOts£2îüUÓ\u0081NÌf;.f\u009b\u00ad\u0086\u0019MD5³<þÙ%\u0086\u0090þÜv\u000b\u001avÝí¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u0094\tGtf£1î¥U\u0095\u0081IÌk;mfÂ\u00ad\u008b\u0019_D{³&þ\u0092%\u0092\u0090¾Üaí¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u009c\tOts£2îüUÓ\u0081GÌw;9f\u009b\u00ad\u0090\u0019EDm³-þÔ%Ì\u0090 Üh\u000b\u0013í¼Yn\u0084<óÎ>\u009feèÑ/\u001cYK×¶\u009eý¹)z\u0094\u0015ÃÁ\u000e¾u²¡[ì\t[Û\u0086°Í¥9_dOÓ?\u001eüEå±Hü\u0007+2\u0096\u00adÝ\u0094\tGtf£1î¥U\u0098\u0081MÌq;%fß\u00ad\u0080\u0019\u0007Dj³'þÒ%\u0085\u0090ýÜ4\u000bZvÊ½\u0086è¹âÝV\u000f\u008b]ü¯1þj\u0089ÞN\u00138D¶¹ÿòØ&\u001b\u009btÌ \u0001ßzÓ®:ãhTº\u0089ÑÂÄ6>k.Ü^\u0011\u009dJ\u0084¾)óf$S\u0099ÌÒâ\u0006${\u0007¬^á\u008cZñ\u008e`Ã\u00154Si¶¢è\u0016.KW¼_ñ³*ä\u000b\u0089¿[b\t\u0015ûØª\u0083Ý7\u001aúl\u00adâP«\u001b\u008cÏOr %ôè\u008b\u0093\u0087Gn\n<½î`\u0085+\u0090ßj\u0082z5\nøÉ£ÐW}\u001a2Í\u0007p\u0098;µïz\u0092OEB\bÙ³¤gm*\nÝ\u0018\u0080âK¢ÿt¢\u0003U\u000b\u0018çÃ°".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 664);
        onExtraCallbackWithResult = cArr;
        IAuthTabCallback = -4075581508063045350L;
        onWarmupCompleted = new char[]{32452, 32496, 32508, 32497, 32426, 32445, 32451, 32507, 32449, 32446, 32509, 32511, 32500, 32510, 32448, 32498, 32505, 32447, 32450, 32453, 32455, 32504, 32503, 32454};
        onExtraCallback = -1184333972;
        IAuthTabCallbackDefault = true;
        asInterface = true;
    }
}
