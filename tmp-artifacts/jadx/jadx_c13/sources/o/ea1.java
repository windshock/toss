package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ea1 extends oty2<String> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.oty2
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public final String asInterface(@NotNull SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return onExtraCallback(onExtraCallbackWithResult(serialDescriptor, i));
    }

    protected final String onExtraCallback(@NotNull String str) {
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(str, "");
        String strCt_ = ct_();
        if (strCt_ != null) {
            str2 = strCt_;
        }
        return onExtraCallbackWithResult(str2, str);
    }

    protected String onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor, int i) {
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
}
