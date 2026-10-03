package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.tossbank.TossBankSetTransferAdditionalAuthHandler$;
import viva.republica.toss.send.v4.TossBankAdditionalAuthWebActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_API_CheckLicense implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static boolean onExtraCallback = false;
    private static boolean onExtraCallbackWithResult = false;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-117, -119, -112, -114, -122, -123, -109, -110, -118, -111, -115, -112, -123, -122, -126, -113, -118, -113, -114, -114, -115, -117, -119, -116, -125, -122, -123, -117, -127, -118, -119, -120, -121, -122, -123, -124, -125, -125, -126, -127}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackDefault + 99;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, str2);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i3 = IAuthTabCallbackStub + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            throw null;
        }
        int i6 = asInterface + 115;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asInterface + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asInterface + 15;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TossBankSetTransferAdditionalAuthHandler$.ExternalSyntheticLambda0());
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(Uri.parse(str));
        int i4 = IAuthTabCallbackStub + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        String strIntern;
        String strIntern2;
        Map map;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        TossBankAdditionalAuthWebActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        TossBankAdditionalAuthWebActivity tossBankAdditionalAuthWebActivity = activity instanceof TossBankAdditionalAuthWebActivity ? activity : null;
        if (tossBankAdditionalAuthWebActivity != null) {
            setText settext = new setText(jsonObject);
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl((UST_API_SetLicenseConfig) ALCEyeBlink.onExtraCallback().fromJson(settext.onExtraCallbackWithResult(), UST_API_SetLicenseConfig.class));
                int i3 = IAuthTabCallbackStub + 67;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i5 = asInterface + 39;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-117, -119, -112, -114, -122, -123, -109, -110, -118, -111, -115, -112, -123, -122, -126, -113, -118, -113, -114, -114, -115, -117, -119, -116, -125, -122, -123, -117, -127, -118, -119, -120, -121, -122, -123, -124, -125, -125, -126, -127}, (ViewConfiguration.getPressedStateDuration() << 78) + 116, objArr);
                    strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-118, -112, -111, -125, -119, -117, -108, -106, -122, -113, -125, -117, -123, -107, -108, -122, -126, -108, -117, -126, -117, -117, -119}, 102 / ExpandableListView.getPackedPositionGroup(1L), objArr2);
                    strIntern2 = ((String) objArr2[0]).intern();
                    map = null;
                    i = 63;
                } else {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a(null, null, new byte[]{-117, -119, -112, -114, -122, -123, -109, -110, -118, -111, -115, -112, -123, -122, -126, -113, -118, -113, -114, -114, -115, -117, -119, -116, -125, -122, -123, -117, -127, -118, -119, -120, -121, -122, -123, -124, -125, -125, -126, -127}, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    a(null, null, new byte[]{-118, -112, -111, -125, -119, -117, -108, -106, -122, -113, -125, -117, -123, -107, -108, -122, -126, -108, -117, -126, -117, -117, -119}, ExpandableListView.getPackedPositionGroup(0L) + 127, objArr4);
                    strIntern2 = ((String) objArr4[0]).intern();
                    map = null;
                    i = 8;
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, strIntern2, th2, map, i, (Object) null);
            }
            UST_API_SetLicenseConfig uST_API_SetLicenseConfig = (UST_API_SetLicenseConfig) (Result.onExtraCallback(obj) ^ true ? obj : null);
            if (uST_API_SetLicenseConfig != null) {
                tossBankAdditionalAuthWebActivity.onNavigationEvent(uST_API_SetLicenseConfig);
            }
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 78 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 20952 - (ViewConfiguration.getLongPressTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 74, 16793253 + Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $11 + 45;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 63 - Color.green(0), Color.green(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i7 = $11 + 25;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 115;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted >>> 1;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $10 + 13;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 73;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 64 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12214 - (ViewConfiguration.getTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{32471, 32508, 32496, 32417, 32450, 32509, 32504, 32464, 32454, 32503, 32497, 32453, 32418, 32455, 32506, 32511, 32502, 32507, 32475, 32387, 32499, 32452};
        onNavigationEvent = -1184333981;
        onExtraCallback = true;
        onExtraCallbackWithResult = true;
    }
}
