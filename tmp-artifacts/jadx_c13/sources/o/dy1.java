package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class dy1 extends setOnShakeViewListener<String> {
    @Override // o.setOnShakeViewListener
    /* renamed from: access100, reason: merged with bridge method [inline-methods] */
    public final String access000(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onWarmupCompleted(IAuthTabCallback_Parcel(serialDescriptor, i));
    }

    protected final String onWarmupCompleted(@NotNull String str) {
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(str, "");
        String interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            str2 = interfaceDescriptor;
        }
        return onExtraCallbackWithResult(str2, str);
    }

    protected String IAuthTabCallback_Parcel(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor.onWarmupCompleted(i);
    }

    protected String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }

    public final String cr_() {
        return cs_().isEmpty() ? "$" : CollectionsKt___CollectionsKt.joinToString$default(cs_(), ".", "$.", null, 0, null, null, 60, null);
    }
}
