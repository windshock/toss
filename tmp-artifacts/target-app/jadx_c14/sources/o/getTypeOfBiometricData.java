package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.JsonObject;
import im.toss.ads_sdk.model.NativeAdsDto;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkLoadWithDataHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTypeOfBiometricData implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 1;
    private static char asBinder;
    private static char[] asInterface;
    private static int getInterfaceDescriptor;
    private static char onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char onTransact;
    private static final String onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{11541, 57828, 58321, 41633, 62536, 47574, 11534, 28223, 62590, 43017, 21154, 22835}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(false, new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 1}, new int[]{0, 9, 0, 0}, objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{0, 1, 0, 1, 1}, new int[]{9, 5, 0, 5}, objArr3);
        onNavigationEvent = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(true, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1}, new int[]{14, 10, 0, 10}, objArr4);
        onWarmupCompleted = ((String) objArr4[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        int i3 = IAuthTabCallbackDefault + 45;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 13;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            int i6 = 86 / 0;
        }
        int i7 = IAuthTabCallbackDefault + 117;
        access000 = i7 % 128;
        int i8 = i7 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = access000 + 53;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = access000 + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 93;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new NativeAdsSdkLoadWithDataHandler$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallbackDefault + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i4 = IAuthTabCallbackDefault + 125;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        TextFieldScrollKtExternalSyntheticLambda0 activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (!(activity instanceof AppCompatActivity)) {
            textFieldScrollKtExternalSyntheticLambda0 = null;
        } else {
            int i2 = IAuthTabCallbackDefault + 43;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            textFieldScrollKtExternalSyntheticLambda0 = (AppCompatActivity) activity;
        }
        if (textFieldScrollKtExternalSyntheticLambda0 == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{11541, 57828, 58321, 41633, 62536, 47574, 11534, 28223, 62590, 43017, 21154, 22835}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b(false, new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 1}, new int[]{0, 9, 0, 0}, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{0, 1, 0, 1, 1}, new int[]{9, 5, 0, 5}, objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b(false, new byte[]{1, 1, 0, 1, 1, 1, 1, 0}, new int[]{24, 8, 0, 2}, objArr4);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        b(true, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1}, new int[]{14, 10, 0, 10}, objArr5);
        JsonObject jsonObjectOnExtraCallback = settext.onExtraCallback(((String) objArr5[0]).intern(), new JsonObject());
        if (strOnNavigationEvent.length() == 0) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(getOIDs.onExtraCallback(jsonObjectOnExtraCallback));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) == null) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, strOnNavigationEvent2, strOnNavigationEvent4, textFieldScrollKtExternalSyntheticLambda0, strOnNavigationEvent, (NativeAdsDto) obj, strOnNavigationEvent3, setonoutofmemeryerrorcallback, (access13800) null), 3, (Object) null);
            return;
        }
        Object[] objArr6 = new Object[1];
        b(true, null, new int[]{32, 18, 81, 10}, objArr6);
        String strIntern = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}, new int[]{50, 19, 0, 0}, objArr7);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr7[0]).intern(), (Map) null, 4, (Object) null);
        int i4 = IAuthTabCallbackDefault + 105;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 87;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int iBlue = 10 - Color.blue(i3);
                        int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iBlue, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, View.MeasureSpec.getSize(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $11 + 29;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - View.resolveSizeAndState(0, 0, 0)), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getTrimmedLength("") + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = asInterface;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myTid() >> 22) + 35, 14240 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 65 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 16718 - (Process.myPid() >> 22), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    int i13 = $10 + 17;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49466), Color.green(0) + 70, 12486 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i15 = $10 + 7;
            $11 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i7 > 0) {
            int i17 = $10 + 93;
            $11 = i17 % 128;
            int i18 = i17 % i;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i19 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i19, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i20 = $10 + 107;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onExtraCallback = (char) 2237;
        onTransact = (char) 53692;
        asBinder = (char) 60057;
        IAuthTabCallbackStub = (char) 3793;
        asInterface = new char[]{27255, 27170, 27170, 27197, 27168, 27170, 27168, 27157, 27160, 27260, 27160, 27156, 27177, 27173, 27260, 27170, 27198, 27168, 27169, 27199, 27170, 27157, 27157, 27180, 27260, 27173, 27196, 27173, 27179, 27179, 27173, 27196, 27387, 27388, 27199, 27387, 27380, 27379, 27388, 27273, 27377, 27348, 27384, 27274, 27377, 27278, 27279, 27274, 27384, 27373, 27242, 27141, 27164, 27141, 27144, 27140, 27144, 27167, 27166, 27148, 27167, 27158, 27141, 27138, 27167, 27137, 27136, 27166, 27138};
    }
}
