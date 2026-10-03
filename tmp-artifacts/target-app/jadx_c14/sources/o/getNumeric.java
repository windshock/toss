package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.google.gson.JsonElement;
import com.tmoney.a;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getIconPaddingRight;
import o.getNumeric;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.broadcast.WebBroadcast$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNumeric {
    private static final String IAuthTabCallback;
    private static final Map<onWarmupCompleted, deserializeUriNullableCollection> IAuthTabCallbackDefault;
    private static final Function1<String, IAnimation<JsonElement>> IAuthTabCallbackStub;
    private static boolean IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int ICustomTabsCallback;
    private static int access000;
    private static long access100;
    private static final getIconPaddingRight<onExtraCallbackWithResult> asBinder;
    private static final Function1<String, IAnimation<JsonElement>> asInterface;
    private static boolean getInterfaceDescriptor;
    private static final getCornerRadius<Pair<String, JsonElement>> onExtraCallback;
    private static final getBorderRadius<Pair<String, JsonElement>> onExtraCallbackWithResult;
    public static final getNumeric onNavigationEvent;
    private static char[] onTransact;
    public static final int onWarmupCompleted;
    private static char writeTypedObject;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 204;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int extraCallbackWithResult = 0;
    private static int extraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = o.getNumeric.$$a
            int r6 = 110 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNumeric.$$c(short, byte, byte):java.lang.String");
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        int i4 = extraCallback + 85;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i5;
        int i9 = ~i;
        int i10 = i7 | i5;
        int i11 = (~(i2 | i9 | i5)) | (~(i10 | i));
        int i12 = (~i10) | (~(i9 | (~i5)));
        int i13 = i5 + i + i6 + (1353909401 * i3) + ((-1351514252) * i4);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i5) + 799145984 + ((-1483212659) * i) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i6) + (337379328 * i3) + ((-1540358144) * i4) + (669122560 * i14);
        int i16 = ((i5 * 521834465) - 1171472169) + (i * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i6 * 521834041) + (i3 * 1123214353) + (i4 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? i17 != 5 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i18 = 2 % 2;
        int i19 = extraCallback + 29;
        extraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        onExtraCallback(function1, obj);
        int i21 = extraCallback + 25;
        extraCallbackWithResult = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, IAuthTabCallback iAuthTabCallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, iAuthTabCallback, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, iAuthTabCallback, th);
        int i3 = extraCallback + 75;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ IAnimation onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAnimation iAnimationOnNavigationEvent = onNavigationEvent(str);
        int i4 = extraCallbackWithResult + 53;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iAnimationOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, onextracallbackwithresult);
        int i4 = extraCallbackWithResult + 73;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        int i5 = 78 / 0;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, IAuthTabCallback iAuthTabCallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Function1 function1, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (Unit) onExtraCallback(-928014804, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{str, iAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function1, onextracallbackwithresult}, a.3.onWarmupCompleted(), 928014806, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(onextracallbackwithresult, startrunning);
        }
        onNavigationEvent(onextracallbackwithresult, startrunning);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ReactNativeContentOwner reactNativeContentOwner = (ReactNativeContentOwner) objArr[0];
        String str = (String) objArr[1];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(reactNativeContentOwner, str, onextracallbackwithresult);
        int i4 = extraCallback + 23;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(WebViewContentOwner webViewContentOwner, String str, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(webViewContentOwner, str, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ IAnimation onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAnimation iAnimationOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = extraCallback + 45;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iAnimationOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            onExtraCallback(-649089255, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{function1, obj}, a.3.onWarmupCompleted(), 649089260, iOnWarmupCompleted2);
            return;
        }
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        onExtraCallback(-649089255, iOnWarmupCompleted3, a.3.onWarmupCompleted(), new Object[]{function1, obj}, a.3.onWarmupCompleted(), 649089260, iOnWarmupCompleted4);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private getNumeric() {
    }

    public static final /* synthetic */ void IAuthTabCallback(getNumeric getnumeric, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getnumeric.onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, iAuthTabCallback);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private final String IAuthTabCallback;
        private final JsonElement onExtraCallback;
        private static char[] onWarmupCompleted = {32474, 32490, 32501, 32507, 32504, 32505, 32489, 32488, 32473, 32508, 32502, 32511, 32496, 32468, 32483, 32444, 32423, 32432, 32388, 32503, 32509, 32435};
        private static int onNavigationEvent = -1184333980;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onTransact = true;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 113;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 25;
                IAuthTabCallbackStub = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i6 = i2 + 23;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                return true;
            }
            int i8 = IAuthTabCallbackStub + 103;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.IAuthTabCallback.hashCode() + 71) * this.onExtraCallback.hashCode() : (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i3 = IAuthTabCallbackDefault + 121;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.IAuthTabCallback;
            JsonElement jsonElement = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-111, -115, -116, -117, -117, -124, -118, -122, -112, -123, -124, -125, -115, -113, -124, -114, -115, -116, -117, -117, -124, -118, -119, -120, -121, -124, -122, -123, -124, -125, -126, -127}, 175 - AndroidCharacter.getMirror('0'), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-111, -116, -107, -124, -121, -121, -116, -108, -109, -110}, TextUtils.getOffsetBefore("", 0) + 127, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(jsonElement);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-106}, 127 - TextUtils.getCapsMode("", 0, 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackDefault + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.IAuthTabCallback = str;
            this.onExtraCallback = jsonElement;
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 107;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                str = this.IAuthTabCallback;
                int i4 = 59 / 0;
            } else {
                str = this.IAuthTabCallback;
            }
            int i5 = i3 + 3;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final JsonElement onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 99;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            JsonElement jsonElement = this.onExtraCallback;
            int i5 = i2 + 93;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return jsonElement;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onWarmupCompleted;
            float f = 0.0f;
            if (cArr3 != null) {
                int i4 = $11 + 9;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i2 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getScrollBarSize() >> 8) + 77, (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2++;
                        int i5 = $10 + 79;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 75 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16037 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 111;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 63 - Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i9 = $11 + 119;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
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
            int i11 = $11 + 75;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i13 = $11 + 99;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] % iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 63 - (KeyEvent.getMaxKeyCode() >> 16), 12214 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 64, 12213 - TextUtils.lastIndexOf("", '0', 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    static {
        ICustomTabsCallback = 1;
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-117, -118, -121, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        onNavigationEvent = new getNumeric();
        getIconPaddingRight.onExtraCallbackWithResult onextracallbackwithresult = getIconPaddingRight.Companion;
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-117, -118, -121, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        asBinder = onextracallbackwithresult.onExtraCallbackWithResult(((String) objArr2[0]).intern());
        IAuthTabCallbackDefault = new LinkedHashMap();
        onExtraCallback = setShine.onNavigationEvent((Object) null);
        asInterface = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.broadcast.WebBroadcast$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return getNumeric.onExtraCallback((String) obj);
            }
        };
        onExtraCallbackWithResult = getShine.onWarmupCompleted(0, 1, (CloseableUtils) null, 5, (Object) null);
        IAuthTabCallbackStub = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.broadcast.WebBroadcast$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return getNumeric.onWarmupCompleted((String) obj);
            }
        };
        onWarmupCompleted = 8;
        int i = readTypedObject + 11;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final IAnimation onNavigationEvent(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new onNavigationEvent(new onExtraCallback(onExtraCallback, str)));
        int i2 = extraCallback + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return iAnimationOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements IAnimation<JsonElement> {
        final /* synthetic */ IAnimation onExtraCallbackWithResult;

        /* renamed from: o.getNumeric$IAuthTabCallbackDefault$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements setRipple {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static long onWarmupCompleted = -5810794306745492657L;
            final /* synthetic */ setRipple IAuthTabCallback;

            /* renamed from: o.getNumeric$IAuthTabCallbackDefault$2$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass2.this.emit(null, this);
                }
            }

            public AnonymousClass2(setRipple setripple) {
                this.IAuthTabCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, o.access13800 r9) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 265
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getNumeric.IAuthTabCallbackDefault.AnonymousClass2.emit(java.lang.Object, o.access13800):java.lang.Object");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                int i3 = $10 + 3;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.makeMeasureSpec(0, 0)), 83 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 14185), 19 - (ViewConfiguration.getEdgeSlop() >> 16), 8808 - View.resolveSizeAndState(0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                int i6 = $11 + 111;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                objArr[0] = str;
            }
        }

        public IAuthTabCallbackDefault(IAnimation iAnimation) {
            this.onExtraCallbackWithResult = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass2(setripple), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class asBinder implements IAnimation<Pair<? extends String, ? extends JsonElement>> {
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ IAnimation onNavigationEvent;

        /* renamed from: o.getNumeric$asBinder$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements setRipple {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static char[] onWarmupCompleted = {27239, 27191, 27345, 27351, 27355, 27353, 27346, 27344, 27375, 27369, 27371, 27373, 27373, 27346, 27194, 27193, 27375, 27375, 27373, 27184, 27160, 27191, 27349, 27374, 27371, 27371, 27344, 27189, 27160, 27195, 27344, 27373, 27347, 27350, 27352, 27194, 27160, 27191, 27346, 27370, 27369, 27345, 27344, 27185, 27160, 27188, 27370};
            final /* synthetic */ setRipple IAuthTabCallback;
            final /* synthetic */ String onExtraCallback;

            /* renamed from: o.getNumeric$asBinder$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass2(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass3.this.emit(null, this);
                }
            }

            public AnonymousClass3(setRipple setripple, String str) {
                this.IAuthTabCallback = setripple;
                this.onExtraCallback = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, o.access13800 r10) throws java.lang.Throwable {
                /*
                    r8 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getNumeric.asBinder.AnonymousClass3.onNavigationEvent
                    int r1 = r1 + 65
                    int r2 = r1 % 128
                    o.getNumeric.asBinder.AnonymousClass3.onExtraCallbackWithResult = r2
                    int r1 = r1 % r0
                    boolean r1 = r10 instanceof o.getNumeric.asBinder.AnonymousClass3.AnonymousClass2
                    r2 = 1
                    if (r1 == r2) goto L12
                    goto L21
                L12:
                    r1 = r10
                    o.getNumeric$asBinder$3$2 r1 = (o.getNumeric.asBinder.AnonymousClass3.AnonymousClass2) r1
                    int r3 = r1.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L21
                    int r3 = r3 + r4
                    r1.label = r3
                    goto L26
                L21:
                    o.getNumeric$asBinder$3$2 r1 = new o.getNumeric$asBinder$3$2
                    r1.<init>(r10)
                L26:
                    java.lang.Object r10 = r1.result
                    java.lang.Object r3 = o.access14300.onWarmupCompleted()
                    int r4 = r1.label
                    r5 = 0
                    if (r4 == 0) goto L60
                    if (r4 != r2) goto L3f
                    java.lang.Object r9 = r1.L$3
                    o.setRipple r9 = (o.setRipple) r9
                    java.lang.Object r9 = r1.L$1
                    o.getNumeric$asBinder$3$2 r9 = (o.getNumeric.asBinder.AnonymousClass3.AnonymousClass2) r9
                    kotlin.ResultKt.onNavigationEvent(r10)
                    goto Lb3
                L3f:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    r10 = 51
                    r0 = 5
                    r1 = 47
                    int[] r10 = new int[]{r5, r1, r10, r0}
                    byte[] r0 = new byte[r1]
                    r0 = {x00b6: FILL_ARRAY_DATA , data: [1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1} // fill-array
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    a(r10, r2, r0, r1)
                    r10 = r1[r5]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String r10 = r10.intern()
                    r9.<init>(r10)
                    throw r9
                L60:
                    kotlin.ResultKt.onNavigationEvent(r10)
                    o.setRipple r10 = r8.IAuthTabCallback
                    r4 = r9
                    kotlin.Pair r4 = (kotlin.Pair) r4
                    if (r4 == 0) goto L7e
                    java.lang.Object r4 = r4.getFirst()
                    java.lang.String r4 = (java.lang.String) r4
                    int r6 = o.getNumeric.asBinder.AnonymousClass3.onExtraCallbackWithResult
                    int r6 = r6 + 33
                    int r7 = r6 % 128
                    o.getNumeric.asBinder.AnonymousClass3.onNavigationEvent = r7
                    int r6 = r6 % r0
                    if (r6 != 0) goto L7f
                    r6 = 3
                    int r6 = r6 / r6
                    goto L7f
                L7e:
                    r4 = 0
                L7f:
                    java.lang.String r6 = r8.onExtraCallback
                    boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                    if (r4 == 0) goto Lb3
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r9)
                    r1.L$0 = r4
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r1)
                    r1.L$1 = r4
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r9)
                    r1.L$2 = r4
                    java.lang.Object r4 = o.access15400.onNavigationEvent(r10)
                    r1.L$3 = r4
                    r1.I$0 = r5
                    r1.label = r2
                    java.lang.Object r9 = r10.emit(r9, r1)
                    if (r9 != r3) goto Lb3
                    int r9 = o.getNumeric.asBinder.AnonymousClass3.onNavigationEvent
                    int r9 = r9 + 105
                    int r10 = r9 % 128
                    o.getNumeric.asBinder.AnonymousClass3.onExtraCallbackWithResult = r10
                    int r9 = r9 % r0
                    return r3
                Lb3:
                    kotlin.Unit r9 = kotlin.Unit.INSTANCE
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getNumeric.asBinder.AnonymousClass3.emit(java.lang.Object, o.access13800):java.lang.Object");
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i = 2;
                int i2 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr = onWarmupCompleted;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i7 = $10 + 1;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 79;
                        $11 = i10 % 128;
                        if (i10 % i == 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.red(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35283), 35 - View.MeasureSpec.getSize(0), 14239 - Color.blue(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i9++;
                        }
                        i = 2;
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i4];
                System.arraycopy(cArr, i3, cArr3, 0, i4);
                if (bArr != null) {
                    char[] cArr4 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65, TextUtils.getTrimmedLength("") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } else {
                            int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 29 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.indexOf("", "")), View.MeasureSpec.getMode(0) + 70, 12486 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i6 > 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    int i13 = i4 - i6;
                    System.arraycopy(cArr5, 0, cArr3, i13, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i13);
                }
                if (z) {
                    char[] cArr6 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        int i14 = $10 + 49;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    int i16 = $10 + 53;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr3 = cArr6;
                }
                if (i5 > 0) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                }
                objArr[0] = new String(cArr3);
            }
        }

        public asBinder(IAnimation iAnimation, String str) {
            this.onNavigationEvent = iAnimation;
            this.onExtraCallbackWithResult = str;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass3(setripple, this.onExtraCallbackWithResult), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback implements IAnimation<Pair<? extends String, ? extends JsonElement>> {
        final /* synthetic */ IAnimation IAuthTabCallback;
        final /* synthetic */ String onExtraCallback;

        /* renamed from: o.getNumeric$onExtraCallback$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements setRipple {
            private static int $10 = 0;
            private static int $11 = 1;
            private static long IAuthTabCallback = -5785916186909618306L;
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ String onExtraCallbackWithResult;
            final /* synthetic */ setRipple onNavigationEvent;

            /* renamed from: o.getNumeric$onExtraCallback$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass2(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(setRipple setripple, String str) {
                this.onNavigationEvent = setripple;
                this.onExtraCallbackWithResult = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, o.access13800 r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getNumeric.onExtraCallback.AnonymousClass1.onExtraCallback
                    int r1 = r1 + 11
                    int r2 = r1 % 128
                    o.getNumeric.onExtraCallback.AnonymousClass1.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    boolean r1 = r9 instanceof o.getNumeric.onExtraCallback.AnonymousClass1.AnonymousClass2
                    if (r1 == 0) goto L1f
                    r1 = r9
                    o.getNumeric$onExtraCallback$1$2 r1 = (o.getNumeric.onExtraCallback.AnonymousClass1.AnonymousClass2) r1
                    int r2 = r1.label
                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                    r4 = r2 & r3
                    if (r4 == 0) goto L1f
                    int r2 = r2 + r3
                    r1.label = r2
                    goto L24
                L1f:
                    o.getNumeric$onExtraCallback$1$2 r1 = new o.getNumeric$onExtraCallback$1$2
                    r1.<init>(r9)
                L24:
                    java.lang.Object r9 = r1.result
                    java.lang.Object r2 = o.access14300.onWarmupCompleted()
                    int r3 = r1.label
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L5e
                    if (r3 != r5) goto L3e
                    java.lang.Object r8 = r1.L$3
                    o.setRipple r8 = (o.setRipple) r8
                    java.lang.Object r8 = r1.L$1
                    o.getNumeric$onExtraCallback$1$2 r8 = (o.getNumeric.onExtraCallback.AnonymousClass1.AnonymousClass2) r8
                    kotlin.ResultKt.onNavigationEvent(r9)
                    goto La5
                L3e:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    r9 = 51
                    char[] r9 = new char[r9]
                    r9 = {x00a8: FILL_ARRAY_DATA , data: [-1165, -1264, 20355, 28545, -1136, 1801, -10840, -14190, 10907, -13875, 21826, 10156, 22724, 6131, 25488, 2055, -29090, 26148, -20008, 23067, -17293, -19341, -8224, -21374, -7180, -32085, -4568, -372, 4580, -12088, 15483, -16158, 18276, 16130, 19128, 4475, 29971, 3398, -26420, 25456, -25837, 23513, -22770, -19037, -13615, -22098, -2752, -30784, -1918, -2073, 920} // fill-array
                    int r0 = android.view.ViewConfiguration.getTouchSlop()
                    int r0 = r0 >> 8
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    a(r9, r0, r1)
                    r9 = r1[r4]
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.String r9 = r9.intern()
                    r8.<init>(r9)
                    throw r8
                L5e:
                    kotlin.ResultKt.onNavigationEvent(r9)
                    o.setRipple r9 = r7.onNavigationEvent
                    r3 = r8
                    kotlin.Pair r3 = (kotlin.Pair) r3
                    if (r3 == 0) goto L6f
                    java.lang.Object r3 = r3.getFirst()
                    java.lang.String r3 = (java.lang.String) r3
                    goto L70
                L6f:
                    r3 = 0
                L70:
                    java.lang.String r6 = r7.onExtraCallbackWithResult
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)
                    r3 = r3 ^ r5
                    if (r3 == r5) goto La5
                    int r3 = o.getNumeric.onExtraCallback.AnonymousClass1.onExtraCallback
                    int r3 = r3 + 89
                    int r6 = r3 % 128
                    o.getNumeric.onExtraCallback.AnonymousClass1.onWarmupCompleted = r6
                    int r3 = r3 % r0
                    java.lang.Object r0 = o.access15400.onNavigationEvent(r8)
                    r1.L$0 = r0
                    java.lang.Object r0 = o.access15400.onNavigationEvent(r1)
                    r1.L$1 = r0
                    java.lang.Object r0 = o.access15400.onNavigationEvent(r8)
                    r1.L$2 = r0
                    java.lang.Object r0 = o.access15400.onNavigationEvent(r9)
                    r1.L$3 = r0
                    r1.I$0 = r4
                    r1.label = r5
                    java.lang.Object r8 = r9.emit(r8, r1)
                    if (r8 != r2) goto La5
                    return r2
                La5:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getNumeric.onExtraCallback.AnonymousClass1.emit(java.lang.Object, o.access13800):java.lang.Object");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                int i3 = $10 + 59;
                $11 = i3 % 128;
                while (true) {
                    int i4 = i3 % 2;
                    if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                        return;
                    }
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45811), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 84, 21233 - (Process.myPid() >> 22), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (Process.myTid() >> 22)), 18 - MotionEvent.axisFromString(""), TextUtils.indexOf("", "", 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        i3 = $11 + 15;
                        $10 = i3 % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
        }

        public onExtraCallback(IAnimation iAnimation, String str) {
            this.IAuthTabCallback = iAnimation;
            this.onExtraCallback = str;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass1(setripple, this.onExtraCallback), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class onNavigationEvent implements IAnimation<JsonElement> {
        final /* synthetic */ IAnimation onNavigationEvent;

        /* renamed from: o.getNumeric$onNavigationEvent$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements setRipple {
            final /* synthetic */ setRipple onExtraCallbackWithResult;
            private static final byte[] $$a = {2, 105, -126, -86};
            private static final int $$b = 63;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent = 478309032;

            /* renamed from: o.getNumeric$onNavigationEvent$4$5, reason: invalid class name */
            public static final class AnonymousClass5 extends ContinuationImpl {
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass5(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass4.this.emit(null, this);
                }
            }

            private static String $$c(short s, short s2, int i) {
                int i2 = s * 3;
                byte[] bArr = $$a;
                int i3 = 3 - (s2 * 2);
                int i4 = 105 - (i * 3);
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i6 = -1;
                    i4 = i3 + i4;
                    i3 = i3;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i3 + 1;
                    i6 = i7;
                    i4 = bArr[i8] + i4;
                    i3 = i8;
                }
            }

            public AnonymousClass4(setRipple setripple) {
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, o.access13800 r14) throws java.lang.Throwable {
                /*
                    r12 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getNumeric.onNavigationEvent.AnonymousClass4.onExtraCallback
                    int r1 = r1 + 93
                    int r2 = r1 % 128
                    o.getNumeric.onNavigationEvent.AnonymousClass4.IAuthTabCallback = r2
                    int r1 = r1 % r0
                    boolean r1 = r14 instanceof o.getNumeric.onNavigationEvent.AnonymousClass4.AnonymousClass5
                    if (r1 == 0) goto L1f
                    r1 = r14
                    o.getNumeric$onNavigationEvent$4$5 r1 = (o.getNumeric.onNavigationEvent.AnonymousClass4.AnonymousClass5) r1
                    int r2 = r1.label
                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                    r4 = r2 & r3
                    if (r4 == 0) goto L1f
                    int r2 = r2 + r3
                    r1.label = r2
                    goto L24
                L1f:
                    o.getNumeric$onNavigationEvent$4$5 r1 = new o.getNumeric$onNavigationEvent$4$5
                    r1.<init>(r14)
                L24:
                    java.lang.Object r14 = r1.result
                    java.lang.Object r2 = o.access14300.onWarmupCompleted()
                    int r3 = r1.label
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L74
                    if (r3 != r5) goto L3f
                    java.lang.Object r13 = r1.L$3
                    o.setRipple r13 = (o.setRipple) r13
                    java.lang.Object r13 = r1.L$1
                    o.getNumeric$onNavigationEvent$4$5 r13 = (o.getNumeric.onNavigationEvent.AnonymousClass4.AnonymousClass5) r13
                    kotlin.ResultKt.onNavigationEvent(r14)
                    goto Lcc
                L3f:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    int r14 = android.view.KeyEvent.normalizeMetaState(r4)
                    r0 = 47
                    int r6 = 47 - r14
                    java.lang.String r14 = ""
                    r1 = 48
                    int r14 = android.text.TextUtils.indexOf(r14, r1)
                    int r7 = r14 + 19
                    char[] r8 = new char[r0]
                    r8 = {x00d0: FILL_ARRAY_DATA , data: [6, -60, -53, 9, 17, 25, 23, 9, 22, -53, -60, 19, 24, -60, 16, 16, 5, 7, 9, 18, 13, 24, 25, 19, 22, 19, 7, -60, 12, 24, 13, 27, -60, -53, 9, 15, 19, 26, 18, 13, -53, -60, 9, 22, 19, 10, 9} // fill-array
                    r9 = 1
                    float r14 = android.media.AudioTrack.getMaxVolume()
                    r0 = 0
                    int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                    int r10 = 222 - r14
                    java.lang.Object[] r14 = new java.lang.Object[r5]
                    r11 = r14
                    a(r6, r7, r8, r9, r10, r11)
                    r14 = r14[r4]
                    java.lang.String r14 = (java.lang.String) r14
                    java.lang.String r14 = r14.intern()
                    r13.<init>(r14)
                    throw r13
                L74:
                    kotlin.ResultKt.onNavigationEvent(r14)
                    o.setRipple r14 = r12.onExtraCallbackWithResult
                    r3 = r13
                    kotlin.Pair r3 = (kotlin.Pair) r3
                    r6 = 0
                    if (r3 == 0) goto L86
                    java.lang.Object r3 = r3.getSecond()
                    com.google.gson.JsonElement r3 = (com.google.gson.JsonElement) r3
                    goto L90
                L86:
                    int r3 = o.getNumeric.onNavigationEvent.AnonymousClass4.IAuthTabCallback
                    int r3 = r3 + 19
                    int r7 = r3 % 128
                    o.getNumeric.onNavigationEvent.AnonymousClass4.onExtraCallback = r7
                    int r3 = r3 % r0
                    r3 = r6
                L90:
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r13)
                    r1.L$0 = r7
                    java.lang.Object r7 = o.access15400.onNavigationEvent(r1)
                    r1.L$1 = r7
                    java.lang.Object r13 = o.access15400.onNavigationEvent(r13)
                    r1.L$2 = r13
                    java.lang.Object r13 = o.access15400.onNavigationEvent(r14)
                    r1.L$3 = r13
                    r1.I$0 = r4
                    r1.label = r5
                    java.lang.Object r13 = r14.emit(r3, r1)
                    if (r13 != r2) goto Lcc
                    int r13 = o.getNumeric.onNavigationEvent.AnonymousClass4.onExtraCallback
                    int r14 = r13 + 59
                    int r1 = r14 % 128
                    o.getNumeric.onNavigationEvent.AnonymousClass4.IAuthTabCallback = r1
                    int r14 = r14 % r0
                    if (r14 == 0) goto Lc8
                    int r13 = r13 + 59
                    int r14 = r13 % 128
                    o.getNumeric.onNavigationEvent.AnonymousClass4.IAuthTabCallback = r14
                    int r13 = r13 % r0
                    if (r13 == 0) goto Lc7
                    return r2
                Lc7:
                    throw r6
                Lc8:
                    r6.hashCode()
                    throw r6
                Lcc:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getNumeric.onNavigationEvent.AnonymousClass4.emit(java.lang.Object, o.access13800):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0179  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 388
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getNumeric.onNavigationEvent.AnonymousClass4.a(int, int, char[], boolean, int, java.lang.Object[]):void");
            }
        }

        public onNavigationEvent(IAnimation iAnimation) {
            this.onNavigationEvent = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass4(setripple), access13800Var);
            return objCollect == access14300.onWarmupCompleted() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Function1<String, IAnimation<JsonElement>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 73;
        extraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Function1<String, IAnimation<JsonElement>> function1 = IAuthTabCallbackStub;
        int i4 = i2 + 113;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return function1;
        }
        obj.hashCode();
        throw null;
    }

    private static final IAnimation onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new IAuthTabCallbackDefault(new asBinder(onExtraCallbackWithResult, str)));
        int i2 = extraCallbackWithResult + 45;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return iAnimationOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onWarmupCompleted((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) webViewContentOwner, str, IAuthTabCallback.WEB, (Function1<? super onExtraCallbackWithResult, Unit>) new WebBroadcast$.ExternalSyntheticLambda10(webViewContentOwner, str2));
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        Object[] objArr = {startrunning, onextracallbackwithresult.onExtraCallback()};
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Object[] objArr2 = {startrunning, onextracallbackwithresult.IAuthTabCallback()};
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 99;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(WebViewContentOwner webViewContentOwner, String str, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            webViewContentOwner.getWebView();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            Object[] objArr = {webView, str, new WebBroadcast$.ExternalSyntheticLambda3(onextracallbackwithresult)};
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            setTopGuideFontSize.IAuthTabCallback(objArr, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1755743383, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, -1755743382);
            int i3 = extraCallback + 107;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getNumeric getnumeric = (getNumeric) objArr[0];
        WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        getnumeric.onExtraCallbackWithResult((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) webViewContentOwner, str, IAuthTabCallback.WEB);
        int i4 = extraCallbackWithResult + 47;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onWarmupCompleted((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) reactNativeContentOwner, str, IAuthTabCallback.RN, (Function1<? super onExtraCallbackWithResult, Unit>) new WebBroadcast$.ExternalSyntheticLambda0(reactNativeContentOwner, str2));
        int i2 = extraCallbackWithResult + 113;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(ReactNativeContentOwner reactNativeContentOwner, String str, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            reactNativeContentOwner.IAuthTabCallback(str, onextracallbackwithresult.onExtraCallback());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        reactNativeContentOwner.IAuthTabCallback(str, onextracallbackwithresult.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) reactNativeContentOwner, str, IAuthTabCallback.RN);
        int i4 = extraCallbackWithResult + 3;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean IAuthTabCallback(String str, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.areEqual(onextracallbackwithresult.IAuthTabCallback(), str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        boolean zAreEqual = Intrinsics.areEqual(onextracallbackwithresult.IAuthTabCallback(), str);
        int i3 = extraCallbackWithResult + 1;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return zAreEqual;
    }

    private static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = extraCallbackWithResult + 29;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 63;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Object obj;
        String str = (String) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[4];
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNull(onextracallbackwithresult);
            function1.invoke(onextracallbackwithresult);
            obj = Result.constructor-impl(Unit.INSTANCE);
            int i4 = extraCallbackWithResult + 53;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i6 = extraCallbackWithResult + 87;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-114, -126, -115, -115, -121, -116, -119}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-126, -110, -111, -112, -123, -126, -115, -113, -122}, 127 - TextUtils.getTrimmedLength(""), objArr3);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getClass().getSimpleName());
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-120, -115, -108, -109}, ExpandableListView.getPackedPositionType(0L) + 127, objArr4);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), iAuthTabCallback.name())});
            Object[] objArr5 = new Object[1];
            a(null, null, new byte[]{-117, -118, -121, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            b(KeyEvent.keyCodeFromString("") + 590946047, (char) (62379 - Color.green(0)), new char[]{59141, 38590, 58133, 28722, 5275, 23909, 35405, 6156, 4257, 18786, 62480, 4272, 45765, 51270, 3232}, new char[]{65469, 14622, 43811, 19699}, new char[]{36292, 27710, 41449, 16727}, objArr6);
            convertFloatArrayToByteArray.onExtraCallbackWithResult(strIntern, ((String) objArr6[0]).intern(), th2, mapOnWarmupCompleted);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, IAuthTabCallback iAuthTabCallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -126, -115, -115, -121, -116, -119}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -110, -111, -112, -123, -126, -115, -113, -122}, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getClass().getSimpleName());
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-120, -115, -108, -109}, 126 - ExpandableListView.getPackedPositionChild(0L), objArr3);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), iAuthTabCallback.name())});
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-117, -118, -121, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 127 - KeyEvent.keyCodeFromString(""), objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-123, -122, -123, -123, -126, -106, -126, -125, -108, -123, -119, -118, -125, -107, -118, -106, -118, -107, -125}, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
        convertFloatArrayToByteArray.onExtraCallbackWithResult(strIntern, ((String) objArr5[0]).intern(), th, mapOnWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 125;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 53;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 27;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(i4, i4);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 44;
                    int i9 = 1451 - (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1));
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, iIndexOf, i9, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123), 43 - ImageFormat.getBitsPerPixel(i4), 1494 - (ViewConfiguration.getTapTimeout() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf((CharSequence) "", '0') + 51, 22938 - ((byte) KeyEvent.getModifierMetaStateMask()), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 45848), View.getDefaultSize(0, 0) + 29, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (access100 ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback_Parcel ^ 7798559133331975163L))) ^ ((char) (writeTypedObject ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i10 = $10 + 37;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private final void onWarmupCompleted(final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, final String str, final IAuthTabCallback iAuthTabCallback, Function1<? super onExtraCallbackWithResult, Unit> function1) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, iAuthTabCallback);
        Map<onWarmupCompleted, deserializeUriNullableCollection> map = IAuthTabCallbackDefault;
        if (!map.containsKey(onwarmupcompleted)) {
            deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = asBinder.onWarmupCompleted().onExtraCallback(clearTid.onExtraCallback()).onWarmupCompleted(new WebBroadcast$.ExternalSyntheticLambda5(new WebBroadcast$.ExternalSyntheticLambda4(str))).onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new WebBroadcast$.ExternalSyntheticLambda7(new WebBroadcast$.ExternalSyntheticLambda6(str, iAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function1)), new WebBroadcast$.ExternalSyntheticLambda9(new WebBroadcast$.ExternalSyntheticLambda8(str, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, iAuthTabCallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
            map.put(onwarmupcompleted, IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, r8lambdakrhaimf1bm5cgjbilhp45vln_xq));
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: viva.republica.toss.common.web.message.handlers.broadcast.WebBroadcast$addReceiver$2
                public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                }

                public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                }

                public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                }

                public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                }

                public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                }

                public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    getNumeric.IAuthTabCallback(getNumeric.onNavigationEvent, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, iAuthTabCallback);
                }
            });
            int i2 = extraCallbackWithResult + 23;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = extraCallback + 53;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionRemove = IAuthTabCallbackDefault.remove(new onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, iAuthTabCallback));
        if (deserializeurinullablecollectionRemove == null) {
            int i2 = extraCallbackWithResult + 123;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.removeSubscription(deserializeurinullablecollectionRemove);
        int i3 = extraCallbackWithResult + 111;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(getNumeric getnumeric, String str, JsonElement jsonElement, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = extraCallbackWithResult + 75;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            str2 = null;
        }
        getnumeric.onExtraCallback(str, jsonElement, str2);
        int i5 = extraCallbackWithResult + 81;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull JsonElement jsonElement, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        asBinder.onExtraCallbackWithResult(new onExtraCallbackWithResult(str, jsonElement));
        onExtraCallback.onWarmupCompleted(getWrite.IAuthTabCallback(str, jsonElement));
        onExtraCallbackWithResult.onNavigationEvent(getWrite.IAuthTabCallback(str, jsonElement));
        int i2 = extraCallback + 83;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onTransact;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 83;
                $10 = i5 % 128;
                if (i5 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 76 - MotionEvent.axisFromString(""), 20952 - (ViewConfiguration.getTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 78 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 20952 - ((Process.getThreadPriority(0) + 20) >> 6), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4++;
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(access000)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 75 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (getInterfaceDescriptor) {
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 63 - Color.alpha(0), 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallbackStubProxy) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, 12214 - (ViewConfiguration.getScrollBarSize() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Unit onNavigationEvent(ReactNativeContentOwner reactNativeContentOwner, String str, onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallback(291794067, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{reactNativeContentOwner, str, onextracallbackwithresult}, a.3.onWarmupCompleted(), -291794066, iOnWarmupCompleted2);
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return ((Boolean) onExtraCallback(891269213, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{str, onextracallbackwithresult}, a.3.onWarmupCompleted(), -891269213, iOnWarmupCompleted2)).booleanValue();
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onExtraCallback(774633023, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{function1, obj}, a.3.onWarmupCompleted(), -774633020, iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallback(String str, IAuthTabCallback iAuthTabCallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Function1 function1, onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return (Unit) onExtraCallback(-928014804, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{str, iAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function1, onextracallbackwithresult}, a.3.onWarmupCompleted(), 928014806, iOnWarmupCompleted2);
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onExtraCallback(-649089255, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{function1, obj}, a.3.onWarmupCompleted(), 649089260, iOnWarmupCompleted2);
    }

    public final void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onExtraCallback(200251066, iOnWarmupCompleted, a.3.onWarmupCompleted(), new Object[]{this, webViewContentOwner, str}, a.3.onWarmupCompleted(), -200251062, iOnWarmupCompleted2);
    }

    static void onExtraCallback() {
        onTransact = new char[]{32592, 32578, 32589, 32557, 32637, 32632, 32590, 32579, 32588, 32636, 32627, 32583, 32633, 32635, 32624, 32595, 32630, 32639, 32580, 32582, 32626, 32584};
        access000 = -1184333841;
        IAuthTabCallbackStubProxy = true;
        getInterfaceDescriptor = true;
        access100 = 3273463681653925439L;
        IAuthTabCallback_Parcel = -1776194565;
        writeTypedObject = (char) 27643;
    }
}
