package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BackdropScaffoldKtExternalSyntheticLambda25;
import o.BackdropScaffoldKtExternalSyntheticLambda3;
import o.BackdropScaffoldKtExternalSyntheticLambda5;
import o.BackdropScaffoldKtExternalSyntheticLambda8;
import o.BackdropScaffoldStateExternalSyntheticLambda2;
import o.BottomDrawerStateCompanionExternalSyntheticLambda1;
import o.BottomDrawerStateExternalSyntheticLambda1;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda3;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.RecordingInputConnection_androidKt;
import o.TextFieldSelectionStateExternalSyntheticLambda7;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MergingMediaSource extends BackdropScaffoldKtExternalSyntheticLambda5<Integer> {
    private static final TextFieldStateKtExternalSyntheticLambda0 onWarmupCompleted = new TextFieldStateKtExternalSyntheticLambda0.onWarmupCompleted().onExtraCallback("MergingMediaSource").onWarmupCompleted();
    private final Map<Object, Long> IAuthTabCallback;
    private final BottomDrawerStateExternalSyntheticLambda2[] IAuthTabCallbackDefault;
    private final List<List<onExtraCallback>> IAuthTabCallbackStub;
    private long[][] IAuthTabCallback_Parcel;
    private int access100;
    private final ArrayList<BottomDrawerStateExternalSyntheticLambda2> asBinder;
    private IllegalMergeException asInterface;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] getInterfaceDescriptor;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Multimap<Object, BackdropScaffoldKtExternalSyntheticLambda25> onNavigationEvent;
    private final BackdropScaffoldKtExternalSyntheticLambda3 onTransact;

    public static final class IllegalMergeException extends IOException {
        public final int reason;

        public IllegalMergeException(int i2) {
            this.reason = i2;
        }
    }

    public MergingMediaSource(BottomDrawerStateExternalSyntheticLambda2... bottomDrawerStateExternalSyntheticLambda2Arr) {
        this(false, bottomDrawerStateExternalSyntheticLambda2Arr);
    }

    public MergingMediaSource(boolean z, BottomDrawerStateExternalSyntheticLambda2... bottomDrawerStateExternalSyntheticLambda2Arr) {
        this(z, false, bottomDrawerStateExternalSyntheticLambda2Arr);
    }

    public MergingMediaSource(boolean z, boolean z2, BottomDrawerStateExternalSyntheticLambda2... bottomDrawerStateExternalSyntheticLambda2Arr) {
        this(z, z2, new BackdropScaffoldKtExternalSyntheticLambda8(), bottomDrawerStateExternalSyntheticLambda2Arr);
    }

    public MergingMediaSource(boolean z, boolean z2, BackdropScaffoldKtExternalSyntheticLambda3 backdropScaffoldKtExternalSyntheticLambda3, BottomDrawerStateExternalSyntheticLambda2... bottomDrawerStateExternalSyntheticLambda2Arr) {
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = z2;
        this.IAuthTabCallbackDefault = bottomDrawerStateExternalSyntheticLambda2Arr;
        this.onTransact = backdropScaffoldKtExternalSyntheticLambda3;
        this.asBinder = new ArrayList<>(Arrays.asList(bottomDrawerStateExternalSyntheticLambda2Arr));
        this.access100 = -1;
        this.IAuthTabCallbackStub = new ArrayList(bottomDrawerStateExternalSyntheticLambda2Arr.length);
        for (int i2 = 0; i2 < bottomDrawerStateExternalSyntheticLambda2Arr.length; i2++) {
            this.IAuthTabCallbackStub.add(new ArrayList());
        }
        this.getInterfaceDescriptor = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[bottomDrawerStateExternalSyntheticLambda2Arr.length];
        this.IAuthTabCallback_Parcel = new long[0][];
        this.IAuthTabCallback = new HashMap();
        this.onNavigationEvent = MultimapBuilder.hashKeys().arrayListValues().build();
    }

    public TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent() {
        BottomDrawerStateExternalSyntheticLambda2[] bottomDrawerStateExternalSyntheticLambda2Arr = this.IAuthTabCallbackDefault;
        return bottomDrawerStateExternalSyntheticLambda2Arr.length > 0 ? bottomDrawerStateExternalSyntheticLambda2Arr[0].onNavigationEvent() : onWarmupCompleted;
    }

    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        BottomDrawerStateExternalSyntheticLambda2[] bottomDrawerStateExternalSyntheticLambda2Arr = this.IAuthTabCallbackDefault;
        return bottomDrawerStateExternalSyntheticLambda2Arr.length > 0 && bottomDrawerStateExternalSyntheticLambda2Arr[0].IAuthTabCallback(textFieldStateKtExternalSyntheticLambda0);
    }

    public void onExtraCallbackWithResult(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        this.IAuthTabCallbackDefault[0].onExtraCallbackWithResult(textFieldStateKtExternalSyntheticLambda0);
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5, o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        super.onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda7);
        for (int i2 = 0; i2 < this.IAuthTabCallbackDefault.length; i2++) {
            onNavigationEvent((MergingMediaSource) Integer.valueOf(i2), this.IAuthTabCallbackDefault[i2]);
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5
    public void onExtraCallback() throws IOException {
        IllegalMergeException illegalMergeException = this.asInterface;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.onExtraCallback();
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        int length = this.IAuthTabCallbackDefault.length;
        BottomDrawerStateCompanionExternalSyntheticLambda1[] bottomDrawerStateCompanionExternalSyntheticLambda1Arr = new BottomDrawerStateCompanionExternalSyntheticLambda1[length];
        int iIAuthTabCallback = this.getInterfaceDescriptor[0].IAuthTabCallback(onextracallbackwithresult.onExtraCallback);
        for (int i2 = 0; i2 < length; i2++) {
            BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(this.getInterfaceDescriptor[i2].onNavigationEvent(iIAuthTabCallback));
            bottomDrawerStateCompanionExternalSyntheticLambda1Arr[i2] = this.IAuthTabCallbackDefault[i2].onExtraCallbackWithResult(onextracallbackwithresultOnWarmupCompleted, composableSingletonsScaffoldKtExternalSyntheticLambda3, j - this.IAuthTabCallback_Parcel[iIAuthTabCallback][i2]);
            this.IAuthTabCallbackStub.get(i2).add(new onExtraCallback(onextracallbackwithresultOnWarmupCompleted, bottomDrawerStateCompanionExternalSyntheticLambda1Arr[i2]));
        }
        BottomDrawerStateExternalSyntheticLambda1 bottomDrawerStateExternalSyntheticLambda1 = new BottomDrawerStateExternalSyntheticLambda1(this.onTransact, this.IAuthTabCallback_Parcel[iIAuthTabCallback], bottomDrawerStateCompanionExternalSyntheticLambda1Arr);
        if (!this.onExtraCallback) {
            return bottomDrawerStateExternalSyntheticLambda1;
        }
        BackdropScaffoldKtExternalSyntheticLambda25 backdropScaffoldKtExternalSyntheticLambda25 = new BackdropScaffoldKtExternalSyntheticLambda25(bottomDrawerStateExternalSyntheticLambda1, false, 0L, ((Long) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.get(onextracallbackwithresult.onExtraCallback))).longValue());
        this.onNavigationEvent.put(onextracallbackwithresult.onExtraCallback, backdropScaffoldKtExternalSyntheticLambda25);
        return backdropScaffoldKtExternalSyntheticLambda25;
    }

    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        if (this.onExtraCallback) {
            BackdropScaffoldKtExternalSyntheticLambda25 backdropScaffoldKtExternalSyntheticLambda25 = (BackdropScaffoldKtExternalSyntheticLambda25) bottomDrawerStateCompanionExternalSyntheticLambda1;
            Iterator it = this.onNavigationEvent.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((BackdropScaffoldKtExternalSyntheticLambda25) entry.getValue()).equals(backdropScaffoldKtExternalSyntheticLambda25)) {
                    this.onNavigationEvent.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            bottomDrawerStateCompanionExternalSyntheticLambda1 = backdropScaffoldKtExternalSyntheticLambda25.onWarmupCompleted;
        }
        BottomDrawerStateExternalSyntheticLambda1 bottomDrawerStateExternalSyntheticLambda1 = (BottomDrawerStateExternalSyntheticLambda1) bottomDrawerStateCompanionExternalSyntheticLambda1;
        for (int i2 = 0; i2 < this.IAuthTabCallbackDefault.length; i2++) {
            List<onExtraCallback> list = this.IAuthTabCallbackStub.get(i2);
            BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1OnExtraCallback = bottomDrawerStateExternalSyntheticLambda1.onExtraCallback(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                if (list.get(i3).IAuthTabCallback.equals(bottomDrawerStateCompanionExternalSyntheticLambda1OnExtraCallback)) {
                    list.remove(i3);
                    break;
                }
                i3++;
            }
            this.IAuthTabCallbackDefault[i2].onExtraCallbackWithResult(bottomDrawerStateExternalSyntheticLambda1.onExtraCallback(i2));
        }
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5, o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        Arrays.fill(this.getInterfaceDescriptor, (Object) null);
        this.access100 = -1;
        this.asInterface = null;
        this.asBinder.clear();
        Collections.addAll(this.asBinder, this.IAuthTabCallbackDefault);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(Integer num, BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        if (this.asInterface == null) {
            if (this.access100 == -1) {
                this.access100 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted();
            } else if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted() != this.access100) {
                this.asInterface = new IllegalMergeException(0);
                return;
            }
            if (this.IAuthTabCallback_Parcel.length == 0) {
                this.IAuthTabCallback_Parcel = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.access100, this.getInterfaceDescriptor.length);
            }
            this.asBinder.remove(bottomDrawerStateExternalSyntheticLambda2);
            this.getInterfaceDescriptor[num.intValue()] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
            if (this.asBinder.isEmpty()) {
                if (this.onExtraCallbackWithResult) {
                    asInterface();
                }
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onwarmupcompleted = this.getInterfaceDescriptor[0];
                if (this.onExtraCallback) {
                    getInterfaceDescriptor();
                    onwarmupcompleted = new onWarmupCompleted(onwarmupcompleted, this.IAuthTabCallback);
                }
                onNavigationEvent(onwarmupcompleted);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent(Integer num, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        List<onExtraCallback> list = this.IAuthTabCallbackStub.get(num.intValue());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).onWarmupCompleted.equals(onextracallbackwithresult)) {
                return this.IAuthTabCallbackStub.get(0).get(i2).onWarmupCompleted;
            }
        }
        return null;
    }

    private void asInterface() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        for (int i2 = 0; i2 < this.access100; i2++) {
            long j = -this.getInterfaceDescriptor[0].IAuthTabCallback(i2, onextracallback).onWarmupCompleted();
            int i3 = 1;
            while (true) {
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr = this.getInterfaceDescriptor;
                if (i3 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr.length) {
                    this.IAuthTabCallback_Parcel[i2][i3] = j - (-coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr[i3].IAuthTabCallback(i2, onextracallback).onWarmupCompleted());
                    i3++;
                }
            }
        }
    }

    private void getInterfaceDescriptor() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        for (int i2 = 0; i2 < this.access100; i2++) {
            int i3 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr = this.getInterfaceDescriptor;
                if (i3 >= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr.length) {
                    break;
                }
                long jOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr[i3].IAuthTabCallback(i2, onextracallback).onNavigationEvent();
                if (jOnNavigationEvent != -9223372036854775807L) {
                    long j2 = jOnNavigationEvent + this.IAuthTabCallback_Parcel[i2][i3];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i3++;
            }
            Object objOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10Arr[0].onNavigationEvent(i2);
            this.IAuthTabCallback.put(objOnNavigationEvent, Long.valueOf(j));
            Iterator it = this.onNavigationEvent.get(objOnNavigationEvent).iterator();
            while (it.hasNext()) {
                ((BackdropScaffoldKtExternalSyntheticLambda25) it.next()).onExtraCallbackWithResult(0L, j);
            }
        }
    }

    static final class onWarmupCompleted extends BackdropScaffoldStateExternalSyntheticLambda2 {
        private final long[] IAuthTabCallback;
        private final long[] onNavigationEvent;

        public onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Map<Object, Long> map) {
            super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            int iOnExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult();
            this.onNavigationEvent = new long[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult()];
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
            for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
                this.onNavigationEvent[i2] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i2, iAuthTabCallback).onExtraCallbackWithResult;
            }
            int iOnWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted();
            this.IAuthTabCallback = new long[iOnWarmupCompleted];
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
            for (int i3 = 0; i3 < iOnWarmupCompleted; i3++) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i3, onextracallback, true);
                long jLongValue = ((Long) RecordingInputConnection_androidKt.onExtraCallbackWithResult(map.get(onextracallback.asBinder))).longValue();
                long[] jArr = this.IAuthTabCallback;
                jLongValue = jLongValue == Long.MIN_VALUE ? onextracallback.IAuthTabCallback : jLongValue;
                jArr[i3] = jLongValue;
                long j = onextracallback.IAuthTabCallback;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.onNavigationEvent;
                    int i4 = onextracallback.IAuthTabCallbackStub;
                    jArr2[i4] = jArr2[i4] - (j - jLongValue);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
            long jMin;
            super.onWarmupCompleted(i2, iAuthTabCallback, j);
            long j2 = this.onNavigationEvent[i2];
            iAuthTabCallback.onExtraCallbackWithResult = j2;
            if (j2 != -9223372036854775807L) {
                long j3 = iAuthTabCallback.onExtraCallback;
                if (j3 == -9223372036854775807L) {
                    jMin = iAuthTabCallback.onExtraCallback;
                } else {
                    jMin = Math.min(j3, j2);
                }
            }
            iAuthTabCallback.onExtraCallback = jMin;
            return iAuthTabCallback;
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
            super.IAuthTabCallback(i2, onextracallback, z);
            onextracallback.IAuthTabCallback = this.IAuthTabCallback[i2];
            return onextracallback;
        }
    }

    static final class onExtraCallback {
        private final BottomDrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback;
        private final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onWarmupCompleted;

        private onExtraCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
            this.onWarmupCompleted = onextracallbackwithresult;
            this.IAuthTabCallback = bottomDrawerStateCompanionExternalSyntheticLambda1;
        }
    }
}
