package viva.republica.toss.send.common;

import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.tmoney.a;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textField.TextField;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DERTaggedObject;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.JavaOnlyMap;
import o.SessionTrackerb;
import o.SkiaPooledImageRegionDecoderDecoderPool;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getNavigationBar;
import o.getNextAvailable;
import o.getParamImp;
import o.hasKey;
import o.initMiniApp;
import o.markAsUnused;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onPaused;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.zzad;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.account.openbanking.mock.OpenBankingRestrictionMockActivity;
import viva.republica.toss.send.common.TransferTestSettingActivity$;
import viva.republica.toss.send.v3.TransferRegisterAccountActivity;
import viva.republica.toss.widget.dialog.InputBottomSheetDialog;

@DERTaggedObject
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferTestSettingActivity extends Hilt_TransferTestSettingActivity {
    private View IAuthTabCallbackDefault;

    @Inject
    public zzad environments;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int access000 = 1;
    private static long onTransact = 7798559133331975163L;
    private static int asInterface = -1776194565;
    private static char IAuthTabCallback_Parcel = 31868;
    private final getNextAvailable asBinder = new getNextAvailable(null, 1, null);
    private final List<Object> IAuthTabCallbackStub = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, byte r8, short r9) {
        /*
            byte[] r0 = viva.republica.toss.send.common.TransferTestSettingActivity.$$a
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 + 109
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r9 = r9 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.TransferTestSettingActivity.$$c(int, byte, short):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(transferTestSettingActivity);
        int i4 = access000 + 111;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(transferTestSettingActivity);
        int i4 = access100 + 19;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(transferTestSettingActivity);
        int i4 = access000 + 65;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(transferTestSettingActivity);
        int i4 = access100 + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit asInterface(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            extraCallback(transferTestSettingActivity);
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallback = extraCallback(transferTestSettingActivity);
        int i3 = access100 + 9;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(TransferTestSettingActivity transferTestSettingActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 121;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onMinimized(transferTestSettingActivity);
        }
        onMinimized(transferTestSettingActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled);
        }
        onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(transferTestSettingActivity);
        }
        IAuthTabCallbackStubProxy(transferTestSettingActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = access000 + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity, tdsToastV1}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 2083097408, -2083097402);
        int i4 = access000 + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.app.Activity, viva.republica.toss.send.common.TransferTestSettingActivity] */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i8 | i4));
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i5 | i6));
        int i12 = i5 | i6;
        int i13 = i10 | i12;
        int i14 = (~(i4 | i5)) | (~i12);
        int i15 = i5 + i6 + i3 + (1068639271 * i2) + ((-1919980423) * i);
        int i16 = i15 * i15;
        int i17 = ((i5 * 1648758371) - 594280448) + (1648758371 * i6) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i3) + ((-1693188096) * i2) + (611057664 * i) + ((-810221568) * i16);
        int i18 = (i5 * 982247175) + 1844138806 + (i6 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i3 * 982246413) + (i2 * 1533776379) + (i * 1016546853) + (i16 * (-1070530560));
        switch (i17 + (i18 * i18 * 1708326912)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                TransferTestSettingActivity transferTestSettingActivity = (TransferTestSettingActivity) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                Function0<Unit> function0 = (Function0) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                Object obj = objArr[5];
                int i19 = 2 % 2;
                int i20 = access100 + 69;
                int i21 = i20 % 128;
                access000 = i21;
                if (i20 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 4) != 0) {
                    int i22 = i21 + 43;
                    access100 = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 3 / 5;
                    }
                    str2 = null;
                }
                transferTestSettingActivity.IAuthTabCallback(str, str2, function0);
                int i24 = access000 + 29;
                access100 = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                ?? r1 = (TransferTestSettingActivity) objArr[0];
                TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
                int i26 = 2 % 2;
                int i27 = access000 + 55;
                access100 = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(tdsToastV1, "");
                SessionTrackerb sessionTrackerbIAuthTabCallback = r1.IAuthTabCallback();
                Object[] objArr2 = new Object[1];
                a((char) TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0), new char[]{957, 8219, 47865, 52213, 44029, 33850, 6820, 60736, 19859, 56342, 55393, 7183, 35973, 26750, 45832, 52903, 20150, 64527, 11018, 3554, 56383, 61888, 31584, 41961, 39670, 20016, 34090, 61922, 40414, 63868, 46597, 36916, 20854, 26866}, new char[]{0, 0, 0, 0}, new char[]{23726, 37034, 5964, 25070}, objArr2);
                SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, (Activity) r1, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i29 = access100 + 5;
                access000 = i29 % 128;
                int i30 = i29 % 2;
                return unit;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TransferTestSettingActivity transferTestSettingActivity = (TransferTestSettingActivity) objArr[0];
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 123;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity, tdsToastV1}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 1504272554, -1504272549);
        }
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent5 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(transferTestSettingActivity);
        int i4 = access100 + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityResized;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return access100(transferTestSettingActivity);
        }
        access100(transferTestSettingActivity);
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        TransferTestSettingActivity transferTestSettingActivity = (TransferTestSettingActivity) objArr[0];
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(transferTestSettingActivity, tdsToastV1);
        int i4 = access000 + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(transferTestSettingActivity);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onWarmupCompleted(markAsUnused markasunused, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(markasunused, z);
        int i4 = access100 + 43;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(transferTestSettingActivity);
        int i4 = access000 + 7;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(transferTestSettingActivity, tdsToastV1);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 97;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 77;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 47;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TransferTestSettingActivity transferTestSettingActivity = (TransferTestSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 121;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = transferTestSettingActivity.environments;
        if (i4 != 0) {
            throw null;
        }
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 121;
        int i6 = i5 % 128;
        access100 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 51;
        access000 = i8 % 128;
        if (i8 % 2 != 0) {
            return zzadVar;
        }
        throw null;
    }

    @Override // viva.republica.toss.send.common.Hilt_TransferTestSettingActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        LinearLayout linearLayout = (LinearLayout) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -705760380, 705760384);
        this.IAuthTabCallbackDefault = linearLayout;
        if (linearLayout == null) {
            int i4 = access000 + 97;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        setContentView(linearLayout);
        validateRelationship();
        int i5 = access100 + 35;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback_Parcel(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getNavigationBar.IAuthTabCallback(TransferRegisterAccountActivity.onWarmupCompleted.onNavigationEvent(TransferRegisterAccountActivity.Companion, transferTestSettingActivity, transferTestSettingActivity.getScreenName(), (String) null, (String) null, (String) null, (String) null, (UTF8Decoder) null, (TransferRegisterAccountActivity.onExtraCallbackWithResult) null, false, false, false, (String) null, (String) null, (String) null, 16380, (Object) null), transferTestSettingActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 87;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access000(TransferTestSettingActivity transferTestSettingActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 55;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            getNavigationBar.IAuthTabCallback(OpenBankingRestrictionMockActivity.Companion.onExtraCallback(transferTestSettingActivity), transferTestSettingActivity);
            unit = Unit.INSTANCE;
            int i3 = 9 / 0;
        } else {
            getNavigationBar.IAuthTabCallback(OpenBankingRestrictionMockActivity.Companion.onExtraCallback(transferTestSettingActivity), transferTestSettingActivity);
            unit = Unit.INSTANCE;
        }
        int i4 = access100 + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(markAsUnused markasunused, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(markasunused, "");
        JavaOnlyMap.onExtraCallback.onExtraCallbackWithResult(z);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 97;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TransferTestSettingActivity.this.new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objIAuthTabCallback;
            BaseApiResponse baseApiResponse;
            int iIAuthTabCallback;
            int iIAuthTabCallback2;
            Object objOnTransact;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.red(0) + 22, 24734 - (ViewConfiguration.getTouchSlop() >> 8), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj3 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1550062933);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 29426), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, ExpandableListView.getPackedPositionType(0L) + 24734, 1831136197, false, "readTypedObject", new Class[0]);
                        }
                        onPaused onpaused = (onPaused) ((Method) objOnExtraCallback2).invoke(obj3, null);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        objIAuthTabCallback = onpaused.IAuthTabCallback(this);
                        if (objIAuthTabCallback == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = obj;
                }
                baseApiResponse = (BaseApiResponse) objIAuthTabCallback;
                iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    objOnTransact = baseApiResponse.onTransact();
                } catch (NullPointerException e4) {
                    if (!Intrinsics.areEqual(Object.class, Object.class) && !Intrinsics.areEqual(Object.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e4);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                    objOnTransact = Unit.INSTANCE;
                }
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                obj2 = Result.constructor-impl(objOnTransact);
                BaseActivity baseActivity = TransferTestSettingActivity.this;
                if (Result.onNavigationEvent(obj2)) {
                    onJsBridgeReady.onNavigationEvent(baseActivity, baseActivity.getString(R.string.app_main_more___58173ce360), 0, 2, (Object) null);
                }
                BaseActivity baseActivity2 = TransferTestSettingActivity.this;
                Throwable th2 = Result.exceptionOrNull-impl(obj2);
                if (th2 != null) {
                    getParamImp.onWarmupCompleted(th2, baseActivity2, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                }
                return Unit.INSTANCE;
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    private static final Unit ICustomTabsCallback(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(transferTestSettingActivity), (CoroutineContext) null, (setRandomHost) null, transferTestSettingActivity.new IAuthTabCallback(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit writeTypedObject(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        JavaOnlyMap.onExtraCallback.IAuthTabCallback(true);
        View view = transferTestSettingActivity.IAuthTabCallbackDefault;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        Object[] objArr = {new TdsToastV1.onNavigationEvent(view, "연락처 송금시 실명 불일치 실패가 1회 발생해요."), "바로 가기", new TransferTestSettingActivity$.ExternalSyntheticLambda14(transferTestSettingActivity)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        ((TdsToastV1.onNavigationEvent) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 289755328, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -289755323, iOnWarmupCompleted)).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsToastV1, "");
        SessionTrackerb sessionTrackerbIAuthTabCallback = transferTestSettingActivity.IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((char) (56126 - TextUtils.lastIndexOf("", '0')), View.combineMeasuredStates(0, 0), new char[]{28511, 23470, 52309, 8698, 19473, 54195, 42904, 48906, 16271, 1963, 41748, 5102, 12270, 13915, 9108, 38602}, new char[]{0, 0, 0, 0}, new char[]{38534, 5769, 16276, 20443}, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, transferTestSettingActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 121;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit readTypedObject(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        JavaOnlyMap.onExtraCallback.onWarmupCompleted(true);
        View view = transferTestSettingActivity.IAuthTabCallbackDefault;
        if (view == null) {
            int i4 = access100 + 15;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        Object[] objArr = {new TdsToastV1.onNavigationEvent(view, "예약이체 등록 유도시 실명 입력 바텀싯이 1회 노출돼요."), "바로 가기", new TransferTestSettingActivity$.ExternalSyntheticLambda17(transferTestSettingActivity)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        ((TdsToastV1.onNavigationEvent) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 289755328, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -289755323, iOnWarmupCompleted)).onNavigationEvent();
        return Unit.INSTANCE;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 55;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int gidForName = 42 - Process.getGidForName("");
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4, i4) + 1452;
                    byte b = (byte) i4;
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (-b2));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), gidForName, iLastIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", i4)), 44 - View.MeasureSpec.getMode(i4), 1494 - Color.blue(i4), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 50, KeyEvent.keyCodeFromString("") + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 45848), ImageFormat.getBitsPerPixel(0) + 30, 12577 - Color.alpha(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (asInterface ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback_Parcel ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 73;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static final class onExtraCallbackWithResult implements InputBottomSheetDialog.onWarmupCompleted {
        onExtraCallbackWithResult() {
        }

        public void onExtraCallback(BottomSheetDialog bottomSheetDialog, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            bottomSheetDialog.dismiss();
            JavaOnlyMap.onExtraCallback.onExtraCallback(StringsKt.trim(charSequence.toString()).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit extraCallback(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        String strOnTransact = JavaOnlyMap.onExtraCallback.onTransact();
        String string = transferTestSettingActivity.getString(R.string.save);
        Intrinsics.checkNotNullExpressionValue(string, "");
        new InputBottomSheetDialog(transferTestSettingActivity, "transferUniqueKey", "", strOnTransact, "", "", string, true, new onExtraCallbackWithResult(), (View) null, 0, false, (CharSequence) null, (TextField.onWarmupCompleted) null, false, (List) null, 65024, (DefaultConstructorMarker) null).show();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback("알파에서만 초기화할 수 있어요.");
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onMinimized(TransferTestSettingActivity transferTestSettingActivity) throws Throwable {
        int i = 2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        if (!((zzad) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 703123264, -703123261)).RemoteActionCompatParcelizer()) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(transferTestSettingActivity, new TransferTestSettingActivity$.ExternalSyntheticLambda16());
            int i2 = access000 + 51;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = access100 + 25;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                SessionTrackerb sessionTrackerbIAuthTabCallback = transferTestSettingActivity.IAuthTabCallback();
                Object[] objArr = new Object[1];
                a((char) View.MeasureSpec.makeMeasureSpec(1, 0), (-1774614562) >> View.MeasureSpec.makeMeasureSpec(0, 1), new char[]{34641, 53174, 19472, 45910, 22273, 5385, 34018, 35155, 43286, 42588, 50106, 30520, 32230, 19008, 47885, 28779, 980, 20806, 15614, 59171, 27502, 8324, 538}, new char[]{0, 0, 0, 0}, new char[]{56884, 14727, 9366, 61489}, objArr);
                SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, transferTestSettingActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 94, (Object) null);
            } else {
                SessionTrackerb sessionTrackerbIAuthTabCallback2 = transferTestSettingActivity.IAuthTabCallback();
                Object[] objArr2 = new Object[1];
                a((char) View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 1774614562, new char[]{34641, 53174, 19472, 45910, 22273, 5385, 34018, 35155, 43286, 42588, 50106, 30520, 32230, 19008, 47885, 28779, 980, 20806, 15614, 59171, 27502, 8324, 538}, new char[]{0, 0, 0, 0}, new char[]{56884, 14727, 9366, 61489}, objArr2);
                SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback2, transferTestSettingActivity, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = access000 + 121;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, viva.republica.toss.send.common.TransferTestSettingActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ?? r3 = (TransferTestSettingActivity) objArr[0];
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsToastV1, "");
        SessionTrackerb sessionTrackerbIAuthTabCallback = r3.IAuthTabCallback();
        Object[] objArr2 = new Object[1];
        a((char) (Process.myTid() >> 22), Color.argb(0, 0, 0, 0), new char[]{3738, 22863, 12791, 22361, 30834, 42073, 13554, 5564, 30011, 31133, 65389, 25028, 41514, 47335, 18159, 56895, 63077, 9890, 18347, 40486, 65194, 61840, 25363, 39954}, new char[]{0, 0, 0, 0}, new char[]{10460, 22316, 21092, 21442}, objArr2);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, (Activity) r3, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 111;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onActivityResized(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        JavaOnlyMap.onExtraCallback.onExtraCallback(true);
        View view = transferTestSettingActivity.IAuthTabCallbackDefault;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        Object[] objArr = {new TdsToastV1.onNavigationEvent(view, "포인트 출금시 수수료 무료 쿠폰을 1회 테스트해요."), "바로 가기", new TransferTestSettingActivity$.ExternalSyntheticLambda13(transferTestSettingActivity)};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        ((TdsToastV1.onNavigationEvent) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 289755328, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -289755323, iOnWarmupCompleted)).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 63;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsToastV1, "");
        SessionTrackerb sessionTrackerbIAuthTabCallback = transferTestSettingActivity.IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{3738, 22863, 12791, 22361, 30834, 42073, 13554, 5564, 30011, 31133, 65389, 25028, 41514, 47335, 18159, 56895, 63077, 9890, 18347, 40486, 65194, 61840, 25363, 39954}, new char[]{0, 0, 0, 0}, new char[]{10460, 22316, 21092, 21442}, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, transferTestSettingActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 63;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit access100(viva.republica.toss.send.common.TransferTestSettingActivity r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.common.TransferTestSettingActivity.access000
            int r1 = r1 + 89
            int r2 = r1 % 128
            viva.republica.toss.send.common.TransferTestSettingActivity.access100 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            o.JavaOnlyMap r1 = o.JavaOnlyMap.onExtraCallback
            r3 = 0
            r1.onNavigationEvent(r3)
            android.view.View r1 = r11.IAuthTabCallbackDefault
            if (r1 != 0) goto L33
            goto L24
        L1a:
            o.JavaOnlyMap r1 = o.JavaOnlyMap.onExtraCallback
            r3 = 1
            r1.onNavigationEvent(r3)
            android.view.View r1 = r11.IAuthTabCallbackDefault
            if (r1 != 0) goto L33
        L24:
            int r1 = viva.republica.toss.send.common.TransferTestSettingActivity.access000
            int r1 = r1 + 119
            int r3 = r1 % 128
            viva.republica.toss.send.common.TransferTestSettingActivity.access100 = r3
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L33:
            im.toss.uikit.widget.snackbar.TdsToastV1$onNavigationEvent r3 = new im.toss.uikit.widget.snackbar.TdsToastV1$onNavigationEvent
            java.lang.String r4 = "포인트 출금시 무제한 무료 출금을 1회 테스트해요."
            r3.<init>(r1, r4)
            viva.republica.toss.send.common.TransferTestSettingActivity$$ExternalSyntheticLambda15 r1 = new viva.republica.toss.send.common.TransferTestSettingActivity$$ExternalSyntheticLambda15
            r1.<init>(r11)
            java.lang.String r11 = "바로 가기"
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r11, r1}
            int r10 = com.tmoney.a.3.onWarmupCompleted()
            int r7 = com.tmoney.a.3.onWarmupCompleted()
            int r6 = com.tmoney.a.3.onWarmupCompleted()
            int r4 = com.tmoney.a.3.onWarmupCompleted()
            r9 = -289755323(0xffffffffeebaaf45, float:-2.888805E28)
            r5 = 289755328(0x114550c0, float:1.5565443E-28)
            java.lang.Object r11 = im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent.onWarmupCompleted(r4, r5, r6, r7, r8, r9, r10)
            im.toss.uikit.widget.snackbar.TdsToastV1$onNavigationEvent r11 = (im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent) r11
            r11.onNavigationEvent()
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            int r1 = viva.republica.toss.send.common.TransferTestSettingActivity.access100
            int r1 = r1 + 3
            int r3 = r1 % 128
            viva.republica.toss.send.common.TransferTestSettingActivity.access000 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L72
            return r11
        L72:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.TransferTestSettingActivity.access100(viva.republica.toss.send.common.TransferTestSettingActivity):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStubProxy(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            hasKey.onWarmupCompleted.onWarmupCompleted();
            onJsBridgeReady.onNavigationEvent(transferTestSettingActivity, "초기화 완료", 0, 3, (Object) null);
        } else {
            hasKey.onWarmupCompleted.onWarmupCompleted();
            onJsBridgeReady.onNavigationEvent(transferTestSettingActivity, "초기화 완료", 0, 2, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 59;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit extraCallbackWithResult(TransferTestSettingActivity transferTestSettingActivity) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasKey.onWarmupCompleted.onExtraCallback();
        onJsBridgeReady.onNavigationEvent(transferTestSettingActivity, "초기화 완료", 0, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.app_main_more___2d8ff3a9f8);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {this, string, null, new TransferTestSettingActivity$.ExternalSyntheticLambda1(this), 2, null};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 885447335, -885447333);
        String string2 = getString(R.string.app_main_more___fcf587f77f);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {this, string2, null, new TransferTestSettingActivity$.ExternalSyntheticLambda4(this), 2, null};
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr2, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent4, iOnNavigationEvent3, 885447335, -885447333);
        List<Object> list = this.IAuthTabCallbackStub;
        markAsUnused.IAuthTabCallback iAuthTabCallback = markAsUnused.Companion;
        int size = list.size();
        String string3 = getString(R.string.app_main_more___8d5e64a950);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        markAsUnused markasunusedOnWarmupCompleted = markAsUnused.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, size, string3, getString(R.string.app_main_more___8b63dc0427), false, new TransferTestSettingActivity$.ExternalSyntheticLambda5(), 8, null);
        markasunusedOnWarmupCompleted.onWarmupCompleted(JavaOnlyMap.onExtraCallback.IAuthTabCallback());
        list.add(markasunusedOnWarmupCompleted);
        String string4 = getString(R.string.app_main_more___5f9eba3cb0);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Object[] objArr3 = {this, string4, null, new TransferTestSettingActivity$.ExternalSyntheticLambda6(this), 2, null};
        int iOnNavigationEvent5 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent6 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr3, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent6, iOnNavigationEvent5, 885447335, -885447333);
        IAuthTabCallback("송금 에러: 연락처 실명 불일치로 실패하기", "Send V2 연락처 송금 시, 실명 입력 바텀싯을 테스트합니다.", new TransferTestSettingActivity$.ExternalSyntheticLambda7(this));
        IAuthTabCallback("송금 에러: 예약이체 등록시 계좌주 실명 입력", "Send V2 예약이체 등록 유도시, 실명 입력 바텀싯을 테스트합니다.", new TransferTestSettingActivity$.ExternalSyntheticLambda8(this));
        String string5 = getString(R.string.app_toss_team_settings_transfer_unique_key_title);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        IAuthTabCallback(string5, getString(R.string.app_toss_team_settings_transfer_unique_key_subtitle), new TransferTestSettingActivity$.ExternalSyntheticLambda9(this));
        this.IAuthTabCallbackStub.add(new SkiaPooledImageRegionDecoderDecoderPool());
        Object[] objArr4 = {this, "(알파) 포인트 초기화", null, new TransferTestSettingActivity$.ExternalSyntheticLambda10(this), 2, null};
        int iOnNavigationEvent7 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent8 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr4, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent8, iOnNavigationEvent7, 885447335, -885447333);
        Object[] objArr5 = {this, "포인트 무료 출금 쿠폰 사용", null, new TransferTestSettingActivity$.ExternalSyntheticLambda11(this), 2, null};
        int iOnNavigationEvent9 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent10 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr5, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent10, iOnNavigationEvent9, 885447335, -885447333);
        IAuthTabCallback("포인트 무제한 무료 출금", "프라임, 토신카 케이스", new TransferTestSettingActivity$.ExternalSyntheticLambda12(this));
        Object[] objArr6 = {this, "위치정보제공동의 약관 노출 초기화", null, new TransferTestSettingActivity$.ExternalSyntheticLambda2(this), 2, null};
        int iOnNavigationEvent11 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent12 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr6, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent12, iOnNavigationEvent11, 885447335, -885447333);
        Object[] objArr7 = {this, "카카오 송금 하이라이트 노출 초기화", null, new TransferTestSettingActivity$.ExternalSyntheticLambda3(this), 2, null};
        int iOnNavigationEvent13 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent14 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr7, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent14, iOnNavigationEvent13, 885447335, -885447333);
        this.asBinder.onExtraCallbackWithResult(this.IAuthTabCallbackStub, true);
        int i2 = access100 + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IAuthTabCallback(String str, String str2, Function0<Unit> function0) {
        int i = 2 % 2;
        List<Object> list = this.IAuthTabCallbackStub;
        list.add(markAsUnused.IAuthTabCallback.onExtraCallbackWithResult(markAsUnused.Companion, list.size(), str, str2, false, new TransferTestSettingActivity$.ExternalSyntheticLambda0(function0), 8, null));
        int i2 = access100 + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 119;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppCompatActivity appCompatActivity = (TransferTestSettingActivity) objArr[0];
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(appCompatActivity);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Object obj = null;
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appCompatActivity.setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            int i2 = access000 + 5;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsRecyclerView tdsRecyclerView = new TdsRecyclerView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRecyclerView.setLayoutManager(new LinearLayoutManager(tdsRecyclerView.getContext(), 1, false));
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsRecyclerView.setLayoutParams(layoutParams);
        tdsRecyclerView.setAdapter(((TransferTestSettingActivity) appCompatActivity).asBinder);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRecyclerView);
        disableImageViewPreallocationAndroid.onNavigationEvent(linearLayout, appBarLayout, (View) null, (View) null, false, 14, (Object) null);
        int i4 = access000 + 45;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity, tdsToastV1}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 960235926, -960235919);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{function0}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, -1096641447, 1096641447);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity, tdsToastV1}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 212486228, -212486227);
    }

    private final LinearLayout setEngagementSignalsCallback() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (LinearLayout) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, -705760380, 705760384);
    }

    static /* synthetic */ void onWarmupCompleted(TransferTestSettingActivity transferTestSettingActivity, String str, String str2, Function0 function0, int i, Object obj) throws Throwable {
        Object[] objArr = {transferTestSettingActivity, str, str2, function0, Integer.valueOf(i), obj};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 885447335, -885447333);
    }

    private static final Unit asBinder(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity, tdsToastV1}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 1504272554, -1504272549);
    }

    private static final Unit onTransact(TransferTestSettingActivity transferTestSettingActivity, TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferTestSettingActivity, tdsToastV1}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 2083097408, -2083097402);
    }

    public final zzad onNavigationEvent() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (zzad) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, 703123264, -703123261);
    }

    @Override // viva.republica.toss.send.common.Hilt_TransferTestSettingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.send.common.Hilt_TransferTestSettingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = access000 + 111;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.send.common.Hilt_TransferTestSettingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 19;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.send.common.Hilt_TransferTestSettingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }
}
