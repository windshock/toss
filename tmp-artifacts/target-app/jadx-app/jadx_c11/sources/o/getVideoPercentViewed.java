package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getVideoPercentViewed implements finishVideo {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<setupPaints> onExtraCallback;
    private final List<setupPaints> onNavigationEvent;

    public getVideoPercentViewed() {
        ArrayList arrayList = new ArrayList();
        this.onExtraCallback = arrayList;
        this.onNavigationEvent = arrayList;
    }

    public final List<setupPaints> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<setupPaints> list = this.onNavigationEvent;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // o.finishVideo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(@Nullable Integer num, @NotNull getBacktraceNote<? super areCachedAdResourcesMissing, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int iIntValue;
        Integer numValueOf;
        Integer numOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            int i3 = 41 / 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                setupPaints setuppaints = (setupPaints) CollectionsKt.lastOrNull(this.onExtraCallback);
                if (setuppaints == null || (numOnExtraCallback = setuppaints.onExtraCallback()) == null) {
                    int i4 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(numOnExtraCallback.intValue() + 1);
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    List<setupPaints> list = this.onExtraCallback;
                    ArrayList arrayList = new ArrayList();
                    int i6 = onWarmupCompleted + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    for (Object obj : list) {
                        if (((setupPaints) obj).onExtraCallback() != null) {
                            int i8 = onExtraCallbackWithResult + 9;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            arrayList.add(obj);
                        }
                    }
                    iIntValue = arrayList.size() + 1;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            if (num != null) {
            }
        }
        List<setupPaints> list2 = this.onExtraCallback;
        if (num != null) {
            iIntValue = num.intValue();
        }
        list2.add(new setupPaints(Integer.valueOf(iIntValue), getbacktracenote));
    }
}
