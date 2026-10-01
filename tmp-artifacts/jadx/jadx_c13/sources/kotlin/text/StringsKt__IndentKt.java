package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt$;
import o.ensureCausesIsMutable;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$0$StringsKt__IndentKt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }

    public static final String trimMargin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return replaceIndentByMargin(str, _UrlKt.FRAGMENT_ENCODE_SET, str2);
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String replaceIndentByMargin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i;
        String strInvoke;
        int i2;
        String str4;
        String strSubstring;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (StringsKt__StringsKt.isBlank(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listLines = StringsKt__StringsKt.lines(str);
        int length = str.length();
        int length2 = str2.length();
        int size = listLines.size();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : listLines) {
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str5 = (String) obj;
            if ((i3 == 0 || i3 == lastIndex) && StringsKt__StringsKt.isBlank(str5)) {
                i = i3;
                strInvoke = null;
            } else {
                int length3 = str5.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        i2 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.IAuthTabCallbackDefault(str5.charAt(i4))) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
                if (i2 != -1) {
                    int i5 = i2;
                    str4 = str5;
                    i = i3;
                    if (StringsKt__StringsJVMKt.startsWith$default(str5, str3, i2, false, 4, null)) {
                        int length4 = str3.length();
                        Intrinsics.checkNotNull(str4, "");
                        strSubstring = str4.substring(length4 + i5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                    if (strSubstring != null || (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strSubstring)) == null) {
                        strInvoke = str4;
                    }
                } else {
                    str4 = str5;
                    i = i3;
                }
                strSubstring = null;
                if (strSubstring != null) {
                    strInvoke = str4;
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i3 = i + 1;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(arrayList, new StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static String trimIndent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return replaceIndent(str, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndent(@NotNull String str, @NotNull String str2) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        List<String> listLines = StringsKt__StringsKt.lines(str);
        List<String> list = listLines;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt__StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.minOrNull((Iterable) arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length();
        int length2 = str2.length();
        int size = listLines.size();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == lastIndex) && StringsKt__StringsKt.isBlank(str3)) {
                str3 = null;
            } else {
                String strDrop = StringsKt___StringsKt.drop(str3, iIntValue);
                if (strDrop != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strDrop)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i++;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(arrayList3, new StringBuilder(length + (length2 * size)), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    public static String prependIndent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ensureCausesIsMutable.onExtraCallbackWithResult(ensureCausesIsMutable.extraCallback(StringsKt__StringsKt.lineSequence(str), new StringsKt__IndentKt$.ExternalSyntheticLambda0(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prependIndent$lambda$0$StringsKt__IndentKt(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt__StringsKt.isBlank(str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        return str + str2;
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new Function1() { // from class: kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__IndentKt.getIndentFunction$lambda$0$StringsKt__IndentKt((String) obj);
            }
        } : new Function1() { // from class: kotlin.text.StringsKt__IndentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__IndentKt.getIndentFunction$lambda$1$StringsKt__IndentKt(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$1$StringsKt__IndentKt(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return str + str2;
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        String strInvoke;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt__StringsKt.isBlank(str)) {
                str = null;
            } else {
                String strInvoke2 = function12.invoke(str);
                if (strInvoke2 != null && (strInvoke = function1.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2++;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.joinTo$default(arrayList, new StringBuilder(i), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.IAuthTabCallbackDefault(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }
}
