package viva.republica.toss.plcc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.R;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_Update_GenmGenp;
import o.ConvertByteArrayToFloatArray;
import o.IPostMessageServiceStubProxy;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.commonTypeToChar;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.onJsBridgeReady;
import o.readIntokhttp;
import o.toCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.plcc.activity.PlccSimpleIssueCompleteActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccSimpleIssueCompleteActivity extends Hilt_PlccSimpleIssueCompleteActivity {
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallbackStub;
    private static short[] IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int access000;
    private static byte[] access100;
    private static final String asInterface;
    private static int getInterfaceDescriptor;
    private static int writeTypedObject;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    private boolean asBinder;
    private toCircle.IAuthTabCallback onTransact;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject = 0;
    private static int extraCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, byte r7) {
        /*
            byte[] r0 = viva.republica.toss.plcc.activity.PlccSimpleIssueCompleteActivity.$$a
            int r7 = r7 * 2
            int r7 = r7 + 115
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r5 = r5 * 4
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r5]
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSimpleIssueCompleteActivity.$$c(short, int, byte):java.lang.String");
    }

    static {
        writeTypedObject = 0;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a((short) (69 - TextUtils.lastIndexOf("", '0')), (byte) Gravity.getAbsoluteGravity(0, 0), 2067645541 + (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 139983460 - View.resolveSizeAndState(0, 0, 0), (-91) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        asInterface = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        IAuthTabCallbackStub = 8;
        int i = extraCallbackWithResult + 15;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i4 | i7);
        int i9 = i5 | i8;
        int i10 = ~i5;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i5)) | (~(i10 | i2));
        int i13 = i2 + i5 + i3 + (513088896 * i6) + ((-1342203445) * i);
        int i14 = i13 * i13;
        int i15 = (665020156 * i2) + 661520384 + (1303681286 * i5) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i3) + ((-771751936) * i6) + (1382285312 * i) + ((-350355456) * i14);
        int i16 = ((i2 * (-363642324)) - 614971735) + (i5 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i3 * (-363641803)) + (i6 * (-2127225984)) + (i * (-1080704249)) + (i14 * (-1523187712));
        return i15 + ((i16 * i16) * (-227409920)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSimpleIssueCompleteActivity plccSimpleIssueCompleteActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(plccSimpleIssueCompleteActivity, setDetectableSize);
        }
        onExtraCallback(plccSimpleIssueCompleteActivity, setDetectableSize);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PlccSimpleIssueCompleteActivity plccSimpleIssueCompleteActivity = (PlccSimpleIssueCompleteActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(plccSimpleIssueCompleteActivity, view);
        int i4 = extraCallback + 25;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 15;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return -1L;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<CMP_Update_GenmGenp> {
        final /* synthetic */ Activity IAuthTabCallback;

        public onExtraCallbackWithResult(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMP_Update_GenmGenp invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Update_GenmGenp.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 101;
        readTypedObject = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 33;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final commonTypeToChar.onExtraCallbackWithResult updateVisuals() {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (commonTypeToChar.onExtraCallbackWithResult) getIntent().getParcelableExtra("extra.plcc.logParams");
        }
        int i3 = 55 / 0;
        return (commonTypeToChar.onExtraCallbackWithResult) getIntent().getParcelableExtra("extra.plcc.logParams");
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return "tosscreditcard__complete_issuance";
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            updateVisuals();
            obj.hashCode();
            throw null;
        }
        commonTypeToChar.onExtraCallbackWithResult onextracallbackwithresultUpdateVisuals = updateVisuals();
        if (onextracallbackwithresultUpdateVisuals != null) {
            return onextracallbackwithresultUpdateVisuals.IAuthTabCallback();
        }
        int i3 = readTypedObject + 3;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final CMP_Update_GenmGenp setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMP_Update_GenmGenp cMP_Update_GenmGenp = (CMP_Update_GenmGenp) value;
        int i4 = readTypedObject + 69;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return cMP_Update_GenmGenp;
        }
        throw null;
    }

    private final TdsButtonV1View validateRelationship() {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1View = setEngagementSignalsCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        int i4 = extraCallback + 51;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsButtonV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsImageView ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = setEngagementSignalsCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = extraCallback + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsTopV2View ICustomTabsServiceDefault() {
        TdsTopV2View tdsTopV2View;
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            tdsTopV2View = setEngagementSignalsCallback().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsTopV2View, "");
            int i3 = 73 / 0;
        } else {
            tdsTopV2View = setEngagementSignalsCallback().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsTopV2View, "");
        }
        int i4 = extraCallback + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsTopV2View;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueCompleteActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(setEngagementSignalsCallback().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            supportActionBar.onNavigationEvent(R.drawable.icn_navigation_close);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("extra.plcc.cardStyle");
        Object obj = null;
        toCircle.IAuthTabCallback iAuthTabCallback = serializableExtra instanceof toCircle.IAuthTabCallback ? (toCircle.IAuthTabCallback) serializableExtra : null;
        if (iAuthTabCallback == null) {
            int i4 = readTypedObject + 35;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                onJsBridgeReady.onNavigationEvent(this, getString(viva.republica.toss.R.string.app_plcc_activity___92c43a4e36), 0, 3, (Object) null);
                finish();
                return;
            } else {
                onJsBridgeReady.onNavigationEvent(this, getString(viva.republica.toss.R.string.app_plcc_activity___92c43a4e36), 0, 2, (Object) null);
                finish();
                return;
            }
        }
        this.onTransact = iAuthTabCallback;
        this.asBinder = getIntent().getBooleanExtra("extra.plcc.traffic", false);
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -466917971, new Object[]{this}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 466917971, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i5 = extraCallback + 55;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context, viva.republica.toss.plcc.activity.PlccSimpleIssueCompleteActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ?? r6 = (PlccSimpleIssueCompleteActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 41;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        toCircle.IAuthTabCallback iAuthTabCallback = ((PlccSimpleIssueCompleteActivity) r6).onTransact;
        if (iAuthTabCallback == null) {
            int i5 = i2 + 115;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = readTypedObject + 109;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback = null;
        }
        r6.onExtraCallback(iAuthTabCallback, ((PlccSimpleIssueCompleteActivity) r6).asBinder);
        TdsTopV2View tdsTopV2ViewICustomTabsServiceDefault = r6.ICustomTabsServiceDefault();
        tdsTopV2ViewICustomTabsServiceDefault.setUpperGap(24);
        tdsTopV2ViewICustomTabsServiceDefault.setLowerGap(24);
        tdsTopV2ViewICustomTabsServiceDefault.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2ViewICustomTabsServiceDefault.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2ViewICustomTabsServiceDefault.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2ViewICustomTabsServiceDefault.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        Context context = tdsTopV2ViewICustomTabsServiceDefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2ViewICustomTabsServiceDefault.setTitleTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onUnminimized());
        Context context2 = tdsTopV2ViewICustomTabsServiceDefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsTopV2ViewICustomTabsServiceDefault.setSubtitle2TextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).onPostMessage());
        String string = r6.getString(viva.republica.toss.R.string.app_cardrecommend_plcc_issue_complete_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2ViewICustomTabsServiceDefault.setTitleText(string);
        String string2 = r6.getString(viva.republica.toss.R.string.app_cardrecommend_plcc_issue_complete_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2ViewICustomTabsServiceDefault.setSubtitle2Text(string2);
        TdsButtonV1View tdsButtonV1ViewValidateRelationship = r6.validateRelationship();
        tdsButtonV1ViewValidateRelationship.setText(im.toss.uikit.R.string.uikit_confirm);
        tdsButtonV1ViewValidateRelationship.setOnClickListener(new PlccSimpleIssueCompleteActivity$.ExternalSyntheticLambda0((PlccSimpleIssueCompleteActivity) r6));
        return null;
    }

    private static final Unit onExtraCallback(PlccSimpleIssueCompleteActivity plccSimpleIssueCompleteActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", plccSimpleIssueCompleteActivity.getScreenName());
        Object[] objArr = new Object[1];
        a((short) TextUtils.indexOf("", ""), (byte) Color.alpha(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2067646133, 139983472 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-90) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "confirm");
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 33;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void IAuthTabCallback(PlccSimpleIssueCompleteActivity plccSimpleIssueCompleteActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__complete_issuance_confirm", false, (String) null, (List) null, (Map) null, new PlccSimpleIssueCompleteActivity$.ExternalSyntheticLambda1(plccSimpleIssueCompleteActivity), 30, (Object) null);
        plccSimpleIssueCompleteActivity.IEngagementSignalsCallback();
        int i2 = extraCallback + 77;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallback(toCircle.IAuthTabCallback iAuthTabCallback, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            TdsImageView.setImage$default(ICustomTabsServiceStub(), onExtraCallbackWithResult(iAuthTabCallback, z), (Function1) null, (Function1) null, 22, (Object) null);
        } else {
            TdsImageView.setImage$default(ICustomTabsServiceStub(), onExtraCallbackWithResult(iAuthTabCallback, z), (Function1) null, (Function1) null, 6, (Object) null);
        }
        int i3 = readTypedObject + 33;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String onExtraCallbackWithResult(toCircle.IAuthTabCallback iAuthTabCallback, boolean z) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallback + 3;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0 ? (i = onExtraCallback.IAuthTabCallback[iAuthTabCallback.ordinal()]) == 1 : (i = onExtraCallback.IAuthTabCallback[iAuthTabCallback.ordinal()]) == 1) {
            if (!z) {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr = new Object[1];
                a((short) (55 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 2067646035 + ((Process.getThreadPriority(0) + 20) >> 6), 139983460 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.rgb(0, 0, 0) + 16777125, objArr);
                return ((String) objArr[0]).intern();
            }
            int i4 = readTypedObject + 3;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            a((short) (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2067645948 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 139983459 - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 92, objArr2);
            return ((String) objArr2[0]).intern();
        }
        if (i == 2) {
            if (z) {
                Object[] objArr3 = new Object[1];
                a((short) (TextUtils.getOffsetAfter("", 0) + 41), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2067645763 - (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 139983461, (-92) - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
                return ((String) objArr3[0]).intern();
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr4 = new Object[1];
            a((short) (TextUtils.getOffsetAfter("", 0) + 78), (byte) View.getDefaultSize(0, 0), 2067645850 - View.MeasureSpec.getMode(0), 139983459 - TextUtils.lastIndexOf("", '0'), KeyEvent.normalizeMetaState(0) - 91, objArr4);
            return ((String) objArr4[0]).intern();
        }
        if (i == 3) {
            Object[] objArr5 = new Object[1];
            a((short) (TextUtils.lastIndexOf("", '0', 0) + 90), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2067645679 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 139983461, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 92, objArr5);
            return ((String) objArr5[0]).intern();
        }
        int i6 = extraCallback + 33;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0 ? i != 4 : i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr6 = new Object[1];
        a((short) (KeyEvent.getDeadChar(0, 0) + 54), (byte) ExpandableListView.getPackedPositionType(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 2067645597, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 139983459, (-91) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        return ((String) objArr6[0]).intern();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intentPutExtra = IAuthTabCallback().onExtraCallbackWithResult(this).setFlags(268468224).putExtra("scrollTo", "CARD");
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        startActivity(intentPutExtra);
        int i4 = extraCallback + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull toCircle.IAuthTabCallback iAuthTabCallback, boolean z, @Nullable commonTypeToChar.onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intent intent = new Intent(context, (Class<?>) PlccSimpleIssueCompleteActivity.class);
            intent.putExtra("extra.plcc.cardStyle", iAuthTabCallback);
            intent.putExtra("extra.plcc.traffic", z);
            intent.putExtra("extra.plcc.logParams", onextracallbackwithresult);
            return intent;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback_Parcel)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = access100;
                if (bArr2 != null) {
                    int i7 = $11 + 81;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12843), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55, ImageFormat.getBitsPerPixel(0) + 2168, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = access100;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(getInterfaceDescriptor)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43424), 41 - TextUtils.lastIndexOf("", '0'), View.resolveSize(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallbackStubProxy[i + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i8 = ((i + iIntValue) - 2) + ((int) (getInterfaceDescriptor ^ j));
                if (z2) {
                    int i9 = $10 + 91;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(access000), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) + 86, 9567 - ExpandableListView.getPackedPositionType(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = access100;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i12 = $11 + 43;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackStubProxy;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    public static /* synthetic */ void onWarmupCompleted(PlccSimpleIssueCompleteActivity plccSimpleIssueCompleteActivity, View view) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1844118325, new Object[]{plccSimpleIssueCompleteActivity, view}, iOnNavigationEvent2, iOnNavigationEvent, 1844118326, iOnNavigationEvent3);
    }

    private final void ICustomTabsService_Parcel() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -466917971, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent, 466917971, iOnNavigationEvent3);
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueCompleteActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = readTypedObject + 33;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueCompleteActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallback + 31;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueCompleteActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallback + 105;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 109;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSimpleIssueCompleteActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = readTypedObject + 69;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        getInterfaceDescriptor = 545645459;
        IAuthTabCallback_Parcel = -1538795438;
        access000 = 1408228876;
        byte[] bArr = new byte[596];
        System.arraycopy("Ö»°ô\u008c¤Ã°´¥Ï»Ë¢Êºµÿ\u008d¤Ã°¢²¶½÷~±Á¤²Äät¶ý}²¶½\b\u008d¼§Å¯³ö²§\u0089µ¾²ÎðËÀ\u0004\u008cÏêÌ³Õ·ÎÓ½ÝÇÁµÑ²ÂÆÍ×ÊÌÆ\f\u009cÉÁÝ÷\u009cÀØ¶ÆÜÍ´ÓÀö\u009d´ÓÀ²ÂÆÍ\u0007\u008eÁÑ´ÂÔô\u0084Æ\r\u008dÂÆÍ\u0018\u009dÌ·Õ¿Ã\u0006Â·\u0099ÅÎÂÞò¨\u00adáT·\u009eº§©\u0090²\u0094«°\u009aº¤®\u0092¾\u009f¯£ª´\u0097©£éy\u0096®ºÔy\u00ad¥\u0093£¹ª\u0091°\u00adÓz\u0091°\u00ad\u009f¯£ªäk®¾\u0091¯±Ña£êj¯£ªåz©\u0094²\u009c ã¯\u0094f¢«¯»õØÝ\u0011\u0099ÜÔàÛØèÓÙÀâÄÛàÊêÔÞÂîÏßÓÚäÇÙÓ\u0019©ÆÞê\u0004©ÝÕÃÓéÚÁàÝ\u0003ªÁàÝÏßÓÚ\u0014\u009bÞîÁßá\u0001\u0091Ó\u001a\u009aßÓÚ\u0015ªÙÄâÌÐ\u0013ßÄ\u0096ÒÛßë\u0000£¸üeºÈ£¤·»¬½·½\u0095§¿Ë¦£³¾¤«Í¯¦Ë\u0095µ¿¹\u00adÉªº¾¥Ï¢¤¾ät¡¹µït¸°®¾´¥¬Ë¸îu¬Ë¸ªº¾¥ÿf¹É¬ºÌì|¾åeº¾¥ðu¤¯Í\u0097»þº¯q½¦º¶õðõIÉ\u0001ç\u0018óð\u0000\u000bñø\u001aüó\u0018â\u0002\föú\u0006ç÷\u000bò\u001cÿñ\u000b1Áþö\u0002<Áõ\rû\u000b\u0001òù\u0018õ;Âù\u0018õç÷\u000bòL³ö\u0006ù÷\u00199É\u000b2²÷\u000bòMÂñü\u001aä\bK÷üÎ\nó÷\u0003\u0000ÉÎ\u0002\u008bÀÞÉÊÝÁ²ÃÝÃ³Ú°ÑÌÉÙÄÊ±ÓµÌÑ»ÛÅÏ³ß°ÀÄËÕÈÊÄ\n\u009a·ÏÛõ\u009aÎÆ´ÄÚË²ÑÎô\u009b²ÑÎ°ÀÄË\u0005\u008cÏß²ÀÒò\u0082Ä\u000b\u008bÀÄË\u0006\u009bÊµÓ½Á\u0004Àµ\u0087ÃÌÀÜ¢ýÿ\r".getBytes("ISO-8859-1"), 0, bArr, 0, 596);
        access100 = bArr;
    }
}
