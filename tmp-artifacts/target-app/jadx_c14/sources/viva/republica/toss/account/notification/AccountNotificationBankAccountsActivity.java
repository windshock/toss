package viva.republica.toss.account.notification;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.common.collect.Synchronized;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ASN1ObjectParser;
import o.AdComponentViewParentApi;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BidderTokenProvider;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DERConstructedSet;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.MapConverter;
import o.NetConverter3;
import o.PluginInfo;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_UTIL_HPPTDownloadFile;
import o.VideoStartReason;
import o.access502;
import o.access8100;
import o.attachAdComponentViewApi;
import o.checkNavigationBarBySystemProperties;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.exitAllPages;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.onRewardServerSuccess;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity;
import viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity$;
import viva.republica.toss.account.notification.AccountNotificationSettingActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationBankAccountsActivity extends BaseActivity {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback_Parcel;
    public static final int asBinder;
    private static int extraCallback;
    private String IAuthTabCallbackStub;
    private Integer asInterface;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 0;
    private static int access000 = 1;
    private checkNavigationBarBySystemProperties onTransact = checkNavigationBarBySystemProperties.Companion.IAuthTabCallback();
    private final Lazy getInterfaceDescriptor = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));
    private final IAuthTabCallback IAuthTabCallbackDefault = new IAuthTabCallback(this);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, byte r9) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r7 = r7 * 4
            int r7 = r7 + 105
            byte[] r0 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.$$c(int, int, byte):java.lang.String");
    }

    static {
        extraCallback = 1;
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        asBinder = 8;
        int i = IAuthTabCallbackStubProxy + 105;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(VideoStartReason videoStartReason, AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(videoStartReason, accountNotificationBankAccountsActivity, dialogInterface);
        }
        onWarmupCompleted(videoStartReason, accountNotificationBankAccountsActivity, dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, VideoStartReason videoStartReason, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(accountNotificationBankAccountsActivity, compoundButton, z, videoStartReason, dialogInterface);
        int i4 = access000 + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(compoundButton, dialogInterface);
        int i4 = access100 + 61;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        VideoStartReason videoStartReason = (VideoStartReason) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(accountNotificationBankAccountsActivity, videoStartReason, setDetectableSize);
        int i4 = access000 + 81;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(accountNotificationBankAccountsActivity, list);
        int i4 = access100 + 113;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onTransact(accountNotificationBankAccountsActivity);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 99;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 21;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        int i4 = access100 + 115;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        asBinder(accountNotificationBankAccountsActivity);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        int i5 = access100 + 41;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(accountNotificationBankAccountsActivity, compoundButton, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access100 + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(accountNotificationBankAccountsActivity, deserializeurinullablecollection);
        int i4 = access000 + 65;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        VideoStartReason videoStartReason = (VideoStartReason) objArr[1];
        CompoundButton compoundButton = (CompoundButton) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[4];
        int i = 2 % 2;
        int i2 = access000 + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountNotificationBankAccountsActivity, videoStartReason, compoundButton, zBooleanValue, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access000 + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(videoStartReason, setDetectableSize);
        int i4 = access000 + 93;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(accountNotificationBankAccountsActivity, compoundButton, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access000 + 83;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(accountNotificationBankAccountsActivity, compoundButton, z, th);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i5;
        int i10 = ~i;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i5 + i4 + i2 + (563899752 * i3) + (667302295 * i6);
        int i15 = i14 * i14;
        int i16 = ((i5 * 1426164010) - 416808960) + (1426164010 * i4) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i2) + ((-1270874112) * i3) + (1914175488 * i6) + ((-1995833344) * i15);
        int i17 = (i5 * (-901935710)) + 144807674 + (i4 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i2 * (-901935539)) + (i3 * 42244168) + (i6 * (-913566613)) + (i15 * (-1006501888));
        switch (i16 + (i17 * i17 * (-1006239744))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i18 = 2 % 2;
                int i19 = access000 + 81;
                access100 = i19 % 128;
                int i20 = i19 % 2;
                IAuthTabCallback_Parcel(function1, obj);
                int i21 = access100 + 73;
                access000 = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
                attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) objArr[1];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
                int i23 = 2 % 2;
                int i24 = access100 + 23;
                access000 = i24 % 128;
                int i25 = i24 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(accountNotificationBankAccountsActivity, attachadcomponentviewapi, commonModule_setLeftEdgeTouchEnabled);
                int i26 = access000 + 29;
                access100 = i26 % 128;
                int i27 = i26 % 2;
                return unitIAuthTabCallback;
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                Function1 function12 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i28 = 2 % 2;
                int i29 = access100 + 119;
                access000 = i29 % 128;
                int i30 = i29 % 2;
                access000(function12, obj2);
                int i31 = access100 + 89;
                access000 = i31 % 128;
                int i32 = i31 % 2;
                return null;
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        VideoStartReason videoStartReason = (VideoStartReason) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(videoStartReason, setDetectableSize);
        int i4 = access100 + 25;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(accountNotificationBankAccountsActivity, compoundButton, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access000 + 109;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, attachAdComponentViewApi attachadcomponentviewapi) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, compoundButton, Boolean.valueOf(z), attachadcomponentviewapi}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1939035305, 1939035313, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        int i4 = access100 + 119;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(compoundButton, dialogInterface);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(accountNotificationBankAccountsActivity);
        int i4 = access100 + 111;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(dialogInterface);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 115;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(videoStartReason, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(videoStartReason, setDetectableSize);
        int i3 = access100 + 77;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void onNavigationEvent(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 101;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{compoundButton, dialogInterface}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 243641209, -243641208, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
            int i3 = 59 / 0;
        } else {
            onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{compoundButton, dialogInterface}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 243641209, -243641208, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        }
        int i4 = access100 + 89;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CompoundButton compoundButton = (CompoundButton) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        asBinder(compoundButton, dialogInterface);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 49;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CompoundButton compoundButton = (CompoundButton) objArr[0];
        VideoStartReason videoStartReason = (VideoStartReason) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 3;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(compoundButton, videoStartReason, dialogInterface);
        }
        IAuthTabCallback(compoundButton, videoStartReason, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CompoundButton compoundButton, boolean z, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(compoundButton, z, dialogInterface);
        int i4 = access000 + 93;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountNotificationBankAccountsActivity, th);
        int i4 = access000 + 67;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(accountNotificationBankAccountsActivity, videoStartReason, compoundButton, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallbackWithResult(accountNotificationBankAccountsActivity, videoStartReason, compoundButton, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 111;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(accountNotificationBankAccountsActivity, videoStartReason, setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(accountNotificationBankAccountsActivity, videoStartReason, setDetectableSize);
        int i3 = access000 + 33;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, deserializeurinullablecollection}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 127096324, -127096324, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        }
        Unit unit = (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, deserializeurinullablecollection}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 127096324, -127096324, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        int i3 = 45 / 0;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(compoundButton, dialogInterface);
        int i4 = access100 + 91;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return 1007953L;
    }

    public static final class onNavigationEvent implements Function0<UST_UTIL_HPPTDownloadFile> {
        final /* synthetic */ Activity onNavigationEvent;

        public onNavigationEvent(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final UST_UTIL_HPPTDownloadFile invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return UST_UTIL_HPPTDownloadFile.onNavigationEvent(layoutInflater);
        }
    }

    public static final class IAuthTabCallback extends exitAllPages<VideoStartReason> {

        public static final class onWarmupCompleted implements Function1<Object, Boolean> {
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof VideoStartReason);
            }
        }

        IAuthTabCallback(final AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity$adapter$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationBankAccountsActivity.IAuthTabCallback.onExtraCallback(accountNotificationBankAccountsActivity, (AppMsgReceiver2) obj, (VideoStartReason) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(onWarmupCompleted.onWarmupCompleted);
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        }

        public static Unit onExtraCallback(final AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, AppMsgReceiver2 appMsgReceiver2, final VideoStartReason videoStartReason) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(videoStartReason, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View instanceof TdsListRowV1View ? tdsListRowV1View : null;
            if (tdsListRowV1View2 != null) {
                tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext()).onExtraCallback(AccountNotificationBankAccountsActivity.onNavigationEvent(accountNotificationBankAccountsActivity).getInterfaceDescriptor()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(88.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)}));
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
                tdsListRowV1View2.setCenterText1(videoStartReason.onExtraCallback());
                tdsListRowV1View2.setCenterText2(AccountNotificationBankAccountsActivity.onNavigationEvent(accountNotificationBankAccountsActivity).access000() + " " + videoStartReason.onWarmupCompleted());
                tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.SWITCH);
                TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View2, videoStartReason.access100() == AdComponentViewParentApi.onExtraCallback.SUBSCRIBE, false, 2, (Object) null);
                TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                if (tdsSwitchV1View != null) {
                    tdsSwitchV1View.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity$adapter$1$$ExternalSyntheticLambda0
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            AccountNotificationBankAccountsActivity.IAuthTabCallback.IAuthTabCallback(videoStartReason, accountNotificationBankAccountsActivity, compoundButton, z);
                        }
                    });
                }
                String strOnExtraCallback = AccountNotificationBankAccountsActivity.onExtraCallback(accountNotificationBankAccountsActivity);
                if (strOnExtraCallback != null && !StringsKt.isBlank(strOnExtraCallback) && Intrinsics.areEqual(videoStartReason.onWarmupCompleted(), AccountNotificationBankAccountsActivity.onExtraCallback(accountNotificationBankAccountsActivity))) {
                    AccountNotificationBankAccountsActivity.onNavigationEvent(accountNotificationBankAccountsActivity, (String) null);
                    TdsSwitchV1View tdsSwitchV1View2 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    if (tdsSwitchV1View2 != null) {
                        tdsSwitchV1View2.toggle();
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static void IAuthTabCallback(VideoStartReason videoStartReason, AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            if ((videoStartReason.access100() == AdComponentViewParentApi.onExtraCallback.SUBSCRIBE) == z) {
                return;
            }
            AccountNotificationBankAccountsActivity.onNavigationEvent(accountNotificationBankAccountsActivity, compoundButton, z, videoStartReason);
        }
    }

    public static final /* synthetic */ String onExtraCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = accountNotificationBankAccountsActivity.IAuthTabCallbackStub;
        int i5 = i3 + 63;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ checkNavigationBarBySystemProperties onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 9;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = accountNotificationBankAccountsActivity.onTransact;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 93;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return checknavigationbarbysystemproperties;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, VideoStartReason videoStartReason) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationBankAccountsActivity.onExtraCallbackWithResult(compoundButton, z, videoStartReason);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, String str) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 31;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        accountNotificationBankAccountsActivity.IAuthTabCallbackStub = str;
        int i5 = i2 + 31;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        access000 = i2 % 128;
        Map<String, Object> mapIAuthTabCallback = i2 % 2 == 0 ? access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("account_vendor", this.onTransact.IAuthTabCallbackStubProxy())}) : access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("account_vendor", this.onTransact.IAuthTabCallbackStubProxy())});
        int i3 = access000 + 89;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        throw null;
    }

    private final UST_UTIL_HPPTDownloadFile onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.getInterfaceDescriptor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        UST_UTIL_HPPTDownloadFile uST_UTIL_HPPTDownloadFile = (UST_UTIL_HPPTDownloadFile) value;
        int i4 = access000 + 57;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return uST_UTIL_HPPTDownloadFile;
    }

    private final Toolbar updateVisuals() {
        int i = 2 % 2;
        int i2 = access000 + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Toolbar toolbar = onNavigationEvent().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        int i4 = access000 + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return toolbar;
    }

    private final RecyclerView setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = onNavigationEvent().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        int i4 = access100 + 27;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return recyclerView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final SwipeRefreshLayout ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 97;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        SwipeRefreshLayout swipeRefreshLayout = onNavigationEvent().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "");
        int i4 = access000 + 69;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return swipeRefreshLayout;
        }
        throw null;
    }

    private final ConstraintLayout validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = onNavigationEvent().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i4 = access000 + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(onNavigationEvent().getRoot());
        ConstraintLayout root = onNavigationEvent().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, onNavigationEvent().IAuthTabCallback, (View) null, (View) null, false, 14, (Object) null);
        IAuthTabCallback(getIntent());
        ICustomTabsServiceStub();
        access200();
        int i4 = access100 + 107;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 25;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            IAuthTabCallback(intent);
            ICustomTabsServiceStub();
            access200();
            return;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        IAuthTabCallback(intent);
        ICustomTabsServiceStub();
        access200();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        boolean zOnCreateOptionsMenu = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        int i4 = access100 + 53;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnCreateOptionsMenu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = access100 + 33;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            menuItem.getItemId();
            int i3 = R.id.action_setting;
            throw null;
        }
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != R.id.action_setting) {
            return super.onOptionsItemSelected(menuItem);
        }
        AccountNotificationSettingActivity.onWarmupCompleted onwarmupcompleted = AccountNotificationSettingActivity.Companion;
        Integer num = this.asInterface;
        if (num != null) {
            int i4 = access000 + 99;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        startActivityForResult(onwarmupcompleted.IAuthTabCallback(this, iIntValue, this.IAuthTabCallbackDefault.onExtraCallbackWithResult()), 107);
        int i6 = access000 + 47;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = access100 + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            int i6 = access000 + 59;
            access100 = i6 % 128;
            if (i6 % 2 == 0 ? i == 107 : i == 114) {
                setResult(-1);
                finish();
            }
        }
        int i7 = access100 + 113;
        access000 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(android.content.Intent r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100
            int r2 = r1 + 49
            int r3 = r2 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000 = r3
            int r2 = r2 % r0
            java.lang.String r2 = "accountNo"
            r3 = 0
            if (r7 == 0) goto L1e
            int r1 = r1 + 39
            int r4 = r1 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000 = r4
            int r1 = r1 % r0
            java.lang.String r1 = r7.getStringExtra(r2)
            if (r1 != 0) goto L51
        L1e:
            if (r7 == 0) goto L43
            int r1 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000
            int r1 = r1 + 55
            int r4 = r1 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100 = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L3f
            android.net.Uri r1 = r7.getData()
            if (r1 == 0) goto L43
            int r4 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000
            int r4 = r4 + 51
            int r5 = r4 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100 = r5
            int r4 = r4 % r0
            java.lang.String r1 = r1.getQueryParameter(r2)
            goto L51
        L3f:
            r7.getData()
            throw r3
        L43:
            int r1 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L50
            r1 = 4
            int r1 = r1 / r1
        L50:
            r1 = r3
        L51:
            r6.IAuthTabCallbackStub = r1
            java.lang.String r1 = "bankCode"
            if (r7 == 0) goto L86
            int r2 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100
            int r2 = r2 + 1
            int r4 = r2 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000 = r4
            int r2 = r2 % r0
            r4 = 0
            if (r2 != 0) goto L72
            int r2 = r7.getIntExtra(r1, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r4 = r2.intValue()
            if (r4 > 0) goto L81
            goto L80
        L72:
            int r2 = r7.getIntExtra(r1, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r4 = r2.intValue()
            if (r4 > 0) goto L81
        L80:
            r2 = r3
        L81:
            if (r2 != 0) goto L84
            goto L86
        L84:
            r3 = r2
            goto Lb1
        L86:
            if (r7 == 0) goto Lb1
            android.net.Uri r7 = r7.getData()
            if (r7 == 0) goto Lb1
            int r2 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000
            int r2 = r2 + 67
            int r4 = r2 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100 = r4
            int r2 = r2 % r0
            java.lang.String r7 = r7.getQueryParameter(r1)
            if (r7 == 0) goto Lb1
            int r1 = viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access100
            int r1 = r1 + 105
            int r2 = r1 % 128
            viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.access000 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lad
            java.lang.Integer r3 = kotlin.text.StringsKt.toIntOrNull(r7)
            goto Lb1
        Lad:
            kotlin.text.StringsKt.toIntOrNull(r7)
            throw r3
        Lb1:
            r6.asInterface = r3
            o.send$onWarmupCompleted r7 = o.send.Companion
            o.send r7 = r7.onWarmupCompleted()
            java.lang.Integer r0 = r6.asInterface
            java.lang.String r0 = java.lang.String.valueOf(r0)
            o.checkNavigationBarBySystemProperties r7 = r7.onExtraCallback(r0)
            if (r7 != 0) goto Lcb
            o.checkNavigationBarBySystemProperties$onNavigationEvent r7 = o.checkNavigationBarBySystemProperties.Companion
            o.checkNavigationBarBySystemProperties r7 = r7.IAuthTabCallback()
        Lcb:
            r6.onTransact = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.IAuthTabCallback(android.content.Intent):void");
    }

    private static final void IAuthTabCallbackDefault(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationBankAccountsActivity.access200();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() {
        String string;
        int i = 2 % 2;
        int i2 = access000 + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setSupportActionBar(updateVisuals());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i4 = access100 + 63;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                supportActionBar.onNavigationEvent(true);
                string = getString(R.string.app_account_notification___ac9280d515, this.onTransact.IAuthTabCallbackStubProxy());
            } else {
                supportActionBar.onNavigationEvent(true);
                string = getString(R.string.app_account_notification___ac9280d515, this.onTransact.IAuthTabCallbackStubProxy());
            }
            supportActionBar.onExtraCallbackWithResult(string);
        }
        ICustomTabsServiceDefault().setOnRefreshListener(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda0(this));
        setEngagementSignalsCallback().setAdapter(this.IAuthTabCallbackDefault);
    }

    private static final Unit IAuthTabCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationBankAccountsActivity.ICustomTabsServiceDefault().setRefreshing(true);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 5;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 91;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static final void asBinder(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationBankAccountsActivity.ICustomTabsServiceDefault().setRefreshing(false);
        int i4 = access100 + 23;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void access200() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 47;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (this.asInterface == null) {
            int i5 = i3 + 33;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf((CharSequence) "", '0') + 23, Process.getGidForName("") + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.red(0) + 22, 24734 - (ViewConfiguration.getLongPressTimeout() >> 16), -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            BidderTokenProvider bidderTokenProvider = (BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null);
            Integer num = this.asInterface;
            Intrinsics.checkNotNull(num);
            writeRaw<BaseApiResponse<List<VideoStartReason>>> writerawOnNavigationEvent = bidderTokenProvider.onNavigationEvent(new onRewardServerSuccess(num.intValue()));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writerawIAuthTabCallback.onExtraCallback(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda9(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda8(this))).onWarmupCompleted(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda10(this)).onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda12(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda11(this)), new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda14(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda13(this)));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access000 + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, List list) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = accountNotificationBankAccountsActivity.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(list);
        iAuthTabCallback.onExtraCallbackWithResult(list, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationBankAccountsActivity::loadData", th);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, accountNotificationBankAccountsActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 123;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = access000 + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_vendor", accountNotificationBankAccountsActivity.onTransact.IAuthTabCallbackStubProxy());
        String strOnExtraCallback = videoStartReason.onExtraCallback();
        if (strOnExtraCallback == null) {
            strOnExtraCallback = "";
        }
        setDetectableSize.onExtraCallback("account_name", strOnExtraCallback);
        if (!((Boolean) AdComponentViewParentApi.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1753314558, 1753314559, new Object[]{videoStartReason})).booleanValue()) {
            str = "account_notice_apply";
        } else {
            int i4 = access100 + 123;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            str = "account_register";
        }
        Object[] objArr = new Object[1];
        a(Process.getGidForName("") + 7, 1 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{65529, 65527, 4, 5, 65535, '\n'}, true, 268 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i6 = access000 + 19;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_vendor", accountNotificationBankAccountsActivity.onTransact.IAuthTabCallbackStubProxy());
        String strOnExtraCallback = videoStartReason.onExtraCallback();
        if (strOnExtraCallback == null) {
            int i4 = access100 + 33;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = strOnExtraCallback;
        }
        setDetectableSize.onExtraCallback("account_name", str);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        String strOnExtraCallback = videoStartReason.onExtraCallback();
        setDetectableSize.onExtraCallback("account_name", strOnExtraCallback != null ? strOnExtraCallback : "");
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(CompoundButton compoundButton, boolean z, VideoStartReason videoStartReason) {
        int i = 2 % 2;
        if (z) {
            ConvertByteArrayToFloatArray.onExtraCallback(1007955L, false, (String) null, (Map) null, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda28(this, videoStartReason), 14, (Object) null);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1007957L, false, (String) null, (Map) null, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda29(this, videoStartReason), 14, (Object) null);
        }
        AdComponentViewParentApi.onExtraCallback onextracallbackAccess100 = videoStartReason.access100();
        int i2 = onextracallbackAccess100 == null ? -1 : onExtraCallbackWithResult.onExtraCallback[onextracallbackAccess100.ordinal()];
        if (i2 == 1) {
            ConvertByteArrayToFloatArray.onExtraCallback(1008367L, false, (String) null, (Map) null, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda30(videoStartReason), 14, (Object) null);
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda31(this, videoStartReason, compoundButton, z));
            return;
        }
        if (i2 == 2) {
            if (!((Boolean) AdComponentViewParentApi.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1753314558, 1753314559, new Object[]{videoStartReason})).booleanValue()) {
                onWarmupCompleted(compoundButton, z, videoStartReason);
                Unit unit = Unit.INSTANCE;
                return;
            }
            ConvertByteArrayToFloatArray.onExtraCallback(1008169L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda32(this, videoStartReason, compoundButton));
            int i3 = access000 + 9;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 78 / 0;
                return;
            }
            return;
        }
        int i5 = access000 + 57;
        int i6 = i5 % 128;
        access100 = i6;
        int i7 = i5 % 2;
        if (i2 == 3) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda33(this, compoundButton));
            return;
        }
        int i8 = i6 + 69;
        access000 = i8 % 128;
        if (i8 % 2 != 0 ? i2 == 4 : i2 == 4) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda34(this, compoundButton));
            int i9 = access100 + 83;
            access000 = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 != 5) {
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda35(this, compoundButton));
        int i10 = access000 + 89;
        access100 = i10 % 128;
        int i11 = i10 % 2;
    }

    private static final Unit onExtraCallbackWithResult(VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        String strOnExtraCallback = videoStartReason.onExtraCallback();
        if (strOnExtraCallback == null) {
            int i4 = access100 + 97;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = strOnExtraCallback;
        }
        setDetectableSize.onExtraCallback("account_name", str);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CompoundButton compoundButton, VideoStartReason videoStartReason, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1008371L, false, (String) null, (Map) null, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda6(videoStartReason), 14, (Object) null);
        compoundButton.toggle();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 61;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        String strOnExtraCallback = videoStartReason.onExtraCallback();
        if (strOnExtraCallback == null) {
            int i2 = access100 + 69;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 4;
            }
        } else {
            str = strOnExtraCallback;
        }
        setDetectableSize.onExtraCallback("account_name", str);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, VideoStartReason videoStartReason, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1008369L, false, (String) null, (Map) null, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda15(videoStartReason), 14, (Object) null);
        accountNotificationBankAccountsActivity.onWarmupCompleted(compoundButton, z, videoStartReason);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackStub(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        compoundButton.toggle();
        int i4 = access100 + 17;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, CompoundButton compoundButton, boolean z, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___c89cd65bb7));
        StringBuilder sb = new StringBuilder();
        String strOnExtraCallback = videoStartReason.onExtraCallback();
        if (strOnExtraCallback != null) {
            int i2 = access000 + 31;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                strOnExtraCallback.length();
                throw null;
            }
            if (strOnExtraCallback.length() != 0) {
                sb.append(videoStartReason.onExtraCallback() + "\n");
            }
        }
        sb.append(accountNotificationBankAccountsActivity.onTransact.access000() + " " + videoStartReason.onWarmupCompleted());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(sb.toString());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda16(compoundButton, videoStartReason))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___59e60d6aaa);
        Intrinsics.checkNotNullExpressionValue(string, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda17(accountNotificationBankAccountsActivity, compoundButton, z, videoStartReason), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda18(compoundButton));
        Unit unit = Unit.INSTANCE;
        int i3 = access000 + 105;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1008173L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(VideoStartReason videoStartReason, AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1008171L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        DERConstructedSet dERConstructedSet = DERConstructedSet.onNavigationEvent;
        int iOnExtraCallbackWithResult = videoStartReason.onExtraCallbackWithResult();
        Integer num = accountNotificationBankAccountsActivity.asInterface;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(47 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65535, '\f', '\t', 65505, '\r', 2, 3, 65499, 17, 19, 14, 3, 16, 18, '\r', 17, 17, 65496, 65485, 65485, 65535, 1, 1, '\r', 19, '\f', 18, 65485, '\f', '\r', 18, 7, 4, 7, 1, 65535, 18, 7, '\r', '\f', 65485, 0, 65535, '\f', '\t', 65501, 0}, false, (ViewConfiguration.getTouchSlop() >> 8) + 260, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(num);
        DERConstructedSet.onExtraCallback(dERConstructedSet, accountNotificationBankAccountsActivity, String.valueOf(iOnExtraCallbackWithResult), null, null, null, "accountNotificationBankAccount", null, null, null, sb.toString(), false, "accountNotificationBankAccount", false, null, null, 30172, null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 59;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallbackDefault(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        compoundButton.toggle();
        int i4 = access100 + 25;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___78e6958038, accountNotificationBankAccountsActivity.onTransact.IAuthTabCallbackStubProxy()));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___c7c7d3fcfb));
        String string = accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___6021bfc69c);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda3(), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = accountNotificationBankAccountsActivity.getString(R.string.connect);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda4(videoStartReason, accountNotificationBankAccountsActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda5(compoundButton));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 39;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CompoundButton compoundButton = (CompoundButton) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        compoundButton.toggle();
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = access000 + 31;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___c78da78d6f));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___1ac95bee5d));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda1(compoundButton));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onTransact(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        compoundButton.toggle();
        int i4 = access100 + 73;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___29ff5c689b));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda2(compoundButton));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 105;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return unit;
    }

    private static final void asBinder(CompoundButton compoundButton, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        compoundButton.toggle();
        int i4 = access100 + 49;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___5c3c901907));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda7(compoundButton));
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = access100 + 7;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity = (AccountNotificationBankAccountsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        accountNotificationBankAccountsActivity.ICustomTabsServiceDefault().setRefreshing(true);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 7;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        accountNotificationBankAccountsActivity.ICustomTabsServiceDefault().setRefreshing(i2 % 2 == 0);
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 47;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(CompoundButton compoundButton, boolean z, VideoStartReason videoStartReason) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = access000 + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ASN1ObjectParser aSN1ObjectParser = ASN1ObjectParser.IAuthTabCallback;
        Integer num = this.asInterface;
        if (num != null) {
            iIntValue = num.intValue();
            int i4 = access100 + 21;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iIntValue = 0;
        }
        String strOnWarmupCompleted = videoStartReason.onWarmupCompleted();
        if (strOnWarmupCompleted == null) {
            int i6 = access000 + 103;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            strOnWarmupCompleted = "";
        }
        aSN1ObjectParser.IAuthTabCallback(z, iIntValue, strOnWarmupCompleted).onExtraCallback(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda21(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda20(this))).onWarmupCompleted(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda22(this)).onNavigationEvent(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda24(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda23(this, compoundButton, z)), new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda26(new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda25(this, compoundButton, z)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, attachAdComponentViewApi attachadcomponentviewapi, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        String strJoinToString$default;
        int i = 2 % 2;
        int i2 = access000 + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___841c460d90));
        List<VideoStartReason> listOnExtraCallbackWithResult = attachadcomponentviewapi.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listOnExtraCallbackWithResult.iterator();
            while (!(!it.hasNext())) {
                int i4 = access100 + 57;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                String strAsBinder = ((VideoStartReason) it.next()).asBinder();
                if (strAsBinder != null) {
                    arrayList.add(strAsBinder);
                }
            }
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        } else {
            strJoinToString$default = null;
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(strJoinToString$default);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Activity, android.content.Context, viva.republica.toss.account.notification.AccountNotificationBankAccountsActivity] */
    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        ?? r0 = (AccountNotificationBankAccountsActivity) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) objArr[3];
        int i = 2 % 2;
        int i2 = access100 + 61;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!Intrinsics.areEqual(attachadcomponentviewapi.onWarmupCompleted(), Boolean.TRUE)) {
                compoundButton.setChecked(true ^ zBooleanValue);
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r0, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda19((AccountNotificationBankAccountsActivity) r0, attachadcomponentviewapi));
                int i3 = access000 + 121;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = access100 + 89;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    r0.setResult(-1);
                    r0.access200();
                } else {
                    r0.setResult(-1);
                    r0.access200();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
        Intrinsics.areEqual(attachadcomponentviewapi.onWarmupCompleted(), Boolean.TRUE);
        throw null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CompoundButton compoundButton, boolean z, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        access100 = i2 % 128;
        compoundButton.setChecked(i2 % 2 != 0 ? !z : !z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationBankAccountsActivity::setSubscription", th);
            if ((th instanceof TossApiCallException.ApiError) && Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "IE0001")) {
                ConstraintLayout constraintLayoutValidateRelationship = accountNotificationBankAccountsActivity.validateRelationship();
                String string = accountNotificationBankAccountsActivity.getString(R.string.app_account_notification___a0f7764bc7, accountNotificationBankAccountsActivity.onTransact.IAuthTabCallbackStubProxy());
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(constraintLayoutValidateRelationship, string), im.toss.core.R.drawable.icn_attention_color, 0, 2, (Object) null).onNavigationEvent();
                compoundButton.setChecked(!z);
            } else {
                Intrinsics.checkNotNull(th);
                getParamImp.onWarmupCompleted(th, accountNotificationBankAccountsActivity, false, (initMiniApp) null, (Function0) null, new AccountNotificationBankAccountsActivity$.ExternalSyntheticLambda27(compoundButton, z), 14, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = access100 + 37;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationBankAccountsActivity::setSubscription", th);
        boolean z2 = th instanceof TossApiCallException.ApiError;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onExtraCallbackWithResult(onExtraCallback onextracallback, Context context, int i, String str, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            return onextracallback.onExtraCallback(context, i, str);
        }

        public final Intent onExtraCallback(@NotNull Context context, int i, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) AccountNotificationBankAccountsActivity.class);
            intent.putExtra("bankCode", i);
            if (str != null) {
                intent.putExtra("accountNo", str);
            }
            return intent;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, deserializeurinullablecollection}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1900869228, -1900869213, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(CompoundButton compoundButton, VideoStartReason videoStartReason, DialogInterface dialogInterface) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{compoundButton, videoStartReason, dialogInterface}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1070953453, 1070953457, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, List list) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, list}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -432459632, 432459643, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{videoStartReason, setDetectableSize}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1976061764, 1976061769, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, compoundButton, commonModule_setLeftEdgeTouchEnabled}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 712396459, -712396450, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, attachAdComponentViewApi attachadcomponentviewapi, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, attachadcomponentviewapi, commonModule_setLeftEdgeTouchEnabled}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1874245288, -1874245282, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, videoStartReason, setDetectableSize}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 375668096, -375668086, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, VideoStartReason videoStartReason, CompoundButton compoundButton, boolean z, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, videoStartReason, compoundButton, Boolean.valueOf(z), commonModule_setLeftEdgeTouchEnabled}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 73329697, -73329694, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    private static final void asInterface(CompoundButton compoundButton, DialogInterface dialogInterface) {
        onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{compoundButton, dialogInterface}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 243641209, -243641208, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, deserializeurinullablecollection}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 127096324, -127096324, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(AccountNotificationBankAccountsActivity accountNotificationBankAccountsActivity, CompoundButton compoundButton, boolean z, attachAdComponentViewApi attachadcomponentviewapi) {
        return (Unit) onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountNotificationBankAccountsActivity, compoundButton, Boolean.valueOf(z), attachadcomponentviewapi}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1939035305, 1939035313, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 89;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = access000 + 95;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 93;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback_Parcel = 478309003;
    }
}
