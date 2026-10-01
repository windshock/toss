package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.drm.DrmSession;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;
import o.AppBarKtExternalSyntheticLambda9;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.SelectionControllerExternalSyntheticLambda2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AppBarKtExternalSyntheticLambda8 extends TextAnnotatedStringNodeExternalSyntheticLambda4 {
    private static final byte[] onWarmupCompleted = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private ArrayDeque<AppBarKtExternalSyntheticLambda5> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final AndroidMenu_androidKtExternalSyntheticLambda1 IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private MediaFormat ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private float ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private long ICustomTabsServiceDefault;
    private boolean ICustomTabsServiceStub;
    private int ICustomTabsServiceStubProxy;
    private final MediaCodec.BufferInfo ICustomTabsService_Parcel;
    private final SelectionManager_androidKtExternalSyntheticLambda1 IEngagementSignalsCallback;
    private final ArrayDeque<onExtraCallback> IEngagementSignalsCallbackDefault;
    private boolean IEngagementSignalsCallbackStub;
    private long IEngagementSignalsCallbackStubProxy;
    private boolean IEngagementSignalsCallback_Parcel;
    private long IPostMessageService;
    private onWarmupCompleted IPostMessageServiceDefault;
    private boolean IPostMessageServiceStub;
    private Renderer.WakeupListener IPostMessageService_Parcel;
    private boolean ITrustedWebActivityCallback;
    private float ITrustedWebActivityCallbackDefault;
    private DrmSession ITrustedWebActivityCallbackStub;
    private int access000;
    private final AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback access100;
    private ByteBuffer access200;
    private boolean asBinder;
    private final SelectionControllerExternalSyntheticLambda2 asInterface;
    private AppBarKtExternalSyntheticLambda5 extraCallback;
    private DrmSession extraCallbackWithResult;
    private boolean extraCommand;
    private AndroidMenu_androidKtExternalSyntheticLambda4 getInterfaceDescriptor;
    private final boolean isEngagementSignalsApiAvailable;
    private int mayLaunchUrl;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 newAuthTabSession;
    private boolean newSession;
    private boolean newSessionWithExtras;
    private boolean onActivityLayout;
    private boolean onActivityResized;
    private final SelectionControllerExternalSyntheticLambda2 onExtraCallback;
    public TextStringSimpleNodeExternalSyntheticLambda1 onExtraCallbackWithResult;
    private onExtraCallback onGreatestScrollPercentageIncreased;
    private boolean onMessageChannelReady;
    private boolean onMinimized;
    private final float onNavigationEvent;
    private boolean onPostMessage;
    private float onRelationshipValidationResult;
    private boolean onSessionEnded;
    private boolean onTransact;
    private boolean onUnminimized;
    private AndroidSelectionHandles_androidKtExternalSyntheticLambda4 onVerticalScrollEvent;
    private boolean postMessage;
    private int prefetch;
    private boolean prefetchWithMultipleUrls;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 readTypedObject;
    private long receiveFile;
    private long requestPostMessageChannel;
    private long requestPostMessageChannelWithExtras;
    private long setEngagementSignalsCallback;
    private final AppBarKtExternalSyntheticLambda6 updateVisuals;
    private final SelectionControllerExternalSyntheticLambda2 validateRelationship;
    private MediaCrypto warmup;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 writeTypedList;
    private boolean writeTypedObject;

    private static boolean IAuthTabCallback(String str) {
        return false;
    }

    private static boolean onWarmupCompleted(String str) {
        return false;
    }

    protected void IAuthTabCallback(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    protected boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        return true;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void ICustomTabsCallbackDefault() {
    }

    public boolean IEngagementSignalsCallbackStub() {
        return true;
    }

    protected boolean IPostMessageService() {
        return false;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4, androidx.media3.exoplayer.RendererCapabilities
    public final int isEngagementSignalsApiAvailable() {
        return 8;
    }

    protected void newSession() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    protected float onExtraCallback(float f, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr) {
        return -1.0f;
    }

    protected abstract int onExtraCallback(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AppBarKtExternalSyntheticLambda9.onExtraCallback;

    protected void onExtraCallback(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    protected boolean onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return false;
    }

    protected abstract List<AppBarKtExternalSyntheticLambda5> onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z) throws AppBarKtExternalSyntheticLambda9.onExtraCallback;

    protected void onExtraCallbackWithResult(Exception exc) {
    }

    protected void onExtraCallbackWithResult(String str, AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, long j, long j2) {
    }

    protected void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaFormat mediaFormat) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    protected boolean onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        return true;
    }

    protected abstract AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onNavigationEvent(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaCrypto mediaCrypto, float f);

    protected void onNavigationEvent(String str) {
    }

    protected boolean onNavigationEvent(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        return false;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onUnminimized() {
    }

    protected int onWarmupCompleted(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        return 0;
    }

    protected abstract boolean onWarmupCompleted(long j, long j2, @Nullable AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z, boolean z2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    public void postMessage() {
    }

    protected boolean validateRelationship() {
        return false;
    }

    public static class onWarmupCompleted extends Exception {
        public final AppBarKtExternalSyntheticLambda5 codecInfo;
        public final String diagnosticInfo;
        public final onWarmupCompleted fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable Throwable th, boolean z, int i2) {
            this("Decoder init failed: [" + i2 + "], " + basicTextContextMenuProviderKtExternalSyntheticLambda4, th, basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, z, null, onWarmupCompleted(i2), null);
        }

        public onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable Throwable th, boolean z, AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
            this("Decoder init failed: " + appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub + ", " + basicTextContextMenuProviderKtExternalSyntheticLambda4, th, basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, z, appBarKtExternalSyntheticLambda5, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private onWarmupCompleted(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, @Nullable String str3, @Nullable onWarmupCompleted onwarmupcompleted) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = appBarKtExternalSyntheticLambda5;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = onwarmupcompleted;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public onWarmupCompleted onWarmupCompleted(onWarmupCompleted onwarmupcompleted) {
            return new onWarmupCompleted(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, onwarmupcompleted);
        }

        private static String onWarmupCompleted(int i2) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i2 < 0 ? "neg_" : "") + Math.abs(i2);
        }
    }

    public AppBarKtExternalSyntheticLambda8(int i2, AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback onextracallback, AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, boolean z, float f) {
        super(i2);
        this.access100 = onextracallback;
        this.updateVisuals = (AppBarKtExternalSyntheticLambda6) RecordingInputConnection_androidKt.onExtraCallbackWithResult(appBarKtExternalSyntheticLambda6);
        this.isEngagementSignalsApiAvailable = z;
        this.onNavigationEvent = f;
        this.validateRelationship = SelectionControllerExternalSyntheticLambda2.asInterface();
        this.onExtraCallback = new SelectionControllerExternalSyntheticLambda2(0);
        this.asInterface = new SelectionControllerExternalSyntheticLambda2(2);
        AndroidMenu_androidKtExternalSyntheticLambda1 androidMenu_androidKtExternalSyntheticLambda1 = new AndroidMenu_androidKtExternalSyntheticLambda1();
        this.IAuthTabCallbackStub = androidMenu_androidKtExternalSyntheticLambda1;
        this.ICustomTabsService_Parcel = new MediaCodec.BufferInfo();
        this.ICustomTabsCallback_Parcel = 1.0f;
        this.ITrustedWebActivityCallbackDefault = 1.0f;
        this.IEngagementSignalsCallbackStubProxy = -9223372036854775807L;
        this.IEngagementSignalsCallbackDefault = new ArrayDeque<>();
        this.onGreatestScrollPercentageIncreased = onExtraCallback.IAuthTabCallback;
        androidMenu_androidKtExternalSyntheticLambda1.IAuthTabCallback(0);
        androidMenu_androidKtExternalSyntheticLambda1.onExtraCallback.order(ByteOrder.nativeOrder());
        this.IEngagementSignalsCallback = new SelectionManager_androidKtExternalSyntheticLambda1();
        this.onRelationshipValidationResult = -1.0f;
        this.IAuthTabCallbackStubProxy = 0;
        this.mayLaunchUrl = 0;
        this.prefetch = -1;
        this.ICustomTabsServiceStubProxy = -1;
        this.ICustomTabsCallback = -9223372036854775807L;
        this.requestPostMessageChannelWithExtras = -9223372036854775807L;
        this.requestPostMessageChannel = -9223372036854775807L;
        this.ICustomTabsServiceDefault = -9223372036854775807L;
        this.setEngagementSignalsCallback = -9223372036854775807L;
        this.IAuthTabCallback_Parcel = 0;
        this.access000 = 0;
        this.onExtraCallbackWithResult = new TextStringSimpleNodeExternalSyntheticLambda1();
        this.IPostMessageService = -9223372036854775807L;
        this.receiveFile = -9223372036854775807L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        try {
            return onExtraCallback(this.updateVisuals, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        } catch (AppBarKtExternalSyntheticLambda9.onExtraCallback e) {
            throw onExtraCallbackWithResult(e, basicTextContextMenuProviderKtExternalSyntheticLambda4, WearableStatusCodes.UNKNOWN_LISTENER);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long onWarmupCompleted(long j, long j2) {
        return onNavigationEvent(j, j2, this.ICustomTabsService);
    }

    public void requestPostMessageChannelWithExtras() {
        this.newSession = true;
    }

    protected long onNavigationEvent(long j, long j2, boolean z) {
        return super.onWarmupCompleted(j, j2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    public final void ICustomTabsServiceStubProxy() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4;
        if (this.getInterfaceDescriptor != null || this.IAuthTabCallbackDefault || (basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.newAuthTabSession) == null) {
            return;
        }
        if (onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            IAuthTabCallbackDefault(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            return;
        }
        onWarmupCompleted(this.ITrustedWebActivityCallbackStub);
        if (this.extraCallbackWithResult == null || ITrustedWebActivityCallbackStubProxy()) {
            try {
                DrmSession drmSession = this.extraCallbackWithResult;
                onExtraCallbackWithResult(this.warmup, drmSession != null && (drmSession.onNavigationEvent() == 3 || this.extraCallbackWithResult.onNavigationEvent() == 4) && this.extraCallbackWithResult.onNavigationEvent((String) RecordingInputConnection_androidKt.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)));
            } catch (onWarmupCompleted e) {
                throw onExtraCallbackWithResult(e, basicTextContextMenuProviderKtExternalSyntheticLambda4, WearableStatusCodes.DUPLICATE_LISTENER);
            }
        }
        MediaCrypto mediaCrypto = this.warmup;
        if (mediaCrypto == null || this.getInterfaceDescriptor != null) {
            return;
        }
        mediaCrypto.release();
        this.warmup = null;
    }

    public final boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return this.ITrustedWebActivityCallbackStub == null && onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    public final boolean access200() {
        return this.IAuthTabCallbackDefault;
    }

    public final void IAuthTabCallback(AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4) {
        this.onVerticalScrollEvent = androidSelectionHandles_androidKtExternalSyntheticLambda4;
    }

    public final void onExtraCallbackWithResult(long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult = this.onGreatestScrollPercentageIncreased.onExtraCallback.onExtraCallbackWithResult(j);
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult == null && this.ICustomTabsServiceStub && this.ICustomTabsCallbackDefault != null) {
            basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult = this.onGreatestScrollPercentageIncreased.onExtraCallback.onExtraCallback();
        }
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult != null) {
            this.writeTypedList = basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult;
        } else if (!this.ICustomTabsCallbackStub || this.writeTypedList == null) {
            return;
        }
        onExtraCallbackWithResult((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.writeTypedList), this.ICustomTabsCallbackDefault);
        this.ICustomTabsCallbackStub = false;
        this.ICustomTabsServiceStub = false;
    }

    public final AndroidMenu_androidKtExternalSyntheticLambda4 prefetchWithMultipleUrls() {
        return this.getInterfaceDescriptor;
    }

    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 receiveFile() {
        return this.readTypedObject;
    }

    public final MediaFormat ICustomTabsServiceStub() {
        return this.ICustomTabsCallbackDefault;
    }

    public final AppBarKtExternalSyntheticLambda5 requestPostMessageChannel() {
        return this.extraCallback;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onWarmupCompleted(boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onExtraCallbackWithResult = new TextStringSimpleNodeExternalSyntheticLambda1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r5 >= r1) goto L16;
     */
    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.onGreatestScrollPercentageIncreased.onWarmupCompleted == -9223372036854775807L) {
            IAuthTabCallback(new onExtraCallback(-9223372036854775807L, j, j2));
            if (this.newSession) {
                postMessage();
                return;
            }
            return;
        }
        if (this.IEngagementSignalsCallbackDefault.isEmpty()) {
            long j3 = this.requestPostMessageChannelWithExtras;
            if (j3 != -9223372036854775807L) {
                long j4 = this.ICustomTabsServiceDefault;
                if (j4 != -9223372036854775807L) {
                }
            }
            IAuthTabCallback(new onExtraCallback(-9223372036854775807L, j, j2));
            if (this.onGreatestScrollPercentageIncreased.onWarmupCompleted != -9223372036854775807L) {
                postMessage();
                return;
            }
            return;
        }
        this.IEngagementSignalsCallbackDefault.add(new onExtraCallback(this.requestPostMessageChannelWithExtras, j, j2));
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onExtraCallbackWithResult(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.newSessionWithExtras = false;
        this.onSessionEnded = false;
        this.IEngagementSignalsCallbackStub = false;
        if (this.IAuthTabCallbackDefault) {
            getSmallIconId();
        } else {
            setEngagementSignalsCallback();
        }
        if (this.onGreatestScrollPercentageIncreased.onExtraCallback.onWarmupCompleted() > 0) {
            this.ITrustedWebActivityCallback = true;
        }
        this.onGreatestScrollPercentageIncreased.onExtraCallback.onNavigationEvent();
        this.IEngagementSignalsCallbackDefault.clear();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void onExtraCallback(float f, float f2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.ICustomTabsCallback_Parcel = f;
        this.ITrustedWebActivityCallbackDefault = f2;
        asBinder(this.readTypedObject);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        this.newAuthTabSession = null;
        IAuthTabCallback(onExtraCallback.IAuthTabCallback);
        this.IEngagementSignalsCallbackDefault.clear();
        if (this.IAuthTabCallbackDefault) {
            IPostMessageServiceStub();
        } else {
            ITrustedWebActivityCallbackStub();
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onActivityResized() {
        try {
            IPostMessageServiceStub();
            onSessionEnded();
        } finally {
            IAuthTabCallback((DrmSession) null);
        }
    }

    private void IPostMessageServiceStub() {
        this.IAuthTabCallbackDefault = false;
        getSmallIconId();
    }

    private void getSmallIconId() {
        ITrustedWebActivityServiceDefault();
        this.onTransact = false;
        this.IAuthTabCallbackStub.onNavigationEvent();
        this.asInterface.onNavigationEvent();
        this.asBinder = false;
        this.IEngagementSignalsCallback.onWarmupCompleted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSessionEnded() {
        try {
            AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4 = this.getInterfaceDescriptor;
            if (androidMenu_androidKtExternalSyntheticLambda4 != null) {
                androidMenu_androidKtExternalSyntheticLambda4.asBinder();
                this.onExtraCallbackWithResult.IAuthTabCallback++;
                onNavigationEvent(((AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback)).IAuthTabCallbackStub);
            }
            this.getInterfaceDescriptor = null;
            try {
                MediaCrypto mediaCrypto = this.warmup;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.getInterfaceDescriptor = null;
            try {
                MediaCrypto mediaCrypto2 = this.warmup;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void handleMessage(int i2, @Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (i2 == 11) {
            this.IPostMessageService_Parcel = (Renderer.WakeupListener) RecordingInputConnection_androidKt.onExtraCallbackWithResult((Renderer.WakeupListener) obj);
        } else {
            super.handleMessage(i2, obj);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @Override // androidx.media3.exoplayer.Renderer
    public void onExtraCallbackWithResult(long j, long j2) throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z = false;
        if (this.IEngagementSignalsCallbackStub) {
            this.IEngagementSignalsCallbackStub = false;
            ITrustedWebActivityCallback_Parcel();
        }
        AndroidSelectionHandles_androidKtExternalSyntheticLambda4 androidSelectionHandles_androidKtExternalSyntheticLambda4 = this.onVerticalScrollEvent;
        if (androidSelectionHandles_androidKtExternalSyntheticLambda4 != null) {
            this.onVerticalScrollEvent = null;
            throw androidSelectionHandles_androidKtExternalSyntheticLambda4;
        }
        try {
            if (this.onSessionEnded) {
                newSession();
                return;
            }
            if (this.newAuthTabSession != null || IAuthTabCallbackDefault(2)) {
                ICustomTabsServiceStubProxy();
                if (this.IAuthTabCallbackDefault) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("bypassRender");
                    while (IAuthTabCallback(j, j2)) {
                    }
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                } else if (this.getInterfaceDescriptor != null) {
                    long jIAuthTabCallback = onExtraCallback().IAuthTabCallback();
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("drainAndFeed");
                    while (onExtraCallback(j, j2) && onNavigationEvent(jIAuthTabCallback)) {
                    }
                    while (ITrustedWebActivityCallback() && onNavigationEvent(jIAuthTabCallback)) {
                    }
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                } else {
                    this.onExtraCallbackWithResult.IAuthTabCallbackStub += onExtraCallback(j);
                    IAuthTabCallbackDefault(1);
                }
                this.onExtraCallbackWithResult.onExtraCallback();
            }
        } catch (MediaCodec.CryptoException e) {
            throw onExtraCallbackWithResult(e, this.newAuthTabSession, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            if (onWarmupCompleted(e2)) {
                onExtraCallbackWithResult(e2);
                if ((e2 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e2).isRecoverable()) {
                    z = true;
                }
                if (z) {
                    onSessionEnded();
                }
                AppBarKtExternalSyntheticLambda10 appBarKtExternalSyntheticLambda10OnWarmupCompleted = onWarmupCompleted(e2, requestPostMessageChannel());
                throw onExtraCallback(appBarKtExternalSyntheticLambda10OnWarmupCompleted, this.newAuthTabSession, z, appBarKtExternalSyntheticLambda10OnWarmupCompleted.errorCode == 1101 ? WearableStatusCodes.DUPLICATE_CAPABILITY : WearableStatusCodes.DATA_ITEM_TOO_LARGE);
            }
            throw e2;
        }
    }

    public final boolean setEngagementSignalsCallback() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean zITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub();
        if (zITrustedWebActivityCallbackStub) {
            ICustomTabsServiceStubProxy();
        }
        return zITrustedWebActivityCallbackStub;
    }

    private boolean ITrustedWebActivityCallbackStub() {
        if (this.getInterfaceDescriptor == null) {
            return false;
        }
        if (IPostMessageServiceDefault()) {
            onSessionEnded();
            return true;
        }
        if (IEngagementSignalsCallbackStub()) {
            IPostMessageService_Parcel();
        } else {
            areNotificationsEnabled();
        }
        return false;
    }

    public boolean IPostMessageServiceDefault() throws MediaCryptoException {
        int i2 = this.access000;
        if (i2 == 3 || ((this.onActivityResized && !this.writeTypedObject) || (this.onMinimized && this.ICustomTabsCallbackStubProxy))) {
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(true);
        try {
            read();
            return false;
        } catch (AndroidSelectionHandles_androidKtExternalSyntheticLambda4 e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    private void areNotificationsEnabled() {
        if (this.receiveFile != -9223372036854775807L) {
            long jIAuthTabCallbackStub = IAuthTabCallbackStub();
            long j = this.receiveFile;
            if (jIAuthTabCallbackStub > j || this.ICustomTabsServiceDefault >= j) {
                return;
            }
            this.IPostMessageServiceStub = true;
            this.receiveFile = -9223372036854775807L;
        }
    }

    public boolean writeTypedList() {
        return this.IPostMessageServiceStub;
    }

    private void IPostMessageService_Parcel() {
        try {
            ((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.getInterfaceDescriptor)).onExtraCallback();
        } finally {
            IEngagementSignalsCallbackDefault();
        }
    }

    private void ITrustedWebActivityServiceDefault() {
        this.requestPostMessageChannelWithExtras = -9223372036854775807L;
        this.requestPostMessageChannel = -9223372036854775807L;
        this.ICustomTabsServiceDefault = -9223372036854775807L;
    }

    public void IEngagementSignalsCallbackDefault() {
        getActiveNotifications();
        ITrustedWebActivityServiceStubProxy();
        ITrustedWebActivityServiceDefault();
        this.ICustomTabsCallback = -9223372036854775807L;
        this.ICustomTabsCallbackStubProxy = false;
        this.setEngagementSignalsCallback = -9223372036854775807L;
        this.onUnminimized = false;
        this.onPostMessage = false;
        this.IEngagementSignalsCallback_Parcel = false;
        this.postMessage = false;
        this.prefetchWithMultipleUrls = false;
        this.IAuthTabCallback_Parcel = 0;
        this.access000 = 0;
        this.mayLaunchUrl = this.extraCommand ? 1 : 0;
        this.IPostMessageServiceStub = false;
        this.IPostMessageService = -9223372036854775807L;
        this.receiveFile = -9223372036854775807L;
    }

    protected void onGreatestScrollPercentageIncreased() {
        IEngagementSignalsCallbackDefault();
        this.onVerticalScrollEvent = null;
        this.IAuthTabCallback = null;
        this.extraCallback = null;
        this.readTypedObject = null;
        this.ICustomTabsCallbackDefault = null;
        this.ICustomTabsCallbackStub = false;
        this.writeTypedObject = false;
        this.onRelationshipValidationResult = -1.0f;
        this.IAuthTabCallbackStubProxy = 0;
        this.onActivityResized = false;
        this.onMinimized = false;
        this.onMessageChannelReady = false;
        this.onActivityLayout = false;
        this.ICustomTabsService = false;
        this.extraCommand = false;
        this.mayLaunchUrl = 0;
    }

    protected AppBarKtExternalSyntheticLambda10 onWarmupCompleted(Throwable th, @Nullable AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        return new AppBarKtExternalSyntheticLambda10(th, appBarKtExternalSyntheticLambda5);
    }

    private boolean IAuthTabCallbackDefault(int i2) throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact = onTransact();
        this.validateRelationship.onNavigationEvent();
        int iOnExtraCallback = onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact, this.validateRelationship, i2 | 4);
        if (iOnExtraCallback == -5) {
            onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact);
            return true;
        }
        if (iOnExtraCallback != -4 || !this.validateRelationship.IAuthTabCallback()) {
            return false;
        }
        this.newSessionWithExtras = true;
        ITrustedWebActivityCallback_Parcel();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @RequiresNonNull
    private boolean ITrustedWebActivityCallbackStubProxy() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.warmup == null);
        DrmSession drmSession = this.extraCallbackWithResult;
        TextFieldSelectionState_androidKtExternalSyntheticLambda4 textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback = drmSession.onExtraCallback();
        if (SelectionRegistrarKtExternalSyntheticLambda0.onWarmupCompleted && (textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback instanceof SelectionRegistrarKtExternalSyntheticLambda0)) {
            int iOnNavigationEvent = drmSession.onNavigationEvent();
            if (iOnNavigationEvent == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) RecordingInputConnection_androidKt.onExtraCallbackWithResult(drmSession.IAuthTabCallback());
                throw onExtraCallbackWithResult(drmSessionException, this.newAuthTabSession, drmSessionException.errorCode);
            }
            if (iOnNavigationEvent != 4) {
                return false;
            }
        }
        if (textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback == null) {
            return drmSession.IAuthTabCallback() != null;
        }
        if (textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback instanceof SelectionRegistrarKtExternalSyntheticLambda0) {
            SelectionRegistrarKtExternalSyntheticLambda0 selectionRegistrarKtExternalSyntheticLambda0 = (SelectionRegistrarKtExternalSyntheticLambda0) textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback;
            try {
                this.warmup = new MediaCrypto(selectionRegistrarKtExternalSyntheticLambda0.IAuthTabCallback, selectionRegistrarKtExternalSyntheticLambda0.onExtraCallback);
            } catch (MediaCryptoException e) {
                throw onExtraCallbackWithResult(e, this.newAuthTabSession, 6006);
            }
        }
        return true;
    }

    private void onExtraCallbackWithResult(@Nullable MediaCrypto mediaCrypto, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4, onWarmupCompleted {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newAuthTabSession);
        if (this.IAuthTabCallback == null) {
            try {
                List<AppBarKtExternalSyntheticLambda5> listOnExtraCallback = onExtraCallback(z);
                ArrayDeque<AppBarKtExternalSyntheticLambda5> arrayDeque = new ArrayDeque<>();
                this.IAuthTabCallback = arrayDeque;
                if (this.isEngagementSignalsApiAvailable) {
                    arrayDeque.addAll(listOnExtraCallback);
                } else if (!listOnExtraCallback.isEmpty()) {
                    this.IAuthTabCallback.add(listOnExtraCallback.get(0));
                }
                this.IPostMessageServiceDefault = null;
            } catch (AppBarKtExternalSyntheticLambda9.onExtraCallback e) {
                throw new onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, e, z, -49998);
            }
        }
        if (this.IAuthTabCallback.isEmpty()) {
            throw new onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        while (this.getInterfaceDescriptor == null) {
            AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = (AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult((AppBarKtExternalSyntheticLambda5) arrayDeque2.peekFirst());
            if (!IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) || !onExtraCallbackWithResult(appBarKtExternalSyntheticLambda5)) {
                return;
            }
            try {
                onWarmupCompleted(appBarKtExternalSyntheticLambda5, mediaCrypto);
            } catch (Exception e2) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("MediaCodecRenderer", "Failed to initialize decoder: " + appBarKtExternalSyntheticLambda5, e2);
                arrayDeque2.removeFirst();
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, e2, z, appBarKtExternalSyntheticLambda5);
                onExtraCallbackWithResult(onwarmupcompleted);
                if (this.IPostMessageServiceDefault != null) {
                    this.IPostMessageServiceDefault = this.IPostMessageServiceDefault.onWarmupCompleted(onwarmupcompleted);
                } else {
                    this.IPostMessageServiceDefault = onwarmupcompleted;
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.IPostMessageServiceDefault;
                }
            }
        }
        this.IAuthTabCallback = null;
    }

    private List<AppBarKtExternalSyntheticLambda5> onExtraCallback(boolean z) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newAuthTabSession);
        List<AppBarKtExternalSyntheticLambda5> listOnExtraCallbackWithResult = onExtraCallbackWithResult(this.updateVisuals, basicTextContextMenuProviderKtExternalSyntheticLambda4, z);
        if (!listOnExtraCallbackWithResult.isEmpty() || !z) {
            return listOnExtraCallbackWithResult;
        }
        List<AppBarKtExternalSyntheticLambda5> listOnExtraCallbackWithResult2 = onExtraCallbackWithResult(this.updateVisuals, basicTextContextMenuProviderKtExternalSyntheticLambda4, false);
        if (!listOnExtraCallbackWithResult2.isEmpty()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecRenderer", "Drm session requires secure decoder for " + basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable + ", but no secure decoder available. Trying to proceed with " + listOnExtraCallbackWithResult2 + ".");
        }
        return listOnExtraCallbackWithResult2;
    }

    private void IAuthTabCallbackDefault(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        IPostMessageServiceStub();
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.IAuthTabCallbackStub.onTransact(1);
        } else {
            this.IAuthTabCallbackStub.onTransact(32);
        }
        this.IAuthTabCallbackDefault = true;
    }

    private void onWarmupCompleted(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, @Nullable MediaCrypto mediaCrypto) throws Exception {
        this.extraCallback = appBarKtExternalSyntheticLambda5;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newAuthTabSession);
        String str = appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub;
        int i2 = Build.VERSION.SDK_INT;
        float fOnExtraCallback = onExtraCallback(this.ITrustedWebActivityCallbackDefault, basicTextContextMenuProviderKtExternalSyntheticLambda4, access100());
        if (fOnExtraCallback <= this.onNavigationEvent) {
            fOnExtraCallback = -1.0f;
        }
        long jIAuthTabCallback = onExtraCallback().IAuthTabCallback();
        AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4, mediaCrypto, fOnExtraCallback);
        if (i2 >= 31) {
            onExtraCallbackWithResult.IAuthTabCallback(onwarmupcompletedOnNavigationEvent, asBinder());
        }
        try {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("createCodec:" + str);
            AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4OnExtraCallback = this.access100.onExtraCallback(onwarmupcompletedOnNavigationEvent);
            this.getInterfaceDescriptor = androidMenu_androidKtExternalSyntheticLambda4OnExtraCallback;
            this.ICustomTabsService = androidMenu_androidKtExternalSyntheticLambda4OnExtraCallback.onWarmupCompleted(new onNavigationEvent());
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            long jIAuthTabCallback2 = onExtraCallback().IAuthTabCallback();
            if (!appBarKtExternalSyntheticLambda5.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecRenderer", TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("Format exceeds selected codec's capabilities [%s, %s]", new Object[]{BasicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4), str}));
            }
            this.onRelationshipValidationResult = fOnExtraCallback;
            this.readTypedObject = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.IAuthTabCallbackStubProxy = onExtraCallbackWithResult(str);
            this.onActivityResized = onExtraCallback(str);
            this.onMinimized = onWarmupCompleted(str);
            this.onMessageChannelReady = IAuthTabCallback(str);
            this.onActivityLayout = onExtraCallback(appBarKtExternalSyntheticLambda5) || validateRelationship();
            if (((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor)).onWarmupCompleted()) {
                this.extraCommand = true;
                this.mayLaunchUrl = 1;
                this.onPostMessage = this.IAuthTabCallbackStubProxy != 0;
            }
            if (getInterfaceDescriptor() == 2) {
                this.ICustomTabsCallback = onExtraCallback().IAuthTabCallback() + 1000;
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult++;
            onExtraCallbackWithResult(str, onwarmupcompletedOnNavigationEvent, jIAuthTabCallback2, jIAuthTabCallback2 - jIAuthTabCallback);
        } catch (Throwable th) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            throw th;
        }
    }

    private boolean onNavigationEvent(long j) {
        return this.IEngagementSignalsCallbackStubProxy == -9223372036854775807L || onExtraCallback().IAuthTabCallback() - j < this.IEngagementSignalsCallbackStubProxy;
    }

    private boolean cancelNotification() {
        return this.ICustomTabsServiceStubProxy >= 0;
    }

    private void getActiveNotifications() {
        this.prefetch = -1;
        this.onExtraCallback.onExtraCallback = null;
    }

    private void ITrustedWebActivityServiceStubProxy() {
        this.ICustomTabsServiceStubProxy = -1;
        this.access200 = null;
    }

    private void IAuthTabCallback(@Nullable DrmSession drmSession) {
        DrmSession.onWarmupCompleted(this.ITrustedWebActivityCallbackStub, drmSession);
        this.ITrustedWebActivityCallbackStub = drmSession;
    }

    private void onWarmupCompleted(@Nullable DrmSession drmSession) {
        DrmSession.onWarmupCompleted(this.extraCallbackWithResult, drmSession);
        this.extraCallbackWithResult = drmSession;
    }

    private boolean ITrustedWebActivityCallback() throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2;
        if (this.getInterfaceDescriptor == null || (i2 = this.IAuthTabCallback_Parcel) == 2 || this.newSessionWithExtras) {
            return false;
        }
        if (i2 == 0 && IPostMessageService()) {
            ITrustedWebActivityCallbackDefault();
        }
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4 = (AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor);
        if (this.prefetch < 0) {
            int iOnNavigationEvent = androidMenu_androidKtExternalSyntheticLambda4.onNavigationEvent();
            this.prefetch = iOnNavigationEvent;
            if (iOnNavigationEvent < 0) {
                return false;
            }
            this.onExtraCallback.onExtraCallback = androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(iOnNavigationEvent);
            this.onExtraCallback.onNavigationEvent();
        }
        if (this.IAuthTabCallback_Parcel == 1) {
            if (!this.onActivityLayout) {
                this.ICustomTabsCallbackStubProxy = true;
                androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.prefetch, 0, 0, 0L, 4);
                getActiveNotifications();
            }
            this.IAuthTabCallback_Parcel = 2;
            return false;
        }
        if (this.onPostMessage) {
            this.onPostMessage = false;
            ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.onExtraCallback);
            byte[] bArr = onWarmupCompleted;
            byteBuffer.put(bArr);
            androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.prefetch, 0, bArr.length, 0L, 0);
            getActiveNotifications();
            this.onUnminimized = true;
            return true;
        }
        if (this.mayLaunchUrl == 1) {
            for (int i3 = 0; i3 < ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.readTypedObject)).onMessageChannelReady.size(); i3++) {
                ((ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.onExtraCallback)).put((byte[]) this.readTypedObject.onMessageChannelReady.get(i3));
            }
            this.mayLaunchUrl = 2;
        }
        int iPosition = ((ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.onExtraCallback)).position();
        AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact = onTransact();
        try {
            int iOnExtraCallback = onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact, this.onExtraCallback, 0);
            if (iOnExtraCallback == -3) {
                if (extraCallback()) {
                    this.requestPostMessageChannel = this.requestPostMessageChannelWithExtras;
                }
                return false;
            }
            if (iOnExtraCallback == -5) {
                if (this.mayLaunchUrl == 2) {
                    this.onExtraCallback.onNavigationEvent();
                    this.mayLaunchUrl = 1;
                }
                onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact);
                return true;
            }
            if (this.onExtraCallback.IAuthTabCallback()) {
                this.requestPostMessageChannel = this.requestPostMessageChannelWithExtras;
                if (this.mayLaunchUrl == 2) {
                    this.onExtraCallback.onNavigationEvent();
                    this.mayLaunchUrl = 1;
                }
                this.newSessionWithExtras = true;
                if (!this.onUnminimized) {
                    ITrustedWebActivityCallback_Parcel();
                    return false;
                }
                if (!this.onActivityLayout) {
                    this.ICustomTabsCallbackStubProxy = true;
                    androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.prefetch, 0, 0, 0L, 4);
                    getActiveNotifications();
                }
                return false;
            }
            if (!this.onUnminimized && !this.onExtraCallback.ac_()) {
                this.onExtraCallback.onNavigationEvent();
                if (this.mayLaunchUrl == 2) {
                    this.mayLaunchUrl = 1;
                }
                return true;
            }
            if (onExtraCallbackWithResult(this.onExtraCallback)) {
                return true;
            }
            boolean zOnTransact = this.onExtraCallback.onTransact();
            if (zOnTransact) {
                this.onExtraCallback.IAuthTabCallback.onExtraCallback(iPosition);
            }
            long j = this.onExtraCallback.onWarmupCompleted;
            if (this.ITrustedWebActivityCallback) {
                if (!this.IEngagementSignalsCallbackDefault.isEmpty()) {
                    this.IEngagementSignalsCallbackDefault.peekLast().onExtraCallback.onWarmupCompleted(j, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newAuthTabSession));
                } else {
                    this.onGreatestScrollPercentageIncreased.onExtraCallback.onWarmupCompleted(j, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newAuthTabSession));
                }
                this.ITrustedWebActivityCallback = false;
            }
            this.requestPostMessageChannelWithExtras = Math.max(this.requestPostMessageChannelWithExtras, j);
            if (extraCallback() || this.onExtraCallback.asBinder()) {
                this.requestPostMessageChannel = this.requestPostMessageChannelWithExtras;
            }
            this.onExtraCallback.IAuthTabCallbackDefault();
            if (this.onExtraCallback.onExtraCallback()) {
                IAuthTabCallback(this.onExtraCallback);
            }
            onExtraCallback(this.onExtraCallback);
            int iOnWarmupCompleted = onWarmupCompleted(this.onExtraCallback);
            if ((Build.VERSION.SDK_INT < 34 || (iOnWarmupCompleted & 32) == 0) && !aa_().onWarmupCompleted) {
                this.receiveFile = Math.max(this.receiveFile, this.onExtraCallback.onWarmupCompleted);
            }
            if (zOnTransact) {
                ((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidMenu_androidKtExternalSyntheticLambda4)).IAuthTabCallback(this.prefetch, 0, this.onExtraCallback.IAuthTabCallback, j, iOnWarmupCompleted);
            } else {
                ((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidMenu_androidKtExternalSyntheticLambda4)).onExtraCallbackWithResult(this.prefetch, 0, ((ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.onExtraCallback)).limit(), j, iOnWarmupCompleted);
            }
            getActiveNotifications();
            this.onUnminimized = true;
            this.mayLaunchUrl = 0;
            this.onExtraCallbackWithResult.asInterface++;
            return true;
        } catch (SelectionControllerExternalSyntheticLambda2.onWarmupCompleted e) {
            onExtraCallbackWithResult(e);
            IAuthTabCallbackDefault(0);
            IPostMessageService_Parcel();
            return true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextStringSimpleNodeExternalSyntheticLambda0 onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2;
        boolean z = true;
        this.ITrustedWebActivityCallback = true;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted);
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.isEngagementSignalsApiAvailable;
        if (str == null) {
            throw onExtraCallbackWithResult(new IllegalArgumentException("Sample MIME type is null."), basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent, WearableStatusCodes.ASSET_UNAVAILABLE);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.isEngagementSignalsApiAvailable, "video/x-vnd.on2.vp9")) && !basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onMessageChannelReady.isEmpty()) {
            basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback().IAuthTabCallback((List) null).onNavigationEvent();
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
        IAuthTabCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult);
        this.newAuthTabSession = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        if (this.IAuthTabCallbackDefault) {
            this.onTransact = true;
            return null;
        }
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4 = this.getInterfaceDescriptor;
        if (androidMenu_androidKtExternalSyntheticLambda4 == null) {
            this.IAuthTabCallback = null;
            ICustomTabsServiceStubProxy();
            return null;
        }
        AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = (AppBarKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallback);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.readTypedObject);
        if (IAuthTabCallback(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda4, this.extraCallbackWithResult, this.ITrustedWebActivityCallbackStub)) {
            ITrustedWebActivityCallbackDefault();
            return new TextStringSimpleNodeExternalSyntheticLambda0(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda42, basicTextContextMenuProviderKtExternalSyntheticLambda4, 0, 128);
        }
        boolean z2 = this.ITrustedWebActivityCallbackStub != this.extraCallbackWithResult;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(true);
        TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(appBarKtExternalSyntheticLambda5, basicTextContextMenuProviderKtExternalSyntheticLambda42, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        int i3 = textStringSimpleNodeExternalSyntheticLambda0IAuthTabCallback.IAuthTabCallback;
        if (i3 != 0) {
            i2 = 16;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                            this.readTypedObject = basicTextContextMenuProviderKtExternalSyntheticLambda4;
                            if (z2 && !IPostMessageServiceStubProxy()) {
                                i2 = 2;
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                    this.extraCommand = true;
                    this.mayLaunchUrl = 1;
                    int i4 = this.IAuthTabCallbackStubProxy;
                    if (i4 != 2 && (i4 != 1 || basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls != basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetchWithMultipleUrls || basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback != basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallback)) {
                        z = false;
                    }
                    this.onPostMessage = z;
                    this.readTypedObject = basicTextContextMenuProviderKtExternalSyntheticLambda4;
                    if (!z2 || IPostMessageServiceStubProxy()) {
                    }
                }
            } else if (asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                this.readTypedObject = basicTextContextMenuProviderKtExternalSyntheticLambda4;
                if (!z2 ? IEngagementSignalsCallback_Parcel() : IPostMessageServiceStubProxy()) {
                }
            }
            return (textStringSimpleNodeExternalSyntheticLambda0IAuthTabCallback.IAuthTabCallback != 0 || (this.getInterfaceDescriptor == androidMenu_androidKtExternalSyntheticLambda4 && this.access000 != 3)) ? textStringSimpleNodeExternalSyntheticLambda0IAuthTabCallback : new TextStringSimpleNodeExternalSyntheticLambda0(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda42, basicTextContextMenuProviderKtExternalSyntheticLambda4, 0, i2);
        }
        ITrustedWebActivityCallbackDefault();
        i2 = 0;
        if (textStringSimpleNodeExternalSyntheticLambda0IAuthTabCallback.IAuthTabCallback != 0) {
        }
    }

    protected boolean onExtraCallbackWithResult(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        if (!onNavigationEvent(selectionControllerExternalSyntheticLambda2)) {
            return false;
        }
        selectionControllerExternalSyntheticLambda2.onNavigationEvent();
        this.onExtraCallbackWithResult.IAuthTabCallbackStub++;
        return true;
    }

    public long ICustomTabsServiceDefault() {
        return this.requestPostMessageChannel;
    }

    public void onWarmupCompleted(long j) {
        this.ICustomTabsServiceDefault = j;
        while (!this.IEngagementSignalsCallbackDefault.isEmpty() && j >= this.IEngagementSignalsCallbackDefault.peek().onNavigationEvent) {
            IAuthTabCallback((onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IEngagementSignalsCallbackDefault.poll()));
            postMessage();
        }
    }

    protected TextStringSimpleNodeExternalSyntheticLambda0 IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42) {
        return new TextStringSimpleNodeExternalSyntheticLambda0(appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, 0, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        return this.onSessionEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean newAuthTabSession() {
        if (this.newAuthTabSession == null) {
            return false;
        }
        if (readTypedObject() || cancelNotification()) {
            return true;
        }
        return this.ICustomTabsCallback != -9223372036854775807L && onExtraCallback().IAuthTabCallback() < this.ICustomTabsCallback;
    }

    public float ICustomTabsService_Parcel() {
        return this.ICustomTabsCallback_Parcel;
    }

    public final Renderer.WakeupListener IEngagementSignalsCallback() {
        return this.IPostMessageService_Parcel;
    }

    public final boolean IEngagementSignalsCallbackStubProxy() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        return asBinder(this.readTypedObject);
    }

    private boolean asBinder(@Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.getInterfaceDescriptor != null && this.access000 != 3 && getInterfaceDescriptor() != 0) {
            float fOnExtraCallback = onExtraCallback(this.ITrustedWebActivityCallbackDefault, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4), access100());
            float f = this.onRelationshipValidationResult;
            if (f == fOnExtraCallback) {
                return true;
            }
            if (fOnExtraCallback == -1.0f) {
                ITrustedWebActivityCallbackDefault();
                return false;
            }
            if (f == -1.0f && fOnExtraCallback <= this.onNavigationEvent) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fOnExtraCallback);
            ((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor)).onExtraCallbackWithResult(bundle);
            this.onRelationshipValidationResult = fOnExtraCallback;
        }
        return true;
    }

    private boolean IEngagementSignalsCallback_Parcel() {
        if (this.onUnminimized) {
            this.IAuthTabCallback_Parcel = 1;
            if (this.onMinimized) {
                this.access000 = 3;
                return false;
            }
            this.access000 = 1;
        }
        return true;
    }

    private boolean IPostMessageServiceStubProxy() throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.onUnminimized) {
            this.IAuthTabCallback_Parcel = 1;
            if (this.onMinimized) {
                this.access000 = 3;
                return false;
            }
            this.access000 = 2;
        } else {
            read();
        }
        return true;
    }

    private void ITrustedWebActivityCallbackDefault() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.onUnminimized) {
            this.IAuthTabCallback_Parcel = 1;
            this.access000 = 3;
        } else {
            notifyNotificationWithChannel();
        }
    }

    private boolean onExtraCallback(long j, long j2) throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z;
        boolean z2;
        boolean zOnWarmupCompleted;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        int iOnExtraCallbackWithResult;
        AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4 = (AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor);
        if (!cancelNotification()) {
            if (this.onMessageChannelReady && this.ICustomTabsCallbackStubProxy) {
                try {
                    iOnExtraCallbackWithResult = androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.ICustomTabsService_Parcel);
                } catch (IllegalStateException unused) {
                    ITrustedWebActivityCallback_Parcel();
                    if (this.onSessionEnded) {
                        onSessionEnded();
                    }
                    return false;
                }
            } else {
                iOnExtraCallbackWithResult = androidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.ICustomTabsService_Parcel);
            }
            if (iOnExtraCallbackWithResult < 0) {
                if (iOnExtraCallbackWithResult == -2) {
                    getSmallIconBitmap();
                    return true;
                }
                if (this.onActivityLayout && (this.newSessionWithExtras || this.IAuthTabCallback_Parcel == 2)) {
                    ITrustedWebActivityCallback_Parcel();
                }
                long j3 = this.setEngagementSignalsCallback;
                if (j3 != -9223372036854775807L && j3 + 100 < onExtraCallback().onWarmupCompleted()) {
                    ITrustedWebActivityCallback_Parcel();
                }
                return false;
            }
            if (this.IEngagementSignalsCallback_Parcel) {
                this.IEngagementSignalsCallback_Parcel = false;
                androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(iOnExtraCallbackWithResult, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.ICustomTabsService_Parcel;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                ITrustedWebActivityCallback_Parcel();
                return false;
            }
            this.ICustomTabsServiceStubProxy = iOnExtraCallbackWithResult;
            ByteBuffer byteBufferOnWarmupCompleted = androidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted(iOnExtraCallbackWithResult);
            this.access200 = byteBufferOnWarmupCompleted;
            if (byteBufferOnWarmupCompleted != null) {
                byteBufferOnWarmupCompleted.position(this.ICustomTabsService_Parcel.offset);
                ByteBuffer byteBuffer2 = this.access200;
                MediaCodec.BufferInfo bufferInfo3 = this.ICustomTabsService_Parcel;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            onExtraCallbackWithResult(this.ICustomTabsService_Parcel.presentationTimeUs);
        }
        this.postMessage = this.ICustomTabsService_Parcel.presentationTimeUs < IAuthTabCallbackStub();
        long j4 = this.requestPostMessageChannel;
        this.prefetchWithMultipleUrls = j4 != -9223372036854775807L && j4 <= this.ICustomTabsService_Parcel.presentationTimeUs;
        if (this.IPostMessageServiceStub) {
            long j5 = this.IPostMessageService;
            if (j5 != -9223372036854775807L && this.ICustomTabsService_Parcel.presentationTimeUs <= j5) {
                this.IPostMessageServiceStub = false;
                this.IPostMessageService = -9223372036854775807L;
            } else {
                this.IPostMessageService = this.ICustomTabsService_Parcel.presentationTimeUs;
                this.postMessage = true;
                this.prefetchWithMultipleUrls = false;
            }
        }
        if (this.onMessageChannelReady && this.ICustomTabsCallbackStubProxy) {
            try {
                byteBuffer = this.access200;
                i2 = this.ICustomTabsServiceStubProxy;
                bufferInfo = this.ICustomTabsService_Parcel;
                z = false;
                z2 = true;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zOnWarmupCompleted = onWarmupCompleted(j, j2, androidMenu_androidKtExternalSyntheticLambda4, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.postMessage, this.prefetchWithMultipleUrls, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.writeTypedList));
            } catch (IllegalStateException unused3) {
                ITrustedWebActivityCallback_Parcel();
                if (this.onSessionEnded) {
                    onSessionEnded();
                }
                return z;
            }
        } else {
            z = false;
            z2 = true;
            ByteBuffer byteBuffer3 = this.access200;
            int i3 = this.ICustomTabsServiceStubProxy;
            MediaCodec.BufferInfo bufferInfo4 = this.ICustomTabsService_Parcel;
            zOnWarmupCompleted = onWarmupCompleted(j, j2, androidMenu_androidKtExternalSyntheticLambda4, byteBuffer3, i3, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.postMessage, this.prefetchWithMultipleUrls, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.writeTypedList));
        }
        if (zOnWarmupCompleted) {
            onWarmupCompleted(this.ICustomTabsService_Parcel.presentationTimeUs);
            boolean z3 = (this.ICustomTabsService_Parcel.flags & 4) != 0 ? z2 : z;
            if (!z3 && this.ICustomTabsCallbackStubProxy && this.prefetchWithMultipleUrls) {
                this.setEngagementSignalsCallback = onExtraCallback().onWarmupCompleted();
            }
            ITrustedWebActivityServiceStubProxy();
            if (!z3) {
                return z2;
            }
            ITrustedWebActivityCallback_Parcel();
        }
        return z;
    }

    private void getSmallIconBitmap() {
        this.writeTypedObject = true;
        MediaFormat mediaFormatOnExtraCallbackWithResult = ((AndroidMenu_androidKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor)).onExtraCallbackWithResult();
        if (this.IAuthTabCallbackStubProxy != 0 && mediaFormatOnExtraCallbackWithResult.getInteger("width") == 32 && mediaFormatOnExtraCallbackWithResult.getInteger("height") == 32) {
            this.IEngagementSignalsCallback_Parcel = true;
        } else {
            this.ICustomTabsCallbackDefault = mediaFormatOnExtraCallbackWithResult;
            this.ICustomTabsCallbackStub = true;
        }
    }

    private void ITrustedWebActivityCallback_Parcel() throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = this.access000;
        if (i2 == 1) {
            IPostMessageService_Parcel();
            return;
        }
        if (i2 == 2) {
            IPostMessageService_Parcel();
            read();
        } else if (i2 == 3) {
            notifyNotificationWithChannel();
        } else {
            this.onSessionEnded = true;
            newSession();
        }
    }

    public final void onVerticalScrollEvent() {
        this.IEngagementSignalsCallbackStub = true;
    }

    public final long updateVisuals() {
        return this.onGreatestScrollPercentageIncreased.onWarmupCompleted;
    }

    public final long warmup() {
        return this.onGreatestScrollPercentageIncreased.onExtraCallbackWithResult;
    }

    private void IAuthTabCallback(onExtraCallback onextracallback) {
        this.onGreatestScrollPercentageIncreased = onextracallback;
        if (onextracallback.onWarmupCompleted != -9223372036854775807L) {
            this.ICustomTabsServiceStub = true;
        }
    }

    public static boolean onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.asBinder;
        return i2 == 0 || i2 == 2;
    }

    private boolean IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        TextFieldSelectionState_androidKtExternalSyntheticLambda4 textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback;
        TextFieldSelectionState_androidKtExternalSyntheticLambda4 textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback = drmSession2.onExtraCallback()) != null && (textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback2 = drmSession.onExtraCallback()) != null && textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback.getClass().equals(textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback2.getClass())) {
            if (!(textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback instanceof SelectionRegistrarKtExternalSyntheticLambda0)) {
                return false;
            }
            if (!drmSession2.onExtraCallbackWithResult().equals(drmSession.onExtraCallbackWithResult())) {
                return true;
            }
            UUID uuid = AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onNavigationEvent;
            if (!uuid.equals(drmSession.onExtraCallbackWithResult()) && !uuid.equals(drmSession2.onExtraCallbackWithResult())) {
                return !appBarKtExternalSyntheticLambda5.asInterface && (drmSession2.onNavigationEvent() == 2 || ((drmSession2.onNavigationEvent() == 3 || drmSession2.onNavigationEvent() == 4) && drmSession2.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable))));
            }
        }
        return true;
    }

    private void notifyNotificationWithChannel() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onSessionEnded();
        ICustomTabsServiceStubProxy();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    private void read() throws MediaCryptoException, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        TextFieldSelectionState_androidKtExternalSyntheticLambda4 textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback = ((DrmSession) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ITrustedWebActivityCallbackStub)).onExtraCallback();
        if (textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback instanceof SelectionRegistrarKtExternalSyntheticLambda0) {
            try {
                ((MediaCrypto) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.warmup)).setMediaDrmSession(((SelectionRegistrarKtExternalSyntheticLambda0) textFieldSelectionState_androidKtExternalSyntheticLambda4OnExtraCallback).onExtraCallback);
            } catch (MediaCryptoException e) {
                throw onExtraCallbackWithResult(e, this.newAuthTabSession, 6006);
            }
        }
        onWarmupCompleted(this.ITrustedWebActivityCallbackStub);
        this.IAuthTabCallback_Parcel = 0;
        this.access000 = 0;
    }

    private boolean IAuthTabCallback(long j, long j2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        boolean z;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onSessionEnded);
        if (this.IAuthTabCallbackStub.IAuthTabCallbackStubProxy()) {
            AndroidMenu_androidKtExternalSyntheticLambda1 androidMenu_androidKtExternalSyntheticLambda1 = this.IAuthTabCallbackStub;
            if (!onWarmupCompleted(j, j2, null, androidMenu_androidKtExternalSyntheticLambda1.onExtraCallback, this.ICustomTabsServiceStubProxy, 0, androidMenu_androidKtExternalSyntheticLambda1.getInterfaceDescriptor(), this.IAuthTabCallbackStub.IAuthTabCallback_Parcel(), onNavigationEvent(IAuthTabCallbackStub(), this.IAuthTabCallbackStub.access000()), this.IAuthTabCallbackStub.IAuthTabCallback(), (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.writeTypedList))) {
                return false;
            }
            onWarmupCompleted(this.IAuthTabCallbackStub.access000());
            this.IAuthTabCallbackStub.onNavigationEvent();
            z = false;
        } else {
            z = false;
        }
        if (this.newSessionWithExtras) {
            this.onSessionEnded = true;
            return z;
        }
        if (this.asBinder) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub.onExtraCallbackWithResult(this.asInterface));
            this.asBinder = z;
        }
        if (this.onTransact) {
            if (this.IAuthTabCallbackStub.IAuthTabCallbackStubProxy()) {
                return true;
            }
            IPostMessageServiceStub();
            this.onTransact = z;
            ICustomTabsServiceStubProxy();
            if (!this.IAuthTabCallbackDefault) {
                return z;
            }
        }
        newSessionWithExtras();
        if (this.IAuthTabCallbackStub.IAuthTabCallbackStubProxy()) {
            this.IAuthTabCallbackStub.IAuthTabCallbackDefault();
        }
        if (this.IAuthTabCallbackStub.IAuthTabCallbackStubProxy() || this.newSessionWithExtras || this.onTransact) {
            return true;
        }
        return z;
    }

    private void newSessionWithExtras() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.newSessionWithExtras);
        AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact = onTransact();
        this.asInterface.onNavigationEvent();
        do {
            this.asInterface.onNavigationEvent();
            int iOnExtraCallback = onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact, this.asInterface, 0);
            if (iOnExtraCallback == -5) {
                onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact);
                return;
            }
            if (iOnExtraCallback == -4) {
                if (this.asInterface.IAuthTabCallback()) {
                    this.newSessionWithExtras = true;
                    this.requestPostMessageChannel = this.requestPostMessageChannelWithExtras;
                    return;
                }
                this.requestPostMessageChannelWithExtras = Math.max(this.requestPostMessageChannelWithExtras, this.asInterface.onWarmupCompleted);
                if (extraCallback() || this.onExtraCallback.asBinder()) {
                    this.requestPostMessageChannel = this.requestPostMessageChannelWithExtras;
                }
                if (this.ITrustedWebActivityCallback) {
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.newAuthTabSession);
                    this.writeTypedList = basicTextContextMenuProviderKtExternalSyntheticLambda4;
                    if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/opus") && !this.writeTypedList.onMessageChannelReady.isEmpty()) {
                        this.writeTypedList = this.writeTypedList.onExtraCallback().onTransact(ExposedDropdownMenu_androidExternalSyntheticLambda0.onWarmupCompleted((byte[]) this.writeTypedList.onMessageChannelReady.get(0))).onNavigationEvent();
                    }
                    onExtraCallbackWithResult(this.writeTypedList, (MediaFormat) null);
                    this.ITrustedWebActivityCallback = false;
                }
                this.asInterface.IAuthTabCallbackDefault();
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.writeTypedList;
                if (basicTextContextMenuProviderKtExternalSyntheticLambda42 != null && Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable, "audio/opus")) {
                    if (this.asInterface.onExtraCallback()) {
                        SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2 = this.asInterface;
                        selectionControllerExternalSyntheticLambda2.onExtraCallbackWithResult = this.writeTypedList;
                        IAuthTabCallback(selectionControllerExternalSyntheticLambda2);
                    }
                    if (ExposedDropdownMenu_androidExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStub(), this.asInterface.onWarmupCompleted)) {
                        this.IEngagementSignalsCallback.onExtraCallbackWithResult(this.asInterface, this.writeTypedList.onMessageChannelReady);
                    }
                }
                if (!ITrustedWebActivityService()) {
                    break;
                }
            } else {
                if (iOnExtraCallback == -3) {
                    if (extraCallback()) {
                        this.requestPostMessageChannel = this.requestPostMessageChannelWithExtras;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        } while (this.IAuthTabCallbackStub.onExtraCallbackWithResult(this.asInterface));
        this.asBinder = true;
    }

    private boolean ITrustedWebActivityService() {
        if (!this.IAuthTabCallbackStub.IAuthTabCallbackStubProxy()) {
            return true;
        }
        long jIAuthTabCallbackStub = IAuthTabCallbackStub();
        return onNavigationEvent(jIAuthTabCallbackStub, this.IAuthTabCallbackStub.access000()) == onNavigationEvent(jIAuthTabCallbackStub, this.asInterface.onWarmupCompleted);
    }

    private boolean onNavigationEvent(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.writeTypedList;
        return (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null && Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/opus") && ExposedDropdownMenu_androidExternalSyntheticLambda0.onWarmupCompleted(j, j2)) ? false : true;
    }

    private static boolean onWarmupCompleted(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private int onExtraCallbackWithResult(String str) {
        if (Build.VERSION.SDK_INT > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
            return 0;
        }
        String str2 = Build.MODEL;
        return (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) ? 2 : 0;
    }

    private static boolean onExtraCallback(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean onExtraCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        String str = appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i2 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && appBarKtExternalSyntheticLambda5.asInterface;
        }
        return true;
    }

    static final class onExtraCallback {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final TextFieldDecoratorModifierNodeExternalSyntheticLambda26<BasicTextContextMenuProviderKtExternalSyntheticLambda4> onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();
        public final long onExtraCallbackWithResult;
        public final long onNavigationEvent;
        public final long onWarmupCompleted;

        public onExtraCallback(long j, long j2, long j3) {
            this.onNavigationEvent = j;
            this.onExtraCallbackWithResult = j2;
            this.onWarmupCompleted = j3;
        }
    }

    static final class onExtraCallbackWithResult {
        public static void IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
            LogSessionId logSessionIdNQ_ = selectionManagerExternalSyntheticLambda12.nQ_();
            if (logSessionIdNQ_.equals(SelectionAdjustmentKtExternalSyntheticLambda0.nC_())) {
                return;
            }
            onwarmupcompleted.onExtraCallback.setString("log-session-id", logSessionIdNQ_.getStringId());
        }
    }

    final class onNavigationEvent implements AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult {
        private onNavigationEvent() {
        }

        @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult
        public void onExtraCallback() {
            if (AppBarKtExternalSyntheticLambda8.this.IPostMessageService_Parcel != null) {
                AppBarKtExternalSyntheticLambda8.this.IPostMessageService_Parcel.IAuthTabCallback();
            }
        }

        @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            if (AppBarKtExternalSyntheticLambda8.this.IPostMessageService_Parcel != null) {
                AppBarKtExternalSyntheticLambda8.this.IPostMessageService_Parcel.IAuthTabCallback();
            }
        }
    }
}
