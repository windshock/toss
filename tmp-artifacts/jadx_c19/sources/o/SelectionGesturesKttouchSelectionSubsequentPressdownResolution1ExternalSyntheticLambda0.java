package o;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.drm.DrmSession;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0;
import o.AppBarKtExternalSyntheticLambda8;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12;
import o.SelectionManagerExternalSyntheticLambda10;
import o.SelectionManagerExternalSyntheticLambda2;
import o.SelectionManager_androidKtExternalSyntheticLambda5;
import o.TextFieldStateKtExternalSyntheticLambda0;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0 implements SelectionContainerKtExternalSyntheticLambda9, SelectionManagerExternalSyntheticLambda10.onWarmupCompleted {
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback_Parcel;
    private IAuthTabCallback ICustomTabsCallback;
    private final SelectionManagerExternalSyntheticLambda10 ICustomTabsCallbackDefault;
    private int access000;
    private boolean access100;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 asInterface;
    private boolean extraCallback;
    private PlaybackMetrics.Builder extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private IAuthTabCallback onActivityLayout;
    private int onActivityResized;
    private int onExtraCallbackWithResult;
    private boolean onMessageChannelReady;
    private final PlaybackSession onMinimized;
    private final Context onTransact;
    private String onWarmupCompleted;
    private IAuthTabCallback readTypedObject;
    private createInputConnection writeTypedObject;
    private final Executor onExtraCallback = RecordingInputConnectionExternalSyntheticLambda0.IAuthTabCallback();
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback ICustomTabsCallbackStubProxy = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onPostMessage = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
    private final HashMap<String, Long> IAuthTabCallback = new HashMap<>();
    private final HashMap<String, Long> onNavigationEvent = new HashMap<>();
    private final long ICustomTabsCallbackStub = SystemClock.elapsedRealtime();
    private int asBinder = 0;
    private int IAuthTabCallbackDefault = 0;

    private static int IAuthTabCallback(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 1 : 4;
        }
        return 3;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10.onWarmupCompleted
    public void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str) {
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10.onWarmupCompleted
    public void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str, String str2) {
    }

    public static SelectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0 onNavigationEvent(Context context) {
        MediaMetricsManager mediaMetricsManagerNK_ = SelectionLayoutKtExternalSyntheticLambda0.nK_(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerNK_ == null) {
            return null;
        }
        return new SelectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0(context, mediaMetricsManagerNK_.createPlaybackSession());
    }

    private SelectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0(Context context, PlaybackSession playbackSession) {
        this.onTransact = context.getApplicationContext();
        this.onMinimized = playbackSession;
        SelectionGesturesKtExternalSyntheticLambda2 selectionGesturesKtExternalSyntheticLambda2 = new SelectionGesturesKtExternalSyntheticLambda2();
        this.ICustomTabsCallbackDefault = selectionGesturesKtExternalSyntheticLambda2;
        selectionGesturesKtExternalSyntheticLambda2.IAuthTabCallback(this);
    }

    public LogSessionId nI_() {
        return this.onMinimized.getSessionId();
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10.onWarmupCompleted
    public void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
        if (onextracallbackwithresult == null || !onextracallbackwithresult.IAuthTabCallback()) {
            IAuthTabCallback();
            this.onWarmupCompleted = str;
            this.extraCallbackWithResult = SelectionMagnifierKtExternalSyntheticLambda2.nN_().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10.onWarmupCompleted
    public void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str, boolean z) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
        if ((onextracallbackwithresult == null || !onextracallbackwithresult.IAuthTabCallback()) && str.equals(this.onWarmupCompleted)) {
            IAuthTabCallback();
        }
        this.onNavigationEvent.remove(str);
        this.IAuthTabCallback.remove(str);
    }

    public void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onnavigationevent2, int i2) {
        if (i2 == 1) {
            this.extraCallback = true;
        }
        this.access000 = i2;
    }

    public void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
        this.getInterfaceDescriptor += textStringSimpleNodeExternalSyntheticLambda1.onNavigationEvent;
        this.onActivityResized += textStringSimpleNodeExternalSyntheticLambda1.IAuthTabCallbackDefault;
    }

    public void onBandwidthEstimate(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, long j, long j2) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
        if (onextracallbackwithresult != null) {
            String strIAuthTabCallback = this.ICustomTabsCallbackDefault.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder, (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallbackwithresult));
            Long l = this.IAuthTabCallback.get(strIAuthTabCallback);
            Long l2 = this.onNavigationEvent.get(strIAuthTabCallback);
            this.IAuthTabCallback.put(strIAuthTabCallback, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.onNavigationEvent.put(strIAuthTabCallback, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i2));
        }
    }

    public void onDownstreamFormatChanged(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        if (selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact != null) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(badgeKtExternalSyntheticLambda2.onWarmupCompleted), badgeKtExternalSyntheticLambda2.IAuthTabCallbackDefault, this.ICustomTabsCallbackDefault.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder, (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact)));
            int i2 = badgeKtExternalSyntheticLambda2.onTransact;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.readTypedObject = iAuthTabCallback;
                    return;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.ICustomTabsCallback = iAuthTabCallback;
                    return;
                }
            }
            this.onActivityLayout = iAuthTabCallback;
        }
    }

    public void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
        IAuthTabCallback iAuthTabCallback = this.onActivityLayout;
        if (iAuthTabCallback != null) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = iAuthTabCallback.IAuthTabCallback;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback == -1) {
                this.onActivityLayout = new IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onActivityLayout(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onWarmupCompleted).access100(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.IAuthTabCallback).onNavigationEvent(), iAuthTabCallback.onWarmupCompleted, iAuthTabCallback.onNavigationEvent);
            }
        }
    }

    public void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, IOException iOException, boolean z) {
        this.IAuthTabCallbackStubProxy = badgeKtExternalSyntheticLambda2.IAuthTabCallback;
    }

    public void onPlayerError(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, createInputConnection createinputconnection) {
        this.writeTypedObject = createinputconnection;
    }

    public void IAuthTabCallback(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted) {
        if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onExtraCallbackWithResult() != 0) {
            onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            onWarmupCompleted(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted);
            onNavigationEvent(jElapsedRealtime);
            onNavigationEvent(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted, jElapsedRealtime);
            onExtraCallbackWithResult(jElapsedRealtime);
            onWarmupCompleted(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted, jElapsedRealtime);
            if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onNavigationEvent(1028)) {
                this.ICustomTabsCallbackDefault.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onWarmupCompleted(1028));
            }
        }
    }

    private void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted) {
        for (int i2 = 0; i2 < selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onExtraCallbackWithResult(); i2++) {
            int iOnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onExtraCallbackWithResult(i2);
            SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted = selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onWarmupCompleted(iOnExtraCallbackWithResult);
            if (iOnExtraCallbackWithResult == 0) {
                this.ICustomTabsCallbackDefault.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted);
            } else if (iOnExtraCallbackWithResult == 11) {
                this.ICustomTabsCallbackDefault.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted, this.access000);
            } else {
                this.ICustomTabsCallbackDefault.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted);
            }
        }
    }

    private void onWarmupCompleted(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted) {
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0OnNavigationEvent;
        if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onNavigationEvent(0)) {
            SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted = selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onWarmupCompleted(0);
            if (this.extraCallbackWithResult != null) {
                onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted.asBinder, selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnWarmupCompleted.onTransact);
            }
        }
        if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onNavigationEvent(2) && this.extraCallbackWithResult != null && (basicTextContextMenuProviderExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent((ImmutableList<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback>) androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.newSessionWithExtras().onNavigationEvent())) != null) {
            SelectionMagnifierKtExternalSyntheticLambda0.nJ_(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.extraCallbackWithResult}, -1084655742)).setDrmType(onExtraCallbackWithResult(basicTextContextMenuProviderExternalSyntheticLambda0OnNavigationEvent));
        }
        if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onNavigationEvent(1011)) {
            this.onExtraCallbackWithResult++;
        }
    }

    private void onNavigationEvent(long j) {
        Exception exc = this.writeTypedObject;
        if (exc == null) {
            return;
        }
        onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted((createInputConnection) exc, this.onTransact, this.IAuthTabCallbackStubProxy == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = SelectionMagnifierKtExternalSyntheticLambda1.nO_().setTimeSinceCreatedMillis(j - this.ICustomTabsCallbackStub).setErrorCode(onextracallbackwithresultOnWarmupCompleted.onExtraCallback).setSubErrorCode(onextracallbackwithresultOnWarmupCompleted.IAuthTabCallback).setException(exc).build();
        this.onExtraCallback.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onMinimized.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.onMessageChannelReady = true;
        this.writeTypedObject = null;
    }

    private void onNavigationEvent(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted, long j) {
        if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onNavigationEvent(2)) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12NewSessionWithExtras = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.newSessionWithExtras();
            boolean zOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12NewSessionWithExtras.onExtraCallbackWithResult(2);
            boolean zOnExtraCallbackWithResult2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12NewSessionWithExtras.onExtraCallbackWithResult(1);
            boolean zOnExtraCallbackWithResult3 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12NewSessionWithExtras.onExtraCallbackWithResult(3);
            if (zOnExtraCallbackWithResult || zOnExtraCallbackWithResult2 || zOnExtraCallbackWithResult3) {
                if (!zOnExtraCallbackWithResult) {
                    onNavigationEvent(j, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) null, 0);
                }
                if (!zOnExtraCallbackWithResult2) {
                    IAuthTabCallback(j, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) null, 0);
                }
                if (!zOnExtraCallbackWithResult3) {
                    onExtraCallback(j, null, 0);
                }
            }
        }
        if (onWarmupCompleted(this.onActivityLayout)) {
            IAuthTabCallback iAuthTabCallback = this.onActivityLayout;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = iAuthTabCallback.IAuthTabCallback;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback != -1) {
                onNavigationEvent(j, basicTextContextMenuProviderKtExternalSyntheticLambda4, iAuthTabCallback.onWarmupCompleted);
                this.onActivityLayout = null;
            }
        }
        if (onWarmupCompleted(this.readTypedObject)) {
            IAuthTabCallback iAuthTabCallback2 = this.readTypedObject;
            IAuthTabCallback(j, iAuthTabCallback2.IAuthTabCallback, iAuthTabCallback2.onWarmupCompleted);
            this.readTypedObject = null;
        }
        if (onWarmupCompleted(this.ICustomTabsCallback)) {
            IAuthTabCallback iAuthTabCallback3 = this.ICustomTabsCallback;
            onExtraCallback(j, iAuthTabCallback3.IAuthTabCallback, iAuthTabCallback3.onWarmupCompleted);
            this.ICustomTabsCallback = null;
        }
    }

    @EnsuresNonNullIf
    private boolean onWarmupCompleted(@Nullable IAuthTabCallback iAuthTabCallback) {
        return iAuthTabCallback != null && iAuthTabCallback.onNavigationEvent.equals(this.ICustomTabsCallbackDefault.IAuthTabCallback());
    }

    private void onExtraCallbackWithResult(long j) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onTransact);
        if (iOnExtraCallbackWithResult != this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackDefault = iOnExtraCallbackWithResult;
            final NetworkEvent networkEventBuild = SelectionManagerExternalSyntheticLambda0.nM_().setNetworkType(iOnExtraCallbackWithResult).setTimeSinceCreatedMillis(j - this.ICustomTabsCallbackStub).build();
            this.onExtraCallback.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.onMinimized.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void onWarmupCompleted(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted, long j) {
        if (androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.setEngagementSignalsCallback() != 2) {
            this.extraCallback = false;
        }
        if (androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.updateVisuals() == null) {
            this.access100 = false;
        } else if (selectionContainerKtExternalSyntheticLambda9$onWarmupCompleted.onNavigationEvent(10)) {
            this.access100 = true;
        }
        int iOnWarmupCompleted = onWarmupCompleted(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0);
        if (this.asBinder != iOnWarmupCompleted) {
            this.asBinder = iOnWarmupCompleted;
            this.onMessageChannelReady = true;
            final PlaybackStateEvent playbackStateEventBuild = SelectionMagnifierKtExternalSyntheticLambda3.nP_().setState(this.asBinder).setTimeSinceCreatedMillis(j - this.ICustomTabsCallbackStub).build();
            this.onExtraCallback.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.onMinimized.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private int onWarmupCompleted(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) {
        int engagementSignalsCallback = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.setEngagementSignalsCallback();
        if (this.extraCallback) {
            return 5;
        }
        if (this.access100) {
            return 13;
        }
        if (engagementSignalsCallback == 4) {
            return 11;
        }
        if (engagementSignalsCallback == 2) {
            int i2 = this.asBinder;
            if (i2 == 0 || i2 == 2 || i2 == 12) {
                return 2;
            }
            if (androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.prefetchWithMultipleUrls()) {
                return androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.validateRelationship() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (engagementSignalsCallback == 3) {
            if (androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.prefetchWithMultipleUrls()) {
                return androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.validateRelationship() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (engagementSignalsCallback != 1 || this.asBinder == 0) {
            return this.asBinder;
        }
        return 12;
    }

    private void onNavigationEvent(long j, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) {
        if (Objects.equals(this.IAuthTabCallback_Parcel, basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return;
        }
        if (this.IAuthTabCallback_Parcel == null && i2 == 0) {
            i2 = 1;
        }
        this.IAuthTabCallback_Parcel = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        onWarmupCompleted(1, j, basicTextContextMenuProviderKtExternalSyntheticLambda4, i2);
    }

    private void IAuthTabCallback(long j, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) {
        if (Objects.equals(this.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return;
        }
        if (this.IAuthTabCallbackStub == null && i2 == 0) {
            i2 = 1;
        }
        this.IAuthTabCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        onWarmupCompleted(0, j, basicTextContextMenuProviderKtExternalSyntheticLambda4, i2);
    }

    private void onExtraCallback(long j, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) {
        if (Objects.equals(this.asInterface, basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return;
        }
        if (this.asInterface == null && i2 == 0) {
            i2 = 1;
        }
        this.asInterface = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        onWarmupCompleted(2, j, basicTextContextMenuProviderKtExternalSyntheticLambda4, i2);
    }

    private void onWarmupCompleted(int i2, long j, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = SelectionMagnifierKtrememberAnimatedMagnifierPosition11ExternalSyntheticLambda0.nL_(i2).setTimeSinceCreatedMillis(j - this.ICustomTabsCallbackStub);
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(IAuthTabCallback(i3));
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.asInterface;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout;
            if (str4 != null) {
                Pair<String, String> pairIAuthTabCallback = IAuthTabCallback(str4);
                timeSinceCreatedMillis.setLanguage((String) pairIAuthTabCallback.first);
                Object obj = pairIAuthTabCallback.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.onMessageChannelReady = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.onExtraCallback.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onMinimized.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        int iIAuthTabCallback;
        PlaybackMetrics.Builder builder = this.extraCallbackWithResult;
        if (onextracallbackwithresult == null || (iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(onextracallbackwithresult.onExtraCallback)) == -1) {
            return;
        }
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.onPostMessage);
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(this.onPostMessage.IAuthTabCallbackStub, this.ICustomTabsCallbackStubProxy);
        builder.setStreamType(onExtraCallbackWithResult(this.ICustomTabsCallbackStubProxy.IAuthTabCallbackStubProxy));
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = this.ICustomTabsCallbackStubProxy;
        if (iAuthTabCallback.onExtraCallbackWithResult != -9223372036854775807L && !iAuthTabCallback.IAuthTabCallbackStub && !iAuthTabCallback.asInterface && !iAuthTabCallback.IAuthTabCallbackStub()) {
            builder.setMediaDurationMillis(this.ICustomTabsCallbackStubProxy.IAuthTabCallback());
        }
        builder.setPlaybackType(this.ICustomTabsCallbackStubProxy.IAuthTabCallbackStub() ? 2 : 1);
        this.onMessageChannelReady = true;
    }

    private void IAuthTabCallback() {
        PlaybackMetrics.Builder builder = this.extraCallbackWithResult;
        if (builder != null && this.onMessageChannelReady) {
            builder.setAudioUnderrunCount(this.onExtraCallbackWithResult);
            this.extraCallbackWithResult.setVideoFramesDropped(this.getInterfaceDescriptor);
            this.extraCallbackWithResult.setVideoFramesPlayed(this.onActivityResized);
            Long l = this.onNavigationEvent.get(this.onWarmupCompleted);
            this.extraCallbackWithResult.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.IAuthTabCallback.get(this.onWarmupCompleted);
            this.extraCallbackWithResult.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.extraCallbackWithResult.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.extraCallbackWithResult.build();
            this.onExtraCallback.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.onMinimized.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.extraCallbackWithResult = null;
        this.onWarmupCompleted = null;
        this.onExtraCallbackWithResult = 0;
        this.getInterfaceDescriptor = 0;
        this.onActivityResized = 0;
        this.IAuthTabCallback_Parcel = null;
        this.IAuthTabCallbackStub = null;
        this.asInterface = null;
        this.onMessageChannelReady = false;
    }

    private static Pair<String, String> IAuthTabCallback(String str) {
        String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(str, "-");
        return Pair.create(strArrOnNavigationEvent[0], strArrOnNavigationEvent.length >= 2 ? strArrOnNavigationEvent[1] : null);
    }

    private static int onExtraCallbackWithResult(Context context) {
        switch (TextFieldDecoratorModifierNodeExternalSyntheticLambda23.onNavigationEvent(context).IAuthTabCallback()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        if (iAuthTabCallbackDefault == null) {
            return 0;
        }
        Object[] objArr = {iAuthTabCallbackDefault.asBinder, iAuthTabCallbackDefault.onNavigationEvent};
        int iIntValue = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-2080733887, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 2080733890)).intValue();
        if (iIntValue == 0) {
            return 3;
        }
        if (iIntValue != 1) {
            return iIntValue != 2 ? 1 : 4;
        }
        return 5;
    }

    private static onExtraCallbackWithResult onWarmupCompleted(createInputConnection createinputconnection, Context context, boolean z) {
        int i2;
        boolean z2;
        if (createinputconnection.errorCode == 1001) {
            return new onExtraCallbackWithResult(20, 0);
        }
        if (createinputconnection instanceof AndroidSelectionHandles_androidKtExternalSyntheticLambda4) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4 = (AndroidSelectionHandles_androidKtExternalSyntheticLambda4) createinputconnection;
            z2 = androidSelectionHandles_androidKtExternalSyntheticLambda4.type == 1;
            i2 = androidSelectionHandles_androidKtExternalSyntheticLambda4.rendererFormatSupport;
        } else {
            i2 = 0;
            z2 = false;
        }
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (Throwable) RecordingInputConnection_androidKt.onExtraCallbackWithResult(createinputconnection.getCause());
        if (!(invalidResponseCodeException instanceof IOException)) {
            if (z2 && (i2 == 0 || i2 == 1)) {
                return new onExtraCallbackWithResult(35, 0);
            }
            if (z2 && i2 == 3) {
                return new onExtraCallbackWithResult(15, 0);
            }
            if (z2 && i2 == 2) {
                return new onExtraCallbackWithResult(23, 0);
            }
            if (invalidResponseCodeException instanceof AppBarKtExternalSyntheticLambda8.onWarmupCompleted) {
                return new onExtraCallbackWithResult(13, ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1451125048, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{((AppBarKtExternalSyntheticLambda8.onWarmupCompleted) invalidResponseCodeException).diagnosticInfo}, -1451125034)).intValue());
            }
            if (invalidResponseCodeException instanceof AppBarKtExternalSyntheticLambda10) {
                return new onExtraCallbackWithResult(14, ((AppBarKtExternalSyntheticLambda10) invalidResponseCodeException).errorCode);
            }
            if (invalidResponseCodeException instanceof OutOfMemoryError) {
                return new onExtraCallbackWithResult(14, 0);
            }
            if (invalidResponseCodeException instanceof SelectionManagerExternalSyntheticLambda2.onWarmupCompleted) {
                return new onExtraCallbackWithResult(17, ((SelectionManagerExternalSyntheticLambda2.onWarmupCompleted) invalidResponseCodeException).audioTrackState);
            }
            if (invalidResponseCodeException instanceof SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub) {
                return new onExtraCallbackWithResult(18, ((SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub) invalidResponseCodeException).errorCode);
            }
            if (invalidResponseCodeException instanceof MediaCodec.CryptoException) {
                int errorCode = ((MediaCodec.CryptoException) invalidResponseCodeException).getErrorCode();
                return new onExtraCallbackWithResult(onWarmupCompleted(errorCode), errorCode);
            }
            return new onExtraCallbackWithResult(22, 0);
        }
        if (invalidResponseCodeException instanceof HttpDataSource.InvalidResponseCodeException) {
            return new onExtraCallbackWithResult(5, invalidResponseCodeException.responseCode);
        }
        if ((invalidResponseCodeException instanceof HttpDataSource.InvalidContentTypeException) || (invalidResponseCodeException instanceof ParserException)) {
            return new onExtraCallbackWithResult(z ? 10 : 11, 0);
        }
        boolean z3 = invalidResponseCodeException instanceof HttpDataSource.HttpDataSourceException;
        if (z3 || (invalidResponseCodeException instanceof UdpDataSource.UdpDataSourceException)) {
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda23.onNavigationEvent(context).IAuthTabCallback() == 1) {
                return new onExtraCallbackWithResult(3, 0);
            }
            Throwable cause = invalidResponseCodeException.getCause();
            if (cause instanceof UnknownHostException) {
                return new onExtraCallbackWithResult(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new onExtraCallbackWithResult(7, 0);
            }
            if (z3 && ((HttpDataSource.HttpDataSourceException) invalidResponseCodeException).type == 1) {
                return new onExtraCallbackWithResult(4, 0);
            }
            return new onExtraCallbackWithResult(8, 0);
        }
        if (createinputconnection.errorCode == 1002) {
            return new onExtraCallbackWithResult(21, 0);
        }
        if (invalidResponseCodeException instanceof DrmSession.DrmSessionException) {
            Throwable th = (Throwable) RecordingInputConnection_androidKt.onExtraCallbackWithResult(invalidResponseCodeException.getCause());
            if (th instanceof MediaDrm.MediaDrmStateException) {
                int iIntValue = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1451125048, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()}, -1451125034)).intValue();
                return new onExtraCallbackWithResult(onWarmupCompleted(iIntValue), iIntValue);
            }
            if (th instanceof MediaDrmResetException) {
                return new onExtraCallbackWithResult(27, 0);
            }
            if (th instanceof NotProvisionedException) {
                return new onExtraCallbackWithResult(24, 0);
            }
            if (th instanceof DeniedByServerException) {
                return new onExtraCallbackWithResult(29, 0);
            }
            if (th instanceof TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4) {
                return new onExtraCallbackWithResult(23, 0);
            }
            if (th instanceof SelectionManager_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult) {
                return new onExtraCallbackWithResult(28, 0);
            }
            return new onExtraCallbackWithResult(30, 0);
        }
        if ((invalidResponseCodeException instanceof FileDataSource.FileDataSourceException) && (invalidResponseCodeException.getCause() instanceof FileNotFoundException)) {
            Throwable cause2 = ((Throwable) RecordingInputConnection_androidKt.onExtraCallbackWithResult(invalidResponseCodeException.getCause())).getCause();
            if ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) {
                return new onExtraCallbackWithResult(32, 0);
            }
            return new onExtraCallbackWithResult(31, 0);
        }
        return new onExtraCallbackWithResult(9, 0);
    }

    private static BasicTextContextMenuProviderExternalSyntheticLambda0 onNavigationEvent(ImmutableList<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback> immutableList) {
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0;
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback onextracallback = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback) it.next();
            for (int i2 = 0; i2 < onextracallback.onNavigationEvent; i2++) {
                if (onextracallback.onExtraCallback(i2) && (basicTextContextMenuProviderExternalSyntheticLambda0 = onextracallback.onWarmupCompleted(i2).IAuthTabCallback_Parcel) != null) {
                    return basicTextContextMenuProviderExternalSyntheticLambda0;
                }
            }
        }
        return null;
    }

    private static int onExtraCallbackWithResult(BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
        for (int i2 = 0; i2 < basicTextContextMenuProviderExternalSyntheticLambda0.onExtraCallback; i2++) {
            UUID uuid = basicTextContextMenuProviderExternalSyntheticLambda0.onNavigationEvent(i2).onExtraCallback;
            if (uuid.equals(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallback)) {
                return 3;
            }
            if (uuid.equals(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onNavigationEvent)) {
                return 2;
            }
            if (uuid.equals(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback)) {
                return 6;
            }
        }
        return 1;
    }

    private static int onWarmupCompleted(int i2) {
        switch (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i2)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    static final class onExtraCallbackWithResult {
        public final int IAuthTabCallback;
        public final int onExtraCallback;

        public onExtraCallbackWithResult(int i2, int i3) {
            this.onExtraCallback = i2;
            this.IAuthTabCallback = i3;
        }
    }

    static final class IAuthTabCallback {
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback;
        public final String onNavigationEvent;
        public final int onWarmupCompleted;

        public IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2, String str) {
            this.IAuthTabCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.onWarmupCompleted = i2;
            this.onNavigationEvent = str;
        }
    }
}
