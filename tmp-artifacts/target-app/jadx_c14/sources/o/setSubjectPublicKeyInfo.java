package o;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.core.webkit.bridge.image.Image;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.List;
import javax.crypto.spec.OAEPParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRoundCornerProgressBarSavedState1;
import o.onOutOfMemory;
import o.setSubjectPublicKeyInfo;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setSubjectPublicKeyInfo extends ALCTimerLabel {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static char[] onExtraCallbackWithResult = {27179, 27273, 27264, 27252, 27166, 27158, 27189, 27194, 27184, 27343, 27195, 27192, 27185, 27190, 27198, 27198, 27195, 27165, 27163};
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(startrunning);
            throw null;
        }
        Unit unitOnTransact = onTransact(startrunning);
        int i3 = IAuthTabCallback + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, obj);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setSubjectPublicKeyInfo setsubjectpublickeyinfo, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(setsubjectpublickeyinfo, str, setonoutofmemeryerrorcallback, th);
        }
        onWarmupCompleted(setsubjectpublickeyinfo, str, setonoutofmemeryerrorcallback, th);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(startrunning);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = IAuthTabCallback + 27;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            return ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, 284329490, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -284329490, new Object[]{str, str2}, iOnExtraCallbackWithResult2)).booleanValue();
        }
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult3, 284329490, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -284329490, new Object[]{str, str2}, iOnExtraCallbackWithResult4)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        setSubjectPublicKeyInfo setsubjectpublickeyinfo = (setSubjectPublicKeyInfo) objArr[1];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[2];
        List list = (List) objArr[3];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, setsubjectpublickeyinfo, setonoutofmemeryerrorcallback, list);
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Unit unit) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(unit);
        }
        onWarmupCompleted(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i2));
        int i10 = ~(i5 | i2);
        int i11 = ~i2;
        int i12 = (~(i | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i5 + i2 + i6 + ((-1570926368) * i3) + ((-1409401439) * i4);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i5) - 657981440) + (821186744 * i2) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i6) + (1124073472 * i3) + ((-332922880) * i4) + ((-1182662656) * i15);
        int i17 = (i5 * 1410161459) + 847508490 + (i2 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i6 * 1410159841) + (i3 * 1126552800) + (i4 * (-1948647807)) + (i15 * (-1287520256));
        return i16 + ((i17 * i17) * (-1577189376)) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new SecureLoadImagesHandler$.ExternalSyntheticLambda6());
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i4 = IAuthTabCallback + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zOnTransact);
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull final String str, @NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Context context, @NotNull setText settext, @NotNull List<String> list, int i, @NotNull final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(settext, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object[] objArr = new Object[1];
        c(false, new byte[]{0, 0, 0}, new int[]{0, 3, 95, 0}, objArr);
        final String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() <= 0) {
            int i5 = onNavigationEvent + 57;
            IAuthTabCallback = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            strOnNavigationEvent = null;
        }
        if (strOnNavigationEvent == null) {
            Object[] objArr2 = new Object[1];
            c(true, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1}, new int[]{3, 16, 12, 5}, objArr2);
            throw new IllegalArgumentException(((String) objArr2[0]).intern());
        }
        writeRaw writerawOnExtraCallbackWithResult = new unzip(context, i).onExtraCallbackWithResult(list);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                Object[] objArr3 = {strOnNavigationEvent, this, setonoutofmemeryerrorcallback, (List) obj2};
                return (Unit) setSubjectPublicKeyInfo.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1987357222, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1987357221, objArr3, zzmr.onExtraCallbackWithResult());
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnExtraCallbackWithResult.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$$ExternalSyntheticLambda3
            public final Object apply(Object obj2) {
                return setSubjectPublicKeyInfo.onExtraCallback(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj2) {
                return setSubjectPublicKeyInfo.onExtraCallbackWithResult(this.f$0, str, setonoutofmemeryerrorcallback, (Throwable) obj2);
            }
        }, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$$ExternalSyntheticLambda5
            public final Object invoke(Object obj2) {
                return setSubjectPublicKeyInfo.onNavigationEvent((Unit) obj2);
            }
        }), r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
    }

    private static final Unit IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = (Unit) function1.invoke(obj);
        int i4 = onNavigationEvent + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, setSubjectPublicKeyInfo setsubjectpublickeyinfo, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        Object obj;
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Companion companion = Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), list));
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            obj = null;
        }
        String str3 = (String) obj;
        if (str3 == null) {
            int i5 = IAuthTabCallback + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        } else {
            str2 = str3;
        }
        setsubjectpublickeyinfo.onNavigationEvent(setonoutofmemeryerrorcallback, BaseRoundCornerProgressBarSavedState1.onWarmupCompleted(BaseRoundCornerProgressBarSavedState1.onExtraCallbackWithResult, str, str2, (BaseRoundCornerProgressBarSavedState1.IAuthTabCallback) null, (String) null, (OAEPParameterSpec) null, 28, (Object) null).toString());
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit2 = Unit.INSTANCE;
            throw null;
        }
        Unit unit3 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unit3;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(setSubjectPublicKeyInfo setsubjectpublickeyinfo, String str, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            setsubjectpublickeyinfo.onExtraCallback(str, setonoutofmemeryerrorcallback, th);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        setsubjectpublickeyinfo.onExtraCallback(str, setonoutofmemeryerrorcallback, th);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onTransact(startRunning startrunning) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        List listEmptyList = CollectionsKt.emptyList();
        try {
            Result.Companion companion = Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), listEmptyList));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = IAuthTabCallback + 35;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                int i4 = 5 / 0;
            }
            int i5 = i3 + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        return Unit.INSTANCE;
    }

    public void onExtraCallback(@NotNull String str, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return setSubjectPublicKeyInfo.IAuthTabCallback((startRunning) obj);
            }
        });
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asBinder(startRunning startrunning) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        List listEmptyList = CollectionsKt.emptyList();
        try {
            Result.Companion companion = Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), listEmptyList));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!Result.onExtraCallback(obj))) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 15;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        return Unit.INSTANCE;
    }

    public void onNavigationEvent(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.SecureLoadImagesHandler$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return setSubjectPublicKeyInfo.onExtraCallbackWithResult((startRunning) obj);
            }
        });
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int i6 = $10 + 41;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 35 - Gravity.getAbsoluteGravity(0, 0), 14238 - TextUtils.indexOf((CharSequence) "", '0', 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $10 + 87;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $10 + 109;
                $11 = i10 % 128;
                if (i10 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getTrimmedLength("") + 29, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.argb(0, 0, 0, 0)), 64 - MotionEvent.axisFromString(""), 16718 - TextUtils.indexOf("", "", 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49467), 70 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $11 + 13;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $11 + 51;
            $10 = i16 % 128;
            int i17 = i16 % 2;
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

    public static /* synthetic */ Unit onWarmupCompleted(String str, setSubjectPublicKeyInfo setsubjectpublickeyinfo, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, List list) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, 1987357222, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1987357221, new Object[]{str, setsubjectpublickeyinfo, setonoutofmemeryerrorcallback, list}, iOnExtraCallbackWithResult2);
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, 284329490, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -284329490, new Object[]{str, str2}, iOnExtraCallbackWithResult2)).booleanValue();
    }
}
