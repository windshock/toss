package im.toss.features.benefit.log;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.nativead.NativeAd;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.benefit.R;
import im.toss.features.benefit.dto.AdMobFallback;
import im.toss.features.benefit.dto.Cards;
import im.toss.features.benefit.dto.CardsV2;
import im.toss.features.benefit.log.BenefitTabImpressionHandler$;
import im.toss.features.benefit.ui.component.ThumbnailAdMobController;
import im.toss.features.benefit.ui.component.VideoAdsController;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BasicSystemInfoExtension;
import o.ChoosePhoneContactBridgeExtension1;
import o.CloseableUtils;
import o.ContactAccount;
import o.DeviceOrientationBridgeExtension;
import o.IAnimation;
import o.RotationVectorAbility;
import o.RotationVectorAbility1;
import o.RotationVectorAbility3;
import o.SensorBridgeExtension;
import o.SensorBridgeExtension3;
import o.SensorBridgeExtension4;
import o.ShakeMonitorBridgeExtension;
import o.ShakeMonitorBridgeExtension1;
import o.SimpleWorkflowUnit;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TinyAppHostApduService1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.checkSystemPermission;
import o.clearFaultAdjacentMetadata;
import o.ea10;
import o.enableRotationVector;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBillingCycleCount;
import o.getBorderRadius;
import o.getDeviceBaseInfo;
import o.getNameByImsi;
import o.getPricingPhaseList;
import o.getSensor;
import o.getShine;
import o.getWrite;
import o.handleNoThread;
import o.maybeUpdateAnimatable;
import o.registerAccelerometer;
import o.sendBridgeResponse;
import o.setAutoCaptured;
import o.setCurrentIndex;
import o.setNode;
import o.setRandomHost;
import o.startDeviceMotionListening;
import o.stopDeviceMotionListening;
import o.watchShake;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitTabImpressionHandler extends RecyclerView.OnScrollListener implements DefaultLifecycleObserver {
    public static final onWarmupCompleted Companion;
    private static final Set<String> IAuthTabCallback;
    private static long ICustomTabsCallbackDefault;
    private static int ICustomTabsCallbackStub;
    private static int isEngagementSignalsApiAvailable;
    private static char onRelationshipValidationResult;
    public static final int onWarmupCompleted;
    private final getBorderRadius<List<IAuthTabCallback>> IAuthTabCallbackDefault;
    private final Set<SensorBridgeExtension3> IAuthTabCallbackStub;
    private final Rect IAuthTabCallbackStubProxy;
    private final Rect IAuthTabCallback_Parcel;
    private final getPricingPhaseList ICustomTabsCallback;
    private final AppSetIdAndScope1 access000;
    private Set<SensorBridgeExtension3> access100;
    private final Set<registerAccelerometer> asBinder;
    private Function0<Rect> asInterface;
    private final Rect extraCallback;
    private final IAnimation<Boolean> extraCallbackWithResult;
    private TextFieldScrollKtExternalSyntheticLambda0 getInterfaceDescriptor;
    private final Rect onActivityLayout;
    private final ContactAccount onActivityResized;
    private boolean onExtraCallback;
    private final getBorderRadius<String> onExtraCallbackWithResult;
    private boolean onMessageChannelReady;
    private Long onMinimized;
    private final float onNavigationEvent;
    private ViewTreeObserver.OnScrollChangedListener onPostMessage;
    private final Function0<Integer> onTransact;
    private RecyclerView readTypedObject;
    private final getBorderRadius<String> writeTypedObject;
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCommand = 0;
    private static int onUnminimized = 0;
    private static int ICustomTabsCallbackStubProxy = 1;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnWarmupCompleted = BenefitTabImpressionHandler.onWarmupCompleted(BenefitTabImpressionHandler.this, (IAuthTabCallback) null, (access13800) this);
            int i4 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = s * 4;
        int i4 = i + 109;
        int i5 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i5];
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 87;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i4 = onUnminimized + 105;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, startDeviceMotionListening startdevicemotionlistening, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(benefitTabImpressionHandler, startdevicemotionlistening, z);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 69;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i4 = ICustomTabsCallbackStubProxy + 47;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 81;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onMessageChannelReady(benefitTabImpressionHandler, sensorBridgeExtension3, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnMessageChannelReady = onMessageChannelReady(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i3 = ICustomTabsCallbackStubProxy + 91;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnMessageChannelReady;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 79;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit access100(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i4 = ICustomTabsCallbackStubProxy + 29;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit asBinder(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 103;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 != 0) {
            return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 15507591, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -15507583, iIAuthTabCallback, objArr);
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 75;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(benefitTabImpressionHandler, sensorBridgeExtension3, zBooleanValue);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        int i5 = onUnminimized + 23;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnActivityLayout;
    }

    public static /* synthetic */ Unit asInterface(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
            return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1033424053, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1033424065, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), objArr);
        }
        Object[] objArr2 = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 5;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i4 = onUnminimized + 61;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unitExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        getSensor.onExtraCallback onextracallback = (getSensor.onExtraCallback) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onUnminimized + 73;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {benefitTabImpressionHandler, onextracallback, Boolean.valueOf(zBooleanValue)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2040478486, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2040478502, iIAuthTabCallback, objArr2);
        int i4 = ICustomTabsCallbackStubProxy + 99;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 73;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        }
        extraCallback(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, setNode setnode, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 113;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(benefitTabImpressionHandler, setnode, z);
        int i4 = onUnminimized + 19;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = onUnminimized + 107;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asBinder(benefitTabImpressionHandler);
        int i4 = ICustomTabsCallbackStubProxy + 79;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 75;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = onTransact();
        int i4 = ICustomTabsCallbackStubProxy + 13;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return iOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1214930953, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1214930949, iIAuthTabCallback, objArr);
        int i4 = ICustomTabsCallbackStubProxy + 59;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler, String str) {
        int i = 2 % 2;
        int i2 = onUnminimized + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(benefitTabImpressionHandler, str);
        int i4 = onUnminimized + 33;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 87;
        onUnminimized = i2 % 128;
        if (i2 % 2 == 0) {
            return onRelationshipValidationResult(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        }
        onRelationshipValidationResult(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BenefitTabImpressionHandler benefitTabImpressionHandler, watchShake watchshake, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(benefitTabImpressionHandler, watchshake, z);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final int onTransact() {
        int i = 2 % 2;
        int i2 = onUnminimized + 81;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public static /* synthetic */ Unit onTransact(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i4 = onUnminimized + 113;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackStub;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i3);
        int i11 = i9 | i10 | (~(i5 | i6));
        int i12 = i8 | i5;
        int i13 = (~((~i6) | i5)) | i10;
        int i14 = i5 + i3 + i2 + (111814883 * i) + (1975835455 * i4);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i5) - 1583611904) + (47848387 * i3) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i2) + ((-648806400) * i) + (1432616960 * i4) + (442957824 * i15);
        int i17 = ((i5 * 961080817) - 60187382) + (i3 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i2 * 961079685) + (i * 1618335983) + (i4 * 193609403) + (i15 * 1988296704);
        switch (i16 + (i17 * i17 * 176226304)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
                watchShake watchshake = (watchShake) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int iIntValue = ((Number) objArr[3]).intValue();
                Object obj = objArr[4];
                int i18 = 2 % 2;
                int i19 = onUnminimized + 53;
                int i20 = i19 % 128;
                ICustomTabsCallbackStubProxy = i20;
                int i21 = i19 % 2;
                if ((iIntValue & 2) != 0) {
                    int i22 = i20 + 117;
                    onUnminimized = i22 % 128;
                    zBooleanValue = i22 % 2 != 0;
                }
                benefitTabImpressionHandler.onNavigationEvent(watchshake, zBooleanValue);
                return null;
            case 10:
                return onTransact(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                BenefitTabImpressionHandler benefitTabImpressionHandler2 = (BenefitTabImpressionHandler) objArr[0];
                SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int i23 = 2 % 2;
                int i24 = onUnminimized + 7;
                ICustomTabsCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                Unit unitOnUnminimized = onUnminimized(benefitTabImpressionHandler2, sensorBridgeExtension3, zBooleanValue2);
                int i26 = onUnminimized + 119;
                ICustomTabsCallbackStubProxy = i26 % 128;
                int i27 = i26 % 2;
                return unitOnUnminimized;
            case 15:
                return access000(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(benefitTabImpressionHandler, sensorBridgeExtension3, z);
        int i4 = onUnminimized + 37;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMinimized;
    }

    public static /* synthetic */ void onWarmupCompleted(BenefitTabImpressionHandler benefitTabImpressionHandler, String str) {
        int i = 2 % 2;
        int i2 = onUnminimized + 83;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1239719275, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1239719262, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler, str});
            return;
        }
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback4, 1239719275, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1239719262, iIAuthTabCallback3, new Object[]{benefitTabImpressionHandler, str});
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public BenefitTabImpressionHandler(@NotNull ContactAccount contactAccount, @NotNull getPricingPhaseList getpricingphaselist, float f, @NotNull Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(contactAccount, "");
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onActivityResized = contactAccount;
        this.ICustomTabsCallback = getpricingphaselist;
        this.onNavigationEvent = f;
        this.onTransact = function0;
        this.access000 = ea10.onExtraCallbackWithResult("ImpressionHandler");
        this.extraCallback = new Rect();
        this.IAuthTabCallbackStubProxy = new Rect();
        this.onActivityLayout = new Rect();
        this.IAuthTabCallback_Parcel = new Rect();
        this.access100 = new LinkedHashSet();
        this.IAuthTabCallbackStub = Collections.synchronizedSet(new LinkedHashSet());
        this.asBinder = Collections.synchronizedSet(new LinkedHashSet());
        this.IAuthTabCallbackDefault = getShine.onExtraCallback(0, 20, CloseableUtils.SUSPEND);
        CloseableUtils closeableUtils = CloseableUtils.DROP_OLDEST;
        this.onExtraCallbackWithResult = getShine.onExtraCallback(0, 1, closeableUtils);
        this.writeTypedObject = getShine.onExtraCallback(0, 10, closeableUtils);
        this.extraCallbackWithResult = new IAuthTabCallback_Parcel(contactAccount.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void IAuthTabCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, IAuthTabCallback iAuthTabCallback) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 21;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        benefitTabImpressionHandler.onNavigationEvent(iAuthTabCallback);
        int i4 = ICustomTabsCallbackStubProxy + 63;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IAnimation IAuthTabCallbackDefault(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = onUnminimized + 97;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAnimation<Boolean> iAnimation = benefitTabImpressionHandler.extraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return iAnimation;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallbackStub(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 105;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        getBorderRadius<String> getborderradius = benefitTabImpressionHandler.writeTypedObject;
        int i5 = i3 + 99;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return getborderradius;
    }

    public static final /* synthetic */ ContactAccount asInterface(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        ContactAccount contactAccount = benefitTabImpressionHandler.onActivityResized;
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        int i6 = i3 + 13;
        ICustomTabsCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
        return contactAccount;
    }

    public static final /* synthetic */ void onExtraCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, NativeAd nativeAd) {
        int i = 2 % 2;
        int i2 = onUnminimized + 63;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -445100358, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 445100361, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler, nativeAd});
        int i4 = ICustomTabsCallbackStubProxy + 51;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 117;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<List<IAuthTabCallback>> getborderradius = benefitTabImpressionHandler.IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ Set onExtraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 41;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Set<SensorBridgeExtension3> set = benefitTabImpressionHandler.IAuthTabCallbackStub;
        int i5 = i2 + 115;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static final /* synthetic */ getBorderRadius onNavigationEvent(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<String> getborderradius = benefitTabImpressionHandler.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ void onNavigationEvent(BenefitTabImpressionHandler benefitTabImpressionHandler, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        benefitTabImpressionHandler.onMinimized = l;
        int i5 = i3 + 79;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onTransact(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 27;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = benefitTabImpressionHandler.access000;
        int i5 = i3 + 97;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return appSetIdAndScope1;
    }

    public static final /* synthetic */ Object onWarmupCompleted(BenefitTabImpressionHandler benefitTabImpressionHandler, IAuthTabCallback iAuthTabCallback, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 125;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = benefitTabImpressionHandler.onNavigationEvent(iAuthTabCallback, (access13800<? super Unit>) access13800Var);
        int i4 = ICustomTabsCallbackStubProxy + 107;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Set onWarmupCompleted(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 99;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Set<SensorBridgeExtension3> set = benefitTabImpressionHandler.access100;
        if (i3 == 0) {
            return set;
        }
        throw null;
    }

    public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = ICustomTabsCallbackStubProxy + 77;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 25;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 5;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onUnminimized + 13;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
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
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iArgb = 43 - Color.argb(i4, i4, i4, i4);
                    int touchSlop = 1451 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b = (byte) i4;
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, (byte) (-b2));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, iArgb, touchSlop, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char packedPositionChild = (char) (49122 - ExpandableListView.getPackedPositionChild(0L));
                    int offsetBefore = 44 - TextUtils.getOffsetBefore("", i4);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 1495;
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 - 1);
                    String str$$c2 = $$c(b3, b4, (byte) (b4 + 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild, offsetBefore, iIndexOf, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char c2 = (char) (23973 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 50;
                    int iRed = 22939 - Color.red(i4);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, threadPriority, iRed, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i8);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cBlue = (char) (45848 - Color.blue(i4));
                    int keyRepeatTimeout = 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12577;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, keyRepeatTimeout, i9, 1401536470, false, "l", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (ICustomTabsCallbackStub ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (ICustomTabsCallbackDefault ^ 7798559133331975163L))) ^ ((char) (onRelationshipValidationResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i10 = $11 + 61;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 / 4;
                }
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
        objArr[0] = new String(cArr6);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        boolean readyToDisplay = ((ContactAccount.onExtraCallbackWithResult) this.onActivityResized.onExtraCallbackWithResult().IAuthTabCallback()).getReadyToDisplay();
        int i4 = onUnminimized + 121;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return readyToDisplay;
    }

    private static final void asBinder(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int i = 2 % 2;
        int i2 = onUnminimized + 95;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        benefitTabImpressionHandler.IAuthTabCallback("onViewTreeScrollChanged");
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 105;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        View view = null;
        if (this.readTypedObject != null) {
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.onPostMessage;
            if (onScrollChangedListener != null) {
                View view2 = this.readTypedObject;
                if (view2 == null) {
                    int i2 = ICustomTabsCallbackStubProxy + 105;
                    onUnminimized = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    view2 = null;
                }
                if (view2.getViewTreeObserver().isAlive()) {
                    int i3 = ICustomTabsCallbackStubProxy + 55;
                    onUnminimized = i3 % 128;
                    if (i3 % 2 != 0) {
                        recyclerView2 = this.readTypedObject;
                        int i4 = 59 / 0;
                        if (recyclerView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            recyclerView2 = null;
                        }
                        recyclerView2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    } else {
                        recyclerView2 = this.readTypedObject;
                        if (recyclerView2 == null) {
                        }
                        recyclerView2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    }
                }
            }
        }
        this.getInterfaceDescriptor = textFieldScrollKtExternalSyntheticLambda0;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this);
        }
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this);
        }
        if (recyclerView == null) {
            return;
        }
        this.readTypedObject = recyclerView;
        BenefitTabImpressionHandler$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new BenefitTabImpressionHandler$.ExternalSyntheticLambda20(this);
        View view3 = this.readTypedObject;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        if (view3.getViewTreeObserver().isAlive()) {
            View view4 = this.readTypedObject;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = view4;
            }
            view.getViewTreeObserver().addOnScrollChangedListener(externalSyntheticLambda20);
        }
        this.onPostMessage = externalSyntheticLambda20;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -616602266, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 616602271, iIAuthTabCallback, new Object[]{this, textFieldScrollKtExternalSyntheticLambda0});
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(this);
        int i5 = ICustomTabsCallbackStubProxy + 51;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable Function0<Rect> function0) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 39;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = function0;
        int i5 = i2 + 51;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 11;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        benefitTabImpressionHandler.access100.clear();
        if (i3 == 0) {
            return null;
        }
        int i4 = 83 / 0;
        return null;
    }

    private static final Unit extraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 73;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onUnminimized + 21;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return unit;
    }

    private static final Unit onMinimized(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 13;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (!(!z)) {
            int i5 = i2 + 101;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackDefault(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (z) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
            int i3 = onUnminimized + 75;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onUnminimized(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 51;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (!(!z)) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 43;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onRelationshipValidationResult(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 79;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 89;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
            } else {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStub(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 107;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 49;
            onUnminimized = i5 % 128;
            if (i5 % 2 == 0) {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
                int i6 = ICustomTabsCallbackStubProxy + 63;
                onUnminimized = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 3;
                }
            } else {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        onUnminimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (zBooleanValue) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackStubProxy + 35;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = ICustomTabsCallbackStubProxy + 79;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 91;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit extraCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!(!z)) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 121;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return unit;
    }

    private static final Unit onMessageChannelReady(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        if (!(!z)) {
            int i2 = onUnminimized + 13;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
                int i3 = ICustomTabsCallbackStubProxy + 23;
                onUnminimized = i3 % 128;
                int i4 = i3 % 2;
            } else {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(BenefitTabImpressionHandler benefitTabImpressionHandler, setNode setnode, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 105;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!z)) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(setnode);
            int i3 = ICustomTabsCallbackStubProxy + 75;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onActivityLayout(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 115;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
            String strOnWarmupCompleted = ((enableRotationVector) sensorBridgeExtension3).onExtraCallback().onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                benefitTabImpressionHandler.onActivityResized.onWarmupCompleted(strOnWarmupCompleted);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackStubProxy + 31;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onUnminimized + 59;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (zBooleanValue) {
            int i4 = i3 + 115;
            onUnminimized = i4 % 128;
            if (i4 % 2 == 0) {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
            } else {
                benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0367  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(IAuthTabCallback iAuthTabCallback) throws Throwable {
        String strOnWarmupCompleted;
        long j;
        String strName;
        String strOnTransact;
        String str;
        RotationVectorAbility rotationVectorAbility;
        Function0 function0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = 0;
        Object[] objArr = new Object[1];
        a((char) Color.argb(0, 0, 0, 0), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{18480, 30337, 21547, 6753, 35186, 48553, 1234, 12395}, new char[]{0, 0, 0, 0}, new char[]{48292, 35200, 59929, 40442}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        sendBridgeResponse.IAuthTabCallback.onWarmupCompleted();
        handleNoThread handlenothreadOnExtraCallback = iAuthTabCallback.onExtraCallback();
        if (handlenothreadOnExtraCallback instanceof handleNoThread) {
            AdMobFallback adMobFallbackOnExtraCallbackWithResult = handlenothreadOnExtraCallback.onExtraCallbackWithResult();
            if (adMobFallbackOnExtraCallbackWithResult != null) {
                AdMobFallback adMobFallback = StringsKt.isBlank(adMobFallbackOnExtraCallbackWithResult.onNavigationEvent()) ? null : adMobFallbackOnExtraCallbackWithResult;
                if (adMobFallback != null) {
                    TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 1681662L, access8100.onNavigationEvent(getWrite.IAuthTabCallback("service", adMobFallback.onExtraCallbackWithResult())), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda2(this, handlenothreadOnExtraCallback), 12, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        strOnWarmupCompleted = "tab_benefit";
        if (handlenothreadOnExtraCallback instanceof ShakeMonitorBridgeExtension) {
            TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
            long j2 = getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback) ? 1848990L : 5213084L;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            ShakeMonitorBridgeExtension shakeMonitorBridgeExtension = (ShakeMonitorBridgeExtension) handlenothreadOnExtraCallback;
            List listAsBinder = shakeMonitorBridgeExtension.IAuthTabCallbackStub().asBinder();
            if ((listAsBinder instanceof Collection) && listAsBinder.isEmpty()) {
                int i3 = onUnminimized + 55;
                ICustomTabsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            } else {
                Iterator it = listAsBinder.iterator();
                while (it.hasNext()) {
                    if (!((CardsV2.PointBackInfo.TransactionItem) it.next()).IAuthTabCallbackStub()) {
                        int i5 = onUnminimized + 111;
                        ICustomTabsCallbackStubProxy = i5 % 128;
                        if (i5 % 2 != 0 ? (i2 = i2 + 1) < 0 : i2 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
            }
            mapOnExtraCallback.put("payment_cnt", Integer.valueOf(i2));
            mapOnExtraCallback.put("reward_cnt", Integer.valueOf(shakeMonitorBridgeExtension.IAuthTabCallbackStub().asInterface()));
            mapOnExtraCallback.put(strIntern, getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback) ? TinyAppHostApduService1.onNavigationEvent.onWarmupCompleted() : "tab_benefit");
            mapOnExtraCallback.put("section_order", Integer.valueOf(shakeMonitorBridgeExtension.IAuthTabCallbackDefault()));
            if (getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback)) {
                mapOnExtraCallback.put("cluster", shakeMonitorBridgeExtension.onExtraCallbackWithResult());
                mapOnExtraCallback.put("cluster_v2", shakeMonitorBridgeExtension.onExtraCallbackWithResult());
                int i6 = ICustomTabsCallbackStubProxy + 9;
                onUnminimized = i6 % 128;
                int i7 = i6 % 2;
            }
            mapOnExtraCallback.put("fake_yn", zzaz.onExtraCallbackWithResult(shakeMonitorBridgeExtension.IAuthTabCallback_Parcel()));
            mapOnExtraCallback.put("onboarding_yn", zzaz.onExtraCallbackWithResult(shakeMonitorBridgeExtension.IAuthTabCallbackStub().access100()));
            Unit unit = Unit.INSTANCE;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, j2, access8100.onExtraCallbackWithResult(mapOnExtraCallback), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda7(this, handlenothreadOnExtraCallback), 12, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof watchShake) {
            onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 13077443, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -13077434, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this, (watchShake) handlenothreadOnExtraCallback, false, 2, null});
            return;
        }
        if (handlenothreadOnExtraCallback instanceof RotationVectorAbility) {
            int i8 = ICustomTabsCallbackStubProxy + 39;
            onUnminimized = i8 % 128;
            if (i8 % 2 != 0) {
                getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback);
                throw null;
            }
            if (!getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback) || (function0OnNavigationEvent = (rotationVectorAbility = (RotationVectorAbility) handlenothreadOnExtraCallback).onNavigationEvent()) == null) {
                return;
            }
            TinyAppHostApduService1 tinyAppHostApduService12 = TinyAppHostApduService1.onNavigationEvent;
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted((Map) function0OnNavigationEvent.invoke());
            mapOnWarmupCompleted.put("section_order", Integer.valueOf(rotationVectorAbility.IAuthTabCallbackDefault().asInterface()));
            Unit unit2 = Unit.INSTANCE;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService12, 1565535L, mapOnWarmupCompleted, true, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda8(this, handlenothreadOnExtraCallback), 8, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof SensorBridgeExtension4) {
            TinyAppHostApduService1 tinyAppHostApduService13 = TinyAppHostApduService1.onNavigationEvent;
            Map mapOnExtraCallback2 = access8100.onExtraCallback();
            SensorBridgeExtension4 sensorBridgeExtension4 = (SensorBridgeExtension4) handlenothreadOnExtraCallback;
            mapOnExtraCallback2.put("submission_code", sensorBridgeExtension4.onExtraCallbackWithResult());
            mapOnExtraCallback2.put("slot_code", sensorBridgeExtension4.onNavigationEvent().onNavigationEvent());
            mapOnExtraCallback2.put("section_order", Integer.valueOf(sensorBridgeExtension4.onExtraCallback()));
            Unit unit3 = Unit.INSTANCE;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService13, 1982090L, access8100.onExtraCallbackWithResult(mapOnExtraCallback2), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda9(this, handlenothreadOnExtraCallback), 12, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof RotationVectorAbility1.onExtraCallback) {
            if (getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback)) {
                TinyAppHostApduService1 tinyAppHostApduService14 = TinyAppHostApduService1.onNavigationEvent;
                RotationVectorAbility1.onExtraCallback onextracallback = (RotationVectorAbility1.onExtraCallback) handlenothreadOnExtraCallback;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("service", onextracallback.onExtraCallbackWithResult().IAuthTabCallbackDefault());
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("order", Integer.valueOf(onextracallback.onExtraCallback()));
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("cluster", onextracallback.IAuthTabCallback());
                Cards.onNavigationEvent onnavigationeventOnWarmupCompleted = onextracallback.onExtraCallbackWithResult().onWarmupCompleted(((Number) this.onTransact.invoke()).intValue());
                TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService14, 1613354L, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("activation", onnavigationeventOnWarmupCompleted != null ? onnavigationeventOnWarmupCompleted.name() : null), getWrite.IAuthTabCallback("section_order", onextracallback.IAuthTabCallbackDefault())}), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda10(this, handlenothreadOnExtraCallback), 12, (Object) null);
                return;
            }
            return;
        }
        if (handlenothreadOnExtraCallback instanceof RotationVectorAbility1) {
            iAuthTabCallback.onWarmupCompleted();
            RotationVectorAbility1 rotationVectorAbility1 = (RotationVectorAbility1) handlenothreadOnExtraCallback;
            ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), new Object[]{rotationVectorAbility1.onExtraCallbackWithResult()}, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).IAuthTabCallback();
            if (!rotationVectorAbility1.IAuthTabCallbackStub()) {
                if (getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback)) {
                    TinyAppHostApduService1 tinyAppHostApduService15 = TinyAppHostApduService1.onNavigationEvent;
                    TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService15, 1008353L, (Map) TinyAppHostApduService1.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 107960590, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -107960586, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{tinyAppHostApduService15, rotationVectorAbility1}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda12(this, handlenothreadOnExtraCallback), 12, (Object) null);
                    return;
                }
                TinyAppHostApduService1 tinyAppHostApduService16 = TinyAppHostApduService1.onNavigationEvent;
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("service", rotationVectorAbility1.onExtraCallbackWithResult().IAuthTabCallbackDefault());
                Object[] objArr2 = new Object[1];
                a((char) (Color.argb(0, 0, 0, 0) + 60756), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1707616358, new char[]{24979, 59936, 4577, 57973, 58706}, new char[]{0, 0, 0, 0}, new char[]{39574, 14295, 21658, 57581}, objArr2);
                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), new Object[]{rotationVectorAbility1.onExtraCallbackWithResult()}, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).IAuthTabCallback());
                Cards.onNavigationEvent onnavigationeventAsBinder = rotationVectorAbility1.onExtraCallbackWithResult().asBinder();
                if (onnavigationeventAsBinder != null) {
                    int i9 = onUnminimized + 11;
                    ICustomTabsCallbackStubProxy = i9 % 128;
                    int i10 = i9 % 2;
                    strName = onnavigationeventAsBinder.name();
                } else {
                    strName = null;
                }
                TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService16, 1641110L, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("activation", strName), getWrite.IAuthTabCallback("order", Integer.valueOf(rotationVectorAbility1.onExtraCallback()))}), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda13(this, handlenothreadOnExtraCallback), 12, (Object) null);
                return;
            }
            TinyAppHostApduService1 tinyAppHostApduService17 = TinyAppHostApduService1.onNavigationEvent;
            String strIAuthTabCallback = rotationVectorAbility1.IAuthTabCallback();
            if (strIAuthTabCallback != null) {
                int i11 = ICustomTabsCallbackStubProxy + 61;
                onUnminimized = i11 % 128;
                if (i11 % 2 != 0) {
                    StringsKt.isBlank(strIAuthTabCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                strOnTransact = !StringsKt.isBlank(strIAuthTabCallback) ? null : rotationVectorAbility1.onExtraCallbackWithResult().onTransact();
            }
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("variant_type", strOnTransact);
            String strIAuthTabCallback2 = rotationVectorAbility1.IAuthTabCallback();
            if (strIAuthTabCallback2 == null || StringsKt.isBlank(strIAuthTabCallback2)) {
                str = "service_banner";
            } else {
                int i12 = onUnminimized + 107;
                ICustomTabsCallbackStubProxy = i12 % 128;
                int i13 = i12 % 2;
                if (!rotationVectorAbility1.onExtraCallbackWithResult().access100()) {
                    int i14 = ICustomTabsCallbackStubProxy + 77;
                    onUnminimized = i14 % 128;
                    int i15 = i14 % 2;
                    str = null;
                }
            }
            Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("ui_type", str);
            Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("service", rotationVectorAbility1.onExtraCallbackWithResult().IAuthTabCallbackDefault());
            Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("order", Integer.valueOf(rotationVectorAbility1.onExtraCallback()));
            Cards.onNavigationEvent onnavigationeventOnWarmupCompleted2 = rotationVectorAbility1.onExtraCallbackWithResult().onWarmupCompleted(((Number) this.onTransact.invoke()).intValue());
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService17, 1613354L, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, getWrite.IAuthTabCallback("activation", onnavigationeventOnWarmupCompleted2 != null ? onnavigationeventOnWarmupCompleted2.name() : null), getWrite.IAuthTabCallback("cluster", rotationVectorAbility1.IAuthTabCallback()), getWrite.IAuthTabCallback("section_order", rotationVectorAbility1.IAuthTabCallbackDefault())}), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda11(this, handlenothreadOnExtraCallback), 12, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof DeviceOrientationBridgeExtension) {
            TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, 2010452L, ChoosePhoneContactBridgeExtension1.onExtraCallbackWithResult.onExtraCallback((DeviceOrientationBridgeExtension) handlenothreadOnExtraCallback), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda14(this, handlenothreadOnExtraCallback), 12, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof stopDeviceMotionListening) {
            TinyAppHostApduService1 tinyAppHostApduService18 = TinyAppHostApduService1.onNavigationEvent;
            Map mapOnExtraCallback3 = access8100.onExtraCallback();
            stopDeviceMotionListening stopdevicemotionlistening = (stopDeviceMotionListening) handlenothreadOnExtraCallback;
            mapOnExtraCallback3.put("banner_type", stopdevicemotionlistening.onNavigationEvent().asInterface());
            mapOnExtraCallback3.put(strIntern, tinyAppHostApduService18.onWarmupCompleted());
            mapOnExtraCallback3.put("is_loading", "N");
            mapOnExtraCallback3.put("section_order", Integer.valueOf(stopdevicemotionlistening.IAuthTabCallback()));
            Unit unit4 = Unit.INSTANCE;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService18, 5063716L, access8100.onExtraCallbackWithResult(mapOnExtraCallback3), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda15(this, handlenothreadOnExtraCallback), 12, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof setNode) {
            setNode setnode = (setNode) handlenothreadOnExtraCallback;
            String str2 = setnode.onNavigationEvent() ^ true ? "Y" : "N";
            setNode setnodeIAuthTabCallback = setNode.IAuthTabCallback(setnode, null, 0, setnode.onNavigationEvent(), 3, null);
            TinyAppHostApduService1 tinyAppHostApduService19 = TinyAppHostApduService1.onNavigationEvent;
            Map mapOnExtraCallback4 = access8100.onExtraCallback();
            mapOnExtraCallback4.put("banner_type", setnode.onExtraCallbackWithResult().IAuthTabCallbackStub());
            mapOnExtraCallback4.put(strIntern, tinyAppHostApduService19.onWarmupCompleted());
            mapOnExtraCallback4.put("is_loading", str2);
            mapOnExtraCallback4.put("section_order", Integer.valueOf(setnode.IAuthTabCallback()));
            Unit unit5 = Unit.INSTANCE;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService19, 5063716L, access8100.onExtraCallbackWithResult(mapOnExtraCallback4), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda3(this, setnodeIAuthTabCallback), 12, (Object) null);
            return;
        }
        if (handlenothreadOnExtraCallback instanceof enableRotationVector) {
            TinyAppHostApduService1 tinyAppHostApduService110 = TinyAppHostApduService1.onNavigationEvent;
            Map mapOnExtraCallback5 = access8100.onExtraCallback();
            enableRotationVector enablerotationvector = (enableRotationVector) handlenothreadOnExtraCallback;
            mapOnExtraCallback5.put("banner_type", enablerotationvector.onExtraCallback().onExtraCallbackWithResult());
            mapOnExtraCallback5.put(strIntern, tinyAppHostApduService110.onWarmupCompleted());
            mapOnExtraCallback5.put("is_loading", "N");
            mapOnExtraCallback5.put("section_order", Integer.valueOf(enablerotationvector.onNavigationEvent()));
            Unit unit6 = Unit.INSTANCE;
            TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService110, 5063716L, access8100.onExtraCallbackWithResult(mapOnExtraCallback5), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda4(this, handlenothreadOnExtraCallback), 12, (Object) null);
            return;
        }
        if (!(handlenothreadOnExtraCallback instanceof ShakeMonitorBridgeExtension1)) {
            return;
        }
        ShakeMonitorBridgeExtension1 shakeMonitorBridgeExtension1 = (ShakeMonitorBridgeExtension1) handlenothreadOnExtraCallback;
        String strAsBinder = shakeMonitorBridgeExtension1.asBinder();
        if (!shakeMonitorBridgeExtension1.IAuthTabCallbackDefault()) {
            if (CollectionsKt.contains(IAuthTabCallback, strAsBinder)) {
                TinyAppHostApduService1 tinyAppHostApduService111 = TinyAppHostApduService1.onNavigationEvent;
                Map mapOnExtraCallback6 = access8100.onExtraCallback();
                mapOnExtraCallback6.put(strIntern, tinyAppHostApduService111.onWarmupCompleted());
                mapOnExtraCallback6.put("section_type", strAsBinder);
                Unit unit7 = Unit.INSTANCE;
                TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService111, 2010512L, access8100.onExtraCallbackWithResult(mapOnExtraCallback6), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda6(this, handlenothreadOnExtraCallback), 12, (Object) null);
                return;
            }
            return;
        }
        TinyAppHostApduService1 tinyAppHostApduService112 = TinyAppHostApduService1.onNavigationEvent;
        if (getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback)) {
            int i16 = onUnminimized + 109;
            ICustomTabsCallbackStubProxy = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 29 / 0;
            }
            j = 1848992;
        } else {
            j = 5213088;
        }
        Map mapOnExtraCallback7 = access8100.onExtraCallback();
        if (getBillingCycleCount.onExtraCallback(this.ICustomTabsCallback)) {
            int i18 = onUnminimized + 49;
            ICustomTabsCallbackStubProxy = i18 % 128;
            if (i18 % 2 == 0) {
                tinyAppHostApduService112.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            strOnWarmupCompleted = tinyAppHostApduService112.onWarmupCompleted();
        }
        mapOnExtraCallback7.put(strIntern, strOnWarmupCompleted);
        mapOnExtraCallback7.put("payment_cnt", shakeMonitorBridgeExtension1.onNavigationEvent());
        mapOnExtraCallback7.put("reward_cnt", (Integer) ShakeMonitorBridgeExtension1.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -1506224946, setCurrentIndex.onNavigationEvent(), new Object[]{shakeMonitorBridgeExtension1}, 1506224947));
        mapOnExtraCallback7.put("section_order", (Integer) ShakeMonitorBridgeExtension1.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -75666395, setCurrentIndex.onNavigationEvent(), new Object[]{shakeMonitorBridgeExtension1}, 75666395));
        mapOnExtraCallback7.put("fake_yn", zzaz.onExtraCallbackWithResult(shakeMonitorBridgeExtension1.onTransact()));
        mapOnExtraCallback7.put("onboarding_yn", zzaz.onExtraCallbackWithResult(shakeMonitorBridgeExtension1.IAuthTabCallbackStub()));
        Unit unit8 = Unit.INSTANCE;
        TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService112, j, access8100.onExtraCallbackWithResult(mapOnExtraCallback7), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda5(this, handlenothreadOnExtraCallback), 12, (Object) null);
    }

    private static final Unit onPostMessage(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 95;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!(!z)) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
            int i3 = onUnminimized + 125;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        startDeviceMotionListening startdevicemotionlistening = (SensorBridgeExtension3) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onUnminimized + 45;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(!zBooleanValue)) {
            int i4 = i3 + 83;
            onUnminimized = i4 % 128;
            if (i4 % 2 == 0) {
                benefitTabImpressionHandler.asBinder.add(startdevicemotionlistening.onExtraCallback());
            } else {
                benefitTabImpressionHandler.asBinder.add(startdevicemotionlistening.onExtraCallback());
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        int i = 2 % 2;
        int i2 = onUnminimized + 79;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
            if (z) {
                benefitTabImpressionHandler.asBinder.add(((startDeviceMotionListening) sensorBridgeExtension3).onExtraCallback());
            }
        } else if (z) {
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 5;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0260, code lost:
    
        if (r3.emit(r8, r4) == r5) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(IAuthTabCallback iAuthTabCallback, access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        SensorBridgeExtension3 sensorBridgeExtension3OnExtraCallback;
        int iOnWarmupCompleted;
        checkSystemPermission interfaceDescriptor;
        NativeAd nativeAd;
        SensorBridgeExtension3 sensorBridgeExtension3;
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i2 = onUnminimized + 7;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult.label;
        if (i5 != 0) {
            int i6 = ICustomTabsCallbackStubProxy;
            int i7 = i6 + 75;
            onUnminimized = i7 % 128;
            if (i7 % 2 == 0 ? i5 == 1 : i5 == 1) {
                int i8 = onextracallbackwithresult.I$0;
                sensorBridgeExtension3 = (SensorBridgeExtension3) onextracallbackwithresult.L$1;
                IAuthTabCallback iAuthTabCallback3 = (IAuthTabCallback) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj);
                iOnWarmupCompleted = i8;
                iAuthTabCallback2 = iAuthTabCallback3;
                if (sensorBridgeExtension3.getInterfaceDescriptor() == checkSystemPermission.Imp0) {
                    IAuthTabCallback iAuthTabCallback4 = new IAuthTabCallback(iAuthTabCallback2.onWarmupCompleted(), iAuthTabCallback2.onExtraCallback());
                    iAuthTabCallback4.onWarmupCompleted(onNavigationEvent(iOnWarmupCompleted));
                    if (!(!iAuthTabCallback4.onExtraCallback(this.onNavigationEvent))) {
                        sensorBridgeExtension3.onExtraCallbackWithResult(checkSystemPermission.Imp1);
                        iAuthTabCallback4.onWarmupCompleted(true);
                        BasicSystemInfoExtension basicSystemInfoExtension = (BasicSystemInfoExtension) sensorBridgeExtension3;
                        this.onActivityResized.IAuthTabCallback(SimpleWorkflowUnit.AD_IMPRESSION, basicSystemInfoExtension.onExtraCallbackWithResult(), basicSystemInfoExtension.onExtraCallback());
                        TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
                        TinyAppHostApduService1.IAuthTabCallback(tinyAppHostApduService1, 1613124L, tinyAppHostApduService1.onExtraCallbackWithResult(basicSystemInfoExtension), false, (Function1) null, 12, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i6 + 17;
                onUnminimized = i9 % 128;
                if (i9 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i10 = 63 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
            int i11 = onextracallbackwithresult.I$0;
            nativeAd = (NativeAd) onextracallbackwithresult.L$3;
            interfaceDescriptor = (checkSystemPermission) onextracallbackwithresult.L$2;
            sensorBridgeExtension3OnExtraCallback = (SensorBridgeExtension3) onextracallbackwithresult.L$1;
            IAuthTabCallback iAuthTabCallback5 = (IAuthTabCallback) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            iOnWarmupCompleted = i11;
            iAuthTabCallback2 = iAuthTabCallback5;
            if (sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor() == checkSystemPermission.Imp0) {
                IAuthTabCallback iAuthTabCallback6 = new IAuthTabCallback(iAuthTabCallback2.onWarmupCompleted(), iAuthTabCallback2.onExtraCallback());
                iAuthTabCallback6.onWarmupCompleted(onNavigationEvent(iOnWarmupCompleted));
                iAuthTabCallback6.onWarmupCompleted(true);
                if (iAuthTabCallback6.onExtraCallback(this.onNavigationEvent)) {
                    int i12 = onUnminimized + 7;
                    ICustomTabsCallbackStubProxy = i12 % 128;
                    int i13 = i12 % 2;
                    getBorderRadius<List<IAuthTabCallback>> getborderradius = this.IAuthTabCallbackDefault;
                    List listListOf = CollectionsKt.listOf(iAuthTabCallback6);
                    onextracallbackwithresult.L$0 = access15400.onNavigationEvent(iAuthTabCallback2);
                    onextracallbackwithresult.L$1 = access15400.onNavigationEvent(sensorBridgeExtension3OnExtraCallback);
                    onextracallbackwithresult.L$2 = access15400.onNavigationEvent(interfaceDescriptor);
                    onextracallbackwithresult.L$3 = access15400.onNavigationEvent(nativeAd);
                    onextracallbackwithresult.L$4 = access15400.onNavigationEvent(iAuthTabCallback6);
                    onextracallbackwithresult.I$0 = iOnWarmupCompleted;
                    onextracallbackwithresult.label = 3;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        sendBridgeResponse.IAuthTabCallback.onWarmupCompleted();
        sensorBridgeExtension3OnExtraCallback = iAuthTabCallback.onExtraCallback();
        iOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
        if (sensorBridgeExtension3OnExtraCallback instanceof BasicSystemInfoExtension) {
            if (!iAuthTabCallback.onExtraCallbackWithResult()) {
                int i14 = onUnminimized + 7;
                ICustomTabsCallbackStubProxy = i14 % 128;
                if (i14 % 2 == 0) {
                    sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor();
                    checkSystemPermission checksystempermission = checkSystemPermission.None;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor() == checkSystemPermission.None) {
                    sensorBridgeExtension3OnExtraCallback.onExtraCallbackWithResult(checkSystemPermission.Imp0);
                    TinyAppHostApduService1 tinyAppHostApduService12 = TinyAppHostApduService1.onNavigationEvent;
                    TinyAppHostApduService1.IAuthTabCallback(tinyAppHostApduService12, 1613122L, tinyAppHostApduService12.onExtraCallbackWithResult((BasicSystemInfoExtension) sensorBridgeExtension3OnExtraCallback), false, (Function1) null, 12, (Object) null);
                }
                onextracallbackwithresult.L$0 = iAuthTabCallback2;
                onextracallbackwithresult.L$1 = sensorBridgeExtension3OnExtraCallback;
                onextracallbackwithresult.I$0 = iOnWarmupCompleted;
                onextracallbackwithresult.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, onextracallbackwithresult) != objOnWarmupCompleted) {
                    sensorBridgeExtension3 = sensorBridgeExtension3OnExtraCallback;
                    if (sensorBridgeExtension3.getInterfaceDescriptor() == checkSystemPermission.Imp0) {
                    }
                }
                return objOnWarmupCompleted;
            }
            return Unit.INSTANCE;
        }
        if (sensorBridgeExtension3OnExtraCallback instanceof startDeviceMotionListening) {
            interfaceDescriptor = sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor();
            startDeviceMotionListening startdevicemotionlistening = (startDeviceMotionListening) sensorBridgeExtension3OnExtraCallback;
            NativeAd nativeAdOnNavigationEvent = startdevicemotionlistening.onNavigationEvent();
            if (!iAuthTabCallback.onExtraCallbackWithResult()) {
                int i15 = ICustomTabsCallbackStubProxy + 77;
                onUnminimized = i15 % 128;
                int i16 = i15 % 2;
                if (sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor() == checkSystemPermission.None) {
                    sensorBridgeExtension3OnExtraCallback.onExtraCallbackWithResult(checkSystemPermission.Imp0);
                    if (!this.asBinder.contains(startdevicemotionlistening.onExtraCallback()) && onExtraCallbackWithResult(nativeAdOnNavigationEvent)) {
                        TinyAppHostApduService1 tinyAppHostApduService13 = TinyAppHostApduService1.onNavigationEvent;
                        TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService13, 1357525L, (Map) TinyAppHostApduService1.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -168441024, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 168441025, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{tinyAppHostApduService13, nativeAdOnNavigationEvent}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda0(this, sensorBridgeExtension3OnExtraCallback), 12, (Object) null);
                    }
                }
                onextracallbackwithresult.L$0 = iAuthTabCallback2;
                onextracallbackwithresult.L$1 = sensorBridgeExtension3OnExtraCallback;
                onextracallbackwithresult.L$2 = access15400.onNavigationEvent(interfaceDescriptor);
                onextracallbackwithresult.L$3 = access15400.onNavigationEvent(nativeAdOnNavigationEvent);
                onextracallbackwithresult.I$0 = iOnWarmupCompleted;
                onextracallbackwithresult.label = 2;
                if (formatMsgs.onWarmupCompleted(1000L, onextracallbackwithresult) != objOnWarmupCompleted) {
                    nativeAd = nativeAdOnNavigationEvent;
                    if (sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor() == checkSystemPermission.Imp0) {
                    }
                }
                return objOnWarmupCompleted;
            }
            if (sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor() == checkSystemPermission.Imp0) {
                sensorBridgeExtension3OnExtraCallback.onExtraCallbackWithResult(checkSystemPermission.Imp1);
                startdevicemotionlistening.IAuthTabCallback(true);
                iAuthTabCallback.onWarmupCompleted();
                checkSystemPermission interfaceDescriptor2 = sensorBridgeExtension3OnExtraCallback.getInterfaceDescriptor();
                Objects.toString(iAuthTabCallback);
                Objects.toString(interfaceDescriptor);
                Objects.toString(interfaceDescriptor2);
                if (!this.asBinder.contains(startdevicemotionlistening.onExtraCallback()) && onExtraCallbackWithResult(nativeAdOnNavigationEvent)) {
                    TinyAppHostApduService1 tinyAppHostApduService14 = TinyAppHostApduService1.onNavigationEvent;
                    TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService14, 1357527L, (Map) TinyAppHostApduService1.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -168441024, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 168441025, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{tinyAppHostApduService14, nativeAdOnNavigationEvent}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda1(this, sensorBridgeExtension3OnExtraCallback), 12, (Object) null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean onExtraCallbackWithResult(NativeAd nativeAd) {
        String headline;
        int i = 2 % 2;
        int i2 = onUnminimized + 17;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if ((nativeAd.getBody() == null || !(!StringsKt.isBlank(r1))) && ((headline = nativeAd.getHeadline()) == null || !(!StringsKt.isBlank(headline)))) {
            return false;
        }
        int i4 = ICustomTabsCallbackStubProxy + 45;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler, startDeviceMotionListening startdevicemotionlistening, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 75;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (!(!z)) {
            benefitTabImpressionHandler.asBinder.add(startdevicemotionlistening.onExtraCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 69;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj;
        Object next;
        startDeviceMotionListening startdevicemotionlistening;
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        NativeAd nativeAd = (NativeAd) objArr[1];
        int i = 2 % 2;
        Iterator it = benefitTabImpressionHandler.access000().onExtraCallbackWithResult().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                int i2 = ICustomTabsCallbackStubProxy + 77;
                onUnminimized = i2 % 128;
                int i3 = i2 % 2;
                next = null;
                break;
            }
            int i4 = ICustomTabsCallbackStubProxy + 117;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            startDeviceMotionListening startdevicemotionlistening2 = (SensorBridgeExtension3) next;
            if ((startdevicemotionlistening2 instanceof startDeviceMotionListening) && Intrinsics.areEqual(startdevicemotionlistening2.onNavigationEvent(), nativeAd)) {
                break;
            }
        }
        if (next instanceof startDeviceMotionListening) {
            int i6 = onUnminimized + 103;
            ICustomTabsCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            startdevicemotionlistening = (startDeviceMotionListening) next;
        } else {
            startdevicemotionlistening = null;
        }
        if (startdevicemotionlistening == null) {
            return null;
        }
        if (startdevicemotionlistening.getInterfaceDescriptor() == checkSystemPermission.None) {
            startdevicemotionlistening.onExtraCallbackWithResult(checkSystemPermission.Imp0);
            if (!benefitTabImpressionHandler.asBinder.contains(startdevicemotionlistening.onExtraCallback()) && benefitTabImpressionHandler.onExtraCallbackWithResult(nativeAd)) {
                TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
                TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, 1357525L, (Map) TinyAppHostApduService1.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -168441024, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 168441025, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{tinyAppHostApduService1, nativeAd}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda22(benefitTabImpressionHandler, startdevicemotionlistening), 12, (Object) null);
            }
        }
        TinyAppHostApduService1 tinyAppHostApduService12 = TinyAppHostApduService1.onNavigationEvent;
        TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService12, 1357529L, (Map) TinyAppHostApduService1.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -168441024, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 168441025, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{tinyAppHostApduService12, nativeAd}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent()), false, (Function1) null, 12, (Object) null);
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, benefitTabImpressionHandler, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new onTransact(textFieldScrollKtExternalSyntheticLambda0, benefitTabImpressionHandler, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new asBinder(textFieldScrollKtExternalSyntheticLambda0, benefitTabImpressionHandler, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(textFieldScrollKtExternalSyntheticLambda0, benefitTabImpressionHandler, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(textFieldScrollKtExternalSyntheticLambda0, benefitTabImpressionHandler, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, new asInterface(textFieldScrollKtExternalSyntheticLambda0, benefitTabImpressionHandler, (access13800) null), 3, (Object) null);
        int i2 = onUnminimized + 75;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        IAuthTabCallbackDefault();
        onNavigationEvent("onStart");
        int i4 = onUnminimized + 45;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 63;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        IAuthTabCallbackStub();
        int i4 = ICustomTabsCallbackStubProxy + 101;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        RecyclerView recyclerView;
        int i = 2 % 2;
        int i2 = onUnminimized + 39;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        RecyclerView recyclerView2 = this.readTypedObject;
        if (recyclerView2 != null) {
            int i3 = ICustomTabsCallbackStubProxy + 45;
            onUnminimized = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView2 = null;
            }
            recyclerView2.removeOnScrollListener(this);
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.onPostMessage;
            if (onScrollChangedListener != null) {
                View view = this.readTypedObject;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    view = null;
                }
                if (view.getViewTreeObserver().isAlive()) {
                    int i4 = ICustomTabsCallbackStubProxy + 25;
                    onUnminimized = i4 % 128;
                    if (i4 % 2 != 0) {
                        recyclerView = this.readTypedObject;
                        int i5 = 23 / 0;
                        if (recyclerView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            recyclerView = null;
                        }
                        recyclerView.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    } else {
                        recyclerView = this.readTypedObject;
                        if (recyclerView == null) {
                        }
                        recyclerView.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    }
                }
            }
            this.onPostMessage = null;
            int i6 = onUnminimized + 67;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final void onWarmupCompleted(List<? extends SensorBridgeExtension3> list, int i) {
        BasicSystemInfoExtension basicSystemInfoExtension;
        int i2 = 2 % 2;
        int i3 = onUnminimized + 105;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        SensorBridgeExtension3 sensorBridgeExtension3 = list.get(i);
        if (sensorBridgeExtension3 instanceof BasicSystemInfoExtension) {
            basicSystemInfoExtension = (BasicSystemInfoExtension) sensorBridgeExtension3;
        } else {
            int i5 = ICustomTabsCallbackStubProxy + 83;
            onUnminimized = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
            basicSystemInfoExtension = null;
        }
        if (basicSystemInfoExtension != null) {
            int i7 = ICustomTabsCallbackStubProxy + 33;
            onUnminimized = i7 % 128;
            int i8 = i7 % 2;
            basicSystemInfoExtension.onExtraCallbackWithResult(checkSystemPermission.None);
            int i9 = onUnminimized + 11;
            ICustomTabsCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onUnminimized + 49;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.clear();
        this.access100.clear();
        this.onMinimized = null;
        int i4 = ICustomTabsCallbackStubProxy + 117;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault();
        onNavigationEvent("onTabStart");
        int i4 = ICustomTabsCallbackStubProxy + 115;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        benefitTabImpressionHandler.IAuthTabCallbackStub();
        int i4 = onUnminimized + 115;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (this.readTypedObject != null) {
            IAuthTabCallbackDefault();
            asInterface();
            return;
        }
        int i5 = i3 + 95;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = onUnminimized + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        List<? extends SensorBridgeExtension3> listOnExtraCallbackWithResult = access000().onExtraCallbackWithResult();
        Iterator<? extends SensorBridgeExtension3> it = listOnExtraCallbackWithResult.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            int i5 = ICustomTabsCallbackStubProxy + 37;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            if (it.next() instanceof BasicSystemInfoExtension) {
                break;
            }
            int i7 = onUnminimized + 37;
            ICustomTabsCallbackStubProxy = i7 % 128;
            i4 = i7 % 2 == 0 ? i4 + 20 : i4 + 1;
        }
        if (i4 != -1) {
            onWarmupCompleted(listOnExtraCallbackWithResult, i4);
            int i8 = onUnminimized + 55;
            ICustomTabsCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = onUnminimized + 113;
        ICustomTabsCallbackStubProxy = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int i = 2 % 2;
        ((BenefitTabImpressionHandler) objArr[0]).IAuthTabCallback(((String) objArr[1]) + " post");
        int i2 = onUnminimized + 37;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        View view = this.readTypedObject;
        if (view == null) {
            int i2 = onUnminimized + 49;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        View view2 = null;
        if (view == null) {
            int i4 = ICustomTabsCallbackStubProxy + 59;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.post(new BenefitTabImpressionHandler$.ExternalSyntheticLambda18(this, str));
        View view3 = this.readTypedObject;
        if (view3 == null) {
            int i6 = onUnminimized + 1;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        view2.postDelayed(new BenefitTabImpressionHandler$.ExternalSyntheticLambda19(this, str), 300L);
    }

    private static final void onNavigationEvent(BenefitTabImpressionHandler benefitTabImpressionHandler, String str) {
        int i = 2 % 2;
        benefitTabImpressionHandler.IAuthTabCallback(str + " postDelayed");
        int i2 = onUnminimized + 21;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 15;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        RecyclerView recyclerView = benefitTabImpressionHandler.readTypedObject;
        if (recyclerView == null) {
            int i5 = i2 + 31;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 != 0) {
                int i7 = 72 / 0;
            }
            recyclerView = null;
        }
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        return layoutManager;
    }

    private final getNameByImsi access000() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 87;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        RecyclerView recyclerView = this.readTypedObject;
        if (recyclerView == null) {
            int i5 = i2 + 71;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        getNameByImsi adapter = recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "");
        return adapter;
    }

    private final double onNavigationEvent(int i) {
        int i2 = 2 % 2;
        try {
            RecyclerView recyclerView = this.readTypedObject;
            View viewFindViewByPosition = null;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView = null;
            }
            getSensor getsensorFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (getsensorFindViewHolderForAdapterPosition == null) {
                return 0.0d;
            }
            if (!(getsensorFindViewHolderForAdapterPosition instanceof getSensor)) {
                if (getsensorFindViewHolderForAdapterPosition instanceof RotationVectorAbility3) {
                    viewFindViewByPosition = ((RotationVectorAbility3) getsensorFindViewHolderForAdapterPosition).onWarmupCompleted();
                } else {
                    int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1227521543, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1227521532, iIAuthTabCallback, new Object[]{this});
                    if (linearLayoutManager != null) {
                        viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                    }
                }
            } else {
                int i3 = ICustomTabsCallbackStubProxy + 61;
                onUnminimized = i3 % 128;
                int i4 = i3 % 2;
                viewFindViewByPosition = getsensorFindViewHolderForAdapterPosition.onExtraCallbackWithResult();
            }
            if (viewFindViewByPosition != null) {
                return IAuthTabCallback(viewFindViewByPosition);
            }
            int i5 = onUnminimized + 49;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return 0.0d;
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final double IAuthTabCallback(View view) {
        int measuredHeight;
        int iHeight;
        int i = 2 % 2;
        Integer numValueOf = Integer.valueOf(view.getHeight());
        Object obj = null;
        if (numValueOf.intValue() <= 0) {
            int i2 = onUnminimized + 117;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i4 = ICustomTabsCallbackStubProxy + 51;
            onUnminimized = i4 % 128;
            if (i4 % 2 != 0) {
                numValueOf.intValue();
                obj.hashCode();
                throw null;
            }
            measuredHeight = numValueOf.intValue();
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        if (measuredHeight <= 0) {
            int i5 = onUnminimized + 103;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return 0.0d;
        }
        View view2 = this.readTypedObject;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        boolean globalVisibleRect = view2.getGlobalVisibleRect(this.extraCallback);
        boolean globalVisibleRect2 = view.getGlobalVisibleRect(this.IAuthTabCallbackStubProxy);
        if ((!globalVisibleRect) || !globalVisibleRect2) {
            return 0.0d;
        }
        int i7 = onUnminimized + 23;
        ICustomTabsCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        if (!this.onActivityLayout.setIntersect(this.extraCallback, this.IAuthTabCallbackStubProxy)) {
            return 0.0d;
        }
        Function0<Rect> function0 = this.asInterface;
        if (function0 != null) {
            int i9 = ICustomTabsCallbackStubProxy + 27;
            onUnminimized = i9 % 128;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Rect rect = (Rect) function0.invoke();
            if (rect != null) {
                this.IAuthTabCallback_Parcel.set(rect);
                iHeight = !this.IAuthTabCallback_Parcel.intersect(this.onActivityLayout) ? 0 : this.IAuthTabCallback_Parcel.height();
            }
        }
        double dCoerceIn = RangesKt.coerceIn(RangesKt.coerceAtLeast(this.onActivityLayout.height() - iHeight, 0) / measuredHeight, 0.0d, 1.0d);
        int i10 = onUnminimized + 13;
        ICustomTabsCallbackStubProxy = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 75 / 0;
        }
        return dCoerceIn;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        AppSetIdAndScope1 appSetIdAndScope1 = benefitTabImpressionHandler.access000;
        benefitTabImpressionHandler.onExtraCallbackWithResult.onNavigationEvent(str);
        int i2 = ICustomTabsCallbackStubProxy + 119;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return null;
    }

    public final void IAuthTabCallback(@NotNull SensorBridgeExtension3 sensorBridgeExtension3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 117;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        this.IAuthTabCallbackStub.remove(sensorBridgeExtension3);
        this.access100.remove(sensorBridgeExtension3);
        int i4 = ICustomTabsCallbackStubProxy + 89;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@NotNull watchShake watchshake, boolean z) {
        Intrinsics.checkNotNullParameter(watchshake, "");
        Set<SensorBridgeExtension3> set = this.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(set, "");
        synchronized (set) {
            if (this.IAuthTabCallbackStub.contains(watchshake)) {
                return;
            }
            TinyAppHostApduService1 tinyAppHostApduService1 = TinyAppHostApduService1.onNavigationEvent;
            Map mapOnNavigationEvent = tinyAppHostApduService1.onNavigationEvent(watchshake.onExtraCallbackWithResult(), watchshake.onExtraCallback());
            if (mapOnNavigationEvent != null) {
                TinyAppHostApduService1.onWarmupCompleted(tinyAppHostApduService1, 5200816L, mapOnNavigationEvent, z, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda21(this, watchshake), 8, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler, watchShake watchshake, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = ICustomTabsCallbackStubProxy + 65;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(watchshake);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 93;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onUnminimized + 111;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.writeTypedObject.onNavigationEvent(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.writeTypedObject.onNavigationEvent(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        SensorBridgeExtension3 sensorBridgeExtension3 = (getSensor.onExtraCallback) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onUnminimized + 21;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (zBooleanValue) {
            benefitTabImpressionHandler.IAuthTabCallbackStub.add(sensorBridgeExtension3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 115;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ List<IAuthTabCallback> $newVisibleItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(List<IAuthTabCallback> list, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$newVisibleItems = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = BenefitTabImpressionHandler.this.new access100(this.$newVisibleItems, access13800Var);
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return access100Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return access100VarCreate.invokeSuspend(unit);
            }
            access100VarCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback;
                int i4 = i3 + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 91;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = onNavigationEvent + 15;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {BenefitTabImpressionHandler.this};
                int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                getBorderRadius getborderradius = (getBorderRadius) BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 397759243, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -397759241, iIAuthTabCallback, objArr);
                List<IAuthTabCallback> list = this.$newVisibleItems;
                this.label = 1;
                if (getborderradius.emit(list, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ List<IAuthTabCallback> $offscreenMissionHolders;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(List<IAuthTabCallback> list, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$offscreenMissionHolders = list;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = BenefitTabImpressionHandler.this.new access000(this.$offscreenMissionHolders, access13800Var);
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {BenefitTabImpressionHandler.this};
                int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                getBorderRadius getborderradius = (getBorderRadius) BenefitTabImpressionHandler.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 397759243, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -397759241, iIAuthTabCallback, objArr);
                List<IAuthTabCallback> list = this.$offscreenMissionHolders;
                this.label = 1;
                if (getborderradius.emit(list, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 78 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02e6 A[Catch: Exception -> 0x03b9, PHI: r9
      0x02e6: PHI (r9v21 java.lang.Object) = (r9v20 java.lang.Object), (r9v27 java.lang.Object) binds: [B:125:0x02e4, B:122:0x02dd] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x03b9, blocks: (B:6:0x003d, B:8:0x0050, B:10:0x0053, B:11:0x0062, B:13:0x0068, B:14:0x008d, B:15:0x0096, B:17:0x009c, B:19:0x00ab, B:20:0x00af, B:21:0x00b3, B:23:0x00b9, B:27:0x00ca, B:29:0x00ce, B:30:0x00d1, B:31:0x00d5, B:33:0x00db, B:37:0x00ec, B:40:0x00f9, B:41:0x00fc, B:42:0x0100, B:44:0x0106, B:48:0x011b, B:50:0x0122, B:52:0x0126, B:55:0x0132, B:56:0x013e, B:58:0x0144, B:61:0x015e, B:67:0x0172, B:69:0x017c, B:71:0x018f, B:64:0x0168, B:65:0x016c, B:73:0x01b7, B:77:0x01d7, B:78:0x01e2, B:80:0x01e8, B:82:0x01f7, B:83:0x01fb, B:84:0x0208, B:88:0x0219, B:89:0x0227, B:90:0x0234, B:94:0x0238, B:97:0x0241, B:98:0x024a, B:100:0x0250, B:102:0x0263, B:103:0x0267, B:106:0x0276, B:108:0x027e, B:110:0x0284, B:111:0x0288, B:113:0x02a1, B:115:0x02b1, B:116:0x02c5, B:120:0x02d6, B:127:0x02e9, B:129:0x02ef, B:133:0x0305, B:139:0x031e, B:140:0x0322, B:141:0x0325, B:142:0x0328, B:126:0x02e6, B:124:0x02e0, B:146:0x032e, B:147:0x0337, B:149:0x033d, B:151:0x034f, B:162:0x0385, B:154:0x035a, B:155:0x035e, B:157:0x0364, B:159:0x0374, B:163:0x0389, B:165:0x038f, B:168:0x03a0, B:170:0x03a4, B:171:0x03a8), top: B:178:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168 A[Catch: Exception -> 0x03b9, TryCatch #1 {Exception -> 0x03b9, blocks: (B:6:0x003d, B:8:0x0050, B:10:0x0053, B:11:0x0062, B:13:0x0068, B:14:0x008d, B:15:0x0096, B:17:0x009c, B:19:0x00ab, B:20:0x00af, B:21:0x00b3, B:23:0x00b9, B:27:0x00ca, B:29:0x00ce, B:30:0x00d1, B:31:0x00d5, B:33:0x00db, B:37:0x00ec, B:40:0x00f9, B:41:0x00fc, B:42:0x0100, B:44:0x0106, B:48:0x011b, B:50:0x0122, B:52:0x0126, B:55:0x0132, B:56:0x013e, B:58:0x0144, B:61:0x015e, B:67:0x0172, B:69:0x017c, B:71:0x018f, B:64:0x0168, B:65:0x016c, B:73:0x01b7, B:77:0x01d7, B:78:0x01e2, B:80:0x01e8, B:82:0x01f7, B:83:0x01fb, B:84:0x0208, B:88:0x0219, B:89:0x0227, B:90:0x0234, B:94:0x0238, B:97:0x0241, B:98:0x024a, B:100:0x0250, B:102:0x0263, B:103:0x0267, B:106:0x0276, B:108:0x027e, B:110:0x0284, B:111:0x0288, B:113:0x02a1, B:115:0x02b1, B:116:0x02c5, B:120:0x02d6, B:127:0x02e9, B:129:0x02ef, B:133:0x0305, B:139:0x031e, B:140:0x0322, B:141:0x0325, B:142:0x0328, B:126:0x02e6, B:124:0x02e0, B:146:0x032e, B:147:0x0337, B:149:0x033d, B:151:0x034f, B:162:0x0385, B:154:0x035a, B:155:0x035e, B:157:0x0364, B:159:0x0374, B:163:0x0389, B:165:0x038f, B:168:0x03a0, B:170:0x03a4, B:171:0x03a8), top: B:178:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access000(Object[] objArr) {
        Object next;
        Object next2;
        Object next3;
        IAuthTabCallback iAuthTabCallback;
        String str;
        BenefitTabImpressionHandler benefitTabImpressionHandler = (BenefitTabImpressionHandler) objArr[0];
        boolean z = true;
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        sendBridgeResponse.IAuthTabCallback.onExtraCallback();
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1227521543, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1227521532, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler});
        Object obj = null;
        if (linearLayoutManager == null) {
            AppSetIdAndScope1 appSetIdAndScope1 = benefitTabImpressionHandler.access000;
            return null;
        }
        try {
            IntRange intRange = new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
            if (intRange.isEmpty()) {
                AppSetIdAndScope1 appSetIdAndScope12 = benefitTabImpressionHandler.access000;
                return null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            IntIterator it = intRange.iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                IAuthTabCallback iAuthTabCallback2 = new IAuthTabCallback(iNextInt, (SensorBridgeExtension3) benefitTabImpressionHandler.access000().onExtraCallbackWithResult().get(iNextInt));
                iAuthTabCallback2.onWarmupCompleted(benefitTabImpressionHandler.onNavigationEvent(iNextInt));
                arrayList.add(iAuthTabCallback2);
            }
            ArrayList<IAuthTabCallback> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((IAuthTabCallback) obj2).onExtraCallback() instanceof SensorBridgeExtension) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((IAuthTabCallback) next).onExtraCallback() instanceof getDeviceBaseInfo) {
                    break;
                }
            }
            IAuthTabCallback iAuthTabCallback3 = (IAuthTabCallback) next;
            if (iAuthTabCallback3 != null) {
                benefitTabImpressionHandler.onWarmupCompleted(iAuthTabCallback3);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (((IAuthTabCallback) next2).onExtraCallback() instanceof BasicSystemInfoExtension) {
                    break;
                }
            }
            IAuthTabCallback iAuthTabCallback4 = (IAuthTabCallback) next2;
            if (iAuthTabCallback4 != null) {
                int i2 = ICustomTabsCallbackStubProxy + 69;
                onUnminimized = i2 % 128;
                int i3 = i2 % 2;
                benefitTabImpressionHandler.onExtraCallbackWithResult(iAuthTabCallback4);
            }
            for (IAuthTabCallback iAuthTabCallback5 : arrayList2) {
                RecyclerView recyclerView = benefitTabImpressionHandler.readTypedObject;
                if (recyclerView == null) {
                    int i4 = onUnminimized + 29;
                    ICustomTabsCallbackStubProxy = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i5 = 88 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    recyclerView = null;
                }
                getSensor getsensorFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iAuthTabCallback5.onWarmupCompleted());
                if (getsensorFindViewHolderForAdapterPosition instanceof getSensor) {
                    for (getSensor.onExtraCallback onextracallback : getsensorFindViewHolderForAdapterPosition.onNavigationEvent()) {
                        Set<SensorBridgeExtension3> set = benefitTabImpressionHandler.IAuthTabCallbackStub;
                        Intrinsics.checkNotNullExpressionValue(set, "");
                        Set<SensorBridgeExtension3> set2 = set;
                        if (set2 instanceof Collection) {
                            int i6 = ICustomTabsCallbackStubProxy + 71;
                            onUnminimized = i6 % 128;
                            int i7 = i6 % 2;
                            if (!set2.isEmpty()) {
                                Iterator<T> it4 = set2.iterator();
                                while (it4.hasNext() == z) {
                                    str = str2;
                                    SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) it4.next();
                                    Function1 function1OnWarmupCompleted = onextracallback.onWarmupCompleted();
                                    Intrinsics.checkNotNull(sensorBridgeExtension3);
                                    if (((Boolean) function1OnWarmupCompleted.invoke(sensorBridgeExtension3)).booleanValue()) {
                                        break;
                                    }
                                    str2 = str;
                                    z = true;
                                }
                            }
                            if (onextracallback.onNavigationEvent().getVisibility() == 0) {
                                str = str2;
                                if (benefitTabImpressionHandler.IAuthTabCallback(onextracallback.onNavigationEvent()) >= onextracallback.onExtraCallbackWithResult()) {
                                    TinyAppHostApduService1.onWarmupCompleted(TinyAppHostApduService1.onNavigationEvent, onextracallback.IAuthTabCallback(), (Map) onextracallback.onExtraCallback().invoke(), false, (Function1) null, new BenefitTabImpressionHandler$.ExternalSyntheticLambda16(benefitTabImpressionHandler, onextracallback), 12, (Object) null);
                                }
                                str2 = str;
                                z = true;
                            }
                        }
                    }
                }
            }
            String str3 = str2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((IAuthTabCallback) obj3).onExtraCallback(benefitTabImpressionHandler.onNavigationEvent)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                int i8 = ICustomTabsCallbackStubProxy + 93;
                onUnminimized = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList4.add(((IAuthTabCallback) it5.next()).onExtraCallback());
                    throw null;
                }
                arrayList4.add(((IAuthTabCallback) it5.next()).onExtraCallback());
            }
            if (benefitTabImpressionHandler.access100.containsAll(arrayList4)) {
                return null;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList3) {
                if (!benefitTabImpressionHandler.access100.contains(((IAuthTabCallback) obj4).onExtraCallback())) {
                    arrayList5.add(obj4);
                }
            }
            if (!arrayList5.isEmpty()) {
                int i9 = ICustomTabsCallbackStubProxy + 111;
                onUnminimized = i9 % 128;
                int i10 = i9 % 2;
                if (!benefitTabImpressionHandler.IAuthTabCallbackDefault.onNavigationEvent(arrayList5)) {
                    AppSetIdAndScope1 appSetIdAndScope13 = benefitTabImpressionHandler.access000;
                    TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = benefitTabImpressionHandler.getInterfaceDescriptor;
                    if (textFieldScrollKtExternalSyntheticLambda0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        textFieldScrollKtExternalSyntheticLambda0 = null;
                    }
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), (CoroutineContext) null, (setRandomHost) null, benefitTabImpressionHandler.new access100(arrayList5, null), 3, (Object) null);
                    int i11 = ICustomTabsCallbackStubProxy + 61;
                    onUnminimized = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            benefitTabImpressionHandler.access100 = CollectionsKt.toMutableSet(arrayList4);
            if (Intrinsics.areEqual(str3, "refreshCardsAndMission")) {
                List listOnExtraCallbackWithResult = benefitTabImpressionHandler.access000().onExtraCallbackWithResult();
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = listOnExtraCallbackWithResult.iterator();
                int i13 = 0;
                while (it6.hasNext()) {
                    int i14 = ICustomTabsCallbackStubProxy + 35;
                    onUnminimized = i14 % 128;
                    if (i14 % 2 != 0) {
                        next3 = it6.next();
                        int i15 = 52 / 0;
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                    } else {
                        next3 = it6.next();
                        if (i13 < 0) {
                        }
                    }
                    SensorBridgeExtension3 sensorBridgeExtension32 = (SensorBridgeExtension3) next3;
                    if (sensorBridgeExtension32 instanceof RotationVectorAbility) {
                        int first = intRange.getFirst();
                        if (i13 <= intRange.getLast()) {
                            int i16 = onUnminimized + 27;
                            ICustomTabsCallbackStubProxy = i16 % 128;
                            int i17 = i16 % 2;
                            if (first <= i13) {
                                iAuthTabCallback = null;
                            }
                        }
                        iAuthTabCallback = new IAuthTabCallback(i13, sensorBridgeExtension32);
                        iAuthTabCallback.onWarmupCompleted(1.0d);
                    }
                    if (iAuthTabCallback != null) {
                        int i18 = onUnminimized + 3;
                        ICustomTabsCallbackStubProxy = i18 % 128;
                        if (i18 % 2 == 0) {
                            arrayList6.add(iAuthTabCallback);
                            obj.hashCode();
                            throw null;
                        }
                        arrayList6.add(iAuthTabCallback);
                    }
                    i13++;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList6) {
                    IAuthTabCallback iAuthTabCallback6 = (IAuthTabCallback) obj5;
                    Set<SensorBridgeExtension3> set3 = benefitTabImpressionHandler.IAuthTabCallbackStub;
                    Intrinsics.checkNotNullExpressionValue(set3, "");
                    Set<SensorBridgeExtension3> set4 = set3;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        for (SensorBridgeExtension3 sensorBridgeExtension33 : set4) {
                            Function1 function1OnWarmupCompleted2 = iAuthTabCallback6.onExtraCallback().onWarmupCompleted();
                            if (function1OnWarmupCompleted2 != null) {
                                Intrinsics.checkNotNull(sensorBridgeExtension33);
                                if (((Boolean) function1OnWarmupCompleted2.invoke(sensorBridgeExtension33)).booleanValue()) {
                                    break;
                                }
                            }
                        }
                    }
                    arrayList7.add(obj5);
                }
                if (!arrayList7.isEmpty() && !benefitTabImpressionHandler.IAuthTabCallbackDefault.onNavigationEvent(arrayList7)) {
                    int i19 = onUnminimized + 77;
                    ICustomTabsCallbackStubProxy = i19 % 128;
                    int i20 = i19 % 2;
                    TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = benefitTabImpressionHandler.getInterfaceDescriptor;
                    if (textFieldScrollKtExternalSyntheticLambda02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        textFieldScrollKtExternalSyntheticLambda02 = null;
                    }
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda02), (CoroutineContext) null, (setRandomHost) null, benefitTabImpressionHandler.new access000(arrayList7, null), 3, (Object) null);
                }
            }
            return null;
        } catch (Exception e) {
            AppSetIdAndScope1 appSetIdAndScope14 = benefitTabImpressionHandler.access000;
            e.toString();
            return null;
        }
    }

    private final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        View view;
        int i = 2 % 2;
        RecyclerView recyclerView = this.readTypedObject;
        if (recyclerView == null) {
            int i2 = ICustomTabsCallbackStubProxy + 47;
            onUnminimized = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 48 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            recyclerView = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            int i4 = ICustomTabsCallbackStubProxy + 101;
            onUnminimized = i4 % 128;
            if (i4 % 2 != 0) {
                View view2 = viewHolderFindViewHolderForAdapterPosition.onNavigationEvent;
                videoAdsController.hashCode();
                throw null;
            }
            view = viewHolderFindViewHolderForAdapterPosition.onNavigationEvent;
        } else {
            view = null;
        }
        videoAdsController = view != null ? (VideoAdsController) view.findViewById(R.id.playerController) : null;
        boolean z = iAuthTabCallback.IAuthTabCallback() > 0.5d;
        if (this.onMessageChannelReady != z) {
            if (videoAdsController != null) {
                videoAdsController.setOnPlayerViewVisible(z);
            }
            this.onMessageChannelReady = z;
        }
    }

    private final void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        RecyclerView recyclerView = this.readTypedObject;
        ThumbnailAdMobController thumbnailAdMobController = null;
        if (recyclerView == null) {
            int i2 = onUnminimized + 15;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                thumbnailAdMobController.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        boolean z = false;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
        View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.onNavigationEvent : null;
        if (view != null) {
            thumbnailAdMobController = (ThumbnailAdMobController) view.findViewById(R.id.thumbnailAdMobContainer);
            int i3 = ICustomTabsCallbackStubProxy + 99;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
        }
        if (iAuthTabCallback.IAuthTabCallback() > 0.5d) {
            int i5 = onUnminimized + 125;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (thumbnailAdMobController != null) {
            thumbnailAdMobController.setVisibleRatio(iAuthTabCallback.IAuthTabCallback());
        }
        if (this.onExtraCallback != z) {
            if (thumbnailAdMobController != null) {
                int i7 = onUnminimized + 93;
                ICustomTabsCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                thumbnailAdMobController.setOnViewVisible(z);
            }
            this.onExtraCallback = z;
        }
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStubProxy + 11;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        if (recyclerView.getScrollState() != 0) {
            IAuthTabCallback("onScrolled");
            return;
        }
        int i6 = onUnminimized + 53;
        ICustomTabsCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, iIAuthTabCallback, new Object[]{this, "SCROLL_STATE_IDLE"});
            return;
        }
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback4, 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, iIAuthTabCallback3, new Object[]{this, "SCROLL_STATE_IDLE"});
        throw null;
    }

    static {
        isEngagementSignalsApiAvailable = 1;
        asBinder();
        Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
        onWarmupCompleted = 8;
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"pay_coupon", "financial_mission"});
        int i = extraCommand + 39;
        isEngagementSignalsApiAvailable = i % 128;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitTabImpressionHandler benefitTabImpressionHandler, getSensor.onExtraCallback onextracallback, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, onextracallback, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -557440932, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 557440932, iIAuthTabCallback, objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1317965966, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1317965952, iIAuthTabCallback, objArr);
    }

    public static /* synthetic */ Unit access000(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 844249655, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -844249648, iIAuthTabCallback, objArr);
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback(BenefitTabImpressionHandler benefitTabImpressionHandler) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (getBorderRadius) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 397759243, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -397759241, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler});
    }

    private final LinearLayoutManager IAuthTabCallbackStubProxy() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (LinearLayoutManager) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1227521543, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1227521532, iIAuthTabCallback, new Object[]{this});
    }

    private static final Unit readTypedObject(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1214930953, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1214930949, iIAuthTabCallback, objArr);
    }

    private static final Unit onActivityResized(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 15507591, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -15507583, iIAuthTabCallback, objArr);
    }

    private static final Unit ICustomTabsCallbackStubProxy(BenefitTabImpressionHandler benefitTabImpressionHandler, SensorBridgeExtension3 sensorBridgeExtension3, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, sensorBridgeExtension3, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1033424053, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1033424065, iIAuthTabCallback, objArr);
    }

    public static /* synthetic */ void onNavigationEvent(BenefitTabImpressionHandler benefitTabImpressionHandler, watchShake watchshake, boolean z, int i, Object obj) {
        Object[] objArr = {benefitTabImpressionHandler, watchshake, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 13077443, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -13077434, iIAuthTabCallback, objArr);
    }

    private static final void IAuthTabCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1239719275, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1239719262, iIAuthTabCallback, new Object[]{benefitTabImpressionHandler, str});
    }

    private static final Unit onExtraCallback(BenefitTabImpressionHandler benefitTabImpressionHandler, getSensor.onExtraCallback onextracallback, boolean z) {
        Object[] objArr = {benefitTabImpressionHandler, onextracallback, Boolean.valueOf(z)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2040478486, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2040478502, iIAuthTabCallback, objArr);
    }

    private final void onNavigationEvent(NativeAd nativeAd) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -445100358, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 445100361, iIAuthTabCallback, new Object[]{this, nativeAd});
    }

    public final void onNavigationEvent(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -616602266, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 616602271, iIAuthTabCallback, new Object[]{this, textFieldScrollKtExternalSyntheticLambda0});
    }

    public final void IAuthTabCallback() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -547360297, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 547360298, iIAuthTabCallback, new Object[]{this});
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1131723474, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1131723464, iIAuthTabCallback, new Object[]{this, str});
    }

    public final void onWarmupCompleted() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, 1316068765, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1316068759, iIAuthTabCallback, new Object[]{this});
    }

    public final void onExtraCallback(@NotNull String str) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, -449811503, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 449811518, iIAuthTabCallback, new Object[]{this, str});
    }

    static void asBinder() {
        ICustomTabsCallbackDefault = 7798559133331975163L;
        ICustomTabsCallbackStub = -1279613540;
        onRelationshipValidationResult = (char) 27643;
    }
}
