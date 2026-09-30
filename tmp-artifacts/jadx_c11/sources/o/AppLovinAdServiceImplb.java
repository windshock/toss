package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.AppLovinAdServiceImplb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImplb implements SessionTrackere {
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final Regex IAuthTabCallback = new Regex(CollectionsKt.joinToString$default(CollectionsKt.listOf(new String[]{"^", "([a-zA-Z][a-zA-Z\\d+.\\-]*)?", ":(?:\\/\\/", "    (?:", "        ([^:@?&#\\/\\n]+)", "        (?::", "            ([^@?&#\\/\\n]+)", "        )?", "    @)?", "    (", "        (?:[^@:?&#\\/\\n\\.][^@:?&#\\/\\n]*)", "        |", "        (?:(?:[\\da-fA-F]{4}:){7}[\\da-fA-F]{4})", "    )?", "    (?::", "        ([\\d]*)", "    )?", ")", "(\\/", "    (?:", "        (?:[^?&/\\n]*\\/)*(?:[^?&/\\n])+\\/?", "    )?", ")?", "(?:", "    [?&]+", "    (", "        (?:[^&#=\\n]+(?:=[^&#\\n]*)?&)*", "        (?:[^&#=\\n]+(?:=[^&#\\n]*)?)", "    )?", "    [?&]*", ")?", "$"}), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.util.UriCorrecterImpl$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            String str = (String) obj;
            if (i2 % 2 == 0) {
                AppLovinAdServiceImplb.onExtraCallbackWithResult(str);
                throw null;
            }
            CharSequence charSequenceOnExtraCallbackWithResult = AppLovinAdServiceImplb.onExtraCallbackWithResult(str);
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return charSequenceOnExtraCallbackWithResult;
        }
    }, 30, (Object) null));
    private static final Regex onExtraCallback = new Regex(CollectionsKt.joinToString$default(CollectionsKt.listOf(new String[]{"(?:", "    #", "    ([^\\n#]*)", ")?", "$"}), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.util.UriCorrecterImpl$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnExtraCallback = AppLovinAdServiceImplb.onExtraCallback((String) obj);
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return charSequenceOnExtraCallback;
        }
    }, 30, (Object) null));

    public static /* synthetic */ CharSequence onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(str);
        }
        onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(str);
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceIAuthTabCallback;
    }

    public static /* synthetic */ CharSequence onNavigationEvent(AppLovinAdServiceImplb appLovinAdServiceImplb, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(appLovinAdServiceImplb, str);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceIAuthTabCallback;
    }

    @Inject
    public AppLovinAdServiceImplb() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    @Override // o.SessionTrackere
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull String str) {
        String str2;
        List groupValues;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            MatchResult matchResultFind$default = Regex.find$default(onExtraCallback, str, 0, 2, (Object) null);
            if (matchResultFind$default != null) {
                int i2 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                List groupValues2 = matchResultFind$default.getGroupValues();
                if (groupValues2 == null || (str2 = (String) CollectionsKt.getOrNull(groupValues2, 1)) == null) {
                    str2 = "";
                }
            }
            MatchResult matchResultFind$default2 = Regex.find$default(IAuthTabCallback, StringsKt.dropLast(StringsKt.trim(str).toString(), StringsKt.isBlank(str2) ^ true ? str2.length() + 1 : 0), 0, 2, (Object) null);
            if (matchResultFind$default2 == null || (groupValues = matchResultFind$default2.getGroupValues()) == null) {
                throw new Exception("Cannot parse uri: " + str);
            }
            int i4 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                str3 = (String) CollectionsKt.getOrNull(groupValues, 0);
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = (String) CollectionsKt.getOrNull(groupValues, 1);
                if (str3 == null) {
                    str3 = "";
                }
            }
            String str4 = (String) CollectionsKt.getOrNull(groupValues, 2);
            if (str4 == null) {
                int i5 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                str4 = "";
            }
            String str5 = (String) CollectionsKt.getOrNull(groupValues, 3);
            if (str5 == null) {
                int i7 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                str5 = "";
            }
            String str6 = (String) CollectionsKt.getOrNull(groupValues, 4);
            if (str6 == null) {
                str6 = "";
            }
            String str7 = (String) CollectionsKt.getOrNull(groupValues, 5);
            if (str7 == null) {
                int i9 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                str7 = "";
            }
            String str8 = (String) CollectionsKt.getOrNull(groupValues, 6);
            if (str8 == null) {
                int i11 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                str8 = "";
            }
            String str9 = (String) CollectionsKt.getOrNull(groupValues, 7);
            List listSplit$default = StringsKt.split$default(str9 == null ? "" : str9, new String[]{"&"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList.add(obj);
                }
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.util.UriCorrecterImpl$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    CharSequence charSequenceOnNavigationEvent = AppLovinAdServiceImplb.onNavigationEvent(this.f$0, (String) obj2);
                    int i16 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        return charSequenceOnNavigationEvent;
                    }
                    throw null;
                }
            }, 30, (Object) null);
            StringBuilder sb = new StringBuilder();
            if (!StringsKt.isBlank(str3)) {
                sb.append(str3 + "://");
            }
            if (!StringsKt.isBlank(str4)) {
                sb.append(onWarmupCompleted(this, str4, null, 2, null));
                if (!StringsKt.isBlank(str5)) {
                    sb.append(":" + onWarmupCompleted(this, str5, null, 2, null));
                }
                sb.append("@");
                int i13 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 3 % 2;
                }
            }
            if (!StringsKt.isBlank(str6)) {
                sb.append(onWarmupCompleted(this, str6, null, 2, null));
            }
            if (!StringsKt.isBlank(str7)) {
                sb.append(":" + str7);
            }
            if (!StringsKt.isBlank(str8)) {
                sb.append(onNavigationEvent(str8, "#/"));
            }
            if (!StringsKt.isBlank(strJoinToString$default)) {
                sb.append("?" + strJoinToString$default);
            }
            if (!StringsKt.isBlank(str2)) {
                sb.append("#" + onNavigationEvent(str2, "&="));
            }
            return Result.constructor-impl(sb.toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static final CharSequence IAuthTabCallback(AppLovinAdServiceImplb appLovinAdServiceImplb, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        String strSubstringBefore$default = StringsKt.substringBefore$default(str, "=", (String) null, 2, (Object) null);
        String strSubstringAfter = StringsKt.substringAfter(str, "=", "");
        String str2 = onWarmupCompleted(appLovinAdServiceImplb, strSubstringBefore$default, null, 2, null) + "=" + onWarmupCompleted(appLovinAdServiceImplb, strSubstringAfter, null, 2, null);
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String onWarmupCompleted(AppLovinAdServiceImplb appLovinAdServiceImplb, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            str2 = "";
        }
        String strOnNavigationEvent = appLovinAdServiceImplb.onNavigationEvent(str, str2);
        int i4 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private final String onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        char[] charArray = str2.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        List listSplit$default = StringsKt.split$default(str, Arrays.copyOf(charArray, charArray.length), false, 0, 6, (Object) null);
        List list = listSplit$default;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(parseMagicOptions.onNavigationEvent(parseMagicOptions.onExtraCallback((String) it.next())));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayList.add(parseMagicOptions.onNavigationEvent(parseMagicOptions.onExtraCallback((String) it.next())));
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int length = 0;
        for (Object obj2 : arrayList) {
            if (i3 < 0) {
                int i4 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    CollectionsKt.throwIndexOverflow();
                    int i5 = 77 / 0;
                } else {
                    CollectionsKt.throwIndexOverflow();
                }
            }
            String str3 = (String) obj2;
            if (i3 != 0) {
                int i6 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    sb.append(str.charAt(length));
                } else {
                    sb.append(str.charAt(length));
                    length++;
                }
            }
            sb.append(str3);
            length += ((String) listSplit$default.get(i3)).length();
            i3++;
        }
        String string = sb.toString();
        int i7 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return string;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        int i = asBinder + 111;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    private static final CharSequence IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = StringsKt.trim(str).toString();
        int i4 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static final CharSequence onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = StringsKt.trim(str).toString();
        int i4 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
