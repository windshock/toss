package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DestructorThreadDestructorStack {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("children")
    private final List<accessgetALLcp> children;

    @SerializedName("mediaType")
    private final String mediaType;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_URL)
    private final String url;

    public DestructorThreadDestructorStack() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestructorThreadDestructorStack)) {
            int i5 = i2 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        DestructorThreadDestructorStack destructorThreadDestructorStack = (DestructorThreadDestructorStack) obj;
        if (!Intrinsics.areEqual(this.url, destructorThreadDestructorStack.url)) {
            int i7 = onNavigationEvent + 117;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.mediaType, destructorThreadDestructorStack.mediaType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.children, destructorThreadDestructorStack.children)) {
            int i9 = IAuthTabCallback + 105;
            onNavigationEvent = i9 % 128;
            return i9 % 2 != 0;
        }
        int i10 = IAuthTabCallback + 15;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.url.hashCode() * 31) + this.mediaType.hashCode()) * 31) + this.children.hashCode();
        int i4 = onNavigationEvent + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneUserTermsValue(url=" + this.url + ", mediaType=" + this.mediaType + ", children=" + this.children + ")";
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public DestructorThreadDestructorStack(@NotNull String str, @NotNull String str2, @NotNull List<accessgetALLcp> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.url = str;
        this.mediaType = str2;
        this.children = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DestructorThreadDestructorStack(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i8 = onNavigationEvent + 75;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            str2 = "text/html";
        }
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
