package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.google.gson.JsonObject;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.ExtractOtpWithVerifyIdHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KeyUsage implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int[] onExtraCallbackWithResult = null;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        onWarmupCompleted();
        Companion = new onNavigationEvent(null);
        int i = asBinder + 91;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, useShadowNodeStateOnClone useshadownodestateonclone, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(settopguidebackgroundcolor, useshadownodestateonclone, z);
        int i4 = onWarmupCompleted + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i6)) | i;
        int i9 = ~i6;
        int i10 = ~i;
        int i11 = (~(i9 | i10)) | i5;
        int i12 = (~(i | i9 | i5)) | (~(i7 | i9 | i10)) | (~(i10 | i6 | i5));
        int i13 = i6 + i5 + i2 + ((-104759182) * i3) + ((-453318476) * i4);
        int i14 = i13 * i13;
        int i15 = (i6 * 1504131295) + 1805123584 + (1504131295 * i5) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i2) + (711983104 * i3) + (1180696576 * i4) + (1022754816 * i14);
        int i16 = ((i6 * (-1431886989)) - 1507491630) + (i5 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i2 * (-1431886867)) + (i3 * 722567050) + (i4 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        View view = (View) objArr[2];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallback + 9;
        onWarmupCompleted = i19 % 128;
        int i20 = i19 % 2;
        IAuthTabCallback(function1, gettypedexportedconstants, view);
        int i21 = onWarmupCompleted + 119;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(KeyUsage keyUsage, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, useShadowNodeStateOnClone useshadownodestateonclone) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(keyUsage, webViewContentOwner, settopguidebackgroundcolor, useshadownodestateonclone);
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(new Object[]{function1, gettypedexportedconstants, view}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 445073811, -445073810);
        int i4 = onWarmupCompleted + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallback(new Object[]{settopguidebackgroundcolor, th}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1267797682, 1267797684);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = IAuthTabCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 != 0) {
            int i6 = 37 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = onWarmupCompleted + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            int i6 = 58 / 0;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 23 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 105;
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
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getMode(0)), View.resolveSizeAndState(0, 0, 0) + 84, (-16755983) - Color.rgb(0, 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $11 + 13;
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

    private static final Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, useShadowNodeStateOnClone useshadownodestateonclone, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!z) {
            Object[] objArr = new Object[1];
            a(new char[]{52138, 52206, 36240, 1933, 59979, 51354, 54019, 58484, 21765, 35736, 27076, 1720, 63070}, Process.myPid() >> 22, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new int[]{909582782, 29826100, -1737106659, 434017439, -1474438752, -506184846}, TextUtils.indexOf((CharSequence) "", '0', 0) + 10, objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, strIntern, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
        } else {
            int i4 = i2 + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                ALCFaceBox.onExtraCallback(settopguidebackgroundcolor, useshadownodestateonclone.onExtraCallbackWithResult());
                obj.hashCode();
                throw null;
            }
            ALCFaceBox.onExtraCallback(settopguidebackgroundcolor, useshadownodestateonclone.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(KeyUsage keyUsage, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, useShadowNodeStateOnClone useshadownodestateonclone) {
        int i = 2 % 2;
        keyUsage.onWarmupCompleted(webViewContentOwner, useshadownodestateonclone.onExtraCallbackWithResult(), (Function1<? super Boolean, Unit>) new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda0(settopguidebackgroundcolor, useshadownodestateonclone));
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        UST_CERT_GetIsCA uST_CERT_GetIsCA = (Throwable) objArr[1];
        int i = 2 % 2;
        if (!(uST_CERT_GetIsCA instanceof UST_CERT_GetIsCA)) {
            Intrinsics.checkNotNull(uST_CERT_GetIsCA);
            Object[] objArr2 = new Object[1];
            a(new char[]{30902, 30947, 61156, 9424, 35096, 60415, 37356, 42676, 58929, 59593, 19122}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr2);
            ALCFaceBox.onExtraCallbackWithResult(settopguidebackgroundcolor, uST_CERT_GetIsCA, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            UST_CERT_GetIsCA uST_CERT_GetIsCA2 = uST_CERT_GetIsCA;
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, uST_CERT_GetIsCA2.onExtraCallback().onNavigationEvent(), uST_CERT_GetIsCA2.onExtraCallback().onExtraCallback(), (Map) null, 4, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 7;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        NestmincrementPendingJSCalls nestmincrementPendingJSCalls;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{50484, 50498, 40389, 10762, 64018, 58652, 13914, 293, 23450, 39878, 17519, 58336}, TextUtils.getCapsMode("", 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new int[]{-1275001356, 904458399}, 1 - KeyEvent.keyCodeFromString(""), objArr2);
        Long longOrNull = StringsKt.toLongOrNull(settext.onNavigationEvent(strIntern, ((String) objArr2[0]).intern()));
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        Object[] objArr3 = new Object[1];
        b(new int[]{365461862, -1594038279, 1875764929, -359306832, -905005980, 334124982, 468121367, 20685820, 745312675, 1430229744}, TextUtils.lastIndexOf("", '0', 0) + 20, objArr3);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b(new int[]{-1889757149, 905144338, -856056517, 2068483352}, Color.red(0) + 6, objArr4);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        a(new char[]{1260, 1159, 8934, 40387, 17713, 21214, 56769, 60064, 39499, 9454, 62347}, KeyEvent.keyCodeFromString(""), objArr5);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr5[0]).intern(), strOnNavigationEvent2);
        Object[] objArr6 = new Object[1];
        b(new int[]{219828716, -833319526, 558243057, -1112261146}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, objArr6);
        Integer numValueOf = Integer.valueOf(settext.onNavigationEvent(((String) objArr6[0]).intern(), -1));
        String strOnExtraCallbackWithResult = null;
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 3;
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            int i2 = IAuthTabCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallbackWithResult = webView.onExtraCallbackWithResult();
        }
        if (strOnExtraCallbackWithResult == null) {
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallbackWithResult = "";
        }
        Uri uri = Uri.parse(strOnExtraCallbackWithResult);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        if (filterCreatePageParams.onWarmupCompleted(uri)) {
            nestmincrementPendingJSCalls = NestmincrementPendingJSCalls.TOSS_BANK;
        } else {
            Uri uri2 = Uri.parse(strOnExtraCallbackWithResult);
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            if (filterCreatePageParams.IAuthTabCallbackStub(uri2)) {
                int i6 = IAuthTabCallback + 31;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                nestmincrementPendingJSCalls = NestmincrementPendingJSCalls.TOSS_SECURITIES;
            } else {
                nestmincrementPendingJSCalls = NestmincrementPendingJSCalls.TOSS_CORE;
            }
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = new useTurboModules(jLongValue, strOnNavigationEvent, strOnNavigationEvent3, iIntValue, nestmincrementPendingJSCalls, (Long) null, 32, (DefaultConstructorMarker) null).onExtraCallbackWithResult().onNavigationEvent(new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda2(new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda1(this, webViewContentOwner, settopguidebackgroundcolor)), new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda4(new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda3(settopguidebackgroundcolor)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, webViewContentOwner);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.TRUE);
        gettypedexportedconstants.dismiss();
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.FALSE);
        gettypedexportedconstants.dismiss();
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(WebViewContentOwner webViewContentOwner, String str, Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            webViewContentOwner.getContext();
            obj.hashCode();
            throw null;
        }
        Context context = webViewContentOwner.getContext();
        if (context == null) {
            return;
        }
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onwarmupcompleted, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.setCanceledOnTouchOutside(false);
        gettypedexportedconstants.setCancelable(false);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(context.getString(R.string.app_common_web_message_handlers___1b64d39878));
        int i3 = R.string.app_common_web_message_handlers___8a3b82daf2;
        Context context4 = bottomSheetHeader.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        String string = context.getString(i3, mergeParams.onExtraCallbackWithResult(str, ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue()));
        Intrinsics.checkNotNullExpressionValue(string, "");
        bottomSheetHeader.setDescription(mergeParams.onExtraCallbackWithResult(string, true));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
        String string2 = context.getString(R.string.app_common_web_message_handlers___e2416123ba);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda5(function1, gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.UNDERLINE);
        tdsBottomCtaV1View.setBottomButton(context.getString(R.string.app_common_web_message_handlers___da747a8421), new ExtractOtpWithVerifyIdHandler$.ExternalSyntheticLambda6(function1, gettypedexportedconstants));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        float f = 0.0f;
        long j = 0;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 73 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 8848 - TextUtils.getCapsMode("", 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int i7 = $10;
            int i8 = i7 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = i7 + 75;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 4;
            }
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 109;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i12]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), 71 - TextUtils.lastIndexOf("", '0', i5), (KeyEvent.getMaxKeyCode() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 72 - View.MeasureSpec.getSize(0), 8848 - Color.red(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                }
                int i14 = $11 + 79;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                f = 0.0f;
                i5 = 0;
            }
            int i16 = $11 + 41;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i18 = $10 + 79;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i20 = 0;
            for (int i21 = 16; i20 < i21; i21 = 16) {
                int i22 = $10 + 47;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i20];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 22252), 39 - TextUtils.getTrimmedLength(""), (Process.myTid() >> 22) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i20++;
            }
            int i24 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i24;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i25 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i26 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 4033), 78 - KeyEvent.keyCodeFromString(""), 7399 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        return (Unit) onExtraCallback(new Object[]{settopguidebackgroundcolor, th}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1267797682, 1267797684);
    }

    private static final void onExtraCallback(Function1 function1, getTypedExportedConstants gettypedexportedconstants, View view) {
        onExtraCallback(new Object[]{function1, gettypedexportedconstants, view}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 445073811, -445073810);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = -4476329487754257218L;
        onExtraCallbackWithResult = new int[]{1417366700, -1741267851, 844980571, -947062229, -2144430241, -1109594082, -580080539, -1354536900, 885924880, -810774216, 819505751, 576097646, -1108832057, 943839159, 1291358633, 1884374877, -144814409, -1444189541};
    }
}
