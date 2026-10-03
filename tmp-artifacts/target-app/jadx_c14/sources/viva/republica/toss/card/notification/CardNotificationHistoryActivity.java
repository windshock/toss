package viva.republica.toss.card.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdImpl;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BuildConfigApi;
import o.CERT_EncryptPrikeyInfo;
import o.CacheFlag;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DefaultMediaViewVideoRendererApi;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.InitSettingsBuilder;
import o.KeyAgreeRecipientIdentifier;
import o.MapConverter;
import o.NetConverter3;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.RememberObserverHolder;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access502;
import o.alertWithArgs;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.exitAllPages;
import o.findResAndMsg;
import o.getAdService;
import o.getDummyAd;
import o.getParamImp;
import o.getRKeyID;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getVersionOverride;
import o.initMiniApp;
import o.launchUrl;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.readIntokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setTagBytes;
import o.setVisitUrl;
import o.varyMatches;
import o.writeRaw;
import o.zzbe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.card.notification.CardNotificationFailedActivity;
import viva.republica.toss.card.notification.CardNotificationHistoryActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardNotificationHistoryActivity extends Hilt_CardNotificationHistoryActivity implements KeyAgreeRecipientIdentifier {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 0;
    private static char[] access000 = null;
    public static final int asBinder;
    private static int extraCallback = 0;
    private static boolean extraCallbackWithResult = false;
    private static int onMinimized = 1;
    private static int readTypedObject = 1;
    private static boolean writeTypedObject;
    private Function1<? super Boolean, Unit> IAuthTabCallback_Parcel;
    private boolean access100;
    private String asInterface;

    @Inject
    public getDummyAd termsIntent;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new access000(this));
    private final SessionTrackera getInterfaceDescriptor = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda28
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj};
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            return (Unit) CardNotificationHistoryActivity.IAuthTabCallback(objArr, 2042218043, alertWithArgs.onExtraCallbackWithResult(), -2042218037, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        }
    });
    private boolean onTransact = true;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda29
        public final Object invoke() {
            return CardNotificationHistoryActivity.IAuthTabCallback(this.f$0);
        }
    });

    public static final /* synthetic */ class asBinder {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[DefaultMediaViewVideoRendererApi.values().length];
            try {
                iArr[DefaultMediaViewVideoRendererApi.NOT_SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultMediaViewVideoRendererApi.UNSUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        IAuthTabCallback();
        Companion = new onWarmupCompleted(null);
        asBinder = 8;
        int i = onMinimized + 71;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardNotificationHistoryActivity, th);
        int i4 = readTypedObject + 125;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i) | i7);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i)) | (~(i3 | i));
        int i11 = i7 | i;
        int i12 = i9 | i11;
        int i13 = i3 + i + i4 + ((-1542968645) * i6) + (1789173782 * i2);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i3) + 752877568 + ((-368479342) * i) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i4) + (1802502144 * i6) + (148897792 * i2) + (289275904 * i14);
        int i16 = (i3 * (-930071408)) + 1959937684 + (i * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i4 * (-930070801)) + (i6 * 1059663509) + (i2 * (-1428764534)) + (i14 * 484573184);
        switch (i15 + (i16 * i16 * 411172864)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i17 = 2 % 2;
                int i18 = readTypedObject + 67;
                extraCallback = i18 % 128;
                int i19 = i18 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(getversionoverride, zBooleanValue, setDetectableSize);
                int i20 = extraCallback + 79;
                readTypedObject = i20 % 128;
                int i21 = i20 % 2;
                return unitIAuthTabCallback;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                int i22 = 2 % 2;
                IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault((CardNotificationHistoryActivity) objArr[0]);
                int i23 = readTypedObject + 25;
                extraCallback = i23 % 128;
                int i24 = i23 % 2;
                return iAuthTabCallbackDefault;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(getversionoverride, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getversionoverride, setDetectableSize);
        int i3 = readTypedObject + 117;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, list, setDetectableSize}, -810352311, alertWithArgs.onExtraCallbackWithResult(), 810352318, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ IAuthTabCallbackDefault IAuthTabCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity}, -1566958941, alertWithArgs.onExtraCallbackWithResult(), 1566958956, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        int i4 = readTypedObject + 25;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return iAuthTabCallbackDefault;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = extraCallback + 45;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        extraCallback(function1, obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallback + 21;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{function1, obj}, 2115490686, alertWithArgs.onExtraCallbackWithResult(), -2115490677, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        int i4 = readTypedObject + 81;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            IAuthTabCallback(new Object[]{cardNotificationHistoryActivity}, 1247461529, alertWithArgs.onExtraCallbackWithResult(), -1247461526, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
            return null;
        }
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{cardNotificationHistoryActivity}, 1247461529, alertWithArgs.onExtraCallbackWithResult(), -1247461526, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult());
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(cardNotificationHistoryActivity, th);
        }
        IAuthTabCallback(cardNotificationHistoryActivity, th);
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 113;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = extraCallback + 107;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        List list = (List) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(list, setDetectableSize);
        int i4 = extraCallback + 27;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ CharSequence onExtraCallback(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getversionoverride);
        }
        onWarmupCompleted(getversionoverride);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(new Object[]{getversionoverride, setDetectableSize}, -1915905600, alertWithArgs.onExtraCallbackWithResult(), 1915905613, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, Pair pair) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardNotificationHistoryActivity, pair);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CompoundButton compoundButton, CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(compoundButton, cardNotificationHistoryActivity, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(compoundButton, cardNotificationHistoryActivity, th);
        int i3 = extraCallback + 69;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getversionoverride, setDetectableSize);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, deserializeurinullablecollection}, 724237458, alertWithArgs.onExtraCallbackWithResult(), -724237453, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, deserializeurinullablecollection}, 724237458, alertWithArgs.onExtraCallbackWithResult(), -724237453, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult());
        int i3 = 20 / 0;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asInterface(cardNotificationHistoryActivity);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = extraCallback + 117;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(getversionoverride, setDetectableSize);
        int i4 = readTypedObject + 27;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface(getversionoverride, setDetectableSize);
            throw null;
        }
        Unit unitAsInterface = asInterface(getversionoverride, setDetectableSize);
        int i3 = extraCallback + 35;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardNotificationHistoryActivity cardNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardNotificationHistoryActivity, deserializeurinullablecollection);
        int i4 = readTypedObject + 29;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardNotificationHistoryActivity cardNotificationHistoryActivity, launchUrl launchurl) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(cardNotificationHistoryActivity, launchurl);
        }
        onExtraCallbackWithResult(cardNotificationHistoryActivity, launchurl);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, getVersionOverride getversionoverride, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(gettypedexportedconstants, getversionoverride, view);
        int i4 = readTypedObject + 77;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, CardNotificationHistoryActivity cardNotificationHistoryActivity, getVersionOverride getversionoverride, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(gettypedexportedconstants, cardNotificationHistoryActivity, getversionoverride, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 95;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(cardNotificationHistoryActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cardNotificationHistoryActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = readTypedObject + 121;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = readTypedObject + 113;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(getVersionOverride getversionoverride, CompoundButton compoundButton, BuildConfigApi buildConfigApi) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getversionoverride, compoundButton, buildConfigApi);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = extraCallback + 1;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        int i4 = readTypedObject + 95;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(CardNotificationHistoryActivity cardNotificationHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(cardNotificationHistoryActivity);
        int i4 = readTypedObject + 25;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final class IAuthTabCallbackDefault extends exitAllPages<Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 7622;
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder = 0;
        private static char asInterface = 8922;
        private static char onNavigationEvent = 925;
        private static char onTransact = 625;

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
            int i7 = ~((~i4) | i2);
            int i8 = ~i3;
            int i9 = i7 | (~(i8 | i2));
            int i10 = ~i2;
            int i11 = ~(i10 | i8);
            int i12 = ~(i10 | i4);
            int i13 = (~(i8 | i4)) | i11 | i12;
            int i14 = (~(i3 | i10)) | i12;
            int i15 = i4 + i2 + i5 + (1039959776 * i6) + ((-2046201414) * i);
            int i16 = i15 * i15;
            int i17 = ((357140864 * i4) - 8388608) + ((-1785926397) * i2) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i5) + ((-201326592) * i6) + ((-406847488) * i) + (529399808 * i16);
            int i18 = ((i4 * 868240256) - 1765242424) + (i2 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i5 * 868239597) + (i6 * 817356128) + (i * 406493490) + (i16 * 645267456);
            boolean z = true;
            if (i17 + (i18 * i18 * 681705472) == 1) {
                return onNavigationEvent(objArr);
            }
            getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
            CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[1];
            CompoundButton compoundButton = (CompoundButton) objArr[2];
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            int i19 = 2 % 2;
            int i20 = asBinder + 11;
            IAuthTabCallbackDefault = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(compoundButton, "");
            if (getversionoverride.getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.SUBSCRIBE) {
                int i22 = asBinder + 81;
                IAuthTabCallbackDefault = i22 % 128;
                int i23 = i22 % 2;
            } else {
                z = false;
            }
            if (zBooleanValue != z) {
                CardNotificationHistoryActivity.onWarmupCompleted(cardNotificationHistoryActivity, compoundButton, getversionoverride, zBooleanValue);
            }
            return null;
        }

        public static final class IAuthTabCallbackStub implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public IAuthTabCallbackStub(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallback implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public IAuthTabCallback(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        /* renamed from: viva.republica.toss.card.notification.CardNotificationHistoryActivity$IAuthTabCallbackDefault$IAuthTabCallbackDefault, reason: collision with other inner class name */
        public static final class C0022IAuthTabCallbackDefault implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public C0022IAuthTabCallbackDefault(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

        public static final class onExtraCallback implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public onExtraCallback(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            final /* synthetic */ Configuration onWarmupCompleted;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onWarmupCompleted = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onNavigationEvent implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public onNavigationEvent(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onWarmupCompleted implements getAdService {
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public onWarmupCompleted(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallbackStubProxy implements Function1<Object, Boolean> {
            public static final IAuthTabCallbackStubProxy onNavigationEvent = new IAuthTabCallbackStubProxy();

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onTransact);
            }
        }

        public static final class IAuthTabCallback_Parcel implements Function1<Object, Boolean> {
            public static final IAuthTabCallback_Parcel onNavigationEvent = new IAuthTabCallback_Parcel();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onExtraCallback);
            }
        }

        public static final class access000 implements Function1<Object, Boolean> {
            public static final access000 onWarmupCompleted = new access000();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
            }
        }

        public static final class access100 implements Function1<Object, Boolean> {
            public static final access100 onNavigationEvent = new access100();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onNavigationEvent);
            }
        }

        public static final class asBinder implements Function1<Object, Boolean> {
            public static final asBinder onNavigationEvent = new asBinder();

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof IAuthTabCallbackStub);
            }
        }

        public static final class getInterfaceDescriptor implements Function1<Object, Boolean> {
            public static final getInterfaceDescriptor onExtraCallback = new getInterfaceDescriptor();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof asInterface);
            }
        }

        public static final class onTransact implements Function1<Object, Boolean> {
            public static final onTransact onExtraCallbackWithResult = new onTransact();

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof getVersionOverride);
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            String str;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $10 + 103;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = $11 + 63;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onTransact);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[c] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            str = "";
                            int iLastIndexOf = TextUtils.lastIndexOf(str, '0', i3, i3) + 12435;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, pressedStateDuration, iLastIndexOf, -787580090, false, "C", clsArr);
                        } else {
                            str = "";
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        int i12 = i9;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(str), 10 - KeyEvent.keyCodeFromString(str), 12433 - TextUtils.lastIndexOf(str, '0', 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9 = i12 + 1;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.indexOf("", "", 0, 0)), TextUtils.getOffsetAfter("", 0) + 14, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        IAuthTabCallbackDefault(final CardNotificationHistoryActivity cardNotificationHistoryActivity) {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_header_v2);
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onNavigationEvent((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallback((AppMsgReceiver2) obj, (CardNotificationHistoryActivity.IAuthTabCallbackStub) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(asBinder.onNavigationEvent);
                int i = IAuthTabCallbackDefault + 31;
                asBinder = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            int i3 = R.layout.item_tds_list_row_v1;
            onextracallbackwithresult2.onWarmupCompleted(i3);
            onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    return (Unit) CardNotificationHistoryActivity.IAuthTabCallbackDefault.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1576750737, iOnNavigationEvent, -1576750736, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{(RecyclerView.ViewHolder) obj});
                }
            });
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallbackWithResult(cardNotificationHistoryActivity, (AppMsgReceiver2) obj, (getVersionOverride) obj2);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null) {
                int i4 = asBinder + 73;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                if (onextracallbackwithresult2.onNavigationEvent() == null) {
                    int i6 = asBinder + 91;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        onextracallbackwithresult2.onExtraCallback(onTransact.onExtraCallbackWithResult);
                        throw null;
                    }
                    onextracallbackwithresult2.onExtraCallback(onTransact.onExtraCallbackWithResult);
                }
            }
            onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult3.onWarmupCompleted(R.layout.item_card_notification_history_top);
            onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallback(cardNotificationHistoryActivity, (AppMsgReceiver2) obj, (CardNotificationHistoryActivity.asInterface) obj2);
                }
            });
            if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
                onextracallbackwithresult3.onExtraCallback(getInterfaceDescriptor.onExtraCallback);
                int i7 = 2 % 2;
            }
            onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult4 = new access502.onExtraCallbackWithResult();
            int i8 = R.layout.item_space;
            onextracallbackwithresult4.onWarmupCompleted(i8);
            onextracallbackwithresult4.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallback(cardNotificationHistoryActivity, (AppMsgReceiver2) obj, (CardNotificationHistoryActivity.onTransact) obj2);
                }
            });
            if (onextracallbackwithresult4.onWarmupCompleted() == null && onextracallbackwithresult4.onNavigationEvent() == null) {
                onextracallbackwithresult4.onExtraCallback(IAuthTabCallbackStubProxy.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult4.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult5 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult5.onWarmupCompleted(i8);
            onextracallbackwithresult5.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onWarmupCompleted((AppMsgReceiver2) obj, (CardNotificationHistoryActivity.onExtraCallback) obj2);
                }
            });
            if (onextracallbackwithresult5.onWarmupCompleted() == null && onextracallbackwithresult5.onNavigationEvent() == null) {
                onextracallbackwithresult5.onExtraCallback(IAuthTabCallback_Parcel.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult5.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult6 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult6.onWarmupCompleted(i3);
            onextracallbackwithresult6.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda8
                public final Object invoke(Object obj) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onWarmupCompleted(cardNotificationHistoryActivity, (RecyclerView.ViewHolder) obj);
                }
            });
            if (onextracallbackwithresult6.onWarmupCompleted() == null && onextracallbackwithresult6.onNavigationEvent() == null) {
                int i9 = IAuthTabCallbackDefault + 117;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                onextracallbackwithresult6.onExtraCallback(access100.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult6.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult7 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult7.onWarmupCompleted(R.layout.item_card_notification_history_disclaimer);
            onextracallbackwithresult7.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallbackWithResult((AppMsgReceiver2) obj, (CardNotificationHistoryActivity.onExtraCallbackWithResult) obj2);
                }
            });
            if (onextracallbackwithresult7.onWarmupCompleted() == null && onextracallbackwithresult7.onNavigationEvent() == null) {
                int i11 = IAuthTabCallbackDefault + 63;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                onextracallbackwithresult7.onExtraCallback(access000.onWarmupCompleted);
                int i13 = 2 % 2;
            }
            onExtraCallbackWithResult(onextracallbackwithresult7.onExtraCallbackWithResult());
        }

        public static Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
            TdsListHeaderV2View tdsListHeaderV2View;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListHeaderV2View tdsListHeaderV2View2 = viewHolder.onNavigationEvent;
            Object obj = null;
            if (tdsListHeaderV2View2 instanceof TdsListHeaderV2View) {
                int i2 = IAuthTabCallbackDefault + 105;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                tdsListHeaderV2View = tdsListHeaderV2View2;
            } else {
                int i3 = asBinder + 105;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                tdsListHeaderV2View = null;
            }
            if (tdsListHeaderV2View != null) {
                tdsListHeaderV2View.setHeaderType(TdsListHeaderV2View.onExtraCallback.ROW1B);
                Context context = tdsListHeaderV2View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListHeaderV2View.setTitleColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onPostMessage());
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallbackDefault + 99;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public static Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackStub iAuthTabCallbackStub) {
            TdsListHeaderV2View tdsListHeaderV2View;
            int i = 2 % 2;
            int i2 = asBinder + 65;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            TdsListHeaderV2View tdsListHeaderV2View2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            if (!(!(tdsListHeaderV2View2 instanceof TdsListHeaderV2View))) {
                int i4 = asBinder + 47;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                tdsListHeaderV2View = tdsListHeaderV2View2;
            } else {
                int i6 = IAuthTabCallbackDefault + 3;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                tdsListHeaderV2View = null;
            }
            if (tdsListHeaderV2View != null) {
                tdsListHeaderV2View.setTitle(iAuthTabCallbackStub.onExtraCallback());
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 71;
            asBinder = i2 % 128;
            TdsListRowV1View tdsListRowV1View = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(viewHolder, "");
                boolean z = viewHolder.onNavigationEvent instanceof TdsListRowV1View;
                tdsListRowV1View.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListRowV1View tdsListRowV1View2 = viewHolder.onNavigationEvent;
            if (tdsListRowV1View2 instanceof TdsListRowV1View) {
                int i3 = IAuthTabCallbackDefault + 109;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                tdsListRowV1View = tdsListRowV1View2;
            }
            if (tdsListRowV1View != null) {
                int i4 = IAuthTabCallbackDefault + 89;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                DisplayMetrics displayMetrics = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(34, displayMetrics);
                DisplayMetrics displayMetrics2 = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(54, displayMetrics2));
                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
            }
            return Unit.INSTANCE;
        }

        public static void onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity, getVersionOverride getversionoverride, View view) {
            int i = 2 % 2;
            int i2 = asBinder + 51;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            CardNotificationHistoryActivity.IAuthTabCallback(cardNotificationHistoryActivity, getversionoverride);
            int i4 = asBinder + 85;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, getVersionOverride getversionoverride, View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            CardNotificationHistoryActivity.IAuthTabCallback(cardNotificationHistoryActivity, getversionoverride);
            if (i3 != 0) {
                throw null;
            }
            int i4 = IAuthTabCallbackDefault + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void onWarmupCompleted(TdsListRowV1View tdsListRowV1View, View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 47;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (tdsSwitchV1View != null) {
                tdsSwitchV1View.toggle();
            }
            int i3 = IAuthTabCallbackDefault + 19;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Unit onExtraCallbackWithResult(final CardNotificationHistoryActivity cardNotificationHistoryActivity, AppMsgReceiver2 appMsgReceiver2, final getVersionOverride getversionoverride) {
            final TdsListRowV1View tdsListRowV1View;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(getversionoverride, "");
            TdsListRowV1View tdsListRowV1View2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            if (tdsListRowV1View2 instanceof TdsListRowV1View) {
                tdsListRowV1View = tdsListRowV1View2;
                int i2 = asBinder + 75;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 % 4;
                }
            } else {
                tdsListRowV1View = null;
            }
            if (tdsListRowV1View != null) {
                RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback((String) getVersionOverride.onWarmupCompleted(642069778, zzmr.onExtraCallbackWithResult(), new Object[]{getversionoverride}, -642069776, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()));
                int i4 = R.drawable.img_banklogo_square_null;
                tdsListRowV1View.setLeftImage(zzbe.onWarmupCompleted(zzbe.onNavigationEvent(onnavigationeventOnExtraCallback, i4, tdsListRowV1View.getContext()), i4, tdsListRowV1View.getContext()));
                tdsListRowV1View.setCenterText1(getversionoverride.onNavigationEvent());
                if (getversionoverride.getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.NOT_SUPPORT) {
                    Context context = tdsListRowV1View.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Configuration configuration = context.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    tdsListRowV1View.setCenterText1Color(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
                    tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1C);
                    Context context2 = tdsListRowV1View.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onExtraCallback(configuration2)).onPostMessage());
                    tdsListRowV1View.setRightText1(cardNotificationHistoryActivity.getString(R.string.app_card_notification___e86e2d3dcc));
                    tdsListRowV1View.setRightArrow(true);
                    tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda10
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallbackWithResult(cardNotificationHistoryActivity, getversionoverride, view);
                        }
                    });
                } else if (getversionoverride.IAuthTabCallbackStub()) {
                    Context context3 = tdsListRowV1View.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Configuration configuration3 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration3, "");
                    tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new C0022IAuthTabCallbackDefault(configuration3)).onRelationshipValidationResult());
                    tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.SWITCH);
                    TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    if (tdsSwitchV1View != null) {
                        tdsSwitchV1View.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                    }
                    TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View, getversionoverride.getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.SUBSCRIBE, false, 2, (Object) null);
                    TdsSwitchV1View tdsSwitchV1View2 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    if (tdsSwitchV1View2 != null) {
                        tdsSwitchV1View2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda12
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Throwable {
                                Object[] objArr = {getversionoverride, cardNotificationHistoryActivity, compoundButton, Boolean.valueOf(z)};
                                CardNotificationHistoryActivity.IAuthTabCallbackDefault.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -2018494330, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2018494330, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr);
                            }
                        });
                        int i5 = asBinder + 35;
                        IAuthTabCallbackDefault = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda13
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CardNotificationHistoryActivity.IAuthTabCallbackDefault.onWarmupCompleted(tdsListRowV1View, view);
                        }
                    });
                    TdsSwitchV1View tdsSwitchV1View3 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                    if (tdsSwitchV1View3 != null) {
                        tdsSwitchV1View3.setClickable(false);
                    }
                } else {
                    Context context4 = tdsListRowV1View.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    Configuration configuration4 = context4.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration4, "");
                    tdsListRowV1View.setCenterText1Color(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration4))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
                    tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1C);
                    Context context5 = tdsListRowV1View.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    Configuration configuration5 = context5.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration5, "");
                    tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration5)).onPostMessage());
                    tdsListRowV1View.setRightText1(cardNotificationHistoryActivity.getString(R.string.app_card_notification___7f1a77a677));
                    tdsListRowV1View.setRightArrow(true);
                    tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallback(cardNotificationHistoryActivity, getversionoverride, view);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, AppMsgReceiver2 appMsgReceiver2, asInterface asinterface) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 65;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
                Intrinsics.checkNotNullParameter(asinterface, "");
                ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.top);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(asinterface, "");
            TdsTopV1View tdsTopV1ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.top);
            if (tdsTopV1ViewFindViewById != null) {
                int i3 = asBinder + 43;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                tdsTopV1ViewFindViewById.setUpperText(asinterface.onExtraCallbackWithResult());
            }
            TdsImageView tdsImageViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.image);
            if (tdsImageViewFindViewById != null) {
                Context context = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(context);
                Object[] objArr = new Object[1];
                a(new char[]{9918, 42749, 10013, 18508, 30735, 53086, 45754, 49180, 29190, 29626, 63213, 36325, 18781, 14427, 49024, 39684, 29788, 25673, 45716, 54095, 46637, 46622, 24101, 58195, 63866, 26089, 41597, 47706, 1410, 38933, 24101, 58195, 41877, 35187, 30498, 53152, 38810, 7621, 45852, 46353, 10383, 29653, 62823, 56831, 12650, 33800, 27249, 51917, 9987, 9233, 39565, 39643, 36555, 43692}, TextUtils.lastIndexOf("", '0', 0) + 55, objArr);
                TdsImageView.setImage$default(tdsImageViewFindViewById, RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationevent.onExtraCallback(((String) objArr[0]).intern()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{cardNotificationHistoryActivity.new IAuthTabCallback(((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{cardNotificationHistoryActivity, 20}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue())}), (Function1) null, (Function1) null, 6, (Object) null);
            }
            return Unit.INSTANCE;
        }

        public static Unit onWarmupCompleted(CardNotificationHistoryActivity cardNotificationHistoryActivity, View view) throws Throwable {
            Unit unit;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 51;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                CardNotificationHistoryActivity.IAuthTabCallbackStub(cardNotificationHistoryActivity);
                unit = Unit.INSTANCE;
                int i3 = 84 / 0;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                CardNotificationHistoryActivity.IAuthTabCallbackStub(cardNotificationHistoryActivity);
                unit = Unit.INSTANCE;
            }
            int i4 = asBinder + 7;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Unit onWarmupCompleted(final CardNotificationHistoryActivity cardNotificationHistoryActivity, RecyclerView.ViewHolder viewHolder) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View instanceof TdsListRowV1View ? tdsListRowV1View : null;
            if (tdsListRowV1View2 != null) {
                tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                tdsListRowV1View2.setLeftImage(R.drawable.icn_alarm);
                DisplayMetrics displayMetrics = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
                DisplayMetrics displayMetrics2 = viewHolder.onNavigationEvent.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                tdsListRowV1View2.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
                Context context = tdsListRowV1View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new asInterface(configuration)).ICustomTabsCallbackStubProxy());
                tdsListRowV1View2.setCenterText1(cardNotificationHistoryActivity.getString(R.string.app_card_notification___6609505a75));
                tdsListRowV1View2.setCenterText1MaxLines(2);
                tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.BUTTON);
                tdsListRowV1View2.setRightButtonTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.SMALL, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null));
                tdsListRowV1View2.setRightButtonLabel(cardNotificationHistoryActivity.getString(R.string.app_card_notification___c7e071c9ff));
                tdsListRowV1View2.setRightOnButtonClickListener(new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$adapter$2$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return CardNotificationHistoryActivity.IAuthTabCallbackDefault.onWarmupCompleted(cardNotificationHistoryActivity, (View) obj);
                    }
                });
                int i4 = IAuthTabCallbackDefault + 103;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r3
          0x0039: PHI (r3v4 im.toss.tds.view.component.atom.text.Typography7) = (r3v3 im.toss.tds.view.component.atom.text.Typography7), (r3v8 im.toss.tds.view.component.atom.text.Typography7) binds: [B:8:0x0037, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.Unit onExtraCallbackWithResult(o.AppMsgReceiver2 r3, viva.republica.toss.card.notification.CardNotificationHistoryActivity.onExtraCallbackWithResult r4) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallbackDefault
                int r1 = r1 + 75
                int r2 = r1 % 128
                viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.asBinder = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                if (r1 == 0) goto L27
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                android.view.View r3 = r3.onNavigationEvent
                int r1 = viva.republica.toss.R.id.disclaimer
                android.view.View r3 = r3.findViewById(r1)
                im.toss.tds.view.component.atom.text.Typography7 r3 = (im.toss.tds.view.component.atom.text.Typography7) r3
                r1 = 64
                int r1 = r1 / 0
                if (r3 == 0) goto L40
                goto L39
            L27:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                android.view.View r3 = r3.onNavigationEvent
                int r1 = viva.republica.toss.R.id.disclaimer
                android.view.View r3 = r3.findViewById(r1)
                im.toss.tds.view.component.atom.text.Typography7 r3 = (im.toss.tds.view.component.atom.text.Typography7) r3
                if (r3 == 0) goto L40
            L39:
                java.lang.String r4 = r4.onWarmupCompleted()
                r3.setText(r4)
            L40:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                int r4 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallbackDefault
                int r4 = r4 + 23
                int r1 = r4 % 128
                viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.asBinder = r1
                int r4 = r4 % r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.onExtraCallbackWithResult(o.AppMsgReceiver2, viva.republica.toss.card.notification.CardNotificationHistoryActivity$onExtraCallbackWithResult):kotlin.Unit");
        }

        public static Unit onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, AppMsgReceiver2 appMsgReceiver2, onTransact ontransact) {
            int i = 2 % 2;
            int i2 = asBinder + 123;
            IAuthTabCallbackDefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
                Intrinsics.checkNotNullParameter(ontransact, "");
                View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.getLayoutParams();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(ontransact, "");
            View view2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i3 = asBinder + 1;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = {cardNotificationHistoryActivity, Float.valueOf(ontransact.IAuthTabCallback())};
                int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                layoutParams.height = ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).intValue();
                view2.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
            Object[] objArr2 = {cardNotificationHistoryActivity, Float.valueOf(ontransact.IAuthTabCallback())};
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            layoutParams.height = ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, objArr2, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2)).intValue();
            view2.setLayoutParams(layoutParams);
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0086, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x008e, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        
            if (r3 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        
            if (r3 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        
            r6 = r6.onNavigationEvent();
            r5 = ((androidx.recyclerview.widget.RecyclerView.ViewHolder) r5).onNavigationEvent.getResources().getDisplayMetrics();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r3.height = o.varyMatches.onNavigationEvent(java.lang.Float.valueOf(r6), r5);
            r1.setLayoutParams(r3);
            r5 = r1.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r5 = r5.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r5 = r5.getConfiguration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r1.setBackgroundColor(new o.getDEFAULT_CONNECTION_SPECSokhttp(new viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallbackStub(r5)).onExtraCallbackWithResult());
            r5 = kotlin.Unit.INSTANCE;
            r6 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallbackDefault + 11;
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.asBinder = r6 % 128;
            r6 = r6 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.Unit onWarmupCompleted(o.AppMsgReceiver2 r5, viva.republica.toss.card.notification.CardNotificationHistoryActivity.onExtraCallback r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.asBinder
                int r1 = r1 + 47
                int r2 = r1 % 128
                viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallbackDefault = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                if (r1 != 0) goto L26
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
                android.view.View r1 = r5.onNavigationEvent
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
                r4 = 27
                int r4 = r4 / 0
                if (r3 == 0) goto L87
                goto L37
            L26:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
                android.view.View r1 = r5.onNavigationEvent
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
                if (r3 == 0) goto L87
            L37:
                float r6 = r6.onNavigationEvent()
                android.view.View r5 = r5.onNavigationEvent
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                int r5 = o.varyMatches.onNavigationEvent(r6, r5)
                r3.height = r5
                r1.setLayoutParams(r3)
                android.content.Context r5 = r1.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                android.content.res.Resources r5 = r5.getResources()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                android.content.res.Configuration r5 = r5.getConfiguration()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                o.getDEFAULT_CONNECTION_SPECSokhttp r6 = new o.getDEFAULT_CONNECTION_SPECSokhttp
                viva.republica.toss.card.notification.CardNotificationHistoryActivity$IAuthTabCallbackDefault$IAuthTabCallbackStub r2 = new viva.republica.toss.card.notification.CardNotificationHistoryActivity$IAuthTabCallbackDefault$IAuthTabCallbackStub
                r2.<init>(r5)
                r6.<init>(r2)
                int r5 = r6.onExtraCallbackWithResult()
                r1.setBackgroundColor(r5)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                int r6 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.IAuthTabCallbackDefault
                int r6 = r6 + 11
                int r1 = r6 % 128
                viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.asBinder = r1
                int r6 = r6 % r0
                return r5
            L87:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallbackDefault.onWarmupCompleted(o.AppMsgReceiver2, viva.republica.toss.card.notification.CardNotificationHistoryActivity$onExtraCallback):kotlin.Unit");
        }

        public static void IAuthTabCallback(getVersionOverride getversionoverride, CardNotificationHistoryActivity cardNotificationHistoryActivity, CompoundButton compoundButton, boolean z) throws Throwable {
            Object[] objArr = {getversionoverride, cardNotificationHistoryActivity, compoundButton, Boolean.valueOf(z)};
            onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -2018494330, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2018494330, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr);
        }

        public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            return (Unit) onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1576750737, iOnNavigationEvent, -1576750736, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{viewHolder});
        }
    }

    public static final class access000 implements Function0<CERT_EncryptPrikeyInfo> {
        final /* synthetic */ Activity IAuthTabCallback;

        public access000(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CERT_EncryptPrikeyInfo invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_EncryptPrikeyInfo.onExtraCallback(layoutInflater);
        }
    }

    public static final class getInterfaceDescriptor implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final getInterfaceDescriptor IAuthTabCallback = new getInterfaceDescriptor();

        public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class access100<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public access100(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<String> apply(writeRaw<BaseApiResponse<String>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<String>, deserializeIp<? extends String>>() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity.access100.1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends String> invoke(BaseApiResponse<String> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = String.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: o.UtilsKtExternalSyntheticLambda17$onTrimMemory
                private final /* synthetic */ Function1 IAuthTabCallback;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass1, "");
                    this.IAuthTabCallback = anonymousClass1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.IAuthTabCallback.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.onExtraCallbackWithResult(getversionoverride);
        int i4 = extraCallback + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(CardNotificationHistoryActivity cardNotificationHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.ICustomTabsServiceStubProxy();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ IAuthTabCallbackDefault onNavigationEvent(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return cardNotificationHistoryActivity.setEngagementSignalsCallback();
        }
        cardNotificationHistoryActivity.setEngagementSignalsCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CardNotificationHistoryActivity cardNotificationHistoryActivity, CompoundButton compoundButton, getVersionOverride getversionoverride, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.onExtraCallbackWithResult(compoundButton, getversionoverride, z);
        int i4 = extraCallback + 89;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CardNotificationHistoryActivity cardNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.onNavigationEvent(deserializeurinullablecollection);
        int i4 = extraCallback + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 43;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 61;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getdummyad;
    }

    private final CERT_EncryptPrikeyInfo updateVisuals() {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_EncryptPrikeyInfo cERT_EncryptPrikeyInfo = (CERT_EncryptPrikeyInfo) value;
        int i4 = readTypedObject + 99;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return cERT_EncryptPrikeyInfo;
    }

    private final RecyclerView ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = updateVisuals().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        int i4 = extraCallback + 29;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return recyclerView;
    }

    private final SwipeRefreshLayout ICustomTabsServiceDefault() {
        SwipeRefreshLayout swipeRefreshLayout;
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            swipeRefreshLayout = updateVisuals().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "");
            int i3 = 95 / 0;
        } else {
            swipeRefreshLayout = updateVisuals().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "");
        }
        int i4 = extraCallback + 49;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return swipeRefreshLayout;
        }
        throw null;
    }

    private static final Unit onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            Function1<? super Boolean, Unit> function1 = cardNotificationHistoryActivity.IAuthTabCallback_Parcel;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        Function1<? super Boolean, Unit> function12 = cardNotificationHistoryActivity.IAuthTabCallback_Parcel;
        if (function12 != null) {
            int i3 = extraCallback + 21;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            function12.invoke(Boolean.valueOf(r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()));
            int i5 = extraCallback + 39;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        cardNotificationHistoryActivity.IAuthTabCallback_Parcel = null;
        return Unit.INSTANCE;
    }

    @Override // o.KeyAgreeRecipientIdentifier
    public SessionTrackera ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 57;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = this.getInterfaceDescriptor;
        int i5 = i2 + 73;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackera;
    }

    @Override // o.KeyAgreeRecipientIdentifier
    public void onExtraCallback(@NotNull Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback_Parcel = function1;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback_Parcel = function1;
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationHistoryActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().getRoot());
        LinearLayout root = updateVisuals().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, updateVisuals().onNavigationEvent, (View) null, (View) null, false, 14, (Object) null);
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{this}, -701687925, alertWithArgs.onExtraCallbackWithResult(), 701687939, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
        onWarmupCompleted(getIntent());
        writeTypedList();
        int i4 = readTypedObject + 85;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        onWarmupCompleted(intent);
        writeTypedList();
        int i4 = extraCallback + 57;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        final CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            cardNotificationHistoryActivity.getSupportActionBar();
            obj.hashCode();
            throw null;
        }
        IPostMessageServiceStubProxy supportActionBar = cardNotificationHistoryActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i3 = extraCallback + 109;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            supportActionBar.onNavigationEvent(true);
            int i5 = extraCallback + 33;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        cardNotificationHistoryActivity.ICustomTabsServiceStub().setAdapter(cardNotificationHistoryActivity.setEngagementSignalsCallback());
        cardNotificationHistoryActivity.ICustomTabsServiceDefault().setOnRefreshListener(new SwipeRefreshLayout.IAuthTabCallback() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda31
            public final void onRefresh() throws Throwable {
                CardNotificationHistoryActivity.onWarmupCompleted(this.f$0);
            }
        });
        int i7 = extraCallback + 1;
        readTypedObject = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(CardNotificationHistoryActivity cardNotificationHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.writeTypedList();
        int i4 = extraCallback + 13;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 69;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String stringExtra = null;
        if (intent != null) {
            int i5 = i2 + 51;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
            int i7 = extraCallback + 97;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
        this.asInterface = stringExtra;
        int i9 = readTypedObject + 11;
        extraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 79 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = readTypedObject + 5;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.ICustomTabsServiceDefault().setRefreshing(true);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 51;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallback = i2 % 128;
        cardNotificationHistoryActivity.ICustomTabsServiceDefault().setRefreshing(i2 % 2 != 0);
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.card.notification.CardNotificationHistoryActivity r10, kotlin.Pair r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r11.onExtraCallbackWithResult()
            o.InitSettingsBuilder r1 = (o.InitSettingsBuilder) r1
            java.lang.Object r11 = r11.IAuthTabCallback()
            java.lang.String r11 = (java.lang.String) r11
            boolean r2 = r1.onWarmupCompleted()
            r10.access100 = r2
            java.util.List r2 = r1.IAuthTabCallback()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r2, r11}
            int r8 = o.alertWithArgs.onExtraCallbackWithResult()
            int r7 = o.alertWithArgs.onExtraCallbackWithResult()
            int r9 = o.alertWithArgs.onExtraCallbackWithResult()
            int r5 = o.alertWithArgs.onExtraCallbackWithResult()
            r6 = -21208413(0xfffffffffebc62a3, float:-1.2520351E38)
            r4 = 21208413(0x1439d5d, float:3.5928746E-38)
            IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
            java.util.List r11 = r1.IAuthTabCallback()
            if (r11 == 0) goto L98
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r1 = r11 instanceof java.util.Collection
            r2 = 1
            if (r1 == r2) goto L47
            goto L69
        L47:
            int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback
            int r1 = r1 + 101
            int r2 = r1 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L60
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 29
            int r2 = r2 / 0
            if (r1 != 0) goto L98
            goto L69
        L60:
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L98
        L69:
            java.util.Iterator r11 = r11.iterator()
            int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject
            int r1 = r1 + 13
            int r2 = r1 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback = r2
            int r1 = r1 % r0
        L76:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r11.next()
            o.getVersionOverride r1 = (o.getVersionOverride) r1
            o.DefaultMediaViewVideoRendererApi r1 = r1.getInterfaceDescriptor()
            o.DefaultMediaViewVideoRendererApi r2 = o.DefaultMediaViewVideoRendererApi.SUBSCRIBE
            if (r1 != r2) goto L76
            int r11 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject
            int r11 = r11 + 97
            int r1 = r11 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback = r1
            int r11 = r11 % r0
            o.getRKeyID r11 = o.getRKeyID.onWarmupCompleted
            r11.IAuthTabCallback(r10)
        L98:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallback(viva.republica.toss.card.notification.CardNotificationHistoryActivity, kotlin.Pair):kotlin.Unit");
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallback + 87;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, cardNotificationHistoryActivity.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 86, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, cardNotificationHistoryActivity.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = readTypedObject + 125;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void writeTypedList() throws Throwable {
        int i = 2 % 2;
        setTagBytes settagbytes = setTagBytes.onNavigationEvent;
        writeRaw<InitSettingsBuilder> writerawOnWarmupCompleted = getRKeyID.onWarmupCompleted.onWarmupCompleted();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29426), (ViewConfiguration.getEdgeSlop() >> 16) + 22, 24734 - (ViewConfiguration.getEdgeSlop() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-339320021);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - ((byte) KeyEvent.getModifierMetaStateMask())), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 24734 - (Process.myTid() >> 22), -628712005, false, "onTransact", new Class[0]);
            }
            writeRaw<BaseApiResponse<String>> writerawOnExtraCallback = ((CacheFlag) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new access100(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writeRaw writerawIAuthTabCallback2 = settagbytes.IAuthTabCallback(writerawOnWarmupCompleted, writerawIAuthTabCallback);
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2) {
                    return CardNotificationHistoryActivity.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj2);
                }
            };
            writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback2.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda2
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.IAuthTabCallback_Parcel(function1, obj2);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda3
                public final void run() {
                    CardNotificationHistoryActivity.onExtraCallbackWithResult(this.f$0);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2) {
                    return CardNotificationHistoryActivity.onExtraCallback(this.f$0, (Pair) obj2);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda5
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.onWarmupCompleted(function12, obj2);
                }
            };
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2) {
                    Object[] objArr = {this.f$0, (Throwable) obj2};
                    int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                    return (Unit) CardNotificationHistoryActivity.IAuthTabCallback(objArr, 1973164755, alertWithArgs.onExtraCallbackWithResult(), -1973164747, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda7
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.IAuthTabCallbackDefault(function13, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            int i2 = readTypedObject + 103;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit IAuthTabCallbackStub(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 97;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 3;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = access000;
        if (cArr3 != null) {
            int i4 = $11 + 33;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getTapTimeout() >> 16) + 77, 20951 - MotionEvent.axisFromString(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 76, 20952 - Color.green(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 75 - Drawable.resolveOpacity(0, 0), Color.green(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (!(!extraCallbackWithResult)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0) + 64, 12214 - (ViewConfiguration.getEdgeSlop() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!writeTypedObject) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i7 = $10 + 63;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 51;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString("") + 63, (ViewConfiguration.getLongPressTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, final getVersionOverride getversionoverride, View view) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010391L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                return CardNotificationHistoryActivity.onNavigationEvent(getversionoverride, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        gettypedexportedconstants.dismiss();
        int i2 = readTypedObject + 71;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getVersionOverride getversionoverride = (getVersionOverride) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
        int i3 = 60 / 0;
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, CardNotificationHistoryActivity cardNotificationHistoryActivity, final getVersionOverride getversionoverride, View view) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010389L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                return CardNotificationHistoryActivity.onExtraCallback(getversionoverride, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        gettypedexportedconstants.dismiss();
        cardNotificationHistoryActivity.access200();
        int i2 = extraCallback + 111;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final getVersionOverride getversionoverride) {
        int i;
        int i2;
        int i3 = 2 % 2;
        DefaultMediaViewVideoRendererApi interfaceDescriptor = getversionoverride.getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            int i4 = readTypedObject + 23;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = -1;
        } else {
            i = asBinder.onWarmupCompleted[interfaceDescriptor.ordinal()];
        }
        if (i != 1) {
            int i6 = readTypedObject + 65;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i == 2 && !getversionoverride.IAuthTabCallbackStub()) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010397L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda19
                    public final Object invoke(Object obj) {
                        Object[] objArr = {getversionoverride, (SetDetectableSize) obj};
                        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                        return (Unit) CardNotificationHistoryActivity.IAuthTabCallback(objArr, 1316805531, alertWithArgs.onExtraCallbackWithResult(), -1316805527, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
                    }
                }, 14, (Object) null);
                startActivity(CardNotificationFailedActivity.onExtraCallback.IAuthTabCallback(CardNotificationFailedActivity.Companion, this, new BuildConfigApi(false, null, CollectionsKt.listOf(getversionoverride)), "history", null, 8, null));
                return;
            }
            return;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1010387L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return CardNotificationHistoryActivity.IAuthTabCallback(getversionoverride, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1010383L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                return CardNotificationHistoryActivity.onExtraCallbackWithResult(getversionoverride, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        getInterfaceDescriptor getinterfacedescriptor = getInterfaceDescriptor.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, getinterfacedescriptor, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(getString(R.string.app_card_notification___6cd41a83be, getversionoverride.onNavigationEvent()));
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setDescription(this.access100 ? "알림 신청 완료! 오픈하면 알려드릴게요." : "알림이 오픈되면 알려드릴까요?");
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context3);
        if (this.access100) {
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.close, new View.OnClickListener() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardNotificationHistoryActivity.onNavigationEvent(gettypedexportedconstants, getversionoverride, view);
                }
            }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null);
            i2 = readTypedObject + 17;
        } else {
            String string = getString(R.string.app_card_notification___c7e071c9ff);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new View.OnClickListener() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    CardNotificationHistoryActivity.onNavigationEvent(gettypedexportedconstants, this, getversionoverride, view);
                }
            }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null);
            i2 = readTypedObject + 31;
        }
        extraCallback = i2 % 128;
        int i8 = i2 % 2;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    private static final Unit asBinder(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getVersionOverride getversionoverride, boolean z, SetDetectableSize setDetectableSize) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", getversionoverride.onNavigationEvent());
        if (z) {
            int i2 = extraCallback + 119;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            obj = "Y";
        } else {
            int i4 = extraCallback + 27;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            obj = "N";
        }
        setDetectableSize.onExtraCallback("checked", obj);
        setDetectableSize.onExtraCallback("register_required", getversionoverride.IAuthTabCallbackDefault() ^ true ? "N" : "Y");
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getVersionOverride $item;
        final /* synthetic */ CompoundButton $switch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(getVersionOverride getversionoverride, CompoundButton compoundButton, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$item = getversionoverride;
            this.$switch = compoundButton;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardNotificationHistoryActivity.this.new IAuthTabCallbackStubProxy(this.$item, this.$switch, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            CardNotificationHistoryActivity cardNotificationHistoryActivity = CardNotificationHistoryActivity.this;
            writeRaw writerawIAuthTabCallback = getRKeyID.IAuthTabCallback(getRKeyID.onWarmupCompleted, cardNotificationHistoryActivity, cardNotificationHistoryActivity.onNavigationEvent(), this.$item.IAuthTabCallback(), false, "history", false, 40, null);
            final getVersionOverride getversionoverride = this.$item;
            final CompoundButton compoundButton = this.$switch;
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$onCheckSwitch$2$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackStubProxy.IAuthTabCallback(getversionoverride, compoundButton, (BuildConfigApi) obj2);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$onCheckSwitch$2$$ExternalSyntheticLambda1
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.IAuthTabCallbackStubProxy.IAuthTabCallback(function1, obj2);
                }
            };
            final CompoundButton compoundButton2 = this.$switch;
            final CardNotificationHistoryActivity cardNotificationHistoryActivity2 = CardNotificationHistoryActivity.this;
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$onCheckSwitch$2$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallbackStubProxy.IAuthTabCallback(compoundButton2, cardNotificationHistoryActivity2, (Throwable) obj2);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$onCheckSwitch$2$$ExternalSyntheticLambda3
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.IAuthTabCallbackStubProxy.onExtraCallback(function12, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            CardNotificationHistoryActivity.onWarmupCompleted(cardNotificationHistoryActivity, deserializeurinullablecollectionOnNavigationEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IAuthTabCallback(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(getVersionOverride getversionoverride, CompoundButton compoundButton, BuildConfigApi buildConfigApi) {
            if (buildConfigApi.onWarmupCompleted()) {
                getversionoverride.onWarmupCompleted(DefaultMediaViewVideoRendererApi.SUBSCRIBE);
            } else {
                compoundButton.setChecked(false);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit IAuthTabCallback(CompoundButton compoundButton, CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
            compoundButton.setChecked(false);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CardNotificationHistoryActivity", "failed in onCheckSwitch - subscribe", th, (Map) null, 8, (Object) null);
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, cardNotificationHistoryActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallback + 71;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(o.getVersionOverride r4, android.widget.CompoundButton r5, o.BuildConfigApi r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            boolean r6 = r6.onWarmupCompleted()
            r1 = 69
            int r1 = r1 / 0
            r6 = r6 ^ r2
            if (r6 == r2) goto L26
            goto L20
        L1a:
            boolean r6 = r6.onWarmupCompleted()
            if (r6 == 0) goto L26
        L20:
            o.DefaultMediaViewVideoRendererApi r5 = o.DefaultMediaViewVideoRendererApi.UNSUBSCRIBE
            r4.onWarmupCompleted(r5)
            goto L32
        L26:
            r5.setChecked(r2)
            int r4 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject
            int r4 = r4 + 13
            int r5 = r4 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback = r5
            int r4 = r4 % r0
        L32:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallback(o.getVersionOverride, android.widget.CompoundButton, o.BuildConfigApi):kotlin.Unit");
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final CompoundButton compoundButton, final getVersionOverride getversionoverride, final boolean z) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010385L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                getVersionOverride getversionoverride2 = getversionoverride;
                Boolean boolValueOf = Boolean.valueOf(z);
                int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                return (Unit) CardNotificationHistoryActivity.IAuthTabCallback(new Object[]{getversionoverride2, boolValueOf, (SetDetectableSize) obj}, 1500204562, alertWithArgs.onExtraCallbackWithResult(), -1500204560, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
            }
        }, 14, (Object) null);
        if (!z) {
            writeRaw<BuildConfigApi> writerawIAuthTabCallback = getRKeyID.onWarmupCompleted.IAuthTabCallback(this, Integer.valueOf(getversionoverride.IAuthTabCallback()), "history");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda21
                public final Object invoke(Object obj) {
                    return CardNotificationHistoryActivity.onWarmupCompleted(getversionoverride, compoundButton, (BuildConfigApi) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda22
                public final void accept(Object obj) {
                    CardNotificationHistoryActivity.asBinder(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda23
                public final Object invoke(Object obj) {
                    return CardNotificationHistoryActivity.onExtraCallbackWithResult(compoundButton, this, (Throwable) obj);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda24
                public final void accept(Object obj) {
                    CardNotificationHistoryActivity.asInterface(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            return;
        }
        int i2 = extraCallback + 51;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getversionoverride.IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        if (!getversionoverride.IAuthTabCallbackDefault()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(getversionoverride, compoundButton, null), 3, (Object) null);
            int i3 = readTypedObject + 51;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = extraCallback + 15;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        startActivity(CardNotificationRegisterNudgeActivity.Companion.onNavigationEvent(this, Integer.valueOf(getversionoverride.IAuthTabCallback()), getversionoverride.onNavigationEvent()));
        compoundButton.setChecked(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CompoundButton compoundButton, CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        compoundButton.setChecked(true);
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CardNotificationHistoryActivity", "failed in onCheckSwitch - unsubscribe", th, (Map) null, 8, (Object) null);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, cardNotificationHistoryActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 43;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final CharSequence onWarmupCompleted(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getversionoverride, "");
            return getversionoverride.onNavigationEvent();
        }
        Intrinsics.checkNotNullParameter(getversionoverride, "");
        getversionoverride.onNavigationEvent();
        throw null;
    }

    private static final Unit onNavigationEvent(List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_vendor_name", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardNotificationHistoryActivity.onExtraCallback((getVersionOverride) obj);
            }
        }, 30, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallback + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void ICustomTabsServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        List listOnExtraCallbackWithResult = setEngagementSignalsCallback().onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnExtraCallbackWithResult.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                final ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    int i2 = readTypedObject + 91;
                    extraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (((getVersionOverride) obj2).getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.NOT_SUPPORT) {
                        int i4 = extraCallback + 7;
                        readTypedObject = i4 % 128;
                        if (i4 % 2 == 0) {
                            arrayList2.add(obj2);
                            obj.hashCode();
                            throw null;
                        }
                        arrayList2.add(obj2);
                    }
                }
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010395L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda25
                    public final Object invoke(Object obj3) {
                        Object[] objArr = {arrayList2, (SetDetectableSize) obj3};
                        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                        return (Unit) CardNotificationHistoryActivity.IAuthTabCallback(objArr, 2004692738, alertWithArgs.onExtraCallbackWithResult(), -2004692727, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
                    }
                }, 14, (Object) null);
                access200();
                return;
            }
            int i5 = extraCallback + 63;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = it.next() instanceof getVersionOverride;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (next instanceof getVersionOverride) {
                arrayList.add(next);
                int i6 = extraCallback + 3;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 1;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        BaseActivity.IAuthTabCallback(cardNotificationHistoryActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 115;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardNotificationHistoryActivity cardNotificationHistoryActivity = (CardNotificationHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationHistoryActivity.bo_();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = readTypedObject + 75;
        extraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void access200() throws Throwable {
        int i = 2 % 2;
        List listOnExtraCallbackWithResult = setEngagementSignalsCallback().onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnExtraCallbackWithResult) {
            if (obj instanceof getVersionOverride) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            int i2 = readTypedObject + 85;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (((getVersionOverride) obj2).getInterfaceDescriptor() == DefaultMediaViewVideoRendererApi.NOT_SUPPORT) {
                int i4 = extraCallback + 13;
                readTypedObject = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList2.add(obj2);
                    throw null;
                }
                arrayList2.add(obj2);
            }
        }
        getRKeyID getrkeyid = getRKeyID.onWarmupCompleted;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((getVersionOverride) it.next()).IAuthTabCallback()));
        }
        writeRaw<launchUrl> writerawOnNavigationEvent = getrkeyid.onNavigationEvent(arrayList3);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda8
            public final Object invoke(Object obj3) {
                return CardNotificationHistoryActivity.onNavigationEvent(this.f$0, (deserializeUriNullableCollection) obj3);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawOnNavigationEvent.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda9
            public final void accept(Object obj3) {
                CardNotificationHistoryActivity.IAuthTabCallbackStub(function1, obj3);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda10
            public final void run() {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                CardNotificationHistoryActivity.IAuthTabCallback(objArr, -1157184006, alertWithArgs.onExtraCallbackWithResult(), 1157184018, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda11
            public final Object invoke(Object obj3) {
                return CardNotificationHistoryActivity.onNavigationEvent(this.f$0, (launchUrl) obj3);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda12
            public final void accept(Object obj3) {
                Object[] objArr = {function12, obj3};
                int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                CardNotificationHistoryActivity.IAuthTabCallback(objArr, -492947442, alertWithArgs.onExtraCallbackWithResult(), 492947452, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda13
            public final Object invoke(Object obj3) {
                Object[] objArr = {this.f$0, (Throwable) obj3};
                int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                return (Unit) CardNotificationHistoryActivity.IAuthTabCallback(objArr, -962721052, alertWithArgs.onExtraCallbackWithResult(), 962721053, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
            }
        };
        writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda14
            public final void accept(Object obj3) {
                CardNotificationHistoryActivity.onTransact(function13, obj3);
            }
        });
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = readTypedObject + 123;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity, launchUrl launchurl) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (launchurl.IAuthTabCallback() != null && (!r5.isEmpty())) {
            LinearLayout linearLayout = cardNotificationHistoryActivity.updateVisuals().onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            String string = cardNotificationHistoryActivity.getString(R.string.app_card_notification___900bc25cba);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(linearLayout, string), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
            cardNotificationHistoryActivity.writeTypedList();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 15;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = extraCallback + 43;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CardNotificationHistoryActivity", "failed to reserve", th, (Map) null, 8, (Object) null);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, cardNotificationHistoryActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, android.content.Context, viva.republica.toss.card.notification.CardNotificationHistoryActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asInterface(java.lang.Object[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.asInterface(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(final java.util.List<o.getVersionOverride> r15) {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject
            int r1 = r1 + 47
            int r2 = r1 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback = r2
            int r1 = r1 % r0
            boolean r1 = r14.onTransact
            r2 = 61
            r3 = 0
            if (r1 == 0) goto L77
            r14.onTransact = r3
            o.ConvertFloatArrayToByteArray r4 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            r5 = 1010381(0xf6acd, double:4.991945E-318)
            r7 = 0
            r8 = 0
            r9 = 0
            viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda27 r10 = new viva.republica.toss.card.notification.CardNotificationHistoryActivity$$ExternalSyntheticLambda27
            r10.<init>()
            r11 = 14
            r12 = 0
            o.ConvertFloatArrayToByteArray.onWarmupCompleted(r4, r5, r7, r8, r9, r10, r11, r12)
            boolean r1 = r14.access100
            if (r1 != 0) goto L77
            if (r15 == 0) goto L77
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            boolean r1 = r15 instanceof java.util.Collection
            r4 = 1
            if (r1 == r4) goto L36
            goto L47
        L36:
            int r1 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback
            int r1 = r1 + r2
            int r4 = r1 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject = r4
            int r1 = r1 % r0
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L77
        L47:
            java.util.Iterator r15 = r15.iterator()
        L4b:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r15.next()
            o.getVersionOverride r1 = (o.getVersionOverride) r1
            o.DefaultMediaViewVideoRendererApi r1 = r1.getInterfaceDescriptor()
            o.DefaultMediaViewVideoRendererApi r4 = o.DefaultMediaViewVideoRendererApi.NOT_SUPPORT
            if (r1 != r4) goto L4b
            o.ConvertFloatArrayToByteArray r5 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            r6 = 1010393(0xf6ad9, double:4.992005E-318)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 30
            r13 = 0
            o.ConvertFloatArrayToByteArray.onWarmupCompleted(r5, r6, r8, r9, r10, r11, r12, r13)
            int r15 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback
            int r15 = r15 + 35
            int r1 = r15 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject = r1
            int r15 = r15 % r0
        L77:
            int r15 = viva.republica.toss.card.notification.CardNotificationHistoryActivity.extraCallback
            int r15 = r15 + 7
            int r1 = r15 % 128
            viva.republica.toss.card.notification.CardNotificationHistoryActivity.readTypedObject = r1
            int r15 = r15 % r0
            if (r15 != 0) goto L83
            int r2 = r2 / r3
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationHistoryActivity.IAuthTabCallback(java.util.List):void");
    }

    private final IAuthTabCallbackDefault setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) this.IAuthTabCallbackDefault.getValue();
        int i4 = readTypedObject + 59;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackDefault;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $agreed;
        final /* synthetic */ int $cardCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(boolean z, int i, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$agreed = z;
            this.$cardCode = i;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardNotificationHistoryActivity.this.new IAuthTabCallback_Parcel(this.$agreed, this.$cardCode, access13800Var);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            writeRaw writerawIAuthTabCallback;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            CardNotificationHistoryActivity cardNotificationHistoryActivity = CardNotificationHistoryActivity.this;
            if (this.$agreed) {
                writerawIAuthTabCallback = getRKeyID.IAuthTabCallback(getRKeyID.onWarmupCompleted, cardNotificationHistoryActivity, cardNotificationHistoryActivity.onNavigationEvent(), this.$cardCode, false, null, false, 48, null);
            } else {
                writerawIAuthTabCallback = getRKeyID.IAuthTabCallback(getRKeyID.onWarmupCompleted, cardNotificationHistoryActivity, cardNotificationHistoryActivity.onNavigationEvent(), this.$cardCode, false, "history", false, 40, null);
            }
            final CardNotificationHistoryActivity cardNotificationHistoryActivity2 = CardNotificationHistoryActivity.this;
            final int i = this.$cardCode;
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$subscribe$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallback_Parcel.onExtraCallbackWithResult(cardNotificationHistoryActivity2, i, (BuildConfigApi) obj2);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$subscribe$1$$ExternalSyntheticLambda1
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.IAuthTabCallback_Parcel.onNavigationEvent(function1, obj2);
                }
            };
            final int i2 = this.$cardCode;
            final boolean z = this.$agreed;
            final CardNotificationHistoryActivity cardNotificationHistoryActivity3 = CardNotificationHistoryActivity.this;
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$subscribe$1$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return CardNotificationHistoryActivity.IAuthTabCallback_Parcel.onExtraCallbackWithResult(i2, z, cardNotificationHistoryActivity3, (Throwable) obj2);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.card.notification.CardNotificationHistoryActivity$subscribe$1$$ExternalSyntheticLambda3
                public final void accept(Object obj2) {
                    CardNotificationHistoryActivity.IAuthTabCallback_Parcel.IAuthTabCallback(function12, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            CardNotificationHistoryActivity.onWarmupCompleted(cardNotificationHistoryActivity, deserializeurinullablecollectionOnNavigationEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNavigationEvent(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity, int i, BuildConfigApi buildConfigApi) {
            Object next;
            if (buildConfigApi.onWarmupCompleted()) {
                List listOnExtraCallbackWithResult = CardNotificationHistoryActivity.onNavigationEvent(cardNotificationHistoryActivity).onExtraCallbackWithResult();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listOnExtraCallbackWithResult) {
                    if (obj instanceof getVersionOverride) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((getVersionOverride) next).IAuthTabCallback() == i) {
                        break;
                    }
                }
                getVersionOverride getversionoverride = (getVersionOverride) next;
                if (getversionoverride != null) {
                    getversionoverride.onWarmupCompleted(DefaultMediaViewVideoRendererApi.SUBSCRIBE);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IAuthTabCallback(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onExtraCallbackWithResult(int i, boolean z, CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CardNotificationHistoryActivity", "failed to subscribe (cardCode: " + i + ", agreed: " + z + ")", th, (Map) null, 8, (Object) null);
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, cardNotificationHistoryActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(int i, boolean z) {
        int i2 = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(z, i, null), 3, (Object) null);
        int i3 = readTypedObject + 119;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final class asInterface {
        private final String onExtraCallbackWithResult;
        final /* synthetic */ CardNotificationHistoryActivity onNavigationEvent;

        public asInterface(@NotNull CardNotificationHistoryActivity cardNotificationHistoryActivity, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = cardNotificationHistoryActivity;
            this.onExtraCallbackWithResult = str;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }
    }

    public final class IAuthTabCallbackStub {
        final /* synthetic */ CardNotificationHistoryActivity IAuthTabCallback;
        private final String onExtraCallbackWithResult;

        public IAuthTabCallbackStub(@NotNull CardNotificationHistoryActivity cardNotificationHistoryActivity, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = cardNotificationHistoryActivity;
            this.onExtraCallbackWithResult = str;
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    public final class onTransact {
        private final float onExtraCallback;

        public onTransact(float f) {
            this.onExtraCallback = f;
        }

        public final float IAuthTabCallback() {
            return this.onExtraCallback;
        }
    }

    public final class onExtraCallback {
        private final float onNavigationEvent;

        public onExtraCallback(float f) {
            this.onNavigationEvent = f;
        }

        public final float onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }

    public final class onNavigationEvent {
        public onNavigationEvent() {
        }
    }

    public final class onExtraCallbackWithResult {
        private final String onNavigationEvent;
        final /* synthetic */ CardNotificationHistoryActivity onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull CardNotificationHistoryActivity cardNotificationHistoryActivity, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = cardNotificationHistoryActivity;
            this.onNavigationEvent = str;
        }

        public final String onWarmupCompleted() {
            return this.onNavigationEvent;
        }
    }

    public final class IAuthTabCallback extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 {
        private final int onExtraCallback;
        private final Paint onExtraCallbackWithResult = new Paint(7);
        private final String onNavigationEvent;

        public IAuthTabCallback(int i) {
            this.onExtraCallback = i;
            this.onNavigationEvent = "BottomCropTransformation/bottomCropHeight:" + i;
        }

        public String IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public Object onWarmupCompleted(@NotNull Bitmap bitmap, @NotNull RememberObserverHolder rememberObserverHolder, @NotNull access13800<? super Bitmap> access13800Var) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Matrix matrix = new Matrix();
            matrix.postTranslate(0.0f, this.onExtraCallback);
            canvas.drawBitmap(bitmap, matrix, this.onExtraCallbackWithResult);
            return bitmapCreateBitmap;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, th}, 1973164755, alertWithArgs.onExtraCallbackWithResult(), -1973164747, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{list, setDetectableSize}, 2004692738, alertWithArgs.onExtraCallbackWithResult(), -2004692727, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardNotificationHistoryActivity cardNotificationHistoryActivity, Throwable th) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, th}, -962721052, alertWithArgs.onExtraCallbackWithResult(), 962721053, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(getVersionOverride getversionoverride, boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {getversionoverride, Boolean.valueOf(z), setDetectableSize};
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(objArr, 1500204562, alertWithArgs.onExtraCallbackWithResult(), -1500204560, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardNotificationHistoryActivity cardNotificationHistoryActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, 2042218043, alertWithArgs.onExtraCallbackWithResult(), -2042218037, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onExtraCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{cardNotificationHistoryActivity}, -1157184006, alertWithArgs.onExtraCallbackWithResult(), 1157184018, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{getversionoverride, setDetectableSize}, 1316805531, alertWithArgs.onExtraCallbackWithResult(), -1316805527, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{function1, obj}, -492947442, alertWithArgs.onExtraCallbackWithResult(), 492947452, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final IAuthTabCallbackDefault onTransact(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (IAuthTabCallbackDefault) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity}, -1566958941, alertWithArgs.onExtraCallbackWithResult(), 1566958956, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private final void validateRelationship() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{this}, -701687925, alertWithArgs.onExtraCallbackWithResult(), 701687939, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(CardNotificationHistoryActivity cardNotificationHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, deserializeurinullablecollection}, 724237458, alertWithArgs.onExtraCallbackWithResult(), -724237453, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{function1, obj}, 2115490686, alertWithArgs.onExtraCallbackWithResult(), -2115490677, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final Unit onTransact(getVersionOverride getversionoverride, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{getversionoverride, setDetectableSize}, -1915905600, alertWithArgs.onExtraCallbackWithResult(), 1915905613, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final void IAuthTabCallbackDefault(CardNotificationHistoryActivity cardNotificationHistoryActivity) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{cardNotificationHistoryActivity}, 1247461529, alertWithArgs.onExtraCallbackWithResult(), -1247461526, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private final void onWarmupCompleted(List<getVersionOverride> list, String str) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{this, list, str}, 21208413, alertWithArgs.onExtraCallbackWithResult(), -21208413, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(CardNotificationHistoryActivity cardNotificationHistoryActivity, List list, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(new Object[]{cardNotificationHistoryActivity, list, setDetectableSize}, -810352311, alertWithArgs.onExtraCallbackWithResult(), 810352318, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult());
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationHistoryActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallback + 17;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationHistoryActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationHistoryActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationHistoryActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    static void IAuthTabCallback() {
        access000 = new char[]{32418, 32439, 32438};
        IAuthTabCallbackStubProxy = -1184333988;
        writeTypedObject = true;
        extraCallbackWithResult = true;
    }
}
