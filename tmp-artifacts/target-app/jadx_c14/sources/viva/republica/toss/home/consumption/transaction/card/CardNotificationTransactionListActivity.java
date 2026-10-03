package viva.republica.toss.home.consumption.transaction.card;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.TdsResultV0View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.CERT_GetBasicConstraints;
import o.CommonModule_closeView;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DomainConfigProxy;
import o.EncryptedContentInfoParser;
import o.ExoPlayerImplExternalSyntheticLambda5;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FullScreenAd;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.NativeKeyboardObserverSpec;
import o.NativeReactDevToolsRuntimeSettingsModuleSpec;
import o.NativeReactDevToolsSettingsManagerSpec;
import o.NativeVibrationSpec;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UtilsKtExternalSyntheticLambda17$onBackPressed;
import o.access13800;
import o.access27100;
import o.access3602;
import o.addExtra;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.filterCreatePageParams;
import o.formatToParts;
import o.genSignedDataWithSign;
import o.getParamImp;
import o.getRKeyID;
import o.getReloadAndProfileConfig;
import o.getVersionOverride;
import o.getWrite;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onAppConfigModelInit;
import o.onJsBridgeReady;
import o.sendRequest;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setRandomHost;
import o.setReloadAndProfileConfig;
import o.setScaleAndCenter;
import o.transparentBackground;
import o.writeRaw;
import o.zzag;
import o.zzaj;
import o.zzbq;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.home.consumption.transaction.TransactionMenuBottomSheet;
import viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity$;
import viva.republica.toss.util.SmoothScrollLinearLayoutManager;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardNotificationTransactionListActivity extends Hilt_CardNotificationTransactionListActivity implements setScaleAndCenter.onNavigationEvent {
    public static final onWarmupCompleted Companion;
    private static long ICustomTabsCallback;
    public static final int asInterface;
    private static int onActivityResized;
    private static int writeTypedObject;
    private final HashMap<String, NativeReactDevToolsSettingsManagerSpec> IAuthTabCallbackDefault;
    private setScaleAndCenter IAuthTabCallbackStub;
    private final MutableLiveData<Boolean> IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private int access000;
    private NativeReactDevToolsRuntimeSettingsModuleSpec access100;
    private final access27100<NativeReactDevToolsSettingsManagerSpec> asBinder;
    private TransactionMenuBottomSheet extraCallback;
    private final ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> getInterfaceDescriptor;

    @Inject
    public DomainConfigProxy homeChangeHelper;
    private final Lazy onTransact;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityLayout = 1;
    private static int readTypedObject = 0;
    private static int extraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 105
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.$$c(short, byte, int):java.lang.String");
    }

    static {
        onActivityResized = 0;
        ICustomTabsServiceStub();
        Companion = new onWarmupCompleted(null);
        asInterface = 8;
        int i = onActivityLayout + 23;
        onActivityResized = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setDetectableSize);
        int i4 = extraCallbackWithResult + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) onNavigationEvent(-961627148, new Object[]{cardNotificationTransactionListActivity, th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 961627156);
            int i3 = 84 / 0;
        } else {
            unit = (Unit) onNavigationEvent(-961627148, new Object[]{cardNotificationTransactionListActivity, th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 961627156);
        }
        int i4 = readTypedObject + 29;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cardNotificationTransactionListActivity, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardNotificationTransactionListActivity, setDetectableSize);
        int i3 = extraCallbackWithResult + 7;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, sendRequest sendrequest) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(cardNotificationTransactionListActivity, sendrequest);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cardNotificationTransactionListActivity, sendrequest);
        int i3 = extraCallbackWithResult + 1;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cardNotificationTransactionListActivity, view);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(896781125, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -896781118);
        int i4 = readTypedObject + 31;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(140140703, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -140140690);
        int i4 = readTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = extraCallbackWithResult + 59;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        CardNotificationTransactionListActivity cardNotificationTransactionListActivity = (CardNotificationTransactionListActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(cardNotificationTransactionListActivity, th);
        }
        asInterface(cardNotificationTransactionListActivity, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = extraCallbackWithResult + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ ArrayList ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onActivityLayout(function1, obj);
            throw null;
        }
        ArrayList arrayListOnActivityLayout = onActivityLayout(function1, obj);
        int i3 = readTypedObject + 29;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return arrayListOnActivityLayout;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        CardNotificationTransactionListActivity cardNotificationTransactionListActivity = (CardNotificationTransactionListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(1723911178, new Object[]{cardNotificationTransactionListActivity}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1723911169);
        int i4 = extraCallbackWithResult + 53;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return null;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(1124649562, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1124649546);
            return;
        }
        onNavigationEvent(1124649562, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1124649546);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(15873696, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -15873694);
            return;
        }
        onNavigationEvent(15873696, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -15873694);
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = readTypedObject + 95;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onPostMessage(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 119;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(1324123421, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1324123417);
        int i4 = readTypedObject + 3;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onUnminimized(function1, obj);
        int i4 = extraCallbackWithResult + 39;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 97;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardNotificationTransactionListActivity, i);
        int i5 = readTypedObject + 23;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec, NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardNotificationTransactionListActivity, nativeReactDevToolsRuntimeSettingsModuleSpec, nativeReactDevToolsSettingsManagerSpec);
        int i4 = extraCallbackWithResult + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, CardNotificationTransactionListActivity cardNotificationTransactionListActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, cardNotificationTransactionListActivity, deserializeurinullablecollection);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asBinder(cardNotificationTransactionListActivity);
        int i4 = readTypedObject + 9;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ ArrayList onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, getVersionOverride getversionoverride, NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ArrayList arrayListOnWarmupCompleted = onWarmupCompleted(cardNotificationTransactionListActivity, getversionoverride, nativeReactDevToolsSettingsManagerSpec);
        int i4 = readTypedObject + 87;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return arrayListOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Menu menu, getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(menu, getversionoverride);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        int i5 = readTypedObject + 17;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(th);
        int i4 = extraCallbackWithResult + 69;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardNotificationTransactionListActivity, th);
        int i4 = readTypedObject + 111;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardNotificationTransactionListActivity, getversionoverride);
        int i4 = extraCallbackWithResult + 89;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(cardNotificationTransactionListActivity);
        int i4 = extraCallbackWithResult + 73;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cardNotificationTransactionListActivity, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 117;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7;
        int i8 = ~i6;
        int i9 = ~(i8 | i2);
        int i10 = ~i;
        int i11 = ~i2;
        int i12 = i9 | (~(i10 | i11 | i6));
        int i13 = (~(i2 | i10 | i6)) | (~(i11 | i8));
        int i14 = ~(i8 | i10);
        int i15 = i + i6 + i3 + (762713021 * i5) + (1579510587 * i4);
        int i16 = i15 * i15;
        int i17 = ((i * (-1364308824)) - 1074288667) + (i6 * (-1364308824)) + (i12 * 659) + (i13 * 659) + (i14 * 659) + ((-1364308165) * i3) + ((-893132913) * i5) + (986770329 * i4) + (i16 * (-1162149888));
        int i18 = ((i * (-1846875272)) - 1480523776) + ((-1846875272) * i6) + (i12 * (-1613556599)) + (i13 * (-1613556599)) + ((-1613556599) * i14) + (834535424 * i3) + ((-750387200) * i5) + ((-523632640) * i4) + ((-1971257344) * i16) + (i17 * i17 * (-1529413632));
        ExoPlayerImplExternalSyntheticLambda5 exoPlayerImplExternalSyntheticLambda5 = null;
        switch (i18) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                CardNotificationTransactionListActivity cardNotificationTransactionListActivity = (CardNotificationTransactionListActivity) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i19 = 2 % 2;
                int i20 = readTypedObject + 73;
                extraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNull(th);
                getParamImp.onWarmupCompleted(th, cardNotificationTransactionListActivity.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CardNotificationTransactionListActivity", th);
                Unit unit = Unit.INSTANCE;
                int i22 = readTypedObject + 85;
                extraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 9:
                CardNotificationTransactionListActivity cardNotificationTransactionListActivity2 = (CardNotificationTransactionListActivity) objArr[0];
                int i24 = 2 % 2;
                int i25 = extraCallbackWithResult + 23;
                readTypedObject = i25 % 128;
                int i26 = i25 % 2;
                cardNotificationTransactionListActivity2.onExtraCallback(true);
                int i27 = readTypedObject + 117;
                extraCallbackWithResult = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 10:
                return onTransact(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i29 = 2 % 2;
                int i30 = readTypedObject + 45;
                extraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
                function1.invoke(obj);
                int i32 = readTypedObject + 99;
                extraCallbackWithResult = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 14:
                return access000(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return access100(objArr);
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            default:
                CardNotificationTransactionListActivity cardNotificationTransactionListActivity3 = (CardNotificationTransactionListActivity) objArr[0];
                ArrayList arrayList = (ArrayList) objArr[1];
                int i34 = 2 % 2;
                int i35 = extraCallbackWithResult + 29;
                readTypedObject = i35 % 128;
                int i36 = i35 % 2;
                setScaleAndCenter setscaleandcenter = cardNotificationTransactionListActivity3.IAuthTabCallbackStub;
                if (setscaleandcenter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setscaleandcenter = null;
                }
                Intrinsics.checkNotNull(arrayList);
                setscaleandcenter.onExtraCallbackWithResult(arrayList, true);
                ExoPlayerImplExternalSyntheticLambda5 exoPlayerImplExternalSyntheticLambda52 = cardNotificationTransactionListActivity3.IAuthTabCallbackStub;
                if (exoPlayerImplExternalSyntheticLambda52 == null) {
                    int i37 = extraCallbackWithResult + 27;
                    readTypedObject = i37 % 128;
                    int i38 = i37 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    exoPlayerImplExternalSyntheticLambda5 = exoPlayerImplExternalSyntheticLambda52;
                }
                if (exoPlayerImplExternalSyntheticLambda5.getItemCount() <= 1) {
                    int i39 = readTypedObject + 95;
                    extraCallbackWithResult = i39 % 128;
                    int i40 = i39 % 2;
                    TdsResultV0View tdsResultV0View = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity3}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent;
                    Intrinsics.checkNotNullExpressionValue(tdsResultV0View, "");
                    if (tdsResultV0View.getVisibility() == 8) {
                        int i41 = extraCallbackWithResult + 97;
                        readTypedObject = i41 % 128;
                        int i42 = i41 % 2;
                        TdsResultV0View tdsResultV0View2 = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity3}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent;
                        Intrinsics.checkNotNullExpressionValue(tdsResultV0View2, "");
                        tdsResultV0View2.setVisibility(0);
                        TdsResultV0View tdsResultV0View3 = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity3}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent;
                        Object[] objArr2 = new Object[1];
                        a(new char[]{53861, 55134, 55351, 56584, 50914, 52212, 52424, 63027, 64326, 64550, 57834, 60116, 61360, 37013, 39425, 40752, 32786, 34281, 36544, 46022, 46440, 48723, 41848, 42208, 43466, 21174, 22415, 22905, 16940, 18197, 18608, 19911, 30365, 30821, 32087, 26231, 27394, 27870, 4520, 6792, 7224, 343, 2566, 4080, 12493, 13743, 16162, 8261, 9521, 11790, 54205, 54434, 55698, 50033, 50265}, (Process.myPid() >> 22) + 1319, objArr2);
                        tdsResultV0View3.setLottieImageFromUrl(((String) objArr2[0]).intern());
                        TdsResultV0View tdsResultV0View4 = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity3}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent;
                        Intrinsics.checkNotNullExpressionValue(tdsResultV0View4, "");
                        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsResultV0View4, ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity3}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onExtraCallback.getMeasuredHeight());
                        i7 = readTypedObject + 47;
                        extraCallbackWithResult = i7 % 128;
                    }
                    return Unit.INSTANCE;
                }
                TdsResultV0View tdsResultV0View5 = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity3}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(tdsResultV0View5, "");
                tdsResultV0View5.setVisibility(8);
                i7 = extraCallbackWithResult + 55;
                readTypedObject = i7 % 128;
                int i43 = i7 % 2;
                return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(-107278676, new Object[]{th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 107278691);
        int i4 = readTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(setDetectableSize);
        }
        asInterface(setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, ArrayList arrayList) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(181477017, new Object[]{cardNotificationTransactionListActivity, arrayList}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -181477017);
        int i3 = extraCallbackWithResult + 17;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardNotificationTransactionListActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i4 = extraCallbackWithResult + 19;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 109;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardNotificationTransactionListActivity, rect, view, recyclerView, state, i);
        int i5 = readTypedObject + 97;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardNotificationTransactionListActivity, nativeReactDevToolsRuntimeSettingsModuleSpec, view);
        int i4 = readTypedObject + 1;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = readTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 1;
        extraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 21;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return 1009845L;
        }
        throw null;
    }

    @Override // o.SubsamplingScaleImageView1.onNavigationEvent
    public void onExtraCallbackWithResult(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
        Intrinsics.checkNotNullParameter(formattoparts, "");
        int i4 = extraCallbackWithResult + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asBinder implements Function0<genSignedDataWithSign> {
        final /* synthetic */ Activity onWarmupCompleted;

        public asBinder(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final genSignedDataWithSign invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return genSignedDataWithSign.onWarmupCompleted(layoutInflater);
        }
    }

    public static final class onTransact implements Function0<CERT_GetBasicConstraints> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onTransact(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_GetBasicConstraints invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetBasicConstraints.IAuthTabCallback(layoutInflater);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardNotificationTransactionListActivity() {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        this.IAuthTabCallback_Parcel = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new onTransact(this));
        this.onTransact = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new asBinder(this));
        this.IAuthTabCallbackStubProxy = new MutableLiveData<>();
        this.getInterfaceDescriptor = new ArrayList<>();
        this.IAuthTabCallbackDefault = new HashMap<>();
        access27100<NativeReactDevToolsSettingsManagerSpec> access27100VarICustomTabsCallback = access27100.ICustomTabsCallback();
        Intrinsics.checkNotNullExpressionValue(access27100VarICustomTabsCallback, "");
        this.asBinder = access27100VarICustomTabsCallback;
        this.access000 = -1;
    }

    public static final /* synthetic */ void IAuthTabCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationTransactionListActivity.onNavigationEvent(nativeReactDevToolsRuntimeSettingsModuleSpec, z);
        int i4 = extraCallbackWithResult + 119;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationTransactionListActivity.onExtraCallback(z);
        int i4 = readTypedObject + 5;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    public static final /* synthetic */ NativeReactDevToolsRuntimeSettingsModuleSpec onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = cardNotificationTransactionListActivity.access100;
        int i5 = i3 + 37;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return nativeReactDevToolsRuntimeSettingsModuleSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.access3302.IAuthTabCallback
    public /* bridge */ void IAuthTabCallback(@NotNull Context context, @NotNull formatToParts formattoparts, @Nullable String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(context, formattoparts, str);
        int i4 = extraCallbackWithResult + 87;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.access3602.onWarmupCompleted
    public /* bridge */ void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 55;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.access3602.onWarmupCompleted
    public /* bridge */ void onExtraCallback(@NotNull access3602.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(iAuthTabCallback);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.access2702.onExtraCallback
    public /* bridge */ void onExtraCallbackWithResult(@NotNull formatToParts formattoparts) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(formattoparts);
        int i4 = extraCallbackWithResult + 81;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.access2702.onExtraCallback
    public /* bridge */ void onNavigationEvent(@NotNull formatToParts formattoparts) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onNavigationEvent(formattoparts);
        int i4 = extraCallbackWithResult + 75;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.access2702.onExtraCallback
    public /* bridge */ boolean setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return super.setEngagementSignalsCallback();
        }
        super.setEngagementSignalsCallback();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardNotificationTransactionListActivity cardNotificationTransactionListActivity = (CardNotificationTransactionListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CERT_GetBasicConstraints cERT_GetBasicConstraints = (CERT_GetBasicConstraints) cardNotificationTransactionListActivity.IAuthTabCallback_Parcel.getValue();
        if (i3 == 0) {
            return cERT_GetBasicConstraints;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardNotificationTransactionListActivity cardNotificationTransactionListActivity = (CardNotificationTransactionListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = cardNotificationTransactionListActivity.onTransact.getValue();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        genSignedDataWithSign gensigneddatawithsign = (genSignedDataWithSign) value;
        int i4 = readTypedObject + 13;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return gensigneddatawithsign;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 3;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 103;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (ICustomTabsCallback % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, TextUtils.indexOf("", "") + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 24 - TextUtils.getTrimmedLength(""), 19627 - (ViewConfiguration.getLongPressTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (ICustomTabsCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 59, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 77;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), KeyEvent.normalizeMetaState(0) + 59, KeyEvent.normalizeMetaState(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            return zzbq.IAuthTabCallback(intent);
        }
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "");
        Map<String, Object> mapIAuthTabCallback = zzbq.IAuthTabCallback(intent2);
        int i3 = 44 / 0;
        return mapIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        DomainConfigProxy domainConfigProxy = ((CardNotificationTransactionListActivity) objArr[0]).homeChangeHelper;
        if (domainConfigProxy != null) {
            int i2 = extraCallbackWithResult + 21;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 17 / 0;
            }
            return domainConfigProxy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = readTypedObject + 109;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CardNotificationTransactionListActivity cardNotificationTransactionListActivity = (CardNotificationTransactionListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 49;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = cardNotificationTransactionListActivity.tossRouter;
        Object obj = null;
        if (sessionTrackerb != null) {
            int i5 = i2 + 27;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return sessionTrackerb;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = readTypedObject + 99;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final zzag IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        zzag zzagVar = this.tossClock;
        if (zzagVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 27;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zzagVar;
    }

    @Override // viva.republica.toss.home.consumption.transaction.card.Hilt_CardNotificationTransactionListActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).getRoot());
        extraCommand().onNavigationEvent(true);
        extraCommand().onWarmupCompleted(true);
        extraCommand().IAuthTabCallback(((genSignedDataWithSign) onNavigationEvent(-1681956065, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1681956068)).getRoot());
        ConstraintLayout root = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onExtraCallbackWithResult, (View) null, (View) null, false, 14, (Object) null);
        ICustomTabsServiceStubProxy();
        access200();
        onExtraCallback(true);
        writeTypedList();
        int i4 = extraCallbackWithResult + 45;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asBinder(CardNotificationTransactionListActivity cardNotificationTransactionListActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationTransactionListActivity.bo_();
        int i4 = readTypedObject + 123;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 103;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(char[] r21, int r22, boolean r23, int r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.c(char[], int, boolean, int, int, java.lang.Object[]):void");
    }

    private static final Unit onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(getversionoverride);
            cardNotificationTransactionListActivity.onWarmupCompleted(getversionoverride);
            int i3 = 9 / 0;
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(getversionoverride);
        cardNotificationTransactionListActivity.onWarmupCompleted(getversionoverride);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onJsBridgeReady.onNavigationEvent(cardNotificationTransactionListActivity, cardNotificationTransactionListActivity.getString(R.string.app_home_consumption_transaction_card___f9e58f8369), 0, 2, (Object) null);
        cardNotificationTransactionListActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 121;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object[]] */
    private final void writeTypedList() {
        String strIAuthTabCallback;
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        String str = CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().format(IAuthTabCallback().onNavigationEvent().getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = new NativeReactDevToolsRuntimeSettingsModuleSpec(str);
        this.access100 = nativeReactDevToolsRuntimeSettingsModuleSpec;
        this.getInterfaceDescriptor.add(nativeReactDevToolsRuntimeSettingsModuleSpec);
        Intent intent = getIntent();
        if (intent == null || (strIAuthTabCallback = onAppConfigModelInit.IAuthTabCallback.IAuthTabCallback(intent)) == null) {
            strIAuthTabCallback = "";
        }
        if (strIAuthTabCallback.length() > 0) {
            this.access100 = new NativeReactDevToolsRuntimeSettingsModuleSpec(strIAuthTabCallback);
        }
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null && extras.containsKey("cardCode")) {
            int i2 = extraCallbackWithResult + 107;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (zzbq.onNavigationEvent(intent2)) {
                Bundle extras2 = intent2.getExtras();
                if (extras2 != null && (string = extras2.getString("cardCode")) != 0) {
                    if (Intrinsics.areEqual(Integer.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Long.class)) {
                        int i4 = extraCallbackWithResult + 115;
                        readTypedObject = i4 % 128;
                        int i5 = i4 % 2;
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(Integer.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(Integer.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(Integer.class, String.class)) {
                            if (Intrinsics.areEqual(Integer.class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listSplit$default) {
                                    if (((String) obj).length() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                string = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : listSplit$default2) {
                                    if (((String) obj2).length() > 0) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                }
                                string = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : listSplit$default3) {
                                    if (((String) obj3).length() > 0) {
                                        int i6 = extraCallbackWithResult + 1;
                                        readTypedObject = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            arrayList5.add(obj3);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList5.add(obj3);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    int i7 = readTypedObject + 115;
                                    extraCallbackWithResult = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                        throw null;
                                    }
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                }
                                string = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj4 : listSplit$default4) {
                                    if (((String) obj4).length() > 0) {
                                        int i8 = readTypedObject + 3;
                                        extraCallbackWithResult = i8 % 128;
                                        int i9 = i8 % 2;
                                        arrayList7.add(obj4);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    int i10 = extraCallbackWithResult + 31;
                                    readTypedObject = i10 % 128;
                                    int i11 = i10 % 2;
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                }
                                string = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj5 : listSplit$default5) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList9.add(obj5);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    int i12 = extraCallbackWithResult + 109;
                                    readTypedObject = i12 % 128;
                                    int i13 = i12 % 2;
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                }
                                string = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj6 : listSplit$default6) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList11.add(obj6);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                }
                                string = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj7 : listSplit$default7) {
                                    if (((String) obj7).length() > 0) {
                                        int i14 = readTypedObject + 115;
                                        extraCallbackWithResult = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            arrayList13.add(obj7);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList13.add(obj7);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                }
                                string = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(Integer.class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj8 : listSplit$default8) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList15.add(obj8);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it8 = arrayList15.iterator();
                                while (it8.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                }
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(Integer.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    int i15 = extraCallbackWithResult + 125;
                                    readTypedObject = i15 % 128;
                                    int i16 = i15 % 2;
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                        int i17 = extraCallbackWithResult + 11;
                                        readTypedObject = i17 % 128;
                                        int i18 = i17 % 2;
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = Integer.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj10 : enumConstants) {
                                        Intrinsics.checkNotNull(obj10, "");
                                        arrayList18.add((Enum) obj10);
                                    }
                                    Iterator it9 = arrayList18.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    string = (Enum) next;
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(Integer.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    obj = (Integer) (string instanceof Integer ? string : null);
                }
            } else {
                Bundle extras3 = intent2.getExtras();
                Object obj11 = extras3 != null ? extras3.get("cardCode") : null;
                obj = (Integer) (obj11 instanceof Integer ? obj11 : null);
            }
        }
        int iIntValue = (obj != null ? obj : -1).intValue();
        this.access000 = iIntValue;
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = getRKeyID.onWarmupCompleted.IAuthTabCallback(iIntValue).IAuthTabCallback(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda23((CardNotificationTransactionListActivity) this)).onExtraCallback(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda25(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda24((CardNotificationTransactionListActivity) this)), new CardNotificationTransactionListActivity$.ExternalSyntheticLambda27(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda26((CardNotificationTransactionListActivity) this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallback, "");
        onNavigationEvent(deserializeurinullablecollectionOnExtraCallback);
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_scraping_card_history_list, menu);
        int i4 = extraCallbackWithResult + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return null;
    }

    private static final Unit IAuthTabCallback(Menu menu, getVersionOverride getversionoverride) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        (i2 % 2 == 0 ? menu.findItem(R.id.setting) : menu.findItem(R.id.setting)).setVisible(true);
        Unit unit = Unit.INSTANCE;
        int i3 = readTypedObject + 73;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 125;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return null;
    }

    private static final Unit IAuthTabCallbackStub(Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 69;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (menu == null) {
            return super/*im.toss.uikit.base.UIKitBaseActivity*/.onPrepareOptionsMenu(menu);
        }
        if (addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = getRKeyID.onWarmupCompleted.IAuthTabCallback(this.access000).onExtraCallback(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda7(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda6(menu)), new CardNotificationTransactionListActivity$.ExternalSyntheticLambda9(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda8()));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallback, "");
            onNavigationEvent(deserializeurinullablecollectionOnExtraCallback);
        } else {
            menu.findItem(R.id.setting).setVisible(false);
            int i3 = extraCallbackWithResult + 111;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        return super/*im.toss.uikit.base.UIKitBaseActivity*/.onPrepareOptionsMenu(menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != R.id.setting) {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            int i4 = readTypedObject + 47;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        }
        SessionTrackerb sessionTrackerb = (SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352);
        int i6 = this.access000;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        c(new char[]{17, 3, 18, 18, 7, '\f', 5, 65501, 1, 65535, 16, 2, 65505, '\r', 2, 3, 65499, 17, 19, 14, 3, 16, 18, '\r', 17, 17, 65496, 65485, 65485, 6, '\r', 11, 3, 65485, 1, '\r', '\f', 17, 19, 11, 14, 18, 7, '\r', '\f', 65485, 1, 65535, 16, 2, 65485}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 64, 175 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i6);
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        return true;
    }

    private static final void onExtraCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationTransactionListActivity.IEngagementSignalsCallbackDefault();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 73;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{53881, 21257, 53383, 22047}, 33150 >>> (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{53881, 21257, 53383, 22047}, 33150 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        mapOnExtraCallback.put(((String) obj).intern(), "link_card");
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1009847L, false, (String) null, (Map) null, new CardNotificationTransactionListActivity$.ExternalSyntheticLambda21(), 14, (Object) null);
        cardNotificationTransactionListActivity.IEngagementSignalsCallback();
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() {
        int i;
        int i2 = 2 % 2;
        ((genSignedDataWithSign) onNavigationEvent(-1681956065, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1681956068)).onWarmupCompleted.setOnClickListener(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda0(this));
        ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).IAuthTabCallback.setOnRefreshListener(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda1(this));
        TdsBottomCtaV1View tdsBottomCtaV1View = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        if (!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            i = 8;
        } else {
            int i3 = extraCallbackWithResult + 85;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        }
        tdsBottomCtaV1View.setVisibility(i);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        String string = getString(R.string.app_home_consumption_transaction_card___77b96d42b1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, string, new CardNotificationTransactionListActivity$.ExternalSyntheticLambda2(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        this.IAuthTabCallbackStub = new setScaleAndCenter(this, "home.card_alarm_notice", false, 4, null);
        ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onWarmupCompleted.setLayoutManager(new SmoothScrollLinearLayoutManager(this, 0.0f, (Function1) null, 6, (DefaultConstructorMarker) null));
        RecyclerView recyclerView = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onWarmupCompleted;
        RecyclerView.Adapter adapter = this.IAuthTabCallbackStub;
        if (adapter == null) {
            int i5 = readTypedObject + 51;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            adapter = null;
        }
        recyclerView.setAdapter(adapter);
        RecyclerView recyclerView2 = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        transparentBackground.onExtraCallbackWithResult(recyclerView2, new CardNotificationTransactionListActivity$.ExternalSyntheticLambda3(this));
        int i6 = extraCallbackWithResult + 75;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity r21, android.graphics.Rect r22, android.view.View r23, androidx.recyclerview.widget.RecyclerView r24, androidx.recyclerview.widget.RecyclerView.State r25, int r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = 2
            int r6 = r5 % r5
            int r6 = viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.readTypedObject
            int r6 = r6 + 113
            int r7 = r6 % 128
            viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.extraCallbackWithResult = r7
            int r6 = r6 % r5
            java.lang.String r7 = ""
            if (r6 != 0) goto L2d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            r1 = 54
            int r1 = r1 / 0
            if (r4 == 0) goto La7
            goto L3b
        L2d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            if (r4 == 0) goto La7
        L3b:
            r1 = r21
            o.setScaleAndCenter r2 = r1.IAuthTabCallbackStub
            if (r2 != 0) goto L45
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r2 = 0
        L45:
            int r2 = r2.getItemCount()
            int r2 = r2 + (-1)
            if (r4 != r2) goto La7
            int r2 = viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.readTypedObject
            int r2 = r2 + 19
            int r3 = r2 % 128
            viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.extraCallbackWithResult = r3
            int r2 = r2 % r5
            java.lang.Object[] r9 = new java.lang.Object[]{r21}
            int r10 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            int r11 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            int r13 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            int r12 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            r2 = -1506617502(0xffffffffa632d762, float:-6.2048054E-16)
            r20 = 1506617507(0x59cd28a3, float:7.2183813E15)
            r8 = r2
            r14 = r20
            java.lang.Object r3 = onNavigationEvent(r8, r9, r10, r11, r12, r13, r14)
            o.CERT_GetBasicConstraints r3 = (o.CERT_GetBasicConstraints) r3
            im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View r3 = r3.onExtraCallback
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto La7
            java.lang.Object[] r15 = new java.lang.Object[]{r21}
            int r16 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            int r17 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            int r19 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            int r18 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
            r14 = r2
            java.lang.Object r1 = onNavigationEvent(r14, r15, r16, r17, r18, r19, r20)
            o.CERT_GetBasicConstraints r1 = (o.CERT_GetBasicConstraints) r1
            im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View r1 = r1.onExtraCallback
            int r1 = r1.getMeasuredHeight()
            r0.bottom = r1
        La7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.onNavigationEvent(viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity, android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State, int):kotlin.Unit");
    }

    private static final Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{53881, 21257, 53383, 22047}, TextUtils.lastIndexOf("", (char) 4, 1) * 33148, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{53881, 21257, 53383, 22047}, 33148 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            obj = objArr2[0];
        }
        mapOnExtraCallback.put(((String) obj).intern(), "notice");
        Unit unit = Unit.INSTANCE;
        int i3 = extraCallbackWithResult + 93;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    @Override // o.access3602.onWarmupCompleted
    public void ICustomTabsServiceDefault() throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1009847L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CardNotificationTransactionListActivity.IAuthTabCallback((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        IEngagementSignalsCallback();
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() throws Throwable {
        String strOnNavigationEvent;
        int i = 2 % 2;
        if (addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            Object[] objArr = new Object[1];
            c(new char[]{15, 16, 1, 14, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, '\t', 21, 0, 65533, 16, 65533, 65483, 14, 1, 3, 5}, 3 - MotionEvent.axisFromString(""), false, 27 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 176 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            Uri uri = Uri.parse(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(uri, "");
            Object[] objArr2 = new Object[1];
            c(new char[]{65535, 15, 1, 0, 11, 65503, 0, 14, 65533}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031488).substring(0, 1).length(), true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, 176 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), String.valueOf(this.access000));
            Object[] objArr3 = new Object[1];
            c(new char[]{'\t', 65516, 11, 65530, 65532, '\t', 0, 65531, 65532, '\t', 3}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 95, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132020566).substring(0, 5).codePointAt(4) - 21, ((Process.getThreadPriority(0) + 20) >> 6) + 181, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new char[]{53886, 53133, 59799, 35767, 42411, 18352, 25052, 973, 15830, 57258, 63920, 39845, 46361, 22291, 28934, 4915, 3442, 12075, 51544, 60236, 34138, 42849, 16750, 25470, 7297, 16009, 55424, 64180}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022882).substring(0, 9).codePointAt(2) + 7569, objArr4);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(strIntern, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a(new char[]{53887, 12255, 10501, 11085, 9379, 9964, 8226, 8830}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025031).substring(0, 2).length() + 64949, objArr5);
            String strOnNavigationEvent2 = filterCreatePageParams.onNavigationEvent(uri, new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), "home.card_alarm_notice")});
            int i2 = readTypedObject + 93;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent = strOnNavigationEvent2;
        } else {
            int i4 = extraCallbackWithResult + 87;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr6 = new Object[1];
            a(new char[]{53886, 12697, 5567, 31179, 24059, 41244, 34084, 59737, 52598, 53470, 13544, 6281, 31971, 16385, 42029, 34889, 60466, 62350, 55226, 15321, 8176, 25355, 18223, 43871, 36711}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132023879).substring(0, 4).codePointAt(2) + 58301, objArr6);
            Uri uri2 = Uri.parse(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("method", "OPEN_BANKING");
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("bankListTitle", getString(R.string.app_home_consumption_transaction_card___2880311b0a));
            Object[] objArr7 = new Object[1];
            c(new char[]{'\t', 65516, 11, 65530, 65532, '\t', 0, 65531, 65532, '\t', 3}, 10 - (ViewConfiguration.getTapTimeout() >> 16), true, 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022154).substring(0, 2).codePointAt(0) + 144, objArr7);
            String strIntern2 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a(new char[]{53886, 53133, 59799, 35767, 42411, 18352, 25052, 973, 15830, 57258, 63920, 39845, 46361, 22291, 28934, 4915, 3442, 12075, 51544, 60236, 34138, 42849, 16750, 25470, 7297, 16009, 55424, 64180}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7650, objArr8);
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(strIntern2, ((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            a(new char[]{53887, 12255, 10501, 11085, 9379, 9964, 8226, 8830}, 64952 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr9);
            strOnNavigationEvent = filterCreatePageParams.onNavigationEvent(uri2, new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), "home.card_alarm_notice")});
        }
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352), this, strOnNavigationEvent, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
    }

    private static final ArrayList onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ArrayList arrayList = (ArrayList) function1.invoke(obj);
        int i4 = readTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ArrayList onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, getVersionOverride getversionoverride, NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeReactDevToolsSettingsManagerSpec, "");
        setScaleAndCenter setscaleandcenter = cardNotificationTransactionListActivity.IAuthTabCallbackStub;
        if (setscaleandcenter == null) {
            int i4 = readTypedObject + 25;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                throw null;
            }
            setscaleandcenter = null;
        }
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult();
        String str = (String) NativeReactDevToolsSettingsManagerSpec.onNavigationEvent(iOnExtraCallbackWithResult, -1478617677, UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17$onBackPressed.onExtraCallbackWithResult(), 1478617678, new Object[]{nativeReactDevToolsSettingsManagerSpec}, iOnExtraCallbackWithResult2);
        String strOnNavigationEvent = getversionoverride.onNavigationEvent();
        String str2 = (String) getVersionOverride.onWarmupCompleted(642069778, zzmr.onExtraCallbackWithResult(), new Object[]{getversionoverride}, -642069776, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        String string = cardNotificationTransactionListActivity.getString(R.string.app_home_consumption_transaction_card___2151bbb1a6);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ArrayList<NativeKeyboardObserverSpec> arrayListOnExtraCallback = setscaleandcenter.onExtraCallback(nativeReactDevToolsSettingsManagerSpec, new access3602.IAuthTabCallback(str, strOnNavigationEvent, str2, string, false, null, null, false, null, 496, null));
        int i6 = extraCallbackWithResult + 117;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return arrayListOnExtraCallback;
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 15;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 20 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = readTypedObject + 3;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return unit;
    }

    private static final void onUnminimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = extraCallbackWithResult + 85;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onWarmupCompleted(getVersionOverride getversionoverride) {
        int i = 2 % 2;
        this.IAuthTabCallbackStubProxy.observe(this, new BaseActivity.warmup(new onExtraCallbackWithResult()));
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = this.asBinder.onWarmupCompleted(clearTid.onExtraCallback()).onNavigationEvent(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda11(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda10(this, getversionoverride)));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingOnNavigationEvent.onWarmupCompleted(NetConverter3.onExtraCallback()).onWarmupCompleted(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda13(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda12(this)), new CardNotificationTransactionListActivity$.ExternalSyntheticLambda15(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda14()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        int i2 = readTypedObject + 123;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy.postValue(Boolean.valueOf(z));
        int i4 = readTypedObject + 1;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 35;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onExtraCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, sendRequest sendrequest) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationTransactionListActivity.getInterfaceDescriptor.clear();
        cardNotificationTransactionListActivity.getInterfaceDescriptor.addAll(sendrequest.onExtraCallbackWithResult());
        cardNotificationTransactionListActivity.onVerticalScrollEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 13;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, cardNotificationTransactionListActivity.getContext(), true, (initMiniApp) null, (Function0) null, (Function1) null, 50, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, cardNotificationTransactionListActivity.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CardNotificationTransactionListActivity", th);
        return Unit.INSTANCE;
    }

    private final void access200() throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 29426), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, (ViewConfiguration.getLongPressTimeout() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29427), 22 - Color.green(0), KeyEvent.keyCodeFromString("") + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            writeRaw<getReloadAndProfileConfig> writerawOnWarmupCompleted = ((FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda18(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda17(this)), new CardNotificationTransactionListActivity$.ExternalSyntheticLambda20(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda19(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            int i2 = extraCallbackWithResult + 81;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit IAuthTabCallback(boolean z, CardNotificationTransactionListActivity cardNotificationTransactionListActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).IAuthTabCallback.setRefreshing(true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 107;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 95;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity) {
        SwipeRefreshLayout swipeRefreshLayout;
        boolean z;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {cardNotificationTransactionListActivity};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 != 0) {
            swipeRefreshLayout = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 1506617507)).IAuthTabCallback;
            z = true;
        } else {
            swipeRefreshLayout = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 1506617507)).IAuthTabCallback;
            z = false;
        }
        swipeRefreshLayout.setRefreshing(z);
        int i4 = extraCallbackWithResult + 107;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 105;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec, NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        cardNotificationTransactionListActivity.IAuthTabCallbackDefault.put(nativeReactDevToolsRuntimeSettingsModuleSpec.IAuthTabCallback(), nativeReactDevToolsSettingsManagerSpec);
        cardNotificationTransactionListActivity.asBinder.onWarmupCompleted(nativeReactDevToolsSettingsManagerSpec);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 119;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void onNavigationEvent(NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            ((genSignedDataWithSign) onNavigationEvent(-1681956065, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1681956068)).onWarmupCompleted.setText(nativeReactDevToolsRuntimeSettingsModuleSpec.onNavigationEvent(IAuthTabCallback()));
            this.IAuthTabCallbackDefault.get(nativeReactDevToolsRuntimeSettingsModuleSpec.IAuthTabCallback());
            throw null;
        }
        ((genSignedDataWithSign) onNavigationEvent(-1681956065, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1681956068)).onWarmupCompleted.setText(nativeReactDevToolsRuntimeSettingsModuleSpec.onNavigationEvent(IAuthTabCallback()));
        NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec = this.IAuthTabCallbackDefault.get(nativeReactDevToolsRuntimeSettingsModuleSpec.IAuthTabCallback());
        if (nativeReactDevToolsSettingsManagerSpec != null) {
            this.asBinder.onWarmupCompleted(nativeReactDevToolsSettingsManagerSpec);
            int i3 = extraCallbackWithResult + 61;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        onVerticalScrollEvent();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 29427), TextUtils.indexOf("", "") + 22, 24734 - Color.alpha(0), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29426), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            writeRaw<setReloadAndProfileConfig> writerawIAuthTabCallback = ((FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback(String.valueOf(this.access000), nativeReactDevToolsRuntimeSettingsModuleSpec.IAuthTabCallback());
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback2.onExtraCallback(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda31(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda30(z, this))).onWarmupCompleted(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda32(this)).onNavigationEvent(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda34(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda33(this, nativeReactDevToolsRuntimeSettingsModuleSpec)), new CardNotificationTransactionListActivity$.ExternalSyntheticLambda36(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda35(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(new char[]{7, 65532, 7, 65535, 65528}, 5 - KeyEvent.normalizeMetaState(0), false, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 185, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "TITLE");
        NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = cardNotificationTransactionListActivity.access100;
        if (nativeReactDevToolsRuntimeSettingsModuleSpec == null) {
            int i4 = readTypedObject + 77;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            nativeReactDevToolsRuntimeSettingsModuleSpec = null;
        }
        setDetectableSize.onExtraCallback("year_month", nativeReactDevToolsRuntimeSettingsModuleSpec.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = readTypedObject + 119;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity r3, o.SetDetectableSize r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.extraCallbackWithResult
            int r1 = r1 + 51
            int r2 = r1 % 128
            viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.readTypedObject = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            o.NativeReactDevToolsRuntimeSettingsModuleSpec r3 = r3.access100
            r1 = 73
            int r1 = r1 / 0
            if (r3 != 0) goto L27
            goto L23
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            o.NativeReactDevToolsRuntimeSettingsModuleSpec r3 = r3.access100
            if (r3 != 0) goto L27
        L23:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r3 = 0
        L27:
            java.lang.String r1 = "year_month"
            java.lang.String r3 = r3.IAuthTabCallback()
            r4.onExtraCallback(r1, r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            int r4 = viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.readTypedObject
            int r4 = r4 + 99
            int r1 = r4 % 128
            viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.extraCallbackWithResult = r1
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity.onExtraCallback(viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity, o.SetDetectableSize):kotlin.Unit");
    }

    private static final Unit onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, int i) {
        int i2 = 2 % 2;
        NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = cardNotificationTransactionListActivity.getInterfaceDescriptor.get(i);
        Intrinsics.checkNotNullExpressionValue(nativeReactDevToolsRuntimeSettingsModuleSpec, "");
        cardNotificationTransactionListActivity.access100 = nativeReactDevToolsRuntimeSettingsModuleSpec;
        cardNotificationTransactionListActivity.onExtraCallback(true);
        ConvertByteArrayToFloatArray.onExtraCallback(1009855L, false, (String) null, (Map) null, new CardNotificationTransactionListActivity$.ExternalSyntheticLambda4(cardNotificationTransactionListActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = readTypedObject + 77;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1231921L, false, (String) null, (Map) null, new CardNotificationTransactionListActivity$.ExternalSyntheticLambda28(this), 14, (Object) null);
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(this);
        String string = getString(R.string.app_home_consumption_transaction_card___58bdba00ed);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = iAuthTabCallback.onExtraCallbackWithResult(string).onWarmupCompleted(false).onExtraCallback(true);
        ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> arrayList = this.getInterfaceDescriptor;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        int i2 = extraCallbackWithResult + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            arrayList2.add(((NativeReactDevToolsRuntimeSettingsModuleSpec) it.next()).onExtraCallbackWithResult(IAuthTabCallback()));
        }
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallbackOnExtraCallback2 = iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult(arrayList2).onExtraCallback(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda29(this));
        ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> arrayList3 = this.getInterfaceDescriptor;
        NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = this.access100;
        if (nativeReactDevToolsRuntimeSettingsModuleSpec == null) {
            int i4 = readTypedObject + 91;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = extraCallbackWithResult + 23;
            readTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 4;
            }
            nativeReactDevToolsRuntimeSettingsModuleSpec = null;
        }
        Object[] objArr = {iAuthTabCallbackOnExtraCallback2.IAuthTabCallback(arrayList3.indexOf(nativeReactDevToolsRuntimeSettingsModuleSpec))};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((BrickModuleImplExternalSyntheticLambda1) BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2)).show();
    }

    private static final Unit onNavigationEvent(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        cardNotificationTransactionListActivity.access100 = nativeReactDevToolsRuntimeSettingsModuleSpec;
        cardNotificationTransactionListActivity.onExtraCallback(true);
        TdsResultV0View tdsResultV0View = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsResultV0View, "");
        tdsResultV0View.setVisibility(8);
        LottieAnimationView lottieAnimationViewWriteTypedObject = ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{cardNotificationTransactionListActivity}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent.writeTypedObject();
        Intrinsics.checkNotNullExpressionValue(lottieAnimationViewWriteTypedObject, "");
        zzck.onWarmupCompleted(lottieAnimationViewWriteTypedObject);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 19;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ArrayList<NativeReactDevToolsRuntimeSettingsModuleSpec> arrayList = this.getInterfaceDescriptor;
            NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = this.access100;
            if (nativeReactDevToolsRuntimeSettingsModuleSpec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                nativeReactDevToolsRuntimeSettingsModuleSpec = null;
            }
            int iIndexOf = arrayList.indexOf(nativeReactDevToolsRuntimeSettingsModuleSpec);
            ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent.setTitle(getString(R.string.app_home_consumption_transaction_card___05e2e1751f));
            if (iIndexOf >= 0) {
                int i3 = extraCallbackWithResult + 29;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
                if (iIndexOf < this.getInterfaceDescriptor.size() - 1) {
                    NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec2 = this.getInterfaceDescriptor.get(iIndexOf + 1);
                    Intrinsics.checkNotNullExpressionValue(nativeReactDevToolsRuntimeSettingsModuleSpec2, "");
                    NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec3 = nativeReactDevToolsRuntimeSettingsModuleSpec2;
                    ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent.setButtonLabel(nativeReactDevToolsRuntimeSettingsModuleSpec3.onNavigationEvent(IAuthTabCallback()) + " 내역 보기");
                    ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent.setOnButtonClickListener(new CardNotificationTransactionListActivity$.ExternalSyntheticLambda22(this, nativeReactDevToolsRuntimeSettingsModuleSpec3));
                    return;
                }
            }
            ((CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507)).onNavigationEvent.setButtonLabel((CharSequence) null);
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{53881, 21257, 53383, 22047}, (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)) * 33150, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{53881, 21257, 53383, 22047}, 33150 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        mapOnExtraCallback.put(((String) obj).intern(), "transaction");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access2702.onExtraCallback
    public void onExtraCallback(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
        Intrinsics.checkNotNullParameter(formattoparts, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1009847L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                return CardNotificationTransactionListActivity.onNavigationEvent((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352), this, nativeVibrationSpec.onExtraCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = extraCallbackWithResult + 33;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.home.consumption.transaction.card.Hilt_CardNotificationTransactionListActivity
    public void onPause() {
        int i = 2 % 2;
        super.onPause();
        TransactionMenuBottomSheet transactionMenuBottomSheet = this.extraCallback;
        if (transactionMenuBottomSheet != null) {
            int i2 = extraCallbackWithResult + 9;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            transactionMenuBottomSheet.dismissAllowingStateLoss();
        }
        this.extraCallback = null;
        int i4 = extraCallbackWithResult + 75;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.access2702.onExtraCallback
    public boolean IAuthTabCallback(@NotNull formatToParts formattoparts) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(formattoparts, "");
        TransactionMenuBottomSheet transactionMenuBottomSheet = new TransactionMenuBottomSheet((SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352), formattoparts, (Function2) null, "home.card_alarm_notice", 4, (DefaultConstructorMarker) null);
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        transactionMenuBottomSheet.show(supportFragmentManager, "TransactionMenuBottomSheet");
        this.extraCallback = transactionMenuBottomSheet;
        int i2 = extraCallbackWithResult + 125;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access2702.onExtraCallback
    public void onWarmupCompleted(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts) {
        SessionTrackerb sessionTrackerb;
        String strOnExtraCallback;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 121;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
            Intrinsics.checkNotNullParameter(formattoparts, "");
            sessionTrackerb = (SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352);
            strOnExtraCallback = nativeVibrationSpec.onExtraCallback();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 52;
        } else {
            Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
            Intrinsics.checkNotNullParameter(formattoparts, "");
            sessionTrackerb = (SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352);
            strOnExtraCallback = nativeVibrationSpec.onExtraCallback();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 60;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, this, strOnExtraCallback, z, function1, bundle, z2, i, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.SubsamplingScaleImageView1.onNavigationEvent
    public void onNavigationEvent(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
        Intrinsics.checkNotNullParameter(formattoparts, "");
        SessionTrackerb.IAuthTabCallback((SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352), this, nativeVibrationSpec.onExtraCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = extraCallbackWithResult + 35;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Boolean, Unit> {
        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Boolean bool) throws Throwable {
            Boolean bool2 = bool;
            CardNotificationTransactionListActivity cardNotificationTransactionListActivity = CardNotificationTransactionListActivity.this;
            NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpecOnWarmupCompleted = CardNotificationTransactionListActivity.onWarmupCompleted(cardNotificationTransactionListActivity);
            if (nativeReactDevToolsRuntimeSettingsModuleSpecOnWarmupCompleted == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                nativeReactDevToolsRuntimeSettingsModuleSpecOnWarmupCompleted = null;
            }
            Intrinsics.checkNotNull(bool2);
            CardNotificationTransactionListActivity.IAuthTabCallback(cardNotificationTransactionListActivity, nativeReactDevToolsRuntimeSettingsModuleSpecOnWarmupCompleted, bool2.booleanValue());
        }
    }

    public static /* synthetic */ Unit onTransact(Throwable th) {
        return (Unit) onNavigationEvent(570288741, new Object[]{th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -570288740);
    }

    public static /* synthetic */ Unit onNavigationEvent(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Throwable th) {
        return (Unit) onNavigationEvent(-1934489142, new Object[]{cardNotificationTransactionListActivity, th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1934489159);
    }

    private static final Unit onExtraCallback(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, Throwable th) {
        return (Unit) onNavigationEvent(-961627148, new Object[]{cardNotificationTransactionListActivity, th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 961627156);
    }

    private final genSignedDataWithSign validateRelationship() {
        return (genSignedDataWithSign) onNavigationEvent(-1681956065, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1681956068);
    }

    private final CERT_GetBasicConstraints ICustomTabsService_Parcel() {
        return (CERT_GetBasicConstraints) onNavigationEvent(-1506617502, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1506617507);
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(15873696, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -15873694);
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(1324123421, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1324123417);
    }

    private static final void onActivityResized(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(140140703, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -140140690);
    }

    private static final Unit onExtraCallbackWithResult(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, ArrayList arrayList) {
        return (Unit) onNavigationEvent(181477017, new Object[]{cardNotificationTransactionListActivity, arrayList}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -181477017);
    }

    private static final Unit asInterface(Throwable th) {
        return (Unit) onNavigationEvent(-107278676, new Object[]{th}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 107278691);
    }

    private static final void IAuthTabCallbackStub(CardNotificationTransactionListActivity cardNotificationTransactionListActivity) throws Throwable {
        onNavigationEvent(1723911178, new Object[]{cardNotificationTransactionListActivity}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1723911169);
    }

    private static final void ICustomTabsCallbackStub(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(1124649562, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1124649546);
    }

    private static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) throws Throwable {
        onNavigationEvent(896781125, new Object[]{function1, obj}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -896781118);
    }

    public final DomainConfigProxy onNavigationEvent() {
        return (DomainConfigProxy) onNavigationEvent(-1927823839, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1927823849);
    }

    public final SessionTrackerb updateVisuals() {
        return (SessionTrackerb) onNavigationEvent(-1897953340, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1897953352);
    }

    @Override // viva.republica.toss.home.consumption.transaction.card.Hilt_CardNotificationTransactionListActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = readTypedObject + 105;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.home.consumption.transaction.card.Hilt_CardNotificationTransactionListActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.home.consumption.transaction.card.Hilt_CardNotificationTransactionListActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ICustomTabsServiceStub() {
        ICustomTabsCallback = -5140196480806070470L;
        writeTypedObject = 478308965;
    }
}
