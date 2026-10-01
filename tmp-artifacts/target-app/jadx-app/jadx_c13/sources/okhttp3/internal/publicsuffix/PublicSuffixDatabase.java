package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.TTBaseLandingPageActivity;
import o.ensureCausesIsMutable;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    private final PublicSuffixList publicSuffixList;
    public static final Companion Companion = new Companion(null);
    private static final TTBaseLandingPageActivity WILDCARD_LABEL = TTBaseLandingPageActivity.Companion.IAuthTabCallback(42);
    private static final List<String> PREVAILING_RULE = CollectionsKt__CollectionsJVMKt.listOf("*");
    private static PublicSuffixDatabase instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.Companion));

    public PublicSuffixDatabase(@NotNull PublicSuffixList publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "");
        this.publicSuffixList = publicSuffixList;
    }

    public final String getEffectiveTldPlusOne(@NotNull String str) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(str, "");
        String unicode = IDN.toUnicode(str);
        Intrinsics.checkNotNull(unicode);
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return ensureCausesIsMutable.onExtraCallbackWithResult(ensureCausesIsMutable.onExtraCallbackWithResult(CollectionsKt___CollectionsKt.asSequence(splitDomain(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    private final List<String> splitDomain(String str) {
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt___CollectionsKt.last((List) listSplit$default), _UrlKt.FRAGMENT_ENCODE_SET) ? CollectionsKt___CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String strBinarySearch;
        String str2;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        this.publicSuffixList.ensureLoaded();
        int size = list.size();
        TTBaseLandingPageActivity[] tTBaseLandingPageActivityArr = new TTBaseLandingPageActivity[size];
        for (int i = 0; i < size; i++) {
            tTBaseLandingPageActivityArr[i] = TTBaseLandingPageActivity.Companion.IAuthTabCallback(list.get(i));
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strBinarySearch = null;
                break;
            }
            strBinarySearch = Companion.binarySearch(this.publicSuffixList.getBytes(), tTBaseLandingPageActivityArr, i2);
            if (strBinarySearch != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            TTBaseLandingPageActivity[] tTBaseLandingPageActivityArr2 = (TTBaseLandingPageActivity[]) tTBaseLandingPageActivityArr.clone();
            int length = tTBaseLandingPageActivityArr2.length;
            for (int i3 = 0; i3 < length - 1; i3++) {
                tTBaseLandingPageActivityArr2[i3] = WILDCARD_LABEL;
                String strBinarySearch2 = Companion.binarySearch(this.publicSuffixList.getBytes(), tTBaseLandingPageActivityArr2, i3);
                if (strBinarySearch2 != null) {
                    str2 = strBinarySearch2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= size - 1) {
                    break;
                }
                String strBinarySearch3 = Companion.binarySearch(this.publicSuffixList.getExceptionBytes(), tTBaseLandingPageActivityArr, i4);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i4++;
            }
        }
        if (str != null) {
            return StringsKt__StringsKt.split$default((CharSequence) (EXCEPTION_MARKER + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strBinarySearch == null && str2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) strBinarySearch, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(TTBaseLandingPageActivity tTBaseLandingPageActivity, TTBaseLandingPageActivity[] tTBaseLandingPageActivityArr, int i) {
            int i2;
            boolean z;
            int iAnd;
            int iAnd2;
            int iAccess100 = tTBaseLandingPageActivity.access100();
            int i3 = 0;
            while (i3 < iAccess100) {
                int i4 = (i3 + iAccess100) / 2;
                while (i4 >= 0 && tTBaseLandingPageActivity.onExtraCallbackWithResult(i4) != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (tTBaseLandingPageActivity.onExtraCallbackWithResult(i2) == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        z = z2;
                        iAnd = _UtilCommonKt.and(tTBaseLandingPageActivityArr[i8].onExtraCallbackWithResult(i9), 255);
                    }
                    iAnd2 = iAnd - _UtilCommonKt.and(tTBaseLandingPageActivity.onExtraCallbackWithResult(i5 + i10), 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (tTBaseLandingPageActivityArr[i8].access100() != i9) {
                        z2 = z;
                    } else {
                        if (i8 == tTBaseLandingPageActivityArr.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i11 = i7 - i10;
                        int iAccess1002 = tTBaseLandingPageActivityArr[i8].access100() - i9;
                        int length = tTBaseLandingPageActivityArr.length;
                        for (int i12 = i8 + 1; i12 < length; i12++) {
                            iAccess1002 += tTBaseLandingPageActivityArr[i12].access100();
                        }
                        if (iAccess1002 >= i11) {
                            if (iAccess1002 <= i11) {
                                return tTBaseLandingPageActivity.onExtraCallbackWithResult(i5, i7 + i5).onExtraCallbackWithResult(Charsets.UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                iAccess100 = i4;
            }
            return null;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.Companion));
        }
    }
}
