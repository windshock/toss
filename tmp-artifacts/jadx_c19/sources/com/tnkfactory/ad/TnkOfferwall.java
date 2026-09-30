package com.tnkfactory.ad;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.tnkfactory.ad.TnkOfferwall$;
import com.tnkfactory.ad.TnkOfferwall$forceJoin$1$;
import com.tnkfactory.ad.TnkOfferwall$getAdlistJson$1$;
import com.tnkfactory.ad.a.p;
import com.tnkfactory.ad.a.r;
import com.tnkfactory.ad.a.v;
import com.tnkfactory.ad.a.y;
import com.tnkfactory.ad.basic.AdDetailWebView;
import com.tnkfactory.ad.basic.AdListDetailViewDialog;
import com.tnkfactory.ad.basic.AdPlacementView;
import com.tnkfactory.ad.basic.TnkAdMyMenu;
import com.tnkfactory.ad.basic.TnkEmbedAdList;
import com.tnkfactory.ad.basic.TnkEmbedAdListFeedDialog;
import com.tnkfactory.ad.basic.TnkEmbedNewList;
import com.tnkfactory.ad.customtab.TnkCustomTabActivityHelper;
import com.tnkfactory.ad.customtab.TnkWebviewFallback;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.TnkAdListImpl;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.repository.rpc.parser.AdListParser;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkApi;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import com.tnkfactory.framework.vo.ValueObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ComponentModelb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.removeOnContextAvailableListener;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkOfferwall {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] onExtraCallbackWithResult = {337539095, -204363961, -849993460, 106928844, -2077122779, 1261156782, 225962893, 1590865727, -1702733554, -1367504505, -2130371682, -161293251, -502783300, -1574315454, 1887661236, -104564990, -1559687493, 2141711506};
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Context context;
    private AdEventHandler mEventHandler;
    private TnkContext tnkContext;

    /* renamed from: $r8$lambda$58zEL-m3KuRwkAFQC1dkVo3oVzk, reason: not valid java name */
    public static /* synthetic */ void m134$r8$lambda$58zELm3KuRwkAFQC1dkVo3oVzk(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        adDetail$lambda$14$lambda$13$lambda$12(function2, tnkError);
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
    }

    /* renamed from: $r8$lambda$6aCF7h_zBCouJtK86T-05AKqBSk, reason: not valid java name */
    public static /* synthetic */ void m135$r8$lambda$6aCF7h_zBCouJtK86T05AKqBSk(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        showAdDetailDialog$lambda$5$lambda$4(function2, tnkOfferwall, context, adListVo);
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        int i6 = onWarmupCompleted + 17;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ Unit $r8$lambda$6uf0dh0vclZ1_lMTC2j_zxrFMmw(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAdJoin$lambda$18$lambda$17 = adJoin$lambda$18$lambda$17(function2, tnkError);
        int i5 = onWarmupCompleted + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitAdJoin$lambda$18$lambda$17;
    }

    /* renamed from: $r8$lambda$8Qdr-bq3akpYS8Yl0DPcnKf6icA, reason: not valid java name */
    public static /* synthetic */ Unit m136$r8$lambda$8Qdrbq3akpYS8Yl0DPcnKf6icA(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitShowAdDetailDialog$lambda$7 = showAdDetailDialog$lambda$7(function2, tnkError);
        if (i4 == 0) {
            int i5 = 43 / 0;
        }
        return unitShowAdDetailDialog$lambda$7;
    }

    /* renamed from: $r8$lambda$9jRf5ZrfVhdi-EDSni4KeKtA8oY, reason: not valid java name */
    public static /* synthetic */ void m137$r8$lambda$9jRf5ZrfVhdiEDSni4KeKtA8oY(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        adJoin$lambda$18$lambda$17$lambda$16(function2, tnkError);
        int i5 = onNavigationEvent + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
    }

    /* renamed from: $r8$lambda$AwiUe5AdL-qpMd-Xe5p35hAuvgo, reason: not valid java name */
    public static /* synthetic */ Unit m138$r8$lambda$AwiUe5AdLqpMdXe5p35hAuvgo(TnkOfferwall tnkOfferwall, Context context, Function2 function2, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAdAction$lambda$21 = adAction$lambda$21(tnkOfferwall, context, function2, adListVo);
        int i5 = onNavigationEvent + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAdAction$lambda$21;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$Ek1eIPSnK_LhPRxLSi0pBx_K4yw(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAdDetail$lambda$14$lambda$11 = adDetail$lambda$14$lambda$11(function2, tnkOfferwall, context, adListVo);
        int i5 = onNavigationEvent + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitAdDetail$lambda$14$lambda$11;
    }

    public static /* synthetic */ void $r8$lambda$FwVUQDPg3VShYD2bSnyAJAEZU9g(AdListVo adListVo, TnkOfferwall tnkOfferwall, Context context, Function2 function2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        adAction$lambda$21$lambda$20(adListVo, tnkOfferwall, context, function2);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$H2dr3VrhmyLyQK1mIHxslK9QV48(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitTermsCheck$lambda$27 = termsCheck$lambda$27(function1);
        int i5 = onWarmupCompleted + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitTermsCheck$lambda$27;
    }

    public static /* synthetic */ Unit $r8$lambda$NNEMtceSVUSqRwR3zK869xq8K5w(Function1 function1, TnkOffRepository.EventLinkVo eventLinkVo, boolean z, String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit eventLink$lambda$29 = getEventLink$lambda$29(function1, eventLinkVo, z, str);
        if (i4 != 0) {
            int i5 = 76 / 0;
        }
        return eventLink$lambda$29;
    }

    /* renamed from: $r8$lambda$P_0-_vXQzoCd3dhkNOP0n3-xldk, reason: not valid java name */
    public static /* synthetic */ Unit m139$r8$lambda$P_0_vXQzoCd3dhkNOP0n3xldk(long j, int i2, TnkOfferwall tnkOfferwall, Context context, Function2 function2, boolean z) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAdJoin$lambda$18 = adJoin$lambda$18(j, i2, tnkOfferwall, context, function2, z);
        int i6 = onNavigationEvent + 117;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitAdJoin$lambda$18;
    }

    public static /* synthetic */ Unit $r8$lambda$TxqAo_NejBteToimP3LRt3jfEMo(Function2 function2, Context context, long j, TnkOffRepository.EventLinkVo eventLinkVo, boolean z, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOpenEventWebView$lambda$30 = openEventWebView$lambda$30(function2, context, j, eventLinkVo, z, str);
        if (i4 != 0) {
            int i5 = 86 / 0;
        }
        return unitOpenEventWebView$lambda$30;
    }

    public static /* synthetic */ Unit $r8$lambda$U6enMQO8Yg62BQJVN0K9Cn8YWX4(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitTermsCheck$lambda$26 = termsCheck$lambda$26(function1);
        int i5 = onWarmupCompleted + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitTermsCheck$lambda$26;
    }

    /* renamed from: $r8$lambda$Wyuyd7D_jYPe84RzDm-zuUyB038, reason: not valid java name */
    public static /* synthetic */ Unit m140$r8$lambda$Wyuyd7D_jYPe84RzDmzuUyB038(TnkOfferwall tnkOfferwall, Context context, long j, int i2, Function2 function2, boolean z) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAdAction$lambda$19 = adAction$lambda$19(tnkOfferwall, context, j, i2, function2, z);
        int i6 = onWarmupCompleted + 109;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 78 / 0;
        }
        return unitAdAction$lambda$19;
    }

    public static /* synthetic */ Unit $r8$lambda$ahk7hlUnATWXj5Ymh_rpIGfzNls(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitShowAdDetailDialog$lambda$5 = showAdDetailDialog$lambda$5(function2, tnkOfferwall, context, adListVo);
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitShowAdDetailDialog$lambda$5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$d-jpFk1O0o66EQsh4ixjJyCy0HU, reason: not valid java name */
    public static /* synthetic */ void m141$r8$lambda$djpFk1O0o66EQsh4ixjJyCy0HU(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        adDetail$lambda$14$lambda$11$lambda$10(function2, tnkOfferwall, context, adListVo);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$dkPUMWM41pVqYQ5gIBn0-GiOrDU, reason: not valid java name */
    public static /* synthetic */ void m142$r8$lambda$dkPUMWM41pVqYQ5gIBn0GiOrDU(Function2 function2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        forceJoin$lambda$25$lambda$24(function2);
        int i5 = onWarmupCompleted + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$i03i5NlhbRWjliyeeCF5G8hG5fw(TnkOfferwall tnkOfferwall, Context context, Function2 function2, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAdJoin$lambda$18$lambda$15 = adJoin$lambda$18$lambda$15(tnkOfferwall, context, function2, adListVo);
        int i5 = onWarmupCompleted + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAdJoin$lambda$18$lambda$15;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$ltJBQtpWeaMdAeg1yNgmBhJeKMA(TnkOfferwall tnkOfferwall, long j, int i2, Function2 function2, Context context, boolean z) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return adDetail$lambda$14(tnkOfferwall, j, i2, function2, context, z);
        }
        adDetail$lambda$14(tnkOfferwall, j, i2, function2, context, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$o1_w7WO3uUGBRK89JiaMT5GXlo4(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            showTermsDialog$lambda$9(function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitShowTermsDialog$lambda$9 = showTermsDialog$lambda$9(function1);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return unitShowTermsDialog$lambda$9;
    }

    /* renamed from: $r8$lambda$o2zS-bc3Ec4X6aG3LSjTcCh5VnM, reason: not valid java name */
    public static /* synthetic */ Unit m143$r8$lambda$o2zSbc3Ec4X6aG3LSjTcCh5VnM(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return showTermsDialog$lambda$8(function1);
        }
        showTermsDialog$lambda$8(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$p76MCL8esqv_6dXNX8Xnw4RfWJg(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 27;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            adDetail$lambda$14$lambda$13(function2, tnkError);
            throw null;
        }
        Unit unitAdDetail$lambda$14$lambda$13 = adDetail$lambda$14$lambda$13(function2, tnkError);
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAdDetail$lambda$14$lambda$13;
    }

    public static /* synthetic */ void $r8$lambda$ufYaXuna1b7Rjvm71ivzN0ZQxA4(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        showAdDetailDialog$lambda$7$lambda$6(function2, tnkError);
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$wQzO0TXAWGwBuzM6Bx4qiPtRD9A(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        adAction$lambda$23$lambda$22(function2, tnkError);
        int i5 = onNavigationEvent + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit $r8$lambda$zcBZCxOmdnN0QiW4fRvLt6X0bSc(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAdAction$lambda$23 = adAction$lambda$23(function2, tnkError);
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAdAction$lambda$23;
        }
        throw null;
    }

    public TnkOfferwall(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        TnkCore tnkCore = TnkCore.INSTANCE;
        if (!tnkCore.isInitialized()) {
            tnkCore.init(context);
        }
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            this.tnkContext = new TnkContext(fragmentActivity);
            this.mEventHandler = new AdEventHandler(fragmentActivity);
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void adAction$default(TnkOfferwall tnkOfferwall, Context context, long j, int i2, Function2 function2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 83;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        if (i5 % 2 == 0 ? (i3 & 4) != 0 : (i3 & 2) != 0) {
            int i7 = i6 + 23;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 83;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            i2 = 0;
        }
        tnkOfferwall.adAction(context, j, i2, function2);
    }

    private static final void adAction$lambda$23$lambda$22(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function2.invoke(Boolean.FALSE, tnkError);
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void adDetail$default(TnkOfferwall tnkOfferwall, Context context, long j, int i2, Function2 function2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted;
        int i6 = i5 + 15;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0 ? (i3 & 4) != 0 : (i3 & 5) != 0) {
            int i7 = i5 + 5;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i2 = 0;
        }
        tnkOfferwall.adDetail(context, j, i2, function2);
        int i9 = onWarmupCompleted + 23;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
    }

    private static final void adDetail$lambda$14$lambda$13$lambda$12(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        function2.invoke(Boolean.FALSE, tnkError);
        int i5 = onWarmupCompleted + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }

    public static /* synthetic */ void adJoin$default(TnkOfferwall tnkOfferwall, Context context, long j, int i2, Function2 function2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0 ? (i3 & 4) != 0 : (i3 & 3) != 0) {
            i2 = 0;
        }
        tnkOfferwall.adJoin(context, j, i2, function2);
        int i6 = onNavigationEvent + 1;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void adJoin$lambda$18$lambda$17$lambda$16(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function2.invoke(Boolean.FALSE, tnkError);
        int i5 = onWarmupCompleted + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void forceJoin$lambda$25$lambda$24(Function2 function2) {
        int i2 = 2 % 2;
        function2.invoke(Boolean.FALSE, new TnkError(500, "must call after init", null, 4, null));
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
    }

    private final int getDayOfYear(long j) {
        Calendar calendar;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            i2 = 30;
        } else {
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            i2 = 6;
        }
        int i5 = calendar.get(i2);
        int i6 = onNavigationEvent + 109;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private final TnkResultTask<AdListVo> reqAdItemWithActionInfo(long j, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        TnkResultTask<AdListVo> tnkResultTaskReqAdItemWithActionInfo = TnkCore.INSTANCE.getOffRepository().reqAdItemWithActionInfo(j, i2);
        int i6 = onNavigationEvent + 113;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return tnkResultTaskReqAdItemWithActionInfo;
    }

    public static /* synthetic */ TnkResultTask reqAdItemWithActionInfo$default(TnkOfferwall tnkOfferwall, long j, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            int i5 = onNavigationEvent + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i2 = 0;
        }
        TnkResultTask<AdListVo> tnkResultTaskReqAdItemWithActionInfo = tnkOfferwall.reqAdItemWithActionInfo(j, i2);
        int i7 = onWarmupCompleted + 45;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 31 / 0;
        }
        return tnkResultTaskReqAdItemWithActionInfo;
    }

    private final void showAdDetailDialog(Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        new AdListDetailViewDialog(context, adListVo).show();
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void showAdDetailDialog$default(TnkOfferwall tnkOfferwall, Context context, long j, int i2, Function2 function2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 4) != 0) {
            int i5 = onNavigationEvent + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i2 = 0;
        }
        tnkOfferwall.showAdDetailDialog(context, j, i2, function2);
        int i7 = onWarmupCompleted + 21;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static final void showAdDetailDialog$lambda$7$lambda$6(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function2.invoke(Boolean.FALSE, tnkError);
        int i5 = onWarmupCompleted + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showCustomTapActivity$default(TnkOfferwall tnkOfferwall, Activity activity, String str, Map map, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 5) != 0) {
            map = new HashMap();
        }
        tnkOfferwall.showCustomTapActivity(activity, str, map);
        int i5 = onNavigationEvent + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit showTermsDialog$lambda$8(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return unit;
    }

    private static final Unit showTermsDialog$lambda$9(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return unit;
    }

    private static final Unit termsCheck$lambda$26(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit termsCheck$lambda$27(Function1 function1) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public final void adDetail(@NotNull Context context, long j, int i2, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        showTermsDialog(context, new TnkOfferwall$.ExternalSyntheticLambda15(this, j, i2, function2, context));
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void adJoin(@NotNull Context context, long j, int i2, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        showTermsDialog(context, new TnkOfferwall$.ExternalSyntheticLambda17(j, i2, this, context, function2));
        int i4 = onWarmupCompleted + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void appStartedOnceAMonth() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TnkApi tnkApi = TnkApi.INSTANCE;
        if (i4 != 0) {
            tnkApi.appStartedOnceAMonth(this.context);
        } else {
            tnkApi.appStartedOnceAMonth(this.context);
            throw null;
        }
    }

    public final void applicationStarted() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TnkApi.INSTANCE.applicationStarted(this.context);
        int i5 = onNavigationEvent + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final LiveData<Boolean> dataChanged() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Boolean> dataChanged = TnkCore.INSTANCE.getOffRepository().getDataChanged();
        int i5 = onNavigationEvent + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return dataChanged;
        }
        throw null;
    }

    public final Context getContext() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Context context = this.context;
        int i6 = i3 + 123;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void getEarnPoint(@NotNull Function1<? super Long, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new p(this, function1, (access13800) null), 2, (Object) null);
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
    }

    public final void getEarnPointByFilter(final int i2, @NotNull final Function1<? super Long, Unit> function1) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        load(new TnkResultListener() { // from class: com.tnkfactory.ad.TnkOfferwall.getEarnPointByFilter.1
            @Override // com.tnkfactory.ad.TnkResultListener
            public void onFail(TnkError tnkError) {
                Intrinsics.checkNotNullParameter(tnkError, "");
                function1.invoke(-1L);
            }

            @Override // com.tnkfactory.ad.TnkResultListener
            public void onSuccess() {
                ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
                int i4 = i2;
                ArrayList arrayList = new ArrayList();
                for (Object obj : adList) {
                    AdListVo adListVo = (AdListVo) obj;
                    if (adListVo.getFilterId() == i4 && !Intrinsics.areEqual(adListVo.getPayYn(), "Y")) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                long pointAmount = 0;
                while (it.hasNext()) {
                    pointAmount += ((AdListVo) it.next()).getPointAmount();
                }
                function1.invoke(Long.valueOf(pointAmount));
            }
        });
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final AdEventHandler getEventHandler() throws Exception {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 13;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AdEventHandler adEventHandler = this.mEventHandler;
        if (adEventHandler == null) {
            throw new Exception("TnkOfferwall init in activity");
        }
        int i5 = i3 + 119;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 123;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return adEventHandler;
        }
        obj.hashCode();
        throw null;
    }

    public final void getEventLink(long j, @NotNull Function1<? super TnkOffRepository.EventLinkVo, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        TnkCore.INSTANCE.getOffRepository().getEventUrl(j, new TnkOfferwall$.ExternalSyntheticLambda3(function1));
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public final TnkEmbedAdListFeedDialog getFeedPopup() {
        int i2 = 2 % 2;
        TnkEmbedAdListFeedDialog tnkEmbedAdListFeedDialog = new TnkEmbedAdListFeedDialog(this);
        int i3 = onWarmupCompleted + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return tnkEmbedAdListFeedDialog;
    }

    public final String getHelpUrl(@NotNull Context context) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String webQueryParam = Utils.getWebQueryParam(context);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{-1706263973, 600226466, 1542286083, -680562964, 859794242, 2055261395, 2067251442, 1295868495, -848007868, -149637262, -242060400, 1527139627, 2024371423, -1797200112, -411160869, 1944619840, 1223453274, 2057274507, -742422445, 168100573, 383480250, -1455549580, 1162902417, 515495289, -1810151800, 743286276, -1009463785, -283503928, -1736514892, -1565991403, -937840748, -310881111}, 63 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(webQueryParam);
        String string = sb.toString();
        int i3 = onWarmupCompleted + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public final AdEventHandler getMEventHandler() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return this.mEventHandler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRewardUrl(@NotNull Context context) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String webQueryParam = Utils.getWebQueryParam(context);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{-1706263973, 600226466, 1542286083, -680562964, 859794242, 2055261395, 2067251442, 1295868495, -848007868, -149637262, -242060400, 1527139627, 2024371423, -1797200112, -411160869, 1944619840, 1223453274, 2057274507, -742422445, 168100573, 383480250, -1455549580, 1162902417, 515495289, -1810151800, 743286276, -1009463785, -283503928, 1525109536, 821044000, -727354196, 1965447683}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 62, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(webQueryParam);
        String string = sb.toString();
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final TnkContext getTnkContext() {
        TnkContext tnkContext;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            tnkContext = this.tnkContext;
            int i5 = 98 / 0;
        } else {
            tnkContext = this.tnkContext;
        }
        int i6 = i3 + 125;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return tnkContext;
    }

    public final void openEventWebView(@NotNull Context context, long j, @NotNull Function2<? super Boolean, ? super String, Unit> function2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        TnkCore.INSTANCE.getOffRepository().getEventUrl(j, new TnkOfferwall$.ExternalSyntheticLambda7(function2, context, j));
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setCOPPA(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TnkApi.INSTANCE.setCOPPA(this.context, z);
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMEventHandler(@Nullable AdEventHandler adEventHandler) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.mEventHandler = adEventHandler;
        int i6 = i4 + 73;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setTnkContext(@Nullable TnkContext tnkContext) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.tnkContext = tnkContext;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 1;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setUserAge(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            TnkApi.INSTANCE.setUserAge(context, i2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        TnkApi.INSTANCE.setUserAge(context, i2);
        int i5 = onWarmupCompleted + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setUserGender(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        TnkApi.INSTANCE.setUserGender(context, str);
        int i5 = onNavigationEvent + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setUserName(@NotNull String str) throws PackageManager.NameNotFoundException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TnkApi.INSTANCE.setUserName(this.context, str);
        int i5 = onNavigationEvent + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void showDialog(boolean z) {
        int i2 = 2 % 2;
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext != null) {
            int i3 = onNavigationEvent + 45;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            TnkOffNavi navi = tnkContext.getNavi();
            if (navi != null) {
                int i5 = onWarmupCompleted + 21;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                navi.showLoading(z);
                if (i6 == 0) {
                    throw null;
                }
            }
        }
        int i7 = onWarmupCompleted + 95;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 70 / 0;
        }
    }

    public final void showMyMenu(@NotNull Activity activity) {
        TnkAdMyMenu tnkAdMyMenuNewInstance;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            tnkAdMyMenuNewInstance = TnkAdMyMenu.Companion.newInstance(2);
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            tnkAdMyMenuNewInstance = TnkAdMyMenu.Companion.newInstance(3);
        }
        tnkAdMyMenuNewInstance.show(((FragmentActivity) activity).getSupportFragmentManager(), "my_menu");
    }

    private static final Unit adDetail$lambda$14$lambda$11(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(adListVo, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda16(function2, tnkOfferwall, context, adListVo));
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit adDetail$lambda$14$lambda$13(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkError, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda20(function2, tnkError));
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit adJoin$lambda$18$lambda$15(TnkOfferwall tnkOfferwall, Context context, Function2 function2, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(adListVo, "");
        tnkOfferwall.forceJoin(context, adListVo, function2);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit adJoin$lambda$18$lambda$17(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkError, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda12(function2, tnkError));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final void forceJoin(Context context, AdListVo adListVo, final Function2<? super Boolean, ? super TnkError, Unit> function2) {
        int i2 = 2 % 2;
        AdEventHandler adEventHandler = this.mEventHandler;
        Object obj = null;
        if (adEventHandler == null) {
            TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda14(function2));
            int i3 = onNavigationEvent + 117;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        adEventHandler.onClickConfirm(adListVo, false, new AdEventListener() { // from class: com.tnkfactory.ad.TnkOfferwall.forceJoin.1
            public static final void a(Function2 function22) {
                function22.invoke(Boolean.TRUE, (Object) null);
            }

            @Override // com.tnkfactory.ad.off.AdEventListener
            public void onComplete(AdListVo adListVo2, boolean z) {
                Intrinsics.checkNotNullParameter(adListVo2, "");
                TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$forceJoin$1$.ExternalSyntheticLambda0(function2));
            }

            @Override // com.tnkfactory.ad.off.AdEventListener
            public void onError(TnkError tnkError) {
                Intrinsics.checkNotNullParameter(tnkError, "");
                TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$forceJoin$1$.ExternalSyntheticLambda1(function2, tnkError));
            }

            public static final void a(Function2 function22, TnkError tnkError) {
                function22.invoke(Boolean.FALSE, tnkError);
            }
        });
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String geFaqUrl(@NotNull Context context) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            TnkAdConfig.INSTANCE.getUseTermsPopup();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (TnkAdConfig.INSTANCE.getUseTermsPopup()) {
            Object[] objArr = new Object[1];
            a(new int[]{-429496501, -1291139408}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1801985772, 1676984077}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            int i4 = onNavigationEvent + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            strIntern = strIntern2;
        }
        String webQueryParam = Utils.getWebQueryParam(context);
        StringBuilder sb = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a(new int[]{-1706263973, 600226466, 1542286083, -680562964, 859794242, 2055261395, 2067251442, 1295868495, -848007868, -149637262, -242060400, 1527139627, 2024371423, -1797200112, -411160869, 1944619840, 1223453274, 2057274507, -742422445, 168100573, 383480250, -1455549580, 1162902417, 515495289, -1810151800, 743286276, -1009463785, -283503928, 827031827, -843753551, -455632949, 894802652, -1924315888, -1932985498}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 64, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(strIntern);
        sb.append("&");
        sb.append(webQueryParam);
        return sb.toString();
    }

    public final Object getEarnPoint(@NotNull access13800<? super Long> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new r(this, (access13800) null), access13800Var);
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public final void load(@NotNull TnkResultListener tnkResultListener) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkResultListener, "");
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext != null) {
            int i3 = onWarmupCompleted + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkContext);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new v(this, textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, tnkResultListener, null), 2, (Object) null);
            }
        }
        int i5 = onNavigationEvent + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void adDetail$lambda$14$lambda$11$lambda$10(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            function2.invoke(Boolean.TRUE, (Object) null);
            tnkOfferwall.showAdDetailDialog(context, adListVo);
            throw null;
        }
        function2.invoke(Boolean.TRUE, (Object) null);
        tnkOfferwall.showAdDetailDialog(context, adListVo);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void showAdDetailDialog$lambda$5$lambda$4(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function2.invoke(Boolean.TRUE, (Object) null);
        tnkOfferwall.showAdDetailDialog(context, adListVo);
        int i5 = onNavigationEvent + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void getAdlistJson(@NotNull final Context context, @NotNull final Function1<? super String, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        showDialog(true);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new JSONObject();
        load(new TnkResultListener() { // from class: com.tnkfactory.ad.TnkOfferwall.getAdlistJson.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int[] onWarmupCompleted = {-1287348530, -154212561, 1895806296, 1448771000, 1244755311, -1375229790, -6537910, 84545474, -319490890, -1710630029, -1977723205, -1429221772, 745318676, 1741676096, 1711315284, -1628388815, 421383148, 1467827452};

            public static final Unit a() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unit = Unit.INSTANCE;
                if (i5 != 0) {
                    int i6 = 85 / 0;
                }
                return unit;
            }

            @Override // com.tnkfactory.ad.TnkResultListener
            public void onFail(TnkError tnkError) throws Throwable {
                String message;
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 125;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(tnkError, "");
                TnkAssert.INSTANCE.offerwallError(tnkError);
                tnkError.getCause();
                if (tnkError.getCode() == 99) {
                    int i6 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    ((JSONObject) objectRef.element).put("code", "99");
                } else {
                    TAlertDialog.Companion.show(context, tnkError.getMessage(), new TnkOfferwall$getAdlistJson$1$.ExternalSyntheticLambda0(), null);
                }
                ((JSONObject) objectRef.element).put("code", tnkError.getCode());
                JSONObject jSONObject = (JSONObject) objectRef.element;
                if (!(!TextUtils.isEmpty(tnkError.getMessage()))) {
                    int i8 = onExtraCallbackWithResult + 67;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    message = "인터넷 연결을 확인하세요.";
                } else {
                    message = tnkError.getMessage();
                }
                Object[] objArr = new Object[1];
                e(new int[]{1054514327, 339519635, -2011126101, -83101809}, 7 - ExpandableListView.getPackedPositionType(0L), objArr);
                jSONObject.put(((String) objArr[0]).intern(), message);
                JSONObject jSONObject2 = (JSONObject) objectRef.element;
                Object[] objArr2 = new Object[1];
                e(new int[]{1911883419, 952478465}, View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr2);
                jSONObject2.put(((String) objArr2[0]).intern(), new JSONArray());
                Function1 function12 = function1;
                String string = ((JSONObject) objectRef.element).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                function12.invoke(string);
                this.showDialog(false);
            }

            @Override // com.tnkfactory.ad.TnkResultListener
            public void onSuccess() throws Throwable {
                int i3 = 2 % 2;
                ((JSONObject) objectRef.element).put("code", "200");
                JSONObject jSONObject = (JSONObject) objectRef.element;
                Object[] objArr = new Object[1];
                e(new int[]{1054514327, 339519635, -2011126101, -83101809}, ((Process.getThreadPriority(0) + 20) >> 6) + 7, objArr);
                jSONObject.put(((String) objArr[0]).intern(), ApiLog.API_LOG_STATE_SUCCESS);
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
                while (it.hasNext()) {
                    int i4 = onExtraCallback + 91;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        jSONArray.put(AdListVoKt.toJson((AdListVo) it.next()));
                        int i5 = 21 / 0;
                    } else {
                        jSONArray.put(AdListVoKt.toJson((AdListVo) it.next()));
                    }
                }
                Unit unit = Unit.INSTANCE;
                JSONObject jSONObject2 = (JSONObject) objectRef.element;
                Object[] objArr2 = new Object[1];
                e(new int[]{1911883419, 952478465}, AndroidCharacter.getMirror('0') - ',', objArr2);
                jSONObject2.put(((String) objArr2[0]).intern(), jSONArray);
                Function1 function12 = function1;
                String string = ((JSONObject) objectRef.element).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                function12.invoke(string);
                this.showDialog(false);
                int i6 = onExtraCallback + 13;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void e(int[] iArr, int i3, Object[] objArr) throws Throwable {
                int i4 = 2;
                int i5 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = onWarmupCompleted;
                int i6 = -1469660336;
                long j = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $11 + 45;
                        $10 = i8 % 128;
                        if (i8 % i4 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, ExpandableListView.getPackedPositionType(j) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                                }
                                iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                                i7 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 72 - View.resolveSizeAndState(0, 0, 0), 8848 - Color.green(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                                }
                                iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                                i7++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i4 = 2;
                        j = 0;
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = onWarmupCompleted;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = $10 + 91;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 72 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                            i9 <<= 1;
                        } else {
                            Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 71 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            i9++;
                        }
                        i6 = -1469660336;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                    cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                    cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                    cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                    int i13 = $10 + 97;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    for (int i15 = 0; i15 < 16; i15++) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionType(0L) + 39, 10301 - View.MeasureSpec.getSize(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    }
                    int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                    int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                    cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                    cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                    cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                    cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                    Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4032), ExpandableListView.getPackedPositionType(0L) + 78, 7398 - ExpandableListView.getPackedPositionType(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    int i19 = $11 + 81;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                }
                objArr[0] = new String(cArr2, 0, i3);
            }
        });
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit adAction$lambda$23(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkError, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda0(function2, tnkError));
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit showAdDetailDialog$lambda$7(Function2 function2, TnkError tnkError) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkError, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda1(function2, tnkError));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final void showAdDetailDialog(@NotNull Context context, long j, int i2, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        reqAdItemWithActionInfo(j, i2).setOnSuccess(new TnkOfferwall$.ExternalSyntheticLambda18(function2, this, context)).setOnError(new TnkOfferwall$.ExternalSyntheticLambda19(function2)).executeAsync();
        int i4 = onWarmupCompleted + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    private static final Unit adAction$lambda$19(TnkOfferwall tnkOfferwall, Context context, long j, int i2, Function2 function2, boolean z) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (z) {
            tnkOfferwall.adAction(context, j, i2, function2);
            int i6 = onWarmupCompleted + 71;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void adAction$lambda$21$lambda$20(AdListVo adListVo, TnkOfferwall tnkOfferwall, Context context, Function2 function2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!Intrinsics.areEqual(adListVo.getDetailYn(), "N")) {
            function2.invoke(Boolean.TRUE, (Object) null);
            tnkOfferwall.showAdDetailDialog(context, adListVo);
            return;
        }
        int i5 = onWarmupCompleted + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        tnkOfferwall.forceJoin(context, adListVo, function2);
        int i7 = onNavigationEvent + 95;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit getEventLink$lambda$29(Function1 function1, TnkOffRepository.EventLinkVo eventLinkVo, boolean z, String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = 34 / 0;
            if (z) {
                if (eventLinkVo != null) {
                    function1.invoke(eventLinkVo);
                } else {
                    function1.invoke((Object) null);
                    int i5 = onWarmupCompleted + 77;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (!z) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public final ViewGroup getAdListView() throws Exception {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext == null) {
            throw new Exception("TnkOfferwall을 FragmentActivity를 상속받는 activity에서 생성해 주시기 바랍니다.");
        }
        Intrinsics.checkNotNull(tnkContext);
        ViewGroup viewGroupShowListview = new TnkAdListImpl(tnkContext).showListview();
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return viewGroupShowListview;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AdPlacementView getAdPlacementView(@NotNull Activity activity) throws Exception {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.tnkContext == null) {
            throw new Exception("TnkOfferwall을 FragmentActivity를 상속받는 activity에서 생성해 주시기 바랍니다.");
        }
        AdPlacementView adPlacementView = new AdPlacementView(activity);
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return adPlacementView;
    }

    public final TnkEmbedAdList getEmbedAdList() throws Exception {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext == null) {
            throw new Exception("TnkOfferwall을 FragmentActivity를 상속받는 activity에서 생성해 주시기 바랍니다.");
        }
        Intrinsics.checkNotNull(tnkContext);
        TnkEmbedAdList tnkEmbedAdList = new TnkEmbedAdList(tnkContext);
        int i5 = onNavigationEvent + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return tnkEmbedAdList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TnkEmbedNewList getEmbedNewsList() throws Exception {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext == null) {
            throw new Exception("TnkOfferwall을 FragmentActivity를 상속받는 activity에서 생성해 주시기 바랍니다.");
        }
        Intrinsics.checkNotNull(tnkContext);
        TnkEmbedNewList tnkEmbedNewList = new TnkEmbedNewList(tnkContext);
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return tnkEmbedNewList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void termsCheck(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!(!Settings.INSTANCE.isAgreePrivacy(context))) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext != null) {
            int i5 = onWarmupCompleted + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            TnkOffNavi navi = tnkContext.getNavi();
            if (i6 == 0) {
                int i7 = 93 / 0;
                if (navi != null) {
                    navi.showTerms(1, new TnkOfferwall$.ExternalSyntheticLambda21(function1), new TnkOfferwall$.ExternalSyntheticLambda22(function1));
                }
            } else if (navi != null) {
            }
        }
        int i8 = onWarmupCompleted + 91;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final Unit showAdDetailDialog$lambda$5(Function2 function2, TnkOfferwall tnkOfferwall, Context context, AdListVo adListVo) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(adListVo, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda13(function2, tnkOfferwall, context, adListVo));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final void startOfferwallActivity(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            TextUtils.isEmpty(TnkCore.INSTANCE.getSessionInfo().getApplicationId());
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (!TextUtils.isEmpty(TnkCore.INSTANCE.getSessionInfo().getApplicationId())) {
            AdWallActivity.Companion.start(context);
            return;
        }
        Toast.makeText(context, "add [tnkad_app_id] in AndroidManifest.xml", 0).show();
        int i4 = onWarmupCompleted + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void loadWithNewsData(@NotNull TnkResultListener tnkResultListener) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tnkResultListener, "");
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext != null) {
            int i5 = onWarmupCompleted + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkContext);
                throw null;
            }
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkContext);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new y(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, tnkResultListener, (access13800) null), 2, (Object) null);
            }
        }
    }

    public final void showTermsDialog(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> function1) {
        TnkOffNavi navi;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!(!Settings.INSTANCE.isAgreePrivacy(context))) {
            int i5 = onWarmupCompleted + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            function1.invoke(Boolean.TRUE);
            return;
        }
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext == null || (navi = tnkContext.getNavi()) == null) {
            return;
        }
        navi.showTerms(1, new TnkOfferwall$.ExternalSyntheticLambda23(function1), new TnkOfferwall$.ExternalSyntheticLambda24(function1));
    }

    private static final Unit adAction$lambda$21(TnkOfferwall tnkOfferwall, Context context, Function2 function2, AdListVo adListVo) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(adListVo, "");
        TnkSession.INSTANCE.runOnMainThread(new TnkOfferwall$.ExternalSyntheticLambda2(adListVo, tnkOfferwall, context, function2));
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final ViewGroup getAdListView(long j) throws Exception {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext == null) {
            throw new Exception("TnkOfferwall을 FragmentActivity를 상속받는 activity에서 생성해 주시기 바랍니다.");
        }
        Intrinsics.checkNotNull(tnkContext);
        ViewGroup viewGroupShowListview = new TnkAdListImpl(tnkContext).showListview(j);
        int i5 = onWarmupCompleted + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return viewGroupShowListview;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit adJoin$lambda$18(long j, int i2, TnkOfferwall tnkOfferwall, Context context, Function2 function2, boolean z) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (!(!z)) {
            tnkOfferwall.reqAdItemWithActionInfo(j, i2).setOnSuccess(new TnkOfferwall$.ExternalSyntheticLambda10(tnkOfferwall, context, function2)).setOnError(new TnkOfferwall$.ExternalSyntheticLambda11(function2)).executeAsync();
            return Unit.INSTANCE;
        }
        int i6 = i4 + 53;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return Unit.INSTANCE;
    }

    public final void adAction(@NotNull Context context, long j, int i2, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!Settings.INSTANCE.isAgreePrivacy(context)) {
            showTermsDialog(context, new TnkOfferwall$.ExternalSyntheticLambda4(this, context, j, i2, function2));
            return;
        }
        reqAdItemWithActionInfo(j, i2).setOnSuccess(new TnkOfferwall$.ExternalSyntheticLambda5(this, context, function2)).setOnError(new TnkOfferwall$.ExternalSyntheticLambda6(function2)).executeAsync();
        int i6 = onNavigationEvent + 35;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void startOfferwallActivity(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (!TextUtils.isEmpty(TnkCore.INSTANCE.getSessionInfo().getApplicationId())) {
            Settings.INSTANCE.setReceiveAppId(context, j);
            AdWallActivity.Companion.start(context);
            return;
        }
        Toast.makeText(context, "add [tnkad_app_id] in AndroidManifest.xml", 0).show();
        int i5 = onNavigationEvent + 93;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit adDetail$lambda$14(TnkOfferwall tnkOfferwall, long j, int i2, Function2 function2, Context context, boolean z) {
        int i3 = 2 % 2;
        if (!z) {
            int i4 = onNavigationEvent + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        tnkOfferwall.reqAdItemWithActionInfo(j, i2).setOnSuccess(new TnkOfferwall$.ExternalSyntheticLambda8(function2, tnkOfferwall, context)).setOnError(new TnkOfferwall$.ExternalSyntheticLambda9(function2)).executeAsync();
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 61;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit openEventWebView$lambda$30(Function2 function2, Context context, long j, TnkOffRepository.EventLinkVo eventLinkVo, boolean z, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i5 = onNavigationEvent + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (eventLinkVo != null) {
                String mkt_app_id = eventLinkVo.getMkt_app_id();
                if (TextUtils.isEmpty(mkt_app_id)) {
                    function2.invoke(Boolean.FALSE, "이벤트 URL이 존재하지 않습니다.");
                    return Unit.INSTANCE;
                }
                if (!(!Intrinsics.areEqual(eventLinkVo.getWebview_type(), "T"))) {
                    TenqubeDetailWebViewActivity.Companion.start(context, mkt_app_id);
                } else if (!Intrinsics.areEqual(eventLinkVo.getWebview_yn(), "Y")) {
                    Utils.goWebPage(context, mkt_app_id, true);
                } else {
                    AdDetailWebView adDetailWebViewNewInstance = AdDetailWebView.Companion.newInstance(mkt_app_id, String.valueOf(j), String.valueOf(j));
                    Intrinsics.checkNotNull(context, "");
                    adDetailWebViewNewInstance.show(((FragmentActivity) context).getSupportFragmentManager(), "AdDetailWebView");
                    int i7 = onWarmupCompleted + 7;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                function2.invoke(Boolean.TRUE, ApiLog.API_LOG_STATE_SUCCESS);
            } else {
                function2.invoke(Boolean.FALSE, ErrorCodes.INSTANCE.getErrorMessage(eventLinkVo != null ? eventLinkVo.getRet_cd() : 99));
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 99;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public final void showCustomTapActivity(@NotNull Activity activity, @NotNull String str, @NotNull Map<String, String> map) {
        String str2;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        removeOnContextAvailableListener removeoncontextavailablelistenerOnExtraCallbackWithResult = new removeOnContextAvailableListener.onExtraCallbackWithResult().onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(removeoncontextavailablelistenerOnExtraCallbackWithResult, "");
        String applicationId = TnkCore.INSTANCE.getSessionInfo().getApplicationId();
        if (applicationId == null) {
            int i3 = onWarmupCompleted + 11;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str2 = "";
        } else {
            str2 = applicationId;
        }
        String strReplace$default = StringsKt.replace$default(str, "{pub_id_hex}", str2, false, 4, (Object) null);
        Settings settings = Settings.INSTANCE;
        String strReplace$default2 = StringsKt.replace$default(strReplace$default, "{adid}", settings.getAdid(activity), false, 4, (Object) null);
        String mediaUserName = settings.getMediaUserName(activity);
        if (mediaUserName == null) {
            int i4 = onWarmupCompleted + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            str3 = "";
        } else {
            str3 = mediaUserName;
        }
        String strReplace$default3 = StringsKt.replace$default(strReplace$default2, "{md_user_nm}", str3, false, 4, (Object) null);
        int i6 = onWarmupCompleted + 31;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strReplace$default3 = ((Object) strReplace$default3) + "&" + ((Object) entry.getKey()) + "=" + ((Object) entry.getValue());
        }
        TnkCustomTabActivityHelper.Companion companion = TnkCustomTabActivityHelper.Companion;
        Uri uri = Uri.parse(strReplace$default3);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        companion.openCustomTab(activity, removeoncontextavailablelistenerOnExtraCallbackWithResult, uri, new TnkWebviewFallback());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final long getEarnPointSync() throws Exception {
        long pointAmount;
        TnkOffRepository offRepository;
        ValueObject valueObject;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        try {
            TnkCore tnkCore = TnkCore.INSTANCE;
            if (tnkCore.getOffRepository().getEarnPoint() > 0 && getDayOfYear(tnkCore.getOffRepository().getEarnPointCalcTime()) == getDayOfYear(System.currentTimeMillis())) {
                return tnkCore.getOffRepository().getEarnPoint();
            }
            tnkCore.getOffRepository().setEarnPointCalcTime(System.currentTimeMillis());
            ResultState adList$default = ServiceTask.getAdList$default(tnkCore.getServiceTask(), 0, 1, null);
            ArrayList arrayList = new ArrayList();
            if (adList$default instanceof ResultState.Success) {
                int i5 = onNavigationEvent + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                try {
                    AdListParser adListParser = AdListParser.INSTANCE;
                    Object obj = ((ValueObject) ((ResultState.Success) adList$default).getValue()).get("ad_list");
                    Intrinsics.checkNotNull(obj, "");
                    arrayList.addAll(adListParser.parseAdListItem((ValueObject) obj));
                    Iterator it = arrayList.iterator();
                    pointAmount = 0;
                    while (!(!it.hasNext())) {
                        pointAmount += ((AdListVo) it.next()).getPointAmount();
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                if (adList$default instanceof ResultState.Error) {
                    throw new Exception(((ResultState.Error) adList$default).getE());
                }
                pointAmount = 0;
            }
            TnkCore tnkCore2 = TnkCore.INSTANCE;
            ResultState<ValueObject> productTotalPoint = tnkCore2.getServiceTask().getProductTotalPoint(tnkCore2.getSessionVO(this.context));
            if (productTotalPoint instanceof ResultState.Success) {
                int i7 = onNavigationEvent + 5;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    pointAmount %= ((ValueObject) ((ResultState.Success) productTotalPoint).getValue()).getInt("pnt_amt");
                    offRepository = tnkCore2.getOffRepository();
                    valueObject = (ValueObject) ((ResultState.Success) productTotalPoint).getValue();
                } else {
                    pointAmount += ((ValueObject) ((ResultState.Success) productTotalPoint).getValue()).getInt("pnt_amt");
                    offRepository = tnkCore2.getOffRepository();
                    valueObject = (ValueObject) ((ResultState.Success) productTotalPoint).getValue();
                }
                offRepository.setEarnPointCPS(valueObject.getInt("pnt_amt"));
            } else if (productTotalPoint instanceof ResultState.Error) {
                ((ResultState.Error) productTotalPoint).getE();
            } else if (!(productTotalPoint instanceof ResultState.Pass)) {
                throw new NoWhenBranchMatchedException();
            }
            tnkCore2.getOffRepository().setEarnPoint(pointAmount);
            int i8 = onNavigationEvent + 33;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 22 / 0;
            }
            return pointAmount;
        } catch (Exception unused) {
            return 0L;
        }
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        int i5 = -1469660336;
        char c = '0';
        long j = 0;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), 71 - TextUtils.lastIndexOf("", c), ExpandableListView.getPackedPositionChild(j) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                    c = '0';
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallbackWithResult;
        if (iArr6 != null) {
            int i8 = $10 + 33;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', i6, i6)), ExpandableListView.getPackedPositionGroup(0L) + 72, (ViewConfiguration.getScrollBarSize() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i3++;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        int i9 = i6;
        System.arraycopy(iArr6, i9, iArr5, i9, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i9] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i10 = $10 + 119;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            for (int i12 = 0; i12 < 16; i12++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf("", '0')), 39 - Color.red(0), 10301 - Color.argb(0, 0, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 4034), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 77, 7398 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
