package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.semantics.Role;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.view.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.oExternalSyntheticLambda0;
import o.setCallToAction;
import o.t5;
import o.toPreviewOnlyRange;
import o.u3;
import o.u4;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t5 {
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel;
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy;
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback_Parcel;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService;
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceDefault;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStub;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStubProxy;
    private static int ICustomTabsService_Parcel;
    private static int IEngagementSignalsCallback;
    private static short[] IEngagementSignalsCallbackDefault;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100;
    private static byte[] access200;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCommand;
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> isEngagementSignalsApiAvailable;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newAuthTabSession;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSession;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSessionWithExtras;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized;
    public static final t5 onExtraCallback;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static int onGreatestScrollPercentageIncreased;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady;
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized;
    private static setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> postMessage;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetch;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetchWithMultipleUrls;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> receiveFile;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannel;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannelWithExtras;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> setEngagementSignalsCallback;
    private static getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> updateVisuals;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> validateRelationship;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> warmup;
    private static int writeTypedList;
    private static getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;
    private static final byte[] $$a = {79, 7, -80, -125};
    private static final int $$b = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onVerticalScrollEvent = 1;
    private static int IEngagementSignalsCallbackStub = 0;
    private static int onSessionEnded = 1;

    private static String $$c(int i, short s, short s2) {
        byte[] bArr = $$a;
        int i2 = 3 - (s2 * 4);
        int i3 = s * 3;
        int i4 = (i * 4) + 115;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i2 + i5;
            i2 = i2;
            i4 = i7;
        }
        while (true) {
            i6++;
            int i8 = i2 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = i8;
            i4 += bArr[i8];
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 39;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1615852831, -1615852818, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = IEngagementSignalsCallbackStub + 13;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 87;
        int i3 = i2 % 128;
        onSessionEnded = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = prefetch;
            int i4 = 30 / 0;
        } else {
            getbacktracenote = prefetch;
        }
        int i5 = i3 + 99;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 45;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 17;
        onSessionEnded = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnMessageChannelReady;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 35;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitUpdateVisuals = updateVisuals(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 117;
        onSessionEnded = i5 % 128;
        if (i5 % 2 != 0) {
            return unitUpdateVisuals;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onSessionEnded + 105;
        IEngagementSignalsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IEngagementSignalsCallbackStub + 7;
        onSessionEnded = i4 % 128;
        int i5 = i4 % 2;
        return unitMayLaunchUrl;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 13;
        onSessionEnded = i3 % 128;
        if (i3 % 2 != 0) {
            return onTransact(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onTransact(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 65;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            newSession(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitNewSession = newSession(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onSessionEnded + 51;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unitNewSession;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 15;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPrefetch = prefetch(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 45 / 0;
        }
        int i6 = onSessionEnded + 81;
        IEngagementSignalsCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitPrefetch;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 113;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallback;
        int i5 = i2 + 91;
        onSessionEnded = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 75;
        onSessionEnded = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onExtraCallback(new Object[]{u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 743137683, -743137658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 33;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            ICustomTabsServiceStub(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onSessionEnded + 43;
        IEngagementSignalsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStub;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 53;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = extraCallback;
        int i5 = i2 + 81;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 55;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 103;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 3;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            onRelationshipValidationResult(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IEngagementSignalsCallbackStub + 123;
        onSessionEnded = i4 % 128;
        int i5 = i4 % 2;
        return unitOnRelationshipValidationResult;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onSessionEnded + 53;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        int i4 = i2 % 2;
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsServiceStub;
        int i5 = i3 + 121;
        onSessionEnded = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 93;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 113;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitNewAuthTabSession;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onSessionEnded + 5;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i4 = i3 + 95;
        onSessionEnded = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access000(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 117;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnPostMessage = onPostMessage(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        int i6 = onSessionEnded + 61;
        IEngagementSignalsCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnPostMessage;
        }
        throw null;
    }

    public static /* synthetic */ Unit access000(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 25;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 85;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return unitPrefetchWithMultipleUrls;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 17;
        onSessionEnded = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{Integer.valueOf(iIntValue), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, 1903403580, -1903403566, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = onSessionEnded + 73;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit access100(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 57;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 39;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return unitICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit access100(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 87;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 39;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIsEngagementSignalsApiAvailable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 79;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 21;
        onSessionEnded = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit asBinder(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 29;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPostMessage = postMessage(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        return unitPostMessage;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onSessionEnded + 121;
        IEngagementSignalsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return access000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 9;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            onRelationshipValidationResult(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onSessionEnded + 63;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return unitOnRelationshipValidationResult;
    }

    public static /* synthetic */ Unit asInterface(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 27;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i4 != 0) {
            return (Unit) onExtraCallback(objArr, 1614038576, -1614038569, iOnNavigationEvent4, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onSessionEnded + 53;
        IEngagementSignalsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback_Parcel(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onSessionEnded + 25;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitICustomTabsCallback_Parcel;
    }

    public static /* synthetic */ Unit extraCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 89;
        onSessionEnded = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 240018495, -240018471, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onSessionEnded + 81;
        IEngagementSignalsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return access100;
        }
        throw null;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 87;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            mayLaunchUrl(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitMayLaunchUrl = mayLaunchUrl(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onSessionEnded + 81;
        IEngagementSignalsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitMayLaunchUrl;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onSessionEnded;
        int i3 = i2 + 23;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = requestPostMessageChannelWithExtras;
            int i4 = 15 / 0;
        } else {
            getbacktracenote = requestPostMessageChannelWithExtras;
        }
        int i5 = i2 + 73;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 53;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnActivityResized = onActivityResized(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 5;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 31;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return extraCommand(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        extraCommand(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityLayout(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 47;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return newSessionWithExtras(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        newSessionWithExtras(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityResized(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 87;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return onUnminimized(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onUnminimized(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onSessionEnded + 67;
        IEngagementSignalsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            requestPostMessageChannel(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IEngagementSignalsCallbackStub + 55;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        return unitRequestPostMessageChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7 = ~i;
        int i8 = ~(i7 | i2 | i4);
        int i9 = (~((~i4) | i2)) | (~(i2 | i));
        int i10 = i2 + i + i5 + (32217706 * i6) + (238734613 * i3);
        int i11 = i10 * i10;
        int i12 = ((1127137324 * i2) - 440746823) + (i * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (1127136485 * i5) + (976419026 * i6) + (1106960329 * i3) + (i11 * 279773184);
        int i13 = (((-3446596) * i2) - 528416768) + (677943110 * i) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i5) + ((-154927104) * i6) + ((-131989504) * i3) + ((-1876361216) * i11) + (i12 * i12 * (-1943076864));
        int i14 = 5;
        boolean z2 = false;
        switch (i13) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                u3 u3Var = (u3) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i15 = 2 % 2;
                int i16 = IEngagementSignalsCallbackStub + 9;
                onSessionEnded = i16 % 128;
                int i17 = i16 % 2;
                Unit unit = (Unit) onExtraCallback(new Object[]{u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, -653995284, 653995304, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                int i18 = IEngagementSignalsCallbackStub + 19;
                onSessionEnded = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return access100(objArr);
            case 13:
                u4 u4Var = (u4) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i20 = 2 % 2;
                int i21 = IEngagementSignalsCallbackStub + 73;
                onSessionEnded = i21 % 128;
                if (i21 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(u4Var, "");
                    if ((iIntValue2 & 123) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u4Var)) {
                            int i22 = IEngagementSignalsCallbackStub + 113;
                            onSessionEnded = i22 % 128;
                            if (i22 % 2 != 0) {
                                i14 = 4;
                            }
                        } else {
                            i14 = 2;
                        }
                        iIntValue2 |= i14;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(u4Var, "");
                    if ((iIntValue2 & 6) == 0) {
                    }
                }
                if ((iIntValue2 & 19) != 18) {
                    int i23 = IEngagementSignalsCallbackStub + 123;
                    onSessionEnded = i23 % 128;
                    int i24 = i23 % 2;
                    z2 = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z2, iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1704804658, iIntValue2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1704804658.<anonymous> (TdsBottomCtaV1.kt:1113)");
                    }
                    u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 6, iIntValue2 & 14, 1022);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 14:
                int iIntValue3 = ((Number) objArr[0]).intValue();
                w5a w5aVar = (w5a) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue4 = ((Number) objArr[3]).intValue();
                int i25 = 2 % 2;
                Intrinsics.checkNotNullParameter(w5aVar, "");
                if ((iIntValue4 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(w5aVar)) {
                        int i26 = onSessionEnded + 95;
                        IEngagementSignalsCallbackStub = i26 % 128;
                        if (i26 % 2 == 0) {
                            i14 = 4;
                        }
                    } else {
                        i14 = 2;
                    }
                    iIntValue4 |= i14;
                }
                if ((iIntValue4 & 19) != 18) {
                    z2 = true;
                } else {
                    int i27 = onSessionEnded + 45;
                    IEngagementSignalsCallbackStub = i27 % 128;
                    int i28 = i27 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z2, iIntValue4 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1930135131, iIntValue4, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1121279458.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:1302)");
                    }
                    w5aVar.onExtraCallbackWithResult("TEST: " + iIntValue3, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult3, (iIntValue4 << 6) & 896, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 15:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int i29 = 2 % 2;
                int i30 = onSessionEnded + 75;
                IEngagementSignalsCallbackStub = i30 % 128;
                int i31 = i30 % 2;
                Unit unitAsBinder = asBinder(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult4, iIntValue5);
                int i32 = onSessionEnded + 41;
                IEngagementSignalsCallbackStub = i32 % 128;
                int i33 = i32 % 2;
                return unitAsBinder;
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = (DeviceQuirksExternalSyntheticLambda0) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue6 = ((Number) objArr[2]).intValue();
                int i34 = 2 % 2;
                Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= cameraCaptureResultEmptyCameraCaptureResult5.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ? 4 : 2;
                }
                if ((iIntValue6 & 19) != 18) {
                    int i35 = onSessionEnded + 89;
                    IEngagementSignalsCallbackStub = i35 % 128;
                    z = i35 % 2 == 0;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(z, iIntValue6 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult5.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2048048547, iIntValue6, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-2048048547.<anonymous> (TdsBottomCtaV1.kt:1100)");
                        int i36 = IEngagementSignalsCallbackStub + 47;
                        onSessionEnded = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    QuirkSettingsLoader quirkSettingsLoaderOnWarmupCompleted = QuirkSettingsLoader.Companion.onWarmupCompleted();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda02), 0.0f, 1, (Object) null);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnWarmupCompleted, false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult5, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult5.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult5, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult5.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult5.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult5.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult5.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult5);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    u1.IAuthTabCallback(null, null, validateRelationship, null, postMessage, null, updateVisuals, ICustomTabsCallbackDefault, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult5, 14180736, 0, 3883);
                    cameraCaptureResultEmptyCameraCaptureResult5.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                int i38 = onSessionEnded + 53;
                IEngagementSignalsCallbackStub = i38 % 128;
                int i39 = i38 % 2;
                return unit2;
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return onPostMessage(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 99;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 83;
        onSessionEnded = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 11;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            isEngagementSignalsApiAvailable(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onSessionEnded + 47;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return unitIsEngagementSignalsApiAvailable;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        u3 u3Var = (u3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 21;
        onSessionEnded = i2 % 128;
        if (i2 % 2 != 0) {
            return newAuthTabSession(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        newAuthTabSession(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 1;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -530928621, 530928624, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = IEngagementSignalsCallbackStub + 99;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onSessionEnded + 55;
        IEngagementSignalsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onSessionEnded + 101;
        IEngagementSignalsCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 103;
        IEngagementSignalsCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onMinimized(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnMinimized = onMinimized(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IEngagementSignalsCallbackStub + 3;
        onSessionEnded = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnMinimized;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 3;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return newSession(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        newSession(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onMessageChannelReady(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 107;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1571328059, -1571328053, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = onSessionEnded + 51;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onMinimized(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 81;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 43;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return engagementSignalsCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 83;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = newAuthTabSession;
            int i4 = 21 / 0;
        } else {
            getbacktracenote = newAuthTabSession;
        }
        int i5 = i2 + 123;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onNavigationEvent(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 35;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(new Object[]{deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -229683429, 229683447, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 23;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return extraCommand(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        extraCommand(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onTransact(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 39;
        IEngagementSignalsCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            prefetch(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitPrefetch = prefetch(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onSessionEnded + 5;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitPrefetch;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 101;
        onSessionEnded = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IEngagementSignalsCallbackStub + 85;
        onSessionEnded = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 37;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 63;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 111;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 77;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        int i6 = IEngagementSignalsCallbackStub + 63;
        onSessionEnded = i6 % 128;
        if (i6 % 2 != 0) {
            return unitICustomTabsCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit readTypedObject(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 119;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnUnminimized = onUnminimized(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
        return unitOnUnminimized;
    }

    public static /* synthetic */ Unit readTypedObject(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 85;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsService = ICustomTabsService(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IEngagementSignalsCallbackStub + 59;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsService;
    }

    public static /* synthetic */ Unit writeTypedObject(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 85;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit writeTypedObject(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 45;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onSessionEnded + 105;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return unitRequestPostMessageChannelWithExtras;
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 95;
        IEngagementSignalsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 47;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = asInterface;
        int i5 = i2 + 99;
        onSessionEnded = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 27;
        onSessionEnded = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onPostMessage;
        int i4 = i2 + 13;
        onSessionEnded = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 119;
        int i3 = i2 % 128;
        onSessionEnded = i3;
        int i4 = i2 % 2;
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsService;
        int i5 = i3 + 39;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault() {
        getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 35;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = ICustomTabsServiceDefault;
            int i4 = 66 / 0;
        } else {
            getbacktracenote = ICustomTabsServiceDefault;
        }
        int i5 = i2 + 103;
        onSessionEnded = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 87;
        onSessionEnded = i2 % 128;
        if (i2 % 2 != 0) {
            return warmup;
        }
        throw null;
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000() {
        int i = 2 % 2;
        int i2 = onSessionEnded;
        int i3 = i2 + 33;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onMinimized;
        int i5 = i2 + 23;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 99;
        onSessionEnded = i2 % 128;
        if (i2 % 2 != 0) {
            return getInterfaceDescriptor;
        }
        throw null;
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 17;
        IEngagementSignalsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 3;
        onSessionEnded = i2 % 128;
        if (i2 % 2 != 0) {
            return isEngagementSignalsApiAvailable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onSessionEnded;
        int i3 = i2 + 7;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = mayLaunchUrl;
        int i5 = i2 + 39;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 49;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = readTypedObject;
        int i4 = i2 + 15;
        onSessionEnded = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 61;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsServiceStubProxy;
        int i4 = i3 + 99;
        onSessionEnded = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub;
        int i3 = i2 + 23;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = newSession;
        int i5 = i2 + 75;
        onSessionEnded = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onSessionEnded;
        int i3 = i2 + 99;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStub;
        int i5 = i2 + 51;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 121;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        int i4 = i2 % 2;
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i5 = i3 + 101;
        onSessionEnded = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 13;
        int i3 = i2 % 128;
        onSessionEnded = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = newSessionWithExtras;
        int i4 = i3 + 109;
        IEngagementSignalsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized() {
        int i = 2 % 2;
        int i2 = onSessionEnded;
        int i3 = i2 + 61;
        IEngagementSignalsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallback_Parcel;
        int i4 = i2 + 11;
        IEngagementSignalsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 59;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = requestPostMessageChannel;
        int i4 = i3 + 57;
        onSessionEnded = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 77;
        IEngagementSignalsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> settaggedaddrctrl = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return settaggedaddrctrl;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject() {
        int i = 2 % 2;
        int i2 = onSessionEnded + 111;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        int i4 = i2 % 2;
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = extraCommand;
        int i5 = i3 + 45;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject() {
        getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onSessionEnded + 113;
        int i3 = i2 % 128;
        IEngagementSignalsCallbackStub = i3;
        if (i2 % 2 != 0) {
            getbacktracenote = ICustomTabsCallbackStub;
            int i4 = 47 / 0;
        } else {
            getbacktracenote = ICustomTabsCallbackStub;
        }
        int i5 = i3 + 63;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IEngagementSignalsCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 43424), TextUtils.getCapsMode("", 0, 0) + 42, 22439 - View.MeasureSpec.makeMeasureSpec(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $10 + 109;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = access200;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 89;
                        $10 = i10 % 128;
                        int i11 = i10 % i4;
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 12843), Drawable.resolveOpacity(0, 0) + 55, 2167 - Drawable.resolveOpacity(0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = access200;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(writeTypedList)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetAfter("", 0)), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-16754777) - Color.rgb(0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IEngagementSignalsCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IEngagementSignalsCallbackDefault[i + ((int) (writeTypedList ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IEngagementSignalsCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (writeTypedList ^ j)) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(ICustomTabsService_Parcel), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 87 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = access200;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = 0;
                    while (i12 < length2) {
                        int i13 = $11 + 101;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            bArr5[i12] = (byte) (bArr4[i12] & (-4629411779493505016L));
                        } else {
                            bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                            i12++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = access200;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i14 = $10 + 69;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        short[] sArr = IEngagementSignalsCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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

    static {
        onGreatestScrollPercentageIncreased = 0;
        ICustomTabsService();
        onExtraCallback = new t5();
        writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1980190043, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
                if (i3 == 0) {
                    throw null;
                }
                Unit unit = (Unit) t5.onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, 1308866602, -1308866601, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                int i4 = onNavigationEvent + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-1716449493, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit typedObject = t5.readTypedObject((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 != 0) {
                    int i4 = 49 / 0;
                }
                int i5 = onExtraCallback + 91;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return typedObject;
                }
                throw null;
            }
        });
        onMessageChannelReady = ForwardingCameraControl.onExtraCallbackWithResult(-498169876, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = t5.onExtraCallback((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1286081518, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda34
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = t5.onWarmupCompleted((DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
        receiveFile = ForwardingCameraControl.onExtraCallbackWithResult(2056438923, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda45
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                if (i3 != 0) {
                    return (Unit) t5.onExtraCallback(objArr, 789085343, -789085322, iOnNavigationEvent4, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3);
                }
                throw null;
            }
        });
        prefetchWithMultipleUrls = ForwardingCameraControl.onExtraCallbackWithResult(198030861, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda46
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = t5.onWarmupCompleted((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 79;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        extraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1974787823, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda47
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = t5.onNavigationEvent((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 31;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        onUnminimized = ForwardingCameraControl.onExtraCallbackWithResult(-756508206, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda48
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                u3 u3Var = (u3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return t5.extraCallbackWithResult(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                t5.extraCallbackWithResult(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
        });
        getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(-1544419848, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda49
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) t5.onExtraCallback(new Object[]{(DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 794952986, -794952970, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        ICustomTabsServiceStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(984265268, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda50
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit interfaceDescriptor = t5.getInterfaceDescriptor((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return interfaceDescriptor;
            }
        });
        extraCommand = ForwardingCameraControl.onExtraCallbackWithResult(-981721486, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackDefault = t5.IAuthTabCallbackDefault((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 43;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallbackDefault;
                }
                throw null;
            }
        });
        prefetch = ForwardingCameraControl.onExtraCallbackWithResult(1927180014, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = t5.onExtraCallbackWithResult((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 101;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        ICustomTabsServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(944186637, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                if (i3 != 0) {
                    return (Unit) t5.onExtraCallback(objArr, -535877011, 535877013, iOnNavigationEvent4, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3);
                }
                throw null;
            }
        });
        ICustomTabsService = ForwardingCameraControl.onExtraCallbackWithResult(1411678557, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object obj4 = null;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    t5.onActivityResized(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnActivityResized = t5.onActivityResized(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnActivityResized;
                }
                obj4.hashCode();
                throw null;
            }
        });
        newAuthTabSession = ForwardingCameraControl.onExtraCallbackWithResult(1884018203, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    t5.IAuthTabCallback_Parcel(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitIAuthTabCallback_Parcel = t5.IAuthTabCallback_Parcel(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = IAuthTabCallback + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback_Parcel;
            }
        });
        mayLaunchUrl = ForwardingCameraControl.onExtraCallbackWithResult(1314650007, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsBinder = t5.asBinder((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitAsBinder;
            }
        });
        newSession = ForwardingCameraControl.onExtraCallbackWithResult(1550819830, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                IAuthTabCallback = i2 % 128;
                u3 u3Var = (u3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    t5.IAuthTabCallbackDefault(u3Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitIAuthTabCallbackDefault = t5.IAuthTabCallbackDefault(u3Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = onExtraCallback + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitIAuthTabCallbackDefault;
            }
        });
        ICustomTabsServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(678716369, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object obj4 = null;
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    t5.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = t5.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onNavigationEvent + 69;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1150498739, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnActivityLayout = t5.onActivityLayout((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 29;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 21 / 0;
                }
                return unitOnActivityLayout;
            }
        });
        ICustomTabsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-835390746, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) t5.onExtraCallback(new Object[]{(u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, -1665839765, 1665839770, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                int i4 = onExtraCallbackWithResult + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        ICustomTabsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1441517952, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    t5.IAuthTabCallbackStub(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitIAuthTabCallbackStub = t5.IAuthTabCallbackStub(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onWarmupCompleted + 115;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallbackStub;
                }
                throw null;
            }
        });
        validateRelationship = ForwardingCameraControl.onExtraCallbackWithResult(928557104, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onWarmupCompleted = i2 % 128;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unit = (Unit) t5.onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj3).intValue())}, 1218927446, -1218927436, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                int i3 = onExtraCallback + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }
        });
        postMessage = ForwardingCameraControl.onExtraCallbackWithResult(1704804658, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda15
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = t5.IAuthTabCallback((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 113;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        });
        updateVisuals = ForwardingCameraControl.onExtraCallbackWithResult(980155190, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda16
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback_Parcel = t5.IAuthTabCallback_Parcel((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 1;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback_Parcel;
            }
        });
        ICustomTabsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-779204681, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnTransact = t5.onTransact((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 33;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 95 / 0;
                }
                return unitOnTransact;
            }
        });
        ICustomTabsCallback = ForwardingCameraControl.onExtraCallbackWithResult(-2048048547, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = t5.onNavigationEvent((DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 83;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 47 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
        onActivityLayout = ForwardingCameraControl.onExtraCallbackWithResult(-300710810, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitIAuthTabCallbackStubProxy;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onExtraCallback = i2 % 128;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 == 0) {
                    unitIAuthTabCallbackStubProxy = t5.IAuthTabCallbackStubProxy(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i3 = 60 / 0;
                } else {
                    unitIAuthTabCallbackStubProxy = t5.IAuthTabCallbackStubProxy(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i4 = onWarmupCompleted + 105;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackStubProxy;
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-1416678936, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsBinder = t5.asBinder((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 21;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitAsBinder;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        setEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(261140620, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit interfaceDescriptor = t5.getInterfaceDescriptor((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 47;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 42 / 0;
                }
                return interfaceDescriptor;
            }
        });
        onRelationshipValidationResult = ForwardingCameraControl.onExtraCallbackWithResult(-763489044, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStub = t5.IAuthTabCallbackStub((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackStub;
            }
        });
        onActivityResized = ForwardingCameraControl.onExtraCallbackWithResult(-296843443, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda24
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStubProxy = t5.IAuthTabCallbackStubProxy((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 != 0) {
                    int i4 = 78 / 0;
                }
                return unitIAuthTabCallbackStubProxy;
            }
        });
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-1321473107, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda25
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsInterface = t5.asInterface((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitAsInterface;
            }
        });
        onMinimized = ForwardingCameraControl.onExtraCallbackWithResult(-215725101, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = t5.onExtraCallback((DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i3 != 0) {
                    int i4 = 86 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        readTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1910322472, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda27
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    t5.onMinimized(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnMinimized = t5.onMinimized(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onWarmupCompleted + 89;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnMinimized;
            }
        });
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(-1890781350, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda28
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAsInterface = t5.asInterface((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 1;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 42 / 0;
                }
                return unitAsInterface;
            }
        });
        requestPostMessageChannel = ForwardingCameraControl.onExtraCallbackWithResult(2136110159, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda29
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAccess100 = t5.access100((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 95;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitAccess100;
                }
                throw null;
            }
        });
        ICustomTabsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-559708079, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda30
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return t5.extraCallback(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                t5.extraCallback(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        isEngagementSignalsApiAvailable = ForwardingCameraControl.onExtraCallbackWithResult(1251374352, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda31
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnMessageChannelReady = t5.onMessageChannelReady((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnMessageChannelReady;
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-1444443886, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda32
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallbackStub = t5.IAuthTabCallbackStub((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onWarmupCompleted + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallbackStub;
            }
        });
        warmup = ForwardingCameraControl.onExtraCallbackWithResult(366638545, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda33
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return t5.readTypedObject(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                t5.readTypedObject(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        newSessionWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(1965787603, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda35
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) t5.onExtraCallback(new Object[]{(u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, -651229167, 651229171, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                int i4 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1047271069, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda36
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    return t5.onExtraCallbackWithResult(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                t5.onExtraCallbackWithResult(u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
        });
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-1295239263, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda37
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitICustomTabsCallback = t5.ICustomTabsCallback((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 49;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 29 / 0;
                }
                return unitICustomTabsCallback;
            }
        });
        requestPostMessageChannelWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(302271517, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda38
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAccess000 = t5.access000((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = IAuthTabCallback + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 82 / 0;
                }
                return unitAccess000;
            }
        });
        extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1969196228, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda39
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                u3 u3Var = (u3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 == 0) {
                    t5.onWarmupCompleted(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitOnWarmupCompleted = t5.onWarmupCompleted(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = IAuthTabCallback + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1121279458, false, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda40
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = t5.onExtraCallbackWithResult((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i4 = onWarmupCompleted + 59;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 41 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        access000 = ForwardingCameraControl.onExtraCallbackWithResult(-1602681905, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda41
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitWriteTypedObject = t5.writeTypedObject((u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onNavigationEvent + 5;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitWriteTypedObject;
            }
        });
        onPostMessage = ForwardingCameraControl.onExtraCallbackWithResult(-2075917555, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda42
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                onExtraCallbackWithResult = i2 % 128;
                u4 u4Var = (u4) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i2 % 2 != 0) {
                    return t5.access000(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                t5.access000(u4Var, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-1473939063, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda43
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitAccess100 = t5.access100((u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitAccess100;
            }
        });
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-1710556888, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda44
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 13;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object obj4 = null;
                u3 u3Var = (u3) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i3 != 0) {
                    t5.writeTypedObject(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    obj4.hashCode();
                    throw null;
                }
                Unit unitWriteTypedObject = t5.writeTypedObject(u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i4 = onExtraCallbackWithResult + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitWriteTypedObject;
                }
                obj4.hashCode();
                throw null;
            }
        });
        int i = onVerticalScrollEvent + 103;
        onGreatestScrollPercentageIncreased = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    private static final Unit requestPostMessageChannel(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = IEngagementSignalsCallbackStub + 79;
            onSessionEnded = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onSessionEnded + 33;
                IEngagementSignalsCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1980190043, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1980190043.<anonymous> (TdsBottomCtaV1.kt:935)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1980190043, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1980190043.<anonymous> (TdsBottomCtaV1.kt:935)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IEngagementSignalsCallbackStub + 97;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onSessionEnded + 93;
            IEngagementSignalsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onUnminimized(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onSessionEnded + 37;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                i3 = 2;
            } else {
                int i7 = onSessionEnded + 15;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1716449493, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1716449493.<anonymous> (TdsBottomCtaV1.kt:940)");
            }
            u3Var.onWarmupCompleted("추가 설명", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 458752) | 6, 30);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = IEngagementSignalsCallbackStub + 3;
                onSessionEnded = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit isEngagementSignalsApiAvailable(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i4 = onSessionEnded + 13;
            IEngagementSignalsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = IEngagementSignalsCallbackStub + 101;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-498169876, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-498169876.<anonymous> (TdsBottomCtaV1.kt:943)");
            }
            u3Var.IAuthTabCallback("버튼레이블", null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, 0L, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 390, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IEngagementSignalsCallbackStub + 91;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i5 = IEngagementSignalsCallbackStub + 79;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = IEngagementSignalsCallbackStub + 61;
            onSessionEnded = i7 % 128;
            z = i7 % 2 != 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IEngagementSignalsCallbackStub + 103;
                onSessionEnded = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1286081518, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1286081518.<anonymous> (TdsBottomCtaV1.kt:927)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            u1.IAuthTabCallback(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), null, writeTypedObject, null, null, null, IAuthTabCallbackStubProxy, onMessageChannelReady, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 819462528, 0, 3386);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback_Parcel(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            int i4 = IEngagementSignalsCallbackStub + 83;
            onSessionEnded = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = IEngagementSignalsCallbackStub + 73;
            onSessionEnded = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2056438923, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$2056438923.<anonymous> (TdsBottomCtaV1.kt:968)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onSessionEnded + 93;
                IEngagementSignalsCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = 3 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStubProxy(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onSessionEnded + 91;
                IEngagementSignalsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onSessionEnded + 103;
            IEngagementSignalsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = IEngagementSignalsCallbackStub + 95;
            onSessionEnded = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onSessionEnded + 103;
                IEngagementSignalsCallbackStub = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(198030861, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$198030861.<anonymous> (TdsBottomCtaV1.kt:973)");
                int i13 = onSessionEnded + 61;
                IEngagementSignalsCallbackStub = i13 % 128;
                int i14 = i13 % 2;
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCommand(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i5 = IEngagementSignalsCallbackStub + 43;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i7 = IEngagementSignalsCallbackStub + 49;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i9 = onSessionEnded + 111;
            IEngagementSignalsCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1974787823, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1974787823.<anonymous> (TdsBottomCtaV1.kt:978)");
            }
            u3Var.onWarmupCompleted("추가 설명", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 458752) | 6, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onSessionEnded + 107;
                IEngagementSignalsCallbackStub = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit mayLaunchUrl(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i5 = IEngagementSignalsCallbackStub + 45;
            onSessionEnded = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-756508206, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-756508206.<anonymous> (TdsBottomCtaV1.kt:981)");
            }
            u3Var.IAuthTabCallback("버튼레이블", null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, 0L, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 390, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onSessionEnded + 49;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                i3 = 2;
            } else {
                int i5 = onSessionEnded + 97;
                IEngagementSignalsCallbackStub = i5 % 128;
                i3 = 4;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 5;
                }
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onSessionEnded + 93;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1544419848, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1544419848.<anonymous> (TdsBottomCtaV1.kt:960)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnWarmupCompleted = QuirkSettingsLoader.Companion.onWarmupCompleted();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnWarmupCompleted, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i9 = IEngagementSignalsCallbackStub + 13;
                onSessionEnded = i9 % 128;
                int i10 = i9 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            u1.IAuthTabCallback(null, null, receiveFile, null, prefetchWithMultipleUrls, null, extraCallbackWithResult, onUnminimized, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 14180736, 0, 3883);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit extraCommand(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onSessionEnded + 27;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 39) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = onSessionEnded + 87;
            IEngagementSignalsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = IEngagementSignalsCallbackStub + 21;
            onSessionEnded = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = onSessionEnded + 29;
            IEngagementSignalsCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(984265268, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$984265268.<anonymous> (TdsBottomCtaV1.kt:1003)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit updateVisuals(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IEngagementSignalsCallbackStub + 79;
            onSessionEnded = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IEngagementSignalsCallbackStub + 75;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-981721486, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-981721486.<anonymous> (TdsBottomCtaV1.kt:1009)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IEngagementSignalsCallbackStub + 7;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMinimized(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i4 = IEngagementSignalsCallbackStub + 97;
            onSessionEnded = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = IEngagementSignalsCallbackStub + 61;
            onSessionEnded = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onSessionEnded + 87;
            IEngagementSignalsCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onSessionEnded + 33;
                IEngagementSignalsCallbackStub = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1927180014, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1927180014.<anonymous> (TdsBottomCtaV1.kt:1011)");
                    int i11 = 40 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1927180014, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1927180014.<anonymous> (TdsBottomCtaV1.kt:1011)");
                }
            }
            u3Var.onWarmupCompleted("추가 설명", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 15) & 458752) | 6, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        boolean z = false;
        u3 u3Var = (u3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 6) == 0) {
            int i2 = onSessionEnded + 119;
            IEngagementSignalsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2;
            int i4 = onSessionEnded + 67;
            IEngagementSignalsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = IEngagementSignalsCallbackStub + 23;
            onSessionEnded = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = IEngagementSignalsCallbackStub + 23;
            onSessionEnded = i8 % 128;
            int i9 = i8 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i10 = onSessionEnded + 33;
            IEngagementSignalsCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = IEngagementSignalsCallbackStub + 73;
                onSessionEnded = i12 % 128;
                if (i12 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(944186637, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$944186637.<anonymous> (TdsBottomCtaV1.kt:1014)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(944186637, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$944186637.<anonymous> (TdsBottomCtaV1.kt:1014)");
            }
            u3Var.IAuthTabCallback("버튼레이블", null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, 0L, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 390, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IEngagementSignalsCallbackStub + 101;
                onSessionEnded = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i15 = onSessionEnded + 67;
                IEngagementSignalsCallbackStub = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onUnminimized(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 17) != 16) {
            int i3 = IEngagementSignalsCallbackStub + 75;
            onSessionEnded = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onSessionEnded + 63;
            IEngagementSignalsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IEngagementSignalsCallbackStub + 63;
                onSessionEnded = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1411678557, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1411678557.<anonymous> (TdsBottomCtaV1.kt:1028)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1411678557, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1411678557.<anonymous> (TdsBottomCtaV1.kt:1028)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onRelationshipValidationResult(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onSessionEnded + 39;
        IEngagementSignalsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i7 = onSessionEnded + 43;
            IEngagementSignalsCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 83 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i9 = onSessionEnded + 105;
                    IEngagementSignalsCallbackStub = i9 % 128;
                    i3 = i9 % 2 != 0 ? 5 : 4;
                } else {
                    i3 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
            int i10 = onSessionEnded + 125;
            IEngagementSignalsCallbackStub = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1884018203, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1884018203.<anonymous> (TdsBottomCtaV1.kt:1030)");
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallback(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = IEngagementSignalsCallbackStub + 103;
        onSessionEnded = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i7 = IEngagementSignalsCallbackStub + 15;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i9 = IEngagementSignalsCallbackStub + 15;
            onSessionEnded = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i11 = onSessionEnded + 25;
            IEngagementSignalsCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i13 = onSessionEnded + 95;
            IEngagementSignalsCallbackStub = i13 % 128;
            if (i13 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1314650007, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1314650007.<anonymous> (TdsBottomCtaV1.kt:1035)");
            }
            u3Var.onWarmupCompleted("추가 설명", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 458752) | 6, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i14 = onSessionEnded + 1;
            IEngagementSignalsCallbackStub = i14 % 128;
            int i15 = i14 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i16 = onSessionEnded + 109;
        IEngagementSignalsCallbackStub = i16 % 128;
        int i17 = i16 % 2;
        return unit;
    }

    private static final Unit onMessageChannelReady(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i5 = IEngagementSignalsCallbackStub + 23;
                int i6 = i5 % 128;
                onSessionEnded = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 73;
                IEngagementSignalsCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i10 = IEngagementSignalsCallbackStub + 51;
            onSessionEnded = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1550819830, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1550819830.<anonymous> (TdsBottomCtaV1.kt:1038)");
            }
            u3Var.IAuthTabCallback("버튼레이블", null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, 0L, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 390, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = IEngagementSignalsCallbackStub + 15;
                onSessionEnded = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        boolean z;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onSessionEnded + 33;
        IEngagementSignalsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue & 6) == 0) {
            int i4 = IEngagementSignalsCallbackStub + 107;
            onSessionEnded = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                throw null;
            }
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = IEngagementSignalsCallbackStub + 87;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i7 = onSessionEnded + 13;
            IEngagementSignalsCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(678716369, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$678716369.<anonymous> (TdsBottomCtaV1.kt:1053)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnWarmupCompleted = QuirkSettingsLoader.Companion.onWarmupCompleted();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnWarmupCompleted, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = IEngagementSignalsCallbackStub + 53;
                onSessionEnded = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            t7ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallback("테스트", null, null, null, 0L, false, false, false, null, cameraCaptureResultEmptyCameraCaptureResult, 805306374, 510);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newSessionWithExtras(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = IEngagementSignalsCallbackStub + 55;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
            int i7 = IEngagementSignalsCallbackStub + 79;
            onSessionEnded = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1150498739, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1150498739.<anonymous> (TdsBottomCtaV1.kt:1078)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IEngagementSignalsCallbackStub + 7;
                onSessionEnded = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newAuthTabSession(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i4 = IEngagementSignalsCallbackStub + 3;
            onSessionEnded = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i6 = onSessionEnded + 105;
                IEngagementSignalsCallbackStub = i6 % 128;
                i2 = i6 % 2 != 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-835390746, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-835390746.<anonymous> (TdsBottomCtaV1.kt:1083)");
            }
            u3Var.onExtraCallback("버튼레이블", oExternalSyntheticLambda0.onExtraCallback.Companion.IAuthTabCallback(), null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 3126, 116);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onSessionEnded + 95;
            IEngagementSignalsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IEngagementSignalsCallbackStub + 47;
        onSessionEnded = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IEngagementSignalsCallbackStub + 119;
        onSessionEnded = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 15) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1441517952, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1441517952.<anonymous> (TdsBottomCtaV1.kt:1070)");
                int i5 = onSessionEnded + 67;
                IEngagementSignalsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
            QuirkSettingsLoader quirkSettingsLoaderOnWarmupCompleted = QuirkSettingsLoader.Companion.onWarmupCompleted();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnWarmupCompleted, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onSessionEnded + 99;
                IEngagementSignalsCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    int i8 = 64 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            u1.IAuthTabCallback(null, null, onExtraCallbackWithResult, null, null, null, null, ICustomTabsCallbackStubProxy, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12583296, 0, 3963);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit mayLaunchUrl(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = onSessionEnded + 63;
            IEngagementSignalsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            int i6 = onSessionEnded + 55;
            IEngagementSignalsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i8 = IEngagementSignalsCallbackStub + 125;
            onSessionEnded = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(928557104, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$928557104.<anonymous> (TdsBottomCtaV1.kt:1108)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onSessionEnded + 7;
                IEngagementSignalsCallbackStub = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallbackStub(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 89;
        onSessionEnded = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u3Var, "");
            z = (i & 77) != 15;
        } else {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = IEngagementSignalsCallbackStub + 91;
            onSessionEnded = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(980155190, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$980155190.<anonymous> (TdsBottomCtaV1.kt:1118)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"추가 설명", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IEngagementSignalsCallbackStub + 7;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit prefetch(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IEngagementSignalsCallbackStub + 85;
            onSessionEnded = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-779204681, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-779204681.<anonymous> (TdsBottomCtaV1.kt:1121)");
                int i5 = IEngagementSignalsCallbackStub + 103;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
            }
            oExternalSyntheticLambda1.IAuthTabCallback("버튼레이블", (QuirksExternalSyntheticBackport0) null, 0L, oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) null, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 27654, 0, 262118);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IEngagementSignalsCallbackStub + 15;
        onSessionEnded = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsServiceStub(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IEngagementSignalsCallbackStub + 51;
        onSessionEnded = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 87) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = onSessionEnded + 93;
            IEngagementSignalsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onSessionEnded + 45;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-300710810, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-300710810.<anonymous> (TdsBottomCtaV1.kt:1146)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit postMessage(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onSessionEnded + 71;
                IEngagementSignalsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = IEngagementSignalsCallbackStub + 3;
            int i8 = i7 % 128;
            onSessionEnded = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 109;
            IEngagementSignalsCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onSessionEnded + 121;
                IEngagementSignalsCallbackStub = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1416678936, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1416678936.<anonymous> (TdsBottomCtaV1.kt:1151)");
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = IEngagementSignalsCallbackStub + 7;
                onSessionEnded = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onActivityResized(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IEngagementSignalsCallbackStub + 5;
        onSessionEnded = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 17) != 16) {
            int i5 = onSessionEnded + 19;
            IEngagementSignalsCallbackStub = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(261140620, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$261140620.<anonymous> (TdsBottomCtaV1.kt:1157)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"추가 설명", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newSession(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i4 = IEngagementSignalsCallbackStub + 123;
            onSessionEnded = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i6 = onSessionEnded + 39;
                IEngagementSignalsCallbackStub = i6 % 128;
                i2 = i6 % 2 != 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i7 = onSessionEnded + 31;
            IEngagementSignalsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i9 = IEngagementSignalsCallbackStub + 105;
            onSessionEnded = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-763489044, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-763489044.<anonymous> (TdsBottomCtaV1.kt:1156)");
            }
            u3Var.onWarmupCompleted(null, setEngagementSignalsCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IEngagementSignalsCallbackStub + 35;
                onSessionEnded = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        boolean z = false;
        u3 u3Var = (u3) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 17) != 16) {
            int i2 = onSessionEnded + 1;
            IEngagementSignalsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = IEngagementSignalsCallbackStub + 81;
            onSessionEnded = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-296843443, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-296843443.<anonymous> (TdsBottomCtaV1.kt:1162)");
            }
            oExternalSyntheticLambda1.IAuthTabCallback("버튼레이블", (QuirksExternalSyntheticBackport0) null, 0L, oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) null, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 27654, 0, 262118);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IEngagementSignalsCallbackStub + 23;
                onSessionEnded = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onRelationshipValidationResult(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i4 = IEngagementSignalsCallbackStub + 7;
                onSessionEnded = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = IEngagementSignalsCallbackStub + 115;
            onSessionEnded = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = IEngagementSignalsCallbackStub + 71;
            onSessionEnded = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1321473107, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1321473107.<anonymous> (TdsBottomCtaV1.kt:1161)");
            }
            u3Var.onWarmupCompleted(null, onActivityResized, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onSessionEnded + 7;
        IEngagementSignalsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = IEngagementSignalsCallbackStub + 5;
            onSessionEnded = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-215725101, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-215725101.<anonymous> (TdsBottomCtaV1.kt:1138)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnWarmupCompleted = QuirkSettingsLoader.Companion.onWarmupCompleted();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnWarmupCompleted, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = IEngagementSignalsCallbackStub + 31;
                onSessionEnded = i8 % 128;
                if (i8 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    int i9 = 56 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i10 = onSessionEnded + 21;
                IEngagementSignalsCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                int i12 = onSessionEnded + 95;
                IEngagementSignalsCallbackStub = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 2 / 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            u1.IAuthTabCallback(null, null, onActivityLayout, null, asBinder, null, onRelationshipValidationResult, onTransact, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 14180736, 0, 3883);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit setEngagementSignalsCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = onSessionEnded + 53;
            IEngagementSignalsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = IEngagementSignalsCallbackStub + 53;
            onSessionEnded = i6 % 128;
            z = i6 % 2 != 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1910322472, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1910322472.<anonymous> (TdsBottomCtaV1.kt:1184)");
            }
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Block;
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2144919730 - TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getSize(0) + 1040911417, (-14749) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            u4Var.onNavigationEvent(((String) objArr[0]).intern(), null, null, null, null, null, null, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 12582918, i2 & 14, 894);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onSessionEnded + 41;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i;
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i = 4;
            } else {
                int i3 = onSessionEnded + 47;
                IEngagementSignalsCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                i = 2;
            }
            iIntValue |= i;
            int i5 = IEngagementSignalsCallbackStub + 113;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IEngagementSignalsCallbackStub + 65;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1890781350, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1890781350.<anonymous> (TdsBottomCtaV1.kt:1190)");
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 12582918, iIntValue & 14, 894);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onSessionEnded + 19;
        IEngagementSignalsCallbackStub = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit isEngagementSignalsApiAvailable(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = IEngagementSignalsCallbackStub + 99;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            } else {
                int i7 = onSessionEnded + 113;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = IEngagementSignalsCallbackStub + 123;
            onSessionEnded = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IEngagementSignalsCallbackStub + 119;
                onSessionEnded = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2136110159, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$2136110159.<anonymous> (TdsBottomCtaV1.kt:1199)");
            }
            Object[] objArr = new Object[1];
            a((short) ((-1) - TextUtils.lastIndexOf("", '0')), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), 2144919729 - TextUtils.lastIndexOf("", '0', 0, 0), 1040911418 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-14749) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            u4Var.onNavigationEvent(((String) objArr[0]).intern(), null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IEngagementSignalsCallbackStub + 97;
                onSessionEnded = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i14 = 38 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStub + 115;
        onSessionEnded = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i4 = IEngagementSignalsCallbackStub + 93;
            onSessionEnded = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IEngagementSignalsCallbackStub + 21;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-559708079, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-559708079.<anonymous> (TdsBottomCtaV1.kt:1204)");
            }
            u4Var.onNavigationEvent("동해물과 백두산이 마르고 닳도록", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, iIntValue & 14, 1022);
            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = IEngagementSignalsCallbackStub + 49;
                onSessionEnded = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 61 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i;
        boolean z = false;
        u4 u4Var = (u4) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i3 = IEngagementSignalsCallbackStub + 1;
            onSessionEnded = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = IEngagementSignalsCallbackStub + 87;
            onSessionEnded = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onSessionEnded + 123;
                IEngagementSignalsCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1251374352, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1251374352.<anonymous> (TdsBottomCtaV1.kt:1212)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1251374352, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1251374352.<anonymous> (TdsBottomCtaV1.kt:1212)");
            }
            u4Var.onNavigationEvent("동해물과 백두산이 마르고 닳도록", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, iIntValue & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i = onSessionEnded + 105;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i = onSessionEnded + 7;
        IEngagementSignalsCallbackStub = i % 128;
        int i7 = i % 2;
        return Unit.INSTANCE;
    }

    private static final Unit prefetch(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1444443886, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1444443886.<anonymous> (TdsBottomCtaV1.kt:1217)");
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IEngagementSignalsCallbackStub + 41;
                onSessionEnded = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IEngagementSignalsCallbackStub + 69;
        onSessionEnded = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsService(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i3 = 2;
            } else {
                int i5 = onSessionEnded + 75;
                IEngagementSignalsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = IEngagementSignalsCallbackStub + 73;
            onSessionEnded = i7 % 128;
            z = i7 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = IEngagementSignalsCallbackStub + 57;
            onSessionEnded = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IEngagementSignalsCallbackStub + 11;
                onSessionEnded = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(366638545, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$366638545.<anonymous> (TdsBottomCtaV1.kt:1225)");
            }
            u4Var.onNavigationEvent("동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallbackStub(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = onSessionEnded + 83;
            IEngagementSignalsCallbackStub = i4 % 128;
            z = i4 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1965787603, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$1965787603.<anonymous> (TdsBottomCtaV1.kt:1230)");
            }
            u4Var.onNavigationEvent("동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onSessionEnded + 19;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newSession(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IEngagementSignalsCallbackStub + 91;
        onSessionEnded = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 46) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = onSessionEnded + 85;
            IEngagementSignalsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1047271069, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1047271069.<anonymous> (TdsBottomCtaV1.kt:1264)");
                int i7 = IEngagementSignalsCallbackStub + 99;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = IEngagementSignalsCallbackStub + 121;
            onSessionEnded = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newAuthTabSession(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onSessionEnded + 11;
        IEngagementSignalsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 1) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = IEngagementSignalsCallbackStub + 29;
            onSessionEnded = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1295239263, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1295239263.<anonymous> (TdsBottomCtaV1.kt:1269)");
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IEngagementSignalsCallbackStub + 125;
                onSessionEnded = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onPostMessage(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i4 = IEngagementSignalsCallbackStub + 125;
            onSessionEnded = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var);
                throw null;
            }
            i2 = i | (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ^ true) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = IEngagementSignalsCallbackStub + 77;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onSessionEnded + 99;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(302271517, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$302271517.<anonymous> (TdsBottomCtaV1.kt:1274)");
            }
            u3Var.onWarmupCompleted("추가 설명", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 458752) | 6, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onSessionEnded + 35;
                IEngagementSignalsCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i10 = IEngagementSignalsCallbackStub + 49;
        onSessionEnded = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback_Parcel(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onSessionEnded + 47;
        IEngagementSignalsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i5 = IEngagementSignalsCallbackStub + 105;
            onSessionEnded = i5 % 128;
            int i6 = i5 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2;
            int i7 = onSessionEnded + 83;
            IEngagementSignalsCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1969196228, i, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1969196228.<anonymous> (TdsBottomCtaV1.kt:1277)");
            }
            u3Var.IAuthTabCallback("버튼레이블", null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, 0L, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 390, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = onSessionEnded + 29;
        IEngagementSignalsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i2 & 125) == 0) {
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16);
            } else {
                i3 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i2 & 48) == 0) {
            }
        }
        if ((i3 & 145) != 144) {
            int i6 = onSessionEnded + 71;
            IEngagementSignalsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = IEngagementSignalsCallbackStub + 57;
            onSessionEnded = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IEngagementSignalsCallbackStub + 115;
                onSessionEnded = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1121279458, i3, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1121279458.<anonymous> (TdsBottomCtaV1.kt:1301)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1930135131, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 107;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 == 0) {
                        return (Unit) t5.onExtraCallback(new Object[]{Integer.valueOf(i), (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 1754032443, -1754032431, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit requestPostMessageChannelWithExtras(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = IEngagementSignalsCallbackStub + 69;
                onSessionEnded = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1602681905, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1602681905.<anonymous> (TdsBottomCtaV1.kt:1309)");
            }
            u4Var.onNavigationEvent("추천할게요", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = IEngagementSignalsCallbackStub + 93;
                onSessionEnded = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit prefetchWithMultipleUrls(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onSessionEnded + 87;
                IEngagementSignalsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onSessionEnded + 5;
                IEngagementSignalsCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2075917555, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-2075917555.<anonymous> (TdsBottomCtaV1.kt:1314)");
                    int i8 = 77 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2075917555, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-2075917555.<anonymous> (TdsBottomCtaV1.kt:1314)");
                }
            }
            u4Var.onNavigationEvent("닫기", null, null, null, null, null, null, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, i2 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IEngagementSignalsCallbackStub + 21;
                onSessionEnded = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStubProxy(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i6 = onSessionEnded + 75;
            IEngagementSignalsCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i7 = onSessionEnded + 53;
                IEngagementSignalsCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IEngagementSignalsCallbackStub + 113;
                onSessionEnded = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1473939063, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1473939063.<anonymous> (TdsBottomCtaV1.kt:1319)");
                int i11 = IEngagementSignalsCallbackStub + 61;
                onSessionEnded = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 4 / 4;
                }
            }
            u3Var.onWarmupCompleted("추가 설명", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 458752) | 6, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i3 = onSessionEnded + 51;
                IEngagementSignalsCallbackStub = i3 % 128;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i3 = IEngagementSignalsCallbackStub + 125;
        onSessionEnded = i3 % 128;
        int i13 = i3 % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallbackDefault(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IEngagementSignalsCallbackStub + 11;
        onSessionEnded = i5 % 128;
        boolean z = false;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 41) == 0) {
                int i6 = IEngagementSignalsCallbackStub + 123;
                onSessionEnded = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i8 = IEngagementSignalsCallbackStub + 45;
            onSessionEnded = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1710556888, i3, -1, "im.toss.tds.compose.component.compound.bottomcta.ComposableSingletons$TdsBottomCtaV1Kt.lambda$-1710556888.<anonymous> (TdsBottomCtaV1.kt:1322)");
            }
            u3Var.IAuthTabCallback("버튼레이블", null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), null, 0L, false, null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 390, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onSessionEnded + 37;
                IEngagementSignalsCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -535877011, 535877013, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -651229167, 651229171, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 794952986, -794952970, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 789085343, -789085322, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onTransact(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1218927446, -1218927436, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 1754032443, -1754032431, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit extraCallbackWithResult(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1308866602, -1308866601, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit ICustomTabsCallback(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1665839765, 1665839770, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onPostMessage(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1571328059, -1571328053, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit ICustomTabsCallbackDefault(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1615852831, -1615852818, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit IAuthTabCallbackDefault(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -530928621, 530928624, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onActivityLayout(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -653995284, 653995304, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 1903403580, -1903403566, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit receiveFile(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1614038576, -1614038569, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit access100(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -229683429, 229683447, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit ICustomTabsService(u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 743137683, -743137658, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit ICustomTabsServiceDefault(u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 240018495, -240018471, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, -1216242071, 1216242090, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, 2135781442, -2135781434, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, -1282613669, 1282613692, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, 1677231245, -1677231228, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, 1425670835, -1425670824, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, 1921663358, -1921663358, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, 1916108172, -1916108163, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, -677864692, 677864707, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final getBacktraceNote<u3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy() {
        return (getBacktraceNote) onExtraCallback(new Object[]{this}, 1467967318, -1467967296, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    static void ICustomTabsService() {
        writeTypedList = 610322246;
        IEngagementSignalsCallback = -1538793065;
        ICustomTabsService_Parcel = 1706168852;
        IEngagementSignalsCallbackDefault = new short[]{10539, -10232};
    }
}
