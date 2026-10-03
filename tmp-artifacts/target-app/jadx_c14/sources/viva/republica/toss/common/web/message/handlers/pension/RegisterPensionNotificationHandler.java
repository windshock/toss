package viva.republica.toss.common.web.message.handlers.pension;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncodedDataImplExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setReferrerUID;
import o.setText;
import o.trackEvent;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RegisterPensionNotificationHandler implements ALCFaceQuality {
    private static short[] asInterface;
    private static final byte[] $$a = {66, -42, -1, 80};
    private static final int $$b = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static char[] onExtraCallbackWithResult = {27260, 27174, 27198, 27168, 27168, 27260, 27148, 27143, 27168, 27146, 27148, 27174, 27198, 27168, 27168, 27192, 27192, 27196, 27168, 27188, 27299, 27298, 27325, 27296, 27301, 27324, 27301, 27304, 27300, 27304, 27327, 27318, 27301, 27301, 27377, 27383, 27380, 27360, 27377, 27383, 27390, 27341, 27289, 27295, 27270, 27289, 27295, 27292, 27272, 27282, 27289, 27293, 27294, 27270, 27341, 27288, 27266, 27260, 27170, 27172, 27180, 27260, 27180, 27172, 27170, 27148, 27146, 27168, 27143, 27148, 27175, 27168, 27196, 27192, 27163, 27388, 27390, 27366, 27334, 27334, 27388, 27382, 27361, 27360, 27328, 27331, 27385, 27358, 27334, 27391, 27383, 27384, 27390, 27365, 27367, 27180, 27273, 27264, 27273, 27276, 27272, 27276, 27267, 27267, 27376, 27272, 27270, 27246, 27149, 27143, 27140, 27222, 27262, 27262, 27262, 27258, 27255, 27183, 27156, 27175, 27198, 27168, 27170, 27168, 27152, 27152, 27199, 27168, 27177, 27177, 27176, 27180, 27172, 27168, 27170, 27168, 27198, 27173, 27176, 27174, 27168, 27197, 27170};
    private static int onNavigationEvent = 333368286;
    private static int onWarmupCompleted = -1538795502;
    private static int IAuthTabCallback = -125161055;
    private static byte[] onExtraCallback = {-15, 0, 41, 40, -16, -26, 28, -9, 46, 0, 18, 26, 8, 40, 18, -8, 24, -27, -6, -6, 8, -42, -4, -123, 61, -2, -4, -50, -18, -63, -60, -8, 23, -116, 59, 40, -108, -108, 35, -100, 36, -15, 72, 55, 78, 67, 8, -96, 69, 4, -89, 117, 80, 97, 116, 72, 72, 121, 64, 120, 11, 89, 73, 94, 83, 71, 91, -99, 12, 65, 88, 75, 109, 64, 68, 93, 67, 75, 91, 95, -112, 2, 65, 71, 84, 95, 48, 84, 91, 11, 47, -42, 57, -61, 46, 42, -45, 33, 57, -23, -11, 52, 47, -42, 38, -23, -35, -39, 14, -47, 37, -43, -38, -46, -46, 35, -24, 45};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            byte[] r0 = viva.republica.toss.common.web.message.handlers.pension.RegisterPensionNotificationHandler.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r6 = r6 * 4
            int r6 = r6 + 115
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.pension.RegisterPensionNotificationHandler.$$c(short, short, short):java.lang.String");
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = asBinder + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asBinder + 65;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = asBinder + 105;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asBinder + 51;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            int i2 = asBinder + 77;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{116, 27, 0, 20}, false, new byte[]{0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1}, objArr);
            if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                onExtraCallback(context, jsonObject, setonoutofmemeryerrorcallback);
                return;
            }
            Object[] objArr2 = new Object[1];
            b((byte) (90 - Color.alpha(0)), (short) (ExpandableListView.getPackedPositionChild(0L) + 127), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1214704770, (-27) - View.resolveSize(0, 0), (-1556998452) - View.resolveSize(0, 0), objArr2);
            if (Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
                IAuthTabCallback(context, setonoutofmemeryerrorcallback);
                int i4 = asBinder + 55;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 2;
                }
            }
        }
        int i6 = asBinder + 103;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onExtraCallback(Context context, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            Object[] objArr2 = new Object[1];
            a(new int[]{5, 14, 0, 10}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1}, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new int[]{19, 15, 160, 4}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0}, objArr3);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        Object[] objArr4 = new Object[1];
        a(new int[]{34, 7, 75, 4}, true, null, objArr4);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        if (strOnNavigationEvent2.length() == 0) {
            int i2 = IAuthTabCallbackStub + 19;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr5 = new Object[1];
            a(new int[]{41, 16, 99, 8}, true, null, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a(new int[]{19, 15, 160, 4}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0}, objArr6);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern2, ((String) objArr6[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        Object[] objArr7 = new Object[1];
        a(new int[]{57, 4, 0, 0}, true, new byte[]{1, 1, 1, 1}, objArr7);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr7[0]).intern(), "");
        if (strOnNavigationEvent3.length() == 0) {
            int i4 = IAuthTabCallbackStub + 117;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr8 = new Object[1];
            a(new int[]{61, 13, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1}, objArr8);
            String strIntern3 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            a(new int[]{19, 15, 160, 4}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0}, objArr9);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern3, ((String) objArr9[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        Date dateOnNavigationEvent = setReferrerUID.onNavigationEvent(strOnNavigationEvent3);
        if (dateOnNavigationEvent == null) {
            Object[] objArr10 = new Object[1];
            a(new int[]{74, 21, 70, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr10);
            String strIntern4 = ((String) objArr10[0]).intern();
            Object[] objArr11 = new Object[1];
            b((byte) (Drawable.resolveOpacity(0, 0) + 108), (short) (Gravity.getAbsoluteGravity(0, 0) + 119), TextUtils.getOffsetBefore("", 0) + 1214704682, (-27) - Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1556998497, objArr11);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern4, ((String) objArr11[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        if (dateOnNavigationEvent.before(zzaj.onWarmupCompleted().asBinder())) {
            int i6 = IAuthTabCallbackStub + 95;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr12 = new Object[1];
            b((byte) ((-17) - Gravity.getAbsoluteGravity(0, 0)), (short) (TextUtils.lastIndexOf("", '0') + 31), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1214704700, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 27, (ViewConfiguration.getEdgeSlop() >> 16) - 1556998464, objArr12);
            String strIntern5 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            a(new int[]{95, 12, 124, 0}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, objArr13);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern5, ((String) objArr13[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        Object[] objArr14 = new Object[1];
        b((byte) (View.getDefaultSize(0, 0) + 59), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 94), 1214704713 - TextUtils.indexOf("", "", 0, 0), (-27) - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "", 0) - 1556998461, objArr14);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr14[0]).intern(), "");
        if (strOnNavigationEvent4.length() == 0) {
            Object[] objArr15 = new Object[1];
            b((byte) (View.MeasureSpec.getMode(0) + 100), (short) (33 - TextUtils.getCapsMode("", 0, 0)), TextUtils.getCapsMode("", 0, 0) + 1214704723, (-27) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1556998461) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr15);
            String strIntern6 = ((String) objArr15[0]).intern();
            Object[] objArr16 = new Object[1];
            a(new int[]{19, 15, 160, 4}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0}, objArr16);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern6, ((String) objArr16[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        if (!EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).onWarmupCompleted()) {
            Object[] objArr17 = new Object[1];
            b((byte) ((KeyEvent.getMaxKeyCode() >> 16) + 6), (short) ((-80) - Color.blue(0)), 1214704742 - View.getDefaultSize(0, 0), (-26) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) - 1556998469, objArr17);
            String strIntern7 = ((String) objArr17[0]).intern();
            Object[] objArr18 = new Object[1];
            a(new int[]{107, 4, 0, 2}, true, new byte[]{1, 1, 0, 1}, objArr18);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern7, ((String) objArr18[0]).intern(), (Map) null, 4, (Object) null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            trackEvent.onExtraCallbackWithResult onextracallbackwithresult = trackEvent.Companion;
            trackEvent trackeventOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            Object[] objArr19 = new Object[1];
            a(new int[]{111, 5, 0, 0}, false, new byte[]{1, 1, 0, 0, 0}, objArr19);
            trackeventOnExtraCallback.IAuthTabCallback(context, ((String) objArr19[0]).intern());
            onextracallbackwithresult.onExtraCallback().onWarmupCompleted(context, strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent4, dateOnNavigationEvent, 10008);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(obj)) {
            int i8 = IAuthTabCallbackStub + 85;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i10 = asBinder + 5;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr20 = new Object[1];
            a(new int[]{107, 4, 0, 2}, true, new byte[]{1, 1, 0, 1}, objArr20);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th2, ((String) objArr20[0]).intern(), (Map) null, 4, (Object) null);
        }
    }

    private final void IAuthTabCallback(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 91;
        IAuthTabCallbackStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Result.Companion companion = Result.Companion;
                trackEvent trackeventOnExtraCallback = trackEvent.Companion.onExtraCallback();
                Object[] objArr = new Object[1];
                a(new int[]{111, 5, 0, 0}, false, new byte[]{1, 1, 0, 0, 0}, objArr);
                trackeventOnExtraCallback.IAuthTabCallback(context, ((String) objArr[0]).intern());
                unit = Unit.INSTANCE;
            } else {
                Result.Companion companion2 = Result.Companion;
                trackEvent trackeventOnExtraCallback2 = trackEvent.Companion.onExtraCallback();
                Object[] objArr2 = new Object[1];
                a(new int[]{111, 5, 0, 0}, false, new byte[]{1, 1, 0, 0, 0}, objArr2);
                trackeventOnExtraCallback2.IAuthTabCallback(context, ((String) objArr2[0]).intern());
                unit = Unit.INSTANCE;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(obj)) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Object[] objArr3 = new Object[1];
            a(new int[]{107, 4, 0, 2}, true, new byte[]{1, 1, 0, 1}, objArr3);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th2, ((String) objArr3[0]).intern(), (Map) null, 4, (Object) null);
            int i3 = IAuthTabCallbackStub + 125;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "", 0)), (KeyEvent.getMaxKeyCode() >> 16) + 35, (-16762977) - Color.rgb(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $11 + 39;
                $10 = i7 % 128;
                if (i7 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, 17657 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.indexOf((CharSequence) "", '0', 0)), 65 - View.combineMeasuredStates(0, 0), KeyEvent.normalizeMetaState(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49467), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 70, 12485 - TextUtils.lastIndexOf("", '0', 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i10 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i10, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i10);
        }
        if (z) {
            int i11 = $10 + 51;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8 A[PHI: r0
      0x01c8: PHI (r0v9 int) = (r0v8 int), (r0v45 int) binds: [B:47:0x01c6, B:44:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca A[PHI: r0
      0x01ca: PHI (r0v42 int) = (r0v8 int), (r0v45 int) binds: [B:47:0x01c6, B:44:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r26, short r27, int r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.pension.RegisterPensionNotificationHandler.b(byte, short, int, int, int, java.lang.Object[]):void");
    }
}
