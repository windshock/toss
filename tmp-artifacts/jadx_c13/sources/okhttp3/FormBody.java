package okhttp3;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    public FormBody(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.encodedNames = _UtilJvmKt.toImmutableList(list);
        this.encodedValues = _UtilJvmKt.toImmutableList(list2);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    @Deprecated
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m204deprecated_size() {
        return size();
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String name(int i) {
        return _UrlKt.percentDecode$default(encodedName(i), 0, 0, true, 3, null);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String value(int i) {
        return _UrlKt.percentDecode$default(encodedValue(i), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        writeOrCountBytes(tTAppOpenAdActivity9, false);
    }

    private final long writeOrCountBytes(TTAppOpenAdActivity9 tTAppOpenAdActivity9, boolean z) throws EOFException {
        TTBaseActivity tTBaseActivityAccess100;
        if (z) {
            tTBaseActivityAccess100 = new TTBaseActivity();
        } else {
            Intrinsics.checkNotNull(tTAppOpenAdActivity9);
            tTBaseActivityAccess100 = tTAppOpenAdActivity9.access100();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                tTBaseActivityAccess100.onExtraCallbackWithResult(38);
            }
            tTBaseActivityAccess100.onExtraCallback(this.encodedNames.get(i));
            tTBaseActivityAccess100.onExtraCallbackWithResult(61);
            tTBaseActivityAccess100.onExtraCallback(this.encodedValues.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jICustomTabsCallbackDefault = tTBaseActivityAccess100.ICustomTabsCallbackDefault();
        tTBaseActivityAccess100.onWarmupCompleted();
        return jICustomTabsCallbackDefault;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
