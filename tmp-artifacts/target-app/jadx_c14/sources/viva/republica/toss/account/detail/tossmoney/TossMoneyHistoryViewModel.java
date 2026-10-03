package viva.republica.toss.account.detail.tossmoney;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CloseableUtils;
import o.DERConstructedSet;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.FullScreenAd;
import o.InterstitialAdExtendedListener;
import o.NativeLinkingManagerSpec;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.ReactInstanceEventListener;
import o.ReactInstanceManagerExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17$onBackPressed;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addExtra;
import o.addPolicy;
import o.captureComplete;
import o.findDirFile;
import o.findRes;
import o.findResAndMsg;
import o.getAdContentsView;
import o.getBacktraceNote;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getFormatWidth;
import o.getShine;
import o.getTileModeX;
import o.getTileModeY;
import o.handleCxxError;
import o.hasSubDirFile;
import o.isEnoughCapacity;
import o.isMixedAudience;
import o.isTestMode;
import o.makeName;
import o.maybeUpdateAnimatable;
import o.onDisclaimerClick;
import o.parseIndex;
import o.replaceFilename;
import o.replaceFilenameWithoutExtension;
import o.setFocusable;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.unsetNativeAd;
import o.writeRaw;
import o.ycxycx;
import o.zzad;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel$;
import viva.republica.toss.network.model.visitor.VisitorTossPointBalanceResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossMoneyHistoryViewModel extends isTestMode {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static long extraCommand = 0;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int newAuthTabSession = 1;
    private static int newSession = 1;
    public static final int onNavigationEvent;
    private static int prefetch;
    private final getBorderRadius<String> IAuthTabCallback;
    private final getCornerRadius<replaceFilename> IAuthTabCallbackDefault;
    private final getCornerRadius<Long> IAuthTabCallbackStub;
    private final getCornerRadius<Long> IAuthTabCallbackStubProxy;
    private final zzad IAuthTabCallback_Parcel;
    private final setRubIn<Boolean> ICustomTabsCallback;
    private final setRubIn<Long> ICustomTabsCallbackDefault;
    private final setRubIn<hasSubDirFile> ICustomTabsCallbackStub;
    private final setRubIn<replaceFilename> ICustomTabsCallbackStubProxy;
    private final unsetNativeAd ICustomTabsCallback_Parcel;
    private final setFocusable ICustomTabsService;
    private final getCornerRadius<replaceFilenameWithoutExtension> access000;
    private final setRubIn<isEnoughCapacity> access100;
    private final getCornerRadius<List<makeName>> asBinder;
    private final getCornerRadius<hasSubDirFile> asInterface;
    private final setRubIn<Boolean> extraCallback;
    private final setRubIn<Boolean> extraCallbackWithResult;
    private final getCornerRadius<parseIndex> getInterfaceDescriptor;
    private final setRubIn<Long> mayLaunchUrl;
    private final getAdContentsView onActivityLayout;
    private final setRubIn<List<makeName>> onActivityResized;
    private final getCornerRadius<Boolean> onExtraCallback;
    private final getCornerRadius<Boolean> onExtraCallbackWithResult;
    private onDisclaimerClick onMessageChannelReady;
    private final InterstitialAdExtendedListener onMinimized;
    private final zzag onPostMessage;
    private final setRubIn<parseIndex> onRelationshipValidationResult;
    private final getCornerRadius<Boolean> onTransact;
    private final setRubIn<replaceFilenameWithoutExtension> onUnminimized;
    private final getCornerRadius<isEnoughCapacity> onWarmupCompleted;
    private final getTileModeX<String> readTypedObject;
    private Date writeTypedObject;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TossMoneyHistoryViewModel.onWarmupCompleted(TossMoneyHistoryViewModel.this, (access13800) this);
        }
    }

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TossMoneyHistoryViewModel.IAuthTabCallback(UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), new Object[]{TossMoneyHistoryViewModel.this, this}, -1845331116, 1845331124);
        }
    }

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TossMoneyHistoryViewModel.this.onExtraCallback((access13800<? super Boolean>) this);
        }
    }

    static final class access000 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TossMoneyHistoryViewModel.onNavigationEvent(TossMoneyHistoryViewModel.this, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TossMoneyHistoryViewModel.IAuthTabCallback(TossMoneyHistoryViewModel.this, false, null, this);
        }
    }

    static {
        writeTypedObject();
        Companion = new onExtraCallbackWithResult(null);
        onNavigationEvent = 8;
        int i = newSession + 61;
        prefetch = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i7 | i6;
        int i9 = ~i8;
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i6));
        int i12 = i8 | i10;
        int i13 = (~(i | i6)) | (~(i7 | (~i6)));
        int i14 = i6 + i5 + i4 + ((-1311665080) * i2) + (1761575915 * i3);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i6) + 412680192 + (1917570655 * i5) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i4) + (175112192 * i2) + ((-649461760) * i3) + (1783169024 * i15);
        int i17 = ((i6 * 1226044109) - 1701849991) + (i5 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i4 * 1226043599) + (i2 * (-858626504)) + (i3 * 1069087493) + (i15 * 1627848704);
        boolean z = false;
        switch (i16 + (i17 * i17 * 739704832)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
                int i18 = 2 % 2;
                int i19 = isEngagementSignalsApiAvailable + 79;
                newAuthTabSession = i19 % 128;
                int i20 = i19 % 2;
                tossMoneyHistoryViewModel.onMinimized();
                int i21 = newAuthTabSession + 91;
                isEngagementSignalsApiAvailable = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                TossMoneyHistoryViewModel tossMoneyHistoryViewModel2 = (TossMoneyHistoryViewModel) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int iIntValue = ((Number) objArr[2]).intValue();
                Object obj = objArr[3];
                int i23 = 2 % 2;
                int i24 = newAuthTabSession + 93;
                int i25 = i24 % 128;
                isEngagementSignalsApiAvailable = i25;
                int i26 = i24 % 2;
                if ((iIntValue & 1) != 0) {
                    int i27 = i25 + 31;
                    newAuthTabSession = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    z = zBooleanValue;
                }
                IAuthTabCallback(UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), new Object[]{tossMoneyHistoryViewModel2, Boolean.valueOf(z)}, 405404310, -405404301);
                return null;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asInterface(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Boolean onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        Boolean bool = (Boolean) IAuthTabCallback(iOnExtraCallbackWithResult3, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{function1, obj}, 1753432092, -1753432092);
        int i3 = isEngagementSignalsApiAvailable + 43;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return bool;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Long l = (Long) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnWarmupCompleted = onWarmupCompleted(l);
        int i4 = isEngagementSignalsApiAvailable + 7;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return boolOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public TossMoneyHistoryViewModel(@NotNull setFocusable setfocusable, @NotNull unsetNativeAd unsetnativead, @NotNull InterstitialAdExtendedListener interstitialAdExtendedListener, @NotNull getAdContentsView getadcontentsview, @NotNull zzag zzagVar, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(setfocusable, "");
        Intrinsics.checkNotNullParameter(unsetnativead, "");
        Intrinsics.checkNotNullParameter(interstitialAdExtendedListener, "");
        Intrinsics.checkNotNullParameter(getadcontentsview, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.ICustomTabsService = setfocusable;
        this.ICustomTabsCallback_Parcel = unsetnativead;
        this.onMinimized = interstitialAdExtendedListener;
        this.onActivityLayout = getadcontentsview;
        this.onPostMessage = zzagVar;
        this.IAuthTabCallback_Parcel = zzadVar;
        this.onMessageChannelReady = DERConstructedSet.IAuthTabCallback();
        this.writeTypedObject = zzagVar.asBinder();
        getCornerRadius<parseIndex> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(parseIndex.onExtraCallback.onExtraCallback);
        this.getInterfaceDescriptor = getcornerradiusOnNavigationEvent;
        this.onRelationshipValidationResult = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getCornerRadius<isEnoughCapacity> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(isEnoughCapacity.ALL);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent2;
        setRubIn<isEnoughCapacity> setrubinOnExtraCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        this.access100 = setrubinOnExtraCallback;
        getCornerRadius<hasSubDirFile> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent(readTypedObject());
        this.asInterface = getcornerradiusOnNavigationEvent3;
        this.ICustomTabsCallbackStub = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent3);
        getCornerRadius<replaceFilenameWithoutExtension> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(new replaceFilenameWithoutExtension(null, null, null, 7, null));
        this.access000 = getcornerradiusOnNavigationEvent4;
        this.onUnminimized = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent4);
        getCornerRadius<replaceFilename> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent(replaceFilename.NONE);
        this.IAuthTabCallbackDefault = getcornerradiusOnNavigationEvent5;
        this.ICustomTabsCallbackStubProxy = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent5);
        Boolean bool = Boolean.FALSE;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent6 = setShine.onNavigationEvent(bool);
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent6;
        this.extraCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent6);
        getCornerRadius<List<makeName>> getcornerradiusOnNavigationEvent7 = setShine.onNavigationEvent(CollectionsKt.emptyList());
        this.asBinder = getcornerradiusOnNavigationEvent7;
        this.onActivityResized = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(ycxycx.onWarmupCompleted(getcornerradiusOnNavigationEvent7, setrubinOnExtraCallback, new IAuthTabCallback_Parcel(null))), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), getTileModeY.onWarmupCompleted.onExtraCallback(getTileModeY.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        getCornerRadius<Long> getcornerradiusOnNavigationEvent8 = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallbackStub = getcornerradiusOnNavigationEvent8;
        this.ICustomTabsCallbackDefault = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent8);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent9 = setShine.onNavigationEvent(bool);
        this.onTransact = getcornerradiusOnNavigationEvent9;
        this.extraCallbackWithResult = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent9);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent10 = setShine.onNavigationEvent(bool);
        this.onExtraCallback = getcornerradiusOnNavigationEvent10;
        this.ICustomTabsCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent10);
        getBorderRadius<String> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        this.readTypedObject = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        getCornerRadius<Long> getcornerradiusOnNavigationEvent11 = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallbackStubProxy = getcornerradiusOnNavigationEvent11;
        this.mayLaunchUrl = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent11);
    }

    public static final /* synthetic */ Object IAuthTabCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = tossMoneyHistoryViewModel.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        int i4 = newAuthTabSession + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ Object IAuthTabCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, boolean z, List list, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = tossMoneyHistoryViewModel.IAuthTabCallback(z, list, access13800Var);
        int i4 = isEngagementSignalsApiAvailable + 53;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ zzag IAuthTabCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        zzag zzagVar = tossMoneyHistoryViewModel.onPostMessage;
        int i5 = i3 + 3;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return zzagVar;
    }

    public static final /* synthetic */ void IAuthTabCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, Date date) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 125;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        tossMoneyHistoryViewModel.writeTypedObject = date;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 85;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackDefault(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 23;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = tossMoneyHistoryViewModel.onExtraCallbackWithResult;
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 71;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 != 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        writeRaw<Boolean> writerawOnPostMessage = tossMoneyHistoryViewModel.onPostMessage();
        int i4 = newAuthTabSession + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return writerawOnPostMessage;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackStub(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        getCornerRadius<Boolean> getcornerradius = tossMoneyHistoryViewModel.onExtraCallback;
        int i5 = i3 + 7;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackStubProxy(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 9;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getCornerRadius<parseIndex> getcornerradius = tossMoneyHistoryViewModel.getInterfaceDescriptor;
        int i5 = i3 + 77;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback_Parcel(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 9;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        getCornerRadius<List<makeName>> getcornerradius = tossMoneyHistoryViewModel.asBinder;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 15;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius access100(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 89;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<hasSubDirFile> getcornerradius = tossMoneyHistoryViewModel.asInterface;
        int i5 = i2 + 103;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ unsetNativeAd asBinder(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        unsetNativeAd unsetnativead = tossMoneyHistoryViewModel.ICustomTabsCallback_Parcel;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return unsetnativead;
    }

    public static final /* synthetic */ setFocusable asInterface(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 105;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        setFocusable setfocusable = tossMoneyHistoryViewModel.ICustomTabsService;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 49;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return setfocusable;
    }

    public static final /* synthetic */ void extraCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 25;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tossMoneyHistoryViewModel.onActivityLayout();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 73;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ zzad onExtraCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        zzad zzadVar = tossMoneyHistoryViewModel.IAuthTabCallback_Parcel;
        if (i3 != 0) {
            return zzadVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
            return IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{tossMoneyHistoryViewModel, access13800Var}, 2020268587, -2020268576);
        }
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        IAuthTabCallback(iOnExtraCallbackWithResult3, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{tossMoneyHistoryViewModel, access13800Var}, 2020268587, -2020268576);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ InterstitialAdExtendedListener onExtraCallbackWithResult(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        InterstitialAdExtendedListener interstitialAdExtendedListener = tossMoneyHistoryViewModel.onMinimized;
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        int i6 = i3 + 61;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        return interstitialAdExtendedListener;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, ReactInstanceManagerExternalSyntheticLambda0 reactInstanceManagerExternalSyntheticLambda0, ReactInstanceEventListener reactInstanceEventListener) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 75;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tossMoneyHistoryViewModel.onWarmupCompleted(reactInstanceManagerExternalSyntheticLambda0, reactInstanceEventListener);
        int i4 = isEngagementSignalsApiAvailable + 7;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object objOnTransact = tossMoneyHistoryViewModel.onTransact((access13800<? super Unit>) access13800Var);
        int i4 = isEngagementSignalsApiAvailable + 29;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return objOnTransact;
    }

    public static final /* synthetic */ getAdContentsView onNavigationEvent(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        getAdContentsView getadcontentsview = tossMoneyHistoryViewModel.onActivityLayout;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 29;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return getadcontentsview;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            tossMoneyHistoryViewModel.onExtraCallbackWithResult(access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = tossMoneyHistoryViewModel.onExtraCallbackWithResult(access13800Var);
        int i3 = isEngagementSignalsApiAvailable + 29;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ getBorderRadius onTransact(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 95;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<String> getborderradius = tossMoneyHistoryViewModel.IAuthTabCallback;
        int i5 = i2 + 39;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return getborderradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = tossMoneyHistoryViewModel.onNavigationEvent((access13800<? super Unit>) access13800Var);
        int i4 = isEngagementSignalsApiAvailable + 103;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ hasSubDirFile onWarmupCompleted(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        hasSubDirFile typedObject = tossMoneyHistoryViewModel.readTypedObject();
        int i4 = newAuthTabSession + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public final onDisclaimerClick onExtraCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 23;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        onDisclaimerClick ondisclaimerclick = this.onMessageChannelReady;
        int i5 = i2 + 13;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return ondisclaimerclick;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 101;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<parseIndex> setrubin = tossMoneyHistoryViewModel.onRelationshipValidationResult;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i2 + 23;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        return setrubin;
    }

    public final setRubIn<isEnoughCapacity> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<isEnoughCapacity> setrubin = this.access100;
        int i4 = i3 + 103;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 125;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 4;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), View.getDefaultSize(0, 0) + 24, 19628 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (extraCommand ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), Color.rgb(0, 0, 0) + 16777275, Color.blue(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 9;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 75;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), TextUtils.lastIndexOf("", '0') + 60, 6382 - TextUtils.lastIndexOf("", '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), TextUtils.getCapsMode("", 0, 0) + 59, View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        int i4 = i2 % 2;
        setRubIn<hasSubDirFile> setrubin = tossMoneyHistoryViewModel.ICustomTabsCallbackStub;
        int i5 = i3 + 45;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<replaceFilenameWithoutExtension> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        setRubIn<replaceFilenameWithoutExtension> setrubin = this.onUnminimized;
        int i4 = i3 + 21;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 5;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<replaceFilename> setrubin = tossMoneyHistoryViewModel.ICustomTabsCallbackStubProxy;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 115;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public final setRubIn<Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 85;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<Boolean> setrubin = this.extraCallback;
        int i4 = i2 + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements getBacktraceNote<List<? extends makeName>, isEnoughCapacity, access13800<? super List<? extends makeName>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[isEnoughCapacity.values().length];
                try {
                    iArr[isEnoughCapacity.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[isEnoughCapacity.DEPOSIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[isEnoughCapacity.WITHDRAW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                onWarmupCompleted = iArr;
            }
        }

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(3, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends makeName> list, isEnoughCapacity isenoughcapacity, access13800<? super List<? extends makeName>> access13800Var) {
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(access13800Var);
            iAuthTabCallback_Parcel.L$0 = list;
            iAuthTabCallback_Parcel.L$1 = isenoughcapacity;
            return iAuthTabCallback_Parcel.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            List list = (List) this.L$0;
            isEnoughCapacity isenoughcapacity = (isEnoughCapacity) this.L$1;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i = onNavigationEvent.onWarmupCompleted[isenoughcapacity.ordinal()];
            if (i == 1) {
                return list;
            }
            if (i == 2) {
                return findDirFile.onExtraCallbackWithResult(list, getFormatWidth.INCOME);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return findDirFile.onExtraCallbackWithResult(list, getFormatWidth.EXPENSE);
        }
    }

    public final setRubIn<List<makeName>> asInterface() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 29;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<List<makeName>> setrubin = this.onActivityResized;
        int i5 = i2 + 95;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public final setRubIn<Long> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        setRubIn<Long> setrubin = this.ICustomTabsCallbackDefault;
        int i5 = i3 + 69;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 61;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = this.extraCallbackWithResult;
        int i5 = i2 + 107;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public final setRubIn<Boolean> access100() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        setRubIn<Boolean> setrubin = this.ICustomTabsCallback;
        int i5 = i3 + 61;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        throw null;
    }

    public final getTileModeX<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 21;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getTileModeX<String> gettilemodex = this.readTypedObject;
        int i5 = i3 + 95;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    public final setRubIn<Long> access000() {
        setRubIn<Long> setrubin;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 21;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            setrubin = this.mayLaunchUrl;
            int i4 = 1 / 0;
        } else {
            setrubin = this.mayLaunchUrl;
        }
        int i5 = i2 + 11;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $update;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$update = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TossMoneyHistoryViewModel.this.new onNavigationEvent(this.$update, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        
            if (viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onExtraCallback(r7, true, null, r13, 2, null) == r0) goto L35;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r13.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L27
                if (r1 == r4) goto L22
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.ResultKt.onNavigationEvent(r14)
                goto Laf
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L22:
                kotlin.ResultKt.onNavigationEvent(r14)
                goto L9f
            L27:
                kotlin.ResultKt.onNavigationEvent(r14)
                goto L62
            L2b:
                kotlin.ResultKt.onNavigationEvent(r14)
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                o.getCornerRadius r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallbackDefault(r14)
                java.lang.Boolean r1 = o.access14000.onNavigationEvent(r6)
                r14.onWarmupCompleted(r1)
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                o.getCornerRadius r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallbackStub(r14)
                boolean r1 = r13.$update
                java.lang.Boolean r1 = o.access14000.onNavigationEvent(r1)
                r14.onWarmupCompleted(r1)
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                o.zzag r1 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallback(r14)
                java.util.Date r1 = r1.asBinder()
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallback(r14, r1)
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                r13.label = r5
                java.lang.Object r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onNavigationEvent(r14, r13)
                if (r14 != r0) goto L62
                goto Lca
            L62:
                o.PlayerErrorCode r14 = o.PlayerErrorCode.onWarmupCompleted
                boolean r1 = o.addExtra.extraCallback(r14)
                if (r1 == 0) goto L75
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                r13.label = r4
                java.lang.Object r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallback(r14, r13)
                if (r14 != r0) goto L9f
                goto Lca
            L75:
                boolean r14 = o.addExtra.IAuthTabCallback(r14)
                if (r14 == 0) goto L95
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                o.zzad r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onExtraCallback(r14)
                boolean r14 = r14.onActivityLayout()
                if (r14 != 0) goto L95
                o.DERSet r14 = o.DERSet.onExtraCallback
                boolean r14 = r14.onRequestPermissionsResult()
                if (r14 != 0) goto L95
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.extraCallback(r14)
                goto L9f
            L95:
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                r13.label = r3
                java.lang.Object r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onExtraCallbackWithResult(r14, r13)
                if (r14 == r0) goto Lca
            L9f:
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r7 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                r13.label = r2
                r8 = 1
                r9 = 0
                r11 = 2
                r12 = 0
                r10 = r13
                java.lang.Object r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onExtraCallback(r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto Laf
                goto Lca
            Laf:
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                o.getCornerRadius r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallbackStub(r14)
                java.lang.Boolean r0 = o.access14000.onNavigationEvent(r6)
                r14.onWarmupCompleted(r0)
                viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.this
                o.getCornerRadius r14 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallbackStubProxy(r14)
                o.parseIndex$onExtraCallbackWithResult r0 = o.parseIndex.onExtraCallbackWithResult.onExtraCallbackWithResult
                r14.onWarmupCompleted(r0)
                kotlin.Unit r14 = kotlin.Unit.INSTANCE
                return r14
            Lca:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(tossMoneyHistoryViewModel), (CoroutineContext) null, (setRandomHost) null, tossMoneyHistoryViewModel.new onNavigationEvent(((Boolean) objArr[1]).booleanValue(), null), 3, (Object) null);
        int i2 = newAuthTabSession + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new asBinder(this, (access13800) null), access13800Var);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            Unit unit = Unit.INSTANCE;
            int i2 = newAuthTabSession + 105;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }
        int i4 = isEngagementSignalsApiAvailable;
        int i5 = i4 + 31;
        newAuthTabSession = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 111;
        newAuthTabSession = i7 % 128;
        if (i7 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        final /* synthetic */ String $accountId;
        Object L$0;
        int label;
        private static char[] onNavigationEvent = {32400, 32406, 32403, 32614, 32401, 32407, 32412, 32585, 32604, 32413, 32609, 32414, 32411, 32394, 32606, 32608, 32610, 32612, 32588, 32613, 32590, 32615, 32638, 32631, 32578, 32634};
        private static int onWarmupCompleted = -1184334077;
        private static boolean onExtraCallback = true;
        private static boolean onExtraCallbackWithResult = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(String str, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$accountId = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = TossMoneyHistoryViewModel.this.new getInterfaceDescriptor(this.$accountId, access13800Var);
            int i2 = asBinder + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return getinterfacedescriptor;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = asBinder + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 87;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int i3 = $10 + 9;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 77 - Color.red(0), 20952 - (KeyEvent.getMaxKeyCode() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 75 - TextUtils.getTrimmedLength(""), 16036 - Process.getGidForName(""), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            if (onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 63 - KeyEvent.getDeadChar(0, 0), 12215 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i7 = $10 + 53;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 115;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i11 = $11 + 47;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i13 = $10 + 49;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63, 12213 - TextUtils.lastIndexOf("", '0', 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i6 = 1052772399;
            }
            String str = new String(cArr6);
            int i15 = $11 + 63;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i16 = 99 / 0;
                objArr[0] = str;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (r10 != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            if (r10 != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ea, code lost:
        
            if (r2.emit(r10, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ec, code lost:
        
            r10 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.getInterfaceDescriptor.IAuthTabCallback + 13;
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.getInterfaceDescriptor.asBinder = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
        
            if ((r10 % 2) != 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
        
            r10 = 27 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.getInterfaceDescriptor.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super VisitorTossPointBalanceResponse>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ TossMoneyHistoryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(access13800 access13800Var, TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
            super(2, access13800Var);
            this.this$0 = tossMoneyHistoryViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onTransact(access13800Var, this.this$0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super VisitorTossPointBalanceResponse> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                unsetNativeAd unsetnativeadAsBinder = TossMoneyHistoryViewModel.asBinder(this.this$0);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = unsetnativeadAsBinder.IAuthTabCallback(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (VisitorTossPointBalanceResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.visitor.VisitorTossPointBalanceResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(VisitorTossPointBalanceResponse.class, Object.class) || Intrinsics.areEqual(VisitorTossPointBalanceResponse.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(o.access13800<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallbackDefault
            if (r1 == 0) goto L16
            r1 = r8
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel$IAuthTabCallbackDefault r1 = (viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallbackDefault) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.label = r2
            goto L1b
        L16:
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel$IAuthTabCallbackDefault r1 = new viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel$IAuthTabCallbackDefault
            r1.<init>(r8)
        L1b:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L42
            if (r3 != r4) goto L3a
            int r2 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.isEngagementSignalsApiAvailable
            int r2 = r2 + 59
            int r3 = r2 % 128
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.newAuthTabSession = r3
            int r2 = r2 % r0
            java.lang.Object r1 = r1.L$0
            o.access13800 r1 = (o.access13800) r1
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            goto L7c
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L42:
            kotlin.ResultKt.onNavigationEvent(r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            o.GeckoHubImp r8 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel$onTransact r3 = new viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel$onTransact     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            r3.<init>(r5, r7)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            java.lang.Object r6 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            r1.L$0 = r6     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            r6 = 0
            r1.I$0 = r6     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            r1.I$1 = r6     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            r1.I$2 = r6     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            r1.label = r4     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r8, r3, r1)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            if (r8 != r2) goto L7c
            int r8 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.newAuthTabSession
            int r1 = r8 + 53
            int r3 = r1 % 128
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.isEngagementSignalsApiAvailable = r3
            int r1 = r1 % r0
            int r8 = r8 + 113
            int r1 = r8 % 128
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.isEngagementSignalsApiAvailable = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L78
            return r2
        L78:
            r5.hashCode()
            throw r5
        L7c:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8d o.WebResourceResponseModel -> L8f
            goto La3
        L81:
            r8 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto La3
        L8d:
            r8 = move-exception
            throw r8
        L8f:
            r8 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            int r1 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.isEngagementSignalsApiAvailable
            int r1 = r1 + 85
            int r2 = r1 % 128
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.newAuthTabSession = r2
            int r1 = r1 % r0
        La3:
            boolean r0 = kotlin.Result.onExtraCallback(r8)
            if (r0 == 0) goto Laa
            goto Lab
        Laa:
            r5 = r8
        Lab:
            viva.republica.toss.network.model.visitor.VisitorTossPointBalanceResponse r5 = (viva.republica.toss.network.model.visitor.VisitorTossPointBalanceResponse) r5
            if (r5 != 0) goto Lb2
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Lb2:
            o.getCornerRadius<java.lang.Long> r8 = r7.IAuthTabCallbackStubProxy
            long r0 = r5.onExtraCallback()
            java.lang.Long r0 = o.access14000.onExtraCallback(r0)
            r8.onWarmupCompleted(r0)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onNavigationEvent(o.access13800):java.lang.Object");
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new IAuthTabCallback(tossMoneyHistoryViewModel, (access13800) null), (access13800) objArr[1]);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = newAuthTabSession;
        int i3 = i2 + 69;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = i2 + 31;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.asInterface.onWarmupCompleted(readTypedObject());
            obj.hashCode();
            throw null;
        }
        this.asInterface.onWarmupCompleted(readTypedObject());
        int i3 = isEngagementSignalsApiAvailable + 55;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.onWarmupCompleted(Boolean.TRUE);
        int i4 = newAuthTabSession + 33;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] IAuthTabCallback;
        final /* synthetic */ String $accountId;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ TossMoneyHistoryViewModel this$0;
        private static final byte[] $$a = {19, 50, -9, 119};
        private static final int $$b = 213;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onWarmupCompleted = -187314902;
        private static int onExtraCallbackWithResult = -1538795489;
        private static int onNavigationEvent = -1464931122;
        private static byte[] onExtraCallback = {61, 107, 106, -103, 63, 99, 86, 99, 121, 109, 111, -113, 72, 83, 102, 95, -95, 109, 82, 36, 109, 97, 104, 111, 122, 82, 104, 111, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, short r8) {
            /*
                int r6 = r6 + 4
                int r8 = r8 * 3
                int r8 = r8 + 115
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r0 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.access100.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r4 = r0[r6]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2a:
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.access100.$$c(short, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(String str, TossMoneyHistoryViewModel tossMoneyHistoryViewModel, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$accountId = str;
            this.this$0 = tossMoneyHistoryViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = new access100(this.$accountId, this.this$0, access13800Var);
            int i2 = IAuthTabCallbackStub + 5;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return access100Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                access100VarCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = access100VarCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallbackDefault + 41;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            boolean z;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetBefore("", 0)), 42 - View.MeasureSpec.getSize(0), TextUtils.getCapsMode("", 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i6 = -1;
                if (iIntValue == -1) {
                    i4 = 1;
                } else {
                    int i7 = $10 + 29;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 0;
                }
                if (i4 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr = onExtraCallback;
                    if (bArr != null) {
                        int i9 = $10 + 29;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i11 = 0;
                        while (i11 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.blue(0) + 55, KeyEvent.keyCodeFromString("") + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i6 = -1;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetBefore("", 0)), View.resolveSize(0, 0) + 42, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 86, 9566 - TextUtils.indexOf((CharSequence) "", '0', 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int i12 = $10 + 93;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            int i15 = $10 + 71;
                            $11 = i15 % 128;
                            if (i15 % 2 == 0) {
                                bArr5[i14] = (byte) (bArr4[i14] - 4629411779493505016L);
                            } else {
                                bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i16 = $10 + 61;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        
            if (r3 != r2) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00fb, code lost:
        
            if (r5.emit(r4, r17) != r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00fd, code lost:
        
            r3 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.access100.IAuthTabCallbackStub + 19;
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.access100.IAuthTabCallbackDefault = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0106, code lost:
        
            return r2;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.access100.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.access13800<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    private final void onWarmupCompleted(ReactInstanceManagerExternalSyntheticLambda0 reactInstanceManagerExternalSyntheticLambda0, ReactInstanceEventListener reactInstanceEventListener) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer = addPolicy.RemoteActionCompatParcelizer();
        Object[] objArr = new Object[1];
        a(new char[]{45299, 37937, 63837, 56956, 9098, 2274, 28130, 45312, 38459, 64338, 49317, 9662, 2755, 28651, 45883, 38990, 64847, 49797, 10155, 3318, 20509, 46393, 39545, 65432, 50349, 10712, 3822, 20998, 46947, 40055, 57743, 50857, 11214, 3868, 21536}, MotionEvent.axisFromString("") + 9434, objArr);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer.onExtraCallback(((String) objArr[0]).intern(), false);
        this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(reactInstanceEventListener.onWarmupCompleted()));
        handleCxxError handlecxxerrorIAuthTabCallback = reactInstanceManagerExternalSyntheticLambda0.IAuthTabCallback();
        if ((handlecxxerrorIAuthTabCallback == null || !handlecxxerrorIAuthTabCallback.onNavigationEvent()) && !reactInstanceEventListener.IAuthTabCallback()) {
            if (zOnExtraCallback) {
                onMinimized();
                return;
            }
            this.IAuthTabCallbackDefault.onWarmupCompleted(replaceFilename.GUIDE);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer2 = addPolicy.RemoteActionCompatParcelizer();
            Object[] objArr2 = new Object[1];
            a(new char[]{45299, 37937, 63837, 56956, 9098, 2274, 28130, 45312, 38459, 64338, 49317, 9662, 2755, 28651, 45883, 38990, 64847, 49797, 10155, 3318, 20509, 46393, 39545, 65432, 50349, 10712, 3822, 20998, 46947, 40055, 57743, 50857, 11214, 3868, 21536}, 9433 - Color.blue(0), objArr2);
            textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer2.onNavigationEvent(((String) objArr2[0]).intern(), true);
            return;
        }
        if (!reactInstanceEventListener.IAuthTabCallbackStub()) {
            this.IAuthTabCallbackDefault.onWarmupCompleted(replaceFilename.WARNING);
            return;
        }
        int i4 = newAuthTabSession + 91;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            this.IAuthTabCallbackDefault.onWarmupCompleted(replaceFilename.REACHED);
            int i5 = 39 / 0;
        } else {
            this.IAuthTabCallbackDefault.onWarmupCompleted(replaceFilename.REACHED);
        }
        int i6 = isEngagementSignalsApiAvailable + 39;
        newAuthTabSession = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r1
      0x001d: PHI (r1v5 o.onDisclaimerClick) = (r1v4 o.onDisclaimerClick), (r1v7 o.onDisclaimerClick) binds: [B:10:0x001b, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final o.hasSubDirFile readTypedObject() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.newAuthTabSession
            int r1 = r1 + 115
            int r2 = r1 % 128
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.isEngagementSignalsApiAvailable = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            o.onDisclaimerClick r1 = r11.onMessageChannelReady
            if (r1 == 0) goto L15
            goto L1d
        L15:
            r2 = 1
        L17:
            r5 = r2
            goto L24
        L19:
            o.onDisclaimerClick r1 = r11.onMessageChannelReady
            if (r1 == 0) goto L17
        L1d:
            r4 = 1
            r5 = 0
            long r2 = o.KeyBoardVisiblePoint.onExtraCallback(r1, r2, r4, r5)
            goto L17
        L24:
            o.hasSubDirFile r1 = new o.hasSubDirFile
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r4 = r1
            r4.<init>(r5, r7, r8, r9, r10)
            int r2 = viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.isEngagementSignalsApiAvailable
            int r2 = r2 + 93
            int r3 = r2 % 128
            viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.newAuthTabSession = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.readTypedObject():o.hasSubDirFile");
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TossMoneyHistoryViewModel.this.new asInterface(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                TossMoneyHistoryViewModel tossMoneyHistoryViewModel = TossMoneyHistoryViewModel.this;
                List list = (List) TossMoneyHistoryViewModel.IAuthTabCallback_Parcel(tossMoneyHistoryViewModel).IAuthTabCallback();
                this.label = 1;
                if (TossMoneyHistoryViewModel.IAuthTabCallback(tossMoneyHistoryViewModel, false, list, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(null), 3, (Object) null);
        int i2 = newAuthTabSession + 57;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onTransact(o.access13800<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onTransact(o.access13800):java.lang.Object");
    }

    public final void IAuthTabCallback(@NotNull isEnoughCapacity isenoughcapacity) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 15;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isenoughcapacity, "");
        this.onWarmupCompleted.onWarmupCompleted(isenoughcapacity);
        int i4 = isEngagementSignalsApiAvailable + 95;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object onExtraCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, boolean z, List list, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = newAuthTabSession + 65;
        int i4 = i3 % 128;
        isEngagementSignalsApiAvailable = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i4 + 77;
            newAuthTabSession = i5 % 128;
            int i6 = i5 % 2;
            list = null;
        }
        return tossMoneyHistoryViewModel.IAuthTabCallback(z, list, access13800Var);
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super captureComplete>, Object> {
        final /* synthetic */ onDisclaimerClick $account$inlined;
        final /* synthetic */ boolean $refresh$inlined;
        final /* synthetic */ String $syncYearMonth$inlined;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, onDisclaimerClick ondisclaimerclick, String str, boolean z) {
            super(2, access13800Var);
            this.$account$inlined = ondisclaimerclick;
            this.$syncYearMonth$inlined = str;
            this.$refresh$inlined = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(access13800Var, this.$account$inlined, this.$syncYearMonth$inlined, this.$refresh$inlined);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super captureComplete> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getLongPressTimeout() >> 16)), 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.alpha(0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29426), (KeyEvent.getMaxKeyCode() >> 16) + 22, 24735 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
                    }
                    FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    String strOnNavigationEvent = this.$account$inlined.onNavigationEvent(":");
                    Intrinsics.checkNotNull(this.$syncYearMonth$inlined);
                    writeRaw<NativeLinkingManagerSpec> writerawOnExtraCallbackWithResult = fullScreenAd.onExtraCallbackWithResult(strOnNavigationEvent, this.$syncYearMonth$inlined, this.$refresh$inlined);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
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
            }
            Intrinsics.checkNotNullExpressionValue(obj, "");
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (captureComplete) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.home.AccountTransactionOverview");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(captureComplete.class, Object.class) || Intrinsics.areEqual(captureComplete.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(boolean r21, java.util.List<? extends o.makeName> r22, o.access13800<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.IAuthTabCallback(boolean, java.util.List, o.access13800):java.lang.Object");
    }

    public final boolean extraCallback() throws Throwable {
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer = addPolicy.RemoteActionCompatParcelizer();
        Object[] objArr = new Object[1];
        a(new char[]{45299, 47389, 41733, 44328, 38714, 33046, 35599, 62727, 65399, 59692, 54052, 56664, 51082, 12696, 15252, 9647, 12197, 6564, 982, 3568, 30661, 25082, 27629, 21996, 24077, 18435, 45590, 48136, 42531, 36911, 39508, 33860, 36417, 63591, 57966, 60566, 54938, 49294}, 2549 - Color.argb(0, 0, 0, 0), objArr);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer.onExtraCallback(((String) objArr[0]).intern(), false);
        int iWriteTypedObject = PlayerErrorCode.writeTypedObject();
        if (14 <= iWriteTypedObject) {
            int i2 = isEngagementSignalsApiAvailable + 3;
            newAuthTabSession = i2 % 128;
            int i3 = i2 % 2;
            if (iWriteTypedObject < 17 && !zOnExtraCallback) {
                return true;
            }
        }
        int i4 = newAuthTabSession + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Boolean> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.detail.tossmoney.TossMoneyHistoryViewModel.onExtraCallback(o.access13800):java.lang.Object");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = newAuthTabSession + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private final writeRaw<Boolean> onPostMessage() {
        int i = 2 % 2;
        writeRaw<Boolean> writerawOnWarmupCompleted = isMixedAudience.onExtraCallback.onExtraCallback().IAuthTabCallback(NetConverter3.onExtraCallback()).onWarmupCompleted(new TossMoneyHistoryViewModel$.ExternalSyntheticLambda1(new TossMoneyHistoryViewModel$.ExternalSyntheticLambda0()));
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        int i2 = isEngagementSignalsApiAvailable + 79;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnWarmupCompleted;
    }

    private static final Boolean onWarmupCompleted(Long l) {
        boolean z;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 105;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(l, "");
        if (l.longValue() <= 30) {
            int i4 = newAuthTabSession;
            int i5 = i4 + 117;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 41;
            isEngagementSignalsApiAvailable = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 119;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (!(!addExtra.extraCallback(playerErrorCode))) {
            return "VISITOR";
        }
        if (addExtra.IAuthTabCallback(playerErrorCode)) {
            return "NORMAL";
        }
        int i3 = newAuthTabSession + 63;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return "TEENS";
    }

    public final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = newAuthTabSession;
        int i3 = i2 + 87;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        onDisclaimerClick ondisclaimerclick = this.onMessageChannelReady;
        if (ondisclaimerclick != null) {
            int i5 = i2 + 55;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 != 0) {
                ondisclaimerclick.onExtraCallbackWithResult();
                throw null;
            }
            String strOnExtraCallbackWithResult = ondisclaimerclick.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new access100(strOnExtraCallbackWithResult, this, null), 3, (Object) null);
                int i6 = newAuthTabSession + 45;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossMoneyHistoryViewModel tossMoneyHistoryViewModel = (TossMoneyHistoryViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        int i3 = i2 % 128;
        newAuthTabSession = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            onDisclaimerClick ondisclaimerclick = tossMoneyHistoryViewModel.onMessageChannelReady;
            if (ondisclaimerclick != null) {
                int i4 = i3 + 53;
                isEngagementSignalsApiAvailable = i4 % 128;
                if (i4 % 2 != 0) {
                    ondisclaimerclick.onExtraCallbackWithResult();
                    obj.hashCode();
                    throw null;
                }
                String strOnExtraCallbackWithResult = ondisclaimerclick.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult != null) {
                    maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(tossMoneyHistoryViewModel), (CoroutineContext) null, (setRandomHost) null, tossMoneyHistoryViewModel.new getInterfaceDescriptor(strOnExtraCallbackWithResult, null), 3, (Object) null);
                }
            }
            return null;
        }
        onDisclaimerClick ondisclaimerclick2 = tossMoneyHistoryViewModel.onMessageChannelReady;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Boolean IAuthTabCallback(Long l) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (Boolean) IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{l}, 1748019053, -1748019047);
    }

    public static final /* synthetic */ void getInterfaceDescriptor(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{tossMoneyHistoryViewModel}, -1183612994, 1183612996);
    }

    public static final /* synthetic */ writeRaw access000(TossMoneyHistoryViewModel tossMoneyHistoryViewModel) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (writeRaw) IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{tossMoneyHistoryViewModel}, -840945630, 840945640);
    }

    public static final /* synthetic */ Object onExtraCallback(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{tossMoneyHistoryViewModel, access13800Var}, -1845331116, 1845331124);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossMoneyHistoryViewModel tossMoneyHistoryViewModel, boolean z, int i, Object obj) {
        Object[] objArr = {tossMoneyHistoryViewModel, Boolean.valueOf(z), Integer.valueOf(i), obj};
        IAuthTabCallback(UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), objArr, -1042033213, 1042033218);
    }

    private static final Boolean IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (Boolean) IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 1753432092, -1753432092);
    }

    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, access13800Var}, 2020268587, -2020268576);
    }

    public final setRubIn<hasSubDirFile> asBinder() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (setRubIn) IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 44420776, -44420769);
    }

    public final setRubIn<replaceFilename> onTransact() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (setRubIn) IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 768302912, -768302911);
    }

    public final setRubIn<parseIndex> getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        return (setRubIn) IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -761180091, 761180094);
    }

    public final void onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        IAuthTabCallback(UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), objArr, 405404310, -405404301);
    }

    public final void extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        IAuthTabCallback(iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 1454684208, -1454684204);
    }

    static void writeTypedObject() {
        extraCommand = -8021429068777048649L;
    }
}
