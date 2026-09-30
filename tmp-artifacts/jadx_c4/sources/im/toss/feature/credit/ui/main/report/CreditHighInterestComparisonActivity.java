package im.toss.feature.credit.ui.main.report;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.google.common.collect.Synchronized;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$;
import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ByteOrderedDataOutputStream;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExifSpeedConverter;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.PlayerErrorCode;
import o.Protocol;
import o.QuirksExternalSyntheticBackport0;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.SurfaceProcessorNode;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.addCameraErrorListener;
import o.areCachedAdResourcesMissing;
import o.bindChildren;
import o.checkMagicOptions;
import o.checkThread;
import o.delete;
import o.findResAndMsg;
import o.getAdService;
import o.getBacktraceNote;
import o.getHighestSurfacePriority;
import o.getParentMetadataCallback;
import o.getSpecialFeatureOptInStatus;
import o.getSurfaceSize;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.handshake;
import o.hasCrashWhenJavaCrash;
import o.hasMoreElements;
import o.hasProvider;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.levelConversion;
import o.logAndOpenStore;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.r8lambdaL3YVedIYrkax5fojVMcLJQJpM;
import o.readIntokhttp;
import o.requestClose;
import o.response;
import o.roundUpToNearestHalfInt;
import o.setAdVideoPlaybackListener;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setProxyokhttp;
import o.setRandomHost;
import o.setRubIn;
import o.use;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHighInterestComparisonActivity extends Hilt_CreditHighInterestComparisonActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackStubProxy = 5455376556525857517L;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            checkThread checkthreadOnNavigationEvent = CreditHighInterestComparisonActivity.onNavigationEvent(this.f$0);
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
            return checkthreadOnNavigationEvent;
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda2
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = CreditHighInterestComparisonActivity.onWarmupCompleted(this.f$0);
            int i4 = onNavigationEvent + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0};
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            CreditHighInterestComparisonResponse creditHighInterestComparisonResponse = (CreditHighInterestComparisonResponse) CreditHighInterestComparisonActivity.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 436720900, -436720892, iOnExtraCallback);
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return creditHighInterestComparisonResponse;
        }
    });
    private final Lazy access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda4
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            levelConversion.onNavigationEvent onnavigationeventIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onnavigationeventIAuthTabCallback = CreditHighInterestComparisonActivity.IAuthTabCallback(this.f$0);
                int i3 = 92 / 0;
            } else {
                onnavigationeventIAuthTabCallback = CreditHighInterestComparisonActivity.IAuthTabCallback(this.f$0);
            }
            int i4 = onExtraCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventIAuthTabCallback;
        }
    });
    private boolean IAuthTabCallbackStub = true;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1382804, (Function1) null, (Function1) null, 6, (Object) null);

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHighInterestComparisonActivity, view);
        int i4 = getInterfaceDescriptor + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ levelConversion.onNavigationEvent IAuthTabCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(creditHighInterestComparisonActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        levelConversion.onNavigationEvent onnavigationeventOnTransact = onTransact(creditHighInterestComparisonActivity);
        int i3 = getInterfaceDescriptor + 109;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnTransact;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponseIAuthTabCallbackStub = IAuthTabCallbackStub(creditHighInterestComparisonActivity);
        int i4 = access100 + 81;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return creditHighInterestComparisonResponseIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponse = (CreditHighInterestComparisonResponse) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, creditHighInterestComparisonResponse}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1373482121, -1373482114, iOnExtraCallback);
        int i4 = getInterfaceDescriptor + 31;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            unit = (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, bottomSheetInfo, onwarmupcompleted}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1758260087, 1758260093, iOnExtraCallback);
            int i3 = 62 / 0;
        } else {
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            unit = (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, bottomSheetInfo, onwarmupcompleted}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1758260087, 1758260093, iOnExtraCallback2);
        }
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(gettypedexportedconstants, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 77;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(creditHighInterestComparisonActivity, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditHighInterestComparisonActivity, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getInterfaceDescriptor + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 65;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(creditHighInterestComparisonActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(creditHighInterestComparisonActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, int i, String str3, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access100 + 81;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(str, str2, creditHighInterestComparisonActivity, i, str3, onwarmupcompleted);
        }
        onExtraCallbackWithResult(str, str2, creditHighInterestComparisonActivity, i, str3, onwarmupcompleted);
        throw null;
    }

    public static /* synthetic */ checkThread onNavigationEvent(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        checkThread checkthreadAsBinder = asBinder(creditHighInterestComparisonActivity);
        int i4 = getInterfaceDescriptor + 125;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return checkthreadAsBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e2  */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.content.Context, im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        String string;
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i5 | i6);
        int i12 = (~(i6 | i5)) | (~(i7 | i9)) | i8;
        int i13 = i5 + i4 + i + ((-1422066268) * i3) + ((-2108786386) * i2);
        int i14 = i13 * i13;
        int i15 = (i5 * 793895740) + 1353643607 + (i4 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (793896001 * i) + (692483748 * i3) + ((-1016611666) * i2) + (i14 * 166461440);
        switch (((-1583913924) * i5) + 967573504 + (322476998 * i4) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i) + ((-1298137088) * i3) + (1722810368 * i2) + (518782976 * i14) + (i15 * i15 * 1997799424)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
                CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo = (CreditHighInterestComparisonResponse.BottomSheetInfo) objArr[1];
                initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[2];
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent = creditHighInterestComparisonActivity.onVerticalScrollEvent();
                if (onnavigationeventOnVerticalScrollEvent != null) {
                    int iOnNavigationEvent = onnavigationeventOnVerticalScrollEvent.onNavigationEvent();
                    Context context = creditHighInterestComparisonActivity.getContext();
                    if (context != null) {
                        string = context.getString(iOnNavigationEvent);
                        int i17 = getInterfaceDescriptor + 103;
                        access100 = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 2 % 4;
                        }
                    } else {
                        string = null;
                    }
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{12206, 62848, 39916, 41430}, 55843 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                onwarmupcompleted.onExtraCallback(((String) objArr2[0]).intern(), string);
                Object[] objArr3 = new Object[1];
                a(new char[]{12206, 5776, 24040, 34015, 52019}, TextUtils.getOffsetBefore("", 0) + 14627, objArr3);
                onwarmupcompleted.onExtraCallback(((String) objArr3[0]).intern(), bottomSheetInfo.onExtraCallbackWithResult());
                onwarmupcompleted.onExtraCallback("sub_title", bottomSheetInfo.IAuthTabCallback());
                onwarmupcompleted.onExtraCallback("account_name", bottomSheetInfo.onNavigationEvent());
                onwarmupcompleted.onExtraCallback("interest_loan", bottomSheetInfo.onWarmupCompleted());
                Unit unit = Unit.INSTANCE;
                int i19 = access100 + 117;
                getInterfaceDescriptor = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                final ?? r3 = (CreditHighInterestComparisonActivity) objArr[0];
                final int iIntValue = ((Number) objArr[1]).intValue();
                final String str = (String) objArr[2];
                int i21 = 2 % 2;
                final String string2 = r3.getString(R.string.credit_ui_high_interest_comparison_info_bottom_sheet_title, PlayerErrorCode.onPostMessage());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                final String string3 = r3.getString(R.string.credit_ui_high_interest_comparison_info_bottom_sheet_subtitle);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                Function1 function1 = new Function1() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) throws Throwable {
                        Unit unitOnNavigationEvent;
                        int i22 = 2 % 2;
                        int i23 = onWarmupCompleted + 23;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        String str2 = string2;
                        String str3 = string3;
                        if (i24 != 0) {
                            unitOnNavigationEvent = CreditHighInterestComparisonActivity.onNavigationEvent(str2, str3, r3, iIntValue, str, (initMiniApp.onWarmupCompleted) obj);
                            int i25 = 45 / 0;
                        } else {
                            unitOnNavigationEvent = CreditHighInterestComparisonActivity.onNavigationEvent(str2, str3, r3, iIntValue, str, (initMiniApp.onWarmupCompleted) obj);
                        }
                        int i26 = IAuthTabCallback + 55;
                        onWarmupCompleted = i26 % 128;
                        int i27 = i26 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                logAndOpenStore.IAuthTabCallback((Context) r3, 1382842L);
                final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants((Context) r3, 0, false, false, 1382842L, function1, 14, (DefaultConstructorMarker) null);
                Context context2 = gettypedexportedconstants.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                LinearLayout linearLayout = new LinearLayout(context2);
                linearLayout.setOrientation(1);
                Context context3 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                bottomSheetHeader.setShowCloseIcon(false);
                bottomSheetHeader.setTitle(string2);
                bottomSheetHeader.setDescription(string3);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
                Context context4 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context4, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
                TdsListRowV1View.asInterface asinterface = TdsListRowV1View.asInterface.IMAGE;
                tdsListRowV1View.setLeftType(asinterface);
                DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics);
                DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                tdsListRowV1View.setLeftImageSize(iOnNavigationEvent2, varyMatches.onNavigationEvent(24, displayMetrics2));
                Object[] objArr4 = new Object[1];
                a(new char[]{12210, 19249, 59024, 631, 48597, 55547, 29775, 61356, 2897, 42553, 49549, 32123, 39111, 13226, 44870, 51967, 26181, 33062, 15495, 22585, 62431, 28348, 35423, 9722, 16721, 64562, 6034, 45932, 11921, 18857, 58646, 252, 48149, 55185, 29372, 61000, 2543, 42306, 49199, 31629, 38703, 13006, 44478, 51466, 25834, 32832, 15164, 22214, 62061, 28103, 34997, 9235, 24563, 64284, 5683, 45467, 11639, 18654, 58295, 8017, 47854, 54871, 28991}, 25759 - Drawable.resolveOpacity(0, 0), objArr4);
                tdsListRowV1View.setLeftImage(((String) objArr4[0]).intern());
                TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW1A;
                tdsListRowV1View.setCenterType(onextracallbackwithresult);
                Context context5 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                Configuration configuration = context5.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onTransact(configuration)).ICustomTabsCallbackStubProxy());
                tdsListRowV1View.setCenterText1(r3.getString(im.toss.features.credit.ui.R.string.credit_ui_main___36d7dfa27f));
                TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1E;
                tdsListRowV1View.setRightType(asbinder);
                String string4 = r3.getString(im.toss.feature.credit.ui.history.R.string.score_format);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String str2 = String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                tdsListRowV1View.setRightText1(str2);
                int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent3, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                if (baseTextView != null) {
                    baseTextView.onNavigationEvent(response.Bold);
                    Context context6 = baseTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    Configuration configuration2 = context6.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    tdsListRowV1View.setRightText1Color(new getUrlokhttp(new IAuthTabCallbackStub(configuration2)).ICustomTabsCallbackStubProxy());
                    int i22 = getInterfaceDescriptor + 25;
                    access100 = i22 % 128;
                    int i23 = i22 % 2;
                }
                DisplayMetrics displayMetrics3 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                tdsListRowV1View.setPaddingTop(varyMatches.onNavigationEvent(8, displayMetrics3));
                DisplayMetrics displayMetrics4 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                tdsListRowV1View.setPaddingBottom(varyMatches.onNavigationEvent(8, displayMetrics4));
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
                Context context7 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context7, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
                tdsListRowV1View2.setLeftType(asinterface);
                DisplayMetrics displayMetrics5 = tdsListRowV1View2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                int iOnNavigationEvent4 = varyMatches.onNavigationEvent(24, displayMetrics5);
                DisplayMetrics displayMetrics6 = tdsListRowV1View2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                tdsListRowV1View2.setLeftImageSize(iOnNavigationEvent4, varyMatches.onNavigationEvent(24, displayMetrics6));
                Object[] objArr5 = new Object[1];
                a(new char[]{12210, 26669, 41128, 63779, 12709, 19055, 33511, 56160, 5041, 44085, 58533, 15631, 30103, 36382, 50910, 7939, 22405, 36890, 10399, 24909, 47503, 61960, 2743, 17270, 39921, 54398, 27898, 42360, 64929, 13949, 20206, 34656, 57237, 6157, 20676, 59676, 8671, 31318, 45767, 52033, 911, 23628, 38091, 11445, 25915, 48548, 63101, 3765, 18219, 40878, 55393, 4275, 43299, 57783, 14875, 29338, 35612, 50053, 7257, 21641, 60674, 9624, 32261, 46793, 53098, 2039, 16507}, (ViewConfiguration.getLongPressTimeout() >> 16) + 18307, objArr5);
                tdsListRowV1View2.setLeftImage(((String) objArr5[0]).intern());
                tdsListRowV1View2.setCenterType(onextracallbackwithresult);
                Context context8 = tdsListRowV1View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                Configuration configuration3 = context8.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new IAuthTabCallbackDefault(configuration3)).ICustomTabsCallbackStubProxy());
                tdsListRowV1View2.setCenterText1(r3.getString(R.string.credit_loan_amount));
                tdsListRowV1View2.setRightType(asbinder);
                tdsListRowV1View2.setRightText1(str);
                int iOnNavigationEvent5 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                BaseTextView baseTextView2 = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent5, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                if (baseTextView2 != null) {
                    baseTextView2.onNavigationEvent(response.Bold);
                    Context context9 = baseTextView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    Configuration configuration4 = context9.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration4, "");
                    tdsListRowV1View2.setRightText1Color(new getUrlokhttp(new asBinder(configuration4)).ICustomTabsCallbackStubProxy());
                }
                DisplayMetrics displayMetrics7 = tdsListRowV1View2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                tdsListRowV1View2.setPaddingTop(varyMatches.onNavigationEvent(8, displayMetrics7));
                DisplayMetrics displayMetrics8 = tdsListRowV1View2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                tdsListRowV1View2.setPaddingBottom(varyMatches.onNavigationEvent(8, displayMetrics8));
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View2);
                TdsButtonV1View.asInterface asinterface2 = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 15, (DefaultConstructorMarker) null);
                Context context10 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "");
                TdsButtonV1View tdsButtonV1View = new TdsButtonV1View(context10);
                tdsButtonV1View.setTheme(asinterface2);
                DisplayMetrics displayMetrics9 = tdsButtonV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
                int iOnNavigationEvent6 = varyMatches.onNavigationEvent(30, displayMetrics9);
                DisplayMetrics displayMetrics10 = tdsButtonV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
                setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsButtonV1View, iOnNavigationEvent6, varyMatches.onNavigationEvent(16, displayMetrics10));
                DisplayMetrics displayMetrics11 = tdsButtonV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
                int iOnNavigationEvent7 = varyMatches.onNavigationEvent(16, displayMetrics11);
                DisplayMetrics displayMetrics12 = tdsButtonV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
                Object[] objArr6 = {tdsButtonV1View, Integer.valueOf(iOnNavigationEvent7), Integer.valueOf(varyMatches.onNavigationEvent(16, displayMetrics12))};
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, objArr6, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
                tdsButtonV1View.setText(r3.getString(im.toss.uikit.R.string.uikit_confirm));
                tdsButtonV1View.setTheme(new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.INLINE, 1, (DefaultConstructorMarker) null));
                tdsButtonV1View.setOnClickListener(new View.OnClickListener() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i24 = 2 % 2;
                        int i25 = onExtraCallback + 9;
                        IAuthTabCallback = i25 % 128;
                        int i26 = i25 % 2;
                        CreditHighInterestComparisonActivity.onWarmupCompleted(gettypedexportedconstants, view);
                        int i27 = IAuthTabCallback + 91;
                        onExtraCallback = i27 % 128;
                        int i28 = i27 % 2;
                    }
                });
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View);
                gettypedexportedconstants.setContentView(linearLayout);
                gettypedexportedconstants.show();
                return null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHighInterestComparisonActivity, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = getInterfaceDescriptor + 21;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ String onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(creditHighInterestComparisonActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strAsInterface = asInterface(creditHighInterestComparisonActivity);
        int i3 = getInterfaceDescriptor + 73;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return strAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 93;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(creditHighInterestComparisonActivity, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(creditHighInterestComparisonActivity, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditHighInterestComparisonActivity, onnavigationevent);
        int i4 = access100 + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(creditHighInterestComparisonActivity, bottomSheetInfo, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 117;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(gettypedexportedconstants, view);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = access100 + 19;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        creditHighInterestComparisonActivity.onWarmupCompleted(creditHighInterestComparisonResponse);
        int i4 = access100 + 41;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        creditHighInterestComparisonActivity.IPostMessageService();
        int i4 = getInterfaceDescriptor + 55;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        creditHighInterestComparisonActivity.IEngagementSignalsCallbackStub();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = getInterfaceDescriptor + 11;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = access100 + 41;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        View viewAq_;
        int i = 2 % 2;
        int i2 = access100 + 99;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
            int i3 = 68 / 0;
        } else {
            viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        }
        int i4 = access100 + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.ar_();
        }
        super/*o.openJavaCrashMonitor*/.ar_();
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = access100 + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return findresandmsgAs_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = getInterfaceDescriptor + 5;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100 + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = getInterfaceDescriptor + 5;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = getInterfaceDescriptor + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = getInterfaceDescriptor + 77;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = access100 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = access100 + 59;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub;
        int i = 2 % 2;
        int i2 = access100 + 75;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
            int i3 = 14 / 0;
        } else {
            hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        }
        int i4 = getInterfaceDescriptor + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        super/*o.openJavaCrashMonitor*/.validateRelationship();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 63;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i2 = access100 + 15;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = getInterfaceDescriptor + 15;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return null;
    }

    private final checkThread onSessionEnded() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        checkThread checkthread = (checkThread) value;
        int i4 = getInterfaceDescriptor + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return checkthread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final checkThread asBinder(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        checkThread checkthreadIAuthTabCallback = checkThread.IAuthTabCallback(LayoutInflater.from(creditHighInterestComparisonActivity));
        int i4 = getInterfaceDescriptor + 83;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return checkthreadIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asInterface(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditHighInterestComparisonActivity.getIntent());
        int i4 = access100 + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CreditHighInterestComparisonResponse IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponse = (CreditHighInterestComparisonResponse) this.onTransact.getValue();
        int i4 = getInterfaceDescriptor + 67;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return creditHighInterestComparisonResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final CreditHighInterestComparisonResponse IAuthTabCallbackStub(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonResponse parcelableExtra = creditHighInterestComparisonActivity.getIntent().getParcelableExtra("comparison");
        if (i3 != 0) {
            throw null;
        }
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponse = parcelableExtra;
        int i4 = access100 + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return creditHighInterestComparisonResponse;
    }

    private static final levelConversion.onNavigationEvent onTransact(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponseIEngagementSignalsCallbackDefault = creditHighInterestComparisonActivity.IEngagementSignalsCallbackDefault();
        if (creditHighInterestComparisonResponseIEngagementSignalsCallbackDefault == null) {
            return null;
        }
        int i4 = access100 + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        levelConversion.onNavigationEvent onnavigationeventOnWarmupCompleted = checkMagicOptions.onWarmupCompleted(creditHighInterestComparisonResponseIEngagementSignalsCallbackDefault);
        if (i5 != 0) {
            int i6 = 9 / 0;
        }
        int i7 = getInterfaceDescriptor + 35;
        access100 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 91 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private final levelConversion.onNavigationEvent onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        levelConversion.onNavigationEvent onnavigationevent = (levelConversion.onNavigationEvent) this.access000.getValue();
        int i4 = access100 + 25;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i4 = access100 + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return hascrashwhenjavacrash;
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditHighInterestComparisonActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = true;
        super.onStart();
        int i4 = access100 + 39;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = IAuthTabCallback + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = IAuthTabCallback + 33;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 21 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            int i4 = IAuthTabCallback + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 121;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.onNavigationEvent.onWarmupCompleted + 67;
            im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.onNavigationEvent.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallback)) != true) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 70 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditHighInterestComparisonActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView((View) onSessionEnded().onExtraCallbackWithResult());
        setSupportActionBar(onSessionEnded().access000);
        IAuthTabCallback(IEngagementSignalsCallbackDefault());
        int i4 = getInterfaceDescriptor + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 115;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19626 - TextUtils.lastIndexOf("", '0', 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStubProxy ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), MotionEvent.axisFromString("") + 60, 6382 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 101;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 58 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.myPid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 59, View.getDefaultSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ CreditHighInterestComparisonResponse $comparison;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(CreditHighInterestComparisonResponse creditHighInterestComparisonResponse, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$comparison = creditHighInterestComparisonResponse;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditHighInterestComparisonActivity.this.new onWarmupCompleted(this.$comparison, access13800Var);
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 23 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            CreditHighInterestComparisonActivity.IAuthTabCallback(CreditHighInterestComparisonActivity.this, this.$comparison);
            CreditHighInterestComparisonActivity.onExtraCallbackWithResult(CreditHighInterestComparisonActivity.this);
            CreditHighInterestComparisonActivity.IAuthTabCallbackDefault(CreditHighInterestComparisonActivity.this);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private final void IAuthTabCallback(CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(creditHighInterestComparisonResponse, null), 3, (Object) null);
        IPostMessageServiceDefault();
        int i2 = access100 + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        String strOnNavigationEvent;
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = (CreditHighInterestComparisonActivity) objArr[0];
        CreditHighInterestComparisonResponse creditHighInterestComparisonResponse = (CreditHighInterestComparisonResponse) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = creditHighInterestComparisonResponse != null ? creditHighInterestComparisonResponse.onExtraCallback() : 0;
        if (creditHighInterestComparisonResponse != null) {
            int i4 = access100 + 13;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            strOnNavigationEvent = creditHighInterestComparisonResponse.onNavigationEvent();
            if (strOnNavigationEvent == null) {
                strOnNavigationEvent = "";
            }
        }
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, Integer.valueOf(iOnExtraCallback), strOnNavigationEvent}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1984195360, -1984195360, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        String strOnNavigationEvent;
        CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfoOnExtraCallbackWithResult;
        CreditHighInterestComparisonResponse.Comparison comparisonIAuthTabCallback;
        CreditHighInterestComparisonResponse.Comparison comparisonIAuthTabCallback2;
        int i = 2 % 2;
        TdsListHeaderV3View tdsListHeaderV3View = onSessionEnded().access100;
        Intrinsics.checkNotNull(tdsListHeaderV3View);
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setTitleFontWeight(GraphicDeviceInfo.Companion.IAuthTabCallback());
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration)).onPostMessage());
        tdsListHeaderV3View.setTitleText(getString(R.string.credit_ui_high_interest_comparison_list_header_title));
        Typography5 typography5 = onSessionEnded().asInterface;
        levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent = onVerticalScrollEvent();
        typography5.setText((onnavigationeventOnVerticalScrollEvent == null || (comparisonIAuthTabCallback2 = onnavigationeventOnVerticalScrollEvent.IAuthTabCallback()) == null) ? null : comparisonIAuthTabCallback2.onWarmupCompleted());
        Typography5 typography52 = onSessionEnded().IAuthTabCallbackStubProxy;
        levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent2 = onVerticalScrollEvent();
        if (onnavigationeventOnVerticalScrollEvent2 == null || (comparisonIAuthTabCallback = onnavigationeventOnVerticalScrollEvent2.IAuthTabCallback()) == null) {
            strOnNavigationEvent = null;
        } else {
            int i2 = getInterfaceDescriptor + 23;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent = comparisonIAuthTabCallback.onNavigationEvent();
        }
        typography52.setText(strOnNavigationEvent);
        Typography5 typography53 = onSessionEnded().asBinder;
        int i4 = R.string.credit_ui_high_interest_comparison_average_label;
        levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent3 = onVerticalScrollEvent();
        typography53.setText(getString(i4, onnavigationeventOnVerticalScrollEvent3 != null ? getString(onnavigationeventOnVerticalScrollEvent3.onExtraCallback()) : null));
        Typography5 typography54 = onSessionEnded().IAuthTabCallbackDefault;
        int i5 = R.string.credit_ui_high_interest_comparison_my_label;
        levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent4 = onVerticalScrollEvent();
        typography54.setText(getString(i5, onnavigationeventOnVerticalScrollEvent4 != null ? getString(onnavigationeventOnVerticalScrollEvent4.onExtraCallback()) : null));
        levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent5 = onVerticalScrollEvent();
        if (onnavigationeventOnVerticalScrollEvent5 == null || (bottomSheetInfoOnExtraCallbackWithResult = onnavigationeventOnVerticalScrollEvent5.onExtraCallbackWithResult()) == null) {
            return;
        }
        onSessionEnded().IAuthTabCallbackDefault.setOnClickListener(new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda0(this, bottomSheetInfoOnExtraCallbackWithResult));
        int i6 = getInterfaceDescriptor + 107;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onNavigationEvent(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        creditHighInterestComparisonActivity.onNavigationEvent(bottomSheetInfo);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        String string = getString(R.string.credit_ui_high_interest_comparison_cta_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = onSessionEnded().onNavigationEvent;
        tdsBottomCtaV1View.setGradientVisibility(0);
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda8(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i2 = access100 + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb sessionTrackerbICustomTabsService_Parcel = creditHighInterestComparisonActivity.ICustomTabsService_Parcel();
        Object[] objArr = new Object[1];
        a(new char[]{12201, 5332, 22876, 40398, 49732, 1737, 19287, 36852, 62577, 14515, 32059, 41404, 58994, 10890, 28417, 21377, 38981, 56466, 275, 17814, 35382, 52908, 13114, 30654, 48161, 57526, 9674, 27164, 44764, 37712, 55254, 7258, 16584, 34163, 51689, 3705, 29355, 46974, 64490, 8194, 25734, 43264, 60800, 53804, 5791, 23339, 40865, 50211, 2227, 19746, 45493, 63016, 15225, 32705, 42055, 59606, 11612, 4582, 22119, 39660, 57187, 997, 18545, 36077, 61811, 13714, 31235, 48773}, (KeyEvent.getMaxKeyCode() >> 16) + 15227, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsService_Parcel, creditHighInterestComparisonActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        onSessionEnded().IAuthTabCallback.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1524959924, true, new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda12(this))));
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = access100 + 107;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
            if ((i & 100) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing)) {
                    int i6 = getInterfaceDescriptor + 17;
                    access100 = i6 % 128;
                    i3 = i6 % 2 == 0 ? 3 : 4;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1298980791, i2, -1, "im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.initDisclaimer.<anonymous>.<anonymous>.<anonymous> (CreditHighInterestComparisonActivity.kt:157)");
            }
            String string = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_content_1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i7 = i2 & 14;
            arecachedadresourcesmissing.onWarmupCompleted(string, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string2 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_content_2);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arecachedadresourcesmissing.onWarmupCompleted(string2, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string3 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_content_3);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arecachedadresourcesmissing.onWarmupCompleted(string3, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string4 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_content_4);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            arecachedadresourcesmissing.onWarmupCompleted(string4, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getInterfaceDescriptor + 85;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = access100 + 93;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015571662, i2, -1, "im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.initDisclaimer.<anonymous>.<anonymous>.<anonymous> (CreditHighInterestComparisonActivity.kt:169)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015571662, i2, -1, "im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.initDisclaimer.<anonymous>.<anonymous>.<anonymous> (CreditHighInterestComparisonActivity.kt:169)");
            }
            String string = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_please_check_1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i7 = i2 & 14;
            arecachedadresourcesmissing.onWarmupCompleted(string, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string2 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_please_check_2);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arecachedadresourcesmissing.onWarmupCompleted(string2, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string3 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_please_check_3);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arecachedadresourcesmissing.onWarmupCompleted(string3, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string4 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_please_check_4);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            arecachedadresourcesmissing.onWarmupCompleted(string4, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            String string5 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_please_check_5);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            arecachedadresourcesmissing.onWarmupCompleted(string5, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access100 + 57;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(final CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = getInterfaceDescriptor + 27;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(151663692, i2, -1, "im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.initDisclaimer.<anonymous>.<anonymous> (CreditHighInterestComparisonActivity.kt:154)");
            }
            String string = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_header);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i5 = (i2 << 24) & 234881024;
            roundUpToNearestHalfInt.onNavigationEvent(1709978979, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1709978978, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{rounduptonearesthalfint, string, null, 0L, null, null, 0, Float.valueOf(0.0f), null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5), 254}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
            int i6 = ((i2 << 21) & 29360128) | 1572864;
            rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-1298980791, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Unit unitOnWarmupCompleted;
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 23;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        unitOnWarmupCompleted = CreditHighInterestComparisonActivity.onWarmupCompleted(this.f$0, (areCachedAdResourcesMissing) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i9 = 91 / 0;
                    } else {
                        unitOnWarmupCompleted = CreditHighInterestComparisonActivity.onWarmupCompleted(this.f$0, (areCachedAdResourcesMissing) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    int i10 = onNavigationEvent + 57;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, i6, 63);
            String string2 = creditHighInterestComparisonActivity.getString(R.string.credit_ui_high_interest_comparison_disclaimer_please_check_note);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            rounduptonearesthalfint.asInterface(string2, (QuirksExternalSyntheticBackport0) null, 0L, GraphicDeviceInfo.Companion.IAuthTabCallback(), (handshake) null, 0, 0.0f, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResult, i5 | 3072, 246);
            rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-2015571662, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda7
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 7;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        CreditHighInterestComparisonActivity.onExtraCallbackWithResult(this.f$0, (areCachedAdResourcesMissing) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = CreditHighInterestComparisonActivity.onExtraCallbackWithResult(this.f$0, (areCachedAdResourcesMissing) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i9 = onExtraCallback + 97;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, i6, 63);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = getInterfaceDescriptor + 111;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 65;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = access100 + 1;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getInterfaceDescriptor + 91;
                access100 = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1524959924, i, -1, "im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.initDisclaimer.<anonymous> (CreditHighInterestComparisonActivity.kt:153)");
                    int i8 = 51 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1524959924, i, -1, "im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity.initDisclaimer.<anonymous> (CreditHighInterestComparisonActivity.kt:153)");
                }
            }
            r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallback(1461071866, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{null, 0L, Float.valueOf(0.0f), null, ForwardingCameraControl.onExtraCallback(151663692, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr = {this.f$0, (roundUpToNearestHalfInt) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    Unit unit = (Unit) CreditHighInterestComparisonActivity.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1183652542, 1183652543, iOnExtraCallback);
                    int i12 = onExtraCallbackWithResult + 23;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15}, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = access100 + 9;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(String str, String str2, CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, int i, String str3, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access100 + 123;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(new char[]{12206, 62848, 39916, 41430}, (Process.myPid() >> 22) + 55843, objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), "credit_loan");
        Object[] objArr2 = new Object[1];
        a(new char[]{12206, 5776, 24040, 34015, 52019}, 14627 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        onwarmupcompleted.onExtraCallback(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        a(new char[]{12201, 44754, 11586, 43993, 10823, 43231, 10072, 42452}, TextUtils.lastIndexOf("", '0') + 33150, objArr3);
        onwarmupcompleted.onExtraCallback(((String) objArr3[0]).intern(), str2);
        String string = creditHighInterestComparisonActivity.getString(R.string.credit_score_format);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str4 = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "");
        onwarmupcompleted.onExtraCallback("credit_score", str4);
        String string2 = creditHighInterestComparisonActivity.getString(R.string.credit_loan_amount_format);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String str5 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        onwarmupcompleted.onExtraCallback("loan_amount", str5);
        Unit unit = Unit.INSTANCE;
        int i5 = access100 + 85;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final void onExtraCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        gettypedexportedconstants.dismiss();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        gettypedexportedconstants.dismiss();
        int i4 = access100 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo) {
        int i = 2 % 2;
        CreditHighInterestComparisonActivity$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda13(this, bottomSheetInfo);
        logAndOpenStore.IAuthTabCallback(this, 1382842L);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, 1382842L, externalSyntheticLambda13, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setTitle(bottomSheetInfo.onExtraCallbackWithResult());
        bottomSheetHeader.setDescription(bottomSheetInfo.IAuthTabCallback());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(40, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(40, displayMetrics2));
        tdsListRowV1View.setLeftImageTransformation(Protocol.onWarmupCompleted(new setProxyokhttp(tdsListRowV1View.getContext(), 0.0f, 0.0f, 0.0f, 0, 0, 62, (DefaultConstructorMarker) null)));
        tdsListRowV1View.setLeftImage(bottomSheetInfo.onExtraCallback());
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2F);
        Context context4 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onPostMessage());
        Context context5 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration2 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new asInterface(configuration2)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setCenterText1(bottomSheetInfo.onNavigationEvent());
        tdsListRowV1View.setCenterText2(bottomSheetInfo.onWarmupCompleted());
        DisplayMetrics displayMetrics3 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        tdsListRowV1View.setPaddingTop(varyMatches.onNavigationEvent(8, displayMetrics3));
        DisplayMetrics displayMetrics4 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        tdsListRowV1View.setPaddingBottom(varyMatches.onNavigationEvent(8, displayMetrics4));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        TdsButtonV1View.asInterface asinterface = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 15, (DefaultConstructorMarker) null);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsButtonV1View tdsButtonV1View = new TdsButtonV1View(context6);
        tdsButtonV1View.setTheme(asinterface);
        DisplayMetrics displayMetrics5 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(30, displayMetrics5);
        DisplayMetrics displayMetrics6 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsButtonV1View, iOnNavigationEvent2, varyMatches.onNavigationEvent(16, displayMetrics6));
        DisplayMetrics displayMetrics7 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(16, displayMetrics7);
        DisplayMetrics displayMetrics8 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        Object[] objArr = {tdsButtonV1View, Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(varyMatches.onNavigationEvent(16, displayMetrics8))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
        tdsButtonV1View.setText(tdsButtonV1View.getContext().getString(im.toss.uikit.R.string.uikit_confirm));
        tdsButtonV1View.setTheme(new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.INLINE, 1, (DefaultConstructorMarker) null));
        tdsButtonV1View.setOnClickListener(new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda14(gettypedexportedconstants));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = getInterfaceDescriptor + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IPostMessageService() {
        int i = 2 % 2;
        onSessionEnded().onTransact.setCustomType("credit_analysis_comparison");
        onSessionEnded().onTransact.setCustomParams(new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda9(this));
        int i2 = getInterfaceDescriptor + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, initSDK.onNavigationEvent onnavigationevent) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent = creditHighInterestComparisonActivity.onVerticalScrollEvent();
        if (onnavigationeventOnVerticalScrollEvent != null) {
            CreditHighInterestComparisonResponse.Comparison comparisonIAuthTabCallback = onnavigationeventOnVerticalScrollEvent.IAuthTabCallback();
            if (comparisonIAuthTabCallback != null) {
                int i2 = access100 + 99;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                strOnWarmupCompleted = comparisonIAuthTabCallback.onWarmupCompleted();
            } else {
                strOnWarmupCompleted = null;
            }
            onnavigationevent.onExtraCallback("average_interest", strOnWarmupCompleted);
            CreditHighInterestComparisonResponse.Comparison comparisonIAuthTabCallback2 = onnavigationeventOnVerticalScrollEvent.IAuthTabCallback();
            onnavigationevent.onExtraCallback("my_interest", comparisonIAuthTabCallback2 != null ? comparisonIAuthTabCallback2.onNavigationEvent() : null);
            int i4 = getInterfaceDescriptor + 77;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        String strOnExtraCallback;
        CreditHighInterestComparisonResponse.Comparison comparisonIAuthTabCallback;
        int i = 2 % 2;
        TdsTopV2View tdsTopV2View = onSessionEnded().getInterfaceDescriptor;
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        Intrinsics.checkNotNull(tdsTopV2View);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onExtraCallback(configuration)).onUnminimized());
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
        String string = getString(R.string.credit_ui_high_interest_comparison_title_1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        iAuthTabCallback.IAuthTabCallback(string);
        iAuthTabCallback.IAuthTabCallback(" ");
        Context context2 = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(ByteOrderedDataOutputStream.onExtraCallback(new getUrlokhttp(new IAuthTabCallback(configuration2)).ICustomTabsServiceStubProxy()), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null));
        try {
            levelConversion.onNavigationEvent onnavigationeventOnVerticalScrollEvent = onVerticalScrollEvent();
            if (onnavigationeventOnVerticalScrollEvent == null || (comparisonIAuthTabCallback = onnavigationeventOnVerticalScrollEvent.IAuthTabCallback()) == null) {
                strOnExtraCallback = null;
            } else {
                strOnExtraCallback = comparisonIAuthTabCallback.onExtraCallback();
                int i2 = access100 + 51;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
            }
            iAuthTabCallback.IAuthTabCallback(String.valueOf(strOnExtraCallback));
            iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            iAuthTabCallback.IAuthTabCallback(" ");
            String string2 = getString(R.string.credit_ui_high_interest_comparison_title_2);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            iAuthTabCallback.IAuthTabCallback(string2);
            tdsTopV2View.setTitleText(iAuthTabCallback.onExtraCallbackWithResult());
            tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_15);
            Context context3 = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            tdsTopV2View.setSubtitle2TextColor(new getUrlokhttp(new onNavigationEvent(configuration3)).onPostMessage());
            String string3 = getString(R.string.credit_ui_high_interest_comparison_subtitle);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            tdsTopV2View.setSubtitle2Text(string3);
            tdsTopV2View.setOnClickListener(new CreditHighInterestComparisonActivity$.ExternalSyntheticLambda15(this, creditHighInterestComparisonResponse));
            IEngagementSignalsCallback_Parcel();
            int i4 = getInterfaceDescriptor + 61;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            throw th;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, View view) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, view}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 808375839, -808375835, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditHighInterestComparisonActivity, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1183652542, 1183652543, iOnExtraCallback);
    }

    public static /* synthetic */ CreditHighInterestComparisonResponse onExtraCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (CreditHighInterestComparisonResponse) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 436720900, -436720892, iOnExtraCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditHighInterestComparisonActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -169998452, 169998454, iOnExtraCallback);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{gettypedexportedconstants, view}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1196211582, 1196211585, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, creditHighInterestComparisonResponse}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 16946347, -16946342, iOnExtraCallback);
    }

    private static final Unit onNavigationEvent(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, creditHighInterestComparisonResponse}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1373482121, -1373482114, iOnExtraCallback);
    }

    private static final Unit onWarmupCompleted(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{creditHighInterestComparisonActivity, bottomSheetInfo, onwarmupcompleted}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1758260087, 1758260093, iOnExtraCallback);
    }

    private final void onExtraCallback(int i, String str) throws Throwable {
        Object[] objArr = {this, Integer.valueOf(i), str};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1984195360, -1984195360, iOnExtraCallback);
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditHighInterestComparisonActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 99;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditHighInterestComparisonActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = access100 + 91;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditHighInterestComparisonActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 3;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }
}
