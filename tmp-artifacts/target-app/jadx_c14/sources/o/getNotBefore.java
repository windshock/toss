package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.verify.response.AutoVerifyAvailableBankAccountResp;
import im.toss.features.verify.response.AutoVerifyPossibleBankAccount;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.SessionTrackera;
import o.onOutOfMemory;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.GetOtpAvailableAccountsHandler$;
import viva.republica.toss.common.web.message.handlers.GetOtpAvailableAccountsHandler$handleAffiliateTerms$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNotBefore implements ALCFaceResult {
    private static short[] onExtraCallback;
    private static final byte[] $$a = {78, -86, Byte.MIN_VALUE, Byte.MIN_VALUE};
    private static final int $$b = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = -1304647535;
    private static int IAuthTabCallback = -1538795478;
    private static int onNavigationEvent = -595942779;
    private static byte[] onWarmupCompleted = {-41, 32, -48, -103, 122, -35, -98, 123, 43, -60, 38, -47, 40, -37, -100, 107, -101, -46, 49, -106, -43, 35, 113, -113, -127, 76, -108, 107, -98, -110, 111, 57, -57, 52, 57, -53, 53, 39, -39, 54, -50, -57, 48, 57, -58, -90, 89, -86, 82, 95, -73, 83, 124, 88, -89, -82, -84, 82, 86, 24, -24, 26, 10, -27, -31, 30, 16, -11, -20, 29, -32, 15, -23, 26, -29, 28, -29, -23, -27, -25, 7, -12, 26, -29, 16, -10, 27, 31, -26, 24, 18, -24, 10, 18, -24, -24, 23, 27, 19, -50, -26, -28, 26, -27, 55, -2, 21, -28, 8, 8, 8, 8, 8, 8, 8};
    private static long IAuthTabCallbackStub = -6885766023764069224L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 115
            byte[] r0 = o.getNotBefore.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNotBefore.$$c(int, short, short):java.lang.String");
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(str, str2);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = asBinder + 21;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~(i2 | i);
        int i8 = ~i2;
        int i9 = ~i;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i3));
        int i12 = i9 | i2;
        int i13 = (~i10) | i3;
        int i14 = i3 + i2 + i4 + ((-1587644119) * i5) + (1302866265 * i6);
        int i15 = i14 * i14;
        int i16 = (i3 * (-1579585154)) + 1163788288 + ((-1579585154) * i2) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i4) + (1500774400 * i5) + ((-1456209920) * i6) + ((-2144468992) * i15);
        int i17 = ((i3 * (-855313886)) - 1253577507) + (i2 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i4 * (-855313873)) + (i5 * (-1467678585)) + (i6 * 593082711) + (i15 * 74579968);
        if (i16 + (i17 * i17 * (-1668153344)) == 1) {
            return onExtraCallback(objArr);
        }
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i18 = 2 % 2;
        int i19 = asInterface + 99;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Object[] objArr2 = new Object[1];
        a((short) KeyEvent.keyCodeFromString(""), (byte) ((-88) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-377188453) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-2017294904) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) - 27, objArr2);
        ALCFaceBox.onExtraCallbackWithResult(settopguidebackgroundcolor, th, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i21 = asBinder + 115;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, List list, AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settopguidebackgroundcolor, list, autoVerifyAvailableBankAccountResp);
        int i4 = asBinder + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1351055643, new Object[]{settopguidebackgroundcolor, th}, -1351055643, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i4 = asBinder + 117;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final /* synthetic */ void onWarmupCompleted(getNotBefore getnotbefore, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse, JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getnotbefore.onExtraCallbackWithResult(webViewContentOwner, settopguidebackgroundcolor, r8lambda6v0yvgpvgcqzeji1gnetqsiyse, jsonObject);
        int i4 = asBinder + 11;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asBinder + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asInterface + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 23 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = asBinder + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = asInterface + 103;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asInterface + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new GetOtpAvailableAccountsHandler$.ExternalSyntheticLambda2());
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            filterCreatePageParams.onTransact(Uri.parse(str));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i3 = asBinder + 93;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zOnTransact;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 1;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 25, Drawable.resolveOpacity(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 59, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 3;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 15;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 59 - (ViewConfiguration.getWindowTouchSlop() >> 8), 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 59 - View.getDefaultSize(0, 0), 6383 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b(new char[]{12746, 33256, 20914, 8574, 61734, 16624, 4272, 57458, 45077, 1017, 54199, 41841, 29464, 49907, 37561, 25211, 12844}, AndroidCharacter.getMirror('0') + 45071, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a((short) KeyEvent.normalizeMetaState(0), (byte) (52 - TextUtils.getTrimmedLength("")), (-377188474) - View.MeasureSpec.getSize(0), (-2017294945) - KeyEvent.getDeadChar(0, 0), (-33) - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        List<String> listSplit$default = StringsKt.split$default(strOnNavigationEvent, new String[]{((String) objArr2[0]).intern()}, false, 0, 6, (Object) null);
        Object[] objArr3 = new Object[1];
        a((short) View.MeasureSpec.getMode(0), (byte) (60 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) - 377188474, (-2017294874) + (ViewConfiguration.getScrollDefaultDelay() >> 16), (-20) - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        TossCoreWebView webView = webViewContentOwner.getWebView();
        Object obj = null;
        if (webView != null) {
            strOnExtraCallbackWithResult = webView.onExtraCallbackWithResult();
        } else {
            int i2 = asBinder + 69;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallbackWithResult = null;
        }
        if (strOnExtraCallbackWithResult == null) {
            int i4 = asBinder + 43;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str2 = strOnExtraCallbackWithResult;
        }
        Uri uri = Uri.parse(str2);
        Intrinsics.checkNotNull(uri);
        if (filterCreatePageParams.IAuthTabCallbackStub(uri)) {
            int i5 = asInterface + 89;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr4 = new Object[1];
                b(new char[]{12796, 24714, 37641, 50595, 29758, 42697, 55628, 3050, 47736, 60672, 8064, 20006, 57514, 4948, 17864, 62579, 9982, 22906, 34836, 14979, 27957, 40885, 52824, 24779, 37748, 50665, 29824, 42762, 55719, 2097, 47822, 60745, 8129, 20088, 57570, 4995, 16920, 62655, 10026, 22989, 34901, 15103, 28017, 39965, 52870, 24865}, 12858 >> Gravity.getAbsoluteGravity(1, 0), objArr4);
                onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -323280852, new Object[]{this, webViewContentOwner, settext, settopguidebackgroundcolor, ((String) objArr4[0]).intern(), jsonObject, 47L}, 323280853, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                return;
            }
            Object[] objArr5 = new Object[1];
            b(new char[]{12796, 24714, 37641, 50595, 29758, 42697, 55628, 3050, 47736, 60672, 8064, 20006, 57514, 4948, 17864, 62579, 9982, 22906, 34836, 14979, 27957, 40885, 52824, 24779, 37748, 50665, 29824, 42762, 55719, 2097, 47822, 60745, 8129, 20088, 57570, 4995, 16920, 62655, 10026, 22989, 34901, 15103, 28017, 39965, 52870, 24865}, 20849 - Gravity.getAbsoluteGravity(0, 0), objArr5);
            onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -323280852, new Object[]{this, webViewContentOwner, settext, settopguidebackgroundcolor, ((String) objArr5[0]).intern(), jsonObject, 47L}, 323280853, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
            return;
        }
        if (!filterCreatePageParams.onWarmupCompleted(uri)) {
            onNavigationEvent(webViewContentOwner, strOnNavigationEvent2, listSplit$default, settopguidebackgroundcolor);
            return;
        }
        Object[] objArr6 = new Object[1];
        a((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((ViewConfiguration.getTapTimeout() >> 16) - 19), (-377188446) - Color.alpha(0), (-2017294906) - (ViewConfiguration.getScrollBarSize() >> 8), Drawable.resolveOpacity(0, 0) + 16, objArr6);
        onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -323280852, new Object[]{this, webViewContentOwner, settext, settopguidebackgroundcolor, ((String) objArr6[0]).intern(), jsonObject, 46L}, 323280853, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i6 = asInterface + 47;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getNotBefore getnotbefore = (getNotBefore) objArr[0];
        WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
        setText settext = (setText) objArr[2];
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[3];
        String str = (String) objArr[4];
        JsonObject jsonObject = (JsonObject) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            webViewContentOwner.getActivity();
            throw null;
        }
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity == null) {
            int i3 = asInterface + 39;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(webViewContentOwner), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(settext, activity, str, jLongValue, getnotbefore, webViewContentOwner, settopguidebackgroundcolor, jsonObject, null), 3, (Object) null);
        int i5 = asBinder + 17;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
        final /* synthetic */ WebViewContentOwner $contentOwner;
        final /* synthetic */ JsonObject $data;
        final /* synthetic */ long $funnelId;
        final /* synthetic */ setText $parsedMessage;
        final /* synthetic */ String $standardTermsV2Code;
        Object L$0;
        int label;
        final /* synthetic */ getNotBefore this$0;
        private static char[] IAuthTabCallback = {32562, 32572, 32553, 32765, 32545, 32558, 32758, 32547, 32560, 32546, 32544, 32552, 32563, 32567, 32564, 32559, 32551, 32554, 32550, 32565, 32515, 32566, 32526, 32557, 32540};
        private static int onNavigationEvent = -1184333859;
        private static boolean onExtraCallback = true;
        private static boolean onExtraCallbackWithResult = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(setText settext, FragmentActivity fragmentActivity, String str, long j, getNotBefore getnotbefore, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, JsonObject jsonObject, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$parsedMessage = settext;
            this.$activity = fragmentActivity;
            this.$standardTermsV2Code = str;
            this.$funnelId = j;
            this.this$0 = getnotbefore;
            this.$contentOwner = webViewContentOwner;
            this.$callbackProxy = settopguidebackgroundcolor;
            this.$data = jsonObject;
        }

        public static /* synthetic */ void IAuthTabCallback(getNotBefore getnotbefore, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, JsonObject jsonObject, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(getnotbefore, webViewContentOwner, settopguidebackgroundcolor, jsonObject, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            int i4 = onWarmupCompleted + 5;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$parsedMessage, this.$activity, this.$standardTermsV2Code, this.$funnelId, this.this$0, this.$contentOwner, this.$callbackProxy, this.$data, access13800Var);
            int i2 = onWarmupCompleted + 7;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = asBinder + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = asBinder + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            return objInvokeSuspend;
        }

        private static final void onNavigationEvent(getNotBefore getnotbefore, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, JsonObject jsonObject, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getNotBefore.onWarmupCompleted(getnotbefore, webViewContentOwner, settopguidebackgroundcolor, r8lambda6v0yvgpvgcqzeji1gnetqsiyse, jsonObject);
            if (i3 != 0) {
                int i4 = 37 / 0;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setText settext = this.$parsedMessage;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-120, -119, -120, -120, -119, -114, -119, -107, -119, -127, -113, -111, -120, -119, -118}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, objArr);
                String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
                getDummyAd getdummyadOnNavigationEvent = getDummyAd.Companion.onNavigationEvent(this.$activity);
                FragmentActivity fragmentActivity = this.$activity;
                String str = this.$standardTermsV2Code;
                long j = this.$funnelId;
                this.L$0 = access15400.onNavigationEvent(strOnNavigationEvent);
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnNavigationEvent, fragmentActivity, str, (String) null, strOnNavigationEvent, j, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388580, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 127 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                    throw new IllegalStateException(((String) objArr2[0]).intern());
                }
                int i3 = onWarmupCompleted + 77;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onWarmupCompleted + 83;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                objOnExtraCallback = obj;
            }
            SessionTrackera.onExtraCallbackWithResult onextracallbackwithresult = SessionTrackera.Companion;
            IEngagementSignalsCallbackStubProxy activityResultRegistry = this.$activity.getActivityResultRegistry();
            Object[] objArr3 = new Object[1];
            Object obj2 = null;
            a(null, null, new byte[]{-118, -123, -112, -117, -122, -127, -127, -103, -119, -125, -115, -126, -125, -113, -126, -111, -103, -104, -123, -105, -123, -119, -106}, ExpandableListView.getPackedPositionChild(0L) + 128, objArr3);
            onextracallbackwithresult.onExtraCallback(activityResultRegistry.onExtraCallback(((String) objArr3[0]).intern(), AppLovinAdImpl.onExtraCallbackWithResult(), new GetOtpAvailableAccountsHandler$handleAffiliateTerms$1$.ExternalSyntheticLambda0(this.this$0, this.$contentOwner, this.$callbackProxy, this.$data))).onNavigationEvent((Intent) objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i6 = asBinder + 13;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = IAuthTabCallback;
            Object obj = null;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 51;
                    $10 = i5 % 128;
                    if (i5 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (Process.myTid() >> 22) + 77, 20952 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                            i4 %= 1;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 77, View.resolveSizeAndState(0, 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                        i2 = 2;
                        obj = null;
                    }
                }
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr3 = cArr4;
            }
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 74 - TextUtils.lastIndexOf("", '0', 0, 0), (-16761179) - Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            int i8 = 1052772399;
            if (onExtraCallbackWithResult) {
                int i9 = $11 + 11;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $11 + 117;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    try {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, 12214 - (KeyEvent.getMaxKeyCode() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        i8 = 1052772399;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i13 = $11 + 107;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i15 = $11 + 37;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i16 = $10 + 87;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 63 - (Process.myPid() >> 22), Gravity.getAbsoluteGravity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, List list, AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(autoVerifyAvailableBankAccountResp, "");
        List listOnNavigationEvent = autoVerifyAvailableBankAccountResp.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 5;
        }
        for (Object obj : listOnNavigationEvent) {
            if (true ^ list.contains(String.valueOf(((AutoVerifyPossibleBankAccount) obj).IAuthTabCallback()))) {
                arrayList.add(obj);
                int i4 = asInterface + 45;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        b(new char[]{12750, 22229, 65534, 1163, 44478, 12988, 23373, 57459}, Drawable.resolveOpacity(0, 0) + 26393, objArr);
        jsonObject.add(((String) objArr[0]).intern(), ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult(arrayList));
        ALCFaceBox.onWarmupCompleted(settopguidebackgroundcolor, jsonObject);
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, List<String> list, setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        writeRaw writerawOnWarmupCompleted = shouldAutoplay.onWarmupCompleted(AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras(), str, null, 2, null);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new GetOtpAvailableAccountsHandler$.ExternalSyntheticLambda0(settopguidebackgroundcolor), new GetOtpAvailableAccountsHandler$.ExternalSyntheticLambda1(settopguidebackgroundcolor, list)), r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallbackWithResult(WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse, JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        if (webViewContentOwner.getContext() == null) {
            Object[] objArr = new Object[1];
            a((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) ((-34) - MotionEvent.axisFromString("")), (-377188504) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-2017294890) - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 20, objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR.getReason(), (Map) null, 4, (Object) null);
            return;
        }
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse == null) {
            int i2 = asBinder + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 108), TextUtils.indexOf((CharSequence) "", '0', 0) - 377188490, (-2017294875) - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) - 16, objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr2[0]).intern(), r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR.getReason(), (Map) null, 4, (Object) null);
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr3 = new Object[1];
        b(new char[]{12746, 33256, 20914, 8574, 61734, 16624, 4272, 57458, 45077, 1017, 54199, 41841, 29464, 49907, 37561, 25211, 12844}, 45118 - Process.getGidForName(""), objArr3);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (byte) (52 - TextUtils.getOffsetBefore("", 0)), (-377188474) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) - 2017294944, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 33, objArr4);
        List<String> listSplit$default = StringsKt.split$default(strOnNavigationEvent, new String[]{((String) objArr4[0]).intern()}, false, 0, 6, (Object) null);
        Object[] objArr5 = new Object[1];
        a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (60 - View.MeasureSpec.getSize(0)), (-377188474) - Color.alpha(0), (-2017294874) - Color.green(0), (-19) - TextUtils.indexOf("", "", 0), objArr5);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onWarmupCompleted() == r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.AGREED) {
            int i4 = asBinder + 51;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent(webViewContentOwner, strOnNavigationEvent2, listSplit$default, settopguidebackgroundcolor);
            return;
        }
        Object[] objArr6 = new Object[1];
        a((short) View.combineMeasuredStates(0, 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 82), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 377188460, (-2017294922) - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 25, objArr6);
        String strIntern = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(new char[]{12779, 49377, 54258, 58107, 62964, 34014, 38848, 42715, 47571}, View.getDefaultSize(0, 0) + 61703, objArr7);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, strIntern, ((String) objArr7[0]).intern(), (Map) null, 4, (Object) null);
        int i6 = asBinder + 73;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7;
        boolean z;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43423), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, TextUtils.getOffsetAfter("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            long j2 = 0;
            if (z2) {
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int i9 = $11 + 83;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.getDefaultSize(0, 0)), ExpandableListView.getPackedPositionChild(j2) + 56, 2167 - ((Process.getThreadPriority(0) + 20) >> 6), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i10 = $10 + 69;
                    $11 = i10 % 128;
                    i4 = 2;
                    int i11 = i10 % 2;
                    bArr2 = bArr;
                } else {
                    i4 = 2;
                }
                if (bArr2 != null) {
                    int i12 = $10 + 39;
                    $11 = i12 % 128;
                    if (i12 % i4 == 0) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = new Object[i4];
                        objArr4[1] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr4[0] = Integer.valueOf(i);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 42 - (Process.myPid() >> 22), (ViewConfiguration.getScrollBarSize() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - 4629411779493505016L)) - ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 22440 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i5;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j));
                if (z2) {
                    i7 = 1;
                } else {
                    int i14 = $10 + 29;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 2 % 5;
                    }
                    i7 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 85 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onWarmupCompleted;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i16 = 0;
                    while (i16 < length2) {
                        int i17 = $11 + 51;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            bArr6[i16] = (byte) (bArr5[i16] - 4629411779493505016L);
                        } else {
                            bArr6[i16] = (byte) (bArr5[i16] ^ (-4629411779493505016L));
                            i16++;
                        }
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i18 = $11 + 25;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        int i20 = $10 + 3;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >> 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >> (((byte) (((byte) (bArr7[r7] % (-4629411779493505016L))) * s)) ^ b));
                        } else {
                            byte[] bArr8 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr8[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final void onNavigationEvent(WebViewContentOwner webViewContentOwner, setText settext, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, JsonObject jsonObject, long j) throws Throwable {
        onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -323280852, new Object[]{this, webViewContentOwner, settext, settopguidebackgroundcolor, str, jsonObject, Long.valueOf(j)}, 323280853, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        return (Unit) onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1351055643, new Object[]{settopguidebackgroundcolor, th}, -1351055643, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }
}
