package viva.republica.toss.send.dutch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.contacts.library.realm.model.StoredContact;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.textField.TextField;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_MakePKCS9AuthAttributes;
import o.ConvertByteArrayToFloatArray;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.H5TinyPopMenu;
import o.H5TinyPopMenuTitleBarTheme;
import o.IPostMessageServiceStubProxy;
import o.JavaScriptContextHolder;
import o.JsonReaderUnknownNumberParsing;
import o.JsonWriterHelper;
import o.M_;
import o.NestfgetmLifecycleEventListeners;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.VideoConfig;
import o.access502;
import o.accessgetReactApplicationContextIfActiveOrWarn;
import o.accesssetEnqueuedAnimationOnFramep;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.enableAccessibilityOrder;
import o.enableAndroidTextMeasurementOptimizations;
import o.exitAllPages;
import o.getCodeNameBytes;
import o.getDummyAd;
import o.getIconPaddingLeft;
import o.getLastTrimMemoryLevel;
import o.getMediationService;
import o.isHighTextContrastEnabled;
import o.onSwitchToDarkTheme;
import o.setH5MenuList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.model.common.ReceivableExtKt;
import viva.republica.toss.send.dutch.TransferDutchInviteActivity;
import viva.republica.toss.send.dutch.TransferDutchInviteActivity$;
import viva.republica.toss.send.v3.view.TouchRecyclerView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferDutchInviteActivity extends Hilt_TransferDutchInviteActivity implements JavaScriptContextHolder {
    public static final IAuthTabCallback Companion;
    private static long access000;
    private static char access100;
    private static int extraCallbackWithResult;
    private static int getInterfaceDescriptor;
    public static final int onTransact;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private static final byte[] $$a = {96, -37, -4, -26};
    private static final int $$b = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStub(this));
    private final ArrayList<Object> IAuthTabCallbackStubProxy = new ArrayList<>();
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda12
        public final Object invoke() {
            return TransferDutchInviteActivity.onExtraCallbackWithResult(this.f$0);
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda13
        public final Object invoke() {
            return TransferDutchInviteActivity.onWarmupCompleted(this.f$0);
        }
    });
    private final SessionTrackera IAuthTabCallbackDefault = setH5MenuList.onWarmupCompleted(this, new Function0() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda14
        public final Object invoke() {
            return TransferDutchInviteActivity.onExtraCallback(this.f$0);
        }
    }, (Function1) null, 2, (Object) null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.$$a
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 + 4
            int r8 = r8 + 109
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchInviteActivity.$$c(short, byte, byte):java.lang.String");
    }

    static {
        extraCallbackWithResult = 0;
        setEngagementSignalsCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        onTransact = 8;
        int i = extraCallback + 35;
        extraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ List IAuthTabCallback(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = onNavigationEvent(list);
        int i4 = ICustomTabsCallback + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return listOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(transferDutchInviteActivity);
        int i4 = ICustomTabsCallback + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(transferDutchInviteActivity, charSequence);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(transferDutchInviteActivity, charSequence);
        int i3 = IAuthTabCallback_Parcel + 83;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, 139044516, iOnNavigationEvent3, -139044506);
        int i4 = ICustomTabsCallback + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ List IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(function1, obj);
            throw null;
        }
        List listIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i3 = IAuthTabCallback_Parcel + 81;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        return listIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, -259084374, iOnNavigationEvent3, 259084376);
            return;
        }
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent5 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent6 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent4, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent5, new Object[]{function1, obj}, -259084374, iOnNavigationEvent6, 259084376);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Activity onExtraCallback(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Activity activityOnNavigationEvent = onNavigationEvent(transferDutchInviteActivity);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = ICustomTabsCallback + 101;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return activityOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(TransferDutchInviteActivity transferDutchInviteActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(transferDutchInviteActivity, view);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [android.content.Context, java.lang.Object, viva.republica.toss.send.dutch.TransferDutchInviteActivity] */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = i6 | i9;
        int i11 = ~i6;
        int i12 = i9 | (~(i11 | i4));
        int i13 = (~(i | i7 | i6)) | (~(i8 | i11 | i7));
        int i14 = i4 + i6 + i3 + ((-619979367) * i5) + (68302741 * i2);
        int i15 = i14 * i14;
        int i16 = (i4 * 561304900) + 382271488 + (561304900 * i6) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i3) + (1615200256 * i5) + ((-1821507584) * i2) + (428933120 * i15);
        int i17 = ((i4 * (-96142684)) - 56799437) + (i6 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i3 * (-96141863)) + (i5 * (-1380774991)) + (i2 * (-1175232947)) + (i15 * (-118947840));
        switch (i16 + (i17 * i17 * (-1369505792))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                TransferDutchInviteActivity transferDutchInviteActivity = (TransferDutchInviteActivity) objArr[0];
                List list = (List) objArr[1];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback + 7;
                IAuthTabCallback_Parcel = i19 % 128;
                int i20 = i19 % 2;
                Unit unit = (Unit) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{transferDutchInviteActivity, list}, -1484734813, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1484734816);
                int i21 = IAuthTabCallback_Parcel + 41;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 8:
                final ?? r9 = (TransferDutchInviteActivity) objArr[0];
                int i23 = 2 % 2;
                CMS_MakePKCS9AuthAttributes cMS_MakePKCS9AuthAttributesValidateRelationship = r9.validateRelationship();
                cMS_MakePKCS9AuthAttributesValidateRelationship.asBinder.setLayoutManager(new LinearLayoutManager((Context) r9, 0, false));
                RecyclerView recyclerView = cMS_MakePKCS9AuthAttributesValidateRelationship.asBinder;
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{r9}, -1730244336, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1730244345);
                onwarmupcompleted.onNavigationEvent(((TransferDutchInviteActivity) r9).IAuthTabCallbackStubProxy);
                recyclerView.setAdapter(onwarmupcompleted);
                cMS_MakePKCS9AuthAttributesValidateRelationship.onExtraCallbackWithResult.setCallback(new onTransact(cMS_MakePKCS9AuthAttributesValidateRelationship));
                cMS_MakePKCS9AuthAttributesValidateRelationship.onExtraCallbackWithResult.setAdapter((JsonWriterHelper) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{r9}, -1960166587, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1960166598));
                TdsButtonV1View tdsButtonV1ViewAsInterface = cMS_MakePKCS9AuthAttributesValidateRelationship.onWarmupCompleted.asInterface();
                tdsButtonV1ViewAsInterface.setEnabled(false);
                tdsButtonV1ViewAsInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws Throwable {
                        TransferDutchInviteActivity.onExtraCallbackWithResult(this.f$0, view);
                    }
                });
                cMS_MakePKCS9AuthAttributesValidateRelationship.asInterface.asInterface().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda22
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TransferDutchInviteActivity.onExtraCallback(this.f$0, view);
                    }
                });
                int i24 = ICustomTabsCallback + 51;
                IAuthTabCallback_Parcel = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TransferDutchInviteActivity transferDutchInviteActivity = (TransferDutchInviteActivity) objArr[0];
        H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback = (H5TinyPopMenuTitleBarTheme.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {transferDutchInviteActivity, onextracallback};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        if (i3 != 0) {
            ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent, iOnNavigationEvent4, iOnNavigationEvent2, objArr2, -1115186669, iOnNavigationEvent3, 1115186670)).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent, iOnNavigationEvent4, iOnNavigationEvent2, objArr2, -1115186669, iOnNavigationEvent3, 1115186670)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 85;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferDutchInviteActivity transferDutchInviteActivity, CharSequence charSequence, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(transferDutchInviteActivity, charSequence, str);
        }
        IAuthTabCallback(transferDutchInviteActivity, charSequence, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferDutchInviteActivity transferDutchInviteActivity, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(transferDutchInviteActivity, onextracallbackwithresult);
        int i4 = ICustomTabsCallback + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ onWarmupCompleted onExtraCallbackWithResult(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompletedOnTransact = onTransact(transferDutchInviteActivity);
        int i4 = IAuthTabCallback_Parcel + 1;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TransferDutchInviteActivity transferDutchInviteActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(transferDutchInviteActivity, view);
        int i4 = ICustomTabsCallback + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(TransferDutchInviteActivity transferDutchInviteActivity, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(transferDutchInviteActivity, obj);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = ICustomTabsCallback + 125;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Activity onNavigationEvent(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = i3 + 43;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return transferDutchInviteActivity;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferDutchInviteActivity transferDutchInviteActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(transferDutchInviteActivity, onextracallback);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferDutchInviteActivity, onextracallback);
        int i3 = IAuthTabCallback_Parcel + 9;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferDutchInviteActivity transferDutchInviteActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(transferDutchInviteActivity, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 67;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject(function1, obj);
            throw null;
        }
        boolean typedObject = readTypedObject(function1, obj);
        int i3 = ICustomTabsCallback + 75;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    public static /* synthetic */ List onWarmupCompleted(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallbackWithResult = onExtraCallbackWithResult(list);
        int i4 = IAuthTabCallback_Parcel + 31;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            access000(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        List listAccess000 = access000(function1, obj);
        int i3 = IAuthTabCallback_Parcel + 17;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return listAccess000;
    }

    public static /* synthetic */ JsonWriterHelper onWarmupCompleted(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        JsonWriterHelper jsonWriterHelperAsInterface = asInterface(transferDutchInviteActivity);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = ICustomTabsCallback + 81;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonWriterHelperAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(TransferDutchInviteActivity transferDutchInviteActivity, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(transferDutchInviteActivity, obj);
        int i4 = IAuthTabCallback_Parcel + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return 1001580L;
    }

    public static final class IAuthTabCallbackStub implements Function0<CMS_MakePKCS9AuthAttributes> {
        final /* synthetic */ Activity onWarmupCompleted;

        public IAuthTabCallbackStub(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CMS_MakePKCS9AuthAttributes invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_MakePKCS9AuthAttributes.onExtraCallbackWithResult(layoutInflater);
        }
    }

    final class onWarmupCompleted extends exitAllPages<Object> {

        public static final class IAuthTabCallback implements Function1<Object, Boolean> {
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
            }
        }

        /* renamed from: viva.republica.toss.send.dutch.TransferDutchInviteActivity$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0034onWarmupCompleted implements Function1<Object, Boolean> {
            public static final C0034onWarmupCompleted onWarmupCompleted = new C0034onWarmupCompleted();

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onSwitchToDarkTheme);
            }
        }

        public onWarmupCompleted() {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            int i = R.layout.item_selected_dutch_receiver;
            onextracallbackwithresult.onWarmupCompleted(i);
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$SelectedInviteAdapter$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return TransferDutchInviteActivity.onWarmupCompleted.onWarmupCompleted(transferDutchInviteActivity, (AppMsgReceiver2) obj, (TransferDutchInviteActivity.onExtraCallbackWithResult) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(IAuthTabCallback.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult2.onWarmupCompleted(i);
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$SelectedInviteAdapter$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return TransferDutchInviteActivity.onWarmupCompleted.onExtraCallback(transferDutchInviteActivity, (AppMsgReceiver2) obj, (onSwitchToDarkTheme) obj2);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(C0034onWarmupCompleted.onWarmupCompleted);
            }
            onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Unit onWarmupCompleted(TransferDutchInviteActivity transferDutchInviteActivity, AppMsgReceiver2 appMsgReceiver2, onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i = R.id.thumb;
            TdsImageView tdsImageViewFindViewById = (TdsImageView) appMsgReceiver2.onWarmupCompleted().get(i);
            if (tdsImageViewFindViewById == null) {
                tdsImageViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
                if (tdsImageViewFindViewById != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i, tdsImageViewFindViewById);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i);
                }
            }
            TdsImageView tdsImageView = tdsImageViewFindViewById;
            if (tdsImageView != null) {
                Context context = tdsImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                getMediationService getmediationservice = new getMediationService(context);
                Long longOrNull = StringsKt.toLongOrNull(PlayerErrorCode.onMinimized());
                TdsImageView.setImage$default(tdsImageView, getMediationService.onExtraCallback(getmediationservice.onNavigationEvent(longOrNull != null ? longOrNull.longValue() : -1L), null, 1, null), (Function1) null, (Function1) null, 6, (Object) null);
            }
            int i2 = R.id.name;
            TextView textView = (TextView) appMsgReceiver2.onWarmupCompleted().get(i2);
            if (textView == null) {
                textView = (TextView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
                if (textView != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i2, textView);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i2);
                }
            }
            if (textView != null) {
                textView.setText(transferDutchInviteActivity.getString(R.string.app_send_dutch___811e029344));
            }
            int i3 = R.id.remove_bg;
            View viewFindViewById = (View) appMsgReceiver2.onWarmupCompleted().get(i3);
            if (viewFindViewById == null) {
                viewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i3);
                if (viewFindViewById != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i3, viewFindViewById);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i3);
                }
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            int i4 = R.id.remove;
            View viewFindViewById2 = (View) appMsgReceiver2.onWarmupCompleted().get(i4);
            if (viewFindViewById2 == null) {
                viewFindViewById2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i4);
                if (viewFindViewById2 != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i4, viewFindViewById2);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i4);
                }
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallback(final TransferDutchInviteActivity transferDutchInviteActivity, AppMsgReceiver2 appMsgReceiver2, final onSwitchToDarkTheme onswitchtodarktheme) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onswitchtodarktheme, "");
            CharSequence charSequenceIAuthTabCallback = ReceivableExtKt.IAuthTabCallback(onswitchtodarktheme, null, 1, null);
            int i = R.id.thumb;
            TdsImageView tdsImageView = (TdsImageView) appMsgReceiver2.onWarmupCompleted().get(i);
            if (tdsImageView == null) {
                tdsImageView = (TdsImageView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
                if (tdsImageView != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i, tdsImageView);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i);
                }
            }
            TdsImageView tdsImageView2 = tdsImageView;
            if (tdsImageView2 != null) {
                if (onswitchtodarktheme.IAuthTabCallbackStub().length() > 0) {
                    Context context = tdsImageView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    TdsImageView.setImage$default(tdsImageView2, getMediationService.onExtraCallback(new getMediationService(context).onNavigationEvent(onswitchtodarktheme.IAuthTabCallbackDefault()).onExtraCallback(onswitchtodarktheme.IAuthTabCallbackStub()), null, 1, null), (Function1) null, (Function1) null, 6, (Object) null);
                } else {
                    tdsImageView2.setImageResource(R.drawable.profile_nonmember);
                }
            }
            int i2 = R.id.name;
            TextView textView = (TextView) appMsgReceiver2.onWarmupCompleted().get(i2);
            if (textView == null) {
                textView = (TextView) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
                if (textView != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i2, textView);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i2);
                }
            }
            if (textView != null) {
                textView.setText(charSequenceIAuthTabCallback);
            }
            int i3 = R.id.remove_bg;
            View viewFindViewById = (View) appMsgReceiver2.onWarmupCompleted().get(i3);
            if (viewFindViewById == null) {
                viewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i3);
                if (viewFindViewById != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i3, viewFindViewById);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i3);
                }
            }
            int i4 = R.id.remove;
            View viewFindViewById2 = (View) appMsgReceiver2.onWarmupCompleted().get(i4);
            if (viewFindViewById2 == null) {
                viewFindViewById2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i4);
                if (viewFindViewById2 != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i4, viewFindViewById2);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i4);
                }
            }
            if (transferDutchInviteActivity.onWarmupCompleted(onswitchtodarktheme)) {
                ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$SelectedInviteAdapter$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TransferDutchInviteActivity.onWarmupCompleted.onWarmupCompleted(transferDutchInviteActivity, onswitchtodarktheme, view);
                    }
                });
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(0);
                }
            } else {
                ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.setOnClickListener(null);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(8);
                }
            }
            return Unit.INSTANCE;
        }

        public static void onWarmupCompleted(TransferDutchInviteActivity transferDutchInviteActivity, onSwitchToDarkTheme onswitchtodarktheme, View view) {
            transferDutchInviteActivity.IAuthTabCallback(onswitchtodarktheme);
            TransferDutchInviteActivity.onNavigationEvent(transferDutchInviteActivity, onswitchtodarktheme);
        }
    }

    public static final /* synthetic */ void onNavigationEvent(TransferDutchInviteActivity transferDutchInviteActivity, onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        transferDutchInviteActivity.onNavigationEvent(onswitchtodarktheme);
        int i4 = ICustomTabsCallback + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ boolean onWarmupCompleted(@Nullable onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            super.onWarmupCompleted(onswitchtodarktheme);
            throw null;
        }
        boolean zOnWarmupCompleted = super.onWarmupCompleted(onswitchtodarktheme);
        int i3 = ICustomTabsCallback + 105;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel + 67;
        viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 125;
        viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.getDummyAd IAuthTabCallback() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel
            int r2 = r1 + 57
            int r3 = r2 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L18
            o.getDummyAd r2 = r5.standardTermsV2Intent
            r4 = 51
            int r4 = r4 / 0
            if (r2 == 0) goto L2a
            goto L1c
        L18:
            o.getDummyAd r2 = r5.standardTermsV2Intent
            if (r2 == 0) goto L2a
        L1c:
            int r1 = r1 + 125
            int r4 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            return r2
        L26:
            r3.hashCode()
            throw r3
        L2a:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel
            int r1 = r1 + 67
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3b
            return r3
        L3b:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback():o.getDummyAd");
    }

    private final CMS_MakePKCS9AuthAttributes validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CMS_MakePKCS9AuthAttributes cMS_MakePKCS9AuthAttributes = (CMS_MakePKCS9AuthAttributes) this.asBinder.getValue();
        int i3 = IAuthTabCallback_Parcel + 17;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return cMS_MakePKCS9AuthAttributes;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TransferDutchInviteActivity transferDutchInviteActivity = (TransferDutchInviteActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) transferDutchInviteActivity.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 31;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return onwarmupcompleted;
    }

    private static final onWarmupCompleted onTransact(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = transferDutchInviteActivity.new onWarmupCompleted();
        int i2 = ICustomTabsCallback + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TransferDutchInviteActivity transferDutchInviteActivity = (TransferDutchInviteActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        JsonWriterHelper jsonWriterHelper = (JsonWriterHelper) transferDutchInviteActivity.asInterface.getValue();
        int i4 = IAuthTabCallback_Parcel + 89;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return jsonWriterHelper;
        }
        throw null;
    }

    private static final JsonWriterHelper asInterface(final TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        JsonWriterHelper jsonWriterHelper = new JsonWriterHelper(transferDutchInviteActivity, new Function0() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda10
            public final Object invoke() {
                return TransferDutchInviteActivity.IAuthTabCallback(this.f$0);
            }
        });
        int i2 = IAuthTabCallback_Parcel + 59;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        return jsonWriterHelper;
    }

    private static final Unit IAuthTabCallbackStub(TransferDutchInviteActivity transferDutchInviteActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            transferDutchInviteActivity.onVerticalScrollEvent();
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallback + 87;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return unit;
        }
        transferDutchInviteActivity.onVerticalScrollEvent();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 75;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return "dutch__choose_dutch_receiver";
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bb, code lost:
    
        return o.access8100.IAuthTabCallback(new kotlin.Pair[]{o.getWrite.IAuthTabCallback(((java.lang.String) r0[0]).intern(), r1)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bc, code lost:
    
        r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel + 17;
        viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
    
        r6 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback + 101;
        viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel = r6 % 128;
        r6 = r6 % 2;
        r0 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{12162, 33447, 46657, 38118, 44162, 13929, 10569, 16051}, new char[]{45631, 44488, 7450, 9525}, new char[]{29123, 21731, 12188, 13817}, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback
            int r1 = r1 + 11
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = 8
            r3 = 0
            r4 = 1
            r5 = 4
            if (r1 == 0) goto L48
            android.content.Intent r1 = r13.getIntent()
            r6 = 1
            int r6 = android.widget.ExpandableListView.getPackedPositionType(r6)
            char r7 = (char) r6
            java.lang.String r6 = ""
            int r8 = android.text.TextUtils.getTrimmedLength(r6)
            char[] r9 = new char[r2]
            r9 = {x00cc: FILL_ARRAY_DATA , data: [12162, -32089, -18879, -27418, -21374, 13929, 10569, 16051} // fill-array
            char[] r10 = new char[r5]
            r10 = {x00d8: FILL_ARRAY_DATA , data: [-19905, -21048, 7450, 9525} // fill-array
            char[] r11 = new char[r5]
            r11 = {x00e0: FILL_ARRAY_DATA , data: [29123, 21731, 12188, 13817} // fill-array
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r12 = r6
            a(r7, r8, r9, r10, r11, r12)
            r6 = r6[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.String r1 = r1.getStringExtra(r6)
            if (r1 == 0) goto Lbc
            goto L7c
        L48:
            android.content.Intent r1 = r13.getIntent()
            r6 = 0
            int r6 = android.widget.ExpandableListView.getPackedPositionType(r6)
            char r7 = (char) r6
            java.lang.String r6 = ""
            int r8 = android.text.TextUtils.getTrimmedLength(r6)
            char[] r9 = new char[r2]
            r9 = {x00e8: FILL_ARRAY_DATA , data: [12162, -32089, -18879, -27418, -21374, 13929, 10569, 16051} // fill-array
            char[] r10 = new char[r5]
            r10 = {x00f4: FILL_ARRAY_DATA , data: [-19905, -21048, 7450, 9525} // fill-array
            char[] r11 = new char[r5]
            r11 = {x00fc: FILL_ARRAY_DATA , data: [29123, 21731, 12188, 13817} // fill-array
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r12 = r6
            a(r7, r8, r9, r10, r11, r12)
            r6 = r6[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.String r1 = r1.getStringExtra(r6)
            if (r1 == 0) goto Lbc
        L7c:
            int r6 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback
            int r6 = r6 + 101
            int r7 = r6 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel = r7
            int r6 = r6 % r0
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            char r6 = (char) r0
            int r0 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r7 = r0 >> 16
            char[] r8 = new char[r2]
            r8 = {x0104: FILL_ARRAY_DATA , data: [12162, -32089, -18879, -27418, -21374, 13929, 10569, 16051} // fill-array
            char[] r9 = new char[r5]
            r9 = {x0110: FILL_ARRAY_DATA , data: [-19905, -21048, 7450, 9525} // fill-array
            char[] r10 = new char[r5]
            r10 = {x0118: FILL_ARRAY_DATA , data: [29123, 21731, 12188, 13817} // fill-array
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r11 = r0
            a(r6, r7, r8, r9, r10, r11)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            kotlin.Pair r0 = o.getWrite.IAuthTabCallback(r0, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[r4]
            r1[r3] = r0
            java.util.Map r0 = o.access8100.IAuthTabCallback(r1)
            return r0
        Lbc:
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lc9
            r0 = 0
            return r0
        Lc9:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchInviteActivity.getScreenParams():java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchInviteActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 19;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        setContentView(validateRelationship().getRoot());
        ConstraintLayout root = validateRelationship().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, validateRelationship().IAuthTabCallback, (View) null, (View) null, false, 14, (Object) null);
        this.IAuthTabCallbackStubProxy.clear();
        if (bundle != null) {
            ArrayList<Object> arrayList = this.IAuthTabCallbackStubProxy;
            List parcelableArrayList = bundle.getParcelableArrayList("state.selectedList");
            if (parcelableArrayList == null) {
                parcelableArrayList = CollectionsKt.emptyList();
                int i5 = IAuthTabCallback_Parcel + 7;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            arrayList.addAll(parcelableArrayList);
        }
        this.IAuthTabCallbackStubProxy.add(new onExtraCallbackWithResult());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i7 = ICustomTabsCallback + 105;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                supportActionBar.onNavigationEvent(false);
                i = R.string.app_send_dutch___b9e7d64551;
            } else {
                supportActionBar.onNavigationEvent(true);
                i = R.string.app_send_dutch___b9e7d64551;
            }
            supportActionBar.onExtraCallbackWithResult(getString(i));
        }
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, 781071050, iOnNavigationEvent3, -781071042);
        IEngagementSignalsCallback();
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("state.selectedList", new ArrayList<>(ICustomTabsServiceStubProxy()));
        int i2 = ICustomTabsCallback + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onTransact implements TouchRecyclerView.onExtraCallbackWithResult {
        final /* synthetic */ CMS_MakePKCS9AuthAttributes onWarmupCompleted;

        onTransact(CMS_MakePKCS9AuthAttributes cMS_MakePKCS9AuthAttributes) {
            this.onWarmupCompleted = cMS_MakePKCS9AuthAttributes;
        }

        public void IAuthTabCallback() {
            if (this.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallback().hasFocus()) {
                M_.onExtraCallback.onExtraCallback(this.onWarmupCompleted.IAuthTabCallbackDefault.IAuthTabCallback());
            }
        }
    }

    public static final class onExtraCallback<T> implements Comparator {
        final /* synthetic */ List onNavigationEvent;

        public onExtraCallback(List list) {
            this.onNavigationEvent = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(Boolean.valueOf(this.onNavigationEvent.contains((onSwitchToDarkTheme) t2)), Boolean.valueOf(this.onNavigationEvent.contains((onSwitchToDarkTheme) t)));
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 43, 1451 - TextUtils.getTrimmedLength(""), 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 49123), TextUtils.lastIndexOf("", '0') + 45, 1494 - (Process.myTid() >> 22), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollBarSize() >> 8)), 50 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.indexOf("", "", 0)), 29 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (access000 ^ 7798559133331975163L)) ^ ((int) (getInterfaceDescriptor ^ 7798559133331975163L))) ^ ((char) (access100 ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i5 = $11 + 101;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final void onWarmupCompleted(final TransferDutchInviteActivity transferDutchInviteActivity, View view) throws Throwable {
        int i = 2 % 2;
        transferDutchInviteActivity.ICustomTabsServiceStub();
        ConvertByteArrayToFloatArray.onWarmupCompleted("click__request_dutchpay_toss", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return TransferDutchInviteActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        int i2 = ICustomTabsCallback + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
        }
    }

    private static final Unit IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback().put("action_type", "click");
            setDetectableSize.onExtraCallback().put("screen_name", transferDutchInviteActivity.getScreenName());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback().put("screen_name", transferDutchInviteActivity.getScreenName());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 89;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(TransferDutchInviteActivity transferDutchInviteActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onNavigationEvent(transferDutchInviteActivity, transferDutchInviteActivity.IAuthTabCallback(), transferDutchInviteActivity.IAuthTabCallbackDefault, "transfer_dutch_invite");
            int i3 = ICustomTabsCallback + 125;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 31 / 0;
                return;
            }
            return;
        }
        H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onNavigationEvent(transferDutchInviteActivity, transferDutchInviteActivity.IAuthTabCallback(), transferDutchInviteActivity.IAuthTabCallbackDefault, "transfer_dutch_invite");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onVerticalScrollEvent() {
        int i = 2 % 2;
        ArrayList<Object> arrayList = this.IAuthTabCallbackStubProxy;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i2 = IAuthTabCallback_Parcel + 87;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (obj instanceof onSwitchToDarkTheme) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            Object next = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long jOnWarmupCompleted = ((onSwitchToDarkTheme) next).onWarmupCompleted();
                        do {
                            Object next2 = it2.next();
                            long jOnWarmupCompleted2 = ((onSwitchToDarkTheme) next2).onWarmupCompleted();
                            if (jOnWarmupCompleted < jOnWarmupCompleted2) {
                                next = next2;
                                jOnWarmupCompleted = jOnWarmupCompleted2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    int i4 = ICustomTabsCallback + 35;
                    IAuthTabCallback_Parcel = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 60 / 0;
                    }
                }
                onSwitchToDarkTheme onswitchtodarktheme = (onSwitchToDarkTheme) next;
                long jOnWarmupCompleted3 = (onswitchtodarktheme != null ? onswitchtodarktheme.onWarmupCompleted() : 0L) + 1;
                String string = getString(R.string.app_send_dutch___cdf80357ea, Long.valueOf(jOnWarmupCompleted3));
                Intrinsics.checkNotNullExpressionValue(string, "");
                onSwitchToDarkTheme onswitchtodarktheme2 = new onSwitchToDarkTheme(new StoredContact(string, ""));
                onswitchtodarktheme2.onWarmupCompleted(jOnWarmupCompleted3);
                onExtraCallback(onswitchtodarktheme2);
                ConvertByteArrayToFloatArray.onExtraCallback(1007190L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                return;
            }
            int i6 = ICustomTabsCallback + 73;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            Object next3 = it.next();
            if (((onSwitchToDarkTheme) next3).IAuthTabCallbackStub().length() == 0) {
                int i8 = IAuthTabCallback_Parcel + 53;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList3.add(next3);
                    next.hashCode();
                    throw null;
                }
                arrayList3.add(next3);
            }
        }
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 43;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onExtraCallback(TransferDutchInviteActivity transferDutchInviteActivity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            transferDutchInviteActivity.IEngagementSignalsCallbackStub();
            return Unit.INSTANCE;
        }
        transferDutchInviteActivity.IEngagementSignalsCallbackStub();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 87;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        if (onextracallbackwithresult == null) {
            int i2 = ICustomTabsCallback + 111;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else if (onNavigationEvent.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()] == 1) {
            transferDutchInviteActivity.validateRelationship().IAuthTabCallbackDefault.IAuthTabCallback().clearFocus();
            int i3 = ICustomTabsCallback + 87;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = ICustomTabsCallback + 13;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NestfgetmLifecycleEventListeners nestfgetmLifecycleEventListeners = (TransferDutchInviteActivity) objArr[0];
        H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback = (H5TinyPopMenuTitleBarTheme.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        boolean z = !nestfgetmLifecycleEventListeners.isFinishing();
        int i4 = IAuthTabCallback_Parcel + 29;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i5 = 67 / 0;
        return Boolean.valueOf(z);
    }

    private static final boolean readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 13;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(TransferDutchInviteActivity transferDutchInviteActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            transferDutchInviteActivity.onSessionEnded();
            return Unit.INSTANCE;
        }
        transferDutchInviteActivity.onSessionEnded();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onNavigationEvent(TransferDutchInviteActivity transferDutchInviteActivity, Object obj) {
        boolean zIsFinishing;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            zIsFinishing = transferDutchInviteActivity.isFinishing();
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            zIsFinishing = !transferDutchInviteActivity.isFinishing();
        }
        int i3 = ICustomTabsCallback + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zIsFinishing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        if (obj instanceof getLastTrimMemoryLevel.onExtraCallback) {
            int i5 = i3 + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(((getLastTrimMemoryLevel.onExtraCallback) obj).IAuthTabCallback(), "android.permission.READ_CONTACTS");
                throw null;
            }
            if (ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(((getLastTrimMemoryLevel.onExtraCallback) obj).IAuthTabCallback(), "android.permission.READ_CONTACTS")) {
                H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                LinearLayout linearLayout = transferDutchInviteActivity.validateRelationship().onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                h5TinyPopMenuTitleBarTheme.onExtraCallbackWithResult(transferDutchInviteActivity, linearLayout);
                int i6 = ICustomTabsCallback + 85;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(validateRelationship().IAuthTabCallbackDefault.IAuthTabCallback()).IAuthTabCallback(new TransferDutchInviteActivity$.ExternalSyntheticLambda1(new TransferDutchInviteActivity$.ExternalSyntheticLambda0(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = enableAccessibilityOrder.onExtraCallbackWithResult.IAuthTabCallback(this).IAuthTabCallback(new TransferDutchInviteActivity$.ExternalSyntheticLambda3(new TransferDutchInviteActivity$.ExternalSyntheticLambda2(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback2);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback3 = H5TinyPopMenuTitleBarTheme.IAuthTabCallback.IAuthTabCallback().onExtraCallbackWithResult(NetConverter3.onExtraCallback()).onWarmupCompleted(new TransferDutchInviteActivity$.ExternalSyntheticLambda5(new TransferDutchInviteActivity$.ExternalSyntheticLambda4(this))).IAuthTabCallback(new TransferDutchInviteActivity$.ExternalSyntheticLambda7(new TransferDutchInviteActivity$.ExternalSyntheticLambda6(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback3, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback3);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback4 = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new TransferDutchInviteActivity$.ExternalSyntheticLambda8(this)).IAuthTabCallback(new TransferDutchInviteActivity$.ExternalSyntheticLambda9(this));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback4, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback4);
        int i2 = ICustomTabsCallback + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
        }
    }

    private static final List IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i3 = IAuthTabCallback_Parcel + 21;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return list;
    }

    private static final List onNavigationEvent(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Object[] objArr = {H5TinyPopMenuTitleBarTheme.IAuthTabCallback};
            ((Boolean) H5TinyPopMenuTitleBarTheme.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -957813781, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 957813783)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Object[] objArr2 = {H5TinyPopMenuTitleBarTheme.IAuthTabCallback};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (!(!((Boolean) H5TinyPopMenuTitleBarTheme.IAuthTabCallback(iIAuthTabCallback, objArr2, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -957813781, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 957813783)).booleanValue())) {
            return list;
        }
        int i3 = IAuthTabCallback_Parcel + 17;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return CollectionsKt.emptyList();
        }
        int i4 = 23 / 0;
        return CollectionsKt.emptyList();
    }

    private static final List access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = ICustomTabsCallback + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 48 / 0;
        return null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        final UIKitBaseActivity uIKitBaseActivity = (TransferDutchInviteActivity) objArr[0];
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = new H5TinyPopMenu(uIKitBaseActivity).onWarmupCompleted().onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return TransferDutchInviteActivity.IAuthTabCallback((List) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingOnWarmupCompleted.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda16
            public final Object apply(Object obj) {
                return TransferDutchInviteActivity.IAuthTabCallbackStub(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return TransferDutchInviteActivity.onWarmupCompleted((List) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent2 = jsonReaderUnknownNumberParsingOnNavigationEvent.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda18
            public final Object apply(Object obj) {
                return TransferDutchInviteActivity.onWarmupCompleted(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (List) obj};
                return (Unit) TransferDutchInviteActivity.onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr2, 1488866831, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1488866824);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnNavigationEvent2.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda20
            public final void accept(Object obj) {
                TransferDutchInviteActivity.IAuthTabCallbackDefault(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        uIKitBaseActivity.onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = IAuthTabCallback_Parcel + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TransferDutchInviteActivity transferDutchInviteActivity = (TransferDutchInviteActivity) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        List<onSwitchToDarkTheme> listICustomTabsServiceStubProxy = transferDutchInviteActivity.ICustomTabsServiceStubProxy();
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        JsonWriterHelper jsonWriterHelper = (JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{transferDutchInviteActivity}, -1960166587, iOnNavigationEvent3, 1960166598);
        Intrinsics.checkNotNull(list);
        jsonWriterHelper.onExtraCallback(CollectionsKt.sortedWith(enableAndroidTextMeasurementOptimizations.onWarmupCompleted(list), new onExtraCallback(listICustomTabsServiceStubProxy)));
        transferDutchInviteActivity.IEngagementSignalsCallbackStub();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent5 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent6 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent4, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent5, new Object[]{transferDutchInviteActivity}, -1719427773, iOnNavigationEvent6, 1719427778);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 113;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return unit;
    }

    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        if (i3 == 0) {
            ((JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent, iOnNavigationEvent4, iOnNavigationEvent2, objArr, -1960166587, iOnNavigationEvent3, 1960166598)).onWarmupCompleted(onNavigationEvent());
            return;
        }
        ((JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent, iOnNavigationEvent4, iOnNavigationEvent2, objArr, -1960166587, iOnNavigationEvent3, 1960166598)).onWarmupCompleted(onNavigationEvent());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.app.Activity, android.content.Context, androidx.activity.ComponentActivity, viva.republica.toss.send.dutch.TransferDutchInviteActivity] */
    private final void ICustomTabsServiceStub() throws Throwable {
        ArrayList arrayListEmptyList;
        int i = 2 % 2;
        List<onSwitchToDarkTheme> listICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listICustomTabsServiceStubProxy, 10));
        Iterator it = listICustomTabsServiceStubProxy.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                List<accessgetReactApplicationContextIfActiveOrWarn> listReversed = CollectionsKt.reversed(arrayList);
                long longExtra = getIntent().getLongExtra("amount", 0L);
                ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("dutchPayments");
                if (parcelableArrayListExtra == null) {
                    int i2 = IAuthTabCallback_Parcel + 113;
                    ICustomTabsCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        CollectionsKt.emptyList();
                        obj.hashCode();
                        throw null;
                    }
                    arrayListEmptyList = CollectionsKt.emptyList();
                } else {
                    arrayListEmptyList = parcelableArrayListExtra;
                }
                Intent intentOnExtraCallbackWithResult = TransferDutchAmountActivity.Companion.onExtraCallbackWithResult(this, longExtra, listReversed, arrayListEmptyList, getIntent().getBooleanExtra("routeToListOnCompleted", false));
                Intent intent = getIntent();
                Object[] objArr = new Object[1];
                a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, new char[]{12162, 33447, 46657, 38118, 44162, 13929, 10569, 16051}, new char[]{45631, 44488, 7450, 9525}, new char[]{29123, 21731, 12188, 13817}, objArr);
                String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
                if (stringExtra != null) {
                    Object[] objArr2 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 98), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 97, new char[]{12162, 33447, 46657, 38118, 44162, 13929, 10569, 16051}, new char[]{45631, 44488, 7450, 9525}, new char[]{29123, 21731, 12188, 13817}, objArr2);
                    intentOnExtraCallbackWithResult.putExtra(((String) objArr2[0]).intern(), stringExtra);
                }
                startActivityForResult(intentOnExtraCallbackWithResult, 30004);
                return;
            }
            int i3 = ICustomTabsCallback + 33;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                ((onSwitchToDarkTheme) it.next()).IAuthTabCallbackStub().length();
                obj.hashCode();
                throw null;
            }
            onSwitchToDarkTheme onswitchtodarktheme = (onSwitchToDarkTheme) it.next();
            String string = onswitchtodarktheme.IAuthTabCallbackStub().length() == 0 ? getString(R.string.app_send_dutch___f57f11eeba, Long.valueOf(onswitchtodarktheme.onWarmupCompleted())) : onswitchtodarktheme.onExtraCallback();
            Intrinsics.checkNotNull(string);
            arrayList.add(new accessgetReactApplicationContextIfActiveOrWarn(string, onswitchtodarktheme.IAuthTabCallbackStub(), onswitchtodarktheme.IAuthTabCallbackDefault()));
        }
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        Iterator<Object> it = this.IAuthTabCallbackStubProxy.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            int i2 = ICustomTabsCallback + 45;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                if ((next instanceof onSwitchToDarkTheme) && onWarmupCompleted((onSwitchToDarkTheme) next)) {
                    int i3 = IAuthTabCallback_Parcel + 113;
                    ICustomTabsCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                    int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                    int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                    int iIndexOf = ((JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1960166587, iOnNavigationEvent3, 1960166598)).onExtraCallbackWithResult().indexOf(next);
                    it.remove();
                    int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                    int iOnNavigationEvent5 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                    int iOnNavigationEvent6 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                    ((JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent4, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent5, new Object[]{this}, -1960166587, iOnNavigationEvent6, 1960166598)).notifyItemChanged(iIndexOf);
                }
            } else {
                Object next2 = it.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                boolean z = next2 instanceof onSwitchToDarkTheme;
                throw null;
            }
        }
        int iOnNavigationEvent7 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent8 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent9 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((onWarmupCompleted) onExtraCallbackWithResult(iOnNavigationEvent7, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent8, new Object[]{this}, -1730244336, iOnNavigationEvent9, 1730244345)).notifyDataSetChanged();
        int iOnNavigationEvent10 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent11 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent12 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent10, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent11, new Object[]{this}, -1719427773, iOnNavigationEvent12, 1719427778);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(@org.jetbrains.annotations.Nullable o.onSwitchToDarkTheme r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel
            int r1 = r1 + 3
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            boolean r1 = r11.onExtraCallbackWithResult(r12)
            if (r1 == 0) goto L13
            goto L5e
        L13:
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel
            int r2 = r1 + 9
            int r3 = r2 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L24
            r2 = 6
            int r2 = r2 / r3
            if (r12 == 0) goto L32
            goto L26
        L24:
            if (r12 == 0) goto L32
        L26:
            int r1 = r1 + 105
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            java.util.ArrayList<java.lang.Object> r1 = r11.IAuthTabCallbackStubProxy
            r1.add(r3, r12)
        L32:
            java.lang.Object[] r7 = new java.lang.Object[]{r11}
            int r4 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            int r6 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            int r9 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            int r5 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            r8 = -1730244336(0xffffffff98de9110, float:-5.753213E-24)
            r10 = 1730244345(0x67216ef9, float:7.623481E23)
            java.lang.Object r12 = onExtraCallbackWithResult(r4, r5, r6, r7, r8, r9, r10)
            viva.republica.toss.send.dutch.TransferDutchInviteActivity$onWarmupCompleted r12 = (viva.republica.toss.send.dutch.TransferDutchInviteActivity.onWarmupCompleted) r12
            r12.notifyItemInserted(r3)
            int r12 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel
            int r12 = r12 + 117
            int r1 = r12 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback = r1
            int r12 = r12 % r0
        L5e:
            java.lang.Object[] r3 = new java.lang.Object[]{r11}
            int r0 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            int r2 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            int r5 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            int r1 = viva.republica.toss.account.agreement.AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()
            r4 = -1719427773(0xffffffff99839d43, float:-1.36086E-23)
            r6 = 1719427778(0x667c62c2, float:2.9796453E23)
            onExtraCallbackWithResult(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchInviteActivity.onExtraCallback(o.onSwitchToDarkTheme):void");
    }

    public void IAuthTabCallback(@Nullable onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(!onExtraCallbackWithResult(onswitchtodarktheme)) && onswitchtodarktheme != null) {
            int i4 = IAuthTabCallback_Parcel + 91;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            int iIndexOf = ((onWarmupCompleted) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, -1730244336, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1730244345)).onExtraCallbackWithResult().indexOf(onswitchtodarktheme);
            this.IAuthTabCallbackStubProxy.remove(onswitchtodarktheme);
            ((onWarmupCompleted) onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, -1730244336, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1730244345)).notifyItemRemoved(iIndexOf);
            int i6 = IAuthTabCallback_Parcel + 89;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 5;
            }
        }
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, -1719427773, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1719427778);
    }

    private final void onNavigationEvent(onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iIndexOf = ((JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1960166587, iOnNavigationEvent3, 1960166598)).onExtraCallbackWithResult().indexOf(onswitchtodarktheme);
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent5 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent6 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent4, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent5, new Object[]{this}, -1960166587, iOnNavigationEvent6, 1960166598)).notifyItemChanged(iIndexOf);
        int i4 = ICustomTabsCallback + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onExtraCallbackWithResult(@Nullable onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        if (onswitchtodarktheme == null) {
            int i2 = ICustomTabsCallback + 55;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = ICustomTabsCallback + 67;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        ArrayList<Object> arrayList = this.IAuthTabCallbackStubProxy;
        if (i5 == 0) {
            return arrayList.contains(onswitchtodarktheme);
        }
        arrayList.contains(onswitchtodarktheme);
        throw null;
    }

    public CharSequence onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {validateRelationship().IAuthTabCallbackDefault};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        Editable editable = (Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, objArr, -450491624, iIAuthTabCallback, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = ICustomTabsCallback + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return editable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void IAuthTabCallback(@NotNull final CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        isHighTextContrastEnabled ishightextcontrastenabled = isHighTextContrastEnabled.INSTANCE;
        String string = getString(R.string.app_send_dutch___de23a08a1e, VideoConfig.onWarmupCompleted(charSequence, (String) null, 1, (Object) null));
        Intrinsics.checkNotNullExpressionValue(string, "");
        isHighTextContrastEnabled.onNavigationEvent(ishightextcontrastenabled, this, string, "", "", 0, new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchInviteActivity$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return TransferDutchInviteActivity.onExtraCallbackWithResult(this.f$0, charSequence, (String) obj);
            }
        }, 16, null);
        int i2 = ICustomTabsCallback + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
    }

    private static final Unit IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity, CharSequence charSequence, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        transferDutchInviteActivity.onExtraCallback(new onSwitchToDarkTheme(str, charSequence.toString(), false));
        transferDutchInviteActivity.validateRelationship().IAuthTabCallbackDefault.IAuthTabCallback().setText("");
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TransferDutchInviteActivity transferDutchInviteActivity = (TransferDutchInviteActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        transferDutchInviteActivity.validateRelationship().asBinder.smoothScrollToPosition(0);
        transferDutchInviteActivity.validateRelationship().onWarmupCompleted.asInterface().setEnabled(!transferDutchInviteActivity.ICustomTabsServiceStubProxy().isEmpty());
        int i4 = ICustomTabsCallback + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r1 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback + 59;
        viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel = r1 % 128;
        r1 = r1 % 2;
        ICustomTabsServiceDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        return super.bg_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (onNavigationEvent().length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (onNavigationEvent().length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        validateRelationship().IAuthTabCallbackDefault.IAuthTabCallback().setText("");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean bg_() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L26
            java.util.List r1 = r5.ICustomTabsServiceStubProxy()
            int r1 = r1.size()
            java.lang.CharSequence r3 = r5.onNavigationEvent()
            int r3 = r3.length()
            r4 = 28
            int r4 = r4 / 0
            if (r3 <= 0) goto L48
            goto L38
        L26:
            java.util.List r1 = r5.ICustomTabsServiceStubProxy()
            int r1 = r1.size()
            java.lang.CharSequence r3 = r5.onNavigationEvent()
            int r3 = r3.length()
            if (r3 <= 0) goto L48
        L38:
            o.CMS_MakePKCS9AuthAttributes r0 = r5.validateRelationship()
            im.toss.uikit.widget.textField.TdsSearchFieldV1View r0 = r0.IAuthTabCallbackDefault
            im.toss.uikit.widget.textField.BaseEditText r0 = r0.IAuthTabCallback()
            java.lang.String r1 = ""
            r0.setText(r1)
            return r2
        L48:
            if (r1 <= 0) goto L57
            int r1 = viva.republica.toss.send.dutch.TransferDutchInviteActivity.ICustomTabsCallback
            int r1 = r1 + 59
            int r3 = r1 % 128
            viva.republica.toss.send.dutch.TransferDutchInviteActivity.IAuthTabCallback_Parcel = r3
            int r1 = r1 % r0
            r5.ICustomTabsServiceDefault()
            return r2
        L57:
            boolean r0 = super.bg_()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchInviteActivity.bg_():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 30004 && i2 == -1) {
            int i4 = IAuthTabCallback_Parcel + 43;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                setResult(-1);
                finish();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setResult(-1);
            finish();
            int i5 = ICustomTabsCallback + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    final class onExtraCallbackWithResult {
        public onExtraCallbackWithResult() {
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, long j, List list, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return iAuthTabCallback.onExtraCallbackWithResult(context, j, list, z);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j, @NotNull List<accesssetEnqueuedAnimationOnFramep> list, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) TransferDutchInviteActivity.class).putExtra("amount", j).putParcelableArrayListExtra("dutchPayments", new ArrayList<>(list)).putExtra("routeToListOnCompleted", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    private final void onSessionEnded() {
        int i = 2 % 2;
        Object[] objArr = {H5TinyPopMenuTitleBarTheme.IAuthTabCallback};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        if (!((Boolean) H5TinyPopMenuTitleBarTheme.IAuthTabCallback(iIAuthTabCallback, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -957813781, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, 957813783)).booleanValue()) {
            TouchRecyclerView touchRecyclerView = validateRelationship().onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(touchRecyclerView, "");
            touchRecyclerView.setVisibility(4);
            TdsResultV0View tdsResultV0View = validateRelationship().asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsResultV0View, "");
            tdsResultV0View.setVisibility(0);
            return;
        }
        int i2 = ICustomTabsCallback + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, 608600808, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -608600802);
        TouchRecyclerView touchRecyclerView2 = validateRelationship().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(touchRecyclerView2, "");
        touchRecyclerView2.setVisibility(0);
        TdsResultV0View tdsResultV0View2 = validateRelationship().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsResultV0View2, "");
        tdsResultV0View2.setVisibility(4);
        int i4 = ICustomTabsCallback + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    private final List<onSwitchToDarkTheme> ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        ArrayList<Object> arrayList = this.IAuthTabCallbackStubProxy;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof onSwitchToDarkTheme) {
                int i2 = ICustomTabsCallback + 11;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                arrayList2.add(obj);
                int i4 = ICustomTabsCallback + 121;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return arrayList2;
    }

    private static final List onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        int i2 = IAuthTabCallback_Parcel + 101;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 % 2;
        }
        for (Object obj : list) {
            onSwitchToDarkTheme onswitchtodarktheme = (onSwitchToDarkTheme) obj;
            if (onswitchtodarktheme.IAuthTabCallback_Parcel()) {
                int i4 = IAuthTabCallback_Parcel + 29;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                String strIAuthTabCallbackStub = onswitchtodarktheme.IAuthTabCallbackStub();
                int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                if (!Intrinsics.areEqual(strIAuthTabCallbackStub, (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()))) {
                    arrayList.add(obj);
                    int i6 = IAuthTabCallback_Parcel + 75;
                    ICustomTabsCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferDutchInviteActivity transferDutchInviteActivity, List list) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{transferDutchInviteActivity, list}, 1488866831, iOnNavigationEvent3, -1488866824);
    }

    public static /* synthetic */ boolean onWarmupCompleted(TransferDutchInviteActivity transferDutchInviteActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{transferDutchInviteActivity, onextracallback}, 780489692, iOnNavigationEvent3, -780489688)).booleanValue();
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, 1785070116, iOnNavigationEvent3, -1785070116);
    }

    private final JsonWriterHelper updateVisuals() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (JsonWriterHelper) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1960166587, iOnNavigationEvent3, 1960166598);
    }

    private final onWarmupCompleted access200() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (onWarmupCompleted) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1730244336, iOnNavigationEvent3, 1730244345);
    }

    private final void writeTypedList() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, 608600808, iOnNavigationEvent3, -608600802);
    }

    private static final Unit IAuthTabCallback(TransferDutchInviteActivity transferDutchInviteActivity, List list) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{transferDutchInviteActivity, list}, -1484734813, iOnNavigationEvent3, 1484734816);
    }

    private static final void access100(Function1 function1, Object obj) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, 139044516, iOnNavigationEvent3, -139044506);
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, -259084374, iOnNavigationEvent3, 259084376);
    }

    private static final boolean onExtraCallback(TransferDutchInviteActivity transferDutchInviteActivity, H5TinyPopMenuTitleBarTheme.onExtraCallback onextracallback) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{transferDutchInviteActivity, onextracallback}, -1115186669, iOnNavigationEvent3, 1115186670)).booleanValue();
    }

    private final void ICustomTabsService_Parcel() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, 781071050, iOnNavigationEvent3, -781071042);
    }

    private final void IEngagementSignalsCallbackDefault() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -1719427773, iOnNavigationEvent3, 1719427778);
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchInviteActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 23;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchInviteActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 27;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchInviteActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.send.dutch.Hilt_TransferDutchInviteActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void setEngagementSignalsCallback() {
        access000 = 5264445371100813764L;
        getInterfaceDescriptor = -1776194565;
        access100 = (char) 27643;
    }
}
