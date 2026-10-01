package o;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw8<T> implements lt1<T> {
    private final String onExtraCallbackWithResult;

    public jw8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    public String toString() {
        return "ConstantFormatStructure(" + this.onExtraCallbackWithResult + ')';
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof jw8) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((jw8) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        String strSubstring;
        List listBuild;
        String strSubstring2;
        if (this.onExtraCallbackWithResult.length() == 0) {
            listBuild = CollectionsKt__CollectionsKt.emptyList();
        } else {
            List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (jw10.IAuthTabCallback(this.onExtraCallbackWithResult.charAt(0))) {
                String strSubstring3 = this.onExtraCallbackWithResult;
                int length = strSubstring3.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!jw10.IAuthTabCallback(strSubstring3.charAt(i))) {
                        strSubstring3 = strSubstring3.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                        break;
                    }
                    i++;
                }
                listCreateListBuilder.add(new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new addUpdateListener(strSubstring3))));
                String str = this.onExtraCallbackWithResult;
                int length2 = str.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                        break;
                    }
                    if (!jw10.IAuthTabCallback(str.charAt(i2))) {
                        strSubstring = str.substring(i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        break;
                    }
                    i2++;
                }
            } else {
                strSubstring = this.onExtraCallbackWithResult;
            }
            if (strSubstring.length() > 0) {
                if (!jw10.IAuthTabCallback(strSubstring.charAt(strSubstring.length() - 1))) {
                    listCreateListBuilder.add(new ulzb(strSubstring));
                } else {
                    int lastIndex = StringsKt__StringsKt.getLastIndex(strSubstring);
                    while (true) {
                        if (lastIndex < 0) {
                            strSubstring2 = _UrlKt.FRAGMENT_ENCODE_SET;
                            break;
                        }
                        if (!jw10.IAuthTabCallback(strSubstring.charAt(lastIndex))) {
                            strSubstring2 = strSubstring.substring(0, lastIndex + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            break;
                        }
                        lastIndex--;
                    }
                    listCreateListBuilder.add(new ulzb(strSubstring2));
                    int lastIndex2 = StringsKt__StringsKt.getLastIndex(strSubstring);
                    while (true) {
                        if (lastIndex2 < 0) {
                            break;
                        }
                        if (!jw10.IAuthTabCallback(strSubstring.charAt(lastIndex2))) {
                            strSubstring = strSubstring.substring(lastIndex2 + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            break;
                        }
                        lastIndex2--;
                    }
                    listCreateListBuilder.add(new pmizb(CollectionsKt__CollectionsJVMKt.listOf(new addUpdateListener(strSubstring))));
                }
            }
            listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
        }
        return new ulsya<>(listBuild, CollectionsKt__CollectionsKt.emptyList());
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        return new ltsya(this.onExtraCallbackWithResult);
    }
}
