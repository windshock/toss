package viva.republica.toss.plcc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.tabs.TabLayout;
import im.toss.base.BaseActivity;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.TdsProgressBarV0View;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.tab.TdsTabV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulesListExternalSyntheticLambda0;
import o.CMP_Issue_Result;
import o.CameraControllerExternalSyntheticLambda9;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1;
import o.M_;
import o.RightClickGesturesKtonRightClickDown2;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.commonTestFlag;
import o.deprecated_minFreshSeconds;
import o.enableCustomFocusSearchOnClippedElementsAndroid;
import o.getAdService;
import o.getKekid;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.minWebSocketMessageToCompress;
import o.patch;
import o.readIntokhttp;
import o.setBodyokhttp;
import o.transparentBackground;
import o.varyMatches;
import o.zzag;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;
import viva.republica.toss.plcc.activity.PlccCardBenefitActivity$;
import viva.republica.toss.plcc.viewmodel.PlccCardBenefitViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccCardBenefitActivity extends Hilt_PlccCardBenefitActivity {
    public static final onExtraCallbackWithResult Companion;
    private static long IAuthTabCallbackStubProxy;
    private static int access000;
    public static final int asBinder;
    private static char extraCallback;
    private static int writeTypedObject;

    @Inject
    public zzag tossClock;
    private static final byte[] $$a = {46, -95, 11, -87};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int extraCallbackWithResult = 0;
    private static int ICustomTabsCallback = 1;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new access000(this));
    private final Lazy IAuthTabCallback_Parcel = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(PlccCardBenefitViewModel.class), new IAuthTabCallbackStubProxy(this), new getInterfaceDescriptor(this), new IAuthTabCallback_Parcel(null, this));
    private final enableCustomFocusSearchOnClippedElementsAndroid getInterfaceDescriptor = new enableCustomFocusSearchOnClippedElementsAndroid();
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.plcc.activity.PlccCardBenefitActivity$$ExternalSyntheticLambda4
        public final Object invoke() {
            return PlccCardBenefitActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.plcc.activity.PlccCardBenefitActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return PlccCardBenefitActivity.onWarmupCompleted(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.plcc.activity.PlccCardBenefitActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return (String) PlccCardBenefitActivity.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1495879545, new Object[]{this.f$0}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1495879546, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        }
    });
    private String access100 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = viva.republica.toss.plcc.activity.PlccCardBenefitActivity.$$a
            int r6 = r6 + 109
            int r5 = r5 * 3
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccCardBenefitActivity.$$c(short, byte, short):java.lang.String");
    }

    static {
        writeTypedObject = 1;
        IAuthTabCallback();
        Companion = new onExtraCallbackWithResult(null);
        asBinder = 8;
        int i = readTypedObject + 79;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[0];
        PlccBenefitInfoResp plccBenefitInfoResp = (PlccBenefitInfoResp) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(plccCardBenefitActivity, plccBenefitInfoResp);
        }
        IAuthTabCallback(plccCardBenefitActivity, plccBenefitInfoResp);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(PlccCardBenefitActivity plccCardBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(plccCardBenefitActivity, view);
        int i4 = extraCallbackWithResult + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | i3)) | (~(i4 | i2 | i3));
        int i10 = ~i3;
        int i11 = (~(i8 | i4)) | (~(i8 | i10));
        int i12 = (~(i3 | i2)) | (~(i7 | i10));
        int i13 = i4 + i2 + i5 + ((-564018846) * i6) + (483938512 * i);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i4) + 752877568 + ((-1516524009) * i2) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i5) + (1390411776 * i6) + (452984832 * i) + ((-1135738880) * i14);
        int i16 = ((i4 * 1456092922) - 824780772) + (i2 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i5 * 1456093799) + (i6 * 578355822) + (i * 1098359728) + (i14 * 1868693504);
        switch (i15 + (i16 * i16 * 2110914560)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[0];
                View view = (View) objArr[1];
                int i17 = 2 % 2;
                int i18 = ICustomTabsCallback + 113;
                extraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                IAuthTabCallbackDefault(plccCardBenefitActivity, view);
                int i20 = extraCallbackWithResult + 115;
                ICustomTabsCallback = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                AppCompatActivity appCompatActivity = (PlccCardBenefitActivity) objArr[0];
                int i22 = 2 % 2;
                appCompatActivity.setSupportActionBar(appCompatActivity.updateVisuals().writeTypedObject);
                IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
                if (supportActionBar == null) {
                    return null;
                }
                int i23 = extraCallbackWithResult + 105;
                ICustomTabsCallback = i23 % 128;
                if (i23 % 2 == 0) {
                    supportActionBar.onExtraCallbackWithResult(appCompatActivity.getString(R.string.app_plcc_benefit_title));
                    supportActionBar.onNavigationEvent(false);
                } else {
                    supportActionBar.onExtraCallbackWithResult(appCompatActivity.getString(R.string.app_plcc_benefit_title));
                    supportActionBar.onNavigationEvent(true);
                }
                int i24 = ICustomTabsCallback + 41;
                extraCallbackWithResult = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(plccCardBenefitActivity);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = ICustomTabsCallback + 55;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return strIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccCardBenefitActivity plccCardBenefitActivity, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(plccCardBenefitActivity, str);
        }
        onWarmupCompleted(plccCardBenefitActivity, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup, PlccBenefitInfoResp plccBenefitInfoResp) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(plccCardBenefitActivity, plccBenefitGroup, plccBenefitInfoResp);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(plccCardBenefitActivity, plccBenefitGroup, plccBenefitInfoResp);
        int i3 = extraCallbackWithResult + 1;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PlccCardBenefitActivity plccCardBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(plccCardBenefitActivity, view);
        int i4 = ICustomTabsCallback + 113;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ String onNavigationEvent(PlccCardBenefitActivity plccCardBenefitActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(plccCardBenefitActivity);
        }
        onTransact(plccCardBenefitActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PlccCardBenefitActivity plccCardBenefitActivity, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(plccCardBenefitActivity, z);
        int i4 = ICustomTabsCallback + 55;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup = (PlccBenefitInfoResp.PlccBenefitGroup) objArr[0];
        PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[1];
        PlccBenefitInfoResp plccBenefitInfoResp = (PlccBenefitInfoResp) objArr[2];
        TdsListHeaderV3View tdsListHeaderV3View = (TdsListHeaderV3View) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(plccBenefitGroup, plccCardBenefitActivity, plccBenefitInfoResp, tdsListHeaderV3View);
        }
        onExtraCallbackWithResult(plccBenefitGroup, plccCardBenefitActivity, plccBenefitInfoResp, tdsListHeaderV3View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(PlccCardBenefitActivity plccCardBenefitActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(plccCardBenefitActivity);
        }
        IAuthTabCallbackStub(plccCardBenefitActivity);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp plccBenefitInfoResp) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(plccCardBenefitActivity, plccBenefitInfoResp);
        int i4 = ICustomTabsCallback + 11;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return 1333651L;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access000 implements Function0<CMP_Issue_Result> {
        final /* synthetic */ Activity onNavigationEvent;

        public access000(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMP_Issue_Result invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Issue_Result.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class access100 implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public access100(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onTransact(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(PlccCardBenefitActivity plccCardBenefitActivity, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        plccCardBenefitActivity.onExtraCallbackWithResult(str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 117;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PlccCardBenefitActivity plccCardBenefitActivity, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        plccCardBenefitActivity.onWarmupCompleted(z);
        int i4 = ICustomTabsCallback + 101;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            plccCardBenefitActivity.updateVisuals();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CMP_Issue_Result cMP_Issue_ResultUpdateVisuals = plccCardBenefitActivity.updateVisuals();
        int i3 = extraCallbackWithResult + 81;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return cMP_Issue_ResultUpdateVisuals;
    }

    public static final /* synthetic */ void onNavigationEvent(PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp plccBenefitInfoResp, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        plccCardBenefitActivity.onExtraCallbackWithResult(plccBenefitInfoResp, z);
        int i4 = ICustomTabsCallback + 63;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.indexOf("", ""), new char[]{3000, 2990, 38246, 55398, 65010, 2599, 43504, 51207}, new char[]{0, 0, 0, 0}, new char[]{31038, 53037, 889, 15269}, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ICustomTabsServiceStub()), getWrite.IAuthTabCallback("year_month", JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.onNavigationEvent((String) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -900226110, new Object[]{this}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 900226113, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())))});
        int i4 = ICustomTabsCallback + 105;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        throw null;
    }

    private final CMP_Issue_Result updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMP_Issue_Result cMP_Issue_Result = (CMP_Issue_Result) value;
        int i4 = extraCallbackWithResult + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return cMP_Issue_Result;
    }

    private final PlccCardBenefitViewModel ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PlccCardBenefitViewModel plccCardBenefitViewModel = (PlccCardBenefitViewModel) this.IAuthTabCallback_Parcel.getValue();
        int i4 = extraCallbackWithResult + 91;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return plccCardBenefitViewModel;
    }

    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStub.getValue();
        int i4 = extraCallbackWithResult + 69;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return str;
    }

    public static final class getInterfaceDescriptor implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public getInterfaceDescriptor(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallback.getDefaultViewModelProviderFactory();
        }
    }

    private static final String onTransact(PlccCardBenefitActivity plccCardBenefitActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = commonTestFlag.onExtraCallback.IAuthTabCallback("yyyyMM", plccCardBenefitActivity.onNavigationEvent().asBinder());
        int i4 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.onTransact.getValue();
        int i3 = ICustomTabsCallback + 33;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public IAuthTabCallbackStubProxy(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallback.getViewModelStore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallbackStub(PlccCardBenefitActivity plccCardBenefitActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = plccCardBenefitActivity.getIntent();
        Object[] objArr = new Object[1];
        a((char) (Process.myPid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{3000, 2990, 38246, 55398, 65010, 2599, 43504, 51207}, new char[]{0, 0, 0, 0}, new char[]{31038, 53037, 889, 15269}, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = extraCallbackWithResult + 53;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return stringExtra;
    }

    public static final class IAuthTabCallback_Parcel implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
        final /* synthetic */ Function0 onNavigationEvent;

        public IAuthTabCallback_Parcel(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onNavigationEvent;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) plccCardBenefitActivity.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallback(PlccCardBenefitActivity plccCardBenefitActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            plccCardBenefitActivity.getIntent().getStringExtra("baseMonth");
            throw null;
        }
        String stringExtra = plccCardBenefitActivity.getIntent().getStringExtra("baseMonth");
        if (stringExtra != null) {
            return stringExtra;
        }
        String strIAuthTabCallback = commonTestFlag.onExtraCallback.IAuthTabCallback("yyyyMM", plccCardBenefitActivity.onNavigationEvent().asBinder());
        int i3 = extraCallbackWithResult + 13;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public final zzag onNavigationEvent() {
        int i = 2 % 2;
        zzag zzagVar = this.tossClock;
        if (zzagVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = extraCallbackWithResult + 59;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zzagVar;
    }

    static final class asBinder implements Function1<DialogInterface, Unit> {
        asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback((DialogInterface) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(DialogInterface dialogInterface) {
            PlccCardBenefitActivity.this.finish();
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccCardBenefitActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().getRoot());
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -645258748, new Object[]{this}, iOnExtraCallback, 645258752, iOnExtraCallback2, iOnExtraCallback3);
        int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback5 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback6 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -903210059, new Object[]{this}, iOnExtraCallback4, 903210064, iOnExtraCallback5, iOnExtraCallback6);
        access200();
        ICustomTabsServiceDefault().onNavigationEvent().observe(this, new BaseActivity.ICustomTabsServiceStub(new IAuthTabCallback()));
        ICustomTabsServiceDefault().onExtraCallbackWithResult().observe(this, new BaseActivity.ICustomTabsServiceStub(new onNavigationEvent()));
        ICustomTabsServiceDefault().IAuthTabCallback().observe(this, new BaseActivity.ICustomTabsServiceStub(new IAuthTabCallbackStub()));
        int iOnExtraCallback7 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback8 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback9 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        this.access100 = (String) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -900226110, new Object[]{this}, iOnExtraCallback7, 900226113, iOnExtraCallback8, iOnExtraCallback9);
        PlccCardBenefitViewModel plccCardBenefitViewModelICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int iOnExtraCallback10 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback11 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback12 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        plccCardBenefitViewModelICustomTabsServiceDefault.IAuthTabCallback((String) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -900226110, new Object[]{this}, iOnExtraCallback10, 900226113, iOnExtraCallback11, iOnExtraCallback12), true);
        int i2 = extraCallbackWithResult + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $10 + 51;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cRgb = (char) ((-16777216) - Color.rgb(i5, i5, i5));
                    int gidForName = 42 - Process.getGidForName("");
                    int i10 = 1452 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b = (byte) i5;
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, gidForName, i10, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i5;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49123), View.resolveSizeAndState(i5, i5, i5) + 44, Gravity.getAbsoluteGravity(i5, i5) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 23972), (ViewConfiguration.getFadingEdgeLength() >> 16) + 50, (Process.myPid() >> 22) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 30, Color.red(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStubProxy ^ 7798559133331975163L)) ^ ((int) (access000 ^ 7798559133331975163L))) ^ ((char) (extraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
                i5 = 0;
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

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccCardBenefitActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        CharSequence charSequence = (CharSequence) ICustomTabsServiceDefault().onNavigationEvent().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            int i4 = extraCallbackWithResult + 9;
            ICustomTabsCallback = i4 % 128;
            PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult onextracallbackwithresult = null;
            if (i4 % 2 == 0) {
                onextracallbackwithresult.hashCode();
                throw null;
            }
            Pair pair = (Pair) ICustomTabsServiceDefault().onExtraCallbackWithResult().getValue();
            PlccBenefitInfoResp plccBenefitInfoResp = pair != null ? (PlccBenefitInfoResp) pair.getFirst() : null;
            if (plccBenefitInfoResp != null) {
                int i5 = extraCallbackWithResult + 27;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                if (!Intrinsics.areEqual(this.access100, validateRelationship())) {
                    PlccBenefitInfoResp.PlccProgressBar plccProgressBarAsBinder = plccBenefitInfoResp.asBinder();
                    if (plccProgressBarAsBinder != null) {
                        int i7 = extraCallbackWithResult + 65;
                        ICustomTabsCallback = i7 % 128;
                        int i8 = i7 % 2;
                        int iOnExtraCallback = getKekid.onExtraCallback();
                        int iOnExtraCallback2 = getKekid.onExtraCallback();
                        onextracallbackwithresult = (PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult) PlccBenefitInfoResp.PlccProgressBar.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 43147313, -43147312, iOnExtraCallback2, new Object[]{plccProgressBarAsBinder}, iOnExtraCallback);
                    }
                    boolean z = onextracallbackwithresult == PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.COMPLETE;
                    JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
                    javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallback(ICustomTabsServiceStub(), "AMOUNT", this.access100, plccBenefitInfoResp.asInterface(), z, false);
                    javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallback(ICustomTabsServiceStub(), "TAB", this.access100, plccBenefitInfoResp.asInterface(), z, false);
                }
            }
        }
        this.getInterfaceDescriptor.onScrollChanged();
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccCardBenefitActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.onPause();
            this.getInterfaceDescriptor.onExtraCallback();
            int i3 = extraCallbackWithResult + 105;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onPause();
        this.getInterfaceDescriptor.onExtraCallback();
        throw null;
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        updateVisuals().onUnminimized.setDateList(str, onNavigationEvent().asBinder(), this.access100);
        updateVisuals().onUnminimized.setSelectDateListener(new PlccCardBenefitActivity$.ExternalSyntheticLambda11(this));
        int i2 = ICustomTabsCallback + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(PlccCardBenefitActivity plccCardBenefitActivity, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            plccCardBenefitActivity.access100 = str;
            PlccCardBenefitViewModel.onExtraCallbackWithResult(plccCardBenefitActivity.ICustomTabsServiceDefault(), str, false, 5, null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            plccCardBenefitActivity.access100 = str;
            PlccCardBenefitViewModel.onExtraCallbackWithResult(plccCardBenefitActivity.ICustomTabsServiceDefault(), str, false, 2, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 117;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class onWarmupCompleted implements TabLayout.OnTabSelectedListener {
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }

        onWarmupCompleted() {
        }

        public void onTabSelected(TabLayout.Tab tab) throws Throwable {
            BaseActivity baseActivity;
            int i;
            Intrinsics.checkNotNullParameter(tab, "");
            if (tab.getPosition() == 1) {
                baseActivity = PlccCardBenefitActivity.this;
                i = R.string.app_plcc_benefit_tab_vaild;
            } else {
                baseActivity = PlccCardBenefitActivity.this;
                i = R.string.app_plcc_benefit_tab_unvaild;
            }
            String string = baseActivity.getString(i);
            Intrinsics.checkNotNull(string);
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.onWarmupCompleted(string);
            PlccCardBenefitActivity.onExtraCallbackWithResult(PlccCardBenefitActivity.this, tab.getPosition() == 1);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PlccCardBenefitActivity plccCardBenefitActivity = (PlccCardBenefitActivity) objArr[0];
        int i = 2 % 2;
        TdsTabV1View tdsTabV1View = plccCardBenefitActivity.updateVisuals().ICustomTabsCallback;
        tdsTabV1View.onWarmupCompleted(tdsTabV1View.onNavigationEvent(tdsTabV1View.getContext().getString(R.string.app_plcc_benefit_tab_unvaild)));
        tdsTabV1View.onWarmupCompleted(tdsTabV1View.onNavigationEvent(tdsTabV1View.getContext().getString(R.string.app_plcc_benefit_tab_vaild)));
        plccCardBenefitActivity.updateVisuals().ICustomTabsCallback.onNavigationEvent(plccCardBenefitActivity.new onWarmupCompleted());
        int i2 = extraCallbackWithResult + 33;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(PlccCardBenefitActivity plccCardBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        String string = plccCardBenefitActivity.getString(R.string.app_plcc_benefit_hero_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.IAuthTabCallback(string);
        TdsRoundLayout tdsRoundLayout = plccCardBenefitActivity.updateVisuals().onMessageChannelReady;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        transparentBackground.IAuthTabCallback(tdsRoundLayout, false);
        int i4 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access200() {
        int i = 2 % 2;
        TdsRoundLayout tdsRoundLayout = updateVisuals().onActivityResized;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        patch.onExtraCallbackWithResult(tdsRoundLayout, 16.0f);
        LinearLayout linearLayout = updateVisuals().IAuthTabCallback;
        M_ m_ = M_.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        linearLayout.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, this, Float.valueOf(varyMatches.onNavigationEvent(16, r4))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        updateVisuals().IAuthTabCallbackDefault.setOnClickListener(new PlccCardBenefitActivity$.ExternalSyntheticLambda7(this));
        updateVisuals().onActivityResized.setOnClickListener(new PlccCardBenefitActivity$.ExternalSyntheticLambda8(this));
        int i2 = extraCallbackWithResult + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(PlccCardBenefitActivity plccCardBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
            String string = plccCardBenefitActivity.getString(R.string.app_plcc_benefit_current_month_guide_banner_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallbackWithResult(1333665L, string, Intrinsics.areEqual(plccCardBenefitActivity.access100, plccCardBenefitActivity.validateRelationship()));
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(plccCardBenefitActivity);
            int i3 = 56 / 0;
            return;
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP12 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        String string2 = plccCardBenefitActivity.getString(R.string.app_plcc_benefit_current_month_guide_banner_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP12.onExtraCallbackWithResult(1333665L, string2, Intrinsics.areEqual(plccCardBenefitActivity.access100, plccCardBenefitActivity.validateRelationship()));
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(plccCardBenefitActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackDefault(PlccCardBenefitActivity plccCardBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(plccCardBenefitActivity);
        int i4 = ICustomTabsCallback + 1;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(PlccBenefitInfoResp plccBenefitInfoResp, boolean z) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = extraCallbackWithResult + 99;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        updateVisuals().IAuthTabCallbackStub.setText(plccBenefitInfoResp.onTransact());
        Typography5 typography5 = updateVisuals().asBinder;
        Intrinsics.checkNotNull(typography5);
        String str = (String) PlccBenefitInfoResp.onNavigationEvent(new Object[]{plccBenefitInfoResp}, -1881522443, 1881522443, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        if (str == null || str.length() == 0) {
            int i7 = ICustomTabsCallback + 125;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i = 8;
        } else {
            int i9 = extraCallbackWithResult + 29;
            ICustomTabsCallback = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        typography5.setVisibility(i);
        PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult onextracallbackwithresult = null;
        if (typography5.getVisibility() == 0) {
            String str2 = (String) PlccBenefitInfoResp.onNavigationEvent(new Object[]{plccBenefitInfoResp}, -1881522443, 1881522443, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
            typography5.setText(str2 != null ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str2, false, 1, (Object) null) : null);
            Context context = typography5.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            typography5.setTextColor(new getUrlokhttp(new onTransact(configuration)).onPostMessage());
            Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(typography5.getResources(), im.toss.tds.R.drawable.icon_arrow_right_mono, (Resources.Theme) null);
            Intrinsics.checkNotNull(drawableOnExtraCallback);
            Context context2 = typography5.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawableOnExtraCallback, new getUrlokhttp(new asInterface(configuration2)).onPostMessage());
            Context context3 = typography5.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            drawableOnExtraCallback.setColorFilter(new PorterDuffColorFilter(new getUrlokhttp(new access100(configuration3)).onPostMessage(), PorterDuff.Mode.SRC_IN));
            typography5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableOnExtraCallback, (Drawable) null);
            typography5.setOnClickListener(new PlccCardBenefitActivity$.ExternalSyntheticLambda10(this));
        }
        TdsBadgeV1View tdsBadgeV1View = updateVisuals().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
        if (!(plccBenefitInfoResp.onExtraCallback() != null)) {
            i2 = 8;
        } else {
            int i11 = extraCallbackWithResult + 7;
            ICustomTabsCallback = i11 % 128;
            int i12 = i11 % 2;
            i2 = 0;
        }
        tdsBadgeV1View.setVisibility(i2);
        if (plccBenefitInfoResp.onExtraCallback() != null) {
            TdsBadgeV1View tdsBadgeV1View2 = updateVisuals().onExtraCallback;
            tdsBadgeV1View2.setTheme(new TdsBadgeV1View.onExtraCallbackWithResult(plccBenefitInfoResp.onExtraCallback().onNavigationEvent(), TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.MEDIUM));
            tdsBadgeV1View2.setText(plccBenefitInfoResp.onExtraCallback().onExtraCallbackWithResult());
        }
        if (plccBenefitInfoResp.asBinder() != null) {
            TdsProgressBarV0View tdsProgressBarV0View = updateVisuals().IAuthTabCallbackStubProxy;
            tdsProgressBarV0View.setActiveProgressColor(setBodyokhttp.onWarmupCompleted(this, plccBenefitInfoResp.asBinder().onExtraCallback(), 0));
            int i13 = onExtraCallback.onExtraCallbackWithResult[((PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult) PlccBenefitInfoResp.PlccProgressBar.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 43147313, -43147312, getKekid.onExtraCallback(), new Object[]{plccBenefitInfoResp.asBinder()}, getKekid.onExtraCallback())).ordinal()];
            if (i13 == 1) {
                tdsProgressBarV0View.setMax(1);
                tdsProgressBarV0View.setProgress(1);
                Typography7 typography7 = updateVisuals().getInterfaceDescriptor;
                Intrinsics.checkNotNullExpressionValue(typography7, "");
                String strOnExtraCallbackWithResult = plccBenefitInfoResp.asBinder().onExtraCallbackWithResult();
                typography7.setVisibility((strOnExtraCallbackWithResult == null || strOnExtraCallbackWithResult.length() == 0) ? 8 : 0);
                Typography7 typography72 = updateVisuals().access100;
                Intrinsics.checkNotNullExpressionValue(typography72, "");
                typography72.setVisibility(8);
                String strOnExtraCallbackWithResult2 = plccBenefitInfoResp.asBinder().onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult2 != null && strOnExtraCallbackWithResult2.length() != 0) {
                    updateVisuals().getInterfaceDescriptor.setText(plccBenefitInfoResp.asBinder().onExtraCallbackWithResult());
                }
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tdsProgressBarV0View.setMax((int) plccBenefitInfoResp.asBinder().asBinder());
                tdsProgressBarV0View.setProgress((int) plccBenefitInfoResp.IAuthTabCallback_Parcel());
                Typography7 typography73 = updateVisuals().getInterfaceDescriptor;
                Intrinsics.checkNotNullExpressionValue(typography73, "");
                String strIAuthTabCallback = plccBenefitInfoResp.asBinder().IAuthTabCallback();
                typography73.setVisibility((strIAuthTabCallback == null || strIAuthTabCallback.length() == 0) ? 8 : 0);
                Typography7 typography74 = updateVisuals().access100;
                Intrinsics.checkNotNullExpressionValue(typography74, "");
                String strOnTransact = plccBenefitInfoResp.asBinder().onTransact();
                if (strOnTransact == null || strOnTransact.length() == 0) {
                    i3 = 8;
                } else {
                    int i14 = extraCallbackWithResult + 49;
                    ICustomTabsCallback = i14 % 128;
                    int i15 = i14 % 2;
                    i3 = 0;
                }
                typography74.setVisibility(i3);
                String strIAuthTabCallback2 = plccBenefitInfoResp.asBinder().IAuthTabCallback();
                if (strIAuthTabCallback2 != null) {
                    int i16 = extraCallbackWithResult + 67;
                    ICustomTabsCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        strIAuthTabCallback2.length();
                        throw null;
                    }
                    if (strIAuthTabCallback2.length() != 0) {
                        updateVisuals().getInterfaceDescriptor.setText(plccBenefitInfoResp.asBinder().IAuthTabCallback());
                    }
                }
                String strOnTransact2 = plccBenefitInfoResp.asBinder().onTransact();
                if (strOnTransact2 != null && strOnTransact2.length() != 0) {
                    int i17 = extraCallbackWithResult + 123;
                    ICustomTabsCallback = i17 % 128;
                    int i18 = i17 % 2;
                    updateVisuals().access100.setText(plccBenefitInfoResp.asBinder().onTransact());
                }
            }
        }
        LinearLayout linearLayout = updateVisuals().onPostMessage;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(!Intrinsics.areEqual(validateRelationship(), this.access100) ? 0 : 8);
        LinearLayout linearLayout2 = updateVisuals().onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(Intrinsics.areEqual(validateRelationship(), this.access100) ? 0 : 8);
        if (!Intrinsics.areEqual(validateRelationship(), this.access100)) {
            int i19 = extraCallbackWithResult + 103;
            ICustomTabsCallback = i19 % 128;
            int i20 = i19 % 2;
            PlccBenefitInfoResp.PlccProgressBar plccProgressBarAsBinder = plccBenefitInfoResp.asBinder();
            if (plccProgressBarAsBinder != null) {
                onextracallbackwithresult = (PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult) PlccBenefitInfoResp.PlccProgressBar.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 43147313, -43147312, getKekid.onExtraCallback(), new Object[]{plccProgressBarAsBinder}, getKekid.onExtraCallback());
                int i21 = extraCallbackWithResult + 51;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
            }
            boolean z2 = onextracallbackwithresult == PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.COMPLETE;
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
            boolean z3 = z2;
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallback(ICustomTabsServiceStub(), "AMOUNT", this.access100, plccBenefitInfoResp.asInterface(), z3, false);
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallback(ICustomTabsServiceStub(), "TAB", this.access100, plccBenefitInfoResp.asInterface(), z3, false);
        }
        if (!Intrinsics.areEqual(validateRelationship(), this.access100)) {
            onWarmupCompleted(((Integer) TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1014209357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{updateVisuals().ICustomTabsCallback}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1014209355)).intValue() == 1);
        } else {
            onExtraCallback(plccBenefitInfoResp, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(boolean z) throws Throwable {
        int i;
        List listEmptyList;
        PlccBenefitInfoResp plccBenefitInfoResp;
        PlccBenefitInfoResp plccBenefitInfoResp2;
        List<PlccBenefitInfoResp.PlccSpentTxItem> listIAuthTabCallbackStub;
        int i2 = 2 % 2;
        this.getInterfaceDescriptor.onWarmupCompleted();
        int i3 = 0;
        if (z) {
            int i4 = extraCallbackWithResult + 71;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                i = R.string.app_plcc_benefit_tab_vaild;
                int i5 = 83 / 0;
            } else {
                i = R.string.app_plcc_benefit_tab_vaild;
            }
        } else {
            i = R.string.app_plcc_benefit_tab_unvaild;
        }
        String string = getString(i);
        int i6 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNull(string);
            throw null;
        }
        Intrinsics.checkNotNull(string);
        Pair pair = (Pair) ICustomTabsServiceDefault().onExtraCallbackWithResult().getValue();
        if (pair == null || (plccBenefitInfoResp2 = (PlccBenefitInfoResp) pair.getFirst()) == null || (listIAuthTabCallbackStub = plccBenefitInfoResp2.IAuthTabCallbackStub()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : listIAuthTabCallbackStub) {
                int i7 = extraCallbackWithResult + 85;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
                if (((PlccBenefitInfoResp.PlccSpentTxItem) obj).IAuthTabCallbackDefault() == z) {
                    listEmptyList.add(obj);
                }
            }
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        Pair pair2 = (Pair) ICustomTabsServiceDefault().onExtraCallbackWithResult().getValue();
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted(623591432, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1, string, Long.valueOf((pair2 == null || (plccBenefitInfoResp = (PlccBenefitInfoResp) pair2.getFirst()) == null) ? 0L : plccBenefitInfoResp.asInterface()), this.access100, Integer.valueOf(listEmptyList.size())}, -623591431, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        updateVisuals().onExtraCallbackWithResult.removeAllViews();
        ScrollView scrollView = updateVisuals().onMinimized;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        List list = listEmptyList;
        scrollView.setVisibility(!list.isEmpty() ? 0 : 8);
        TdsResultV0View tdsResultV0View = updateVisuals().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsResultV0View, "");
        if (listEmptyList.isEmpty()) {
            int i9 = extraCallbackWithResult + 115;
            ICustomTabsCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i3 = 8;
        }
        tdsResultV0View.setVisibility(i3);
        updateVisuals().asInterface.setSubtitle(getString(z ? R.string.app_plcc_benefit_vaild_list_empty_title : R.string.app_plcc_benefit_unvaild_list_empty_title));
        enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid = this.getInterfaceDescriptor;
        ScrollView scrollView2 = updateVisuals().onMinimized;
        Intrinsics.checkNotNullExpressionValue(scrollView2, "");
        enablecustomfocussearchonclippedelementsandroid.IAuthTabCallback(scrollView2);
        if (list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = updateVisuals().onExtraCallbackWithResult;
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        ((LinearLayout.LayoutParams) layoutParams).width = -1;
        linearLayout2.setLayoutParams(layoutParams);
        if (!z) {
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback;
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onNavigationEvent(linearLayout2, 24);
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallbackWithResult(linearLayout2, this.getInterfaceDescriptor);
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(linearLayout2, 16);
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i11 = extraCallbackWithResult + 87;
            ICustomTabsCallback = i11 % 128;
            int i12 = i11 % 2;
            arrayList.add(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(linearLayout2, (PlccBenefitInfoResp.PlccSpentTxItem) it.next()));
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(linearLayout2, 40);
        linearLayout.addView(linearLayout2);
    }

    private static final Unit IAuthTabCallback(PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp plccBenefitInfoResp) {
        PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        String strICustomTabsServiceStub = plccCardBenefitActivity.ICustomTabsServiceStub();
        String str = plccCardBenefitActivity.access100;
        long jAsInterface = plccBenefitInfoResp.asInterface();
        PlccBenefitInfoResp.PlccProgressBar plccProgressBarAsBinder = plccBenefitInfoResp.asBinder();
        if (plccProgressBarAsBinder != null) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iOnExtraCallback3 = getKekid.onExtraCallback();
            onextracallbackwithresult = (PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult) PlccBenefitInfoResp.PlccProgressBar.IAuthTabCallback(getKekid.onExtraCallback(), iOnExtraCallback3, 43147313, -43147312, iOnExtraCallback2, new Object[]{plccProgressBarAsBinder}, iOnExtraCallback);
        } else {
            onextracallbackwithresult = null;
        }
        boolean z = false;
        if (onextracallbackwithresult == PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.COMPLETE) {
            int i4 = ICustomTabsCallback + 19;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
        } else {
            int i5 = extraCallbackWithResult + 31;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallback(strICustomTabsServiceStub, "AMOUNT", str, jAsInterface, z, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006e A[PHI: r2 r5 r6 r7 r8
      0x006e: PHI (r2v7 o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1) = (r2v4 o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1), (r2v8 o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r5v5 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r6v5 java.lang.String) = (r6v1 java.lang.String), (r6v7 java.lang.String) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r8v3 long) = (r8v0 long), (r8v4 long) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d A[PHI: r2 r5 r6 r7 r8 r10
      0x004d: PHI (r2v5 o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1) = (r2v4 o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1), (r2v8 o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v7 java.lang.String) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r8v1 long) = (r8v0 long), (r8v4 long) binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r10v1 viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar) = 
      (r10v0 viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar)
      (r10v6 viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar)
     binds: [B:8:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.plcc.activity.PlccCardBenefitActivity r19, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp r20) {
        /*
            r0 = r19
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.plcc.activity.PlccCardBenefitActivity.extraCallbackWithResult
            int r2 = r2 + 115
            int r3 = r2 % 128
            viva.republica.toss.plcc.activity.PlccCardBenefitActivity.ICustomTabsCallback = r3
            int r2 = r2 % r1
            r3 = 0
            java.lang.String r4 = ""
            if (r2 != 0) goto L32
            o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 r2 = o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted
            java.lang.String r5 = r19.ICustomTabsServiceStub()
            int r6 = viva.republica.toss.R.string.app_plcc_benefit_hero_title
            java.lang.String r6 = r0.getString(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            java.lang.String r7 = r0.access100
            long r8 = r20.asInterface()
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar r10 = r20.asBinder()
            r11 = 59
            int r11 = r11 / r3
            if (r10 == 0) goto L6e
            goto L4d
        L32:
            o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 r2 = o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted
            java.lang.String r5 = r19.ICustomTabsServiceStub()
            int r6 = viva.republica.toss.R.string.app_plcc_benefit_hero_title
            java.lang.String r6 = r0.getString(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            java.lang.String r7 = r0.access100
            long r8 = r20.asInterface()
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar r10 = r20.asBinder()
            if (r10 == 0) goto L6e
        L4d:
            java.lang.Object[] r16 = new java.lang.Object[]{r10}
            int r17 = o.getKekid.onExtraCallback()
            int r15 = o.getKekid.onExtraCallback()
            int r12 = o.getKekid.onExtraCallback()
            int r11 = o.getKekid.onExtraCallback()
            r13 = 43147313(0x2926031, float:2.1507983E-37)
            r14 = -43147312(0xfffffffffd6d9fd0, float:-1.9741052E37)
            java.lang.Object r10 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.IAuthTabCallback(r11, r12, r13, r14, r15, r16, r17)
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r10 = (viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult) r10
            goto L6f
        L6e:
            r10 = 0
        L6f:
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccProgressBar$onExtraCallbackWithResult r5 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.COMPLETE
            r6 = 1
            if (r10 != r5) goto L84
            int r3 = viva.republica.toss.plcc.activity.PlccCardBenefitActivity.extraCallbackWithResult
            int r3 = r3 + 81
            int r5 = r3 % 128
            viva.republica.toss.plcc.activity.PlccCardBenefitActivity.ICustomTabsCallback = r5
            int r3 = r3 % r1
            r17 = r6
            goto L86
        L84:
            r17 = r3
        L86:
            r18 = 1
            r11 = r2
            r11.onExtraCallback(r12, r13, r14, r15, r17, r18)
            int r1 = viva.republica.toss.R.string.app_plcc_benefit_current_month_guide_banner_title
            java.lang.String r0 = r0.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3 = 1333663(0x14599f, double:6.58917E-318)
            r2.onExtraCallbackWithResult(r3, r0, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccCardBenefitActivity.onExtraCallbackWithResult(viva.republica.toss.plcc.activity.PlccCardBenefitActivity, viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PlccCardBenefitActivity plccCardBenefitActivity, boolean z) {
        int i = 2 % 2;
        if (!z) {
            int i2 = ICustomTabsCallback + 63;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        String string = plccCardBenefitActivity.getString(R.string.app_plcc_benefit_current_month_guide_banner_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallbackWithResult(1333663L, string, true);
        Unit unit2 = Unit.INSTANCE;
        int i3 = extraCallbackWithResult + 83;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(PlccBenefitInfoResp plccBenefitInfoResp, boolean z) {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        this.getInterfaceDescriptor.onWarmupCompleted();
        updateVisuals().onNavigationEvent.removeAllViews();
        enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid = this.getInterfaceDescriptor;
        ScrollView scrollView = updateVisuals().readTypedObject;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        enablecustomfocussearchonclippedelementsandroid.IAuthTabCallback(scrollView);
        TdsRoundLayout tdsRoundLayout = updateVisuals().onMessageChannelReady;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        int i4 = 0;
        if (z) {
            int i5 = extraCallbackWithResult + 89;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int i7 = ICustomTabsCallback + 3;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i = 8;
        }
        tdsRoundLayout.setVisibility(i);
        enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid2 = this.getInterfaceDescriptor;
        ConstraintLayout constraintLayout = updateVisuals().extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        enablecustomfocussearchonclippedelementsandroid2.onWarmupCompleted(constraintLayout, new PlccCardBenefitActivity$.ExternalSyntheticLambda0(this, plccBenefitInfoResp));
        if (z) {
            enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid3 = this.getInterfaceDescriptor;
            Typography5 typography5 = updateVisuals().ICustomTabsCallbackStub;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            enablecustomfocussearchonclippedelementsandroid3.onWarmupCompleted(typography5, new PlccCardBenefitActivity$.ExternalSyntheticLambda1(this, plccBenefitInfoResp));
        }
        enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid4 = this.getInterfaceDescriptor;
        TdsRoundLayout tdsRoundLayout2 = updateVisuals().onActivityResized;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        enablecustomfocussearchonclippedelementsandroid4.onExtraCallbackWithResult(tdsRoundLayout2, new PlccCardBenefitActivity$.ExternalSyntheticLambda2(this));
        LinearLayout linearLayout = updateVisuals().onNavigationEvent;
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        for (Object obj : plccBenefitInfoResp.onExtraCallbackWithResult()) {
            int i9 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
                int i10 = ICustomTabsCallback + 39;
                extraCallbackWithResult = i10 % 128;
                int i11 = i10 % i2;
            }
            PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup = (PlccBenefitInfoResp.PlccBenefitGroup) obj;
            minWebSocketMessageToCompress.onNavigationEvent(linearLayout2, new PlccCardBenefitActivity$.ExternalSyntheticLambda3(plccBenefitGroup, this, plccBenefitInfoResp));
            List<PlccBenefitGroupItem> listOnExtraCallback = plccBenefitGroup.onExtraCallback();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallback, 10));
            Iterator<T> it = listOnExtraCallback.iterator();
            while (it.hasNext()) {
                int i12 = extraCallbackWithResult + 83;
                ICustomTabsCallback = i12 % 128;
                int i13 = i12 % i2;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onExtraCallback(linearLayout2, this.getInterfaceDescriptor, (PlccBenefitGroupItem) it.next(), plccBenefitGroup.IAuthTabCallback(), plccBenefitInfoResp.asInterface(), this.access100, ICustomTabsServiceStub()));
                arrayList = arrayList2;
                i9 = i9;
                i2 = 2;
            }
            int i14 = i9;
            if (plccBenefitInfoResp.onExtraCallbackWithResult().size() > i14) {
                JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback.onNavigationEvent(linearLayout2, 8);
            }
            i4 = i14;
            i2 = 2;
        }
        linearLayout.addView(linearLayout2);
    }

    private static final Unit onExtraCallback(PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup, PlccBenefitInfoResp plccBenefitInfoResp) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        extraCallbackWithResult = i2 % 128;
        PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult onextracallbackwithresult = null;
        if (i2 % 2 == 0) {
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
            String strICustomTabsServiceStub = plccCardBenefitActivity.ICustomTabsServiceStub();
            String strIAuthTabCallback = plccBenefitGroup.IAuthTabCallback();
            String str = plccCardBenefitActivity.access100;
            long jAsInterface = plccBenefitInfoResp.asInterface();
            PlccBenefitInfoResp.PlccProgressBar plccProgressBarAsBinder = plccBenefitInfoResp.asBinder();
            if (plccProgressBarAsBinder != null) {
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                onextracallbackwithresult = (PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult) PlccBenefitInfoResp.PlccProgressBar.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 43147313, -43147312, iOnExtraCallback2, new Object[]{plccProgressBarAsBinder}, iOnExtraCallback);
            } else {
                int i3 = extraCallbackWithResult + 83;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallback(strICustomTabsServiceStub, strIAuthTabCallback, str, jAsInterface, onextracallbackwithresult == PlccBenefitInfoResp.PlccProgressBar.onExtraCallbackWithResult.COMPLETE, true);
            return Unit.INSTANCE;
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP12 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        plccCardBenefitActivity.ICustomTabsServiceStub();
        plccBenefitGroup.IAuthTabCallback();
        String str2 = plccCardBenefitActivity.access100;
        plccBenefitInfoResp.asInterface();
        plccBenefitInfoResp.asBinder();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup, final PlccCardBenefitActivity plccCardBenefitActivity, final PlccBenefitInfoResp plccBenefitInfoResp, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onRelationshipValidationResult());
        tdsListHeaderV3View.setTitleText(plccBenefitGroup.IAuthTabCallback());
        plccCardBenefitActivity.getInterfaceDescriptor.onWarmupCompleted(tdsListHeaderV3View, new Function0() { // from class: viva.republica.toss.plcc.activity.PlccCardBenefitActivity$$ExternalSyntheticLambda9
            public final Object invoke() {
                return PlccCardBenefitActivity.onExtraCallbackWithResult(this.f$0, plccBenefitGroup, plccBenefitInfoResp);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class IAuthTabCallback implements Function1<String, Unit> {
        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(String str) {
            PlccCardBenefitActivity.IAuthTabCallback(PlccCardBenefitActivity.this, str);
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<Throwable, Unit> {
        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, viva.republica.toss.plcc.activity.PlccCardBenefitActivity] */
        public final void onExtraCallback(Throwable th) {
            ?? r1 = PlccCardBenefitActivity.this;
            getParamImp.onWarmupCompleted(th, (Context) r1, false, (initMiniApp) null, (Function0) null, new asBinder(), 14, (Object) null);
        }
    }

    public static final class onNavigationEvent implements Function1<Pair<? extends PlccBenefitInfoResp, ? extends Boolean>, Unit> {
        public onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Pair<? extends PlccBenefitInfoResp, ? extends Boolean> pair) throws Throwable {
            Pair<? extends PlccBenefitInfoResp, ? extends Boolean> pair2 = pair;
            PlccCardBenefitActivity.onNavigationEvent(PlccCardBenefitActivity.this, (PlccBenefitInfoResp) pair2.getFirst(), ((Boolean) pair2.getSecond()).booleanValue());
            TdsSkeletonV1View tdsSkeletonV1View = ((CMP_Issue_Result) PlccCardBenefitActivity.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1424690875, new Object[]{PlccCardBenefitActivity.this}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1424690881, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback())).extraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsSkeletonV1View, "");
            tdsSkeletonV1View.setVisibility(8);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp plccBenefitInfoResp) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1086945864, new Object[]{plccCardBenefitActivity, plccBenefitInfoResp}, iOnExtraCallback, 1086945871, iOnExtraCallback2, iOnExtraCallback3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup, PlccCardBenefitActivity plccCardBenefitActivity, PlccBenefitInfoResp plccBenefitInfoResp, TdsListHeaderV3View tdsListHeaderV3View) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1308818313, new Object[]{plccBenefitGroup, plccCardBenefitActivity, plccBenefitInfoResp, tdsListHeaderV3View}, iOnExtraCallback, 1308818313, iOnExtraCallback2, iOnExtraCallback3);
    }

    public static /* synthetic */ void onNavigationEvent(PlccCardBenefitActivity plccCardBenefitActivity, View view) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1014129878, new Object[]{plccCardBenefitActivity, view}, iOnExtraCallback, 1014129880, iOnExtraCallback2, iOnExtraCallback3);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(PlccCardBenefitActivity plccCardBenefitActivity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (String) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1495879545, new Object[]{plccCardBenefitActivity}, iOnExtraCallback, 1495879546, iOnExtraCallback2, iOnExtraCallback3);
    }

    public static final /* synthetic */ CMP_Issue_Result onExtraCallback(PlccCardBenefitActivity plccCardBenefitActivity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (CMP_Issue_Result) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1424690875, new Object[]{plccCardBenefitActivity}, iOnExtraCallback, 1424690881, iOnExtraCallback2, iOnExtraCallback3);
    }

    private final String setEngagementSignalsCallback() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (String) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -900226110, new Object[]{this}, iOnExtraCallback, 900226113, iOnExtraCallback2, iOnExtraCallback3);
    }

    private final void IEngagementSignalsCallback() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -903210059, new Object[]{this}, iOnExtraCallback, 903210064, iOnExtraCallback2, iOnExtraCallback3);
    }

    private final void writeTypedList() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -645258748, new Object[]{this}, iOnExtraCallback, 645258752, iOnExtraCallback2, iOnExtraCallback3);
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccCardBenefitActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = ICustomTabsCallback + 9;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccCardBenefitActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = extraCallbackWithResult + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStubProxy = 7798559133331975163L;
        access000 = -1776194565;
        extraCallback = (char) 61018;
    }
}
