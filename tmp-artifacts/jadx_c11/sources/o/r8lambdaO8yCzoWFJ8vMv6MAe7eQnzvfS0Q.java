package o;

import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q implements getBidToken {
    private static final Regex IAuthTabCallback;
    private static final Regex IAuthTabCallbackDefault;
    private static final Regex IAuthTabCallbackStubProxy;
    private static int ICustomTabsCallback = 0;
    private static final Regex access000;
    private static final Regex asBinder;
    private static final Regex asInterface;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static final List<r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY> getInterfaceDescriptor;
    private static final Regex onExtraCallback;
    private static final Regex onExtraCallbackWithResult;
    private static final Set<String> onNavigationEvent;
    private static final Regex onTransact;
    private static final Regex onWarmupCompleted;
    private static int readTypedObject = 1;
    private final collectBidToken access100 = new collectBidToken(new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallback((String) obj);
            int i4 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });
    private static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final Regex IAuthTabCallbackStub = new Regex("([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})");
    private static final Regex IAuthTabCallback_Parcel = new Regex("(?<=\\s|^)([A-Z]\\d{3})([A-Z]\\d{4}|\\d{5})(?=\\s|$)");

    public static /* synthetic */ CharSequence IAuthTabCallback(Ref.BooleanRef booleanRef, MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(booleanRef, matchResult);
        int i4 = ICustomTabsCallback + 75;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return charSequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ String IAuthTabCallback(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        if (i3 == 0) {
            str2 = (String) onExtraCallbackWithResult(264912704, iOnNavigationEvent2, iOnNavigationEvent4, objArr, iOnNavigationEvent, -264912702, iOnNavigationEvent3);
            int i4 = 78 / 0;
        } else {
            str2 = (String) onExtraCallbackWithResult(264912704, iOnNavigationEvent2, iOnNavigationEvent4, objArr, iOnNavigationEvent, -264912702, iOnNavigationEvent3);
        }
        int i5 = readTypedObject + 125;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str2;
    }

    public static /* synthetic */ String IAuthTabCallback(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(list);
        }
        IAuthTabCallbackStubProxy(list);
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strExtraCallback = extraCallback(list);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = ICustomTabsCallback + 1;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return strExtraCallback;
    }

    public static /* synthetic */ String asBinder(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(list);
        int i4 = ICustomTabsCallback + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return strAsInterface;
    }

    public static /* synthetic */ String onExtraCallback(List list) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            return (String) onExtraCallbackWithResult(-2012228788, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{list}, iOnNavigationEvent, 2012228792, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent5 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent6 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~((~i4) | i8)) | i7;
        int i10 = i5 | i8;
        int i11 = (~(i4 | i7 | i8)) | (~(i | i5));
        int i12 = i + i5 + i2 + (2049387148 * i6) + ((-609071723) * i3);
        int i13 = i12 * i12;
        int i14 = ((1483459036 * i) - 1284505600) + (2005429323 * i5) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i2) + ((-243269632) * i6) + ((-895483904) * i3) + ((-1334837248) * i13);
        int i15 = ((i * 335895516) - 1139737737) + (i5 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i2 * 335896449) + (i6 * (-616405876)) + (i3 * 126640917) + (i13 * 2020605952);
        int i16 = i14 + (i15 * i15 * (-544210944));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? i16 != 5 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        List list = (List) objArr[0];
        int i17 = 2 % 2;
        int i18 = ICustomTabsCallback + 85;
        readTypedObject = i18 % 128;
        int i19 = i18 % 2;
        String strAccess000 = access000(list);
        int i20 = ICustomTabsCallback + 119;
        readTypedObject = i20 % 128;
        int i21 = i20 % 2;
        return strAccess000;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        MatchResult matchResult = (MatchResult) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(booleanRef, matchResult);
        }
        onWarmupCompleted(booleanRef, matchResult);
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        String str = (String) onExtraCallbackWithResult(-2012967095, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{list}, iOnNavigationEvent, 2012967100, iOnNavigationEvent3);
        int i4 = readTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return str;
    }

    public static /* synthetic */ String onNavigationEvent(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strExtraCallbackWithResult = extraCallbackWithResult(list);
        int i4 = ICustomTabsCallback + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return strExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ String onTransact(List list) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strAccess100 = access100(list);
        int i4 = ICustomTabsCallback + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return strAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strWriteTypedObject = writeTypedObject(list);
        int i4 = readTypedObject + 57;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return strWriteTypedObject;
    }

    public static /* synthetic */ String onWarmupCompleted(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(matchResult);
        int i4 = ICustomTabsCallback + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 91;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, i);
        int i5 = ICustomTabsCallback + 125;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Set onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Set<String> set = onNavigationEvent;
        int i5 = i3 + 65;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return makeAlignFaceBitmap.IAuthTabCallback(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        makeAlignFaceBitmap.IAuthTabCallback(str);
        throw null;
    }

    @Override // o.getBidToken
    public loadNextAdForZoneId onWarmupCompleted(@NotNull String str, @NotNull String str2, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strOnWarmupCompleted = getAndResetCustomPostBody.onWarmupCompleted(str);
        if (!StringsKt.isBlank(str2)) {
            strOnWarmupCompleted = StringsKt.replace$default(strOnWarmupCompleted, str2, this.access100.onExtraCallback(str2), false, 4, (Object) null);
        }
        if (!z) {
            return new loadNextAdForZoneId(strOnWarmupCompleted, clearFaultAdjacentMetadata.onExtraCallback());
        }
        loadNextAdForZoneId loadnextadforzoneidOnWarmupCompleted = onWarmupCompleted(strOnWarmupCompleted);
        int i4 = readTypedObject + 53;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return loadnextadforzoneidOnWarmupCompleted;
    }

    private static final CharSequence onWarmupCompleted(Ref.BooleanRef booleanRef, MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(matchResult, "");
        booleanRef.element = true;
        String str = (String) matchResult.getGroupValues().get(1);
        String str2 = (String) matchResult.getGroupValues().get(2);
        if (str.length() <= 2) {
            return getAndResetCustomPostBody.onExtraCallbackWithResult(str.length()) + "@" + str2;
        }
        String str3 = StringsKt.take(str, 2) + getAndResetCustomPostBody.onExtraCallbackWithResult(str.length() - 2) + "@" + str2;
        int i4 = readTypedObject + 65;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str3;
        }
        throw null;
    }

    private static final CharSequence onExtraCallbackWithResult(Ref.BooleanRef booleanRef, MatchResult matchResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(matchResult, "");
        booleanRef.element = true;
        String str = matchResult.getGroupValues().get(1) + getAndResetCustomPostBody.onExtraCallbackWithResult(5);
        int i2 = ICustomTabsCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private final loadNextAdForZoneId onWarmupCompleted(String str) {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = str.length();
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isDigit(cCharAt)) {
                i2++;
            } else if (cCharAt == '@') {
                int i4 = ICustomTabsCallback + 29;
                readTypedObject = i4 % 128;
                z = i4 % 2 != 0;
            } else if ('A' <= cCharAt && cCharAt < '[') {
                z2 = true;
            }
        }
        if (z) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            str = IAuthTabCallbackStub.onNavigationEvent(str, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 119;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = {booleanRef, (MatchResult) obj};
                    int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                    CharSequence charSequence = (CharSequence) r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallbackWithResult(-543087480, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, 543087481, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
                    int i8 = IAuthTabCallback + 39;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        return charSequence;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            if (booleanRef.element) {
                linkedHashSet.add(r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4.EMAIL);
            }
        }
        if (z2 && i2 >= 7) {
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            str = IAuthTabCallback_Parcel.onNavigationEvent(str, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    CharSequence charSequenceIAuthTabCallback;
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 55;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        charSequenceIAuthTabCallback = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallback(booleanRef2, (MatchResult) obj);
                        int i7 = 14 / 0;
                    } else {
                        charSequenceIAuthTabCallback = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallback(booleanRef2, (MatchResult) obj);
                    }
                    int i8 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        return charSequenceIAuthTabCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            if (booleanRef2.element) {
                int i5 = ICustomTabsCallback + 61;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                linkedHashSet.add(r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc.PASSPORT);
            }
        }
        return i2 < 9 ? new loadNextAdForZoneId(str, linkedHashSet) : new loadNextAdForZoneId(addCustomQueryParams.onWarmupCompleted(str, getInterfaceDescriptor, linkedHashSet), linkedHashSet);
    }

    static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static final /* synthetic */ String onExtraCallback(IAuthTabCallback iAuthTabCallback, MatchResult matchResult) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback.IAuthTabCallback(matchResult);
            }
            iAuthTabCallback.IAuthTabCallback(matchResult);
            throw null;
        }

        public static final /* synthetic */ boolean onExtraCallback(IAuthTabCallback iAuthTabCallback, String str, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean zIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(str, i);
            int i5 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return zIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final boolean IAuthTabCallback(String str, int i) {
            int i2 = 2 % 2;
            int i3 = i - 1;
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            while (i3 >= 0 && str.charAt(i3) == ' ') {
                int i6 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i3--;
            }
            if (i3 < 0) {
                return false;
            }
            int i8 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return str.charAt(i3) == '-';
        }

        private final String IAuthTabCallback(MatchResult matchResult) {
            int i = 2 % 2;
            String strOnExtraCallbackWithResult = matchResult.onExtraCallbackWithResult();
            List groupValues = matchResult.getGroupValues();
            StringBuilder sb = new StringBuilder();
            int length = 0;
            for (int i2 = 1; i2 < groupValues.size(); i2 += 2) {
                String str = (String) groupValues.get(i2);
                if (str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append('-');
                        int i3 = onNavigationEvent + 17;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    sb.append(str.length());
                    length += str.length();
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onWarmupCompleted().contains(string)) {
                return strOnExtraCallbackWithResult;
            }
            StringBuilder sb2 = new StringBuilder();
            int length2 = strOnExtraCallbackWithResult.length();
            int i5 = 0;
            for (int i6 = 0; i6 < length2; i6++) {
                char cCharAt = strOnExtraCallbackWithResult.charAt(i6);
                if (!Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                } else {
                    if (i5 < 3 || i5 >= length - 4) {
                        sb2.append(cCharAt);
                    } else {
                        int i7 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        sb2.append("*");
                    }
                    i5++;
                }
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
    }

    static {
        Regex regex = new Regex("(?<=\\s|^)(01[0-9])(\\s*-\\s*)?(\\d{3,4})(\\s*-\\s*)?(\\d{4})(?=\\s|$)");
        IAuthTabCallbackStubProxy = regex;
        Regex regex2 = new Regex("(?<=\\s|^)(0(?:2|[3-6][1-9]))(\\s*-\\s*)?(\\d{3,4})(\\s*-\\s*)?(\\d{4})(?=\\s|$)");
        asBinder = regex2;
        Regex regex3 = new Regex("(?<=\\s|^)(서울|부산|대구|인천|광주|대전|울산|세종|경기|강원|충북|충남|전북|전남|경북|경남|제주|\\d{2})(\\s*-\\s*)(\\d{2})(\\s*-\\s*)(\\d{3})(\\d{3})(\\s*-\\s*)(\\d{2})(?=\\s|$)");
        asInterface = regex3;
        Regex regex4 = new Regex("(?<=\\s|^)(\\d{6})(\\s*-\\s*)([1-8]\\d{6})(?=\\s|$)");
        access000 = regex4;
        Regex regex5 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*)(\\d{2})(\\d{2})(\\s*-\\s*)(\\d{4})(\\s*-\\s*)(\\d{4})(?=\\s|$)");
        IAuthTabCallback = regex5;
        Regex regex6 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*)(\\d{2})(\\d{4})(\\s*-\\s*)(\\d)(\\d{4})(?=\\s|$)");
        onExtraCallbackWithResult = regex6;
        Regex regex7 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*)(\\d{2})(\\d{2})(\\s*-\\s*)(\\d{3})(\\d)(\\s*-\\s*)(\\d{3})(?=\\s|$)");
        onExtraCallback = regex7;
        Regex regex8 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*)(\\d{2})(\\d{4})(\\s*-\\s*)(\\d{4})(?=\\s|$)");
        onTransact = regex8;
        Regex regex9 = new Regex("(?<=\\s|^)(\\d{4})(\\s*-\\s*)(\\d{2})(\\d{2})(\\s*-\\s*)(\\d{2})(\\d{2})(\\s*-\\s*)(\\d{2})(?=\\s|$)");
        IAuthTabCallbackDefault = regex9;
        Regex regex10 = new Regex("(?<=\\s|^)(\\d+)(\\s*-\\s*)(\\d+)(\\s*-\\s*)(\\d+)(?:(\\s*-\\s*)(\\d+))?(?:(\\s*-\\s*)(\\d+))?(?=\\s|$)");
        onWarmupCompleted = regex10;
        onNavigationEvent = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"3-2-6", "4-3-6", "6-2-6", "3-3-6", "3-3-4", "3-4-4", "3-6-5", "3-6-2", "3-8-1", "3-9-1", "3-2-8", "4-2-7", "4-4-4", "1-6-2", "1-3-7", "4-4-2", "7-1-2", "4-3-2", "3-5-3", "3-6-3", "5-2-6", "3-7-1", "3-2-5-1", "3-2-6-1", "3-4-4-2", "4-2-5-1", "4-2-7-1", "3-2-4-2", "3-3-5-1", "4-2-6-1", "5-2-5-1", "5-2-6-1", "3-5-2-1", "4-5-2-1", "6-2-5-1", "3-2-7-1", "3-3-7-1", "4-4-3-1", "4-4-1-2", "3-9-2-2", "8-3-3", "8-2-4", "3-6-2-3", "3-6-2-2-1", "3-4-4-1-1", "3-4-4-2-1", "4-1-2-1-6", "3-5-1-2-2", "3-5-2-1-2", "1-6-1-2-2", "3-2-2-6-1", "1-3-2-6-1", "2-3-4-4", "3-4-3-4", "3-2-6-3"});
        r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc r8lambdao8mhzm1tnx5sdxxbha81yzc5uvc = r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc.PHONE;
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult = addCustomQueryParams.onExtraCallbackWithResult(r8lambdao8mhzm1tnx5sdxxbha81yzc5uvc, regex, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String strAsBinder = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.asBinder((List) obj);
                if (i3 != 0) {
                    int i4 = 22 / 0;
                }
                return strAsBinder;
            }
        });
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult2 = addCustomQueryParams.onExtraCallbackWithResult(r8lambdao8mhzm1tnx5sdxxbha81yzc5uvc, regex2, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallback = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallback((List) obj);
                if (i3 == 0) {
                    int i4 = 76 / 0;
                }
                int i5 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 25 / 0;
                }
                return strOnExtraCallback;
            }
        });
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult3 = addCustomQueryParams.onExtraCallbackWithResult(r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc.DRIVER_LICENSE, regex3, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i2 % 128;
                Object obj2 = null;
                List list = (List) obj;
                if (i2 % 2 != 0) {
                    r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onTransact(list);
                    throw null;
                }
                String strOnTransact = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onTransact(list);
                int i3 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return strOnTransact;
                }
                obj2.hashCode();
                throw null;
            }
        });
        r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult4 = addCustomQueryParams.onExtraCallbackWithResult(r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc.RRN, regex4, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i2 % 128;
                List list = (List) obj;
                if (i2 % 2 == 0) {
                    return r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallback(list);
                }
                r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallback(list);
                throw null;
            }
        });
        r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4 r8lambdalfscfjiyypbsofgw6debt6z4b4 = r8lambdalFSCFjIYypbsoFGW6DEBt6z4B4.CARD_NUMBER;
        getInterfaceDescriptor = CollectionsKt.listOf(new r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY[]{r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult, r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult2, r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult3, r8lambdarbv3rxsgnvgjhknxmwmoyziekyOnExtraCallbackWithResult4, addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex5, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallbackWithResult = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallbackWithResult((List) obj);
                if (i3 == 0) {
                    int i4 = 18 / 0;
                }
                int i5 = onExtraCallback + 17;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return strOnExtraCallbackWithResult;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex6, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i2 % 128;
                Object[] objArr = {(List) obj};
                if (i2 % 2 == 0) {
                    int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                    return (String) r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallbackWithResult(2028110453, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent, -2028110450, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
                }
                int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                int i3 = 53 / 0;
                return (String) r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallbackWithResult(2028110453, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), objArr, iOnNavigationEvent2, -2028110450, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex7, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                IAuthTabCallback = i2 % 128;
                List list = (List) obj;
                if (i2 % 2 != 0) {
                    return r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallbackStub(list);
                }
                r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.IAuthTabCallbackStub(list);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex8, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i2 % 128;
                List list = (List) obj;
                if (i2 % 2 == 0) {
                    r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onNavigationEvent(list);
                    throw null;
                }
                String strOnNavigationEvent = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onNavigationEvent(list);
                int i3 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return strOnNavigationEvent;
            }
        }), addCustomQueryParams.onExtraCallbackWithResult(r8lambdalfscfjiyypbsofgw6debt6z4b4, regex9, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {(List) obj};
                int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                if (i3 == 0) {
                    str = (String) r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallbackWithResult(-1186016143, iOnNavigationEvent2, iOnNavigationEvent4, objArr, iOnNavigationEvent, 1186016143, iOnNavigationEvent3);
                    int i4 = 65 / 0;
                } else {
                    str = (String) r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onExtraCallbackWithResult(-1186016143, iOnNavigationEvent2, iOnNavigationEvent4, objArr, iOnNavigationEvent, 1186016143, iOnNavigationEvent3);
                }
                int i5 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }), new r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY(r8lambdaO8mhZM1tNx5SdXxbhA81yZc5uvc.ACCOUNT_NUMBER, regex10, new Function2() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda13
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onWarmupCompleted((String) obj, ((Integer) obj2).intValue()));
                if (i3 != 0) {
                    int i4 = 39 / 0;
                }
                int i5 = onExtraCallback + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        }, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.KrPiiSanitizer$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i2 % 128;
                MatchResult matchResult = (MatchResult) obj;
                if (i2 % 2 == 0) {
                    r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onWarmupCompleted(matchResult);
                    throw null;
                }
                String strOnWarmupCompleted = r8lambdaO8yCzoWFJ8vMv6MAe7eQnzvfS0Q.onWarmupCompleted(matchResult);
                int i3 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return strOnWarmupCompleted;
            }
        })});
        int i = extraCallback + 65;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static final String asInterface(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + getAndResetCustomPostBody.onExtraCallbackWithResult(((String) list.get(3)).length()) + list.get(4) + list.get(5);
        int i2 = readTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + getAndResetCustomPostBody.onExtraCallbackWithResult(((String) list.get(3)).length()) + list.get(4) + list.get(5);
        int i2 = ICustomTabsCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String access100(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + list.get(4) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(3) + list.get(7) + getAndResetCustomPostBody.onExtraCallbackWithResult(2);
        int i2 = readTypedObject + 55;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String IAuthTabCallbackStubProxy(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + getAndResetCustomPostBody.onExtraCallbackWithResult(7);
        int i2 = readTypedObject + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(4) + list.get(7) + list.get(8);
        int i2 = readTypedObject + 29;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String access000(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(4) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(1) + list.get(7);
        int i2 = ICustomTabsCallback + 107;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return str;
    }

    private static final String extraCallback(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(3) + list.get(7) + list.get(8) + list.get(9);
        int i2 = readTypedObject + 105;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String extraCallbackWithResult(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(4) + list.get(5) + list.get(6);
        int i2 = readTypedObject + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static final String writeTypedObject(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String str = list.get(1) + list.get(2) + list.get(3) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(5) + getAndResetCustomPostBody.onExtraCallbackWithResult(2) + list.get(7) + list.get(8) + list.get(9);
        int i2 = readTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(String str, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 15;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return IAuthTabCallback.onExtraCallback(Companion, str, i);
        }
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback.onExtraCallback(Companion, str, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onExtraCallbackWithResult(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            IAuthTabCallback.onExtraCallback(Companion, matchResult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(matchResult, "");
        String strOnExtraCallback = IAuthTabCallback.onExtraCallback(Companion, matchResult);
        int i3 = ICustomTabsCallback + 1;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    public static /* synthetic */ String onWarmupCompleted(List list) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onExtraCallbackWithResult(2028110453, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{list}, iOnNavigationEvent, -2028110450, iOnNavigationEvent3);
    }

    public static /* synthetic */ CharSequence onNavigationEvent(Ref.BooleanRef booleanRef, MatchResult matchResult) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (CharSequence) onExtraCallbackWithResult(-543087480, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{booleanRef, matchResult}, iOnNavigationEvent, 543087481, iOnNavigationEvent3);
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(List list) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onExtraCallbackWithResult(-1186016143, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{list}, iOnNavigationEvent, 1186016143, iOnNavigationEvent3);
    }

    private static final String onExtraCallback(String str) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onExtraCallbackWithResult(264912704, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{str}, iOnNavigationEvent, -264912702, iOnNavigationEvent3);
    }

    private static final String getInterfaceDescriptor(List list) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onExtraCallbackWithResult(-2012228788, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{list}, iOnNavigationEvent, 2012228792, iOnNavigationEvent3);
    }

    private static final String IAuthTabCallback_Parcel(List list) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onExtraCallbackWithResult(-2012967095, iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{list}, iOnNavigationEvent, 2012967100, iOnNavigationEvent3);
    }
}
