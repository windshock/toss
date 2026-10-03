package viva.republica.toss.account.transactions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.network.throwable.ApiServerError;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.TdsResultV0View;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BERTaggedObjectParser;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_VerifySignedDataWithHash;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DERApplicationSpecific;
import o.DERBMPString;
import o.DERBitString;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IPostMessageServiceStubProxy;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UTF8Decoder;
import o.disableImageViewPreallocationAndroid;
import o.getContents;
import o.getParamImp;
import o.initMiniApp;
import o.isConstructed;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.transactions.UserTransactionsActivity$;
import viva.republica.toss.widget.FloatingLoadingView;

@RequiresAuth(onExtraCallbackWithResult = true, onWarmupCompleted = UTF8Decoder.USER_TRANSACTIONS)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UserTransactionsActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static char access000 = 23213;
    private static char asBinder = 60702;
    private static char getInterfaceDescriptor = 30786;
    private static char onTransact = 12888;
    private final Lazy asInterface = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(DERBMPString.class), new getInterfaceDescriptor(this), new Function0() { // from class: viva.republica.toss.account.transactions.UserTransactionsActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (ViewModelProvider.onWarmupCompleted) UserTransactionsActivity.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[0], iOnExtraCallback, -1379329834, 1379329834);
        }
    }, new IAuthTabCallbackStubProxy(null, this));
    private final BERTaggedObjectParser IAuthTabCallbackDefault = new BERTaggedObjectParser();
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback_Parcel(this));

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[isConstructed.values().length];
            try {
                iArr[isConstructed.REFUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isConstructed.CHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isConstructed.USE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[isConstructed.PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[isConstructed.TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[isConstructed.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onWarmupCompleted = iArr;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UserTransactionsActivity userTransactionsActivity = (UserTransactionsActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(userTransactionsActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UserTransactionsActivity userTransactionsActivity, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(userTransactionsActivity, i);
        int i5 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (ViewModelProvider.onWarmupCompleted) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[0], iOnExtraCallback, 841650398, -841650394);
        }
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isConstructed isconstructed, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(isconstructed, setDetectableSize);
        }
        onWarmupCompleted(isconstructed, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i6 | i4)) | i5;
        int i8 = (~((~i4) | i6)) | i5;
        int i9 = (~i5) | i6;
        int i10 = i5 + i6 + i3 + (440753341 * i2) + ((-634449194) * i);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i5) + 1075183616 + ((-1421434046) * i6) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i3) + (780402688 * i2) + ((-180879360) * i) + (353763328 * i11);
        int i13 = (i5 * 892202253) + 1676176333 + (i6 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i3 * 892200819) + (i2 * (-770690073)) + (i * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        if (i14 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i14 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i14 != 3) {
            return i14 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        UserTransactionsActivity userTransactionsActivity = (UserTransactionsActivity) objArr[0];
        int i15 = 2 % 2;
        int i16 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i16 % 128;
        int i17 = i16 % 2;
        TdsResultV0View tdsResultV0View = userTransactionsActivity.setEngagementSignalsCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsResultV0View, "");
        int i18 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i18 % 128;
        int i19 = i18 % 2;
        return tdsResultV0View;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = i3 + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return 1010083L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback_Parcel implements Function0<CMS_VerifySignedDataWithHash> {
        final /* synthetic */ Activity onExtraCallback;

        public IAuthTabCallback_Parcel(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CMS_VerifySignedDataWithHash invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_VerifySignedDataWithHash.onNavigationEvent(layoutInflater);
        }
    }

    public static final /* synthetic */ FloatingLoadingView IAuthTabCallback(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return userTransactionsActivity.ICustomTabsServiceDefault();
        }
        userTransactionsActivity.ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ DERBMPString IAuthTabCallbackDefault(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {userTransactionsActivity};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        DERBMPString dERBMPString = (DERBMPString) onWarmupCompleted(iOnExtraCallback4, iOnExtraCallback3, iOnExtraCallback2, objArr, iOnExtraCallback, -583324338, 583324339);
        int i4 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return dERBMPString;
        }
        throw null;
    }

    public static final /* synthetic */ TdsResultV0View onExtraCallback(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        TdsResultV0View tdsResultV0View = (TdsResultV0View) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{userTransactionsActivity}, iOnExtraCallback, 1874354575, -1874354572);
        int i4 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tdsResultV0View;
    }

    public static final /* synthetic */ BERTaggedObjectParser onExtraCallbackWithResult(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        BERTaggedObjectParser bERTaggedObjectParser = userTransactionsActivity.IAuthTabCallbackDefault;
        int i5 = i3 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return bERTaggedObjectParser;
    }

    public static final /* synthetic */ void onNavigationEvent(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        userTransactionsActivity.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ RecyclerView onTransact(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerViewValidateRelationship = userTransactionsActivity.validateRelationship();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return recyclerViewValidateRelationship;
    }

    public static final /* synthetic */ Typography5 onWarmupCompleted(UserTransactionsActivity userTransactionsActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5UpdateVisuals = userTransactionsActivity.updateVisuals();
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return typography5UpdateVisuals;
    }

    public static final class access000 implements ViewModelProvider.onWarmupCompleted {
        access000() {
        }

        public /* bridge */ <T extends ViewModel> T create(Class<T> cls, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
            return (T) super.create(cls, androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2);
        }

        public /* bridge */ <T extends ViewModel> T onNavigationEvent(KClass<T> kClass, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
            return (T) super.onNavigationEvent(kClass, androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2);
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new DERBMPString(new DERBitString(new getContents()));
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DERBMPString dERBMPString;
        UserTransactionsActivity userTransactionsActivity = (UserTransactionsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = userTransactionsActivity.asInterface.getValue();
        if (i3 == 0) {
            dERBMPString = (DERBMPString) value;
            int i4 = 26 / 0;
        } else {
            dERBMPString = (DERBMPString) value;
        }
        int i5 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return dERBMPString;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        access000 access000Var = new access000();
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return access000Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CMS_VerifySignedDataWithHash setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMS_VerifySignedDataWithHash cMS_VerifySignedDataWithHash = (CMS_VerifySignedDataWithHash) value;
        int i4 = IAuthTabCallbackStubProxy + 43;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return cMS_VerifySignedDataWithHash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RecyclerView validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TdsRecyclerView tdsRecyclerView = setEngagementSignalsCallback().onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRecyclerView, "");
        int i4 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tdsRecyclerView;
    }

    private final FloatingLoadingView ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        FloatingLoadingView floatingLoadingView = setEngagementSignalsCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(floatingLoadingView, "");
        int i4 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return floatingLoadingView;
    }

    private final Typography5 updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Typography5 typography5 = setEngagementSignalsCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        int i4 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return typography5;
    }

    public static final class getInterfaceDescriptor implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public getInterfaceDescriptor(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onNavigationEvent.getViewModelStore();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(setEngagementSignalsCallback().getRoot());
        ConstraintLayout root = setEngagementSignalsCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, setEngagementSignalsCallback().IAuthTabCallback, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onExtraCallbackWithResult(DERSet.onExtraCallback.startActivityForResult());
            supportActionBar.onNavigationEvent(true);
            int i4 = IAuthTabCallbackStubProxy + 107;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
        IEngagementSignalsCallback();
        access200();
        ICustomTabsServiceStubProxy();
        ICustomTabsService_Parcel();
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onExtraCallback;

        public IAuthTabCallbackStubProxy(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    public static final class access100 extends View.AccessibilityDelegate {
        access100() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, UserTransactionsActivity.this.getString(R.string.transaction_history_filter_button_content_description)));
        }
    }

    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        validateRelationship().setAdapter(this.IAuthTabCallbackDefault);
        updateVisuals().setAccessibilityDelegate(new access100());
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
    }

    public static final class asInterface implements Function1<List<? extends DERApplicationSpecific>, Unit> {
        private static final byte[] $$a = {34, -66, 77, 18};
        private static final int $$b = 179;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private static char[] IAuthTabCallback = {60860, 29082, 54740, 14602, 40271, 57548, 17575, 43117, 3191, 37802, 63473, 23518, 48901, 837, 26326, 51910, 11803, 45693, 4531, 30132, 55605, 15739, 33031, 58510, 18635, 44042, 12356, 38819, 64489, 24373, 41783, 1697, 27364, 52929, 21012, 46613, 5519, 31174, 56615, 8566, 34025, 59643, 19517, 53274, 13400, 39839, 65429, 17171, 42840, 2746, 28334, 62000, 22127, 46521, 6534};
        private static long onExtraCallback = 6004403421085790702L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, byte r6, byte r7) {
            /*
                int r5 = r5 * 3
                int r5 = r5 + 97
                byte[] r0 = viva.republica.toss.account.transactions.UserTransactionsActivity.asInterface.$$a
                int r7 = r7 * 3
                int r1 = r7 + 1
                int r6 = r6 * 2
                int r6 = 4 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r5
                r5 = r7
                r3 = r2
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L23:
                r4 = r0[r6]
                int r3 = r3 + 1
            L27:
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.transactions.UserTransactionsActivity.asInterface.$$c(byte, byte, byte):java.lang.String");
        }

        public asInterface() {
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $10 + 107;
            $11 = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 59697), Color.argb(0, 0, 0, 0) + 17, 10973 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16731082) - Color.rgb(0, 0, 0)), 31 - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49123), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 1446, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            i4 = $11 + 19;
                            $10 = i4 % 128;
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
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 44 - TextUtils.getOffsetBefore("", 0), 1494 - KeyEvent.normalizeMetaState(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult(List<? extends DERApplicationSpecific> list) throws Throwable {
            String string;
            int i = 2 % 2;
            List<? extends DERApplicationSpecific> list2 = list;
            UserTransactionsActivity.onExtraCallbackWithResult(UserTransactionsActivity.this).onExtraCallbackWithResult(list2);
            if (!list2.isEmpty()) {
                UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this).setVisibility(4);
                return;
            }
            TdsResultV0View tdsResultV0ViewOnExtraCallback = UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this);
            Object[] objArr = new Object[1];
            a(Gravity.getAbsoluteGravity(0, 0), 54 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr);
            tdsResultV0ViewOnExtraCallback.setLottieImageFromUrl(((String) objArr[0]).intern());
            TdsResultV0View tdsResultV0ViewOnExtraCallback2 = UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this);
            isConstructed isconstructed = (isConstructed) UserTransactionsActivity.IAuthTabCallbackDefault(UserTransactionsActivity.this).onNavigationEvent().getValue();
            int i2 = isconstructed != null ? onExtraCallback.onWarmupCompleted[isconstructed.ordinal()] : -1;
            if (i2 == 1) {
                String string2 = UserTransactionsActivity.this.getString(R.string.app_account_transactions___1b32cf01e2);
                int i3 = onWarmupCompleted + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                string = string2;
            } else if (i2 == 2) {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___45a6c89ed8);
            } else if (i2 != 3) {
                int i5 = onWarmupCompleted + 13;
                onNavigationEvent = i5 % 128;
                string = (i5 % 2 == 0 ? i2 == 4 : i2 == 3) ? UserTransactionsActivity.this.getString(R.string.app_account_transactions___b4b4d2b6ee) : i2 != 5 ? "" : UserTransactionsActivity.this.getString(R.string.app_account_transactions___7c77878361);
            } else {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___4c6882077a);
            }
            tdsResultV0ViewOnExtraCallback2.setSubtitle(string + "내역이 없습니다.");
            UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this).setButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.WEAK);
            UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this).setButtonLabel(UserTransactionsActivity.IAuthTabCallbackDefault(UserTransactionsActivity.this).onWarmupCompleted() ? UserTransactionsActivity.this.getString(R.string.app_account_transactions___95d2e1c44b) : "");
            UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this).setOnButtonClickListener(UserTransactionsActivity.this.new IAuthTabCallbackStub());
            UserTransactionsActivity.onExtraCallback(UserTransactionsActivity.this).setVisibility(0);
        }
    }

    static final class IAuthTabCallbackDefault implements Function1<CommonModule_setLeftEdgeTouchEnabled, Unit> {
        final /* synthetic */ ApiServerError onExtraCallback;

        IAuthTabCallbackDefault(ApiServerError apiServerError) {
            this.onExtraCallback = apiServerError;
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((CommonModule_setLeftEdgeTouchEnabled) obj);
            return Unit.INSTANCE;
        }

        public final void IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(this.onExtraCallback.asBinder());
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(this.onExtraCallback.IAuthTabCallbackDefault());
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $11 + 113;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (getInterfaceDescriptor ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access000);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int threadPriority = ((Process.getThreadPriority(i3) + 20) >> 6) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, maximumFlingVelocity, threadPriority, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $10 + 51;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 4 % 4;
                    }
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 16014), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, 19901 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static final class IAuthTabCallbackStub implements Function1<View, Unit> {
        IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback((View) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            UserTransactionsActivity.onNavigationEvent(UserTransactionsActivity.this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(o.isConstructed r7, o.SetDetectableSize r8) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + 103
            int r2 = r1 % 128
            viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 4
            r4 = 0
            if (r1 == 0) goto L23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            int[] r1 = viva.republica.toss.account.transactions.UserTransactionsActivity.onExtraCallback.onWarmupCompleted
            int r7 = r7.ordinal()
            r7 = r1[r7]
            r1 = 3
            int r1 = r1 / r4
            switch(r7) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                default: goto L22;
            }
        L22:
            goto L72
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            int[] r1 = viva.republica.toss.account.transactions.UserTransactionsActivity.onExtraCallback.onWarmupCompleted
            int r7 = r7.ordinal()
            r7 = r1[r7]
            switch(r7) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                default: goto L31;
            }
        L31:
            goto L72
        L32:
            java.lang.String r7 = "all"
            goto L50
        L35:
            java.lang.String r7 = "transfer"
            goto L50
        L38:
            java.lang.String r7 = "payment"
            goto L50
        L3b:
            java.lang.String r7 = "spend"
            goto L50
        L3e:
            java.lang.String r7 = "charge"
            goto L50
        L41:
            int r7 = viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallback_Parcel
            int r7 = r7 + 55
            int r1 = r7 % 128
            viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallbackStubProxy = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L4e
            r7 = 3
            int r7 = r7 % r3
        L4e:
            java.lang.String r7 = "refund"
        L50:
            char[] r0 = new char[r3]
            r0 = {x0098: FILL_ARRAY_DATA , data: [30349, 13265, 19143, 17384} // fill-array
            double r1 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r4)
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            int r1 = r1 + r3
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r0, r1, r2)
            r0 = r2[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r8.onExtraCallback(r0, r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L72:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.transactions.UserTransactionsActivity.onWarmupCompleted(o.isConstructed, o.SetDetectableSize):kotlin.Unit");
    }

    private static final Unit onNavigationEvent(UserTransactionsActivity userTransactionsActivity, int i) {
        final isConstructed isconstructed;
        int i2 = 2 % 2;
        if (i != 1) {
            int i3 = IAuthTabCallback_Parcel + 73;
            int i4 = i3 % 128;
            IAuthTabCallbackStubProxy = i4;
            if (i3 % 2 != 0 ? i == 2 : i == 4) {
                isconstructed = isConstructed.CHARGE;
            } else if (i != 3) {
                int i5 = i4 + 69;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0 ? i == 4 : i == 3) {
                    isconstructed = isConstructed.PAY;
                } else if (i == 5) {
                    isconstructed = isConstructed.TRANSFER;
                } else {
                    isconstructed = isConstructed.ALL;
                    int i6 = IAuthTabCallback_Parcel + 23;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                isconstructed = isConstructed.USE;
            }
        } else {
            isconstructed = isConstructed.REFUND;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1010087L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.transactions.UserTransactionsActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return UserTransactionsActivity.onExtraCallbackWithResult(isconstructed, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{userTransactionsActivity}, iOnExtraCallback, -583324338, 583324339)).IAuthTabCallback(isconstructed);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[PHI: r4
      0x008a: PHI (r4v4 int) = (r4v3 int), (r4v6 int), (r4v10 int), (r4v11 int) binds: [B:10:0x0071, B:13:0x0076, B:15:0x0082, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(final viva.republica.toss.account.transactions.UserTransactionsActivity r10, android.view.View r11) {
        /*
            r11 = 2
            int r0 = r11 % r11
            r1 = 1010085(0xf69a5, double:4.990483E-318)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r1, r3, r4, r5, r6, r7, r8)
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r0 = new o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback
            r0.<init>(r10)
            int r1 = viva.republica.toss.R.string.app_account_transactions___1873c2b854
            java.lang.String r1 = r10.getString(r1)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r0 = r0.onExtraCallbackWithResult(r1)
            r1 = 0
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r0 = r0.onExtraCallback(r1)
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r0 = r0.onWarmupCompleted(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r10}
            int r6 = im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback()
            int r4 = im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback()
            int r3 = im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback()
            int r2 = im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback()
            r7 = -583324338(0xffffffffdd3b2d4e, float:-8.4297014E17)
            r8 = 583324339(0x22c4d2b3, float:5.3348993E-18)
            java.lang.Object r2 = onWarmupCompleted(r2, r3, r4, r5, r6, r7, r8)
            o.DERBMPString r2 = (o.DERBMPString) r2
            androidx.lifecycle.LiveData r2 = r2.onNavigationEvent()
            java.lang.Object r2 = r2.getValue()
            o.isConstructed r2 = (o.isConstructed) r2
            r3 = 0
            if (r2 != 0) goto L68
            int r2 = viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallbackStubProxy
            int r2 = r2 + 63
            int r4 = r2 % 128
            viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallback_Parcel = r4
            int r2 = r2 % r11
            if (r2 != 0) goto L67
            r2 = -1
            goto L70
        L67:
            throw r3
        L68:
            int[] r4 = viva.republica.toss.account.transactions.UserTransactionsActivity.onExtraCallback.onWarmupCompleted
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L70:
            r4 = 1
            if (r2 == r4) goto L8a
            if (r2 == r11) goto L88
            r4 = 3
            if (r2 == r4) goto L8a
            int r4 = viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallbackStubProxy
            int r4 = r4 + 57
            int r5 = r4 % 128
            viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallback_Parcel = r5
            int r4 = r4 % r11
            r4 = 4
            if (r2 == r4) goto L8a
            r4 = 5
            if (r2 == r4) goto L8a
            goto L8b
        L88:
            r1 = r11
            goto L8b
        L8a:
            r1 = r4
        L8b:
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r0 = r0.IAuthTabCallback(r1)
            java.lang.String r4 = "전체"
            java.lang.String r5 = "환급"
            java.lang.String r6 = "충전"
            java.lang.String r7 = "사용"
            java.lang.String r8 = "결제"
            java.lang.String r9 = "양도"
            java.lang.String[] r1 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r0 = r0.onExtraCallbackWithResult(r1)
            viva.republica.toss.account.transactions.UserTransactionsActivity$$ExternalSyntheticLambda1 r1 = new viva.republica.toss.account.transactions.UserTransactionsActivity$$ExternalSyntheticLambda1
            r1.<init>()
            o.BrickModuleImplExternalSyntheticLambda1$IAuthTabCallback r10 = r0.onExtraCallback(r1)
            r10.access100()
            int r10 = viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallbackStubProxy
            int r10 = r10 + 55
            int r0 = r10 % 128
            viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallback_Parcel = r0
            int r10 = r10 % r11
            if (r10 != 0) goto Lbf
            return
        Lbf:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.transactions.UserTransactionsActivity.IAuthTabCallback(viva.republica.toss.account.transactions.UserTransactionsActivity, android.view.View):void");
    }

    public static final class IAuthTabCallback extends RecyclerView.OnScrollListener {
        IAuthTabCallback() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (UserTransactionsActivity.onTransact(UserTransactionsActivity.this).canScrollVertically(1)) {
                return;
            }
            UserTransactionsActivity.onNavigationEvent(UserTransactionsActivity.this);
        }
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        updateVisuals().setOnClickListener(new UserTransactionsActivity$.ExternalSyntheticLambda3(this));
        validateRelationship().addOnScrollListener(new IAuthTabCallback());
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback, -583324338, 583324339)).onTransact();
        int i4 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (!Intrinsics.areEqual(((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback, -583324338, 583324339)).asBinder().getValue(), Boolean.TRUE)) {
            int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            if (((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback5, new Object[]{this}, iOnExtraCallback4, -583324338, 583324339)).onWarmupCompleted()) {
                int i4 = IAuthTabCallbackStubProxy + 31;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                int iOnExtraCallback7 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback8 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback9 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback9, iOnExtraCallback8, new Object[]{this}, iOnExtraCallback7, -583324338, 583324339)).asInterface();
            }
        }
    }

    private final void access200() {
        int i = 2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback, -583324338, 583324339)).asBinder().observe(this, new BaseActivity.setEngagementSignalsCallback(new onNavigationEvent()));
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback5, new Object[]{this}, iOnExtraCallback4, -583324338, 583324339)).onExtraCallbackWithResult().observe(this, new BaseActivity.setEngagementSignalsCallback(new onWarmupCompleted()));
        int iOnExtraCallback7 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback8 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback9 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback9, iOnExtraCallback8, new Object[]{this}, iOnExtraCallback7, -583324338, 583324339)).IAuthTabCallback().observe(this, new BaseActivity.setEngagementSignalsCallback(new onExtraCallbackWithResult()));
        int iOnExtraCallback10 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback11 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback12 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback12, iOnExtraCallback11, new Object[]{this}, iOnExtraCallback10, -583324338, 583324339)).IAuthTabCallbackStub().observe(this, new BaseActivity.setEngagementSignalsCallback(new asBinder()));
        int iOnExtraCallback13 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback14 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback15 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback15, iOnExtraCallback14, new Object[]{this}, iOnExtraCallback13, -583324338, 583324339)).onExtraCallback().observe(this, new BaseActivity.setEngagementSignalsCallback(new asInterface()));
        int iOnExtraCallback16 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback17 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback18 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        ((DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback18, iOnExtraCallback17, new Object[]{this}, iOnExtraCallback16, -583324338, 583324339)).onNavigationEvent().observe(this, new BaseActivity.setEngagementSignalsCallback(new onTransact()));
        int i2 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(UserTransactionsActivity userTransactionsActivity, View view) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{userTransactionsActivity, view}, iOnExtraCallback, 1722808189, -1722808187);
    }

    public static /* synthetic */ ViewModelProvider.onWarmupCompleted onNavigationEvent() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (ViewModelProvider.onWarmupCompleted) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[0], iOnExtraCallback, -1379329834, 1379329834);
    }

    private final TdsResultV0View ICustomTabsServiceStub() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (TdsResultV0View) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback, 1874354575, -1874354572);
    }

    private final DERBMPString writeTypedList() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (DERBMPString) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, iOnExtraCallback, -583324338, 583324339);
    }

    private static final ViewModelProvider.onWarmupCompleted onGreatestScrollPercentageIncreased() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (ViewModelProvider.onWarmupCompleted) onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[0], iOnExtraCallback, 841650398, -841650394);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 43;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asBinder implements Function1<String, Unit> {
        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(String str) {
            UserTransactionsActivity.IAuthTabCallbackDefault(UserTransactionsActivity.this).asInterface();
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Throwable, Unit> {
        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Throwable th) {
            Throwable th2 = th;
            Intrinsics.checkNotNull(th2);
            getParamImp.onWarmupCompleted(th2, UserTransactionsActivity.this, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
    }

    public static final class onNavigationEvent implements Function1<Boolean, Unit> {
        public onNavigationEvent() {
        }

        public final void IAuthTabCallback(Boolean bool) {
            Boolean bool2 = bool;
            FloatingLoadingView floatingLoadingViewIAuthTabCallback = UserTransactionsActivity.IAuthTabCallback(UserTransactionsActivity.this);
            Intrinsics.checkNotNull(bool2);
            floatingLoadingViewIAuthTabCallback.setLoading(bool2.booleanValue());
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onTransact implements Function1<isConstructed, Unit> {
        public onTransact() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(isConstructed isconstructed) {
            String string;
            isConstructed isconstructed2 = isconstructed;
            Typography5 typography5OnWarmupCompleted = UserTransactionsActivity.onWarmupCompleted(UserTransactionsActivity.this);
            int i = isconstructed2 == null ? -1 : onExtraCallback.onWarmupCompleted[isconstructed2.ordinal()];
            if (i == 1) {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___6409b80c22);
            } else if (i == 2) {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___b03617ef2f);
            } else if (i == 3) {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___7f3ba385e9);
            } else if (i == 4) {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___989a7a4d2a);
            } else if (i == 5) {
                string = UserTransactionsActivity.this.getString(R.string.app_account_transactions___44d2873b55);
            } else {
                string = UserTransactionsActivity.this.getString(R.string.transfer_history);
            }
            typography5OnWarmupCompleted.setText(string);
        }
    }

    public static final class onWarmupCompleted implements Function1<ApiServerError, Unit> {
        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(ApiServerError apiServerError) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(UserTransactionsActivity.this, new IAuthTabCallbackDefault(apiServerError));
        }
    }
}
