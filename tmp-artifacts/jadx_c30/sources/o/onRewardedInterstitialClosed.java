package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.onboarding.domain.entity.RecentNotification;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.RecomposerawaitIdle2;
import o.SetDetectableSize;
import o.onRewardedInterstitialClosed;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.adapter.model.RecentNotificationSectionItem;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onRewardedInterstitialClosed {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static char onExtraCallback;
    public static final onRewardedInterstitialClosed onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    static {
        IAuthTabCallback();
        onExtraCallbackWithResult = new onRewardedInterstitialClosed();
        int i = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ View IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        View view = (View) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1572857570, -1572857561, new Object[]{context});
        int i4 = asBinder + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        AppNode appNode = (AppNode) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(appNode);
        int i4 = onTransact + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -348445056, 348445060, new Object[]{str, setDetectableSize});
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppNode appNode) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor(appNode);
        }
        getInterfaceDescriptor(appNode);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(RecentNotification recentNotification, getBacktraceNote getbacktracenote, AppNode appNode, String str, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(recentNotification, getbacktracenote, appNode, str, compoundButton, z);
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit asBinder(AppNode appNode) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(appNode);
        int i4 = asBinder + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) objArr[0];
        RecentNotificationSectionItem.RecentNotificationTitle recentNotificationTitle = (RecentNotificationSectionItem.RecentNotificationTitle) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appMsgReceiver2, recentNotificationTitle);
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        boolean z;
        String str;
        Map map;
        Function1 function1;
        int i7;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        float f;
        float f2;
        float f3;
        float fIAuthTabCallback;
        int i8;
        int i9 = ~i5;
        int i10 = ~((~i6) | i9 | i4);
        int i11 = ~i4;
        int i12 = (~(i9 | i6)) | (~(i9 | i11)) | (~(i11 | i6));
        int i13 = (~(i11 | i5)) | i6;
        int i14 = i5 + i6 + i2 + ((-946781377) * i) + ((-59450693) * i3);
        int i15 = i14 * i14;
        int i16 = (((-143250568) * i5) - 346488832) + (357422218 * i6) + (i10 * (-1897147255)) + ((-1897147255) * i12) + (1897147255 * i13) + ((-2040397824) * i2) + ((-1205993472) * i) + ((-1651113984) * i3) + ((-884408320) * i15);
        int i17 = ((i5 * 358501064) - 1042343473) + (i6 * 358500518) + (i10 * (-273)) + (i12 * (-273)) + (i13 * 273) + (i2 * 358500791) + (i * (-249165559)) + (i3 * 1905372845) + (i15 * 573505536);
        switch (i16 + (i17 * i17 * (-553189376))) {
            case 1:
                int i18 = 2 % 2;
                int i19 = asBinder + 101;
                onTransact = i19 % 128;
                if (i19 % 2 != 0) {
                    z = true;
                    str = null;
                    map = null;
                    function1 = null;
                    i7 = 61;
                } else {
                    z = false;
                    str = null;
                    map = null;
                    function1 = null;
                    i7 = 30;
                }
                ConvertByteArrayToFloatArray.onExtraCallback(1311241L, z, str, map, function1, i7, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i20 = asBinder + 9;
                onTransact = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                Context context = (Context) objArr[0];
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
                TdsListHeaderV3View tdsListHeaderV3View = new TdsListHeaderV3View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
                tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
                Context context2 = tdsListHeaderV3View.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
                Configuration configuration = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
                tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration)).onRelationshipValidationResult());
                tdsListHeaderV3View.setTitleFontWeight(isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult());
                tdsListHeaderV3View.setDescriptionPosition(TdsListHeaderV3View.onWarmupCompleted.BOTTOM);
                tdsListHeaderV3View.setDescriptionType(TdsListHeaderV3View.IAuthTabCallback.TEXT);
                getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnWarmupCompleted = tdsListHeaderV3View.onWarmupCompleted();
                if (getminwebsocketmessagetocompressokhttpOnWarmupCompleted == null) {
                    return tdsListHeaderV3View;
                }
                int i23 = asBinder + 61;
                onTransact = i23 % 128;
                if (i23 % 2 != 0) {
                    getsupportedhighspeedresolutionsforOnExtraCallback = getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onExtraCallback();
                    quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onExtraCallback().onExtraCallbackWithResult();
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                    i8 = 111;
                } else {
                    getsupportedhighspeedresolutionsforOnExtraCallback = getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onExtraCallback();
                    quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onExtraCallback().onExtraCallbackWithResult();
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                    i8 = 7;
                }
                getsupportedhighspeedresolutionsforOnExtraCallback.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0, f, f2, f3, fIAuthTabCallback, i8, (Object) null));
                int i24 = onTransact + 69;
                asBinder = i24 % 128;
                int i25 = i24 % 2;
                return tdsListHeaderV3View;
            default:
                final String str2 = (String) objArr[0];
                int i26 = 2 % 2;
                Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
                ConvertByteArrayToFloatArray.onExtraCallback(1311381L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda17
                    public final Object invoke(Object obj) {
                        return onRewardedInterstitialClosed.IAuthTabCallback(str2, (SetDetectableSize) obj);
                    }
                }, 14, (Object) null);
                Unit unit2 = Unit.INSTANCE;
                int i27 = onTransact + 123;
                asBinder = i27 % 128;
                int i28 = i27 % 2;
                return unit2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function0, view);
        int i4 = onTransact + 41;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -562886687, 562886687, new Object[]{str});
        }
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AppNode appNode) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(appNode);
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, String str, AppNode appNode, RecentNotification recentNotification) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(getbacktracenote, str, appNode, recentNotification);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, str, appNode, recentNotification);
        int i3 = onTransact + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, RecentNotification recentNotification, String str, AppNode appNode, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, recentNotification, str, appNode, setDetectableSize);
        int i4 = onTransact + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1005439351, -1005439346, new Object[]{function0});
        int i4 = onTransact + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(function0, view);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function0, view);
        int i3 = onTransact + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, String str, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, str, view);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = asBinder + 3;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, Function0 function0, AppNode appNode, RecentNotificationSectionItem.PushRequirementFooter pushRequirementFooter) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, function0, appNode, pushRequirementFooter);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(RecentNotificationSectionItem.RecentNotificationMore recentNotificationMore, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1287673011, -1287673008, new Object[]{recentNotificationMore, view});
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1777258973, 1777258974, new Object[0]);
        }
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, AppNode appNode, RecentNotificationSectionItem.NotificationEnableSettingHeader notificationEnableSettingHeader) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, appNode, notificationEnableSettingHeader);
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppNode appNode) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(appNode);
        int i4 = onTransact + 107;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppNode appNode, RecentNotificationSectionItem.NotificationHeader notificationHeader) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(appNode, notificationHeader);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(appNode, notificationHeader);
        int i3 = asBinder + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppNode appNode, RecentNotificationSectionItem.RecentNotificationMore recentNotificationMore) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 561097073, -561097066, new Object[]{appNode, recentNotificationMore});
        int i4 = onTransact + 61;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(obj);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = asBinder + 87;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ View onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        View viewOnExtraCallback = onExtraCallback(context);
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return viewOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppNode appNode) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(appNode);
        int i4 = asBinder + 59;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppNode appNode, RecentNotificationSectionItem.NotificationContent notificationContent) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(appNode, notificationContent);
        }
        onExtraCallbackWithResult(appNode, notificationContent);
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asBinder = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(obj);
            obj2.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int i3 = onTransact + 121;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
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

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private onRewardedInterstitialClosed() {
    }

    private static final Unit asInterface(AppNode appNode) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = appNode.onExtraCallbackWithResult().onNavigationEvent();
        tdsListRowV1ViewOnNavigationEvent.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1ViewOnNavigationEvent.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24), varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24));
        Object[] objArr = new Object[1];
        a(new char[]{45974, 47760, 41375, 33829, 34153, 19908, 17063, 7655, 33008, 50433, 46473, 33775, 23259, 6752, 11123, 19407, 13526, 15836, 55539, 22110, 9430, 9463, 32841, 58381, 6703, 23358, 2727, 8584, 50782, 54643, 58171, 27533, 51073, 11384, 53191, 18681, 23259, 6752, 29120, 52644, 26677, 36597, 61410, 23347, 3271, 62290, 41149, 34231, 53437, 22858, 45138, 31665, 65507, 9593, 12435, 10476, 25921, 1199, 58171, 27533}, View.combineMeasuredStates(0, 0) + 60, objArr);
        tdsListRowV1ViewOnNavigationEvent.setLeftImage(((String) objArr[0]).intern());
        Intrinsics.checkNotNull(tdsListRowV1ViewOnNavigationEvent);
        Context context = tdsListRowV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        Object[] objArr2 = {new getUrlokhttp(new IAuthTabCallback(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        tdsListRowV1ViewOnNavigationEvent.setLeftImageColor(((Integer) getUrlokhttp.onNavigationEvent(objArr2, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        tdsListRowV1ViewOnNavigationEvent.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1ViewOnNavigationEvent.setCenterText1(tdsListRowV1ViewOnNavigationEvent.getContext().getString(R.string.app_push_token_disable));
        Context context2 = tdsListRowV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
        tdsListRowV1ViewOnNavigationEvent.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onPostMessage());
        tdsListRowV1ViewOnNavigationEvent.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1ViewOnNavigationEvent.setRightText1(tdsListRowV1ViewOnNavigationEvent.getContext().getString(R.string.app_push_token_on));
        Context context3 = tdsListRowV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, BuildConfig.FLAVOR);
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, BuildConfig.FLAVOR);
        tdsListRowV1ViewOnNavigationEvent.setRightText1Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallback(configuration3)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        tdsListRowV1ViewOnNavigationEvent.setRightArrow(true);
        int iIAuthTabCallback = varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 16);
        int iIAuthTabCallback2 = varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 16);
        tdsListRowV1ViewOnNavigationEvent.setPadding(varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24), iIAuthTabCallback, varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24), iIAuthTabCallback2);
        ConvertByteArrayToFloatArray.onExtraCallback(1311375L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onNavigationEvent(final Function0 function0, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1311377L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        hasMatchingMediaType.onNavigationEvent(context, new Function0() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda10
            public final Object invoke() {
                return onRewardedInterstitialClosed.onNavigationEvent();
            }
        }, new Function1() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return onRewardedInterstitialClosed.onExtraCallback((String) obj);
            }
        }, new Function0() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda12
            public final Object invoke() {
                return onRewardedInterstitialClosed.onExtraCallbackWithResult(function0);
            }
        });
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback("button_text", str);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(final Function0 function0, AppNode appNode, RecentNotificationSectionItem.NotificationEnableSettingHeader notificationEnableSettingHeader) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(notificationEnableSettingHeader, BuildConfig.FLAVOR);
        appNode.onExtraCallbackWithResult().onNavigationEvent().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {function0, view};
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                onRewardedInterstitialClosed.onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1370706611, 1370706617, objArr);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 23;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                        int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                        int minimumFlingVelocity = 12434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i12, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i13 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 9 - ImageFormat.getBitsPerPixel(0), (KeyEvent.getMaxKeyCode() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i13 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 16014), 14 - KeyEvent.normalizeMetaState(0), Color.alpha(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onExtraCallback(AppNode appNode, RecentNotificationSectionItem.NotificationHeader notificationHeader) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(notificationHeader, BuildConfig.FLAVOR);
        TdsTopV1View tdsTopV1ViewOnNavigationEvent = appNode.onExtraCallbackWithResult().onNavigationEvent();
        tdsTopV1ViewOnNavigationEvent.setUpperText(notificationHeader.onExtraCallback());
        tdsTopV1ViewOnNavigationEvent.setLowerText(notificationHeader.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 47;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    private static final boolean onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
        boolean z = obj instanceof RecentNotificationSectionItem.NotificationHeaderV2;
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static final View onExtraCallback(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        TdsTopV2View tdsTopV2View = new TdsTopV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV2View.setLowerGap(varyMatches.IAuthTabCallback(tdsTopV2View, 0));
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        Context context2 = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onUnminimized());
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String string = context.getString(R.string.app_notification_header_title_v2);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        tdsTopV2View.setTitleText(string);
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
        return tdsTopV2View;
    }

    private static final boolean onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
        boolean z = obj instanceof RecentNotificationSectionItem.RecentNotificationTitle;
        int i4 = asBinder + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static final Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, RecentNotificationSectionItem.RecentNotificationTitle recentNotificationTitle) {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        onTransact = i3 % 128;
        TdsListHeaderV3View tdsListHeaderV3View = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(recentNotificationTitle, BuildConfig.FLAVOR);
            boolean z = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent instanceof TdsListHeaderV3View;
            tdsListHeaderV3View.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(recentNotificationTitle, BuildConfig.FLAVOR);
        View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        if (view instanceof TdsListHeaderV3View) {
            tdsListHeaderV3View = (TdsListHeaderV3View) view;
            i = onTransact + 33;
            asBinder = i % 128;
        } else {
            i = asBinder + 121;
            onTransact = i % 128;
        }
        int i4 = i % 2;
        if (tdsListHeaderV3View != null) {
            tdsListHeaderV3View.setTitleText(recentNotificationTitle.onExtraCallback());
            tdsListHeaderV3View.setDescription(recentNotificationTitle.onNavigationEvent());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(boolean z, RecentNotification recentNotification, String str, AppNode appNode, SetDetectableSize setDetectableSize) throws Throwable {
        String str2;
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            int i3 = 12 / 0;
            if (z) {
                int i4 = asBinder + 5;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                str2 = "on";
            } else {
                int i6 = onTransact + 93;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                str2 = "off";
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            if (z) {
            }
        }
        setDetectableSize.onExtraCallback("toggle", str2);
        setDetectableSize.onExtraCallback("template_id", recentNotification.asBinder());
        setDetectableSize.onExtraCallback("message_id", recentNotification.IAuthTabCallback());
        Object[] objArr = new Object[1];
        a(new char[]{'C', 21237, 37872, 5824, 12473, 17639}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), recentNotification.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("content", recentNotification.onNavigationEvent());
        Object[] objArr2 = new Object[1];
        a(new char[]{30227, 60760, 34617, 2841}, 3 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_id", Long.valueOf(recentNotification.asInterface()));
        setDetectableSize.onExtraCallback("order", Integer.valueOf(appNode.getBindingAdapterPosition() - 1));
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(final RecentNotification recentNotification, getBacktraceNote getbacktracenote, final AppNode appNode, final String str, CompoundButton compoundButton, final boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, BuildConfig.FLAVOR);
        if (recentNotification.onWarmupCompleted() == z) {
            int i2 = onTransact + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = asBinder + 63;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            recentNotification.onExtraCallbackWithResult(z);
            ConvertByteArrayToFloatArray.onExtraCallback(1215273L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda19
                public final Object invoke(Object obj) {
                    return onRewardedInterstitialClosed.onExtraCallback(z, recentNotification, str, appNode, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            getbacktracenote.invoke(Integer.valueOf(appNode.getBindingAdapterPosition()), recentNotification, Boolean.valueOf(z));
        }
    }

    private static final Unit onNavigationEvent(final getBacktraceNote getbacktracenote, final String str, final AppNode appNode, final RecentNotification recentNotification) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(recentNotification, BuildConfig.FLAVOR);
        makeIrIpWithVIDR makeiripwithvidr = (makeIrIpWithVIDR) appNode.onExtraCallbackWithResult();
        makeiripwithvidr.onWarmupCompleted.setText(recentNotification.IAuthTabCallbackDefault());
        if (recentNotification.onNavigationEvent().length() > 0) {
            makeiripwithvidr.onExtraCallback.setText(recentNotification.onNavigationEvent());
            Typography7 typography7 = makeiripwithvidr.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(typography7, BuildConfig.FLAVOR);
            typography7.setVisibility(0);
        } else {
            Typography7 typography72 = makeiripwithvidr.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(typography72, BuildConfig.FLAVOR);
            typography72.setVisibility(8);
            int i4 = asBinder + 15;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        makeiripwithvidr.onNavigationEvent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                onRewardedInterstitialClosed.IAuthTabCallback(recentNotification, getbacktracenote, appNode, str, compoundButton, z);
            }
        });
        makeiripwithvidr.onNavigationEvent.setContentDescription(recentNotification.IAuthTabCallbackDefault() + " " + recentNotification.onNavigationEvent());
        makeiripwithvidr.onNavigationEvent.setChecked(recentNotification.onWarmupCompleted(), false);
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(AppNode appNode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = appNode.onExtraCallbackWithResult().onNavigationEvent();
        Intrinsics.checkNotNull(tdsListRowV1ViewOnNavigationEvent);
        Context context = tdsListRowV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, BuildConfig.FLAVOR);
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        tdsListRowV1ViewOnNavigationEvent.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new asInterface(configuration)).onWarmupCompleted());
        tdsListRowV1ViewOnNavigationEvent.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1ViewOnNavigationEvent.setPadding(varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24), varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24), varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24), varyMatches.IAuthTabCallback(tdsListRowV1ViewOnNavigationEvent, 24));
        tdsListRowV1ViewOnNavigationEvent.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1ViewOnNavigationEvent.setRightArrow(true);
        Context context2 = tdsListRowV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
        tdsListRowV1ViewOnNavigationEvent.setCenterText1Color(new getUrlokhttp(new onTransact(configuration2)).newSession());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RecentNotificationSectionItem.RecentNotificationMore recentNotificationMore = (RecentNotificationSectionItem.RecentNotificationMore) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        recentNotificationMore.onExtraCallback().invoke();
        if (i3 == 0) {
            return null;
        }
        int i4 = 83 / 0;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AppNode appNode = (AppNode) objArr[0];
        final RecentNotificationSectionItem.RecentNotificationMore recentNotificationMore = (RecentNotificationSectionItem.RecentNotificationMore) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(recentNotificationMore, BuildConfig.FLAVOR);
        appNode.onExtraCallbackWithResult().onNavigationEvent().setCenterText1(recentNotificationMore.onWarmupCompleted());
        appNode.onExtraCallbackWithResult().onNavigationEvent().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onRewardedInterstitialClosed.onExtraCallbackWithResult(recentNotificationMore, view);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(AppNode appNode) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        TdsImageView tdsImageView = ((issueCertificate_SendConf) appNode.onExtraCallbackWithResult()).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageView.getContext());
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsImageView.getContext());
        Object[] objArr = new Object[1];
        a(new char[]{45974, 47760, 41375, 33829, 34153, 19908, 17063, 7655, 33008, 50433, 46473, 33775, 23259, 6752, 11123, 19407, 13526, 15836, 55539, 22110, 9430, 9463, 34278, 29177, 46593, 41033, 42364, 46678, 12435, 10476, 26677, 36597, 40829, 56806, 60780, 45655, 40829, 56806, 33500, 45173}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 39, objArr);
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(onnavigationevent.onExtraCallback(((String) objArr[0]).intern()), tdsImageView);
        RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
        N_.onExtraCallback(onnavigationeventOnExtraCallback, 0);
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(AppNode appNode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = appNode.onExtraCallbackWithResult().onNavigationEvent();
        tdsListRowV1ViewOnNavigationEvent.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1ViewOnNavigationEvent.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        Intrinsics.checkNotNull(tdsListRowV1ViewOnNavigationEvent);
        Context context = tdsListRowV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        tdsListRowV1ViewOnNavigationEvent.setCenterText1Color(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AppNode appNode, RecentNotificationSectionItem.NotificationContent notificationContent) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(notificationContent, BuildConfig.FLAVOR);
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = appNode.onExtraCallbackWithResult().onNavigationEvent();
        tdsListRowV1ViewOnNavigationEvent.setLeftImage(notificationContent.IAuthTabCallback());
        tdsListRowV1ViewOnNavigationEvent.setCenterText1(notificationContent.onExtraCallback());
        tdsListRowV1ViewOnNavigationEvent.setCenterText2(notificationContent.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 109;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(AppNode appNode) {
        View viewFindViewById;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 103;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
            viewFindViewById = ((makeGenmGenp) appNode.onExtraCallbackWithResult()).IAuthTabCallback.findViewById(R.id.gradient);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, BuildConfig.FLAVOR);
            i = 97;
        } else {
            Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
            viewFindViewById = ((makeGenmGenp) appNode.onExtraCallbackWithResult()).IAuthTabCallback.findViewById(R.id.gradient);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, BuildConfig.FLAVOR);
            i = 8;
        }
        viewFindViewById.setVisibility(i);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function1 function1, String str, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(final Function1 function1, final Function0 function0, AppNode appNode, RecentNotificationSectionItem.PushRequirementFooter pushRequirementFooter) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(pushRequirementFooter, BuildConfig.FLAVOR);
        makeGenmGenp makegenmgenp = (makeGenmGenp) appNode.onExtraCallbackWithResult();
        final String strOnExtraCallbackWithResult = pushRequirementFooter.IAuthTabCallback().onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            TdsBottomCtaV1View tdsBottomCtaV1View = makegenmgenp.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, BuildConfig.FLAVOR);
            String string = makegenmgenp.getRoot().getContext().getString(R.string.recent_notification_setting_dialog_cta_title);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return onRewardedInterstitialClosed.onExtraCallbackWithResult(function1, strOnExtraCallbackWithResult, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            int i4 = onTransact + 49;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            TdsBottomCtaV1View tdsBottomCtaV1View2 = makegenmgenp.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, BuildConfig.FLAVOR);
            String string2 = makegenmgenp.getRoot().getContext().getString(R.string.recent_notification_setting_enable_dialog_cta_title);
            Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, string2, new Function1() { // from class: viva.republica.toss.main.more.notification.adapter.delegate.NotificationAdapterDelegateFactory$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return onRewardedInterstitialClosed.onExtraCallbackWithResult(function0, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(AppNode appNode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
        TdsTopV1View tdsTopV1ViewOnNavigationEvent = appNode.onExtraCallbackWithResult().onNavigationEvent();
        tdsTopV1ViewOnNavigationEvent.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        Intrinsics.checkNotNull(tdsTopV1ViewOnNavigationEvent);
        Context context = tdsTopV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        tdsTopV1ViewOnNavigationEvent.setUpperTextColor(ColorStateList.valueOf(new getUrlokhttp(new onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy()));
        tdsTopV1ViewOnNavigationEvent.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
        Context context2 = tdsTopV1ViewOnNavigationEvent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
        tdsTopV1ViewOnNavigationEvent.setUpperTextColor(ColorStateList.valueOf(new getUrlokhttp(new asBinder(configuration2)).onRelationshipValidationResult()));
        ViewGroup.LayoutParams layoutParams = tdsTopV1ViewOnNavigationEvent.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i2 = onTransact + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = varyMatches.IAuthTabCallback(tdsTopV1ViewOnNavigationEvent, 8);
        tdsTopV1ViewOnNavigationEvent.setLayoutParams(marginLayoutParams);
        Space spaceExtraCallbackWithResult = tdsTopV1ViewOnNavigationEvent.extraCallbackWithResult();
        ViewGroup.LayoutParams layoutParams2 = spaceExtraCallbackWithResult.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = varyMatches.IAuthTabCallback(tdsTopV1ViewOnNavigationEvent, 8);
        spaceExtraCallbackWithResult.setLayoutParams(layoutParams2);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 29;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppNode appNode) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 74383177, -74383175, new Object[]{appNode});
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0, View view) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1370706611, 1370706617, new Object[]{function0, view});
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, RecentNotificationSectionItem.RecentNotificationTitle recentNotificationTitle) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1311373484, 1311373492, new Object[]{appMsgReceiver2, recentNotificationTitle});
    }

    private static final Unit onWarmupCompleted() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1777258973, 1777258974, new Object[0]);
    }

    private static final Unit onNavigationEvent(String str) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -562886687, 562886687, new Object[]{str});
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -348445056, 348445060, new Object[]{str, setDetectableSize});
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1005439351, -1005439346, new Object[]{function0});
    }

    private static final Unit IAuthTabCallback(AppNode appNode, RecentNotificationSectionItem.RecentNotificationMore recentNotificationMore) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 561097073, -561097066, new Object[]{appNode, recentNotificationMore});
    }

    private static final void onNavigationEvent(RecentNotificationSectionItem.RecentNotificationMore recentNotificationMore, View view) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1287673011, -1287673008, new Object[]{recentNotificationMore, view});
    }

    private static final View onNavigationEvent(Context context) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (View) onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1572857570, -1572857561, new Object[]{context});
    }

    static void IAuthTabCallback() {
        onExtraCallback = (char) 65377;
        IAuthTabCallback = (char) 7941;
        onNavigationEvent = (char) 53988;
        onWarmupCompleted = (char) 30102;
    }
}
