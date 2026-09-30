package o;

import java.lang.annotation.Annotation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.findLastCompletelyVisibleItemPosition;
import o.findLastVisibleItemPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ensureLayoutState {
    private final String artifactVersion;
    private final String description;
    private final getMemoryMappingsOrBuilder<fill> developers;
    private final getOpenFdsOrBuilderList<findFirstCompletelyVisibleItemPosition> funding;
    private final getOpenFdsOrBuilderList<findFirstVisibleChildClosestToEnd> licenses;
    private final String name;
    private final findLastVisibleItemPosition organization;
    private final findLastCompletelyVisibleItemPosition scm;
    private final String tag;
    private final String uniqueId;
    private final String website;
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new giw<>(Reflection.getOrCreateKotlinClass(getMemoryMappingsOrBuilder.class), new Annotation[0]), null, null, new giw<>(Reflection.getOrCreateKotlinClass(getOpenFdsOrBuilderList.class), new Annotation[0]), new giw<>(Reflection.getOrCreateKotlinClass(getOpenFdsOrBuilderList.class), new Annotation[0]), null};

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ensureLayoutState)) {
            return false;
        }
        ensureLayoutState ensurelayoutstate = (ensureLayoutState) obj;
        return Intrinsics.areEqual(this.uniqueId, ensurelayoutstate.uniqueId) && Intrinsics.areEqual(this.artifactVersion, ensurelayoutstate.artifactVersion) && Intrinsics.areEqual(this.name, ensurelayoutstate.name) && Intrinsics.areEqual(this.description, ensurelayoutstate.description) && Intrinsics.areEqual(this.website, ensurelayoutstate.website) && Intrinsics.areEqual(this.developers, ensurelayoutstate.developers) && Intrinsics.areEqual(this.organization, ensurelayoutstate.organization) && Intrinsics.areEqual(this.scm, ensurelayoutstate.scm) && Intrinsics.areEqual(this.licenses, ensurelayoutstate.licenses) && Intrinsics.areEqual(this.funding, ensurelayoutstate.funding) && Intrinsics.areEqual(this.tag, ensurelayoutstate.tag);
    }

    public int hashCode() {
        int iHashCode = this.uniqueId.hashCode();
        String str = this.artifactVersion;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.name.hashCode();
        String str2 = this.description;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.website;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = this.developers.hashCode();
        findLastVisibleItemPosition findlastvisibleitemposition = this.organization;
        int iHashCode7 = findlastvisibleitemposition == null ? 0 : findlastvisibleitemposition.hashCode();
        findLastCompletelyVisibleItemPosition findlastcompletelyvisibleitemposition = this.scm;
        int iHashCode8 = findlastcompletelyvisibleitemposition == null ? 0 : findlastcompletelyvisibleitemposition.hashCode();
        int iHashCode9 = this.licenses.hashCode();
        int iHashCode10 = this.funding.hashCode();
        String str4 = this.tag;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Library(uniqueId=" + this.uniqueId + ", artifactVersion=" + this.artifactVersion + ", name=" + this.name + ", description=" + this.description + ", website=" + this.website + ", developers=" + this.developers + ", organization=" + this.organization + ", scm=" + this.scm + ", licenses=" + this.licenses + ", funding=" + this.funding + ", tag=" + this.tag + ")";
    }

    public /* synthetic */ ensureLayoutState(int i, String str, String str2, String str3, String str4, String str5, getMemoryMappingsOrBuilder getmemorymappingsorbuilder, findLastVisibleItemPosition findlastvisibleitemposition, findLastCompletelyVisibleItemPosition findlastcompletelyvisibleitemposition, getOpenFdsOrBuilderList getopenfdsorbuilderlist, getOpenFdsOrBuilderList getopenfdsorbuilderlist2, String str6, okycx okycxVar) {
        if (255 != (i & 255)) {
            htf31.onExtraCallbackWithResult(i, 255, IAuthTabCallback.IAuthTabCallback.getDescriptor());
        }
        this.uniqueId = str;
        this.artifactVersion = str2;
        this.name = str3;
        this.description = str4;
        this.website = str5;
        this.developers = getmemorymappingsorbuilder;
        this.organization = findlastvisibleitemposition;
        this.scm = findlastcompletelyvisibleitemposition;
        if ((i & 256) == 0) {
            this.licenses = getOpenFdsCount.onWarmupCompleted();
        } else {
            this.licenses = getopenfdsorbuilderlist;
        }
        if ((i & 512) == 0) {
            this.funding = getOpenFdsCount.onWarmupCompleted();
        } else {
            this.funding = getopenfdsorbuilderlist2;
        }
        if ((i & 1024) == 0) {
            this.tag = null;
        } else {
            this.tag = str6;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(ensureLayoutState ensurelayoutstate, vyl vylVar, SerialDescriptor serialDescriptor) {
        py[] pyVarArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, ensurelayoutstate.uniqueId);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, ensurelayoutstate.artifactVersion);
        vylVar.onExtraCallback(serialDescriptor, 2, ensurelayoutstate.name);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, ensurelayoutstate.description);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, ensurelayoutstate.website);
        vylVar.onNavigationEvent(serialDescriptor, 5, pyVarArr[5], ensurelayoutstate.developers);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, findLastVisibleItemPosition.onExtraCallback.onExtraCallbackWithResult, ensurelayoutstate.organization);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, findLastCompletelyVisibleItemPosition.IAuthTabCallback.onExtraCallback, ensurelayoutstate.scm);
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || !Intrinsics.areEqual(ensurelayoutstate.licenses, getOpenFdsCount.onWarmupCompleted())) {
            vylVar.onNavigationEvent(serialDescriptor, 8, pyVarArr[8], ensurelayoutstate.licenses);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 9) || !Intrinsics.areEqual(ensurelayoutstate.funding, getOpenFdsCount.onWarmupCompleted())) {
            vylVar.onNavigationEvent(serialDescriptor, 9, pyVarArr[9], ensurelayoutstate.funding);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || ensurelayoutstate.tag != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, ensurelayoutstate.tag);
        }
    }

    public ensureLayoutState(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull getMemoryMappingsOrBuilder<fill> getmemorymappingsorbuilder, @Nullable findLastVisibleItemPosition findlastvisibleitemposition, @Nullable findLastCompletelyVisibleItemPosition findlastcompletelyvisibleitemposition, @NotNull getOpenFdsOrBuilderList<findFirstVisibleChildClosestToEnd> getopenfdsorbuilderlist, @NotNull getOpenFdsOrBuilderList<findFirstCompletelyVisibleItemPosition> getopenfdsorbuilderlist2, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        Intrinsics.checkNotNullParameter(getopenfdsorbuilderlist, "");
        Intrinsics.checkNotNullParameter(getopenfdsorbuilderlist2, "");
        this.uniqueId = str;
        this.artifactVersion = str2;
        this.name = str3;
        this.description = str4;
        this.website = str5;
        this.developers = getmemorymappingsorbuilder;
        this.organization = findlastvisibleitemposition;
        this.scm = findlastcompletelyvisibleitemposition;
        this.licenses = getopenfdsorbuilderlist;
        this.funding = getopenfdsorbuilderlist2;
        this.tag = str6;
    }

    public final String onWarmupCompleted() {
        return this.artifactVersion;
    }

    public final String onExtraCallbackWithResult() {
        return this.name;
    }

    public final getOpenFdsOrBuilderList<findFirstVisibleChildClosestToEnd> IAuthTabCallback() {
        return this.licenses;
    }
}
