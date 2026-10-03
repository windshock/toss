package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SubsamplingScaleImageView1;
import o.access2702;
import o.access3102;
import o.access3302;
import o.access3502;
import o.access3602;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class setScaleAndCenter extends exitAllPages<NativeKeyboardObserverSpec> {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;

    public interface onNavigationEvent extends access2702.onExtraCallback, SubsamplingScaleImageView1.onNavigationEvent, access3302.IAuthTabCallback, access3602.onWarmupCompleted {
    }

    protected boolean onWarmupCompleted() {
        return false;
    }

    public setScaleAndCenter(@NotNull onNavigationEvent onnavigationevent, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setHasStableIds(true);
        new access3602(this, onnavigationevent != null ? onnavigationevent : null).onNavigationEvent();
        onExtraCallbackWithResult(new SubsamplingScaleImageViewAnim(this, onWarmupCompleted()).onExtraCallbackWithResult());
        new access3302(this, onnavigationevent, str).IAuthTabCallback();
        onExtraCallbackWithResult(new access2702(this, onnavigationevent, z).IAuthTabCallback());
        new access3102(this, onnavigationevent instanceof access3102.onExtraCallback ? (access3102.onExtraCallback) onnavigationevent : null).onExtraCallback();
        new access3202(this).onExtraCallback();
        new access3502(this, onnavigationevent instanceof access3502.onExtraCallback ? (access3502.onExtraCallback) onnavigationevent : null).onNavigationEvent();
        new SubsamplingScaleImageView1(this, onnavigationevent).onNavigationEvent();
    }

    public /* synthetic */ setScaleAndCenter(onNavigationEvent onnavigationevent, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onnavigationevent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }

    public long getItemId(int i) {
        return ((NativeKeyboardObserverSpec) ((List) ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted).get(i)).IAuthTabCallback();
    }

    public final ArrayList<NativeKeyboardObserverSpec> onExtraCallback(@NotNull NativeReactDevToolsSettingsManagerSpec nativeReactDevToolsSettingsManagerSpec, @Nullable access3602.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(nativeReactDevToolsSettingsManagerSpec, "");
        ArrayList<NativeKeyboardObserverSpec> arrayList = new ArrayList<>();
        if (iAuthTabCallback != null) {
            arrayList.add(iAuthTabCallback);
        }
        for (NativeRedBoxSpec nativeRedBoxSpec : nativeReactDevToolsSettingsManagerSpec.asInterface()) {
            arrayList.add(nativeRedBoxSpec);
            arrayList.addAll(onExtraCallback(nativeRedBoxSpec.IAuthTabCallbackDefault()));
        }
        return arrayList;
    }

    public final ArrayList<NativeKeyboardObserverSpec> onExtraCallback(@NotNull List<formatToParts> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<NativeKeyboardObserverSpec> arrayList = new ArrayList<>();
        for (formatToParts formattoparts : list) {
            arrayList.add(formattoparts);
            if (formattoparts.onExtraCallback() != null) {
                NativeVibrationSpec nativeVibrationSpecOnExtraCallback = formattoparts.onExtraCallback();
                Intrinsics.checkNotNull(nativeVibrationSpecOnExtraCallback);
                arrayList.add(new SubsamplingScaleImageView1.onExtraCallback(formattoparts, nativeVibrationSpecOnExtraCallback));
            }
        }
        return arrayList;
    }
}
