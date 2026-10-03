package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultMediaViewVideoRenderer;
import o.DetectClosedEyes;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.IdGeneratorExternalSyntheticLambda1;
import o.RVGroup;
import o.SignedDataParser;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addPolicy;
import o.auth;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import o.setup;
import o.zzad;
import o.zzag;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity$;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueFinCertSignActivity extends Hilt_CardIssueFinCertSignActivity {
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallbackStub;
    private static long IAuthTabCallback_Parcel;
    private static int access100;
    private static char[] getInterfaceDescriptor;
    private long IAuthTabCallbackDefault;
    private WebView asInterface;

    @Inject
    public DefaultMediaViewVideoRenderer cardIssueApi;

    @Inject
    public zzad injectedEnvironments;

    @Inject
    public zzag tossClock;

    @Inject
    public ConstraintsSizeResolverExternalSyntheticLambda0 unique;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (String) CardIssueFinCertSignActivity.onWarmupCompleted(542056117, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -542056109, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return CardIssueFinCertSignActivity.onNavigationEvent(this.f$0);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, byte r9) {
        /*
            int r7 = r7 * 2
            int r7 = 97 - r7
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r0 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.$$c(int, short, byte):java.lang.String");
    }

    static {
        access100 = 0;
        validateRelationship();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        IAuthTabCallbackStub = 8;
        int i = ICustomTabsCallback + 83;
        access100 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(cardIssueFinCertSignActivity, str);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 59;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        String str;
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {cardIssueFinCertSignActivity};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 != 0) {
            str = (String) onWarmupCompleted(1734762761, iOnWarmupCompleted2, -1734762758, iOnWarmupCompleted4, objArr, iOnWarmupCompleted, iOnWarmupCompleted3);
            int i4 = 54 / 0;
        } else {
            str = (String) onWarmupCompleted(1734762761, iOnWarmupCompleted2, -1734762758, iOnWarmupCompleted4, objArr, iOnWarmupCompleted, iOnWarmupCompleted3);
        }
        int i5 = access000 + 29;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(cardIssueFinCertSignActivity);
        int i4 = IAuthTabCallbackStubProxy + 101;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(JSONArray jSONArray, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(jSONArray, i);
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        int i6 = access000 + 35;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return charSequenceIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i | i3 | i5);
        int i8 = ~i3;
        int i9 = (~(i8 | i5)) | (~((~i5) | i));
        int i10 = (~(i5 | (~i))) | i8;
        int i11 = i + i3 + i2 + ((-2044576983) * i6) + (1743660113 * i4);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i) - 713031680) + (164951516 * i3) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i2) + (689963008 * i6) + ((-299892736) * i4) + ((-1081737216) * i12);
        int i14 = ((i * 2048727874) - 782056376) + (i3 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i2 * 2048728315) + (i6 * 2142076211) + (i4 * (-1448904853)) + (i12 * 1885470720);
        switch (i13 + (i14 * i14 * (-1618345984))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
                int i15 = 2 % 2;
                int i16 = access000 + 51;
                IAuthTabCallbackStubProxy = i16 % 128;
                if (i16 % 2 != 0) {
                    IAuthTabCallback(cardIssueFinCertSignActivity, "makeAutoConnInfo", null, 4, null);
                } else {
                    IAuthTabCallback(cardIssueFinCertSignActivity, "makeAutoConnInfo", null, 2, null);
                }
                int i17 = IAuthTabCallbackStubProxy + 107;
                access000 = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = RVGroup.onWarmupCompleted();
            int iOnWarmupCompleted2 = RVGroup.onWarmupCompleted();
            int iOnWarmupCompleted3 = RVGroup.onWarmupCompleted();
            onWarmupCompleted(836170520, iOnWarmupCompleted2, -836170515, RVGroup.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, iOnWarmupCompleted3);
            return null;
        }
        int iOnWarmupCompleted4 = RVGroup.onWarmupCompleted();
        int iOnWarmupCompleted5 = RVGroup.onWarmupCompleted();
        int iOnWarmupCompleted6 = RVGroup.onWarmupCompleted();
        onWarmupCompleted(836170520, iOnWarmupCompleted5, -836170515, RVGroup.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted4, iOnWarmupCompleted6);
        int i3 = 10 / 0;
        return null;
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        cardIssueFinCertSignActivity.IAuthTabCallbackDefault = j;
        int i5 = i3 + 53;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.IAuthTabCallback(str);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.onWarmupCompleted(str, str2);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 73;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ String IAuthTabCallbackDefault(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnVerticalScrollEvent = cardIssueFinCertSignActivity.onVerticalScrollEvent();
        int i4 = access000 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnVerticalScrollEvent;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.IPostMessageServiceDefault();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void asBinder(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-182665877, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 182665881, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1182116706, new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, RVGroup.onWarmupCompleted());
        int i4 = access000 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.onExtraCallbackWithResult(str, str2);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ long onExtraCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int i = 2 % 2;
        int i2 = access000 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return cardIssueFinCertSignActivity.IAuthTabCallbackDefault;
        }
        long j = cardIssueFinCertSignActivity.IAuthTabCallbackDefault;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.updateVisuals();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.IEngagementSignalsCallbackStubProxy();
        int i4 = access000 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, CardIssueFinCertPrepareResp cardIssueFinCertPrepareResp) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            cardIssueFinCertSignActivity.IAuthTabCallback(cardIssueFinCertPrepareResp);
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = cardIssueFinCertSignActivity.IAuthTabCallback(cardIssueFinCertPrepareResp);
        int i3 = IAuthTabCallbackStubProxy + 53;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.onExtraCallbackWithResult(str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsService_Parcel = cardIssueFinCertSignActivity.ICustomTabsService_Parcel();
        int i4 = access000 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strICustomTabsService_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFinCertSignActivity.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 39;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final ConstraintsSizeResolverExternalSyntheticLambda0 ICustomTabsServiceStub() {
        int i = 2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = this.unique;
        if (constraintsSizeResolverExternalSyntheticLambda0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = access000;
        int i3 = i2 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return constraintsSizeResolverExternalSyntheticLambda0;
    }

    public final DefaultMediaViewVideoRenderer IAuthTabCallback() {
        int i = 2 % 2;
        DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer = this.cardIssueApi;
        if (defaultMediaViewVideoRenderer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = access000;
        int i3 = i2 + 97;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = i2 + 21;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return defaultMediaViewVideoRenderer;
    }

    public final zzag setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 75;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        zzag zzagVar = this.tossClock;
        if (zzagVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 123;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return zzagVar;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 35;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = cardIssueFinCertSignActivity.injectedEnvironments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 73;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 23;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            return zzadVar;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onWarmupCompleted = -5782399185595819065L;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 19;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 57;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $10 + 69;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) CardIssueFinCertSignActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{7811, 50744, 45017, 38020, 31789, 9726, 2704, 61954, 56316}, KeyEvent.normalizeMetaState(0) + 55469, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("purpose", str2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 81;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (cardIssueFinCertSignActivity.injectedEnvironments == null) {
            Object obj = null;
            auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: CardIssueFinCertSignActivity"), (Map) null, 2, (Object) null);
            zzad zzadVarOnNavigationEvent = zzaj.onNavigationEvent();
            int i5 = IAuthTabCallbackStubProxy + 5;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return zzadVarOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = i2 + 27;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (zzad) onWarmupCompleted(776387822, iOnWarmupCompleted2, -776387822, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    private final String access200() {
        int i = 2 % 2;
        int i2 = access000 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (!((zzad) onWarmupCompleted(1693542179, iOnWarmupCompleted2, -1693542170, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3)).RemoteActionCompatParcelizer()) {
            return "file:///android_asset/fincert/fincert_live.html";
        }
        int i4 = IAuthTabCallbackStubProxy + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return "file:///android_asset/fincert/fincert_alpha.html";
        }
        int i5 = 5 / 0;
        return "file:///android_asset/fincert/fincert_alpha.html";
    }

    private final String IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            ((zzad) onWarmupCompleted(1693542179, iOnWarmupCompleted2, -1693542170, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3)).RemoteActionCompatParcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (!((zzad) onWarmupCompleted(1693542179, iOnWarmupCompleted5, -1693542170, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted4, iOnWarmupCompleted6)).RemoteActionCompatParcelizer()) {
            return "RF50310000";
        }
        int i3 = IAuthTabCallbackStubProxy + 111;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return "DF50310000";
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 111;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(getInterfaceDescriptor[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 59697), 17 - Color.argb(0, 0, 0, 0), 10973 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myTid() >> 22)), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.red(0)), 44 - TextUtils.getOffsetAfter("", 0), 1494 - KeyEvent.keyCodeFromString(""), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 49123), MotionEvent.axisFromString("") + 45, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private final String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (!((zzad) onWarmupCompleted(1693542179, iOnWarmupCompleted2, -1693542170, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3)).RemoteActionCompatParcelizer()) {
            return "1b53cb90-83ae-40a8-a05f-78b746b08ee3";
        }
        int i4 = access000 + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return "b752f6e6-5673-4e5f-81e8-f64c12717eb2";
        }
        int i5 = 67 / 0;
        return "b752f6e6-5673-4e5f-81e8-f64c12717eb2";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String IAuthTabCallbackStubProxy(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity r7) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.access000 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            android.content.Intent r7 = r7.getIntent()
            if (r1 != 0) goto L46
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = android.graphics.PointF.length(r1, r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r4 = 114(0x72, float:1.6E-43)
            int r1 = r4 >> r1
            int r4 = android.graphics.Color.argb(r2, r2, r3, r2)
            int r4 = r4 * 61
            int r5 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r5 = (byte) r5
            r6 = 15293(0x3bbd, float:2.143E-41)
            int r5 = r6 << r5
            char r5 = (char) r5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r1, r4, r5, r2)
            r1 = r2[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r7 = r7.getStringExtra(r1)
            if (r7 != 0) goto L72
            goto L70
        L46:
            r1 = 0
            float r4 = android.graphics.PointF.length(r1, r1)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            int r1 = r1 + 34
            int r4 = android.graphics.Color.argb(r3, r3, r3, r3)
            int r4 = r4 + 9
            int r5 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r5 = (byte) r5
            int r5 = r5 + 18058
            char r5 = (char) r5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r1, r4, r5, r2)
            r1 = r2[r3]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r7 = r7.getStringExtra(r1)
            if (r7 != 0) goto L72
        L70:
            java.lang.String r7 = ""
        L72:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.access000
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L80
            r0 = 30
            int r0 = r0 / r3
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity.IAuthTabCallbackStubProxy(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity):java.lang.String");
    }

    private final String onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = IAuthTabCallbackStubProxy + 87;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        int i4 = access000 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        String stringExtra = ((CardIssueFinCertSignActivity) objArr[0]).getIntent().getStringExtra("purpose");
        if (stringExtra == null) {
            return "PUBLIC_MYDATA";
        }
        if (StringsKt.isBlank(stringExtra)) {
            int i2 = access000 + 23;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 4;
            }
            stringExtra = null;
        }
        if (stringExtra == null) {
            return "PUBLIC_MYDATA";
        }
        int i4 = access000 + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CardIssueFinCertSignActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView(webView);
        this.asInterface = webView;
        IEngagementSignalsCallbackStub();
        WebView webView2 = this.asInterface;
        if (webView2 == null) {
            int i2 = access000 + 91;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            webView2 = null;
        }
        webView2.loadUrl(access200());
    }

    public void onDestroy() {
        Unit unit;
        int i = 2 % 2;
        WebView webView = null;
        try {
            Result.Companion companion = Result.Companion;
            WebView webView2 = this.asInterface;
            if (webView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView2 = null;
            }
            webView2.removeJavascriptInterface("yeskeyAndroid");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            WebView webView3 = this.asInterface;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView3 = null;
            }
            webView3.stopLoading();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        try {
            Result.Companion companion5 = Result.Companion;
            WebView webView4 = this.asInterface;
            if (webView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView4 = null;
            }
            webView4.loadUrl("about:blank");
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th3));
        }
        try {
            Result.Companion companion7 = Result.Companion;
            WebView webView5 = this.asInterface;
            if (webView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView5 = null;
            }
            webView5.setWebChromeClient(null);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th4));
        }
        try {
            Result.Companion companion9 = Result.Companion;
            WebView webView6 = this.asInterface;
            if (webView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                webView6 = null;
            }
            webView6.setWebViewClient(new WebViewClient());
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th5));
        }
        try {
            Result.Companion companion11 = Result.Companion;
            WebView webView7 = this.asInterface;
            if (webView7 == null) {
                int i2 = access000 + 11;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = IAuthTabCallbackStubProxy + 45;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                webView7 = null;
            }
            ViewParent parent = webView7.getParent();
            ViewGroup viewGroup = !((parent instanceof ViewGroup) ^ true) ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView8 = this.asInterface;
                if (webView8 == null) {
                    int i6 = access000 + 75;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    webView8 = null;
                }
                viewGroup.removeView(webView8);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.constructor-impl(unit);
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th6));
        }
        try {
            Result.Companion companion13 = Result.Companion;
            WebView webView9 = this.asInterface;
            if (webView9 == null) {
                int i8 = access000 + 37;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i10 = IAuthTabCallbackStubProxy + 67;
                access000 = i10 % 128;
                int i11 = i10 % 2;
            } else {
                webView = webView9;
            }
            webView.destroy();
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th7));
        }
        super.onDestroy();
    }

    public static final class onNavigationEvent extends WebViewClient {
        onNavigationEvent() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "onPageFinished: " + str, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            CardIssueFinCertSignActivity.IAuthTabCallback(CardIssueFinCertSignActivity.this, "loadSdk", null, 2, null);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "onReceivedError: " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " code=" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + " desc=" + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)), (Throwable) null, (Map) null, 12, (Object) null);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "onReceivedHttpError: " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " status=" + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null), (Throwable) null, (Map) null, 12, (Object) null);
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "onReceivedSslError: " + (sslError != null ? sslError.getUrl() : null) + " primaryError=" + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null), (Throwable) null, (Map) null, 12, (Object) null);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        WebView webView = this.asInterface;
        WebView webView2 = null;
        if (webView == null) {
            int i2 = IAuthTabCallbackStubProxy + 29;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        WebView webView3 = this.asInterface;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView3 = null;
        }
        webView3.addJavascriptInterface(new onWarmupCompleted(this), "yeskeyAndroid");
        WebView webView4 = this.asInterface;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView4 = null;
        }
        webView4.setWebViewClient(new onNavigationEvent());
        WebView webView5 = this.asInterface;
        if (webView5 == null) {
            int i4 = access000 + 125;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            webView2 = webView5;
        }
        webView2.setWebChromeClient(new onExtraCallback(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orgCode", IEngagementSignalsCallback());
        jSONObject.put("apiKey", ICustomTabsServiceStubProxy());
        jSONObject.put("clientOrigin", getPackageName());
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - KeyEvent.normalizeMetaState(0), (char) (Color.blue(0) + 25724), objArr);
        jSONObject.put(((String) objArr[0]).intern(), "ANDROID");
        jSONObject.put("uniqVal", ICustomTabsServiceStub().onNavigationEvent());
        jSONObject.put("lang", "kor");
        jSONObject.put("showAutoConn", false);
        jSONObject.put("useAutoConnInfo", true);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i2 = IAuthTabCallbackStubProxy + 49;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return string;
    }

    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted("initSdk", ICustomTabsServiceDefault());
        int i4 = access000 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        if (IEngagementSignalsCallbackDefault()) {
            int i2 = IAuthTabCallbackStubProxy + 23;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(onSessionEnded());
            return;
        }
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-182665877, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 182665881, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1182116706, new Object[]{this}, iOnWarmupCompleted, RVGroup.onWarmupCompleted());
        int i4 = access000 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        onWarmupCompleted("setAutoConnInfo", new JSONObject().put("autoConnInfo", str).toString());
        int i2 = IAuthTabCallbackStubProxy + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueFinCertSignActivity.this.new asInterface(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CardIssueFinCertPrepareResp>, Object> {
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CardIssueFinCertSignActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(access13800 access13800Var, CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
                super(2, access13800Var);
                this.this$0 = cardIssueFinCertSignActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onWarmupCompleted(access13800Var, this.this$0);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super CardIssueFinCertPrepareResp> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DefaultMediaViewVideoRenderer defaultMediaViewVideoRendererIAuthTabCallback = this.this$0.IAuthTabCallback();
                    CardIssueFinCertPrepareRequest cardIssueFinCertPrepareRequest = new CardIssueFinCertPrepareRequest(CardIssueFinCertSignActivity.IAuthTabCallbackDefault(this.this$0), CardIssueFinCertSignActivity.onWarmupCompleted(this.this$0));
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = defaultMediaViewVideoRendererIAuthTabCallback.onExtraCallback(cardIssueFinCertPrepareRequest, (access13800<? super BaseApiResponse<CardIssueFinCertPrepareResp>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (CardIssueFinCertPrepareResp) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.cardsales.funnel.CardIssueFinCertPrepareResp");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(CardIssueFinCertPrepareResp.class, Object.class) || Intrinsics.areEqual(CardIssueFinCertPrepareResp.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    CardIssueFinCertSignActivity cardIssueFinCertSignActivity = CardIssueFinCertSignActivity.this;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null, cardIssueFinCertSignActivity);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            CardIssueFinCertSignActivity cardIssueFinCertSignActivity2 = CardIssueFinCertSignActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                CardIssueFinCertPrepareResp cardIssueFinCertPrepareResp = (CardIssueFinCertPrepareResp) obj2;
                CardIssueFinCertSignActivity.IAuthTabCallback(cardIssueFinCertSignActivity2, cardIssueFinCertPrepareResp.IAuthTabCallback());
                Object[] objArr = {cardIssueFinCertSignActivity2, "sign", CardIssueFinCertSignActivity.onNavigationEvent(cardIssueFinCertSignActivity2, cardIssueFinCertPrepareResp)};
                int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
                CardIssueFinCertSignActivity.onWarmupCompleted(1088403031, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1088403025, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
            }
            CardIssueFinCertSignActivity cardIssueFinCertSignActivity3 = CardIssueFinCertSignActivity.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "prepareFinCertSign failed", th, (Map) null, 8, (Object) null);
                CardIssueFinCertSignActivity.onExtraCallbackWithResult(cardIssueFinCertSignActivity3);
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueFinCertSignActivity cardIssueFinCertSignActivity = (CardIssueFinCertSignActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(cardIssueFinCertSignActivity), (CoroutineContext) null, (setRandomHost) null, cardIssueFinCertSignActivity.new asInterface(null), 3, (Object) null);
        int i2 = access000 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(String str) throws Throwable {
        Object obj;
        String strOptString;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(new JSONObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        String strOptString2 = null;
        if (Result.onExtraCallback(obj)) {
            int i2 = IAuthTabCallbackStubProxy + 65;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 92 / 0;
            }
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            int i4 = access000 + 21;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                strOptString = jSONObject.optString("certSeqNum");
                int i5 = 57 / 0;
            } else {
                strOptString = jSONObject.optString("certSeqNum");
            }
        } else {
            strOptString = null;
        }
        if (strOptString == null) {
            int i6 = access000 + 111;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            strOptString = "";
        }
        String strIAuthTabCallback = jSONObject != null ? IAuthTabCallback(jSONObject) : null;
        if (strIAuthTabCallback == null) {
            int i8 = access000 + 87;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            strIAuthTabCallback = "";
        }
        if (jSONObject != null) {
            int i10 = IAuthTabCallbackStubProxy + 43;
            access000 = i10 % 128;
            int i11 = i10 % 2;
            strOptString2 = jSONObject.optString("rValue");
        }
        String str2 = strOptString2 != null ? strOptString2 : "";
        if (!StringsKt.isBlank(strIAuthTabCallback)) {
            int i12 = access000 + 113;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
            if (!StringsKt.isBlank(strOptString) && !StringsKt.isBlank(str2)) {
                onNavigationEvent(strIAuthTabCallback, strOptString, str2);
                return;
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "sign failed or unexpected result: " + str, (Throwable) null, (Map) null, 12, (Object) null);
        updateVisuals();
    }

    private static final CharSequence IAuthTabCallback(JSONArray jSONArray, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 27;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        String strOptString = jSONArray.optString(i);
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        int i5 = access000 + 29;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return strOptString;
    }

    private final String IAuthTabCallback(JSONObject jSONObject) {
        int i = 2 % 2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("signedVals");
        if (jSONArrayOptJSONArray == null) {
            int i2 = access000 + 101;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(RangesKt.until(0, jSONArrayOptJSONArray.length()), "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new CardIssueFinCertSignActivity$.ExternalSyntheticLambda3(jSONArrayOptJSONArray), 30, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 17;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return strJoinToString$default;
    }

    private final void onNavigationEvent(String str, String str2, String str3) throws Throwable {
        String str4;
        int i = 2 % 2;
        IdGeneratorExternalSyntheticLambda1.onExtraCallback onextracallback = IdGeneratorExternalSyntheticLambda1.Companion;
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022888).substring(0, 28).length() - 14, (char) (51968 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback = onextracallback.onExtraCallback(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 24, 10 - (KeyEvent.getMaxKeyCode() >> 16), (char) (48834 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
        TimeZone timeZone = DesugarTimeZone.getTimeZone(((String) objArr2[0]).intern());
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        idGeneratorExternalSyntheticLambda1OnExtraCallback.setTimeZone(timeZone);
        String str5 = idGeneratorExternalSyntheticLambda1OnExtraCallback.format(setEngagementSignalsCallback().asBinder());
        String strOnExtraCallbackWithResult = SignedDataParser.IAuthTabCallback.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            int i2 = access000;
            int i3 = i2 + 9;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            str4 = "";
        } else {
            str4 = strOnExtraCallbackWithResult;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, str, str2, str5, str3, str4, (access13800) null), 3, (Object) null);
    }

    private final void onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", str + " failed: " + str2, (Throwable) null, (Map) null, 12, (Object) null);
        updateVisuals();
        int i2 = access000 + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        setResult(1);
        finish();
        int i4 = IAuthTabCallbackStubProxy + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void IAuthTabCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 53;
        access000 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i3 + 125;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        cardIssueFinCertSignActivity.onWarmupCompleted(str, str2);
    }

    private final void onWarmupCompleted(String str, String str2) {
        final String str3;
        int i = 2 % 2;
        int i2 = access000 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (str2 == null) {
            str3 = str + "()";
        } else {
            str3 = str + "('" + onNavigationEvent(str2) + "')";
        }
        WebView webView = this.asInterface;
        if (webView == null) {
            int i4 = IAuthTabCallbackStubProxy + 83;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            webView = null;
        }
        webView.post(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CardIssueFinCertSignActivity.onExtraCallback(this.f$0, str3);
            }
        });
    }

    private static final void onExtraCallbackWithResult(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str) {
        int i = 2 % 2;
        WebView webView = cardIssueFinCertSignActivity.asInterface;
        if (webView == null) {
            int i2 = access000 + 79;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IAuthTabCallbackStubProxy + 9;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            webView = null;
        }
        webView.evaluateJavascript(str, null);
    }

    private final String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        String strReplace$default = i2 % 2 != 0 ? StringsKt.replace$default(StringsKt.replace$default(str, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", true, 5, (Object) null) : StringsKt.replace$default(StringsKt.replace$default(str, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null);
        int i3 = IAuthTabCallbackStubProxy + 97;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return strReplace$default;
    }

    private final String IAuthTabCallback(CardIssueFinCertPrepareResp cardIssueFinCertPrepareResp) throws Throwable {
        boolean zBooleanValue;
        Object objPut;
        int i = 2 % 2;
        JSONArray jSONArray = new JSONArray();
        for (String str : cardIssueFinCertPrepareResp.onWarmupCompleted()) {
            try {
                Result.Companion companion = Result.Companion;
                objPut = Result.constructor-impl(new JSONObject(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objPut = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(objPut) != null) {
                JSONObject jSONObject = new JSONObject();
                Object[] objArr = new Object[1];
                a(View.resolveSize(0, 0) + 43, 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), objArr);
                objPut = jSONObject.put(((String) objArr[0]).intern(), str);
            }
            jSONArray.put(objPut);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Boolean boolIAuthTabCallbackDefault = cardIssueFinCertPrepareResp.IAuthTabCallbackDefault();
        if (boolIAuthTabCallbackDefault != null) {
            zBooleanValue = boolIAuthTabCallbackDefault.booleanValue();
        } else {
            int i2 = IAuthTabCallbackStubProxy + 107;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 5;
            }
            zBooleanValue = true;
        }
        jSONObject2.put("signFormat", jSONObject3.put("CMSInfo", jSONObject4.put("withoutContent", zBooleanValue).put("includeR", true)));
        jSONObject2.put("content", new JSONObject().put("plainText", new JSONObject().put("plainTexts", jSONArray)));
        JSONObject jSONObject5 = new JSONObject();
        String strOnExtraCallbackWithResult = cardIssueFinCertPrepareResp.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            int i4 = access000 + 55;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallbackWithResult = "01";
        }
        jSONObject2.put("info", jSONObject5.put("signType", strOnExtraCallbackWithResult));
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i6 = IAuthTabCallbackStubProxy + 3;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private final boolean IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            addPolicy.IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult("fincert_auto_conn_info", "").length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (addPolicy.IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult("fincert_auto_conn_info", "").length() <= 0) {
            return false;
        }
        int i3 = access000 + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private final String onSessionEnded() {
        Object obj;
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj2 = "";
        try {
            if (i2 % 2 != 0) {
                Result.Companion companion = Result.Companion;
                strOnNavigationEvent = setup.onNavigationEvent(DetectClosedEyes.onWarmupCompleted.onNavigationEvent(), addPolicy.IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult("fincert_auto_conn_info", ""), 1, 3, (Object) null);
            } else {
                Result.Companion companion2 = Result.Companion;
                strOnNavigationEvent = setup.onNavigationEvent(DetectClosedEyes.onWarmupCompleted.onNavigationEvent(), addPolicy.IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult("fincert_auto_conn_info", ""), 0, 2, (Object) null);
            }
            obj = Result.constructor-impl(strOnNavigationEvent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i3 = access000;
            int i4 = i3 + 69;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 61;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        } else {
            obj2 = obj;
        }
        return (String) obj2;
    }

    private final void onWarmupCompleted(String str) {
        Object obj;
        Unit unit;
        int i = 2 % 2;
        int i2 = access000 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Result.Companion companion = Result.Companion;
                addPolicy.IEngagementSignalsCallback_Parcel().onNavigationEvent("fincert_auto_conn_info", setup.IAuthTabCallback(DetectClosedEyes.onWarmupCompleted.IAuthTabCallback(), str, 1, 3, (Object) null));
                unit = Unit.INSTANCE;
            } else {
                Result.Companion companion2 = Result.Companion;
                addPolicy.IEngagementSignalsCallback_Parcel().onNavigationEvent("fincert_auto_conn_info", setup.IAuthTabCallback(DetectClosedEyes.onWarmupCompleted.IAuthTabCallback(), str, 0, 2, (Object) null));
                unit = Unit.INSTANCE;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FinCertSign", "storeAutoConnInfo failed", th2, (Map) null, 8, (Object) null);
            int i3 = IAuthTabCallbackStubProxy + 113;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 5;
            }
        }
    }

    public static /* synthetic */ String IAuthTabCallback(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(542056117, iOnWarmupCompleted2, -542056109, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public static final /* synthetic */ void onWarmupCompleted(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str, String str2) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1088403031, iOnWarmupCompleted2, -1088403025, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity, str, str2}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public static final /* synthetic */ void onNavigationEvent(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str, String str2) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-1100953745, iOnWarmupCompleted2, 1100953752, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity, str, str2}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public static final /* synthetic */ void onTransact(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1794964406, iOnWarmupCompleted2, -1794964405, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public static final /* synthetic */ void asInterface(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-238355895, iOnWarmupCompleted2, 238355897, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    private final zzad writeTypedList() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (zzad) onWarmupCompleted(1693542179, iOnWarmupCompleted2, -1693542170, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    private final void onGreatestScrollPercentageIncreased() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-182665877, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 182665881, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1182116706, new Object[]{this}, iOnWarmupCompleted, RVGroup.onWarmupCompleted());
    }

    private static final String access000(CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onWarmupCompleted(1734762761, iOnWarmupCompleted2, -1734762758, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueFinCertSignActivity}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    private final void IEngagementSignalsCallback_Parcel() {
        int iOnWarmupCompleted = RVGroup.onWarmupCompleted();
        int iOnWarmupCompleted2 = RVGroup.onWarmupCompleted();
        int iOnWarmupCompleted3 = RVGroup.onWarmupCompleted();
        onWarmupCompleted(836170520, iOnWarmupCompleted2, -836170515, RVGroup.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public final zzad onNavigationEvent() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (zzad) onWarmupCompleted(776387822, iOnWarmupCompleted2, -776387822, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CardIssueFinCertSignActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CardIssueFinCertSignActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CardIssueFinCertSignActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 77;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CardIssueFinCertSignActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void validateRelationship() {
        getInterfaceDescriptor = new char[]{35275, 4167, 47815, 17732, 61386, 30291, 4334, 47940, 17856, 60502, 9900, 48943, 5546, 59941, 16532, 55575, 49059, 5156, 60037, 17158, 55718, 48665, 5250, 60673, 21332, 51941, 24698, 40957, 13622, 44233, 51810, 25071, 40824, 14050, 43822, 12987, 38952, 26535, 52536, 21693, 12833, 39297, 26401, 60848, 29750, 56998, 8508};
        IAuthTabCallback_Parcel = 7898293385237394519L;
    }
}
