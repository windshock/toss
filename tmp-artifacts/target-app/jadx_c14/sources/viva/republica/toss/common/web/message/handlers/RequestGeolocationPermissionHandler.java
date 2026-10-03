package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.PageAnimStore;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.getPackageType;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setRandomHost;
import o.shouldBeKeptAsChild;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestGeolocationPermissionHandler implements ALCFaceQuality {
    public static final Companion Companion;
    private static final String IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStub;
    private static int access000;
    private static long asBinder;
    private static final String asInterface;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static final String onWarmupCompleted;
    private final LocationRequest onTransact;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.$$a
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = 97 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L31
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2b:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L31:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.$$c(byte, short, byte):java.lang.String");
    }

    static {
        access000 = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 56, 0}, true, new byte[]{1, 0, 0, 0, 1, 1}, objArr);
        asInterface = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(6 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42420), (-1) - ExpandableListView.getPackedPositionChild(0L), objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{6, 35, 0, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1}, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{41, 8, 97, 8}, true, null, objArr4);
        onExtraCallback = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, (char) (59887 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 7, objArr5);
        onExtraCallbackWithResult = ((String) objArr5[0]).intern();
        Companion = new Companion(null);
        onNavigationEvent = 8;
        int i = getInterfaceDescriptor + 41;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[4];
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[5];
        Function0 function0 = (Function0) objArr[6];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[7];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, str2, str3, str4, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0, commonModule_setLeftEdgeTouchEnabled);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, str4, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0, commonModule_setLeftEdgeTouchEnabled);
        int i3 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, LocationSettingsResponse locationSettingsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(requestGeolocationPermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, locationSettingsResponse);
        }
        onNavigationEvent(requestGeolocationPermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, locationSettingsResponse);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback);
        int i4 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback, th);
        int i4 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Exception exc) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, exc}, -93001006, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 93001006);
        int i4 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(dialogInterface);
        }
        onWarmupCompleted(dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(function0, dialogInterface);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function0, dialogInterface);
        int i3 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function1, obj}, -1223005914, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1223005921);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{function1, obj}, -1223005914, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1223005921);
        int i3 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, dialogInterface);
        }
        onWarmupCompleted(fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str2, boolean z, String str3, FragmentActivity fragmentActivity, String str4, String str5, String str6, String str7, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str2, Boolean.valueOf(z), str3, fragmentActivity, str4, str5, str6, str7, shouldbekeptaschild};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, -710818870, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 710818875);
        int i4 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        Object obj;
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = (~(i7 | i8 | (~i2))) | (~(i3 | i6 | i2));
        int i10 = (~(i8 | i2)) | (~(i8 | i3));
        int i11 = (~(i2 | i6)) | i3;
        int i12 = i3 + i6 + i + (1661237432 * i5) + (961048624 * i4);
        int i13 = i12 * i12;
        int i14 = (i3 * (-2040814728)) + 92927091 + (i6 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + ((-2040814133) * i) + ((-1614655000) * i5) + (500164112 * i4) + (i13 * 184877056);
        switch (((119520104 * i3) - 281083904) + ((-1329838950) * i6) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i) + ((-1559232512) * i5) + (1553989632 * i4) + (2020540416 * i13) + (i14 * i14 * 1800994816)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                RequestGeolocationPermissionHandler requestGeolocationPermissionHandler = (RequestGeolocationPermissionHandler) objArr[0];
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[1];
                int i15 = 2 % 2;
                int i16 = IAuthTabCallback_Parcel + 21;
                IAuthTabCallbackStubProxy = i16 % 128;
                int i17 = i16 % 2;
                Object[] objArr2 = new Object[1];
                a(new int[]{165, 10, 0, 4}, true, new byte[]{0, 1, 0, 1, 0, 1, 1, 1, 0, 1}, objArr2);
                requestGeolocationPermissionHandler.onWarmupCompleted(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern());
                int i18 = IAuthTabCallbackStubProxy + 13;
                IAuthTabCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                RequestGeolocationPermissionHandler requestGeolocationPermissionHandler2 = (RequestGeolocationPermissionHandler) objArr[0];
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = (setOnOutOfMemeryErrorCallback) objArr[1];
                int i20 = 2 % 2;
                int i21 = IAuthTabCallback_Parcel + 23;
                IAuthTabCallbackStubProxy = i21 % 128;
                if (i21 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(new int[]{134, 6, 138, 5}, true, new byte[]{1, 1, 1, 0, 1, 0}, objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(new int[]{134, 6, 138, 5}, false, new byte[]{1, 1, 1, 0, 1, 0}, objArr4);
                    obj = objArr4[0];
                }
                requestGeolocationPermissionHandler2.onWarmupCompleted(setonoutofmemeryerrorcallback2, ((String) obj).intern());
                return null;
            case 5:
                String str = (String) objArr[0];
                RequestGeolocationPermissionHandler requestGeolocationPermissionHandler3 = (RequestGeolocationPermissionHandler) objArr[1];
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback3 = (setOnOutOfMemeryErrorCallback) objArr[2];
                r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[3];
                String str2 = (String) objArr[4];
                boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
                String str3 = (String) objArr[6];
                FragmentActivity fragmentActivity = (FragmentActivity) objArr[7];
                String str4 = (String) objArr[8];
                String str5 = (String) objArr[9];
                String str6 = (String) objArr[10];
                String str7 = (String) objArr[11];
                shouldBeKeptAsChild shouldbekeptaschild = (shouldBeKeptAsChild) objArr[12];
                int i22 = 2 % 2;
                int i23 = IAuthTabCallbackStubProxy + 77;
                IAuthTabCallback_Parcel = i23 % 128;
                int i24 = i23 % 2;
                a(new int[]{0, 6, 56, 0}, true, new byte[]{1, 0, 0, 0, 1, 1}, new Object[1]);
                if (!Intrinsics.areEqual(str, ((String) r3[0]).intern())) {
                    b(5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Color.red(0) + 42421), Color.rgb(0, 0, 0) + 16777216, new Object[1]);
                    if (!(!Intrinsics.areEqual(str, ((String) r2[0]).intern()))) {
                        int i25 = IAuthTabCallbackStubProxy + 33;
                        IAuthTabCallback_Parcel = i25 % 128;
                        int i26 = i25 % 2;
                        requestGeolocationPermissionHandler3.IAuthTabCallback(setonoutofmemeryerrorcallback3);
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Object[] objArr5 = new Object[1];
                        a(new int[]{6, 35, 0, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1}, objArr5);
                        String strIntern = ((String) objArr5[0]).intern();
                        Object[] objArr6 = new Object[1];
                        b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, (char) ((-16777216) - Color.rgb(0, 0, 0)), 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
                        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr6[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    }
                } else {
                    Intrinsics.checkNotNull(shouldbekeptaschild);
                    onExtraCallbackWithResult(requestGeolocationPermissionHandler3, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback3, str2, zBooleanValue, str3, fragmentActivity, str4, str5, str6, str7, shouldbekeptaschild);
                }
                return Unit.INSTANCE;
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                Function1 function1 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i27 = 2 % 2;
                int i28 = IAuthTabCallback_Parcel + 21;
                IAuthTabCallbackStubProxy = i28 % 128;
                int i29 = i28 % 2;
                function1.invoke(obj2);
                int i30 = IAuthTabCallbackStubProxy + 67;
                IAuthTabCallback_Parcel = i30 % 128;
                int i31 = i30 % 2;
                return null;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, startrunning);
        int i4 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    public RequestGeolocationPermissionHandler() {
        LocationRequest locationRequestBuild = new LocationRequest.Builder(100, 3000L).build();
        Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "");
        this.onTransact = locationRequestBuild;
    }

    public static final /* synthetic */ LocationRequest onExtraCallbackWithResult(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        LocationRequest locationRequest = requestGeolocationPermissionHandler.onTransact;
        int i5 = i3 + 107;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return locationRequest;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i2 + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - MotionEvent.axisFromString("")), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asBinder), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 46134), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 20220 - ExpandableListView.getPackedPositionGroup(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 49123), (-16777172) - Color.rgb(0, 0, 0), 1494 - TextUtils.getOffsetAfter("", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $11 + 75;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0')), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.combineMeasuredStates(0, 0)), 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0') + 1495, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static final Unit onExtraCallbackWithResult(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback}, 724317385, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
            return Unit.INSTANCE;
        }
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback}, 724317385, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
        int i3 = 42 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback}, 724317385, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(final RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, boolean z, String str2, FragmentActivity fragmentActivity, String str3, String str4, String str5, String str6, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!(!shouldbekeptaschild.onNavigationEvent)) {
                int i3 = IAuthTabCallback_Parcel + 89;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    requestGeolocationPermissionHandler.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
                    return;
                } else {
                    requestGeolocationPermissionHandler.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
                    obj.hashCode();
                    throw null;
                }
            }
            if (shouldbekeptaschild.onExtraCallbackWithResult) {
                int i4 = IAuthTabCallback_Parcel + 85;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                a(new int[]{41, 8, 97, 8}, true, null, objArr);
                if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                    if (!z && str2.length() > 0) {
                        onJsBridgeReady.onNavigationEvent(fragmentActivity, str2, 1);
                    }
                    onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback}, 724317385, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
                    return;
                }
            }
            if (z) {
                Object[] objArr2 = {requestGeolocationPermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str3, str4, str5, str6, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda5
                    public final Object invoke() {
                        return RequestGeolocationPermissionHandler.onWarmupCompleted(this.f$0, setonoutofmemeryerrorcallback);
                    }
                }};
                onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr2, 1901647186, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1901647184);
                return;
            }
            if (str2.length() > 0) {
                String string = fragmentActivity.getString(R.string.next_time);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = fragmentActivity.getString(R.string.app_common_web_message_handlers___2be27d6afb);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Object[] objArr3 = {requestGeolocationPermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, null, str2, string, string2, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda6
                    public final Object invoke() {
                        return RequestGeolocationPermissionHandler.onExtraCallback(this.f$0, setonoutofmemeryerrorcallback);
                    }
                }};
                onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr3, 1901647186, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1901647184);
                return;
            }
            onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback}, 724317385, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
            int i6 = IAuthTabCallback_Parcel + 111;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        boolean z2 = shouldbekeptaschild.onNavigationEvent;
        throw null;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback}, -158170031, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 158170032);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r28, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[1];
        final String str = (String) objArr[2];
        final String str2 = (String) objArr[3];
        final String str3 = (String) objArr[4];
        final String str4 = (String) objArr[5];
        final Function0 function0 = (Function0) objArr[6];
        int i = 2 % 2;
        final FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        Object obj = null;
        if (activity == null) {
            int i2 = IAuthTabCallbackStubProxy + 81;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 40 / 0;
            }
            return null;
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(activity, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda4
            public final Object invoke(Object obj2) {
                Object[] objArr2 = {str, str2, str4, str3, activity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                return (Unit) RequestGeolocationPermissionHandler.onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr2, 126180647, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -126180641);
            }
        });
        int i4 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 46, (char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 78, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = fragmentActivity.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(new int[]{175, 8, 108, 3}, true, new byte[]{1, 0, 1, 0, 1, 0, 0, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 7001, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, String str2, String str3, String str4, final FragmentActivity fragmentActivity, final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str3, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return RequestGeolocationPermissionHandler.onNavigationEvent(fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str4, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                return (Unit) RequestGeolocationPermissionHandler.onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{(DialogInterface) obj}, 1338875970, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1338875967);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return RequestGeolocationPermissionHandler.onExtraCallbackWithResult(function0, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, LocationSettingsResponse locationSettingsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(requestGeolocationPermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, 0, 5, null);
        } else {
            onWarmupCompleted(requestGeolocationPermissionHandler, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, 0, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    private final void IAuthTabCallback(final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            LocationSettingsRequest locationSettingsRequestBuild = new LocationSettingsRequest.Builder().addLocationRequest(this.onTransact).build();
            Intrinsics.checkNotNullExpressionValue(locationSettingsRequestBuild, "");
            try {
                Result.Companion companion = Result.Companion;
                Task taskCheckLocationSettings = LocationServices.getSettingsClient(context).checkLocationSettings(locationSettingsRequestBuild);
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj2) {
                        return RequestGeolocationPermissionHandler.onExtraCallback(this.f$0, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, (LocationSettingsResponse) obj2);
                    }
                };
                obj = Result.constructor-impl(taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda8
                    public final void onSuccess(Object obj2) {
                        RequestGeolocationPermissionHandler.onNavigationEvent(function1, obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda9
                    public final void onFailure(Exception exc) throws Throwable {
                        RequestGeolocationPermissionHandler.onExtraCallback(this.f$0, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, exc);
                    }
                }));
                int i2 = IAuthTabCallback_Parcel + 105;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i4 = IAuthTabCallbackStubProxy + 1;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(new int[]{6, 35, 0, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                b(28 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 51, objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th2, (Map) null, 8, (Object) null);
                onExtraCallbackWithResult(setonoutofmemeryerrorcallback);
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35331 - AndroidCharacter.getMirror('0')), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), 14239 - Color.argb(0, 0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
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
            int i7 = $11 + 51;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 65, 16718 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 29 - (Process.myPid() >> 22), 17657 - View.MeasureSpec.getSize(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 49467), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 70, View.MeasureSpec.getMode(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i11 = $10 + 95;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $10 + 101;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i16 = $10 + 35;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] << iArr[4]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent %= 0;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                int i17 = $11 + 65;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r6 != 7002) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        onNavigationEvent(r2, r5, 2);
        r2 = viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallbackStubProxy + 51;
        viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallback_Parcel = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        onExtraCallbackWithResult(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r3 = r2.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r3 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (onWarmupCompleted(r3) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r3 = viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallbackStubProxy + 33;
        viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallback_Parcel = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if ((r3 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        IAuthTabCallback(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        IAuthTabCallback(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r4 = im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), r4, new java.lang.Object[]{r1, r5}, 724317385, im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r6 != 18148) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r6 != 7001) goto L9;
     */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r4, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r5, int r6, int r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8, @org.jetbrains.annotations.Nullable android.net.Uri r9) throws java.lang.Throwable {
        /*
            r1 = this;
            r8 = 2
            int r9 = r8 % r8
            int r9 = viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallbackStubProxy
            int r9 = r9 + 83
            int r0 = r9 % 128
            viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallback_Parcel = r0
            int r9 = r9 % r8
            java.lang.String r0 = ""
            if (r9 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3 = 18148(0x46e4, float:2.5431E-41)
            if (r6 == r3) goto L49
            goto L31
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3 = 7001(0x1b59, float:9.81E-42)
            if (r6 == r3) goto L49
        L31:
            r3 = 7002(0x1b5a, float:9.812E-42)
            if (r6 != r3) goto L4f
            r3 = -1
            if (r7 != r3) goto L45
            r1.onNavigationEvent(r2, r5, r8)
            int r2 = viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallbackStubProxy
            int r2 = r2 + 51
            int r3 = r2 % 128
            viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r8
            return
        L45:
            r1.onExtraCallbackWithResult(r5)
            return
        L49:
            android.content.Context r3 = r2.getContext()
            if (r3 != 0) goto L50
        L4f:
            return
        L50:
            boolean r3 = r1.onWarmupCompleted(r3)
            if (r3 == 0) goto L6a
            int r3 = viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallbackStubProxy
            int r3 = r3 + 33
            int r4 = r3 % 128
            viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.IAuthTabCallback_Parcel = r4
            int r3 = r3 % r8
            if (r3 == 0) goto L65
            r1.IAuthTabCallback(r2, r5)
            return
        L65:
            r1.IAuthTabCallback(r2, r5)
            r2 = 0
            throw r2
        L6a:
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            int r4 = im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()
            int r3 = im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()
            int r8 = im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()
            int r7 = im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()
            r6 = 724317385(0x2b2c34c9, float:6.117993E-13)
            r9 = -724317381(0xffffffffd4d3cb3b, float:-7.277182E12)
            onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler.onExtraCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback, int, int, android.os.Bundle, android.net.Uri):void");
    }

    static /* synthetic */ getPackageType onWarmupCompleted(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        getPackageType getpackagetypeOnNavigationEvent = requestGeolocationPermissionHandler.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, i);
        int i6 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    private final getPackageType onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i) {
        int i2 = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, new RequestGeolocationPermissionHandler$requestLocation$1(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, i, setonoutofmemeryerrorcallback, this, null), 3, (Object) null);
        int i3 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
        return getpackagetypeOnNavigationEvent;
    }

    private final void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{126, 8, 148, 2}, false, new byte[]{1, 1, 0, 1, 0, 0, 1, 0}, objArr);
        onWarmupCompleted(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    private final void IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{88, 33, 190, 18}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0}, objArr);
        onWarmupCompleted(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern());
        int i4 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, final String str) {
        int i = 2 % 2;
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.RequestGeolocationPermissionHandler$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return RequestGeolocationPermissionHandler.onWarmupCompleted(str, (startRunning) obj);
            }
        });
        int i2 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        b(6 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48389), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), Boolean.FALSE);
        JsonObject jsonObject2 = new JsonObject();
        Object[] objArr2 = new Object[1];
        b(3 - MotionEvent.axisFromString(""), (char) View.MeasureSpec.getSize(0), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        jsonObject2.addProperty(((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        Object[] objArr3 = new Object[1];
        a(new int[]{121, 5, 104, 0}, false, new byte[]{1, 1, 0, 1, 1}, objArr3);
        jsonObject.add(((String) objArr3[0]).intern(), jsonObject2);
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i2 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onWarmupCompleted(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{49, 39, 0, 32}, false, new byte[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1}, objArr);
        if (ContextCompat.checkSelfPermission(context, ((String) objArr[0]).intern()) != 0) {
            return false;
        }
        int i4 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, String str4, FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Object[] objArr = {str, str2, str3, str4, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0, commonModule_setLeftEdgeTouchEnabled};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, 126180647, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -126180641);
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{dialogInterface}, 1338875970, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1338875967);
    }

    private static final Unit IAuthTabCallback(String str, RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str2, boolean z, String str3, FragmentActivity fragmentActivity, String str4, String str5, String str6, String str7, shouldBeKeptAsChild shouldbekeptaschild) {
        Object[] objArr = {str, requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str2, Boolean.valueOf(z), str3, fragmentActivity, str4, str5, str6, str7, shouldbekeptaschild};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, -710818870, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 710818875);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function1, obj}, -1223005914, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1223005921);
    }

    private final void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this, setonoutofmemeryerrorcallback}, 724317385, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -724317381);
    }

    private static final void onExtraCallbackWithResult(RequestGeolocationPermissionHandler requestGeolocationPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Exception exc) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{requestGeolocationPermissionHandler, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, exc}, -93001006, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 93001006);
    }

    private final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this, setonoutofmemeryerrorcallback}, -158170031, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 158170032);
    }

    private final void onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, String str3, String str4, Function0<Unit> function0) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, str2, str3, str4, function0}, 1901647186, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1901647184);
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = new char[]{27248, 27338, 27330, 27356, 27328, 27341, 27255, 27173, 27174, 27174, 27175, 27177, 27162, 27157, 27168, 27170, 27168, 27197, 27168, 27173, 27169, 27173, 27156, 27153, 27168, 27170, 27168, 27172, 27180, 27175, 27171, 27171, 27172, 27160, 27155, 27197, 27170, 27171, 27197, 27173, 27157, 27267, 27276, 27265, 27294, 27268, 27291, 27295, 27294, 27225, 27137, 27172, 27173, 27169, 27173, 27168, 27197, 27168, 27170, 27168, 27136, 27257, 27148, 27149, 27146, 27138, 27165, 27159, 27164, 27145, 27141, 27143, 27164, 27163, 27139, 27143, 27148, 27140, 27136, 27138, 27136, 27161, 27177, 27175, 27173, 27198, 27170, 27176, 27351, 27490, 27492, 27490, 27498, 27498, 27490, 27489, 27497, 27497, 27516, 27518, 27488, 27491, 27488, 27519, 27492, 27500, 27503, 27473, 27502, 27499, 27497, 27492, 27488, 27518, 27489, 27497, 27473, 27501, 27493, 27497, 27502, 27176, 27293, 27284, 27286, 27286, 27186, 27318, 27318, 27316, 27468, 27312, 27323, 27317, 27193, 27325, 27323, 27327, 27296, 27296, 27250, 27189, 27188, 27187, 27159, 27165, 27197, 27195, 27188, 27190, 27194, 27189, 27189, 27186, 27343, 27187, 27343, 27185, 27189, 27188, 27165, 27159, 27186, 27186, 27338, 27252, 27197, 27170, 27173, 27173, 27178, 27170, 27173, 27176, 27171, 27177, 27264, 27290, 27279, 27381, 27292, 27294, 27292, 27252, 27168, 27168, 27198, 27174, 27179, 27290, 27306, 27304, 27280, 27284, 27311, 27310, 27260, 27172, 27194, 27192};
        IAuthTabCallbackDefault = new char[]{18464, 36306, 50120, 6621, 24516, 38345, 1117, 49579, 36791, 21925, 5026, 20642, 38235, 56140, 335, 18248, 36185, 62296, 60855, 10308, 26190, 48204, 60821, 10343, 26237, 48232, 64113, 12412, 19982, 33881, 49749, 6227, 22087, 27649, 43593, 57428, 15878, 29771, 45643, 51279, 1562, 23626, 39501, 53327, 61006, 9298, 25166, 47175, 63063, 3157, 60855, 10307, 26191, 48202, 64067, 12387, 20033, 33870, 49741, 6231, 22091, 27726, 43598, 57460, 15939, 29777, 45648, 51282, 1620, 23646, 39499, 53279, 61016, 9308, 25173, 47199, 63063, 3157, 60853, 10309, 26190, 48219, 64071, 12358, 20042, 33795, 49759, 6214, 22102, 27733, 43593, 57417, 15937, 29782, 45578, 51322, 1642, 23657, 39540, 53366, 61053, 9340, 25192, 47226, 63101, 3199, 19055, 32883, 56947, 5217, 21109, 26690, 42566, 64602, 14935, 28764, 36427, 50265, 600, 22602, 38476, 44102, 59987, 60848, 10318, 26201, 48202, 64090, 12358, 20062, 33881, 49733, 6220, 22092, 60855, 10314, 26180, 48202, 64077, 12355, 20090, 33860, 49752, 6223, 22087, 60857, 10318, 26201, 48218, 64073, 12360, 20043, 18849, 35923, 49754, 6228, 24150, 37977, 60018, 8275, 26201, 48215};
        asBinder = -2926751563407284181L;
    }
}
