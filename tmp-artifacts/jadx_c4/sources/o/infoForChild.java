package o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.JavascriptInterface;
import android.widget.ExpandableListView;
import im.toss.ads_sdk.playable.MraidBridge$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class infoForChild {
    private String IAuthTabCallback;
    private final Function1<String, Boolean> IAuthTabCallbackDefault;
    private final Function1<String, Unit> IAuthTabCallbackStub;
    private String IAuthTabCallbackStubProxy;
    private final Function1<JSONObject, Unit> IAuthTabCallback_Parcel;
    private final Function0<Unit> access000;
    private String access100;
    private final Function0<Unit> asBinder;
    private final Function0<Unit> asInterface;
    private final Function0<Unit> getInterfaceDescriptor;
    private final Function1<String, Unit> onExtraCallback;
    private String onExtraCallbackWithResult;
    private final Activity onNavigationEvent;
    private final Function0<Unit> onTransact;
    private String onWarmupCompleted;
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int ICustomTabsCallback = 1;
    private static char[] writeTypedObject = {50737, 16577, 52172, 21191, 59228, 24993, 60087, 29609, 64686, 17832, 60836, 27466, 57427, 31045, 63047, 20302, 50250, 58425, 25283, 59863, 28865, 60858, 27460, 57412, 31052, 60833, 27481, 57414, 60833, 27461, 57409, 31047, 63047, 20312, 50240};
    private static long extraCallback = 6100386798389127979L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 97 - (i3 * 2);
        int i6 = 3 - (i * 3);
        byte[] bArr = $$a;
        int i7 = i2 * 2;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i5;
            i4 = 0;
            int i10 = i6;
            int i11 = i10;
            i5 = i6 + i9;
            i6 = i11;
            int i12 = i6 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i4++;
            i9 = bArr[i12];
            int i13 = i5;
            i10 = i12;
            i6 = i13;
            int i112 = i10;
            i5 = i6 + i9;
            i6 = i112;
            int i122 = i6 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1222 = i6 + 1;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        infoForChild infoforchild = (infoForChild) objArr[0];
        JSONObject jSONObject = (JSONObject) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(infoforchild, jSONObject, setDetectableSize);
        int i4 = readTypedObject + 89;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(infoForChild infoforchild, JSONObject jSONObject, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(infoforchild, jSONObject, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(infoforchild, jSONObject, setDetectableSize);
        int i3 = ICustomTabsCallback + 27;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, infoForChild infoforchild, JSONObject jSONObject, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{str, infoforchild, jSONObject, setDetectableSize}, 427611168, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -427611165, iOnExtraCallback);
        int i4 = ICustomTabsCallback + 27;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i3);
        int i11 = ~i3;
        int i12 = i11 | i5;
        int i13 = ~(i6 | i12);
        int i14 = i9 | i10 | i13;
        int i15 = i13 | (~(i7 | i11 | i8));
        int i16 = (~i12) | i10;
        int i17 = i5 + i3 + i + ((-573665793) * i2) + ((-1595597844) * i4);
        int i18 = i17 * i17;
        int i19 = ((-1787860089) * i5) + 959184896 + (1033409659 * i3) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i) + (1316749312 * i2) + (833617920 * i4) + (497221632 * i18);
        int i20 = ((i5 * 2143800573) - 1595758) + (i3 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i * 2143800411) + (i2 * 1405922725) + (i4 * (-1943733020)) + (i18 * 1827733504);
        int i21 = i19 + (i20 * i20 * (-911933440));
        return i21 != 1 ? i21 != 2 ? i21 != 3 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public infoForChild(@NotNull Activity activity, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable Function1<? super String, Boolean> function12, @NotNull Function1<? super JSONObject, Unit> function13, @NotNull Function0<Unit> function05, @NotNull Function1<? super String, Unit> function14) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.onNavigationEvent = activity;
        this.IAuthTabCallbackStub = function1;
        this.asInterface = function0;
        this.access000 = function02;
        this.asBinder = function03;
        this.onTransact = function04;
        this.IAuthTabCallbackDefault = function12;
        this.IAuthTabCallback_Parcel = function13;
        this.getInterfaceDescriptor = function05;
        this.onExtraCallback = function14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ infoForChild(Activity activity, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function12, Function1 function13, Function0 function05, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function1 function15;
        Object obj = null;
        if ((i & 8) != 0) {
            int i2 = 2 % 2;
            function06 = null;
        } else {
            function06 = function02;
        }
        if ((i & 16) != 0) {
            int i3 = ICustomTabsCallback + 87;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            function07 = null;
        } else {
            function07 = function03;
        }
        if ((i & 32) != 0) {
            int i5 = readTypedObject + 97;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
            function08 = null;
        } else {
            function08 = function04;
        }
        if ((i & 64) != 0) {
            int i7 = readTypedObject + 51;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            function15 = null;
        } else {
            function15 = function12;
        }
        this(activity, function1, function0, function06, function07, function08, function15, function13, function05, function14);
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        infoForChild infoforchild = (infoForChild) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 33;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        infoforchild.access100 = str;
        int i5 = i2 + 119;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStubProxy = str;
        int i5 = i3 + 99;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = str;
        int i5 = i3 + 43;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:16:0x003d, B:20:0x0051, B:25:0x005e, B:32:0x0072, B:35:0x0094, B:27:0x0064, B:30:0x006c, B:23:0x0058), top: B:48:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void postMessage(@Nullable String str) throws Throwable {
        Object obj;
        String strSubstring;
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
            if (str == null) {
                return;
            }
        } else if (str == null) {
            return;
        }
        if (str.length() != 0) {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(new JSONObject(str));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                try {
                    if (str.length() >= 2) {
                        int i4 = readTypedObject + 105;
                        ICustomTabsCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            if (StringsKt.startsWith$default(str, "\"", false, 2, (Object) null)) {
                                if (!StringsKt.endsWith$default(str, "\"", false, 2, (Object) null)) {
                                    if (!StringsKt.startsWith$default(str, "'", false, 2, (Object) null)) {
                                    }
                                    int i5 = ICustomTabsCallback + 73;
                                    readTypedObject = i5 % 128;
                                    int i6 = i5 % 2;
                                    strSubstring = str;
                                    new JSONObject(strSubstring);
                                }
                                strSubstring = str.substring(1, str.length() - 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                int i7 = readTypedObject + 85;
                                ICustomTabsCallback = i7 % 128;
                                int i8 = i7 % 2;
                                new JSONObject(strSubstring);
                            }
                        } else {
                            if (StringsKt.startsWith$default(str, "\"", true, 2, (Object) null)) {
                                if (!StringsKt.endsWith$default(str, "\"", false, 2, (Object) null)) {
                                }
                                strSubstring = str.substring(1, str.length() - 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                int i72 = readTypedObject + 85;
                                ICustomTabsCallback = i72 % 128;
                                int i82 = i72 % 2;
                                new JSONObject(strSubstring);
                            }
                            if ((!StringsKt.startsWith$default(str, "'", false, 2, (Object) null)) && StringsKt.endsWith$default(str, "'", false, 2, (Object) null)) {
                                strSubstring = str.substring(1, str.length() - 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                int i722 = readTypedObject + 85;
                                ICustomTabsCallback = i722 % 128;
                                int i822 = i722 % 2;
                            } else {
                                int i52 = ICustomTabsCallback + 73;
                                readTypedObject = i52 % 128;
                                int i62 = i52 % 2;
                                strSubstring = str;
                            }
                            new JSONObject(strSubstring);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (kotlin.Result.onExtraCallback(obj)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                int i9 = ICustomTabsCallback + 65;
                readTypedObject = i9 % 128;
                int i10 = i9 % 2;
                jSONObject = null;
            }
            if (jSONObject != null) {
                String str2 = (String) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, jSONObject}, 807825896, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -807825895, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                onExtraCallbackWithResult(str2, onExtraCallbackWithResult(jSONObject, str2));
                return;
            }
            onExtraCallbackWithResult(StringsKt.trim(str).toString(), (JSONObject) null);
        }
    }

    private final String onExtraCallback(JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, (char) (11147 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 4, KeyEvent.keyCodeFromString("") + 6, (char) (View.MeasureSpec.getMode(0) + 2793), objArr2);
        int i2 = readTypedObject + 89;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        for (String str : CollectionsKt.listOf(new String[]{"command", "cmd", strIntern, ((String) objArr2[0]).intern(), "method"})) {
            if (!(!jSONObject.has(str))) {
                int i4 = readTypedObject + 25;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                String strOptString = jSONObject.optString(str);
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                return strOptString;
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        if (!itKeys.hasNext()) {
            return "";
        }
        int i6 = readTypedObject + 55;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            String next = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            return next;
        }
        String next2 = itKeys.next();
        Intrinsics.checkNotNullExpressionValue(next2, "");
        int i7 = 98 / 0;
        return next2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        infoForChild infoforchild = (infoForChild) objArr[0];
        JSONObject jSONObject = (JSONObject) objArr[1];
        int i = 2 % 2;
        String strOnExtraCallback = infoforchild.onExtraCallback(jSONObject);
        if (StringsKt.isBlank(strOnExtraCallback)) {
            String strOptString = jSONObject.optString("event");
            if (!(!StringsKt.isBlank(strOptString))) {
                strOptString = jSONObject.optString("eventName");
                int i2 = readTypedObject + 75;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            return strOptString;
        }
        int i4 = readTypedObject;
        int i5 = i4 + 79;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        int i7 = i4 + 97;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return strOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(writeTypedObject[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.getTrimmedLength("")), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(extraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 44 - View.MeasureSpec.getSize(0), 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 13;
                $10 = i5 % 128;
                int i6 = i5 % 2;
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
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 107;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49123), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, TextUtils.indexOf("", "", 0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final JSONObject onExtraCallbackWithResult(JSONObject jSONObject, String str) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMinimumFlingVelocity() >> 16, 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11146), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iHashCode = str.hashCode();
        if (iHashCode != -1801488983) {
            if (iHashCode != 1611537939) {
                if (iHashCode == 1725037556 && str.equals("end_card")) {
                    String strOnExtraCallback = onExtraCallback(jSONObject, str);
                    jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                    if (jSONObjectOptJSONObject == null) {
                        if (!jSONObjectOptJSONObject.has(strIntern)) {
                            int i4 = ICustomTabsCallback + 27;
                            readTypedObject = i4 % 128;
                            int i5 = i4 % 2;
                            if (!jSONObjectOptJSONObject.has("params")) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(strIntern, strOnExtraCallback);
                                jSONObject2.put("params", jSONObjectOptJSONObject);
                                return jSONObject2;
                            }
                        }
                        return jSONObjectOptJSONObject;
                    }
                    Object[] objArr2 = new Object[1];
                    a(Color.rgb(0, 0, 0) + 16777226, 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) Color.green(0), objArr2);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(((String) objArr2[0]).intern());
                    if (jSONObjectOptJSONObject2 == null) {
                        Object[] objArr3 = new Object[1];
                        a((Process.myPid() >> 22) + 17, 4 - Color.red(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2440), objArr3);
                        jSONObjectOptJSONObject2 = jSONObject.optJSONObject(((String) objArr3[0]).intern());
                        if (jSONObjectOptJSONObject2 == null) {
                            jSONObjectOptJSONObject2 = jSONObject.optJSONObject("args");
                        }
                    }
                    if (jSONObjectOptJSONObject2 != null) {
                        if (jSONObjectOptJSONObject2.has(strIntern) || jSONObjectOptJSONObject2.has("params")) {
                            return jSONObjectOptJSONObject2;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(strIntern, strOnExtraCallback);
                        jSONObject3.put("params", jSONObjectOptJSONObject2);
                        return jSONObject3;
                    }
                }
            } else if (str.equals("customLog")) {
                int i6 = ICustomTabsCallback + 29;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                String strOnExtraCallback2 = onExtraCallback(jSONObject, str);
                jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                }
            }
        } else if (str.equals("customEvent")) {
        }
        Object[] objArr4 = new Object[1];
        a(11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, (char) (ViewConfiguration.getTouchSlop() >> 8), objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2442), objArr5);
        Iterator it = CollectionsKt.listOf(new String[]{"params", strIntern2, ((String) objArr5[0]).intern(), "args"}).iterator();
        while (it.hasNext()) {
            int i8 = ICustomTabsCallback + 89;
            readTypedObject = i8 % 128;
            if (i8 % 2 != 0) {
                jSONObject.has((String) it.next());
                throw null;
            }
            String str2 = (String) it.next();
            if (jSONObject.has(str2) && (jSONObject.opt(str2) instanceof JSONObject)) {
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(str2);
                int i9 = ICustomTabsCallback + 59;
                readTypedObject = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 53 / 0;
                }
                return jSONObjectOptJSONObject3;
            }
        }
        Object[] objArr6 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, TextUtils.lastIndexOf("", '0', 0) + 7, (char) (View.resolveSizeAndState(0, 0, 0) + 2793), objArr6);
        List listListOf = CollectionsKt.listOf(new String[]{"command", "cmd", strIntern, ((String) objArr6[0]).intern(), "method"});
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i11 = ICustomTabsCallback + 107;
            readTypedObject = i11 % 128;
            int i12 = i11 % 2;
            String next = itKeys.next();
            if (!listListOf.contains(next)) {
                try {
                    jSONObject4.put(next, jSONObject.get(next));
                } catch (JSONException unused) {
                }
            }
        }
        if (jSONObject4.length() > 0) {
            return jSONObject4;
        }
        return null;
    }

    private final String onExtraCallback(JSONObject jSONObject, String str) throws Throwable {
        int i = 2 % 2;
        String strOptString = jSONObject.optString("event");
        if (StringsKt.isBlank(strOptString)) {
            strOptString = jSONObject.optString("eventName");
            if (StringsKt.isBlank(strOptString)) {
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getWindowTouchSlop() >> 8, 3 - MotionEvent.axisFromString(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11146), objArr);
                strOptString = jSONObject.optString(((String) objArr[0]).intern());
                if (StringsKt.isBlank(strOptString)) {
                    int i2 = readTypedObject + 73;
                    ICustomTabsCallback = i2 % 128;
                    int i3 = i2 % 2;
                    String strOptString2 = jSONObject.optString("logName");
                    if (!StringsKt.isBlank(strOptString2)) {
                        int i4 = readTypedObject + 111;
                        ICustomTabsCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        str = strOptString2;
                    }
                    strOptString = str;
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        return strOptString;
    }

    private static final Unit onWarmupCompleted(infoForChild infoforchild, JSONObject jSONObject, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "end_card");
        setDetectableSize.onExtraCallback("ad_id", infoforchild.onExtraCallbackWithResult);
        setDetectableSize.onExtraCallback("advertise_space_unit_id", infoforchild.access100);
        setDetectableSize.onExtraCallback("ssp_request_id", infoforchild.IAuthTabCallbackStubProxy);
        setDetectableSize.onExtraCallback("ad_content_type", infoforchild.onWarmupCompleted);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    int i2 = readTypedObject + 107;
                    ICustomTabsCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.checkNotNull(next);
                        setDetectableSize.onExtraCallback(next, objOpt);
                        throw null;
                    }
                    Intrinsics.checkNotNull(next);
                    setDetectableSize.onExtraCallback(next, objOpt);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 13;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(String str, JSONObject jSONObject) throws Throwable {
        String strIntern;
        Function0<Unit> function0;
        String strOptString;
        String strOptString2;
        String string;
        String string2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        switch (iHashCode) {
            case -1801488983:
                if (str.equals("customEvent")) {
                    if (jSONObject != null) {
                        int i4 = ICustomTabsCallback + 17;
                        readTypedObject = i4 % 128;
                        int i5 = i4 % 2;
                        Object[] objArr2 = new Object[1];
                        a(ViewConfiguration.getScrollDefaultDelay() >> 16, 4 - Drawable.resolveOpacity(0, 0), (char) (11147 - View.resolveSizeAndState(0, 0, 0)), objArr2);
                        strIntern = jSONObject.optString(((String) objArr2[0]).intern());
                    } else {
                        int i6 = ICustomTabsCallback + 15;
                        readTypedObject = i6 % 128;
                        int i7 = i6 % 2;
                        strIntern = null;
                    }
                    if (strIntern == null) {
                        strIntern = "";
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("params") : null;
                    if (Intrinsics.areEqual(strIntern, "end_card")) {
                        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, null, null, new MraidBridge$.ExternalSyntheticLambda0(this, jSONObjectOptJSONObject), 14, null);
                        Function1<String, Unit> function1 = this.IAuthTabCallbackStub;
                        if (jSONObjectOptJSONObject != null) {
                            String string3 = jSONObjectOptJSONObject.toString();
                            if (string3 == null) {
                                int i8 = ICustomTabsCallback + 83;
                                readTypedObject = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i9 = 67 / 0;
                                }
                            } else {
                                strIntern2 = string3;
                            }
                        }
                        function1.invoke("customEvent received - name: end_card, params: " + strIntern2);
                        Function0<Unit> function02 = this.asBinder;
                        if (function02 != null) {
                            function02.invoke();
                            return;
                        }
                        return;
                    }
                    Function1<String, Unit> function12 = this.IAuthTabCallbackStub;
                    if (StringsKt.isBlank(strIntern)) {
                        int i10 = ICustomTabsCallback + 69;
                        readTypedObject = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr3 = new Object[1];
                        a(27 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.myTid() >> 22) + 7, (char) View.combineMeasuredStates(0, 0), objArr3);
                        strIntern = ((String) objArr3[0]).intern();
                    }
                    if (jSONObjectOptJSONObject != null) {
                        String string4 = jSONObjectOptJSONObject.toString();
                        if (string4 == null) {
                            int i12 = ICustomTabsCallback + 47;
                            readTypedObject = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            strIntern2 = string4;
                        }
                    }
                    function12.invoke("customEvent received - name: " + ((Object) strIntern) + ", params: " + strIntern2);
                    return;
                }
                break;
            case -1578593149:
                if (!(!str.equals("touchstart"))) {
                    int i14 = ICustomTabsCallback + 63;
                    readTypedObject = i14 % 128;
                    if (i14 % 2 != 0) {
                        this.IAuthTabCallbackStub.invoke("mraid.touchstart");
                        function0 = this.access000;
                        int i15 = 21 / 0;
                        if (function0 == null) {
                            return;
                        }
                    } else {
                        this.IAuthTabCallbackStub.invoke("mraid.touchstart");
                        function0 = this.access000;
                        if (function0 == null) {
                            return;
                        }
                    }
                    function0.invoke();
                    return;
                }
                break;
            case -934437708:
                if (str.equals("resize")) {
                    this.IAuthTabCallbackStub.invoke("mraid.resize");
                    return;
                }
                break;
            case -494845771:
                if (str.equals("rendered")) {
                    this.IAuthTabCallbackStub.invoke("mraid.rendered (from creative)");
                    this.IAuthTabCallback_Parcel.invoke(jSONObject);
                    return;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    if (jSONObject != null) {
                        Object[] objArr4 = new Object[1];
                        a(25 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - Color.red(0), (char) TextUtils.indexOf("", "", 0, 0), objArr4);
                        strOptString = jSONObject.optString(((String) objArr4[0]).intern());
                    } else {
                        strOptString = null;
                    }
                    String str2 = strOptString != null ? strOptString : "";
                    String str3 = this.IAuthTabCallback;
                    String str4 = str3 == null || StringsKt.isBlank(str3) ? null : str3;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    if (StringsKt.isBlank(str4)) {
                        this.IAuthTabCallbackStub.invoke("mraid.open invoked but no landing url available");
                    } else {
                        this.IAuthTabCallbackStub.invoke("mraid.open invoked -> launching landing url");
                        Function1<String, Boolean> function13 = this.IAuthTabCallbackDefault;
                        if (function13 == null || !((Boolean) function13.invoke(str4)).booleanValue()) {
                            try {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
                                intent.addFlags(268435456);
                                this.onNavigationEvent.startActivity(intent);
                                getStrokeWidth.onExtraCallbackWithResult(getStrokeWidth.onExtraCallback, this.onNavigationEvent, str4, "ads_sdk_mraid", null, 4, null);
                            } catch (Throwable th) {
                                this.IAuthTabCallbackStub.invoke("mraid.open launch failed: " + th.getMessage());
                            }
                        }
                    }
                    Function0<Unit> function03 = this.onTransact;
                    if (function03 != null) {
                        function03.invoke();
                        return;
                    }
                    return;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    this.IAuthTabCallbackStub.invoke("mraid.close");
                    this.asInterface.invoke();
                    return;
                }
                break;
            case 108386723:
                if (str.equals("ready")) {
                    this.IAuthTabCallbackStub.invoke("mraid.ready (from creative)");
                    this.getInterfaceDescriptor.invoke();
                    return;
                }
                break;
            case 1611537939:
                if (str.equals("customLog")) {
                    if (jSONObject != null) {
                        int i16 = ICustomTabsCallback + 125;
                        readTypedObject = i16 % 128;
                        int i17 = i16 % 2;
                        Object[] objArr5 = new Object[1];
                        a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, (char) (11146 - MotionEvent.axisFromString("")), objArr5);
                        strOptString2 = jSONObject.optString(((String) objArr5[0]).intern());
                        if (strOptString2 == null) {
                            strOptString2 = "unknown_log";
                        }
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject != null ? jSONObject.optJSONObject("params") : null;
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, null, null, new MraidBridge$.ExternalSyntheticLambda2(strOptString2, this, jSONObjectOptJSONObject2), 14, null);
                    Function1<String, Unit> function14 = this.IAuthTabCallbackStub;
                    if (jSONObjectOptJSONObject2 != null && (string = jSONObjectOptJSONObject2.toString()) != null) {
                        strIntern2 = string;
                    }
                    function14.invoke("customLog received - name: " + strOptString2 + ", params: " + strIntern2);
                    return;
                }
                break;
            case 1725037556:
                if (str.equals("end_card")) {
                    int i18 = readTypedObject + 41;
                    ICustomTabsCallback = i18 % 128;
                    int i19 = i18 % 2;
                    JSONObject jSONObjectOptJSONObject3 = jSONObject != null ? jSONObject.optJSONObject("params") : null;
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2286196L, false, null, null, new MraidBridge$.ExternalSyntheticLambda1(this, jSONObjectOptJSONObject3), 14, null);
                    Function1<String, Unit> function15 = this.IAuthTabCallbackStub;
                    if (jSONObjectOptJSONObject3 != null && (string2 = jSONObjectOptJSONObject3.toString()) != null) {
                        strIntern2 = string2;
                    }
                    function15.invoke("end_card received - params: " + strIntern2);
                    Function0<Unit> function04 = this.asBinder;
                    if (function04 != null) {
                        function04.invoke();
                        return;
                    }
                    return;
                }
                break;
            default:
                int i20 = ICustomTabsCallback + 113;
                readTypedObject = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 5 / 4;
                    break;
                }
                break;
        }
        if (StringsKt.isBlank(str)) {
            return;
        }
        this.IAuthTabCallbackStub.invoke("Unknown command: " + str);
    }

    private static final Unit onNavigationEvent(infoForChild infoforchild, JSONObject jSONObject, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "end_card");
        setDetectableSize.onExtraCallback("ad_id", infoforchild.onExtraCallbackWithResult);
        setDetectableSize.onExtraCallback("advertise_space_unit_id", infoforchild.access100);
        setDetectableSize.onExtraCallback("ssp_request_id", infoforchild.IAuthTabCallbackStubProxy);
        setDetectableSize.onExtraCallback("ad_content_type", infoforchild.onWarmupCompleted);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                int i4 = ICustomTabsCallback + 119;
                readTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    jSONObject.opt(itKeys.next());
                    throw null;
                }
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    Intrinsics.checkNotNull(next);
                    setDetectableSize.onExtraCallback(next, objOpt);
                    int i5 = ICustomTabsCallback + 59;
                    readTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        infoForChild infoforchild = (infoForChild) objArr[1];
        JSONObject jSONObject = (JSONObject) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", str);
        setDetectableSize.onExtraCallback("ad_id", infoforchild.onExtraCallbackWithResult);
        setDetectableSize.onExtraCallback("advertise_space_unit_id", infoforchild.access100);
        setDetectableSize.onExtraCallback("ssp_request_id", infoforchild.IAuthTabCallbackStubProxy);
        setDetectableSize.onExtraCallback("ad_content_type", infoforchild.onWarmupCompleted);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                int i2 = readTypedObject + 43;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    int i4 = readTypedObject + 73;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNull(next);
                    setDetectableSize.onExtraCallback(next, objOpt);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = readTypedObject + 95;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.invoke("(function() {\n    if (window.mraid && typeof window.mraid.removeEventListener === 'function') {\n        const events = ['ready', 'stateChange', 'viewableChange', 'sizeChange', 'audioVolumeChange', 'error'];\n        events.forEach(function(event) {\n            try { window.mraid.removeEventListener(event); } catch(e) {}\n        });\n    }\n})();");
            throw null;
        }
        this.onExtraCallback.invoke("(function() {\n    if (window.mraid && typeof window.mraid.removeEventListener === 'function') {\n        const events = ['ready', 'stateChange', 'viewableChange', 'sizeChange', 'audioVolumeChange', 'error'];\n        events.forEach(function(event) {\n            try { window.mraid.removeEventListener(event); } catch(e) {}\n        });\n    }\n})();");
        int i3 = ICustomTabsCallback + 103;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull JSONObject jSONObject3, @NotNull JSONObject jSONObject4, @NotNull JSONObject jSONObject5) throws JSONException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(jSONObject2, "");
        Intrinsics.checkNotNullParameter(jSONObject3, "");
        Intrinsics.checkNotNullParameter(jSONObject4, "");
        Intrinsics.checkNotNullParameter(jSONObject5, "");
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject6.put("placementType", str);
            jSONObject6.put("screenSize", jSONObject);
            jSONObject6.put("maxSize", jSONObject2);
            jSONObject6.put("defaultPosition", jSONObject3);
            jSONObject6.put("currentPosition", jSONObject4);
            jSONObject6.put("viewable", true);
            jSONObject6.put("supports", jSONObject5);
        } catch (Exception e) {
            this.IAuthTabCallbackStub.invoke("pushInitialState build payload error: " + e.getMessage());
        }
        this.onExtraCallback.invoke("window.mraid && typeof mraid._nativeInvoke === 'function' && mraid._nativeInvoke('ready', " + jSONObject6 + ");");
        this.getInterfaceDescriptor.invoke();
        int i2 = ICustomTabsCallback + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) throws JSONException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", str);
        } catch (Exception unused) {
        }
        this.onExtraCallback.invoke("window.mraid && typeof mraid._nativeInvoke === 'function' && mraid._nativeInvoke('stateChange', " + jSONObject + ");");
        int i2 = ICustomTabsCallback + 121;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    public final void onExtraCallbackWithResult(boolean z) throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("viewable", z);
            int i2 = readTypedObject + 49;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 2;
            }
        } catch (Exception unused) {
        }
        this.onExtraCallback.invoke("window.mraid && typeof mraid._nativeInvoke === 'function' && mraid._nativeInvoke('viewableChange', " + jSONObject + ");");
    }

    public final void onWarmupCompleted(@Nullable Integer num) throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (num != null) {
                jSONObject.put("volumePercentage", num.intValue());
            } else {
                int i2 = readTypedObject + 45;
                ICustomTabsCallback = i2 % 128;
                jSONObject.put("volumePercentage", i2 % 2 == 0 ? 1 : 0);
            }
        } catch (Exception unused) {
        }
        this.onExtraCallback.invoke("window.mraid && typeof mraid._nativeInvoke === 'function' && mraid._nativeInvoke('audioVolumeChange', " + jSONObject + ");");
        int i3 = ICustomTabsCallback + 21;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(int i, int i2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3) throws JSONException {
        int i3 = 2 % 2;
        JSONObject jSONObject4 = new JSONObject();
        Object obj = null;
        try {
            jSONObject4.put("width", i);
            jSONObject4.put("height", i2);
            if (jSONObject != null) {
                int i4 = readTypedObject + 29;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                jSONObject4.put("maxSize", jSONObject);
            }
            if (jSONObject2 != null) {
                int i6 = readTypedObject + 5;
                ICustomTabsCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    jSONObject4.put("currentPosition", jSONObject2);
                    throw null;
                }
                jSONObject4.put("currentPosition", jSONObject2);
            }
            if (jSONObject3 != null) {
                int i7 = ICustomTabsCallback + 77;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                jSONObject4.put("defaultPosition", jSONObject3);
            }
        } catch (Exception unused) {
        }
        this.onExtraCallback.invoke("window.mraid && typeof mraid._nativeInvoke === 'function' && mraid._nativeInvoke('sizeChange', " + jSONObject4 + ");");
        int i9 = ICustomTabsCallback + 87;
        readTypedObject = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(infoForChild infoforchild, JSONObject jSONObject, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{infoforchild, jSONObject, setDetectableSize}, 1529662212, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1529662212, iOnExtraCallback);
    }

    private static final Unit onWarmupCompleted(String str, infoForChild infoforchild, JSONObject jSONObject, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{str, infoforchild, jSONObject, setDetectableSize}, 427611168, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -427611165, iOnExtraCallback);
    }

    private final String IAuthTabCallback(JSONObject jSONObject) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (String) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, jSONObject}, 807825896, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -807825895, iOnExtraCallback);
    }

    public final void IAuthTabCallbackDefault(@Nullable String str) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, str}, 786479970, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -786479968, iOnExtraCallback);
    }
}
