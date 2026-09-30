package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.SimpleBasePlayer$;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import o.AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda6;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda8;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda9;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda2;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda7;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3;
import o.MultiSelectionLayoutExternalSyntheticLambda0;
import o.SelectionContainerKtExternalSyntheticLambda0;
import o.SelectionContainerKtExternalSyntheticLambda10;
import o.SelectionContainerKtExternalSyntheticLambda11;
import o.SelectionContainerKtExternalSyntheticLambda6;
import o.SelectionGesturesKtExternalSyntheticLambda0;
import o.SelectionManagerExternalSyntheticLambda2;
import o.TextAnnotatedStringNodeExternalSyntheticLambda1;
import o.TextContextMenuProviderKtExternalSyntheticLambda0;
import o.TextFieldCoreModifierNodeExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda19;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidSelectionHandles_androidKtExternalSyntheticLambda9 extends TextContextMenuToolbarHandlerNodeExternalSyntheticLambda0 implements AndroidSelectionHandles_androidKtExternalSyntheticLambda8 {
    private final Context IAuthTabCallback;
    private TextStringSimpleNodeExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private final Looper IAuthTabCallbackStub;
    private final CopyOnWriteArraySet<AndroidSelectionHandles_androidKtExternalSyntheticLambda8.IAuthTabCallback> IAuthTabCallbackStubProxy;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 IAuthTabCallback_Parcel;
    private ImeEditCommand_androidKtExternalSyntheticLambda2 ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda19<AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback> ICustomTabsCallbackStubProxy;
    private boolean ICustomTabsCallback_Parcel;
    private TextFieldBufferExternalSyntheticLambda0 ICustomTabsService;
    private int ICustomTabsServiceDefault;
    private int ICustomTabsServiceStub;
    private SelectionContainerKtExternalSyntheticLambda2 ICustomTabsServiceStubProxy;
    private final long ICustomTabsService_Parcel;
    private SelectionContainerKtExternalSyntheticLambda3 IEngagementSignalsCallback;
    private boolean IEngagementSignalsCallbackDefault;
    private BottomNavigationKtExternalSyntheticLambda7 IEngagementSignalsCallbackStub;
    private boolean IEngagementSignalsCallbackStubProxy;
    private SurfaceHolder IEngagementSignalsCallback_Parcel;
    private final SelectionGesturesKtExternalSyntheticLambda0 IPostMessageService;
    private final SelectionContainerKtExternalSyntheticLambda6 IPostMessageServiceDefault;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda25 IPostMessageServiceStub;
    private TextureView IPostMessageServiceStubProxy;
    private final boolean IPostMessageService_Parcel;
    private int ITrustedWebActivityCallback;
    private final ComposableSingletonsAppBarKtExternalSyntheticLambda0 ITrustedWebActivityCallbackDefault;
    private boolean ITrustedWebActivityCallbackStub;
    private TextStringSimpleNodeExternalSyntheticLambda1 ITrustedWebActivityCallbackStubProxy;
    private Object ITrustedWebActivityCallback_Parcel;
    private int ITrustedWebActivityService;
    private final SelectionGesturesKtExternalSyntheticLambda1 ITrustedWebActivityServiceDefault;
    private AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted access000;
    private final ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 access100;
    private final long access200;
    private CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 areNotificationsEnabled;
    private TextContextMenuHelperApi28ExternalSyntheticLambda5 asBinder;
    private final TextAnnotatedStringNodeExternalSyntheticLambda1 asInterface;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 cancelNotification;
    private final long extraCallback;
    private final onExtraCallback extraCallbackWithResult;
    private Surface extraCommand;
    private float getActiveNotifications;
    private final TextFieldCoreModifierNodeExternalSyntheticLambda0<Integer> getInterfaceDescriptor;
    private final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 getSmallIconBitmap;
    private final List<IAuthTabCallback> isEngagementSignalsApiAvailable;
    private final BottomDrawerStateExternalSyntheticLambda2.onExtraCallback mayLaunchUrl;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback newAuthTabSession;
    private boolean newSession;
    private int newSessionWithExtras;
    private final SelectionContainerKtExternalSyntheticLambda7 notifyNotificationWithChannel;
    private boolean onActivityLayout;
    private final onNavigationEvent onActivityResized;
    final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onExtraCallback;
    private final SelectionContainerKtExternalSyntheticLambda8 onExtraCallbackWithResult;
    private TextFieldBufferExternalSyntheticLambda0 onGreatestScrollPercentageIncreased;
    private ImmutableSet<Integer> onMessageChannelReady;
    private boolean onMinimized;
    final ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 onNavigationEvent;
    private final MultiSelectionLayoutExternalSyntheticLambda0 onPostMessage;
    private long onRelationshipValidationResult;
    private SphericalGLSurfaceView onSessionEnded;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onTransact;
    private final long onUnminimized;
    private boolean onVerticalScrollEvent;
    private int postMessage;
    private SelectionContainerKtExternalSyntheticLambda11 prefetch;
    private TextFieldBufferExternalSyntheticLambda0 prefetchWithMultipleUrls;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda2 readTypedObject;
    private boolean receiveFile;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 requestPostMessageChannel;
    private AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted requestPostMessageChannelWithExtras;
    private final MultiSelectionLayoutExternalSyntheticLambda0.onExtraCallbackWithResult setEngagementSignalsCallback;
    private final Renderer[] updateVisuals;
    private boolean validateRelationship;
    private PriorityTaskManager warmup;
    private final Renderer[] writeTypedList;
    private final TextFieldCoreModifierNodeExternalSyntheticLambda2 writeTypedObject = new TextFieldCoreModifierNodeExternalSyntheticLambda2();

    static {
        HandwritingDetectorNodeExternalSyntheticLambda0.onExtraCallback("media3.exoplayer");
    }

    public AndroidSelectionHandles_androidKtExternalSyntheticLambda9(AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onNavigationEvent onnavigationevent, @Nullable AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) {
        try {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback + "]");
            this.IAuthTabCallback = onnavigationevent.asInterface.getApplicationContext();
            this.onExtraCallbackWithResult = (SelectionContainerKtExternalSyntheticLambda8) onnavigationevent.onWarmupCompleted.apply(onnavigationevent.onExtraCallback);
            this.ICustomTabsServiceStub = onnavigationevent.onPostMessage;
            this.warmup = onnavigationevent.onActivityLayout;
            this.asBinder = onnavigationevent.IAuthTabCallback;
            this.ITrustedWebActivityService = onnavigationevent.prefetch;
            this.ITrustedWebActivityCallback = onnavigationevent.ICustomTabsCallback_Parcel;
            this.onVerticalScrollEvent = onnavigationevent.onUnminimized;
            this.extraCallback = onnavigationevent.asBinder;
            onExtraCallback onextracallback = new onExtraCallback();
            this.extraCallbackWithResult = onextracallback;
            this.onActivityResized = new onNavigationEvent();
            Handler handler = new Handler(onnavigationevent.access100);
            RenderersFactory renderersFactory = (RenderersFactory) onnavigationevent.onMinimized.get();
            Renderer[] rendererArrIAuthTabCallback = renderersFactory.IAuthTabCallback(handler, onextracallback, onextracallback, onextracallback, onextracallback);
            this.updateVisuals = rendererArrIAuthTabCallback;
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(rendererArrIAuthTabCallback.length > 0);
            this.writeTypedList = new Renderer[rendererArrIAuthTabCallback.length];
            int i2 = 0;
            while (true) {
                Renderer[] rendererArr = this.writeTypedList;
                if (i2 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = this.updateVisuals[i2];
                onExtraCallback onextracallback2 = this.extraCallbackWithResult;
                rendererArr[i2] = renderersFactory.IAuthTabCallback(renderer, handler, onextracallback2, onextracallback2, onextracallback2, onextracallback2);
                i2++;
            }
            ComposableSingletonsAppBarKtExternalSyntheticLambda0 composableSingletonsAppBarKtExternalSyntheticLambda0 = (ComposableSingletonsAppBarKtExternalSyntheticLambda0) onnavigationevent.extraCommand.get();
            this.ITrustedWebActivityCallbackDefault = composableSingletonsAppBarKtExternalSyntheticLambda0;
            this.mayLaunchUrl = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallback) onnavigationevent.ICustomTabsCallback.get();
            ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 = (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2) onnavigationevent.onExtraCallbackWithResult.get();
            this.access100 = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
            this.IPostMessageService_Parcel = onnavigationevent.ICustomTabsService;
            this.ICustomTabsServiceStubProxy = onnavigationevent.ICustomTabsCallbackStubProxy;
            this.ICustomTabsService_Parcel = onnavigationevent.ICustomTabsCallbackStub;
            this.access200 = onnavigationevent.onRelationshipValidationResult;
            this.onUnminimized = onnavigationevent.extraCallbackWithResult;
            this.IEngagementSignalsCallback = onnavigationevent.onActivityResized;
            this.ICustomTabsCallback_Parcel = onnavigationevent.writeTypedObject;
            Looper looper = onnavigationevent.access100;
            this.IAuthTabCallbackStub = looper;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0 = onnavigationevent.onExtraCallback;
            this.IAuthTabCallback_Parcel = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
            AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda02 = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 == null ? this : androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0;
            this.getSmallIconBitmap = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda02;
            this.ICustomTabsCallbackStubProxy = new TextFieldDecoratorModifierNodeExternalSyntheticLambda19<>(looper, textFieldDecoratorModifierNodeExternalSyntheticLambda0, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onExtraCallback() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda24
                public final void invoke(Object obj, TextContextMenuProviderKtExternalSyntheticLambda0 textContextMenuProviderKtExternalSyntheticLambda0) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallback(this.f$0.getSmallIconBitmap, new AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onExtraCallbackWithResult(textContextMenuProviderKtExternalSyntheticLambda0));
                }
            });
            this.IAuthTabCallbackStubProxy = new CopyOnWriteArraySet<>();
            this.isEngagementSignalsApiAvailable = new ArrayList();
            this.IEngagementSignalsCallbackStub = new BottomNavigationKtExternalSyntheticLambda7.onExtraCallbackWithResult(0);
            this.requestPostMessageChannelWithExtras = AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted.IAuthTabCallback;
            Renderer[] rendererArr2 = this.updateVisuals;
            ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = new ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0(new RendererConfiguration[rendererArr2.length], new ColorsKtExternalSyntheticLambda0[rendererArr2.length], CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12.onExtraCallback, null);
            this.onNavigationEvent = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0;
            this.newAuthTabSession = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
            AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onWarmupCompleted = new AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult().onExtraCallbackWithResult(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}).IAuthTabCallback(29, composableSingletonsAppBarKtExternalSyntheticLambda0.onExtraCallbackWithResult()).IAuthTabCallback(23, onnavigationevent.IAuthTabCallbackDefault).IAuthTabCallback(25, onnavigationevent.IAuthTabCallbackDefault).IAuthTabCallback(33, onnavigationevent.IAuthTabCallbackDefault).IAuthTabCallback(26, onnavigationevent.IAuthTabCallbackDefault).IAuthTabCallback(34, onnavigationevent.IAuthTabCallbackDefault).onWarmupCompleted();
            this.onExtraCallback = onWarmupCompleted;
            this.access000 = new AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult().onExtraCallbackWithResult(onWarmupCompleted).onNavigationEvent(4).onNavigationEvent(10).onWarmupCompleted();
            this.requestPostMessageChannel = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper, (Handler.Callback) null);
            MultiSelectionLayoutExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = new MultiSelectionLayoutExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda25
                @Override // o.MultiSelectionLayoutExternalSyntheticLambda0.onExtraCallbackWithResult
                public final void onPlaybackInfoUpdate(MultiSelectionLayoutExternalSyntheticLambda0.onNavigationEvent onnavigationevent2) {
                    AndroidSelectionHandles_androidKtExternalSyntheticLambda9 androidSelectionHandles_androidKtExternalSyntheticLambda9 = this.f$0;
                    androidSelectionHandles_androidKtExternalSyntheticLambda9.requestPostMessageChannel.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda20
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.onExtraCallbackWithResult(onnavigationevent2);
                        }
                    });
                }
            };
            this.setEngagementSignalsCallback = onextracallbackwithresult;
            this.prefetch = SelectionContainerKtExternalSyntheticLambda11.onNavigationEvent(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0);
            this.onExtraCallbackWithResult.onWarmupCompleted(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda02, looper);
            SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12 = new SelectionManagerExternalSyntheticLambda12(onnavigationevent.readTypedObject);
            MultiSelectionLayoutExternalSyntheticLambda0 multiSelectionLayoutExternalSyntheticLambda0 = new MultiSelectionLayoutExternalSyntheticLambda0(this.IAuthTabCallback, this.updateVisuals, this.writeTypedList, composableSingletonsAppBarKtExternalSyntheticLambda0, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, (adjust) onnavigationevent.getInterfaceDescriptor.get(), composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, this.ICustomTabsServiceDefault, this.IEngagementSignalsCallbackDefault, this.onExtraCallbackWithResult, this.ICustomTabsServiceStubProxy, onnavigationevent.IAuthTabCallbackStubProxy, onnavigationevent.onMessageChannelReady, this.ICustomTabsCallback_Parcel, onnavigationevent.onTransact, looper, textFieldDecoratorModifierNodeExternalSyntheticLambda0, onextracallbackwithresult, selectionManagerExternalSyntheticLambda12, onnavigationevent.extraCallback, this.requestPostMessageChannelWithExtras, this.onActivityResized);
            this.onPostMessage = multiSelectionLayoutExternalSyntheticLambda0;
            Looper looperIAuthTabCallback = multiSelectionLayoutExternalSyntheticLambda0.IAuthTabCallback();
            this.getActiveNotifications = 1.0f;
            this.ICustomTabsServiceDefault = 0;
            TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0 = TextFieldBufferExternalSyntheticLambda0.onNavigationEvent;
            this.ICustomTabsService = textFieldBufferExternalSyntheticLambda0;
            this.prefetchWithMultipleUrls = textFieldBufferExternalSyntheticLambda0;
            this.onGreatestScrollPercentageIncreased = textFieldBufferExternalSyntheticLambda0;
            this.ICustomTabsCallbackDefault = -1;
            this.ICustomTabsCallback = ImeEditCommand_androidKtExternalSyntheticLambda2.onNavigationEvent;
            this.ITrustedWebActivityCallbackStub = true;
            onExtraCallback(this.onExtraCallbackWithResult);
            composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.onWarmupCompleted(new Handler(looper), this.onExtraCallbackWithResult);
            onNavigationEvent(this.extraCallbackWithResult);
            long j = onnavigationevent.IAuthTabCallbackStub;
            if (j > 0) {
                multiSelectionLayoutExternalSyntheticLambda0.onWarmupCompleted(j);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback, this, onnavigationevent.mayLaunchUrl, selectionManagerExternalSyntheticLambda12);
            }
            TextFieldCoreModifierNodeExternalSyntheticLambda0<Integer> textFieldCoreModifierNodeExternalSyntheticLambda0 = new TextFieldCoreModifierNodeExternalSyntheticLambda0<>(0, looperIAuthTabCallback, looper, textFieldDecoratorModifierNodeExternalSyntheticLambda0, new TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda26
                @Override // o.TextFieldCoreModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult
                public final void onStateChanged(Object obj, Object obj2) {
                    this.f$0.IAuthTabCallback(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.getInterfaceDescriptor = textFieldCoreModifierNodeExternalSyntheticLambda0;
            textFieldCoreModifierNodeExternalSyntheticLambda0.IAuthTabCallback(new Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidSelectionHandles_androidKtExternalSyntheticLambda9 androidSelectionHandles_androidKtExternalSyntheticLambda9 = this.f$0;
                    androidSelectionHandles_androidKtExternalSyntheticLambda9.getInterfaceDescriptor.onNavigationEvent(Integer.valueOf(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda9.IAuthTabCallback)));
                }
            });
            TextAnnotatedStringNodeExternalSyntheticLambda1 textAnnotatedStringNodeExternalSyntheticLambda1 = new TextAnnotatedStringNodeExternalSyntheticLambda1(onnavigationevent.asInterface, looperIAuthTabCallback, onnavigationevent.access100, this.extraCallbackWithResult, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
            this.asInterface = textAnnotatedStringNodeExternalSyntheticLambda1;
            textAnnotatedStringNodeExternalSyntheticLambda1.onNavigationEvent(onnavigationevent.IAuthTabCallback_Parcel);
            if (onnavigationevent.isEngagementSignalsApiAvailable) {
                SelectionGesturesKtExternalSyntheticLambda0 selectionGesturesKtExternalSyntheticLambda0 = onnavigationevent.ICustomTabsCallbackDefault;
                this.IPostMessageService = selectionGesturesKtExternalSyntheticLambda0;
                selectionGesturesKtExternalSyntheticLambda0.onWarmupCompleted(new SelectionGesturesKtExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda28
                    @Override // o.SelectionGesturesKtExternalSyntheticLambda0.onExtraCallbackWithResult
                    public final void onSelectedOutputSuitabilityChanged(boolean z) {
                        this.f$0.onExtraCallbackWithResult(z);
                    }
                }, this.IAuthTabCallback, looper, looperIAuthTabCallback, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
            } else {
                this.IPostMessageService = null;
            }
            if (onnavigationevent.IAuthTabCallbackDefault) {
                this.IPostMessageServiceDefault = new SelectionContainerKtExternalSyntheticLambda6(onnavigationevent.asInterface, this.extraCallbackWithResult, this.asBinder.IAuthTabCallback(), looperIAuthTabCallback, looper, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
            } else {
                this.IPostMessageServiceDefault = null;
            }
            SelectionGesturesKtExternalSyntheticLambda1 selectionGesturesKtExternalSyntheticLambda1 = new SelectionGesturesKtExternalSyntheticLambda1(onnavigationevent.asInterface, looperIAuthTabCallback, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
            this.ITrustedWebActivityServiceDefault = selectionGesturesKtExternalSyntheticLambda1;
            selectionGesturesKtExternalSyntheticLambda1.onNavigationEvent(onnavigationevent.newSession != 0);
            SelectionContainerKtExternalSyntheticLambda7 selectionContainerKtExternalSyntheticLambda7 = new SelectionContainerKtExternalSyntheticLambda7(onnavigationevent.asInterface, looperIAuthTabCallback, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
            this.notifyNotificationWithChannel = selectionContainerKtExternalSyntheticLambda7;
            selectionContainerKtExternalSyntheticLambda7.onWarmupCompleted(onnavigationevent.newSession == 2);
            this.readTypedObject = BasicTextContextMenuProviderKtExternalSyntheticLambda2.onWarmupCompleted;
            this.areNotificationsEnabled = CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onExtraCallbackWithResult;
            this.IPostMessageServiceStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult;
            multiSelectionLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(this.IEngagementSignalsCallback);
            multiSelectionLayoutExternalSyntheticLambda0.IAuthTabCallback(this.asBinder, onnavigationevent.access000);
            onNavigationEvent(1, 3, this.asBinder);
            onNavigationEvent(2, 4, Integer.valueOf(this.ITrustedWebActivityService));
            onNavigationEvent(2, 5, Integer.valueOf(this.ITrustedWebActivityCallback));
            onNavigationEvent(1, 9, Boolean.valueOf(this.onVerticalScrollEvent));
            onNavigationEvent(6, 8, this.onActivityResized);
            onWarmupCompleted(16, Integer.valueOf(this.ICustomTabsServiceStub));
        } finally {
            this.writeTypedObject.IAuthTabCallback();
        }
    }

    public boolean IPostMessageServiceStubProxy() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.getInterfaceDescriptor;
    }

    public Looper ITrustedWebActivityCallbackStub() {
        return this.onPostMessage.IAuthTabCallback();
    }

    public Looper X_() {
        return this.IAuthTabCallbackStub;
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda0 ITrustedWebActivityCallbackDefault() {
        return this.IAuthTabCallback_Parcel;
    }

    public void onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda8.IAuthTabCallback iAuthTabCallback) {
        this.IAuthTabCallbackStubProxy.add(iAuthTabCallback);
    }

    public AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onRelationshipValidationResult() {
        ITrustedWebActivityCallback_Parcel();
        return this.access000;
    }

    public int setEngagementSignalsCallback() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.IAuthTabCallbackStub;
    }

    public int validateRelationship() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.IAuthTabCallbackStubProxy;
    }

    /* renamed from: IEngagementSignalsCallbackStub, reason: merged with bridge method [inline-methods] */
    public AndroidSelectionHandles_androidKtExternalSyntheticLambda4 updateVisuals() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.IAuthTabCallbackDefault;
    }

    public void IPostMessageService() {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStub != 1) {
            return;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallback = selectionContainerKtExternalSyntheticLambda11.onExtraCallback((AndroidSelectionHandles_androidKtExternalSyntheticLambda4) null);
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallback, selectionContainerKtExternalSyntheticLambda11OnExtraCallback.ICustomTabsCallback.onExtraCallback() ? 4 : 2);
        this.postMessage++;
        this.onPostMessage.onNavigationEvent();
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public void IAuthTabCallback(List<TextFieldStateKtExternalSyntheticLambda0> list, boolean z) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        onWarmupCompleted(onNavigationEvent(list), z);
    }

    public void onWarmupCompleted(List<TextFieldStateKtExternalSyntheticLambda0> list, int i2, long j) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        IAuthTabCallback(onNavigationEvent(list), i2, j);
    }

    public void onWarmupCompleted(List<BottomDrawerStateExternalSyntheticLambda2> list, boolean z) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        onExtraCallbackWithResult(list, -1, -9223372036854775807L, z);
    }

    public void IAuthTabCallback(List<BottomDrawerStateExternalSyntheticLambda2> list, int i2, long j) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        onExtraCallbackWithResult(list, i2, j, false);
    }

    public void onExtraCallbackWithResult(int i2, List<TextFieldStateKtExternalSyntheticLambda0> list) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        IAuthTabCallback(i2, onNavigationEvent(list));
    }

    public void IAuthTabCallback(int i2, List<BottomDrawerStateExternalSyntheticLambda2> list) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0);
        int iMin = Math.min(i2, this.isEngagementSignalsApiAvailable.size());
        if (this.isEngagementSignalsApiAvailable.isEmpty()) {
            onWarmupCompleted(list, this.ICustomTabsCallbackDefault == -1);
        } else {
            IAuthTabCallback(onExtraCallback(this.prefetch, iMin, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public void onExtraCallbackWithResult(int i2, int i3) {
        ITrustedWebActivityCallback_Parcel();
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i3 >= i2);
        int size = this.isEngagementSignalsApiAvailable.size();
        int iMin = Math.min(i3, size);
        if (i2 >= size || i2 == iMin) {
            return;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(this.prefetch, i2, iMin);
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, 0, !selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.onWarmupCompleted.onExtraCallback.equals(this.prefetch.onWarmupCompleted.onExtraCallback), 4, onNavigationEvent(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback), -1, false);
    }

    public void onExtraCallback(int i2, int i3, int i4) {
        ITrustedWebActivityCallback_Parcel();
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i2 <= i3 && i4 >= 0);
        int size = this.isEngagementSignalsApiAvailable.size();
        int iMin = Math.min(i3, size);
        int iMin2 = Math.min(i4, size - (iMin - i2));
        if (i2 >= size || i2 == iMin || i2 == iMin2) {
            return;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        this.postMessage++;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.isEngagementSignalsApiAvailable, i2, iMin, iMin2);
        this.IEngagementSignalsCallbackStub = this.IEngagementSignalsCallbackStub.onWarmupCompleted(i2, iMin, iMin2);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel = IPostMessageService_Parcel();
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onExtraCallback(selectionContainerKtExternalSyntheticLambda11), onWarmupCompleted(this.prefetch)));
        this.onPostMessage.IAuthTabCallback(i2, iMin, iMin2, this.IEngagementSignalsCallbackStub);
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public void onExtraCallbackWithResult(int i2, int i3, List<TextFieldStateKtExternalSyntheticLambda0> list) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        ITrustedWebActivityCallback_Parcel();
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i3 >= i2);
        int size = this.isEngagementSignalsApiAvailable.size();
        if (i2 > size) {
            return;
        }
        int iMin = Math.min(i3, size);
        if (onExtraCallback(i2, iMin, list)) {
            IAuthTabCallback(i2, iMin, list);
            return;
        }
        List<BottomDrawerStateExternalSyntheticLambda2> listOnNavigationEvent = onNavigationEvent(list);
        if (this.isEngagementSignalsApiAvailable.isEmpty()) {
            onWarmupCompleted(listOnNavigationEvent, this.ICustomTabsCallbackDefault == -1);
        } else {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(onExtraCallback(this.prefetch, iMin, listOnNavigationEvent), i2, iMin);
            IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, 0, !selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.onWarmupCompleted.onExtraCallback.equals(this.prefetch.onWarmupCompleted.onExtraCallback), 4, onNavigationEvent(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback), -1, false);
        }
    }

    public void IAuthTabCallback(boolean z) {
        ITrustedWebActivityCallback_Parcel();
        onExtraCallback(z, 1);
    }

    public boolean prefetchWithMultipleUrls() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.asInterface;
    }

    public void IAuthTabCallbackDefault(final int i2) {
        ITrustedWebActivityCallback_Parcel();
        if (this.ICustomTabsServiceDefault != i2) {
            this.ICustomTabsServiceDefault = i2;
            this.onPostMessage.onExtraCallbackWithResult(i2);
            this.ICustomTabsCallbackStubProxy.onExtraCallback(8, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda21
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).IAuthTabCallback(i2);
                }
            });
            ITrustedWebActivityService();
            this.ICustomTabsCallbackStubProxy.onExtraCallback();
        }
    }

    public int warmup() {
        ITrustedWebActivityCallback_Parcel();
        return this.ICustomTabsServiceDefault;
    }

    public void onExtraCallback(final boolean z) {
        ITrustedWebActivityCallback_Parcel();
        if (this.IEngagementSignalsCallbackDefault != z) {
            this.IEngagementSignalsCallbackDefault = z;
            this.onPostMessage.onExtraCallback(z);
            this.ICustomTabsCallbackStubProxy.onExtraCallback(9, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda23
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).IAuthTabCallback(z);
                }
            });
            ITrustedWebActivityService();
            this.ICustomTabsCallbackStubProxy.onExtraCallback();
        }
    }

    public boolean ICustomTabsServiceStubProxy() {
        ITrustedWebActivityCallback_Parcel();
        return this.IEngagementSignalsCallbackDefault;
    }

    public boolean onVerticalScrollEvent() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.onExtraCallback;
    }

    @Override // o.TextContextMenuToolbarHandlerNodeExternalSyntheticLambda0
    public void onWarmupCompleted(int i2, long j, int i3, boolean z) {
        ITrustedWebActivityCallback_Parcel();
        if (i2 != -1) {
            RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0);
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.prefetch.ICustomTabsCallback;
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() || i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult()) {
                this.onExtraCallbackWithResult.onWarmupCompleted();
                this.postMessage++;
                if (IPostMessageServiceDefault()) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    MultiSelectionLayoutExternalSyntheticLambda0.onNavigationEvent onnavigationevent = new MultiSelectionLayoutExternalSyntheticLambda0.onNavigationEvent(this.prefetch);
                    onnavigationevent.onExtraCallbackWithResult(1);
                    this.setEngagementSignalsCallback.onPlaybackInfoUpdate(onnavigationevent);
                    return;
                }
                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = this.prefetch;
                int i4 = selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.IAuthTabCallbackStub;
                if (i4 == 3 || (i4 == 4 && !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback())) {
                    selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(this.prefetch, 2);
                }
                int iIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, i2, j));
                this.onPostMessage.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j));
                IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult, 0, true, 1, onNavigationEvent(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult), iIsEngagementSignalsApiAvailable, z);
            }
        }
    }

    public long ICustomTabsServiceDefault() {
        ITrustedWebActivityCallback_Parcel();
        return this.ICustomTabsService_Parcel;
    }

    public long writeTypedList() {
        ITrustedWebActivityCallback_Parcel();
        return this.access200;
    }

    public long receiveFile() {
        ITrustedWebActivityCallback_Parcel();
        return this.onUnminimized;
    }

    public void onExtraCallbackWithResult(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        ITrustedWebActivityCallback_Parcel();
        if (androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 == null) {
            androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback;
        }
        if (this.prefetch.onTransact.equals(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1)) {
            return;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = this.prefetch.IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
        this.postMessage++;
        this.onPostMessage.onWarmupCompleted(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 requestPostMessageChannel() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.onTransact;
    }

    public void IEngagementSignalsCallbackStubProxy() {
        ITrustedWebActivityCallback_Parcel();
        onWarmupCompleted((AndroidSelectionHandles_androidKtExternalSyntheticLambda4) null);
        this.ICustomTabsCallback = new ImeEditCommand_androidKtExternalSyntheticLambda2(ImmutableList.of(), this.prefetch.access100);
    }

    public void IEngagementSignalsCallback_Parcel() {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback + "] [" + HandwritingDetectorNodeExternalSyntheticLambda0.onExtraCallback() + "]");
        ITrustedWebActivityCallback_Parcel();
        this.asInterface.onNavigationEvent(false);
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onWarmupCompleted();
        }
        this.ITrustedWebActivityServiceDefault.onExtraCallback(false);
        this.notifyNotificationWithChannel.onExtraCallbackWithResult(false);
        SelectionGesturesKtExternalSyntheticLambda0 selectionGesturesKtExternalSyntheticLambda0 = this.IPostMessageService;
        if (selectionGesturesKtExternalSyntheticLambda0 != null) {
            selectionGesturesKtExternalSyntheticLambda0.IAuthTabCallback();
        }
        if (!this.onPostMessage.onWarmupCompleted()) {
            this.ICustomTabsCallbackStubProxy.IAuthTabCallback(10, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda19
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallbackWithResult(AndroidSelectionHandles_androidKtExternalSyntheticLambda4.onExtraCallback(new AndroidSelectionHandles_androidKtExternalSyntheticLambda6(1), 1003));
                }
            });
        }
        this.ICustomTabsCallbackStubProxy.onNavigationEvent();
        this.requestPostMessageChannel.onExtraCallbackWithResult((Object) null);
        this.access100.onExtraCallback(this.onExtraCallbackWithResult);
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        if (selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor) {
            this.prefetch = selectionContainerKtExternalSyntheticLambda11.onExtraCallbackWithResult();
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(this.prefetch, 1);
        this.prefetch = selectionContainerKtExternalSyntheticLambda11IAuthTabCallback;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.onWarmupCompleted);
        this.prefetch = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult;
        selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.onNavigationEvent = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.access100;
        this.prefetch.extraCallbackWithResult = 0L;
        this.onExtraCallbackWithResult.onNavigationEvent();
        ITrustedWebActivityCallbackStubProxy();
        Surface surface = this.extraCommand;
        if (surface != null) {
            surface.release();
            this.extraCommand = null;
        }
        if (this.onActivityLayout) {
            ((PriorityTaskManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.warmup)).onExtraCallback(this.ICustomTabsServiceStub);
            this.onActivityLayout = false;
        }
        this.ICustomTabsCallback = ImeEditCommand_androidKtExternalSyntheticLambda2.onNavigationEvent;
        this.receiveFile = true;
    }

    public SelectionContainerKtExternalSyntheticLambda0 onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
        ITrustedWebActivityCallback_Parcel();
        return IAuthTabCallback(onwarmupcompleted);
    }

    public int mayLaunchUrl() {
        ITrustedWebActivityCallback_Parcel();
        if (this.prefetch.ICustomTabsCallback.onExtraCallback()) {
            return this.ICustomTabsCallbackStub;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        return selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback);
    }

    public int isEngagementSignalsApiAvailable() {
        ITrustedWebActivityCallback_Parcel();
        int iOnExtraCallback = onExtraCallback(this.prefetch);
        if (iOnExtraCallback == -1) {
            return 0;
        }
        return iOnExtraCallback;
    }

    public long newAuthTabSession() {
        ITrustedWebActivityCallback_Parcel();
        if (IPostMessageServiceDefault()) {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted;
            selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.newAuthTabSession);
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.newAuthTabSession.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback));
        }
        return onNavigationEvent();
    }

    public long ICustomTabsCallback_Parcel() {
        ITrustedWebActivityCallback_Parcel();
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(onNavigationEvent(this.prefetch));
    }

    public long onUnminimized() {
        ITrustedWebActivityCallback_Parcel();
        if (IPostMessageServiceDefault()) {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
            if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback.equals(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted)) {
                return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.prefetch.onNavigationEvent);
            }
            return newAuthTabSession();
        }
        return ICustomTabsCallbackStub();
    }

    public long access200() {
        ITrustedWebActivityCallback_Parcel();
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.prefetch.extraCallbackWithResult);
    }

    public boolean IPostMessageServiceDefault() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.onWarmupCompleted.IAuthTabCallback();
    }

    public int ICustomTabsCallbackDefault() {
        ITrustedWebActivityCallback_Parcel();
        if (IPostMessageServiceDefault()) {
            return this.prefetch.onWarmupCompleted.onWarmupCompleted;
        }
        return -1;
    }

    public int extraCommand() {
        ITrustedWebActivityCallback_Parcel();
        if (IPostMessageServiceDefault()) {
            return this.prefetch.onWarmupCompleted.IAuthTabCallback;
        }
        return -1;
    }

    public long ICustomTabsCallbackStubProxy() {
        ITrustedWebActivityCallback_Parcel();
        return onWarmupCompleted(this.prefetch);
    }

    public long ICustomTabsCallbackStub() {
        ITrustedWebActivityCallback_Parcel();
        if (this.prefetch.ICustomTabsCallback.onExtraCallback()) {
            return this.onRelationshipValidationResult;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback.onNavigationEvent != selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onNavigationEvent) {
            return selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).IAuthTabCallback();
        }
        long j = selectionContainerKtExternalSyntheticLambda11.onNavigationEvent;
        if (this.prefetch.IAuthTabCallback.IAuthTabCallback()) {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.prefetch;
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallbackOnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda112.ICustomTabsCallback.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda112.IAuthTabCallback.onExtraCallback, this.newAuthTabSession);
            long jOnNavigationEvent = onextracallbackOnExtraCallbackWithResult.onNavigationEvent(this.prefetch.IAuthTabCallback.onWarmupCompleted);
            j = jOnNavigationEvent == Long.MIN_VALUE ? onextracallbackOnExtraCallbackWithResult.IAuthTabCallback : jOnNavigationEvent;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = this.prefetch;
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(onNavigationEvent(selectionContainerKtExternalSyntheticLambda113.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda113.IAuthTabCallback, j));
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 newSessionWithExtras() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.writeTypedObject.IAuthTabCallback;
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 ICustomTabsService_Parcel() {
        ITrustedWebActivityCallback_Parcel();
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnNavigationEvent = this.ITrustedWebActivityCallbackDefault.onNavigationEvent();
        return this.validateRelationship ? coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnNavigationEvent.ICustomTabsCallback_Parcel().onNavigationEvent(this.onMessageChannelReady).onNavigationEvent() : coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnNavigationEvent;
    }

    public void IAuthTabCallback(final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnExtraCallback;
        ITrustedWebActivityCallback_Parcel();
        if (this.ITrustedWebActivityCallbackDefault.onExtraCallbackWithResult()) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3ICustomTabsService_Parcel = ICustomTabsService_Parcel();
            if (this.validateRelationship) {
                this.onMessageChannelReady = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.onNavigationEvent;
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnExtraCallback = onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, this.IEngagementSignalsCallback.onNavigationEvent);
            } else {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnExtraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3;
            }
            if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnExtraCallback.equals(this.ITrustedWebActivityCallbackDefault.onNavigationEvent())) {
                this.ITrustedWebActivityCallbackDefault.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3OnExtraCallback);
            }
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3ICustomTabsService_Parcel.equals(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3)) {
                return;
            }
            this.ICustomTabsCallbackStubProxy.IAuthTabCallback(19, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda31
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3);
                }
            });
        }
    }

    public TextFieldBufferExternalSyntheticLambda0 requestPostMessageChannelWithExtras() {
        ITrustedWebActivityCallback_Parcel();
        return this.ICustomTabsService;
    }

    public TextFieldBufferExternalSyntheticLambda0 ICustomTabsServiceStub() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetchWithMultipleUrls;
    }

    public void IAuthTabCallback(TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0) {
        ITrustedWebActivityCallback_Parcel();
        if (textFieldBufferExternalSyntheticLambda0.equals(this.prefetchWithMultipleUrls)) {
            return;
        }
        this.prefetchWithMultipleUrls = textFieldBufferExternalSyntheticLambda0;
        this.ICustomTabsCallbackStubProxy.IAuthTabCallback(15, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda22
            public final void invoke(Object obj) {
                ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(this.f$0.prefetchWithMultipleUrls);
            }
        });
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 newSession() {
        ITrustedWebActivityCallback_Parcel();
        return this.prefetch.ICustomTabsCallback;
    }

    public CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 IEngagementSignalsCallback() {
        ITrustedWebActivityCallback_Parcel();
        return this.areNotificationsEnabled;
    }

    public void IPostMessageServiceStub() {
        ITrustedWebActivityCallback_Parcel();
        ITrustedWebActivityCallbackStubProxy();
        onWarmupCompleted((Object) null);
        onNavigationEvent(0, 0);
    }

    public void IAuthTabCallback(@Nullable Surface surface) {
        ITrustedWebActivityCallback_Parcel();
        ITrustedWebActivityCallbackStubProxy();
        onWarmupCompleted(surface);
        int i2 = surface == null ? 0 : -1;
        onNavigationEvent(i2, i2);
    }

    public void onNavigationEvent(@Nullable SurfaceHolder surfaceHolder) {
        ITrustedWebActivityCallback_Parcel();
        if (surfaceHolder == null) {
            IPostMessageServiceStub();
            return;
        }
        ITrustedWebActivityCallbackStubProxy();
        this.IEngagementSignalsCallbackStubProxy = true;
        this.IEngagementSignalsCallback_Parcel = surfaceHolder;
        surfaceHolder.addCallback(this.extraCallbackWithResult);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            onWarmupCompleted(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            onNavigationEvent(surfaceFrame.width(), surfaceFrame.height());
        } else {
            onWarmupCompleted((Object) null);
            onNavigationEvent(0, 0);
        }
    }

    public void onExtraCallback(@Nullable SurfaceHolder surfaceHolder) {
        ITrustedWebActivityCallback_Parcel();
        if (surfaceHolder == null || surfaceHolder != this.IEngagementSignalsCallback_Parcel) {
            return;
        }
        IPostMessageServiceStub();
    }

    public void onExtraCallback(@Nullable SurfaceView surfaceView) {
        ITrustedWebActivityCallback_Parcel();
        if (surfaceView instanceof DrawerKtExternalSyntheticLambda11) {
            ITrustedWebActivityCallbackStubProxy();
            onWarmupCompleted(surfaceView);
            onWarmupCompleted(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof SphericalGLSurfaceView) {
                ITrustedWebActivityCallbackStubProxy();
                this.onSessionEnded = (SphericalGLSurfaceView) surfaceView;
                IAuthTabCallback(this.onActivityResized).IAuthTabCallback(10000).IAuthTabCallback(this.onSessionEnded).IAuthTabCallback_Parcel();
                this.onSessionEnded.onExtraCallback(this.extraCallbackWithResult);
                onWarmupCompleted(this.onSessionEnded.onNavigationEvent());
                onWarmupCompleted(surfaceView.getHolder());
                return;
            }
            onNavigationEvent(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    public void onNavigationEvent(@Nullable SurfaceView surfaceView) {
        ITrustedWebActivityCallback_Parcel();
        onExtraCallback(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void onWarmupCompleted(@Nullable TextureView textureView) {
        ITrustedWebActivityCallback_Parcel();
        if (textureView == null) {
            IPostMessageServiceStub();
            return;
        }
        ITrustedWebActivityCallbackStubProxy();
        this.IPostMessageServiceStubProxy = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.extraCallbackWithResult);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            onWarmupCompleted((Object) null);
            onNavigationEvent(0, 0);
        } else {
            onExtraCallback(surfaceTexture);
            onNavigationEvent(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void onExtraCallback(@Nullable TextureView textureView) {
        ITrustedWebActivityCallback_Parcel();
        if (textureView == null || textureView != this.IPostMessageServiceStubProxy) {
            return;
        }
        IPostMessageServiceStub();
    }

    public void IAuthTabCallback(final TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, boolean z) {
        ITrustedWebActivityCallback_Parcel();
        if (this.receiveFile) {
            return;
        }
        if (!Objects.equals(this.asBinder, textContextMenuHelperApi28ExternalSyntheticLambda5)) {
            this.asBinder = textContextMenuHelperApi28ExternalSyntheticLambda5;
            onNavigationEvent(1, 3, textContextMenuHelperApi28ExternalSyntheticLambda5);
            SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
            if (selectionContainerKtExternalSyntheticLambda6 != null) {
                selectionContainerKtExternalSyntheticLambda6.onWarmupCompleted(textContextMenuHelperApi28ExternalSyntheticLambda5.IAuthTabCallback());
            }
            this.ICustomTabsCallbackStubProxy.onExtraCallback(20, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda30
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onWarmupCompleted(textContextMenuHelperApi28ExternalSyntheticLambda5);
                }
            });
        }
        this.onPostMessage.IAuthTabCallback(this.asBinder, z);
        this.ICustomTabsCallbackStubProxy.onExtraCallback();
    }

    public TextContextMenuHelperApi28ExternalSyntheticLambda5 onMinimized() {
        ITrustedWebActivityCallback_Parcel();
        return this.asBinder;
    }

    public static /* synthetic */ Integer onExtraCallbackWithResult(int i2, Integer num) {
        if (i2 == 0) {
            i2 = num.intValue();
        }
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ Integer IAuthTabCallback(AndroidSelectionHandles_androidKtExternalSyntheticLambda9 androidSelectionHandles_androidKtExternalSyntheticLambda9, int i2, Integer num) {
        if (i2 == 0) {
            i2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda9.IAuthTabCallback);
        }
        return Integer.valueOf(i2);
    }

    public void onWarmupCompleted(float f) {
        ITrustedWebActivityCallback_Parcel();
        final float fOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(f, 0.0f, 1.0f);
        if (this.getActiveNotifications == fOnWarmupCompleted) {
            return;
        }
        this.getActiveNotifications = fOnWarmupCompleted;
        this.onPostMessage.onNavigationEvent(fOnWarmupCompleted);
        this.ICustomTabsCallbackStubProxy.IAuthTabCallback(22, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda15
            public final void invoke(Object obj) {
                ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(fOnWarmupCompleted);
            }
        });
    }

    public float onGreatestScrollPercentageIncreased() {
        ITrustedWebActivityCallback_Parcel();
        return this.getActiveNotifications;
    }

    public void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
        this.onExtraCallbackWithResult.onNavigationEvent((SelectionContainerKtExternalSyntheticLambda9) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9));
    }

    public void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
        ITrustedWebActivityCallback_Parcel();
        this.onExtraCallbackWithResult.onExtraCallback((SelectionContainerKtExternalSyntheticLambda9) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9));
    }

    public ImeEditCommand_androidKtExternalSyntheticLambda2 ICustomTabsService() {
        ITrustedWebActivityCallback_Parcel();
        return this.ICustomTabsCallback;
    }

    public void onExtraCallback(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback) {
        this.ICustomTabsCallbackStubProxy.onNavigationEvent((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallback));
    }

    public void onExtraCallbackWithResult(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback) {
        ITrustedWebActivityCallback_Parcel();
        this.ICustomTabsCallbackStubProxy.onWarmupCompleted((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallback));
    }

    public BasicTextContextMenuProviderKtExternalSyntheticLambda2 prefetch() {
        ITrustedWebActivityCallback_Parcel();
        return this.readTypedObject;
    }

    public int postMessage() {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            return selectionContainerKtExternalSyntheticLambda6.onNavigationEvent();
        }
        return 0;
    }

    public boolean IEngagementSignalsCallbackDefault() {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            return selectionContainerKtExternalSyntheticLambda6.IAuthTabCallback();
        }
        return false;
    }

    @Deprecated
    public void asInterface(int i2) {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(i2, 1);
        }
    }

    public void onWarmupCompleted(int i2, int i3) {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(i2, i3);
        }
    }

    @Deprecated
    public void onSessionEnded() {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onNavigationEvent(1);
        }
    }

    public void onWarmupCompleted(int i2) {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onNavigationEvent(i2);
        }
    }

    @Deprecated
    public void W_() {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(1);
        }
    }

    public void IAuthTabCallback(int i2) {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult(i2);
        }
    }

    @Deprecated
    public void onWarmupCompleted(boolean z) {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onNavigationEvent(z, 1);
        }
    }

    public void onWarmupCompleted(boolean z, int i2) {
        ITrustedWebActivityCallback_Parcel();
        SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6 = this.IPostMessageServiceDefault;
        if (selectionContainerKtExternalSyntheticLambda6 != null) {
            selectionContainerKtExternalSyntheticLambda6.onNavigationEvent(z, i2);
        }
    }

    private void onWarmupCompleted(@Nullable AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4) {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda11.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted);
        selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.onNavigationEvent = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.access100;
        selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.extraCallbackWithResult = 0L;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult, 1);
        if (androidSelectionHandles_androidKtExternalSyntheticLambda4 != null) {
            selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4);
        }
        this.postMessage++;
        this.onPostMessage.onExtraCallback();
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private int onExtraCallback(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
        if (selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallback()) {
            return this.ICustomTabsCallbackDefault;
        }
        return selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback, this.newAuthTabSession).IAuthTabCallbackStub;
    }

    private long onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
        if (selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.IAuthTabCallback()) {
            selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback, this.newAuthTabSession);
            if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel == -9223372036854775807L) {
                return selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(onExtraCallback(selectionContainerKtExternalSyntheticLambda11), this.onWarmupCompleted).onNavigationEvent();
            }
            return this.newAuthTabSession.onExtraCallbackWithResult() + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel);
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(onNavigationEvent(selectionContainerKtExternalSyntheticLambda11));
    }

    private long onNavigationEvent(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
        long jOnWarmupCompleted;
        if (selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallback()) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.onRelationshipValidationResult);
        }
        if (selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor) {
            jOnWarmupCompleted = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = selectionContainerKtExternalSyntheticLambda11.access100;
        }
        return selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.IAuthTabCallback() ? jOnWarmupCompleted : onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted, jOnWarmupCompleted);
    }

    private List<BottomDrawerStateExternalSyntheticLambda2> onNavigationEvent(List<TextFieldStateKtExternalSyntheticLambda0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(this.mayLaunchUrl.onExtraCallbackWithResult(list.get(i2)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(MultiSelectionLayoutExternalSyntheticLambda0.onNavigationEvent onnavigationevent) {
        long jOnNavigationEvent;
        int i2 = this.postMessage - onnavigationevent.onExtraCallbackWithResult;
        this.postMessage = i2;
        boolean z = true;
        if (onnavigationevent.onNavigationEvent) {
            this.newSessionWithExtras = onnavigationevent.onWarmupCompleted;
            this.newSession = true;
        }
        if (i2 == 0) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = onnavigationevent.IAuthTabCallback.ICustomTabsCallback;
            if (!this.prefetch.ICustomTabsCallback.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                this.ICustomTabsCallbackDefault = -1;
                this.onRelationshipValidationResult = 0L;
                this.ICustomTabsCallbackStub = 0;
            }
            if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                List<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10> listOnNavigationEvent = ((SelectionContainerKtExternalSyntheticLambda4) coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10).onNavigationEvent();
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(listOnNavigationEvent.size() == this.isEngagementSignalsApiAvailable.size());
                for (int i3 = 0; i3 < listOnNavigationEvent.size(); i3++) {
                    this.isEngagementSignalsApiAvailable.get(i3).IAuthTabCallback(listOnNavigationEvent.get(i3));
                }
            }
            long j = -9223372036854775807L;
            if (this.newSession) {
                if (onnavigationevent.IAuthTabCallback.onWarmupCompleted.equals(this.prefetch.onWarmupCompleted) && onnavigationevent.IAuthTabCallback.onExtraCallbackWithResult == this.prefetch.access100) {
                    z = false;
                }
                if (z) {
                    if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() || onnavigationevent.IAuthTabCallback.onWarmupCompleted.IAuthTabCallback()) {
                        jOnNavigationEvent = onnavigationevent.IAuthTabCallback.onExtraCallbackWithResult;
                    } else {
                        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = onnavigationevent.IAuthTabCallback;
                        jOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted, selectionContainerKtExternalSyntheticLambda11.onExtraCallbackWithResult);
                    }
                    j = jOnNavigationEvent;
                }
            } else {
                z = false;
            }
            this.newSession = false;
            IAuthTabCallback(onnavigationevent.IAuthTabCallback, 1, z, this.newSessionWithExtras, j, -1, false);
        }
    }

    private void IAuthTabCallback(final SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.prefetch;
        this.prefetch = selectionContainerKtExternalSyntheticLambda11;
        boolean zEquals = selectionContainerKtExternalSyntheticLambda112.ICustomTabsCallback.equals(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback);
        Pair<Boolean, Integer> pairOnWarmupCompleted = onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11, selectionContainerKtExternalSyntheticLambda112, z, i3, !zEquals, z2);
        boolean zBooleanValue = ((Boolean) pairOnWarmupCompleted.first).booleanValue();
        final int iIntValue = ((Integer) pairOnWarmupCompleted.second).intValue();
        if (zBooleanValue) {
            textFieldStateKtExternalSyntheticLambda0 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallback() ? null : selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback, this.newAuthTabSession).IAuthTabCallbackStub, this.onWarmupCompleted).IAuthTabCallbackStubProxy;
            this.onGreatestScrollPercentageIncreased = TextFieldBufferExternalSyntheticLambda0.onNavigationEvent;
        }
        if (zBooleanValue || !selectionContainerKtExternalSyntheticLambda112.extraCallback.equals(selectionContainerKtExternalSyntheticLambda11.extraCallback)) {
            this.onGreatestScrollPercentageIncreased = this.onGreatestScrollPercentageIncreased.onNavigationEvent().onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.extraCallback).onWarmupCompleted();
        }
        TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0ITrustedWebActivityCallback = ITrustedWebActivityCallback();
        boolean zEquals2 = textFieldBufferExternalSyntheticLambda0ITrustedWebActivityCallback.equals(this.ICustomTabsService);
        this.ICustomTabsService = textFieldBufferExternalSyntheticLambda0ITrustedWebActivityCallback;
        boolean z3 = selectionContainerKtExternalSyntheticLambda112.asInterface != selectionContainerKtExternalSyntheticLambda11.asInterface;
        boolean z4 = selectionContainerKtExternalSyntheticLambda112.IAuthTabCallbackStub != selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStub;
        if (z4 || z3) {
            cancelNotification();
        }
        boolean z5 = selectionContainerKtExternalSyntheticLambda112.onExtraCallback;
        boolean z6 = selectionContainerKtExternalSyntheticLambda11.onExtraCallback;
        boolean z7 = z5 != z6;
        if (z7) {
            asInterface(z6);
        }
        if (!zEquals) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(0, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda0
                public final void invoke(Object obj) {
                    AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = (AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj;
                    iAuthTabCallback.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, i2);
                }
            });
        }
        if (z) {
            final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(i3, selectionContainerKtExternalSyntheticLambda112, i4);
            final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(j);
            this.ICustomTabsCallbackStubProxy.onExtraCallback(11, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                public final void invoke(Object obj) {
                    AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = (AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj;
                    iAuthTabCallback.IAuthTabCallback(onnavigationeventOnWarmupCompleted, onnavigationeventOnExtraCallback, i3);
                }
            });
        }
        if (zBooleanValue) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(1, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda6
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).IAuthTabCallback(textFieldStateKtExternalSyntheticLambda0, iIntValue);
                }
            });
        }
        if (selectionContainerKtExternalSyntheticLambda112.IAuthTabCallbackDefault != selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackDefault) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(10, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda7
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackDefault);
                }
            });
            if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackDefault != null) {
                this.ICustomTabsCallbackStubProxy.onExtraCallback(10, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda8
                    public final void invoke(Object obj) {
                        ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackDefault);
                    }
                });
            }
        }
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = selectionContainerKtExternalSyntheticLambda112.writeTypedObject;
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02 = selectionContainerKtExternalSyntheticLambda11.writeTypedObject;
        if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 != composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02) {
            this.ITrustedWebActivityCallbackDefault.onNavigationEvent(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02.onExtraCallback);
            this.ICustomTabsCallbackStubProxy.onExtraCallback(2, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda9
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.writeTypedObject.IAuthTabCallback);
                }
            });
        }
        if (!zEquals2) {
            final TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0 = this.ICustomTabsService;
            this.ICustomTabsCallbackStubProxy.onExtraCallback(14, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda10
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onWarmupCompleted(textFieldBufferExternalSyntheticLambda0);
                }
            });
        }
        if (z7) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(3, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda11
                public final void invoke(Object obj) {
                    AndroidSelectionHandles_androidKtExternalSyntheticLambda9.onNavigationEvent(selectionContainerKtExternalSyntheticLambda11, (AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj);
                }
            });
        }
        if (z4 || z3) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(-1, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda12
                public final void invoke(Object obj) {
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = selectionContainerKtExternalSyntheticLambda11;
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda113.asInterface, selectionContainerKtExternalSyntheticLambda113.IAuthTabCallbackStub);
                }
            });
        }
        if (z4) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(4, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda13
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallback(selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStub);
                }
            });
        }
        if (z3 || selectionContainerKtExternalSyntheticLambda112.asBinder != selectionContainerKtExternalSyntheticLambda11.asBinder) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(5, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda1
                public final void invoke(Object obj) {
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = selectionContainerKtExternalSyntheticLambda11;
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(selectionContainerKtExternalSyntheticLambda113.asInterface, selectionContainerKtExternalSyntheticLambda113.asBinder);
                }
            });
        }
        if (selectionContainerKtExternalSyntheticLambda112.IAuthTabCallbackStubProxy != selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStubProxy) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(6, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda2
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStubProxy);
                }
            });
        }
        if (selectionContainerKtExternalSyntheticLambda112.IAuthTabCallback() != selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback()) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(7, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda3
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback());
                }
            });
        }
        if (!selectionContainerKtExternalSyntheticLambda112.onTransact.equals(selectionContainerKtExternalSyntheticLambda11.onTransact)) {
            this.ICustomTabsCallbackStubProxy.onExtraCallback(12, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda4
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.onTransact);
                }
            });
        }
        ITrustedWebActivityService();
        this.ICustomTabsCallbackStubProxy.onExtraCallback();
        if (selectionContainerKtExternalSyntheticLambda112.getInterfaceDescriptor != selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor) {
            Iterator<AndroidSelectionHandles_androidKtExternalSyntheticLambda8.IAuthTabCallback> it = this.IAuthTabCallbackStubProxy.iterator();
            while (it.hasNext()) {
                it.next().onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor);
            }
        }
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback) {
        iAuthTabCallback.onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.onExtraCallback);
        iAuthTabCallback.onExtraCallback(selectionContainerKtExternalSyntheticLambda11.onExtraCallback);
    }

    private AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onWarmupCompleted(int i2, SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, int i3) {
        int i4;
        Object obj;
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0;
        Object obj2;
        int i5;
        long jOnExtraCallbackWithResult;
        long jOnExtraCallbackWithResult2;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        if (selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallback()) {
            i4 = i3;
            obj = null;
            textFieldStateKtExternalSyntheticLambda0 = null;
            obj2 = null;
            i5 = -1;
        } else {
            Object obj3 = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback;
            selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(obj3, onextracallback);
            int i6 = onextracallback.IAuthTabCallbackStub;
            int iIAuthTabCallback = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(obj3);
            Object obj4 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(i6, this.onWarmupCompleted).extraCallback;
            textFieldStateKtExternalSyntheticLambda0 = this.onWarmupCompleted.IAuthTabCallbackStubProxy;
            obj2 = obj3;
            i5 = iIAuthTabCallback;
            obj = obj4;
            i4 = i6;
        }
        if (i2 == 0) {
            if (selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.IAuthTabCallback()) {
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted;
                jOnExtraCallbackWithResult = onextracallback.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback);
                jOnExtraCallbackWithResult2 = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11);
            } else {
                if (selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallbackWithResult != -1) {
                    jOnExtraCallbackWithResult = onExtraCallbackWithResult(this.prefetch);
                } else {
                    jOnExtraCallbackWithResult = onextracallback.onNavigationEvent + onextracallback.IAuthTabCallback;
                }
                jOnExtraCallbackWithResult2 = jOnExtraCallbackWithResult;
            }
        } else if (selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.IAuthTabCallback()) {
            jOnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda11.access100;
            jOnExtraCallbackWithResult2 = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11);
        } else {
            jOnExtraCallbackWithResult = onextracallback.onNavigationEvent + selectionContainerKtExternalSyntheticLambda11.access100;
            jOnExtraCallbackWithResult2 = jOnExtraCallbackWithResult;
        }
        long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnExtraCallbackWithResult);
        long jOnExtraCallback2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnExtraCallbackWithResult2);
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted;
        return new AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent(obj, i4, textFieldStateKtExternalSyntheticLambda0, obj2, i5, jOnExtraCallback, jOnExtraCallback2, onextracallbackwithresult2.onWarmupCompleted, onextracallbackwithresult2.IAuthTabCallback);
    }

    private AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onExtraCallback(long j) {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0;
        Object obj;
        int iIAuthTabCallback;
        Object obj2;
        int iIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        if (this.prefetch.ICustomTabsCallback.onExtraCallback()) {
            textFieldStateKtExternalSyntheticLambda0 = null;
            obj = null;
            iIAuthTabCallback = -1;
            obj2 = null;
        } else {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
            Object obj3 = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback;
            selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(obj3, this.newAuthTabSession);
            iIAuthTabCallback = this.prefetch.ICustomTabsCallback.IAuthTabCallback(obj3);
            obj = obj3;
            obj2 = this.prefetch.ICustomTabsCallback.IAuthTabCallback(iIsEngagementSignalsApiAvailable, this.onWarmupCompleted).extraCallback;
            textFieldStateKtExternalSyntheticLambda0 = this.onWarmupCompleted.IAuthTabCallbackStubProxy;
        }
        long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j);
        long jOnExtraCallback2 = this.prefetch.onWarmupCompleted.IAuthTabCallback() ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(onExtraCallbackWithResult(this.prefetch)) : jOnExtraCallback;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = this.prefetch.onWarmupCompleted;
        return new AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent(obj2, iIsEngagementSignalsApiAvailable, textFieldStateKtExternalSyntheticLambda0, obj, iIAuthTabCallback, jOnExtraCallback, jOnExtraCallback2, onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback);
    }

    private static long onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback, onextracallback);
        if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel == -9223372036854775807L) {
            return selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(onextracallback.IAuthTabCallbackStub, iAuthTabCallback).onExtraCallbackWithResult();
        }
        return onextracallback.onWarmupCompleted() + selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel;
    }

    private Pair<Boolean, Integer> onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112, boolean z, int i2, boolean z2, boolean z3) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = selectionContainerKtExternalSyntheticLambda112.ICustomTabsCallback;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i3 = 3;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback() != coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted.onExtraCallback, this.newAuthTabSession).IAuthTabCallbackStub, this.onWarmupCompleted).extraCallback.equals(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback, this.newAuthTabSession).IAuthTabCallbackStub, this.onWarmupCompleted).extraCallback)) {
            if (z && i2 == 0 && selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted.onNavigationEvent < selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onNavigationEvent) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            if (z && i2 == 1 && z3) {
                return new Pair<>(Boolean.TRUE, 2);
            }
            return new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i2 == 0) {
            i3 = 1;
        } else if (z && i2 == 1) {
            i3 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i3));
    }

    private void ITrustedWebActivityService() {
        AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = this.access000;
        AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.getSmallIconBitmap, this.onExtraCallback);
        this.access000 = onWarmupCompleted;
        if (onWarmupCompleted.equals(onwarmupcompleted)) {
            return;
        }
        this.ICustomTabsCallbackStubProxy.onExtraCallback(13, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda32
            public final void invoke(Object obj) {
                ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallback(this.f$0.access000);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.BasicTextContextMenuProviderKtExternalSyntheticLambda3 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(List<BottomDrawerStateExternalSyntheticLambda2> list, int i2, long j, boolean z) throws BasicTextContextMenuProviderKtExternalSyntheticLambda3 {
        long j2;
        int i3;
        int i4;
        int iOnNavigationEvent = i2;
        int iOnExtraCallback = onExtraCallback(this.prefetch);
        long jICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        this.postMessage++;
        if (!this.isEngagementSignalsApiAvailable.isEmpty()) {
            asInterface(0, this.isEngagementSignalsApiAvailable.size());
        }
        List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> listOnWarmupCompleted = onWarmupCompleted(0, list);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel = IPostMessageService_Parcel();
        if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel.onExtraCallback() && iOnNavigationEvent >= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel.onExtraCallbackWithResult()) {
            throw new BasicTextContextMenuProviderKtExternalSyntheticLambda3(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, iOnNavigationEvent, j);
        }
        if (z) {
            iOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel.onNavigationEvent(this.IEngagementSignalsCallbackDefault);
            j2 = -9223372036854775807L;
        } else {
            if (iOnNavigationEvent == -1) {
                i3 = iOnExtraCallback;
                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = onExtraCallbackWithResult(this.prefetch, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, i3, jICustomTabsCallback_Parcel));
                i4 = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.IAuthTabCallbackStub;
                if (i3 != -1 && i4 != 1) {
                    i4 = (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel.onExtraCallback() || i3 >= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel.onExtraCallbackWithResult()) ? 4 : 2;
                }
                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult, i4);
                this.onPostMessage.onWarmupCompleted(listOnWarmupCompleted, i3, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jICustomTabsCallback_Parcel), this.IEngagementSignalsCallbackStub);
                IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback, 0, this.prefetch.onWarmupCompleted.onExtraCallback.equals(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.onWarmupCompleted.onExtraCallback) && !this.prefetch.ICustomTabsCallback.onExtraCallback(), 4, onNavigationEvent(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback), -1, false);
            }
            j2 = j;
        }
        i3 = iOnNavigationEvent;
        jICustomTabsCallback_Parcel = j2;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult2 = onExtraCallbackWithResult(this.prefetch, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, i3, jICustomTabsCallback_Parcel));
        i4 = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult2.IAuthTabCallbackStub;
        if (i3 != -1) {
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel.onExtraCallback()) {
            }
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback2 = IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult2, i4);
        this.onPostMessage.onWarmupCompleted(listOnWarmupCompleted, i3, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jICustomTabsCallback_Parcel), this.IEngagementSignalsCallbackStub);
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback2, 0, this.prefetch.onWarmupCompleted.onExtraCallback.equals(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback2.onWarmupCompleted.onExtraCallback) && !this.prefetch.ICustomTabsCallback.onExtraCallback(), 4, onNavigationEvent(selectionContainerKtExternalSyntheticLambda11IAuthTabCallback2), -1, false);
    }

    private List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> onWarmupCompleted(int i2, List<BottomDrawerStateExternalSyntheticLambda2> list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted onwarmupcompleted = new SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted(list.get(i3), this.IPostMessageService_Parcel);
            arrayList.add(onwarmupcompleted);
            this.isEngagementSignalsApiAvailable.add(i3 + i2, new IAuthTabCallback(onwarmupcompleted.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallback));
        }
        this.IEngagementSignalsCallbackStub = this.IEngagementSignalsCallbackStub.IAuthTabCallback(i2, arrayList.size());
        return arrayList;
    }

    private SelectionContainerKtExternalSyntheticLambda11 onExtraCallback(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, int i2, List<BottomDrawerStateExternalSyntheticLambda2> list) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback;
        this.postMessage++;
        List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> listOnWarmupCompleted = onWarmupCompleted(i2, list);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel = IPostMessageService_Parcel();
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onExtraCallback(selectionContainerKtExternalSyntheticLambda11), onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11)));
        this.onPostMessage.IAuthTabCallback(i2, listOnWarmupCompleted, this.IEngagementSignalsCallbackStub);
        return selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult;
    }

    private SelectionContainerKtExternalSyntheticLambda11 IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, int i2, int i3) {
        int iOnExtraCallback = onExtraCallback(selectionContainerKtExternalSyntheticLambda11);
        long jOnWarmupCompleted = onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback;
        int size = this.isEngagementSignalsApiAvailable.size();
        this.postMessage++;
        asInterface(i2, i3);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel = IPostMessageService_Parcel();
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10IPostMessageService_Parcel, iOnExtraCallback, jOnWarmupCompleted));
        int i4 = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.IAuthTabCallbackStub;
        if (i4 != 1 && i4 != 4 && i2 < i3 && i3 == size && iOnExtraCallback >= selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.ICustomTabsCallback.onExtraCallbackWithResult()) {
            selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult, 4);
        }
        this.onPostMessage.onNavigationEvent(i2, i3, this.IEngagementSignalsCallbackStub);
        return selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult;
    }

    private void asInterface(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.isEngagementSignalsApiAvailable.remove(i4);
        }
        this.IEngagementSignalsCallbackStub = this.IEngagementSignalsCallbackStub.onExtraCallback(i2, i3);
    }

    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 IPostMessageService_Parcel() {
        return new SelectionContainerKtExternalSyntheticLambda4(this.isEngagementSignalsApiAvailable, this.IEngagementSignalsCallbackStub);
    }

    private SelectionContainerKtExternalSyntheticLambda11 onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, @Nullable Pair<Object, Long> pair) {
        long jOnWarmupCompleted;
        RecordingInputConnection_androidKt.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() || pair != null);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback;
        long jOnWarmupCompleted2 = onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11);
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = SelectionContainerKtExternalSyntheticLambda11.onExtraCallback();
            long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.onRelationshipValidationResult);
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onExtraCallback(onextracallbackwithresultOnExtraCallback, jOnNavigationEvent, jOnNavigationEvent, jOnNavigationEvent, 0L, BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback, this.onNavigationEvent, ImmutableList.of()).onExtraCallbackWithResult(onextracallbackwithresultOnExtraCallback);
            selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.onNavigationEvent = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.access100;
            return selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult;
        }
        Object obj = selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onWarmupCompleted.onExtraCallback;
        boolean zEquals = obj.equals(((Pair) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{pair}, -1084655742)).first);
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = !zEquals ? new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(pair.first) : selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onWarmupCompleted;
        long jLongValue = ((Long) pair.second).longValue();
        long jOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jOnWarmupCompleted2);
        if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback()) {
            jOnNavigationEvent2 -= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult(obj, this.newAuthTabSession).onWarmupCompleted();
        }
        if (!zEquals || jLongValue < jOnNavigationEvent2) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!onextracallbackwithresult.IAuthTabCallback());
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult2 = selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onExtraCallback(onextracallbackwithresult, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback : selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.readTypedObject, !zEquals ? this.onNavigationEvent : selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.writeTypedObject, !zEquals ? ImmutableList.of() : selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.extraCallback).onExtraCallbackWithResult(onextracallbackwithresult);
            selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult2.onNavigationEvent = jLongValue;
            return selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult2;
        }
        if (jLongValue == jOnNavigationEvent2) {
            int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.IAuthTabCallback.onExtraCallback);
            if (iIAuthTabCallback != -1 && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback, this.newAuthTabSession).IAuthTabCallbackStub == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.newAuthTabSession).IAuthTabCallbackStub) {
                return selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted;
            }
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.newAuthTabSession);
            if (onextracallbackwithresult.IAuthTabCallback()) {
                jOnWarmupCompleted = this.newAuthTabSession.onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback);
            } else {
                jOnWarmupCompleted = this.newAuthTabSession.IAuthTabCallback;
            }
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult3 = selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onExtraCallback(onextracallbackwithresult, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.access100, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.access100, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onExtraCallbackWithResult, jOnWarmupCompleted - selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.access100, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.readTypedObject, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.writeTypedObject, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.extraCallback).onExtraCallbackWithResult(onextracallbackwithresult);
            selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult3.onNavigationEvent = jOnWarmupCompleted;
            return selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult3;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!onextracallbackwithresult.IAuthTabCallback());
        long jMax = Math.max(0L, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.extraCallbackWithResult - (jLongValue - jOnNavigationEvent2));
        long j = selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onNavigationEvent;
        if (selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.IAuthTabCallback.equals(selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onWarmupCompleted)) {
            j = jLongValue + jMax;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallback = selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.onExtraCallback(onextracallbackwithresult, jLongValue, jLongValue, jLongValue, jMax, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.readTypedObject, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.writeTypedObject, selectionContainerKtExternalSyntheticLambda11OnWarmupCompleted.extraCallback);
        selectionContainerKtExternalSyntheticLambda11OnExtraCallback.onNavigationEvent = j;
        return selectionContainerKtExternalSyntheticLambda11OnExtraCallback;
    }

    private static SelectionContainerKtExternalSyntheticLambda11 IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, int i2) {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11IAuthTabCallback = selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback(i2);
        return (i2 == 1 || i2 == 4) ? selectionContainerKtExternalSyntheticLambda11IAuthTabCallback.IAuthTabCallback(false) : selectionContainerKtExternalSyntheticLambda11IAuthTabCallback;
    }

    private Pair<Object, Long> onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, int i2, long j) {
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback()) {
            boolean z = !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback();
            return onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, z ? -1 : i2, z ? -9223372036854775807L : j);
        }
        Pair<Object, Long> pairOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(this.onWarmupCompleted, this.newAuthTabSession, i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j));
        Object obj = ((Pair) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{pairOnExtraCallbackWithResult}, -1084655742)).first;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(obj) != -1) {
            return pairOnExtraCallbackWithResult;
        }
        int iIAuthTabCallback = MultiSelectionLayoutExternalSyntheticLambda0.IAuthTabCallback(this.onWarmupCompleted, this.newAuthTabSession, this.ICustomTabsServiceDefault, this.IEngagementSignalsCallbackDefault, obj, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102);
        if (iIAuthTabCallback != -1) {
            return onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, iIAuthTabCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(iIAuthTabCallback, this.onWarmupCompleted).onNavigationEvent());
        }
        return onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, -1, -9223372036854775807L);
    }

    private Pair<Object, Long> onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, int i2, long j) {
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            this.ICustomTabsCallbackDefault = i2;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.onRelationshipValidationResult = j;
            this.ICustomTabsCallbackStub = 0;
            return null;
        }
        if (i2 == -1 || i2 >= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult()) {
            i2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(this.IEngagementSignalsCallbackDefault);
            j = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i2, this.onWarmupCompleted).onNavigationEvent();
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(this.onWarmupCompleted, this.newAuthTabSession, i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(j));
    }

    private long onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.newAuthTabSession);
        return j + this.newAuthTabSession.onWarmupCompleted();
    }

    private SelectionContainerKtExternalSyntheticLambda0 IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallback = onExtraCallback(this.prefetch);
        MultiSelectionLayoutExternalSyntheticLambda0 multiSelectionLayoutExternalSyntheticLambda0 = this.onPostMessage;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.prefetch.ICustomTabsCallback;
        if (iOnExtraCallback == -1) {
            iOnExtraCallback = 0;
        }
        return new SelectionContainerKtExternalSyntheticLambda0(multiSelectionLayoutExternalSyntheticLambda0, onwarmupcompleted, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, iOnExtraCallback, this.IAuthTabCallback_Parcel, multiSelectionLayoutExternalSyntheticLambda0.IAuthTabCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextFieldBufferExternalSyntheticLambda0 ITrustedWebActivityCallback() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = newSession();
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback()) {
            return this.onGreatestScrollPercentageIncreased;
        }
        return this.onGreatestScrollPercentageIncreased.onNavigationEvent().onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(isEngagementSignalsApiAvailable(), this.onWarmupCompleted).IAuthTabCallbackStubProxy.IAuthTabCallbackDefault).onWarmupCompleted();
    }

    private void ITrustedWebActivityCallbackStubProxy() {
        if (this.onSessionEnded != null) {
            IAuthTabCallback(this.onActivityResized).IAuthTabCallback(10000).IAuthTabCallback((Object) null).IAuthTabCallback_Parcel();
            this.onSessionEnded.onExtraCallbackWithResult(this.extraCallbackWithResult);
            this.onSessionEnded = null;
        }
        TextureView textureView = this.IPostMessageServiceStubProxy;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.extraCallbackWithResult) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.IPostMessageServiceStubProxy.setSurfaceTextureListener(null);
            }
            this.IPostMessageServiceStubProxy = null;
        }
        SurfaceHolder surfaceHolder = this.IEngagementSignalsCallback_Parcel;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.extraCallbackWithResult);
            this.IEngagementSignalsCallback_Parcel = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        onWarmupCompleted(surface);
        this.extraCommand = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(@Nullable Object obj) {
        Object obj2 = this.ITrustedWebActivityCallback_Parcel;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean zOnExtraCallback = this.onPostMessage.onExtraCallback(obj, z ? this.extraCallback : -9223372036854775807L);
        if (z) {
            Object obj3 = this.ITrustedWebActivityCallback_Parcel;
            Surface surface = this.extraCommand;
            if (obj3 == surface) {
                surface.release();
                this.extraCommand = null;
            }
        }
        this.ITrustedWebActivityCallback_Parcel = obj;
        if (zOnExtraCallback) {
            return;
        }
        onWarmupCompleted(AndroidSelectionHandles_androidKtExternalSyntheticLambda4.onExtraCallback(new AndroidSelectionHandles_androidKtExternalSyntheticLambda6(3), 1003));
    }

    private void onWarmupCompleted(SurfaceHolder surfaceHolder) {
        this.IEngagementSignalsCallbackStubProxy = false;
        this.IEngagementSignalsCallback_Parcel = surfaceHolder;
        surfaceHolder.addCallback(this.extraCallbackWithResult);
        Surface surface = this.IEngagementSignalsCallback_Parcel.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.IEngagementSignalsCallback_Parcel.getSurfaceFrame();
            onNavigationEvent(surfaceFrame.width(), surfaceFrame.height());
        } else {
            onNavigationEvent(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(final int i2, final int i3) {
        if (i2 == this.IPostMessageServiceStub.onExtraCallbackWithResult() && i3 == this.IPostMessageServiceStub.onExtraCallback()) {
            return;
        }
        this.IPostMessageServiceStub = new TextFieldDecoratorModifierNodeExternalSyntheticLambda25(i2, i3);
        this.ICustomTabsCallbackStubProxy.IAuthTabCallback(24, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda16
            public final void invoke(Object obj) {
                ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallback(i2, i3);
            }
        });
        onNavigationEvent(2, 14, new TextFieldDecoratorModifierNodeExternalSyntheticLambda25(i2, i3));
    }

    private void areNotificationsEnabled() {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.prefetch;
        onExtraCallback(selectionContainerKtExternalSyntheticLambda11.asInterface, selectionContainerKtExternalSyntheticLambda11.asBinder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(boolean z, int i2) {
        int iOnNavigationEvent = onNavigationEvent(z);
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = this.prefetch;
        if (selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.asInterface == z && selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.IAuthTabCallbackStubProxy == iOnNavigationEvent && selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.asBinder == i2) {
            return;
        }
        this.postMessage++;
        if (selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.getInterfaceDescriptor) {
            selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnExtraCallback = selectionContainerKtExternalSyntheticLambda11OnExtraCallbackWithResult.onExtraCallback(z, i2, iOnNavigationEvent);
        this.onPostMessage.onExtraCallback(z, i2, iOnNavigationEvent);
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11OnExtraCallback, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private int onNavigationEvent(boolean z) {
        if (this.validateRelationship) {
            return 4;
        }
        SelectionGesturesKtExternalSyntheticLambda0 selectionGesturesKtExternalSyntheticLambda0 = this.IPostMessageService;
        if (selectionGesturesKtExternalSyntheticLambda0 == null || selectionGesturesKtExternalSyntheticLambda0.onNavigationEvent()) {
            return (this.prefetch.IAuthTabCallbackStubProxy != 1 || z) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelNotification() {
        int engagementSignalsCallback = setEngagementSignalsCallback();
        boolean z = false;
        if (engagementSignalsCallback != 1) {
            if (engagementSignalsCallback == 2 || engagementSignalsCallback == 3) {
                boolean zIPostMessageServiceStubProxy = IPostMessageServiceStubProxy();
                SelectionGesturesKtExternalSyntheticLambda1 selectionGesturesKtExternalSyntheticLambda1 = this.ITrustedWebActivityServiceDefault;
                if (prefetchWithMultipleUrls() && !zIPostMessageServiceStubProxy) {
                    z = true;
                }
                selectionGesturesKtExternalSyntheticLambda1.onExtraCallback(z);
                this.notifyNotificationWithChannel.onExtraCallbackWithResult(prefetchWithMultipleUrls());
                return;
            }
            if (engagementSignalsCallback != 4) {
                throw new IllegalStateException();
            }
        }
        this.ITrustedWebActivityServiceDefault.onExtraCallback(false);
        this.notifyNotificationWithChannel.onExtraCallbackWithResult(false);
    }

    private void ITrustedWebActivityCallback_Parcel() {
        this.writeTypedObject.onWarmupCompleted();
        if (Thread.currentThread() != X_().getThread()) {
            String strOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[]{Thread.currentThread().getName(), X_().getThread().getName()});
            if (this.ITrustedWebActivityCallbackStub) {
                throw new IllegalStateException(strOnWarmupCompleted);
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("ExoPlayerImpl", strOnWarmupCompleted, this.onMinimized ? null : new IllegalStateException());
            this.onMinimized = true;
        }
    }

    private void onWarmupCompleted(int i2, @Nullable Object obj) {
        onNavigationEvent(-1, i2, obj);
    }

    private void onNavigationEvent(int i2, int i3, @Nullable Object obj) {
        for (Renderer renderer : this.updateVisuals) {
            if (i2 == -1 || renderer.ICustomTabsCallback() == i2) {
                IAuthTabCallback(renderer).IAuthTabCallback(i3).IAuthTabCallback(obj).IAuthTabCallback_Parcel();
            }
        }
        for (Renderer renderer2 : this.writeTypedList) {
            if (renderer2 != null && (i2 == -1 || renderer2.ICustomTabsCallback() == i2)) {
                IAuthTabCallback(renderer2).IAuthTabCallback(i3).IAuthTabCallback(obj).IAuthTabCallback_Parcel();
            }
        }
    }

    private void asInterface(boolean z) {
        PriorityTaskManager priorityTaskManager = this.warmup;
        if (priorityTaskManager != null) {
            if (z && !this.onActivityLayout) {
                priorityTaskManager.onExtraCallbackWithResult(this.ICustomTabsServiceStub);
                this.onActivityLayout = true;
            } else {
                if (z || !this.onActivityLayout) {
                    return;
                }
                priorityTaskManager.onExtraCallback(this.ICustomTabsServiceStub);
                this.onActivityLayout = false;
            }
        }
    }

    private boolean onExtraCallback(int i2, int i3, List<TextFieldStateKtExternalSyntheticLambda0> list) {
        if (i3 - i2 != list.size()) {
            return false;
        }
        for (int i4 = i2; i4 < i3; i4++) {
            if (!this.isEngagementSignalsApiAvailable.get(i4).onExtraCallbackWithResult.IAuthTabCallback(list.get(i4 - i2))) {
                return false;
            }
        }
        return true;
    }

    private void IAuthTabCallback(int i2, int i3, List<TextFieldStateKtExternalSyntheticLambda0> list) {
        this.postMessage++;
        this.onPostMessage.onExtraCallbackWithResult(i2, i3, list);
        for (int i4 = i2; i4 < i3; i4++) {
            IAuthTabCallback iAuthTabCallback = this.isEngagementSignalsApiAvailable.get(i4);
            iAuthTabCallback.IAuthTabCallback(new BottomSheetScaffoldKtExternalSyntheticLambda0(iAuthTabCallback.onWarmupCompleted(), list.get(i4 - i2)));
        }
        IAuthTabCallback(this.prefetch.onWarmupCompleted(IPostMessageService_Parcel()), 0, false, 4, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(boolean z) {
        if (this.receiveFile) {
            return;
        }
        if (z) {
            if (this.prefetch.IAuthTabCallbackStubProxy == 3) {
                areNotificationsEnabled();
                return;
            }
            return;
        }
        areNotificationsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(int i2, final int i3) {
        ITrustedWebActivityCallback_Parcel();
        onNavigationEvent(1, 10, Integer.valueOf(i3));
        onNavigationEvent(2, 10, Integer.valueOf(i3));
        this.ICustomTabsCallbackStubProxy.IAuthTabCallback(21, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda29
            public final void invoke(Object obj) {
                ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BasicTextContextMenuProviderKtExternalSyntheticLambda2 IAuthTabCallback(@Nullable SelectionContainerKtExternalSyntheticLambda6 selectionContainerKtExternalSyntheticLambda6) {
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda2.IAuthTabCallback(0).IAuthTabCallback(selectionContainerKtExternalSyntheticLambda6 != null ? selectionContainerKtExternalSyntheticLambda6.onExtraCallback() : 0).onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda6 != null ? selectionContainerKtExternalSyntheticLambda6.onExtraCallbackWithResult() : 0).IAuthTabCallback();
    }

    private static CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, ImmutableSet<Integer> immutableSet) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.onExtraCallback onextracallbackICustomTabsCallback_Parcel = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.ICustomTabsCallback_Parcel();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            onextracallbackICustomTabsCallback_Parcel.onExtraCallbackWithResult(((Integer) it.next()).intValue(), true);
        }
        return onextracallbackICustomTabsCallback_Parcel.onNavigationEvent();
    }

    static final class IAuthTabCallback implements SelectionAdjustmentCompanionExternalSyntheticLambda2 {
        private final Object IAuthTabCallback;
        private final BottomDrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult;
        private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onWarmupCompleted;

        public IAuthTabCallback(Object obj, BadgeKtBadgedBox21ExternalSyntheticLambda0 badgeKtBadgedBox21ExternalSyntheticLambda0) {
            this.IAuthTabCallback = obj;
            this.onExtraCallbackWithResult = badgeKtBadgedBox21ExternalSyntheticLambda0;
            this.onWarmupCompleted = badgeKtBadgedBox21ExternalSyntheticLambda0.asInterface();
        }

        @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda2
        public Object onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public void IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
            this.onWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
        }
    }

    public final class onExtraCallback implements DrawerKtExternalSyntheticLambda15, SelectionManagerExternalSyntheticLambda5, ChipKtExternalSyntheticLambda4, BackdropScaffoldKtExternalSyntheticLambda11, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.onExtraCallbackWithResult, TextAnnotatedStringNodeExternalSyntheticLambda1.IAuthTabCallback, SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted, AndroidSelectionHandles_androidKtExternalSyntheticLambda8.IAuthTabCallback {
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private onExtraCallback() {
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onExtraCallbackWithResult(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ITrustedWebActivityCallbackStubProxy = textStringSimpleNodeExternalSyntheticLambda1;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onWarmupCompleted(textStringSimpleNodeExternalSyntheticLambda1);
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onExtraCallbackWithResult(String str, long j, long j2) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onWarmupCompleted(str, j, j2);
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.cancelNotification = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0);
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onNavigationEvent(int i2, long j) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onNavigationEvent(i2, j);
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void IAuthTabCallback(final CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.areNotificationsEnabled = cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(25, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda7
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallbackWithResult(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                }
            });
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onWarmupCompleted(Object obj, long j) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallback(obj, j);
            if (AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ITrustedWebActivityCallback_Parcel == obj) {
                AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(26, new SimpleBasePlayer$.ExternalSyntheticLambda19());
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onExtraCallback(String str) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallback(str);
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onExtraCallback(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallbackWithResult(textStringSimpleNodeExternalSyntheticLambda1);
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.cancelNotification = null;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ITrustedWebActivityCallbackStubProxy = null;
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onExtraCallbackWithResult(long j, int i2) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.IAuthTabCallback(j, i2);
        }

        @Override // o.DrawerKtExternalSyntheticLambda15
        public void onWarmupCompleted(Exception exc) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onWarmupCompleted(exc);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void IAuthTabCallback(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.IAuthTabCallbackDefault = textStringSimpleNodeExternalSyntheticLambda1;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onNavigationEvent(textStringSimpleNodeExternalSyntheticLambda1);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onWarmupCompleted(String str, long j, long j2) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.IAuthTabCallback(str, j, j2);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onTransact = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onExtraCallbackWithResult(long j) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallbackWithResult(j);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onWarmupCompleted(int i2, long j, long j2) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallback(i2, j, j2);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onExtraCallbackWithResult(String str) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.IAuthTabCallback(str);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onNavigationEvent(TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallback(textStringSimpleNodeExternalSyntheticLambda1);
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onTransact = null;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.IAuthTabCallbackDefault = null;
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void IAuthTabCallback(final boolean z) {
            if (AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onVerticalScrollEvent == z) {
                return;
            }
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onVerticalScrollEvent = z;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(23, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda5
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallbackWithResult(z);
                }
            });
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void IAuthTabCallback(Exception exc) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onNavigationEvent(exc);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onNavigationEvent(Exception exc) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallbackWithResult(exc);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onNavigationEvent(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.onExtraCallbackWithResult(iAuthTabCallback);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda5
        public void onNavigationEvent(final int i2) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.getInterfaceDescriptor.onExtraCallbackWithResult(new Function() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda1
                public final Object apply(Object obj) {
                    return Integer.valueOf(i2);
                }
            }, new Function() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda2
                public final Object apply(Object obj) {
                    return Integer.valueOf(i2);
                }
            });
        }

        @Override // o.ChipKtExternalSyntheticLambda4
        public void onExtraCallback(final List<ImeEditCommand_androidKtExternalSyntheticLambda1> list) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(27, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onWarmupCompleted(list);
                }
            });
        }

        @Override // o.ChipKtExternalSyntheticLambda4
        public void onCues(final ImeEditCommand_androidKtExternalSyntheticLambda2 imeEditCommand_androidKtExternalSyntheticLambda2) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallback = imeEditCommand_androidKtExternalSyntheticLambda2;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(27, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda0
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onExtraCallback(imeEditCommand_androidKtExternalSyntheticLambda2);
                }
            });
        }

        @Override // o.BackdropScaffoldKtExternalSyntheticLambda11
        public void onMetadata(final HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9 androidSelectionHandles_androidKtExternalSyntheticLambda9 = AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this;
            androidSelectionHandles_androidKtExternalSyntheticLambda9.onGreatestScrollPercentageIncreased = androidSelectionHandles_androidKtExternalSyntheticLambda9.onGreatestScrollPercentageIncreased.onNavigationEvent().IAuthTabCallback(handwritingHandlerNodeExternalSyntheticLambda0).onWarmupCompleted();
            TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0ITrustedWebActivityCallback = AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ITrustedWebActivityCallback();
            if (!textFieldBufferExternalSyntheticLambda0ITrustedWebActivityCallback.equals(AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsService)) {
                AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsService = textFieldBufferExternalSyntheticLambda0ITrustedWebActivityCallback;
                AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.onExtraCallback(14, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3
                    public final void invoke(Object obj) {
                        ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onWarmupCompleted(AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsService);
                    }
                });
            }
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.onExtraCallback(28, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).IAuthTabCallback(handwritingHandlerNodeExternalSyntheticLambda0);
                }
            });
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.onExtraCallback();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.IEngagementSignalsCallbackStubProxy) {
                AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onWarmupCompleted(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onNavigationEvent(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.IEngagementSignalsCallbackStubProxy) {
                AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onWarmupCompleted((Object) null);
            }
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onNavigationEvent(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallback(surfaceTexture);
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onNavigationEvent(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onNavigationEvent(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onWarmupCompleted((Object) null);
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onNavigationEvent(0, 0);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.onExtraCallbackWithResult
        public void IAuthTabCallback(Surface surface) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onWarmupCompleted(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.onExtraCallbackWithResult
        public void onWarmupCompleted(Surface surface) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onWarmupCompleted((Object) null);
        }

        @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda1.IAuthTabCallback
        public void onExtraCallbackWithResult() {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.onExtraCallback(false, 3);
        }

        @Override // o.SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted
        public void onExtraCallback(int i2) {
            final BasicTextContextMenuProviderKtExternalSyntheticLambda2 basicTextContextMenuProviderKtExternalSyntheticLambda2IAuthTabCallback = AndroidSelectionHandles_androidKtExternalSyntheticLambda9.IAuthTabCallback(AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.IPostMessageServiceDefault);
            if (basicTextContextMenuProviderKtExternalSyntheticLambda2IAuthTabCallback.equals(AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.readTypedObject)) {
                return;
            }
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.readTypedObject = basicTextContextMenuProviderKtExternalSyntheticLambda2IAuthTabCallback;
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(29, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda8
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda2IAuthTabCallback);
                }
            });
        }

        @Override // o.SelectionContainerKtExternalSyntheticLambda6.onWarmupCompleted
        public void onWarmupCompleted(final int i2, final boolean z) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.ICustomTabsCallbackStubProxy.IAuthTabCallback(30, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda9
                public final void invoke(Object obj) {
                    ((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IAuthTabCallback) obj).onNavigationEvent(i2, z);
                }
            });
        }

        public void onWarmupCompleted(boolean z) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda9.this.cancelNotification();
        }
    }

    static final class onNavigationEvent implements DrawerKtExternalSyntheticLambda0, DrawerKtExternalSyntheticLambda17, SelectionContainerKtExternalSyntheticLambda0.onWarmupCompleted {
        private DrawerKtExternalSyntheticLambda17 IAuthTabCallback;
        private DrawerKtExternalSyntheticLambda0 onExtraCallback;
        private DrawerKtExternalSyntheticLambda17 onExtraCallbackWithResult;
        private DrawerKtExternalSyntheticLambda0 onNavigationEvent;

        private onNavigationEvent() {
        }

        public void handleMessage(int i2, @Nullable Object obj) {
            if (i2 == 7) {
                this.onExtraCallback = (DrawerKtExternalSyntheticLambda0) obj;
                return;
            }
            if (i2 == 8) {
                this.onExtraCallbackWithResult = (DrawerKtExternalSyntheticLambda17) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.onNavigationEvent = null;
                this.IAuthTabCallback = null;
            } else {
                this.onNavigationEvent = sphericalGLSurfaceView.onExtraCallback();
                this.IAuthTabCallback = sphericalGLSurfaceView.IAuthTabCallback();
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda0
        public void onVideoFrameAboutToBeRendered(long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaFormat mediaFormat) {
            DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0 = this.onNavigationEvent;
            if (drawerKtExternalSyntheticLambda0 != null) {
                drawerKtExternalSyntheticLambda0.onVideoFrameAboutToBeRendered(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaFormat);
            }
            DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda02 = this.onExtraCallback;
            if (drawerKtExternalSyntheticLambda02 != null) {
                drawerKtExternalSyntheticLambda02.onVideoFrameAboutToBeRendered(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaFormat);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda17
        public void onExtraCallbackWithResult(long j, float[] fArr) {
            DrawerKtExternalSyntheticLambda17 drawerKtExternalSyntheticLambda17 = this.IAuthTabCallback;
            if (drawerKtExternalSyntheticLambda17 != null) {
                drawerKtExternalSyntheticLambda17.onExtraCallbackWithResult(j, fArr);
            }
            DrawerKtExternalSyntheticLambda17 drawerKtExternalSyntheticLambda172 = this.onExtraCallbackWithResult;
            if (drawerKtExternalSyntheticLambda172 != null) {
                drawerKtExternalSyntheticLambda172.onExtraCallbackWithResult(j, fArr);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda17
        public void onWarmupCompleted() {
            DrawerKtExternalSyntheticLambda17 drawerKtExternalSyntheticLambda17 = this.IAuthTabCallback;
            if (drawerKtExternalSyntheticLambda17 != null) {
                drawerKtExternalSyntheticLambda17.onWarmupCompleted();
            }
            DrawerKtExternalSyntheticLambda17 drawerKtExternalSyntheticLambda172 = this.onExtraCallbackWithResult;
            if (drawerKtExternalSyntheticLambda172 != null) {
                drawerKtExternalSyntheticLambda172.onWarmupCompleted();
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public static void onExtraCallbackWithResult(final Context context, final AndroidSelectionHandles_androidKtExternalSyntheticLambda9 androidSelectionHandles_androidKtExternalSyntheticLambda9, final boolean z, final SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
            androidSelectionHandles_androidKtExternalSyntheticLambda9.ITrustedWebActivityCallbackDefault().onWarmupCompleted(androidSelectionHandles_androidKtExternalSyntheticLambda9.ITrustedWebActivityCallbackStub(), (Handler.Callback) null).onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$Api31$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidSelectionHandles_androidKtExternalSyntheticLambda9.onExtraCallbackWithResult.onExtraCallbackWithResult(context, z, androidSelectionHandles_androidKtExternalSyntheticLambda9, selectionManagerExternalSyntheticLambda12);
                }
            });
        }

        public static /* synthetic */ void onExtraCallbackWithResult(Context context, boolean z, AndroidSelectionHandles_androidKtExternalSyntheticLambda9 androidSelectionHandles_androidKtExternalSyntheticLambda9, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
            SelectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0 selectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0OnNavigationEvent = SelectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0.onNavigationEvent(context);
            if (selectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0OnNavigationEvent == null) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z) {
                androidSelectionHandles_androidKtExternalSyntheticLambda9.onNavigationEvent(selectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0OnNavigationEvent);
            }
            selectionManagerExternalSyntheticLambda12.nR_(selectionGesturesKttouchSelectionSubsequentPressdownResolution1ExternalSyntheticLambda0OnNavigationEvent.nI_());
        }
    }
}
