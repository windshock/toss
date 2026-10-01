package o;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.ColorsKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ChipKtExternalSyntheticLambda5 extends ChipKtExternalSyntheticLambda3 {
    private final float IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final int access000;
    private final long access100;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 asBinder;
    private BottomSheetScaffoldKtExternalSyntheticLambda7 asInterface;
    private float extraCallback;
    private long getInterfaceDescriptor;
    private final ImmutableList<onWarmupCompleted> onNavigationEvent;
    private final float onTransact;
    private final long readTypedObject;
    private int writeTypedObject;

    protected boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2, long j) {
        return ((long) i2) <= j;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public Object onNavigationEvent() {
        return null;
    }

    public static class onExtraCallbackWithResult implements ColorsKtExternalSyntheticLambda0.onExtraCallback {
        private final float IAuthTabCallback;
        private final int IAuthTabCallbackDefault;
        private final int IAuthTabCallbackStub;
        private final int asBinder;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final int onWarmupCompleted;

        public onExtraCallbackWithResult() {
            this(10000, 25000, 25000, 0.7f);
        }

        public onExtraCallbackWithResult(int i2, int i3, int i4, float f) {
            this(i2, i3, i4, 1279, 719, f, 0.75f, TextFieldDecoratorModifierNodeExternalSyntheticLambda0.onNavigationEvent);
        }

        public onExtraCallbackWithResult(int i2, int i3, int i4, int i5, int i6, float f, float f2, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
            this.IAuthTabCallbackDefault = i2;
            this.onWarmupCompleted = i3;
            this.IAuthTabCallbackStub = i4;
            this.asBinder = i5;
            this.onExtraCallbackWithResult = i6;
            this.IAuthTabCallback = f;
            this.onNavigationEvent = f2;
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
        }

        @Override // o.ColorsKtExternalSyntheticLambda0.onExtraCallback
        public final ColorsKtExternalSyntheticLambda0[] onExtraCallback(ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0IAuthTabCallback;
            ImmutableList immutableListOnNavigationEvent = ChipKtExternalSyntheticLambda5.onNavigationEvent(onnavigationeventArr);
            ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr = new ColorsKtExternalSyntheticLambda0[onnavigationeventArr.length];
            for (int i2 = 0; i2 < onnavigationeventArr.length; i2++) {
                ColorsKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent = onnavigationeventArr[i2];
                if (onnavigationevent != null) {
                    int[] iArr = onnavigationevent.onNavigationEvent;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            colorsKtExternalSyntheticLambda0IAuthTabCallback = new ChipKtExternalSyntheticLambda6(onnavigationevent.onWarmupCompleted, iArr[0], onnavigationevent.onExtraCallback);
                        } else {
                            colorsKtExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(onnavigationevent.onWarmupCompleted, iArr, onnavigationevent.onExtraCallback, composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, (ImmutableList) immutableListOnNavigationEvent.get(i2));
                        }
                        colorsKtExternalSyntheticLambda0Arr[i2] = colorsKtExternalSyntheticLambda0IAuthTabCallback;
                    }
                }
            }
            return colorsKtExternalSyntheticLambda0Arr;
        }

        protected ChipKtExternalSyntheticLambda5 IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr, int i2, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, ImmutableList<onWarmupCompleted> immutableList) {
            return new ChipKtExternalSyntheticLambda5(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iArr, i2, composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, this.IAuthTabCallbackDefault, this.onWarmupCompleted, this.IAuthTabCallbackStub, this.asBinder, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onNavigationEvent, immutableList, this.onExtraCallback);
        }
    }

    protected ChipKtExternalSyntheticLambda5(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr, int i2, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2, long j, long j2, long j3, int i3, int i4, float f, float f2, List<onWarmupCompleted> list, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda22;
        long j4;
        super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iArr, i2);
        if (j3 < j) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda22 = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
            j4 = j;
        } else {
            composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda22 = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
            j4 = j3;
        }
        this.IAuthTabCallbackStub = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda22;
        this.IAuthTabCallbackStubProxy = j * 1000;
        this.access100 = j2 * 1000;
        this.readTypedObject = j4 * 1000;
        this.access000 = i3;
        this.IAuthTabCallback_Parcel = i4;
        this.IAuthTabCallback = f;
        this.onTransact = f2;
        this.onNavigationEvent = ImmutableList.copyOf(list);
        this.asBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
        this.extraCallback = 1.0f;
        this.ICustomTabsCallback = 0;
        this.IAuthTabCallbackDefault = -9223372036854775807L;
        this.getInterfaceDescriptor = -2147483647L;
    }

    @Override // o.ChipKtExternalSyntheticLambda3, o.ColorsKtExternalSyntheticLambda0
    public void onTransact() {
        this.IAuthTabCallbackDefault = -9223372036854775807L;
        this.asInterface = null;
    }

    @Override // o.ChipKtExternalSyntheticLambda3, o.ColorsKtExternalSyntheticLambda0
    public void asInterface() {
        this.asInterface = null;
    }

    @Override // o.ChipKtExternalSyntheticLambda3, o.ColorsKtExternalSyntheticLambda0
    public void onExtraCallback(float f) {
        this.extraCallback = f;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2, long j3, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list, BottomSheetScaffoldKtExternalSyntheticLambda6[] bottomSheetScaffoldKtExternalSyntheticLambda6Arr) {
        long jIAuthTabCallback = this.asBinder.IAuthTabCallback();
        long jIAuthTabCallback2 = IAuthTabCallback(bottomSheetScaffoldKtExternalSyntheticLambda6Arr, list);
        int i2 = this.ICustomTabsCallback;
        if (i2 == 0) {
            this.ICustomTabsCallback = 1;
            this.writeTypedObject = onWarmupCompleted(jIAuthTabCallback, jIAuthTabCallback2);
            return;
        }
        int i3 = this.writeTypedObject;
        int iOnExtraCallback = list.isEmpty() ? -1 : onExtraCallback(((BottomSheetScaffoldKtExternalSyntheticLambda7) Iterables.getLast(list)).access100);
        if (iOnExtraCallback != -1) {
            i2 = ((BottomSheetScaffoldKtExternalSyntheticLambda7) Iterables.getLast(list)).getInterfaceDescriptor;
            i3 = iOnExtraCallback;
        }
        int iOnWarmupCompleted = onWarmupCompleted(jIAuthTabCallback, jIAuthTabCallback2);
        if (iOnWarmupCompleted != i3 && !onWarmupCompleted(i3, jIAuthTabCallback)) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = onNavigationEvent(i3);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2 = onNavigationEvent(iOnWarmupCompleted);
            long jOnExtraCallback = onExtraCallback(j3, jIAuthTabCallback2);
            int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2.onExtraCallback;
            int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback;
            if ((i4 > i5 && j2 < jOnExtraCallback) || (i4 < i5 && j2 >= this.access100)) {
                iOnWarmupCompleted = i3;
            }
        }
        if (iOnWarmupCompleted != i3) {
            i2 = 3;
        }
        this.ICustomTabsCallback = i2;
        this.writeTypedObject = iOnWarmupCompleted;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public int onWarmupCompleted() {
        return this.writeTypedObject;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public int onExtraCallbackWithResult() {
        return this.ICustomTabsCallback;
    }

    @Override // o.ChipKtExternalSyntheticLambda3, o.ColorsKtExternalSyntheticLambda0
    public int onExtraCallbackWithResult(long j, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        int i2;
        int i3;
        long jIAuthTabCallback = this.asBinder.IAuthTabCallback();
        if (!onNavigationEvent(jIAuthTabCallback, list)) {
            return list.size();
        }
        this.IAuthTabCallbackDefault = jIAuthTabCallback;
        this.asInterface = list.isEmpty() ? null : (BottomSheetScaffoldKtExternalSyntheticLambda7) Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(list.get(size - 1).IAuthTabCallbackStub - j, this.extraCallback);
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (jOnNavigationEvent >= jIAuthTabCallbackDefault) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = onNavigationEvent(onWarmupCompleted(jIAuthTabCallback, onExtraCallbackWithResult(list)));
            for (int i4 = 0; i4 < size; i4++) {
                BottomSheetScaffoldKtExternalSyntheticLambda7 bottomSheetScaffoldKtExternalSyntheticLambda7 = list.get(i4);
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = bottomSheetScaffoldKtExternalSyntheticLambda7.access100;
                if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(bottomSheetScaffoldKtExternalSyntheticLambda7.IAuthTabCallbackStub - j, this.extraCallback) >= jIAuthTabCallbackDefault && basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback < basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback && (i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback) != -1 && i2 <= this.IAuthTabCallback_Parcel && (i3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls) != -1 && i3 <= this.access000 && i2 < basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.ICustomTabsCallback) {
                    return i4;
                }
            }
        }
        return size;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public long IAuthTabCallbackStub() {
        return this.getInterfaceDescriptor;
    }

    protected boolean onNavigationEvent(long j, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        long j2 = this.IAuthTabCallbackDefault;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((BottomSheetScaffoldKtExternalSyntheticLambda7) Iterables.getLast(list)).equals(this.asInterface)) ? false : true;
    }

    protected long IAuthTabCallbackDefault() {
        return this.readTypedObject;
    }

    private int onWarmupCompleted(long j, long j2) {
        long jOnExtraCallback = onExtraCallback(j2);
        int i2 = 0;
        for (int i3 = 0; i3 < this.onExtraCallback; i3++) {
            if (j == Long.MIN_VALUE || !onWarmupCompleted(i3, j)) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = onNavigationEvent(i3);
                if (onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent, basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback, jOnExtraCallback)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private long onExtraCallback(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.IAuthTabCallbackStubProxy;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.onTransact), this.IAuthTabCallbackStubProxy);
    }

    private long IAuthTabCallback(BottomSheetScaffoldKtExternalSyntheticLambda6[] bottomSheetScaffoldKtExternalSyntheticLambda6Arr, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        int i2 = this.writeTypedObject;
        if (i2 < bottomSheetScaffoldKtExternalSyntheticLambda6Arr.length && bottomSheetScaffoldKtExternalSyntheticLambda6Arr[i2].IAuthTabCallbackDefault()) {
            BottomSheetScaffoldKtExternalSyntheticLambda6 bottomSheetScaffoldKtExternalSyntheticLambda6 = bottomSheetScaffoldKtExternalSyntheticLambda6Arr[this.writeTypedObject];
            return bottomSheetScaffoldKtExternalSyntheticLambda6.onExtraCallbackWithResult() - bottomSheetScaffoldKtExternalSyntheticLambda6.onExtraCallback();
        }
        for (BottomSheetScaffoldKtExternalSyntheticLambda6 bottomSheetScaffoldKtExternalSyntheticLambda62 : bottomSheetScaffoldKtExternalSyntheticLambda6Arr) {
            if (bottomSheetScaffoldKtExternalSyntheticLambda62.IAuthTabCallbackDefault()) {
                return bottomSheetScaffoldKtExternalSyntheticLambda62.onExtraCallbackWithResult() - bottomSheetScaffoldKtExternalSyntheticLambda62.onExtraCallback();
            }
        }
        return onExtraCallbackWithResult(list);
    }

    private long onExtraCallbackWithResult(List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        BottomSheetScaffoldKtExternalSyntheticLambda7 bottomSheetScaffoldKtExternalSyntheticLambda7 = (BottomSheetScaffoldKtExternalSyntheticLambda7) Iterables.getLast(list);
        long j = bottomSheetScaffoldKtExternalSyntheticLambda7.IAuthTabCallbackStub;
        if (j != -9223372036854775807L) {
            long j2 = bottomSheetScaffoldKtExternalSyntheticLambda7.IAuthTabCallbackDefault;
            if (j2 != -9223372036854775807L) {
                return j2 - j;
            }
        }
        return -9223372036854775807L;
    }

    private long onExtraCallback(long j) {
        long jIAuthTabCallback = IAuthTabCallback(j);
        if (this.onNavigationEvent.isEmpty()) {
            return jIAuthTabCallback;
        }
        int i2 = 1;
        while (i2 < this.onNavigationEvent.size() - 1 && ((onWarmupCompleted) this.onNavigationEvent.get(i2)).onExtraCallbackWithResult < jIAuthTabCallback) {
            i2++;
        }
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) this.onNavigationEvent.get(i2 - 1);
        onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) this.onNavigationEvent.get(i2);
        long j2 = onwarmupcompleted.onExtraCallbackWithResult;
        float f = (jIAuthTabCallback - j2) / (onwarmupcompleted2.onExtraCallbackWithResult - j2);
        return onwarmupcompleted.onWarmupCompleted + ((long) (f * (onwarmupcompleted2.onWarmupCompleted - r2)));
    }

    private long IAuthTabCallback(long j) {
        long jIAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallback();
        this.getInterfaceDescriptor = jIAuthTabCallback;
        long j2 = (long) (jIAuthTabCallback * this.IAuthTabCallback);
        long jOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        if (jOnExtraCallbackWithResult == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.extraCallback);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.extraCallback) - jOnExtraCallbackWithResult, 0.0f)) / f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<ImmutableList<onWarmupCompleted>> onNavigationEvent(ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr) {
        ArrayList arrayList = new ArrayList();
        for (ColorsKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent : onnavigationeventArr) {
            if (onnavigationevent != null && onnavigationevent.onNavigationEvent.length > 1) {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add(new onWarmupCompleted(0L, 0L));
                arrayList.add(builder);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrIAuthTabCallback = IAuthTabCallback(onnavigationeventArr);
        int[] iArr = new int[jArrIAuthTabCallback.length];
        long[] jArr = new long[jArrIAuthTabCallback.length];
        for (int i2 = 0; i2 < jArrIAuthTabCallback.length; i2++) {
            long[] jArr2 = jArrIAuthTabCallback[i2];
            jArr[i2] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        IAuthTabCallback(arrayList, jArr);
        ImmutableList<Integer> immutableListIAuthTabCallback = IAuthTabCallback(jArrIAuthTabCallback);
        for (int i3 = 0; i3 < immutableListIAuthTabCallback.size(); i3++) {
            int iIntValue = ((Integer) immutableListIAuthTabCallback.get(i3)).intValue();
            int i4 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i4;
            jArr[iIntValue] = jArrIAuthTabCallback[iIntValue][i4];
            IAuthTabCallback(arrayList, jArr);
        }
        for (int i5 = 0; i5 < onnavigationeventArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] << 1;
            }
        }
        IAuthTabCallback(arrayList, jArr);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i6);
            builder2.add(builder3 == null ? ImmutableList.of() : builder3.build());
        }
        return builder2.build();
    }

    private static long[][] IAuthTabCallback(ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr) {
        long[][] jArr = new long[onnavigationeventArr.length][];
        for (int i2 = 0; i2 < onnavigationeventArr.length; i2++) {
            ColorsKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent = onnavigationeventArr[i2];
            if (onnavigationevent == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[onnavigationevent.onNavigationEvent.length];
                int i3 = 0;
                while (true) {
                    int[] iArr = onnavigationevent.onNavigationEvent;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    long j = onnavigationevent.onWarmupCompleted.IAuthTabCallback(iArr[i3]).onExtraCallback;
                    long[] jArr2 = jArr[i2];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i3] = j;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    private static ImmutableList<Integer> IAuthTabCallback(long[][] jArr) {
        ListMultimap listMultimapBuild = MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long[] jArr2 = jArr[i2];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    long[] jArr3 = jArr[i2];
                    double dLog = 0.0d;
                    if (i3 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i3];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i3] = dLog;
                    i3++;
                }
                int i4 = length - 1;
                double d = dArr[i4] - dArr[0];
                int i5 = 0;
                while (i5 < i4) {
                    double d2 = dArr[i5];
                    i5++;
                    listMultimapBuild.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i5]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i2));
                }
            }
        }
        return ImmutableList.copyOf(listMultimapBuild.values());
    }

    private static void IAuthTabCallback(List<ImmutableList.Builder<onWarmupCompleted>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ImmutableList.Builder<onWarmupCompleted> builder = list.get(i2);
            if (builder != null) {
                builder.add(new onWarmupCompleted(j, jArr[i2]));
            }
        }
    }

    public static final class onWarmupCompleted {
        public final long onExtraCallbackWithResult;
        public final long onWarmupCompleted;

        public onWarmupCompleted(long j, long j2) {
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return this.onExtraCallbackWithResult == onwarmupcompleted.onExtraCallbackWithResult && this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted;
        }

        public int hashCode() {
            return (((int) this.onExtraCallbackWithResult) * 31) + ((int) this.onWarmupCompleted);
        }
    }
}
