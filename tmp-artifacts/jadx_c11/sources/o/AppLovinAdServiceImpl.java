package o;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.AppLovinAdServiceImpl;
import o.alertWithArgs;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImpl implements getBidToken {
    private static final Regex IAuthTabCallback;
    private static final Regex IAuthTabCallbackDefault;
    private static final Regex IAuthTabCallbackStub;
    private static final List<r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY> IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static final Regex access000;
    private static int access100 = 1;
    private static final Regex asBinder;
    private static final Map<String, Integer> asInterface;
    private static int extraCallbackWithResult = 1;
    private static final Regex onExtraCallback;
    private static final Regex onExtraCallbackWithResult;
    private static final Regex onNavigationEvent;
    private static final Regex onWarmupCompleted;
    private final collectBidToken getInterfaceDescriptor = new collectBidToken(new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = AppLovinAdServiceImpl.onExtraCallbackWithResult((String) obj);
            int i4 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return strOnExtraCallbackWithResult;
            }
            throw null;
        }
    });
    private static final onExtraCallback Companion = new onExtraCallback(null);
    private static final Regex onTransact = new Regex("([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})");

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i5 | i));
        int i12 = i8 | i5;
        int i13 = (~(i3 | i5)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i5 + i + i4 + ((-1468046718) * i2) + (327422179 * i6);
        int i16 = i15 * i15;
        int i17 = (677926197 * i5) + 1810235392 + (1154460365 * i) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i4) + (1933049856 * i2) + (743702528 * i6) + (286654464 * i16);
        int i18 = (i5 * (-645773371)) + 280972133 + (i * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i4 * (-645772719)) + (i2 * 1523302178) + (i6 * 1475409363) + (i16 * (-1007288320));
        int i19 = i17 + (i18 * i18 * (-492175360));
        if (i19 == 1) {
            return onExtraCallback(objArr);
        }
        if (i19 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i19 == 3) {
            return onNavigationEvent(objArr);
        }
        List list = (List) objArr[0];
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(3) + list.get(7) + list.get(8) + list.get(9);
        int i21 = IAuthTabCallback_Parcel + 63;
        access100 = i21 % 128;
        int i22 = i21 % 2;
        return str;
    }

    public static /* synthetic */ String IAuthTabCallback(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) IAuthTabCallback(-335930477, new Object[]{list}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 335930477, alertWithArgs.onExtraCallbackWithResult());
        int i4 = access100 + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return str;
    }

    public static /* synthetic */ String asBinder(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(list);
        }
        onTransact(list);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MatchResult matchResult = (MatchResult) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(matchResult);
        int i4 = IAuthTabCallback_Parcel + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ String onExtraCallback(List list) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(list);
        int i4 = access100 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str2 = (String) IAuthTabCallback(-1390515760, new Object[]{str}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1390515762, alertWithArgs.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback_Parcel + 17;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(list);
        }
        asInterface(list);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(list);
        int i4 = IAuthTabCallback_Parcel + 53;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(List list) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(list);
        int i4 = IAuthTabCallback_Parcel + 51;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            access000(list);
            obj.hashCode();
            throw null;
        }
        String strAccess000 = access000(list);
        int i3 = IAuthTabCallback_Parcel + 125;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return strAccess000;
        }
        throw null;
    }

    public static final /* synthetic */ Regex IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault;
        }
        throw null;
    }

    public static final /* synthetic */ Map onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        Map<String, Integer> map = asInterface;
        int i5 = i3 + 39;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return map;
    }

    public static final /* synthetic */ Regex onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 33;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Regex regex = onTransact;
        int i5 = i2 + 39;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return regex;
    }

    public static final /* synthetic */ List onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        List<r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY> list = IAuthTabCallbackStubProxy;
        int i5 = i3 + 27;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ onExtraCallback onWarmupCompleted() {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 37;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            onextracallback = Companion;
            int i4 = 71 / 0;
        } else {
            onextracallback = Companion;
        }
        int i5 = i2 + 113;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return onExtraCallback.onExtraCallback(Companion, str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback.onExtraCallback(Companion, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getBidToken
    public loadNextAdForZoneId onWarmupCompleted(@NotNull String str, @NotNull String str2, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            getAndResetCustomPostBody.onWarmupCompleted(str);
            StringsKt.isBlank(str2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strOnWarmupCompleted = getAndResetCustomPostBody.onWarmupCompleted(str);
        if (!StringsKt.isBlank(str2)) {
            strOnWarmupCompleted = StringsKt.replace$default(strOnWarmupCompleted, str2, this.getInterfaceDescriptor.onExtraCallback(str2), false, 4, (Object) null);
        }
        if (!z) {
            return new loadNextAdForZoneId(strOnWarmupCompleted, clearFaultAdjacentMetadata.onExtraCallback());
        }
        int i3 = access100 + 111;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        loadNextAdForZoneId loadnextadforzoneidOnWarmupCompleted = onExtraCallback.onWarmupCompleted(Companion, strOnWarmupCompleted);
        int i5 = IAuthTabCallback_Parcel + 97;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return loadnextadforzoneidOnWarmupCompleted;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7;
            int i8 = ~i3;
            int i9 = ~i;
            int i10 = ~(i8 | i9);
            int i11 = ~i4;
            int i12 = ~(i9 | i11);
            int i13 = i10 | i12;
            int i14 = (~(i4 | i9 | i3)) | (~(i8 | i)) | (~(i11 | i8));
            int i15 = i3 + i + i2 + ((-1336646162) * i5) + (1706069763 * i6);
            int i16 = i15 * i15;
            int i17 = ((i3 * (-1709230891)) - 203685888) + ((-1709230891) * i) + ((-1137600936) * i13) + (568800468 * i12) + ((-568800468) * i14) + (2016935936 * i2) + ((-602931200) * i5) + ((-1331167232) * i6) + ((-1604583424) * i16);
            int i18 = ((i3 * 112646815) - 831444653) + (i * 112646815) + (i13 * 520) + (i12 * (-260)) + (i14 * 260) + (i2 * 112647075) + (i5 * (-2078048118)) + (i6 * (-2015059991)) + (i16 * (-829161472));
            int i19 = i17 + (i18 * i18 * (-1266417664));
            if (i19 == 1) {
                return onWarmupCompleted(objArr);
            }
            if (i19 == 2) {
                return onExtraCallback(objArr);
            }
            String str = (String) objArr[1];
            int i20 = 2 % 2;
            int i21 = onExtraCallback + 19;
            onWarmupCompleted = i21 % 128;
            if (i21 % 2 != 0 ? str.length() < 5 : str.length() < 2) {
                return false;
            }
            String strSubstring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String str2 = strSubstring + strSubstring2;
            int length = str2.length();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i22 < length) {
                    char cCharAt = str2.charAt(i22);
                    if (Character.isDigit(cCharAt)) {
                        int i24 = onWarmupCompleted + 23;
                        onExtraCallback = i24 % 128;
                        i7 = i24 % 2 != 0 ? cCharAt >> '0' : cCharAt - '0';
                    } else {
                        if ('A' > cCharAt || cCharAt >= '[') {
                            break;
                        }
                        int i25 = onWarmupCompleted + 85;
                        onExtraCallback = i25 % 128;
                        int i26 = i25 % 2;
                        i7 = cCharAt - '7';
                    }
                    i23 = ((i7 > 9 ? i23 * 100 : i23 * 10) + i7) % 97;
                    i22++;
                } else if (i23 == 1) {
                    int i27 = onWarmupCompleted + 89;
                    onExtraCallback = i27 % 128;
                    int i28 = i27 % 2;
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ CharSequence onExtraCallbackWithResult(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceAsBinder = asBinder(str);
            if (i3 == 0) {
                int i4 = 68 / 0;
            }
            return charSequenceAsBinder;
        }

        public static /* synthetic */ CharSequence onExtraCallbackWithResult(Ref.BooleanRef booleanRef, MatchResult matchResult) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onWarmupCompleted(booleanRef, matchResult);
                obj.hashCode();
                throw null;
            }
            CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(booleanRef, matchResult);
            int i3 = onWarmupCompleted + 71;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return charSequenceOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        private final boolean onNavigationEvent(char c) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if ('0' <= c) {
                int i5 = i3 + 121;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (c < ':') {
                    return true;
                }
            }
            if ('A' <= c) {
                int i7 = onExtraCallback + 85;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    if (c < 'V') {
                        return true;
                    }
                } else if (c < '[') {
                    return true;
                }
            }
            return 'a' <= c && c < '{';
        }

        private onExtraCallback() {
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            String str = (String) objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = onextracallback.onExtraCallback(str);
            int i4 = onExtraCallback + 103;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return strOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ String onExtraCallback(onExtraCallback onextracallback, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallbackStub = onextracallback.IAuthTabCallbackStub(str);
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return strIAuthTabCallbackStub;
            }
            throw null;
        }

        public static final /* synthetic */ loadNextAdForZoneId onWarmupCompleted(onExtraCallback onextracallback, String str) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback.asInterface(str);
            }
            onextracallback.asInterface(str);
            throw null;
        }

        private final String IAuthTabCallbackStub(String str) {
            int i = 2 % 2;
            String strJoinToString$default = CollectionsKt.joinToString$default(StringsKt.split$default(str, new String[]{" "}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$Companion$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 81;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    CharSequence charSequenceOnExtraCallbackWithResult = AppLovinAdServiceImpl.onExtraCallback.onExtraCallbackWithResult((String) obj);
                    if (i4 != 0) {
                        int i5 = 5 / 0;
                    }
                    int i6 = onWarmupCompleted + 17;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return charSequenceOnExtraCallbackWithResult;
                }
            }, 30, (Object) null);
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return strJoinToString$default;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final CharSequence asBinder(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String strOnTransact = AppLovinAdServiceImpl.onWarmupCompleted().onTransact(str);
            int i4 = onExtraCallback + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return strOnTransact;
        }

        private final String onTransact(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            List<String> listIAuthTabCallback = IAuthTabCallback(str);
            if (listIAuthTabCallback.size() <= 2) {
                return str;
            }
            String str2 = CollectionsKt.first(listIAuthTabCallback) + getAndResetCustomPostBody.onExtraCallbackWithResult(listIAuthTabCallback.size() - 2) + CollectionsKt.last(listIAuthTabCallback);
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final List<String> IAuthTabCallback(String str) {
            int i = 2 % 2;
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            ArrayList arrayList = new ArrayList();
            int iFirst = characterInstance.first();
            int next = characterInstance.next();
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                int i4 = next;
                int i5 = iFirst;
                iFirst = i4;
                if (iFirst == -1) {
                    return arrayList;
                }
                String strSubstring = str.substring(i5, iFirst);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                arrayList.add(strSubstring);
                next = characterInstance.next();
                int i6 = onWarmupCompleted + 13;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 5;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final loadNextAdForZoneId asInterface(String str) throws IOException {
            String strOnWarmupCompleted = str;
            int i = 2 % 2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = str.length();
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = strOnWarmupCompleted.charAt(i3);
                if (Character.isDigit(cCharAt)) {
                    int i4 = onExtraCallback + 97;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        i2++;
                    }
                } else if (cCharAt == '@') {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 81;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 103;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 4 / 4;
                    }
                    z = true;
                } else if (('A' <= cCharAt && cCharAt < '[') || ('a' <= cCharAt && cCharAt < '{')) {
                    z2 = true;
                } else if (cCharAt != '.') {
                    int i10 = onWarmupCompleted + 65;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (cCharAt == 'Q') {
                            z3 = true;
                        }
                    } else if (cCharAt == ':') {
                    }
                }
            }
            if (z) {
                strOnWarmupCompleted = (String) IAuthTabCallback(-1917866117, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1917866118, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, strOnWarmupCompleted, linkedHashSet});
            }
            if (!(!z2) && i2 >= 2) {
                strOnWarmupCompleted = onWarmupCompleted(strOnWarmupCompleted, linkedHashSet);
            }
            if (!z3) {
                int i11 = onExtraCallback + 1;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                if (i2 >= 14) {
                    strOnWarmupCompleted = addCustomQueryParams.onWarmupCompleted(strOnWarmupCompleted, AppLovinAdServiceImpl.onNavigationEvent(), linkedHashSet);
                }
            }
            return new loadNextAdForZoneId(strOnWarmupCompleted, linkedHashSet);
        }

        private static final CharSequence onWarmupCompleted(Ref.BooleanRef booleanRef, MatchResult matchResult) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(matchResult, "");
            booleanRef.element = true;
            String str = (String) matchResult.getGroupValues().get(1);
            String str2 = (String) matchResult.getGroupValues().get(2);
            if (str.length() > 2) {
                return StringsKt.take(str, 2) + getAndResetCustomPostBody.onExtraCallbackWithResult(str.length() - 2) + "@" + str2;
            }
            String str3 = getAndResetCustomPostBody.onExtraCallbackWithResult(str.length()) + "@" + str2;
            int i4 = onWarmupCompleted + 61;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str3;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            String str = (String) objArr[1];
            Set set = (Set) objArr[2];
            int i = 2 % 2;
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            String strOnNavigationEvent = AppLovinAdServiceImpl.onExtraCallbackWithResult().onNavigationEvent(str, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$Companion$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    CharSequence charSequenceOnExtraCallbackWithResult;
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 121;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        charSequenceOnExtraCallbackWithResult = AppLovinAdServiceImpl.onExtraCallback.onExtraCallbackWithResult(booleanRef, (MatchResult) obj);
                        int i4 = 72 / 0;
                    } else {
                        charSequenceOnExtraCallbackWithResult = AppLovinAdServiceImpl.onExtraCallback.onExtraCallbackWithResult(booleanRef, (MatchResult) obj);
                    }
                    int i5 = IAuthTabCallback + 53;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return charSequenceOnExtraCallbackWithResult;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            if (booleanRef.element) {
                int i2 = onWarmupCompleted + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    set.add(r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4.EMAIL);
                    int i3 = 19 / 0;
                } else {
                    set.add(r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4.EMAIL);
                }
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            return strOnNavigationEvent;
        }

        private final String onWarmupCompleted(String str, Set<loadNextAdForAdToken> set) throws IOException {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int last = 0;
            while (last < str.length()) {
                MatchResult matchResultOnExtraCallbackWithResult = AppLovinAdServiceImpl.IAuthTabCallback().onExtraCallbackWithResult(str, last);
                if (matchResultOnExtraCallbackWithResult == null) {
                    sb.append((CharSequence) str, last, str.length());
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
                int first = matchResultOnExtraCallbackWithResult.onExtraCallback().getFirst();
                Map mapOnExtraCallback = AppLovinAdServiceImpl.onExtraCallback();
                String upperCase = ((String) matchResultOnExtraCallbackWithResult.getGroupValues().get(1)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                Integer num = (Integer) mapOnExtraCallback.get(upperCase);
                Object obj = null;
                Integer numOnWarmupCompleted = num != null ? AppLovinAdServiceImpl.onWarmupCompleted().onWarmupCompleted(str, first, num.intValue()) : null;
                if (numOnWarmupCompleted == null) {
                    sb.append((CharSequence) str, last, matchResultOnExtraCallbackWithResult.onExtraCallback().getLast() + 1);
                    last = matchResultOnExtraCallbackWithResult.onExtraCallback().getLast() + 1;
                } else {
                    String strSubstring = str.substring(first, numOnWarmupCompleted.intValue());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    sb.append((CharSequence) str, last, first);
                    StringBuilder sb2 = new StringBuilder();
                    for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                        char cCharAt = strSubstring.charAt(i4);
                        if (!CharsKt.IAuthTabCallback(cCharAt)) {
                            int i5 = onWarmupCompleted + 15;
                            onExtraCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                sb2.append(cCharAt);
                                obj.hashCode();
                                throw null;
                            }
                            sb2.append(cCharAt);
                        }
                    }
                    String upperCase2 = sb2.toString().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    if (((Boolean) IAuthTabCallback(-27511879, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 27511879, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, upperCase2})).booleanValue()) {
                        sb.append(onWarmupCompleted(strSubstring));
                        set.add(r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8.IBAN);
                    } else {
                        sb.append(strSubstring);
                    }
                    last = numOnWarmupCompleted.intValue();
                    int i6 = onExtraCallback + 73;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }

        private final Integer onWarmupCompleted(String str, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            int i7 = i;
            while (i7 < str.length() && i6 < i2) {
                char cCharAt = str.charAt(i7);
                if (onNavigationEvent(cCharAt)) {
                    i6++;
                    int i8 = onExtraCallback + 65;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                } else if (!CharsKt.IAuthTabCallback(cCharAt)) {
                    int i10 = onExtraCallback + 99;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                i7++;
                int i11 = onWarmupCompleted + 73;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
            }
            if (i6 < i2) {
                return null;
            }
            while (i7 > i && CharsKt.IAuthTabCallback(str.charAt(i7 - 1))) {
                int i13 = onExtraCallback + 53;
                onWarmupCompleted = i13 % 128;
                i7 = i13 % 2 == 0 ? i7 + 30 : i7 - 1;
            }
            if (i7 >= str.length() || CharsKt.IAuthTabCallback(str.charAt(i7))) {
                return Integer.valueOf(i7);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final String onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (AppLovinAdServiceImpl.onWarmupCompleted().onNavigationEvent(str.charAt(i3))) {
                    int i4 = onExtraCallback + 37;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    i2++;
                }
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (!onNavigationEvent(cCharAt)) {
                    sb.append(cCharAt);
                } else if (i6 >= 2) {
                    int i8 = onExtraCallback;
                    int i9 = i8 + 39;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0 ? i6 >= i2 - 4 : i6 >= i2 / 4) {
                        sb.append(cCharAt);
                    } else {
                        int i10 = i8 + 81;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0) {
                            sb.append("*");
                            int i11 = 58 / 0;
                        } else {
                            sb.append("*");
                        }
                    }
                    i6++;
                    int i12 = onWarmupCompleted + 103;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        private final String onExtraCallback(String str) {
            int i = 2 % 2;
            if (!StringsKt.endsWith$default(str, ":", false, 2, (Object) null)) {
                int i2 = onWarmupCompleted + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0 ? StringsKt.indexOf$default(str, "::", 0, false, 6, (Object) null) == StringsKt.lastIndexOf$default(str, "::", 0, false, 6, (Object) null) : StringsKt.indexOf$default(str, "::", 1, false, 15, (Object) null) == StringsKt.lastIndexOf$default(str, "::", 1, true, 54, (Object) null)) {
                    List listSplit$default = StringsKt.split$default(str, new String[]{":"}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listSplit$default) {
                        if (((String) obj).length() > 0) {
                            int i3 = onWarmupCompleted + 39;
                            onExtraCallback = i3 % 128;
                            int i4 = i3 % 2;
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() <= 7) {
                        return StringsKt.substringBeforeLast$default(str, ':', (String) null, 2, (Object) null) + ":" + getAndResetCustomPostBody.onExtraCallbackWithResult(4);
                    }
                }
            }
            int i5 = onExtraCallback + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static final /* synthetic */ String onExtraCallbackWithResult(onExtraCallback onextracallback, String str) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return (String) IAuthTabCallback(-1747678865, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1747678867, iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback, str});
        }

        private final boolean onNavigationEvent(String str) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return ((Boolean) IAuthTabCallback(-27511879, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 27511879, iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, str})).booleanValue();
        }

        private final String IAuthTabCallback(String str, Set<loadNextAdForAdToken> set) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return (String) IAuthTabCallback(-1917866117, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1917866118, iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, str, set});
        }
    }

    static {
        Regex regex = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*|\\s+)(\\d{2})(\\d{2})(\\s*-\\s*|\\s+)(\\d{4})(\\s*-\\s*|\\s+)(\\d{4})(?=\\s|$)");
        onExtraCallbackWithResult = regex;
        Regex regex2 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*|\\s+)(\\d{2})(\\d{4})(\\s*-\\s*|\\s+)(\\d)(\\d{4})(?=\\s|$)");
        IAuthTabCallback = regex2;
        Regex regex3 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*|\\s+)(\\d{2})(\\d{2})(\\s*-\\s*|\\s+)(\\d{3})(\\d)(\\s*-\\s*|\\s+)(\\d{3})(?=\\s|$)");
        onNavigationEvent = regex3;
        Regex regex4 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*|\\s+)(\\d{2})(\\d{4})(\\s*-\\s*|\\s+)(\\d{4})(?=\\s|$)");
        onWarmupCompleted = regex4;
        Regex regex5 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*|\\s+)(\\d{2})(\\d{2})(\\s*-\\s*|\\s+)(\\d{2})(\\d{2})(\\s*-\\s*|\\s+)(\\d{2})(?=\\s|$)");
        onExtraCallback = regex5;
        Regex regex6 = new Regex("(?<=\\s|^)(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(?=\\s|$)");
        asBinder = regex6;
        Regex regex7 = new Regex("(?<=\\s|^)(([0-9a-fA-F]{1,4}:){7})([0-9a-fA-F]{1,4})(?=\\s|$)");
        access000 = regex7;
        Regex regex8 = new Regex("(?<=\\s|^)(([0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4})*)?::([0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4})*)?)(?=\\s|$)");
        IAuthTabCallbackStub = regex8;
        IAuthTabCallbackDefault = new Regex("(?<=\\s|^)([A-Za-z]{2})(\\d{2})");
        asInterface = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("AD", 24), getWrite.IAuthTabCallback("AE", 23), getWrite.IAuthTabCallback("AL", 28), getWrite.IAuthTabCallback("AT", 20), getWrite.IAuthTabCallback("AZ", 28), getWrite.IAuthTabCallback("BA", 20), getWrite.IAuthTabCallback("BE", 16), getWrite.IAuthTabCallback("BG", 22), getWrite.IAuthTabCallback("BH", 22), getWrite.IAuthTabCallback("BI", 27), getWrite.IAuthTabCallback("BR", 29), getWrite.IAuthTabCallback("BY", 28), getWrite.IAuthTabCallback("CH", 21), getWrite.IAuthTabCallback("CR", 22), getWrite.IAuthTabCallback("CY", 28), getWrite.IAuthTabCallback("CZ", 24), getWrite.IAuthTabCallback("DE", 22), getWrite.IAuthTabCallback("DJ", 27), getWrite.IAuthTabCallback("DK", 18), getWrite.IAuthTabCallback("DO", 28), getWrite.IAuthTabCallback("EE", 20), getWrite.IAuthTabCallback("EG", 29), getWrite.IAuthTabCallback("ES", 24), getWrite.IAuthTabCallback("FI", 18), getWrite.IAuthTabCallback("FK", 18), getWrite.IAuthTabCallback("FO", 18), getWrite.IAuthTabCallback("FR", 27), getWrite.IAuthTabCallback("GB", 22), getWrite.IAuthTabCallback("GE", 22), getWrite.IAuthTabCallback("GI", 23), getWrite.IAuthTabCallback("GL", 18), getWrite.IAuthTabCallback("GR", 27), getWrite.IAuthTabCallback("GT", 28), getWrite.IAuthTabCallback("HN", 28), getWrite.IAuthTabCallback("HR", 21), getWrite.IAuthTabCallback("HU", 28), getWrite.IAuthTabCallback("IE", 22), getWrite.IAuthTabCallback("IL", 23), getWrite.IAuthTabCallback("IQ", 23), getWrite.IAuthTabCallback("IS", 26), getWrite.IAuthTabCallback("IT", 27), getWrite.IAuthTabCallback("JO", 30), getWrite.IAuthTabCallback("KW", 30), getWrite.IAuthTabCallback("KZ", 20), getWrite.IAuthTabCallback("LB", 28), getWrite.IAuthTabCallback("LC", 32), getWrite.IAuthTabCallback("LI", 21), getWrite.IAuthTabCallback("LT", 20), getWrite.IAuthTabCallback("LU", 20), getWrite.IAuthTabCallback("LV", 21), getWrite.IAuthTabCallback("LY", 25), getWrite.IAuthTabCallback("MC", 27), getWrite.IAuthTabCallback("MD", 24), getWrite.IAuthTabCallback("ME", 22), getWrite.IAuthTabCallback("MK", 19), getWrite.IAuthTabCallback("MN", 20), getWrite.IAuthTabCallback("MR", 27), getWrite.IAuthTabCallback("MT", 31), getWrite.IAuthTabCallback("MU", 30), getWrite.IAuthTabCallback("NI", 28), getWrite.IAuthTabCallback("NL", 18), getWrite.IAuthTabCallback("NO", 15), getWrite.IAuthTabCallback("OM", 23), getWrite.IAuthTabCallback("PK", 24), getWrite.IAuthTabCallback("PL", 28), getWrite.IAuthTabCallback("PS", 29), getWrite.IAuthTabCallback("PT", 25), getWrite.IAuthTabCallback("QA", 29), getWrite.IAuthTabCallback("RO", 24), getWrite.IAuthTabCallback("RS", 22), getWrite.IAuthTabCallback("RU", 33), getWrite.IAuthTabCallback("SA", 24), getWrite.IAuthTabCallback("SC", 31), getWrite.IAuthTabCallback("SD", 18), getWrite.IAuthTabCallback("SE", 24), getWrite.IAuthTabCallback("SI", 19), getWrite.IAuthTabCallback("SK", 24), getWrite.IAuthTabCallback("SM", 27), getWrite.IAuthTabCallback("SO", 23), getWrite.IAuthTabCallback("ST", 25), getWrite.IAuthTabCallback("SV", 28), getWrite.IAuthTabCallback("TL", 23), getWrite.IAuthTabCallback("TN", 24), getWrite.IAuthTabCallback("TR", 26), getWrite.IAuthTabCallback("UA", 29), getWrite.IAuthTabCallback("VA", 22), getWrite.IAuthTabCallback("VG", 24), getWrite.IAuthTabCallback("XK", 20), getWrite.IAuthTabCallback("YE", 30)});
        r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8 r8lambdalfzppkxfgqyk48bckkl0qutjcf8 = r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8.IP;
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult = addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfzppkxfgqyk48bckkl0qutjcf8, regex6, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 29;
                onNavigationEvent = i2 % 128;
                List list = (List) obj;
                if (i2 % 2 == 0) {
                    return AppLovinAdServiceImpl.asBinder(list);
                }
                AppLovinAdServiceImpl.asBinder(list);
                throw null;
            }
        });
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult2 = addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfzppkxfgqyk48bckkl0qutjcf8, regex7, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i2 % 128;
                Object obj2 = null;
                List list = (List) obj;
                if (i2 % 2 != 0) {
                    AppLovinAdServiceImpl.onExtraCallbackWithResult(list);
                    obj2.hashCode();
                    throw null;
                }
                String strOnExtraCallbackWithResult = AppLovinAdServiceImpl.onExtraCallbackWithResult(list);
                int i3 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return strOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        });
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyzieky = new r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY(r8lambdalfzppkxfgqyk48bckkl0qutjcf8, regex8, null, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = (String) AppLovinAdServiceImpl.IAuthTabCallback(946791623, new Object[]{(MatchResult) obj}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -946791622, alertWithArgs.onExtraCallbackWithResult());
                int i4 = onWarmupCompleted + 27;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }
        }, 4, null);
        r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 r8lambdalfscfjiyypbsofgw6debt6z4b4 = r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4.CARD_NUMBER;
        IAuthTabCallbackStubProxy = CollectionsKt.listOf(new r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY[]{r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult, r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult2, r8lambdarbv3rxsgnvgjhknxmwmoyzieky, addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 79;
                onExtraCallbackWithResult = i2 % 128;
                List list = (List) obj;
                if (i2 % 2 != 0) {
                    AppLovinAdServiceImpl.onExtraCallback(list);
                    throw null;
                }
                String strOnExtraCallback = AppLovinAdServiceImpl.onExtraCallback(list);
                int i3 = onExtraCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return strOnExtraCallback;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex2, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String str = (String) AppLovinAdServiceImpl.IAuthTabCallback(2102437855, new Object[]{(List) obj}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -2102437852, alertWithArgs.onExtraCallbackWithResult());
                int i4 = IAuthTabCallback + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex3, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String strIAuthTabCallback = AppLovinAdServiceImpl.IAuthTabCallback((List) obj);
                int i4 = onExtraCallback + 13;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
                return strIAuthTabCallback;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex4, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String strOnWarmupCompleted = AppLovinAdServiceImpl.onWarmupCompleted((List) obj);
                if (i3 != 0) {
                    int i4 = 19 / 0;
                }
                int i5 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return strOnWarmupCompleted;
                }
                throw null;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex5, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.EuPiiSanitizer$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strOnNavigationEvent = AppLovinAdServiceImpl.onNavigationEvent((List) obj);
                if (i3 != 0) {
                    int i4 = 27 / 0;
                }
                return strOnNavigationEvent;
            }
        })});
        int i = extraCallbackWithResult + 47;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onTransact(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + "." + list.get(2) + "." + list.get(3) + ".*";
        int i2 = access100 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return str;
    }

    private static final String asInterface(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + getAndResetCustomPostBody.onExtraCallbackWithResult(4);
        int i2 = access100 + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String IAuthTabCallback(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            Object[] objArr = {Companion, matchResult.onExtraCallbackWithResult()};
            return (String) onExtraCallback.IAuthTabCallback(-1747678865, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1747678867, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr);
        }
        Intrinsics.checkNotNullParameter(matchResult, "");
        Object[] objArr2 = {Companion, matchResult.onExtraCallbackWithResult()};
        int i3 = 24 / 0;
        return (String) onExtraCallback.IAuthTabCallback(-1747678865, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1747678867, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2);
    }

    private static final String IAuthTabCallbackDefault(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(4) + list.get(7) + list.get(8);
        int i2 = IAuthTabCallback_Parcel + 53;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final String IAuthTabCallbackStubProxy(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(4) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(1) + list.get(7);
        int i2 = access100 + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String access000(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(4) + list.get(5) + list.get(6);
        int i2 = access100 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String IAuthTabCallback_Parcel(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(7) + list.get(8) + list.get(9);
        int i2 = access100 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(MatchResult matchResult) {
        return (String) IAuthTabCallback(946791623, new Object[]{matchResult}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -946791622, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ String IAuthTabCallbackStub(List list) {
        return (String) IAuthTabCallback(2102437855, new Object[]{list}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -2102437852, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final String onExtraCallback(String str) {
        return (String) IAuthTabCallback(-1390515760, new Object[]{str}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1390515762, alertWithArgs.onExtraCallbackWithResult());
    }

    private static final String getInterfaceDescriptor(List list) {
        return (String) IAuthTabCallback(-335930477, new Object[]{list}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 335930477, alertWithArgs.onExtraCallbackWithResult());
    }
}
