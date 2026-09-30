package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.tmoney.LiveCheckConstants;
import im.toss.core.webkit.bridge.CropImageHandler$;
import im.toss.core.webkit.bridge.image.Image;
import im.toss.core.webkit.bridge.image.crop.PhotoCropActivity;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.extractFile;
import o.flippingBitmap;
import o.onOutOfMemory;
import o.setOnOutOfMemeryErrorCallback;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class flippingBitmap implements ALCFaceQuality {
    public static final onNavigationEvent Companion;
    private static char[] IAuthTabCallback;
    private static int asInterface;
    private static long onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int onWarmupCompleted = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 1 - (s * 4);
        byte[] bArr = $$a;
        int i5 = 3 - (s2 * 4);
        int i6 = (i * 3) + 97;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += i5;
            i5 = i7;
            i2 = i3;
            int i8 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i8];
            i5 = i6;
            i6 = b;
            i7 = i8;
            i6 += i5;
            i5 = i7;
            i2 = i3;
            int i82 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    static {
        asInterface = 1;
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onTransact + 99;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i5 | i4);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i4)) | (~(i7 | i9)) | (~(i9 | i4));
        int i14 = i4 + i3 + i + (669352129 * i6) + (266941808 * i2);
        int i15 = i14 * i14;
        int i16 = (720661947 * i4) + 1572077568 + ((-1243901369) * i3) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i) + ((-1100480512) * i6) + ((-1249902592) * i2) + ((-491520000) * i15);
        int i17 = (i4 * 1617402437) + 56426783 + (i3 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i * 1617401855) + (i6 * 1244927807) + (i2 * (-404665712)) + (i15 * (-45350912));
        return i16 + ((i17 * i17) * 1565261824) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startrunning);
        int i4 = onWarmupCompleted + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setonoutofmemeryerrorcallback, th);
        int i4 = onWarmupCompleted + 53;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        startRunning startrunning = (startRunning) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(startrunning);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback2, matches.onExtraCallback(), -1162688546, new Object[]{list, startrunning}, 1162688546, iOnExtraCallback, iOnExtraCallback3);
        int i4 = asBinder + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(setonoutofmemeryerrorcallback, list);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setonoutofmemeryerrorcallback, list);
        int i3 = onWarmupCompleted + 61;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(startrunning);
        int i4 = onWarmupCompleted + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    @Override // o.drawTextBox
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onWarmupCompleted(str);
        }
        super.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onWarmupCompleted + 67;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onOutOfMemory.onNavigationEvent onnavigationevent2 = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        int i3 = asBinder + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationevent2;
    }

    private static final Unit asInterface(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Object[] objArr = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 6, (char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getMode(0), objArr);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
            extractFile.IAuthTabCallback iAuthTabCallback = extractFile.Companion;
            Object[] objArr2 = new Object[1];
            a(new char[]{22, 2, 1, 24, 17, 5, 22, '\r'}, (byte) (55 - KeyEvent.getDeadChar(0, 0)), TextUtils.getOffsetBefore("", 0) + 8, objArr2);
            extractFile extractfileIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(settext.onNavigationEvent(((String) objArr2[0]).intern(), ""));
            byte[] bArrDecode = Base64.decode(strOnNavigationEvent, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            Intrinsics.checkNotNull(bitmapDecodeByteArray);
            onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, bitmapDecodeByteArray, extractfileIAuthTabCallback);
            obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr3 = new Object[1];
            a(new char[]{5, '\t', '\b', 3, 15, 18, 20, '\f', '\n', 22, 21, '\f', 6, 11, '\r', 7}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 123), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr3);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr3[0]).intern(), th2);
            setonoutofmemeryerrorcallback.IAuthTabCallback(new CropImageHandler$.ExternalSyntheticLambda0());
        }
        int i2 = asBinder + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj;
        List list = (List) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        Image image = (Image) CollectionsKt.firstOrNull(list);
        Object obj2 = null;
        if (image != null) {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                obj = kotlin.Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(Image.Companion.serializer(), image));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (!(!kotlin.Result.onExtraCallback(obj))) {
                int i4 = onWarmupCompleted + 63;
                int i5 = i4 % 128;
                asBinder = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 51;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                obj2 = obj;
            }
            obj2 = (String) obj2;
            int i9 = onWarmupCompleted + 57;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, obj2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, final List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.bridge.CropImageHandler$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 77;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = flippingBitmap.onWarmupCompleted(list, (startRunning) obj);
                int i5 = onExtraCallback + 67;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 15;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        int i3 = 94 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{5, '\t', '\b', 3, 15, 18, 20, '\f', '\n', 22, 21, '\f', 6, 11, '\r', 7}, (byte) (124 - Color.red(0)), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), th);
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.bridge.CropImageHandler$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 113;
                onExtraCallback = i3 % 128;
                startRunning startrunning = (startRunning) obj;
                if (i3 % 2 == 0) {
                    flippingBitmap.onWarmupCompleted(startrunning);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = flippingBitmap.onWarmupCompleted(startrunning);
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i == 255) {
            int i4 = onWarmupCompleted + 115;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == -1) {
                Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
                Object obj = null;
                if (context != null && bundle != null) {
                    Object[] objArr = new Object[1];
                    a(new char[]{17, 18, 20, '\f', 14, 22, 6, 18}, (byte) (ImageFormat.getBitsPerPixel(0) + 63), 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                    String string = bundle.getString(((String) objArr[0]).intern());
                    if (string != null) {
                        IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(new unzip(context, 0, 2, null).onExtraCallbackWithResult(CollectionsKt.listOf(string)), new Function1() { // from class: im.toss.core.webkit.bridge.CropImageHandler$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) throws Throwable {
                                int i6 = 2 % 2;
                                int i7 = onWarmupCompleted + 109;
                                onExtraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = setonoutofmemeryerrorcallback;
                                Throwable th = (Throwable) obj2;
                                if (i8 == 0) {
                                    return flippingBitmap.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th);
                                }
                                Unit unitOnExtraCallbackWithResult = flippingBitmap.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th);
                                int i9 = 32 / 0;
                                return unitOnExtraCallbackWithResult;
                            }
                        }, new Function1() { // from class: im.toss.core.webkit.bridge.CropImageHandler$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj2) {
                                int i6 = 2 % 2;
                                int i7 = IAuthTabCallback + 25;
                                onExtraCallbackWithResult = i7 % 128;
                                int i8 = i7 % 2;
                                Unit unitOnWarmupCompleted = flippingBitmap.onWarmupCompleted(setonoutofmemeryerrorcallback, (List) obj2);
                                int i9 = IAuthTabCallback + 11;
                                onExtraCallbackWithResult = i9 % 128;
                                int i10 = i9 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }), r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
                    }
                }
                int i6 = asBinder + 45;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.bridge.CropImageHandler$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 103;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                Unit unitIAuthTabCallback = flippingBitmap.IAuthTabCallback((startRunning) obj2);
                int i10 = onWarmupCompleted + 79;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 78 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
    }

    private final void onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Bitmap bitmap, extractFile extractfile) {
        Context context;
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            int i3 = 10 / 0;
            if (context == null) {
                return;
            }
        } else {
            context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                return;
            }
        }
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, PhotoCropActivity.Companion.onExtraCallbackWithResult(context, String.valueOf(AFj1qSDK.onNavigationEvent.onExtraCallbackWithResult(context, bitmap)), extractfile), 255, (Bundle) null, 4, (Object) null);
        int i4 = asBinder + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 69;
        $11 = i4 % 128;
        while (true) {
            int i5 = i4 % 2;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i) {
                break;
            }
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 59697), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.getTrimmedLength("")), TextUtils.indexOf((CharSequence) "", '0', 0) + 32, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 49123), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = $11 + 51;
                $10 = i4 % 128;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 26, 23139 - Color.blue(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSize(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent - 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 24825), (ViewConfiguration.getEdgeSlop() >> 16) + 74, 8087 - ((byte) KeyEvent.getModifierMetaStateMask()), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, 19488 - Color.green(0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            } else {
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            }
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i13 = 0;
        while (i13 < i) {
            int i14 = $10 + 73;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr4[i13] = (char) (cArr4[i13] ^ 26557);
                i13 += 123;
            } else {
                cArr4[i13] = (char) (cArr4[i13] ^ 13722);
                i13++;
            }
        }
        String str = new String(cArr4);
        int i15 = $10 + 77;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        objArr[0] = str;
    }

    public static /* synthetic */ Unit onExtraCallback(startRunning startrunning) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback2, matches.onExtraCallback(), 344810475, new Object[]{startrunning}, -344810474, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Unit onExtraCallbackWithResult(List list, startRunning startrunning) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback2, matches.onExtraCallback(), -1162688546, new Object[]{list, startrunning}, 1162688546, iOnExtraCallback, iOnExtraCallback3);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{51242, 64983, 51243, 64988, 64960, 51240, 64991, 64970, 64961, 65008, 64980, 64989, 64982, 51245, 51247, 64999, 64986, 64990, 51244, 65018, 65019, 64984, 64978, 64963, 64998};
        onExtraCallbackWithResult = (char) 51244;
        IAuthTabCallback = new char[]{60861, 36449, 10757, 50747, 25297};
        onExtraCallback = -1115518284871463412L;
    }
}
