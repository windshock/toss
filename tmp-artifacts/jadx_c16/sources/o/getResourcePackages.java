package o;

import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getResourcePackages extends RVManifestIProxyManifest {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private getOuterPage onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public getResourcePackages(@NotNull releaseCountDownLatch releasecountdownlatch) {
        super(releasecountdownlatch);
        Intrinsics.checkNotNullParameter(releasecountdownlatch, "");
    }

    public final void onExtraCallbackWithResult(@Nullable getOuterPage getouterpage, @NotNull Function0<Unit> function0) {
        Set setOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        getOuterPage getouterpage2 = this.onExtraCallback;
        Set setOnExtraCallbackWithResult2 = null;
        Set setOnExtraCallbackWithResult3 = getouterpage != null ? getouterpage.onExtraCallbackWithResult() : null;
        if (getouterpage2 != null) {
            int i4 = onWarmupCompleted + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            setOnExtraCallbackWithResult = getouterpage2.onExtraCallbackWithResult();
        } else {
            setOnExtraCallbackWithResult = null;
        }
        if (Intrinsics.areEqual(setOnExtraCallbackWithResult3, setOnExtraCallbackWithResult)) {
            return;
        }
        int i6 = onWarmupCompleted + 21;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Set setOnExtraCallbackWithResult4 = getouterpage2 != null ? getouterpage2.onExtraCallbackWithResult() : null;
        if (getouterpage != null) {
            int i8 = onNavigationEvent + 13;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            setOnExtraCallbackWithResult2 = getouterpage.onExtraCallbackWithResult();
        }
        Set set = setOnExtraCallbackWithResult4;
        if (set != null && !set.isEmpty()) {
            onExtraCallbackWithResult(CollectionsKt.joinToString$default(CollectionsKt.sorted(setOnExtraCallbackWithResult4), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        this.onExtraCallback = getouterpage;
        Set set2 = setOnExtraCallbackWithResult2;
        if (set2 != null) {
            int i10 = onWarmupCompleted + 77;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            if (set2.isEmpty()) {
                return;
            }
            int i12 = onNavigationEvent + 115;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            if (!(!onNavigationEvent(CollectionsKt.joinToString$default(CollectionsKt.sorted(setOnExtraCallbackWithResult2), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)))) {
                RVManifestIProxyManifest.onExtraCallback(this, (String) null, getouterpage, (Map) null, function0, 4, (Object) null);
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        super.onExtraCallbackWithResult(findresandmsg, str);
        getOuterPage getouterpage = this.onExtraCallback;
        Object obj = null;
        Set setOnExtraCallbackWithResult = getouterpage != null ? getouterpage.onExtraCallbackWithResult() : null;
        Set set = setOnExtraCallbackWithResult;
        if (set != null) {
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                set.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!set.isEmpty() && onNavigationEvent(CollectionsKt.joinToString$default(CollectionsKt.sorted(setOnExtraCallbackWithResult), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null))) {
                int i5 = onNavigationEvent + 101;
                onWarmupCompleted = i5 % 128;
                RVManifestIProxyManifest.onExtraCallback(this, (String) null, getouterpage, (Map) null, (Function0) null, i5 % 2 != 0 ? 2 : 4, (Object) null);
            }
        }
        int i6 = onNavigationEvent + 41;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void onWarmupCompleted(@NotNull findResAndMsg findresandmsg, @NotNull RVManifestLazyProxyManifest1 rVManifestLazyProxyManifest1, @NotNull Function0<Boolean> function0, @NotNull Function0<Unit> function02, boolean z, @Nullable Map<String, ? extends Object> map) {
        getOuterPage getouterpage;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(rVManifestLazyProxyManifest1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        super.onWarmupCompleted(findresandmsg, rVManifestLazyProxyManifest1, function0, function02, z, map);
        if (((Boolean) onExtraCallback().IAuthTabCallback()).booleanValue()) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                getouterpage = this.onExtraCallback;
                int i6 = 93 / 0;
                if (getouterpage == null) {
                    return;
                }
            } else {
                getouterpage = this.onExtraCallback;
                if (getouterpage == null) {
                    return;
                }
            }
            int i7 = i4 + 101;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                if (!onNavigationEvent(CollectionsKt.joinToString$default(CollectionsKt.sorted(getouterpage.onExtraCallbackWithResult()), (CharSequence) null, (CharSequence) null, (CharSequence) null, 1, (CharSequence) null, (Function1) null, 4, (Object) null))) {
                    return;
                }
            } else if (!onNavigationEvent(CollectionsKt.joinToString$default(CollectionsKt.sorted(getouterpage.onExtraCallbackWithResult()), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null))) {
                return;
            }
            int i8 = onNavigationEvent + 45;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            RVManifestIProxyManifest.onExtraCallback(this, (String) null, getouterpage, (Map) null, function02, 4, (Object) null);
        }
    }
}
