package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.access15800;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Regex TYPE_SUBTYPE = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Regex PARAMETER = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @JvmStatic
    public static final MediaType get(@NotNull String str) {
        return Companion.get(str);
    }

    @JvmStatic
    public static final MediaType parse(@NotNull String str) {
        return Companion.parse(str);
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public MediaType(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final String getMediaType$okhttp() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    public final String subtype() {
        return this.subtype;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public final Charset charset(@Nullable Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String parameter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        int iOnExtraCallbackWithResult = access15800.onExtraCallbackWithResult(0, this.parameterNamesAndValues.length - 1, 2);
        if (iOnExtraCallbackWithResult < 0) {
            return null;
        }
        while (!StringsKt__StringsJVMKt.equals(this.parameterNamesAndValues[i], str, true)) {
            if (i == iOnExtraCallbackWithResult) {
                return null;
            }
            i += 2;
        }
        return this.parameterNamesAndValues[i + 1];
    }

    @Deprecated
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m240deprecated_type() {
        return this.type;
    }

    @Deprecated
    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m239deprecated_subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof MediaType) && Intrinsics.areEqual(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MediaType get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            MatchResult matchResultOnNavigationEvent = MediaType.TYPE_SUBTYPE.onNavigationEvent(str, 0);
            if (matchResultOnNavigationEvent == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = matchResultOnNavigationEvent.getGroupValues().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = matchResultOnNavigationEvent.getGroupValues().get(2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            ArrayList arrayList = new ArrayList();
            int last = matchResultOnNavigationEvent.onExtraCallback().getLast();
            while (true) {
                int i = last + 1;
                if (i < str.length()) {
                    MatchResult matchResultOnNavigationEvent2 = MediaType.PARAMETER.onNavigationEvent(str, i);
                    if (matchResultOnNavigationEvent2 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String strSubstring = str.substring(i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        sb.append(strSubstring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                    MatchGroup matchGroupOnExtraCallbackWithResult = matchResultOnNavigationEvent2.IAuthTabCallback().onExtraCallbackWithResult(1);
                    String strOnNavigationEvent = matchGroupOnExtraCallbackWithResult != null ? matchGroupOnExtraCallbackWithResult.onNavigationEvent() : null;
                    if (strOnNavigationEvent == null) {
                        last = matchResultOnNavigationEvent2.onExtraCallback().getLast();
                    } else {
                        MatchGroup matchGroupOnExtraCallbackWithResult2 = matchResultOnNavigationEvent2.IAuthTabCallback().onExtraCallbackWithResult(2);
                        String strOnNavigationEvent2 = matchGroupOnExtraCallbackWithResult2 != null ? matchGroupOnExtraCallbackWithResult2.onNavigationEvent() : null;
                        if (strOnNavigationEvent2 == null) {
                            MatchGroup matchGroupOnExtraCallbackWithResult3 = matchResultOnNavigationEvent2.IAuthTabCallback().onExtraCallbackWithResult(3);
                            Intrinsics.checkNotNull(matchGroupOnExtraCallbackWithResult3);
                            strOnNavigationEvent2 = matchGroupOnExtraCallbackWithResult3.onNavigationEvent();
                        } else if (StringsKt__StringsKt.startsWith$default((CharSequence) strOnNavigationEvent2, '\'', false, 2, (Object) null) && StringsKt__StringsKt.endsWith$default((CharSequence) strOnNavigationEvent2, '\'', false, 2, (Object) null) && strOnNavigationEvent2.length() > 2) {
                            strOnNavigationEvent2 = strOnNavigationEvent2.substring(1, strOnNavigationEvent2.length() - 1);
                            Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent2, "");
                        }
                        arrayList.add(strOnNavigationEvent);
                        arrayList.add(strOnNavigationEvent2);
                        last = matchResultOnNavigationEvent2.onExtraCallback().getLast();
                    }
                } else {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
            }
        }

        @JvmStatic
        public final MediaType parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Deprecated
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m241deprecated_get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return get(str);
        }

        @Deprecated
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m242deprecated_parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return parse(str);
        }
    }
}
