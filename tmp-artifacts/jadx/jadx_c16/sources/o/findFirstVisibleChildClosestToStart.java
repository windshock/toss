package o;

import com.mikepenz.aboutlibraries.util.Result;
import java.lang.annotation.Annotation;
import java.util.Comparator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class findFirstVisibleChildClosestToStart {
    private final getMemoryMappingsOrBuilder<ensureLayoutState> libraries;
    private final getOpenFdsOrBuilderList<findFirstVisibleChildClosestToEnd> licenses;
    public static final onExtraCallback Companion = new onExtraCallback((DefaultConstructorMarker) null);
    private static final KSerializer<Object>[] $childSerializers = {new giw<>(Reflection.getOrCreateKotlinClass(getMemoryMappingsOrBuilder.class), new Annotation[0]), new giw<>(Reflection.getOrCreateKotlinClass(getOpenFdsOrBuilderList.class), new Annotation[0])};

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findFirstVisibleChildClosestToStart)) {
            return false;
        }
        findFirstVisibleChildClosestToStart findfirstvisiblechildclosesttostart = (findFirstVisibleChildClosestToStart) obj;
        return Intrinsics.areEqual(this.libraries, findfirstvisiblechildclosesttostart.libraries) && Intrinsics.areEqual(this.licenses, findfirstvisiblechildclosesttostart.licenses);
    }

    public int hashCode() {
        return (this.libraries.hashCode() * 31) + this.licenses.hashCode();
    }

    public String toString() {
        return "Libs(libraries=" + this.libraries + ", licenses=" + this.licenses + ")";
    }

    public /* synthetic */ findFirstVisibleChildClosestToStart(int i, getMemoryMappingsOrBuilder getmemorymappingsorbuilder, getOpenFdsOrBuilderList getopenfdsorbuilderlist, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, onNavigationEvent.onNavigationEvent.getDescriptor());
        }
        this.libraries = getmemorymappingsorbuilder;
        this.licenses = getopenfdsorbuilderlist;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(findFirstVisibleChildClosestToStart findfirstvisiblechildclosesttostart, vyl vylVar, SerialDescriptor serialDescriptor) {
        py[] pyVarArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, pyVarArr[0], findfirstvisiblechildclosesttostart.libraries);
        vylVar.onNavigationEvent(serialDescriptor, 1, pyVarArr[1], findfirstvisiblechildclosesttostart.licenses);
    }

    public findFirstVisibleChildClosestToStart(@NotNull getMemoryMappingsOrBuilder<ensureLayoutState> getmemorymappingsorbuilder, @NotNull getOpenFdsOrBuilderList<findFirstVisibleChildClosestToEnd> getopenfdsorbuilderlist) {
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        Intrinsics.checkNotNullParameter(getopenfdsorbuilderlist, "");
        this.libraries = getmemorymappingsorbuilder;
        this.licenses = getopenfdsorbuilderlist;
    }

    public final getMemoryMappingsOrBuilder<ensureLayoutState> onNavigationEvent() {
        return this.libraries;
    }

    public static final class onExtraCallbackWithResult {
        private String IAuthTabCallback;

        public final onExtraCallbackWithResult onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
            return this;
        }

        public final findFirstVisibleChildClosestToStart onExtraCallbackWithResult() {
            String str = this.IAuthTabCallback;
            if (str != null) {
                Result resultOnExtraCallback = findOnePartiallyOrCompletelyInvisibleChild.onExtraCallback(str);
                return new findFirstVisibleChildClosestToStart(getOpenFdsCount.onWarmupCompleted(CollectionsKt.sortedWith(resultOnExtraCallback.onExtraCallback(), new onExtraCallback())), getOpenFdsCount.onExtraCallback(resultOnExtraCallback.onNavigationEvent()));
            }
            throw new IllegalStateException("Please provide the required library data via the available APIs.\nDepending on the platform this can be done for example via `LibsBuilder().withJson()`.\nFor Android there exists an `LibsBuilder.withContext()`, automatically loading the `aboutlibraries.json` file from the `raw` resources folder.\nWhen using compose or other parent modules, please check their corresponding APIs.");
        }

        public static final class onExtraCallback<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String strOnExtraCallbackWithResult = ((ensureLayoutState) t).onExtraCallbackWithResult();
                Locale locale = Locale.ROOT;
                String lowerCase = strOnExtraCallbackWithResult.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                String lowerCase2 = ((ensureLayoutState) t2).onExtraCallbackWithResult().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                return getCodeNameBytes.IAuthTabCallback(lowerCase, lowerCase2);
            }
        }
    }
}
