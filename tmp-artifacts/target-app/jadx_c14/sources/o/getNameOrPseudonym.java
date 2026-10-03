package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.extensions.RxPermissionsKt;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.genSignatureValueWithDigest;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.cascraping.FetchCertificatesMessageHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNameOrPseudonym extends getSemanticsIdentifier {
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int newSession = 0;
    private static int newSessionWithExtras = 1;
    private static long extraCommand = 7798559133331975163L;
    private static int postMessage = 167759592;
    private static char prefetch = 27643;
    private static long newAuthTabSession = 1164322740394665664L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = o.getNameOrPseudonym.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 + 109
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNameOrPseudonym.$$c(byte, int, int):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(getNameOrPseudonym getnameorpseudonym, boolean z, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, WebViewContentOwner webViewContentOwner, boolean z2) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 7;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getnameorpseudonym, z, settopguidebackgroundcolor, str, webViewContentOwner, z2);
        int i4 = newSessionWithExtras + 87;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i11 = ~i;
        int i12 = (~(i11 | i8 | i6)) | (~(i7 | i11 | i5));
        int i13 = i6 + i5 + i4 + ((-195996979) * i3) + ((-904719387) * i2);
        int i14 = i13 * i13;
        int i15 = (i6 * 1886715248) + 940376064 + (1886715248 * i5) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i4) + ((-1389494272) * i3) + (1623064576 * i2) + (1510801408 * i14);
        int i16 = (i6 * 1590984816) + 1398186415 + (i5 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i4 * 1590985553) + (i3 * (-1025631779)) + (i2 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Boolean bool) {
        int i = 2 % 2;
        int i2 = newSession + 87;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, bool);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 21;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(settopguidebackgroundcolor, th);
        int i4 = newSessionWithExtras + 43;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ JsonArray onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        int i2 = newSession + 17;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        JsonArray jsonArray = (JsonArray) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 2075194570, -2075194570, new Object[]{list});
        int i4 = newSession + 45;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return jsonArray;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getNameOrPseudonym getnameorpseudonym = (getNameOrPseudonym) objArr[0];
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[1];
        String str = (String) objArr[2];
        JsonArray jsonArray = (JsonArray) objArr[3];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 99;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            return (Unit) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, -851254655, 851254656, new Object[]{getnameorpseudonym, settopguidebackgroundcolor, str, jsonArray});
        }
        Object[] objArr2 = {getnameorpseudonym, settopguidebackgroundcolor, str, jsonArray};
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted5 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 97;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = newSessionWithExtras + 19;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ JsonArray onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 43;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        JsonArray jsonArrayOnExtraCallback = onExtraCallback(function1, obj);
        int i3 = newSession + 91;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        return jsonArrayOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = newSession + 93;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 1771332358, -1771332356, new Object[]{function1, th});
        int i4 = newSessionWithExtras + 73;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 85;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = newSessionWithExtras + 39;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        BaseActivity baseActivity;
        String strOnTransact;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity instanceof BaseActivity) {
            int i2 = newSession + 111;
            newSessionWithExtras = i2 % 128;
            int i3 = i2 % 2;
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null || (strOnTransact = settext.onTransact()) == null) {
            return;
        }
        Object[] objArr = new Object[1];
        c(new char[]{63857, 13920, 63768, 27615, 18336, 56571, 64630, 50686, 36396, 58105, 30014, 19470, 6013, 31269, 60988, 56158, 40085, 62805, 26343, 41569, 9716, 3202, 57241, 10941, 43757, 34745, 18508}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr[0]).intern(), true})).booleanValue();
        if (getBagAttributes.onExtraCallback.onNavigationEvent()) {
            onWarmupCompleted(zBooleanValue, settopguidebackgroundcolor, strOnTransact, webViewContentOwner);
            return;
        }
        onNavigationEvent(baseActivity, (Function1<? super Boolean, Unit>) new FetchCertificatesMessageHandler$.ExternalSyntheticLambda0(this, zBooleanValue, settopguidebackgroundcolor, strOnTransact, webViewContentOwner));
        int i4 = newSessionWithExtras + 67;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(getNameOrPseudonym getnameorpseudonym, boolean z, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, WebViewContentOwner webViewContentOwner, boolean z2) throws Throwable {
        int i = 2 % 2;
        if (z2) {
            int i2 = newSession + 75;
            newSessionWithExtras = i2 % 128;
            if (i2 % 2 == 0) {
                getnameorpseudonym.onWarmupCompleted(z, settopguidebackgroundcolor, str, webViewContentOwner);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getnameorpseudonym.onWarmupCompleted(z, settopguidebackgroundcolor, str, webViewContentOwner);
        } else {
            Object[] objArr = new Object[1];
            d(new char[]{1416, 39964, 63841, 5474, 57594, 8996, 43646, 6362, 50384, 37663, 15680, 33216, 32731, 37652, 9414, 9736, 43403}, AndroidCharacter.getMirror('0') + 37889, new char[]{0, 0, 0, 0}, (char) (35006 - MotionEvent.axisFromString("")), new char[]{12627, 39828, 48990, 40328}, objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            int i3 = newSessionWithExtras + 13;
            newSession = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static final JsonArray onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 25;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JsonArray jsonArray = (JsonArray) function1.invoke(obj);
        int i4 = newSessionWithExtras + 41;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonArray;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(newAuthTabSession ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 23;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(newAuthTabSession)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45813), TextUtils.indexOf((CharSequence) "", '0', 0) + 85, 21234 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 19, ((Process.getThreadPriority(0) + 20) >> 6) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 45;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        List<RSASSAPSSparams> list = (List) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        JsonArray jsonArray = new JsonArray();
        for (RSASSAPSSparams rSASSAPSSparams : list) {
            JsonObject jsonObject = new JsonObject();
            Object[] objArr2 = new Object[1];
            d(new char[]{8441, 8744, 64113, 5202, 35332, 17527}, Color.blue(0), new char[]{0, 0, 0, 0}, (char) (46008 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), new char[]{44371, 1693, 47250, 40371}, objArr2);
            jsonObject.addProperty(((String) objArr2[0]).intern(), rSASSAPSSparams.IAuthTabCallback());
            Object[] objArr3 = new Object[1];
            d(new char[]{17559, 21038, 5357, 2597}, ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{0, 0, 0, 0}, (char) (53539 - ((Process.getThreadPriority(0) + 20) >> 6)), new char[]{63046, 48921, 9113, 54737}, objArr3);
            jsonObject.addProperty(((String) objArr3[0]).intern(), rSASSAPSSparams.onWarmupCompleted());
            Object[] objArr4 = new Object[1];
            c(new char[]{24561, 42754, 24472, 64189, 51300, 58304, 29583, 64209, 10404, 29580}, KeyEvent.normalizeMetaState(0), objArr4);
            jsonObject.addProperty(((String) objArr4[0]).intern(), rSASSAPSSparams.asBinder());
            long time = 0;
            Object[] objArr5 = new Object[1];
            c(new char[]{1464, 55546, 1494, 34135, 20631, 21948, 60258, 19645}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
            jsonObject.addProperty(((String) objArr5[0]).intern(), rSASSAPSSparams.IAuthTabCallbackStub());
            Date dateOnExtraCallback = RSASSAPSSparams.onExtraCallback(rSASSAPSSparams, null, 1, null);
            if (dateOnExtraCallback != null) {
                int i2 = newSession + 1;
                newSessionWithExtras = i2 % 128;
                if (i2 % 2 == 0) {
                    time = dateOnExtraCallback.getTime();
                    int i3 = 23 / 0;
                } else {
                    time = dateOnExtraCallback.getTime();
                }
            } else {
                int i4 = newSessionWithExtras + 23;
                newSession = i4 % 128;
                int i5 = i4 % 2;
            }
            Object[] objArr6 = new Object[1];
            c(new char[]{37469, 30457, 37432, 11085, 8424, 2765, 39680, 5056, 58655, 41596, 4708, 39480, 31817, 15024}, ViewConfiguration.getWindowTouchSlop() >> 8, objArr6);
            jsonObject.addProperty(((String) objArr6[0]).intern(), Long.valueOf(time / 1000));
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 37;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = newSessionWithExtras + 115;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 83;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = newSession + 13;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        String str;
        int i;
        Object obj;
        getNameOrPseudonym getnameorpseudonym = (getNameOrPseudonym) objArr[0];
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[1];
        String str2 = (String) objArr[2];
        JsonArray jsonArray = (JsonArray) objArr[3];
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 111;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            str = null;
            i = 61;
            obj = null;
        } else {
            str = null;
            i = 8;
            obj = null;
        }
        getSemanticsIdentifier.onExtraCallback(getnameorpseudonym, settopguidebackgroundcolor, str2, jsonArray, str, i, obj);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 57;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        c(new char[]{38086, 29969, 38037, 10430, 30186, 33243, 52736, 39134, 58246, 41348, 18252, 4392, 31467, 14680, 56417, 34412, 61751, 46634, 21671, 65383, 18535, 20467, 60886, 30611, 51027, 50399}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr[0]).intern(), th.getMessage(), th, (Map) null, 8, (Object) null);
        String message = th.getMessage();
        if (message == null) {
            int i4 = newSessionWithExtras + 91;
            newSession = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            message = "";
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, message, (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 1;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void onWarmupCompleted(boolean z, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, WebViewContentOwner webViewContentOwner) {
        int i = 2 % 2;
        Object obj = null;
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = genSignatureValueWithDigest.onExtraCallbackWithResult.onExtraCallbackWithResult(genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted, z, null, 2, null).onWarmupCompleted(new FetchCertificatesMessageHandler$.ExternalSyntheticLambda4(new FetchCertificatesMessageHandler$.ExternalSyntheticLambda3())).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new FetchCertificatesMessageHandler$.ExternalSyntheticLambda6(new FetchCertificatesMessageHandler$.ExternalSyntheticLambda5(this, settopguidebackgroundcolor, str)), new FetchCertificatesMessageHandler$.ExternalSyntheticLambda8(new FetchCertificatesMessageHandler$.ExternalSyntheticLambda7(settopguidebackgroundcolor)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, webViewContentOwner);
        int i2 = newSession + 51;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, Boolean bool) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 121;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(bool);
        function1.invoke(bool);
        Unit unit = Unit.INSTANCE;
        int i4 = newSessionWithExtras + 71;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 35;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        function1.invoke(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = newSessionWithExtras + 105;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onNavigationEvent(BaseActivity baseActivity, Function1<? super Boolean, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 73;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        c(new char[]{33373, 51151, 33340, 39533, 50026, 34335, 30870, 40713, 62722, 4954, 61894, 5797, 27725, 35718, 27360, 33206, 59300, 1248, 57905, 63618, 24306, 64813, 23324, 28780, 53759, 30266, 52406, 60174, 18722, 61286, 17802, 25295, 49224, 26497, 16076, 56810, 15249, 53468, 46625, 21679, 45730, 18913, 12131, 52300, 9720}, KeyEvent.normalizeMetaState(0), objArr);
        if (ContextCompat.checkSelfPermission(baseActivity, ((String) objArr[0]).intern()) == 0) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        RxPermissions rxPermissions = new RxPermissions(baseActivity);
        Object[] objArr2 = new Object[1];
        c(new char[]{33373, 51151, 33340, 39533, 50026, 34335, 30870, 40713, 62722, 4954, 61894, 5797, 27725, 35718, 27360, 33206, 59300, 1248, 57905, 63618, 24306, 64813, 23324, 28780, 53759, 30266, 52406, 60174, 18722, 61286, 17802, 25295, 49224, 26497, 16076, 56810, 15249, 53468, 46625, 21679, 45730, 18913, 12131, 52300, 9720}, TextUtils.getCapsMode("", 0, 0), objArr2);
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(RxPermissionsKt.onExtraCallbackWithResult(rxPermissions, baseActivity, new String[]{((String) objArr2[0]).intern()}), new FetchCertificatesMessageHandler$.ExternalSyntheticLambda1(function1), new FetchCertificatesMessageHandler$.ExternalSyntheticLambda2(function1)), baseActivity);
        int i4 = newSession + 97;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void d(char[] cArr, int i, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 49;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.getOffsetBefore("", 0) + 43, TextUtils.getOffsetBefore("", 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 1493 - TextUtils.indexOf((CharSequence) "", '0', 0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Gravity.getAbsoluteGravity(0, 0)), 50 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 22987 - AndroidCharacter.getMirror('0'), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - Process.getGidForName("")), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, 12577 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (postMessage ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (extraCommand ^ 7798559133331975163L))) ^ ((char) (prefetch ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 117;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Unit onExtraCallback(getNameOrPseudonym getnameorpseudonym, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, JsonArray jsonArray) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, -1240108212, 1240108215, new Object[]{getnameorpseudonym, settopguidebackgroundcolor, str, jsonArray});
    }

    private static final JsonArray IAuthTabCallback(List list) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (JsonArray) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 2075194570, -2075194570, new Object[]{list});
    }

    private static final Unit onWarmupCompleted(getNameOrPseudonym getnameorpseudonym, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, JsonArray jsonArray) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, -851254655, 851254656, new Object[]{getnameorpseudonym, settopguidebackgroundcolor, str, jsonArray});
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, Throwable th) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 1771332358, -1771332356, new Object[]{function1, th});
    }
}
