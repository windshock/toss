package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource$ComponentListener$;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.BackdropScaffoldKtExternalSyntheticLambda5;
import o.BackdropScaffoldStateExternalSyntheticLambda1;
import o.BadgeKtBadgedBox21ExternalSyntheticLambda0;
import o.BadgeKtExternalSyntheticLambda0;
import o.BottomDrawerStateCompanionExternalSyntheticLambda1;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomSheetScaffoldKtExternalSyntheticLambda13;
import o.BottomSheetScaffoldKtExternalSyntheticLambda3;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda3;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.RecordingInputConnection_androidKt;
import o.TextContextMenuHelperApi28ExternalSyntheticLambda6;
import o.TextContextMenuHelperApi28ExternalSyntheticLambda7;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import o.TextFieldSelectionStateExternalSyntheticLambda7;
import o.TextFieldStateKtExternalSyntheticLambda0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdsMediaSource extends BackdropScaffoldKtExternalSyntheticLambda5<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> {
    private static final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallback = new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(new Object());
    final TextFieldStateKtExternalSyntheticLambda0.onNavigationEvent IAuthTabCallback;
    private final TextContextMenuHelperApi28ExternalSyntheticLambda6 IAuthTabCallbackDefault;
    private onWarmupCompleted IAuthTabCallbackStub;
    private Handler IAuthTabCallbackStubProxy;
    private final boolean ICustomTabsCallback;
    private final BadgeKtBadgedBox21ExternalSyntheticLambda0 access000;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 access100;
    private final BottomSheetScaffoldKtExternalSyntheticLambda3 asBinder;
    private final Object asInterface;
    private TextContextMenuHelperApi28ExternalSyntheticLambda7 onExtraCallbackWithResult;
    private final TextFieldSelectionStateExternalSyntheticLambda12 onTransact;
    private final BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onWarmupCompleted;
    private final Handler getInterfaceDescriptor = new Handler(Looper.getMainLooper());
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback_Parcel = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
    private onNavigationEvent[][] onNavigationEvent = new onNavigationEvent[0][];

    public static final class AdLoadException extends IOException {
        public final int type;

        public static AdLoadException onWarmupCompleted(Exception exc) {
            return new AdLoadException(0, exc);
        }

        private AdLoadException(int i2, Exception exc) {
            super(exc);
            this.type = i2;
        }
    }

    public AdsMediaSource(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, Object obj, BottomDrawerStateExternalSyntheticLambda2.onExtraCallback onextracallback, BottomSheetScaffoldKtExternalSyntheticLambda3 bottomSheetScaffoldKtExternalSyntheticLambda3, TextContextMenuHelperApi28ExternalSyntheticLambda6 textContextMenuHelperApi28ExternalSyntheticLambda6, boolean z) {
        this.ICustomTabsCallback = z;
        this.access000 = new BadgeKtBadgedBox21ExternalSyntheticLambda0(bottomDrawerStateExternalSyntheticLambda2, z);
        this.IAuthTabCallback = ((TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomDrawerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult)).IAuthTabCallback;
        this.onWarmupCompleted = onextracallback;
        this.asBinder = bottomSheetScaffoldKtExternalSyntheticLambda3;
        this.IAuthTabCallbackDefault = textContextMenuHelperApi28ExternalSyntheticLambda6;
        this.onTransact = textFieldSelectionStateExternalSyntheticLambda12;
        this.asInterface = obj;
        bottomSheetScaffoldKtExternalSyntheticLambda3.onExtraCallback(onextracallback.IAuthTabCallback());
    }

    public TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent() {
        return this.access000.onNavigationEvent();
    }

    public Object asInterface() {
        return this.asInterface;
    }

    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        return Objects.equals(onWarmupCompleted(onNavigationEvent()), onWarmupCompleted(textFieldStateKtExternalSyntheticLambda0)) && this.access000.IAuthTabCallback(textFieldStateKtExternalSyntheticLambda0);
    }

    public void onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        this.access000.onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0);
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5, o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        super.onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda7);
        Handler handlerOnExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult();
        this.IAuthTabCallbackStubProxy = handlerOnExtraCallbackWithResult;
        final onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(handlerOnExtraCallbackWithResult);
        this.IAuthTabCallbackStub = onwarmupcompleted;
        this.access100 = this.access000.asInterface();
        onNavigationEvent((AdsMediaSource) onExtraCallback, (BottomDrawerStateExternalSyntheticLambda2) this.access000);
        this.getInterfaceDescriptor.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f$0;
                adsMediaSource.asBinder.onWarmupCompleted(adsMediaSource, adsMediaSource.onTransact, adsMediaSource.asInterface, adsMediaSource.IAuthTabCallbackDefault, onwarmupcompleted);
            }
        });
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        if (((TextContextMenuHelperApi28ExternalSyntheticLambda7) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).onExtraCallback > 0 && onextracallbackwithresult.IAuthTabCallback()) {
            int i2 = onextracallbackwithresult.onWarmupCompleted;
            int i3 = onextracallbackwithresult.IAuthTabCallback;
            onNavigationEvent[][] onnavigationeventArr = this.onNavigationEvent;
            onNavigationEvent[] onnavigationeventArr2 = onnavigationeventArr[i2];
            if (onnavigationeventArr2.length <= i3) {
                onnavigationeventArr[i2] = (onNavigationEvent[]) Arrays.copyOf(onnavigationeventArr2, i3 + 1);
            }
            onNavigationEvent onnavigationevent = this.onNavigationEvent[i2][i3];
            if (onnavigationevent == null) {
                onnavigationevent = new onNavigationEvent(onextracallbackwithresult);
                this.onNavigationEvent[i2][i3] = onnavigationevent;
                getInterfaceDescriptor();
            }
            return onnavigationevent.onWarmupCompleted(onextracallbackwithresult, composableSingletonsScaffoldKtExternalSyntheticLambda3, j);
        }
        BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = new BackdropScaffoldStateExternalSyntheticLambda1(onextracallbackwithresult, composableSingletonsScaffoldKtExternalSyntheticLambda3, j);
        backdropScaffoldStateExternalSyntheticLambda1.IAuthTabCallback(this.access000);
        backdropScaffoldStateExternalSyntheticLambda1.onExtraCallback(onextracallbackwithresult);
        return backdropScaffoldStateExternalSyntheticLambda1;
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = (BackdropScaffoldStateExternalSyntheticLambda1) bottomDrawerStateCompanionExternalSyntheticLambda1;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = backdropScaffoldStateExternalSyntheticLambda1.onExtraCallbackWithResult;
        if (onextracallbackwithresult.IAuthTabCallback()) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent[onextracallbackwithresult.onWarmupCompleted][onextracallbackwithresult.IAuthTabCallback]);
            onnavigationevent.onExtraCallback(backdropScaffoldStateExternalSyntheticLambda1);
            if (onnavigationevent.onWarmupCompleted()) {
                onnavigationevent.IAuthTabCallback();
                this.onNavigationEvent[onextracallbackwithresult.onWarmupCompleted][onextracallbackwithresult.IAuthTabCallback] = null;
                return;
            }
            return;
        }
        backdropScaffoldStateExternalSyntheticLambda1.asInterface();
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5, o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        final onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
        this.IAuthTabCallbackStub = null;
        this.IAuthTabCallbackStubProxy = null;
        onwarmupcompleted.IAuthTabCallback();
        this.access100 = null;
        this.onExtraCallbackWithResult = null;
        this.onNavigationEvent = new onNavigationEvent[0][];
        this.getInterfaceDescriptor.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f$0;
                adsMediaSource.asBinder.onNavigationEvent(adsMediaSource, onwarmupcompleted);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        if (onextracallbackwithresult.IAuthTabCallback()) {
            ((onNavigationEvent) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent[onextracallbackwithresult.onWarmupCompleted][onextracallbackwithresult.IAuthTabCallback])).onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            IAuthTabCallbackStubProxy();
        } else {
            RecordingInputConnection_androidKt.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted() == 1);
            this.access100 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
            this.getInterfaceDescriptor.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.onNavigationEvent(this.f$0, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                }
            });
            if (this.ICustomTabsCallback) {
                IAuthTabCallbackStubProxy();
            }
        }
    }

    public static /* synthetic */ void onNavigationEvent(final AdsMediaSource adsMediaSource, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        boolean zOnExtraCallback = adsMediaSource.asBinder.onExtraCallback(adsMediaSource, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult((zOnExtraCallback && adsMediaSource.ICustomTabsCallback) ? false : true);
        if (zOnExtraCallback || adsMediaSource.ICustomTabsCallback) {
            return;
        }
        ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(adsMediaSource.IAuthTabCallbackStubProxy)).post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.IAuthTabCallbackStubProxy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2) {
        return onextracallbackwithresult.IAuthTabCallback() ? onextracallbackwithresult : onextracallbackwithresult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7) {
        TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda72 = this.onExtraCallbackWithResult;
        if (textContextMenuHelperApi28ExternalSyntheticLambda72 == null) {
            onNavigationEvent[][] onnavigationeventArr = new onNavigationEvent[textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback - (textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback() ? 1 : 0)][];
            this.onNavigationEvent = onnavigationeventArr;
            Arrays.fill(onnavigationeventArr, new onNavigationEvent[0]);
        } else {
            int iIAuthTabCallback = IAuthTabCallback(textContextMenuHelperApi28ExternalSyntheticLambda72, textContextMenuHelperApi28ExternalSyntheticLambda7);
            if (iIAuthTabCallback > 0) {
                this.onNavigationEvent = onExtraCallbackWithResult(this.onNavigationEvent, iIAuthTabCallback);
            }
        }
        this.onExtraCallbackWithResult = textContextMenuHelperApi28ExternalSyntheticLambda7;
        getInterfaceDescriptor();
        IAuthTabCallbackStubProxy();
    }

    private static int IAuthTabCallback(TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7, TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda72) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback() == textContextMenuHelperApi28ExternalSyntheticLambda72.onExtraCallback());
        int i2 = textContextMenuHelperApi28ExternalSyntheticLambda72.onExtraCallback - textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(i2 >= 0);
        int i3 = textContextMenuHelperApi28ExternalSyntheticLambda72.IAuthTabCallbackStub;
        while (i3 < textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback) {
            TextContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallbackWithResult onExtraCallbackWithResult2 = textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallbackWithResult(i3);
            if (onExtraCallbackWithResult2.onNavigationEvent()) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(i3 == textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback - 1);
                return i2;
            }
            TextContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallbackWithResult onExtraCallbackWithResult3 = textContextMenuHelperApi28ExternalSyntheticLambda72.onExtraCallbackWithResult(i3);
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(onExtraCallbackWithResult2.IAuthTabCallback <= onExtraCallbackWithResult3.IAuthTabCallback);
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(onExtraCallbackWithResult2.IAuthTabCallback_Parcel == onExtraCallbackWithResult3.IAuthTabCallback_Parcel);
            for (int i4 = 0; i4 < onExtraCallbackWithResult2.IAuthTabCallback; i4++) {
                TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0 = onExtraCallbackWithResult2.onTransact[i4];
                if (textFieldStateKtExternalSyntheticLambda0 != null) {
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0.equals(onExtraCallbackWithResult3.onTransact[i4]));
                }
            }
            i3++;
        }
        return i2;
    }

    private static onNavigationEvent[][] onExtraCallbackWithResult(onNavigationEvent[][] onnavigationeventArr, int i2) {
        int length = onnavigationeventArr.length + i2;
        onNavigationEvent[][] onnavigationeventArr2 = new onNavigationEvent[length][];
        System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr2, 0, onnavigationeventArr.length);
        for (int length2 = onnavigationeventArr.length; length2 < length; length2++) {
            onnavigationeventArr2[length2] = new onNavigationEvent[0];
        }
        return onnavigationeventArr2;
    }

    private void getInterfaceDescriptor() {
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted;
        TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7 = this.onExtraCallbackWithResult;
        if (textContextMenuHelperApi28ExternalSyntheticLambda7 != null) {
            for (int i2 = 0; i2 < this.onNavigationEvent.length; i2++) {
                int i3 = 0;
                while (true) {
                    onNavigationEvent[] onnavigationeventArr = this.onNavigationEvent[i2];
                    if (i3 < onnavigationeventArr.length) {
                        onNavigationEvent onnavigationevent = onnavigationeventArr[i3];
                        TextContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallbackWithResult onExtraCallbackWithResult2 = textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallbackWithResult(i2);
                        if (onnavigationevent != null && !onnavigationevent.onExtraCallbackWithResult()) {
                            TextFieldStateKtExternalSyntheticLambda0[] textFieldStateKtExternalSyntheticLambda0Arr = onExtraCallbackWithResult2.onTransact;
                            if (i3 < textFieldStateKtExternalSyntheticLambda0Arr.length && (textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted = textFieldStateKtExternalSyntheticLambda0Arr[i3]) != null) {
                                if (this.IAuthTabCallback != null) {
                                    textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted = textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback().onNavigationEvent(this.IAuthTabCallback).onWarmupCompleted();
                                }
                                onnavigationevent.onExtraCallback(this.onWarmupCompleted.onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted), textFieldStateKtExternalSyntheticLambda0OnWarmupCompleted);
                            }
                        }
                        i3++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackStubProxy() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.access100;
        TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7 = this.onExtraCallbackWithResult;
        if (textContextMenuHelperApi28ExternalSyntheticLambda7 == null || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 == null) {
            return;
        }
        if (textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback == 0) {
            onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        } else {
            this.onExtraCallbackWithResult = textContextMenuHelperApi28ExternalSyntheticLambda7.onExtraCallback(IAuthTabCallback_Parcel());
            onNavigationEvent((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) new BottomSheetScaffoldKtExternalSyntheticLambda13(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, this.onExtraCallbackWithResult));
        }
    }

    @RequiresNonNull
    private long[][] IAuthTabCallback_Parcel() {
        boolean zOnExtraCallback = ((TextContextMenuHelperApi28ExternalSyntheticLambda7) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).onExtraCallback();
        int length = this.onNavigationEvent.length + (zOnExtraCallback ? 1 : 0);
        long[][] jArr = new long[length][];
        int i2 = 0;
        while (true) {
            onNavigationEvent[][] onnavigationeventArr = this.onNavigationEvent;
            if (i2 >= onnavigationeventArr.length) {
                break;
            }
            jArr[i2] = new long[onnavigationeventArr[i2].length];
            int i3 = 0;
            while (true) {
                onNavigationEvent[] onnavigationeventArr2 = this.onNavigationEvent[i2];
                if (i3 < onnavigationeventArr2.length) {
                    onNavigationEvent onnavigationevent = onnavigationeventArr2[i3];
                    jArr[i2][i3] = onnavigationevent == null ? -9223372036854775807L : onnavigationevent.onNavigationEvent();
                    i3++;
                }
            }
            i2++;
        }
        if (zOnExtraCallback) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    private static TextFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult onWarmupCompleted(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        if (iAuthTabCallbackDefault == null) {
            return null;
        }
        return iAuthTabCallbackDefault.onExtraCallback;
    }

    final class onWarmupCompleted implements BottomSheetScaffoldKtExternalSyntheticLambda3.onWarmupCompleted {
        private final Handler onExtraCallback;
        private volatile boolean onExtraCallbackWithResult;

        public onWarmupCompleted(Handler handler) {
            this.onExtraCallback = handler;
        }

        public void IAuthTabCallback() {
            this.onExtraCallbackWithResult = true;
            this.onExtraCallback.removeCallbacksAndMessages(null);
        }

        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda3.onWarmupCompleted
        public void onExtraCallback(TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7) {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            this.onExtraCallback.post(new AdsMediaSource$ComponentListener$.ExternalSyntheticLambda0(this, textContextMenuHelperApi28ExternalSyntheticLambda7));
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7) {
            if (onwarmupcompleted.onExtraCallbackWithResult) {
                return;
            }
            AdsMediaSource.this.onNavigationEvent(textContextMenuHelperApi28ExternalSyntheticLambda7);
        }
    }

    final class onExtraCallbackWithResult implements BackdropScaffoldStateExternalSyntheticLambda1.onExtraCallbackWithResult {
        private final TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent;

        public onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            this.onNavigationEvent = textFieldStateKtExternalSyntheticLambda0;
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda1.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            AdsMediaSource.this.getInterfaceDescriptor.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.onExtraCallbackWithResult onextracallbackwithresult2 = this.f$0;
                    BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
                    AdsMediaSource.this.asBinder.IAuthTabCallback(AdsMediaSource.this, onextracallbackwithresult3.onWarmupCompleted, onextracallbackwithresult3.IAuthTabCallback);
                }
            });
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda1.onExtraCallbackWithResult
        public void onExtraCallback(final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final IOException iOException) {
            AdsMediaSource.this.onExtraCallback(onextracallbackwithresult).onNavigationEvent(new BadgeKtExternalSyntheticLambda0(BadgeKtExternalSyntheticLambda0.onExtraCallback(), new TextFieldSelectionStateExternalSyntheticLambda12(((TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent.onExtraCallbackWithResult)).asBinder), SystemClock.elapsedRealtime()), 6, AdLoadException.onWarmupCompleted(iOException), true);
            AdsMediaSource.this.getInterfaceDescriptor.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.onExtraCallbackWithResult onextracallbackwithresult2 = this.f$0;
                    BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
                    AdsMediaSource.this.asBinder.onNavigationEvent(AdsMediaSource.this, onextracallbackwithresult3.onWarmupCompleted, onextracallbackwithresult3.IAuthTabCallback, iOException);
                }
            });
        }
    }

    final class onNavigationEvent {
        private TextFieldStateKtExternalSyntheticLambda0 IAuthTabCallback;
        private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 asInterface;
        private final List<BackdropScaffoldStateExternalSyntheticLambda1> onExtraCallbackWithResult = new ArrayList();
        private final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent;
        private BottomDrawerStateExternalSyntheticLambda2 onWarmupCompleted;

        public onNavigationEvent(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            this.onNavigationEvent = onextracallbackwithresult;
        }

        public void onExtraCallback(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            this.onWarmupCompleted = bottomDrawerStateExternalSyntheticLambda2;
            this.IAuthTabCallback = textFieldStateKtExternalSyntheticLambda0;
            for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
                BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = this.onExtraCallbackWithResult.get(i2);
                backdropScaffoldStateExternalSyntheticLambda1.IAuthTabCallback(bottomDrawerStateExternalSyntheticLambda2);
                backdropScaffoldStateExternalSyntheticLambda1.onNavigationEvent(AdsMediaSource.this.new onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0));
            }
            AdsMediaSource.this.onNavigationEvent((AdsMediaSource) this.onNavigationEvent, bottomDrawerStateExternalSyntheticLambda2);
        }

        public BottomDrawerStateCompanionExternalSyntheticLambda1 onWarmupCompleted(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
            BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = new BackdropScaffoldStateExternalSyntheticLambda1(onextracallbackwithresult, composableSingletonsScaffoldKtExternalSyntheticLambda3, j);
            this.onExtraCallbackWithResult.add(backdropScaffoldStateExternalSyntheticLambda1);
            BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2 = this.onWarmupCompleted;
            if (bottomDrawerStateExternalSyntheticLambda2 != null) {
                backdropScaffoldStateExternalSyntheticLambda1.IAuthTabCallback(bottomDrawerStateExternalSyntheticLambda2);
                backdropScaffoldStateExternalSyntheticLambda1.onNavigationEvent(AdsMediaSource.this.new onExtraCallbackWithResult((TextFieldStateKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)));
            }
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.asInterface;
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 != null) {
                backdropScaffoldStateExternalSyntheticLambda1.onExtraCallback(new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(0), onextracallbackwithresult.onNavigationEvent));
            }
            return backdropScaffoldStateExternalSyntheticLambda1;
        }

        public void onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
            RecordingInputConnection_androidKt.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted() == 1);
            if (this.asInterface == null) {
                Object objOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onNavigationEvent(0);
                for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
                    BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1 = this.onExtraCallbackWithResult.get(i2);
                    backdropScaffoldStateExternalSyntheticLambda1.onExtraCallback(new BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult(objOnNavigationEvent, backdropScaffoldStateExternalSyntheticLambda1.onExtraCallbackWithResult.onNavigationEvent));
                }
            }
            this.asInterface = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
        }

        public long onNavigationEvent() {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.asInterface;
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 == null) {
                return -9223372036854775807L;
            }
            return coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(0, AdsMediaSource.this.IAuthTabCallback_Parcel).onNavigationEvent();
        }

        public void onExtraCallback(BackdropScaffoldStateExternalSyntheticLambda1 backdropScaffoldStateExternalSyntheticLambda1) {
            this.onExtraCallbackWithResult.remove(backdropScaffoldStateExternalSyntheticLambda1);
            backdropScaffoldStateExternalSyntheticLambda1.asInterface();
        }

        public void IAuthTabCallback() {
            if (onExtraCallbackWithResult()) {
                AdsMediaSource.this.onExtraCallback((AdsMediaSource) this.onNavigationEvent);
            }
        }

        public boolean onExtraCallbackWithResult() {
            return this.onWarmupCompleted != null;
        }

        public boolean onWarmupCompleted() {
            return this.onExtraCallbackWithResult.isEmpty();
        }
    }
}
