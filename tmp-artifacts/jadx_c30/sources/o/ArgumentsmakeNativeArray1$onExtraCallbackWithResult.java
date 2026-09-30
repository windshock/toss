package o;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ArgumentsmakeNativeArray1$onExtraCallbackWithResult {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("props")
    private final LinkedTreeMap<String, String> props;

    /* JADX WARN: Illegal instructions before constructor call */
    public ArgumentsmakeNativeArray1$onExtraCallbackWithResult() {
        LinkedTreeMap linkedTreeMap = null;
        this(linkedTreeMap, 1, linkedTreeMap);
    }

    public ArgumentsmakeNativeArray1$onExtraCallbackWithResult(@NotNull LinkedTreeMap<String, String> linkedTreeMap) {
        Intrinsics.checkNotNullParameter(linkedTreeMap, BuildConfig.FLAVOR);
        this.props = linkedTreeMap;
    }

    public /* synthetic */ ArgumentsmakeNativeArray1$onExtraCallbackWithResult(LinkedTreeMap linkedTreeMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            linkedTreeMap = new LinkedTreeMap();
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(linkedTreeMap);
    }

    public final String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        String str2 = (String) this.props.get(str);
        int i4 = IAuthTabCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }
}
