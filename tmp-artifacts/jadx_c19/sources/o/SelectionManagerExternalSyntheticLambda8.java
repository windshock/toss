package o;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient$2$;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda8;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;
import o.SelectionManagerExternalSyntheticLambda11;
import o.SelectionManagerExternalSyntheticLambda13;
import o.SelectionManagerExternalSyntheticLambda2;
import o.SelectionManagerExternalSyntheticLambda6;
import o.SelectionManagerExternalSyntheticLambda8;
import o.SelectionManagerKtExternalSyntheticLambda1;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerExternalSyntheticLambda8 implements SelectionManagerExternalSyntheticLambda2 {
    private static ScheduledExecutorService IAuthTabCallback = null;
    private static final Object onExtraCallbackWithResult = new Object();
    public static boolean onNavigationEvent = false;
    private static int onWarmupCompleted;
    private TextContextMenuHelperApi28ExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private final AndroidSelectionHandles_androidKtExternalSyntheticLambda8.IAuthTabCallback IAuthTabCallbackStub;
    private final HandwritingGestureApi34ExternalSyntheticLambda15 IAuthTabCallbackStubProxy;
    private HandwritingGestureApi34ExternalSyntheticLambda17 IAuthTabCallback_Parcel;
    private final SelectionManagerExternalSyntheticLambda6 ICustomTabsCallback;
    private final boolean ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private Context ICustomTabsCallbackStubProxy;
    private final IAuthTabCallbackStubProxy<SelectionManagerExternalSyntheticLambda2.onWarmupCompleted> ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private Looper ICustomTabsServiceDefault;
    private IAuthTabCallbackStub ICustomTabsServiceStub;
    private SelectionManagerExternalSyntheticLambda12 ICustomTabsServiceStubProxy;
    private AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 ICustomTabsService_Parcel;
    private SelectionManagerExternalSyntheticLambda4 IEngagementSignalsCallback;
    private boolean IEngagementSignalsCallbackDefault;
    private Handler IEngagementSignalsCallbackStub;
    private final SelectionManager_androidKtExternalSyntheticLambda3 IEngagementSignalsCallbackStubProxy;
    private long IEngagementSignalsCallback_Parcel;
    private long IPostMessageService;
    private boolean IPostMessageServiceDefault;
    private boolean IPostMessageServiceStub;
    private final SelectionManager_androidKtExternalSyntheticLambda6 IPostMessageServiceStubProxy;
    private final IAuthTabCallbackStubProxy<SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub> IPostMessageService_Parcel;
    private float ITrustedWebActivityCallback;
    private boolean ITrustedWebActivityCallbackDefault;
    private final ImeEditCommand_androidKtExternalSyntheticLambda3 ITrustedWebActivityCallbackStub;
    private long ITrustedWebActivityCallback_Parcel;
    private long ITrustedWebActivityService;
    private final onExtraCallback access000;
    private AudioTrack access100;
    private boolean access200;
    private SelectionManagerExternalSyntheticLambda11 asBinder;
    private asInterface asInterface;
    private TextContextMenuModifierKtExternalSyntheticLambda0 extraCallback;
    private final IAuthTabCallback extraCallbackWithResult;
    private int extraCommand;
    private int getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;
    private ByteBuffer mayLaunchUrl;
    private long newAuthTabSession;
    private int newSession;
    private long newSessionWithExtras;
    private final ImmutableList<HandwritingGestureApi34ExternalSyntheticLambda16> onActivityLayout;
    private final SelectionManagerKtExternalSyntheticLambda0 onActivityResized;
    private long onExtraCallback;
    private boolean onGreatestScrollPercentageIncreased;
    private int onMessageChannelReady;
    private final Context onMinimized;
    private IAuthTabCallbackStub onPostMessage;
    private final int onRelationshipValidationResult;
    private long onSessionEnded;
    private SelectionManagerExternalSyntheticLambda13 onTransact;
    private boolean onUnminimized;
    private long onVerticalScrollEvent;
    private SelectionManagerExternalSyntheticLambda2.onNavigationEvent postMessage;
    private boolean prefetch;
    private asInterface prefetchWithMultipleUrls;
    private final onExtraCallbackWithResult readTypedObject;
    private IAuthTabCallback_Parcel receiveFile;
    private int requestPostMessageChannel;
    private final ArrayDeque<asInterface> requestPostMessageChannelWithExtras;
    private boolean setEngagementSignalsCallback;
    private getInterfaceDescriptor updateVisuals;
    private ByteBuffer validateRelationship;
    private boolean warmup;
    private final boolean writeTypedList;
    private ByteBuffer writeTypedObject;

    public interface IAuthTabCallback {
        public static final IAuthTabCallback onExtraCallbackWithResult = new SelectionManagerKtExternalSyntheticLambda1.onNavigationEvent().onExtraCallbackWithResult();

        int onExtraCallback(int i2, int i3, int i4, int i5, int i6, int i7, double d);
    }

    public interface onExtraCallback {
        SelectionManagerExternalSyntheticLambda14 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5);
    }

    private static boolean onWarmupCompleted(int i2) {
        return i2 == -6 || i2 == -32;
    }

    public interface onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult onExtraCallback = new SelectionManager_androidKtExternalSyntheticLambda10();

        AudioTrack onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, int i2, @Nullable Context context);

        default int IAuthTabCallback(int i2) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i2);
        }
    }

    public static final class asBinder extends RuntimeException {
        private asBinder(String str) {
            super(str);
        }
    }

    public static class onTransact implements SelectionManagerExternalSyntheticLambda7 {
        private final ImeEditCommand_androidKtExternalSyntheticLambda4 onExtraCallback;
        private final SelectionManager_androidKtExternalSyntheticLambda4 onNavigationEvent;
        private final HandwritingGestureApi34ExternalSyntheticLambda16[] onWarmupCompleted;

        public onTransact(HandwritingGestureApi34ExternalSyntheticLambda16... handwritingGestureApi34ExternalSyntheticLambda16Arr) {
            this(handwritingGestureApi34ExternalSyntheticLambda16Arr, new SelectionManager_androidKtExternalSyntheticLambda4(), new ImeEditCommand_androidKtExternalSyntheticLambda4());
        }

        public onTransact(HandwritingGestureApi34ExternalSyntheticLambda16[] handwritingGestureApi34ExternalSyntheticLambda16Arr, SelectionManager_androidKtExternalSyntheticLambda4 selectionManager_androidKtExternalSyntheticLambda4, ImeEditCommand_androidKtExternalSyntheticLambda4 imeEditCommand_androidKtExternalSyntheticLambda4) {
            HandwritingGestureApi34ExternalSyntheticLambda16[] handwritingGestureApi34ExternalSyntheticLambda16Arr2 = new HandwritingGestureApi34ExternalSyntheticLambda16[handwritingGestureApi34ExternalSyntheticLambda16Arr.length + 2];
            this.onWarmupCompleted = handwritingGestureApi34ExternalSyntheticLambda16Arr2;
            System.arraycopy(handwritingGestureApi34ExternalSyntheticLambda16Arr, 0, handwritingGestureApi34ExternalSyntheticLambda16Arr2, 0, handwritingGestureApi34ExternalSyntheticLambda16Arr.length);
            this.onNavigationEvent = selectionManager_androidKtExternalSyntheticLambda4;
            this.onExtraCallback = imeEditCommand_androidKtExternalSyntheticLambda4;
            handwritingGestureApi34ExternalSyntheticLambda16Arr2[handwritingGestureApi34ExternalSyntheticLambda16Arr.length] = selectionManager_androidKtExternalSyntheticLambda4;
            handwritingGestureApi34ExternalSyntheticLambda16Arr2[handwritingGestureApi34ExternalSyntheticLambda16Arr.length + 1] = imeEditCommand_androidKtExternalSyntheticLambda4;
        }

        @Override // o.HandwritingGestureApi34ExternalSyntheticLambda15
        public HandwritingGestureApi34ExternalSyntheticLambda16[] onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        @Override // o.HandwritingGestureApi34ExternalSyntheticLambda15
        public AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onWarmupCompleted(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
            this.onExtraCallback.onExtraCallbackWithResult(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult);
            this.onExtraCallback.onNavigationEvent(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onWarmupCompleted);
            return androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1;
        }

        @Override // o.HandwritingGestureApi34ExternalSyntheticLambda15
        public boolean onExtraCallback(boolean z) {
            this.onNavigationEvent.onExtraCallback(z);
            return z;
        }

        @Override // o.HandwritingGestureApi34ExternalSyntheticLambda15
        public long IAuthTabCallback(long j) {
            return this.onExtraCallback.IAuthTabCallback() ? this.onExtraCallback.IAuthTabCallback(j) : j;
        }

        @Override // o.HandwritingGestureApi34ExternalSyntheticLambda15
        public long onExtraCallback() {
            return this.onNavigationEvent.IAuthTabCallback_Parcel();
        }
    }

    public static final class IAuthTabCallbackDefault {
        private SelectionManagerExternalSyntheticLambda13 IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private boolean IAuthTabCallbackStub;
        private boolean IAuthTabCallbackStubProxy;
        private boolean asBinder;
        private final Context asInterface;
        private HandwritingGestureApi34ExternalSyntheticLambda15 onExtraCallback;
        private AndroidSelectionHandles_androidKtExternalSyntheticLambda8.IAuthTabCallback onExtraCallbackWithResult;
        private IAuthTabCallback onNavigationEvent;
        private onExtraCallbackWithResult onTransact;
        private onExtraCallback onWarmupCompleted;

        @Deprecated
        public IAuthTabCallbackDefault() {
            this.IAuthTabCallbackStubProxy = true;
            this.asInterface = null;
            this.IAuthTabCallback = SelectionManagerExternalSyntheticLambda13.IAuthTabCallback;
            this.onNavigationEvent = IAuthTabCallback.onExtraCallbackWithResult;
            this.onTransact = onExtraCallbackWithResult.onExtraCallback;
        }

        public IAuthTabCallbackDefault(Context context) {
            this.IAuthTabCallbackStubProxy = true;
            this.asInterface = context;
            this.IAuthTabCallback = SelectionManagerExternalSyntheticLambda13.IAuthTabCallback;
            this.onNavigationEvent = IAuthTabCallback.onExtraCallbackWithResult;
            this.onTransact = onExtraCallbackWithResult.onExtraCallback;
        }

        public IAuthTabCallbackDefault onWarmupCompleted(boolean z) {
            this.asBinder = z;
            return this;
        }

        public IAuthTabCallbackDefault onNavigationEvent(boolean z) {
            this.IAuthTabCallbackDefault = z;
            return this;
        }

        public SelectionManagerExternalSyntheticLambda8 onExtraCallbackWithResult() {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.IAuthTabCallbackStub);
            this.IAuthTabCallbackStub = true;
            if (this.onExtraCallback == null) {
                this.onExtraCallback = new onTransact(new HandwritingGestureApi34ExternalSyntheticLambda16[0]);
            }
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = new SelectionManagerExternalSyntheticLambda9(this.asInterface);
            }
            return new SelectionManagerExternalSyntheticLambda8(this);
        }
    }

    @RequiresNonNull
    private SelectionManagerExternalSyntheticLambda8(IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        Context applicationContext = iAuthTabCallbackDefault.asInterface == null ? null : iAuthTabCallbackDefault.asInterface.getApplicationContext();
        this.onMinimized = applicationContext;
        this.IAuthTabCallbackDefault = TextContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent;
        this.onTransact = applicationContext != null ? null : iAuthTabCallbackDefault.IAuthTabCallback;
        this.IAuthTabCallbackStubProxy = iAuthTabCallbackDefault.onExtraCallback;
        this.ICustomTabsCallbackDefault = iAuthTabCallbackDefault.asBinder;
        int i2 = Build.VERSION.SDK_INT;
        this.writeTypedList = iAuthTabCallbackDefault.IAuthTabCallbackDefault;
        this.requestPostMessageChannel = 0;
        this.extraCallbackWithResult = iAuthTabCallbackDefault.onNavigationEvent;
        this.access000 = (onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallbackDefault.onWarmupCompleted);
        this.ICustomTabsCallback = new SelectionManagerExternalSyntheticLambda6(new access000());
        SelectionManagerKtExternalSyntheticLambda0 selectionManagerKtExternalSyntheticLambda0 = new SelectionManagerKtExternalSyntheticLambda0();
        this.onActivityResized = selectionManagerKtExternalSyntheticLambda0;
        SelectionManager_androidKtExternalSyntheticLambda6 selectionManager_androidKtExternalSyntheticLambda6 = new SelectionManager_androidKtExternalSyntheticLambda6();
        this.IPostMessageServiceStubProxy = selectionManager_androidKtExternalSyntheticLambda6;
        this.ITrustedWebActivityCallbackStub = new ImeEditCommand_androidKtExternalSyntheticLambda3();
        this.IEngagementSignalsCallbackStubProxy = new SelectionManager_androidKtExternalSyntheticLambda3();
        this.onActivityLayout = ImmutableList.of(selectionManager_androidKtExternalSyntheticLambda6, selectionManagerKtExternalSyntheticLambda0);
        this.ITrustedWebActivityCallback = 1.0f;
        this.getInterfaceDescriptor = 0;
        this.extraCallback = new TextContextMenuModifierKtExternalSyntheticLambda0(0, 0.0f);
        AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback;
        this.prefetchWithMultipleUrls = new asInterface(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, 0L, 0L);
        this.ICustomTabsService_Parcel = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1;
        this.onGreatestScrollPercentageIncreased = false;
        this.requestPostMessageChannelWithExtras = new ArrayDeque<>();
        this.ICustomTabsCallback_Parcel = new IAuthTabCallbackStubProxy<>();
        this.IPostMessageService_Parcel = new IAuthTabCallbackStubProxy<>();
        this.IAuthTabCallbackStub = iAuthTabCallbackDefault.onExtraCallbackWithResult;
        this.readTypedObject = iAuthTabCallbackDefault.onTransact;
        this.onRelationshipValidationResult = (i2 < 34 || iAuthTabCallbackDefault.asInterface == null) ? -1 : IAuthTabCallback(iAuthTabCallbackDefault.asInterface);
        this.ICustomTabsCallbackStub = iAuthTabCallbackDefault.IAuthTabCallbackStubProxy;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onNavigationEvent(SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent) {
        this.postMessage = onnavigationevent;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallback(@Nullable SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        this.ICustomTabsServiceStubProxy = selectionManagerExternalSyntheticLambda12;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.ICustomTabsCallback.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda0);
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) != 0;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public int onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        onActivityLayout();
        if (!"audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            return this.onTransact.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, this.IAuthTabCallbackDefault) ? 2 : 0;
        }
        if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized)) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultAudioSink", "Invalid PCM encoding: " + basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized);
            return 0;
        }
        int i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized;
        return (i2 == 2 || (this.ICustomTabsCallbackDefault && i2 == 4)) ? 2 : 1;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public SelectionManagerExternalSyntheticLambda14 onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (this.setEngagementSignalsCallback) {
            return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
        }
        return this.access000.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, this.IAuthTabCallbackDefault);
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public long IAuthTabCallback(boolean z) {
        if (!onPostMessage() || this.IEngagementSignalsCallbackDefault) {
            return Long.MIN_VALUE;
        }
        return onNavigationEvent(onExtraCallbackWithResult(Math.min(this.ICustomTabsCallback.IAuthTabCallback(), this.onPostMessage.onWarmupCompleted(extraCallbackWithResult()))));
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2, @Nullable int[] iArr) throws SelectionManagerExternalSyntheticLambda2.onExtraCallback {
        SelectionManagerExternalSyntheticLambda14 selectionManagerExternalSyntheticLambda14OnNavigationEvent;
        int i3;
        int iIntValue;
        int i4;
        boolean z;
        boolean z2;
        HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda17;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iOnExtraCallback;
        onActivityLayout();
        if ("audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            RecordingInputConnection_androidKt.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized));
            iOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized, basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(this.onActivityLayout);
            if (onTransact(basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized)) {
                builder.add(this.IEngagementSignalsCallbackStubProxy);
            } else {
                builder.add(this.ITrustedWebActivityCallbackStub);
                builder.add(this.IAuthTabCallbackStubProxy.onNavigationEvent());
            }
            HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda172 = new HandwritingGestureApi34ExternalSyntheticLambda17(builder.build());
            if (handwritingGestureApi34ExternalSyntheticLambda172.equals(this.IAuthTabCallback_Parcel)) {
                handwritingGestureApi34ExternalSyntheticLambda172 = this.IAuthTabCallback_Parcel;
            }
            this.IPostMessageServiceStubProxy.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.access100, basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult);
            this.onActivityResized.onExtraCallbackWithResult(iArr);
            try {
                HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallbackOnExtraCallback = handwritingGestureApi34ExternalSyntheticLambda172.onExtraCallback(new HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4));
                int i13 = iAuthTabCallbackOnExtraCallback.onExtraCallback;
                int i14 = iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult;
                int iIAuthTabCallback = this.readTypedObject.IAuthTabCallback(iAuthTabCallbackOnExtraCallback.onWarmupCompleted);
                i7 = 0;
                z3 = false;
                iOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i13, iAuthTabCallbackOnExtraCallback.onWarmupCompleted);
                handwritingGestureApi34ExternalSyntheticLambda17 = handwritingGestureApi34ExternalSyntheticLambda172;
                i5 = i14;
                i6 = iIAuthTabCallback;
                z4 = this.writeTypedList;
                i8 = i13;
            } catch (HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult e) {
                throw new SelectionManagerExternalSyntheticLambda2.onExtraCallback(e, basicTextContextMenuProviderKtExternalSyntheticLambda4);
            }
        } else {
            HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda173 = new HandwritingGestureApi34ExternalSyntheticLambda17(ImmutableList.of());
            int i15 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch;
            if (this.requestPostMessageChannel != 0) {
                selectionManagerExternalSyntheticLambda14OnNavigationEvent = onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            } else {
                selectionManagerExternalSyntheticLambda14OnNavigationEvent = SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
            }
            if (this.requestPostMessageChannel != 0 && selectionManagerExternalSyntheticLambda14OnNavigationEvent.onWarmupCompleted) {
                int iOnNavigationEvent3 = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable), basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub);
                int iIAuthTabCallback2 = this.readTypedObject.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent);
                z2 = selectionManagerExternalSyntheticLambda14OnNavigationEvent.IAuthTabCallback;
                i3 = 1;
                iIntValue = iIAuthTabCallback2;
                i4 = iOnNavigationEvent3;
                z = true;
            } else {
                Pair<Integer, Integer> pairIAuthTabCallback = this.onTransact.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, this.IAuthTabCallbackDefault);
                if (pairIAuthTabCallback == null) {
                    throw new SelectionManagerExternalSyntheticLambda2.onExtraCallback("Unable to configure passthrough for: " + basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda4);
                }
                int iIntValue2 = ((Integer) pairIAuthTabCallback.first).intValue();
                i3 = 2;
                iIntValue = ((Integer) pairIAuthTabCallback.second).intValue();
                i4 = iIntValue2;
                z = this.writeTypedList;
                z2 = false;
            }
            handwritingGestureApi34ExternalSyntheticLambda17 = handwritingGestureApi34ExternalSyntheticLambda173;
            iOnNavigationEvent = -1;
            iOnNavigationEvent2 = -1;
            i5 = i15;
            z3 = z2;
            z4 = z;
            i6 = iIntValue;
            i7 = i3;
            i8 = i4;
        }
        if (i8 == 0) {
            throw new SelectionManagerExternalSyntheticLambda2.onExtraCallback("Invalid output encoding (mode=" + i7 + ") for: " + basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
        if (i6 == 0) {
            throw new SelectionManagerExternalSyntheticLambda2.onExtraCallback("Invalid output channel config (mode=" + i7 + ") for: " + basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
        int i16 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback;
        if ("audio/vnd.dts.hd;profile=lbr".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) && i16 == -1) {
            i16 = 768000;
        }
        int i17 = i16;
        if (i2 == 0) {
            i9 = i8;
            i10 = i6;
            i11 = iOnNavigationEvent2;
            i12 = i5;
            iOnExtraCallback = this.extraCallbackWithResult.onExtraCallback(onNavigationEvent(i5, i6, i8), i8, i7, iOnNavigationEvent2 != -1 ? iOnNavigationEvent2 : 1, i5, i17, z4 ? 8.0d : 1.0d);
        } else {
            i9 = i8;
            i10 = i6;
            i11 = iOnNavigationEvent2;
            i12 = i5;
            iOnExtraCallback = i2;
        }
        this.setEngagementSignalsCallback = false;
        IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(basicTextContextMenuProviderKtExternalSyntheticLambda4, iOnNavigationEvent, i7, i11, i12, i10, i9, iOnExtraCallback, handwritingGestureApi34ExternalSyntheticLambda17, z4, z3, this.ITrustedWebActivityCallbackDefault);
        if (onPostMessage()) {
            this.ICustomTabsServiceStub = iAuthTabCallbackStub;
        } else {
            this.onPostMessage = iAuthTabCallbackStub;
        }
    }

    private void onRelationshipValidationResult() {
        HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda17 = this.onPostMessage.onWarmupCompleted;
        this.IAuthTabCallback_Parcel = handwritingGestureApi34ExternalSyntheticLambda17;
        handwritingGestureApi34ExternalSyntheticLambda17.onExtraCallback();
    }

    private boolean readTypedObject() throws SelectionManagerExternalSyntheticLambda2.onWarmupCompleted {
        SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12;
        if (this.ICustomTabsCallback_Parcel.onExtraCallback()) {
            return false;
        }
        AudioTrack interfaceDescriptor = getInterfaceDescriptor();
        this.access100 = interfaceDescriptor;
        if (IAuthTabCallback(interfaceDescriptor)) {
            onNavigationEvent(this.access100);
            IAuthTabCallbackStub iAuthTabCallbackStub = this.onPostMessage;
            if (iAuthTabCallbackStub.IAuthTabCallback) {
                AudioTrack audioTrack = this.access100;
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = iAuthTabCallbackStub.onNavigationEvent;
                audioTrack.setOffloadDelayPadding(basicTextContextMenuProviderKtExternalSyntheticLambda4.access100, basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult);
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (selectionManagerExternalSyntheticLambda12 = this.ICustomTabsServiceStubProxy) != null) {
            onWarmupCompleted.onExtraCallbackWithResult(this.access100, selectionManagerExternalSyntheticLambda12);
        }
        SelectionManagerExternalSyntheticLambda6 selectionManagerExternalSyntheticLambda6 = this.ICustomTabsCallback;
        AudioTrack audioTrack2 = this.access100;
        IAuthTabCallbackStub iAuthTabCallbackStub2 = this.onPostMessage;
        selectionManagerExternalSyntheticLambda6.onNavigationEvent(audioTrack2, iAuthTabCallbackStub2.onTransact == 2, iAuthTabCallbackStub2.asBinder, iAuthTabCallbackStub2.IAuthTabCallbackDefault, iAuthTabCallbackStub2.onExtraCallback, this.ICustomTabsCallbackStub);
        onUnminimized();
        int i2 = this.extraCallback.onNavigationEvent;
        if (i2 != 0) {
            this.access100.attachAuxEffect(i2);
            this.access100.setAuxEffectSendLevel(this.extraCallback.IAuthTabCallback);
        }
        SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4 = this.IEngagementSignalsCallback;
        if (selectionManagerExternalSyntheticLambda4 != null) {
            onNavigationEvent.onExtraCallbackWithResult(this.access100, selectionManagerExternalSyntheticLambda4);
            SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = this.asBinder;
            if (selectionManagerExternalSyntheticLambda11 != null) {
                selectionManagerExternalSyntheticLambda11.onNavigationEvent(this.IEngagementSignalsCallback.onExtraCallback);
            }
        }
        SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda112 = this.asBinder;
        if (selectionManagerExternalSyntheticLambda112 != null) {
            this.updateVisuals = new getInterfaceDescriptor(this.access100, selectionManagerExternalSyntheticLambda112);
        }
        this.IEngagementSignalsCallbackDefault = true;
        int audioSessionId = this.access100.getAudioSessionId();
        boolean z = audioSessionId != this.getInterfaceDescriptor;
        this.getInterfaceDescriptor = audioSessionId;
        SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent = this.postMessage;
        if (onnavigationevent != null) {
            onnavigationevent.onNavigationEvent(this.onPostMessage.onExtraCallbackWithResult());
            if (z) {
                this.warmup = true;
                this.postMessage.onWarmupCompleted(this.getInterfaceDescriptor);
            }
        }
        return true;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void IAuthTabCallbackStub() throws IllegalStateException {
        this.access200 = true;
        if (onPostMessage()) {
            this.ICustomTabsCallback.asBinder();
            if (!this.IPostMessageServiceStub || IAuthTabCallback(this.access100)) {
                this.access100.play();
            }
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onTransact() {
        this.IPostMessageServiceDefault = true;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public boolean IAuthTabCallback(ByteBuffer byteBuffer, long j, int i2) throws Exception {
        ByteBuffer byteBuffer2 = this.mayLaunchUrl;
        RecordingInputConnection_androidKt.onNavigationEvent(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.ICustomTabsServiceStub != null) {
            if (!ICustomTabsCallback()) {
                return false;
            }
            if (!this.ICustomTabsServiceStub.onNavigationEvent(this.onPostMessage)) {
                onMinimized();
                if (asBinder()) {
                    return false;
                }
                onNavigationEvent();
            } else {
                this.onPostMessage = this.ICustomTabsServiceStub;
                this.ICustomTabsServiceStub = null;
                AudioTrack audioTrack = this.access100;
                if (audioTrack != null && IAuthTabCallback(audioTrack) && this.onPostMessage.IAuthTabCallback) {
                    if (this.access100.getPlayState() == 3) {
                        this.access100.setOffloadEndOfStream();
                        this.ICustomTabsCallback.onWarmupCompleted();
                    }
                    AudioTrack audioTrack2 = this.access100;
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onPostMessage.onNavigationEvent;
                    audioTrack2.setOffloadDelayPadding(basicTextContextMenuProviderKtExternalSyntheticLambda4.access100, basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult);
                    this.prefetch = true;
                }
            }
            onExtraCallback(j);
        }
        if (!onPostMessage()) {
            try {
                if (!readTypedObject()) {
                    return false;
                }
            } catch (SelectionManagerExternalSyntheticLambda2.onWarmupCompleted e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.ICustomTabsCallback_Parcel.onExtraCallback(e);
                return false;
            }
        }
        this.ICustomTabsCallback_Parcel.IAuthTabCallback();
        if (this.IEngagementSignalsCallbackDefault) {
            this.onVerticalScrollEvent = Math.max(0L, j);
            this.IPostMessageServiceDefault = false;
            this.IEngagementSignalsCallbackDefault = false;
            if (ICustomTabsCallback_Parcel()) {
                ICustomTabsCallbackDefault();
            }
            onExtraCallback(j);
            if (this.access200) {
                IAuthTabCallbackStub();
            }
        }
        if (!this.ICustomTabsCallback.onNavigationEvent(extraCallbackWithResult())) {
            return false;
        }
        if (this.mayLaunchUrl == null) {
            RecordingInputConnection_androidKt.onNavigationEvent(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = this.onPostMessage;
            if (iAuthTabCallbackStub.onTransact != 0 && this.extraCommand == 0) {
                int iIAuthTabCallback = IAuthTabCallback(iAuthTabCallbackStub.asBinder, byteBuffer);
                this.extraCommand = iIAuthTabCallback;
                if (iIAuthTabCallback == 0) {
                    return true;
                }
            }
            if (this.asInterface != null) {
                if (!ICustomTabsCallback()) {
                    return false;
                }
                onExtraCallback(j);
                this.asInterface = null;
            }
            long jOnExtraCallbackWithResult = this.onVerticalScrollEvent + this.onPostMessage.onExtraCallbackWithResult(writeTypedObject() - this.IPostMessageServiceStubProxy.access000());
            if (!this.IPostMessageServiceDefault && Math.abs(jOnExtraCallbackWithResult - j) > 200000) {
                SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent = this.postMessage;
                if (onnavigationevent != null) {
                    onnavigationevent.onWarmupCompleted(new SelectionManagerExternalSyntheticLambda2.onExtraCallbackWithResult(j, jOnExtraCallbackWithResult));
                }
                this.IPostMessageServiceDefault = true;
            }
            if (this.IPostMessageServiceDefault) {
                if (!ICustomTabsCallback()) {
                    return false;
                }
                long j2 = j - jOnExtraCallbackWithResult;
                this.onVerticalScrollEvent += j2;
                this.IPostMessageServiceDefault = false;
                onExtraCallback(j);
                SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent2 = this.postMessage;
                if (onnavigationevent2 != null && j2 != 0) {
                    onnavigationevent2.onWarmupCompleted();
                }
            }
            if (this.onPostMessage.onTransact == 0) {
                this.IPostMessageService += byteBuffer.remaining();
            } else {
                this.IEngagementSignalsCallback_Parcel += this.extraCommand * i2;
            }
            this.mayLaunchUrl = byteBuffer;
            this.newSession = i2;
        }
        onTransact(j);
        if (!this.mayLaunchUrl.hasRemaining()) {
            this.mayLaunchUrl = null;
            this.newSession = 0;
            return true;
        }
        if (!this.ICustomTabsCallback.onWarmupCompleted(extraCallbackWithResult())) {
            return false;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultAudioSink", "Resetting stalled audio track");
        onNavigationEvent();
        return true;
    }

    private AudioTrack getInterfaceDescriptor() throws SelectionManagerExternalSyntheticLambda2.onWarmupCompleted {
        try {
            return onWarmupCompleted((IAuthTabCallbackStub) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onPostMessage));
        } catch (SelectionManagerExternalSyntheticLambda2.onWarmupCompleted e) {
            IAuthTabCallbackStub iAuthTabCallbackStub = this.onPostMessage;
            if (iAuthTabCallbackStub.onExtraCallback > 1000000) {
                IAuthTabCallbackStub iAuthTabCallbackStubOnExtraCallbackWithResult = iAuthTabCallbackStub.onExtraCallbackWithResult(1000000);
                try {
                    AudioTrack audioTrackOnWarmupCompleted = onWarmupCompleted(iAuthTabCallbackStubOnExtraCallbackWithResult);
                    this.onPostMessage = iAuthTabCallbackStubOnExtraCallbackWithResult;
                    return audioTrackOnWarmupCompleted;
                } catch (SelectionManagerExternalSyntheticLambda2.onWarmupCompleted e2) {
                    e.addSuppressed(e2);
                    onActivityResized();
                    throw e;
                }
            }
            onActivityResized();
            throw e;
        }
    }

    private AudioTrack onWarmupCompleted(IAuthTabCallbackStub iAuthTabCallbackStub) throws SelectionManagerExternalSyntheticLambda2.onWarmupCompleted {
        int i2;
        Context context;
        Context context2;
        try {
            int i3 = this.getInterfaceDescriptor;
            int i4 = this.onRelationshipValidationResult;
            if (i4 == -1 || (context2 = this.onMinimized) == null || Build.VERSION.SDK_INT < 34) {
                i2 = i3;
                context = null;
            } else {
                if (this.ICustomTabsCallbackStubProxy == null) {
                    this.ICustomTabsCallbackStubProxy = context2.createDeviceContext(i4);
                }
                context = this.ICustomTabsCallbackStubProxy;
                i2 = 0;
            }
            AudioTrack audioTrackOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallbackStub.onExtraCallbackWithResult(), this.IAuthTabCallbackDefault, i2, iAuthTabCallbackStub.onNavigationEvent, context);
            if (this.IAuthTabCallbackStub != null) {
                IAuthTabCallback(audioTrackOnExtraCallbackWithResult);
            }
            return audioTrackOnExtraCallbackWithResult;
        } catch (SelectionManagerExternalSyntheticLambda2.onWarmupCompleted e) {
            SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent = this.postMessage;
            if (onnavigationevent != null) {
                onnavigationevent.onWarmupCompleted(e);
            }
            throw e;
        }
    }

    private AudioTrack onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable Context context) throws SelectionManagerExternalSyntheticLambda2.onWarmupCompleted {
        try {
            AudioTrack audioTrackOnExtraCallbackWithResult = this.readTypedObject.onExtraCallbackWithResult(iAuthTabCallback, textContextMenuHelperApi28ExternalSyntheticLambda5, i2, context);
            int state = audioTrackOnExtraCallbackWithResult.getState();
            if (state == 1) {
                return audioTrackOnExtraCallbackWithResult;
            }
            try {
                audioTrackOnExtraCallbackWithResult.release();
            } catch (Exception unused) {
            }
            throw new SelectionManagerExternalSyntheticLambda2.onWarmupCompleted(state, iAuthTabCallback.onNavigationEvent, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallback, iAuthTabCallback.onExtraCallbackWithResult, basicTextContextMenuProviderKtExternalSyntheticLambda4, iAuthTabCallback.onWarmupCompleted, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new SelectionManagerExternalSyntheticLambda2.onWarmupCompleted(0, iAuthTabCallback.onNavigationEvent, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallback, iAuthTabCallback.onExtraCallbackWithResult, basicTextContextMenuProviderKtExternalSyntheticLambda4, iAuthTabCallback.onWarmupCompleted, e);
        }
    }

    private void onNavigationEvent(AudioTrack audioTrack) {
        if (this.receiveFile == null) {
            this.receiveFile = new IAuthTabCallback_Parcel();
        }
        this.receiveFile.onNavigationEvent(audioTrack);
    }

    private void onTransact(long j) throws Exception {
        IAuthTabCallback(j);
        if (this.validateRelationship == null) {
            if (!this.IAuthTabCallback_Parcel.onWarmupCompleted()) {
                ByteBuffer byteBuffer = this.mayLaunchUrl;
                if (byteBuffer != null) {
                    onExtraCallbackWithResult(byteBuffer);
                    IAuthTabCallback(j);
                    return;
                }
                return;
            }
            while (!this.IAuthTabCallback_Parcel.onExtraCallbackWithResult()) {
                do {
                    ByteBuffer byteBufferIAuthTabCallback = this.IAuthTabCallback_Parcel.IAuthTabCallback();
                    if (byteBufferIAuthTabCallback.hasRemaining()) {
                        onExtraCallbackWithResult(byteBufferIAuthTabCallback);
                        IAuthTabCallback(j);
                    } else {
                        ByteBuffer byteBuffer2 = this.mayLaunchUrl;
                        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                            return;
                        } else {
                            this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(this.mayLaunchUrl);
                        }
                    }
                } while (this.validateRelationship == null);
                return;
            }
        }
    }

    private boolean ICustomTabsCallback() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.IAuthTabCallback_Parcel.onWarmupCompleted()) {
            IAuthTabCallback(Long.MIN_VALUE);
            return this.validateRelationship == null;
        }
        this.IAuthTabCallback_Parcel.onNavigationEvent();
        onTransact(Long.MIN_VALUE);
        return this.IAuthTabCallback_Parcel.onExtraCallbackWithResult() && ((byteBuffer = this.validateRelationship) == null || !byteBuffer.hasRemaining());
    }

    private void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.validateRelationship == null);
        if (byteBuffer.hasRemaining()) {
            this.validateRelationship = onNavigationEvent(byteBuffer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallback(long j) throws Exception {
        int iOnNavigationEvent;
        SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent;
        if (this.validateRelationship == null || this.IPostMessageService_Parcel.onExtraCallback()) {
            return;
        }
        int iRemaining = this.validateRelationship.remaining();
        if (this.ITrustedWebActivityCallbackDefault) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.newSessionWithExtras;
            } else {
                this.newSessionWithExtras = j;
            }
            iOnNavigationEvent = onWarmupCompleted(this.access100, this.validateRelationship, iRemaining, j);
        } else {
            iOnNavigationEvent = onNavigationEvent(this.access100, this.validateRelationship, iRemaining);
        }
        this.newAuthTabSession = SystemClock.elapsedRealtime();
        if (iOnNavigationEvent < 0) {
            if (!onWarmupCompleted(iOnNavigationEvent)) {
                z = false;
            } else if (extraCallbackWithResult() <= 0) {
                if (IAuthTabCallback(this.access100)) {
                    onActivityResized();
                }
            }
            SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub iAuthTabCallbackStub = new SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub(iOnNavigationEvent, this.onPostMessage.onNavigationEvent, z);
            SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent2 = this.postMessage;
            if (onnavigationevent2 != null) {
                onnavigationevent2.onWarmupCompleted(iAuthTabCallbackStub);
            }
            if (iAuthTabCallbackStub.isRecoverable && this.onMinimized != null) {
                SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13 = SelectionManagerExternalSyntheticLambda13.IAuthTabCallback;
                this.onTransact = selectionManagerExternalSyntheticLambda13;
                this.asBinder.onExtraCallbackWithResult(selectionManagerExternalSyntheticLambda13);
                throw iAuthTabCallbackStub;
            }
            this.IPostMessageService_Parcel.onExtraCallback(iAuthTabCallbackStub);
            return;
        }
        this.IPostMessageService_Parcel.IAuthTabCallback();
        if (IAuthTabCallback(this.access100)) {
            if (this.ITrustedWebActivityCallback_Parcel > 0) {
                this.prefetch = false;
            }
            if (this.access200 && (onnavigationevent = this.postMessage) != null && iOnNavigationEvent < iRemaining && !this.prefetch) {
                onnavigationevent.onNavigationEvent();
            }
        }
        int i2 = this.onPostMessage.onTransact;
        if (i2 == 0) {
            this.ITrustedWebActivityService += iOnNavigationEvent;
        }
        if (iOnNavigationEvent == iRemaining) {
            if (i2 != 0) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.validateRelationship == this.mayLaunchUrl);
                this.ITrustedWebActivityCallback_Parcel += this.extraCommand * this.newSession;
            }
            this.validateRelationship = null;
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void IAuthTabCallbackStubProxy() throws IllegalStateException, SelectionManagerExternalSyntheticLambda2.IAuthTabCallbackStub {
        if (!this.ICustomTabsService && onPostMessage() && ICustomTabsCallback()) {
            onMinimized();
            this.ICustomTabsService = true;
        }
    }

    private void onActivityResized() {
        if (this.onPostMessage.onExtraCallback()) {
            this.setEngagementSignalsCallback = true;
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public boolean asInterface() {
        if (onPostMessage()) {
            return this.ICustomTabsService && !asBinder();
        }
        return true;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public boolean asBinder() {
        if (onPostMessage()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.access100.isOffloadedPlayback() && this.isEngagementSignalsApiAvailable) && this.ICustomTabsCallback.onExtraCallbackWithResult(extraCallbackWithResult());
        }
        return false;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onNavigationEvent(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        this.ICustomTabsService_Parcel = new AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult, 0.1f, 8.0f), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onWarmupCompleted, 0.1f, 8.0f));
        if (ICustomTabsCallback_Parcel()) {
            ICustomTabsCallbackDefault();
        } else {
            onExtraCallbackWithResult(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onExtraCallback() {
        return this.ICustomTabsService_Parcel;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onWarmupCompleted(boolean z) {
        this.onGreatestScrollPercentageIncreased = z;
        onExtraCallbackWithResult(ICustomTabsCallback_Parcel() ? AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback : this.ICustomTabsService_Parcel);
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) throws IllegalStateException {
        if (this.IAuthTabCallbackDefault.equals(textContextMenuHelperApi28ExternalSyntheticLambda5)) {
            return;
        }
        this.IAuthTabCallbackDefault = textContextMenuHelperApi28ExternalSyntheticLambda5;
        if (this.ITrustedWebActivityCallbackDefault) {
            return;
        }
        SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = this.asBinder;
        if (selectionManagerExternalSyntheticLambda11 != null) {
            selectionManagerExternalSyntheticLambda11.onWarmupCompleted(textContextMenuHelperApi28ExternalSyntheticLambda5);
        }
        onNavigationEvent();
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallbackWithResult(int i2) throws IllegalStateException {
        if (this.warmup) {
            if (this.getInterfaceDescriptor != i2) {
                return;
            } else {
                this.warmup = false;
            }
        }
        if (this.getInterfaceDescriptor != i2) {
            this.getInterfaceDescriptor = i2;
            this.onUnminimized = i2 != 0;
            onNavigationEvent();
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallback(TextContextMenuModifierKtExternalSyntheticLambda0 textContextMenuModifierKtExternalSyntheticLambda0) {
        if (this.extraCallback.equals(textContextMenuModifierKtExternalSyntheticLambda0)) {
            return;
        }
        int i2 = textContextMenuModifierKtExternalSyntheticLambda0.onNavigationEvent;
        float f = textContextMenuModifierKtExternalSyntheticLambda0.IAuthTabCallback;
        AudioTrack audioTrack = this.access100;
        if (audioTrack != null) {
            if (this.extraCallback.onNavigationEvent != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.access100.setAuxEffectSendLevel(f);
            }
        }
        this.extraCallback = textContextMenuModifierKtExternalSyntheticLambda0;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallback(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.IEngagementSignalsCallback = audioDeviceInfo == null ? null : new SelectionManagerExternalSyntheticLambda4(audioDeviceInfo);
        SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = this.asBinder;
        if (selectionManagerExternalSyntheticLambda11 != null) {
            selectionManagerExternalSyntheticLambda11.onNavigationEvent(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.access100;
        if (audioTrack != null) {
            onNavigationEvent.onExtraCallbackWithResult(audioTrack, this.IEngagementSignalsCallback);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public long onWarmupCompleted() {
        if (onPostMessage()) {
            return onNavigationEvent.onExtraCallbackWithResult(this.access100, this.onPostMessage);
        }
        return -9223372036854775807L;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallbackWithResult() throws IllegalStateException {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onUnminimized);
        if (this.ITrustedWebActivityCallbackDefault) {
            return;
        }
        this.ITrustedWebActivityCallbackDefault = true;
        onNavigationEvent();
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void IAuthTabCallback() throws IllegalStateException {
        if (this.ITrustedWebActivityCallbackDefault) {
            this.ITrustedWebActivityCallbackDefault = false;
            onNavigationEvent();
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onExtraCallback(int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(Build.VERSION.SDK_INT >= 29);
        this.requestPostMessageChannel = i2;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void IAuthTabCallback(int i2, int i3) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        AudioTrack audioTrack = this.access100;
        if (audioTrack == null || !IAuthTabCallback(audioTrack) || (iAuthTabCallbackStub = this.onPostMessage) == null || !iAuthTabCallbackStub.IAuthTabCallback) {
            return;
        }
        this.access100.setOffloadDelayPadding(i2, i3);
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onWarmupCompleted(float f) {
        if (this.ITrustedWebActivityCallback != f) {
            this.ITrustedWebActivityCallback = f;
            onUnminimized();
        }
    }

    private void onUnminimized() {
        if (onPostMessage()) {
            this.access100.setVolume(this.ITrustedWebActivityCallback);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void IAuthTabCallbackDefault() throws IllegalStateException {
        this.access200 = false;
        if (onPostMessage()) {
            this.ICustomTabsCallback.onNavigationEvent();
            if (!this.IPostMessageServiceStub || IAuthTabCallback(this.access100)) {
                this.access100.pause();
            }
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void onNavigationEvent() throws IllegalStateException {
        if (onPostMessage()) {
            ICustomTabsCallbackStub();
            if (this.ICustomTabsCallback.onExtraCallback()) {
                this.access100.pause();
            }
            if (IAuthTabCallback(this.access100)) {
                ((IAuthTabCallback_Parcel) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.receiveFile)).onWarmupCompleted(this.access100);
            }
            SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = this.onPostMessage.onExtraCallbackWithResult();
            IAuthTabCallbackStub iAuthTabCallbackStub = this.ICustomTabsServiceStub;
            if (iAuthTabCallbackStub != null) {
                this.onPostMessage = iAuthTabCallbackStub;
                this.ICustomTabsServiceStub = null;
            }
            this.ICustomTabsCallback.onExtraCallbackWithResult();
            getInterfaceDescriptor getinterfacedescriptor = this.updateVisuals;
            if (getinterfacedescriptor != null) {
                getinterfacedescriptor.onNavigationEvent();
                this.updateVisuals = null;
            }
            IAuthTabCallback(this.access100, this.postMessage, iAuthTabCallbackOnExtraCallbackWithResult);
            this.access100 = null;
        }
        this.IPostMessageService_Parcel.IAuthTabCallback();
        this.ICustomTabsCallback_Parcel.IAuthTabCallback();
        this.onSessionEnded = 0L;
        this.onExtraCallback = 0L;
        Handler handler = this.IEngagementSignalsCallbackStub;
        if (handler != null) {
            ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void access000() throws IllegalStateException {
        onNavigationEvent();
        UnmodifiableIterator it = this.onActivityLayout.iterator();
        while (it.hasNext()) {
            ((HandwritingGestureApi34ExternalSyntheticLambda16) it.next()).onTransact();
        }
        this.ITrustedWebActivityCallbackStub.onTransact();
        this.IEngagementSignalsCallbackStubProxy.onTransact();
        HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda17 = this.IAuthTabCallback_Parcel;
        if (handwritingGestureApi34ExternalSyntheticLambda17 != null) {
            handwritingGestureApi34ExternalSyntheticLambda17.asBinder();
        }
        this.access200 = false;
        this.setEngagementSignalsCallback = false;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda2
    public void access100() {
        SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = this.asBinder;
        if (selectionManagerExternalSyntheticLambda11 != null) {
            selectionManagerExternalSyntheticLambda11.onExtraCallback();
        }
    }

    public void onWarmupCompleted(SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13) {
        Looper looperMyLooper = Looper.myLooper();
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsServiceDefault == looperMyLooper, "Current looper (" + onNavigationEvent(looperMyLooper) + ") is not the playback looper (" + onNavigationEvent(this.ICustomTabsServiceDefault) + ")");
        SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda132 = this.onTransact;
        if (selectionManagerExternalSyntheticLambda132 == null || selectionManagerExternalSyntheticLambda13.equals(selectionManagerExternalSyntheticLambda132)) {
            return;
        }
        this.onTransact = selectionManagerExternalSyntheticLambda13;
        SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent = this.postMessage;
        if (onnavigationevent != null) {
            onnavigationevent.IAuthTabCallback();
        }
    }

    private void ICustomTabsCallbackStub() {
        this.IPostMessageService = 0L;
        this.IEngagementSignalsCallback_Parcel = 0L;
        this.ITrustedWebActivityService = 0L;
        this.ITrustedWebActivityCallback_Parcel = 0L;
        this.prefetch = false;
        this.extraCommand = 0;
        this.prefetchWithMultipleUrls = new asInterface(this.ICustomTabsService_Parcel, 0L, 0L);
        this.onVerticalScrollEvent = 0L;
        this.asInterface = null;
        this.requestPostMessageChannelWithExtras.clear();
        this.mayLaunchUrl = null;
        this.newSession = 0;
        this.validateRelationship = null;
        this.IPostMessageServiceStub = false;
        this.ICustomTabsService = false;
        this.isEngagementSignalsApiAvailable = false;
        this.writeTypedObject = null;
        this.onMessageChannelReady = 0;
        this.IPostMessageServiceStubProxy.IAuthTabCallbackStubProxy();
        onRelationshipValidationResult();
    }

    private void ICustomTabsCallbackDefault() {
        if (onPostMessage()) {
            try {
                this.access100.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.ICustomTabsService_Parcel.onExtraCallbackWithResult).setPitch(this.ICustomTabsService_Parcel.onWarmupCompleted).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("DefaultAudioSink", "Failed to set playback params", e);
            }
            AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = new AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1(this.access100.getPlaybackParams().getSpeed(), this.access100.getPlaybackParams().getPitch());
            this.ICustomTabsService_Parcel = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1;
            this.ICustomTabsCallback.onWarmupCompleted(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
    }

    private void onExtraCallbackWithResult(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        asInterface asinterface = new asInterface(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, -9223372036854775807L, -9223372036854775807L);
        if (onPostMessage()) {
            this.asInterface = asinterface;
        } else {
            this.prefetchWithMultipleUrls = asinterface;
        }
    }

    private void onExtraCallback(long j) {
        AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnWarmupCompleted;
        if (!ICustomTabsCallback_Parcel()) {
            if (ICustomTabsCallbackStubProxy()) {
                androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(this.ICustomTabsService_Parcel);
            } else {
                androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnWarmupCompleted = AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback;
            }
            this.ICustomTabsService_Parcel = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnWarmupCompleted;
        } else {
            androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnWarmupCompleted = AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback;
        }
        AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnWarmupCompleted;
        this.onGreatestScrollPercentageIncreased = ICustomTabsCallbackStubProxy() ? this.IAuthTabCallbackStubProxy.onExtraCallback(this.onGreatestScrollPercentageIncreased) : false;
        this.requestPostMessageChannelWithExtras.add(new asInterface(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, Math.max(0L, j), this.onPostMessage.onWarmupCompleted(extraCallbackWithResult())));
        onRelationshipValidationResult();
        SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent = this.postMessage;
        if (onnavigationevent != null) {
            onnavigationevent.onNavigationEvent(this.onGreatestScrollPercentageIncreased);
        }
    }

    private boolean ICustomTabsCallbackStubProxy() {
        if (this.ITrustedWebActivityCallbackDefault) {
            return false;
        }
        IAuthTabCallbackStub iAuthTabCallbackStub = this.onPostMessage;
        return iAuthTabCallbackStub.onTransact == 0 && !onTransact(iAuthTabCallbackStub.onNavigationEvent.onUnminimized);
    }

    private boolean ICustomTabsCallback_Parcel() {
        IAuthTabCallbackStub iAuthTabCallbackStub = this.onPostMessage;
        return iAuthTabCallbackStub != null && iAuthTabCallbackStub.onExtraCallbackWithResult;
    }

    private boolean onTransact(int i2) {
        return this.ICustomTabsCallbackDefault && TextFieldDecoratorModifierNodeExternalSyntheticLambda6.getInterfaceDescriptor(i2);
    }

    private long onExtraCallbackWithResult(long j) {
        while (!this.requestPostMessageChannelWithExtras.isEmpty() && j >= this.requestPostMessageChannelWithExtras.getFirst().onNavigationEvent) {
            this.prefetchWithMultipleUrls = this.requestPostMessageChannelWithExtras.remove();
        }
        asInterface asinterface = this.prefetchWithMultipleUrls;
        long j2 = j - asinterface.onNavigationEvent;
        long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2, asinterface.onExtraCallbackWithResult.onExtraCallbackWithResult);
        if (this.requestPostMessageChannelWithExtras.isEmpty()) {
            long jIAuthTabCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback(j2);
            asInterface asinterface2 = this.prefetchWithMultipleUrls;
            long j3 = asinterface2.onExtraCallback;
            asinterface2.onWarmupCompleted = jIAuthTabCallback - jOnExtraCallback;
            return j3 + jIAuthTabCallback;
        }
        asInterface asinterface3 = this.prefetchWithMultipleUrls;
        return asinterface3.onExtraCallback + jOnExtraCallback + asinterface3.onWarmupCompleted;
    }

    private long onNavigationEvent(long j) {
        long jOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback();
        long jOnWarmupCompleted = this.onPostMessage.onWarmupCompleted(jOnExtraCallback);
        long j2 = this.onSessionEnded;
        if (jOnExtraCallback > j2) {
            long jOnWarmupCompleted2 = this.onPostMessage.onWarmupCompleted(jOnExtraCallback - j2);
            this.onSessionEnded = jOnExtraCallback;
            onWarmupCompleted(jOnWarmupCompleted2);
        }
        return j + jOnWarmupCompleted;
    }

    private void onWarmupCompleted(long j) {
        this.onExtraCallback += j;
        if (this.IEngagementSignalsCallbackStub == null) {
            this.IEngagementSignalsCallbackStub = new Handler(Looper.myLooper());
        }
        this.IEngagementSignalsCallbackStub.removeCallbacksAndMessages(null);
        this.IEngagementSignalsCallbackStub.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onMessageChannelReady();
            }
        }, 100L);
    }

    private boolean onPostMessage() {
        return this.access100 != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long writeTypedObject() {
        if (this.onPostMessage.onTransact == 0) {
            return this.IPostMessageService / r0.IAuthTabCallbackStub;
        }
        return this.IEngagementSignalsCallback_Parcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long extraCallbackWithResult() {
        if (this.onPostMessage.onTransact == 0) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.ITrustedWebActivityService, r0.IAuthTabCallbackDefault);
        }
        return this.ITrustedWebActivityCallback_Parcel;
    }

    @EnsuresNonNull
    private void onActivityLayout() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder == null || this.ICustomTabsServiceDefault == looperMyLooper, "DefaultAudioSink accessed on multiple threads: " + onNavigationEvent(this.ICustomTabsServiceDefault) + " and " + onNavigationEvent(looperMyLooper));
        if (this.asBinder != null || (context = this.onMinimized) == null) {
            return;
        }
        this.ICustomTabsServiceDefault = looperMyLooper;
        SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11 = new SelectionManagerExternalSyntheticLambda11(context, new SelectionManagerExternalSyntheticLambda11.IAuthTabCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda2
            @Override // o.SelectionManagerExternalSyntheticLambda11.IAuthTabCallback
            public final void onAudioCapabilitiesChanged(SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13) {
                this.f$0.onWarmupCompleted(selectionManagerExternalSyntheticLambda13);
            }
        }, this.IAuthTabCallbackDefault, this.IEngagementSignalsCallback);
        this.asBinder = selectionManagerExternalSyntheticLambda11;
        this.onTransact = selectionManagerExternalSyntheticLambda11.onNavigationEvent();
    }

    private static boolean IAuthTabCallback(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static int IAuthTabCallback(int i2, ByteBuffer byteBuffer) {
        if (i2 != 20) {
            if (i2 != 30) {
                switch (i2) {
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                        break;
                    case 9:
                        int iOnExtraCallbackWithResult = ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(byteBuffer, byteBuffer.position()));
                        if (iOnExtraCallbackWithResult != -1) {
                            return iOnExtraCallbackWithResult;
                        }
                        throw new IllegalArgumentException();
                    case 10:
                        return 1024;
                    case 11:
                    case 12:
                        return 2048;
                    default:
                        switch (i2) {
                            case 14:
                                int iIAuthTabCallback = DrawerKtExternalSyntheticLambda25.IAuthTabCallback(byteBuffer);
                                if (iIAuthTabCallback == -1) {
                                    return 0;
                                }
                                return DrawerKtExternalSyntheticLambda25.onExtraCallback(byteBuffer, iIAuthTabCallback) << 4;
                            case 15:
                                return 512;
                            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                return 1024;
                            case 17:
                                return DrawerKtExternalSyntheticLambda3.onExtraCallbackWithResult(byteBuffer);
                            case 18:
                                break;
                            default:
                                throw new IllegalStateException("Unexpected audio encoding: " + i2);
                        }
                }
                return DrawerKtExternalSyntheticLambda25.onExtraCallback(byteBuffer);
            }
            return DrawerKtBottomDrawerScrimdismissModifier11ExternalSyntheticLambda0.IAuthTabCallback(byteBuffer);
        }
        return ExposedDropdownMenu_androidExternalSyntheticLambda0.onExtraCallback(byteBuffer);
    }

    private static int onNavigationEvent(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private int onWarmupCompleted(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j * 1000);
        }
        if (this.writeTypedObject == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.writeTypedObject = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.writeTypedObject.putInt(1431633921);
        }
        if (this.onMessageChannelReady == 0) {
            this.writeTypedObject.putInt(4, i2);
            this.writeTypedObject.putLong(8, j * 1000);
            this.writeTypedObject.position(0);
            this.onMessageChannelReady = i2;
        }
        int iRemaining = this.writeTypedObject.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.writeTypedObject, iRemaining, 1);
            if (iWrite < 0) {
                this.onMessageChannelReady = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iOnNavigationEvent = onNavigationEvent(audioTrack, byteBuffer, i2);
        if (iOnNavigationEvent < 0) {
            this.onMessageChannelReady = 0;
            return iOnNavigationEvent;
        }
        this.onMessageChannelReady -= iOnNavigationEvent;
        return iOnNavigationEvent;
    }

    private void onMinimized() throws IllegalStateException {
        if (this.IPostMessageServiceStub) {
            return;
        }
        this.IPostMessageServiceStub = true;
        this.ICustomTabsCallback.onExtraCallback(extraCallbackWithResult());
        if (IAuthTabCallback(this.access100)) {
            this.isEngagementSignalsApiAvailable = false;
        }
        this.access100.stop();
        this.onMessageChannelReady = 0;
    }

    private ByteBuffer onNavigationEvent(ByteBuffer byteBuffer) {
        if (this.onPostMessage.onTransact != 0) {
            return byteBuffer;
        }
        int iOnNavigationEvent = (int) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(20L), this.onPostMessage.access000);
        long jExtraCallbackWithResult = extraCallbackWithResult();
        if (jExtraCallbackWithResult >= iOnNavigationEvent) {
            return byteBuffer;
        }
        IAuthTabCallbackStub iAuthTabCallbackStub = this.onPostMessage;
        return SelectionManagerKtExternalSyntheticLambda2.IAuthTabCallback(byteBuffer, iAuthTabCallbackStub.asBinder, iAuthTabCallbackStub.IAuthTabCallbackDefault, (int) jExtraCallbackWithResult, iOnNavigationEvent);
    }

    private static void IAuthTabCallback(final AudioTrack audioTrack, @Nullable final SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent, final SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (onExtraCallbackWithResult) {
            if (IAuthTabCallback == null) {
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                IAuthTabCallback = (ScheduledExecutorService) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(706796024, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{"ExoPlayer:AudioTrackReleaseThread"}, -706795999);
            }
            onWarmupCompleted++;
            IAuthTabCallback.schedule(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionManagerExternalSyntheticLambda8.onWarmupCompleted(audioTrack, onnavigationevent, handler, iAuthTabCallback);
                }
            }, 20L, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(AudioTrack audioTrack, final SelectionManagerExternalSyntheticLambda2.onNavigationEvent onnavigationevent, Handler handler, final SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (onnavigationevent != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        onnavigationevent.IAuthTabCallback(iAuthTabCallback);
                    }
                });
            }
            synchronized (onExtraCallbackWithResult) {
                int i2 = onWarmupCompleted - 1;
                onWarmupCompleted = i2;
                if (i2 == 0) {
                    IAuthTabCallback.shutdown();
                    IAuthTabCallback = null;
                }
            }
        } catch (Throwable th) {
            if (onnavigationevent != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        onnavigationevent.IAuthTabCallback(iAuthTabCallback);
                    }
                });
            }
            synchronized (onExtraCallbackWithResult) {
                int i3 = onWarmupCompleted - 1;
                onWarmupCompleted = i3;
                if (i3 == 0) {
                    IAuthTabCallback.shutdown();
                    IAuthTabCallback = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean extraCallback() {
        boolean z;
        synchronized (onExtraCallbackWithResult) {
            z = onWarmupCompleted > 0;
        }
        return z;
    }

    private static int IAuthTabCallback(Context context) {
        int deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    public static final class getInterfaceDescriptor {
        private final AudioTrack IAuthTabCallback;
        private final SelectionManagerExternalSyntheticLambda11 onExtraCallbackWithResult;
        private AudioRouting.OnRoutingChangedListener onNavigationEvent = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f$0.onNavigationEvent(audioRouting);
            }
        };

        public getInterfaceDescriptor(AudioTrack audioTrack, SelectionManagerExternalSyntheticLambda11 selectionManagerExternalSyntheticLambda11) {
            this.IAuthTabCallback = audioTrack;
            this.onExtraCallbackWithResult = selectionManagerExternalSyntheticLambda11;
            audioTrack.addOnRoutingChangedListener(this.onNavigationEvent, new Handler(Looper.myLooper()));
        }

        public void onNavigationEvent() {
            this.IAuthTabCallback.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent));
            this.onNavigationEvent = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onNavigationEvent(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.onNavigationEvent == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.onExtraCallbackWithResult.onNavigationEvent(routedDevice);
        }
    }

    final class IAuthTabCallback_Parcel {
        private final Handler IAuthTabCallback = new Handler(Looper.myLooper());
        private final AudioTrack.StreamEventCallback onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel() {
            this.onExtraCallbackWithResult = new AudioTrack.StreamEventCallback() { // from class: o.SelectionManagerExternalSyntheticLambda8.IAuthTabCallback_Parcel.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack, int i2) {
                    if (audioTrack.equals(SelectionManagerExternalSyntheticLambda8.this.access100) && SelectionManagerExternalSyntheticLambda8.this.postMessage != null && SelectionManagerExternalSyntheticLambda8.this.access200) {
                        SelectionManagerExternalSyntheticLambda8.this.postMessage.onExtraCallback();
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onPresentationEnded(AudioTrack audioTrack) {
                    if (audioTrack.equals(SelectionManagerExternalSyntheticLambda8.this.access100)) {
                        SelectionManagerExternalSyntheticLambda8.this.isEngagementSignalsApiAvailable = true;
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(SelectionManagerExternalSyntheticLambda8.this.access100) && SelectionManagerExternalSyntheticLambda8.this.postMessage != null && SelectionManagerExternalSyntheticLambda8.this.access200) {
                        SelectionManagerExternalSyntheticLambda8.this.postMessage.onExtraCallback();
                    }
                }
            };
        }

        public void onNavigationEvent(AudioTrack audioTrack) {
            Handler handler = this.IAuthTabCallback;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new CustomTabsClient$2$.ExternalSyntheticLambda3(handler), this.onExtraCallbackWithResult);
        }

        public void onWarmupCompleted(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.onExtraCallbackWithResult);
            this.IAuthTabCallback.removeCallbacksAndMessages(null);
        }
    }

    static final class asInterface {
        public final long onExtraCallback;
        public final AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onExtraCallbackWithResult;
        public final long onNavigationEvent;
        public long onWarmupCompleted;

        private asInterface(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, long j, long j2) {
            this.onExtraCallbackWithResult = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1;
            this.onExtraCallback = j;
            this.onNavigationEvent = j2;
        }
    }

    private static int onNavigationEvent(int i2, int i3, int i4) {
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i4);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(minBufferSize != -2);
        return minBufferSize;
    }

    final class access000 implements SelectionManagerExternalSyntheticLambda6.onNavigationEvent {
        private access000() {
        }

        @Override // o.SelectionManagerExternalSyntheticLambda6.onNavigationEvent
        public void IAuthTabCallback(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + SelectionManagerExternalSyntheticLambda8.this.writeTypedObject() + ", " + SelectionManagerExternalSyntheticLambda8.this.extraCallbackWithResult();
            if (SelectionManagerExternalSyntheticLambda8.onNavigationEvent) {
                throw new asBinder(str);
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultAudioSink", str);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda6.onNavigationEvent
        public void onWarmupCompleted(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + SelectionManagerExternalSyntheticLambda8.this.writeTypedObject() + ", " + SelectionManagerExternalSyntheticLambda8.this.extraCallbackWithResult();
            if (SelectionManagerExternalSyntheticLambda8.onNavigationEvent) {
                throw new asBinder(str);
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultAudioSink", str);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda6.onNavigationEvent
        public void onExtraCallbackWithResult(long j) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // o.SelectionManagerExternalSyntheticLambda6.onNavigationEvent
        public void onExtraCallback(long j) {
            if (SelectionManagerExternalSyntheticLambda8.this.postMessage != null) {
                SelectionManagerExternalSyntheticLambda8.this.postMessage.onWarmupCompleted(j);
            }
        }

        @Override // o.SelectionManagerExternalSyntheticLambda6.onNavigationEvent
        public void onNavigationEvent(int i2, long j) {
            if (SelectionManagerExternalSyntheticLambda8.this.postMessage != null) {
                SelectionManagerExternalSyntheticLambda8.this.postMessage.onExtraCallback(i2, j, SystemClock.elapsedRealtime() - SelectionManagerExternalSyntheticLambda8.this.newAuthTabSession);
            }
        }
    }

    static final class IAuthTabCallbackStub {
        public final boolean IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final int IAuthTabCallbackStub;
        public final int access000;
        public final int asBinder;
        public final int asInterface;
        public final boolean getInterfaceDescriptor;
        public final int onExtraCallback;
        public final boolean onExtraCallbackWithResult;
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent;
        public final int onTransact;
        public final HandwritingGestureApi34ExternalSyntheticLambda17 onWarmupCompleted;

        public IAuthTabCallbackStub(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda17, boolean z, boolean z2, boolean z3) {
            this.onNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.IAuthTabCallbackStub = i2;
            this.onTransact = i3;
            this.IAuthTabCallbackDefault = i4;
            this.access000 = i5;
            this.asInterface = i6;
            this.asBinder = i7;
            this.onExtraCallback = i8;
            this.onWarmupCompleted = handwritingGestureApi34ExternalSyntheticLambda17;
            this.onExtraCallbackWithResult = z;
            this.IAuthTabCallback = z2;
            this.getInterfaceDescriptor = z3;
        }

        public IAuthTabCallbackStub onExtraCallbackWithResult(int i2) {
            return new IAuthTabCallbackStub(this.onNavigationEvent, this.IAuthTabCallbackStub, this.onTransact, this.IAuthTabCallbackDefault, this.access000, this.asInterface, this.asBinder, i2, this.onWarmupCompleted, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.getInterfaceDescriptor);
        }

        public boolean onNavigationEvent(IAuthTabCallbackStub iAuthTabCallbackStub) {
            return iAuthTabCallbackStub.onTransact == this.onTransact && iAuthTabCallbackStub.asBinder == this.asBinder && iAuthTabCallbackStub.access000 == this.access000 && iAuthTabCallbackStub.asInterface == this.asInterface && iAuthTabCallbackStub.IAuthTabCallbackDefault == this.IAuthTabCallbackDefault && iAuthTabCallbackStub.onExtraCallbackWithResult == this.onExtraCallbackWithResult && iAuthTabCallbackStub.IAuthTabCallback == this.IAuthTabCallback;
        }

        public long onExtraCallbackWithResult(long j) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j, this.onNavigationEvent.prefetch);
        }

        public long onWarmupCompleted(long j) {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j, this.access000);
        }

        public SelectionManagerExternalSyntheticLambda2.IAuthTabCallback onExtraCallbackWithResult() {
            return new SelectionManagerExternalSyntheticLambda2.IAuthTabCallback(this.asBinder, this.access000, this.asInterface, this.getInterfaceDescriptor, this.onTransact == 1, this.onExtraCallback);
        }

        public boolean onExtraCallback() {
            return this.onTransact == 1;
        }
    }

    static final class IAuthTabCallbackStubProxy<T extends Exception> {
        private T IAuthTabCallback;
        private long onNavigationEvent = -9223372036854775807L;
        private long onExtraCallback = -9223372036854775807L;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void onExtraCallback(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.IAuthTabCallback == null) {
                this.IAuthTabCallback = t;
            }
            if (this.onNavigationEvent == -9223372036854775807L && !SelectionManagerExternalSyntheticLambda8.extraCallback()) {
                this.onNavigationEvent = 200 + jElapsedRealtime;
            }
            long j = this.onNavigationEvent;
            if (j != -9223372036854775807L && jElapsedRealtime >= j) {
                T t2 = this.IAuthTabCallback;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.IAuthTabCallback;
                IAuthTabCallback();
                throw t3;
            }
            this.onExtraCallback = jElapsedRealtime + 50;
        }

        public boolean onExtraCallback() {
            if (this.IAuthTabCallback == null) {
                return false;
            }
            return SelectionManagerExternalSyntheticLambda8.extraCallback() || SystemClock.elapsedRealtime() < this.onExtraCallback;
        }

        public void IAuthTabCallback() {
            this.IAuthTabCallback = null;
            this.onNavigationEvent = -9223372036854775807L;
            this.onExtraCallback = -9223372036854775807L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMessageChannelReady() {
        if (this.onExtraCallback >= 300000) {
            this.postMessage.onExtraCallbackWithResult();
            this.onExtraCallback = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onNavigationEvent(int i2) {
        int iIAuthTabCallback = DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.IAuthTabCallback(i2);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(iIAuthTabCallback != -2147483647);
        return iIAuthTabCallback;
    }

    private static String onNavigationEvent(@Nullable Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    static final class onNavigationEvent {
        public static void onExtraCallbackWithResult(AudioTrack audioTrack, @Nullable SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4) {
            audioTrack.setPreferredDevice(selectionManagerExternalSyntheticLambda4 == null ? null : selectionManagerExternalSyntheticLambda4.onExtraCallback);
        }

        public static long onExtraCallbackWithResult(AudioTrack audioTrack, IAuthTabCallbackStub iAuthTabCallbackStub) {
            if (iAuthTabCallbackStub.onTransact == 0) {
                return iAuthTabCallbackStub.onWarmupCompleted(audioTrack.getBufferSizeInFrames());
            }
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(audioTrack.getBufferSizeInFrames(), 1000000L, SelectionManagerExternalSyntheticLambda8.onNavigationEvent(iAuthTabCallbackStub.asBinder), RoundingMode.DOWN);
        }
    }

    static final class onWarmupCompleted {
        public static void onExtraCallbackWithResult(AudioTrack audioTrack, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
            LogSessionId logSessionIdNQ_ = selectionManagerExternalSyntheticLambda12.nQ_();
            if (logSessionIdNQ_.equals(SelectionAdjustmentKtExternalSyntheticLambda0.nC_())) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdNQ_);
        }
    }
}
