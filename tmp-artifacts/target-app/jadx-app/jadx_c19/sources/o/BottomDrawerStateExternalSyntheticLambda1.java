package o;

import androidx.annotation.Nullable;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomDrawerStateCompanionExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomDrawerStateExternalSyntheticLambda1 implements BottomDrawerStateCompanionExternalSyntheticLambda1, BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted {
    private BottomSheetScaffoldKtExternalSyntheticLambda11 IAuthTabCallbackDefault;
    private final BottomDrawerStateCompanionExternalSyntheticLambda1[] IAuthTabCallbackStub;
    private BottomNavigationKtExternalSyntheticLambda8 onExtraCallbackWithResult;
    private BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted onNavigationEvent;
    private final boolean[] onTransact;
    private final BackdropScaffoldKtExternalSyntheticLambda3 onWarmupCompleted;
    private final ArrayList<BottomDrawerStateCompanionExternalSyntheticLambda1> onExtraCallback = new ArrayList<>();
    private final HashMap<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1> IAuthTabCallback = new HashMap<>();
    private final IdentityHashMap<BottomNavigationKtExternalSyntheticLambda5, Integer> asInterface = new IdentityHashMap<>();
    private BottomDrawerStateCompanionExternalSyntheticLambda1[] asBinder = new BottomDrawerStateCompanionExternalSyntheticLambda1[0];

    public BottomDrawerStateExternalSyntheticLambda1(BackdropScaffoldKtExternalSyntheticLambda3 backdropScaffoldKtExternalSyntheticLambda3, long[] jArr, BottomDrawerStateCompanionExternalSyntheticLambda1... bottomDrawerStateCompanionExternalSyntheticLambda1Arr) {
        this.onWarmupCompleted = backdropScaffoldKtExternalSyntheticLambda3;
        this.IAuthTabCallbackStub = bottomDrawerStateCompanionExternalSyntheticLambda1Arr;
        this.onExtraCallbackWithResult = backdropScaffoldKtExternalSyntheticLambda3.onExtraCallback();
        this.onTransact = new boolean[bottomDrawerStateCompanionExternalSyntheticLambda1Arr.length];
        for (int i2 = 0; i2 < bottomDrawerStateCompanionExternalSyntheticLambda1Arr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.onTransact[i2] = true;
                this.IAuthTabCallbackStub[i2] = new BottomSheetScaffoldKtExternalSyntheticLambda1(bottomDrawerStateCompanionExternalSyntheticLambda1Arr[i2], j);
            }
        }
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallback(int i2) {
        if (this.onTransact[i2]) {
            return ((BottomSheetScaffoldKtExternalSyntheticLambda1) this.IAuthTabCallbackStub[i2]).asInterface();
        }
        return this.IAuthTabCallbackStub[i2];
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        this.onNavigationEvent = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
        Collections.addAll(this.onExtraCallback, this.IAuthTabCallbackStub);
        for (BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 : this.IAuthTabCallbackStub) {
            bottomDrawerStateCompanionExternalSyntheticLambda1.onExtraCallback(this, j);
        }
    }

    public void onNavigationEvent() throws IOException {
        for (BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 : this.IAuthTabCallbackStub) {
            bottomDrawerStateCompanionExternalSyntheticLambda1.onNavigationEvent();
        }
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        return (BottomSheetScaffoldKtExternalSyntheticLambda11) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5;
        int[] iArr = new int[colorsKtExternalSyntheticLambda0Arr.length];
        int[] iArr2 = new int[colorsKtExternalSyntheticLambda0Arr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            bottomNavigationKtExternalSyntheticLambda5 = null;
            if (i3 >= colorsKtExternalSyntheticLambda0Arr.length) {
                break;
            }
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda52 = bottomNavigationKtExternalSyntheticLambda5Arr[i3];
            Integer num = bottomNavigationKtExternalSyntheticLambda52 != null ? this.asInterface.get(bottomNavigationKtExternalSyntheticLambda52) : null;
            iArr[i3] = num == null ? -1 : num.intValue();
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i3];
            if (colorsKtExternalSyntheticLambda0 != null) {
                String str = colorsKtExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        this.asInterface.clear();
        int length = colorsKtExternalSyntheticLambda0Arr.length;
        BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr2 = new BottomNavigationKtExternalSyntheticLambda5[length];
        BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr3 = new BottomNavigationKtExternalSyntheticLambda5[colorsKtExternalSyntheticLambda0Arr.length];
        ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr2 = new ColorsKtExternalSyntheticLambda0[colorsKtExternalSyntheticLambda0Arr.length];
        ArrayList arrayList = new ArrayList(this.IAuthTabCallbackStub.length);
        long j2 = j;
        int i4 = 0;
        ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr3 = colorsKtExternalSyntheticLambda0Arr2;
        while (i4 < this.IAuthTabCallbackStub.length) {
            for (int i5 = i2; i5 < colorsKtExternalSyntheticLambda0Arr.length; i5++) {
                bottomNavigationKtExternalSyntheticLambda5Arr3[i5] = iArr[i5] == i4 ? bottomNavigationKtExternalSyntheticLambda5Arr[i5] : bottomNavigationKtExternalSyntheticLambda5;
                if (iArr2[i5] == i4) {
                    ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda02 = (ColorsKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(colorsKtExternalSyntheticLambda0Arr[i5]);
                    colorsKtExternalSyntheticLambda0Arr3[i5] = new onExtraCallback(colorsKtExternalSyntheticLambda02, (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.get(colorsKtExternalSyntheticLambda02.onExtraCallback())));
                } else {
                    colorsKtExternalSyntheticLambda0Arr3[i5] = bottomNavigationKtExternalSyntheticLambda5;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr4 = colorsKtExternalSyntheticLambda0Arr3;
            long jIAuthTabCallback = this.IAuthTabCallbackStub[i4].IAuthTabCallback(colorsKtExternalSyntheticLambda0Arr3, zArr, bottomNavigationKtExternalSyntheticLambda5Arr3, zArr2, j2);
            if (i6 == 0) {
                j2 = jIAuthTabCallback;
            } else if (jIAuthTabCallback != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < colorsKtExternalSyntheticLambda0Arr.length; i7++) {
                if (iArr2[i7] == i6) {
                    BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda53 = (BottomNavigationKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda5Arr3[i7]);
                    bottomNavigationKtExternalSyntheticLambda5Arr2[i7] = bottomNavigationKtExternalSyntheticLambda5Arr3[i7];
                    this.asInterface.put(bottomNavigationKtExternalSyntheticLambda53, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda5Arr3[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.IAuthTabCallbackStub[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            colorsKtExternalSyntheticLambda0Arr3 = colorsKtExternalSyntheticLambda0Arr4;
            i2 = 0;
            bottomNavigationKtExternalSyntheticLambda5 = null;
        }
        int i8 = i2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(bottomNavigationKtExternalSyntheticLambda5Arr2, i8, bottomNavigationKtExternalSyntheticLambda5Arr, i8, length);
        this.asBinder = (BottomDrawerStateCompanionExternalSyntheticLambda1[]) arrayList3.toArray(new BottomDrawerStateCompanionExternalSyntheticLambda1[i8]);
        this.onExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(arrayList3, Lists.transform(arrayList3, new Function() { // from class: androidx.media3.exoplayer.source.MergingMediaPeriod$$ExternalSyntheticLambda0
            public final Object apply(Object obj) {
                return ((BottomDrawerStateCompanionExternalSyntheticLambda1) obj).ab_().onExtraCallbackWithResult();
            }
        }));
        return j2;
    }

    public void onExtraCallback(long j, boolean z) {
        for (BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 : this.asBinder) {
            bottomDrawerStateCompanionExternalSyntheticLambda1.onExtraCallback(j, z);
        }
    }

    public void IAuthTabCallback(long j) {
        this.onExtraCallbackWithResult.IAuthTabCallback(j);
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        if (!this.onExtraCallback.isEmpty()) {
            int size = this.onExtraCallback.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.onExtraCallback.get(i2).IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
            }
            return false;
        }
        return this.onExtraCallbackWithResult.IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    public long onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback();
    }

    public long IAuthTabCallbackStub() {
        long j = -9223372036854775807L;
        for (BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 : this.asBinder) {
            long jIAuthTabCallbackStub = bottomDrawerStateCompanionExternalSyntheticLambda1.IAuthTabCallbackStub();
            if (jIAuthTabCallbackStub == -9223372036854775807L) {
                if (j != -9223372036854775807L && bottomDrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda12 : this.asBinder) {
                    if (bottomDrawerStateCompanionExternalSyntheticLambda12 == bottomDrawerStateCompanionExternalSyntheticLambda1) {
                        break;
                    }
                    if (bottomDrawerStateCompanionExternalSyntheticLambda12.onExtraCallbackWithResult(jIAuthTabCallbackStub) != jIAuthTabCallbackStub) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jIAuthTabCallbackStub;
            } else if (jIAuthTabCallbackStub != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    public long onWarmupCompleted() {
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    public long onExtraCallbackWithResult(long j) {
        long jOnExtraCallbackWithResult = this.asBinder[0].onExtraCallbackWithResult(j);
        int i2 = 1;
        while (true) {
            BottomDrawerStateCompanionExternalSyntheticLambda1[] bottomDrawerStateCompanionExternalSyntheticLambda1Arr = this.asBinder;
            if (i2 >= bottomDrawerStateCompanionExternalSyntheticLambda1Arr.length) {
                return jOnExtraCallbackWithResult;
            }
            if (bottomDrawerStateCompanionExternalSyntheticLambda1Arr[i2].onExtraCallbackWithResult(jOnExtraCallbackWithResult) != jOnExtraCallbackWithResult) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        BottomDrawerStateCompanionExternalSyntheticLambda1[] bottomDrawerStateCompanionExternalSyntheticLambda1Arr = this.asBinder;
        return (bottomDrawerStateCompanionExternalSyntheticLambda1Arr.length > 0 ? bottomDrawerStateCompanionExternalSyntheticLambda1Arr[0] : this.IAuthTabCallbackStub[0]).onExtraCallback(j, selectionContainerKtExternalSyntheticLambda2);
    }

    @Override // o.BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted
    public void IAuthTabCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        this.onExtraCallback.remove(bottomDrawerStateCompanionExternalSyntheticLambda1);
        if (!this.onExtraCallback.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda12 : this.IAuthTabCallbackStub) {
            i2 += bottomDrawerStateCompanionExternalSyntheticLambda12.ab_().onExtraCallbackWithResult;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            BottomDrawerStateCompanionExternalSyntheticLambda1[] bottomDrawerStateCompanionExternalSyntheticLambda1Arr = this.IAuthTabCallbackStub;
            if (i3 < bottomDrawerStateCompanionExternalSyntheticLambda1Arr.length) {
                BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11Ab_ = bottomDrawerStateCompanionExternalSyntheticLambda1Arr[i3].ab_();
                int i5 = bottomSheetScaffoldKtExternalSyntheticLambda11Ab_.onExtraCallbackWithResult;
                int i6 = 0;
                while (i6 < i5) {
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted = bottomSheetScaffoldKtExternalSyntheticLambda11Ab_.onWarmupCompleted(i6);
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted];
                    for (int i7 = 0; i7 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted; i7++) {
                        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback(i7);
                        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.onExtraCallback();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.readTypedObject;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i7] = onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult(sb.toString()).onNavigationEvent();
                    }
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(i3 + ":" + coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onExtraCallbackWithResult, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr);
                    this.IAuthTabCallback.put(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted);
                    coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i4] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1;
                    i6++;
                    i4++;
                }
                i3++;
            } else {
                this.IAuthTabCallbackDefault = new BottomSheetScaffoldKtExternalSyntheticLambda11(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr);
                ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).IAuthTabCallback(this);
                return;
            }
        }
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda8$onExtraCallback
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onWarmupCompleted(this);
    }

    static final class onExtraCallback extends ChipKtExternalSyntheticLambda8 {
        private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onExtraCallback;

        public onExtraCallback(ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) {
            super(colorsKtExternalSyntheticLambda0);
            this.onExtraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1;
        }

        @Override // o.ChipKtExternalSyntheticLambda8, o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onExtraCallback() {
            return this.onExtraCallback;
        }

        @Override // o.ChipKtExternalSyntheticLambda8, o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
        public BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent(int i2) {
            return this.onExtraCallback.IAuthTabCallback(IAuthTabCallbackDefault().onWarmupCompleted(i2));
        }

        @Override // o.ChipKtExternalSyntheticLambda8, o.ColorsKtExternalSyntheticLambda0
        public BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback() {
            return this.onExtraCallback.IAuthTabCallback(IAuthTabCallbackDefault().asBinder());
        }

        @Override // o.ChipKtExternalSyntheticLambda8
        public boolean equals(@Nullable Object obj) {
            if (super.equals(obj) && (obj instanceof onExtraCallback)) {
                return this.onExtraCallback.equals(((onExtraCallback) obj).onExtraCallback);
            }
            return false;
        }

        @Override // o.ChipKtExternalSyntheticLambda8
        public int hashCode() {
            return (super.hashCode() * 31) + this.onExtraCallback.hashCode();
        }
    }
}
