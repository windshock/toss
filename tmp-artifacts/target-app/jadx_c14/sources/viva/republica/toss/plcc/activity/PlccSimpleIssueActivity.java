package viva.republica.toss.plcc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.featurescommon.address.search.RoadAddress;
import im.toss.featurescommon.address.search.Sido;
import im.toss.featurescommon.profile.library.model.Profile;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import im.toss.tosssecurities.devtool.main.ui.section.settings.row.SocketRowKt$;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextField;
import im.toss.uikit.widget.textField.TextFieldSpinner;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_Update_Kup;
import o.ConvertByteArrayToFloatArray;
import o.DERConstructedSequence;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.GriverPageContainerPullFreshCallback;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.KeyBoardVisiblePoint;
import o.M_;
import o.MapConverter;
import o.MultilevelSelectActivityExternalSyntheticLambda2;
import o.NetConverter3;
import o.PageShowPoint;
import o.PlayerErrorCode;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TitleBarExtension1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UtilsKtExternalSyntheticLambda17$ComponentDialogExternalSyntheticLambda2;
import o.access13800;
import o.access14300;
import o.addExtra;
import o.clearTid;
import o.commonTypeToChar;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.enableIOSViewClipToPaddingBox;
import o.findResAndMsg;
import o.forceDomainCheck;
import o.getDummyAd;
import o.getHints;
import o.getNavigationBar;
import o.getNightColor;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getSignForPKCS7V2;
import o.getTypedExportedConstants;
import o.initMiniApp;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.setHasShown;
import o.setMessageBytes;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.toCircle;
import o.transparentBackground;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.model.checkcard.RecommendedEnglishName;
import viva.republica.toss.network.model.checkcard.RecommendedEnglishNameResponse;
import viva.republica.toss.network.model.plcc.PlccSimpleIssueOption;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$;
import viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$showAccountListBottomSheet$listener$1$;
import viva.republica.toss.plcc.activity.PlccSimpleIssueCompleteActivity;
import viva.republica.toss.send.common.WithdrawAccountListBottomSheet;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccSimpleIssueActivity extends Hilt_PlccSimpleIssueActivity {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackDefault;
    private static int ICustomTabsCallbackStubProxy;
    private static int extraCallback;
    private static int onActivityLayout;
    private static short[] onMinimized;
    private static byte[] onPostMessage;
    private static int readTypedObject;
    private PlccSimpleIssueOption IAuthTabCallbackStub;
    private toCircle.IAuthTabCallback IAuthTabCallbackStubProxy;
    private PlccSimpleIssueOption IAuthTabCallback_Parcel;
    private RoadAddress access000;
    private IAuthTabCallback access100;

    @Inject
    public getHints creditCardPublicApi;
    private List<? extends KeyBoardVisiblePoint> onTransact;

    @Inject
    public getNightColor profileRepository;

    @Inject
    public TitleBarExtension1 searchAddressIntent;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;
    private boolean writeTypedObject;
    private static final byte[] $$a = {64, -61, 76, -90};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onUnminimized = 1;
    private static int onMessageChannelReady = 0;
    private static int onActivityResized = 1;
    private String ICustomTabsCallback = "";
    private List<PlccSimpleIssueOption> getInterfaceDescriptor = CollectionsKt.emptyList();
    private List<PlccSimpleIssueOption> asBinder = CollectionsKt.emptyList();
    private final SessionTrackera extraCallbackWithResult = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda8
        public final Object invoke(Object obj) {
            return PlccSimpleIssueActivity.onExtraCallbackWithResult(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new getInterfaceDescriptor(this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, short r6, int r7) {
        /*
            int r6 = r6 * 2
            int r6 = 115 - r6
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.$$c(byte, short, int):java.lang.String");
    }

    static {
        ICustomTabsCallbackStubProxy = 0;
        validateRelationship();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallbackDefault = 8;
        int i = onUnminimized + 97;
        ICustomTabsCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i3 = onMessageChannelReady + 39;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityResized + 59;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(plccSimpleIssueActivity, th);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(plccSimpleIssueActivity, setDetectableSize);
        int i4 = onActivityResized + 45;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, PlccSimpleIssueOption plccSimpleIssueOption) {
        int i = 2 % 2;
        int i2 = onActivityResized + 109;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(plccSimpleIssueActivity, plccSimpleIssueOption);
        }
        onExtraCallbackWithResult(plccSimpleIssueActivity, plccSimpleIssueOption);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asInterface(plccSimpleIssueActivity, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onActivityResized + 71;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 117;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = onActivityResized + 79;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit asBinder(Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(th);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = onMessageChannelReady + 99;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(plccSimpleIssueActivity, bool);
        int i4 = onActivityResized + 123;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 79;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        access100(plccSimpleIssueActivity);
        int i4 = onActivityResized + 21;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -33703968, iOnWarmupCompleted2, 33703980, new Object[]{plccSimpleIssueActivity, view}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = onActivityResized + 117;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 125;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(plccSimpleIssueActivity, view, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(plccSimpleIssueActivity, view, iIntValue);
        int i3 = onMessageChannelReady + 97;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 21;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -839540822, iOnWarmupCompleted2, 839540839, new Object[]{plccSimpleIssueActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = onMessageChannelReady + 27;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, RecommendedEnglishNameResponse recommendedEnglishNameResponse) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 121;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(plccSimpleIssueActivity, recommendedEnglishNameResponse);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(plccSimpleIssueActivity, recommendedEnglishNameResponse);
        int i3 = onMessageChannelReady + 3;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ RecommendedEnglishNameResponse onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        RecommendedEnglishNameResponse recommendedEnglishNameResponse = (RecommendedEnglishNameResponse) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -425353522, iOnWarmupCompleted2, 425353522, new Object[]{th}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = onMessageChannelReady + 3;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return recommendedEnglishNameResponse;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [android.content.Context, java.lang.Object, viva.republica.toss.plcc.activity.PlccSimpleIssueActivity] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws NoSuchMethodException, SecurityException {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i2)) | i9;
        int i11 = (~((~i2) | i7 | i5)) | (~(i8 | i3));
        int i12 = i3 + i5 + i4 + (531708263 * i) + ((-608630064) * i6);
        int i13 = i12 * i12;
        int i14 = (i3 * (-228234701)) + 730857472 + ((-228234701) * i5) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i4) + ((-45088768) * i) + ((-419430400) * i6) + ((-1471938560) * i13);
        int i15 = ((i3 * (-1679524527)) - 150938974) + (i5 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i4 * (-1679524245)) + (i * (-166744051)) + (i6 * 2062148848) + (i13 * (-865337344));
        switch (i14 + (i15 * i15 * (-1617166336))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
                int i16 = 2 % 2;
                int i17 = onMessageChannelReady + 57;
                onActivityResized = i17 % 128;
                int i18 = i17 % 2;
                BaseActivity.IAuthTabCallback(plccSimpleIssueActivity, (String) null, false, 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i19 = onActivityResized + 75;
                onMessageChannelReady = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                final ?? r12 = (PlccSimpleIssueActivity) objArr[0];
                int i21 = 2 % 2;
                String string = r12.getString(R.string.app_activity_plcc_simple_issue_credit_score);
                Intrinsics.checkNotNullExpressionValue(string, "");
                onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7109792, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026280).substring(0, 4).codePointAt(2) + 1992230360, -1734033316, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019707).substring(0, 22).length() - 1479667672, 1734033327, new Object[]{r12, string, ((PlccSimpleIssueActivity) r12).getInterfaceDescriptor, ((PlccSimpleIssueActivity) r12).IAuthTabCallback_Parcel, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return PlccSimpleIssueActivity.onWarmupCompleted(this.f$0, (PlccSimpleIssueOption) obj);
                    }
                }}, SocketRowKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                int i22 = onActivityResized + 125;
                onMessageChannelReady = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                PlccSimpleIssueActivity plccSimpleIssueActivity2 = (PlccSimpleIssueActivity) objArr[0];
                RoadAddress roadAddress = (RoadAddress) objArr[1];
                int i24 = 2 % 2;
                int i25 = onActivityResized + 57;
                onMessageChannelReady = i25 % 128;
                int i26 = i25 % 2;
                plccSimpleIssueActivity2.access000 = roadAddress;
                plccSimpleIssueActivity2.ICustomTabsServiceDefault();
                int i27 = onActivityResized + 75;
                onMessageChannelReady = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 7:
                PlccSimpleIssueActivity plccSimpleIssueActivity3 = (PlccSimpleIssueActivity) objArr[0];
                int i29 = 2 % 2;
                int i30 = onActivityResized + 33;
                onMessageChannelReady = i30 % 128;
                int i31 = i30 % 2;
                plccSimpleIssueActivity3.ICustomTabsServiceDefault();
                int i32 = onActivityResized + 73;
                onMessageChannelReady = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 8:
                return onNavigationEvent(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                return onTransact(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return access100(objArr);
            case 16:
                PlccSimpleIssueActivity plccSimpleIssueActivity4 = (PlccSimpleIssueActivity) objArr[0];
                deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
                int i34 = 2 % 2;
                int i35 = onMessageChannelReady + 89;
                onActivityResized = i35 % 128;
                int i36 = i35 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(plccSimpleIssueActivity4, deserializeurinullablecollection);
                int i37 = onMessageChannelReady + 27;
                onActivityResized = i37 % 128;
                int i38 = i37 % 2;
                return unitIAuthTabCallback;
            case 17:
                return getInterfaceDescriptor(objArr);
            case 18:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 101;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(i, plccSimpleIssueActivity, setDetectableSize);
        }
        onExtraCallbackWithResult(i, plccSimpleIssueActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PlccSimpleIssueActivity plccSimpleIssueActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 1666915503, iOnWarmupCompleted2, -1666915502, new Object[]{plccSimpleIssueActivity, deserializeurinullablecollection}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = onMessageChannelReady + 85;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PlccSimpleIssueActivity plccSimpleIssueActivity, boolean z, Profile profile) {
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {plccSimpleIssueActivity, Boolean.valueOf(z), profile};
        Unit unit = (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1296032022, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1296032024, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = onActivityResized + 65;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(plccSimpleIssueActivity);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 111;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 302388765, iOnWarmupCompleted2, -302388761, new Object[]{plccSimpleIssueActivity, view}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = onMessageChannelReady + 111;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 83;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(plccSimpleIssueActivity, view);
        int i4 = onMessageChannelReady + 43;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {th};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted3, iOnWarmupCompleted, -1248317752, iOnWarmupCompleted2, 1248317760, objArr, iOnWarmupCompleted4);
        int i4 = onMessageChannelReady + 39;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccSimpleIssueActivity plccSimpleIssueActivity, PlccSimpleIssueOption plccSimpleIssueOption) {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(plccSimpleIssueActivity, plccSimpleIssueOption);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = onActivityResized + 41;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, PlccSimpleIssueOption plccSimpleIssueOption, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, plccSimpleIssueOption, gettypedexportedconstants, view);
        int i4 = onMessageChannelReady + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(plccSimpleIssueActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 53;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 109;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class getInterfaceDescriptor implements Function0<CMP_Update_Kup> {
        final /* synthetic */ Activity onNavigationEvent;

        public getInterfaceDescriptor(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CMP_Update_Kup invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Update_Kup.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public static final class access000 implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final access000 onWarmupCompleted = new access000();

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class access100<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public access100(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentDialogExternalSyntheticLambda2(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.access100.1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<Profile> apply(writeRaw<BaseApiResponse<Profile>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentDialogExternalSyntheticLambda2(new Function1<BaseApiResponse<Profile>, deserializeIp<? extends Profile>>() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.onExtraCallbackWithResult.1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Profile> invoke(BaseApiResponse<Profile> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Profile.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<RecommendedEnglishNameResponse> apply(writeRaw<BaseApiResponse<RecommendedEnglishNameResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentDialogExternalSyntheticLambda2(new Function1<BaseApiResponse<RecommendedEnglishNameResponse>, deserializeIp<? extends RecommendedEnglishNameResponse>>() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.onNavigationEvent.4
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends RecommendedEnglishNameResponse> invoke(BaseApiResponse<RecommendedEnglishNameResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = RecommendedEnglishNameResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackDefault implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IAuthTabCallbackDefault() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() == 0) {
                Object[] objArr = {PlccSimpleIssueActivity.this};
                ((TextField) PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -325094832, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 325094850, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).setVisibility(8);
                return;
            }
            Object[] objArr2 = {PlccSimpleIssueActivity.this};
            ((TextField) PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -325094832, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 325094850, objArr2, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).setVisibility(0);
        }
    }

    public static final class IAuthTabCallbackStub implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IAuthTabCallbackStub() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NoSuchMethodException, SecurityException {
            Object[] objArr = {PlccSimpleIssueActivity.this};
            PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 887912735, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -887912728, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        }
    }

    public static final class asBinder implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public asBinder() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NoSuchMethodException, SecurityException {
            Object[] objArr = {PlccSimpleIssueActivity.this};
            if (((LinearLayout) PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1006428879, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1006428894, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).getVisibility() == 8) {
                Editable text = PlccSimpleIssueActivity.onTransact(PlccSimpleIssueActivity.this).getText();
                if (text == null || text.length() != 7) {
                    return;
                }
                Object[] objArr2 = {M_.onExtraCallback, PlccSimpleIssueActivity.onTransact(PlccSimpleIssueActivity.this)};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                M_.onNavigationEvent(1483765845, objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
                transparentBackground.onWarmupCompleted(PlccSimpleIssueActivity.IAuthTabCallbackStub(PlccSimpleIssueActivity.this).onWarmupCompleted());
                Object[] objArr3 = {PlccSimpleIssueActivity.this};
                ((LinearLayout) PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1006428879, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1006428894, objArr3, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).setVisibility(0);
                PlccSimpleIssueActivity.IAuthTabCallbackStub(PlccSimpleIssueActivity.this).onWarmupCompleted().setText(PlccSimpleIssueActivity.this.getString(R.string.app_plcc_activity___d841e2903f));
                Object[] objArr4 = {PlccSimpleIssueActivity.this};
                PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 887912735, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -887912728, objArr4, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
                TdsSegmentedControlV1View.onExtraCallback(PlccSimpleIssueActivity.IAuthTabCallbackDefault(PlccSimpleIssueActivity.this), 0, false, false, 6, (Object) null);
                return;
            }
            Object[] objArr5 = {PlccSimpleIssueActivity.this};
            PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 887912735, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -887912728, objArr5, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        }
    }

    public static final class onTransact implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onTransact() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NoSuchMethodException, SecurityException {
            RoadAddress roadAddressOnExtraCallbackWithResult = PlccSimpleIssueActivity.onExtraCallbackWithResult(PlccSimpleIssueActivity.this);
            if (roadAddressOnExtraCallbackWithResult != null) {
                Object[] objArr = {roadAddressOnExtraCallbackWithResult, String.valueOf(editable)};
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                RoadAddress.onExtraCallback(forceDomainCheck.IAuthTabCallback(), objArr, forceDomainCheck.IAuthTabCallback(), -228147335, forceDomainCheck.IAuthTabCallback(), 228147335, iIAuthTabCallback);
            }
            Object[] objArr2 = {PlccSimpleIssueActivity.this};
            PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 887912735, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -887912728, objArr2, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        }
    }

    public static final /* synthetic */ TdsSegmentedControlV1View IAuthTabCallbackDefault(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 39;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TdsSegmentedControlV1View tdsSegmentedControlV1ViewIEngagementSignalsCallbackStubProxy = plccSimpleIssueActivity.IEngagementSignalsCallbackStubProxy();
        int i4 = onActivityResized + 7;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return tdsSegmentedControlV1ViewIEngagementSignalsCallbackStubProxy;
    }

    public static final /* synthetic */ KeyboardBottomCta IAuthTabCallbackStub(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        KeyboardBottomCta keyboardBottomCtaIPostMessageServiceDefault = plccSimpleIssueActivity.IPostMessageServiceDefault();
        int i4 = onActivityResized + 59;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return keyboardBottomCtaIPostMessageServiceDefault;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return plccSimpleIssueActivity.onSessionEnded();
        }
        plccSimpleIssueActivity.onSessionEnded();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutIEngagementSignalsCallback_Parcel = plccSimpleIssueActivity.IEngagementSignalsCallback_Parcel();
        int i4 = onActivityResized + 7;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return linearLayoutIEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ TextFieldSpinner asInterface(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 123;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TextFieldSpinner textFieldSpinnerOnVerticalScrollEvent = plccSimpleIssueActivity.onVerticalScrollEvent();
        int i4 = onActivityResized + 15;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return textFieldSpinnerOnVerticalScrollEvent;
    }

    public static final /* synthetic */ SessionTrackera getInterfaceDescriptor(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 109;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        SessionTrackera sessionTrackera = plccSimpleIssueActivity.extraCallbackWithResult;
        int i5 = i3 + 45;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackera;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        List<PlccSimpleIssueOption> list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 91;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        plccSimpleIssueActivity.asBinder = list;
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
        int i6 = i2 + 21;
        onMessageChannelReady = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        plccSimpleIssueActivity.onWarmupCompleted(iAuthTabCallback);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onMessageChannelReady + 125;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    public static final /* synthetic */ RoadAddress onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 71;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        RoadAddress roadAddress = plccSimpleIssueActivity.access000;
        int i5 = i2 + 59;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return roadAddress;
    }

    public static final /* synthetic */ void onNavigationEvent(PlccSimpleIssueActivity plccSimpleIssueActivity, List list) {
        int i = 2 % 2;
        int i2 = onActivityResized + 7;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        plccSimpleIssueActivity.getInterfaceDescriptor = list;
        int i5 = i3 + 17;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ TextInputEditText onTransact(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TextInputEditText textInputEditTextITrustedWebActivityCallback = plccSimpleIssueActivity.ITrustedWebActivityCallback();
        int i4 = onActivityResized + 35;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return textInputEditTextITrustedWebActivityCallback;
        }
        throw null;
    }

    public final SessionTrackerb updateVisuals() {
        int i = 2 % 2;
        int i2 = onActivityResized + 117;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 27;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    public final TitleBarExtension1 setEngagementSignalsCallback() {
        int i = 2 % 2;
        TitleBarExtension1 titleBarExtension1 = this.searchAddressIntent;
        if (titleBarExtension1 != null) {
            int i2 = onActivityResized + 65;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            return titleBarExtension1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onMessageChannelReady + 31;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final getNightColor onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 87;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        getNightColor getnightcolor = this.profileRepository;
        if (getnightcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 15;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 83;
        onMessageChannelReady = i7 % 128;
        if (i7 % 2 == 0) {
            return getnightcolor;
        }
        throw null;
    }

    public final getHints IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getHints gethints = this.creditCardPublicApi;
        if (gethints != null) {
            return gethints;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onMessageChannelReady + 3;
        onActivityResized = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 91;
        onActivityResized = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 95;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return getdummyad;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (!(!r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed())) {
            plccSimpleIssueActivity.cancelNotification();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onActivityResized + 79;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 31;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            this.access100 = iAuthTabCallback;
            ICustomTabsServiceDefault();
        } else {
            this.access100 = iAuthTabCallback;
            ICustomTabsServiceDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final commonTypeToChar.onExtraCallbackWithResult IPostMessageServiceStub() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 75;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a((short) (30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2098414551 + (ViewConfiguration.getPressedStateDuration() >> 16), 726935394 + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) - 65, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = stringExtra;
        if (str.length() > 0) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("extra.plcc.logParams");
            commonTypeToChar.onExtraCallbackWithResult onextracallbackwithresult = null;
            if (!(!(parcelableExtra instanceof commonTypeToChar.onExtraCallbackWithResult))) {
                int i4 = onActivityResized + 7;
                onMessageChannelReady = i4 % 128;
                if (i4 % 2 == 0) {
                    onextracallbackwithresult = (commonTypeToChar.onExtraCallbackWithResult) parcelableExtra;
                } else {
                    onextracallbackwithresult.hashCode();
                    throw null;
                }
            }
            if (onextracallbackwithresult != null) {
                return new commonTypeToChar.onExtraCallbackWithResult(onextracallbackwithresult.onWarmupCompleted(), onextracallbackwithresult.onExtraCallback(), onextracallbackwithresult.onNavigationEvent(), onextracallbackwithresult.onExtraCallbackWithResult(), str);
            }
        }
        return (commonTypeToChar.onExtraCallbackWithResult) getIntent().getParcelableExtra("extra.plcc.logParams");
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        commonTypeToChar.onExtraCallbackWithResult onextracallbackwithresultIPostMessageServiceStub = IPostMessageServiceStub();
        if (onextracallbackwithresultIPostMessageServiceStub != null) {
            int i2 = onMessageChannelReady + 33;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresultIPostMessageServiceStub.IAuthTabCallback();
        }
        int i4 = onActivityResized + 113;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return "tosscreditcard__simple_apply";
    }

    private final CMP_Update_Kup writeTypedList() {
        CMP_Update_Kup cMP_Update_Kup;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 87;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.asInterface.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            cMP_Update_Kup = (CMP_Update_Kup) value;
            int i3 = 92 / 0;
        } else {
            Object value2 = this.asInterface.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            cMP_Update_Kup = (CMP_Update_Kup) value2;
        }
        int i4 = onActivityResized + 71;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return cMP_Update_Kup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TextFieldSpinner ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 35;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(writeTypedList().onExtraCallbackWithResult, "");
            throw null;
        }
        TextFieldSpinner textFieldSpinner = writeTypedList().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(textFieldSpinner, "");
        int i3 = onActivityResized + 57;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        return textFieldSpinner;
    }

    private final TextFieldSpinner ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 87;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(writeTypedList().onWarmupCompleted, "");
            throw null;
        }
        TextFieldSpinner textFieldSpinner = writeTypedList().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(textFieldSpinner, "");
        return textFieldSpinner;
    }

    private final TextFieldSpinner onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TextFieldSpinner textFieldSpinner = writeTypedList().access100;
        Intrinsics.checkNotNullExpressionValue(textFieldSpinner, "");
        int i4 = onMessageChannelReady + 75;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return textFieldSpinner;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TextField textField = plccSimpleIssueActivity.writeTypedList().asInterface;
        Intrinsics.checkNotNullExpressionValue(textField, "");
        int i4 = onActivityResized + 63;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return textField;
    }

    private final TextField onSessionEnded() {
        int i = 2 % 2;
        int i2 = onActivityResized + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TextField textField = writeTypedList().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(textField, "");
        int i4 = onMessageChannelReady + 13;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return textField;
        }
        throw null;
    }

    private final TextInputEditText IPostMessageService() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 97;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TextInputEditText textInputEditText = writeTypedList().extraCallback;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        int i4 = onMessageChannelReady + 57;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return textInputEditText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TextInputEditText ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 123;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TextInputEditText textInputEditText = writeTypedList().readTypedObject;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        int i4 = onMessageChannelReady + 67;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return textInputEditText;
        }
        throw null;
    }

    private final LinearLayout IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 23;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(writeTypedList().IAuthTabCallbackStubProxy, "");
            throw null;
        }
        LinearLayout linearLayout = writeTypedList().IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i3 = onMessageChannelReady + 85;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return linearLayout;
    }

    private final KeyboardBottomCta IPostMessageServiceDefault() {
        KeyboardBottomCta keyboardBottomCta;
        int i = 2 % 2;
        int i2 = onActivityResized + 1;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            keyboardBottomCta = writeTypedList().extraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            int i3 = 17 / 0;
        } else {
            keyboardBottomCta = writeTypedList().extraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        }
        int i4 = onActivityResized + 71;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return keyboardBottomCta;
    }

    private final TdsSegmentedControlV1View IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TdsSegmentedControlV1View tdsSegmentedControlV1View = writeTypedList().writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsSegmentedControlV1View, "");
        int i4 = onMessageChannelReady + 91;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return tdsSegmentedControlV1View;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        TextInputEditText textInputEditText = plccSimpleIssueActivity.writeTypedList().onTransact;
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        int i4 = onMessageChannelReady + 29;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return textInputEditText;
    }

    private final TextInputEditText IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 21;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TextInputEditText textInputEditText = writeTypedList().getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        int i4 = onActivityResized + 99;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return textInputEditText;
    }

    private final TdsTopV1T03View IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityResized + 121;
        onMessageChannelReady = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(writeTypedList().onMinimized, "");
            obj.hashCode();
            throw null;
        }
        TdsTopV1T03View tdsTopV1T03View = writeTypedList().onMinimized;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        int i3 = onActivityResized + 53;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            return tdsTopV1T03View;
        }
        throw null;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 19;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            setContentView(writeTypedList().getRoot());
            getSupportActionBar();
            throw null;
        }
        super.onCreate(bundle);
        setContentView(writeTypedList().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i3 = onActivityResized + 55;
            onMessageChannelReady = i3 % 128;
            if (i3 % 2 != 0) {
                supportActionBar.onNavigationEvent(true);
            } else {
                supportActionBar.onNavigationEvent(true);
            }
        }
        IPostMessageServiceStubProxy();
        ITrustedWebActivityCallbackDefault();
        ITrustedWebActivityCallbackStub();
        int i4 = onMessageChannelReady + 117;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onActivityResized + 37;
        int i5 = i4 % 128;
        onMessageChannelReady = i5;
        if (i4 % 2 == 0 ? i == 100 : i == 56) {
            if (i2 != -1 || intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("bankCode");
            String stringExtra2 = intent.getStringExtra("accountNumber");
            if (stringExtra != null) {
                int i6 = onMessageChannelReady + 125;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
                if (stringExtra2 != null) {
                    onWarmupCompleted(new IAuthTabCallback(stringExtra, stringExtra2));
                    onVerticalScrollEvent().setTextFieldSpinnerTitle(getSignForPKCS7V2.onExtraCallbackWithResult(stringExtra) + " " + stringExtra2);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 101) {
            int i8 = i5 + 63;
            onActivityResized = i8 % 128;
            int i9 = i8 % 2;
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1 || intent == null) {
            return;
        }
        RoadAddress roadAddress = null;
        Object[] objArr = new Object[1];
        a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022713).substring(0, 23).codePointAt(21) - 101), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 2098414460, 726935394 + Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031991).substring(0, 7).length() - 75, objArr);
        Serializable serializableExtra = intent.getSerializableExtra(((String) objArr[0]).intern());
        if (serializableExtra instanceof RoadAddress) {
            roadAddress = (RoadAddress) serializableExtra;
        } else {
            int i10 = onMessageChannelReady + 59;
            onActivityResized = i10 % 128;
            int i11 = i10 % 2;
        }
        if (roadAddress != null) {
            int i12 = onActivityResized + 73;
            onMessageChannelReady = i12 % 128;
            int i13 = i12 % 2;
            onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1545201169, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1545201175, new Object[]{this, roadAddress}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            if (roadAddress.onMessageChannelReady() != null) {
                ((TextField) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1309001913, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1309001922, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).setText(roadAddress.onMessageChannelReady());
                onSessionEnded().setText(roadAddress.asInterface());
            }
        }
    }

    public static final class asInterface implements WithdrawAccountListBottomSheet.onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        private static char[] IAuthTabCallback = {32629, 32616, 32625, 32580, 32561};
        private static int onWarmupCompleted = -1184333855;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onNavigationEvent = true;

        public static /* synthetic */ Unit onExtraCallbackWithResult(MyAccountInfo myAccountInfo, PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(myAccountInfo, plccSimpleIssueActivity, setDetectableSize);
            int i4 = IAuthTabCallbackStub + 123;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        public static /* synthetic */ Unit onWarmupCompleted(PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(plccSimpleIssueActivity, setDetectableSize);
            int i4 = IAuthTabCallbackStub + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = IAuthTabCallback;
            float f = 0.0f;
            if (cArr3 != null) {
                int i3 = $11 + 23;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), 77 - View.resolveSize(0, 0), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
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
            try {
                Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                long j = 0;
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 75, 16038 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (onNavigationEvent) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i5 = $11 + 85;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] + iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.getDeadChar(0, 0) + 63, (ViewConfiguration.getPressedStateDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12214 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        }
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
                int i6 = $11 + 87;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 62, 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    j = 0;
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        asInterface() {
        }

        @Override // viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onExtraCallbackWithResult
        public void IAuthTabCallback(MyAccountInfo myAccountInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(myAccountInfo, "");
            PlccSimpleIssueActivity.onExtraCallback(PlccSimpleIssueActivity.this, new IAuthTabCallback(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback()));
            PlccSimpleIssueActivity.asInterface(PlccSimpleIssueActivity.this).setTextFieldSpinnerTitle(getSignForPKCS7V2.onExtraCallbackWithResult(String.valueOf(myAccountInfo.IAuthTabCallbackStub())) + " " + myAccountInfo.onExtraCallback());
            ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__simple_apply_click_account", false, (String) null, (List) null, (Map) null, new PlccSimpleIssueActivity$showAccountListBottomSheet$listener$1$.ExternalSyntheticLambda1(myAccountInfo, PlccSimpleIssueActivity.this), 30, (Object) null);
            int i2 = asBinder + 95;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit IAuthTabCallback(MyAccountInfo myAccountInfo, PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 61;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback().put("action_type", "click");
            Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 127 - KeyEvent.getDeadChar(0, 0), objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), Integer.valueOf(myAccountInfo.IAuthTabCallbackStub()));
            setDetectableSize.onExtraCallback().put("screen_name", plccSimpleIssueActivity.getScreenName());
            Unit unit = Unit.INSTANCE;
            int i4 = asBinder + 99;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Override // viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            int i = 2 % 2;
            getNavigationBar.IAuthTabCallback(PlccIssueAccountInputActivity.Companion.onExtraCallbackWithResult(PlccSimpleIssueActivity.this, (commonTypeToChar.onExtraCallbackWithResult) null), PlccSimpleIssueActivity.this, 100);
            ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__simple_apply_click_account", false, (String) null, (List) null, (Map) null, new PlccSimpleIssueActivity$showAccountListBottomSheet$listener$1$.ExternalSyntheticLambda0(PlccSimpleIssueActivity.this), 30, (Object) null);
            int i2 = IAuthTabCallbackStub + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 123;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback().put("action_type", "click");
            Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-123}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            mapOnExtraCallback.put(strIntern, ((String) objArr2[0]).intern());
            setDetectableSize.onExtraCallback().put("screen_name", plccSimpleIssueActivity.getScreenName());
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackStub + 5;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService_Parcel().setTextFieldSpinnerLabel(getString(R.string.app_activity_plcc_simple_issue_credit_score));
        ICustomTabsServiceStubProxy().setTextFieldSpinnerLabel(getString(R.string.app_activity_plcc_simple_issue_annual_income));
        int i4 = onMessageChannelReady + 21;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityCallbackDefault() throws Throwable {
        toCircle.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("design");
        if (stringExtra == null) {
            stringExtra = "";
        }
        toCircle.IAuthTabCallback[] iAuthTabCallbackArrValues = toCircle.IAuthTabCallback.values();
        int length = iAuthTabCallbackArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                iAuthTabCallback = null;
                break;
            }
            iAuthTabCallback = iAuthTabCallbackArrValues[i4];
            if (Intrinsics.areEqual(iAuthTabCallback.name(), stringExtra)) {
                break;
            } else {
                i4++;
            }
        }
        if (iAuthTabCallback == null) {
            onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_plcc_activity___52578ede50), 0, 2, (Object) null);
            finish();
            return;
        }
        this.IAuthTabCallbackStubProxy = iAuthTabCallback;
        this.writeTypedObject = getIntent().getBooleanExtra("traffic", false);
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a((short) (30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 2098414550 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 726935394, (-65) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String stringExtra2 = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.ICustomTabsCallback = stringExtra2;
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1094184328, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1094184318, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        access200();
        ((TextField) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1309001913, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1309001922, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).onExtraCallback();
        IPostMessageService_Parcel().setText(getString(R.string.app_plcc_activity___5a1ee93ce7, PlayerErrorCode.onPostMessage()));
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (addExtra.ICustomTabsCallback(playerErrorCode) != null) {
            IPostMessageService().setText(addExtra.ICustomTabsCallback(playerErrorCode));
            enableIOSViewClipToPaddingBox.IAuthTabCallback.onWarmupCompleted(new EditText[]{IPostMessageService()});
            M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, ITrustedWebActivityCallback()}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        } else {
            M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, IPostMessageService()}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            int i5 = onActivityResized + 121;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
        }
        List<? extends KeyBoardVisiblePoint> list = this.onTransact;
        if (list == null) {
            int i7 = onMessageChannelReady + 71;
            onActivityResized = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (!list.isEmpty()) {
            int i8 = onMessageChannelReady + 21;
            int i9 = i8 % 128;
            onActivityResized = i9;
            int i10 = i8 % 2;
            List<? extends KeyBoardVisiblePoint> list2 = this.onTransact;
            if (list2 == null) {
                int i11 = i9 + 39;
                onMessageChannelReady = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                list2 = null;
            }
            String strAsInterface = list2.get(0).asInterface();
            List<? extends KeyBoardVisiblePoint> list3 = this.onTransact;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                list3 = null;
            }
            onWarmupCompleted(new IAuthTabCallback(strAsInterface, list3.get(0).bP_()));
            IAuthTabCallback iAuthTabCallback2 = this.access100;
            if (iAuthTabCallback2 != null) {
                onVerticalScrollEvent().setTextFieldSpinnerTitle(getSignForPKCS7V2.onExtraCallbackWithResult(iAuthTabCallback2.onExtraCallback()) + " " + iAuthTabCallback2.onExtraCallbackWithResult());
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[PHI: r4
      0x0085: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v20 byte[]) binds: [B:19:0x0083, B:16:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    private static final Unit onWarmupCompleted(PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback().put("action_type", "click");
            setDetectableSize.onExtraCallback().put("screen_name", plccSimpleIssueActivity.getScreenName());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback().put("screen_name", plccSimpleIssueActivity.getScreenName());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 67;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.plcc.activity.PlccSimpleIssueActivity] */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        final ?? r1 = (PlccSimpleIssueActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 89;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0 ? r1.IEngagementSignalsCallback_Parcel().getVisibility() != 8 : r1.IEngagementSignalsCallback_Parcel().getVisibility() != 33) {
            ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__simple_apply_confirm", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda20
                public final Object invoke(Object obj) {
                    return PlccSimpleIssueActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
                }
            }, 30, (Object) null);
            r1.ITrustedWebActivityService();
            int i3 = onMessageChannelReady + 99;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        r1.IEngagementSignalsCallback_Parcel().setVisibility(0);
        r1.IPostMessageServiceDefault().onWarmupCompleted().setText(r1.getString(R.string.app_plcc_activity___d841e2903f));
        r1.ICustomTabsServiceDefault();
        r1.onActivityLayout();
        TdsSegmentedControlV1View.onExtraCallback(r1.IEngagementSignalsCallbackStubProxy(), 0, false, false, 6, (Object) null);
        return null;
    }

    private static final Unit onExtraCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, PlccSimpleIssueOption plccSimpleIssueOption) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(plccSimpleIssueOption, "");
            plccSimpleIssueActivity.IAuthTabCallback_Parcel = plccSimpleIssueOption;
            plccSimpleIssueActivity.ICustomTabsService_Parcel().setTextFieldSpinnerTitle(plccSimpleIssueOption.onNavigationEvent());
            plccSimpleIssueActivity.ICustomTabsServiceDefault();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(plccSimpleIssueOption, "");
        plccSimpleIssueActivity.IAuthTabCallback_Parcel = plccSimpleIssueOption;
        plccSimpleIssueActivity.ICustomTabsService_Parcel().setTextFieldSpinnerTitle(plccSimpleIssueOption.onNavigationEvent());
        plccSimpleIssueActivity.ICustomTabsServiceDefault();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMessageChannelReady + 113;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackDefault(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        String string = plccSimpleIssueActivity.getString(R.string.app_activity_plcc_simple_issue_annual_income);
        Intrinsics.checkNotNullExpressionValue(string, "");
        onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7109792, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026280).substring(0, 4).codePointAt(2) + 1992230360, -1734033316, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019707).substring(0, 22).length() - 1479667672, 1734033327, new Object[]{plccSimpleIssueActivity, string, plccSimpleIssueActivity.asBinder, plccSimpleIssueActivity.IAuthTabCallbackStub, new PlccSimpleIssueActivity$.ExternalSyntheticLambda0(plccSimpleIssueActivity)}, SocketRowKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i2 = onActivityResized + 111;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, PlccSimpleIssueOption plccSimpleIssueOption) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 13;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(plccSimpleIssueOption, "");
        plccSimpleIssueActivity.IAuthTabCallbackStub = plccSimpleIssueOption;
        plccSimpleIssueActivity.ICustomTabsServiceStubProxy().setTextFieldSpinnerTitle(plccSimpleIssueOption.onNavigationEvent());
        plccSimpleIssueActivity.ICustomTabsServiceDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 27;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void asInterface(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        plccSimpleIssueActivity.ITrustedWebActivityCallback_Parcel();
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(int i, PlccSimpleIssueActivity plccSimpleIssueActivity, SetDetectableSize setDetectableSize) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        if (i == 1) {
            int i3 = onMessageChannelReady + 11;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a((short) (TextUtils.getTrimmedLength("") + 64), (byte) (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)), Color.green(0) * 2098414559, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 726935385, 49 / (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a((short) (8 - TextUtils.getTrimmedLength("")), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 2098414559, 726935385 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-69) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
        } else {
            int i4 = onActivityResized + 35;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
            strIntern = "company";
        }
        Object[] objArr3 = new Object[1];
        a((short) ((-34) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2098414561, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 726935396, (-70) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        mapOnExtraCallback.put(((String) objArr3[0]).intern(), strIntern);
        setDetectableSize.onExtraCallback().put("screen_name", plccSimpleIssueActivity.getScreenName());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final PlccSimpleIssueActivity plccSimpleIssueActivity, View view, final int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__simple_apply_click_address", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return PlccSimpleIssueActivity.onNavigationEvent(i, plccSimpleIssueActivity, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        if (i != 1) {
            int i3 = onActivityResized + 99;
            int i4 = i3 % 128;
            onMessageChannelReady = i4;
            z = i3 % 2 != 0;
            int i5 = i4 + 121;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        }
        plccSimpleIssueActivity.onNavigationEvent(z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackStub(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) {
        int i = 2 % 2;
        getNavigationBar.IAuthTabCallback(plccSimpleIssueActivity.setEngagementSignalsCallback().onExtraCallbackWithResult(plccSimpleIssueActivity, new MultilevelSelectActivityExternalSyntheticLambda2(false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "toss_plcc", (HashMap) null, (String) null, 0, (GriverPageContainerPullFreshCallback) null, (String) null, (RoadAddress) null, (Sido) null, 65279, (DefaultConstructorMarker) null)), plccSimpleIssueActivity, 101);
        int i2 = onMessageChannelReady + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        r7 = (o.KeyBoardVisiblePoint) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        r1 = viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.onActivityResized + 51;
        viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.onMessageChannelReady = r1 % 128;
        r1 = r1 % 2;
        r7 = o.issueCertV3.IAuthTabCallbackDefault(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r8 = getString(viva.republica.toss.R.string.app_plcc_activity___0123d18326);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        new viva.republica.toss.send.common.WithdrawAccountListBottomSheet(r20, r4, r6, r7, r5, r8, null, true, viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onWarmupCompleted.TOSS_PLCC, null, null, null, null, 7744, null).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ITrustedWebActivityCallback_Parcel() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.ITrustedWebActivityCallback_Parcel():void");
    }

    private final void access200() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        List listIAuthTabCallback = PageShowPoint.Companion.IAuthTabCallback();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listIAuthTabCallback) {
            int i2 = onMessageChannelReady + 107;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).requestPostMessageChannelWithExtras()) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        this.onTransact = DERConstructedSequence.onNavigationEvent.IAuthTabCallback(arrayList);
        int i4 = onMessageChannelReady + 75;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((Throwable) objArr[0], "");
        RecommendedEnglishNameResponse recommendedEnglishNameResponse = new RecommendedEnglishNameResponse(CollectionsKt.emptyList());
        int i2 = onActivityResized + 113;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return recommendedEnglishNameResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, RecommendedEnglishNameResponse recommendedEnglishNameResponse) {
        Object next;
        int i = 2 % 2;
        List<RecommendedEnglishName> listOnWarmupCompleted = recommendedEnglishNameResponse.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnWarmupCompleted.iterator();
        int i2 = onMessageChannelReady + 101;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onMessageChannelReady + 121;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                next = it.next();
                if (StringsKt.split$default(((RecommendedEnglishName) next).IAuthTabCallback(), new String[]{" "}, false, 0, 58, (Object) null).size() == 3) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (StringsKt.split$default(((RecommendedEnglishName) next).IAuthTabCallback(), new String[]{" "}, false, 0, 6, (Object) null).size() == 2) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i5 = onActivityResized + 93;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        while (it2.hasNext()) {
            String upperCase = ((RecommendedEnglishName) it2.next()).IAuthTabCallback().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList2.add(upperCase);
        }
        String str = (String) CollectionsKt.first(arrayList2);
        if (str.length() > 0) {
            List listSplit$default = StringsKt.split$default(str, new String[]{" "}, false, 0, 6, (Object) null);
            String str2 = (String) listSplit$default.get(0);
            ((TextInputEditText) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1564248766, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1564248780, new Object[]{plccSimpleIssueActivity}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).setText((String) listSplit$default.get(1));
            plccSimpleIssueActivity.IEngagementSignalsCallbackStub().setText(str2);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 7;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        final PlccSimpleIssueActivity plccSimpleIssueActivity = (PlccSimpleIssueActivity) objArr[0];
        int i = 2 % 2;
        writeRaw<BaseApiResponse<RecommendedEnglishNameResponse>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onNavigationEvent();
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda15
            public final Object apply(Object obj) {
                return PlccSimpleIssueActivity.onExtraCallbackWithResult((Throwable) obj);
            }
        }).IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        plccSimpleIssueActivity.onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback2, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                return PlccSimpleIssueActivity.onTransact((Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return PlccSimpleIssueActivity.onExtraCallbackWithResult(this.f$0, (RecommendedEnglishNameResponse) obj);
            }
        }));
        int i2 = onActivityResized + 113;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return null;
    }

    private static final Unit IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 21;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
            i = 4;
        } else {
            z = false;
            i = 3;
        }
        BaseActivity.IAuthTabCallback(plccSimpleIssueActivity, (String) null, z, i, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 1;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 31;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void access100(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 5;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        plccSimpleIssueActivity.bo_();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onActivityResized + 55;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[PHI: r2
      0x0086: PHI (r2v6 im.toss.featurescommon.profile.library.model.Address) = 
      (r2v5 im.toss.featurescommon.profile.library.model.Address)
      (r2v13 im.toss.featurescommon.profile.library.model.Address)
     binds: [B:23:0x0084, B:20:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r20) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit IAuthTabCallbackStub(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            unit = Unit.INSTANCE;
            int i3 = 10 / 0;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onActivityResized + 83;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return unit;
    }

    private final void onNavigationEvent(final boolean z) {
        int i = 2 % 2;
        writeRaw writerawOnExtraCallback = getNightColor.onExtraCallback(onNavigationEvent(), false, 1, (Object) null);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (deserializeUriNullableCollection) obj};
                return (Unit) PlccSimpleIssueActivity.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1332363429, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1332363445, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback2.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda10
            public final void accept(Object obj) {
                PlccSimpleIssueActivity.onWarmupCompleted(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda11
            public final void run() {
                PlccSimpleIssueActivity.onExtraCallback(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return PlccSimpleIssueActivity.asBinder((Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return PlccSimpleIssueActivity.onNavigationEvent(this.f$0, z, (Profile) obj);
            }
        }));
        int i2 = onActivityResized + 55;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void ICustomTabsServiceDefault() {
        Editable text;
        int i = 2 % 2;
        Editable text2 = IPostMessageService().getText();
        if (text2 != null) {
            int i2 = onMessageChannelReady + 49;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            if (text2.length() == 6) {
                int i4 = onActivityResized + 17;
                onMessageChannelReady = i4 % 128;
                int i5 = i4 % 2;
                Editable text3 = ITrustedWebActivityCallback().getText();
                if (text3 != null && text3.length() == 7) {
                    Editable text4 = ((TextInputEditText) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1564248766, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1564248780, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).getText();
                    if (text4 != null) {
                        int i6 = onMessageChannelReady + 95;
                        onActivityResized = i6 % 128;
                        Object obj = null;
                        if (i6 % 2 == 0) {
                            text4.length();
                            throw null;
                        }
                        if (text4.length() != 0 && (text = IEngagementSignalsCallbackStub().getText()) != null && text.length() != 0) {
                            int i7 = onMessageChannelReady + 83;
                            onActivityResized = i7 % 128;
                            int i8 = i7 % 2;
                            if (!StringsKt.isBlank((Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{onSessionEnded()}, -450491624, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())) && this.access100 != null && this.access000 != null) {
                                int i9 = onActivityResized + 3;
                                int i10 = i9 % 128;
                                onMessageChannelReady = i10;
                                if (i9 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (this.IAuthTabCallbackStub != null && this.IAuthTabCallback_Parcel != null) {
                                    int i11 = i10 + 123;
                                    onActivityResized = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        transparentBackground.onWarmupCompleted(IPostMessageServiceDefault().onWarmupCompleted());
                                        return;
                                    } else {
                                        transparentBackground.onWarmupCompleted(IPostMessageServiceDefault().onWarmupCompleted());
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        transparentBackground.onExtraCallback(IPostMessageServiceDefault().onWarmupCompleted());
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 123;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 45;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback_Parcel(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 19;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        plccSimpleIssueActivity.bo_();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = onMessageChannelReady + 107;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onMessageChannelReady = i2 % 128;
        toCircle.IAuthTabCallback iAuthTabCallback = null;
        if (i2 % 2 == 0) {
            if (bool.booleanValue()) {
                PlccSimpleIssueCompleteActivity.onNavigationEvent onnavigationevent = PlccSimpleIssueCompleteActivity.Companion;
                Context baseContext = plccSimpleIssueActivity.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "");
                toCircle.IAuthTabCallback iAuthTabCallback2 = plccSimpleIssueActivity.IAuthTabCallbackStubProxy;
                if (iAuthTabCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i3 = onMessageChannelReady + 9;
                    onActivityResized = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    iAuthTabCallback = iAuthTabCallback2;
                }
                getNavigationBar.IAuthTabCallback(onnavigationevent.onExtraCallbackWithResult(baseContext, iAuthTabCallback, plccSimpleIssueActivity.writeTypedObject, plccSimpleIssueActivity.IPostMessageServiceStub()), plccSimpleIssueActivity);
                plccSimpleIssueActivity.finish();
            } else {
                onJsBridgeReady.onNavigationEvent(plccSimpleIssueActivity, plccSimpleIssueActivity.getString(R.string.app_plcc_activity___1ac95bee5d), 0, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        bool.booleanValue();
        iAuthTabCallback.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 21;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, plccSimpleIssueActivity, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return PlccSimpleIssueActivity.IAuthTabCallback((DialogInterface) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityResized + 119;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void cancelNotification() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity.cancelNotification():void");
    }

    private static final void IAuthTabCallback(Function1 function1, PlccSimpleIssueOption plccSimpleIssueOption, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 37;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(plccSimpleIssueOption);
            gettypedexportedconstants.dismiss();
            int i3 = 88 / 0;
        } else {
            function1.invoke(plccSimpleIssueOption);
            gettypedexportedconstants.dismiss();
        }
        int i4 = onMessageChannelReady + 73;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String strOnNavigationEvent;
        BaseActivity baseActivity = (PlccSimpleIssueActivity) objArr[0];
        String str = (String) objArr[1];
        List<PlccSimpleIssueOption> list = (List) objArr[2];
        PlccSimpleIssueOption plccSimpleIssueOption = (PlccSimpleIssueOption) objArr[3];
        final Function1 function1 = (Function1) objArr[4];
        int i = 2 % 2;
        access000 access000Var = access000.onWarmupCompleted;
        logAndOpenStore.IAuthTabCallback(baseActivity, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(baseActivity, 0, false, false, -1L, access000Var, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.IAuthTabCallback(true);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(linearLayout, varyMatches.onNavigationEvent(24, displayMetrics));
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(str);
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsNestedScrollView tdsNestedScrollView = new TdsNestedScrollView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Context context4 = tdsNestedScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        for (final PlccSimpleIssueOption plccSimpleIssueOption2 : list) {
            Context context5 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context5, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
            tdsListRowV1View.setCenterText1(plccSimpleIssueOption2.onNavigationEvent());
            if (plccSimpleIssueOption != null) {
                int i2 = onActivityResized + 85;
                onMessageChannelReady = i2 % 128;
                if (i2 % 2 != 0) {
                    strOnNavigationEvent = plccSimpleIssueOption.onNavigationEvent();
                    int i3 = 18 / 0;
                } else {
                    strOnNavigationEvent = plccSimpleIssueOption.onNavigationEvent();
                }
                int i4 = onMessageChannelReady + 9;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strOnNavigationEvent = null;
            }
            if (Intrinsics.areEqual(strOnNavigationEvent, plccSimpleIssueOption2.onNavigationEvent())) {
                int i6 = onMessageChannelReady + 41;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
                tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
                tdsListRowV1View.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE);
                tdsListRowV1View.setRightCheckBoxCheckedState(true);
            }
            tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.plcc.activity.PlccSimpleIssueActivity$$ExternalSyntheticLambda19
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlccSimpleIssueActivity.onWarmupCompleted(function1, plccSimpleIssueOption2, gettypedexportedconstants, view);
                }
            });
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View);
        }
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), varyMatches.onNavigationEvent(24, displayMetrics2));
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsNestedScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsNestedScrollView);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        return null;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlccSimpleIssueActivity.this.new IAuthTabCallbackStubProxy(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IEngagementSignalsCallback_Parcel interfaceDescriptor = PlccSimpleIssueActivity.getInterfaceDescriptor(PlccSimpleIssueActivity.this);
                getDummyAd getdummyadICustomTabsServiceStub = PlccSimpleIssueActivity.this.ICustomTabsServiceStub();
                BaseActivity baseActivity = PlccSimpleIssueActivity.this;
                this.L$0 = interfaceDescriptor;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadICustomTabsServiceStub, baseActivity, "STD_154_TOSS_CREDIT_CARD_SIMPLE", (String) null, "toss_plcc", 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388596, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                iEngagementSignalsCallback_Parcel = interfaceDescriptor;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel2 = (SessionTrackera) this.L$0;
                ResultKt.onNavigationEvent(obj);
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_Parcel2;
                objOnExtraCallback = obj;
            }
            iEngagementSignalsCallback_Parcel.onNavigationEvent(objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    private final void ITrustedWebActivityService() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(null), 3, (Object) null);
        int i2 = onActivityResized + 101;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback {
        private final String onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback);
        }

        public int hashCode() {
            return (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            return "Account(bankCode=" + this.onWarmupCompleted + ", accountNo=" + this.onExtraCallback + ")";
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
        }

        public final String onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private final void ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        ITrustedWebActivityCallback().addTextChangedListener(new asBinder());
        Iterator it = CollectionsKt.listOf(new TextInputEditText[]{(TextInputEditText) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1564248766, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1564248780, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted()), IEngagementSignalsCallbackStub()}).iterator();
        int i2 = onActivityResized + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            ((TextInputEditText) it.next()).addTextChangedListener(new IAuthTabCallbackStub());
        }
        IPostMessageServiceDefault().onWarmupCompleted().setOnClickListener(new PlccSimpleIssueActivity$.ExternalSyntheticLambda2(this));
        ICustomTabsService_Parcel().setOnClickListener(new PlccSimpleIssueActivity$.ExternalSyntheticLambda3(this));
        ICustomTabsServiceStubProxy().setOnClickListener(new PlccSimpleIssueActivity$.ExternalSyntheticLambda4(this));
        onVerticalScrollEvent().setOnClickListener(new PlccSimpleIssueActivity$.ExternalSyntheticLambda5(this));
        IEngagementSignalsCallbackStubProxy().IAuthTabCallback(new PlccSimpleIssueActivity$.ExternalSyntheticLambda6(this));
        ((TextField) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1309001913, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1309001922, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).IAuthTabCallback().setOnClickListener(new PlccSimpleIssueActivity$.ExternalSyntheticLambda7(this));
        ((TextField) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1309001913, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1309001922, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).IAuthTabCallback().addTextChangedListener(new IAuthTabCallbackDefault());
        onSessionEnded().IAuthTabCallback().addTextChangedListener(new onTransact());
        int i4 = onMessageChannelReady + 39;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 1852098349, iOnWarmupCompleted2, -1852098336, new Object[]{plccSimpleIssueActivity, view}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1332363429, iOnWarmupCompleted2, 1332363445, new Object[]{plccSimpleIssueActivity, deserializeurinullablecollection}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity, View view, int i) {
        Object[] objArr = {plccSimpleIssueActivity, view, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -936300918, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 936300923, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static final /* synthetic */ void IAuthTabCallback(PlccSimpleIssueActivity plccSimpleIssueActivity) throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 887912735, iOnWarmupCompleted2, -887912728, new Object[]{plccSimpleIssueActivity}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static final /* synthetic */ TextField onWarmupCompleted(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (TextField) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -325094832, iOnWarmupCompleted2, 325094850, new Object[]{plccSimpleIssueActivity}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static final /* synthetic */ LinearLayout asBinder(PlccSimpleIssueActivity plccSimpleIssueActivity) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (LinearLayout) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1006428879, iOnWarmupCompleted2, 1006428894, new Object[]{plccSimpleIssueActivity}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, List list) throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -522189316, iOnWarmupCompleted2, 522189319, new Object[]{plccSimpleIssueActivity, list}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(PlccSimpleIssueActivity plccSimpleIssueActivity, boolean z, Profile profile) {
        Object[] objArr = {plccSimpleIssueActivity, Boolean.valueOf(z), profile};
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1296032022, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1296032024, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final void IEngagementSignalsCallback() throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 1094184328, iOnWarmupCompleted2, -1094184318, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final RecommendedEnglishNameResponse IAuthTabCallbackDefault(Throwable th) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (RecommendedEnglishNameResponse) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -425353522, iOnWarmupCompleted2, 425353522, new Object[]{th}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit asInterface(Throwable th) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1248317752, iOnWarmupCompleted2, 1248317760, new Object[]{th}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final TextField IEngagementSignalsCallbackDefault() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (TextField) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1309001913, iOnWarmupCompleted2, 1309001922, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final TextInputEditText onGreatestScrollPercentageIncreased() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (TextInputEditText) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1564248766, iOnWarmupCompleted2, 1564248780, new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final void onTransact(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -33703968, iOnWarmupCompleted2, 33703980, new Object[]{plccSimpleIssueActivity, view}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final void asBinder(PlccSimpleIssueActivity plccSimpleIssueActivity, View view) throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 302388765, iOnWarmupCompleted2, -302388761, new Object[]{plccSimpleIssueActivity, view}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final void onExtraCallback(RoadAddress roadAddress) throws NoSuchMethodException, SecurityException {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1545201169, iOnWarmupCompleted2, 1545201175, new Object[]{this, roadAddress}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final void onExtraCallback(String str, List<PlccSimpleIssueOption> list, PlccSimpleIssueOption plccSimpleIssueOption, Function1<? super PlccSimpleIssueOption, Unit> function1) throws NoSuchMethodException, SecurityException {
        onNavigationEvent(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7109792, 1992230360 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026280).substring(0, 4).codePointAt(2), -1734033316, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019707).substring(0, 22).length() - 1479667672, 1734033327, new Object[]{this, str, list, plccSimpleIssueOption, function1}, SocketRowKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(PlccSimpleIssueActivity plccSimpleIssueActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -839540822, iOnWarmupCompleted2, 839540839, new Object[]{plccSimpleIssueActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(PlccSimpleIssueActivity plccSimpleIssueActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, 1666915503, iOnWarmupCompleted2, -1666915502, new Object[]{plccSimpleIssueActivity, deserializeurinullablecollection}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityResized + 65;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onMessageChannelReady + 53;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onActivityResized + 3;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 5;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onActivityResized + 7;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 59;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = onActivityResized + 5;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    static void validateRelationship() {
        readTypedObject = 648766497;
        extraCallback = -1538795454;
        onActivityLayout = 1894514968;
        onPostMessage = new byte[]{-11, -75, -23, -32, -48, -22, -8, -36, -8, -2, -9, 31, 17, 47, 17, 0, 27, 23, 12, 8, 8, 8, 8};
    }
}
