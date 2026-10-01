package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowScope;
import com.initech.pkix.cmp.client.CMPException;
import com.otaliastudios.cameraview.R$styleable;
import im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt$;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BackgroundModeProxy {
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback_Parcel;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceDefault;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStub;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStubProxy;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService_Parcel;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallback;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackDefault;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackStub;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackStubProxy;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallback_Parcel;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageService;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceDefault;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceStub;
    private static long IPostMessageServiceStubProxy;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageService_Parcel;
    private static int ITrustedWebActivityCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackDefault;
    private static char ITrustedWebActivityCallbackStub;
    private static int ITrustedWebActivityService;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access200;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCommand;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> isEngagementSignalsApiAvailable;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newAuthTabSession;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSession;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSessionWithExtras;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onGreatestScrollPercentageIncreased;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized;
    public static final BackgroundModeProxy onNavigationEvent;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onSessionEnded;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onVerticalScrollEvent;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> postMessage;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetch;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetchWithMultipleUrls;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> receiveFile;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannel;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannelWithExtras;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> setEngagementSignalsCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> updateVisuals;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> validateRelationship;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> warmup;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedList;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;
    private static final byte[] $$a = {44, 39, 61, 29};
    private static final int $$b = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int areNotificationsEnabled = 0;
    private static int ITrustedWebActivityCallback_Parcel = 0;
    private static int cancelNotification = 1;

    private static String $$c(byte b, int i, short s) {
        int i2 = (i * 2) + 4;
        int i3 = b * 4;
        byte[] bArr = $$a;
        int i4 = s + CMPException.METHOD_checkPKIStatusInfo;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + (-i4);
        }
        while (true) {
            int i7 = i4;
            int i8 = i2;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = i8 + 1;
            i4 = i7 + (-bArr[i8]);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel;
        int i3 = i2 + 93;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = getInterfaceDescriptor;
            int i4 = 4 / 0;
        } else {
            getbacktracenote = getInterfaceDescriptor;
        }
        int i5 = i2 + 25;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 19;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1433798270, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback4, -1433798240, iOnExtraCallback3);
        int i5 = ITrustedWebActivityCallback_Parcel + 89;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 93;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 25;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitMayLaunchUrl;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 39;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -447266806, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 447266822, iOnExtraCallback);
        int i5 = ITrustedWebActivityCallback_Parcel + 13;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 31;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPostMessage = postMessage(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 85;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return unitPostMessage;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 1;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPostMessage = postMessage(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = cancelNotification + 23;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return unitPostMessage;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 67;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 105;
        cancelNotification = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return unitIEngagementSignalsCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 15;
        cancelNotification = i3 % 128;
        if (i3 % 2 != 0) {
            return prefetch(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        prefetch(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 19;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            ITrustedWebActivityCallbackStub(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = cancelNotification + 19;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unitITrustedWebActivityCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 17;
        cancelNotification = i3 % 128;
        if (i3 % 2 != 0) {
            return prefetchWithMultipleUrls(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        prefetchWithMultipleUrls(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 27;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            ICustomTabsServiceDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityCallback_Parcel + 43;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsServiceDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 113;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 26 / 0;
        }
        int i6 = ITrustedWebActivityCallback_Parcel + 53;
        cancelNotification = i6 % 128;
        int i7 = i6 % 2;
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 63;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            ICustomTabsCallback_Parcel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = cancelNotification + 93;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback_Parcel;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 57;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsServiceStubProxy;
        int i4 = i2 + 9;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 101;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1748159433, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1748159437, iOnExtraCallback);
        int i5 = ITrustedWebActivityCallback_Parcel + 49;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 31;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return unitIEngagementSignalsCallbackStub;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 7;
        cancelNotification = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -773743897, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 773743899, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = ITrustedWebActivityCallback_Parcel + 1;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 107;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -724179650, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 724179669, iOnExtraCallback);
        int i5 = ITrustedWebActivityCallback_Parcel + 71;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 33;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            prefetchWithMultipleUrls(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityCallback_Parcel + 39;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        return unitPrefetchWithMultipleUrls;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 43;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = ITrustedWebActivityCallback_Parcel + 35;
        cancelNotification = i6 % 128;
        if (i6 % 2 != 0) {
            return unitNewAuthTabSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallback_Parcel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 115;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -845868147, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 845868150, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i5 = ITrustedWebActivityCallback_Parcel + 51;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 19;
        cancelNotification = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit access000(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 123;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 83;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIsEngagementSignalsApiAvailable;
        }
        throw null;
    }

    public static /* synthetic */ Unit access100(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 95;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPrefetch = prefetch(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 51;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unitPrefetch;
        }
        throw null;
    }

    public static /* synthetic */ Unit access100(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 65;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1534482239, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1534482264, iOnExtraCallback);
        int i5 = cancelNotification + 109;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel;
        int i3 = i2 + 33;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallbackStub;
        int i4 = i2 + 17;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 105;
        cancelNotification = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            updateVisuals(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitUpdateVisuals = updateVisuals(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityCallback_Parcel + 65;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return unitUpdateVisuals;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 39;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityCallback_Parcel + 97;
        cancelNotification = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return unitICustomTabsServiceDefault;
    }

    public static /* synthetic */ Unit asInterface(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 69;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnVerticalScrollEvent = onVerticalScrollEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 93;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnVerticalScrollEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit asInterface(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 97;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = cancelNotification + 85;
        ITrustedWebActivityCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unitRequestPostMessageChannel;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 11;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedList = writeTypedList(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = ITrustedWebActivityCallback_Parcel + 35;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return unitWriteTypedList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 29;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 87;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return engagementSignalsCallback;
    }

    public static /* synthetic */ Unit extraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 3;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            newSession(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitNewSession = newSession(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = cancelNotification + 91;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitNewSession;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 7;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = cancelNotification + 31;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitNewSessionWithExtras;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 89;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return IPostMessageServiceDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IPostMessageServiceDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 45;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            newSessionWithExtras(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitNewSessionWithExtras = newSessionWithExtras(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityCallback_Parcel + 65;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        return unitNewSessionWithExtras;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 13;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageService_Parcel = IPostMessageService_Parcel(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = cancelNotification + 35;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIPostMessageService_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 53;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess200 = access200(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 63;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return unitAccess200;
    }

    public static /* synthetic */ Unit isEngagementSignalsApiAvailable(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 47;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return ITrustedWebActivityCallbackStubProxy(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ITrustedWebActivityCallbackStubProxy(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit mayLaunchUrl(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 77;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 105;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unitRequestPostMessageChannel;
        }
        throw null;
    }

    public static /* synthetic */ Unit newAuthTabSession(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 45;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 19;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unitIEngagementSignalsCallback;
    }

    public static /* synthetic */ Unit newSession(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 101;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return ICustomTabsServiceStubProxy(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ICustomTabsServiceStubProxy(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 9;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsService_Parcel(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = cancelNotification + 7;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return unitICustomTabsService_Parcel;
    }

    public static /* synthetic */ Unit onActivityLayout(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 97;
        cancelNotification = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            writeTypedList(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitWriteTypedList = writeTypedList(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = cancelNotification + 53;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitWriteTypedList;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityResized(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 7;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitCancelNotification = cancelNotification(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 33;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitCancelNotification;
    }

    public static /* synthetic */ Unit onActivityResized(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 85;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 597841477, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -597841462, iOnExtraCallback);
        int i5 = ITrustedWebActivityCallback_Parcel + 37;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 117;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIPostMessageServiceStub = IPostMessageServiceStub(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = cancelNotification + 19;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return unitIPostMessageServiceStub;
    }

    public static /* synthetic */ Unit onExtraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 73;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIPostMessageServiceStubProxy = IPostMessageServiceStubProxy(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        return unitIPostMessageServiceStubProxy;
    }

    public static /* synthetic */ Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 1;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 495483406, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -495483382, iOnExtraCallback);
        int i5 = cancelNotification + 21;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i6);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i2 | i6)) | i10;
        int i13 = (~(i6 | i2 | i5)) | (~(i8 | (~i5)));
        int i14 = i2 + i5 + i4 + ((-2005657349) * i) + (1476006321 * i3);
        int i15 = i14 * i14;
        int i16 = (i2 * 961754349) + 784684277 + (i5 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (961754313 * i4) + ((-1264871149) * i) + (72538105 * i3) + (i15 * 798621696);
        switch (((583353605 * i2) - 1319501824) + (407026429 * i5) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i4) + ((-798228480) * i) + ((-1404829696) * i3) + ((-1043726336) * i15) + (i16 * i16 * (-1437204480))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                w5a w5aVar = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(w5aVar, "");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ^ true ? 2 : 4;
                }
                if ((iIntValue & 19) != 18) {
                    z = true;
                } else {
                    int i18 = cancelNotification + 95;
                    ITrustedWebActivityCallback_Parcel = i18 % 128;
                    int i19 = i18 % 2;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i20 = ITrustedWebActivityCallback_Parcel + 1;
                        cancelNotification = i20 % 128;
                        int i21 = i20 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-301482183, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-301482183.<anonymous> (CreditTestActivity.kt:298)");
                        int i22 = cancelNotification + 43;
                        ITrustedWebActivityCallback_Parcel = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    w5aVar.IAuthTabCallback(validateRelationship, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                w5a w5aVar2 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i24 = 2 % 2;
                Intrinsics.checkNotNullParameter(w5aVar2, "");
                if ((iIntValue2 & 6) == 0) {
                    int i25 = cancelNotification + 25;
                    ITrustedWebActivityCallback_Parcel = i25 % 128;
                    int i26 = i25 % 2;
                    iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(w5aVar2) ? 4 : 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    int i27 = ITrustedWebActivityCallback_Parcel + 69;
                    cancelNotification = i27 % 128;
                    int i28 = i27 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-700194950, iIntValue2, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-700194950.<anonymous> (CreditTestActivity.kt:312)");
                    }
                    w5aVar2.IAuthTabCallback(newAuthTabSession, cameraCaptureResultEmptyCameraCaptureResult2, ((iIntValue2 << 3) & 112) | 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return access100(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return readTypedObject(objArr);
            case 18:
                return ICustomTabsCallback(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                return extraCallback(objArr);
            case 21:
                return extraCallbackWithResult(objArr);
            case 22:
                return onActivityLayout(objArr);
            case 23:
                return onMinimized(objArr);
            case 24:
                return onActivityResized(objArr);
            case 25:
                w5a w5aVar3 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i29 = 2 % 2;
                int i30 = cancelNotification + 5;
                ITrustedWebActivityCallback_Parcel = i30 % 128;
                if (i30 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(w5aVar3, "");
                    if ((iIntValue3 & 20) == 0) {
                        iIntValue3 |= cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(w5aVar3) ? 4 : 2;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(w5aVar3, "");
                    if ((iIntValue3 & 6) == 0) {
                    }
                }
                if ((iIntValue3 & 19) != 18) {
                    z = true;
                } else {
                    int i31 = cancelNotification + 97;
                    ITrustedWebActivityCallback_Parcel = i31 % 128;
                    int i32 = i31 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z, iIntValue3 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-704847811, iIntValue3, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-704847811.<anonymous> (CreditTestActivity.kt:186)");
                    }
                    w5aVar3.IAuthTabCallback(writeTypedObject, cameraCaptureResultEmptyCameraCaptureResult3, ((iIntValue3 << 3) & 112) | 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onMessageChannelReady(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                RowScope rowScope = (RowScope) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i33 = 2 % 2;
                int i34 = ITrustedWebActivityCallback_Parcel + 23;
                cancelNotification = i34 % 128;
                int i35 = i34 % 2;
                Intrinsics.checkNotNullParameter(rowScope, "");
                if (!cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-535209875, iIntValue4, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-535209875.<anonymous> (CreditTestActivity.kt:143)");
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"신용 점수 가짜로 설정하기", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult4, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i36 = cancelNotification + 111;
                        ITrustedWebActivityCallback_Parcel = i36 % 128;
                        int i37 = i36 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 29:
                return ICustomTabsCallbackDefault(objArr);
            case 30:
                return ICustomTabsCallbackStubProxy(objArr);
            case 31:
                return onUnminimized(objArr);
            case 32:
                w5a w5aVar4 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int i38 = 2 % 2;
                int i39 = ITrustedWebActivityCallback_Parcel + 3;
                cancelNotification = i39 % 128;
                int i40 = i39 % 2;
                Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(w5aVar4, cameraCaptureResultEmptyCameraCaptureResult5, iIntValue5);
                int i41 = ITrustedWebActivityCallback_Parcel + 15;
                cancelNotification = i41 % 128;
                int i42 = i41 % 2;
                return unitIEngagementSignalsCallback;
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 87;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = extraCallbackWithResult;
            int i4 = 6 / 0;
        } else {
            getbacktracenote = extraCallbackWithResult;
        }
        int i5 = i2 + 19;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 15;
        cancelNotification = i3 % 128;
        if (i3 % 2 != 0) {
            return IEngagementSignalsCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IEngagementSignalsCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel;
        int i3 = i2 + 9;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = extraCommand;
        int i5 = i2 + 65;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public static /* synthetic */ Unit onMessageChannelReady(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 47;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 9;
        cancelNotification = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return unitIEngagementSignalsCallback_Parcel;
    }

    public static /* synthetic */ Unit onMessageChannelReady(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 37;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1796767682, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1796767691, iOnExtraCallback);
        int i5 = ITrustedWebActivityCallback_Parcel + 59;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 111;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityCallback_Parcel + 59;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceStub;
    }

    public static /* synthetic */ Unit onMinimized(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 85;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWarmup = warmup(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 45;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unitWarmup;
        }
        throw null;
    }

    public static /* synthetic */ Unit onMinimized(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 41;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
        int i6 = ITrustedWebActivityCallback_Parcel + 101;
        cancelNotification = i6 % 128;
        int i7 = i6 % 2;
        return unitICustomTabsService_Parcel;
    }

    public static /* synthetic */ Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 87;
        cancelNotification = i3 % 128;
        if (i3 % 2 != 0) {
            return ITrustedWebActivityCallbackDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ITrustedWebActivityCallbackDefault(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 61;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityCallback_Parcel + 39;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return engagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onPostMessage(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 49;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess200 = access200(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 27;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess200;
    }

    public static /* synthetic */ Unit onPostMessage(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 97;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 109;
        cancelNotification = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return unitRequestPostMessageChannelWithExtras;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 87;
        int i3 = i2 % 128;
        cancelNotification = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IEngagementSignalsCallbackStubProxy;
        int i5 = i3 + 79;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onTransact(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 17;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitValidateRelationship = validateRelationship(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 59;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return unitValidateRelationship;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 101;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWarmup = warmup(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 7;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return unitWarmup;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelNotification + 103;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallback_Parcel = ITrustedWebActivityCallback_Parcel(rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = cancelNotification + 31;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitITrustedWebActivityCallback_Parcel;
    }

    public static /* synthetic */ Unit onUnminimized(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 119;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 119;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitIEngagementSignalsCallbackStubProxy;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelNotification + 29;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback_Parcel = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStubProxy;
        int i5 = i3 + 45;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 5;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            onGreatestScrollPercentageIncreased(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityCallback_Parcel + 67;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        return unitOnGreatestScrollPercentageIncreased;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 83;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitValidateRelationship = validateRelationship(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 97;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return unitValidateRelationship;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 73;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onPostMessage;
        int i5 = i2 + 125;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit readTypedObject(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 109;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1783624028, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1783624000, iOnExtraCallback);
        int i5 = cancelNotification + 53;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit readTypedObject(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 103;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitUpdateVisuals = updateVisuals(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return unitUpdateVisuals;
    }

    public static /* synthetic */ Unit writeTypedObject(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 123;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnSessionEnded = onSessionEnded(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityCallback_Parcel + 87;
        cancelNotification = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return unitOnSessionEnded;
    }

    public static /* synthetic */ Unit writeTypedObject(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 39;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = cancelNotification + 77;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnRelationshipValidationResult;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 19;
        cancelNotification = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 87;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access000;
        int i5 = i2 + 15;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = cancelNotification + 99;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback_Parcel = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallbackDefault;
        int i5 = i3 + 117;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 5;
        int i3 = i2 % 128;
        cancelNotification = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallback_Parcel;
        int i4 = i3 + 21;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = cancelNotification + 49;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return warmup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = cancelNotification + 93;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = writeTypedList;
        int i4 = i3 + 97;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback_Parcel() {
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 9;
        int i3 = i2 % 128;
        cancelNotification = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = IEngagementSignalsCallbackDefault;
            int i4 = 66 / 0;
        } else {
            getbacktracenote = IEngagementSignalsCallbackDefault;
        }
        int i5 = i3 + 83;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 35;
        int i3 = i2 % 128;
        cancelNotification = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onActivityLayout;
        int i5 = i3 + 125;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        int i = 2 % 2;
        int i2 = cancelNotification + 87;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel;
        int i3 = i2 + 59;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = readTypedObject;
        int i5 = i2 + 99;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCommand() {
        int i = 2 % 2;
        int i2 = cancelNotification + 95;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IPostMessageServiceDefault;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 13;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IPostMessageService_Parcel;
        int i5 = i2 + 111;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 35;
        cancelNotification = i2 % 128;
        if (i2 % 2 != 0) {
            return onVerticalScrollEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout() {
        int i = 2 % 2;
        int i2 = cancelNotification + 121;
        ITrustedWebActivityCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return requestPostMessageChannel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 29;
        int i3 = i2 % 128;
        cancelNotification = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = newSession;
            int i4 = 19 / 0;
        } else {
            getbacktracenote = newSession;
        }
        int i5 = i3 + 27;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 35;
        int i3 = i2 % 128;
        cancelNotification = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i5 = i3 + 63;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 9;
        int i3 = i2 % 128;
        cancelNotification = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = updateVisuals;
        int i5 = i3 + 77;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 71;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = prefetchWithMultipleUrls;
            int i4 = 97 / 0;
        } else {
            getbacktracenote = prefetchWithMultipleUrls;
        }
        int i5 = i2 + 33;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 37;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access100;
        int i5 = i2 + 105;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage() {
        int i = 2 % 2;
        int i2 = cancelNotification;
        int i3 = i2 + 41;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = newSessionWithExtras;
        int i5 = i2 + 85;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = cancelNotification + 17;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback_Parcel = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IEngagementSignalsCallbackStub;
        int i4 = i3 + 125;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 103;
        int i3 = i2 % 128;
        cancelNotification = i3;
        int i4 = i2 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback_Parcel;
        int i5 = i3 + 113;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 65;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsServiceDefault;
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel;
        int i3 = i2 + 83;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = onWarmupCompleted;
            int i4 = 61 / 0;
        } else {
            getbacktracenote = onWarmupCompleted;
        }
        int i5 = i2 + 93;
        cancelNotification = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> postMessage() {
        int i = 2 % 2;
        int i2 = cancelNotification + 67;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ITrustedWebActivityCallbackDefault;
        int i4 = i3 + 77;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = cancelNotification + 113;
        int i3 = i2 % 128;
        ITrustedWebActivityCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            getbacktracenote = onUnminimized;
            int i4 = 4 / 0;
        } else {
            getbacktracenote = onUnminimized;
        }
        int i5 = i3 + 45;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel;
        int i3 = i2 + 117;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = mayLaunchUrl;
        int i5 = i2 + 85;
        cancelNotification = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
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
            int i5 = $10 + 97;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", i4, i4);
                    int iMyPid = 43 - (Process.myPid() >> 22);
                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1450;
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iMyPid, i7, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123);
                    int mode = 44 - View.MeasureSpec.getMode(i4);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1495;
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, mode, modifierMetaStateMask, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char cArgb = (char) (Color.argb(i4, i4, i4, i4) + 23972);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 51;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(i4) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iLastIndexOf, iNormalizeMetaState, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i9);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char minimumFlingVelocity = (char) (45848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i10 = 29 - (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1));
                    int iIndexOf = 12576 - TextUtils.indexOf((CharSequence) "", '0', i4);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, i10, iIndexOf, 1401536470, false, "l", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (ITrustedWebActivityCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IPostMessageServiceStubProxy ^ 7798559133331975163L))) ^ ((char) (ITrustedWebActivityCallbackStub ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i11 = $11 + 31;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 / 5;
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
        String str = new String(cArr6);
        int i13 = $11 + 45;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str;
    }

    static {
        ITrustedWebActivityService = 1;
        prefetch();
        onNavigationEvent = new BackgroundModeProxy();
        ICustomTabsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-535209875, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda0());
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-1740685500, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda11());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1086516572, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda22());
        IPostMessageService_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(92577723, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda33());
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-1485229339, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda44());
        onActivityResized = ForwardingCameraControl.onExtraCallbackWithResult(-306135044, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda55());
        writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1883942106, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda62());
        ICustomTabsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-704847811, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda63());
        ICustomTabsServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(2012312423, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda64());
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1103560578, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda65());
        setEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(1613599656, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda1());
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(-1502273345, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda2());
        prefetch = ForwardingCameraControl.onExtraCallbackWithResult(1214886889, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda3());
        extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1900986112, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda4());
        IPostMessageService = ForwardingCameraControl.onExtraCallbackWithResult(816174122, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda5());
        ICustomTabsServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(1995268417, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda6());
        onGreatestScrollPercentageIncreased = ForwardingCameraControl.onExtraCallbackWithResult(417461355, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda7());
        requestPostMessageChannel = ForwardingCameraControl.onExtraCallbackWithResult(1596555650, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda8());
        validateRelationship = ForwardingCameraControl.onExtraCallbackWithResult(1801300336, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda9());
        onActivityLayout = ForwardingCameraControl.onExtraCallbackWithResult(-301482183, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda10());
        newAuthTabSession = ForwardingCameraControl.onExtraCallbackWithResult(1402587569, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda12());
        ICustomTabsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-700194950, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda13());
        access200 = ForwardingCameraControl.onExtraCallbackWithResult(206449268, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda14());
        readTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1896333251, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda15());
        IEngagementSignalsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(736896596, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda16());
        IEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(2097366835, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda17());
        warmup = ForwardingCameraControl.onExtraCallbackWithResult(1999921278, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda18());
        onRelationshipValidationResult = ForwardingCameraControl.onExtraCallbackWithResult(-590976266, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda19());
        prefetchWithMultipleUrls = ForwardingCameraControl.onExtraCallbackWithResult(1601208511, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda20());
        isEngagementSignalsApiAvailable = ForwardingCameraControl.onExtraCallbackWithResult(-989689033, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda21());
        newSession = ForwardingCameraControl.onExtraCallbackWithResult(1202495744, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda23());
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-1388401800, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda24());
        IPostMessageServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(803782977, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda25());
        onVerticalScrollEvent = ForwardingCameraControl.onExtraCallbackWithResult(405070210, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda26());
        ICustomTabsServiceStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(223323928, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda27());
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-1438413521, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda28());
        ICustomTabsService = ForwardingCameraControl.onExtraCallbackWithResult(-77943282, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda29());
        extraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-175388839, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda30());
        receiveFile = ForwardingCameraControl.onExtraCallbackWithResult(1528680913, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda31());
        onUnminimized = ForwardingCameraControl.onExtraCallbackWithResult(-574101606, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda32());
        onSessionEnded = ForwardingCameraControl.onExtraCallbackWithResult(731255379, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda34());
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-1371527140, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda35());
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-1672794350, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda36());
        IPostMessageServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(862989940, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda37());
        onMessageChannelReady = ForwardingCameraControl.onExtraCallbackWithResult(-2071507117, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda38());
        writeTypedList = ForwardingCameraControl.onExtraCallbackWithResult(2126014622, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda39());
        onMinimized = ForwardingCameraControl.onExtraCallbackWithResult(-464882922, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda40());
        updateVisuals = ForwardingCameraControl.onExtraCallbackWithResult(1727301855, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda41());
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1262308456, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda42());
        ITrustedWebActivityCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(929876321, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda43());
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-1444054738, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda45());
        IEngagementSignalsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(748130039, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda46());
        ICustomTabsCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1842767505, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda47());
        IEngagementSignalsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(349417272, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda48());
        ICustomTabsService_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(2053487024, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda49());
        ICustomTabsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-49295495, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda50());
        requestPostMessageChannelWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(1654774257, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda51());
        onPostMessage = ForwardingCameraControl.onExtraCallbackWithResult(-448008262, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda52());
        postMessage = ForwardingCameraControl.onExtraCallbackWithResult(1256061490, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda53());
        extraCommand = ForwardingCameraControl.onExtraCallbackWithResult(-846721029, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda54());
        access000 = ForwardingCameraControl.onExtraCallbackWithResult(-1547644602, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda56());
        mayLaunchUrl = ForwardingCameraControl.onExtraCallbackWithResult(1123872509, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda57());
        newSessionWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(1387569534, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda58());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1289543650, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda59());
        getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(-149190059, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda60());
        IEngagementSignalsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(650384470, false, new ComposableSingletons$CreditTestActivityKt$.ExternalSyntheticLambda61());
        int i = areNotificationsEnabled + 37;
        ITrustedWebActivityService = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit validateRelationship(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = cancelNotification + 93;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 20) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i5 = ITrustedWebActivityCallback_Parcel + 111;
                    cancelNotification = i5 % 128;
                    i2 = i5 % 2 == 0 ? 5 : 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i6 = ITrustedWebActivityCallback_Parcel + 7;
            cancelNotification = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1740685500, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1740685500.<anonymous> (CreditTestActivity.kt:142)");
            }
            w5aVar.IAuthTabCallback(ICustomTabsCallbackStubProxy, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onGreatestScrollPercentageIncreased(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1086516572, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1086516572.<anonymous> (CreditTestActivity.kt:156)");
                int i3 = cancelNotification + 93;
                ITrustedWebActivityCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"NICE 특이 케이스 설정하기 (신용홈 테스트)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = cancelNotification + 83;
                ITrustedWebActivityCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
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
    private static final Unit setEngagementSignalsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = cancelNotification + 87;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
                i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = cancelNotification + 65;
            ITrustedWebActivityCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityCallback_Parcel + 111;
                cancelNotification = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(92577723, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$92577723.<anonymous> (CreditTestActivity.kt:155)");
            }
            w5aVar.IAuthTabCallback(onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = cancelNotification + 107;
                ITrustedWebActivityCallback_Parcel = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        boolean z;
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i2 = ITrustedWebActivityCallback_Parcel + 117;
            cancelNotification = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = ITrustedWebActivityCallback_Parcel + 99;
            cancelNotification = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1485229339, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1485229339.<anonymous> (CreditTestActivity.kt:174)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🧹 신용홈 신용리포트 미션 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedList(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 23;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 34) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = cancelNotification + 23;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-306135044, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-306135044.<anonymous> (CreditTestActivity.kt:173)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-306135044, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-306135044.<anonymous> (CreditTestActivity.kt:173)");
                int i5 = ITrustedWebActivityCallback_Parcel + 87;
                cancelNotification = i5 % 128;
                int i6 = i5 % 2;
            }
            w5aVar.IAuthTabCallback(onTransact, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IPostMessageServiceStubProxy(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 29;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 26) != 107;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1883942106, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1883942106.<anonymous> (CreditTestActivity.kt:187)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🧹 신용홈 인텔리 닫기 버튼 클릭 내역 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = ITrustedWebActivityCallback_Parcel + 123;
                cancelNotification = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit warmup(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 51;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 106) != 106;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = cancelNotification + 107;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2012312423, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$2012312423.<anonymous> (CreditTestActivity.kt:200)");
                int i6 = cancelNotification + 107;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 3;
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🧹 신용홈 론니즈배너 애니메이션 노출 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = ITrustedWebActivityCallback_Parcel + 93;
            cancelNotification = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        int i;
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i3 = cancelNotification + 45;
                ITrustedWebActivityCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1103560578, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1103560578.<anonymous> (CreditTestActivity.kt:199)");
            }
            w5aVar.IAuthTabCallback(ICustomTabsServiceStub, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityCallback_Parcel + 41;
                cancelNotification = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 10 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = cancelNotification + 71;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit setEngagementSignalsCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 37;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = ITrustedWebActivityCallback_Parcel + 69;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = cancelNotification + 93;
                ITrustedWebActivityCallback_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1613599656, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1613599656.<anonymous> (CreditTestActivity.kt:216)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1613599656, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1613599656.<anonymous> (CreditTestActivity.kt:216)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🧹 중생대 배너(DUAL_ROW) 노출 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = cancelNotification + 85;
                ITrustedWebActivityCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i3 = ITrustedWebActivityCallback_Parcel + 47;
            cancelNotification = i3 % 128;
            if (i3 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i4 = cancelNotification + 35;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1502273345, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1502273345.<anonymous> (CreditTestActivity.kt:215)");
            }
            w5aVar.IAuthTabCallback(setEngagementSignalsCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = cancelNotification + 31;
        ITrustedWebActivityCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit prefetch(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = ITrustedWebActivityCallback_Parcel + 55;
            cancelNotification = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1214886889, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1214886889.<anonymous> (CreditTestActivity.kt:230)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🧹 변동내역 신용조회 오버레이 1일 1회 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityCallback_Parcel + 111;
        cancelNotification = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit warmup(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallback_Parcel + 109;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i6 = cancelNotification + 77;
            ITrustedWebActivityCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i2 = 4;
            } else {
                int i8 = ITrustedWebActivityCallback_Parcel + 53;
                cancelNotification = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i10 = ITrustedWebActivityCallback_Parcel + 71;
            cancelNotification = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1900986112, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1900986112.<anonymous> (CreditTestActivity.kt:229)");
            }
            w5aVar.IAuthTabCallback(prefetch, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedList(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 97;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 77) != 50;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = ITrustedWebActivityCallback_Parcel + 51;
            cancelNotification = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = cancelNotification + 89;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(816174122, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$816174122.<anonymous> (CreditTestActivity.kt:244)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"변동내역 KCB 실패 강제", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = ITrustedWebActivityCallback_Parcel + 43;
            cancelNotification = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit isEngagementSignalsApiAvailable(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = ITrustedWebActivityCallback_Parcel + 121;
                cancelNotification = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = cancelNotification + 37;
            ITrustedWebActivityCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = cancelNotification + 95;
            ITrustedWebActivityCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = cancelNotification + 19;
            ITrustedWebActivityCallback_Parcel = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1995268417, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1995268417.<anonymous> (CreditTestActivity.kt:243)");
            }
            w5aVar.IAuthTabCallback(IPostMessageService, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsService_Parcel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = ITrustedWebActivityCallback_Parcel + 45;
            cancelNotification = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(417461355, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$417461355.<anonymous> (CreditTestActivity.kt:260)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"변동내역 NICE 실패 강제", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = cancelNotification + 69;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        boolean z = false;
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = ITrustedWebActivityCallback_Parcel + 35;
            cancelNotification = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = cancelNotification + 11;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1596555650, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1596555650.<anonymous> (CreditTestActivity.kt:259)");
            }
            w5aVar.IAuthTabCallback(onGreatestScrollPercentageIncreased, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityCallback_Parcel + 13;
                cancelNotification = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = ITrustedWebActivityCallback_Parcel + 65;
        cancelNotification = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit validateRelationship(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = ITrustedWebActivityCallback_Parcel + 91;
            cancelNotification = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1801300336, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1801300336.<anonymous> (CreditTestActivity.kt:300)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"설문 내역 현재 회차만 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = ITrustedWebActivityCallback_Parcel + 57;
                cancelNotification = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = cancelNotification + 39;
        ITrustedWebActivityCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit requestPostMessageChannel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = cancelNotification + 123;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityCallback_Parcel + 85;
                cancelNotification = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1402587569, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1402587569.<anonymous> (CreditTestActivity.kt:314)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1402587569, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1402587569.<anonymous> (CreditTestActivity.kt:314)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"설문 내역 전체 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityCallback_Parcel + 83;
                cancelNotification = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = cancelNotification + 65;
        ITrustedWebActivityCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit ICustomTabsServiceDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = cancelNotification + 47;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = ITrustedWebActivityCallback_Parcel + 81;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(206449268, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$206449268.<anonymous> (CreditTestActivity.kt:363)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"퀴즈 스킴 실행", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsServiceStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i3 = cancelNotification + 117;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = cancelNotification + 39;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1896333251, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1896333251.<anonymous> (CreditTestActivity.kt:361)");
                }
                w5aVar.IAuthTabCallback(access200, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = ITrustedWebActivityCallback_Parcel + 17;
                    cancelNotification = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w5aVar.IAuthTabCallback(access200, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceStubProxy(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = cancelNotification + 9;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = cancelNotification + 47;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(736896596, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$736896596.<anonymous> (CreditTestActivity.kt:379)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"금융 미션에서 퀴즈로", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = cancelNotification + 105;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        boolean z;
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 37;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i4 = cancelNotification;
            int i5 = i4 + 89;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 87;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i9 = ITrustedWebActivityCallback_Parcel + 5;
            cancelNotification = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 96 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2097366835, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$2097366835.<anonymous> (CreditTestActivity.kt:384)");
                }
                Object[] objArr2 = new Object[1];
                a((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0) - 731069196, new char[]{13251, 63571, 41352, 34015, 22183, 22189, 32778, 34680, 26698, 64786, 24762, 50647, 26364, 10483, 19765, 21123, 10462, 18645, 32206, 60899, 50282, 21629, 20141, 33295, 58563, 7878, 57725, 7344, 19493, 62267, 44512, 59287, 54689, 11089, 64414, 6819, 25511, 34514, 52380, 1675, 64515, 50271, 58632, 18966, 51046, 45066, 24648, 52609, 46176, 30513, 42913, 37236, 10895, 47426, 13455, 59802, '\r', 35038, 44460, 11455, 14084}, new char[]{0, 0, 0, 0}, new char[]{62309, 27844, 20948, 3668}, objArr2);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr2[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Object[] objArr22 = new Object[1];
                a((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0) - 731069196, new char[]{13251, 63571, 41352, 34015, 22183, 22189, 32778, 34680, 26698, 64786, 24762, 50647, 26364, 10483, 19765, 21123, 10462, 18645, 32206, 60899, 50282, 21629, 20141, 33295, 58563, 7878, 57725, 7344, 19493, 62267, 44512, 59287, 54689, 11089, 64414, 6819, 25511, 34514, 52380, 1675, 64515, 50271, 58632, 18966, 51046, 45066, 24648, 52609, 46176, 30513, 42913, 37236, 10895, 47426, 13455, 59802, '\r', 35038, 44460, 11455, 14084}, new char[]{0, 0, 0, 0}, new char[]{62309, 27844, 20948, 3668}, objArr22);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr22[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i3 = ITrustedWebActivityCallback_Parcel + 51;
            cancelNotification = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = ITrustedWebActivityCallback_Parcel + 55;
            cancelNotification = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1999921278, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1999921278.<anonymous> (CreditTestActivity.kt:378)");
                int i6 = cancelNotification + 27;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
            w5a.onExtraCallback(new Object[]{w5aVar, IEngagementSignalsCallback_Parcel, IEngagementSignalsCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityCallbackStubProxy(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 11;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = ITrustedWebActivityCallback_Parcel + 75;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = cancelNotification + 51;
                ITrustedWebActivityCallback_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-590976266, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-590976266.<anonymous> (CreditTestActivity.kt:407)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-590976266, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-590976266.<anonymous> (CreditTestActivity.kt:407)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"무료 체험권 발송", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityCallback_Parcel + 123;
                cancelNotification = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean z = false;
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i2 = ITrustedWebActivityCallback_Parcel + 83;
            cancelNotification = i2 % 128;
            int i3 = i2 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i4 = cancelNotification + 55;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = cancelNotification + 21;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1601208511, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1601208511.<anonymous> (CreditTestActivity.kt:405)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1601208511, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1601208511.<anonymous> (CreditTestActivity.kt:405)");
            }
            w5aVar.IAuthTabCallback(onRelationshipValidationResult, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityCallback_Parcel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = ITrustedWebActivityCallback_Parcel + 61;
            int i4 = i3 % 128;
            cancelNotification = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 43;
            ITrustedWebActivityCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityCallback_Parcel + 43;
                cancelNotification = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-989689033, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-989689033.<anonymous> (CreditTestActivity.kt:421)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-989689033, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-989689033.<anonymous> (CreditTestActivity.kt:421)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"무료 체험 내역 삭제", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onRelationshipValidationResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = cancelNotification + 71;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = cancelNotification + 87;
            int i7 = i6 % 128;
            ITrustedWebActivityCallback_Parcel = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 3;
            cancelNotification = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1202495744, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1202495744.<anonymous> (CreditTestActivity.kt:419)");
            }
            w5aVar.IAuthTabCallback(isEngagementSignalsApiAvailable, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = cancelNotification + 21;
        ITrustedWebActivityCallback_Parcel = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onVerticalScrollEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 79;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 49) != 102;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = ITrustedWebActivityCallback_Parcel + 95;
            cancelNotification = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1388401800, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1388401800.<anonymous> (CreditTestActivity.kt:435)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"신용플러스 환불하기", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = ITrustedWebActivityCallback_Parcel + 23;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit prefetchWithMultipleUrls(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = ITrustedWebActivityCallback_Parcel + 37;
            cancelNotification = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = cancelNotification + 43;
                ITrustedWebActivityCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i7 = cancelNotification + 103;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            z = i7 % 2 == 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(803782977, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$803782977.<anonymous> (CreditTestActivity.kt:433)");
            }
            w5aVar.IAuthTabCallback(asBinder, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityCallback_Parcel + 121;
                cancelNotification = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = 41 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit postMessage(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = cancelNotification + 125;
        ITrustedWebActivityCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i7 = ITrustedWebActivityCallback_Parcel + 121;
            cancelNotification = i7 % 128;
            int i8 = i7 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                int i9 = ITrustedWebActivityCallback_Parcel + 45;
                cancelNotification = i9 % 128;
                int i10 = i9 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityCallback_Parcel + 119;
                cancelNotification = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(405070210, i2, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$405070210.<anonymous> (CreditTestActivity.kt:447)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(405070210, i2, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$405070210.<anonymous> (CreditTestActivity.kt:447)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "신용플러스 테스트 결제 활성화", Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 6), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 789392640, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -789392637, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = ITrustedWebActivityCallback_Parcel + 115;
                cancelNotification = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit prefetch(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i5 = cancelNotification + 117;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i7 = cancelNotification + 25;
                ITrustedWebActivityCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
            int i9 = cancelNotification + 25;
            ITrustedWebActivityCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(223323928, i2, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$223323928.<anonymous> (CreditTestActivity.kt:462)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "신용플러스 선물하기 테스트 결제 활성화", Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 6), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 789392640, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -789392637, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IPostMessageServiceStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = cancelNotification + 15;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = cancelNotification + 95;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityCallback_Parcel + 27;
                cancelNotification = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1438413521, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1438413521.<anonymous> (CreditTestActivity.kt:478)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1438413521, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1438413521.<anonymous> (CreditTestActivity.kt:478)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"금융 미션에서 신용플러스로", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit cancelNotification(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = ITrustedWebActivityCallback_Parcel + 123;
            cancelNotification = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-77943282, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-77943282.<anonymous> (CreditTestActivity.kt:483)");
            }
            Object[] objArr = new Object[1];
            a((char) (60797 - TextUtils.getCapsMode("", 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{50611, 54012, 13225, 59377, 61998, 11584, 31674, 11385, 49517, 20906, 17427, 30370, 53600, 58275, 16256, 47813, 61591, 28303, 49785, 44481, 59114, 54770, 13845, 17113, 38912, 25858, 26214, 49645, 6783, 35752, 18775, 364, 40966, 27164, 40075, 49218, 23351, 11514, 46262, 29354, 60548, 28527, 19514, 47317, 7020, 58232, 42728, 16347, 17932, 54639, 64753, 44388, 31619, 65303, 30766, 53466, 52713, 42794, 52938, 37494, 27380, 57762, 32267, 46544, 44381, 48247}, new char[]{0, 0, 0, 0}, new char[]{14395, 5838, 32052, 31981}, objArr);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityCallback_Parcel + 93;
                cancelNotification = i5 % 128;
                if (i5 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit updateVisuals(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = cancelNotification + 65;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 122) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i5 = cancelNotification + 79;
                    ITrustedWebActivityCallback_Parcel = i5 % 128;
                    i2 = i5 % 2 != 0 ? 3 : 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i6 = cancelNotification + 65;
            ITrustedWebActivityCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-175388839, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-175388839.<anonymous> (CreditTestActivity.kt:477)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, IAuthTabCallbackStub, ICustomTabsService, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = cancelNotification + 59;
                ITrustedWebActivityCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = cancelNotification + 9;
        ITrustedWebActivityCallback_Parcel = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit prefetchWithMultipleUrls(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 115;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = ITrustedWebActivityCallback_Parcel + 83;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityCallback_Parcel + 63;
                cancelNotification = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1528680913, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1528680913.<anonymous> (CreditTestActivity.kt:499)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"금융 미션 - 신용플러스 방문 미션 초기화", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = ITrustedWebActivityCallback_Parcel + 13;
        cancelNotification = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit ICustomTabsService_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallback_Parcel + 63;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = ITrustedWebActivityCallback_Parcel + 15;
            cancelNotification = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i2 = 2;
            } else {
                int i7 = ITrustedWebActivityCallback_Parcel + 115;
                cancelNotification = i7 % 128;
                i2 = i7 % 2 == 0 ? 5 : 4;
            }
            i |= i2;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i8 = cancelNotification + 35;
            ITrustedWebActivityCallback_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i9 = ITrustedWebActivityCallback_Parcel + 111;
            cancelNotification = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-574101606, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-574101606.<anonymous> (CreditTestActivity.kt:498)");
            }
            w5aVar.IAuthTabCallback(receiveFile, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access200(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = ITrustedWebActivityCallback_Parcel + 31;
            cancelNotification = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(731255379, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$731255379.<anonymous> (CreditTestActivity.kt:537)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"신점올 결과 조작", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = cancelNotification + 119;
                ITrustedWebActivityCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = cancelNotification + 3;
        ITrustedWebActivityCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 22 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit requestPostMessageChannelWithExtras(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = cancelNotification + 83;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i6 = ITrustedWebActivityCallback_Parcel + 71;
            cancelNotification = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i2 = 4;
            } else {
                int i7 = ITrustedWebActivityCallback_Parcel + 111;
                cancelNotification = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i9 = cancelNotification + 97;
            ITrustedWebActivityCallback_Parcel = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 26 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1371527140, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1371527140.<anonymous> (CreditTestActivity.kt:535)");
                }
                w5aVar.IAuthTabCallback(onSessionEnded, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = ITrustedWebActivityCallback_Parcel + 57;
                    cancelNotification = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 % 5;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w5aVar.IAuthTabCallback(onSessionEnded, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityCallbackStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = cancelNotification + 63;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityCallback_Parcel + 13;
                cancelNotification = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1672794350, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1672794350.<anonymous> (CreditTestActivity.kt:555)");
                    int i6 = 75 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1672794350, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1672794350.<anonymous> (CreditTestActivity.kt:555)");
                }
            }
            Object[] objArr = new Object[1];
            a((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{11573, 35808, 37584, 33657, 63539, 41845, 15279, 59947, 36355, 15090, 60138, 4023, 951, 19765, 61804, 425, 41359, 30476, 53718, 45886, 50117, 50585, 55822, 58132, 8927, 38820, 13403, 40537, 59637, 44023, 44663, 17389, 63346, 53059, 37159, 28377, 55471, 25591}, new char[]{0, 0, 0, 0}, new char[]{27584, 25435, 23997, 34236}, objArr);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityCallback_Parcel + 17;
                cancelNotification = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallbackDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 57;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = cancelNotification + 13;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = cancelNotification + 21;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = cancelNotification + 43;
                ITrustedWebActivityCallback_Parcel = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(862989940, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$862989940.<anonymous> (CreditTestActivity.kt:570)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"금융 미션에서 신점올로", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityCallback_Parcel + 117;
                cancelNotification = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = cancelNotification + 83;
            ITrustedWebActivityCallback_Parcel = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityCallback_Parcel + 35;
        cancelNotification = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = cancelNotification + 93;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2071507117, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-2071507117.<anonymous> (CreditTestActivity.kt:575)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2071507117, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-2071507117.<anonymous> (CreditTestActivity.kt:575)");
            }
            Object[] objArr2 = new Object[1];
            a((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.green(0), new char[]{31988, 61668, 39512, 8962, 22912, 23966, 30330, 30573, 63759, 22020, 1666, 33353, 998, 10728, 56151, 10219, 51003, 60560, 51514, 48142, 62739, 33114, 45111, 1103, 28495, 36656, 8594, 41002, 8538, 44468, 27556, 47018, 51809, 33171, 8447, 35735, 51442, 14912, 33365, 59715, 62219, 8766, 38688, 1884, 15840, 37616, 3948, 65386, 37216, 33361, 19677, 1150, 15735, 11698, 43363, 27737, 48471, 28852, 58832, 21713, 3892, 3651}, new char[]{0, 0, 0, 0}, new char[]{45037, 3945, 32740, 58675}, objArr2);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr2[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = cancelNotification + 29;
                ITrustedWebActivityCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 != 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newAuthTabSession(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = cancelNotification + 93;
        ITrustedWebActivityCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 95) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i5 = cancelNotification + 5;
                    ITrustedWebActivityCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = cancelNotification + 51;
                ITrustedWebActivityCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2126014622, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$2126014622.<anonymous> (CreditTestActivity.kt:569)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, IPostMessageServiceStub, onMessageChannelReady, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = cancelNotification + 43;
            ITrustedWebActivityCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i11 = ITrustedWebActivityCallback_Parcel + 57;
        cancelNotification = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ITrustedWebActivityCallbackDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 83;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 104) != 82) {
                int i4 = cancelNotification + 121;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = ITrustedWebActivityCallback_Parcel + 5;
            cancelNotification = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-464882922, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-464882922.<anonymous> (CreditTestActivity.kt:590)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"토뱅 브릿지 화면으로", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit mayLaunchUrl(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = ITrustedWebActivityCallback_Parcel + 89;
            cancelNotification = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = cancelNotification + 81;
                ITrustedWebActivityCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i7 = cancelNotification + 117;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 19) != 18) {
            int i9 = cancelNotification;
            int i10 = i9 + 53;
            ITrustedWebActivityCallback_Parcel = i10 % 128;
            z = i10 % 2 == 0;
            int i11 = i9 + 39;
            ITrustedWebActivityCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = cancelNotification + 9;
                ITrustedWebActivityCallback_Parcel = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1727301855, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1727301855.<anonymous> (CreditTestActivity.kt:589)");
            }
            w5aVar.IAuthTabCallback(onMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onSessionEnded(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 107;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 85) != 10;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1262308456, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1262308456.<anonymous> (CreditTestActivity.kt:631)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"나이스 약관 동의 취소(2687, 2685, 2681)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = ITrustedWebActivityCallback_Parcel + 107;
            cancelNotification = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ITrustedWebActivityCallback_Parcel + 97;
        cancelNotification = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
        return unit;
    }

    private static final Unit requestPostMessageChannel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = cancelNotification;
                int i5 = i4 + 27;
                ITrustedWebActivityCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 65;
                ITrustedWebActivityCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(929876321, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$929876321.<anonymous> (CreditTestActivity.kt:630)");
            }
            w5aVar.IAuthTabCallback(IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = cancelNotification + 7;
                ITrustedWebActivityCallback_Parcel = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IEngagementSignalsCallbackStubProxy(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 119;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 116) != 74;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = ITrustedWebActivityCallback_Parcel + 1;
                cancelNotification = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1444054738, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1444054738.<anonymous> (CreditTestActivity.kt:648)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1444054738, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1444054738.<anonymous> (CreditTestActivity.kt:648)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"토스모바일 약관 동의 취소 (4829)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newSession(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 95;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        boolean z = true;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 2) == 0) {
                i |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 2 : 4;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) == 18) {
            int i4 = cancelNotification + 123;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(748130039, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$748130039.<anonymous> (CreditTestActivity.kt:647)");
            }
            w5aVar.IAuthTabCallback(asInterface, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = cancelNotification + 69;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IPostMessageService_Parcel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 23;
        cancelNotification = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 41) != 16) {
                int i4 = ITrustedWebActivityCallback_Parcel + 43;
                cancelNotification = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityCallback_Parcel + 77;
                cancelNotification = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1842767505, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1842767505.<anonymous> (CreditTestActivity.kt:664)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"금명보 약관 동의 취소 (4881)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityCallback_Parcel + 99;
                cancelNotification = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newSessionWithExtras(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallback_Parcel + 73;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i6 = cancelNotification + 87;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                i2 = i6 % 2 != 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i7 = cancelNotification + 71;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 19) != 18) {
            int i9 = cancelNotification + 107;
            ITrustedWebActivityCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i11 = cancelNotification + 17;
            ITrustedWebActivityCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = ITrustedWebActivityCallback_Parcel + 7;
                cancelNotification = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(349417272, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$349417272.<anonymous> (CreditTestActivity.kt:663)");
                    int i14 = 89 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(349417272, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$349417272.<anonymous> (CreditTestActivity.kt:663)");
                }
            }
            w5aVar.IAuthTabCallback(ICustomTabsCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit updateVisuals(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = ITrustedWebActivityCallback_Parcel + 9;
                cancelNotification = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2053487024, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$2053487024.<anonymous> (CreditTestActivity.kt:684)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2053487024, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$2053487024.<anonymous> (CreditTestActivity.kt:684)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"퀴즈 알림 약관 동의 취소 (5205)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = ITrustedWebActivityCallback_Parcel + 5;
                cancelNotification = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = cancelNotification + 53;
                ITrustedWebActivityCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = cancelNotification + 1;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = ITrustedWebActivityCallback_Parcel + 53;
            cancelNotification = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = cancelNotification + 51;
            ITrustedWebActivityCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-49295495, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-49295495.<anonymous> (CreditTestActivity.kt:683)");
            }
            w5aVar.IAuthTabCallback(ICustomTabsService_Parcel, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = cancelNotification + 95;
                ITrustedWebActivityCallback_Parcel = i10 % 128;
                if (i10 % 2 != 0) {
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

    private static final Unit requestPostMessageChannelWithExtras(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallback_Parcel + 83;
        cancelNotification = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = ITrustedWebActivityCallback_Parcel + 25;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1654774257, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1654774257.<anonymous> (CreditTestActivity.kt:701)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"신점올 알림 동의 취소 (5145)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit access200(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = cancelNotification + 125;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = ITrustedWebActivityCallback_Parcel + 67;
                cancelNotification = i5 % 128;
                int i6 = i5 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i7 = ITrustedWebActivityCallback_Parcel + 27;
            cancelNotification = i7 % 128;
            z = i7 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityCallback_Parcel + 73;
                cancelNotification = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-448008262, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-448008262.<anonymous> (CreditTestActivity.kt:700)");
                    int i9 = 60 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-448008262, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-448008262.<anonymous> (CreditTestActivity.kt:700)");
                }
            }
            w5aVar.IAuthTabCallback(requestPostMessageChannelWithExtras, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit postMessage(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = ITrustedWebActivityCallback_Parcel + 39;
            cancelNotification = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = cancelNotification + 47;
                ITrustedWebActivityCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1256061490, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1256061490.<anonymous> (CreditTestActivity.kt:718)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"신점올 토스뱅크 제출 약관 취소 (5136)", null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityCallback_Parcel + 105;
                cancelNotification = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 8 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallback_Parcel + 111;
        cancelNotification = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i6 = cancelNotification + 99;
            ITrustedWebActivityCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                int i8 = cancelNotification + 101;
                ITrustedWebActivityCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                i2 = 4;
            }
            i |= i2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-846721029, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-846721029.<anonymous> (CreditTestActivity.kt:717)");
            }
            w5aVar.IAuthTabCallback(postMessage, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IPostMessageServiceDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 113;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i5 = ITrustedWebActivityCallback_Parcel + 117;
            cancelNotification = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = cancelNotification + 51;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1547644602, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1547644602.<anonymous> (CreditTestActivity.kt:1007)");
            }
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("정상 응답", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityCallback_Parcel + 69;
                cancelNotification = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = ITrustedWebActivityCallback_Parcel + 71;
        cancelNotification = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newSessionWithExtras(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = cancelNotification + 1;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = cancelNotification + 111;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 1 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1123872509, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1123872509.<anonymous> (CreditTestActivity.kt:1014)");
                }
                Object[] objArr = new Object[1];
                a((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), View.resolveSize(0, 0), new char[]{14702, 8530, 59149, 24494, 30000, 19761, 39766, 33839, 30090, 11960, 64995, 34607, 12236, 50274, 51163, 8754, 33300, 23649, 41805, 40412}, new char[]{0, 0, 0, 0}, new char[]{54930, 42207, 63237, 34049}, objArr);
                PreviewExternalSyntheticLambda3.onExtraCallbackWithResult(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Object[] objArr2 = new Object[1];
                a((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), View.resolveSize(0, 0), new char[]{14702, 8530, 59149, 24494, 30000, 19761, 39766, 33839, 30090, 11960, 64995, 34607, 12236, 50274, 51163, 8754, 33300, 23649, 41805, 40412}, new char[]{0, 0, 0, 0}, new char[]{54930, 42207, 63237, 34049}, objArr2);
                PreviewExternalSyntheticLambda3.onExtraCallbackWithResult(((String) objArr2[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z = false;
        RowScope rowScope = (RowScope) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i2 = ITrustedWebActivityCallback_Parcel + 111;
            cancelNotification = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = cancelNotification + 13;
            ITrustedWebActivityCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1387569534, iIntValue, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$1387569534.<anonymous> (CreditTestActivity.kt:1020)");
            }
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("NICE 점검 (MAINTENANCE)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = cancelNotification + 11;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallbackStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = cancelNotification + 85;
            ITrustedWebActivityCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = cancelNotification + 35;
            ITrustedWebActivityCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1289543650, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-1289543650.<anonymous> (CreditTestActivity.kt:1059)");
            }
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("정상 응답", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = ITrustedWebActivityCallback_Parcel + 39;
            cancelNotification = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = cancelNotification + 7;
        ITrustedWebActivityCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallback_Parcel(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i4 = ITrustedWebActivityCallback_Parcel + 115;
            int i5 = i4 % 128;
            cancelNotification = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 71;
            ITrustedWebActivityCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = cancelNotification + 121;
                ITrustedWebActivityCallback_Parcel = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-149190059, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$-149190059.<anonymous> (CreditTestActivity.kt:1066)");
                int i11 = ITrustedWebActivityCallback_Parcel + 23;
                cancelNotification = i11 % 128;
                int i12 = i11 % 2;
            }
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("점검 강제 (score=0)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i2 = ITrustedWebActivityCallback_Parcel + 61;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i2 = ITrustedWebActivityCallback_Parcel + 75;
        cancelNotification = i2 % 128;
        int i13 = i2 % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IEngagementSignalsCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = cancelNotification + 85;
        ITrustedWebActivityCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 69) != 58;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = ITrustedWebActivityCallback_Parcel + 95;
            cancelNotification = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(650384470, i, -1, "im.toss.feature.credit.ui.main.test.ComposableSingletons$CreditTestActivityKt.lambda$650384470.<anonymous> (CreditTestActivity.kt:1073)");
                }
                PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("에러 강제 (API 실패)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = ITrustedWebActivityCallback_Parcel + 121;
                    cancelNotification = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("에러 강제 (API 실패)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1402613738, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1402613767, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -737660716, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 737660743, iOnExtraCallback);
    }

    public static /* synthetic */ Unit asBinder(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 740284549, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -740284517, iOnExtraCallback);
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -986066612, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 986066632, iOnExtraCallback);
    }

    public static /* synthetic */ Unit access000(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 875548269, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -875548238, iOnExtraCallback);
    }

    public static /* synthetic */ Unit ICustomTabsCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -233648299, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 233648307, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onActivityLayout(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1879832246, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1879832267, iOnExtraCallback);
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1891990977, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1891990999, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1375874864, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1375874878, iOnExtraCallback);
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1938960221, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1938960231, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onUnminimized(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -240920592, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 240920615, iOnExtraCallback);
    }

    public static /* synthetic */ Unit ICustomTabsService(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1941392326, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1941392325, iOnExtraCallback);
    }

    public static /* synthetic */ Unit extraCommand(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1945110569, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1945110581, iOnExtraCallback);
    }

    private static final Unit receiveFile(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -845868147, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 845868150, iOnExtraCallback);
    }

    private static final Unit extraCommand(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 597841477, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -597841462, iOnExtraCallback);
    }

    private static final Unit ICustomTabsService(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1796767682, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1796767691, iOnExtraCallback);
    }

    private static final Unit ICustomTabsServiceStub(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -447266806, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 447266822, iOnExtraCallback);
    }

    private static final Unit receiveFile(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 495483406, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -495483382, iOnExtraCallback);
    }

    private static final Unit IPostMessageService(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1433798270, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1433798240, iOnExtraCallback);
    }

    private static final Unit ITrustedWebActivityCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -724179650, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 724179669, iOnExtraCallback);
    }

    private static final Unit ICustomTabsServiceStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -773743897, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 773743899, iOnExtraCallback);
    }

    private static final Unit ITrustedWebActivityService(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1783624028, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1783624000, iOnExtraCallback);
    }

    private static final Unit onVerticalScrollEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1748159433, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1748159437, iOnExtraCallback);
    }

    private static final Unit onSessionEnded(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1534482239, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1534482264, iOnExtraCallback);
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1580991456, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 1580991461, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -610164964, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 610164970, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -180482925, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 180482925, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -497600093, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 497600106, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -80714585, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 80714602, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1714245949, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, -1714245938, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 777989927, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, -777989901, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 2064813985, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, -2064813967, iOnExtraCallback);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -708801543, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 708801550, iOnExtraCallback);
    }

    static void prefetch() {
        IPostMessageServiceStubProxy = 7798559133331975163L;
        ITrustedWebActivityCallback = 84569334;
        ITrustedWebActivityCallbackStub = (char) 27643;
    }
}
