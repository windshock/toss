package o;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.SelectionGesturesKtExternalSyntheticLambda2;
import o.SelectionManagerExternalSyntheticLambda10;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionGesturesKtExternalSyntheticLambda2 implements SelectionManagerExternalSyntheticLambda10 {
    public static final Supplier<String> IAuthTabCallback = new Supplier() { // from class: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0
        public final Object get() {
            return SelectionGesturesKtExternalSyntheticLambda2.onNavigationEvent();
        }
    };
    private static final Random onExtraCallbackWithResult = new Random();
    private SelectionManagerExternalSyntheticLambda10.onWarmupCompleted IAuthTabCallbackDefault;
    private final HashMap<String, onExtraCallbackWithResult> IAuthTabCallbackStub;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback asBinder;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback asInterface;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onExtraCallback;
    private long onNavigationEvent;
    private final Supplier<String> onTransact;
    private String onWarmupCompleted;

    public SelectionGesturesKtExternalSyntheticLambda2() {
        this(IAuthTabCallback);
    }

    public SelectionGesturesKtExternalSyntheticLambda2(Supplier<String> supplier) {
        this.onTransact = supplier;
        this.asBinder = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
        this.asInterface = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        this.IAuthTabCallbackStub = new HashMap<>();
        this.onExtraCallback = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted;
        this.onNavigationEvent = -1L;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10
    public void IAuthTabCallback(SelectionManagerExternalSyntheticLambda10.onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallbackDefault = onwarmupcompleted;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10
    public String IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        String str;
        synchronized (this) {
            str = onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.asInterface).IAuthTabCallbackStub, onextracallbackwithresult).onExtraCallbackWithResult;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: all -> 0x010d, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0013, B:15:0x001f, B:17:0x002b, B:19:0x0035, B:23:0x003f, B:25:0x004b, B:26:0x0051, B:28:0x0056, B:30:0x005c, B:32:0x0075, B:34:0x00d0, B:36:0x00d6, B:38:0x00ec, B:40:0x00f8, B:42:0x00fe), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    @Override // o.SelectionManagerExternalSyntheticLambda10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent) {
        onExtraCallbackWithResult onextracallbackwithresult;
        SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent2;
        onExtraCallbackWithResult onextracallbackwithresult2;
        synchronized (this) {
            if (selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder.onExtraCallback()) {
                return;
            }
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
            if (onextracallbackwithresult3 != null) {
                if (onextracallbackwithresult3.onNavigationEvent < onExtraCallback()) {
                    return;
                }
                onExtraCallbackWithResult onextracallbackwithresult4 = this.IAuthTabCallbackStub.get(this.onWarmupCompleted);
                if (onextracallbackwithresult4 != null && onextracallbackwithresult4.asBinder == -1 && onextracallbackwithresult4.onTransact != selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface) {
                    return;
                }
            }
            onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact);
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult;
            }
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult5 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
            if (onextracallbackwithresult5 != null && onextracallbackwithresult5.IAuthTabCallback()) {
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult6 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult7 = new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(onextracallbackwithresult6.onExtraCallback, onextracallbackwithresult6.onNavigationEvent, onextracallbackwithresult6.onWarmupCompleted);
                onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback2 = onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface, onextracallbackwithresult7);
                if (!onextracallbackwithresultOnExtraCallback2.IAuthTabCallback) {
                    onextracallbackwithresultOnExtraCallback2.IAuthTabCallback = true;
                    selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact.onExtraCallback, this.asInterface);
                    onextracallbackwithresult = onextracallbackwithresultOnExtraCallback;
                    this.IAuthTabCallbackDefault.IAuthTabCallback(new SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.IAuthTabCallbackDefault, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface, onextracallbackwithresult7, Math.max(0L, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.asInterface.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact.onWarmupCompleted)) + this.asInterface.onExtraCallbackWithResult()), selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onExtraCallback, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onNavigationEvent, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onWarmupCompleted, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onExtraCallbackWithResult, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.IAuthTabCallbackStub), onextracallbackwithresultOnExtraCallback2.onExtraCallbackWithResult);
                }
                if (onextracallbackwithresult.IAuthTabCallback) {
                }
                if (onextracallbackwithresult2.onExtraCallbackWithResult.equals(this.onWarmupCompleted)) {
                    onextracallbackwithresult2.onWarmupCompleted = true;
                    this.IAuthTabCallbackDefault.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent2, onextracallbackwithresult2.onExtraCallbackWithResult);
                }
                return;
            }
            onextracallbackwithresult = onextracallbackwithresultOnExtraCallback;
            if (onextracallbackwithresult.IAuthTabCallback) {
                onextracallbackwithresult2 = onextracallbackwithresult;
                onextracallbackwithresult2.IAuthTabCallback = true;
                selectionContainerKtExternalSyntheticLambda9$onNavigationEvent2 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent;
                this.IAuthTabCallbackDefault.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent2, onextracallbackwithresult2.onExtraCallbackWithResult);
            } else {
                selectionContainerKtExternalSyntheticLambda9$onNavigationEvent2 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent;
                onextracallbackwithresult2 = onextracallbackwithresult;
            }
            if (onextracallbackwithresult2.onExtraCallbackWithResult.equals(this.onWarmupCompleted) && !onextracallbackwithresult2.onWarmupCompleted) {
                onextracallbackwithresult2.onWarmupCompleted = true;
                this.IAuthTabCallbackDefault.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent2, onextracallbackwithresult2.onExtraCallbackWithResult);
            }
            return;
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10
    public void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent) {
        synchronized (this) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.onExtraCallback;
            this.onExtraCallback = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder;
            Iterator<onExtraCallbackWithResult> it = this.IAuthTabCallbackStub.values().iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult next = it.next();
                if (!next.onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.onExtraCallback) || next.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent)) {
                    it.remove();
                    if (next.IAuthTabCallback) {
                        if (next.onExtraCallbackWithResult.equals(this.onWarmupCompleted)) {
                            onWarmupCompleted(next);
                        }
                        this.IAuthTabCallbackDefault.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, next.onExtraCallbackWithResult, false);
                    }
                }
            }
            onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10
    public void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2) {
        synchronized (this) {
            boolean z = i2 == 0;
            Iterator<onExtraCallbackWithResult> it = this.IAuthTabCallbackStub.values().iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult next = it.next();
                if (next.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent)) {
                    it.remove();
                    if (next.IAuthTabCallback) {
                        boolean zEquals = next.onExtraCallbackWithResult.equals(this.onWarmupCompleted);
                        boolean z2 = z && zEquals && next.onWarmupCompleted;
                        if (zEquals) {
                            onWarmupCompleted(next);
                        }
                        this.IAuthTabCallbackDefault.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, next.onExtraCallbackWithResult, z2);
                    }
                }
            }
            onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent);
        }
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10
    public String IAuthTabCallback() {
        String str;
        synchronized (this) {
            str = this.onWarmupCompleted;
        }
        return str;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda10
    public void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent) {
        SelectionManagerExternalSyntheticLambda10.onWarmupCompleted onwarmupcompleted;
        synchronized (this) {
            String str = this.onWarmupCompleted;
            if (str != null) {
                onWarmupCompleted((onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub.get(str)));
            }
            Iterator<onExtraCallbackWithResult> it = this.IAuthTabCallbackStub.values().iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult next = it.next();
                it.remove();
                if (next.IAuthTabCallback && (onwarmupcompleted = this.IAuthTabCallbackDefault) != null) {
                    onwarmupcompleted.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, next.onExtraCallbackWithResult, false);
                }
            }
        }
    }

    @RequiresNonNull
    private void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent) {
        if (selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder.onExtraCallback()) {
            String str = this.onWarmupCompleted;
            if (str != null) {
                onWarmupCompleted((onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub.get(str)));
                return;
            }
            return;
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStub.get(this.onWarmupCompleted);
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact);
        this.onWarmupCompleted = onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult;
        onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent);
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
        if (onextracallbackwithresult2 == null || !onextracallbackwithresult2.IAuthTabCallback()) {
            return;
        }
        if (onextracallbackwithresult != null && onextracallbackwithresult.asBinder == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact.onNavigationEvent && onextracallbackwithresult.onExtraCallback != null && onextracallbackwithresult.onExtraCallback.onWarmupCompleted == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact.onWarmupCompleted && onextracallbackwithresult.onExtraCallback.IAuthTabCallback == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact.IAuthTabCallback) {
            return;
        }
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface, new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallback, onextracallbackwithresult3.onNavigationEvent)).onExtraCallbackWithResult, onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult);
    }

    private void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        if (onextracallbackwithresult.asBinder != -1) {
            this.onNavigationEvent = onextracallbackwithresult.asBinder;
        }
        this.onWarmupCompleted = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long onExtraCallback() {
        onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStub.get(this.onWarmupCompleted);
        if (onextracallbackwithresult == null || onextracallbackwithresult.asBinder == -1) {
            return this.onNavigationEvent + 1;
        }
        return onextracallbackwithresult.asBinder;
    }

    private onExtraCallbackWithResult onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        onExtraCallbackWithResult onextracallbackwithresult2 = null;
        long j = Long.MAX_VALUE;
        for (onExtraCallbackWithResult onextracallbackwithresult3 : this.IAuthTabCallbackStub.values()) {
            onextracallbackwithresult3.onExtraCallbackWithResult(i2, onextracallbackwithresult);
            if (onextracallbackwithresult3.onWarmupCompleted(i2, onextracallbackwithresult)) {
                long j2 = onextracallbackwithresult3.asBinder;
                if (j2 == -1 || j2 < j) {
                    onextracallbackwithresult2 = onextracallbackwithresult3;
                    j = j2;
                } else if (j2 == j) {
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    if (((onExtraCallbackWithResult) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{onextracallbackwithresult2}, -1084655742)).onExtraCallback != null && onextracallbackwithresult3.onExtraCallback != null) {
                        onextracallbackwithresult2 = onextracallbackwithresult3;
                    }
                }
            }
        }
        if (onextracallbackwithresult2 != null) {
            return onextracallbackwithresult2;
        }
        String str = (String) this.onTransact.get();
        onExtraCallbackWithResult onextracallbackwithresult4 = new onExtraCallbackWithResult(str, i2, onextracallbackwithresult);
        this.IAuthTabCallbackStub.put(str, onextracallbackwithresult4);
        return onextracallbackwithresult4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String onNavigationEvent() {
        byte[] bArr = new byte[12];
        onExtraCallbackWithResult.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    final class onExtraCallbackWithResult {
        private boolean IAuthTabCallback;
        private long asBinder;
        private BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallback;
        private final String onExtraCallbackWithResult;
        private int onTransact;
        private boolean onWarmupCompleted;

        public onExtraCallbackWithResult(String str, int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            this.onExtraCallbackWithResult = str;
            this.onTransact = i2;
            this.asBinder = onextracallbackwithresult == null ? -1L : onextracallbackwithresult.onNavigationEvent;
            if (onextracallbackwithresult == null || !onextracallbackwithresult.IAuthTabCallback()) {
                return;
            }
            this.onExtraCallback = onextracallbackwithresult;
        }

        public boolean onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, this.onTransact);
            this.onTransact = iOnExtraCallbackWithResult;
            if (iOnExtraCallbackWithResult == -1) {
                return false;
            }
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            return onextracallbackwithresult == null || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(onextracallbackwithresult.onExtraCallback) != -1;
        }

        public boolean onWarmupCompleted(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            if (onextracallbackwithresult == null) {
                return i2 == this.onTransact;
            }
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallback;
            return onextracallbackwithresult2 == null ? !onextracallbackwithresult.IAuthTabCallback() && onextracallbackwithresult.onNavigationEvent == this.asBinder : onextracallbackwithresult.onNavigationEvent == onextracallbackwithresult2.onNavigationEvent && onextracallbackwithresult.onWarmupCompleted == onextracallbackwithresult2.onWarmupCompleted && onextracallbackwithresult.IAuthTabCallback == onextracallbackwithresult2.IAuthTabCallback;
        }

        public void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            if (this.asBinder != -1 || i2 != this.onTransact || onextracallbackwithresult == null || onextracallbackwithresult.onNavigationEvent < SelectionGesturesKtExternalSyntheticLambda2.this.onExtraCallback()) {
                return;
            }
            this.asBinder = onextracallbackwithresult.onNavigationEvent;
        }

        public boolean onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent) {
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
            if (onextracallbackwithresult == null) {
                return this.onTransact != selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface;
            }
            long j = this.asBinder;
            if (j == -1) {
                return false;
            }
            if (onextracallbackwithresult.onNavigationEvent > j) {
                return true;
            }
            if (this.onExtraCallback == null) {
                return false;
            }
            int iIAuthTabCallback = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder.IAuthTabCallback(onextracallbackwithresult.onExtraCallback);
            int iIAuthTabCallback2 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder.IAuthTabCallback(this.onExtraCallback.onExtraCallback);
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
            if (onextracallbackwithresult2.onNavigationEvent < this.onExtraCallback.onNavigationEvent || iIAuthTabCallback < iIAuthTabCallback2) {
                return false;
            }
            if (iIAuthTabCallback > iIAuthTabCallback2) {
                return true;
            }
            if (onextracallbackwithresult2.IAuthTabCallback()) {
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact;
                int i2 = onextracallbackwithresult3.onWarmupCompleted;
                int i3 = onextracallbackwithresult3.IAuthTabCallback;
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult4 = this.onExtraCallback;
                int i4 = onextracallbackwithresult4.onWarmupCompleted;
                return i2 > i4 || (i2 == i4 && i3 > onextracallbackwithresult4.IAuthTabCallback);
            }
            int i5 = selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact.onExtraCallbackWithResult;
            return i5 == -1 || i5 > this.onExtraCallback.onWarmupCompleted;
        }

        private int onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, int i2) {
            if (i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult()) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i2, SelectionGesturesKtExternalSyntheticLambda2.this.asBinder);
                for (int i3 = SelectionGesturesKtExternalSyntheticLambda2.this.asBinder.IAuthTabCallback; i3 <= SelectionGesturesKtExternalSyntheticLambda2.this.asBinder.asBinder; i3++) {
                    int iIAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(i3));
                    if (iIAuthTabCallback != -1) {
                        return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.IAuthTabCallback(iIAuthTabCallback, SelectionGesturesKtExternalSyntheticLambda2.this.asInterface).IAuthTabCallbackStub;
                    }
                }
                return -1;
            }
            if (i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102.onExtraCallbackWithResult()) {
                return i2;
            }
            return -1;
        }
    }
}
