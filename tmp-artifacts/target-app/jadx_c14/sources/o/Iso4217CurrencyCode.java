package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.JsonObject;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.core.workerservice.WorkerService$Companion$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.ads.NativeAdsSdkLoadHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Iso4217CurrencyCode implements ALCFaceQuality {
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static char IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static char[] asBinder;
    private static char asInterface;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char onTransact;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = o.Iso4217CurrencyCode.$$a
            int r8 = r8 * 4
            int r8 = r8 + 97
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Iso4217CurrencyCode.$$c(int, byte, short):java.lang.String");
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{57013, 58428, 50242, 22220, 59834, 21540, 47312, 42376, 14513, 10672, 3942, 39178}, 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(Color.argb(0, 0, 0, 0) + 9, (char) View.combineMeasuredStates(0, 0), Color.blue(0), objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{43471, 30759, 890, 43870, 3942, 39178}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4, objArr3);
        onNavigationEvent = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45043), 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
        onExtraCallbackWithResult = ((String) objArr4[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = access100 + 67;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i4 = IAuthTabCallbackStubProxy + 27;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = access000 + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStubProxy + 77;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 19;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = IAuthTabCallbackStubProxy + 51;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = IAuthTabCallbackStubProxy + 11;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            int i6 = 99 / 0;
        }
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new NativeAdsSdkLoadHandler$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallbackStubProxy + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i4 = IAuthTabCallbackStubProxy + 115;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        TextFieldScrollKtExternalSyntheticLambda0 activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (!(!(activity instanceof AppCompatActivity))) {
            int i4 = access000 + 73;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            textFieldScrollKtExternalSyntheticLambda0 = (AppCompatActivity) activity;
        } else {
            textFieldScrollKtExternalSyntheticLambda0 = null;
        }
        if (textFieldScrollKtExternalSyntheticLambda0 == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{57013, 58428, 50242, 22220, 59834, 21540, 47312, 42376, 14513, 10672, 3942, 39178}, 11 - TextUtils.indexOf("", ""), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b(TextUtils.indexOf("", "") + 9, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        b(7 - View.combineMeasuredStates(0, 0), (char) (View.MeasureSpec.getSize(0) + 45042), 9 - Color.red(0), objArr3);
        JsonObject jsonObjectOnExtraCallback = settext.onExtraCallback(((String) objArr3[0]).intern(), new JsonObject());
        Object[] objArr4 = new Object[1];
        a(new char[]{43471, 30759, 890, 43870, 3942, 39178}, TextUtils.getTrimmedLength("") + 5, objArr4);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        a(new char[]{7942, 23939, 44506, 16846, 4773, 34886, 19564, 57714}, Color.argb(0, 0, 0, 0) + 8, objArr5);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        String strIAuthTabCallback = ETSIQCObjectIdentifiers.IAuthTabCallback(settext);
        if (strOnNavigationEvent.length() == 0) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, strOnNavigationEvent2, strOnNavigationEvent4, jsonObject, textFieldScrollKtExternalSyntheticLambda0, strOnNavigationEvent, strOnNavigationEvent3, (GetNativeAdsRequestBody.AdRequestOption) getOIDs.onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{jsonObjectOnExtraCallback}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1335267184, -1335267183), strIAuthTabCallback, setonoutofmemeryerrorcallback, (access13800) null), 3, (Object) null);
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(asBinder[i2 + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 59697), View.MeasureSpec.getMode(0) + 17, TextUtils.lastIndexOf("", '0') + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getTouchSlop() >> 8)), 31 - (ViewConfiguration.getScrollBarSize() >> 8), 20220 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 45, TextUtils.indexOf("", "", 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $10 + 33;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), KeyEvent.getDeadChar(0, 0) + 44, 1494 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $10 + 121;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int capsMode = TextUtils.getCapsMode("", i3, i3) + 10;
                        int i10 = 12435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, capsMode, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i11 = $11 + 11;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.getTrimmedLength("")), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), MotionEvent.axisFromString("") + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
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

    static void onWarmupCompleted() {
        onWarmupCompleted = (char) 14974;
        asInterface = (char) 43860;
        onTransact = (char) 19835;
        IAuthTabCallbackDefault = (char) 4494;
        asBinder = new char[]{60839, 50818, 48065, 27710, 16753, 14916, 61064, 50168, 46120, 16969, 26981, 5172, 50134, 61061, 38327, 16743};
        IAuthTabCallbackStub = 6798013070138984167L;
    }
}
