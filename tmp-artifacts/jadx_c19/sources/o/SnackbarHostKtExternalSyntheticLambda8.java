package o;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.RippleKtExternalSyntheticLambda0;
import o.SnackbarHostKtExternalSyntheticLambda8;
import o.SnackbarKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarHostKtExternalSyntheticLambda8 implements DrawerStateExternalSyntheticLambda0 {

    @Deprecated
    public static final DrawerStateExternalSyntheticLambda2 onWarmupCompleted = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ts.TsExtractor$$ExternalSyntheticLambda1
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return SnackbarHostKtExternalSyntheticLambda8.onExtraCallback();
        }
    };
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final List<TextFieldDecoratorModifierNodeExternalSyntheticLambda24> IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private final SparseBooleanArray ICustomTabsCallback;
    private int access000;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback access100;
    private final SnackbarKtExternalSyntheticLambda3.onWarmupCompleted asBinder;
    private SnackbarKtExternalSyntheticLambda3 asInterface;
    private final int extraCallback;
    private final SparseBooleanArray extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onActivityResized;
    private final int onExtraCallback;
    private final SnackbarKtExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final SparseArray<SnackbarKtExternalSyntheticLambda3> onMessageChannelReady;
    private final SparseIntArray onNavigationEvent;
    private DrawerStateExternalSyntheticLambda1 onTransact;
    private SnackbarKtExternalSyntheticLambda0 readTypedObject;
    private boolean writeTypedObject;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    static /* synthetic */ int onWarmupCompleted(SnackbarHostKtExternalSyntheticLambda8 snackbarHostKtExternalSyntheticLambda8) {
        int i2 = snackbarHostKtExternalSyntheticLambda8.access000;
        snackbarHostKtExternalSyntheticLambda8.access000 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onWarmupCompleted(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        return new DrawerStateExternalSyntheticLambda0[]{new SnackbarHostKtExternalSyntheticLambda8(onextracallback)};
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onExtraCallback() {
        return new DrawerStateExternalSyntheticLambda0[]{new SnackbarHostKtExternalSyntheticLambda8(1, RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback)};
    }

    @Deprecated
    public SnackbarHostKtExternalSyntheticLambda8() {
        this(1, 1, RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0L), new SliderKtExternalSyntheticLambda20(0), 112800);
    }

    public SnackbarHostKtExternalSyntheticLambda8(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(1, 0, onextracallback, new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0L), new SliderKtExternalSyntheticLambda20(0), 112800);
    }

    public SnackbarHostKtExternalSyntheticLambda8(int i2, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(1, i2, onextracallback, new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0L), new SliderKtExternalSyntheticLambda20(0), 112800);
    }

    public SnackbarHostKtExternalSyntheticLambda8(int i2, int i3, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, SnackbarKtExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, int i4) {
        this.asBinder = (SnackbarKtExternalSyntheticLambda3.onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onwarmupcompleted);
        this.extraCallback = i4;
        this.IAuthTabCallbackStub = i2;
        this.onExtraCallback = i3;
        this.access100 = onextracallback;
        if (i2 == 1 || i2 == 2) {
            this.IAuthTabCallbackStubProxy = Collections.singletonList(textFieldDecoratorModifierNodeExternalSyntheticLambda24);
        } else {
            ArrayList arrayList = new ArrayList();
            this.IAuthTabCallbackStubProxy = arrayList;
            arrayList.add(textFieldDecoratorModifierNodeExternalSyntheticLambda24);
        }
        this.onActivityResized = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(new byte[9400], 0);
        this.extraCallbackWithResult = new SparseBooleanArray();
        this.ICustomTabsCallback = new SparseBooleanArray();
        this.onMessageChannelReady = new SparseArray<>();
        this.onNavigationEvent = new SparseIntArray();
        this.onExtraCallbackWithResult = new SnackbarKtExternalSyntheticLambda1(i4);
        this.onTransact = DrawerStateExternalSyntheticLambda1.onNavigationEvent;
        this.getInterfaceDescriptor = -1;
        IAuthTabCallbackStub();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // o.DrawerStateExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArrOnExtraCallback = this.onActivityResized.onExtraCallback();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArrOnExtraCallback, 0, 940);
        int i2 = 0;
        while (i2 < 188) {
            for (int i3 = 0; i3 < 5; i3++) {
                if (bArrOnExtraCallback[(i3 * 188) + i2] != 71) {
                    break;
                }
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback(i2);
            return true;
        }
        return false;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        if ((this.onExtraCallback & 1) == 0) {
            drawerStateExternalSyntheticLambda1 = new ResistanceConfig(drawerStateExternalSyntheticLambda1, this.access100);
        }
        this.onTransact = drawerStateExternalSyntheticLambda1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // o.DrawerStateExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(long j, long j2) {
        SnackbarKtExternalSyntheticLambda0 snackbarKtExternalSyntheticLambda0;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub != 2);
        int size = this.IAuthTabCallbackStubProxy.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24 = this.IAuthTabCallbackStubProxy.get(i2);
            boolean z = textFieldDecoratorModifierNodeExternalSyntheticLambda24.onExtraCallbackWithResult() == -9223372036854775807L;
            if (!z) {
                long jIAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda24.IAuthTabCallback();
                if (jIAuthTabCallback != -9223372036854775807L && jIAuthTabCallback != 0 && jIAuthTabCallback != j2) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda24.IAuthTabCallbackDefault(j2);
                }
            } else if (z) {
            }
        }
        if (j2 != 0 && (snackbarKtExternalSyntheticLambda0 = this.readTypedObject) != null) {
            snackbarKtExternalSyntheticLambda0.onWarmupCompleted(j2);
        }
        this.onActivityResized.onExtraCallback(0);
        this.onNavigationEvent.clear();
        for (int i3 = 0; i3 < this.onMessageChannelReady.size(); i3++) {
            this.onMessageChannelReady.valueAt(i3).onNavigationEvent();
        }
        this.IAuthTabCallback = 0;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        boolean z = this.IAuthTabCallbackStub == 2;
        if (this.writeTypedObject) {
            if (jOnExtraCallback != -1 && !z && !this.onExtraCallbackWithResult.onNavigationEvent()) {
                return this.onExtraCallbackWithResult.onNavigationEvent(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3, this.getInterfaceDescriptor);
            }
            onExtraCallbackWithResult(jOnExtraCallback);
            if (this.IAuthTabCallback_Parcel) {
                this.IAuthTabCallback_Parcel = false;
                onNavigationEvent(0L, 0L);
                if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() != 0) {
                    exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = 0L;
                    return 1;
                }
            }
            SnackbarKtExternalSyntheticLambda0 snackbarKtExternalSyntheticLambda0 = this.readTypedObject;
            if (snackbarKtExternalSyntheticLambda0 != null && snackbarKtExternalSyntheticLambda0.onWarmupCompleted()) {
                return this.readTypedObject.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
            }
        }
        if (!onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9)) {
            for (int i2 = 0; i2 < this.onMessageChannelReady.size(); i2++) {
                SnackbarKtExternalSyntheticLambda3 snackbarKtExternalSyntheticLambda3ValueAt = this.onMessageChannelReady.valueAt(i2);
                if (snackbarKtExternalSyntheticLambda3ValueAt instanceof SnackbarHostKtExternalSyntheticLambda5) {
                    SnackbarHostKtExternalSyntheticLambda5 snackbarHostKtExternalSyntheticLambda5 = (SnackbarHostKtExternalSyntheticLambda5) snackbarKtExternalSyntheticLambda3ValueAt;
                    if (snackbarHostKtExternalSyntheticLambda5.onExtraCallbackWithResult(z)) {
                        snackbarHostKtExternalSyntheticLambda5.onWarmupCompleted(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(), 1);
                    }
                }
            }
            return -1;
        }
        int iOnNavigationEvent = onNavigationEvent();
        int iOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult();
        if (iOnNavigationEvent > iOnExtraCallbackWithResult) {
            return 0;
        }
        int iAsBinder = this.onActivityResized.asBinder();
        if ((8388608 & iAsBinder) != 0) {
            this.onActivityResized.asBinder(iOnNavigationEvent);
            return 0;
        }
        int i3 = (4194304 & iAsBinder) != 0 ? 1 : 0;
        int i4 = (2096896 & iAsBinder) >> 8;
        boolean z2 = (iAsBinder & 32) != 0;
        SnackbarKtExternalSyntheticLambda3 snackbarKtExternalSyntheticLambda3 = (iAsBinder & 16) != 0 ? this.onMessageChannelReady.get(i4) : null;
        if (snackbarKtExternalSyntheticLambda3 == null) {
            this.onActivityResized.asBinder(iOnNavigationEvent);
            return 0;
        }
        if (this.IAuthTabCallbackStub != 2) {
            int i5 = iAsBinder & 15;
            int i6 = this.onNavigationEvent.get(i4, i5 - 1);
            this.onNavigationEvent.put(i4, i5);
            if (i6 == i5) {
                this.onActivityResized.asBinder(iOnNavigationEvent);
                return 0;
            }
            if (i5 != ((i6 + 1) & 15)) {
                snackbarKtExternalSyntheticLambda3.onNavigationEvent();
            }
        }
        if (z2) {
            int iOnMinimized = this.onActivityResized.onMinimized();
            i3 |= (this.onActivityResized.onMinimized() & 64) != 0 ? 2 : 0;
            this.onActivityResized.IAuthTabCallbackDefault(iOnMinimized - 1);
        }
        boolean z3 = this.writeTypedObject;
        if (IAuthTabCallback(i4)) {
            this.onActivityResized.onNavigationEvent(iOnNavigationEvent);
            snackbarKtExternalSyntheticLambda3.onWarmupCompleted(this.onActivityResized, i3);
            this.onActivityResized.onNavigationEvent(iOnExtraCallbackWithResult);
        }
        if (this.IAuthTabCallbackStub != 2 && !z3 && this.writeTypedObject && jOnExtraCallback != -1) {
            this.IAuthTabCallback_Parcel = true;
        }
        this.onActivityResized.asBinder(iOnNavigationEvent);
        return 0;
    }

    private void onExtraCallbackWithResult(long j) {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        if (this.onExtraCallbackWithResult.IAuthTabCallback() != -9223372036854775807L) {
            SnackbarKtExternalSyntheticLambda0 snackbarKtExternalSyntheticLambda0 = new SnackbarKtExternalSyntheticLambda0(this.onExtraCallbackWithResult.onExtraCallback(), this.onExtraCallbackWithResult.IAuthTabCallback(), j, this.getInterfaceDescriptor, this.extraCallback);
            this.readTypedObject = snackbarKtExternalSyntheticLambda0;
            this.onTransact.IAuthTabCallback(snackbarKtExternalSyntheticLambda0.onExtraCallback());
            return;
        }
        this.onTransact.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.onExtraCallbackWithResult.IAuthTabCallback()));
    }

    private boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArrOnExtraCallback = this.onActivityResized.onExtraCallback();
        if (9400 - this.onActivityResized.onWarmupCompleted() < 188) {
            int iOnNavigationEvent = this.onActivityResized.onNavigationEvent();
            if (iOnNavigationEvent > 0) {
                System.arraycopy(bArrOnExtraCallback, this.onActivityResized.onWarmupCompleted(), bArrOnExtraCallback, 0, iOnNavigationEvent);
            }
            this.onActivityResized.onExtraCallback(bArrOnExtraCallback, iOnNavigationEvent);
        }
        while (this.onActivityResized.onNavigationEvent() < 188) {
            int iOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult();
            int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(bArrOnExtraCallback, iOnExtraCallbackWithResult, 9400 - iOnExtraCallbackWithResult);
            if (iOnWarmupCompleted == -1) {
                return false;
            }
            this.onActivityResized.onNavigationEvent(iOnExtraCallbackWithResult + iOnWarmupCompleted);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private int onNavigationEvent() throws ParserException {
        int iOnWarmupCompleted = this.onActivityResized.onWarmupCompleted();
        int iOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SnackbarKtExternalSyntheticLambda2.onExtraCallbackWithResult(this.onActivityResized.onExtraCallback(), iOnWarmupCompleted, iOnExtraCallbackWithResult);
        this.onActivityResized.asBinder(iOnExtraCallbackWithResult2);
        int i2 = iOnExtraCallbackWithResult2 + 188;
        if (i2 > iOnExtraCallbackWithResult) {
            int i3 = this.IAuthTabCallback + (iOnExtraCallbackWithResult2 - iOnWarmupCompleted);
            this.IAuthTabCallback = i3;
            if (this.IAuthTabCallbackStub != 2 || i3 <= 376) {
                return i2;
            }
            throw ParserException.onNavigationEvent("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
        }
        this.IAuthTabCallback = 0;
        return i2;
    }

    private boolean IAuthTabCallback(int i2) {
        return this.IAuthTabCallbackStub == 2 || this.writeTypedObject || !this.ICustomTabsCallback.get(i2, false);
    }

    private void IAuthTabCallbackStub() {
        this.extraCallbackWithResult.clear();
        this.onMessageChannelReady.clear();
        SparseArray<SnackbarKtExternalSyntheticLambda3> sparseArrayOnExtraCallback = this.asBinder.onExtraCallback();
        int size = sparseArrayOnExtraCallback.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.onMessageChannelReady.put(sparseArrayOnExtraCallback.keyAt(i2), sparseArrayOnExtraCallback.valueAt(i2));
        }
        this.onMessageChannelReady.put(0, new SnackbarHostKtExternalSyntheticLambda6(new onExtraCallback()));
        this.asInterface = null;
    }

    class onExtraCallback implements SnackbarHostKtExternalSyntheticLambda4 {
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[4]);

        @Override // o.SnackbarHostKtExternalSyntheticLambda4
        public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        }

        public onExtraCallback() {
        }

        @Override // o.SnackbarHostKtExternalSyntheticLambda4
        public void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() != 0 || (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 128) == 0) {
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(6);
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() / 4;
            for (int i2 = 0; i2 < iOnNavigationEvent; i2++) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(this.onExtraCallback, 4);
                int iOnNavigationEvent2 = this.onExtraCallback.onNavigationEvent(16);
                this.onExtraCallback.IAuthTabCallback(3);
                if (iOnNavigationEvent2 == 0) {
                    this.onExtraCallback.IAuthTabCallback(13);
                } else {
                    int iOnNavigationEvent3 = this.onExtraCallback.onNavigationEvent(13);
                    if (SnackbarHostKtExternalSyntheticLambda8.this.onMessageChannelReady.get(iOnNavigationEvent3) == null) {
                        SnackbarHostKtExternalSyntheticLambda8.this.onMessageChannelReady.put(iOnNavigationEvent3, new SnackbarHostKtExternalSyntheticLambda6(SnackbarHostKtExternalSyntheticLambda8.this.new IAuthTabCallback(iOnNavigationEvent3)));
                        SnackbarHostKtExternalSyntheticLambda8.onWarmupCompleted(SnackbarHostKtExternalSyntheticLambda8.this);
                    }
                }
            }
            if (SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub != 2) {
                SnackbarHostKtExternalSyntheticLambda8.this.onMessageChannelReady.remove(0);
            }
        }
    }

    class IAuthTabCallback implements SnackbarHostKtExternalSyntheticLambda4 {
        private final int IAuthTabCallback;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[5]);
        private final SparseArray<SnackbarKtExternalSyntheticLambda3> onExtraCallbackWithResult = new SparseArray<>();
        private final SparseIntArray onExtraCallback = new SparseIntArray();

        @Override // o.SnackbarHostKtExternalSyntheticLambda4
        public void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        }

        public IAuthTabCallback(int i2) {
            this.IAuthTabCallback = i2;
        }

        @Override // o.SnackbarHostKtExternalSyntheticLambda4
        public void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 2) {
                if (SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub == 1 || SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub == 2 || SnackbarHostKtExternalSyntheticLambda8.this.access000 == 1) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda24 = (TextFieldDecoratorModifierNodeExternalSyntheticLambda24) SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStubProxy.get(0);
                } else {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda24 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(((TextFieldDecoratorModifierNodeExternalSyntheticLambda24) SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStubProxy.get(0)).IAuthTabCallback());
                    SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStubProxy.add(textFieldDecoratorModifierNodeExternalSyntheticLambda24);
                }
                if ((textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 128) != 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                    int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                    int i2 = 3;
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(3);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(this.onWarmupCompleted, 2);
                    this.onWarmupCompleted.IAuthTabCallback(3);
                    int i3 = 13;
                    SnackbarHostKtExternalSyntheticLambda8.this.getInterfaceDescriptor = this.onWarmupCompleted.onNavigationEvent(13);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(this.onWarmupCompleted, 2);
                    int i4 = 4;
                    this.onWarmupCompleted.IAuthTabCallback(4);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(this.onWarmupCompleted.onNavigationEvent(12));
                    if (SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub == 2 && SnackbarHostKtExternalSyntheticLambda8.this.asInterface == null) {
                        SnackbarKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback = new SnackbarKtExternalSyntheticLambda3.IAuthTabCallback(21, null, 0, null, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted);
                        SnackbarHostKtExternalSyntheticLambda8 snackbarHostKtExternalSyntheticLambda8 = SnackbarHostKtExternalSyntheticLambda8.this;
                        snackbarHostKtExternalSyntheticLambda8.asInterface = snackbarHostKtExternalSyntheticLambda8.asBinder.onNavigationEvent(21, iAuthTabCallback);
                        if (SnackbarHostKtExternalSyntheticLambda8.this.asInterface != null) {
                            SnackbarHostKtExternalSyntheticLambda8.this.asInterface.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda24, SnackbarHostKtExternalSyntheticLambda8.this.onTransact, new SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult(iOnUnminimized, 21, 8192));
                        }
                    }
                    this.onExtraCallbackWithResult.clear();
                    this.onExtraCallback.clear();
                    int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
                    while (iOnNavigationEvent > 0) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(this.onWarmupCompleted, 5);
                        int iOnNavigationEvent2 = this.onWarmupCompleted.onNavigationEvent(8);
                        this.onWarmupCompleted.IAuthTabCallback(i2);
                        int iOnNavigationEvent3 = this.onWarmupCompleted.onNavigationEvent(i3);
                        this.onWarmupCompleted.IAuthTabCallback(i4);
                        int iOnNavigationEvent4 = this.onWarmupCompleted.onNavigationEvent(12);
                        SnackbarKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnNavigationEvent4);
                        if (iOnNavigationEvent2 == 6 || iOnNavigationEvent2 == 5) {
                            iOnNavigationEvent2 = iAuthTabCallbackOnWarmupCompleted.onExtraCallbackWithResult;
                        }
                        iOnNavigationEvent -= iOnNavigationEvent4 + 5;
                        int i5 = SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub == 2 ? iOnNavigationEvent2 : iOnNavigationEvent3;
                        if (!SnackbarHostKtExternalSyntheticLambda8.this.extraCallbackWithResult.get(i5)) {
                            SnackbarKtExternalSyntheticLambda3 snackbarKtExternalSyntheticLambda3OnNavigationEvent = (SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub == 2 && iOnNavigationEvent2 == 21) ? SnackbarHostKtExternalSyntheticLambda8.this.asInterface : SnackbarHostKtExternalSyntheticLambda8.this.asBinder.onNavigationEvent(iOnNavigationEvent2, iAuthTabCallbackOnWarmupCompleted);
                            if (SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub != 2 || iOnNavigationEvent3 < this.onExtraCallback.get(i5, 8192)) {
                                this.onExtraCallback.put(i5, iOnNavigationEvent3);
                                this.onExtraCallbackWithResult.put(i5, snackbarKtExternalSyntheticLambda3OnNavigationEvent);
                            }
                        }
                        i2 = 3;
                        i4 = 4;
                        i3 = 13;
                    }
                    int size = this.onExtraCallback.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int iKeyAt = this.onExtraCallback.keyAt(i6);
                        int iValueAt = this.onExtraCallback.valueAt(i6);
                        SnackbarHostKtExternalSyntheticLambda8.this.extraCallbackWithResult.put(iKeyAt, true);
                        SnackbarHostKtExternalSyntheticLambda8.this.ICustomTabsCallback.put(iValueAt, true);
                        SnackbarKtExternalSyntheticLambda3 snackbarKtExternalSyntheticLambda3ValueAt = this.onExtraCallbackWithResult.valueAt(i6);
                        if (snackbarKtExternalSyntheticLambda3ValueAt != null) {
                            if (snackbarKtExternalSyntheticLambda3ValueAt != SnackbarHostKtExternalSyntheticLambda8.this.asInterface) {
                                snackbarKtExternalSyntheticLambda3ValueAt.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda24, SnackbarHostKtExternalSyntheticLambda8.this.onTransact, new SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult(iOnUnminimized, iKeyAt, 8192));
                            }
                            SnackbarHostKtExternalSyntheticLambda8.this.onMessageChannelReady.put(iValueAt, snackbarKtExternalSyntheticLambda3ValueAt);
                        }
                    }
                    if (SnackbarHostKtExternalSyntheticLambda8.this.IAuthTabCallbackStub == 2) {
                        if (SnackbarHostKtExternalSyntheticLambda8.this.writeTypedObject) {
                            return;
                        }
                        SnackbarHostKtExternalSyntheticLambda8.this.onTransact.onExtraCallbackWithResult();
                        SnackbarHostKtExternalSyntheticLambda8.this.access000 = 0;
                        SnackbarHostKtExternalSyntheticLambda8.this.writeTypedObject = true;
                        return;
                    }
                    SnackbarHostKtExternalSyntheticLambda8.this.onMessageChannelReady.remove(this.IAuthTabCallback);
                    SnackbarHostKtExternalSyntheticLambda8 snackbarHostKtExternalSyntheticLambda82 = SnackbarHostKtExternalSyntheticLambda8.this;
                    snackbarHostKtExternalSyntheticLambda82.access000 = snackbarHostKtExternalSyntheticLambda82.IAuthTabCallbackStub == 1 ? 0 : SnackbarHostKtExternalSyntheticLambda8.this.access000 - 1;
                    if (SnackbarHostKtExternalSyntheticLambda8.this.access000 == 0) {
                        SnackbarHostKtExternalSyntheticLambda8.this.onTransact.onExtraCallbackWithResult();
                        SnackbarHostKtExternalSyntheticLambda8.this.writeTypedObject = true;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private SnackbarKtExternalSyntheticLambda3.IAuthTabCallback onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
            int i3;
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int i4 = i2 + iOnWarmupCompleted;
            int i5 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iOnMinimized = 0;
            while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < i4) {
                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                if (iOnWarmupCompleted2 > i4) {
                    break;
                }
                if (iOnMinimized2 == 5) {
                    long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                    if (jOnActivityResized == 1094921523) {
                        i3 = 129;
                    } else if (jOnActivityResized == 1161904947) {
                        i3 = 135;
                    } else if (jOnActivityResized == 1094921524) {
                        i3 = 172;
                    } else if (jOnActivityResized == 1212503619) {
                        i3 = 36;
                    }
                    i5 = i3;
                } else {
                    if (iOnMinimized2 != 106) {
                        if (iOnMinimized2 != 122) {
                            if (iOnMinimized2 == 127) {
                                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                if (iOnMinimized3 != 21) {
                                    if (iOnMinimized3 == 14) {
                                        i3 = 136;
                                    } else if (iOnMinimized3 == 33) {
                                        i3 = 139;
                                    }
                                }
                            } else if (iOnMinimized2 == 123) {
                                i3 = 138;
                            } else if (iOnMinimized2 == 10) {
                                String strTrim = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(3).trim();
                                iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                str = strTrim;
                            } else if (iOnMinimized2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < iOnWarmupCompleted2) {
                                    String strTrim2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(3).trim();
                                    int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                    byte[] bArr = new byte[4];
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, 4);
                                    arrayList2.add(new SnackbarKtExternalSyntheticLambda3.onNavigationEvent(strTrim2, iOnMinimized4, bArr));
                                }
                                arrayList = arrayList2;
                                i5 = 89;
                            } else if (iOnMinimized2 == 111) {
                                i3 = 257;
                            }
                        }
                    }
                    i5 = i3;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnWarmupCompleted2 - textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted());
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            return new SnackbarKtExternalSyntheticLambda3.IAuthTabCallback(i5, str, iOnMinimized, arrayList, Arrays.copyOfRange(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted, i4));
        }
    }
}
