package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import o.TextFieldSelectionStateExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BottomNavigationKtExternalSyntheticLambda6 implements BottomDrawerStateCompanionExternalSyntheticLambda1, Loader.onExtraCallbackWithResult<onWarmupCompleted> {
    byte[] IAuthTabCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback IAuthTabCallbackDefault;
    final boolean IAuthTabCallbackStub;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 IAuthTabCallbackStubProxy;
    private final TextFieldSelectionStateExternalSyntheticLambda7 IAuthTabCallback_Parcel;
    private final ArrayList<IAuthTabCallback> access100 = new ArrayList<>();
    private final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback asBinder;
    private final TextFieldSelectionStateExternalSyntheticLambda12 asInterface;
    private final BottomSheetScaffoldKtExternalSyntheticLambda11 getInterfaceDescriptor;
    boolean onExtraCallback;
    final androidx.media3.exoplayer.upstream.Loader onExtraCallbackWithResult;
    int onNavigationEvent;
    private final long onTransact;
    final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;

    public void IAuthTabCallback(long j) {
    }

    public long IAuthTabCallbackStub() {
        return -9223372036854775807L;
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        return j;
    }

    public void onExtraCallback(long j, boolean z) {
    }

    public void onNavigationEvent() {
    }

    public BottomNavigationKtExternalSyntheticLambda6(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback, @Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, long j, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback, boolean z, @Nullable ReleasableExecutor releasableExecutor) {
        androidx.media3.exoplayer.upstream.Loader loader;
        this.asInterface = textFieldSelectionStateExternalSyntheticLambda12;
        this.IAuthTabCallbackDefault = onextracallback;
        this.IAuthTabCallback_Parcel = textFieldSelectionStateExternalSyntheticLambda7;
        this.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.onTransact = j;
        this.IAuthTabCallbackStubProxy = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.asBinder = bottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
        this.IAuthTabCallbackStub = z;
        this.getInterfaceDescriptor = new BottomSheetScaffoldKtExternalSyntheticLambda11(new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{basicTextContextMenuProviderKtExternalSyntheticLambda4}));
        if (releasableExecutor != null) {
            loader = new androidx.media3.exoplayer.upstream.Loader(releasableExecutor);
        } else {
            loader = new androidx.media3.exoplayer.upstream.Loader("SingleSampleMediaPeriod");
        }
        this.onExtraCallbackWithResult = loader;
    }

    public void IAuthTabCallbackDefault() {
        this.onExtraCallbackWithResult.onTransact();
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted.IAuthTabCallback(this);
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        return this.getInterfaceDescriptor;
    }

    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        for (int i2 = 0; i2 < colorsKtExternalSyntheticLambda0Arr.length; i2++) {
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 = bottomNavigationKtExternalSyntheticLambda5Arr[i2];
            if (bottomNavigationKtExternalSyntheticLambda5 != null && (colorsKtExternalSyntheticLambda0Arr[i2] == null || !zArr[i2])) {
                this.access100.remove(bottomNavigationKtExternalSyntheticLambda5);
                bottomNavigationKtExternalSyntheticLambda5Arr[i2] = null;
            }
            if (bottomNavigationKtExternalSyntheticLambda5Arr[i2] == null && colorsKtExternalSyntheticLambda0Arr[i2] != null) {
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
                this.access100.add(iAuthTabCallback);
                bottomNavigationKtExternalSyntheticLambda5Arr[i2] = iAuthTabCallback;
                zArr2[i2] = true;
            }
        }
        return j;
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        if (this.onExtraCallback || this.onExtraCallbackWithResult.onWarmupCompleted() || this.onExtraCallbackWithResult.onExtraCallback()) {
            return false;
        }
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0CreateDataSource = this.IAuthTabCallbackDefault.createDataSource();
        TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7 = this.IAuthTabCallback_Parcel;
        if (textFieldSelectionStateExternalSyntheticLambda7 != null) {
            textFieldSelectionStateExternalSyntheticLambda0CreateDataSource.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
        }
        this.onExtraCallbackWithResult.onWarmupCompleted(new onWarmupCompleted(this.asInterface, textFieldSelectionStateExternalSyntheticLambda0CreateDataSource), this, this.IAuthTabCallbackStubProxy.IAuthTabCallback(1));
        return true;
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    public long onExtraCallback() {
        return (this.onExtraCallback || this.onExtraCallbackWithResult.onWarmupCompleted()) ? Long.MIN_VALUE : 0L;
    }

    public long onWarmupCompleted() {
        return this.onExtraCallback ? Long.MIN_VALUE : 0L;
    }

    public long onExtraCallbackWithResult(long j) {
        for (int i2 = 0; i2 < this.access100.size(); i2++) {
            this.access100.get(i2).onExtraCallback();
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    public void onWarmupCompleted(onWarmupCompleted onwarmupcompleted, long j, long j2, int i2) {
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0;
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = onwarmupcompleted.IAuthTabCallback;
        if (i2 == 0) {
            badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, j);
        } else {
            badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
        }
        this.asBinder.onExtraCallback(badgeKtExternalSyntheticLambda0, 1, -1, this.onWarmupCompleted, 0, null, 0L, this.onTransact, i2);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, long j, long j2) {
        this.onNavigationEvent = (int) onwarmupcompleted.IAuthTabCallback.onNavigationEvent();
        this.IAuthTabCallback = (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onwarmupcompleted.onExtraCallback);
        this.onExtraCallback = true;
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = onwarmupcompleted.IAuthTabCallback;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, this.onNavigationEvent);
        long j3 = onwarmupcompleted.onWarmupCompleted;
        this.asBinder.IAuthTabCallback(badgeKtExternalSyntheticLambda0, 1, -1, this.onWarmupCompleted, 0, null, 0L, this.onTransact);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(onWarmupCompleted onwarmupcompleted, long j, long j2, boolean z) {
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = onwarmupcompleted.IAuthTabCallback;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
        long j3 = onwarmupcompleted.onWarmupCompleted;
        this.asBinder.onNavigationEvent(badgeKtExternalSyntheticLambda0, 1, -1, null, 0, null, 0L, this.onTransact);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Loader.IAuthTabCallback onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, long j, long j2, IOException iOException, int i2) {
        Loader.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6 = onwarmupcompleted.IAuthTabCallback;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, textFieldSelectionStateExternalSyntheticLambda6.IAuthTabCallback(), textFieldSelectionStateExternalSyntheticLambda6.asBinder(), j, j2, textFieldSelectionStateExternalSyntheticLambda6.onNavigationEvent());
        long jOnWarmupCompleted = this.IAuthTabCallbackStubProxy.onWarmupCompleted(new ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(1, -1, this.onWarmupCompleted, 0, null, 0L, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.onTransact)), iOException, i2));
        boolean z = jOnWarmupCompleted == -9223372036854775807L || i2 >= this.IAuthTabCallbackStubProxy.IAuthTabCallback(1);
        if (this.IAuthTabCallbackStub && z) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.onExtraCallback = true;
            iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.IAuthTabCallback;
        } else if (jOnWarmupCompleted != -9223372036854775807L) {
            iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallback(false, jOnWarmupCompleted);
        } else {
            iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult;
        }
        Loader.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
        boolean zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
        this.asBinder.IAuthTabCallback(badgeKtExternalSyntheticLambda0, 1, -1, this.onWarmupCompleted, 0, null, 0L, this.onTransact, iOException, !zOnExtraCallbackWithResult);
        if (!zOnExtraCallbackWithResult) {
            long j3 = onwarmupcompleted.onWarmupCompleted;
        }
        return iAuthTabCallback;
    }

    final class IAuthTabCallback implements BottomNavigationKtExternalSyntheticLambda5 {
        private int onExtraCallback;
        private boolean onWarmupCompleted;

        private IAuthTabCallback() {
        }

        public void onExtraCallback() {
            if (this.onExtraCallback == 2) {
                this.onExtraCallback = 1;
            }
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public boolean onWarmupCompleted() {
            return BottomNavigationKtExternalSyntheticLambda6.this.onExtraCallback;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public void onExtraCallbackWithResult() throws IOException {
            BottomNavigationKtExternalSyntheticLambda6 bottomNavigationKtExternalSyntheticLambda6 = BottomNavigationKtExternalSyntheticLambda6.this;
            if (bottomNavigationKtExternalSyntheticLambda6.IAuthTabCallbackStub) {
                return;
            }
            bottomNavigationKtExternalSyntheticLambda6.onExtraCallbackWithResult.IAuthTabCallback();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
            onNavigationEvent();
            BottomNavigationKtExternalSyntheticLambda6 bottomNavigationKtExternalSyntheticLambda6 = BottomNavigationKtExternalSyntheticLambda6.this;
            boolean z = bottomNavigationKtExternalSyntheticLambda6.onExtraCallback;
            if (z && bottomNavigationKtExternalSyntheticLambda6.IAuthTabCallback == null) {
                this.onExtraCallback = 2;
            }
            int i3 = this.onExtraCallback;
            if (i3 == 2) {
                selectionControllerExternalSyntheticLambda2.onWarmupCompleted(4);
                return -4;
            }
            if ((i2 & 2) != 0 || i3 == 0) {
                androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted = bottomNavigationKtExternalSyntheticLambda6.onWarmupCompleted;
                this.onExtraCallback = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            byte[] bArr = bottomNavigationKtExternalSyntheticLambda6.IAuthTabCallback;
            selectionControllerExternalSyntheticLambda2.onWarmupCompleted(1);
            selectionControllerExternalSyntheticLambda2.onWarmupCompleted = 0L;
            if ((i2 & 4) == 0) {
                selectionControllerExternalSyntheticLambda2.IAuthTabCallback(BottomNavigationKtExternalSyntheticLambda6.this.onNavigationEvent);
                ByteBuffer byteBuffer = selectionControllerExternalSyntheticLambda2.onExtraCallback;
                BottomNavigationKtExternalSyntheticLambda6 bottomNavigationKtExternalSyntheticLambda62 = BottomNavigationKtExternalSyntheticLambda6.this;
                byteBuffer.put(bottomNavigationKtExternalSyntheticLambda62.IAuthTabCallback, 0, bottomNavigationKtExternalSyntheticLambda62.onNavigationEvent);
            }
            if ((i2 & 1) == 0) {
                this.onExtraCallback = 2;
            }
            return -4;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onExtraCallbackWithResult(long j) {
            onNavigationEvent();
            if (j <= 0 || this.onExtraCallback == 2) {
                return 0;
            }
            this.onExtraCallback = 2;
            return 1;
        }

        private void onNavigationEvent() {
            if (this.onWarmupCompleted) {
                return;
            }
            BottomNavigationKtExternalSyntheticLambda6.this.asBinder.onNavigationEvent(AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(BottomNavigationKtExternalSyntheticLambda6.this.onWarmupCompleted.isEngagementSignalsApiAvailable), BottomNavigationKtExternalSyntheticLambda6.this.onWarmupCompleted, 0, (Object) null, 0L);
            this.onWarmupCompleted = true;
        }
    }

    static final class onWarmupCompleted implements Loader.onNavigationEvent {
        private final TextFieldSelectionStateExternalSyntheticLambda6 IAuthTabCallback;
        private byte[] onExtraCallback;
        public final TextFieldSelectionStateExternalSyntheticLambda12 onNavigationEvent;
        public final long onWarmupCompleted = BadgeKtExternalSyntheticLambda0.onExtraCallback();

        @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
        public void IAuthTabCallback() {
        }

        public onWarmupCompleted(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0) {
            this.onNavigationEvent = textFieldSelectionStateExternalSyntheticLambda12;
            this.IAuthTabCallback = new TextFieldSelectionStateExternalSyntheticLambda6(textFieldSelectionStateExternalSyntheticLambda0);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
        public void IAuthTabCallbackDefault() throws IOException {
            int iOnNavigationEvent;
            TextFieldSelectionStateExternalSyntheticLambda6 textFieldSelectionStateExternalSyntheticLambda6;
            byte[] bArr;
            this.IAuthTabCallback.IAuthTabCallbackStub();
            try {
                this.IAuthTabCallback.onNavigationEvent(this.onNavigationEvent);
                do {
                    iOnNavigationEvent = (int) this.IAuthTabCallback.onNavigationEvent();
                    byte[] bArr2 = this.onExtraCallback;
                    if (bArr2 == null) {
                        this.onExtraCallback = new byte[1024];
                    } else if (iOnNavigationEvent == bArr2.length) {
                        this.onExtraCallback = Arrays.copyOf(bArr2, bArr2.length << 1);
                    }
                    textFieldSelectionStateExternalSyntheticLambda6 = this.IAuthTabCallback;
                    bArr = this.onExtraCallback;
                } while (textFieldSelectionStateExternalSyntheticLambda6.onWarmupCompleted(bArr, iOnNavigationEvent, bArr.length - iOnNavigationEvent) != -1);
            } finally {
                TextFieldSelectionStateExternalSyntheticLambda5.IAuthTabCallback(this.IAuthTabCallback);
            }
        }
    }
}
