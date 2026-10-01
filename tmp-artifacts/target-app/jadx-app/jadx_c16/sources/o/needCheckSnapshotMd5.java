package o;

import android.content.Context;
import im.toss.features.home.ui.R;
import im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2AssetAccessibility$;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.UpdatePluginCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class needCheckSnapshotMd5 {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private final boolean IAuthTabCallback;
    private final Function1<Integer, Unit> IAuthTabCallbackStub;
    private final Function1<String, Unit> asBinder;
    private final boolean onExtraCallback;
    private final List<UpdatePluginCallback.IAuthTabCallback> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onWarmupCompleted;

    public static /* synthetic */ boolean onExtraCallback(needCheckSnapshotMd5 needchecksnapshotmd5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(needchecksnapshotmd5);
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(needchecksnapshotmd5);
        int i3 = IAuthTabCallbackDefault + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(needCheckSnapshotMd5 needchecksnapshotmd5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(needchecksnapshotmd5);
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ boolean onNavigationEvent(needCheckSnapshotMd5 needchecksnapshotmd5, UpdatePluginCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(needchecksnapshotmd5, iAuthTabCallback);
        int i4 = onTransact + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof needCheckSnapshotMd5)) {
            int i5 = i3 + 93;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        needCheckSnapshotMd5 needchecksnapshotmd5 = (needCheckSnapshotMd5) obj;
        if (this.onNavigationEvent != needchecksnapshotmd5.onNavigationEvent || (!Intrinsics.areEqual(this.onWarmupCompleted, needchecksnapshotmd5.onWarmupCompleted))) {
            return false;
        }
        if (this.IAuthTabCallback != needchecksnapshotmd5.IAuthTabCallback) {
            int i7 = IAuthTabCallbackDefault + 103;
            onTransact = i7 % 128;
            return i7 % 2 == 0;
        }
        if (this.onExtraCallback != needchecksnapshotmd5.onExtraCallback || (!Intrinsics.areEqual(this.onExtraCallbackWithResult, needchecksnapshotmd5.onExtraCallbackWithResult))) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackStub, needchecksnapshotmd5.IAuthTabCallbackStub)) {
            return Intrinsics.areEqual(this.asBinder, needchecksnapshotmd5.asBinder);
        }
        int i8 = onTransact + 43;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Integer.hashCode(this.onNavigationEvent) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.asBinder.hashCode();
        int i4 = IAuthTabCallbackDefault + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AssetHomeEditV2AssetAccessibility(index=" + this.onNavigationEvent + ", item=" + this.onWarmupCompleted + ", canMoveUp=" + this.IAuthTabCallback + ", canMoveDown=" + this.onExtraCallback + ", moveableCategories=" + this.onExtraCallbackWithResult + ", onMoveIndex=" + this.IAuthTabCallbackStub + ", onMoveSection=" + this.asBinder + ")";
        int i2 = onTransact + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public needCheckSnapshotMd5(int i, @NotNull UpdatePluginCallback.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, @NotNull List<? extends UpdatePluginCallback.IAuthTabCallback> list, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super String, Unit> function12) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onNavigationEvent = i;
        this.onWarmupCompleted = onextracallbackwithresult;
        this.IAuthTabCallback = z;
        this.onExtraCallback = z2;
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallbackStub = function1;
        this.asBinder = function12;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[PHI: r5 r7
      0x0082: PHI (r5v8 o.UpdatePluginCallback$IAuthTabCallback) = (r5v5 o.UpdatePluginCallback$IAuthTabCallback), (r5v10 o.UpdatePluginCallback$IAuthTabCallback) binds: [B:21:0x0080, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r7v22 boolean) = (r7v1 boolean), (r7v23 boolean) binds: [B:21:0x0080, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<DefaultSurfaceProcessorFactoryExternalSyntheticLambda0> onNavigationEvent(@NotNull Context context) {
        UpdatePluginCallback.IAuthTabCallback iAuthTabCallback;
        boolean z;
        UpdatePluginCallback.IAuthTabCallback.onExtraCallback onextracallback;
        UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted onwarmupcompleted;
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            CollectionsKt.createListBuilder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (this.IAuthTabCallback) {
            String string = context.getString(R.string.home_ui_asset_home_edit_v2_accessibility_action_move_up);
            Intrinsics.checkNotNullExpressionValue(string, "");
            listCreateListBuilder.add(new DefaultSurfaceProcessorFactoryExternalSyntheticLambda0(string, new AssetHomeEditV2AssetAccessibility$.ExternalSyntheticLambda0(this)));
        }
        if (this.onExtraCallback) {
            String string2 = context.getString(R.string.home_ui_asset_home_edit_v2_accessibility_action_move_down);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listCreateListBuilder.add(new DefaultSurfaceProcessorFactoryExternalSyntheticLambda0(string2, new AssetHomeEditV2AssetAccessibility$.ExternalSyntheticLambda1(this)));
        }
        Iterator<T> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int i3 = IAuthTabCallbackDefault + 87;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                iAuthTabCallback = (UpdatePluginCallback.IAuthTabCallback) it.next();
                z = iAuthTabCallback instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallback;
                int i4 = 0 / 0;
                if (!z) {
                    if (!(iAuthTabCallback instanceof UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted)) {
                        continue;
                    }
                }
                onextracallback = !z ? (UpdatePluginCallback.IAuthTabCallback.onExtraCallback) iAuthTabCallback : null;
                if (onextracallback != null || (strOnWarmupCompleted = onextracallback.onNavigationEvent()) == null) {
                    if (iAuthTabCallback instanceof UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) {
                        onwarmupcompleted = null;
                    } else {
                        int i5 = IAuthTabCallbackDefault + 45;
                        onTransact = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        onwarmupcompleted = (UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback;
                    }
                    strOnWarmupCompleted = onwarmupcompleted == null ? onwarmupcompleted.onWarmupCompleted() : "";
                }
                String string3 = !(true ^ FaceDetectCallBack.onExtraCallbackWithResult.IAuthTabCallback(strOnWarmupCompleted, true)) ? context.getString(R.string.home_ui_asset_home_edit_v2_accessibility_action_move_section_2, strOnWarmupCompleted) : context.getString(R.string.home_ui_asset_home_edit_v2_accessibility_action_move_section_1, strOnWarmupCompleted);
                Intrinsics.checkNotNull(string3);
                listCreateListBuilder.add(new DefaultSurfaceProcessorFactoryExternalSyntheticLambda0(string3, new AssetHomeEditV2AssetAccessibility$.ExternalSyntheticLambda2(this, iAuthTabCallback)));
            } else {
                iAuthTabCallback = (UpdatePluginCallback.IAuthTabCallback) it.next();
                z = iAuthTabCallback instanceof UpdatePluginCallback.IAuthTabCallback.onExtraCallback;
                if (!z) {
                }
                if (!z) {
                }
                if (onextracallback != null) {
                    if (iAuthTabCallback instanceof UpdatePluginCallback.IAuthTabCallback.onWarmupCompleted) {
                    }
                    if (onwarmupcompleted == null) {
                    }
                    if (!(true ^ FaceDetectCallBack.onExtraCallbackWithResult.IAuthTabCallback(strOnWarmupCompleted, true))) {
                    }
                    Intrinsics.checkNotNull(string3);
                    listCreateListBuilder.add(new DefaultSurfaceProcessorFactoryExternalSyntheticLambda0(string3, new AssetHomeEditV2AssetAccessibility$.ExternalSyntheticLambda2(this, iAuthTabCallback)));
                }
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static final boolean onNavigationEvent(needCheckSnapshotMd5 needchecksnapshotmd5) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Function1<Integer, Unit> function1 = needchecksnapshotmd5.IAuthTabCallbackStub;
        int i4 = needchecksnapshotmd5.onNavigationEvent;
        if (i3 != 0) {
            function1.invoke(Integer.valueOf(i4));
            return false;
        }
        function1.invoke(Integer.valueOf(i4 - 1));
        return true;
    }

    private static final boolean IAuthTabCallback(needCheckSnapshotMd5 needchecksnapshotmd5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Function1<Integer, Unit> function1 = needchecksnapshotmd5.IAuthTabCallbackStub;
        int i4 = needchecksnapshotmd5.onNavigationEvent;
        if (i3 == 0) {
            function1.invoke(Integer.valueOf(i4));
            return false;
        }
        function1.invoke(Integer.valueOf(i4 + 1));
        return true;
    }

    private static final boolean onWarmupCompleted(needCheckSnapshotMd5 needchecksnapshotmd5, UpdatePluginCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Function1<String, Unit> function1 = needchecksnapshotmd5.asBinder;
        String strIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
        if (i3 != 0) {
            function1.invoke(strIAuthTabCallback);
            return false;
        }
        function1.invoke(strIAuthTabCallback);
        return true;
    }
}
