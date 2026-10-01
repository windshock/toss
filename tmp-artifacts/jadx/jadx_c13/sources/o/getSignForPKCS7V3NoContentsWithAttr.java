package o;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7V3NoContentsWithAttr implements InputFilter {
    private final Function0<Unit> IAuthTabCallback;

    public getSignForPKCS7V3NoContentsWithAttr(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = function0;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9]+$");
        if (charSequence == null || charSequence.length() <= 0 || patternCompile.matcher(charSequence).matches()) {
            return null;
        }
        this.IAuthTabCallback.invoke();
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }
}
