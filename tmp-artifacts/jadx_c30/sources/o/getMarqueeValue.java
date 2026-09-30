package o;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.getMarqueeValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getMarqueeValue<Output> implements setTextLocales<Output> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private final removePauseListener<Output, String> onWarmupCompleted;

    public Object onExtraCallback(Output output, @NotNull CharSequence charSequence, int i) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(charSequence, BuildConfig.FLAVOR);
        int iOnExtraCallbackWithResult = Companion.onExtraCallbackWithResult(charSequence, i);
        if (iOnExtraCallbackWithResult > i) {
            xkz1.onNavigationEvent(this.onWarmupCompleted, output, charSequence.subSequence(i, iOnExtraCallbackWithResult).toString(), i, iOnExtraCallbackWithResult);
            return fbyycx.Companion.onExtraCallbackWithResult(iOnExtraCallbackWithResult);
        }
        return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.TimeZoneParserOperation$$ExternalSyntheticLambda0
            public final Object invoke() {
                return getMarqueeValue.onExtraCallback();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onExtraCallback() {
        return "Invalid timezone format";
    }

    public static final class onWarmupCompleted {

        public final /* synthetic */ class IAuthTabCallback {
            public static final /* synthetic */ int[] onExtraCallbackWithResult;

            static {
                int[] iArr = new int[onExtraCallback.values().length];
                try {
                    iArr[onExtraCallback.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallback.AFTER_PREFIX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallback.AFTER_SIGN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[onExtraCallback.AFTER_INIT_SIGN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[onExtraCallback.AFTER_HOUR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[onExtraCallback.AFTER_INIT_HOUR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[onExtraCallback.AFTER_MINUTE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[onExtraCallback.AFTER_COLON_MINUTE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[onExtraCallback.IN_PART.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[onExtraCallback.AFTER_SLASH.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[onExtraCallback.END.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        static final class onExtraCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onExtraCallback[] $VALUES;
            public static final onExtraCallback START = new onExtraCallback("START", 0);
            public static final onExtraCallback AFTER_PREFIX = new onExtraCallback("AFTER_PREFIX", 1);
            public static final onExtraCallback AFTER_SIGN = new onExtraCallback("AFTER_SIGN", 2);
            public static final onExtraCallback AFTER_INIT_SIGN = new onExtraCallback("AFTER_INIT_SIGN", 3);
            public static final onExtraCallback AFTER_HOUR = new onExtraCallback("AFTER_HOUR", 4);
            public static final onExtraCallback AFTER_INIT_HOUR = new onExtraCallback("AFTER_INIT_HOUR", 5);
            public static final onExtraCallback AFTER_MINUTE = new onExtraCallback("AFTER_MINUTE", 6);
            public static final onExtraCallback AFTER_COLON_MINUTE = new onExtraCallback("AFTER_COLON_MINUTE", 7);
            public static final onExtraCallback IN_PART = new onExtraCallback("IN_PART", 8);
            public static final onExtraCallback AFTER_SLASH = new onExtraCallback("AFTER_SLASH", 9);
            public static final onExtraCallback END = new onExtraCallback("END", 10);

            private static final /* synthetic */ onExtraCallback[] $values() {
                return new onExtraCallback[]{START, AFTER_PREFIX, AFTER_SIGN, AFTER_INIT_SIGN, AFTER_HOUR, AFTER_INIT_HOUR, AFTER_MINUTE, AFTER_COLON_MINUTE, IN_PART, AFTER_SLASH, END};
            }

            public static EnumEntries<onExtraCallback> getEntries() {
                return $ENTRIES;
            }

            private onExtraCallback(String str, int i) {
            }

            static {
                onExtraCallback[] onextracallbackArr$values = $values();
                $VALUES = onextracallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            }

            public static onExtraCallback valueOf(String str) {
                return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            }

            public static onExtraCallback[] values() {
                return (onExtraCallback[]) $VALUES.clone();
            }
        }

        private onWarmupCompleted() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int onExtraCallbackWithResult(CharSequence charSequence, int i) throws NoWhenBranchMatchedException {
            int i2;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = i;
            onExtraCallback onextracallback = onExtraCallback.START;
            while (true) {
                i2 = 1;
                if (intRef.element < charSequence.length()) {
                    switch (IAuthTabCallback.onExtraCallbackWithResult[onextracallback.ordinal()]) {
                        case 1:
                            if (!onExtraCallbackWithResult(charSequence, intRef, (List<String>) CollectionsKt.listOf(new String[]{"UTC", "GMT", "UT"}))) {
                                if (!onWarmupCompleted(charSequence, intRef)) {
                                    if (!onExtraCallback(charSequence, intRef)) {
                                        break;
                                    } else {
                                        onextracallback = onExtraCallback.IN_PART;
                                    }
                                } else {
                                    onextracallback = onExtraCallback.AFTER_INIT_SIGN;
                                }
                            } else {
                                onextracallback = onExtraCallback.AFTER_PREFIX;
                            }
                        case 2:
                            if (onWarmupCompleted(charSequence, intRef)) {
                                onextracallback = onExtraCallback.AFTER_SIGN;
                            } else {
                                onextracallback = onExtraCallback.IN_PART;
                                continue;
                            }
                        case 3:
                            if (onExtraCallback(intRef, charSequence, 2)) {
                                onextracallback = onExtraCallback.AFTER_HOUR;
                            } else {
                                onextracallback = onExtraCallback.IN_PART;
                                continue;
                            }
                        case 4:
                            if (!onExtraCallback(intRef, charSequence, 2)) {
                                if (!onExtraCallback(intRef, charSequence, 1)) {
                                    break;
                                } else {
                                    onextracallback = onExtraCallback.END;
                                }
                            } else {
                                onextracallback = onExtraCallback.AFTER_INIT_HOUR;
                            }
                        case 5:
                            if (onNavigationEvent(charSequence, intRef)) {
                                onextracallback = onExtraCallback.AFTER_COLON_MINUTE;
                            } else {
                                onextracallback = onExtraCallback.IN_PART;
                                continue;
                            }
                        case 6:
                            if (!onNavigationEvent(charSequence, intRef)) {
                                if (!onExtraCallback(intRef, charSequence, 2)) {
                                    break;
                                } else {
                                    onextracallback = onExtraCallback.AFTER_MINUTE;
                                }
                            } else {
                                onextracallback = onExtraCallback.AFTER_COLON_MINUTE;
                            }
                        case 7:
                            if (!onExtraCallback(intRef, charSequence, 2)) {
                                break;
                            } else {
                                onextracallback = onExtraCallback.END;
                            }
                        case 8:
                            if (!onNavigationEvent(charSequence, intRef)) {
                                break;
                            } else {
                                onextracallback = onExtraCallback.END;
                            }
                        case 9:
                            if (!onExtraCallbackWithResult(charSequence, intRef)) {
                                if (!IAuthTabCallback(charSequence, intRef)) {
                                    break;
                                } else {
                                    onextracallback = onExtraCallback.AFTER_SLASH;
                                }
                            } else {
                                onextracallback = onExtraCallback.IN_PART;
                            }
                        case 10:
                            if (!onExtraCallback(charSequence, intRef)) {
                                break;
                            } else {
                                onextracallback = onExtraCallback.IN_PART;
                            }
                        case 11:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            int i3 = intRef.element;
            if (onextracallback != onExtraCallback.AFTER_SLASH && onextracallback != onExtraCallback.AFTER_INIT_SIGN) {
                i2 = 0;
            }
            return i3 - i2;
        }

        private static final boolean onExtraCallbackWithResult(CharSequence charSequence, Ref.IntRef intRef, List<String> list) {
            String str;
            Object next;
            Iterator<T> it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.startsWith$default(charSequence, (String) next, intRef.element, false, 4, (Object) null)) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                intRef.element += str2.length();
                str = str2;
            }
            return str != null;
        }

        private static final boolean onWarmupCompleted(CharSequence charSequence, Ref.IntRef intRef) {
            onWarmupCompleted onwarmupcompleted = getMarqueeValue.Companion;
            if (!CollectionsKt.listOf(new Character[]{'+', '-'}).contains(Character.valueOf(charSequence.charAt(intRef.element)))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        private static final boolean onExtraCallback(Ref.IntRef intRef, CharSequence charSequence, int i) {
            onWarmupCompleted onwarmupcompleted = getMarqueeValue.Companion;
            int i2 = intRef.element;
            IntIterator it = RangesKt.until(i2, i2 + i).iterator();
            while (it.hasNext()) {
                Character orNull = StringsKt.getOrNull(charSequence, it.nextInt());
                if (orNull == null || !jw10.IAuthTabCallback(orNull.charValue())) {
                    return false;
                }
            }
            intRef.element += i;
            return true;
        }

        private static final boolean onNavigationEvent(CharSequence charSequence, Ref.IntRef intRef) {
            onWarmupCompleted onwarmupcompleted = getMarqueeValue.Companion;
            if (charSequence.charAt(intRef.element) != ':') {
                return false;
            }
            intRef.element++;
            if (onExtraCallback(intRef, charSequence, 2)) {
                return true;
            }
            intRef.element--;
            return false;
        }

        private static final boolean onWarmupCompleted(char c) {
            return jw10.onNavigationEvent(c) || c == '.' || c == '_';
        }

        private static final boolean onNavigationEvent(char c) {
            return onWarmupCompleted(c) || jw10.IAuthTabCallback(c) || c == '-' || c == '+';
        }

        private static final boolean onExtraCallback(CharSequence charSequence, Ref.IntRef intRef) {
            onWarmupCompleted onwarmupcompleted = getMarqueeValue.Companion;
            if (!onWarmupCompleted(charSequence.charAt(intRef.element))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        private static final boolean onExtraCallbackWithResult(CharSequence charSequence, Ref.IntRef intRef) {
            onWarmupCompleted onwarmupcompleted = getMarqueeValue.Companion;
            if (!onNavigationEvent(charSequence.charAt(intRef.element))) {
                return false;
            }
            intRef.element++;
            return true;
        }

        private static final boolean IAuthTabCallback(CharSequence charSequence, Ref.IntRef intRef) {
            onWarmupCompleted onwarmupcompleted = getMarqueeValue.Companion;
            if (charSequence.charAt(intRef.element) != '/') {
                return false;
            }
            intRef.element++;
            return true;
        }
    }
}
