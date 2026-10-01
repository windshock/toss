package o;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.RendererHolder;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda1;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda8;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.ComposableSingletonsAppBarKtExternalSyntheticLambda0;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.MultiSelectionLayoutExternalSyntheticLambda0;
import o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1;
import o.SelectionAdjustmentCompanionExternalSyntheticLambda4;
import o.SelectionAdjustmentKtExternalSyntheticLambda1;
import o.SelectionContainerKtExternalSyntheticLambda10;
import o.TextAnnotatedStringNodeExternalSyntheticLambda2;
import o.TextFieldStateKtExternalSyntheticLambda0;
import o.adjust;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MultiSelectionLayoutExternalSyntheticLambda0 implements Handler.Callback, BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, ComposableSingletonsAppBarKtExternalSyntheticLambda0.IAuthTabCallback, SelectionContainerKtExternalSyntheticLambda10.onExtraCallbackWithResult, AndroidSelectionHandles_androidKtExternalSyntheticLambda1.onWarmupCompleted, SelectionContainerKtExternalSyntheticLambda0$IAuthTabCallback, TextAnnotatedStringNodeExternalSyntheticLambda2.onExtraCallbackWithResult, DrawerKtExternalSyntheticLambda0 {
    private static final long IAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(10000);
    private final ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallbackDefault;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback ICustomTabsCallbackStub;
    private AndroidSelectionHandles_androidKtExternalSyntheticLambda4 ICustomTabsCallbackStubProxy;
    private onNavigationEvent ICustomTabsCallback_Parcel;
    private final SelectionContainerKtExternalSyntheticLambda12 ICustomTabsService;
    private final boolean[] ICustomTabsServiceDefault;
    private int ICustomTabsServiceStub;
    private SelectionContainerKtExternalSyntheticLambda2 ICustomTabsServiceStubProxy;
    private final boolean ICustomTabsService_Parcel;
    private long IEngagementSignalsCallbackDefault;
    private boolean IEngagementSignalsCallbackStub;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback IEngagementSignalsCallback_Parcel;
    private boolean access000;
    private boolean access100;
    private boolean access200;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 asBinder;
    private boolean asInterface;
    private final SelectionAdjustmentCompanionExternalSyntheticLambda0 extraCallbackWithResult;
    private final onExtraCallbackWithResult extraCommand;
    private int getInterfaceDescriptor;
    private final Looper isEngagementSignalsApiAvailable;
    private SelectionContainerKtExternalSyntheticLambda11 mayLaunchUrl;
    private final SelectionAdjustmentCompanionExternalSyntheticLambda3 newSession;
    private AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted newSessionWithExtras;
    private boolean onActivityLayout;
    private boolean onActivityResized;
    private final TextAnnotatedStringNodeExternalSyntheticLambda2 onExtraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallbackWithResult;
    private final ComposableSingletonsAppBarKtExternalSyntheticLambda0 onGreatestScrollPercentageIncreased;
    private final SelectionContainerKtExternalSyntheticLambda10 onMessageChannelReady;
    private int onMinimized;
    private final SelectionContainerKtExternalSyntheticLambda8 onNavigationEvent;
    private final AndroidSelectionHandles_androidKtExternalSyntheticLambda1 onPostMessage;
    private asInterface onRelationshipValidationResult;
    private boolean onSessionEnded;
    private final boolean onTransact;
    private final ArrayList<onExtraCallback> onUnminimized;
    private SelectionContainerKtExternalSyntheticLambda2 onVerticalScrollEvent;
    private final long onWarmupCompleted;
    private final SelectionManagerExternalSyntheticLambda12 postMessage;
    private asInterface prefetchWithMultipleUrls;
    private boolean readTypedObject;
    private boolean receiveFile;
    private long requestPostMessageChannel;
    private final RendererCapabilities[] requestPostMessageChannelWithExtras;
    private final long setEngagementSignalsCallback;
    private boolean updateVisuals;
    private final RendererHolder[] validateRelationship;
    private long warmup;
    private boolean writeTypedList;
    private final adjust writeTypedObject;
    private long newAuthTabSession = -9223372036854775807L;
    private float IPostMessageServiceStub = 1.0f;
    private SelectionContainerKtExternalSyntheticLambda3 IEngagementSignalsCallback = SelectionContainerKtExternalSyntheticLambda3.IAuthTabCallback;
    private long prefetch = -9223372036854775807L;
    private long ICustomTabsCallback = -9223372036854775807L;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 extraCallback = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void onPlaybackInfoUpdate(onNavigationEvent onnavigationevent);
    }

    private static int onExtraCallback(int i2, int i3) {
        if (i2 == -1) {
            return 2;
        }
        if (i3 == 2) {
            return 1;
        }
        return i3;
    }

    private static int onNavigationEvent(int i2, int i3) {
        if (i2 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 0;
        }
        return i3;
    }

    public static final class onNavigationEvent {
        public SelectionContainerKtExternalSyntheticLambda11 IAuthTabCallback;
        private boolean onExtraCallback;
        public int onExtraCallbackWithResult;
        public boolean onNavigationEvent;
        public int onWarmupCompleted;

        public onNavigationEvent(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
            this.IAuthTabCallback = selectionContainerKtExternalSyntheticLambda11;
        }

        public void onExtraCallbackWithResult(int i2) {
            this.onExtraCallback |= i2 > 0;
            this.onExtraCallbackWithResult += i2;
        }

        public void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11) {
            this.onExtraCallback |= this.IAuthTabCallback != selectionContainerKtExternalSyntheticLambda11;
            this.IAuthTabCallback = selectionContainerKtExternalSyntheticLambda11;
        }

        public void onNavigationEvent(int i2) {
            if (this.onNavigationEvent && this.onWarmupCompleted != 5) {
                RecordingInputConnection_androidKt.onNavigationEvent(i2 == 5);
                return;
            }
            this.onExtraCallback = true;
            this.onNavigationEvent = true;
            this.onWarmupCompleted = i2;
        }
    }

    public MultiSelectionLayoutExternalSyntheticLambda0(Context context, Renderer[] rendererArr, Renderer[] rendererArr2, ComposableSingletonsAppBarKtExternalSyntheticLambda0 composableSingletonsAppBarKtExternalSyntheticLambda0, ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, adjust adjustVar, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, int i2, boolean z, SelectionContainerKtExternalSyntheticLambda8 selectionContainerKtExternalSyntheticLambda8, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2, SelectionAdjustmentCompanionExternalSyntheticLambda0 selectionAdjustmentCompanionExternalSyntheticLambda0, long j, boolean z2, boolean z3, Looper looper, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0, onExtraCallbackWithResult onextracallbackwithresult, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, @Nullable SelectionContainerKtExternalSyntheticLambda12 selectionContainerKtExternalSyntheticLambda12, AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted onwarmupcompleted, final DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0) {
        this.extraCommand = onextracallbackwithresult;
        this.onGreatestScrollPercentageIncreased = composableSingletonsAppBarKtExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0;
        this.writeTypedObject = adjustVar;
        this.IAuthTabCallbackStub = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
        this.ICustomTabsServiceStub = i2;
        this.onSessionEnded = z;
        this.onVerticalScrollEvent = selectionContainerKtExternalSyntheticLambda2;
        this.extraCallbackWithResult = selectionAdjustmentCompanionExternalSyntheticLambda0;
        this.setEngagementSignalsCallback = j;
        this.IEngagementSignalsCallbackDefault = j;
        this.onActivityResized = z2;
        this.onTransact = z3;
        this.asBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
        this.postMessage = selectionManagerExternalSyntheticLambda12;
        this.newSessionWithExtras = onwarmupcompleted;
        this.onNavigationEvent = selectionContainerKtExternalSyntheticLambda8;
        this.onWarmupCompleted = adjustVar.onWarmupCompleted(selectionManagerExternalSyntheticLambda12);
        this.ICustomTabsService_Parcel = adjustVar.onExtraCallback(selectionManagerExternalSyntheticLambda12);
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11OnNavigationEvent = SelectionContainerKtExternalSyntheticLambda11.onNavigationEvent(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0);
        this.mayLaunchUrl = selectionContainerKtExternalSyntheticLambda11OnNavigationEvent;
        this.ICustomTabsCallback_Parcel = new onNavigationEvent(selectionContainerKtExternalSyntheticLambda11OnNavigationEvent);
        this.requestPostMessageChannelWithExtras = new RendererCapabilities[rendererArr.length];
        this.ICustomTabsServiceDefault = new boolean[rendererArr.length];
        RendererCapabilities.Listener listenerOnExtraCallback = composableSingletonsAppBarKtExternalSyntheticLambda0.onExtraCallback();
        this.validateRelationship = new RendererHolder[rendererArr.length];
        boolean z4 = false;
        for (int i3 = 0; i3 < rendererArr.length; i3++) {
            rendererArr[i3].onExtraCallback(i3, selectionManagerExternalSyntheticLambda12, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
            this.requestPostMessageChannelWithExtras[i3] = rendererArr[i3].Z_();
            if (listenerOnExtraCallback != null) {
                this.requestPostMessageChannelWithExtras[i3].onNavigationEvent(listenerOnExtraCallback);
            }
            Renderer renderer = rendererArr2[i3];
            if (renderer != null) {
                renderer.onExtraCallback(i3, selectionManagerExternalSyntheticLambda12, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
                z4 = true;
            }
            this.validateRelationship[i3] = new RendererHolder(rendererArr[i3], rendererArr2[i3], i3);
        }
        this.IAuthTabCallback_Parcel = z4;
        this.onPostMessage = new AndroidSelectionHandles_androidKtExternalSyntheticLambda1(this, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
        this.onUnminimized = new ArrayList<>();
        this.IEngagementSignalsCallback_Parcel = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
        this.ICustomTabsCallbackStub = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        composableSingletonsAppBarKtExternalSyntheticLambda0.onExtraCallbackWithResult(this, composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2);
        this.asInterface = true;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper, (Handler.Callback) null);
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted;
        this.newSession = new SelectionAdjustmentCompanionExternalSyntheticLambda3(selectionContainerKtExternalSyntheticLambda8, textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted, new SelectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2
            @Override // o.SelectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback
            public final SelectionAdjustmentKtExternalSyntheticLambda1 create(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4, long j2) {
                return this.f$0.onWarmupCompleted(selectionAdjustmentCompanionExternalSyntheticLambda4, j2);
            }
        }, onwarmupcompleted);
        this.onMessageChannelReady = new SelectionContainerKtExternalSyntheticLambda10(this, selectionContainerKtExternalSyntheticLambda8, textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted, selectionManagerExternalSyntheticLambda12);
        SelectionContainerKtExternalSyntheticLambda12 selectionContainerKtExternalSyntheticLambda122 = selectionContainerKtExternalSyntheticLambda12 == null ? new SelectionContainerKtExternalSyntheticLambda12() : selectionContainerKtExternalSyntheticLambda12;
        this.ICustomTabsService = selectionContainerKtExternalSyntheticLambda122;
        Looper looperOnNavigationEvent = selectionContainerKtExternalSyntheticLambda122.onNavigationEvent();
        this.isEngagementSignalsApiAvailable = looperOnNavigationEvent;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looperOnNavigationEvent, this);
        this.IAuthTabCallbackStubProxy = textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted2;
        this.onExtraCallback = new TextAnnotatedStringNodeExternalSyntheticLambda2(context, looperOnNavigationEvent, this);
        textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted2.onWarmupCompleted(35, new DrawerKtExternalSyntheticLambda0() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda3
            @Override // o.DrawerKtExternalSyntheticLambda0
            public final void onVideoFrameAboutToBeRendered(long j2, long j3, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, MediaFormat mediaFormat) {
                MultiSelectionLayoutExternalSyntheticLambda0.IAuthTabCallback(this.f$0, drawerKtExternalSyntheticLambda0, j2, j3, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaFormat);
            }
        }).onNavigationEvent();
    }

    public static /* synthetic */ void IAuthTabCallback(MultiSelectionLayoutExternalSyntheticLambda0 multiSelectionLayoutExternalSyntheticLambda0, DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0, long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, MediaFormat mediaFormat) {
        drawerKtExternalSyntheticLambda0.onVideoFrameAboutToBeRendered(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaFormat);
        multiSelectionLayoutExternalSyntheticLambda0.onVideoFrameAboutToBeRendered(j, j2, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SelectionAdjustmentKtExternalSyntheticLambda1 onWarmupCompleted(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4, long j) {
        return new SelectionAdjustmentKtExternalSyntheticLambda1(this.requestPostMessageChannelWithExtras, j, this.onGreatestScrollPercentageIncreased, this.writeTypedObject.IAuthTabCallback(), this.onMessageChannelReady, selectionAdjustmentCompanionExternalSyntheticLambda4, this.IAuthTabCallbackDefault, this.newSessionWithExtras.onNavigationEvent);
    }

    public void onWarmupCompleted(long j) {
        this.IEngagementSignalsCallbackDefault = j;
    }

    public void onNavigationEvent() {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(29).onNavigationEvent();
    }

    public void onExtraCallback(boolean z, int i2, int i3) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(1, z ? 1 : 0, i2 | (i3 << 4)).onNavigationEvent();
    }

    public void onExtraCallbackWithResult(int i2) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(11, i2, 0).onNavigationEvent();
    }

    public void onExtraCallback(boolean z) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(12, z ? 1 : 0, 0).onNavigationEvent();
    }

    public void IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, int i2, long j) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(3, new asInterface(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, i2, j)).onNavigationEvent();
    }

    public void onWarmupCompleted(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(4, androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1).onNavigationEvent();
    }

    public void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(38, selectionContainerKtExternalSyntheticLambda3).onNavigationEvent();
    }

    public void onExtraCallback() {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(6).onNavigationEvent();
    }

    public void onWarmupCompleted(List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> list, int i2, long j, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(17, new IAuthTabCallback(list, bottomNavigationKtExternalSyntheticLambda7, i2, j)).onNavigationEvent();
    }

    public void IAuthTabCallback(int i2, List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> list, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        this.IAuthTabCallbackStubProxy.onExtraCallback(18, i2, 0, new IAuthTabCallback(list, bottomNavigationKtExternalSyntheticLambda7, -1, -9223372036854775807L)).onNavigationEvent();
    }

    public void onNavigationEvent(int i2, int i3, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        this.IAuthTabCallbackStubProxy.onExtraCallback(20, i2, i3, bottomNavigationKtExternalSyntheticLambda7).onNavigationEvent();
    }

    public void IAuthTabCallback(int i2, int i3, int i4, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(19, new onWarmupCompleted(i2, i3, i4, bottomNavigationKtExternalSyntheticLambda7)).onNavigationEvent();
    }

    public void onExtraCallbackWithResult(int i2, int i3, List<TextFieldStateKtExternalSyntheticLambda0> list) {
        this.IAuthTabCallbackStubProxy.onExtraCallback(27, i2, i3, list).onNavigationEvent();
    }

    public void IAuthTabCallback(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, boolean z) {
        this.IAuthTabCallbackStubProxy.onExtraCallback(31, z ? 1 : 0, 0, textContextMenuHelperApi28ExternalSyntheticLambda5).onNavigationEvent();
    }

    public void onNavigationEvent(float f) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(32, Float.valueOf(f)).onNavigationEvent();
    }

    private void IAuthTabCallback(int i2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11.asInterface, i2, selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStubProxy, selectionContainerKtExternalSyntheticLambda11.asBinder);
    }

    private void extraCallbackWithResult() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        IAuthTabCallback(this.IPostMessageServiceStub);
    }

    private void IAuthTabCallback(DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.onWarmupCompleted(drawerKtExternalSyntheticLambda0);
        }
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda0$IAuthTabCallback
    public void onExtraCallback(SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) {
        if (this.receiveFile || !this.isEngagementSignalsApiAvailable.getThread().isAlive()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            selectionContainerKtExternalSyntheticLambda0.IAuthTabCallback(false);
        } else {
            this.IAuthTabCallbackStubProxy.onWarmupCompleted(14, selectionContainerKtExternalSyntheticLambda0).onNavigationEvent();
        }
    }

    public boolean onExtraCallback(@Nullable Object obj, long j) {
        if (this.receiveFile || !this.isEngagementSignalsApiAvailable.getThread().isAlive()) {
            return true;
        }
        TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2 = new TextFieldCoreModifierNodeExternalSyntheticLambda2(this.asBinder);
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(30, new Pair(obj, textFieldCoreModifierNodeExternalSyntheticLambda2)).onNavigationEvent();
        if (j != -9223372036854775807L) {
            return textFieldCoreModifierNodeExternalSyntheticLambda2.IAuthTabCallback(j);
        }
        return true;
    }

    public boolean onWarmupCompleted() {
        if (this.receiveFile || !this.isEngagementSignalsApiAvailable.getThread().isAlive()) {
            return true;
        }
        this.receiveFile = true;
        TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2 = new TextFieldCoreModifierNodeExternalSyntheticLambda2(this.asBinder);
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(7, textFieldCoreModifierNodeExternalSyntheticLambda2).onNavigationEvent();
        return textFieldCoreModifierNodeExternalSyntheticLambda2.IAuthTabCallback(this.setEngagementSignalsCallback);
    }

    public Looper IAuthTabCallback() {
        return this.isEngagementSignalsApiAvailable;
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda10.onExtraCallbackWithResult
    public void onExtraCallbackWithResult() {
        this.IAuthTabCallbackStubProxy.onNavigationEvent(2);
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(22);
    }

    @Override // o.BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted
    public void IAuthTabCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(8, bottomDrawerStateCompanionExternalSyntheticLambda1).onNavigationEvent();
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda8$onExtraCallback
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(9, bottomDrawerStateCompanionExternalSyntheticLambda1).onNavigationEvent();
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0.IAuthTabCallback
    public void onTrackSelectionsInvalidated() {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(10);
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0.IAuthTabCallback
    public void onExtraCallback(Renderer renderer) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(26);
    }

    @Override // o.AndroidSelectionHandles_androidKtExternalSyntheticLambda1.onWarmupCompleted
    public void onExtraCallbackWithResult(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(16, androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1).onNavigationEvent();
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda2.onExtraCallbackWithResult
    public void onExtraCallbackWithResult(float f) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(34);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda2.onExtraCallbackWithResult
    public void onWarmupCompleted(int i2) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(33, i2, 0).onNavigationEvent();
    }

    @Override // o.DrawerKtExternalSyntheticLambda0
    public void onVideoFrameAboutToBeRendered(long j, long j2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaFormat mediaFormat) {
        if (this.writeTypedList) {
            this.IAuthTabCallbackStubProxy.onWarmupCompleted(37).onNavigationEvent();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4;
        int i2;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    onNavigationEvent(z, i3 >> 4, true, i3 & 15);
                    break;
                case 2:
                    IAuthTabCallbackStubProxy();
                    break;
                case 3:
                    onExtraCallbackWithResult((asInterface) message.obj, true);
                    break;
                case 4:
                    onExtraCallback((AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) message.obj);
                    break;
                case 5:
                    IAuthTabCallback((SelectionContainerKtExternalSyntheticLambda2) message.obj);
                    break;
                case 6:
                    onWarmupCompleted(false, true);
                    break;
                case 7:
                    IAuthTabCallback((TextFieldCoreModifierNodeExternalSyntheticLambda2) message.obj);
                    return true;
                case 8:
                    onNavigationEvent((BottomDrawerStateCompanionExternalSyntheticLambda1) message.obj);
                    break;
                case 9:
                    onExtraCallback((BottomDrawerStateCompanionExternalSyntheticLambda1) message.obj);
                    break;
                case 10:
                    newAuthTabSession();
                    break;
                case 11:
                    asInterface(message.arg1);
                    break;
                case 12:
                    IAuthTabCallbackDefault(message.arg1 != 0);
                    break;
                case 13:
                    onExtraCallback(message.arg1 != 0, (TextFieldCoreModifierNodeExternalSyntheticLambda2) message.obj);
                    break;
                case 14:
                    onNavigationEvent((SelectionContainerKtExternalSyntheticLambda0) message.obj);
                    break;
                case 15:
                    onExtraCallbackWithResult((SelectionContainerKtExternalSyntheticLambda0) message.obj);
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    IAuthTabCallback((AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) message.obj, false);
                    break;
                case 17:
                    IAuthTabCallback((IAuthTabCallback) message.obj);
                    break;
                case 18:
                    onExtraCallback((IAuthTabCallback) message.obj, message.arg1);
                    break;
                case 19:
                    onExtraCallbackWithResult((onWarmupCompleted) message.obj);
                    break;
                case 20:
                    onExtraCallbackWithResult(message.arg1, message.arg2, (BottomNavigationKtExternalSyntheticLambda7) message.obj);
                    break;
                case 21:
                    onExtraCallback((BottomNavigationKtExternalSyntheticLambda7) message.obj);
                    break;
                case 22:
                    extraCommand();
                    break;
                case 23:
                    onTransact(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    onTransact();
                    break;
                case 26:
                    newSession();
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    IAuthTabCallback(message.arg1, message.arg2, (List<TextFieldStateKtExternalSyntheticLambda0>) message.obj);
                    break;
                case 28:
                    onNavigationEvent((AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted) message.obj);
                    break;
                case 29:
                    newSessionWithExtras();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    onExtraCallback(pair.first, (TextFieldCoreModifierNodeExternalSyntheticLambda2) pair.second);
                    break;
                case 31:
                    onExtraCallback((TextContextMenuHelperApi28ExternalSyntheticLambda5) message.obj, message.arg1 != 0);
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    IAuthTabCallback(((Float) message.obj).floatValue());
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    IAuthTabCallback(message.arg1);
                    break;
                case 34:
                    extraCallbackWithResult();
                    break;
                case 35:
                    IAuthTabCallback((DrawerKtExternalSyntheticLambda0) message.obj);
                    break;
                case 36:
                    IAuthTabCallbackStub(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.writeTypedList = false;
                    asInterface asinterface = this.prefetchWithMultipleUrls;
                    if (asinterface != null) {
                        onExtraCallbackWithResult(asinterface, false);
                        this.prefetchWithMultipleUrls = null;
                        break;
                    }
                    break;
                case 38:
                    onNavigationEvent((SelectionContainerKtExternalSyntheticLambda3) message.obj);
                    break;
            }
        } catch (ParserException e) {
            int i4 = ((ParserException) e).dataType;
            if (i4 == 1) {
                i = ((ParserException) e).contentIsMalformed ? 3001 : 3003;
            } else if (i4 == 4) {
                i = ((ParserException) e).contentIsMalformed ? 3002 : 3004;
            }
            onExtraCallbackWithResult(e, i);
        } catch (DrmSession.DrmSessionException e2) {
            onExtraCallbackWithResult(e2, e2.errorCode);
        } catch (BehindLiveWindowException e3) {
            onExtraCallbackWithResult(e3, 1002);
        } catch (IOException e4) {
            onExtraCallbackWithResult(e4, 2000);
        } catch (RuntimeException e5) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback = AndroidSelectionHandles_androidKtExternalSyntheticLambda4.onExtraCallback(e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? 1004 : 1000);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Playback error", androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback);
            onWarmupCompleted(true, false);
            this.mayLaunchUrl = this.mayLaunchUrl.onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback);
        } catch (DataSourceException e6) {
            onExtraCallbackWithResult(e6, ((DataSourceException) e6).reason);
        } catch (AndroidSelectionHandles_androidKtExternalSyntheticLambda4 e7) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent = e7;
            if (androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent.type == 1 && (selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface()) != null && androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent.mediaPeriodId == null) {
                androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent = androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent.onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onWarmupCompleted.onExtraCallback);
            }
            if (androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent.type == 1 && (onextracallbackwithresult = androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent.mediaPeriodId) != null && onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent.rendererIndex, onextracallbackwithresult)) {
                this.access100 = true;
                IAuthTabCallbackStub();
                SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault = this.newSession.IAuthTabCallbackDefault();
                SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
                if (this.newSession.asBinder() != selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault) {
                    while (selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null && selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult() != selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault) {
                        selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult();
                    }
                }
                this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder);
                if (this.mayLaunchUrl.IAuthTabCallbackStub != 4) {
                    onActivityLayout();
                    this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                }
            } else {
                AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda42 = this.ICustomTabsCallbackStubProxy;
                if (androidSelectionHandles_androidKtExternalSyntheticLambda42 != null) {
                    androidSelectionHandles_androidKtExternalSyntheticLambda42.addSuppressed(androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent);
                    androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent = this.ICustomTabsCallbackStubProxy;
                }
                AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda43 = androidSelectionHandles_androidKtExternalSyntheticLambda4OnNavigationEvent;
                if (androidSelectionHandles_androidKtExternalSyntheticLambda43.type != 1 || this.newSession.asBinder() == this.newSession.asInterface()) {
                    androidSelectionHandles_androidKtExternalSyntheticLambda4 = androidSelectionHandles_androidKtExternalSyntheticLambda43;
                } else {
                    while (this.newSession.asBinder() != this.newSession.asInterface()) {
                        this.newSession.IAuthTabCallback();
                    }
                    SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession.asBinder());
                    onPostMessage();
                    SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted;
                    BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback;
                    long j = selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact;
                    androidSelectionHandles_androidKtExternalSyntheticLambda4 = androidSelectionHandles_androidKtExternalSyntheticLambda43;
                    this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult2, j, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub, j, true, 0);
                }
                if (androidSelectionHandles_androidKtExternalSyntheticLambda4.isRecoverable && (this.ICustomTabsCallbackStubProxy == null || (i2 = ((createInputConnection) androidSelectionHandles_androidKtExternalSyntheticLambda4).errorCode) == 5004 || i2 == 5003)) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("ExoPlayerImplInternal", "Recoverable renderer error", androidSelectionHandles_androidKtExternalSyntheticLambda4);
                    if (this.ICustomTabsCallbackStubProxy == null) {
                        this.ICustomTabsCallbackStubProxy = androidSelectionHandles_androidKtExternalSyntheticLambda4;
                    }
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16 = this.IAuthTabCallbackStubProxy;
                    textFieldDecoratorModifierNodeExternalSyntheticLambda16.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda16.onWarmupCompleted(25, androidSelectionHandles_androidKtExternalSyntheticLambda4));
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Playback error", androidSelectionHandles_androidKtExternalSyntheticLambda4);
                    onWarmupCompleted(true, false);
                    this.mayLaunchUrl = this.mayLaunchUrl.onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4);
                }
            }
        }
        onPostMessage();
        return true;
    }

    private void onExtraCallbackWithResult(IOException iOException, int i2) {
        AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback = AndroidSelectionHandles_androidKtExternalSyntheticLambda4.onExtraCallback(iOException, i2);
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null) {
            androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback = androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback.onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.onExtraCallback);
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Playback error", androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback);
        onWarmupCompleted(false, false);
        this.mayLaunchUrl = this.mayLaunchUrl.onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda4OnExtraCallback);
    }

    private void IAuthTabCallbackStub(int i2) {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        if (selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStub != i2) {
            if (i2 != 2) {
                this.prefetch = -9223372036854775807L;
            }
            if (i2 != 3 && selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor) {
                this.mayLaunchUrl = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted(false);
            }
            this.mayLaunchUrl = this.mayLaunchUrl.IAuthTabCallback(i2);
        }
    }

    private void onPostMessage() {
        this.ICustomTabsCallback_Parcel.IAuthTabCallback(this.mayLaunchUrl);
        if (this.ICustomTabsCallback_Parcel.onExtraCallback) {
            this.extraCommand.onPlaybackInfoUpdate(this.ICustomTabsCallback_Parcel);
            this.ICustomTabsCallback_Parcel = new onNavigationEvent(this.mayLaunchUrl);
        }
    }

    private void newSessionWithExtras() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        onExtraCallbackWithResult(false, false, false, true);
        this.writeTypedObject.IAuthTabCallback(this.postMessage);
        IAuthTabCallbackStub(this.mayLaunchUrl.ICustomTabsCallback.onExtraCallback() ? 4 : 2);
        validateRelationship();
        this.onMessageChannelReady.onExtraCallbackWithResult(this.IAuthTabCallbackStub.onNavigationEvent());
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
    }

    private void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) throws Throwable {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        if (iAuthTabCallback.onNavigationEvent != -1) {
            this.onRelationshipValidationResult = new asInterface(new SelectionContainerKtExternalSyntheticLambda4(iAuthTabCallback.onWarmupCompleted, iAuthTabCallback.IAuthTabCallback), iAuthTabCallback.onNavigationEvent, iAuthTabCallback.onExtraCallback);
        }
        IAuthTabCallback(this.onMessageChannelReady.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted, iAuthTabCallback.IAuthTabCallback), false);
    }

    private void onExtraCallback(IAuthTabCallback iAuthTabCallback, int i2) throws Throwable {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        SelectionContainerKtExternalSyntheticLambda10 selectionContainerKtExternalSyntheticLambda10 = this.onMessageChannelReady;
        if (i2 == -1) {
            i2 = selectionContainerKtExternalSyntheticLambda10.onExtraCallbackWithResult();
        }
        IAuthTabCallback(selectionContainerKtExternalSyntheticLambda10.onWarmupCompleted(i2, iAuthTabCallback.onWarmupCompleted, iAuthTabCallback.IAuthTabCallback), false);
    }

    private void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) throws Throwable {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        IAuthTabCallback(this.onMessageChannelReady.onNavigationEvent(onwarmupcompleted.onExtraCallback, onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, onwarmupcompleted.onExtraCallbackWithResult), false);
    }

    private void onExtraCallbackWithResult(int i2, int i3, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) throws Throwable {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        IAuthTabCallback(this.onMessageChannelReady.IAuthTabCallback(i2, i3, bottomNavigationKtExternalSyntheticLambda7), false);
    }

    private void extraCommand() throws Throwable {
        IAuthTabCallback(this.onMessageChannelReady.onWarmupCompleted(), true);
    }

    private void onExtraCallback(BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) throws Throwable {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        IAuthTabCallback(this.onMessageChannelReady.onExtraCallback(bottomNavigationKtExternalSyntheticLambda7), false);
    }

    private void IAuthTabCallback(int i2, int i3, List<TextFieldStateKtExternalSyntheticLambda0> list) throws Throwable {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
        IAuthTabCallback(this.onMessageChannelReady.onNavigationEvent(i2, i3, list), false);
    }

    private void onExtraCallback(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onGreatestScrollPercentageIncreased.onWarmupCompleted(textContextMenuHelperApi28ExternalSyntheticLambda5);
        TextAnnotatedStringNodeExternalSyntheticLambda2 textAnnotatedStringNodeExternalSyntheticLambda2 = this.onExtraCallback;
        if (!z) {
            textContextMenuHelperApi28ExternalSyntheticLambda5 = null;
        }
        textAnnotatedStringNodeExternalSyntheticLambda2.onExtraCallback(textContextMenuHelperApi28ExternalSyntheticLambda5);
        validateRelationship();
    }

    private void IAuthTabCallback(float f) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.IPostMessageServiceStub = f;
        float fOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.onWarmupCompleted(f * fOnNavigationEvent);
        }
    }

    private void onExtraCallbackWithResult(boolean z) {
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder(); selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null; selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult()) {
            for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact().onExtraCallbackWithResult) {
                if (colorsKtExternalSyntheticLambda0 != null) {
                    colorsKtExternalSyntheticLambda0.onWarmupCompleted(z);
                }
            }
        }
    }

    private void onNavigationEvent(boolean z, int i2, boolean z2, int i3) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(z2 ? 1 : 0);
        onNavigationEvent(z, i2, i3);
    }

    private void validateRelationship() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        onNavigationEvent(selectionContainerKtExternalSyntheticLambda11.asInterface, selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStubProxy, selectionContainerKtExternalSyntheticLambda11.asBinder);
    }

    private void onNavigationEvent(boolean z, int i2, int i3) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onWarmupCompleted(z, this.onExtraCallback.onExtraCallbackWithResult(z, this.mayLaunchUrl.IAuthTabCallbackStub), i2, i3);
    }

    private void onWarmupCompleted(boolean z, int i2, int i3, int i4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z2 = z && i2 != -1;
        int iOnExtraCallback = onExtraCallback(i2, i4);
        int iOnNavigationEvent = onNavigationEvent(i2, i3);
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        if (selectionContainerKtExternalSyntheticLambda11.asInterface == z2 && selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStubProxy == iOnNavigationEvent && selectionContainerKtExternalSyntheticLambda11.asBinder == iOnExtraCallback) {
            return;
        }
        this.mayLaunchUrl = selectionContainerKtExternalSyntheticLambda11.onExtraCallback(z2, iOnExtraCallback, iOnNavigationEvent);
        IAuthTabCallback(false, false);
        onExtraCallbackWithResult(z2);
        if (!prefetchWithMultipleUrls()) {
            requestPostMessageChannel();
            updateVisuals();
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
            if (selectionContainerKtExternalSyntheticLambda112.getInterfaceDescriptor) {
                this.mayLaunchUrl = selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted(false);
            }
            this.newSession.onExtraCallback(this.warmup);
            return;
        }
        int i5 = this.mayLaunchUrl.IAuthTabCallbackStub;
        if (i5 == 3) {
            this.onPostMessage.onExtraCallback();
            receiveFile();
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
        } else if (i5 == 2) {
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
        }
    }

    private void onTransact(boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onActivityResized = z;
        prefetch();
        if (!this.ICustomTabsCallbackDefault || this.newSession.asInterface() == this.newSession.asBinder()) {
            return;
        }
        IAuthTabCallback(true);
        onNavigationEvent(false);
    }

    private void asInterface(boolean z) {
        if (z != this.onActivityLayout) {
            this.onActivityLayout = z;
            if (z || !this.mayLaunchUrl.getInterfaceDescriptor) {
                return;
            }
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
        }
    }

    private void asInterface(int i2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.ICustomTabsServiceStub = i2;
        int iOnExtraCallback = this.newSession.onExtraCallback(this.mayLaunchUrl.ICustomTabsCallback, i2);
        if ((iOnExtraCallback & 1) != 0) {
            IAuthTabCallback(true);
        } else if ((iOnExtraCallback & 2) != 0) {
            IAuthTabCallbackStub();
        }
        onNavigationEvent(false);
    }

    private void IAuthTabCallbackDefault(boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onSessionEnded = z;
        int iOnWarmupCompleted = this.newSession.onWarmupCompleted(this.mayLaunchUrl.ICustomTabsCallback, z);
        if ((iOnWarmupCompleted & 1) != 0) {
            IAuthTabCallback(true);
        } else if ((iOnWarmupCompleted & 2) != 0) {
            IAuthTabCallbackStub();
        }
        onNavigationEvent(false);
    }

    private void onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda8.onWarmupCompleted onwarmupcompleted) {
        this.newSessionWithExtras = onwarmupcompleted;
        this.newSession.onExtraCallback(this.mayLaunchUrl.ICustomTabsCallback, onwarmupcompleted);
    }

    private void IAuthTabCallback(boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = this.newSession.asBinder().onWarmupCompleted.onExtraCallback;
        long jOnExtraCallback = onExtraCallback(onextracallbackwithresult, this.mayLaunchUrl.access100, true, false);
        if (jOnExtraCallback != this.mayLaunchUrl.access100) {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
            this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, jOnExtraCallback, selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel, selectionContainerKtExternalSyntheticLambda11.onExtraCallbackWithResult, z, 5);
        }
    }

    private void receiveFile() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null) {
            ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact();
            for (int i2 = 0; i2 < this.validateRelationship.length; i2++) {
                if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i2)) {
                    this.validateRelationship[i2].access000();
                }
            }
        }
    }

    private void requestPostMessageChannel() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onPostMessage.onWarmupCompleted();
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.IAuthTabCallback_Parcel();
        }
    }

    private void onTransact() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        newSession();
    }

    private void updateVisuals() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null) {
            long jIAuthTabCallbackStub = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface ? selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onNavigationEvent.IAuthTabCallbackStub() : -9223372036854775807L;
            if (jIAuthTabCallbackStub != -9223372036854775807L) {
                if (!selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface()) {
                    this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder);
                    onNavigationEvent(false);
                    onActivityLayout();
                }
                onExtraCallbackWithResult(jIAuthTabCallbackStub);
                if (jIAuthTabCallbackStub != this.mayLaunchUrl.access100) {
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
                    this.mayLaunchUrl = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted, jIAuthTabCallbackStub, selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel, jIAuthTabCallbackStub, true, 5);
                }
            } else {
                long jIAuthTabCallback = this.onPostMessage.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder != this.newSession.asInterface());
                this.warmup = jIAuthTabCallback;
                long jOnWarmupCompleted = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted(jIAuthTabCallback);
                onWarmupCompleted(this.mayLaunchUrl.access100, jOnWarmupCompleted);
                if (this.onPostMessage.onExtraCallbackWithResult()) {
                    boolean z = this.ICustomTabsCallback_Parcel.onNavigationEvent;
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
                    this.mayLaunchUrl = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted, jOnWarmupCompleted, selectionContainerKtExternalSyntheticLambda112.IAuthTabCallback_Parcel, jOnWarmupCompleted, !z, 6);
                } else {
                    this.mayLaunchUrl.onExtraCallback(jOnWarmupCompleted);
                }
            }
            this.mayLaunchUrl.onNavigationEvent = this.newSession.onExtraCallbackWithResult().onExtraCallback();
            this.mayLaunchUrl.extraCallbackWithResult = writeTypedObject();
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = this.mayLaunchUrl;
            if (selectionContainerKtExternalSyntheticLambda113.asInterface && selectionContainerKtExternalSyntheticLambda113.IAuthTabCallbackStub == 3 && onNavigationEvent(selectionContainerKtExternalSyntheticLambda113.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda113.onWarmupCompleted) && this.mayLaunchUrl.onTransact.onExtraCallbackWithResult == 1.0f) {
                float fOnExtraCallback = this.extraCallbackWithResult.onExtraCallback(IAuthTabCallback_Parcel(), this.mayLaunchUrl.extraCallbackWithResult);
                if (this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult != fOnExtraCallback) {
                    onNavigationEvent(this.mayLaunchUrl.onTransact.onWarmupCompleted(fOnExtraCallback));
                    IAuthTabCallback(this.mayLaunchUrl.onTransact, this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult, false, false);
                }
            }
        }
    }

    private void onNavigationEvent(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        this.IAuthTabCallbackStubProxy.onNavigationEvent(16);
        this.onPostMessage.IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
    }

    private void mayLaunchUrl() {
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder(); selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null; selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult()) {
            for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact().onExtraCallbackWithResult) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallbackStubProxy() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11;
        int i2;
        long jOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult();
        this.IAuthTabCallbackStubProxy.onNavigationEvent(2);
        warmup();
        int i3 = this.mayLaunchUrl.IAuthTabCallbackStub;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder == null) {
            onExtraCallback(jOnExtraCallbackWithResult);
            return;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("doSomeWork");
        updateVisuals();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface) {
            this.requestPostMessageChannel = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.asBinder.IAuthTabCallback());
            selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onNavigationEvent.onExtraCallback(this.mayLaunchUrl.access100 - this.onWarmupCompleted, this.ICustomTabsService_Parcel);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                RendererHolder[] rendererHolderArr = this.validateRelationship;
                if (i4 >= rendererHolderArr.length) {
                    break;
                }
                RendererHolder rendererHolder = rendererHolderArr[i4];
                if (rendererHolder.onExtraCallback() == 0) {
                    onNavigationEvent(i4, false);
                } else {
                    rendererHolder.onExtraCallbackWithResult(this.warmup, this.requestPostMessageChannel);
                    z = z && rendererHolder.onNavigationEvent();
                    boolean zOnNavigationEvent = rendererHolder.onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1AsBinder);
                    onNavigationEvent(i4, zOnNavigationEvent);
                    z2 = z2 && zOnNavigationEvent;
                    if (!zOnNavigationEvent) {
                        onExtraCallback(i4);
                    }
                }
                i4++;
            }
        } else {
            selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onNavigationEvent.onNavigationEvent();
            z = true;
            z2 = true;
        }
        long j = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.IAuthTabCallback;
        boolean z4 = z && selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface && (j == -9223372036854775807L || j <= this.mayLaunchUrl.access100);
        if (z4 && this.ICustomTabsCallbackDefault) {
            this.ICustomTabsCallbackDefault = false;
            onNavigationEvent(false, this.mayLaunchUrl.IAuthTabCallbackStubProxy, false, 5);
        }
        if (z4 && selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.onExtraCallbackWithResult) {
            IAuthTabCallbackStub(4);
        } else {
            if (this.mayLaunchUrl.IAuthTabCallbackStub == 2 && asBinder(z2)) {
                IAuthTabCallbackStub(3);
                this.ICustomTabsCallbackStubProxy = null;
                if (prefetchWithMultipleUrls()) {
                    IAuthTabCallback(false, false);
                    this.onPostMessage.onExtraCallback();
                    receiveFile();
                }
            } else if (this.mayLaunchUrl.IAuthTabCallbackStub == 3 && (this.getInterfaceDescriptor != 0 ? !z2 : !onActivityResized())) {
                IAuthTabCallback(prefetchWithMultipleUrls(), false);
                IAuthTabCallbackStub(2);
                if (this.readTypedObject) {
                    mayLaunchUrl();
                    this.extraCallbackWithResult.onNavigationEvent();
                }
            }
            if (this.mayLaunchUrl.IAuthTabCallbackStub != 2) {
                int i5 = 0;
                while (true) {
                    RendererHolder[] rendererHolderArr2 = this.validateRelationship;
                    if (i5 >= rendererHolderArr2.length) {
                        break;
                    }
                    if (rendererHolderArr2[i5].asInterface(selectionAdjustmentKtExternalSyntheticLambda1AsBinder)) {
                        onExtraCallback(i5);
                    }
                    i5++;
                }
                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
                if (selectionContainerKtExternalSyntheticLambda112.onExtraCallback || selectionContainerKtExternalSyntheticLambda112.extraCallbackWithResult >= 500000 || !IAuthTabCallback(this.newSession.onExtraCallbackWithResult()) || !prefetchWithMultipleUrls()) {
                    this.prefetch = -9223372036854775807L;
                } else if (this.prefetch == -9223372036854775807L) {
                    this.prefetch = this.asBinder.IAuthTabCallback();
                } else if (this.asBinder.IAuthTabCallback() - this.prefetch >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z5 = !prefetchWithMultipleUrls() && this.mayLaunchUrl.IAuthTabCallbackStub == 3;
            z3 = !this.onActivityLayout && this.updateVisuals && z5;
            selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
            if (selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor != z3) {
                this.mayLaunchUrl = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted(z3);
            }
            this.updateVisuals = false;
            if (!z3 && (i2 = this.mayLaunchUrl.IAuthTabCallbackStub) != 4 && (z5 || i2 == 2 || (i2 == 3 && this.getInterfaceDescriptor != 0))) {
                onExtraCallback(jOnExtraCallbackWithResult);
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
        }
        requestPostMessageChannel();
        if (this.mayLaunchUrl.IAuthTabCallbackStub != 2) {
        }
        if (prefetchWithMultipleUrls()) {
        }
        if (this.onActivityLayout) {
        }
        selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        if (selectionContainerKtExternalSyntheticLambda11.getInterfaceDescriptor != z3) {
        }
        this.updateVisuals = false;
        if (!z3) {
            onExtraCallback(jOnExtraCallbackWithResult);
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
    }

    private void onNavigationEvent(final int i2, final boolean z) {
        boolean[] zArr = this.ICustomTabsServiceDefault;
        if (zArr[i2] != z) {
            zArr[i2] = z;
            this.onExtraCallbackWithResult.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MultiSelectionLayoutExternalSyntheticLambda0 multiSelectionLayoutExternalSyntheticLambda0 = this.f$0;
                    int i3 = i2;
                    multiSelectionLayoutExternalSyntheticLambda0.onNavigationEvent.onNavigationEvent(i3, multiSelectionLayoutExternalSyntheticLambda0.validateRelationship[i3].onWarmupCompleted(), z);
                }
            });
        }
    }

    private long IAuthTabCallback_Parcel() {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        return onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback, selectionContainerKtExternalSyntheticLambda11.access100);
    }

    private long onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Object obj, long j) {
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, this.ICustomTabsCallbackStub).IAuthTabCallbackStub, this.IEngagementSignalsCallback_Parcel);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = this.IEngagementSignalsCallback_Parcel;
        if (iAuthTabCallback.writeTypedObject != -9223372036854775807L && iAuthTabCallback.IAuthTabCallbackStub()) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback2 = this.IEngagementSignalsCallback_Parcel;
            if (iAuthTabCallback2.asInterface) {
                return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(iAuthTabCallback2.onWarmupCompleted() - this.IEngagementSignalsCallback_Parcel.writeTypedObject) - (j + this.ICustomTabsCallbackStub.onWarmupCompleted());
            }
        }
        return -9223372036854775807L;
    }

    private boolean onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        if (onextracallbackwithresult.IAuthTabCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            return false;
        }
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.ICustomTabsCallbackStub).IAuthTabCallbackStub, this.IEngagementSignalsCallback_Parcel);
        if (!this.IEngagementSignalsCallback_Parcel.IAuthTabCallbackStub()) {
            return false;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = this.IEngagementSignalsCallback_Parcel;
        return iAuthTabCallback.asInterface && iAuthTabCallback.writeTypedObject != -9223372036854775807L;
    }

    private void onExtraCallback(long j) {
        long jICustomTabsCallback;
        if (extraCallback()) {
            jICustomTabsCallback = access000();
        } else {
            jICustomTabsCallback = ICustomTabsCallback();
        }
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(2, j + jICustomTabsCallback);
    }

    private long access000() {
        long jMin = this.mayLaunchUrl.IAuthTabCallbackStub == 3 ? 1000L : IAuthTabCallback;
        for (RendererHolder rendererHolder : this.validateRelationship) {
            jMin = Math.min(jMin, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(rendererHolder.IAuthTabCallback(this.warmup, this.requestPostMessageChannel)));
        }
        if (!this.mayLaunchUrl.IAuthTabCallback()) {
            return jMin;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.asBinder() != null ? this.newSession.asBinder().onExtraCallbackWithResult() : null;
        return (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == null || ((float) this.warmup) + (((float) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jMin)) * this.mayLaunchUrl.onTransact.onExtraCallbackWithResult) < ((float) selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent())) ? jMin : Math.min(jMin, IAuthTabCallback);
    }

    private long ICustomTabsCallback() {
        if (this.mayLaunchUrl.IAuthTabCallbackStub != 3 || prefetchWithMultipleUrls()) {
            return IAuthTabCallback;
        }
        return 1000L;
    }

    private void onExtraCallbackWithResult(asInterface asinterface, boolean z) throws Throwable {
        long j;
        long j2;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult;
        boolean z2;
        boolean z3;
        long j3;
        long jOnExtraCallback;
        long jIAuthTabCallback;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11;
        int i2;
        boolean z4;
        long j4;
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(z ? 1 : 0);
        if (this.writeTypedList) {
            this.prefetchWithMultipleUrls = asinterface;
            return;
        }
        Pair<Object, Long> pairOnNavigationEvent = onNavigationEvent(this.mayLaunchUrl.ICustomTabsCallback, asinterface, true, this.ICustomTabsServiceStub, this.onSessionEnded, this.IEngagementSignalsCallback_Parcel, this.ICustomTabsCallbackStub);
        if (pairOnNavigationEvent == null) {
            Pair<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult, Long> pairOnWarmupCompleted = onWarmupCompleted(this.mayLaunchUrl.ICustomTabsCallback);
            onextracallbackwithresult = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pairOnWarmupCompleted.first;
            long jLongValue = ((Long) pairOnWarmupCompleted.second).longValue();
            z2 = !this.mayLaunchUrl.ICustomTabsCallback.onExtraCallback();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairOnNavigationEvent.first;
            long jLongValue2 = ((Long) pairOnNavigationEvent.second).longValue();
            long j5 = asinterface.onNavigationEvent == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = this.newSession.onNavigationEvent(this.mayLaunchUrl.ICustomTabsCallback, obj, jLongValue2);
            if (onextracallbackwithresultOnNavigationEvent.IAuthTabCallback()) {
                this.mayLaunchUrl.ICustomTabsCallback.onExtraCallbackWithResult(onextracallbackwithresultOnNavigationEvent.onExtraCallback, this.ICustomTabsCallbackStub);
                jLongValue2 = this.ICustomTabsCallbackStub.onWarmupCompleted(onextracallbackwithresultOnNavigationEvent.onWarmupCompleted) == onextracallbackwithresultOnNavigationEvent.IAuthTabCallback ? this.ICustomTabsCallbackStub.IAuthTabCallback() : 0L;
            } else if (asinterface.onNavigationEvent != -9223372036854775807L) {
                j = jLongValue2;
                j2 = j5;
                onextracallbackwithresult = onextracallbackwithresultOnNavigationEvent;
                z2 = false;
            }
            j = jLongValue2;
            j2 = j5;
            onextracallbackwithresult = onextracallbackwithresultOnNavigationEvent;
            z2 = true;
        }
        try {
            if (this.mayLaunchUrl.ICustomTabsCallback.onExtraCallback()) {
                this.onRelationshipValidationResult = asinterface;
            } else if (pairOnNavigationEvent == null) {
                if (this.mayLaunchUrl.IAuthTabCallbackStub != 1) {
                    IAuthTabCallbackStub(4);
                }
                onExtraCallbackWithResult(false, true, false, true);
            } else {
                try {
                    if (onextracallbackwithresult.equals(this.mayLaunchUrl.onWarmupCompleted)) {
                        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
                        jOnExtraCallback = (selectionAdjustmentKtExternalSyntheticLambda1AsBinder == null || !selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface || j == 0) ? j : selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onNavigationEvent.onExtraCallback(j, IAuthTabCallback(this.IEngagementSignalsCallback_Parcel.onExtraCallbackWithResult));
                        if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jOnExtraCallback) == TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.mayLaunchUrl.access100) && ((i2 = (selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl).IAuthTabCallbackStub) == 2 || i2 == 3)) {
                            z4 = z2;
                            j4 = selectionContainerKtExternalSyntheticLambda11.access100;
                            this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, j4, j2, j4, z4, 2);
                        }
                    } else {
                        jOnExtraCallback = j;
                    }
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = selectionContainerKtExternalSyntheticLambda112.ICustomTabsCallback;
                    onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted, j2, true);
                    z2 = z3;
                    j = jIAuthTabCallback;
                } catch (Throwable th) {
                    th = th;
                    j3 = jIAuthTabCallback;
                    this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, j3, j2, j3, z3, 2);
                    throw th;
                }
                this.writeTypedList = this.access200;
                jIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, jOnExtraCallback, this.mayLaunchUrl.IAuthTabCallbackStub == 4);
                z3 = z2 | (j != jIAuthTabCallback);
            }
            z4 = z2;
            j4 = j;
            this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, j4, j2, j4, z4, 2);
        } catch (Throwable th2) {
            th = th2;
            z3 = z2;
            j3 = j;
        }
    }

    private SelectionContainerKtExternalSyntheticLambda2 IAuthTabCallback(long j) {
        SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3;
        Double d;
        if (!this.access200 || j == -9223372036854775807L || (d = (selectionContainerKtExternalSyntheticLambda3 = this.IEngagementSignalsCallback).onExtraCallback) == null || selectionContainerKtExternalSyntheticLambda3.onWarmupCompleted == null) {
            return this.onVerticalScrollEvent;
        }
        double dDoubleValue = d.doubleValue();
        double d2 = j;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long jRoundToLong = DoubleMath.roundToLong(dDoubleValue * d2, roundingMode);
        long jRoundToLong2 = DoubleMath.roundToLong(this.IEngagementSignalsCallback.onWarmupCompleted.doubleValue() * d2, roundingMode);
        SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2 = this.ICustomTabsServiceStubProxy;
        if (selectionContainerKtExternalSyntheticLambda2 == null || selectionContainerKtExternalSyntheticLambda2.IAuthTabCallbackDefault != jRoundToLong || selectionContainerKtExternalSyntheticLambda2.asInterface != jRoundToLong2) {
            this.ICustomTabsServiceStubProxy = new SelectionContainerKtExternalSyntheticLambda2(jRoundToLong, jRoundToLong2);
        }
        return this.ICustomTabsServiceStubProxy;
    }

    private long IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        return onExtraCallback(onextracallbackwithresult, j, this.newSession.asBinder() != this.newSession.asInterface(), z);
    }

    private long onExtraCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        requestPostMessageChannel();
        IAuthTabCallback(false, true);
        if (z2 || this.mayLaunchUrl.IAuthTabCallbackStub == 3) {
            IAuthTabCallbackStub(2);
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1AsBinder;
        while (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && !onextracallbackwithresult.equals(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback)) {
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        if (z || selectionAdjustmentKtExternalSyntheticLambda1AsBinder != selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult || (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback(j) < 0)) {
            getInterfaceDescriptor();
            if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null) {
                while (this.newSession.asBinder() != selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult) {
                    this.newSession.IAuthTabCallback();
                }
                this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult);
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent(1000000000000L);
                access100();
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback = true;
            }
        }
        IAuthTabCallbackStub();
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null) {
            this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult);
            if (!selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface) {
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult(j);
            } else if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult) {
                long jOnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult(j);
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent.onExtraCallback(jOnExtraCallbackWithResult - this.onWarmupCompleted, this.ICustomTabsService_Parcel);
                j = jOnExtraCallbackWithResult;
            }
            onExtraCallbackWithResult(j);
            onActivityLayout();
        } else {
            this.newSession.onNavigationEvent();
            onExtraCallbackWithResult(j);
        }
        onNavigationEvent(false);
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
        return j;
    }

    private void onExtraCallbackWithResult(long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        long jOnExtraCallback = selectionAdjustmentKtExternalSyntheticLambda1AsBinder == null ? j + 1000000000000L : selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallback(j);
        this.warmup = jOnExtraCallback;
        this.onPostMessage.onWarmupCompleted(jOnExtraCallback);
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.onExtraCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder, this.warmup);
        }
        ICustomTabsService();
    }

    private void onExtraCallback(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onNavigationEvent(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
        IAuthTabCallback(this.onPostMessage.onNavigationEvent(), true);
    }

    private void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        this.onVerticalScrollEvent = selectionContainerKtExternalSyntheticLambda2;
    }

    private void IAuthTabCallbackStub(boolean z) throws Throwable {
        if (!z) {
            this.writeTypedList = false;
            this.IAuthTabCallbackStubProxy.onNavigationEvent(37);
            asInterface asinterface = this.prefetchWithMultipleUrls;
            if (asinterface != null) {
                onExtraCallbackWithResult(asinterface, false);
                this.prefetchWithMultipleUrls = null;
            }
        }
        this.access200 = z;
        asBinder();
    }

    private void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.IEngagementSignalsCallback = selectionContainerKtExternalSyntheticLambda3;
        asBinder();
    }

    private void asBinder() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.IAuthTabCallback(this.access200 ? this.IEngagementSignalsCallback : null);
        }
    }

    private void onExtraCallback(boolean z, @Nullable TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2) {
        if (this.access000 != z) {
            this.access000 = z;
            if (!z) {
                for (RendererHolder rendererHolder : this.validateRelationship) {
                    rendererHolder.onTransact();
                }
            }
        }
        if (textFieldCoreModifierNodeExternalSyntheticLambda2 != null) {
            textFieldCoreModifierNodeExternalSyntheticLambda2.IAuthTabCallback();
        }
    }

    private void onExtraCallback(@Nullable Object obj, @Nullable TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.onNavigationEvent(obj);
        }
        int i2 = this.mayLaunchUrl.IAuthTabCallbackStub;
        if (i2 == 3 || i2 == 2) {
            this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
        }
        if (textFieldCoreModifierNodeExternalSyntheticLambda2 != null) {
            textFieldCoreModifierNodeExternalSyntheticLambda2.IAuthTabCallback();
        }
    }

    private void onWarmupCompleted(boolean z, boolean z2) {
        onExtraCallbackWithResult(z || !this.access000, false, true, false);
        this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(z2 ? 1 : 0);
        this.writeTypedObject.onExtraCallbackWithResult(this.postMessage);
        this.onExtraCallback.onExtraCallbackWithResult(this.mayLaunchUrl.asInterface, 1);
        IAuthTabCallbackStub(1);
    }

    private void IAuthTabCallback(TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2) {
        try {
            onExtraCallbackWithResult(true, false, true, false);
            postMessage();
            this.writeTypedObject.onNavigationEvent(this.postMessage);
            this.onExtraCallback.onExtraCallbackWithResult();
            this.onGreatestScrollPercentageIncreased.IAuthTabCallbackStub();
            IAuthTabCallbackStub(1);
        } finally {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult((Object) null);
            this.ICustomTabsService.onExtraCallback();
            textFieldCoreModifierNodeExternalSyntheticLambda2.IAuthTabCallback();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[PHI: r2 r6 r8
      0x0093: PHI (r2v2 o.BottomDrawerStateExternalSyntheticLambda2$onExtraCallbackWithResult) = 
      (r2v1 o.BottomDrawerStateExternalSyntheticLambda2$onExtraCallbackWithResult)
      (r2v12 o.BottomDrawerStateExternalSyntheticLambda2$onExtraCallbackWithResult)
     binds: [B:24:0x006b, B:26:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:24:0x006b, B:26:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:24:0x006b, B:26:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd A[PHI: r0
      0x00dd: PHI (r0v11 o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) = 
      (r0v10 o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10)
      (r0v10 o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10)
      (r0v21 o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10)
      (r0v21 o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10)
     binds: [B:30:0x00a2, B:32:0x00a6, B:34:0x00b7, B:36:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult;
        this.IAuthTabCallbackStubProxy.onNavigationEvent(2);
        this.writeTypedList = false;
        this.prefetchWithMultipleUrls = null;
        this.ICustomTabsCallbackStubProxy = null;
        IAuthTabCallback(false, true);
        this.onPostMessage.onWarmupCompleted();
        this.warmup = 1000000000000L;
        try {
            getInterfaceDescriptor();
        } catch (RuntimeException | AndroidSelectionHandles_androidKtExternalSyntheticLambda4 e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            for (RendererHolder rendererHolder : this.validateRelationship) {
                try {
                    rendererHolder.onTransact();
                } catch (RuntimeException e2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.getInterfaceDescriptor = 0;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted;
        long jLongValue = selectionContainerKtExternalSyntheticLambda11.access100;
        if (this.mayLaunchUrl.onWarmupCompleted.IAuthTabCallback() || onWarmupCompleted(this.mayLaunchUrl, this.ICustomTabsCallbackStub)) {
            j = this.mayLaunchUrl.IAuthTabCallback_Parcel;
        } else {
            j = this.mayLaunchUrl.access100;
        }
        if (z2) {
            this.onRelationshipValidationResult = null;
            Pair<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult, Long> pairOnWarmupCompleted = onWarmupCompleted(this.mayLaunchUrl.ICustomTabsCallback);
            onextracallbackwithresult2 = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) pairOnWarmupCompleted.first;
            jLongValue = ((Long) pairOnWarmupCompleted.second).longValue();
            j = -9223372036854775807L;
            z5 = onextracallbackwithresult2.equals(this.mayLaunchUrl.onWarmupCompleted) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.newSession.onNavigationEvent();
        this.IEngagementSignalsCallbackStub = false;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult = this.mayLaunchUrl.ICustomTabsCallback;
        if (z3 && (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult instanceof SelectionContainerKtExternalSyntheticLambda4)) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult = ((SelectionContainerKtExternalSyntheticLambda4) coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult).onExtraCallbackWithResult(this.onMessageChannelReady.onNavigationEvent());
            if (onextracallbackwithresult2.onWarmupCompleted != -1) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallback, this.ICustomTabsCallbackStub);
                if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult.IAuthTabCallback(this.ICustomTabsCallbackStub.IAuthTabCallbackStub, this.IEngagementSignalsCallback_Parcel).IAuthTabCallbackStub()) {
                    coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult;
                    onextracallbackwithresult = new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallback, onextracallbackwithresult2.onNavigationEvent);
                }
            }
        } else {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult;
            onextracallbackwithresult = onextracallbackwithresult2;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
        int i2 = selectionContainerKtExternalSyntheticLambda112.IAuthTabCallbackStub;
        AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4 = z4 ? null : selectionContainerKtExternalSyntheticLambda112.IAuthTabCallbackDefault;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11 = z5 ? BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback : selectionContainerKtExternalSyntheticLambda112.readTypedObject;
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = z5 ? this.IAuthTabCallbackDefault : selectionContainerKtExternalSyntheticLambda112.writeTypedObject;
        ImmutableList immutableListOf = z5 ? ImmutableList.of() : selectionContainerKtExternalSyntheticLambda112.extraCallback;
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = this.mayLaunchUrl;
        this.mayLaunchUrl = new SelectionContainerKtExternalSyntheticLambda11(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, j3, j2, i2, androidSelectionHandles_androidKtExternalSyntheticLambda4, false, bottomSheetScaffoldKtExternalSyntheticLambda11, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, immutableListOf, onextracallbackwithresult, selectionContainerKtExternalSyntheticLambda113.asInterface, selectionContainerKtExternalSyntheticLambda113.asBinder, selectionContainerKtExternalSyntheticLambda113.IAuthTabCallbackStubProxy, selectionContainerKtExternalSyntheticLambda113.onTransact, j2, 0L, j2, 0L, false);
        if (z3) {
            this.newSession.getInterfaceDescriptor();
            this.onMessageChannelReady.onExtraCallback();
        }
    }

    private Pair<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult, Long> onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        long jIAuthTabCallback = 0;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            return Pair.create(SelectionContainerKtExternalSyntheticLambda11.onExtraCallback(), 0L);
        }
        Pair pairOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(this.IEngagementSignalsCallback_Parcel, this.ICustomTabsCallbackStub, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(this.onSessionEnded), -9223372036854775807L);
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = this.newSession.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, pairOnExtraCallbackWithResult.first, 0L);
        long jLongValue = ((Long) pairOnExtraCallbackWithResult.second).longValue();
        if (onextracallbackwithresultOnNavigationEvent.IAuthTabCallback()) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresultOnNavigationEvent.onExtraCallback, this.ICustomTabsCallbackStub);
            if (onextracallbackwithresultOnNavigationEvent.IAuthTabCallback == this.ICustomTabsCallbackStub.onWarmupCompleted(onextracallbackwithresultOnNavigationEvent.onWarmupCompleted)) {
                jIAuthTabCallback = this.ICustomTabsCallbackStub.IAuthTabCallback();
            }
        } else {
            jIAuthTabCallback = jLongValue;
        }
        return Pair.create(onextracallbackwithresultOnNavigationEvent, Long.valueOf(jIAuthTabCallback));
    }

    private void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (selectionContainerKtExternalSyntheticLambda0.asBinder() == -9223372036854775807L) {
            IAuthTabCallback(selectionContainerKtExternalSyntheticLambda0);
            return;
        }
        if (this.mayLaunchUrl.ICustomTabsCallback.onExtraCallback()) {
            this.onUnminimized.add(new onExtraCallback(selectionContainerKtExternalSyntheticLambda0));
            return;
        }
        onExtraCallback onextracallback = new onExtraCallback(selectionContainerKtExternalSyntheticLambda0);
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.mayLaunchUrl.ICustomTabsCallback;
        if (IAuthTabCallback(onextracallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.ICustomTabsServiceStub, this.onSessionEnded, this.IEngagementSignalsCallback_Parcel, this.ICustomTabsCallbackStub)) {
            this.onUnminimized.add(onextracallback);
            Collections.sort(this.onUnminimized);
        } else {
            selectionContainerKtExternalSyntheticLambda0.IAuthTabCallback(false);
        }
    }

    private void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (selectionContainerKtExternalSyntheticLambda0.onWarmupCompleted() == this.isEngagementSignalsApiAvailable) {
            onWarmupCompleted(selectionContainerKtExternalSyntheticLambda0);
            int i2 = this.mayLaunchUrl.IAuthTabCallbackStub;
            if (i2 == 3 || i2 == 2) {
                this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                return;
            }
            return;
        }
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(15, selectionContainerKtExternalSyntheticLambda0).onNavigationEvent();
    }

    private void onExtraCallbackWithResult(final SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) {
        Looper looperOnWarmupCompleted = selectionContainerKtExternalSyntheticLambda0.onWarmupCompleted();
        if (!looperOnWarmupCompleted.getThread().isAlive()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TAG", "Trying to send message on a dead thread.");
            selectionContainerKtExternalSyntheticLambda0.IAuthTabCallback(false);
        } else {
            this.asBinder.onWarmupCompleted(looperOnWarmupCompleted, (Handler.Callback) null).onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MultiSelectionLayoutExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0, selectionContainerKtExternalSyntheticLambda0);
                }
            });
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(MultiSelectionLayoutExternalSyntheticLambda0 multiSelectionLayoutExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) {
        try {
            multiSelectionLayoutExternalSyntheticLambda0.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda0);
        } catch (AndroidSelectionHandles_androidKtExternalSyntheticLambda4 e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException((Throwable) e);
        }
    }

    private void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (selectionContainerKtExternalSyntheticLambda0.IAuthTabCallbackDefault()) {
            return;
        }
        try {
            selectionContainerKtExternalSyntheticLambda0.onTransact().handleMessage(selectionContainerKtExternalSyntheticLambda0.asInterface(), selectionContainerKtExternalSyntheticLambda0.onExtraCallback());
        } finally {
            selectionContainerKtExternalSyntheticLambda0.IAuthTabCallback(true);
        }
    }

    private void IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102) {
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback()) {
            return;
        }
        for (int size = this.onUnminimized.size() - 1; size >= 0; size--) {
            if (!IAuthTabCallback(this.onUnminimized.get(size), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, this.ICustomTabsServiceStub, this.onSessionEnded, this.IEngagementSignalsCallback_Parcel, this.ICustomTabsCallbackStub)) {
                this.onUnminimized.get(size).IAuthTabCallback.IAuthTabCallback(false);
                this.onUnminimized.remove(size);
            }
        }
        Collections.sort(this.onUnminimized);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0077, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onWarmupCompleted(long j, long j2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onExtraCallback onextracallback;
        if (this.onUnminimized.isEmpty() || this.mayLaunchUrl.onWarmupCompleted.IAuthTabCallback()) {
            return;
        }
        if (this.asInterface) {
            j--;
            this.asInterface = false;
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        int iIAuthTabCallback = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.onExtraCallback);
        int iMin = Math.min(this.onMinimized, this.onUnminimized.size());
        onExtraCallback onextracallback2 = iMin > 0 ? this.onUnminimized.get(iMin - 1) : null;
        while (onextracallback2 != null) {
            int i2 = onextracallback2.onExtraCallbackWithResult;
            if (i2 <= iIAuthTabCallback && (i2 != iIAuthTabCallback || onextracallback2.onWarmupCompleted <= j)) {
                break;
            }
            int i3 = iMin - 1;
            onextracallback2 = i3 > 0 ? this.onUnminimized.get(iMin - 2) : null;
            iMin = i3;
        }
        if (iMin < this.onUnminimized.size()) {
            onextracallback = this.onUnminimized.get(iMin);
            while (onextracallback != null && onextracallback.onNavigationEvent != null) {
                int i4 = onextracallback.onExtraCallbackWithResult;
                if (i4 >= iIAuthTabCallback && (i4 != iIAuthTabCallback || onextracallback.onWarmupCompleted > j)) {
                    break;
                }
                iMin++;
                if (iMin < this.onUnminimized.size()) {
                    onextracallback = this.onUnminimized.get(iMin);
                }
            }
            while (onextracallback != null && onextracallback.onNavigationEvent != null && onextracallback.onExtraCallbackWithResult == iIAuthTabCallback) {
                long j3 = onextracallback.onWarmupCompleted;
                if (j3 <= j || j3 > j2) {
                    break;
                }
                try {
                    IAuthTabCallback(onextracallback.IAuthTabCallback);
                    if (onextracallback.IAuthTabCallback.onNavigationEvent() || onextracallback.IAuthTabCallback.IAuthTabCallbackDefault()) {
                        this.onUnminimized.remove(iMin);
                    } else {
                        iMin++;
                    }
                    onextracallback = iMin < this.onUnminimized.size() ? this.onUnminimized.get(iMin) : null;
                } catch (Throwable th) {
                    if (onextracallback.IAuthTabCallback.onNavigationEvent() || onextracallback.IAuthTabCallback.IAuthTabCallbackDefault()) {
                        this.onUnminimized.remove(iMin);
                    }
                    throw th;
                }
            }
            this.onMinimized = iMin;
            return;
        }
        onextracallback = null;
    }

    private void getInterfaceDescriptor() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        for (int i2 = 0; i2 < this.validateRelationship.length; i2++) {
            onNavigationEvent(i2);
        }
        this.newAuthTabSession = -9223372036854775807L;
    }

    private void onNavigationEvent(int i2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int iOnExtraCallback = this.validateRelationship[i2].onExtraCallback();
        this.validateRelationship[i2].IAuthTabCallback(this.onPostMessage);
        onNavigationEvent(i2, false);
        this.getInterfaceDescriptor -= iOnExtraCallback;
    }

    private void IAuthTabCallbackStub() {
        if (this.IAuthTabCallback_Parcel && asInterface()) {
            for (RendererHolder rendererHolder : this.validateRelationship) {
                int iOnExtraCallback = rendererHolder.onExtraCallback();
                rendererHolder.onNavigationEvent(this.onPostMessage);
                this.getInterfaceDescriptor -= iOnExtraCallback - rendererHolder.onExtraCallback();
            }
            this.newAuthTabSession = -9223372036854775807L;
        }
    }

    private boolean onExtraCallback(int i2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        if (this.newSession.IAuthTabCallbackDefault() == null || !this.newSession.IAuthTabCallbackDefault().onWarmupCompleted.onExtraCallback.equals(onextracallbackwithresult)) {
            return false;
        }
        return this.validateRelationship[i2].IAuthTabCallback(this.newSession.IAuthTabCallbackDefault());
    }

    private void newSession() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        newAuthTabSession();
        IAuthTabCallback(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void newAuthTabSession() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z;
        float f = this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface();
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = null;
        boolean z2 = 1;
        boolean z3 = true;
        while (selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null && selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface) {
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
            ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnExtraCallback = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallback(f, selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.asInterface);
            if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder == this.newSession.asBinder()) {
                composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnExtraCallback;
            }
            if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnExtraCallback.onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact())) {
                boolean z4 = z2;
                if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder == selectionAdjustmentKtExternalSyntheticLambda1AsInterface) {
                    z3 = false;
                }
                selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult();
                z2 = z4;
            } else {
                if (z3) {
                    SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder2 = this.newSession.asBinder();
                    boolean z5 = (this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder2) & z2) != 0 ? z2 : false;
                    boolean[] zArr = new boolean[this.validateRelationship.length];
                    long jOnNavigationEvent = selectionAdjustmentKtExternalSyntheticLambda1AsBinder2.onNavigationEvent((ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0), this.mayLaunchUrl.access100, z5, zArr);
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
                    boolean z6 = (selectionContainerKtExternalSyntheticLambda112.IAuthTabCallbackStub == 4 || jOnNavigationEvent == selectionContainerKtExternalSyntheticLambda112.access100) ? false : z2;
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = this.mayLaunchUrl;
                    this.mayLaunchUrl = onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda113.onWarmupCompleted, jOnNavigationEvent, selectionContainerKtExternalSyntheticLambda113.IAuthTabCallback_Parcel, selectionContainerKtExternalSyntheticLambda113.onExtraCallbackWithResult, z6, 5);
                    if (z6) {
                        onExtraCallbackWithResult(jOnNavigationEvent);
                    }
                    IAuthTabCallbackStub();
                    boolean[] zArr2 = new boolean[this.validateRelationship.length];
                    int i2 = 0;
                    while (true) {
                        RendererHolder[] rendererHolderArr = this.validateRelationship;
                        if (i2 >= rendererHolderArr.length) {
                            break;
                        }
                        int iOnExtraCallback = rendererHolderArr[i2].onExtraCallback();
                        zArr2[i2] = this.validateRelationship[i2].IAuthTabCallbackDefault();
                        this.validateRelationship[i2].IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder2.asBinder[i2], this.onPostMessage, this.warmup, zArr[i2]);
                        if (iOnExtraCallback - this.validateRelationship[i2].onExtraCallback() > 0) {
                            onNavigationEvent(i2, false);
                        }
                        this.getInterfaceDescriptor -= iOnExtraCallback - this.validateRelationship[i2].onExtraCallback();
                        i2++;
                    }
                    onNavigationEvent(zArr2, this.warmup);
                    selectionAdjustmentKtExternalSyntheticLambda1AsBinder2.IAuthTabCallback = true;
                    z = true;
                } else {
                    this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsBinder);
                    if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface) {
                        long jMax = Math.max(selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.onTransact, selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted(this.warmup));
                        if (this.IAuthTabCallback_Parcel && asInterface() && this.newSession.IAuthTabCallbackDefault() == selectionAdjustmentKtExternalSyntheticLambda1AsBinder) {
                            IAuthTabCallbackStub();
                        }
                        selectionAdjustmentKtExternalSyntheticLambda1AsBinder.IAuthTabCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnExtraCallback, jMax, false);
                    }
                    z = true;
                }
                onNavigationEvent(z);
                if (this.mayLaunchUrl.IAuthTabCallbackStub != 4) {
                    onActivityLayout();
                    updateVisuals();
                    this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                    return;
                }
                return;
            }
        }
    }

    private void onExtraCallback(float f) {
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder(); selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null; selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult()) {
            for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact().onExtraCallbackWithResult) {
                if (colorsKtExternalSyntheticLambda0 != null) {
                    colorsKtExternalSyntheticLambda0.onExtraCallback(f);
                }
            }
        }
    }

    private void ICustomTabsService() {
        for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder(); selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null; selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult()) {
            for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact().onExtraCallbackWithResult) {
            }
        }
    }

    private boolean asBinder(boolean z) {
        if (this.getInterfaceDescriptor == 0) {
            return onActivityResized();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (!this.mayLaunchUrl.onExtraCallback) {
            return true;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        long jOnExtraCallback = onNavigationEvent(this.mayLaunchUrl.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.onExtraCallback) ? this.extraCallbackWithResult.onExtraCallback() : -9223372036854775807L;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        boolean z3 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface() && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult;
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback.IAuthTabCallback() && !selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface) {
            z2 = true;
        }
        if (z3 || z2) {
            return true;
        }
        return this.writeTypedObject.onExtraCallback(new adjust.IAuthTabCallback(this.postMessage, this.mayLaunchUrl.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.onExtraCallback, selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted(this.warmup), onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback()), this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult, this.mayLaunchUrl.asInterface, this.readTypedObject, jOnExtraCallback, this.ICustomTabsCallback));
    }

    private boolean onActivityResized() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        long j = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.IAuthTabCallback;
        if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface) {
            return j == -9223372036854775807L || this.mayLaunchUrl.access100 < j || !prefetchWithMultipleUrls();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, boolean z) throws Throwable {
        int i2;
        long j;
        asInterface asinterface;
        int i3;
        boolean z2;
        long j2;
        long jIAuthTabCallback;
        onTransact ontransactOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.mayLaunchUrl, this.onRelationshipValidationResult, this.newSession, this.ICustomTabsServiceStub, this.onSessionEnded, this.IEngagementSignalsCallback_Parcel, this.ICustomTabsCallbackStub);
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = ontransactOnNavigationEvent.onExtraCallback;
        long j3 = ontransactOnNavigationEvent.onWarmupCompleted;
        boolean z3 = ontransactOnNavigationEvent.IAuthTabCallback;
        long j4 = ontransactOnNavigationEvent.onExtraCallbackWithResult;
        boolean z4 = (this.mayLaunchUrl.onWarmupCompleted.equals(onextracallbackwithresult) && j4 == this.mayLaunchUrl.access100) ? false : true;
        try {
            if (ontransactOnNavigationEvent.onNavigationEvent) {
                if (this.mayLaunchUrl.IAuthTabCallbackStub != 1) {
                    IAuthTabCallbackStub(4);
                }
                onExtraCallbackWithResult(false, false, false, true);
            }
            try {
                for (RendererHolder rendererHolder : this.validateRelationship) {
                    rendererHolder.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                }
                try {
                    if (z4) {
                        z2 = false;
                        j2 = j3;
                        i3 = 4;
                        jIAuthTabCallback = j4;
                        if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                            for (SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder(); selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null; selectionAdjustmentKtExternalSyntheticLambda1AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult()) {
                                if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.onExtraCallback.equals(onextracallbackwithresult)) {
                                    selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted = this.newSession.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted);
                                    selectionAdjustmentKtExternalSyntheticLambda1AsBinder.IAuthTabCallbackStubProxy();
                                }
                            }
                            jIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, jIAuthTabCallback, z3);
                        }
                    } else {
                        try {
                            i3 = 4;
                            z2 = false;
                            j2 = j3;
                            jIAuthTabCallback = j4;
                            int iOnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.warmup, this.newSession.asInterface() == null ? 0L : onExtraCallback(this.newSession.asInterface()), (!asInterface() || this.newSession.IAuthTabCallbackDefault() == null) ? 0L : onExtraCallback(this.newSession.IAuthTabCallbackDefault()));
                            if ((iOnExtraCallbackWithResult & 1) != 0) {
                                IAuthTabCallback(false);
                            } else if ((iOnExtraCallbackWithResult & 2) != 0) {
                                IAuthTabCallbackStub();
                            }
                        } catch (Throwable th) {
                            th = th;
                            j = j3;
                            i2 = 4;
                            j3 = j4;
                            asinterface = null;
                            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
                            asInterface asinterface2 = asinterface;
                            onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted, !ontransactOnNavigationEvent.onTransact ? j3 : -9223372036854775807L, false);
                            if (!z4 || j != this.mayLaunchUrl.IAuthTabCallback_Parcel) {
                                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
                                Object obj = selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted.onExtraCallback;
                                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 = selectionContainerKtExternalSyntheticLambda112.ICustomTabsCallback;
                                this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, j3, j, this.mayLaunchUrl.onExtraCallbackWithResult, (z4 || !z || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult(obj, this.ICustomTabsCallbackStub).onWarmupCompleted) ? false : true, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj) == -1 ? i2 : 3);
                            }
                            prefetch();
                            IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.mayLaunchUrl.ICustomTabsCallback);
                            this.mayLaunchUrl = this.mayLaunchUrl.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                            if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                                this.onRelationshipValidationResult = asinterface2;
                            }
                            onNavigationEvent(false);
                            this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                            throw th;
                        }
                    }
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda113 = this.mayLaunchUrl;
                    onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, selectionContainerKtExternalSyntheticLambda113.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda113.onWarmupCompleted, ontransactOnNavigationEvent.onTransact ? jIAuthTabCallback : -9223372036854775807L, false);
                    if (z4 || j2 != this.mayLaunchUrl.IAuthTabCallback_Parcel) {
                        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda114 = this.mayLaunchUrl;
                        Object obj2 = selectionContainerKtExternalSyntheticLambda114.onWarmupCompleted.onExtraCallback;
                        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103 = selectionContainerKtExternalSyntheticLambda114.ICustomTabsCallback;
                        this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, jIAuthTabCallback, j2, this.mayLaunchUrl.onExtraCallbackWithResult, (!z4 || !z || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103.onExtraCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103.onExtraCallbackWithResult(obj2, this.ICustomTabsCallbackStub).onWarmupCompleted) ? z2 : true, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj2) == -1 ? i3 : 3);
                    }
                    prefetch();
                    IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.mayLaunchUrl.ICustomTabsCallback);
                    this.mayLaunchUrl = this.mayLaunchUrl.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                    if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                        this.onRelationshipValidationResult = null;
                    }
                    onNavigationEvent(z2);
                    this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                j = j3;
                i2 = 4;
                j3 = j4;
                asinterface = null;
                SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda115 = this.mayLaunchUrl;
                asInterface asinterface22 = asinterface;
                onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult, selectionContainerKtExternalSyntheticLambda115.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda115.onWarmupCompleted, !ontransactOnNavigationEvent.onTransact ? j3 : -9223372036854775807L, false);
                if (!z4) {
                    SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda1122 = this.mayLaunchUrl;
                    Object obj3 = selectionContainerKtExternalSyntheticLambda1122.onWarmupCompleted.onExtraCallback;
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1022 = selectionContainerKtExternalSyntheticLambda1122.ICustomTabsCallback;
                    if (z4) {
                        this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, j3, j, this.mayLaunchUrl.onExtraCallbackWithResult, (z4 || !z || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1022.onExtraCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1022.onExtraCallbackWithResult(obj3, this.ICustomTabsCallbackStub).onWarmupCompleted) ? false : true, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj3) == -1 ? i2 : 3);
                    }
                }
                prefetch();
                IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.mayLaunchUrl.ICustomTabsCallback);
                this.mayLaunchUrl = this.mayLaunchUrl.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                }
                onNavigationEvent(false);
                this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            i2 = 4;
            j = j3;
        }
    }

    private void onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2, long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (!onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult)) {
            AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = onextracallbackwithresult.IAuthTabCallback() ? AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback : this.mayLaunchUrl.onTransact;
            if (this.onPostMessage.onNavigationEvent().equals(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1)) {
                return;
            }
            onNavigationEvent(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
            IAuthTabCallback(this.mayLaunchUrl.onTransact, androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult, false, false);
            return;
        }
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.ICustomTabsCallbackStub).IAuthTabCallbackStub, this.IEngagementSignalsCallback_Parcel);
        SelectionAdjustmentCompanionExternalSyntheticLambda0 selectionAdjustmentCompanionExternalSyntheticLambda0 = this.extraCallbackWithResult;
        Object[] objArr = {this.IEngagementSignalsCallback_Parcel.onTransact};
        selectionAdjustmentCompanionExternalSyntheticLambda0.onWarmupCompleted((TextFieldStateKtExternalSyntheticLambda0.onTransact) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742));
        if (j != -9223372036854775807L) {
            this.extraCallbackWithResult.onWarmupCompleted(onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallbackwithresult.onExtraCallback, j));
            return;
        }
        if (!Objects.equals(!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback() ? coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallback, this.ICustomTabsCallbackStub).IAuthTabCallbackStub, this.IEngagementSignalsCallback_Parcel).extraCallback : null, this.IEngagementSignalsCallback_Parcel.extraCallback) || z) {
            this.extraCallbackWithResult.onWarmupCompleted(-9223372036854775807L);
        }
    }

    private long onExtraCallback(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        if (selectionAdjustmentKtExternalSyntheticLambda1 == null) {
            return 0L;
        }
        long jIAuthTabCallback = selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback();
        if (!selectionAdjustmentKtExternalSyntheticLambda1.asInterface) {
            return jIAuthTabCallback;
        }
        int i2 = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.validateRelationship;
            if (i2 >= rendererHolderArr.length) {
                return jIAuthTabCallback;
            }
            if (rendererHolderArr[i2].asInterface(selectionAdjustmentKtExternalSyntheticLambda1)) {
                long jOnExtraCallbackWithResult = this.validateRelationship[i2].onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1);
                if (jOnExtraCallbackWithResult == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jIAuthTabCallback = Math.max(jOnExtraCallbackWithResult, jIAuthTabCallback);
            }
            i2++;
        }
    }

    private void warmup() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.mayLaunchUrl.ICustomTabsCallback.onExtraCallback() || !this.onMessageChannelReady.IAuthTabCallback()) {
            return;
        }
        boolean zICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        ICustomTabsCallbackStub();
        isEngagementSignalsApiAvailable();
        ICustomTabsCallback_Parcel();
        onRelationshipValidationResult();
        onWarmupCompleted(zICustomTabsCallbackStubProxy);
    }

    private boolean ICustomTabsCallbackStubProxy() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted;
        this.newSession.onExtraCallback(this.warmup);
        boolean z = false;
        if (this.newSession.IAuthTabCallbackStubProxy() && (selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted = this.newSession.onWarmupCompleted(this.warmup, this.mayLaunchUrl)) != null) {
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult(selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted);
            if (!selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback) {
                selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback(this, selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted.onTransact);
            } else if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface) {
                this.IAuthTabCallbackStubProxy.onWarmupCompleted(8, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent).onNavigationEvent();
            }
            if (this.newSession.asBinder() == selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult) {
                onExtraCallbackWithResult(selectionAdjustmentCompanionExternalSyntheticLambda4OnWarmupCompleted.onTransact);
            }
            onNavigationEvent(false);
            z = true;
        }
        if (this.IEngagementSignalsCallbackStub) {
            this.IEngagementSignalsCallbackStub = IAuthTabCallback(this.newSession.onExtraCallbackWithResult());
            ICustomTabsServiceStub();
            return z;
        }
        onActivityLayout();
        return z;
    }

    private void ICustomTabsCallbackStub() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault;
        if (this.ICustomTabsCallbackDefault || !this.IAuthTabCallback_Parcel || this.access100 || asInterface() || (selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault = this.newSession.IAuthTabCallbackDefault()) == null || selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault != this.newSession.asInterface() || selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault.onExtraCallbackWithResult() == null || !selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault.onExtraCallbackWithResult().asInterface) {
            return;
        }
        this.newSession.onWarmupCompleted();
        onUnminimized();
    }

    private void onUnminimized() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault = this.newSession.IAuthTabCallbackDefault();
        if (selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault != null) {
            ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault.onTransact();
            for (int i2 = 0; i2 < this.validateRelationship.length; i2++) {
                if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i2) && this.validateRelationship[i2].onExtraCallbackWithResult() && !this.validateRelationship[i2].asBinder()) {
                    this.validateRelationship[i2].access100();
                    onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault, i2, false, selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault.onNavigationEvent());
                }
            }
            if (asInterface()) {
                this.newAuthTabSession = selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault.onNavigationEvent.IAuthTabCallbackStub();
                if (selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault.asInterface()) {
                    return;
                }
                this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1IAuthTabCallbackDefault);
                onNavigationEvent(false);
                onActivityLayout();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (r0 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void isEngagementSignalsApiAvailable() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsInterface != null) {
            int i2 = 0;
            if (selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onExtraCallbackWithResult() == null || this.ICustomTabsCallbackDefault) {
                if (selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onWarmupCompleted.onExtraCallbackWithResult || this.ICustomTabsCallbackDefault) {
                    RendererHolder[] rendererHolderArr = this.validateRelationship;
                    int length = rendererHolderArr.length;
                    while (i2 < length) {
                        RendererHolder rendererHolder = rendererHolderArr[i2];
                        if (rendererHolder.asInterface(selectionAdjustmentKtExternalSyntheticLambda1AsInterface) && rendererHolder.onExtraCallback(selectionAdjustmentKtExternalSyntheticLambda1AsInterface)) {
                            long j = selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onWarmupCompleted.IAuthTabCallback;
                            rendererHolder.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1AsInterface, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : selectionAdjustmentKtExternalSyntheticLambda1AsInterface.IAuthTabCallback() + selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onWarmupCompleted.IAuthTabCallback);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            }
            if (readTypedObject()) {
                if (asInterface() && this.newSession.IAuthTabCallbackDefault() == this.newSession.asInterface()) {
                    return;
                }
                if (selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onExtraCallbackWithResult().asInterface || this.warmup >= selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onExtraCallbackWithResult().onNavigationEvent()) {
                    ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onTransact();
                    SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback = this.newSession.onExtraCallback();
                    ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact2 = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.onTransact();
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.mayLaunchUrl.ICustomTabsCallback;
                    onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.onWarmupCompleted.onExtraCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onWarmupCompleted.onExtraCallback, -9223372036854775807L, false);
                    if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.asInterface && ((this.IAuthTabCallback_Parcel && this.newAuthTabSession != -9223372036854775807L) || selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.onNavigationEvent.IAuthTabCallbackStub() != -9223372036854775807L)) {
                        this.newAuthTabSession = -9223372036854775807L;
                        boolean z = this.IAuthTabCallback_Parcel && !this.access100;
                        if (z) {
                            for (int i3 = 0; i3 < this.validateRelationship.length; i3++) {
                                if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact2.onNavigationEvent(i3) && this.validateRelationship[i3].onWarmupCompleted() != -2 && !AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.IAuthTabCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact2.onExtraCallbackWithResult[i3].IAuthTabCallback().isEngagementSignalsApiAvailable, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact2.onExtraCallbackWithResult[i3].IAuthTabCallback().IAuthTabCallbackStub) && !this.validateRelationship[i3].asBinder()) {
                                    IAuthTabCallbackDefault(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.onNavigationEvent());
                                    if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.asInterface()) {
                                        return;
                                    }
                                    this.newSession.IAuthTabCallback(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback);
                                    onNavigationEvent(false);
                                    onActivityLayout();
                                    return;
                                }
                            }
                        }
                    }
                    RendererHolder[] rendererHolderArr2 = this.validateRelationship;
                    int length2 = rendererHolderArr2.length;
                    while (i2 < length2) {
                        rendererHolderArr2[i2].onExtraCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact2, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallback.onNavigationEvent());
                        i2++;
                    }
                }
            }
        }
    }

    private void ICustomTabsCallback_Parcel() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface();
        if (selectionAdjustmentKtExternalSyntheticLambda1AsInterface == null || this.newSession.asBinder() == selectionAdjustmentKtExternalSyntheticLambda1AsInterface || selectionAdjustmentKtExternalSyntheticLambda1AsInterface.IAuthTabCallback || !ICustomTabsServiceDefault()) {
            return;
        }
        this.newSession.asInterface().IAuthTabCallback = true;
    }

    private boolean ICustomTabsServiceDefault() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface();
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onTransact();
        boolean z = true;
        int i2 = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.validateRelationship;
            if (i2 >= rendererHolderArr.length) {
                break;
            }
            int iOnExtraCallback = rendererHolderArr[i2].onExtraCallback();
            int iOnNavigationEvent = this.validateRelationship[i2].onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1AsInterface, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact, this.onPostMessage);
            if ((iOnNavigationEvent & 2) != 0 && this.onActivityLayout) {
                asInterface(false);
            }
            this.getInterfaceDescriptor -= iOnExtraCallback - this.validateRelationship[i2].onExtraCallback();
            z &= (iOnNavigationEvent & 1) != 0;
            i2++;
        }
        if (z) {
            for (int i3 = 0; i3 < this.validateRelationship.length; i3++) {
                if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i3) && !this.validateRelationship[i3].asInterface(selectionAdjustmentKtExternalSyntheticLambda1AsInterface)) {
                    onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1AsInterface, i3, false, selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onNavigationEvent());
                }
            }
        }
        return z;
    }

    private void onWarmupCompleted(boolean z) {
        if (this.newSessionWithExtras.onNavigationEvent == -9223372036854775807L) {
            return;
        }
        if (z || !this.mayLaunchUrl.ICustomTabsCallback.equals(this.extraCallback)) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.mayLaunchUrl.ICustomTabsCallback;
            this.extraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
            this.newSession.onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        }
        onMessageChannelReady();
    }

    private void onMessageChannelReady() {
        this.newSession.IAuthTabCallbackStub();
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnTransact = this.newSession.onTransact();
        if (selectionAdjustmentKtExternalSyntheticLambda1OnTransact != null) {
            if ((!selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onExtraCallback || selectionAdjustmentKtExternalSyntheticLambda1OnTransact.asInterface) && !selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onNavigationEvent.IAuthTabCallback()) {
                if (this.writeTypedObject.IAuthTabCallback(this.mayLaunchUrl.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onWarmupCompleted.onExtraCallback, selectionAdjustmentKtExternalSyntheticLambda1OnTransact.asInterface ? selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onNavigationEvent.onWarmupCompleted() : 0L)) {
                    if (!selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onExtraCallback) {
                        selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onExtraCallback(this, selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onWarmupCompleted.onTransact);
                    } else {
                        selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onExtraCallback(new PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1.IAuthTabCallback().onExtraCallback(selectionAdjustmentKtExternalSyntheticLambda1OnTransact.onWarmupCompleted(this.warmup)).IAuthTabCallback(this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult).IAuthTabCallback(this.ICustomTabsCallback).onExtraCallbackWithResult());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onRelationshipValidationResult() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z;
        boolean z2 = false;
        while (setEngagementSignalsCallback()) {
            if (z2) {
                onPostMessage();
            }
            this.access100 = false;
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession.IAuthTabCallback());
            if (this.mayLaunchUrl.onWarmupCompleted.onExtraCallback.equals(selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback.onExtraCallback)) {
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = this.mayLaunchUrl.onWarmupCompleted;
                if (onextracallbackwithresult.onWarmupCompleted == -1) {
                    BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback;
                    z = onextracallbackwithresult2.onWarmupCompleted == -1 && onextracallbackwithresult.onExtraCallbackWithResult != onextracallbackwithresult2.onExtraCallbackWithResult;
                }
            }
            SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted;
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3 = selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback;
            long j = selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact;
            this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult3, j, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub, j, !z, 0);
            prefetch();
            updateVisuals();
            if (asInterface() && selectionAdjustmentKtExternalSyntheticLambda1 == this.newSession.IAuthTabCallbackDefault()) {
                onMinimized();
            }
            if (this.mayLaunchUrl.IAuthTabCallbackStub == 3) {
                receiveFile();
            }
            IAuthTabCallbackDefault();
            z2 = true;
        }
    }

    private void onMinimized() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.asInterface();
        }
    }

    private void ICustomTabsCallbackDefault() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder;
        boolean z;
        if (this.newSession.asBinder() != this.newSession.asInterface() || (selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder()) == null) {
            return;
        }
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact();
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.validateRelationship.length) {
                z = true;
                break;
            }
            if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i2)) {
                if (this.validateRelationship[i2].onWarmupCompleted() != 1) {
                    z = false;
                    break;
                } else if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onWarmupCompleted[i2].onNavigationEvent != 0) {
                    z3 = true;
                }
            }
            i2++;
        }
        if (z3 && z) {
            z2 = true;
        }
        asInterface(z2);
    }

    private void IAuthTabCallbackDefault() {
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = this.newSession.asBinder().onTransact();
        for (int i2 = 0; i2 < this.validateRelationship.length; i2++) {
            if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i2)) {
                this.validateRelationship[i2].IAuthTabCallback();
            }
        }
    }

    private void prefetch() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        this.ICustomTabsCallbackDefault = selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null && selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted.asBinder && this.onActivityResized;
    }

    private boolean setEngagementSignalsCallback() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult;
        return prefetchWithMultipleUrls() && !this.ICustomTabsCallbackDefault && (selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder()) != null && (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onExtraCallbackWithResult()) != null && this.warmup >= selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent() && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback;
    }

    private boolean readTypedObject() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface();
        if (!selectionAdjustmentKtExternalSyntheticLambda1AsInterface.asInterface) {
            return false;
        }
        int i2 = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.validateRelationship;
            if (i2 >= rendererHolderArr.length) {
                return true;
            }
            if (!rendererHolderArr[i2].onWarmupCompleted(selectionAdjustmentKtExternalSyntheticLambda1AsInterface)) {
                return false;
            }
            i2++;
        }
    }

    private void IAuthTabCallbackDefault(long j) {
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.onExtraCallback(j);
        }
    }

    private void onNavigationEvent(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.newSession.IAuthTabCallback(bottomDrawerStateCompanionExternalSyntheticLambda1)) {
            onNavigationEvent((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession.onExtraCallbackWithResult()));
            return;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult(bottomDrawerStateCompanionExternalSyntheticLambda1);
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface);
            float f = this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult;
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
            selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback(f, selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.asInterface);
            if (this.newSession.onWarmupCompleted(bottomDrawerStateCompanionExternalSyntheticLambda1)) {
                onMessageChannelReady();
            }
        }
    }

    private void onNavigationEvent(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (!selectionAdjustmentKtExternalSyntheticLambda1.asInterface) {
            float f = this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult;
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
            selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback(f, selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, selectionContainerKtExternalSyntheticLambda11.asInterface);
        }
        onWarmupCompleted(selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback, selectionAdjustmentKtExternalSyntheticLambda1.asBinder(), selectionAdjustmentKtExternalSyntheticLambda1.onTransact());
        if (selectionAdjustmentKtExternalSyntheticLambda1 == this.newSession.asBinder()) {
            onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onTransact);
            access100();
            selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback = true;
            SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda112 = this.mayLaunchUrl;
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda112.onWarmupCompleted;
            long j = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onTransact;
            this.mayLaunchUrl = onExtraCallbackWithResult(onextracallbackwithresult, j, selectionContainerKtExternalSyntheticLambda112.IAuthTabCallback_Parcel, j, false, 5);
        }
        onActivityLayout();
    }

    private void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        if (this.newSession.IAuthTabCallback(bottomDrawerStateCompanionExternalSyntheticLambda1)) {
            this.newSession.onExtraCallback(this.warmup);
            onActivityLayout();
        } else if (this.newSession.onWarmupCompleted(bottomDrawerStateCompanionExternalSyntheticLambda1)) {
            onMessageChannelReady();
        }
    }

    private void IAuthTabCallback(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult, true, z);
    }

    private void IAuthTabCallback(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, float f, boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (z) {
            if (z2) {
                this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(1);
            }
            this.mayLaunchUrl = this.mayLaunchUrl.IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
        }
        onExtraCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult);
        for (RendererHolder rendererHolder : this.validateRelationship) {
            rendererHolder.onExtraCallback(f, androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
    }

    private void onActivityLayout() {
        boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras();
        this.IEngagementSignalsCallbackStub = zRequestPostMessageChannelWithExtras;
        if (zRequestPostMessageChannelWithExtras) {
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession.onExtraCallbackWithResult());
            selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallback(new PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1.IAuthTabCallback().onExtraCallback(selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted(this.warmup)).IAuthTabCallback(this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult).IAuthTabCallback(this.ICustomTabsCallback).onExtraCallbackWithResult());
        }
        ICustomTabsServiceStub();
    }

    private boolean requestPostMessageChannelWithExtras() {
        long jOnWarmupCompleted;
        if (!IAuthTabCallback(this.newSession.onExtraCallbackWithResult())) {
            return false;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        long jOnNavigationEvent = onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted());
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == this.newSession.asBinder()) {
            jOnWarmupCompleted = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted(this.warmup);
        } else {
            jOnWarmupCompleted = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted(this.warmup) - selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onTransact;
        }
        adjust.IAuthTabCallback iAuthTabCallback = new adjust.IAuthTabCallback(this.postMessage, this.mayLaunchUrl.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback, jOnWarmupCompleted, jOnNavigationEvent, this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult, this.mayLaunchUrl.asInterface, this.readTypedObject, onNavigationEvent(this.mayLaunchUrl.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback) ? this.extraCallbackWithResult.onExtraCallback() : -9223372036854775807L, this.ICustomTabsCallback);
        boolean zOnExtraCallbackWithResult = this.writeTypedObject.onExtraCallbackWithResult(iAuthTabCallback);
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
        if (zOnExtraCallbackWithResult || !selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asInterface || jOnNavigationEvent >= 500000) {
            return zOnExtraCallbackWithResult;
        }
        if (this.onWarmupCompleted <= 0 && !this.ICustomTabsService_Parcel) {
            return zOnExtraCallbackWithResult;
        }
        selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onNavigationEvent.onExtraCallback(this.mayLaunchUrl.access100, false);
        return this.writeTypedObject.onExtraCallbackWithResult(iAuthTabCallback);
    }

    private boolean IAuthTabCallback(@Nullable SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        return (selectionAdjustmentKtExternalSyntheticLambda1 == null || selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallbackStub() || selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted() == Long.MIN_VALUE) ? false : true;
    }

    private void ICustomTabsServiceStub() {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        boolean z = this.IEngagementSignalsCallbackStub || (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent.IAuthTabCallback());
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        if (z != selectionContainerKtExternalSyntheticLambda11.onExtraCallback) {
            this.mayLaunchUrl = selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback(z);
        }
    }

    private SelectionContainerKtExternalSyntheticLambda11 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, long j3, boolean z, int i2) {
        List listOf;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11;
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11AsBinder;
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact;
        this.asInterface = (!this.asInterface && j == this.mayLaunchUrl.access100 && onextracallbackwithresult.equals(this.mayLaunchUrl.onWarmupCompleted)) ? false : true;
        prefetch();
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda112 = selectionContainerKtExternalSyntheticLambda11.readTypedObject;
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02 = selectionContainerKtExternalSyntheticLambda11.writeTypedObject;
        List list = selectionContainerKtExternalSyntheticLambda11.extraCallback;
        if (this.onMessageChannelReady.IAuthTabCallback()) {
            SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsBinder = this.newSession.asBinder();
            if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder == null) {
                bottomSheetScaffoldKtExternalSyntheticLambda11AsBinder = BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback;
            } else {
                bottomSheetScaffoldKtExternalSyntheticLambda11AsBinder = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.asBinder();
            }
            if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder == null) {
                composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = this.IAuthTabCallbackDefault;
            } else {
                composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onTransact();
            }
            List listOnWarmupCompleted = onWarmupCompleted(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onExtraCallbackWithResult);
            if (selectionAdjustmentKtExternalSyntheticLambda1AsBinder != null) {
                SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted;
                if (selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub != j2) {
                    selectionAdjustmentKtExternalSyntheticLambda1AsBinder.onWarmupCompleted = selectionAdjustmentCompanionExternalSyntheticLambda4.onNavigationEvent(j2);
                }
            }
            ICustomTabsCallbackDefault();
            bottomSheetScaffoldKtExternalSyntheticLambda11 = bottomSheetScaffoldKtExternalSyntheticLambda11AsBinder;
            composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact;
            listOf = listOnWarmupCompleted;
        } else if (onextracallbackwithresult.equals(this.mayLaunchUrl.onWarmupCompleted)) {
            listOf = list;
            bottomSheetScaffoldKtExternalSyntheticLambda11 = bottomSheetScaffoldKtExternalSyntheticLambda112;
            composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02;
        } else {
            bottomSheetScaffoldKtExternalSyntheticLambda11 = BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback;
            composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = this.IAuthTabCallbackDefault;
            listOf = ImmutableList.of();
        }
        if (z) {
            this.ICustomTabsCallback_Parcel.onNavigationEvent(i2);
        }
        return this.mayLaunchUrl.onExtraCallback(onextracallbackwithresult, j, j2, j3, writeTypedObject(), bottomSheetScaffoldKtExternalSyntheticLambda11, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, listOf);
    }

    private ImmutableList<HandwritingHandlerNodeExternalSyntheticLambda0> onWarmupCompleted(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z = false;
        for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : colorsKtExternalSyntheticLambda0Arr) {
            if (colorsKtExternalSyntheticLambda0 != null) {
                HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0.onNavigationEvent(0).ICustomTabsCallbackDefault;
                if (handwritingHandlerNodeExternalSyntheticLambda0 == null) {
                    builder.add(new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[0]));
                } else {
                    builder.add(handwritingHandlerNodeExternalSyntheticLambda0);
                    z = true;
                }
            }
        }
        return z ? builder.build() : ImmutableList.of();
    }

    private void access100() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onNavigationEvent(new boolean[this.validateRelationship.length], this.newSession.asInterface().onNavigationEvent());
    }

    private void onNavigationEvent(boolean[] zArr, long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1AsInterface = this.newSession.asInterface();
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1AsInterface.onTransact();
        for (int i2 = 0; i2 < this.validateRelationship.length; i2++) {
            if (!composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i2)) {
                this.validateRelationship[i2].onTransact();
            }
        }
        for (int i3 = 0; i3 < this.validateRelationship.length; i3++) {
            if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onNavigationEvent(i3) && !this.validateRelationship[i3].asInterface(selectionAdjustmentKtExternalSyntheticLambda1AsInterface)) {
                onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1AsInterface, i3, zArr[i3], j);
            }
        }
    }

    private void onNavigationEvent(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, int i2, boolean z, long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        RendererHolder rendererHolder = this.validateRelationship[i2];
        if (rendererHolder.IAuthTabCallbackDefault()) {
            return;
        }
        boolean z2 = selectionAdjustmentKtExternalSyntheticLambda1 == this.newSession.asBinder();
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = selectionAdjustmentKtExternalSyntheticLambda1.onTransact();
        RendererConfiguration rendererConfiguration = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onWarmupCompleted[i2];
        ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onExtraCallbackWithResult[i2];
        boolean z3 = prefetchWithMultipleUrls() && this.mayLaunchUrl.IAuthTabCallbackStub == 3;
        boolean z4 = !z && z3;
        this.getInterfaceDescriptor++;
        rendererHolder.onNavigationEvent(rendererConfiguration, colorsKtExternalSyntheticLambda0, selectionAdjustmentKtExternalSyntheticLambda1.asBinder[i2], this.warmup, z4, z2, j, selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback(), selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback, this.onPostMessage);
        rendererHolder.onWarmupCompleted(11, new Renderer.WakeupListener() { // from class: o.MultiSelectionLayoutExternalSyntheticLambda0.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onExtraCallbackWithResult() {
                MultiSelectionLayoutExternalSyntheticLambda0.this.updateVisuals = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void IAuthTabCallback() {
                if (MultiSelectionLayoutExternalSyntheticLambda0.this.extraCallback() || MultiSelectionLayoutExternalSyntheticLambda0.this.onActivityLayout) {
                    MultiSelectionLayoutExternalSyntheticLambda0.this.IAuthTabCallbackStubProxy.IAuthTabCallback(2);
                }
            }
        }, selectionAdjustmentKtExternalSyntheticLambda1);
        if (z3 && z2) {
            rendererHolder.access000();
        }
    }

    private void postMessage() {
        for (int i2 = 0; i2 < this.validateRelationship.length; i2++) {
            this.requestPostMessageChannelWithExtras[i2].Y_();
            this.validateRelationship[i2].IAuthTabCallbackStub();
        }
    }

    private void onNavigationEvent(boolean z) {
        long jOnExtraCallback;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == null ? this.mayLaunchUrl.onWarmupCompleted : selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback;
        boolean zEquals = this.mayLaunchUrl.IAuthTabCallback.equals(onextracallbackwithresult);
        if (!zEquals) {
            this.mayLaunchUrl = this.mayLaunchUrl.onExtraCallbackWithResult(onextracallbackwithresult);
        }
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            jOnExtraCallback = selectionContainerKtExternalSyntheticLambda11.access100;
        } else {
            jOnExtraCallback = selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback();
        }
        selectionContainerKtExternalSyntheticLambda11.onNavigationEvent = jOnExtraCallback;
        this.mayLaunchUrl.extraCallbackWithResult = writeTypedObject();
        if ((!zEquals || z) && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface) {
            onWarmupCompleted(selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted.onExtraCallback, selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asBinder(), selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onTransact());
        }
    }

    private long writeTypedObject() {
        return onNavigationEvent(this.mayLaunchUrl.onNavigationEvent);
    }

    private long onNavigationEvent(long j) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.newSession.onExtraCallbackWithResult();
        if (selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            return 0L;
        }
        return Math.max(0L, j - selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted(this.warmup));
    }

    private void onWarmupCompleted(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0) {
        long jOnWarmupCompleted;
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1 = (SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession.onExtraCallbackWithResult());
        if (selectionAdjustmentKtExternalSyntheticLambda1 == this.newSession.asBinder()) {
            jOnWarmupCompleted = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted(this.warmup);
        } else {
            jOnWarmupCompleted = selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted(this.warmup) - selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onTransact;
        }
        this.writeTypedObject.IAuthTabCallback(new adjust.IAuthTabCallback(this.postMessage, this.mayLaunchUrl.ICustomTabsCallback, onextracallbackwithresult, jOnWarmupCompleted, onNavigationEvent(selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallback()), this.onPostMessage.onNavigationEvent().onExtraCallbackWithResult, this.mayLaunchUrl.asInterface, this.readTypedObject, onNavigationEvent(this.mayLaunchUrl.ICustomTabsCallback, selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback) ? this.extraCallbackWithResult.onExtraCallback() : -9223372036854775807L, this.ICustomTabsCallback), bottomSheetScaffoldKtExternalSyntheticLambda11, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    private boolean prefetchWithMultipleUrls() {
        SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11 = this.mayLaunchUrl;
        return selectionContainerKtExternalSyntheticLambda11.asInterface && selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStubProxy == 0;
    }

    private void onExtraCallback(int i2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4, IOException {
        RendererHolder rendererHolder = this.validateRelationship[i2];
        try {
            rendererHolder.IAuthTabCallbackStub((SelectionAdjustmentKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newSession.asBinder()));
        } catch (IOException | RuntimeException e) {
            int iOnWarmupCompleted = rendererHolder.onWarmupCompleted();
            if (iOnWarmupCompleted == 3 || iOnWarmupCompleted == 5) {
                ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact = this.newSession.asBinder().onTransact();
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ExoPlayerImplInternal", "Disabling track due to error: " + BasicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onExtraCallbackWithResult[i2].IAuthTabCallback()), e);
                ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = new ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0((RendererConfiguration[]) composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onWarmupCompleted.clone(), (ColorsKtExternalSyntheticLambda0[]) composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onExtraCallbackWithResult.clone(), composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.IAuthTabCallback, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnTransact.onExtraCallback);
                composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onWarmupCompleted[i2] = null;
                composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult[i2] = null;
                onNavigationEvent(i2);
                this.newSession.asBinder().IAuthTabCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, this.mayLaunchUrl.access100, false);
                return;
            }
            throw e;
        }
    }

    private boolean asInterface() {
        if (!this.IAuthTabCallback_Parcel) {
            return false;
        }
        for (RendererHolder rendererHolder : this.validateRelationship) {
            if (rendererHolder.asBinder()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean extraCallback() {
        if (this.onTransact) {
            return true;
        }
        return this.access200 && this.IEngagementSignalsCallback.IAuthTabCallbackDefault;
    }

    private static onTransact onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, @Nullable asInterface asinterface, SelectionAdjustmentCompanionExternalSyntheticLambda3 selectionAdjustmentCompanionExternalSyntheticLambda3, int i2, boolean z, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        long j;
        int i3;
        int i4;
        long jOnWarmupCompleted;
        boolean z2;
        boolean z3;
        boolean z4;
        int iIAuthTabCallback;
        boolean z5;
        boolean z6;
        SelectionAdjustmentCompanionExternalSyntheticLambda3 selectionAdjustmentCompanionExternalSyntheticLambda32;
        long j2;
        int i5;
        int iOnNavigationEvent;
        boolean z7;
        boolean z8;
        boolean z9;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            return new onTransact(SelectionContainerKtExternalSyntheticLambda11.onExtraCallback(), 0L, -9223372036854775807L, false, true, false);
        }
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted;
        Object obj = onextracallbackwithresult.onExtraCallback;
        boolean zOnWarmupCompleted = onWarmupCompleted(selectionContainerKtExternalSyntheticLambda11, onextracallback);
        if (selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted.IAuthTabCallback() || zOnWarmupCompleted) {
            j = selectionContainerKtExternalSyntheticLambda11.IAuthTabCallback_Parcel;
        } else {
            j = selectionContainerKtExternalSyntheticLambda11.access100;
        }
        long j3 = j;
        if (asinterface != null) {
            Pair<Object, Long> pairOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, asinterface, true, i2, z, iAuthTabCallback, onextracallback);
            if (pairOnNavigationEvent == null) {
                iOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(z);
                jOnWarmupCompleted = j3;
                z9 = true;
                z7 = false;
                z8 = false;
            } else {
                if (asinterface.onNavigationEvent == -9223372036854775807L) {
                    iOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(pairOnNavigationEvent.first, onextracallback).IAuthTabCallbackStub;
                    jOnWarmupCompleted = j3;
                    z7 = false;
                } else {
                    obj = pairOnNavigationEvent.first;
                    jOnWarmupCompleted = ((Long) pairOnNavigationEvent.second).longValue();
                    iOnNavigationEvent = -1;
                    z7 = true;
                }
                z8 = selectionContainerKtExternalSyntheticLambda11.IAuthTabCallbackStub == 4;
                z9 = false;
            }
            z4 = z7;
            z2 = z8;
            z3 = z9;
            i3 = -1;
            i4 = iOnNavigationEvent;
        } else {
            if (selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallback()) {
                iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(z);
            } else if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj) == -1) {
                iIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, onextracallback, i2, z, obj, selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                if (iIAuthTabCallback == -1) {
                    iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(z);
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5;
                i4 = iIAuthTabCallback;
                z3 = z6;
                i3 = -1;
                jOnWarmupCompleted = j3;
                z2 = false;
                z4 = false;
            } else if (j3 == -9223372036854775807L) {
                iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, onextracallback).IAuthTabCallbackStub;
            } else if (zOnWarmupCompleted) {
                selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, onextracallback);
                if (selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(onextracallback.IAuthTabCallbackStub, iAuthTabCallback).IAuthTabCallback == selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback.IAuthTabCallback(onextracallbackwithresult.onExtraCallback)) {
                    Pair pairOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(iAuthTabCallback, onextracallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, onextracallback).IAuthTabCallbackStub, onextracallback.onWarmupCompleted() + j3);
                    obj = pairOnExtraCallbackWithResult.first;
                    jOnWarmupCompleted = ((Long) pairOnExtraCallbackWithResult.second).longValue();
                    i3 = -1;
                } else if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, onextracallback).IAuthTabCallback != -9223372036854775807L) {
                    i3 = -1;
                    jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(j3, 0L, onextracallback.IAuthTabCallback - 1);
                } else {
                    i3 = -1;
                    jOnWarmupCompleted = j3;
                }
                i4 = i3;
                z4 = true;
                z2 = false;
                z3 = false;
            } else {
                i3 = -1;
                i4 = -1;
                jOnWarmupCompleted = j3;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            z6 = false;
            i4 = iIAuthTabCallback;
            z3 = z6;
            i3 = -1;
            jOnWarmupCompleted = j3;
            z2 = false;
            z4 = false;
        }
        if (i4 != i3) {
            Pair pairOnExtraCallbackWithResult2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(iAuthTabCallback, onextracallback, i4, -9223372036854775807L);
            obj = pairOnExtraCallbackWithResult2.first;
            jOnWarmupCompleted = ((Long) pairOnExtraCallbackWithResult2.second).longValue();
            selectionAdjustmentCompanionExternalSyntheticLambda32 = selectionAdjustmentCompanionExternalSyntheticLambda3;
            j2 = -9223372036854775807L;
        } else {
            selectionAdjustmentCompanionExternalSyntheticLambda32 = selectionAdjustmentCompanionExternalSyntheticLambda3;
            j2 = jOnWarmupCompleted;
        }
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = selectionAdjustmentCompanionExternalSyntheticLambda32.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, obj, jOnWarmupCompleted);
        int i6 = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult;
        boolean z10 = onextracallbackwithresult.onExtraCallback.equals(obj) && !onextracallbackwithresult.IAuthTabCallback() && !onextracallbackwithresultOnNavigationEvent.IAuthTabCallback() && (i6 == i3 || ((i5 = onextracallbackwithresult.onExtraCallbackWithResult) != i3 && i6 >= i5));
        boolean zIAuthTabCallback = IAuthTabCallback(zOnWarmupCompleted, onextracallbackwithresult, j3, onextracallbackwithresultOnNavigationEvent, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, onextracallback), j2);
        if (z10 || zIAuthTabCallback) {
            onextracallbackwithresultOnNavigationEvent = onextracallbackwithresult;
        }
        if (onextracallbackwithresultOnNavigationEvent.IAuthTabCallback()) {
            if (onextracallbackwithresultOnNavigationEvent.equals(onextracallbackwithresult)) {
                jOnWarmupCompleted = selectionContainerKtExternalSyntheticLambda11.access100;
            } else {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresultOnNavigationEvent.onExtraCallback, onextracallback);
                jOnWarmupCompleted = onextracallbackwithresultOnNavigationEvent.IAuthTabCallback == onextracallback.onWarmupCompleted(onextracallbackwithresultOnNavigationEvent.onWarmupCompleted) ? onextracallback.IAuthTabCallback() : 0L;
            }
        }
        return new onTransact(onextracallbackwithresultOnNavigationEvent, jOnWarmupCompleted, j2, z2, z3, z4);
    }

    private static boolean IAuthTabCallback(boolean z, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, long j2) {
        if (!z && j == j2 && onextracallbackwithresult.onExtraCallback.equals(onextracallbackwithresult2.onExtraCallback)) {
            if (onextracallbackwithresult.IAuthTabCallback() && onextracallback.IAuthTabCallbackDefault(onextracallbackwithresult.onWarmupCompleted)) {
                return (onextracallback.onNavigationEvent(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback) == 4 || onextracallback.onNavigationEvent(onextracallbackwithresult.onWarmupCompleted, onextracallbackwithresult.IAuthTabCallback) == 2) ? false : true;
            }
            if (onextracallbackwithresult2.IAuthTabCallback() && onextracallback.IAuthTabCallbackDefault(onextracallbackwithresult2.onWarmupCompleted)) {
                return true;
            }
        }
        return false;
    }

    private static boolean onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda11 selectionContainerKtExternalSyntheticLambda11, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda11.onWarmupCompleted;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = selectionContainerKtExternalSyntheticLambda11.ICustomTabsCallback;
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, onextracallback).onWarmupCompleted;
    }

    private void IAuthTabCallback(boolean z, boolean z2) {
        this.readTypedObject = z;
        this.ICustomTabsCallback = (!z || z2) ? -9223372036854775807L : this.asBinder.IAuthTabCallback();
    }

    private static boolean IAuthTabCallback(onExtraCallback onextracallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, int i2, boolean z, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback2) {
        Object obj = onextracallback.onNavigationEvent;
        if (obj == null) {
            Pair<Object, Long> pairOnNavigationEvent = onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, new asInterface(onextracallback.IAuthTabCallback.IAuthTabCallbackStub(), onextracallback.IAuthTabCallback.onExtraCallbackWithResult(), onextracallback.IAuthTabCallback.asBinder() == Long.MIN_VALUE ? -9223372036854775807L : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(onextracallback.IAuthTabCallback.asBinder())), false, i2, z, iAuthTabCallback, onextracallback2);
            if (pairOnNavigationEvent == null) {
                return false;
            }
            onextracallback.onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(pairOnNavigationEvent.first), ((Long) pairOnNavigationEvent.second).longValue(), pairOnNavigationEvent.first);
            if (onextracallback.IAuthTabCallback.asBinder() == Long.MIN_VALUE) {
                onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallback, iAuthTabCallback, onextracallback2);
            }
            return true;
        }
        int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj);
        if (iIAuthTabCallback == -1) {
            return false;
        }
        if (onextracallback.IAuthTabCallback.asBinder() == Long.MIN_VALUE) {
            onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onextracallback, iAuthTabCallback, onextracallback2);
            return true;
        }
        onextracallback.onExtraCallbackWithResult = iIAuthTabCallback;
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult(onextracallback.onNavigationEvent, onextracallback2);
        if (onextracallback2.onWarmupCompleted && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(onextracallback2.IAuthTabCallbackStub, iAuthTabCallback).IAuthTabCallback == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(onextracallback.onNavigationEvent)) {
            Pair pairOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(iAuthTabCallback, onextracallback2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallback.onNavigationEvent, onextracallback2).IAuthTabCallbackStub, onextracallback.onWarmupCompleted + onextracallback2.onWarmupCompleted());
            onextracallback.onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(pairOnExtraCallbackWithResult.first), ((Long) pairOnExtraCallbackWithResult.second).longValue(), pairOnExtraCallbackWithResult.first);
        }
        return true;
    }

    private static void onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, onExtraCallback onextracallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback2) {
        int i2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallback.onNavigationEvent, onextracallback2).IAuthTabCallbackStub, iAuthTabCallback).asBinder;
        Object obj = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i2, onextracallback2, true).asBinder;
        long j = onextracallback2.IAuthTabCallback;
        onextracallback.onExtraCallback(i2, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static Pair<Object, Long> onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, asInterface asinterface, boolean z, int i2, boolean z2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        Pair<Object, Long> pairOnExtraCallbackWithResult;
        int iIAuthTabCallback;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 = asinterface.onExtraCallback;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
            return null;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallback() ? coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 : coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102;
        try {
            pairOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103.onExtraCallbackWithResult(iAuthTabCallback, onextracallback, asinterface.onWarmupCompleted, asinterface.onNavigationEvent);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.equals(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103)) {
            return pairOnExtraCallbackWithResult;
        }
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(pairOnExtraCallbackWithResult.first) != -1) {
            return (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103.onExtraCallbackWithResult(pairOnExtraCallbackWithResult.first, onextracallback).onWarmupCompleted && coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103.IAuthTabCallback(onextracallback.IAuthTabCallbackStub, iAuthTabCallback).IAuthTabCallback == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103.IAuthTabCallback(pairOnExtraCallbackWithResult.first)) ? coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(iAuthTabCallback, onextracallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(pairOnExtraCallbackWithResult.first, onextracallback).IAuthTabCallbackStub, asinterface.onNavigationEvent) : pairOnExtraCallbackWithResult;
        }
        if (z && (iIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, onextracallback, i2, z2, pairOnExtraCallbackWithResult.first, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda103, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10)) != -1) {
            return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(iAuthTabCallback, onextracallback, iIAuthTabCallback, -9223372036854775807L);
        }
        return null;
    }

    static int IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, int i2, boolean z, Object obj, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102) {
        Object obj2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(obj, onextracallback).IAuthTabCallbackStub, iAuthTabCallback).extraCallback;
        for (int i3 = 0; i3 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult(); i3++) {
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(i3, iAuthTabCallback).extraCallback.equals(obj2)) {
                return i3;
            }
        }
        int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(obj);
        int iOnWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted();
        int iIAuthTabCallback2 = iIAuthTabCallback;
        int iIAuthTabCallback3 = -1;
        for (int i4 = 0; i4 < iOnWarmupCompleted && iIAuthTabCallback3 == -1; i4++) {
            iIAuthTabCallback2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(iIAuthTabCallback2, onextracallback, iAuthTabCallback, i2, z);
            if (iIAuthTabCallback2 == -1) {
                break;
            }
            iIAuthTabCallback3 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(iIAuthTabCallback2));
        }
        if (iIAuthTabCallback3 == -1) {
            return -1;
        }
        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(iIAuthTabCallback3, onextracallback).IAuthTabCallbackStub;
    }

    static final class asInterface {
        public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onExtraCallback;
        public final long onNavigationEvent;
        public final int onWarmupCompleted;

        public asInterface(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, int i2, long j) {
            this.onExtraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
            this.onWarmupCompleted = i2;
            this.onNavigationEvent = j;
        }
    }

    static final class onTransact {
        public final boolean IAuthTabCallback;
        public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallback;
        public final long onExtraCallbackWithResult;
        public final boolean onNavigationEvent;
        public final boolean onTransact;
        public final long onWarmupCompleted;

        public onTransact(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.onExtraCallback = onextracallbackwithresult;
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = j2;
            this.IAuthTabCallback = z;
            this.onNavigationEvent = z2;
            this.onTransact = z3;
        }
    }

    static final class onExtraCallback implements Comparable<onExtraCallback> {
        public final SelectionContainerKtExternalSyntheticLambda0 IAuthTabCallback;
        public int onExtraCallbackWithResult;
        public Object onNavigationEvent;
        public long onWarmupCompleted;

        public onExtraCallback(SelectionContainerKtExternalSyntheticLambda0 selectionContainerKtExternalSyntheticLambda0) {
            this.IAuthTabCallback = selectionContainerKtExternalSyntheticLambda0;
        }

        public void onExtraCallback(int i2, long j, Object obj) {
            this.onExtraCallbackWithResult = i2;
            this.onWarmupCompleted = j;
            this.onNavigationEvent = obj;
        }

        @Override // java.lang.Comparable
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public int compareTo(onExtraCallback onextracallback) {
            Object obj = this.onNavigationEvent;
            if ((obj == null) != (onextracallback.onNavigationEvent == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.onExtraCallbackWithResult - onextracallback.onExtraCallbackWithResult;
            return i2 != 0 ? i2 : Long.compare(this.onWarmupCompleted, onextracallback.onWarmupCompleted);
        }
    }

    static final class IAuthTabCallback {
        private final BottomNavigationKtExternalSyntheticLambda7 IAuthTabCallback;
        private final long onExtraCallback;
        private final int onNavigationEvent;
        private final List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> onWarmupCompleted;

        private IAuthTabCallback(List<SelectionContainerKtExternalSyntheticLambda10.onWarmupCompleted> list, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7, int i2, long j) {
            this.onWarmupCompleted = list;
            this.IAuthTabCallback = bottomNavigationKtExternalSyntheticLambda7;
            this.onNavigationEvent = i2;
            this.onExtraCallback = j;
        }
    }

    static class onWarmupCompleted {
        public final int onExtraCallback;
        public final BottomNavigationKtExternalSyntheticLambda7 onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onWarmupCompleted;

        public onWarmupCompleted(int i2, int i3, int i4, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
            this.onExtraCallback = i2;
            this.onWarmupCompleted = i3;
            this.onNavigationEvent = i4;
            this.onExtraCallbackWithResult = bottomNavigationKtExternalSyntheticLambda7;
        }
    }
}
