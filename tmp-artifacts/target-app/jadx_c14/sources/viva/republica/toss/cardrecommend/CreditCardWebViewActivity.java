package viva.republica.toss.cardrecommend;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_GetCertValidityNotBefore_Date;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.ReactNativeFeatureFlagsAccessor;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.deserializeUriNullableCollection;
import o.drawImageIconSize;
import o.filterCreatePageParams;
import o.getIconPaddingLeft;
import o.getWrite;
import o.mergeParams;
import o.nSetPosition;
import o.onAdViewAdDisplayFailed;
import o.processTransparent;
import o.setBackgroundAlpha;
import o.setMessageBytes;
import o.wasLastName;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.CreditCardWebViewActivity$;
import viva.republica.toss.cardrecommend.CreditCardWebViewActivity$initWebView$2$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardWebViewActivity extends Hilt_CreditCardWebViewActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStub = 1;
    public static final int asBinder;
    private static char onActivityLayout;
    private static char[] onMessageChannelReady;
    private static int onRelationshipValidationResult;
    private static int onUnminimized;
    private onExtraCallbackWithResult IAuthTabCallbackDefault;
    private boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private boolean access000;
    private boolean access100;
    private RootChromeWebViewClient onTransact;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda4
        public final Object invoke() {
            return CreditCardWebViewActivity.IAuthTabCallback(this.f$0);
        }
    });
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return CreditCardWebViewActivity.onWarmupCompleted(this.f$0);
        }
    });
    private final Lazy onMinimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return CreditCardWebViewActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy onPostMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda7
        public final Object invoke() {
            return CreditCardWebViewActivity.asInterface(this.f$0);
        }
    });
    private String IAuthTabCallbackStubProxy = "";
    private String readTypedObject = "";
    private String getInterfaceDescriptor = "";
    private boolean writeTypedObject = true;
    private final Runnable IAuthTabCallbackStub = new Runnable() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda8
        @Override // java.lang.Runnable
        public final void run() {
            CreditCardWebViewActivity.onTransact(this.f$0);
        }
    };
    private final Runnable extraCallbackWithResult = new Runnable() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            CreditCardWebViewActivity.onExtraCallbackWithResult(this.f$0);
        }
    };
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));

    static {
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        asBinder = 8;
        int i = onRelationshipValidationResult + 23;
        ICustomTabsCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 95;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditCardWebViewActivity, setDetectableSize);
        int i4 = ICustomTabsCallbackStub + 117;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(CreditCardWebViewActivity creditCardWebViewActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 93;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(creditCardWebViewActivity);
        }
        extraCallback(creditCardWebViewActivity);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(creditCardWebViewActivity, dialogInterface, iIntValue);
        if (i3 == 0) {
            return null;
        }
        int i4 = 45 / 0;
        return null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(creditCardWebViewActivity, onextracallbackwithresult, view);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = ICustomTabsCallbackStub + 73;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ String asInterface(CreditCardWebViewActivity creditCardWebViewActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 97;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject(creditCardWebViewActivity);
            throw null;
        }
        String typedObject = readTypedObject(creditCardWebViewActivity);
        int i3 = onUnminimized + 39;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i;
        int i8 = (~(i7 | i2)) | i3;
        int i9 = ~i3;
        int i10 = ~(i7 | i9);
        int i11 = ~i2;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i2 | i9)) | (~(i7 | i11));
        int i14 = i + i3 + i6 + (417615942 * i5) + (566850886 * i4);
        int i15 = i14 * i14;
        int i16 = (i * (-1357469509)) + 140661806 + (i3 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + ((-1357469401) * i6) + (1137340586 * i5) + (304092074 * i4) + (i15 * 1282146304);
        switch (((-370608051) * i) + 147849216 + ((-2147356519) * i3) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i5) + ((-85983232) * i4) + ((-608960512) * i15) + (i16 * i16 * 1158414336)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                ((Number) objArr[2]).intValue();
                int i17 = 2 % 2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("service", "card_brokerage");
                linkedHashMap.put("category", "card_brokerage");
                Object[] objArr2 = new Object[1];
                a(new char[]{'\n', '\f', '\n', 6}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 19), 4 - Color.argb(0, 0, 0, 0), objArr2);
                linkedHashMap.put(((String) objArr2[0]).intern(), "s52_cardbrokerage_apply_log");
                Object[] objArr3 = new Object[1];
                a(new char[]{'\r', '\f', 13806, 13806, 1, '\f'}, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 6, objArr3);
                linkedHashMap.put(((String) objArr3[0]).intern(), "yes_close");
                Object[] objArr4 = new Object[1];
                a(new char[]{'\t', '\b', 11, 4, 13857}, (byte) (34 - TextUtils.indexOf("", "")), Process.getGidForName("") + 6, objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                linkedHashMap.put(strIntern, (String) onExtraCallback(-1563385493, new Object[]{creditCardWebViewActivity}, iOnExtraCallbackWithResult, 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2));
                Object[] objArr5 = new Object[1];
                a(new char[]{'\r', 11, 13829}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 15), 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
                linkedHashMap.put(((String) objArr5[0]).intern(), creditCardWebViewActivity.getInterfaceDescriptor);
                Unit unit = Unit.INSTANCE;
                ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, linkedHashMap, (Function1) null, 46, (Object) null);
                dialogInterface.dismiss();
                creditCardWebViewActivity.finish();
                int i18 = ICustomTabsCallbackStub + 19;
                onUnminimized = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 7:
                return onTransact(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 89;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(creditCardWebViewActivity);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return unitAccess000;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 27;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(creditCardWebViewActivity, th);
        }
        onWarmupCompleted(creditCardWebViewActivity, th);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, CreditCardWebViewActivity creditCardWebViewActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallbackwithresult, creditCardWebViewActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = ICustomTabsCallbackStub + 59;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 121;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(creditCardWebViewActivity);
        int i4 = ICustomTabsCallbackStub + 101;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    public static /* synthetic */ String onNavigationEvent(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized + 3;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            writeTypedObject(creditCardWebViewActivity);
            throw null;
        }
        String strWriteTypedObject = writeTypedObject(creditCardWebViewActivity);
        int i3 = ICustomTabsCallbackStub + 21;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return strWriteTypedObject;
    }

    public static /* synthetic */ void onTransact(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        access100(creditCardWebViewActivity);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(creditCardWebViewActivity);
        int i4 = onUnminimized + 63;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(CreditCardWebViewActivity creditCardWebViewActivity, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 35;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {creditCardWebViewActivity, dialogInterface, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(-793411320, objArr, iOnExtraCallbackWithResult, 793411326, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i5 = onUnminimized + 99;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 47;
        ICustomTabsCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 9;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return 1001214L;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements Function0<CERT_GetCertValidityNotBefore_Date> {
        final /* synthetic */ Activity onExtraCallback;

        public onWarmupCompleted(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CERT_GetCertValidityNotBefore_Date invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetCertValidityNotBefore_Date.onExtraCallback(layoutInflater);
        }
    }

    public static final /* synthetic */ Runnable IAuthTabCallbackDefault(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 3;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Runnable runnable = creditCardWebViewActivity.extraCallbackWithResult;
        if (i3 == 0) {
            return runnable;
        }
        throw null;
    }

    public static final /* synthetic */ LinearLayout IAuthTabCallbackStub(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized + 75;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            creditCardWebViewActivity.validateRelationship();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayoutValidateRelationship = creditCardWebViewActivity.validateRelationship();
        int i3 = ICustomTabsCallbackStub + 59;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return linearLayoutValidateRelationship;
    }

    public static final /* synthetic */ Runnable asBinder(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 45;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Runnable runnable = creditCardWebViewActivity.IAuthTabCallbackStub;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 25;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return runnable;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 113;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = creditCardWebViewActivity.access000;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 65;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        creditCardWebViewActivity.getInterfaceDescriptor = str;
        int i5 = i2 + 83;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditCardWebViewActivity creditCardWebViewActivity, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 39;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        creditCardWebViewActivity.ICustomTabsCallback = z;
        int i5 = i3 + 45;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 21;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return sessionTrackerb;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String extraCallback(CreditCardWebViewActivity creditCardWebViewActivity) throws Throwable {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onUnminimized + 89;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Uri data = creditCardWebViewActivity.getIntent().getData();
        if (i3 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{'\t', '\b', 11, 4, 13857}, (byte) (61 / Color.red(0)), 3 / TextUtils.indexOf("", "", 1, 0), objArr);
            objOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(new Object[]{data, ((String) objArr[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{'\t', '\b', 11, 4, 13857}, (byte) (Color.red(0) + 34), TextUtils.indexOf("", "", 0, 0) + 5, objArr2);
            objOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(new Object[]{data, ((String) objArr2[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        }
        return (String) objOnWarmupCompleted;
    }

    private final String onVerticalScrollEvent() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 35;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.onActivityResized.getValue();
            int i3 = 27 / 0;
        } else {
            str = (String) this.onActivityResized.getValue();
        }
        int i4 = ICustomTabsCallbackStub + 5;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallback_Parcel(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized + 77;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditCardWebViewActivity.getIntent().getData(), "provider", ""};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        if (i3 != 0) {
            return (String) filterCreatePageParams.onWarmupCompleted(objArr, 1209790, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -1209789);
        }
        throw null;
    }

    private final String ICustomTabsService_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = onUnminimized + 107;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) this.extraCallback.getValue();
            int i3 = 41 / 0;
        } else {
            str = (String) this.extraCallback.getValue();
        }
        int i4 = ICustomTabsCallbackStub + 111;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) creditCardWebViewActivity.onMinimized.getValue();
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String writeTypedObject(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (creditCardWebViewActivity.onVerticalScrollEvent().length() <= 0) {
                if (creditCardWebViewActivity.ICustomTabsService_Parcel().length() <= 0) {
                    int i3 = onUnminimized + 17;
                    ICustomTabsCallbackStub = i3 % 128;
                    if (i3 % 2 != 0) {
                        return "";
                    }
                    obj.hashCode();
                    throw null;
                }
                String string = creditCardWebViewActivity.getString(R.string.app_cardrecommend___687ce66f9f, creditCardWebViewActivity.ICustomTabsService_Parcel());
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i4 = onUnminimized + 61;
                ICustomTabsCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 31 / 0;
                }
                return string;
            }
            int i6 = onUnminimized + 45;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return creditCardWebViewActivity.onVerticalScrollEvent();
        }
        creditCardWebViewActivity.onVerticalScrollEvent().length();
        obj.hashCode();
        throw null;
    }

    private final String onSessionEnded() {
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = (String) this.onPostMessage.getValue();
        int i3 = onUnminimized + 73;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String readTypedObject(CreditCardWebViewActivity creditCardWebViewActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 15;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Uri data = creditCardWebViewActivity.getIntent().getData();
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 11, 13829}, (byte) (ExpandableListView.getPackedPositionType(0L) + 15), 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String str = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{data, ((String) objArr[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        int i4 = onUnminimized + 33;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void access100(CreditCardWebViewActivity creditCardWebViewActivity) {
        long j;
        int i = 2 % 2;
        creditCardWebViewActivity.access000 = false;
        LinearLayout linearLayoutValidateRelationship = creditCardWebViewActivity.validateRelationship();
        Runnable runnable = creditCardWebViewActivity.extraCallbackWithResult;
        if (creditCardWebViewActivity.ICustomTabsCallback) {
            int i2 = ICustomTabsCallbackStub;
            int i3 = i2 + 119;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            j = 0;
        } else {
            j = 2000;
        }
        linearLayoutValidateRelationship.postDelayed(runnable, j);
    }

    private final CERT_GetCertValidityNotBefore_Date writeTypedList() {
        CERT_GetCertValidityNotBefore_Date cERT_GetCertValidityNotBefore_Date;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.asInterface.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            cERT_GetCertValidityNotBefore_Date = (CERT_GetCertValidityNotBefore_Date) value;
            int i3 = 99 / 0;
        } else {
            Object value2 = this.asInterface.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            cERT_GetCertValidityNotBefore_Date = (CERT_GetCertValidityNotBefore_Date) value2;
        }
        int i4 = ICustomTabsCallbackStub + 55;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return cERT_GetCertValidityNotBefore_Date;
    }

    private final LinearLayout validateRelationship() {
        int i = 2 % 2;
        int i2 = onUnminimized + 79;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = writeTypedList().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i4 = ICustomTabsCallbackStub + 87;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private final WebView setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 99;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        WebView webView = writeTypedList().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(webView, "");
        int i4 = onUnminimized + 115;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return webView;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 63;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        LinearLayout linearLayout = creditCardWebViewActivity.writeTypedList().asInterface;
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i4 = ICustomTabsCallbackStub + 5;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        obj.hashCode();
        throw null;
    }

    private final Typography5 access200() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = writeTypedList().onTransact;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        int i4 = ICustomTabsCallbackStub + 19;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return typography5;
    }

    private final TdsButtonV1View updateVisuals() {
        int i = 2 % 2;
        int i2 = onUnminimized + 83;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1View = writeTypedList().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        int i4 = onUnminimized + 89;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tdsButtonV1View;
    }

    private final Toolbar ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Toolbar toolbar = writeTypedList().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        int i4 = onUnminimized + 69;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return toolbar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Typography5 IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 83;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = writeTypedList().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        int i4 = ICustomTabsCallbackStub + 83;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return typography5;
    }

    private final SubTypography8 ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 35;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        SubTypography8 subTypography8 = writeTypedList().asBinder;
        Intrinsics.checkNotNullExpressionValue(subTypography8, "");
        int i4 = ICustomTabsCallbackStub + 99;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return subTypography8;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("action_type", "screen");
        Object[] objArr = new Object[1];
        a(new char[]{'\t', '\b', 11, 4, 13857}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 35), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), (String) onExtraCallback(-1563385493, new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult()));
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 11, 13829}, (byte) (14 - MotionEvent.axisFromString("")), 3 - View.MeasureSpec.getSize(0), objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), onSessionEnded()), getWrite.IAuthTabCallback("provider", ICustomTabsService_Parcel()), getWrite.IAuthTabCallback("service", "card_brokerage"), getWrite.IAuthTabCallback("category", "card_brokerage")});
        int i4 = ICustomTabsCallbackStub + 91;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.Hilt_CreditCardWebViewActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 55;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(writeTypedList().getRoot());
        IEngagementSignalsCallbackDefault();
        IEngagementSignalsCallbackStub();
        IPostMessageServiceStub();
        IPostMessageServiceDefault();
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(-1837287559, new Object[]{this}, iOnExtraCallbackWithResult, 1837287566, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onUnminimized + 83;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        Uri data = getIntent().getData();
        if (data != null) {
            int i2 = onUnminimized + 59;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStubProxy = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{data, "fallback", ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
            this.access100 = filterCreatePageParams.onExtraCallback(data, "benefit", false);
            this.IAuthTabCallback_Parcel = filterCreatePageParams.onExtraCallback(data, "hideBridgePage", false);
            this.readTypedObject = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{data, "loadingText", ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
            String strOnNavigationEvent = filterCreatePageParams.onNavigationEvent(data, "bannerTitle", (String) null, 2, (Object) null);
            if (strOnNavigationEvent.length() > 0) {
                int i4 = onUnminimized + 79;
                ICustomTabsCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = onUnminimized + 91;
                ICustomTabsCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                strOnNavigationEvent = null;
            }
            this.IAuthTabCallbackDefault = strOnNavigationEvent != null ? new onExtraCallbackWithResult(strOnNavigationEvent, data.getQueryParameter("bannerCtaText"), data.getQueryParameter("bannerUrl")) : null;
        }
        int i8 = onUnminimized + 103;
        ICustomTabsCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 52 / 0;
        }
    }

    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 5;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            setSupportActionBar(ICustomTabsServiceDefault());
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            asInterface((String) onExtraCallback(-1563385493, new Object[]{this}, iOnExtraCallbackWithResult, 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2));
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onNavigationEvent(true);
                int i3 = ICustomTabsCallbackStub + 63;
                onUnminimized = i3 % 128;
                int i4 = i3 % 2;
            }
            getSupportActionBar();
            return;
        }
        setSupportActionBar(ICustomTabsServiceDefault());
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        asInterface((String) onExtraCallback(-1563385493, new Object[]{this}, iOnExtraCallbackWithResult3, 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4));
        getSupportActionBar();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_credit_card_web_view, menu);
        int i4 = onUnminimized + 49;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return true;
    }

    private static final void onNavigationEvent(CreditCardWebViewActivity creditCardWebViewActivity, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        dialogInterface.dismiss();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("service", "card_brokerage");
        linkedHashMap.put("category", "card_brokerage");
        Object[] objArr = new Object[1];
        a(new char[]{'\n', '\f', '\n', 6}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 19), KeyEvent.normalizeMetaState(0) + 4, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), "s52_cardbrokerage_apply_log");
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', '\f', 13806, 13806, 1, '\f'}, (byte) TextUtils.indexOf("", "", 0, 0), Color.rgb(0, 0, 0) + 16777222, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), "no_remain");
        Object[] objArr3 = new Object[1];
        a(new char[]{'\t', '\b', 11, 4, 13857}, (byte) (33 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 5 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        linkedHashMap.put(strIntern, (String) onExtraCallback(-1563385493, new Object[]{creditCardWebViewActivity}, iOnExtraCallbackWithResult, 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2));
        Object[] objArr4 = new Object[1];
        a(new char[]{'\r', 11, 13829}, (byte) (15 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
        linkedHashMap.put(((String) objArr4[0]).intern(), creditCardWebViewActivity.getInterfaceDescriptor);
        Unit unit = Unit.INSTANCE;
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, linkedHashMap, (Function1) null, 46, (Object) null);
        int i3 = onUnminimized + 27;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        int i2 = onUnminimized + 119;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        Object obj = null;
        if (menuItem.getItemId() == R.id.action_close) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("service", "card_brokerage");
            linkedHashMap.put("category", "card_brokerage");
            Object[] objArr = new Object[1];
            a(new char[]{'\n', '\f', '\n', 6}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026428).substring(0, 2).length() + 17), View.combineMeasuredStates(0, 0) + 4, objArr);
            linkedHashMap.put(((String) objArr[0]).intern(), "s52_cardbrokerage_apply_log");
            Object[] objArr2 = new Object[1];
            a(new char[]{'\r', '\f', 13806, 13806, 1, '\f'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 93, objArr2);
            linkedHashMap.put(((String) objArr2[0]).intern(), "exit");
            Object[] objArr3 = new Object[1];
            a(new char[]{'\t', '\b', 11, 4, 13857}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022788).substring(0, 9).length() + 25), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 14, objArr3);
            linkedHashMap.put(((String) objArr3[0]).intern(), (String) onExtraCallback(-1563385493, new Object[]{this}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult()));
            Object[] objArr4 = new Object[1];
            a(new char[]{'\r', 11, 13829}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019236).substring(0, 2).codePointAt(1) - 100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 112, objArr4);
            linkedHashMap.put(((String) objArr4[0]).intern(), this.getInterfaceDescriptor);
            Unit unit = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "click_button", false, (String) null, (List) null, linkedHashMap, (Function1) null, 46, (Object) null);
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(this);
            String string = getString(R.string.app_cardrecommend___b8b8f8e2b0);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onNavigationEvent(string);
            String string2 = getString(R.string.app_cardrecommend___85bbe66caa);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onExtraCallbackWithResult(string2);
            String string3 = getString(im.toss.uikit.R.string.uikit_no);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), new Object[]{onwarmupcompleted2, string3, new CreditCardWebViewActivity$.ExternalSyntheticLambda0(this), null, false, 12, null}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1871975236, 1871975236, JsParamKeys.onExtraCallbackWithResult());
            String string4 = getString(R.string.app_cardrecommend___6b5ea010fe);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted3, string4, new CreditCardWebViewActivity$.ExternalSyntheticLambda1(this), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null).onNavigationEvent(true)).readTypedObject();
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        int i4 = onUnminimized + 87;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnOptionsItemSelected;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(final CreditCardWebViewActivity creditCardWebViewActivity, final onExtraCallbackWithResult onextracallbackwithresult, View view) {
        int i = 2 % 2;
        SessionTrackerb.IAuthTabCallback(creditCardWebViewActivity.onNavigationEvent(), creditCardWebViewActivity, onextracallbackwithresult.onExtraCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "click__enter_a_draw", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return CreditCardWebViewActivity.onExtraCallbackWithResult(onextracallbackwithresult, creditCardWebViewActivity, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        int i2 = ICustomTabsCallbackStub + 43;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, CreditCardWebViewActivity creditCardWebViewActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 111;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", "s52_cardbrokerage_apply_log");
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 11, 13829}, (byte) (15 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf("", "", 0) + 3, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), onextracallbackwithresult.onExtraCallback());
        setDetectableSize.onExtraCallback("provider", creditCardWebViewActivity.ICustomTabsService_Parcel());
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 59;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IPostMessageServiceStub() {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.CreditCardWebViewActivity.ICustomTabsCallbackStub
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity.onUnminimized = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Ld9
            java.lang.String r1 = r12.ICustomTabsService_Parcel()
            int r1 = r1.length()
            if (r1 <= 0) goto L2d
            im.toss.tds.view.component.atom.text.SubTypography8 r1 = r12.ICustomTabsServiceStubProxy()
            int r2 = viva.republica.toss.R.string.app_cardrecommend_web_loading_provider
            java.lang.String r3 = r12.ICustomTabsService_Parcel()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = r12.getString(r2, r3)
            r1.setText(r2)
        L2d:
            java.lang.String r1 = r12.readTypedObject
            int r1 = r1.length()
            if (r1 <= 0) goto L47
            im.toss.tds.view.component.atom.text.Typography5 r1 = r12.IEngagementSignalsCallback()
            java.lang.String r2 = r12.readTypedObject
            r1.setText(r2)
            int r1 = viva.republica.toss.cardrecommend.CreditCardWebViewActivity.ICustomTabsCallbackStub
            int r1 = r1 + 13
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity.onUnminimized = r2
            int r1 = r1 % r0
        L47:
            android.widget.LinearLayout r1 = r12.validateRelationship()
            r2 = 4
            r1.setVisibility(r2)
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity$onExtraCallbackWithResult r1 = r12.IAuthTabCallbackDefault
            if (r1 == 0) goto Ld8
            java.lang.Object[] r3 = new java.lang.Object[]{r12}
            int r4 = o.onAdViewAdDisplayFailed.onExtraCallbackWithResult()
            int r8 = o.onAdViewAdDisplayFailed.onExtraCallbackWithResult()
            int r7 = o.onAdViewAdDisplayFailed.onExtraCallbackWithResult()
            int r6 = o.onAdViewAdDisplayFailed.onExtraCallbackWithResult()
            r2 = 1715147263(0x663b11ff, float:2.2085363E23)
            r5 = -1715147263(0xffffffff99c4ee01, float:-2.0362054E-23)
            java.lang.Object r2 = onExtraCallback(r2, r3, r4, r5, r6, r7, r8)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 0
            r2.setVisibility(r3)
            im.toss.tds.view.component.atom.text.Typography5 r2 = r12.access200()
            java.lang.String r4 = r1.onExtraCallbackWithResult()
            r2.setText(r4)
            im.toss.tds.view.component.atom.button.TdsButtonV1View r2 = r12.updateVisuals()
            java.lang.String r4 = r1.onNavigationEvent()
            if (r4 == 0) goto Lb1
            int r5 = viva.republica.toss.cardrecommend.CreditCardWebViewActivity.onUnminimized
            int r5 = r5 + 29
            int r6 = r5 % 128
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity.ICustomTabsCallbackStub = r6
            int r5 = r5 % r0
            int r4 = r4.length()
            if (r4 <= 0) goto Lb1
            java.lang.String r4 = r1.onExtraCallback()
            if (r4 == 0) goto Lb1
            int r4 = r4.length()
            if (r4 <= 0) goto Lb1
            int r4 = viva.republica.toss.cardrecommend.CreditCardWebViewActivity.ICustomTabsCallbackStub
            int r4 = r4 + 63
            int r5 = r4 % 128
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity.onUnminimized = r5
            int r4 = r4 % r0
            goto Lb3
        Lb1:
            r3 = 8
        Lb3:
            r2.setVisibility(r3)
            java.lang.String r0 = r1.onNavigationEvent()
            r2.setText(r0)
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda2 r0 = new viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda2
            r0.<init>(r12, r1)
            r2.setOnClickListener(r0)
            o.ConvertFloatArrayToByteArray r3 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r4 = "impression__enter_a_draw"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda3 r9 = new viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda3
            r9.<init>(r12)
            r10 = 30
            r11 = 0
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        Ld8:
            return
        Ld9:
            java.lang.String r0 = r12.ICustomTabsService_Parcel()
            r0.length()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.CreditCardWebViewActivity.IPostMessageServiceStub():void");
    }

    private static final Unit onExtraCallbackWithResult(CreditCardWebViewActivity creditCardWebViewActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 105;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "impression");
        setDetectableSize.onExtraCallback("screen_name", "s52_cardbrokerage_apply_log");
        setDetectableSize.onExtraCallback("provider", creditCardWebViewActivity.ICustomTabsService_Parcel());
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 55;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return unit;
    }

    public static final class onExtraCallback extends WebViewClient {
        onExtraCallback() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) throws Throwable {
            CreditCardWebViewActivity.onNavigationEvent(CreditCardWebViewActivity.this, true);
            Object[] objArr = {CreditCardWebViewActivity.this};
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            if (!((Boolean) CreditCardWebViewActivity.onExtraCallback(384012827, objArr, iOnExtraCallbackWithResult, -384012826, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2)).booleanValue()) {
                CreditCardWebViewActivity.IAuthTabCallbackStub(CreditCardWebViewActivity.this).removeCallbacks(CreditCardWebViewActivity.asBinder(CreditCardWebViewActivity.this));
                CreditCardWebViewActivity.IAuthTabCallbackStub(CreditCardWebViewActivity.this).removeCallbacks(CreditCardWebViewActivity.IAuthTabCallbackDefault(CreditCardWebViewActivity.this));
                CreditCardWebViewActivity.IAuthTabCallbackStub(CreditCardWebViewActivity.this).setVisibility(4);
                CreditCardWebViewActivity.IAuthTabCallbackStub(CreditCardWebViewActivity.this).post(CreditCardWebViewActivity.IAuthTabCallbackDefault(CreditCardWebViewActivity.this));
            }
            CreditCardWebViewActivity creditCardWebViewActivity = CreditCardWebViewActivity.this;
            if (str == null) {
                str = "";
            }
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            CreditCardWebViewActivity.onExtraCallback(256023934, new Object[]{creditCardWebViewActivity, str}, iOnExtraCallbackWithResult3, -256023931, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            String string = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (onExtraCallbackWithResult(string)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        private final boolean onExtraCallbackWithResult(String str) throws URISyntaxException {
            if (StringsKt.startsWith$default(str, "intent://", false, 2, (Object) null)) {
                try {
                    Intent uri = Intent.parseUri(str, 1);
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    uri.setSelector(null);
                    try {
                        CreditCardWebViewActivity.this.startActivity(uri);
                        Unit unit = Unit.INSTANCE;
                    } catch (ActivityNotFoundException unused) {
                        String str2 = uri.getPackage();
                        if (str2 != null) {
                            BaseActivity baseActivity = CreditCardWebViewActivity.this;
                            ReactNativeFeatureFlagsAccessor.onExtraCallback.onExtraCallback(baseActivity, "market://details?id=" + str2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                } catch (Exception e) {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CreditCardWebViewActivity", e);
                }
                return true;
            }
            if (!StringsKt.startsWith$default(str, "market://", false, 2, (Object) null)) {
                return false;
            }
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(CreditCardWebViewActivity.this);
            String string = CreditCardWebViewActivity.this.getString(R.string.app_cardrecommend___f8fccc9fa7);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(string);
            String string2 = CreditCardWebViewActivity.this.getString(im.toss.uikit.R.string.uikit_confirm);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted, string2, new CreditCardWebViewActivity$initWebView$2$.ExternalSyntheticLambda0(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onMessageChannelReady;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, Gravity.getAbsoluteGravity(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $11 + 125;
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
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onActivityLayout)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 26 - View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16800355, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 40;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $10 + 49;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i12 = $10 + 47;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.getSize(0)), 73 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 8088 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0) + 30, 19488 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        int i15 = $10 + 121;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        CookieManager.getInstance().setAcceptThirdPartyCookies(setEngagementSignalsCallback(), true);
        setEngagementSignalsCallback().removeJavascriptInterface("searchBoxJavaBridge_");
        WebSettings settings = setEngagementSignalsCallback().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("/data/data/%s/databases/temp/", Arrays.copyOf(new Object[]{getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        settings.setDatabasePath(str);
        setEngagementSignalsCallback().setWebViewClient(new onExtraCallback());
        WebView engagementSignalsCallback = setEngagementSignalsCallback();
        engagementSignalsCallback.setDownloadListener(new setBackgroundAlpha(engagementSignalsCallback, zzaj.onNavigationEvent().onUnminimized()));
        WebChromeClient rootChromeWebViewClient = new RootChromeWebViewClient(onGreatestScrollPercentageIncreased(), this);
        setEngagementSignalsCallback().setWebChromeClient(rootChromeWebViewClient);
        this.onTransact = rootChromeWebViewClient;
        int i2 = ICustomTabsCallbackStub + 7;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit access000(viva.republica.toss.cardrecommend.CreditCardWebViewActivity r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            r4.writeTypedObject = r1
            android.webkit.WebView r2 = r4.setEngagementSignalsCallback()
            java.lang.String r3 = r4.onSessionEnded()
            r2.loadUrl(r3)
            boolean r2 = r4.IAuthTabCallback_Parcel
            r2 = r2 ^ r1
            if (r2 == r1) goto L17
            goto L3b
        L17:
            int r1 = viva.republica.toss.cardrecommend.CreditCardWebViewActivity.onUnminimized
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity.ICustomTabsCallbackStub = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L47
            boolean r1 = r4.access100
            if (r1 != 0) goto L3b
            int r2 = r2 + 57
            int r1 = r2 % 128
            viva.republica.toss.cardrecommend.CreditCardWebViewActivity.onUnminimized = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L34
            r4.IEngagementSignalsCallbackStubProxy()
            goto L44
        L34:
            r4.IEngagementSignalsCallbackStubProxy()
            r3.hashCode()
            throw r3
        L3b:
            android.widget.LinearLayout r0 = r4.validateRelationship()
            java.lang.Runnable r4 = r4.extraCallbackWithResult
            r0.post(r4)
        L44:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L47:
            boolean r4 = r4.access100
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.CreditCardWebViewActivity.access000(viva.republica.toss.cardrecommend.CreditCardWebViewActivity):kotlin.Unit");
    }

    private static final Unit onWarmupCompleted(CreditCardWebViewActivity creditCardWebViewActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        creditCardWebViewActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 81;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        wasLastName waslastnameOnExtraCallbackWithResult;
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent;
        final CreditCardWebViewActivity creditCardWebViewActivity = (CreditCardWebViewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 25;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            if (creditCardWebViewActivity.onSessionEnded().length() != 0) {
                Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{creditCardWebViewActivity.onSessionEnded()});
                if (uri != null && (waslastnameOnExtraCallbackWithResult = processTransparent.onExtraCallbackWithResult(uri)) != null && (deserializeurinullablecollectionOnNavigationEvent = setMessageBytes.onNavigationEvent(waslastnameOnExtraCallbackWithResult, new Function1() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda10
                    public final Object invoke(Object obj) {
                        Object[] objArr2 = {this.f$0, (Throwable) obj};
                        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                        return (Unit) CreditCardWebViewActivity.onExtraCallback(199145338, objArr2, iOnExtraCallbackWithResult, -199145334, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                    }
                }, new Function0() { // from class: viva.republica.toss.cardrecommend.CreditCardWebViewActivity$$ExternalSyntheticLambda11
                    public final Object invoke() {
                        return CreditCardWebViewActivity.onExtraCallback(this.f$0);
                    }
                })) != null) {
                    creditCardWebViewActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
                }
                return null;
            }
            int i3 = onUnminimized + 41;
            ICustomTabsCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                creditCardWebViewActivity.finish();
                int i4 = 97 / 0;
            } else {
                creditCardWebViewActivity.finish();
            }
            return null;
        }
        creditCardWebViewActivity.onSessionEnded().length();
        throw null;
    }

    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 81;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            validateRelationship().setVisibility(1);
            validateRelationship().postDelayed(this.IAuthTabCallbackStub, 3000L);
            this.access000 = false;
        } else {
            validateRelationship().setVisibility(0);
            validateRelationship().postDelayed(this.IAuthTabCallbackStub, 3000L);
            this.access000 = true;
        }
    }

    public boolean bg_() {
        int i = 2 % 2;
        if (!setEngagementSignalsCallback().canGoBack()) {
            boolean zBg_ = super.bg_();
            int i2 = ICustomTabsCallbackStub + 99;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            return zBg_;
        }
        setEngagementSignalsCallback().goBack();
        int i4 = onUnminimized + 91;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new drawImageIconSize(i, i2, intent));
        int i4 = onUnminimized + 91;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult {
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted);
        }

        public int hashCode() {
            int iHashCode = this.IAuthTabCallback.hashCode();
            String str = this.onExtraCallback;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.onWarmupCompleted;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Banner(title=" + this.IAuthTabCallback + ", ctaText=" + this.onExtraCallback + ", url=" + this.onWarmupCompleted + ")";
        }

        public onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
            this.onExtraCallback = str2;
            this.onWarmupCompleted = str3;
        }

        public final String onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallback;
        }
    }

    private static final void IAuthTabCallbackStubProxy(CreditCardWebViewActivity creditCardWebViewActivity) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 117;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (creditCardWebViewActivity.writeTypedObject) {
            creditCardWebViewActivity.writeTypedObject = false;
            creditCardWebViewActivity.validateRelationship().setVisibility(4);
        } else {
            int i5 = i2 + 71;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ void onNavigationEvent(CreditCardWebViewActivity creditCardWebViewActivity, onExtraCallbackWithResult onextracallbackwithresult, View view) throws Throwable {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(931307451, new Object[]{creditCardWebViewActivity, onextracallbackwithresult, view}, iOnExtraCallbackWithResult, -931307443, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditCardWebViewActivity creditCardWebViewActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-970420598, new Object[]{creditCardWebViewActivity, setDetectableSize}, iOnExtraCallbackWithResult, 970420600, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ void onExtraCallback(CreditCardWebViewActivity creditCardWebViewActivity, DialogInterface dialogInterface, int i) throws Throwable {
        Object[] objArr = {creditCardWebViewActivity, dialogInterface, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(-701494701, objArr, iOnExtraCallbackWithResult, 701494706, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditCardWebViewActivity creditCardWebViewActivity, Throwable th) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(199145338, new Object[]{creditCardWebViewActivity, th}, iOnExtraCallbackWithResult, -199145334, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final /* synthetic */ boolean getInterfaceDescriptor(CreditCardWebViewActivity creditCardWebViewActivity) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(384012827, new Object[]{creditCardWebViewActivity}, iOnExtraCallbackWithResult, -384012826, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditCardWebViewActivity creditCardWebViewActivity, String str) throws Throwable {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(256023934, new Object[]{creditCardWebViewActivity, str}, iOnExtraCallbackWithResult, -256023931, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final LinearLayout ICustomTabsServiceStub() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (LinearLayout) onExtraCallback(1715147263, new Object[]{this}, iOnExtraCallbackWithResult, -1715147263, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final String onGreatestScrollPercentageIncreased() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1563385493, new Object[]{this}, iOnExtraCallbackWithResult, 1563385502, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final void IPostMessageService() throws Throwable {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(-1837287559, new Object[]{this}, iOnExtraCallbackWithResult, 1837287566, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final void onExtraCallbackWithResult(CreditCardWebViewActivity creditCardWebViewActivity, DialogInterface dialogInterface, int i) throws Throwable {
        Object[] objArr = {creditCardWebViewActivity, dialogInterface, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        onExtraCallback(-793411320, objArr, iOnExtraCallbackWithResult, 793411326, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    @Override // viva.republica.toss.cardrecommend.Hilt_CreditCardWebViewActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onUnminimized + 121;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = ICustomTabsCallbackStub + 85;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // viva.republica.toss.cardrecommend.Hilt_CreditCardWebViewActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = ICustomTabsCallbackStub + 99;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.cardrecommend.Hilt_CreditCardWebViewActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 95;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onUnminimized + 77;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    @Override // viva.republica.toss.cardrecommend.Hilt_CreditCardWebViewActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onUnminimized + 125;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        onMessageChannelReady = new char[]{64988, 64990, 64982, 64979, 64981, 64976, 64963, 64991, 64967, 64961, 64978, 64986, 64977, 64989, 64970, 64966};
        onActivityLayout = (char) 51245;
    }
}
