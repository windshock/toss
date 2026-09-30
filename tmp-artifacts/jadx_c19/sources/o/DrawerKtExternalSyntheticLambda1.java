package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda4;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9;
import o.DrawerKtExternalSyntheticLambda1;
import o.DrawerKtExternalSyntheticLambda14;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda1 implements CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onExtraCallbackWithResult {
    private static final Executor IAuthTabCallback = new Executor() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            DrawerKtExternalSyntheticLambda1.onExtraCallback(runnable);
        }
    };
    private final DrawerKtExternalSyntheticLambda14 IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final CopyOnWriteArraySet<onWarmupCompleted> IAuthTabCallbackStubProxy;
    private final SparseArray<onNavigationEvent> IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9 ICustomTabsCallbackDefault;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent ICustomTabsCallbackStub;
    private long access000;
    private boolean access100;
    private final boolean asBinder;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda16 asInterface;
    private int extraCallback;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda26<asBinder> extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private int onActivityLayout;
    private int onActivityResized;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda5 onExtraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onExtraCallbackWithResult;
    private final DrawerKtExternalSyntheticLambda14.IAuthTabCallback onMessageChannelReady;
    private boolean onMinimized;
    private final Context onNavigationEvent;
    private DrawerKtExternalSyntheticLambda0 onPostMessage;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onRelationshipValidationResult;
    private Pair<Surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25> onTransact;
    private ImmutableList<Object> onWarmupCompleted;
    private int readTypedObject;
    private int writeTypedObject;

    public interface onWarmupCompleted {
        default void IAuthTabCallback_Parcel() {
        }

        default void access100() {
        }

        default void onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda2) {
        }

        default void onWarmupCompleted(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
        }
    }

    public static /* synthetic */ void onExtraCallback(Runnable runnable) {
    }

    public static final class onExtraCallbackWithResult {
        private boolean IAuthTabCallback;
        private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent IAuthTabCallbackStub;
        private final DrawerKtExternalSyntheticLambda10 asBinder;
        private boolean onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private final Context onNavigationEvent;
        private TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda0.onNavigationEvent;

        public onExtraCallbackWithResult(Context context, DrawerKtExternalSyntheticLambda10 drawerKtExternalSyntheticLambda10) {
            this.onNavigationEvent = context.getApplicationContext();
            this.asBinder = drawerKtExternalSyntheticLambda10;
        }

        public onExtraCallbackWithResult onWarmupCompleted(boolean z) {
            this.IAuthTabCallback = z;
            return this;
        }

        public onExtraCallbackWithResult onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
            this.onWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
            return this;
        }

        public DrawerKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onExtraCallback);
            if (this.IAuthTabCallbackStub == null) {
                this.IAuthTabCallbackStub = new IAuthTabCallbackStub(this.onExtraCallbackWithResult);
            }
            DrawerKtExternalSyntheticLambda1 drawerKtExternalSyntheticLambda1 = new DrawerKtExternalSyntheticLambda1(this);
            this.onExtraCallback = true;
            return drawerKtExternalSyntheticLambda1;
        }
    }

    private DrawerKtExternalSyntheticLambda1(onExtraCallbackWithResult onextracallbackwithresult) {
        this.onNavigationEvent = onextracallbackwithresult.onNavigationEvent;
        this.extraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();
        this.ICustomTabsCallbackStub = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent) RecordingInputConnection_androidKt.onWarmupCompleted(onextracallbackwithresult.IAuthTabCallbackStub);
        this.IAuthTabCallback_Parcel = new SparseArray<>();
        this.onWarmupCompleted = ImmutableList.of();
        this.onExtraCallback = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda5.IAuthTabCallback;
        this.asBinder = onextracallbackwithresult.IAuthTabCallback;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0 = onextracallbackwithresult.onWarmupCompleted;
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault = new DismissStateExternalSyntheticLambda0(onextracallbackwithresult.asBinder, textFieldDecoratorModifierNodeExternalSyntheticLambda0);
        this.onMessageChannelReady = new DrawerKtExternalSyntheticLambda14.IAuthTabCallback() { // from class: o.DrawerKtExternalSyntheticLambda1.2
            @Override // o.DrawerKtExternalSyntheticLambda14.IAuthTabCallback
            public void onExtraCallback(long j) {
            }

            @Override // o.DrawerKtExternalSyntheticLambda14.IAuthTabCallback
            public void IAuthTabCallback() {
            }
        };
        this.IAuthTabCallbackStubProxy = new CopyOnWriteArraySet<>();
        this.onRelationshipValidationResult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent();
        this.ICustomTabsCallback = -9223372036854775807L;
        this.access000 = -9223372036854775807L;
        this.IAuthTabCallbackStub = -9223372036854775807L;
        this.onActivityLayout = -1;
        this.onActivityResized = 0;
    }

    public void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallbackStubProxy.add(onwarmupcompleted);
    }

    public void onWarmupCompleted(int i2) {
        this.onActivityLayout = i2;
    }

    public DrawerKtExternalSyntheticLambda14 onNavigationEvent(int i2) {
        if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallback_Parcel, i2)) {
            return this.IAuthTabCallback_Parcel.get(i2);
        }
        onNavigationEvent onnavigationevent = new onNavigationEvent(this.onNavigationEvent, i2);
        if (i2 == 0) {
            onExtraCallbackWithResult(onnavigationevent);
        }
        this.IAuthTabCallback_Parcel.put(i2, onnavigationevent);
        return onnavigationevent;
    }

    public void onExtraCallback(Surface surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25) {
        Pair<Surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25> pair = this.onTransact;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((TextFieldDecoratorModifierNodeExternalSyntheticLambda25) this.onTransact.second).equals(textFieldDecoratorModifierNodeExternalSyntheticLambda25)) {
            return;
        }
        this.onTransact = Pair.create(surface, textFieldDecoratorModifierNodeExternalSyntheticLambda25);
        onWarmupCompleted(surface, textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult(), textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallback());
    }

    public void onWarmupCompleted() {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25 = TextFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult;
        onWarmupCompleted(null, textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult(), textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallback());
        this.onTransact = null;
    }

    public void onNavigationEvent() {
        this.IAuthTabCallbackDefault.onTransact();
    }

    public void onExtraCallback() {
        this.IAuthTabCallbackDefault.asBinder();
    }

    public void onExtraCallbackWithResult() {
        if (this.onActivityResized == 2) {
            return;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16 = this.asInterface;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda16 != null) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda16.onExtraCallbackWithResult((Object) null);
        }
        this.onTransact = null;
        this.onActivityResized = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) throws DrawerKtExternalSyntheticLambda14.onNavigationEvent {
        if (i2 == 0) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onActivityResized == 0);
            TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact);
            try {
                if (this.onMinimized) {
                    textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent;
                } else if (textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallbackStub == 7 && Build.VERSION.SDK_INT < 34 && TextFieldDecoratorModifierNodeExternalSyntheticLambda12.asBinder()) {
                    textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted = textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback().onExtraCallbackWithResult(6).IAuthTabCallback();
                } else if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted(textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallbackStub) && Build.VERSION.SDK_INT >= 29) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PlaybackVidGraphWrapper", TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", new Object[]{Integer.valueOf(textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallbackStub)}));
                    textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent;
                }
                TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1 = textToolbarHelperApi28ExternalSyntheticLambda1OnWarmupCompleted;
                final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted((Looper) RecordingInputConnection_androidKt.onWarmupCompleted(Looper.myLooper()), (Handler.Callback) null);
                this.asInterface = textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted;
                try {
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent onnavigationevent = this.ICustomTabsCallbackStub;
                    Context context = this.onNavigationEvent;
                    BasicTextContextMenuProviderExternalSyntheticLambda1 basicTextContextMenuProviderExternalSyntheticLambda1 = BasicTextContextMenuProviderExternalSyntheticLambda1.onExtraCallback;
                    Objects.requireNonNull(textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted);
                    this.ICustomTabsCallbackDefault = onnavigationevent.IAuthTabCallback(context, textToolbarHelperApi28ExternalSyntheticLambda1, basicTextContextMenuProviderExternalSyntheticLambda1, this, new Executor() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda16OnWarmupCompleted.onNavigationEvent(runnable);
                        }
                    }, 0L, false);
                    Pair<Surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25> pair = this.onTransact;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25 = (TextFieldDecoratorModifierNodeExternalSyntheticLambda25) pair.second;
                        onWarmupCompleted(surface, textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallbackWithResult(), textFieldDecoratorModifierNodeExternalSyntheticLambda25.onExtraCallback());
                    }
                    this.IAuthTabCallbackDefault.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                    DrawerKtExternalSyntheticLambda14 drawerKtExternalSyntheticLambda14 = this.IAuthTabCallbackDefault;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
                    final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 textFieldDecoratorModifierNodeExternalSyntheticLambda16 = this.asInterface;
                    Objects.requireNonNull(textFieldDecoratorModifierNodeExternalSyntheticLambda16);
                    drawerKtExternalSyntheticLambda14.onNavigationEvent(iAuthTabCallback, new Executor() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda16.onNavigationEvent(runnable);
                        }
                    });
                    this.onActivityResized = 1;
                } catch (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 e) {
                    throw new DrawerKtExternalSyntheticLambda14.onNavigationEvent(e, basicTextContextMenuProviderKtExternalSyntheticLambda4);
                }
            } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted e2) {
                throw new DrawerKtExternalSyntheticLambda14.onNavigationEvent(e2, basicTextContextMenuProviderKtExternalSyntheticLambda4);
            }
        } else if (!asInterface()) {
            return false;
        }
        try {
            this.extraCallback++;
            return true;
        } catch (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 e3) {
            throw new DrawerKtExternalSyntheticLambda14.onNavigationEvent(e3, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
    }

    private boolean asInterface() {
        return this.onActivityResized == 1;
    }

    private void onWarmupCompleted(@Nullable Surface surface, int i2, int i3) {
        if (this.ICustomTabsCallbackDefault == null) {
            return;
        }
        if (surface != null) {
            new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0(surface, i2, i3);
            this.IAuthTabCallbackDefault.IAuthTabCallback(surface, new TextFieldDecoratorModifierNodeExternalSyntheticLambda25(i2, i3));
        } else {
            this.IAuthTabCallbackDefault.onNavigationEvent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onNavigationEvent(boolean z) {
        return this.IAuthTabCallbackDefault.onExtraCallback(z && this.readTypedObject == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback_Parcel() {
        this.IAuthTabCallbackDefault.asInterface();
        this.access100 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IAuthTabCallbackStub() {
        return this.readTypedObject == 0 && this.access100 && this.IAuthTabCallbackDefault.onWarmupCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(long j, long j2) throws DrawerKtExternalSyntheticLambda14.onNavigationEvent {
        this.IAuthTabCallbackDefault.onWarmupCompleted(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(boolean z) {
        if (asInterface()) {
            this.readTypedObject++;
            this.IAuthTabCallbackDefault.onNavigationEvent(z);
            while (this.extraCallbackWithResult.onWarmupCompleted() > 1) {
                this.extraCallbackWithResult.onExtraCallback();
            }
            if (this.extraCallbackWithResult.onWarmupCompleted() == 1) {
                asBinder asbinder = (asBinder) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult.onExtraCallback());
                this.ICustomTabsCallback = asbinder.onNavigationEvent;
                this.writeTypedObject = asbinder.onExtraCallback;
                IAuthTabCallbackDefault();
            }
            this.access000 = -9223372036854775807L;
            this.IAuthTabCallbackStub = -9223372036854775807L;
            this.access100 = false;
            ((TextFieldDecoratorModifierNodeExternalSyntheticLambda16) RecordingInputConnection_androidKt.onWarmupCompleted(this.asInterface)).onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DrawerKtExternalSyntheticLambda1.onNavigationEvent(this.f$0);
                }
            });
        }
    }

    public static /* synthetic */ void onNavigationEvent(DrawerKtExternalSyntheticLambda1 drawerKtExternalSyntheticLambda1) {
        drawerKtExternalSyntheticLambda1.readTypedObject--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(boolean z) {
        this.IAuthTabCallbackDefault.IAuthTabCallback(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void asBinder() {
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0) {
        this.onPostMessage = drawerKtExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault.onNavigationEvent(drawerKtExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(float f) {
        this.IAuthTabCallbackDefault.onWarmupCompleted(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(int i2) {
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onTransact() {
        int i2 = this.onActivityLayout;
        return i2 != -1 && i2 == this.extraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextToolbarHelperApi28ExternalSyntheticLambda1 onWarmupCompleted(@Nullable TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1) {
        return (textToolbarHelperApi28ExternalSyntheticLambda1 == null || !textToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult() || this.getInterfaceDescriptor) ? TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent : textToolbarHelperApi28ExternalSyntheticLambda1;
    }

    private void IAuthTabCallbackDefault() {
        this.IAuthTabCallbackDefault.IAuthTabCallback(1, this.onRelationshipValidationResult, this.ICustomTabsCallback, this.writeTypedObject, ImmutableList.of());
    }

    public final class onNavigationEvent implements DrawerKtExternalSyntheticLambda14, onWarmupCompleted {
        private boolean IAuthTabCallbackDefault;
        private boolean IAuthTabCallbackStub;
        private final int access000;
        private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallback;
        private long onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private int onWarmupCompleted;
        private ImmutableList<Object> getInterfaceDescriptor = ImmutableList.of();
        private long asBinder = -9223372036854775807L;
        private DrawerKtExternalSyntheticLambda14.onExtraCallback asInterface = DrawerKtExternalSyntheticLambda14.onExtraCallback.onWarmupCompleted;
        private Executor onTransact = DrawerKtExternalSyntheticLambda1.IAuthTabCallback;

        public onNavigationEvent(Context context, int i2) {
            this.onNavigationEvent = i2;
            this.access000 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(context);
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onTransact() {
            if (DrawerKtExternalSyntheticLambda1.this.asBinder) {
                DrawerKtExternalSyntheticLambda1.this.onNavigationEvent();
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void asBinder() {
            if (DrawerKtExternalSyntheticLambda1.this.asBinder) {
                DrawerKtExternalSyntheticLambda1.this.onExtraCallback();
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onNavigationEvent(DrawerKtExternalSyntheticLambda14.onExtraCallback onextracallback, Executor executor) {
            this.asInterface = onextracallback;
            this.onTransact = executor;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws DrawerKtExternalSyntheticLambda14.onNavigationEvent {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!onExtraCallback());
            boolean zOnWarmupCompleted = DrawerKtExternalSyntheticLambda1.this.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4, this.onNavigationEvent);
            this.IAuthTabCallbackStub = zOnWarmupCompleted;
            return zOnWarmupCompleted;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public boolean onExtraCallback() {
            return this.IAuthTabCallbackStub;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void IAuthTabCallbackStub() {
            if (onExtraCallback()) {
                boolean z = this.IAuthTabCallbackDefault;
                long j = DrawerKtExternalSyntheticLambda1.this.access000;
                DrawerKtExternalSyntheticLambda1.this.IAuthTabCallback(false);
                DrawerKtExternalSyntheticLambda1.this.access000 = j;
                if (z) {
                    asInterface();
                }
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onNavigationEvent(boolean z) {
            if (onExtraCallback()) {
            }
            this.asBinder = -9223372036854775807L;
            DrawerKtExternalSyntheticLambda1.this.IAuthTabCallback(z);
            this.IAuthTabCallbackDefault = false;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public boolean onExtraCallback(boolean z) {
            return DrawerKtExternalSyntheticLambda1.this.onNavigationEvent(z && onExtraCallback());
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void asInterface() {
            DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStub = this.asBinder;
            if (DrawerKtExternalSyntheticLambda1.this.access000 >= DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStub) {
                DrawerKtExternalSyntheticLambda1.this.IAuthTabCallback_Parcel();
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public boolean onWarmupCompleted() {
            return onExtraCallback() && DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStub();
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void IAuthTabCallback(int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, long j, int i3, List<Object> list) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(onExtraCallback());
            this.getInterfaceDescriptor = ImmutableList.copyOf(list);
            this.onWarmupCompleted = i2;
            this.onExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStub = -9223372036854775807L;
            DrawerKtExternalSyntheticLambda1.this.access100 = false;
            IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            boolean z = this.asBinder == -9223372036854775807L;
            if (DrawerKtExternalSyntheticLambda1.this.asBinder || (this.onNavigationEvent == 0 && z)) {
                long j2 = z ? -4611686018427387904L : this.asBinder + 1;
                DrawerKtExternalSyntheticLambda1.this.extraCallbackWithResult.onWarmupCompleted(j2, new asBinder(this.onExtraCallbackWithResult + j, i3, j2));
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onExtraCallbackWithResult() {
            if (DrawerKtExternalSyntheticLambda1.this.extraCallbackWithResult.onWarmupCompleted() == 0) {
                DrawerKtExternalSyntheticLambda1.this.asBinder();
                return;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda26 textFieldDecoratorModifierNodeExternalSyntheticLambda26 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26();
            boolean z = true;
            while (DrawerKtExternalSyntheticLambda1.this.extraCallbackWithResult.onWarmupCompleted() > 0) {
                asBinder asbinder = (asBinder) RecordingInputConnection_androidKt.onExtraCallbackWithResult((asBinder) DrawerKtExternalSyntheticLambda1.this.extraCallbackWithResult.onExtraCallback());
                if (z) {
                    int i2 = asbinder.onExtraCallback;
                    if (i2 != 0 && i2 != 1) {
                        DrawerKtExternalSyntheticLambda1.this.asBinder();
                    } else {
                        asbinder = new asBinder(asbinder.onNavigationEvent, 0, asbinder.onWarmupCompleted);
                    }
                    z = false;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda26.onWarmupCompleted(asbinder.onWarmupCompleted, asbinder);
            }
            DrawerKtExternalSyntheticLambda1.this.extraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda26;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public Surface IAuthTabCallback() {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(onExtraCallback());
            return ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9) RecordingInputConnection_androidKt.onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda1.this.ICustomTabsCallbackDefault)).onWarmupCompleted(this.onNavigationEvent);
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onNavigationEvent(DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0) {
            if (this.onNavigationEvent == 0) {
                DrawerKtExternalSyntheticLambda1.this.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda0);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onWarmupCompleted(float f) {
            if (this.onNavigationEvent == 0) {
                DrawerKtExternalSyntheticLambda1.this.onWarmupCompleted(f);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void IAuthTabCallback(List<Object> list) {
            if (this.getInterfaceDescriptor.equals(list)) {
                return;
            }
            this.getInterfaceDescriptor = ImmutableList.copyOf(list);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onExtraCallback;
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null) {
                IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onNavigationEvent(long j) {
            this.onExtraCallbackWithResult = j;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void IAuthTabCallback(Surface surface, TextFieldDecoratorModifierNodeExternalSyntheticLambda25 textFieldDecoratorModifierNodeExternalSyntheticLambda25) {
            DrawerKtExternalSyntheticLambda1.this.onExtraCallback(surface, textFieldDecoratorModifierNodeExternalSyntheticLambda25);
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onNavigationEvent() {
            DrawerKtExternalSyntheticLambda1.this.onWarmupCompleted();
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onExtraCallbackWithResult(int i2) {
            if (this.onNavigationEvent == 0) {
                DrawerKtExternalSyntheticLambda1.this.onExtraCallbackWithResult(i2);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public boolean IAuthTabCallback(long j, DrawerKtExternalSyntheticLambda14.IAuthTabCallback iAuthTabCallback) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(onExtraCallback());
            if (!DrawerKtExternalSyntheticLambda1.this.onTransact() || ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9) RecordingInputConnection_androidKt.onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda1.this.ICustomTabsCallbackDefault)).onExtraCallback(this.onNavigationEvent) >= this.access000 || !((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9) RecordingInputConnection_androidKt.onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda1.this.ICustomTabsCallbackDefault)).onExtraCallbackWithResult(this.onNavigationEvent)) {
                return false;
            }
            long j2 = j + this.onExtraCallbackWithResult;
            this.asBinder = j2;
            iAuthTabCallback.onExtraCallback(j2 * 1000);
            return true;
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void onWarmupCompleted(long j, long j2) throws DrawerKtExternalSyntheticLambda14.onNavigationEvent {
            DrawerKtExternalSyntheticLambda1.this.onWarmupCompleted(j + this.onExtraCallbackWithResult, j2);
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void IAuthTabCallback(boolean z) {
            if (DrawerKtExternalSyntheticLambda1.this.asBinder) {
                DrawerKtExternalSyntheticLambda1.this.onExtraCallbackWithResult(z);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14
        public void IAuthTabCallbackDefault() {
            DrawerKtExternalSyntheticLambda1.this.onExtraCallbackWithResult();
        }

        @Override // o.DrawerKtExternalSyntheticLambda1.onWarmupCompleted
        public void access100() {
            final DrawerKtExternalSyntheticLambda14.onExtraCallback onextracallback = this.asInterface;
            Executor executor = this.onTransact;
            Objects.requireNonNull(onextracallback);
            executor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    onextracallback.onNavigationEvent();
                }
            });
        }

        @Override // o.DrawerKtExternalSyntheticLambda1.onWarmupCompleted
        public void IAuthTabCallback_Parcel() {
            final DrawerKtExternalSyntheticLambda14.onExtraCallback onextracallback = this.asInterface;
            Executor executor = this.onTransact;
            Objects.requireNonNull(onextracallback);
            executor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    onextracallback.onWarmupCompleted();
                }
            });
        }

        @Override // o.DrawerKtExternalSyntheticLambda1.onWarmupCompleted
        public void onWarmupCompleted(final CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            final DrawerKtExternalSyntheticLambda14.onExtraCallback onextracallback = this.asInterface;
            this.onTransact.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    onextracallback.IAuthTabCallback(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
                }
            });
        }

        @Override // o.DrawerKtExternalSyntheticLambda1.onWarmupCompleted
        public void onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda2) {
            this.onTransact.execute(new PlaybackVideoGraphWrapper$InputVideoSink$.ExternalSyntheticLambda0(this, this.asInterface, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda2));
        }

        private void IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onExtraCallback(DrawerKtExternalSyntheticLambda1.this.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact)).onNavigationEvent();
        }
    }

    final class IAuthTabCallback implements DrawerKtExternalSyntheticLambda14.onExtraCallback {
        private IAuthTabCallback() {
        }

        @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
        public void onNavigationEvent() {
            Iterator it = DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStubProxy.iterator();
            while (it.hasNext()) {
                ((onWarmupCompleted) it.next()).access100();
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
        public void onWarmupCompleted() {
            Iterator it = DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStubProxy.iterator();
            while (it.hasNext()) {
                ((onWarmupCompleted) it.next()).IAuthTabCallback_Parcel();
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
        public void IAuthTabCallback(CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
            Iterator it = DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStubProxy.iterator();
            while (it.hasNext()) {
                ((onWarmupCompleted) it.next()).onWarmupCompleted(cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
            }
        }

        @Override // o.DrawerKtExternalSyntheticLambda14.onExtraCallback
        public void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda14.onNavigationEvent onnavigationevent) {
            Iterator it = DrawerKtExternalSyntheticLambda1.this.IAuthTabCallbackStubProxy.iterator();
            while (it.hasNext()) {
                ((onWarmupCompleted) it.next()).onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2.onExtraCallback(onnavigationevent));
            }
        }
    }

    static final class asBinder {
        public final int onExtraCallback;
        public final long onNavigationEvent;
        public final long onWarmupCompleted;

        public asBinder(long j, int i2, long j2) {
            this.onNavigationEvent = j;
            this.onExtraCallback = i2;
            this.onWarmupCompleted = j2;
        }
    }

    static final class IAuthTabCallbackStub implements CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent {
        private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda4.IAuthTabCallback onExtraCallbackWithResult;

        public IAuthTabCallbackStub(boolean z) {
            this.onExtraCallbackWithResult = new onExtraCallback(z);
        }

        @Override // o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9 IAuthTabCallback(Context context, TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1, BasicTextContextMenuProviderExternalSyntheticLambda1 basicTextContextMenuProviderExternalSyntheticLambda1, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult, Executor executor, long j, boolean z) {
            try {
                try {
                    return ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda9.onNavigationEvent) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda4.IAuthTabCallback.class).newInstance(this.onExtraCallbackWithResult)).IAuthTabCallback(context, textToolbarHelperApi28ExternalSyntheticLambda1, basicTextContextMenuProviderExternalSyntheticLambda1, onextracallbackwithresult, executor, j, z);
                } catch (Exception e) {
                    e = e;
                    throw new IllegalStateException(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    public static final class onExtraCallback implements CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda4.IAuthTabCallback {
        private static final Supplier<Class<?>> IAuthTabCallback = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$ReflectiveDefaultVideoFrameProcessorFactory$$ExternalSyntheticLambda0
            public final Object get() {
                return DrawerKtExternalSyntheticLambda1.onExtraCallback.onWarmupCompleted();
            }
        });
        private final boolean onExtraCallbackWithResult;

        public static /* synthetic */ Class onWarmupCompleted() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        public onExtraCallback(boolean z) {
            this.onExtraCallbackWithResult = z;
        }
    }
}
