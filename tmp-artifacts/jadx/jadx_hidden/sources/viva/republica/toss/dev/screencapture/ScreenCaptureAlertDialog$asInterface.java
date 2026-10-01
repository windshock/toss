package viva.republica.toss.dev.screencapture;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AdSettingsIntegrationErrorMode;
import o.InterstitialAdInterstitialLoadAdConfig;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.bindContext;
import o.findResAndMsg;
import viva.republica.toss.network.model.SchemeManagerInfoResponse;

/* loaded from: classes.dex */
public final class ScreenCaptureAlertDialog$asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super SchemeManagerInfoResponse>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int[] onNavigationEvent = {616265049, 1714584560, 694363887, -275819946, 1833685330, -2085277651, 1027405295, -150899987, -456810030, -507549302, -14817370, -1426216479, 471203373, -1061173409, 339868900, -1634989582, -24598896, 431645698};
    private static int onWarmupCompleted;
    final /* synthetic */ Long $schemeId$inlined;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCaptureAlertDialog$asInterface(access13800 access13800Var, Long l) {
        super(2, access13800Var);
        this.$schemeId$inlined = l;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ScreenCaptureAlertDialog$asInterface screenCaptureAlertDialog$asInterface = new ScreenCaptureAlertDialog$asInterface(access13800Var, this.$schemeId$inlined);
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return screenCaptureAlertDialog$asInterface;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super SchemeManagerInfoResponse> access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfigExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.extraCallback();
            long jLongValue = this.$schemeId$inlined.longValue();
            this.L$0 = access15400.onNavigationEvent(this);
            this.I$0 = 0;
            this.label = 1;
            obj = interstitialAdInterstitialLoadAdConfigExtraCallback.onExtraCallback(jLongValue, this);
            if (obj == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{-124406818, -181336710, -80967498, -1132107759, 845447162, -10692874, -183146789, 644204584, -68109122, 1057523507, 1235549711, 64582212, -1713763361, 1925980733, 2102983248, -342222596, -1417425841, -651756804, -385259485, 869766206, -1739586636, -2127525043, 1926713987, 1761402946}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult != null) {
                throw apiErrorExtraCallbackWithResult;
            }
            int i3 = onExtraCallback + 15;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            TossApiCallException.ApiError.onExtraCallback onextracallback = TossApiCallException.ApiError.Companion;
            if (i4 == 0) {
                throw onextracallback.onExtraCallbackWithResult(baseApiResponse);
            }
            onextracallback.onExtraCallbackWithResult(baseApiResponse);
            throw null;
        }
        try {
            Object objOnTransact = baseApiResponse.onTransact();
            if (objOnTransact != null) {
                return (SchemeManagerInfoResponse) objOnTransact;
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{-1386862340, -411006658, 1881908237, -2131099712, -1752646444, -475953059, 1575722404, 1615926059, 224432679, -12875935, -1890888204, 641235419, -284660354, -1345379300, 622590709, 980885175, 1672282036, -1202006488, 297508153, -2074148949, -1798237042, 2126793632, -1723020443, -1150600657, 124741322, 1362653774, 445010471, 1578765964, 661524110, 1346359175, 1464355777, 2128891527, -421717526, 1901726806, -701895773, 514120023, 1074388172, 1197265980, 1000043428, 2135475222, 229452361, -190770223, -88241669, 1980807988, 308764478, -1461986072, 583172073, 1694772912}, 95 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
            throw new NullPointerException(((String) objArr2[0]).intern());
        } catch (NullPointerException e) {
            if (!Intrinsics.areEqual(SchemeManagerInfoResponse.class, Object.class)) {
                int i5 = onWarmupCompleted + 15;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (!Intrinsics.areEqual(SchemeManagerInfoResponse.class, Unit.class)) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = onNavigationEvent;
        if (iArr4 != null) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i2 = 0;
            }
            while (i2 < length2) {
                int i5 = $10 + 65;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                iArr3[i2] = Hilt_QuickActionBottomSheetActivity$4.h(iArr4[i2]);
                i2++;
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onNavigationEvent;
        if (iArr6 != null) {
            int i7 = $10 + 121;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                iArr2[i8] = Hilt_QuickActionBottomSheetActivity$4.h(iArr6[i8]);
                i8++;
                int i9 = $11 + 55;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            for (int i11 = 0; i11 < 16; i11++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
